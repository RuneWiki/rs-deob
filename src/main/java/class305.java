import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class305 {

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
    public int field4763;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public int field4761;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public int field4762;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public int field4771;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "B")
    public byte field4768;

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
    public int field4773;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "Ldf;")
    public class420 field4765;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
    public int field4774;

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4775 = new String[] { method2590(method2589("}\u0004Hrs")), method2590(method2589("q\u0000\n\\")), method2590(method2589("}\u0004H\f2q\u001c\u0012\u000es")), method2590(method2589("d[H\u001e&")), method2590(method2589("}\u0004Hqs")), method2590(method2589("}\u0004Hss")) };

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "Lps;")
    public class105 field4764;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "Loaa;")
    public class303 field4759;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "Lku;")
    public class395 field4770;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "Lnv;")
    public class438 field4766;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZI)V", line = 8)
    public static final void method2586(boolean arg0, int arg1) {
        try {
            field4772++;
            if (class768.field11101 == null) {
                class43.method291(-26770);
            }
            if (arg0) {
                class768.field11101.method5221(-36);
            }
            if (arg1 >= 91) {
                ;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4775[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)V", line = 25)
    public static final void method2587(int arg0) {
        try {
            class625.field9146.method1559(0);
            if (arg0 == -4) {
                field4769++;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4775[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)Z", line = 46)
    public final boolean method2588(int arg0) {
        try {
            if (arg0 != 27443) {
                this.field4761 = -12;
            }
            field4767++;
            return this.field4768 == 2 || this.field4768 == 3;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4775[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(BIIIIIILdf;)V", line = 58)
    public class305(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class420 arg7) {
        try {
            this.field4763 = arg1;
            this.field4761 = arg4;
            this.field4762 = arg3;
            this.field4771 = arg6;
            this.field4768 = arg0;
            this.field4773 = arg2;
            this.field4765 = arg7;
            this.field4774 = arg5;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field4775[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field4775[1] : field4775[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2589(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2590(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 31;
                    break;
                case 1:
                    var10005 = 117;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 48;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
