import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class270 extends class573 {

    @OriginalMember(owner = "client!pfa", name = "O", descriptor = "I")
    private int field4014 = 1024;

    @OriginalMember(owner = "client!pfa", name = "Q", descriptor = "I")
    private int field4016 = 0;

    @OriginalMember(owner = "client!pfa", name = "T", descriptor = "I")
    private int field4019 = 2048;

    @OriginalMember(owner = "client!pfa", name = "M", descriptor = "I")
    private int field4012 = 1024;

    @OriginalMember(owner = "client!pfa", name = "S", descriptor = "I")
    private int field4018 = 819;

    @OriginalMember(owner = "client!pfa", name = "R", descriptor = "I")
    private int field4017 = 1024;

    @OriginalMember(owner = "client!pfa", name = "W", descriptor = "I")
    private int field4022 = 1024;

    @OriginalMember(owner = "client!pfa", name = "X", descriptor = "I")
    private int field4023 = 0;

    @OriginalMember(owner = "client!pfa", name = "Y", descriptor = "I")
    private int field4024 = 409;

    @OriginalMember(owner = "client!pfa", name = "V", descriptor = "Ljava/lang/String;")
    public static String field4021 = null;

    @OriginalMember(owner = "client!pfa", name = "I", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!pfa", name = "J", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!pfa", name = "K", descriptor = "I")
    private int field4010;

    @OriginalMember(owner = "client!pfa", name = "L", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!pfa", name = "N", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!pfa", name = "P", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!pfa", name = "U", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        } else {
            ++field4020;
            int[] var3 = super.field8321.method3164(arg0, -119);
            if (super.field8321.field7825) {
                int[][] var4 = super.field8321.method3163(-124);
                int var5 = 0;
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = true;
                int var12 = 0;
                int var13 = 0;
                int var14 = class540.field7555 * this.field4012 >> 12;
                int var15 = class540.field7555 * this.field4019 >> 12;
                int var16 = class419.field6037 * this.field4024 >> 12;
                int var17 = class419.field6037 * this.field4018 >> 12;
                if (var17 <= 1) {
                    return var4[arg0];
                } else {
                    this.field4010 = class540.field7555 / 8 * this.field4022 >> 12;
                    int var18 = class540.field7555 / var14 + 1;
                    int[][] var19 = new int[var18][3];
                    int[][] var20 = new int[var18][3];
                    Random var21 = new Random((long) this.field4016);
                    while (true) {
                        while (true) {
                            int var22 = var14 - -class468.method2795(var21, var15 - var14, (byte) -88);
                            int var23 = var16 - -class468.method2795(var21, -var16 + var17, (byte) -102);
                            int var24 = var8 + var22;
                            if (class540.field7555 < var24) {
                                var24 = class540.field7555;
                                var22 = -var8 + class540.field7555;
                            }
                            int var25;
                            if (var11) {
                                var25 = 0;
                            } else {
                                int var26 = var9;
                                int[] var27 = var20[var9];
                                int var28 = 0;
                                int var29 = var24 - -var5;
                                if (var29 < 0) {
                                    var29 += class540.field7555;
                                }
                                if (~class540.field7555 > ~var29) {
                                    var29 -= class540.field7555;
                                }
                                var25 = var27[2];
                                while (true) {
                                    int[] var30 = var20[var26];
                                    if (~var29 <= ~var30[0] && var29 <= var30[1]) {
                                        if (~var9 != ~var26) {
                                            int var31 = var8 - -var5;
                                            if (~var31 > -1) {
                                                var31 += class540.field7555;
                                            }
                                            if (~class540.field7555 > ~var31) {
                                                var31 -= class540.field7555;
                                            }
                                            for (int var32 = 1; var32 <= var28; ++var32) {
                                                int[] var40 = var20[(var9 - -var32) % var12];
                                                var25 = Math.max(var25, var40[2]);
                                            }
                                            for (int var33 = 0; ~var28 <= ~var33; ++var33) {
                                                int[] var34 = var20[(var9 + var33) % var12];
                                                int var35 = var34[2];
                                                if (var25 != var35) {
                                                    int var36 = var34[0];
                                                    int var37 = var34[1];
                                                    int var38;
                                                    int var39;
                                                    if (var29 > var31) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = Math.min(var29, var37);
                                                    } else if (var36 == 0) {
                                                        var38 = 0;
                                                        var39 = Math.min(var29, var37);
                                                    } else {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class540.field7555;
                                                    }
                                                    this.method1756(-var35 + var25, var4, -var38 + var39, arg1 ^ -16506, var35, var7 + var38, var21);
                                                }
                                            }
                                        }
                                        var9 = var26;
                                        break;
                                    }
                                    int var10000 = ~var12;
                                    ++var26;
                                    if (var10000 >= ~var26) {
                                        var26 = 0;
                                    }
                                    ++var28;
                                }
                            }
                            if (class419.field6037 < var23 + var25) {
                                var23 = class419.field6037 - var25;
                            } else {
                                var10 = false;
                            }
                            if (class540.field7555 == var24) {
                                this.method1756(var23, var4, var22, -16505, var25, var6 + var8, var21);
                                if (var10) {
                                    return var3;
                                }
                                var10 = true;
                                int[] var41 = var19[var13++];
                                var41[0] = var8;
                                var41[1] = var24;
                                var41[2] = var25 - -var23;
                                int[][] var42 = var20;
                                var20 = var19;
                                var19 = var42;
                                var12 = var13;
                                var13 = 0;
                                var7 = var6;
                                var6 = class468.method2795(var21, class540.field7555, (byte) -91);
                                var5 = var6 - var7;
                                var8 = 0;
                                int var43 = var5;
                                if (~var5 > -1) {
                                    var43 = class540.field7555 + var5;
                                }
                                var9 = 0;
                                if (class540.field7555 < var43) {
                                    var43 -= class540.field7555;
                                }
                                var11 = false;
                                while (true) {
                                    int[] var44 = var20[var9];
                                    if (var43 >= var44[0] && ~var43 >= ~var44[1]) {
                                        break;
                                    }
                                    ++var9;
                                    if (~var9 <= ~var12) {
                                        var9 = 0;
                                    }
                                }
                            } else {
                                int[] var45 = var19[var13++];
                                var45[1] = var24;
                                var45[2] = var23 + var25;
                                var45[0] = var8;
                                this.method1756(var23, var4, var22, -16505, var25, var6 + var8, var21);
                                var8 = var24;
                            }
                        }
                    }
                }
            } else {
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "(B)V")
    public static final void method1753(byte arg0) {
        ++field4015;
        if (arg0 != 20) {
            method1757(40);
        }
        for (class701 var1 = (class701) class534.field7491.method3314(-121); var1 != null; var1 = (class701) class534.field7491.method3314(-121)) {
            class661.method3762(var1, true);
        }
        int var2;
        int var3;
        if (class527.field7429.method2824(-1, class90.field1654)) {
            var2 = 0;
            var3 = 3;
        } else {
            var3 = class432.field6242;
            var2 = class432.field6242;
        }
        client.method1818();
        for (int var4 = var2; var4 <= var3; ++var4) {
            client.method1804();
            client.method1803(var4);
            client.method1814(var4);
        }
        client.method1824();
        client.method1821();
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)V")
    public final void method617(int arg0) {
        if (arg0 != 4095) {
            this.field4014 = -51;
        }
        ++field4009;
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "()V")
    public class270() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        ++field4008;
        if (arg2 != 3) {
            method1754(99);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (~arg1 != -8) {
                                        if (arg1 == 8) {
                                            this.field4017 = arg0.method723((byte) -25);
                                        }
                                    } else {
                                        this.field4014 = arg0.method723((byte) -25);
                                    }
                                } else {
                                    this.field4023 = arg0.method732(-559537960);
                                }
                            } else {
                                this.field4022 = arg0.method723((byte) -25);
                            }
                        } else {
                            this.field4018 = arg0.method723((byte) -25);
                        }
                    } else {
                        this.field4024 = arg0.method723((byte) -25);
                    }
                } else {
                    this.field4019 = arg0.method723((byte) -25);
                }
            } else {
                this.field4012 = arg0.method723((byte) -25);
            }
        } else {
            this.field4016 = arg0.method732(-559537960);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "h", descriptor = "(I)V")
    public static void method1754(int arg0) {
        field4021 = null;
        if (arg0 != -17822) {
            method1753((byte) -14);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "(II)V")
    public static final void method1755(int arg0, int arg1) {
        class54 var2 = null;
        for (int var3 = arg0; var3 < arg1; ++var3) {
            class37 var4 = class185.field2987[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class107.field1852; ++var5) {
                    for (int var6 = 0; var6 < class520.field7369; ++var6) {
                        var2 = var4.method550(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class30.field940;
                            int var8 = var5 << class30.field940;
                            for (int var9 = var3 - 1; var9 >= 0; --var9) {
                                class37 var10 = class185.field2987[var9];
                                if (var10 != null) {
                                    int var11 = var4.method551(var6, var5, (byte) -121) - var10.method551(var6, var5, (byte) -109);
                                    int var12 = var4.method551(var6 + 1, var5, (byte) -109) - var10.method551(var6 + 1, var5, (byte) -106);
                                    int var13 = var4.method551(var6 + 1, var5 + 1, (byte) -103) - var10.method551(var6 + 1, var5 + 1, (byte) -93);
                                    int var14 = var4.method551(var6, var5 + 1, (byte) -109) - var10.method551(var6, var5 + 1, (byte) -96);
                                    var10.method537(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I[[IIIIILjava/util/Random;)V")
    private final void method1756(int arg0, int[][] arg1, int arg2, int arg3, int arg4, int arg5, Random arg6) {
        ++field4011;
        int var8 = this.field4017 <= 0 ? 4096 : 4096 - class468.method2795(arg6, this.field4017, (byte) -96);
        if (arg3 == -16505) {
            int var9 = this.field4014 * this.field4010 >> 12;
            int var10 = this.field4010 + -(var9 <= 0 ? 0 : class468.method2795(arg6, var9, (byte) -87));
            if (~arg5 <= ~class540.field7555) {
                arg5 -= class540.field7555;
            }
            if (~var10 >= -1) {
                if (~(arg2 + arg5) < ~class540.field7555) {
                    int var11 = -arg5 + class540.field7555;
                    for (int var12 = 0; var12 < arg0; ++var12) {
                        int[] var13 = arg1[arg4 + var12];
                        class692.method3878(var13, arg5, var11, var8);
                        class692.method3878(var13, 0, -var11 + arg2, var8);
                    }
                } else {
                    for (int var14 = 0; ~var14 > ~arg0; ++var14) {
                        class692.method3878(arg1[arg4 + var14], arg5, arg2, var8);
                    }
                }
            } else if (arg0 > 0 && ~arg2 < -1) {
                int var15 = arg2 / 2;
                int var16 = arg0 / 2;
                int var17 = var10 > var15 ? var15 : var10;
                int var18 = ~var10 >= ~var16 ? var10 : var16;
                int var19 = arg5 + var17;
                int var20 = arg2 - var17 * 2;
                for (int var21 = 0; arg0 > var21; ++var21) {
                    int[] var22 = arg1[arg4 + var21];
                    if (var21 < var18) {
                        int var23 = var8 * var21 / var18;
                        if (~this.field4023 == -1) {
                            for (int var24 = 0; var17 > var24; ++var24) {
                                int var25 = var8 * var24 / var17;
                                var22[class481.method2919(class591.field8492, arg5 + var24)] = var22[class481.method2919(class591.field8492, -var24 + -1 + arg2 + arg5)] = var23 * var25 >> 12;
                            }
                        } else {
                            for (int var26 = 0; ~var17 < ~var26; ++var26) {
                                int var28 = var8 * var26 / var17;
                                var22[class481.method2919(class591.field8492, arg5 + var26)] = var22[class481.method2919(-var26 + -1 + arg2 + arg5, class591.field8492)] = var23 <= var28 ? var23 : var28;
                            }
                        }
                        if (var19 + var20 > class540.field7555) {
                            int var27 = -var19 + class540.field7555;
                            class692.method3878(var22, var19, var27, var23);
                            class692.method3878(var22, 0, var20 - var27, var23);
                        } else {
                            class692.method3878(var22, var19, var20, var23);
                        }
                    } else {
                        int var29 = arg0 - var21 - 1;
                        if (var29 < var18) {
                            int var30 = var8 * var29 / var18;
                            if (~this.field4023 != -1) {
                                for (int var31 = 0; ~var17 < ~var31; ++var31) {
                                    int var32 = var8 * var31 / var17;
                                    var22[class481.method2919(arg5 - -var31, class591.field8492)] = var22[class481.method2919(class591.field8492, arg5 - (var31 + 1 + -arg2))] = var32 >= var30 ? var30 : var32;
                                }
                            } else {
                                for (int var33 = 0; var17 > var33; ++var33) {
                                    int var35 = var8 * var33 / var17;
                                    var22[class481.method2919(arg5 - -var33, class591.field8492)] = var22[class481.method2919(class591.field8492, arg5 - -arg2 - var33 - 1)] = var30 * var35 >> 12;
                                }
                            }
                            if (class540.field7555 >= var19 + var20) {
                                class692.method3878(var22, var19, var20, var30);
                            } else {
                                int var34 = class540.field7555 - var19;
                                class692.method3878(var22, var19, var34, var30);
                                class692.method3878(var22, 0, -var34 + var20, var30);
                            }
                        } else {
                            for (int var36 = 0; ~var36 > ~var17; ++var36) {
                                var22[class481.method2919(class591.field8492, arg5 + var36)] = var22[class481.method2919(arg5 - (-arg2 - -var36) + -1, class591.field8492)] = var8 * var36 / var17;
                            }
                            if (~class540.field7555 > ~(var19 + var20)) {
                                int var37 = -var19 + class540.field7555;
                                class692.method3878(var22, var19, var37, var8);
                                class692.method3878(var22, 0, -var37 + var20, var8);
                            } else {
                                class692.method3878(var22, var19, var20, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pfa", name = "i", descriptor = "(I)Z")
    public static final boolean method1757(int arg0) {
        ++field4013;
        try {
            class124 var1 = new class124();
            byte[] var2 = var1.method1069(arg0 ^ arg0, class133.field2388);
            class199.method1425(var2, arg0 + -6586);
            return true;
        } catch (Exception var3) {
            return false;
        }
    }
}
