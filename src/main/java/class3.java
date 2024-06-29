import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 extends class228 {

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "Z")
    private boolean field30 = true;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "I")
    private int field23 = 4096;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!qd", name = "eb", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!qd", name = "fb", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!qd", name = "gb", descriptor = "Z")
    public static boolean field34;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(BI)V")
    public static final void method13(byte arg0, int arg1) {
        ++field21;
        class194.field3405.method1809(arg1, (byte) -12);
        if (arg0 > -95) {
            method15(-113);
        }
        class202.field3516.method1809(arg1, (byte) -127);
        class120.field2118.method1809(arg1, (byte) -100);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method14(int arg0, String arg1) throws ClassNotFoundException {
        ++field32;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else {
            int var2 = -16 / ((-21 - arg0) / 34);
            if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else {
                return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)I")
    public static final int method15(int arg0) {
        ++field26;
        if (arg0 != -31903) {
            method13((byte) 48, -88);
        }
        return 6;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class3() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg4 + arg6;
        ++field33;
        int var9 = -arg6 + arg0;
        int var10 = arg7 - -arg6;
        int var11 = arg2 - arg6;
        int var12 = arg4;
        if (arg3 != 7843) {
            field20 = -108;
        }
        while (var12 < var8) {
            class175.method1174(class124.field2177[var12], arg1, -7, arg7, arg2);
            ++var12;
        }
        for (int var13 = arg0; var9 < var13; --var13) {
            class175.method1174(class124.field2177[var13], arg1, arg3 ^ -7846, arg7, arg2);
        }
        for (int var14 = var8; var9 >= var14; ++var14) {
            int[] var15 = class124.field2177[var14];
            class175.method1174(var15, arg1, -7, arg7, var10);
            class175.method1174(var15, arg5, -7, var10, var11);
            class175.method1174(var15, arg1, -7, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ltg;II)Lvd;")
    public static final class4 method17(class182 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field34 = true;
        }
        ++field27;
        return !class65.method434(arg2 + -115, arg1, arg0) ? null : class106.method729((byte) -66);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg2 == -7618) {
            if (~arg0 != -1) {
                if (~arg0 == -2) {
                    this.field30 = arg1.method1693((byte) 93) == 1;
                }
            } else {
                this.field23 = arg1.method1740((byte) 124);
            }
            ++field22;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)[[I")
    public final int[][] method19(byte arg0, int arg1) {
        if (arg0 != -27) {
            return null;
        } else {
            ++field29;
            int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
            if (super.field3948.field4791) {
                int[] var4 = this.method1500(arg1 + -1 & class250.field4309, 0, (byte) 124);
                int[] var5 = this.method1500(arg1, 0, (byte) 125);
                int[] var6 = this.method1500(arg1 + 1 & class250.field4309, 0, (byte) 119);
                int[] var7 = var3[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                for (int var10 = 0; ~var10 > ~class234.field4046; ++var10) {
                    int var11 = (var6[var10] - var4[var10]) * this.field23;
                    int var12 = (var5[class190.field3345 & var10 + 1] - var5[class190.field3345 & var10 + -1]) * this.field23;
                    int var13 = var12 >> 12;
                    int var14 = var13 * var13 >> 12;
                    int var15 = var11 >> 12;
                    int var16 = var15 * var15 >> 12;
                    int var17 = (int) (Math.sqrt((double) ((float) (var14 - (-var16 + -4096)) / 4096.0F)) * 4096.0D);
                    int var18;
                    int var19;
                    int var20;
                    if (var17 == 0) {
                        var18 = 0;
                        var19 = 0;
                        var20 = 0;
                    } else {
                        var18 = var11 / var17;
                        var19 = 16777216 / var17;
                        var20 = var12 / var17;
                    }
                    if (this.field30) {
                        var19 = (var19 >> 1) + 2048;
                        var20 = 2048 - -(var20 >> 1);
                        var18 = (var18 >> 1) + 2048;
                    }
                    var8[var10] = var20;
                    var9[var10] = var18;
                    var7[var10] = var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Loa;B)I")
    public static final int method20(class99 arg0, byte arg1) {
        ++field28;
        if (class127.field2206 != null && ~arg0.method659(85) != -1) {
            for (int var2 = 0; ~var2 > ~class127.field2206.field1524; ++var2) {
                if (class127.field2206.field1529[var2].method674(11097, class110.field1964, class101.field1724).method691(arg0, (byte) -37)) {
                    return var2;
                }
            }
            int var3 = 94 / ((arg1 - 77) / 45);
            return -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Loa;I)I")
    public static final int method21(class99 arg0, int arg1) {
        ++field25;
        return arg1 != 20987 ? -44 : 1 + arg0.method659(-62);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field31;
        int var7 = -26 % ((arg2 - 32) / 44);
        class110.method761((byte) -124, arg4);
        int var8 = 0;
        int var9 = -arg6 + arg4;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = -arg4;
        int var11 = arg4;
        int var12 = var9;
        int var13 = -var9;
        if (class178.field3101 <= arg1 && arg1 <= class137.field2414) {
            int[] var14 = class124.field2177[arg1];
            int var15 = class166.method1127(class79.field1395, -arg4 + arg5, class197.field3437, 8946);
            int var16 = class166.method1127(class79.field1395, arg4 + arg5, class197.field3437, 8946);
            int var17 = class166.method1127(class79.field1395, -var9 + arg5, class197.field3437, 8946);
            int var18 = class166.method1127(class79.field1395, arg5 + var9, class197.field3437, 8946);
            class175.method1174(var14, arg0, -7, var15, var17);
            class175.method1174(var14, arg3, -7, var17, var18);
            class175.method1174(var14, arg0, -7, var18, var16);
        }
        int var19 = -1;
        int var20 = -1;
        while (~var11 < ~var8) {
            var19 += 2;
            var13 += var19;
            var20 += 2;
            if (var13 >= 0 && ~var12 <= -2) {
                --var12;
                var13 -= var12 << 1;
                class75.field1318[var12] = var8;
            }
            ++var8;
            var10 += var20;
            if (var10 >= 0) {
                --var11;
                var10 -= var11 << 1;
                int var21 = arg1 + var11;
                int var22 = arg1 - var11;
                if (~var21 <= ~class178.field3101 && ~class137.field2414 <= ~var22) {
                    if (var11 >= var9) {
                        int var23 = class166.method1127(class79.field1395, arg5 + var8, class197.field3437, 8946);
                        int var24 = class166.method1127(class79.field1395, -var8 + arg5, class197.field3437, 8946);
                        if (~var21 >= ~class137.field2414) {
                            class175.method1174(class124.field2177[var21], arg0, -7, var24, var23);
                        }
                        if (~var22 <= ~class178.field3101) {
                            class175.method1174(class124.field2177[var22], arg0, -7, var24, var23);
                        }
                    } else {
                        int var25 = class75.field1318[var11];
                        int var26 = class166.method1127(class79.field1395, arg5 + var8, class197.field3437, 8946);
                        int var27 = class166.method1127(class79.field1395, -var8 + arg5, class197.field3437, 8946);
                        int var28 = class166.method1127(class79.field1395, arg5 - -var25, class197.field3437, 8946);
                        int var29 = class166.method1127(class79.field1395, -var25 + arg5, class197.field3437, 8946);
                        if (class137.field2414 >= var21) {
                            int[] var30 = class124.field2177[var21];
                            class175.method1174(var30, arg0, -7, var27, var29);
                            class175.method1174(var30, arg3, -7, var29, var28);
                            class175.method1174(var30, arg0, -7, var28, var26);
                        }
                        if (var22 >= class178.field3101) {
                            int[] var31 = class124.field2177[var22];
                            class175.method1174(var31, arg0, -7, var27, var29);
                            class175.method1174(var31, arg3, -7, var29, var28);
                            class175.method1174(var31, arg0, -7, var28, var26);
                        }
                    }
                }
            }
            int var32 = -var8 + arg1;
            int var33 = arg1 - -var8;
            if (class178.field3101 <= var33 && class137.field2414 >= var32) {
                int var34 = arg5 + var11;
                int var35 = arg5 - var11;
                if (var34 >= class197.field3437 && var35 <= class79.field1395) {
                    int var36 = class166.method1127(class79.field1395, var34, class197.field3437, 8946);
                    int var37 = class166.method1127(class79.field1395, var35, class197.field3437, 8946);
                    if (var8 < var9) {
                        int var38 = ~var8 >= ~var12 ? var12 : class75.field1318[var8];
                        int var39 = class166.method1127(class79.field1395, arg5 - -var38, class197.field3437, 8946);
                        int var40 = class166.method1127(class79.field1395, -var38 + arg5, class197.field3437, 8946);
                        if (~class137.field2414 <= ~var33) {
                            int[] var41 = class124.field2177[var33];
                            class175.method1174(var41, arg0, -7, var37, var40);
                            class175.method1174(var41, arg3, -7, var40, var39);
                            class175.method1174(var41, arg0, -7, var39, var36);
                        }
                        if (~var32 <= ~class178.field3101) {
                            int[] var42 = class124.field2177[var32];
                            class175.method1174(var42, arg0, -7, var37, var40);
                            class175.method1174(var42, arg3, -7, var40, var39);
                            class175.method1174(var42, arg0, -7, var39, var36);
                        }
                    } else {
                        if (~class137.field2414 <= ~var33) {
                            class175.method1174(class124.field2177[var33], arg0, -7, var37, var36);
                        }
                        if (class178.field3101 <= var32) {
                            class175.method1174(class124.field2177[var32], arg0, -7, var37, var36);
                        }
                    }
                }
            }
        }
    }
}
