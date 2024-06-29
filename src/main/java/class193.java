import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class193 {

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
    private GraphicsDevice field2602;

    @OriginalMember(owner = "client!vda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2603 = new String[] { method1655(method1654("x\u007f\u0012k\u0019")), method1655(method1654("}k\u0010,\u001cyjPU\u0014`-LE\u000fon\u0016k\u001e}Z\u001bt\u0014m{")), method1655(method1654("Jw\u001a\"\u0013aj^p\u0018zk\fl]zq^a\u0012|l\u001ba\t.l\u001bq\u0012bk\nk\u0012`?")) };

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "Ljava/awt/DisplayMode;")
    private DisplayMode field2601;

    @OriginalMember(owner = "client!vda", name = "listmodes", descriptor = "()[I", line = 11)
    public final int[] listmodes() {
        DisplayMode[] var1 = this.field2602.getDisplayModes();
        int[] var2 = new int[var1.length << 2];
        for (int var3 = 0; var3 < var1.length; var3++) {
            var2[var3 << 2] = var1[var3].getWidth();
            var2[(var3 << 2) + 1] = var1[var3].getHeight();
            var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
            var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
        }
        return var2;
    }

    @OriginalMember(owner = "client!vda", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V", line = 35)
    public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2601 = this.field2602.getDisplayMode();
        if (this.field2601 == null) {
            throw new NullPointerException();
        }
        arg0.setUndecorated(true);
        arg0.enableInputMethods(false);
        this.method1653(arg0, (byte) 119);
        if (arg4 == 0) {
            int var6 = this.field2601.getRefreshRate();
            DisplayMode[] var7 = this.field2602.getDisplayModes();
            boolean var8 = false;
            for (int var9 = 0; var9 < var7.length; var9++) {
                if (arg1 == var7[var9].getWidth() && arg2 == var7[var9].getHeight() && var7[var9].getBitDepth() == arg3) {
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
        this.field2602.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ljava/awt/Frame;B)V", line = 96)
    private final void method1653(Frame arg0, byte arg1) {
        boolean var3 = false;
        try {
            if (arg1 != 119) {
                this.field2601 = null;
            }
            Field var4 = Class.forName(field2603[1]).getDeclaredField(field2603[0]);
            var4.setAccessible(true);
            boolean var5 = (Boolean) var4.get(this.field2602);
            if (var5) {
                var4.set(this.field2602, Boolean.FALSE);
                var3 = true;
            }
        } catch (Throwable var17) {
        }
        try {
            this.field2602.setFullScreenWindow(arg0);
        } finally {
            if (var3) {
                try {
                    Field var10 = Class.forName(field2603[1]).getDeclaredField(field2603[0]);
                    var10.set(this.field2602, Boolean.TRUE);
                } catch (Throwable var16) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!vda", name = "exit", descriptor = "()V", line = 142)
    public final void exit() {
        if (this.field2601 != null) {
            this.field2602.setDisplayMode(this.field2601);
            if (!this.field2602.getDisplayMode().equals(this.field2601)) {
                throw new RuntimeException(field2603[2]);
            }
            this.field2601 = null;
        }
        this.method1653(null, (byte) 119);
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "()V", line = 160)
    public class193() throws Exception {
        GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field2602 = var1.getDefaultScreenDevice();
        if (!this.field2602.isFullScreenSupported()) {
            GraphicsDevice[] var2 = var1.getScreenDevices();
            GraphicsDevice[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                GraphicsDevice var5 = var3[var4];
                if (var5 != null && var5.isFullScreenSupported()) {
                    this.field2602 = var5;
                    return;
                }
            }
            throw new Exception();
        }
    }

    @OriginalMember(owner = "client!vda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1654(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1655(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 30;
                    break;
                case 2:
                    var10005 = 126;
                    break;
                case 3:
                    var10005 = 2;
                    break;
                default:
                    var10005 = 125;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
