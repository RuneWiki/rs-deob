import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class328 extends class298 {

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
    private int field4716 = 0;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    private int field4715 = 1024;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    private int field4717 = 819;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
    private int field4720 = 0;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    private int field4719 = 1024;

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "I")
    private int field4722 = 2048;

    @OriginalMember(owner = "client!dj", name = "eb", descriptor = "I")
    private int field4730 = 1024;

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "I")
    private int field4724 = 409;

    @OriginalMember(owner = "client!dj", name = "gb", descriptor = "I")
    private int field4732 = 1024;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "Lsd;")
    public static class74 field4713 = new class74(61, 9);

    @OriginalMember(owner = "client!dj", name = "db", descriptor = "I")
    public static int field4729 = 100;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!dj", name = "ab", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!dj", name = "bb", descriptor = "I")
    private int field4727;

    @OriginalMember(owner = "client!dj", name = "cb", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!dj", name = "fb", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V", line = 9)
    public static void method1987(int arg0) {
        if (arg0 <= 51) {
            field4729 = 107;
        }
        field4713 = null;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 19)
    public final void method15(int arg0) {
        ++field4712;
        if (arg0 > -41) {
            this.method15(1);
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V", line = 872)
    public class328() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)[I", line = 35)
    public final int[] method13(int arg0, boolean arg1) {
        ++field4723;
        if (!arg1) {
            this.field4715 = 89;
        }
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (super.field4443.field6915) {
            int[][] var4 = super.field4443.method2876(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class158.field1877 * this.field4715 >> 12;
            int var15 = class158.field1877 * this.field4722 >> 12;
            int var16 = class388.field5561 * this.field4724 >> 12;
            int var17 = class388.field5561 * this.field4717 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            } else {
                this.field4727 = class158.field1877 / 8 * this.field4732 >> 12;
                int var18 = class158.field1877 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field4716);
                while (true) {
                    while (true) {
                        int var22 = class459.method2706(-var14 + var15, var21, 97) + var14;
                        int var23 = var16 - -class459.method2706(-var16 + var17, var21, -115);
                        int var24 = var8 + var22;
                        if (var24 > class158.field1877) {
                            var22 = -var8 + class158.field1877;
                            var24 = class158.field1877;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var5 + var24;
                            if (var29 < 0) {
                                var29 += class158.field1877;
                            }
                            if (class158.field1877 < var29) {
                                var29 -= class158.field1877;
                            }
                            var25 = var27[2];
                            while (true) {
                                int[] var30 = var20[var26];
                                if (var30[0] <= var29 && var29 <= var30[1]) {
                                    if (var9 != var26) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class158.field1877;
                                        }
                                        if (class158.field1877 < var31) {
                                            var31 -= class158.field1877;
                                        }
                                        for (int var32 = 1; var28 >= var32; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var25 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var29 >= ~var31) {
                                                    if (~var36 == -1) {
                                                        var38 = Math.min(var29, var37);
                                                        var39 = 0;
                                                    } else {
                                                        var39 = Math.max(var31, var36);
                                                        var38 = class158.field1877;
                                                    }
                                                } else {
                                                    var39 = Math.max(var31, var36);
                                                    var38 = Math.min(var29, var37);
                                                }
                                                this.method1988(var35, -var39 + var38, var7 + var39, var25 - var35, (byte) 4, var21, var4);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var28;
                                int var10000 = ~var12;
                                ++var26;
                                if (var10000 >= ~var26) {
                                    var26 = 0;
                                }
                            }
                        }
                        if (class388.field5561 >= var23 + var25) {
                            var10 = false;
                        } else {
                            var23 = class388.field5561 - var25;
                        }
                        if (class158.field1877 == var24) {
                            this.method1988(var25, var22, var6 + var8, var23, (byte) 4, var21, var4);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[0] = var8;
                            var41[2] = var23 + var25;
                            var41[1] = var24;
                            int[][] var42 = var20;
                            var20 = var19;
                            var19 = var42;
                            var12 = var13;
                            var13 = 0;
                            var7 = var6;
                            var6 = class459.method2706(class158.field1877, var21, -35);
                            var5 = var6 - var7;
                            var8 = 0;
                            int var43 = var5;
                            if (var5 < 0) {
                                var43 = class158.field1877 + var5;
                            }
                            if (~var43 < ~class158.field1877) {
                                var43 -= class158.field1877;
                            }
                            var9 = 0;
                            var11 = false;
                            while (true) {
                                int[] var44 = var20[var9];
                                if (~var44[0] >= ~var43 && ~var44[1] <= ~var43) {
                                    break;
                                }
                                ++var9;
                                if (var12 <= var9) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[2] = var25 - -var23;
                            var45[0] = var8;
                            var45[1] = var24;
                            this.method1988(var25, var22, var8 - -var6, var23, (byte) 4, var21, var4);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIBLjava/util/Random;[[I)V", line = 283)
    private final void method1988(int arg0, int arg1, int arg2, int arg3, byte arg4, Random arg5, int[][] arg6) {
        ++field4726;
        int var8 = this.field4730 <= 0 ? 4096 : 4096 - class459.method2706(this.field4730, arg5, -69);
        int var9 = this.field4727 * this.field4719 >> 12;
        int var10 = this.field4727 + -(~var9 >= -1 ? 0 : class459.method2706(var9, arg5, arg4 ^ 101));
        if (arg2 >= class158.field1877) {
            arg2 -= class158.field1877;
        }
        if (arg4 != 4) {
            method1990((byte) -9);
        }
        if (var10 <= 0) {
            if (~(arg1 + arg2) < ~class158.field1877) {
                int var11 = -arg2 + class158.field1877;
                for (int var12 = 0; ~var12 > ~arg3; ++var12) {
                    int[] var13 = arg6[arg0 + var12];
                    class268.method1621(var13, arg2, var11, var8);
                    class268.method1621(var13, 0, -var11 + arg1, var8);
                }
            } else {
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    class268.method1621(arg6[arg0 - -var14], arg2, arg1, var8);
                }
            }
        } else if (~arg3 < -1 && ~arg1 < -1) {
            int var15 = arg1 / 2;
            int var16 = arg3 / 2;
            int var17 = ~var10 >= ~var15 ? var10 : var15;
            int var18 = var10 <= var16 ? var10 : var16;
            int var19 = arg2 + var17;
            int var20 = -(var17 * 2) + arg1;
            for (int var21 = 0; arg3 > var21; ++var21) {
                int[] var22 = arg6[arg0 + var21];
                if (var18 > var21) {
                    int var23 = var8 * var21 / var18;
                    if (this.field4720 != 0) {
                        for (int var24 = 0; ~var24 > ~var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class444.method2618(arg2 + var24, class474.field6656)] = var22[class444.method2618(class474.field6656, -var24 - 1 + arg1 + arg2)] = ~var23 >= ~var25 ? var23 : var25;
                        }
                    } else {
                        for (int var26 = 0; ~var26 > ~var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class444.method2618(class474.field6656, arg2 + var26)] = var22[class444.method2618(class474.field6656, -var26 + -1 + arg1 + arg2)] = var23 * var28 >> 12;
                        }
                    }
                    if (~(var19 + var20) >= ~class158.field1877) {
                        class268.method1621(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class158.field1877;
                        class268.method1621(var22, var19, var27, var23);
                        class268.method1621(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = arg3 + -1 - var21;
                    if (~var29 > ~var18) {
                        int var30 = var8 * var29 / var18;
                        if (this.field4720 == 0) {
                            for (int var31 = 0; var31 < var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class444.method2618(arg2 + var31, class474.field6656)] = var22[class444.method2618(class474.field6656, arg1 + arg2 - 1 + -var31)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var33 < var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class444.method2618(class474.field6656, arg2 + var33)] = var22[class444.method2618(arg1 - var33 + arg2 + -1, class474.field6656)] = var35 < var30 ? var35 : var30;
                            }
                        }
                        if (~class158.field1877 > ~(var19 + var20)) {
                            int var34 = -var19 + class158.field1877;
                            class268.method1621(var22, var19, var34, var30);
                            class268.method1621(var22, 0, -var34 + var20, var30);
                        } else {
                            class268.method1621(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var17; ++var36) {
                            var22[class444.method2618(arg2 + var36, class474.field6656)] = var22[class444.method2618(class474.field6656, arg2 - -arg1 + -1 + -var36)] = var8 * var36 / var17;
                        }
                        if (class158.field1877 < var19 + var20) {
                            int var37 = -var19 + class158.field1877;
                            class268.method1621(var22, var19, var37, var8);
                            class268.method1621(var22, 0, var20 - var37, var8);
                        } else {
                            class268.method1621(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(III)Z", line = 480)
    public static final boolean method1989(int arg0, int arg1, int arg2) {
        int var3 = class348.field4960[arg0][arg1][arg2];
        if (-class76.field920 == var3) {
            return false;
        } else if (class76.field920 == var3) {
            return true;
        } else {
            int var4 = arg1 << class482.field6812;
            int var5 = arg2 << class482.field6812;
            if (class287.method1818(var4 + 1, class398.field5667[arg0].method1861(arg1, arg2), var5 + 1) && class287.method1818(class200.field2777 + var4 - 1, class398.field5667[arg0].method1861(arg1 + 1, arg2), var5 + 1) && class287.method1818(class200.field2777 + var4 - 1, class398.field5667[arg0].method1861(arg1 + 1, arg2 + 1), class200.field2777 + var5 - 1) && class287.method1818(var4 + 1, class398.field5667[arg0].method1861(arg1, arg2 + 1), class200.field2777 + var5 - 1)) {
                class348.field4960[arg0][arg1][arg2] = class76.field920;
                return true;
            } else {
                class348.field4960[arg0][arg1][arg2] = -class76.field920;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(B)V", line = 508)
    public static final void method1990(byte arg0) {
        ++field4721;
        if (class231.field3205 != null) {
            class305.field4504.method2343(0);
            class196.method1074();
            class255.method1567(-1);
            class35.method178(true);
            class90.method454((byte) 103);
            class66.method341((byte) -66);
            if (class381.field5395 != null) {
                class381.field5395.method1043((byte) -97);
            }
            class269.method1627((byte) -125);
            class247.method1505(arg0 + 53);
            class24.method141(arg0 ^ 86);
            class137.method649(arg0 ^ 74, false);
            class369.method2233(9776);
            for (int var1 = 0; var1 < 2048; ++var1) {
                class198 var5 = class46.field596[var1];
                if (var5 != null) {
                    var5.field2533 = null;
                    for (int var6 = 0; var6 < var5.field2529.length; ++var6) {
                        var5.field2529[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class448.field6366.length; ++var2) {
                class137 var3 = class448.field6366[var2];
                if (var3 != null) {
                    for (int var4 = 0; ~var3.field2529.length < ~var4; ++var4) {
                        var3.field2529[var4] = null;
                    }
                }
            }
            class231.field3205.method1754(1);
            class231.field3205 = null;
        }
        if (arg0 != 7) {
            field4713 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILvt;)V", line = 591)
    public final void method10(int arg0, int arg1, class179 arg2) {
        ++field4728;
        if (arg0 >= -44) {
            this.method13(99, true);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    if (arg1 != 7) {
                                        if (~arg1 == -9) {
                                            this.field4730 = arg2.method916(21933);
                                        }
                                    } else {
                                        this.field4719 = arg2.method916(21933);
                                    }
                                } else {
                                    this.field4720 = arg2.method895((byte) -118);
                                }
                            } else {
                                this.field4732 = arg2.method916(21933);
                            }
                        } else {
                            this.field4717 = arg2.method916(21933);
                        }
                    } else {
                        this.field4724 = arg2.method916(21933);
                    }
                } else {
                    this.field4722 = arg2.method916(21933);
                }
            } else {
                this.field4715 = arg2.method916(21933);
            }
        } else {
            this.field4716 = arg2.method895((byte) -96);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZJIZI)Ljava/lang/String;", line = 695)
    public static final String method1991(boolean arg0, long arg1, int arg2, boolean arg3, int arg4) {
        ++field4718;
        char var6 = ',';
        char var7 = '.';
        if (arg4 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg4 == 2) {
            var7 = 160;
        }
        boolean var8 = arg0;
        if (arg1 < 0L) {
            arg1 = -arg1;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (~arg2 < -1) {
            for (int var10 = 0; ~arg2 < ~var10; ++var10) {
                int var11 = (int) arg1;
                arg1 /= 10L;
                var9.append((char) (-((int) arg1 * 10) + var11 + 48));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg1;
            arg1 /= 10L;
            var9.append((char) (var13 + 48 + -((int) arg1 * 10)));
            if (~arg1 == -1L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                ++var12;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLgn;)I", line = 774)
    public static final int method1992(byte arg0, class187 arg1) {
        ++field4731;
        if (~arg1.field2519 == -1) {
            return 0;
        } else {
            if (arg1.field2511 != -1) {
                class187 var2 = null;
                if (arg1.field2511 < 32768) {
                    var2 = class448.field6366[arg1.field2511];
                } else if (~arg1.field2511 <= -32769) {
                    var2 = class46.field596[arg1.field2511 + -32768];
                }
                if (var2 != null) {
                    int var3 = -var2.field1008 + arg1.field1008;
                    int var4 = -var2.field1005 + arg1.field1005;
                    if (var3 != 0 || var4 != 0) {
                        arg1.method1013((int) (2607.5945876176133D * Math.atan2((double) var3, (double) var4)) & 16383, (byte) 102);
                    }
                }
            }
            if (arg1 instanceof class198) {
                class198 var5 = (class198) arg1;
                if (var5.field2747 != -1 && (~var5.field2538 == -1 || var5.field2530 > 0)) {
                    var5.method1013(var5.field2747, (byte) 102);
                    var5.field2747 = -1;
                }
            } else if (arg1 instanceof class137) {
                class137 var6 = (class137) arg1;
                if (~var6.field1650 != 0 && (~var6.field2538 == -1 || var6.field2530 > 0)) {
                    int var7 = var6.field1008 - (-class93.field1163 + var6.field1650 + -class93.field1163) * 64;
                    int var8 = -((var6.field1651 - (class349.field5023 - -class349.field5023)) * 64) + var6.field1005;
                    if (~var7 != -1 || var8 != 0) {
                        var6.method1013((int) (2607.5945876176133D * Math.atan2((double) var7, (double) var8)) & 16383, (byte) 102);
                    }
                    var6.field1650 = -1;
                }
            }
            if (arg0 < 75) {
                field4729 = 8;
            }
            return arg1.method1007((byte) 44);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", line = 852)
    public static final String method1993(String arg0, String arg1, String arg2, int arg3) {
        if (arg3 != -1) {
            return null;
        } else {
            ++field4714;
            for (int var4 = arg1.indexOf(arg2); var4 != -1; var4 = arg1.indexOf(arg2, var4 + arg0.length())) {
                arg1 = arg1.substring(0, var4) + arg0 + arg1.substring(var4 - -arg2.length());
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(IZ)I", line = 882)
    public static final int method1994(int arg0, boolean arg1) {
        if (arg1) {
            method1992((byte) 120, (class187) null);
        }
        ++field4725;
        return arg0 & 255;
    }
}
