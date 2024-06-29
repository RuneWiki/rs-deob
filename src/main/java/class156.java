import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class156 {

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "Lea;")
    public static class38 field3250 = class9.method46((byte) 121, " loggt sich ein)3");

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "Lea;")
    private static class38 field3254 = class9.method46((byte) 122, "Walk here");

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "Lea;")
    public static class38 field3255 = field3254;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Lea;")
    public static class38 field3247 = class9.method46((byte) 118, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "Lea;")
    private static class38 field3251 = class9.method46((byte) 117, "Login");

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lea;")
    public static class38 field3235 = field3251;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public int field3237;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public int field3239;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public int field3241;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public int field3242;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public int field3246;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public int field3248;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public int field3252;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "[B")
    public byte[] field3243;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "[B")
    public byte[] field3244;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "[I")
    public static int[] field3253;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method1084(int arg0) {
        field3254 = null;
        field3250 = null;
        field3255 = null;
        if (arg0 == -1) {
            field3253 = null;
            field3235 = null;
            field3251 = null;
            field3247 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILef;)Z")
    public static final boolean method1085(int arg0, class43 arg1) {
        field3249++;
        if (arg0 != 0) {
            return true;
        }
        if (class37.field783) {
            if (class40.method299(arg1, 25) != 0) {
                return false;
            }
            if (arg1.field965 == 0) {
                return false;
            }
        }
        return arg1.field1056;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZI)I")
    public static final int method1086(int arg0, boolean arg1, int arg2) {
        field3240++;
        class105 var3 = (class105) class19.field410.method183((byte) 47, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var3.field2340.length) {
            if (!arg1) {
                field3235 = null;
            }
            return var3.field2340[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BIII)V")
    public static final void method1087(byte arg0, int arg1, int arg2, int arg3) {
        if (class80.field1891 != 0 && arg2 != 0 && class37.field784 < 50) {
            class117.field2562[class37.field784] = arg3;
            class83.field1965[class37.field784] = arg2;
            class192.field3801[class37.field784] = arg1;
            class181.field3649[class37.field784] = null;
            class143.field2987[class37.field784] = 0;
            class37.field784++;
        }
        field3245++;
        if (arg0 != -100) {
            field3251 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)V")
    public static final void method1088(byte arg0, int arg1) {
        class163.field3390 += arg1 * 128;
        short var2 = 256;
        if (class68.field1720.length < class163.field3390) {
            class163.field3390 -= class68.field1720.length;
            int var3 = (int) (Math.random() * 12.0D);
            class118.method909(-4999, class187.field3722[var3]);
        }
        if (arg0 >= -16) {
            field3250 = null;
        }
        field3238++;
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class124.field2662[var4 + var5] - class68.field1720[class68.field1720.length - 1 & class163.field3390 + var4] * arg1 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class124.field2662[var4++] = var27;
        }
        for (int var8 = var2 - arg1; var8 < var2; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class124.field2662[var24 + var25] = 255;
                } else {
                    class124.field2662[var24 + var25] = 0;
                }
            }
        }
        if (class84.field1987 > 0) {
            class84.field1987 -= arg1 * 4;
        }
        if (class113.field2524 > 0) {
            class113.field2524 -= arg1 * 4;
        }
        if (class113.field2524 == 0 && class84.field1987 == 0) {
            int var9 = (int) ((double) (2000 / arg1) * Math.random());
            if (var9 == 0) {
                class113.field2524 = 1024;
            }
            if (var9 == 1) {
                class84.field1987 = 1024;
            }
        }
        for (int var10 = 0; var10 < var2 - arg1; var10++) {
            class191.field3768[var10] = class191.field3768[arg1 + var10];
        }
        for (int var11 = var2 - arg1; var11 < var2; var11++) {
            class191.field3768[var11] = (int) (Math.sin((double) class5.field150 / 14.0D) * 16.0D + Math.sin((double) class5.field150 / 15.0D) * 14.0D + Math.sin((double) class5.field150 / 16.0D) * 12.0D);
            class5.field150++;
        }
        class154.field3205 += arg1;
        int var12 = ((class45.field1098 & 0x1) + arg1) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class154.field3205 * 100; var13++) {
            int var22 = (int) (Math.random() * 128.0D) + 128;
            int var23 = (int) (Math.random() * 124.0D) + 2;
            class124.field2662[(var22 << 7) + var23] = 192;
        }
        class154.field3205 = 0;
        for (int var14 = 0; var14 < var2; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var19 += class124.field2662[var21 + var12 + var20];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class124.field2662[var21 + var20 - var12 - 1];
                }
                if (var21 >= 0) {
                    class87.field2019[var20 + var21] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var2; var17++) {
                int var18 = var17 * 128;
                if (var12 + var17 < var2) {
                    var16 += class87.field2019[var15 + var12 * 128 + var18];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class87.field2019[var15 + var18 - var12 * 128 - 128];
                }
                if (var17 >= 0) {
                    class124.field2662[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Z")
    public static final boolean method1089(int arg0, int arg1) {
        field3256++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else if (arg0 >= -102) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }
}
