import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class2 {

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field24 = -2;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "[[I")
    public static int[][] field27;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIC)C")
    public static final char method8(int arg0, int arg1, char arg2) {
        field28++;
        if (arg2 >= (char) arg1 && arg2 <= 'ÿ') {
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

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static final void method9(int arg0) {
        field25++;
        class199 var1 = null;
        try {
            class283 var2 = class241.field3426.method1897(13);
            while (var2.field3998 == 0) {
                class349.method2219(1L, arg0 ^ 0x64B7);
            }
            if (arg0 != -25817) {
                method13(74);
            }
            if (var2.field3998 == 1) {
                var1 = (class199) var2.field3999;
                class11 var3 = new class11(class194.field2662 * 6 + 3);
                var3.method173(1, 255);
                var3.method191(class194.field2662, -99);
                for (int var4 = 0; var4 < class389.field5580.length; var4++) {
                    if (class15.field291[var4]) {
                        var3.method191(var4, -120);
                        var3.method155(15489, class389.field5580[var4]);
                    }
                }
                var1.method1301(0, var3.field230, 15, var3.field191);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method1304(0);
            }
        } catch (Exception var5) {
        }
        class92.field1288 = class385.method2442(-6631);
        class290.field4075 = false;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lkh;BI)V")
    public static final void method10(class11 arg0, byte arg1, int arg2) {
        field29++;
        int var3 = -53 % ((-arg1 - 30) / 48);
        if (class73.field1042 == null) {
            return;
        }
        try {
            class73.field1042.method967((byte) -114, 0L);
            class73.field1042.method973(24, arg2, arg0.field230, -1);
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILnq;Lnq;)V")
    public static final void method11(int arg0, class268 arg1, class268 arg2) {
        field21++;
        if (arg0 != -7106) {
            field24 = 50;
        }
        class69.field1020 = arg2;
        class414.field5875 = arg1;
        class69.field1020.method1739(108, 36);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIILmk;Lmk;)V")
    public static final void method12(int arg0, int arg1, int arg2, class34 arg3, class34 arg4) {
        if (class328.field4549[arg0][arg1][arg2] == null) {
            class75.method559(arg0, arg1, arg2);
        }
        class328.field4549[arg0][arg1][arg2].field1756 = arg3;
        class328.field4549[arg0][arg1][arg2].field1761 = arg4;
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
    public static void method13(int arg0) {
        field27 = null;
        if (arg0 != 235) {
            method11(117, (class268) null, (class268) null);
        }
    }
}
