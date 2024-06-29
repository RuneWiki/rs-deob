import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class86 extends class154 {

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "Leg;")
    private static class37 field1349 = class174.method1167("Use", 90);

    @OriginalMember(owner = "client!lf", name = "gb", descriptor = "Leg;")
    public static class37 field1357 = class174.method1167("gleiten:", 61);

    @OriginalMember(owner = "client!lf", name = "ib", descriptor = "Leg;")
    private static class37 field1359 = class174.method1167("Created gameworld", 60);

    @OriginalMember(owner = "client!lf", name = "ob", descriptor = "Leg;")
    public static class37 field1365 = field1349;

    @OriginalMember(owner = "client!lf", name = "kb", descriptor = "Leg;")
    public static class37 field1361 = field1359;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!lf", name = "fb", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!lf", name = "hb", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!lf", name = "jb", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!lf", name = "lb", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!lf", name = "mb", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!lf", name = "nb", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!lf", name = "pb", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!lf", name = "qb", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!lf", name = "rb", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1351;
        if (~class178.field2972 >= ~arg1 && arg6 <= class217.field3741 && arg5 >= class286.field5050 && arg4 <= class96.field1507) {
            class186.method1243(arg3, arg2, arg5, arg4, arg6, arg0, 33, arg1);
        } else {
            class223.method1557(arg4, arg5, arg3, arg6, arg0, arg2, arg1, 20573);
        }
        if (arg7 != -16366) {
            method569(-13, 64, (Component) null, 18);
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
    public static final void method567(byte arg0) {
        int var1 = -7 % ((2 - arg0) / 51);
        ++field1355;
        class107.field1662.method1403(45);
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)V")
    public static final void method568(int arg0, int arg1) {
        ++field1360;
        class191.method1317((byte) 73);
        class1.method8(false);
        if (arg0 != 13695) {
            field1349 = null;
        }
        int var2 = class201.method1395(2285, arg1).field215;
        if (~var2 != -1) {
            int var3 = class153.field2571[arg1];
            if (~var2 == -7) {
                class49.field769 = var3;
            }
            if (~var2 == -10) {
                class208.field3533 = var3;
            }
            if (~var2 == -6) {
                class234.field4040 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            super.field2579 = arg0.method1268(255) == 1;
        }
        ++field1348;
        if (arg1 != -14015) {
            method567((byte) -84);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILjava/awt/Component;I)Llh;")
    public static final class197 method569(int arg0, int arg1, Component arg2, int arg3) {
        ++field1363;
        try {
            if (arg1 > -73) {
                return null;
            } else {
                Class var4 = Class.forName("rj");
                class197 var5 = (class197) var4.newInstance();
                var5.method930(arg0, arg2, arg3, false);
                return var5;
            }
        } catch (Throwable var7) {
            class130 var6 = new class130();
            var6.method930(arg0, arg2, arg3, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        ++field1356;
        if (arg1 != 1075962732) {
            field1357 = null;
        }
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (super.field2574.field536) {
            int[] var4 = this.method1052(0, arg0, (byte) -76);
            for (int var5 = 0; ~class227.field3898 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    public static final void method570(boolean arg0) {
        ++field1362;
        class255.field4524 = 0;
        class131.field2182 = 0;
        class105.method701(8);
        class224.method1560(3);
        class190.method1312(-39);
        if (arg0) {
            method566(23, -123, 56, -25, -128, 35, -106, -6);
        }
        for (int var1 = 0; ~var1 > ~class131.field2182; ++var1) {
            int var3 = class223.field3833[var1];
            if (class72.field1146 != class55.field833[var3].field1759) {
                if (class55.field833[var3].field2691.method1858((byte) -39)) {
                    class61.method439(-1, class55.field833[var3]);
                }
                class55.field833[var3].method1094(-118, (class275) null);
                class55.field833[var3] = null;
            }
        }
        if (~class182.field3044 != ~class213.field3680.field3169) {
            throw new RuntimeException("gnp1 pos:" + class213.field3680.field3169 + " psize:" + class182.field3044);
        } else {
            for (int var2 = 0; ~class46.field729 < ~var2; ++var2) {
                if (class55.field833[class98.field1525[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class46.field729);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method571(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class8.field139 * arg3 + class69.field1101 * arg0 >> 16;
        int var6 = class69.field1101 * arg3 - class8.field139 * arg0 >> 16;
        int var7 = class61.field999 * var6 + class197.field3347 * arg1 >> 16;
        int var8 = class61.field999 * arg1 - class197.field3347 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class61.field999 * var6 + class197.field3347 * arg2 >> 16;
        int var12 = class61.field999 * arg2 - class197.field3347 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < field1368 && var13 < field1368) {
            return false;
        } else if (var9 > class81.field1269 && var13 > class81.field1269) {
            return false;
        } else if (var10 < class240.field4271 && var14 < class240.field4271) {
            return false;
        } else {
            return var10 <= class202.field3455 || var14 <= class202.field3455;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        if (arg0 != 115) {
            field1365 = null;
        }
        ++field1367;
        int[][] var3 = super.field2585.method1532(arg1, -122);
        if (super.field2585.field3761) {
            int[][] var4 = this.method1054(0, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[1];
            for (int var11 = 0; class227.field3898 > var11; ++var11) {
                var7[var11] = -var5[var11] + 4096;
                var8[var11] = -var10[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1354;
        int var8 = arg4;
        int var9 = 0;
        int var10 = 0;
        int var11 = -arg5 + arg1;
        int var12 = arg1 * arg1;
        int var13 = -arg5 + arg4;
        int var14 = var11 * var11;
        int var15 = arg4 * arg4;
        int var16 = var13 * var13;
        int var17 = var12 << 1;
        int var18 = var15 << 1;
        int var19 = var14 << 1;
        int var20 = var16 << 1;
        int var21 = arg4 << 1;
        int var22 = var13 << 1;
        int var23 = (-var21 + arg7) * var12 + var18;
        int var24 = (1 - var22) * var14 + var20;
        int var25 = var15 - (var21 - 1) * var17;
        int var26 = -((var22 + -1) * var19) + var16;
        int var27 = var15 << 2;
        int var28 = var14 << 2;
        int var29 = var16 << 2;
        int var30 = var12 << 2;
        int var31 = var18 * 3;
        int var32 = (var21 + -3) * var17;
        int var33 = (var22 + -3) * var19;
        int var34 = var20 * 3;
        int var35 = var27;
        int var36 = var29;
        int var37 = (arg4 - 1) * var30;
        int var38 = (var13 + -1) * var28;
        int[] var39 = class210.field3617[arg2];
        class145.method1010(-var11 + arg0, -arg1 + arg0, -25086, arg3, var39);
        class145.method1010(arg0 + var11, -var11 + arg0, -25086, arg6, var39);
        class145.method1010(arg0 + arg1, arg0 + var11, -25086, arg3, var39);
        while (~var8 < -1) {
            if (~var23 > -1) {
                while (~var23 > -1) {
                    var25 += var35;
                    ++var10;
                    var23 += var31;
                    var31 += var27;
                    var35 += var27;
                }
            }
            if (~var25 > -1) {
                ++var10;
                var25 += var35;
                var23 += var31;
                var31 += var27;
                var35 += var27;
            }
            int var40 = arg0 - -var10;
            var23 += -var37;
            var37 -= var30;
            boolean var41 = var13 >= var8;
            if (var41) {
                if (var24 < 0) {
                    while (~var24 > -1) {
                        var26 += var36;
                        ++var9;
                        var36 += var29;
                        var24 += var34;
                        var34 += var29;
                    }
                }
                if (var26 < 0) {
                    var24 += var34;
                    ++var9;
                    var34 += var29;
                    var26 += var36;
                    var36 += var29;
                }
                var26 += -var33;
                var33 -= var28;
                var24 += -var38;
                var38 -= var28;
            }
            --var8;
            var25 += -var32;
            var32 -= var30;
            int var42 = arg2 - -var8;
            int var43 = arg0 - var10;
            int var44 = arg2 - var8;
            if (!var41) {
                class145.method1010(var40, var43, -25086, arg3, class210.field3617[var44]);
                class145.method1010(var40, var43, -25086, arg3, class210.field3617[var42]);
            } else {
                int var45 = arg0 - var9;
                class145.method1010(var45, var43, -25086, arg3, class210.field3617[var44]);
                int var46 = arg0 + var9;
                class145.method1010(var46, var45, -25086, arg6, class210.field3617[var44]);
                class145.method1010(var40, var46, arg7 + -25087, arg3, class210.field3617[var44]);
                class145.method1010(var45, var43, -25086, arg3, class210.field3617[var42]);
                class145.method1010(var46, var45, -25086, arg6, class210.field3617[var42]);
                class145.method1010(var40, var46, -25086, arg3, class210.field3617[var42]);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class86() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIII)V")
    public static final void method573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1366;
        if (arg2 == arg5) {
            class73.method494(arg1, (byte) 127, arg2, arg4, arg3);
        } else {
            if (~(-arg2 + arg1) <= ~class178.field2972 && arg1 - -arg2 <= class217.field3741 && ~(arg4 - arg5) <= ~class286.field5050 && ~(arg4 + arg5) >= ~class96.field1507) {
                class43.method283((byte) 56, arg4, arg5, arg3, arg1, arg2);
            } else {
                class129.method915(arg1, arg3, arg5, -23215, arg4, arg2);
            }
            if (arg0 != 1) {
                method572(24, 3, 76, 3, -53, -66, 44, -8);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)V")
    public static void method574(byte arg0) {
        field1349 = null;
        field1357 = null;
        field1361 = null;
        field1365 = null;
        field1359 = null;
        int var1 = 34 / ((49 - arg0) / 52);
    }
}
