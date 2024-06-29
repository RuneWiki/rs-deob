import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class26 extends class405 {

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Lbn;")
    public class304 field383;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "Luv;")
    public static class2 field386 = new class2(9, 5);

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "[[I")
    public static int[][] field388 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "Laa;")
    public static class76 field389 = new class76(24, 16);

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Z", line = 5)
    public static final boolean method255(int arg0, int arg1) {
        int var2 = -61 / ((-arg1 - 45) / 55);
        field384++;
        if (arg0 == 3 || arg0 == 45 || arg0 == 21 || arg0 == 57 || arg0 == 9) {
            return true;
        } else {
            return arg0 == 49 || arg0 == 1010;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)Z", line = 26)
    public static final boolean method256(int arg0, int arg1) {
        field385++;
        if (arg0 == 716) {
            return arg1 == 3 || arg1 == 7 || arg1 == 10;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/String;)I", line = 37)
    public static final int method257(int arg0, String arg1) {
        field382++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 != 3) {
            method259(7);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 > '߿') {
                var3 += 3;
            } else {
                var3 += 2;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lbn;)V", line = 70)
    public class26(class304 arg0) {
        this.field383 = arg0;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V", line = 79)
    public static void method258(boolean arg0) {
        field386 = null;
        field389 = null;
        field388 = null;
        if (!arg0) {
            field388 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 91)
    public static final void method259(int arg0) {
        field381++;
        class448.field6610 = 0;
        class154.field2334.method2955(2131289328);
        if (arg0 <= 41) {
            method260(118, (byte) 55, 52, 11, 68, null);
        }
        class495.field7350 = false;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBIIILya;)V", line = 107)
    public static final void method260(int arg0, byte arg1, int arg2, int arg3, int arg4, class11 arg5) {
        arg5.method84(arg2, arg0, arg2 + arg4, arg0 + arg3);
        field387++;
        arg5.method67(91, arg4, -16777216, arg2, arg3, arg0);
        if (class507.field7449 < 100) {
            return;
        }
        float var6 = (float) class137.field2049 / (float) class137.field2053;
        int var7 = arg4;
        int var8 = arg3;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg4 * var6);
        } else {
            var7 = (int) ((float) arg3 / var6);
        }
        if (arg1 != -108) {
            return;
        }
        int var9 = (arg3 - var8) / 2 + arg0;
        int var10 = (arg4 - var7) / 2 + arg2;
        if (class14.field187 == null || arg4 != class14.field187.method470() || class14.field187.method465() != arg3) {
            class137.method1005(class137.field2035, class137.field2049 + class137.field2036, class137.field2053 + class137.field2035, class137.field2036, var10, var9, var7 + var10, var8 + var9);
            class137.method998(arg5);
            class14.field187 = arg5.method153(var10, var9, var7, var8, false);
        }
        class14.field187.method936(var10, var9);
        int var11 = class519.field7608 * var7 / class137.field2053;
        int var12 = class504.field7418 * var8 / class137.field2049;
        int var13 = class30.field434 * var7 / class137.field2053 + var10;
        int var14 = var8 + var9 - (class315.field4860 * var8 / class137.field2049) - var12;
        int var15 = -1996554240;
        if (class251.field3433 == class214.field3057) {
            var15 = -1996488705;
        }
        arg5.method162(var13, var14, var11, var12, var15, 1);
        arg5.method69(var13, var14, var11, var12, var15, 0);
        if (class341.field5244 <= 0) {
            return;
        }
        int var16;
        if (class197.field2888 <= 50) {
            var16 = class197.field2888 * 5;
        } else {
            var16 = 500 - (class197.field2888 * 5);
        }
        for (class219 var17 = (class219) class137.field2025.method2957(99); var17 != null; var17 = (class219) class137.field2025.method2947(28)) {
            class473 var18 = class137.field2014.method699(var17.field3137, 119);
            if (class403.method2432((byte) 0, var18)) {
                if (class154.field2331 == var17.field3137) {
                    int var21 = var17.field3134 * var7 / class137.field2053 + var10;
                    int var22 = var9 + ((class137.field2049 - var17.field3132) * var8 / class137.field2049);
                    arg5.method67(arg1 ^ 0xFFFFFFDC, 4, var16 << 24 | 0xFFFF00, var21 - 2, 4, var22 - 2);
                } else if (class14.field191 != -1 && class14.field191 == var18.field6967) {
                    int var19 = var10 + (var17.field3134 * var7 / class137.field2053);
                    int var20 = (class137.field2049 - var17.field3132) * var8 / class137.field2049 + var9;
                    arg5.method67(103, 4, var16 << 24 | 0xFFFF00, var19 - 2, 4, var20 - 2);
                }
            }
        }
    }
}
