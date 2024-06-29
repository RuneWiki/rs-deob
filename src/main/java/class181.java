import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class181 extends class82 {

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    private int field3133 = 4;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    private int field3140 = 1638;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "[B")
    private byte[] field3136 = new byte[512];

    @OriginalMember(owner = "client!r", name = "eb", descriptor = "Z")
    private boolean field3148 = true;

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
    private int field3150 = 4;

    @OriginalMember(owner = "client!r", name = "jb", descriptor = "I")
    private int field3153 = 4;

    @OriginalMember(owner = "client!r", name = "nb", descriptor = "I")
    private int field3157 = 0;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    public static int field3137 = 0;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "Ldj;")
    public static class44 field3141 = class89.method650(255, "<col=00ff00>");

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "Ldj;")
    private static class44 field3145 = class89.method650(255, "glow1:");

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "Ldj;")
    public static class44 field3143 = class89.method650(255, "Abbrechen");

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "Ldj;")
    private static class44 field3146 = class89.method650(255, "Prepared sound engine");

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "Ldj;")
    public static class44 field3134 = field3145;

    @OriginalMember(owner = "client!r", name = "ob", descriptor = "I")
    public static int field3158 = 0;

    @OriginalMember(owner = "client!r", name = "db", descriptor = "Ldj;")
    public static class44 field3147 = field3145;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "Ldj;")
    public static class44 field3139 = class89.method650(255, "logo");

    @OriginalMember(owner = "client!r", name = "hb", descriptor = "Ldj;")
    public static class44 field3151 = field3146;

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!r", name = "lb", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!r", name = "mb", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!r", name = "pb", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!r", name = "qb", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!r", name = "rb", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!r", name = "kb", descriptor = "Laf;")
    public static class7 field3154;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "Z")
    public static boolean field3135;

    @OriginalMember(owner = "client!r", name = "ib", descriptor = "[I")
    public static int[] field3152;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "[S")
    private short[] field3138;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "[S")
    private short[] field3142;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        ++field3144;
        this.field3136 = class115.method805(this.field3157, (byte) -113);
        this.method1142(true);
        if (arg0 < 95) {
            this.method78((byte) 11);
        }
        for (int var2 = this.field3133 - 1; ~var2 <= -2; --var2) {
            short var3 = this.field3142[var2];
            if (~var3 < -9) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field3133;
        }
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public static void method1139(int arg0) {
        if (arg0 == -9) {
            field3147 = null;
            field3139 = null;
            field3151 = null;
            field3152 = null;
            field3143 = null;
            field3134 = null;
            field3154 = null;
            field3145 = null;
            field3146 = null;
            field3141 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)I")
    private final int method1140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3156;
        int var8 = arg2 - 4096;
        int var9 = arg0 >> 12;
        if (arg5 <= 50) {
            return -121;
        } else {
            int var10 = var9 - -1;
            int var11 = var9 & 255;
            int var12 = 3 & this.field3136[arg3 + var11];
            if (var10 >= arg4) {
                var10 = 0;
            }
            int var13 = var10 & 255;
            int var14 = arg0 & 4095;
            int var15 = var14 + -4096;
            int var16 = class90.field1700[var14];
            int var17;
            if (var12 > 1) {
                var17 = var12 != 2 ? -arg2 + -var14 : -arg2 + var14;
            } else {
                var17 = var12 != 0 ? -var14 + arg2 : arg2 + var14;
            }
            int var18 = 3 & this.field3136[arg3 + var13];
            int var19;
            if (~var18 >= -2) {
                var19 = var18 == 0 ? arg2 + var15 : -var15 + arg2;
            } else {
                var19 = var18 == 2 ? var15 - arg2 : -arg2 + -var15;
            }
            int var20 = ((var19 - var17) * var16 >> 12) + var17;
            int var21 = this.field3136[arg1 + var11] & 3;
            int var22;
            if (~var21 >= -2) {
                var22 = var21 != 0 ? -var14 + var8 : var14 - -var8;
            } else {
                var22 = ~var21 != -3 ? -var8 + -var14 : -var8 + var14;
            }
            int var23 = this.field3136[arg1 + var13] & 3;
            int var24;
            if (var23 > 1) {
                var24 = var23 == 2 ? -var8 + var15 : -var8 + -var15;
            } else {
                var24 = var23 == 0 ? var8 + var15 : var8 - var15;
            }
            int var25 = var22 - -((var24 - var22) * var16 >> 12);
            return ((-var20 + var25) * arg6 >> 12) + var20;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        ++field3159;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field3150 = arg0.method506(255);
                                }
                            } else {
                                this.field3153 = arg0.method506(255);
                            }
                        } else {
                            this.field3157 = arg0.method506(arg2 ^ 187);
                        }
                    } else {
                        this.field3153 = this.field3150 = arg0.method506(arg2 ^ 187);
                    }
                } else {
                    this.field3140 = arg0.method514((byte) 106);
                    if (this.field3140 < 0) {
                        this.field3142 = new short[this.field3133];
                        for (int var5 = 0; ~var5 > ~this.field3133; ++var5) {
                            this.field3142[var5] = (short) arg0.method514((byte) 111);
                        }
                    }
                }
            } else {
                this.field3133 = arg0.method506(255);
            }
        } else {
            this.field3148 = arg0.method506(arg2 + 187) == 1;
        }
        if (arg2 != 68) {
            this.field3148 = true;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class181() {
        super(0, true);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(JI)Ldj;")
    public static final class44 method1141(long arg0, int arg1) {
        if (arg1 != -23766) {
            field3141 = null;
        }
        ++field3160;
        return class226.method1485(false, arg0, 10, arg1 ^ 20759);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    private final void method1142(boolean arg0) {
        ++field3155;
        if (!arg0) {
            this.field3138 = null;
        }
        if (~this.field3140 < -1) {
            this.field3142 = new short[this.field3133];
            this.field3138 = new short[this.field3133];
            for (int var2 = 0; ~this.field3133 < ~var2; ++var2) {
                this.field3142[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field3140 / 4096.0F), (double) var2)));
                this.field3138[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field3142 != null && ~this.field3142.length == ~this.field3133) {
            this.field3138 = new short[this.field3133];
            for (int var3 = 0; ~this.field3133 < ~var3; ++var3) {
                this.field3138[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)I")
    public static final int method1143(byte arg0, int arg1) {
        ++field3149;
        if ((arg1 < 97 || ~arg1 < -123) && (arg1 < 224 || arg1 > 254 || arg1 == 247)) {
            if (~arg1 == -256) {
                return 159;
            } else {
                if (arg0 < 102) {
                    method1139(-13);
                }
                return ~arg1 == -157 ? 140 : arg1;
            }
        } else {
            return arg1 + -32;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field3161;
        if (arg0 != 25238) {
            this.field3148 = false;
        }
        int[] var3 = super.field1595.method603(true, arg1);
        if (super.field1595.field1538) {
            int var4 = class212.field3809[arg1] * this.field3150;
            if (~this.field3133 == -2) {
                short var5 = this.field3142[0];
                int var6 = this.field3138[0] << 12;
                int var7 = this.field3153 * var6 >> 12;
                int var8 = this.field3150 * var6 >> 12;
                int var9 = var4 * var6 >> 12;
                int var10 = var9 >> 12;
                int var11 = var9 & 4095;
                int var12 = 255 & this.field3136[var10 & 255];
                int var13 = class90.field1700[var11];
                int var14 = var10 - -1;
                if (var8 <= var14) {
                    var14 = 0;
                }
                int var15 = 255 & this.field3136[var14 & 255];
                if (!this.field3148) {
                    for (int var16 = 0; ~class129.field2287 < ~var16; ++var16) {
                        int var17 = class49.field912[var16] * this.field3153;
                        int var18 = this.method1140(var6 * var17 >> 12, var15, var11, var12, var7, 79, var13);
                        var3[var16] = var5 * var18 >> 12;
                    }
                } else {
                    for (int var19 = 0; ~var19 > ~class129.field2287; ++var19) {
                        int var20 = class49.field912[var19] * this.field3153;
                        int var21 = this.method1140(var6 * var20 >> 12, var15, var11, var12, var7, arg0 + -25177, var13);
                        int var22 = var5 * var21 >> 12;
                        var3[var19] = (var22 >> 1) + 2048;
                    }
                }
            } else {
                short var23 = this.field3142[0];
                if (var23 > 8 || ~var23 > 7) {
                    int var24 = this.field3138[0] << 12;
                    int var25 = var4 * var24 >> 12;
                    int var26 = this.field3150 * var24 >> 12;
                    int var27 = var25 >> 12;
                    int var28 = var25 & 4095;
                    int var29 = class90.field1700[var28];
                    int var30 = this.field3136[var27 & 255] & 255;
                    int var31 = this.field3153 * var24 >> 12;
                    int var32 = var27 + 1;
                    if (var26 <= var32) {
                        var32 = 0;
                    }
                    int var33 = 255 & this.field3136[255 & var32];
                    for (int var34 = 0; class129.field2287 > var34; ++var34) {
                        int var54 = class49.field912[var34] * this.field3153;
                        int var55 = this.method1140(var24 * var54 >> 12, var33, var28, var30, var31, 65, var29);
                        var3[var34] = var23 * var55 >> 12;
                    }
                }
                for (int var35 = 1; var35 < this.field3133; ++var35) {
                    short var36 = this.field3142[var35];
                    if (var36 > 8 || ~var36 > 7) {
                        int var37 = this.field3138[var35] << 12;
                        int var38 = var4 * var37 >> 12;
                        int var39 = this.field3153 * var37 >> 12;
                        int var40 = var38 >> 12;
                        int var41 = 255 & this.field3136[255 & var40];
                        int var42 = this.field3150 * var37 >> 12;
                        int var43 = var40 + 1;
                        int var44 = var38 & 4095;
                        if (var42 <= var43) {
                            var43 = 0;
                        }
                        int var45 = class90.field1700[var44];
                        int var46 = this.field3136[var43 & 255] & 255;
                        if (this.field3148 && ~(this.field3133 + -1) == ~var35) {
                            for (int var47 = 0; ~class129.field2287 < ~var47; ++var47) {
                                int var48 = class49.field912[var47] * this.field3153;
                                int var49 = this.method1140(var37 * var48 >> 12, var46, var44, var41, var39, 110, var45);
                                int var50 = (var36 * var49 >> 12) + var3[var47];
                                var3[var47] = (var50 >> 1) + 2048;
                            }
                        } else {
                            for (int var51 = 0; class129.field2287 > var51; ++var51) {
                                int var52 = class49.field912[var51] * this.field3153;
                                int var53 = this.method1140(var37 * var52 >> 12, var46, var44, var41, var39, 52, var45);
                                var3[var51] += var36 * var53 >> 12;
                            }
                        }
                    }
                }
            }
        }
        return var3;
    }
}
