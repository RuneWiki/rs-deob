import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class687 extends class756 {

    @OriginalMember(owner = "client!lw", name = "o", descriptor = "J")
    private long field9976 = -1L;

    @OriginalMember(owner = "client!lw", name = "q", descriptor = "Ljava/lang/String;")
    private String field9975 = null;

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9978 = new String[] { method5040(method5039("\u0019\f\nu8")), method5040(method5039("\u000eU\n\u0019m")), method5040(method5039("\u001b\u000eH[")), method5040(method5039("\u0019\f\nt8")), method5040(method5039("\u0019\f\nv8")) };

    @OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
    public static int field9972;

    @OriginalMember(owner = "client!lw", name = "p", descriptor = "I")
    public static int field9973;

    @OriginalMember(owner = "client!lw", name = "n", descriptor = "I")
    public static int field9974;

    @OriginalMember(owner = "client!lw", name = "s", descriptor = "I")
    public static int field9977;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(BLib;)V")
    public final void method38(byte arg0, class163 arg1) {
        try {
            field9974++;
            if (arg1.method1455((byte) 62) != 255) {
                arg1.field2201--;
                this.field9976 = arg1.method1435(-128);
            }
            if (arg0 >= 32) {
                this.field9975 = arg1.method1401(0);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9978[0] + arg0 + ',' + (arg1 == null ? field9978[2] : field9978[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lkp;I)V")
    public final void method41(class514 arg0, int arg1) {
        try {
            if (arg1 != 9893) {
                this.field9975 = null;
            }
            field9977++;
            arg0.method3894(arg1 - 26209, this.field9976, this.field9975);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9978[3] + (arg0 == null ? field9978[2] : field9978[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ID)V")
    public static final void method5038(int arg0, double arg1) {
        try {
            class290.field4310.method2377(class80.field901);
            field9972++;
            if (arg0 == 255) {
                class290.field4310.method2375(0, 0, (int) arg1);
                class301.field4720.method495(class290.field4310);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9978[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5039(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5040(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 123;
                    break;
                case 2:
                    var10005 = 36;
                    break;
                case 3:
                    var10005 = 55;
                    break;
                default:
                    var10005 = 16;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
