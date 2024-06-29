import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class238 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
    private GraphicsDevice field3357;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Ljava/awt/DisplayMode;")
    private DisplayMode field3358;

    @OriginalMember(owner = "client!se", name = "exit", descriptor = "()V")
    public final void exit() {
        if (this.field3358 != null) {
            this.field3357.setDisplayMode(this.field3358);
            if (!this.field3357.getDisplayMode().equals(this.field3358)) {
                throw new RuntimeException("Did not return to correct resolution!");
            }
            this.field3358 = null;
        }
        this.method1477(null, -111);
    }

    @OriginalMember(owner = "client!se", name = "listmodes", descriptor = "()[I")
    public final int[] listmodes() {
        DisplayMode[] var1 = this.field3357.getDisplayModes();
        int[] var2 = new int[var1.length << 2];
        for (int var3 = 0; var3 < var1.length; var3++) {
            var2[var3 << 2] = var1[var3].getWidth();
            var2[(var3 << 2) + 1] = var1[var3].getHeight();
            var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
            var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
        }
        return var2;
    }

    @OriginalMember(owner = "client!se", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V")
    public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3358 = this.field3357.getDisplayMode();
        if (this.field3358 == null) {
            throw new NullPointerException();
        }
        arg0.setUndecorated(true);
        arg0.enableInputMethods(false);
        this.method1477(arg0, 49);
        if (arg4 == 0) {
            int var6 = this.field3358.getRefreshRate();
            DisplayMode[] var7 = this.field3357.getDisplayModes();
            boolean var8 = false;
            for (int var9 = 0; var9 < var7.length; var9++) {
                if (var7[var9].getWidth() == arg1 && arg2 == var7[var9].getHeight() && arg3 == var7[var9].getBitDepth()) {
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
        this.field3357.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class238() throws Exception {
        GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field3357 = var1.getDefaultScreenDevice();
        if (!this.field3357.isFullScreenSupported()) {
            GraphicsDevice[] var2 = var1.getScreenDevices();
            GraphicsDevice[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                GraphicsDevice var5 = var3[var4];
                if (var5 != null && var5.isFullScreenSupported()) {
                    this.field3357 = var5;
                    return;
                }
            }
            throw new Exception();
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
    private final void method1477(Frame arg0, int arg1) {
        boolean var3 = false;
        int var4 = -6 % ((-arg1 - 52) / 42);
        try {
            Field var5 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            var5.setAccessible(true);
            boolean var6 = (Boolean) var5.get(this.field3357);
            if (var6) {
                var5.set(this.field3357, Boolean.FALSE);
                var3 = true;
            }
        } catch (Throwable var18) {
        }
        try {
            this.field3357.setFullScreenWindow(arg0);
        } finally {
            if (var3) {
                try {
                    Field var11 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    var11.set(this.field3357, Boolean.TRUE);
                } catch (Throwable var17) {
                }
            }
        }
    }
}
