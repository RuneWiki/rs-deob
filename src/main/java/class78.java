import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class78 {

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
    private GraphicsDevice field1004;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "Ljava/awt/DisplayMode;")
    private DisplayMode field1003;

    @OriginalMember(owner = "client!kl", name = "listmodes", descriptor = "()[I")
    public final int[] listmodes() {
        DisplayMode[] var1 = this.field1004.getDisplayModes();
        int[] var2 = new int[var1.length << 2];
        for (int var3 = 0; var3 < var1.length; var3++) {
            var2[var3 << 2] = var1[var3].getWidth();
            var2[(var3 << 2) + 1] = var1[var3].getHeight();
            var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
            var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
        }
        return var2;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLjava/awt/Frame;)V")
    private final void method622(byte arg0, Frame arg1) {
        boolean var3 = false;
        int var4 = 95 / ((arg0 - 26) / 39);
        try {
            Field var5 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            var5.setAccessible(true);
            boolean var6 = (Boolean) var5.get(this.field1004);
            if (var6) {
                var3 = true;
                var5.set(this.field1004, Boolean.FALSE);
            }
        } catch (Throwable var18) {
        }
        try {
            this.field1004.setFullScreenWindow(arg1);
        } finally {
            if (var3) {
                try {
                    Field var11 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    var11.set(this.field1004, Boolean.TRUE);
                } catch (Throwable var17) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "exit", descriptor = "()V")
    public final void exit() {
        if (this.field1003 != null) {
            this.field1004.setDisplayMode(this.field1003);
            if (!this.field1004.getDisplayMode().equals(this.field1003)) {
                throw new RuntimeException("Did not return to correct resolution!");
            }
            this.field1003 = null;
        }
        this.method622((byte) -106, null);
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
    public class78() throws Exception {
        GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field1004 = var1.getDefaultScreenDevice();
        if (!this.field1004.isFullScreenSupported()) {
            GraphicsDevice[] var2 = var1.getScreenDevices();
            GraphicsDevice[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                GraphicsDevice var5 = var3[var4];
                if (var5 != null && var5.isFullScreenSupported()) {
                    this.field1004 = var5;
                    return;
                }
            }
            throw new Exception();
        }
    }

    @OriginalMember(owner = "client!kl", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V")
    public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1003 = this.field1004.getDisplayMode();
        if (this.field1003 == null) {
            throw new NullPointerException();
        }
        arg0.setUndecorated(true);
        arg0.enableInputMethods(false);
        this.method622((byte) -43, arg0);
        if (arg4 == 0) {
            int var6 = this.field1003.getRefreshRate();
            DisplayMode[] var7 = this.field1004.getDisplayModes();
            boolean var8 = false;
            for (int var9 = 0; var9 < var7.length; var9++) {
                if (arg1 == var7[var9].getWidth() && var7[var9].getHeight() == arg2 && var7[var9].getBitDepth() == arg3) {
                    int var10 = var7[var9].getRefreshRate();
                    if (!var8 || Math.abs(var10 - var6) < Math.abs(arg4 - var6)) {
                        arg4 = var10;
                        var8 = true;
                    }
                }
            }
            if (!var8) {
                arg4 = var6;
            }
        }
        this.field1004.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
    }
}
