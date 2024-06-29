import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class48 {

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
    private GraphicsDevice field1000;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "Ljava/awt/DisplayMode;")
    private DisplayMode field1001;

    @OriginalMember(owner = "client!gp", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V", line = 10)
    public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1001 = this.field1000.getDisplayMode();
        if (this.field1001 == null) {
            throw new NullPointerException();
        }
        arg0.setUndecorated(true);
        arg0.enableInputMethods(false);
        this.method553(arg0, (byte) 51);
        if (arg4 == 0) {
            int var6 = this.field1001.getRefreshRate();
            DisplayMode[] var7 = this.field1000.getDisplayModes();
            boolean var8 = false;
            for (int var9 = 0; var9 < var7.length; var9++) {
                if (arg1 == var7[var9].getWidth() && arg2 == var7[var9].getHeight() && var7[var9].getBitDepth() == arg3) {
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
        this.field1000.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
    }

    @OriginalMember(owner = "client!gp", name = "listmodes", descriptor = "()[I", line = 72)
    public final int[] listmodes() {
        DisplayMode[] var1 = this.field1000.getDisplayModes();
        int[] var2 = new int[var1.length << 2];
        for (int var3 = 0; var3 < var1.length; var3++) {
            var2[var3 << 2] = var1[var3].getWidth();
            var2[(var3 << 2) + 1] = var1[var3].getHeight();
            var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
            var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
        }
        return var2;
    }

    @OriginalMember(owner = "client!gp", name = "exit", descriptor = "()V", line = 96)
    public final void exit() {
        if (this.field1001 != null) {
            this.field1000.setDisplayMode(this.field1001);
            if (!this.field1000.getDisplayMode().equals(this.field1001)) {
                throw new RuntimeException("Did not return to correct resolution!");
            }
            this.field1001 = null;
        }
        this.method553(null, (byte) 104);
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V", line = 113)
    public class48() throws Exception {
        GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field1000 = var1.getDefaultScreenDevice();
        if (!this.field1000.isFullScreenSupported()) {
            GraphicsDevice[] var2 = var1.getScreenDevices();
            GraphicsDevice[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                GraphicsDevice var5 = var3[var4];
                if (var5 != null && var5.isFullScreenSupported()) {
                    this.field1000 = var5;
                    return;
                }
            }
            throw new Exception();
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/awt/Frame;B)V", line = 151)
    private final void method553(Frame arg0, byte arg1) {
        boolean var3 = false;
        if (arg1 <= 47) {
            this.method553(null, (byte) -25);
        }
        try {
            Field var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            var4.setAccessible(true);
            boolean var5 = (Boolean) var4.get(this.field1000);
            if (var5) {
                var4.set(this.field1000, Boolean.FALSE);
                var3 = true;
            }
        } catch (Throwable var17) {
        }
        try {
            this.field1000.setFullScreenWindow(arg0);
        } finally {
            if (var3) {
                try {
                    Field var10 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    var10.set(this.field1000, Boolean.TRUE);
                } catch (Throwable var16) {
                }
            }
        }
    }
}
