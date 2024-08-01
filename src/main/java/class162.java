import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("re")
public class class162 {

    @OriginalMember(owner = "re", name = "b", descriptor = "Llf;")
    public static class109 field3029 = class35.method275("Verbindung mit Update)2Server)3)3)3", 2);

    @OriginalMember(owner = "re", name = "a", descriptor = "Llf;")
    private static class109 field3028 = class35.method275("Account locked as we suspect it has been stolen)3", 2);

    @OriginalMember(owner = "re", name = "c", descriptor = "I")
    public static int field3030 = 0;

    @OriginalMember(owner = "re", name = "f", descriptor = "Llf;")
    public static class109 field3033 = class35.method275("Abbrechen", 2);

    @OriginalMember(owner = "re", name = "i", descriptor = "[I")
    public static int[] field3036 = new int[256];

    @OriginalMember(owner = "re", name = "j", descriptor = "Llf;")
    private static class109 field3037 = class35.method275("Login limit exceeded)3", 2);

    @OriginalMember(owner = "re", name = "d", descriptor = "Llf;")
    public static class109 field3031 = class35.method275("", 2);

    @OriginalMember(owner = "re", name = "m", descriptor = "Llf;")
    public static class109 field3040 = field3037;

    @OriginalMember(owner = "re", name = "n", descriptor = "Llf;")
    public static class109 field3041 = field3028;

    @OriginalMember(owner = "re", name = "e", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "re", name = "g", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "re", name = "h", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "re", name = "k", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "re", name = "l", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "re", name = "o", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "re", name = "a", descriptor = "(ZZZ)I")
    public static final int method1098(boolean arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            field3031 = null;
        }
        field3032++;
        int var3 = 0;
        if (arg0) {
            var3 += class150.field2889 + class163.field3044;
        }
        if (arg1) {
            var3 += class5.field79 + class26.field550;
        }
        return var3;
    }

    @OriginalMember(owner = "re", name = "a", descriptor = "([BI)Ldb;")
    public static final class33 method1099(byte[] arg0, int arg1) {
        field3035++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != 0) {
            field3031 = null;
        }
        class33 var2 = new class33(arg0, class160.field2992, class202.field3976, class21.field481, class69.field1345, class51.field1036, class10.field166);
        class69.method444(-104);
        return var2;
    }

    @OriginalMember(owner = "re", name = "a", descriptor = "(IIBLbg;)Lkf;")
    public static final class100 method1100(int arg0, int arg1, byte arg2, class18 arg3) {
        field3039++;
        if (class203.method1333(-21957, arg3, arg0, arg1)) {
            if (arg2 <= 7) {
                method1103(null, -18);
            }
            return class73.method461((byte) 46);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "re", name = "a", descriptor = "(I)V")
    public static void method1101(int arg0) {
        field3040 = null;
        field3028 = null;
        field3029 = null;
        if (arg0 != 0) {
            return;
        }
        field3036 = null;
        field3031 = null;
        field3037 = null;
        field3041 = null;
        field3033 = null;
    }

    @OriginalMember(owner = "re", name = "a", descriptor = "(Lbg;II)Lkf;")
    public static final class100 method1102(class18 arg0, int arg1, int arg2) {
        field3042++;
        if (class45.method314(arg0, -84, arg2)) {
            return arg1 == 0 ? class73.method461((byte) 46) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "re", name = "a", descriptor = "(Llf;I)V")
    public static final void method1103(class109 arg0, int arg1) {
        field3034++;
        if (arg1 != 4) {
            method1100(127, 3, (byte) -83, null);
        }
        if (class115.field2280 >= 2) {
            if (arg0.method778((byte) -121, class210.field4084)) {
                System.gc();
            }
            if (arg0.method778((byte) -121, class165.field3099)) {
                class52.method344((byte) -125);
            }
            if (arg0.method778((byte) -121, class171.field3218)) {
                class131.field2528 = true;
            }
            if (arg0.method778((byte) -121, class76.field1465)) {
                class131.field2528 = false;
            }
            arg0.method778((byte) -121, class29.field618);
            arg0.method778((byte) -121, class197.field3767);
            if (arg0.method778((byte) -121, class138.field2665)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class168.field3116[var2].field2069[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg0.method793((byte) -106, class178.field3362) && class29.field635 != 0) {
                class92.method672(arg0.method798(arg1 - 45, 6).method781((byte) 121), 0);
            }
            if (arg0.method778((byte) -121, class92.field1894) && class29.field635 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method793((byte) -79, class68.field1315)) {
                class173.field3229 = arg0.method798(arg1 - 45, 12).method774((byte) 62).method781((byte) -23);
                class98.method690(null, false, class36.method279(new class109[] { class137.field2655, class52.method345((byte) 85, class173.field3229) }, 125), 0);
            }
            if (arg0.method778((byte) -121, class157.field2949)) {
                class158.field2973 = true;
            }
        }
        class200.field3850.method1339((byte) 95, 164);
        class153.field2913++;
        class200.field3850.method568(-13488, arg0.method786(-30593) - 1);
        class200.field3850.method585(arg0.method798(-41, 2), (byte) -33);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3036[var0] = var1;
        }
    }
}
