import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class99 {

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field1200 = 0;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1199;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static void method743(int arg0) {
        if (arg0 > -113) {
            method746(-56, 45, 80, 87, null);
        }
        field1199 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lpc;II)I")
    public static final int method744(class476 arg0, int arg1, int arg2) {
        field1201++;
        return arg2;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIC)C")
    public static final char method745(int arg0, int arg1, char arg2) {
        field1197++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 == 'Ñ' && arg0 != 0) {
                return 'N';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 == 'ñ' && arg0 != 0) {
                return 'n';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 < 36) {
            field1199 = null;
        }
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIILho;)V")
    public static final void method746(int arg0, int arg1, int arg2, int arg3, class102 arg4) {
        if (arg0 != -233) {
            return;
        }
        field1198++;
        for (class433 var5 = (class433) class144.field1850.method153(0); var5 != null; var5 = (class433) class144.field1850.method161(-78)) {
            if (var5.field6145 == arg3 && arg2 << 7 == var5.field6141 && (arg1 << 7) == var5.field6144 && var5.field6151.field1316 == arg4.field1316) {
                if (var5.field6148 != null) {
                    class113.field1506.method2532(var5.field6148);
                    var5.field6148 = null;
                }
                if (var5.field6150 != null) {
                    class113.field1506.method2532(var5.field6150);
                    var5.field6150 = null;
                }
                var5.method2165(16225);
                return;
            }
        }
    }
}
