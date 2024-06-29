import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class427 {

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
    private GraphicsDevice field5350;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "Ljava/awt/DisplayMode;")
    private DisplayMode field5351;

    @OriginalMember(owner = "client!wv", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V")
    public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5351 = this.field5350.getDisplayMode();
        if (this.field5351 == null) {
            throw new NullPointerException();
        }
        arg0.setUndecorated(true);
        arg0.enableInputMethods(false);
        this.method2264(arg0, (byte) 121);
        if (arg4 == 0) {
            int var6 = this.field5351.getRefreshRate();
            DisplayMode[] var7 = this.field5350.getDisplayModes();
            boolean var8 = false;
            for (int var9 = 0; var9 < var7.length; var9++) {
                if (arg1 == var7[var9].getWidth() && arg2 == var7[var9].getHeight() && arg3 == var7[var9].getBitDepth()) {
                    int var10 = var7[var9].getRefreshRate();
                    if (!var8 || Math.abs(var10 - var6) < Math.abs(arg4 - var6)) {
                        var8 = true;
                        arg4 = var10;
                    }
                }
            }
            if (!var8) {
                arg4 = var6;
            }
        }
        this.field5350.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
    }

    @OriginalMember(owner = "client!wv", name = "exit", descriptor = "()V")
    public final void exit() {
        if (this.field5351 != null) {
            this.field5350.setDisplayMode(this.field5351);
            if (!this.field5350.getDisplayMode().equals(this.field5351)) {
                throw new RuntimeException("Did not return to correct resolution!");
            }
            this.field5351 = null;
        }
        this.method2264(null, (byte) 121);
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V")
    public class427() throws Exception {
        GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field5350 = var1.getDefaultScreenDevice();
        if (!this.field5350.isFullScreenSupported()) {
            GraphicsDevice[] var2 = var1.getScreenDevices();
            GraphicsDevice[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                GraphicsDevice var5 = var3[var4];
                if (var5 != null && var5.isFullScreenSupported()) {
                    this.field5350 = var5;
                    return;
                }
            }
            throw new Exception();
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
    private final void method2264(Frame arg0, byte arg1) {
        boolean var3 = false;
        try {
            Field var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            var4.setAccessible(true);
            boolean var5 = (Boolean) var4.get(this.field5350);
            if (var5) {
                var4.set(this.field5350, Boolean.FALSE);
                var3 = true;
            }
        } catch (Throwable var17) {
        }
        if (arg1 != 121) {
            this.listmodes();
        }
        try {
            this.field5350.setFullScreenWindow(arg0);
        } finally {
            if (var3) {
                try {
                    Field var10 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    var10.set(this.field5350, Boolean.TRUE);
                } catch (Throwable var16) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "listmodes", descriptor = "()[I")
    public final int[] listmodes() {
        DisplayMode[] var1 = this.field5350.getDisplayModes();
        int[] var2 = new int[var1.length << 2];
        for (int var3 = 0; var3 < var1.length; var3++) {
            var2[var3 << 2] = var1[var3].getWidth();
            var2[(var3 << 2) + 1] = var1[var3].getHeight();
            var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
            var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
        }
        return var2;
    }
}
