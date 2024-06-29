import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class365 implements Runnable {

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "[Ljq;")
    public volatile class537[] field5583 = new class537[2];

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "Z")
    public volatile boolean field5589 = false;

    @OriginalMember(owner = "client!ow", name = "h", descriptor = "Z")
    public volatile boolean field5585 = false;

    @OriginalMember(owner = "client!ow", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5591 = new String[] { method2961(method2960("\u000fl\u0006T\u0013\u000e3")), method2961(method2960("\u000fl\u0006gN")) };

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "Lwia;")
    public static class790 field5584 = new class790(27, -1);

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "[Lkl;")
    public static class87[] field5590 = new class87[14];

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "Lmca;")
    public class33 field5586;

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "Z")
    public static boolean field5588;

    @OriginalMember(owner = "client!ow", name = "run", descriptor = "()V")
    public final void run() {
        try {
            field5587++;
            this.field5585 = true;
            try {
                while (!this.field5589) {
                    for (int var1 = 0; var1 < 2; var1++) {
                        class537 var2 = this.field5583[var1];
                        if (var2 != null) {
                            var2.method4053(101);
                        }
                    }
                    class151.method1269(false, 10L);
                    class154.method1291((byte) 125, this.field5586, null);
                }
            } catch (Exception var11) {
                class618.method4603((byte) -23, null, var11);
            } finally {
                Object var7 = null;
                this.field5585 = false;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field5591[0] + ')');
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)V")
    public static void method2959(byte arg0) {
        try {
            if (arg0 != -28) {
                field5584 = null;
            }
            field5584 = null;
            field5590 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5591[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ow", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2960(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x66);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ow", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2961(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 27;
                    break;
                case 2:
                    var10005 = 40;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
