import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class716 {

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
    private GraphicsDevice field10133;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "Ljava/awt/DisplayMode;")
    private DisplayMode field10134;

    @OriginalMember(owner = "client!ks", name = "listmodes", descriptor = "()[I")
    public final int[] listmodes() {
        DisplayMode[] var1 = this.field10133.getDisplayModes();
        int[] var2 = new int[var1.length << 2];
        for (int var3 = 0; var3 < var1.length; var3++) {
            var2[var3 << 2] = var1[var3].getWidth();
            var2[(var3 << 2) + 1] = var1[var3].getHeight();
            var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
            var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
        }
        return var2;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
    private final void method4030(Frame arg0, int arg1) {
        boolean var3 = false;
        try {
            if (arg1 != -1321855038) {
                this.field10134 = null;
            }
            Field var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            var4.setAccessible(true);
            boolean var5 = (Boolean) var4.get(this.field10133);
            if (var5) {
                var3 = true;
                var4.set(this.field10133, Boolean.FALSE);
            }
        } catch (Throwable var17) {
        }
        try {
            this.field10133.setFullScreenWindow(arg0);
        } finally {
            if (var3) {
                try {
                    Field var10 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    var10.set(this.field10133, Boolean.TRUE);
                } catch (Throwable var16) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V")
    public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field10134 = this.field10133.getDisplayMode();
        if (this.field10134 == null) {
            throw new NullPointerException();
        }
        arg0.setUndecorated(true);
        arg0.enableInputMethods(false);
        this.method4030(arg0, -1321855038);
        if (arg4 == 0) {
            int var6 = this.field10134.getRefreshRate();
            DisplayMode[] var7 = this.field10133.getDisplayModes();
            boolean var8 = false;
            for (int var9 = 0; var9 < var7.length; var9++) {
                if (var7[var9].getWidth() == arg1 && var7[var9].getHeight() == arg2 && arg3 == var7[var9].getBitDepth()) {
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
        this.field10133.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V")
    public class716() throws Exception {
        GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field10133 = var1.getDefaultScreenDevice();
        if (!this.field10133.isFullScreenSupported()) {
            GraphicsDevice[] var2 = var1.getScreenDevices();
            GraphicsDevice[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                GraphicsDevice var5 = var3[var4];
                if (var5 != null && var5.isFullScreenSupported()) {
                    this.field10133 = var5;
                    return;
                }
            }
            throw new Exception();
        }
    }

    @OriginalMember(owner = "client!ks", name = "exit", descriptor = "()V")
    public final void exit() {
        if (this.field10134 != null) {
            this.field10133.setDisplayMode(this.field10134);
            if (!this.field10133.getDisplayMode().equals(this.field10134)) {
                throw new RuntimeException("Did not return to correct resolution!");
            }
            this.field10134 = null;
        }
        this.method4030(null, -1321855038);
    }
}
