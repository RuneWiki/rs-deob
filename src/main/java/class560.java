import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class560 extends class756 {

    @OriginalMember(owner = "client!pga", name = "u", descriptor = "I")
    private int field8336 = -1;

    @OriginalMember(owner = "client!pga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8342 = new String[] { method4190(method4189("W2\r-")), method4190(method4189("BiOo{")), method4190(method4189("I \u0000oE\u0011")), method4190(method4189("I \u0000oG\u0011")), method4190(method4189("I \u0000oD\u0011")) };

    @OriginalMember(owner = "client!pga", name = "r", descriptor = "Lwia;")
    public static class790 field8339 = new class790(83, 8);

    @OriginalMember(owner = "client!pga", name = "s", descriptor = "Lel;")
    public static class573 field8340 = new class573(124, -2);

    @OriginalMember(owner = "client!pga", name = "t", descriptor = "Z")
    public static boolean field8341 = false;

    @OriginalMember(owner = "client!pga", name = "o", descriptor = "I")
    public static int field8334;

    @OriginalMember(owner = "client!pga", name = "n", descriptor = "I")
    public static int field8335;

    @OriginalMember(owner = "client!pga", name = "p", descriptor = "I")
    public static int field8338;

    @OriginalMember(owner = "client!pga", name = "q", descriptor = "Ld;")
    public static class160 field8337;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(BLib;)V", line = 4)
    public final void method38(byte arg0, class163 arg1) {
        try {
            field8335++;
            this.field8336 = arg1.method1445((byte) 106);
            if (arg0 <= 32) {
                method4188(58);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8342[4] + arg0 + ',' + (arg1 == null ? field8342[0] : field8342[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V", line = 23)
    public static void method4188(int arg0) {
        try {
            if (arg0 == 19524) {
                field8339 = null;
                field8340 = null;
                field8337 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8342[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lkp;I)V", line = 35)
    public final void method41(class514 arg0, int arg1) {
        try {
            field8338++;
            arg0.method3884(this.field8336, (byte) -122);
            if (arg1 != 9893) {
                this.method41(null, -35);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8342[2] + (arg0 == null ? field8342[0] : field8342[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4189(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4190(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 57;
                    break;
                case 1:
                    var10005 = 71;
                    break;
                case 2:
                    var10005 = 97;
                    break;
                case 3:
                    var10005 = 65;
                    break;
                default:
                    var10005 = 6;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
