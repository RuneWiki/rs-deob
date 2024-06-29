import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class233 {

    @OriginalMember(owner = "client!s", name = "n", descriptor = "[I")
    private int[] field4170;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field4158 = 0;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "[I")
    public static int[] field4161 = new int[5];

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field4167 = 0;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field4166 = 0;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lhh;")
    private static class163 field4162 = class137.method1065("purple:", 17);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lhh;")
    public static class163 field4157 = field4162;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field4163 = 1;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Lhh;")
    public static class163 field4168 = field4162;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "[I")
    public static int[] field4172;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "[Lhh;")
    public static class163[] field4173;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[[[I")
    public static int[][][] field4164;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)Z")
    public static final boolean method1614(int arg0, byte arg1) {
        if (arg1 >= -121) {
            field4172 = null;
        }
        field4171++;
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public static final void method1615(int arg0, int arg1) {
        field4169++;
        if (arg0 == -1 || !class114.method906(0, arg0)) {
            return;
        }
        class69[] var2 = class109.field2060[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class69 var4 = var2[var3];
            if (var4.field1228 != null) {
                class225 var5 = new class225();
                var5.field4076 = var4;
                var5.field4079 = var4.field1228;
                class49.method352(var5, 2000000, false);
            }
        }
        if (arg1 <= 67) {
            method1617(-52, 28, 7, 84, 63, 116, 71, -64, -76, 81);
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)I")
    public final int method1616(int arg0, int arg1) {
        field4159++;
        int var3 = (this.field4170.length >> 1) - 1;
        int var4 = arg1 & var3;
        if (arg0 != 195473964) {
            method1614(-60, (byte) -43);
        }
        while (true) {
            int var5 = this.field4170[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4170[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == arg4 && arg3 == arg6 && arg1 == arg8 && arg2 == arg7) {
            class71.method521(arg0, (byte) -74, arg1, arg3, arg9, arg2);
        } else {
            int var10 = arg0;
            int var11 = arg3;
            int var12 = arg0 * 3;
            int var13 = arg3 * 3;
            int var14 = arg4 * 3;
            int var15 = arg6 * 3;
            int var16 = arg8 * 3;
            int var17 = arg1 + var14 - var16 - arg0;
            int var18 = arg7 * 3;
            int var19 = arg2 + var15 - arg3 - var18;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var18 - var15 - (-var13 + var15);
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var17 * var26;
                int var28 = var20 * var25;
                int var29 = var21 * var25;
                int var30 = var19 * var26;
                int var31 = var23 * var24;
                int var32 = var22 * var24;
                int var33 = (var29 + var31 + var30 >> 12) + arg3;
                int var34 = (var27 + var32 + var28 >> 12) + arg0;
                class71.method521(var10, (byte) -44, var34, var11, arg9, var33);
                var10 = var34;
                var11 = var33;
            }
        }
        field4174++;
        if (arg5 < 32) {
            method1615(-71, -108);
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(II)V")
    public static final void method1618(int arg0, int arg1) {
        field4165++;
        class122.field2326.method112(arg1, arg0 ^ 0x1E84FE);
        if (arg0 != 2000000) {
            field4162 = null;
        }
        class162.field2964.method112(arg1, 117);
        class18.field285.method112(arg1, 118);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method1619(int arg0) {
        field4173 = null;
        field4172 = null;
        field4161 = null;
        field4168 = null;
        field4164 = null;
        field4162 = null;
        if (arg0 < -18) {
            field4157 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "([I)V")
    public class233(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field4170 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field4170[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field4170[var5 - (-var5 - 1)] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field4170[var5 + var5] = arg0[var4];
            this.field4170[var5 + var5 + 1] = var4++;
        }
    }
}
