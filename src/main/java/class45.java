import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class45 extends class189 {

    @OriginalMember(owner = "client!ef", name = "ib", descriptor = "Lp;")
    public static class135 field1066 = new class135();

    @OriginalMember(owner = "client!ef", name = "pb", descriptor = "I")
    public static int field1073 = 0;

    @OriginalMember(owner = "client!ef", name = "rb", descriptor = "Lgg;")
    public static class63 field1075 = class116.method911(43, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!ef", name = "qb", descriptor = "I")
    public static int field1074 = 0;

    @OriginalMember(owner = "client!ef", name = "gb", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!ef", name = "hb", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!ef", name = "jb", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!ef", name = "kb", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!ef", name = "lb", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!ef", name = "mb", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!ef", name = "nb", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!ef", name = "ob", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIB)V")
    public static final void method453(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field1070;
        for (int var5 = 0; var5 < class202.field4005; ++var5) {
            if (~arg1 > ~(class97.field2307[var5] + class27.field606[var5]) && ~(arg1 - -arg0) < ~class27.field606[var5] && ~arg2 > ~(class98.field2322[var5] + class110.field2481[var5]) && arg2 + arg3 > class110.field2481[var5]) {
                class60.field1523[var5] = true;
            }
        }
        if (arg4 != 61) {
            method453(-52, 101, -23, -61, (byte) -24);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)Z")
    public static final boolean method454(int arg0, byte arg1) {
        ++field1067;
        int var2 = 50 / ((59 - arg1) / 57);
        return arg0 >= 97 && ~arg0 >= -123 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class45() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[B)V")
    public static final void method455(int arg0, byte[] arg1) {
        ++field1072;
        class3 var2 = new class3(arg1);
        var2.field54 = arg1.length - 2;
        class97.field2312 = var2.method46((byte) 65);
        class190.field3875 = new int[class97.field2312];
        class60.field1521 = new int[class97.field2312];
        class85.field2014 = new byte[class97.field2312][];
        class163.field3366 = new int[class97.field2312];
        if (arg0 > -54) {
            method453(-52, -6, 101, -28, (byte) -76);
        }
        class190.field3868 = new int[class97.field2312];
        var2.field54 = -(class97.field2312 * 8) + -7 + arg1.length;
        class28.field658 = var2.method46((byte) 65);
        class153.field3202 = var2.method46((byte) 65);
        int var3 = (var2.method64(31790) & 255) - -1;
        for (int var4 = 0; class97.field2312 > var4; ++var4) {
            class163.field3366[var4] = var2.method46((byte) 65);
        }
        for (int var5 = 0; class97.field2312 > var5; ++var5) {
            class60.field1521[var5] = var2.method46((byte) 65);
        }
        for (int var6 = 0; class97.field2312 > var6; ++var6) {
            class190.field3875[var6] = var2.method46((byte) 65);
        }
        for (int var7 = 0; var7 < class97.field2312; ++var7) {
            class190.field3868[var7] = var2.method46((byte) 65);
        }
        var2.field54 = arg1.length + -7 + -((var3 - 1) * 3) + -(class97.field2312 * 8);
        class110.field2486 = new int[var3];
        for (int var8 = 1; ~var8 > ~var3; ++var8) {
            class110.field2486[var8] = var2.method20((byte) 66);
            if (class110.field2486[var8] == 0) {
                class110.field2486[var8] = 1;
            }
        }
        var2.field54 = 0;
        for (int var9 = 0; class97.field2312 > var9; ++var9) {
            int var10 = class190.field3875[var9];
            int var11 = class190.field3868[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class85.field2014[var9] = var13;
            int var14 = var2.method64(31790);
            if (var14 == 0) {
                for (int var15 = 0; var12 > var15; ++var15) {
                    var13[var15] = var2.method73((byte) 29);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; ~var10 < ~var16; ++var16) {
                    for (int var17 = 0; var11 > var17; ++var17) {
                        var13[var10 * var17 + var16] = var2.method73((byte) 29);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public static void method456(int arg0) {
        int var1 = -104 / ((arg0 - 31) / 37);
        field1075 = null;
        field1066 = null;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(BI)Ldc;")
    public static final class33 method457(byte arg0, int arg1) {
        int var2 = -55 / ((arg0 - -1) / 33);
        ++field1065;
        class33 var3 = (class33) class3.field62.method289((long) arg1, -130079263);
        if (var3 != null) {
            return var3;
        } else {
            class33 var4 = class50.method485(false, arg1, 0, class91.field2133, class24.field557);
            if (var4 != null) {
                class3.field62.method293(false, (long) arg1, var4);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg1 <= 32) {
            field1073 = -77;
        }
        ++field1064;
        if (~arg0 == -1) {
            super.field3811 = ~arg2.method64(31790) == -2;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)[[I")
    public final int[][] method83(int arg0, int arg1) {
        int[][] var3 = super.field3808.method237(-1, arg0);
        if (super.field3808.field561) {
            int[] var4 = this.method1245(2, arg0, 11433);
            int[][] var5 = this.method1244((byte) 20, arg0, 0);
            int[][] var6 = this.method1244((byte) 20, arg0, 1);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var5[1];
            int[] var11 = var5[0];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var6[0];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class54.field1430; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var8[var16] = var11[var16];
                    var7[var16] = var10[var16];
                    var9[var16] = var12[var16];
                } else if (var17 == 0) {
                    var8[var16] = var14[var16];
                    var7[var16] = var13[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        if (arg1 < 34) {
            field1074 = 81;
        }
        ++field1071;
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field1069;
        int[] var3 = super.field3825.method681(arg1, (byte) -41);
        if (super.field3825.field1840) {
            int[] var4 = this.method1245(0, arg1, 11433);
            int[] var5 = this.method1245(1, arg1, arg0 ^ 11433);
            int[] var6 = this.method1245(2, arg1, 11433);
            for (int var7 = 0; ~var7 > ~class54.field1430; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (~var8 != -1) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return arg0 != 0 ? null : var3;
    }
}
