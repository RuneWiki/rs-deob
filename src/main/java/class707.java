import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class707 {

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
    private GraphicsDevice field9914;

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "Ljava/awt/DisplayMode;")
    private DisplayMode field9915;

    @OriginalMember(owner = "client!wca", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V")
    public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9915 = this.field9914.getDisplayMode();
        if (this.field9915 == null) {
            throw new NullPointerException();
        }
        arg0.setUndecorated(true);
        arg0.enableInputMethods(false);
        this.method3964((byte) 80, arg0);
        if (arg4 == 0) {
            int var6 = this.field9915.getRefreshRate();
            DisplayMode[] var7 = this.field9914.getDisplayModes();
            boolean var8 = false;
            for (int var9 = 0; var9 < var7.length; var9++) {
                if (var7[var9].getWidth() == arg1 && arg2 == var7[var9].getHeight() && var7[var9].getBitDepth() == arg3) {
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
        this.field9914.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
    }

    @OriginalMember(owner = "client!wca", name = "listmodes", descriptor = "()[I")
    public final int[] listmodes() {
        DisplayMode[] var1 = this.field9914.getDisplayModes();
        int[] var2 = new int[var1.length << 2];
        for (int var3 = 0; var3 < var1.length; var3++) {
            var2[var3 << 2] = var1[var3].getWidth();
            var2[(var3 << 2) + 1] = var1[var3].getHeight();
            var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
            var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
        }
        return var2;
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "()V")
    public class707() throws Exception {
        GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field9914 = var1.getDefaultScreenDevice();
        if (!this.field9914.isFullScreenSupported()) {
            GraphicsDevice[] var2 = var1.getScreenDevices();
            GraphicsDevice[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                GraphicsDevice var5 = var3[var4];
                if (var5 != null && var5.isFullScreenSupported()) {
                    this.field9914 = var5;
                    return;
                }
            }
            throw new Exception();
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(BLjava/awt/Frame;)V")
    private final void method3964(byte arg0, Frame arg1) {
        boolean var3 = false;
        if (arg0 <= 56) {
            return;
        }
        try {
            Field var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            var4.setAccessible(true);
            boolean var5 = (Boolean) var4.get(this.field9914);
            if (var5) {
                var3 = true;
                var4.set(this.field9914, Boolean.FALSE);
            }
        } catch (Throwable var17) {
        }
        try {
            this.field9914.setFullScreenWindow(arg1);
        } finally {
            if (var3) {
                try {
                    Field var10 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    var10.set(this.field9914, Boolean.TRUE);
                } catch (Throwable var16) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "exit", descriptor = "()V")
    public final void exit() {
        if (this.field9915 != null) {
            this.field9914.setDisplayMode(this.field9915);
            if (!this.field9914.getDisplayMode().equals(this.field9915)) {
                throw new RuntimeException("Did not return to correct resolution!");
            }
            this.field9915 = null;
        }
        this.method3964((byte) 71, null);
    }
}
