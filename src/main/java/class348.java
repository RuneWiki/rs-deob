import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class348 {

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "Lm;")
    private class242 field5185;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "[I")
    public static int[] field5181 = new int[128];

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field5187 = 0;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "Lsj;")
    public static class248 field5177;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "Lob;")
    private class418 field5179;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5188;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lm;B)V")
    public final void method2301(class242 arg0, byte arg1) {
        if (arg1 >= -57) {
            this.method2301((class242) null, (byte) 23);
        }
        this.field5185 = arg0;
        field5189++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ltj;I)V")
    public static final void method2302(class298 arg0, int arg1) {
        arg0.method462(0, 0, class357.field5298, 350);
        field5186++;
        arg0.method435(0, 0, class357.field5298, 350, class255.field3719 << 24 | 0x332277, 1);
        for (int var2 = 0; var2 < 100; var2++) {
            int var4 = class273.field4011[var2];
            int var5 = class441.field6391[var2];
            arg0.method435(var4, var5, 2, 2, class342.field5121[var2] << 24 | 0xFFFFFF, 1);
        }
        for (int var3 = 0; var3 < class222.field3064.length; var3++) {
            class41.field630.method907(class222.field3064[var3], false, -16777216, 348 - class441.field6388 - class298.field4504.field6259 - (class104.field1357 * var3), -1, 10);
        }
        arg0.method2016(-1, 0, class357.field5298, 40, 350 - class441.field6388);
        class199.field2756.method907("--> " + class33.field526 + "*", false, -16777216, 350 - class233.field3232.field6259 - 1, -1, 10);
        if (arg1 != 18304) {
            field5182 = -70;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILao;IIIIIIIII)Z")
    public static final boolean method2303(int arg0, class280 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5190++;
        int var11 = arg5;
        int var12 = arg2;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg5 - var13;
        class189.field2643[var13][var14] = 99;
        int var16 = arg2 - var14;
        class87.field1204[var13][var14] = 0;
        byte var17 = 0;
        class87.field1205[var17] = arg5;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class132.field1726[var10001] = arg2;
        if (arg8 != 1) {
            return true;
        }
        int[][] var19 = arg1.field4115;
        while (var26 != var18) {
            var11 = class87.field1205[var18];
            var12 = class132.field1726[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var12 - var16;
            int var21 = var12 - arg1.field4106;
            int var22 = var11 - arg1.field4110;
            int var23 = var11 - var15;
            if (arg9 == -4) {
                if (arg3 == var11 && arg0 == var12) {
                    class355.field5262 = var12;
                    class57.field862 = var11;
                    return true;
                }
            } else if (arg9 == -3) {
                if (class122.method877(1, arg7, 1, arg0, var11, 1, arg3, arg6, var12)) {
                    class57.field862 = var11;
                    class355.field5262 = var12;
                    return true;
                }
            } else if (arg9 == -2) {
                if (arg1.method1853(arg7, var11, 32768, arg4, 1, var12, arg6, arg3, 1, arg0)) {
                    class355.field5262 = var12;
                    class57.field862 = var11;
                    return true;
                }
            } else if (arg9 == -1) {
                if (arg1.method1841(1, arg6, var12, var11, arg7, arg3, -1, arg4, arg0)) {
                    class355.field5262 = var12;
                    class57.field862 = var11;
                    return true;
                }
            } else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
                if (arg1.method1852(arg0, var11, var12, arg10, 1, arg9, arg3, 1)) {
                    class57.field862 = var11;
                    class355.field5262 = var12;
                    return true;
                }
            } else if (arg1.method1846(arg3, var12, 1, var11, arg8 + 1, arg9, arg0, arg10)) {
                class57.field862 = var11;
                class355.field5262 = var12;
                return true;
            }
            int var25 = class87.field1204[var23][var20] + 1;
            if (var23 > 0 && class189.field2643[var23 - 1][var20] == 0 && (var19[var22 - 1][var21] & 0x42240000) == 0) {
                class87.field1205[var26] = var11 - 1;
                class132.field1726[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class189.field2643[var23 - 1][var20] = 2;
                class87.field1204[var23 - 1][var20] = var25;
            }
            if (var23 < 127 && class189.field2643[var23 + 1][var20] == 0 && (var19[var22 + 1][var21] & 0x60240000) == 0) {
                class87.field1205[var26] = var11 + 1;
                class132.field1726[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class189.field2643[var23 + 1][var20] = 8;
                class87.field1204[var23 + 1][var20] = var25;
            }
            if (var20 > 0 && class189.field2643[var23][var20 - 1] == 0 && (var19[var22][var21 - 1] & 0x40A40000) == 0) {
                class87.field1205[var26] = var11;
                class132.field1726[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class189.field2643[var23][var20 - 1] = 1;
                class87.field1204[var23][var20 - 1] = var25;
            }
            if (var20 < 127 && class189.field2643[var23][var20 + 1] == 0 && (var19[var22][var21 + 1] & 0x48240000) == 0) {
                class87.field1205[var26] = var11;
                class132.field1726[var26] = var12 + 1;
                class189.field2643[var23][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class87.field1204[var23][var20 + 1] = var25;
            }
            if (var23 > 0 && var20 > 0 && class189.field2643[var23 - 1][var20 - 1] == 0 && (var19[var22 - 1][var21 - 1] & 0x43A40000) == 0 && (var19[var22 - 1][var21] & 0x42240000) == 0 && (var19[var22][var21 - 1] & 0x40A40000) == 0) {
                class87.field1205[var26] = var11 - 1;
                class132.field1726[var26] = var12 - 1;
                class189.field2643[var23 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class87.field1204[var23 - 1][var20 - 1] = var25;
            }
            if (var23 < 127 && var20 > 0 && class189.field2643[var23 + 1][var20 - 1] == 0 && (var19[var22 + 1][var21 - 1] & 0x60E40000) == 0 && (var19[var22 + 1][var21] & 0x60240000) == 0 && (var19[var22][var21 - 1] & 0x40A40000) == 0) {
                class87.field1205[var26] = var11 + 1;
                class132.field1726[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class189.field2643[var23 + 1][var20 - 1] = 9;
                class87.field1204[var23 + 1][var20 - 1] = var25;
            }
            if (var23 > 0 && var20 < 127 && class189.field2643[var23 - 1][var20 + 1] == 0 && (var19[var22 - 1][var21 + 1] & 0x4E240000) == 0 && (var19[var22 - 1][var21] & 0x42240000) == 0 && (var19[var22][var21 + 1] & 0x48240000) == 0) {
                class87.field1205[var26] = var11 - 1;
                class132.field1726[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class189.field2643[var23 - 1][var20 + 1] = 6;
                class87.field1204[var23 - 1][var20 + 1] = var25;
            }
            if (var23 < 127 && var20 < 127 && class189.field2643[var23 + 1][var20 + 1] == 0 && (var19[var22 + 1][var21 + 1] & 0x78240000) == 0 && (var19[var22 + 1][var21] & 0x60240000) == 0 && (var19[var22][var21 + 1] & 0x48240000) == 0) {
                class87.field1205[var26] = var11 + 1;
                class132.field1726[var26] = var12 + 1;
                class189.field2643[var23 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class87.field1204[var23 + 1][var20 + 1] = var25;
            }
        }
        class57.field862 = var11;
        class355.field5262 = var12;
        return false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public static void method2304(byte arg0) {
        field5177 = null;
        int var1 = 97 / ((arg0 + 1) / 45);
        field5188 = null;
        field5181 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)Lob;")
    public final class418 method2305(int arg0) {
        field5178++;
        if (arg0 >= -36) {
            method2304((byte) -105);
        }
        class418 var2 = this.field5179;
        if (this.field5185.field3397 == var2) {
            this.field5179 = null;
            return null;
        } else {
            this.field5179 = var2.field6094;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
    public class348() {
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)Lob;")
    public final class418 method2306(int arg0) {
        if (arg0 != -101) {
            method2303(-100, (class280) null, -11, 14, 33, -54, -29, -114, -48, 124, 116);
        }
        field5183++;
        class418 var2 = this.field5185.field3397.field6094;
        if (this.field5185.field3397 == var2) {
            this.field5179 = null;
            return null;
        } else {
            this.field5179 = var2.field6094;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lm;)V")
    public class348(class242 arg0) {
        this.field5185 = arg0;
    }
}
