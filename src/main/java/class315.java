import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class315 {

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    private int field4037 = -1;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "Z")
    public boolean field4045 = true;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    private int field4032;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    private int field4033;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "Ljga;")
    private class154 field4038;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "Lbm;")
    private class684 field4039;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "Lbaa;")
    private class620 field4048;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public int field4036;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
    private int field4046;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    private int field4041;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "Lru;")
    private class246 field4047;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "[Z")
    public static boolean[] field4044 = new boolean[200];

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "Lus;")
    public static class328 field4034 = new class328(82, -1);

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "Z")
    public static boolean field4051 = false;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V", line = 5)
    private final void method1843(boolean arg0) {
        field4031++;
        if (!this.field4045) {
            return;
        }
        this.field4045 = arg0;
        byte[] var2 = this.field4038.field1876;
        int var3 = 0;
        int var4 = this.field4038.field1878;
        int var5 = this.field4038.field1878 * this.field4033 + this.field4032;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field4048 != null && this.field4037 == var3) {
            this.field4045 = false;
            return;
        }
        this.field4037 = var3;
        int var7 = this.field4032 + (this.field4033 * var4);
        int var8 = 0;
        if (!this.field4039.method1399(class240.field3093, (byte) 62, class15.field215)) {
            if (class688.field9761 == null) {
                class688.field9761 = new int[16384];
            }
            int[] var9 = class688.field9761;
            for (int var10 = -128; var10 < 0; var10++) {
                for (int var11 = -128; var11 < 0; var11++) {
                    if (var2[var7] == 0) {
                        int var12 = 0;
                        if (var2[var7 - 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var12++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var12++;
                        }
                        if (var2[var4 + var7] != 0) {
                            var12++;
                        }
                        var9[var8++] = var12 * 17 << 24;
                    } else {
                        var9[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field4038.field1878 - 128;
            }
            if (this.field4048 == null) {
                this.field4048 = this.field4039.method3731(class688.field9761, false, (byte) 58, 128, 128);
                this.field4048.method381(false, -13021, false);
            } else {
                this.field4048.method380(128, 128, 0, class688.field9761, 0, -19156, 0, 128);
            }
            return;
        }
        if (class606.field8416 == null) {
            class606.field8416 = new byte[16384];
        }
        byte[] var13 = class606.field8416;
        for (int var14 = -128; var14 < 0; var14++) {
            for (int var15 = -128; var15 < 0; var15++) {
                if (var2[var7] == 0) {
                    int var16 = 0;
                    if (var2[var7 - 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 + 1] != 0) {
                        var16++;
                    }
                    if (var2[var7 - var4] != 0) {
                        var16++;
                    }
                    if (var2[var4 + var7] != 0) {
                        var16++;
                    }
                    var13[var8++] = (byte) (var16 * 17);
                } else {
                    var13[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field4038.field1878 - 128;
        }
        if (this.field4048 == null) {
            this.field4048 = this.field4039.method3714(128, 0, 128, class606.field8416, false, class15.field215);
            this.field4048.method381(false, -13021, false);
        } else {
            this.field4048.method379(class606.field8416, 128, (byte) -68, 0, 0, 128, class15.field215, 0, 128);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IILru;)V", line = 175)
    public final void method1844(int arg0, int arg1, class246 arg2) {
        if (arg1 > 0) {
            this.method1843(false);
            this.field4039.method3711(false, this.field4048);
            this.field4039.method1415(this.field4046, class260.field3301, (byte) 110, 0, arg1, arg2, this.field4041 + 1 - this.field4046);
        }
        if (arg0 != 1) {
            method1845((byte) -3);
        }
        field4042++;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)I", line = 193)
    public static final int method1845(byte arg0) {
        field4040++;
        if (arg0 != 26) {
            field4050 = 96;
        }
        if (class85.field1090 == null) {
            if (!class322.field4113 && class750.field10502 != null) {
                return class750.field10502.field10119;
            }
            int var1 = class402.field5566.method2337(-123);
            int var2 = class402.field5566.method2336((byte) 22);
            if (class44.field664) {
                if (class333.field4301 < var1 && var1 < (class521.field7340 + class333.field4301)) {
                    int var10 = -1;
                    for (int var11 = 0; var11 < class1.field1; var11++) {
                        if (class95.field1206) {
                            int var16 = class649.field8919 - (-(var11 * 16) - 33);
                            if (var2 > var16 - 13 && var2 <= (var16 + 3)) {
                                var10 = var11;
                            }
                        } else {
                            int var15 = class649.field8919 + (var11 * 16) + 31;
                            if ((var15 - 13) < var2 && var2 <= (var15 + 3)) {
                                var10 = var11;
                            }
                        }
                    }
                    if (var10 != -1) {
                        int var12 = 0;
                        class260 var13 = new class260(class681.field9283);
                        for (class359 var14 = (class359) var13.method1577(1); var14 != null; var14 = (class359) var13.method1578((byte) 30)) {
                            if ((var12++) == var10) {
                                return ((class718) var14.field5117.field6099.field8705).field10119;
                            }
                        }
                    }
                } else if (class691.field9807 != null && class471.field6767 < var1 && var1 < (class713.field10038 + class471.field6767)) {
                    int var17 = -1;
                    for (int var18 = 0; var18 < class691.field9807.field5121; var18++) {
                        if (class95.field1206) {
                            int var23 = var18 * 16 + class475.field6798 + 33;
                            if ((var23 - 13) < var2 && var2 <= var23 + 3) {
                                var17 = var18;
                            }
                        } else {
                            int var22 = var18 * 16 + class475.field6798 + 31;
                            if ((var22 - 13) < var2 && var22 + 3 >= var2) {
                                var17 = var18;
                            }
                        }
                    }
                    if (var17 != -1) {
                        int var19 = 0;
                        class260 var20 = new class260(class691.field9807.field5117);
                        for (class718 var21 = (class718) var20.method1577(1); var21 != null; var21 = (class718) var20.method1578((byte) 30)) {
                            if (var19++ == var17) {
                                return var21.field10119;
                            }
                        }
                    }
                }
            } else if (class333.field4301 < var1 && class333.field4301 + class521.field7340 > var1) {
                int var3 = -1;
                for (int var4 = 0; var4 < class573.field8011; var4++) {
                    if (class95.field1206) {
                        int var8 = (class573.field8011 - var4 - 1) * 16 + class649.field8919 + 33;
                        if (var2 > (var8 - 13) && var2 <= (var8 + 3)) {
                            var3 = var4;
                        }
                    } else {
                        int var9 = (class573.field8011 - var4 - 1) * 16 + class649.field8919 + 31;
                        if ((var9 - 13) < var2 && var9 + 3 >= var2) {
                            var3 = var4;
                        }
                    }
                }
                if (var3 != -1) {
                    int var5 = 0;
                    class371 var6 = new class371(class565.field7906);
                    for (class718 var7 = (class718) var6.method2266((byte) 124); var7 != null; var7 = (class718) var6.method2267((byte) 70)) {
                        if (var3 == (var5++)) {
                            return var7.field10119;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V", line = 387)
    public final void method1846(int arg0) {
        if (arg0 < -118) {
            field4035++;
            this.method1844(1, this.field4036, this.field4047);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIBIIIIIII)Z", line = 404)
    public static final boolean method1847(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4043++;
        if (arg9 > 2000 || arg0 > 2000 || arg5 > 2000 || arg8 > 2000 || arg1 > 2000 || arg4 > 2000) {
            return false;
        }
        if (arg2 > -72) {
            method1847(-38, -75, (byte) -51, 12, -20, 49, 75, 76, -2, -124);
        }
        if (arg9 < -2000 || arg0 < -2000 || arg5 < -2000 || arg8 < -2000 || arg1 < -2000 || arg4 < -2000) {
            return false;
        }
        if (class608.field8432 == 2) {
            int var10 = class521.field7350 * arg9 + arg8;
            if (var10 >= 0 && var10 < class248.field3164.length && class248.field3164[var10] > ((arg3 << 8) - 38400)) {
                return false;
            }
            int var11 = class521.field7350 * arg0 + arg1;
            if (var11 >= 0 && var11 < class248.field3164.length && class248.field3164[var11] > ((arg7 << 8) - 38400)) {
                return false;
            }
            int var12 = class521.field7350 * arg5 + arg4;
            if (var12 >= 0 && var12 < class248.field3164.length && class248.field3164[var12] > (arg6 << 8) - 38400) {
                return false;
            }
        }
        int var13 = arg1 - arg8;
        int var14 = arg0 - arg9;
        int var15 = arg4 - arg8;
        int var16 = arg5 - arg9;
        int var17 = arg7 - arg3;
        if (arg9 < arg0 && arg5 < arg5) {
            arg9--;
            if (arg0 <= arg5) {
                arg5++;
            } else {
                arg0++;
            }
        } else if (arg0 >= arg5) {
            arg5--;
            if (arg0 >= arg9) {
                arg0++;
            } else {
                arg9++;
            }
        } else {
            arg0--;
            if (arg5 >= arg9) {
                arg5++;
            } else {
                arg9++;
            }
        }
        int var18 = arg6 - arg3;
        int var19 = 0;
        if (arg0 != arg9) {
            var19 = (arg1 - arg8 << 12) / (arg0 - arg9);
        }
        int var20 = 0;
        if (arg0 != arg5) {
            var20 = (arg4 - arg1 << 12) / (arg5 - arg0);
        }
        int var21 = 0;
        if (arg5 != arg9) {
            var21 = (arg8 - arg4 << 12) / (arg9 - arg5);
        }
        int var22 = var13 * var16 - var14 * var15;
        if (var22 == 0) {
            return false;
        }
        int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
        int var24 = (var13 * var18 - (var15 * var17) << 8) / var22;
        if (arg9 <= arg0 && arg5 >= arg9) {
            if (arg9 >= class597.field8284) {
                return true;
            }
            int var25 = (arg3 << 8) - (arg8 * var23 - var23);
            if (arg0 > class597.field8284) {
                arg0 = class597.field8284;
            }
            if (arg5 > class597.field8284) {
                arg5 = class597.field8284;
            }
            if (arg5 <= arg0) {
                int var26;
                int var27 = var26 = arg8 << 12;
                if (arg9 < 0) {
                    var27 -= arg9 * var21;
                    var26 -= arg9 * var19;
                    var25 -= arg9 * var24;
                    arg9 = 0;
                }
                int var28 = arg4 << 12;
                if (arg5 < 0) {
                    var28 -= arg5 * var20;
                    arg5 = 0;
                }
                if (arg5 != arg9 && var19 > var21 || arg5 == arg9 && var20 > var19) {
                    int var29 = arg0 - arg5;
                    int var30 = arg5 - arg9;
                    int var31 = class521.field7350 * arg9;
                    while (true) {
                        var30--;
                        if (var30 < 0) {
                            while (true) {
                                var29--;
                                if (var29 < 0) {
                                    return true;
                                }
                                if (!class726.method4029(106, 0, var25, class248.field3164, (var26 >> 12) + 1, (var28 >> 12) - 1, var23, var31)) {
                                    return false;
                                }
                                var31 += class521.field7350;
                                var28 += var20;
                                var25 += var24;
                                var26 += var19;
                            }
                        }
                        if (!class726.method4029(-97, 0, var25, class248.field3164, (var26 >> 12) + 1, (var27 >> 12) + -1, var23, var31)) {
                            return false;
                        }
                        var31 += class521.field7350;
                        var26 += var19;
                        var25 += var24;
                        var27 += var21;
                    }
                } else {
                    int var32 = arg0 - arg5;
                    int var33 = arg5 - arg9;
                    int var34 = class521.field7350 * arg9;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return true;
                                }
                                if (!class726.method4029(88, 0, var25, class248.field3164, (var28 >> 12) + 1, (var26 >> 12) + -1, var23, var34)) {
                                    return false;
                                }
                                var34 += class521.field7350;
                                var28 += var20;
                                var25 += var24;
                                var26 += var19;
                            }
                        }
                        if (!class726.method4029(-110, 0, var25, class248.field3164, (var27 >> 12) + 1, (var26 >> 12) + -1, var23, var34)) {
                            return false;
                        }
                        var27 += var21;
                        var25 += var24;
                        var34 += class521.field7350;
                        var26 += var19;
                    }
                }
            } else {
                int var35;
                int var36 = var35 = arg8 << 12;
                int var37 = arg1 << 12;
                if (arg9 < 0) {
                    var36 -= arg9 * var21;
                    var35 -= arg9 * var19;
                    var25 -= arg9 * var24;
                    arg9 = 0;
                }
                if (arg0 < 0) {
                    var37 -= arg0 * var20;
                    arg0 = 0;
                }
                if ((arg0 == arg9 || var21 >= var19) && (arg0 != arg9 || var21 <= var20)) {
                    int var41 = arg5 - arg0;
                    int var42 = arg0 - arg9;
                    int var43 = class521.field7350 * arg9;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return true;
                                }
                                if (!class726.method4029(-62, 0, var25, class248.field3164, (var36 >> 12) + 1, (var37 >> 12) - 1, var23, var43)) {
                                    return false;
                                }
                                var37 += var20;
                                var36 += var21;
                                var25 += var24;
                                var43 += class521.field7350;
                            }
                        }
                        if (!class726.method4029(104, 0, var25, class248.field3164, (var36 >> 12) + 1, (var35 >> 12) + -1, var23, var43)) {
                            return false;
                        }
                        var36 += var21;
                        var43 += class521.field7350;
                        var35 += var19;
                        var25 += var24;
                    }
                } else {
                    int var38 = arg5 - arg0;
                    int var39 = arg0 - arg9;
                    int var40 = class521.field7350 * arg9;
                    while (true) {
                        var39--;
                        if (var39 < 0) {
                            while (true) {
                                var38--;
                                if (var38 < 0) {
                                    return true;
                                }
                                if (!class726.method4029(102, 0, var25, class248.field3164, (var37 >> 12) + 1, (var36 >> 12) + -1, var23, var40)) {
                                    return false;
                                }
                                var25 += var24;
                                var36 += var21;
                                var37 += var20;
                                var40 += class521.field7350;
                            }
                        }
                        if (!class726.method4029(68, 0, var25, class248.field3164, (var35 >> 12) + 1, (var36 >> 12) + -1, var23, var40)) {
                            return false;
                        }
                        var40 += class521.field7350;
                        var36 += var21;
                        var25 += var24;
                        var35 += var19;
                    }
                }
            }
        } else if (arg0 > arg5) {
            if (arg5 >= class597.field8284) {
                return true;
            }
            if (class597.field8284 < arg9) {
                arg9 = class597.field8284;
            }
            if (arg0 > class597.field8284) {
                arg0 = class597.field8284;
            }
            int var44 = (arg6 << 8) + var23 - (arg4 * var23);
            if (arg0 <= arg9) {
                int var45;
                int var46 = var45 = arg4 << 12;
                int var47 = arg1 << 12;
                if (arg5 < 0) {
                    var46 -= arg5 * var20;
                    var45 -= arg5 * var21;
                    var44 -= arg5 * var24;
                    arg5 = 0;
                }
                if (arg0 < 0) {
                    var47 -= arg0 * var19;
                    arg0 = 0;
                }
                if (var21 <= var20) {
                    int var48 = arg9 - arg0;
                    int var49 = arg0 - arg5;
                    int var50 = class521.field7350 * arg5;
                    while (true) {
                        var49--;
                        if (var49 < 0) {
                            while (true) {
                                var48--;
                                if (var48 < 0) {
                                    return true;
                                }
                                if (!class726.method4029(122, 0, var44, class248.field3164, (var47 >> 12) + 1, (var45 >> 12) + -1, var23, var50)) {
                                    return false;
                                }
                                var45 += var21;
                                var47 += var19;
                                var50 += class521.field7350;
                                var44 += var24;
                            }
                        }
                        if (!class726.method4029(87, 0, var44, class248.field3164, (var46 >> 12) + 1, (var45 >> 12) + -1, var23, var50)) {
                            return false;
                        }
                        var45 += var21;
                        var44 += var24;
                        var46 += var20;
                        var50 += class521.field7350;
                    }
                } else {
                    int var51 = arg9 - arg0;
                    int var52 = arg0 - arg5;
                    int var53 = class521.field7350 * arg5;
                    while (true) {
                        var52--;
                        if (var52 < 0) {
                            while (true) {
                                var51--;
                                if (var51 < 0) {
                                    return true;
                                }
                                if (!class726.method4029(-90, 0, var44, class248.field3164, (var45 >> 12) + 1, (var47 >> 12) + -1, var23, var53)) {
                                    return false;
                                }
                                var47 += var19;
                                var53 += class521.field7350;
                                var44 += var24;
                                var45 += var21;
                            }
                        }
                        if (!class726.method4029(-97, 0, var44, class248.field3164, (var45 >> 12) + 1, (var46 >> 12) + -1, var23, var53)) {
                            return false;
                        }
                        var45 += var21;
                        var53 += class521.field7350;
                        var46 += var20;
                        var44 += var24;
                    }
                }
            } else {
                int var54;
                int var55 = var54 = arg4 << 12;
                int var56 = arg8 << 12;
                if (arg5 < 0) {
                    var54 -= arg5 * var21;
                    var44 -= arg5 * var24;
                    var55 -= arg5 * var20;
                    arg5 = 0;
                }
                if (arg9 < 0) {
                    var56 -= arg9 * var19;
                    arg9 = 0;
                }
                if (var20 >= var21) {
                    int var57 = arg0 - arg9;
                    int var58 = arg9 - arg5;
                    int var59 = class521.field7350 * arg5;
                    while (true) {
                        var58--;
                        if (var58 < 0) {
                            while (true) {
                                var57--;
                                if (var57 < 0) {
                                    return true;
                                }
                                if (!class726.method4029(109, 0, var44, class248.field3164, (var55 >> 12) + 1, (var56 >> 12) + -1, var23, var59)) {
                                    return false;
                                }
                                var59 += class521.field7350;
                                var44 += var24;
                                var56 += var19;
                                var55 += var20;
                            }
                        }
                        if (!class726.method4029(-111, 0, var44, class248.field3164, (var55 >> 12) + 1, (var54 >> 12) + -1, var23, var59)) {
                            return false;
                        }
                        var59 += class521.field7350;
                        var44 += var24;
                        var55 += var20;
                        var54 += var21;
                    }
                } else {
                    int var60 = arg0 - arg9;
                    int var61 = arg9 - arg5;
                    int var62 = class521.field7350 * arg5;
                    while (true) {
                        var61--;
                        if (var61 < 0) {
                            while (true) {
                                var60--;
                                if (var60 < 0) {
                                    return true;
                                }
                                if (!class726.method4029(75, 0, var44, class248.field3164, (var56 >> 12) + 1, (var55 >> 12) + -1, var23, var62)) {
                                    return false;
                                }
                                var62 += class521.field7350;
                                var55 += var20;
                                var56 += var19;
                                var44 += var24;
                            }
                        }
                        if (!class726.method4029(-58, 0, var44, class248.field3164, (var54 >> 12) + 1, (var55 >> 12) + -1, var23, var62)) {
                            return false;
                        }
                        var44 += var24;
                        var55 += var20;
                        var54 += var21;
                        var62 += class521.field7350;
                    }
                }
            }
        } else if (arg0 >= class597.field8284) {
            return true;
        } else {
            if (arg9 > class597.field8284) {
                arg9 = class597.field8284;
            }
            int var63 = (arg7 << 8) + var23 - (arg1 * var23);
            if (arg5 > class597.field8284) {
                arg5 = class597.field8284;
            }
            if (arg5 < arg9) {
                int var64;
                int var65 = var64 = arg1 << 12;
                int var66 = arg4 << 12;
                if (arg0 < 0) {
                    var63 -= arg0 * var24;
                    var65 -= arg0 * var19;
                    var64 -= arg0 * var20;
                    arg0 = 0;
                }
                if (arg5 < 0) {
                    var66 -= arg5 * var21;
                    arg5 = 0;
                }
                if (arg0 != arg5 && var19 < var20 || arg0 == arg5 && var19 > var21) {
                    int var67 = arg9 - arg5;
                    int var68 = arg5 - arg0;
                    int var69 = class521.field7350 * arg0;
                    while (true) {
                        var68--;
                        if (var68 < 0) {
                            while (true) {
                                var67--;
                                if (var67 < 0) {
                                    return true;
                                }
                                if (!class726.method4029(-102, 0, var63, class248.field3164, (var66 >> 12) + 1, (var65 >> 12) + -1, var23, var69)) {
                                    return false;
                                }
                                var69 += class521.field7350;
                                var65 += var19;
                                var63 += var24;
                                var66 += var21;
                            }
                        }
                        if (!class726.method4029(96, 0, var63, class248.field3164, (var64 >> 12) + 1, (var65 >> 12) - 1, var23, var69)) {
                            return false;
                        }
                        var63 += var24;
                        var65 += var19;
                        var64 += var20;
                        var69 += class521.field7350;
                    }
                } else {
                    int var70 = arg9 - arg5;
                    int var71 = arg5 - arg0;
                    int var72 = class521.field7350 * arg0;
                    while (true) {
                        var71--;
                        if (var71 < 0) {
                            while (true) {
                                var70--;
                                if (var70 < 0) {
                                    return true;
                                }
                                if (!class726.method4029(93, 0, var63, class248.field3164, (var65 >> 12) + 1, (var66 >> 12) - 1, var23, var72)) {
                                    return false;
                                }
                                var72 += class521.field7350;
                                var65 += var19;
                                var66 += var21;
                                var63 += var24;
                            }
                        }
                        if (!class726.method4029(68, 0, var63, class248.field3164, (var65 >> 12) + 1, (var64 >> 12) + -1, var23, var72)) {
                            return false;
                        }
                        var72 += class521.field7350;
                        var63 += var24;
                        var65 += var19;
                        var64 += var20;
                    }
                }
            } else {
                int var73;
                int var74 = var73 = arg1 << 12;
                if (arg0 < 0) {
                    var63 -= arg0 * var24;
                    var74 -= arg0 * var19;
                    var73 -= arg0 * var20;
                    arg0 = 0;
                }
                int var75 = arg8 << 12;
                if (arg9 < 0) {
                    var75 -= arg9 * var21;
                    arg9 = 0;
                }
                if (var19 >= var20) {
                    int var76 = arg5 - arg9;
                    int var77 = arg9 - arg0;
                    int var78 = class521.field7350 * arg0;
                    while (true) {
                        var77--;
                        if (var77 < 0) {
                            while (true) {
                                var76--;
                                if (var76 < 0) {
                                    return true;
                                }
                                if (!class726.method4029(111, 0, var63, class248.field3164, (var75 >> 12) + 1, (var73 >> 12) + -1, var23, var78)) {
                                    return false;
                                }
                                var78 += class521.field7350;
                                var63 += var24;
                                var73 += var20;
                                var75 += var21;
                            }
                        }
                        if (!class726.method4029(-127, 0, var63, class248.field3164, (var74 >> 12) + 1, (var73 >> 12) - 1, var23, var78)) {
                            return false;
                        }
                        var78 += class521.field7350;
                        var73 += var20;
                        var74 += var19;
                        var63 += var24;
                    }
                } else {
                    int var79 = arg5 - arg9;
                    int var80 = arg9 - arg0;
                    int var81 = class521.field7350 * arg0;
                    while (true) {
                        var80--;
                        if (var80 < 0) {
                            while (true) {
                                var79--;
                                if (var79 < 0) {
                                    return true;
                                }
                                if (!class726.method4029(83, 0, var63, class248.field3164, (var73 >> 12) + 1, (var75 >> 12) + -1, var23, var81)) {
                                    return false;
                                }
                                var63 += var24;
                                var75 += var21;
                                var73 += var20;
                                var81 += class521.field7350;
                            }
                        }
                        if (!class726.method4029(-110, 0, var63, class248.field3164, (var73 >> 12) + 1, (var74 >> 12) - 1, var23, var81)) {
                            return false;
                        }
                        var63 += var24;
                        var74 += var19;
                        var81 += class521.field7350;
                        var73 += var20;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lbm;Ljga;Lup;IIIII)V", line = 1163)
    public class315(class684 arg0, class154 arg1, class521 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4032 = arg6;
        this.field4033 = arg7;
        this.field4038 = arg1;
        this.field4039 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field5569 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field7338[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field4048 = null;
            this.field4036 = 0;
        } else {
            this.field4046 = Integer.MAX_VALUE;
            this.field4041 = Integer.MIN_VALUE;
            this.field4047 = this.field4039.method1412(false, true);
            this.field4047.method818(var10, (byte) 92);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field4047.method1518((byte) 118, true);
                if (var15 != null) {
                    Stream var16 = this.field4039.method3772(var15, 4);
                    if (Stream.method2226()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field5569 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field7338[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 > this.field4041) {
                                            this.field4041 = var28;
                                        }
                                        if (var28 < this.field4046) {
                                            this.field4046 = var28;
                                        }
                                        var16.method2233(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field5569 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field7338[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 < this.field4046) {
                                            this.field4046 = var22;
                                        }
                                        if (this.field4041 < var22) {
                                            this.field4041 = var22;
                                        }
                                        var16.method2224(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method2223();
                    if (this.field4047.method1517((byte) 116)) {
                        break;
                    }
                }
            }
            this.field4036 = var10 / 3;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)Lvl;", line = 1056)
    public static final class337 method1848(int arg0, int arg1, int arg2) {
        class73 var3 = class495.field7002[arg0][arg1][arg2];
        return var3 == null || var3.field966 == null ? null : var3.field966;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZLha;IIII)V", line = 1064)
    public static final void method1849(boolean arg0, class454 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.method131(arg5, arg4, arg2 + arg5, arg3 + arg4);
        field4049++;
        arg1.method2668(arg4, arg0, arg2, arg3, arg5, -16777216);
        if (class551.field7754 < 100) {
            return;
        }
        float var6 = (float) class341.field4437 / (float) class341.field4439;
        int var7 = arg2;
        int var8 = arg3;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg2 * var6);
        } else {
            var7 = (int) ((float) arg3 / var6);
        }
        int var9 = (arg2 - var7) / 2 + arg5;
        int var10 = (arg3 - var8) / 2 + arg4;
        if (class295.field3842 == null || arg2 != class295.field3842.method1895() || class295.field3842.method1893() != arg3) {
            class341.method2001(class341.field4441, class341.field4442 + class341.field4437, class341.field4441 + class341.field4439, class341.field4442, var9, var10, var7 + var9, var8 + var10);
            class341.method2014(arg1);
            class295.field3842 = arg1.method157(var9, var10, var7, var8, false);
        }
        class295.field3842.method3929(var9, var10);
        int var11 = class430.field6096 * var7 / class341.field4439;
        int var12 = class33.field508 * var8 / class341.field4437;
        int var13 = class132.field1573 * var7 / class341.field4439 + var9;
        int var14 = var8 + var10 - (class536.field7508 * var8 / class341.field4437) - var12;
        int var15 = -1996554240;
        if (class737.field10321 == class702.field9902) {
            var15 = -1996488705;
        }
        arg1.method167(var13, var14, var11, var12, var15, 1);
        arg1.method136(var13, var14, var11, var12, var15, 0);
        if (class383.field5336 <= 0) {
            return;
        }
        int var16;
        if (class488.field6949 > 50) {
            var16 = 500 - class488.field6949 * 5;
        } else {
            var16 = class488.field6949 * 5;
        }
        for (class499 var17 = (class499) class341.field4421.method3111(108); var17 != null; var17 = (class499) class341.field4421.method3116(-117)) {
            class351 var18 = class341.field4406.method2765(36, var17.field7056);
            if (class423.method2513(16777215, var18)) {
                if (class610.field8449 == var17.field7056) {
                    int var21 = var17.field7059 * var7 / class341.field4439 + var9;
                    int var22 = var10 + ((class341.field4437 - var17.field7047) * var8 / class341.field4437);
                    arg1.method2668(var22 - 2, arg0, 4, 4, var21 - 2, var16 << 24 | 0xFFFF00);
                } else if (class718.field10122 != -1 && class718.field10122 == var18.field4608) {
                    int var19 = var17.field7059 * var7 / class341.field4439 + var9;
                    int var20 = (class341.field4437 - var17.field7047) * var8 / class341.field4437 + var10;
                    arg1.method2668(var20 - 2, false, 4, 4, var19 - 2, var16 << 24 | 0xFFFF00);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)V", line = 1331)
    public static void method1850(byte arg0) {
        if (arg0 >= 84) {
            field4034 = null;
            field4044 = null;
        }
    }
}
