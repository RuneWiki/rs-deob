import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class627 extends class634 {

    @OriginalMember(owner = "client!tq", name = "Q", descriptor = "I")
    private int field9005 = 2048;

    @OriginalMember(owner = "client!tq", name = "P", descriptor = "I")
    private int field9004 = 1;

    @OriginalMember(owner = "client!tq", name = "N", descriptor = "I")
    private int field9002 = 2;

    @OriginalMember(owner = "client!tq", name = "L", descriptor = "[S")
    private short[] field9000 = new short[512];

    @OriginalMember(owner = "client!tq", name = "Y", descriptor = "I")
    private int field9013 = 5;

    @OriginalMember(owner = "client!tq", name = "R", descriptor = "[B")
    private byte[] field9006 = new byte[512];

    @OriginalMember(owner = "client!tq", name = "U", descriptor = "I")
    private int field9009 = 0;

    @OriginalMember(owner = "client!tq", name = "T", descriptor = "I")
    private int field9008 = 5;

    @OriginalMember(owner = "client!tq", name = "G", descriptor = "Lpia;")
    public static class94 field8996 = new class94(60, 8);

    @OriginalMember(owner = "client!tq", name = "X", descriptor = "I")
    public static int field9012 = -1;

    @OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
    public static int field8995;

    @OriginalMember(owner = "client!tq", name = "H", descriptor = "I")
    public static int field8997;

    @OriginalMember(owner = "client!tq", name = "I", descriptor = "I")
    public static int field8998;

    @OriginalMember(owner = "client!tq", name = "K", descriptor = "I")
    public static int field8999;

    @OriginalMember(owner = "client!tq", name = "M", descriptor = "I")
    public static int field9001;

    @OriginalMember(owner = "client!tq", name = "O", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!tq", name = "S", descriptor = "I")
    public static int field9007;

    @OriginalMember(owner = "client!tq", name = "V", descriptor = "I")
    public static int field9010;

    @OriginalMember(owner = "client!tq", name = "W", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)I", line = 5)
    public static final int method3592(int arg0, int arg1) {
        if (arg0 != -6943) {
            return 1;
        } else {
            ++field8998;
            return arg1 >>> 7;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "([IIIIILcaa;IIZIII[III)I", line = 17)
    public static final int method3593(int[] arg0, int arg1, int arg2, int arg3, int arg4, class302 arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, int[] arg12, int arg13, int arg14) {
        for (int var15 = 0; var15 < 128; ++var15) {
            for (int var35 = 0; ~var35 > -129; ++var35) {
                class652.field9308[var15][var35] = 0;
                class180.field2121[var15][var35] = 99999999;
            }
        }
        ++field9003;
        boolean var16;
        if (~arg14 != -2) {
            if (arg14 == 2) {
                var16 = class392.method2410(arg4, -127, arg6, arg7, arg3, arg9, arg5, arg13, arg1, arg11, arg2);
            } else {
                var16 = class574.method3326(arg2, arg9, arg7, arg5, arg6, arg3, arg14, arg11, arg4, arg1, arg13, arg10 + 1);
            }
        } else {
            var16 = class727.method4050(arg7, arg3, (byte) -50, arg9, arg4, arg2, arg11, arg5, arg1, arg13, arg6);
        }
        int var17 = arg2 + -64;
        int var18 = arg4 - 64;
        int var19 = class215.field2500;
        int var20 = class237.field2826;
        if (!var16) {
            if (!arg8) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = -var23 + arg3; ~(arg3 + var23) <= ~var24; ++var24) {
                for (int var25 = -var23 + arg1; ~(arg1 + var23) <= ~var25; ++var25) {
                    int var26 = var24 - var17;
                    int var27 = -var18 + var25;
                    if (~var26 <= -1 && ~var27 <= -1 && ~var26 > -129 && var27 < 128 && ~class180.field2121[var26][var27] > -101) {
                        int var28 = 0;
                        if (~arg3 >= ~var24) {
                            if (~var24 < ~(arg3 + -1 - -arg6)) {
                                var28 = -arg6 + 1 + -arg3 + var24;
                            }
                        } else {
                            var28 = -var24 + arg3;
                        }
                        int var29 = 0;
                        if (~var25 <= ~arg1) {
                            if (~(arg9 + -1 + arg1) > ~var25) {
                                var29 = -arg9 - (arg1 - 1) + var25;
                            }
                        } else {
                            var29 = -var25 + arg1;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && ~class180.field2121[var26][var27] > ~var22) {
                            var21 = var30;
                            var20 = var25;
                            var19 = var24;
                            var22 = class180.field2121[var26][var27];
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg2 == var19 && arg4 == var20) {
            return 0;
        } else {
            class98.field1030[arg10] = var19;
            int var31 = arg10 + 1;
            class523.field7459[arg10] = var20;
            int var32;
            int var33 = var32 = class652.field9308[-var17 + var19][-var18 + var20];
            while (arg2 != var19 || arg4 != var20) {
                if (var32 != var33) {
                    var32 = var33;
                    class98.field1030[var31] = var19;
                    class523.field7459[var31++] = var20;
                }
                if ((1 & var33) != 0) {
                    ++var20;
                } else if (~(4 & var33) != -1) {
                    --var20;
                }
                if (~(var33 & 2) == -1) {
                    if ((var33 & 8) != 0) {
                        --var19;
                    }
                } else {
                    ++var19;
                }
                var33 = class652.field9308[var19 - var17][var20 - var18];
            }
            int var34 = 0;
            while (var31-- > 0) {
                arg0[var34] = class98.field1030[var31];
                arg12[var34++] = class523.field7459[var31];
                if (~var34 <= ~arg0.length) {
                    break;
                }
            }
            return var34;
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V", line = 189)
    public class627() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(B)V", line = 192)
    public static final void method3594(byte arg0) {
        if (arg0 <= 65) {
            field9011 = 75;
        }
        if (~class546.field7837.toLowerCase().indexOf("microsoft") == 0) {
            if (class546.field7845 != null) {
                class145.field1605[222] = 58;
                class145.field1605[520] = 59;
                class145.field1605[192] = 28;
            } else {
                class145.field1605[192] = 58;
                class145.field1605[222] = 59;
            }
            class145.field1605[91] = 42;
            class145.field1605[92] = 74;
            class145.field1605[61] = 27;
            class145.field1605[44] = 71;
            class145.field1605[47] = 73;
            class145.field1605[93] = 43;
            class145.field1605[45] = 26;
            class145.field1605[46] = 72;
            class145.field1605[59] = 57;
        } else {
            class145.field1605[219] = 42;
            class145.field1605[189] = 26;
            class145.field1605[223] = 28;
            class145.field1605[186] = 57;
            class145.field1605[222] = 59;
            class145.field1605[221] = 43;
            class145.field1605[192] = 58;
            class145.field1605[188] = 71;
            class145.field1605[190] = 72;
            class145.field1605[191] = 73;
            class145.field1605[220] = 74;
            class145.field1605[187] = 27;
        }
        ++field9001;
    }

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "(B)V", line = 243)
    public static void method3595(byte arg0) {
        if (arg0 != -72) {
            field9012 = -104;
        }
        field8996 = null;
    }

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "(I)V", line = 253)
    private final void method3596(int arg0) {
        ++field8997;
        Random var2 = new Random((long) this.field9009);
        this.field9000 = new short[512];
        if (arg0 == 42) {
            if (~this.field9005 < -1) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field9000[var3] = (short) class661.method3763(this.field9005, arg0 + 30314, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILig;Z)V", line = 280)
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (arg2) {
            this.field9013 = 110;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field9008 = arg1.method1423(-104);
                                }
                            } else {
                                this.field9013 = arg1.method1423(-72);
                            }
                        } else {
                            this.field9004 = arg1.method1423(-79);
                        }
                    } else {
                        this.field9002 = arg1.method1423(-104);
                    }
                } else {
                    this.field9005 = arg1.method1476(-101);
                }
            } else {
                this.field9009 = arg1.method1423(-43);
            }
        } else {
            this.field9013 = this.field9008 = arg1.method1423(-121);
        }
        ++field8995;
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)V", line = 367)
    public final void method87(byte arg0) {
        if (arg0 < 65) {
            this.method3596(-38);
        }
        ++field9007;
        this.field9006 = class638.method3650((byte) -109, this.field9009);
        this.method3596(42);
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(BI)[I", line = 386)
    public final int[] method13(byte arg0, int arg1) {
        ++field9010;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (arg0 > -55) {
            this.field9000 = null;
        }
        if (super.field9114.field3897) {
            int var4 = class164.field1840[arg1] * this.field9008 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; class635.field9139 > var7; ++var7) {
                class634.field9115 = Integer.MAX_VALUE;
                class245.field2961 = Integer.MAX_VALUE;
                class735.field10280 = Integer.MAX_VALUE;
                class127.field1335 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class246.field2980[var7] * this.field9013);
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 - 1; ~var11 >= ~var6; ++var11) {
                    int var13 = 255 & this.field9006[(~var11 > ~this.field9008 ? var11 : var11 - this.field9008) & 255];
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = 2 * (255 & this.field9006[255 & (this.field9013 > var14 ? var14 : -this.field9013 + var14) + var13]);
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - (this.field9000[var15] - var8);
                        int var17 = -this.field9000[var27] - ((var11 << 12) - var4);
                        int var18 = this.field9004;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (var17 < 0 ? -var17 : var17) + (var16 >= 0 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 < 0 ? -var16 : var16;
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                var19 = var26 >= var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class127.field1335 > var19) {
                            class634.field9115 = class245.field2961;
                            class245.field2961 = class735.field10280;
                            class735.field10280 = class127.field1335;
                            class127.field1335 = var19;
                        } else if (~var19 > ~class735.field10280) {
                            class634.field9115 = class245.field2961;
                            class245.field2961 = class735.field10280;
                            class735.field10280 = var19;
                        } else if (~var19 > ~class245.field2961) {
                            class634.field9115 = class245.field2961;
                            class245.field2961 = var19;
                        } else if (~class634.field9115 < ~var19) {
                            class634.field9115 = var19;
                        }
                    }
                }
                int var12 = this.field9002;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class127.field1335 + class735.field10280;
                                }
                            } else {
                                var3[var7] = class634.field9115;
                            }
                        } else {
                            var3[var7] = class245.field2961;
                        }
                    } else {
                        var3[var7] = class735.field10280;
                    }
                } else {
                    var3[var7] = class127.field1335;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZII)V", line = 593)
    public static final void method3597(boolean arg0, int arg1, int arg2) {
        class404.method2477(class486.field6916.method2936(class489.field6978, 74), arg1, arg0, -123);
        ++field8999;
        if (arg2 != -31618) {
            method3597(false, 116, -8);
        }
    }
}
