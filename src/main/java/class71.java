import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class71 extends class5 implements class87 {

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "Z")
    private boolean field1012 = false;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    private int field1008 = 50;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "Lph;")
    private class361 field1006;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "Lph;")
    private class361 field1016;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "Lg;")
    private class67 field1024;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "Lg;")
    private class67 field1020;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1027 = null;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "[Z")
    public static boolean[] field1021 = new boolean[5];

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "Z")
    public static boolean field1010 = true;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "[I")
    public static int[] field1007 = new int[64];

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!hk", name = "V", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!hk", name = "W", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!hk", name = "X", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "Lin;")
    public static class177 field1030;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "(II)I", line = 6)
    public final int method564(int arg0, int arg1) {
        if (arg0 != 1) {
            field1030 = (class177) null;
        }
        field1029++;
        return this.method37(-95, arg1).field2654 & 0xFF;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V", line = 19)
    public static final void method565(int arg0, int arg1, int arg2, int arg3) {
        class167 var4 = class302.field4502[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class94 var5 = var4.field2412;
        if (var5 != null) {
            var5.field1309 = var5.field1309 * arg3 / 16;
            var5.field1319 = var5.field1319 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "(II)Z", line = 33)
    public final boolean method566(int arg0, int arg1) {
        if (arg0 != 6487) {
            field1021 = (boolean[]) null;
        }
        field1032++;
        class80 var3 = this.method588(arg1, (byte) -71);
        return var3 == null ? false : var3.method662(this, this.field1006);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V", line = 51)
    public final void method567(boolean arg0) {
        this.field1024.method545((byte) -82);
        if (this.field1020 != null) {
            this.field1020.method545((byte) -82);
        }
        class80.field1139 = null;
        if (!arg0) {
            this.method38(-50, -83);
        }
        field1025++;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(II)Z", line = 67)
    public final boolean method568(int arg0, int arg1) {
        field1040++;
        if (arg1 != -1826) {
            this.field1020 = (class67) null;
        }
        return !this.method37(arg1 ^ 0x77C, arg0).field2655;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;I)I", line = 79)
    public static final int method569(int arg0, String arg1, int arg2) {
        int var3 = -90 % ((arg2 - 56) / 46);
        field1015++;
        return class157.method1137(arg0, 73, true, arg1);
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)[I", line = 88)
    public final int[] method570(int arg0, int arg1) {
        field1031++;
        if (arg0 == -20049) {
            class80 var3 = this.method588(arg1, (byte) -63);
            return var3 == null ? null : var3.method658(this, this.field1006, this.field1012 || this.method37(-116, arg1).field2664);
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IC)C", line = 106)
    public static final char method571(int arg0, char arg1) {
        field1037++;
        if (arg0 != 95) {
            return '9';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == '-') {
            return '\u0000';
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else if (arg1 == ' ' || arg1 == ' ') {
            return '_';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V", line = 504)
    public static final void method572(int arg0) {
        field1028++;
        if (!class3.method15((byte) 93) && class321.field4835 != class277.field4217) {
            class321.method2236(class1.field55.field5162[0], false, class169.field2446, false, class1.field55.field5186[0], class321.field4835, class324.field4884, -121);
            return;
        }
        class298.method2117(9814);
        if (class321.field4835 != class102.field1455) {
            class292.method2101((byte) 34);
        }
        int var1 = 52 % ((arg0 + 51) / 39);
    }

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "(II)Z", line = 524)
    public final boolean method573(int arg0, int arg1) {
        field1026++;
        if (this.field1012 || this.method37(-107, arg0).field2664) {
            return true;
        } else {
            if (arg1 <= 45) {
                field1027 = (String) null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZIIIII)V", line = 539)
    public static final void method574(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1038++;
        if (arg2 || arg0 < 1 || arg3 < 1 || arg0 > 102 || arg3 > 102) {
            return;
        }
        if (!class3.method15((byte) 93) && (class230.field3491[0][arg0][arg3] & 0x2) == 0) {
            int var8 = arg1;
            if ((class230.field3491[arg1][arg0][arg3] & 0x8) != 0) {
                var8 = 0;
            }
            if (class277.field4217 != var8) {
                return;
            }
        }
        int var9 = arg1;
        if (arg1 < 3 && (class230.field3491[1][arg0][arg3] & 0x2) == 2) {
            var9 = arg1 + 1;
        }
        class334.method2359(class92.field1269[arg1], arg3, arg5, arg1, arg0, var9, 3);
        if (arg7 >= 0) {
            boolean var10 = class229.field3472;
            class229.field3472 = true;
            class77.method633(false, arg7, var9, class92.field1269[arg1], arg3, false, (byte) -116, arg0, arg1, arg6, arg4);
            class229.field3472 = var10;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIF)[I", line = 589)
    public final int[] method575(int arg0, int arg1, float arg2) {
        if (arg1 != 255) {
            return (int[]) null;
        }
        field1022++;
        class80 var4 = this.method588(arg0, (byte) -91);
        if (var4 == null) {
            return null;
        } else {
            var4.field1147 = true;
            return var4.method657(this, this.field1006, arg2, this.field1012 || this.method37(-117, arg0).field2664);
        }
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(II)Z", line = 606)
    public final boolean method576(int arg0, int arg1) {
        if (arg0 != 255) {
            this.method568(23, -38);
        }
        field1009++;
        return this.method37(-98, arg1).field2667;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lph;Lph;Lph;IZ)V", line = 617)
    public class71(class361 arg0, class361 arg1, class361 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field1008 = arg3;
        this.field1006 = arg2;
        this.field1016 = arg0;
        this.field1012 = arg4;
        this.field1024 = new class67(this.field1008);
        if (class141.field2031) {
            this.field1020 = new class67(this.field1008);
        } else {
            this.field1020 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)V", line = 642)
    public final void method577(byte arg0, int arg1) {
        int var3 = -57 / ((-arg0 - 32) / 62);
        this.field1008 = arg1;
        this.field1024 = new class67(this.field1008);
        if (class141.field2031) {
            this.field1020 = new class67(this.field1008);
        } else {
            this.field1020 = null;
        }
        field1011++;
    }

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(II)Z", line = 658)
    public final boolean method578(int arg0, int arg1) {
        if (arg0 <= 104) {
            this.method575(-29, -69, 0.81554997F);
        }
        field1033++;
        return this.method37(-109, arg1).field2663;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZFIIZ)Lln;", line = 671)
    public final class118 method579(boolean arg0, float arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            return (class118) null;
        }
        class80 var6 = this.method588(arg2, (byte) -86);
        field1042++;
        if (var6 != null && var6.method662(this, this.field1006)) {
            return arg0 ? var6.field1151.method305((double) arg1, this, arg3, -120, false, this.field1006, arg3) : var6.field1151.method298(this.field1006, false, arg3, this, arg3, false, (double) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(BI)Lrj;", line = 691)
    private final class356 method580(byte arg0, int arg1) {
        if (arg0 != -45) {
            return (class356) null;
        }
        field1044++;
        class356 var3 = (class356) this.field1020.method551(arg0 ^ 0xFFFFFFD3, (long) arg1);
        if (var3 == null) {
            class356 var4 = new class356(this.method37(-79, arg1).field2659 & 0xFFFF);
            this.field1020.method547((long) arg1, -1, var4);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)I", line = 710)
    public final int method581(int arg0, byte arg1) {
        field1017++;
        if (arg1 > -1) {
            this.field1020 = (class67) null;
        }
        return this.method37(-125, arg0).field2662 & 0xFF;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V", line = 727)
    public final void method582(int arg0, int arg1, int arg2) {
        if (arg1 > -73) {
            this.field1024 = (class67) null;
        }
        class2.method9(this.method37(-125, arg0).field2657 & 0xFF, 10691, this.method37(-102, arg0).field2654 & 0xFF);
        field1036++;
        boolean var4 = false;
        class80 var5 = this.method588(arg0, (byte) -60);
        if (var5 != null) {
            var4 = var5.method659(this, this.field1006, arg2);
        }
        if (!var4) {
            class356 var6 = this.method580((byte) -45, arg0);
            var6.method2474(2);
        }
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(II)V", line = 760)
    public final void method583(int arg0, int arg1) {
        this.method582(arg0, arg1 ^ 0xFFFFFFC8, this.field1012 || this.method37(-88, arg0).field2664 ? 64 : 128);
        if (arg1 != 64) {
            this.method575(126, -60, 1.7254399F);
        }
        field1034++;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIII)I", line = 772)
    public static final int method584(int arg0, int arg1, int arg2, int arg3) {
        field1018++;
        if (class132.field1930 == null) {
            return 0;
        }
        int var4 = 117 % ((10 - arg2) / 51);
        int var5 = arg1 >> 7;
        int var6 = arg3 >> 7;
        if (var5 < 0 || var6 < 0 || var5 > 103 || var6 > 103) {
            return 0;
        }
        int var7 = arg0;
        int var8 = arg1 & 0x7F;
        if (arg0 < 3 && (class230.field3491[1][var5][var6] & 0x2) == 2) {
            var7 = arg0 + 1;
        }
        int var9 = (128 - var8) * class132.field1930[var7][var5][var6] + class132.field1930[var7][var5 + 1][var6] * var8 >> 7;
        int var10 = (128 - var8) * class132.field1930[var7][var5][var6 + 1] + class132.field1930[var7][var5 + 1][var6 + 1] * var8 >> 7;
        int var11 = arg3 & 0x7F;
        return (128 - var11) * var9 + var10 * var11 >> 7;
    }

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "(II)Lud;", line = 809)
    public final class41 method38(int arg0, int arg1) {
        class80 var3 = this.method588(arg0, (byte) -102);
        field1023++;
        if (arg1 != 1491) {
            field1010 = false;
        }
        return var3 == null ? null : var3.field1151;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lph;I)V", line = 828)
    public static final void method585(class361 arg0, int arg1) {
        class180.field2584 = arg0;
        if (arg1 < 31) {
            field1007 = (int[]) null;
        }
        field1013++;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)I", line = 842)
    public final int method586(int arg0, int arg1) {
        if (arg1 == 13078) {
            field1041++;
            return this.method37(-111, arg0).field2657 & 0xFF;
        } else {
            return -44;
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V", line = 853)
    public static void method587(int arg0) {
        field1021 = null;
        field1027 = null;
        int var1 = -48 % ((39 - arg0) / 63);
        field1007 = null;
        field1030 = null;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IB)Lcb;", line = 872)
    private final class80 method588(int arg0, byte arg1) {
        field1019++;
        if (arg1 > -57) {
            this.method588(21, (byte) -13);
        }
        class80 var3 = (class80) this.field1024.method551(0, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1016.method2520(arg0, 0, (byte) -25);
        if (var4 == null) {
            return null;
        } else {
            class80 var5 = new class80(new class190(var4));
            this.field1024.method547((long) arg0, -1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V", line = 898)
    public final void method589(boolean arg0, int arg1) {
        this.field1012 = arg0;
        this.method567(true);
        if (arg1 > 12) {
            field1043++;
        }
    }

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "(II)V", line = 918)
    public final void method590(int arg0, int arg1) {
        field1014++;
        if (arg1 != 0) {
            field1030 = (class177) null;
        }
        for (class80 var3 = (class80) this.field1024.method546((byte) 118); var3 != null; var3 = (class80) this.field1024.method550(-16723)) {
            if (var3.field1147) {
                var3.method660(arg0);
                var3.field1147 = false;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I", line = 942)
    public final int method591(int arg0, int arg1) {
        if (arg1 >= -109) {
            field1030 = (class177) null;
        }
        field1035++;
        return this.method37(-88, arg0).field2659 & 0xFFFF;
    }

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "(II)I", line = 953)
    public final int method592(int arg0, int arg1) {
        if (arg1 > -62) {
            this.method570(-59, 38);
        }
        field1039++;
        return this.method37(-78, arg0).field2665 & 0xFF;
    }
}
