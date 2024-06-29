import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class282 extends class405 {

    @OriginalMember(owner = "client!kd", name = "gd", descriptor = "I")
    public int field3987 = -1;

    @OriginalMember(owner = "client!kd", name = "qd", descriptor = "I")
    public int field3997 = 1;

    @OriginalMember(owner = "client!kd", name = "yd", descriptor = "I")
    public int field4005 = -1;

    @OriginalMember(owner = "client!kd", name = "ud", descriptor = "I")
    public int field4001 = 1;

    @OriginalMember(owner = "client!kd", name = "fd", descriptor = "Z")
    public static boolean field3986 = false;

    @OriginalMember(owner = "client!kd", name = "wd", descriptor = "[I")
    public static int[] field4003 = new int[8];

    @OriginalMember(owner = "client!kd", name = "xd", descriptor = "Z")
    public static boolean field4004 = false;

    @OriginalMember(owner = "client!kd", name = "Ad", descriptor = "[Lnj;")
    public static class247[] field4007 = new class247[50];

    @OriginalMember(owner = "client!kd", name = "bd", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!kd", name = "cd", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!kd", name = "dd", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!kd", name = "ed", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!kd", name = "hd", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!kd", name = "id", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!kd", name = "jd", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!kd", name = "kd", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!kd", name = "ld", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!kd", name = "md", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!kd", name = "nd", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!kd", name = "rd", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!kd", name = "sd", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!kd", name = "td", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!kd", name = "vd", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!kd", name = "zd", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!kd", name = "Cd", descriptor = "I")
    public int field4009;

    @OriginalMember(owner = "client!kd", name = "Dd", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!kd", name = "Ed", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!kd", name = "Bd", descriptor = "Low;")
    public class348 field4008;

    @OriginalMember(owner = "client!kd", name = "pd", descriptor = "Lbc;")
    public class367 field3996;

    @OriginalMember(owner = "client!kd", name = "od", descriptor = "Ljava/lang/String;")
    public String field3995;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)I", line = 3)
    public final int method1797(int arg0) {
        ++field3982;
        if (arg0 != 0) {
            this.method1808(91);
        }
        if (this.field4008.field5076 != null) {
            class348 var2 = this.field4008.method2207(114, class83.field1160);
            if (var2 != null && var2.field5071 != -1) {
                return var2.field5071;
            }
        }
        return this.field4008.field5071;
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(B)I", line = 25)
    public final int method1798(byte arg0) {
        int var2 = -93 / ((arg0 - 73) / 47);
        ++field3999;
        return this.field4008 == null ? 0 : this.field4008.field5062;
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)I", line = 38)
    public final int method1799(int arg0) {
        ++field3988;
        if (this.field4008.field5076 != null) {
            class348 var2 = this.field4008.method2207(31, class83.field1160);
            if (var2 != null && ~var2.field5024 != 0) {
                return var2.field5024;
            }
        }
        return arg0 != 314462286 ? -82 : this.field4008.field5024;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBLha;I)Z", line = 59)
    public final boolean method312(int arg0, byte arg1, class60 arg2, int arg3) {
        ++field3989;
        if (this.field4008 != null && this.method1803(131072, -46, arg2)) {
            class738 var5 = arg2.method442();
            int var6 = super.field6110.method752((byte) 61);
            var5.method764(var6);
            var5.method758(super.field8423, super.field8421, super.field8428);
            boolean var7 = false;
            for (int var8 = 0; ~super.field6136.length < ~var8; ++var8) {
                if (super.field6136[var8] != null) {
                    boolean var10000;
                    label47: {
                        if (~this.field4008.field5062 >= -1) {
                            label45: {
                                if (~this.field4008.field5046 == 0) {
                                    if (this.field4008.field5053 == 1) {
                                        break label45;
                                    }
                                    var10000 = false;
                                } else {
                                    if (this.field4008.field5046 == 1) {
                                        break label45;
                                    }
                                    var10000 = false;
                                }
                                if (!var10000) {
                                    var10000 = false;
                                    break label47;
                                }
                            }
                        }
                        var10000 = true;
                    }
                    boolean var9 = var10000;
                    boolean var10;
                    if (!class418.field6258) {
                        var10 = super.field6136[var8].method277(arg0, arg3, var5, var9, this.field4008.field5062);
                    } else {
                        var10 = super.field6136[var8].method283(arg0, arg3, var5, var9, this.field4008.field5062, class188.field2859);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            if (arg1 > -44) {
                field4004 = false;
            }
            super.field6136[0] = super.field6136[1] = super.field6136[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)V", line = 115)
    public static void method1800(int arg0) {
        field4007 = null;
        if (arg0 != 7) {
            method1800(65);
        }
        field4003 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)Z", line = 127)
    private final boolean method1801(byte arg0) {
        ++field3991;
        if (arg0 != 41) {
            this.method738((byte) -14);
        }
        return this.field4008.field5058;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZIII)V", line = 138)
    public final void method1802(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++field3993;
        super.field8429 = super.field8417 = (byte) arg1;
        if (class286.method1827(arg4, arg3, (byte) 114)) {
            ++super.field8417;
        }
        if (~super.field6094 != 0 && class742.field10404.method2663(0, super.field6094).field4111 == 1) {
            super.field6039 = null;
            super.field6094 = -1;
        }
        if (super.field6061 != -1) {
            class321 var7 = class499.field7100.method172(super.field6061, 3128);
            if (var7.field4543 && ~var7.field4528 != 0 && ~class742.field10404.method2663(0, var7.field4528).field4111 == -2) {
                super.field6061 = -1;
            }
        }
        if (~super.field6107 != 0) {
            class321 var8 = class499.field7100.method172(super.field6107, 3128);
            if (var8.field4543 && ~var8.field4528 != 0 && ~class742.field10404.method2663(0, var8.field4528).field4111 == -2) {
                super.field6107 = -1;
            }
        }
        if (!arg2) {
            int var9 = -super.field6133[0] + arg4;
            int var10 = -super.field6139[0] + arg3;
            if (var9 >= -8 && var9 <= 8 && var10 >= -8 && ~var10 >= -9) {
                if (super.field6130 < 9) {
                    ++super.field6130;
                }
                for (int var11 = super.field6130; ~var11 < -1; --var11) {
                    super.field6133[var11] = super.field6133[var11 + -1];
                    super.field6139[var11] = super.field6139[var11 + -1];
                    super.field6131[var11] = super.field6131[var11 + -1];
                }
                super.field6133[0] = arg4;
                super.field6139[0] = arg3;
                super.field6131[0] = 1;
                return;
            }
        }
        super.field6134 = 0;
        super.field6130 = 0;
        super.field6133[0] = arg4;
        super.field6132 = 0;
        super.field6139[0] = arg3;
        super.field8423 = (super.field6133[0] << 9) + (arg5 << 8);
        int var12 = 15 / ((arg0 - 31) / 60);
        super.field8428 = (super.field6139[0] << 9) + (arg5 << 8);
        if (super.field6138 != null) {
            super.field6138.method3602();
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lha;Z)V", line = 223)
    public final void method314(class60 arg0, boolean arg1) {
        ++field3985;
        if (this.field4008 != null) {
            if (super.field6137 || this.method1803(0, -69, arg0)) {
                class738 var3 = arg0.method442();
                var3.method764(super.field6110.method752((byte) 126));
                var3.method758(super.field8423, super.field8421 + -20, super.field8428);
                this.method2582((byte) -100, super.field6136, arg0, var3, super.field6137);
                if (!arg1) {
                    super.field6136[0] = super.field6136[1] = super.field6136[2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILvs;ZILha;II)V", line = 260)
    public final void method737(int arg0, class593 arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        if (arg0 != 8616) {
            field3986 = false;
        }
        ++field3990;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILha;)Z", line = 271)
    private final boolean method1803(int arg0, int arg1, class60 arg2) {
        ++field4002;
        int var4 = arg0;
        class264 var5 = this.method2577(-1);
        class288 var6 = super.field6094 != -1 && super.field6056 == 0 ? class742.field10404.method2663(0, super.field6094) : null;
        class288 var7 = super.field6123 == -1 || super.field6032 && var6 != null ? null : class742.field10404.method2663(0, super.field6123);
        int var8 = var5.field3777;
        int var9 = var5.field3767;
        if (~var8 != -1 || var9 != 0 || ~var5.field3728 != -1 || ~var5.field3769 != -1) {
            arg0 |= 7;
        }
        boolean var10 = super.field6062 != 0 && class357.field5189 >= super.field6079 && ~super.field6071 < ~class357.field5189;
        if (var10) {
            arg0 |= 524288;
        }
        int var11 = super.field6110.method752((byte) 13);
        class473 var12 = super.field6136[0] = this.field4008.method2201(var11, arg2, this.field3996, super.field6075, var6, class83.field1160, super.field6038, super.field6116, super.field6040, super.field6076, arg0, class95.field1354, super.field6034, var7, (byte) -50, super.field6091, super.field6058, class742.field10404);
        if (var12 == null) {
            return false;
        } else {
            super.field6066 = var12.method253();
            super.field6126 = var12.method269();
            this.method2571(false, var12);
            if (~var8 == -1 && ~var9 == -1) {
                this.method2581(-6191, 0, this.method2579(false) << 9, 0, var11, this.method2579(false) << 9);
            } else {
                this.method2581(-6191, var5.field3729, var9, var5.field3749, var11, var8);
                if (super.field6057 != 0) {
                    super.field6136[0].method243(super.field6057);
                }
                if (~super.field6078 != -1) {
                    super.field6136[0].method279(super.field6078);
                }
                if (super.field6026 != 0) {
                    super.field6136[0].method238(0, super.field6026, 0);
                }
            }
            if (arg1 > -30) {
                method1804((class39) null, (Canvas) null, (class151) null, -111, 115, -119);
            }
            if (var10) {
                var12.method267(super.field6035, super.field6043, super.field6048, super.field6062 & 255);
            }
            if (~super.field6061 != 0 && super.field6046 != -1) {
                class321 var13 = class499.field7100.method172(super.field6061, 3128);
                boolean var14 = ~var13.field4527 == -4 && (var8 != 0 || var9 != 0);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (super.field6025 != 0) {
                        var15 = var4 | 5;
                    }
                    if (super.field6070 != 0) {
                        var15 |= 2;
                    }
                    if (super.field6042 >= 0) {
                        var15 |= 7;
                    }
                }
                class473 var16 = super.field6136[1] = var13.method2032(256, super.field6049, super.field6055, arg2, var15, class742.field10404, super.field6046);
                if (var16 != null) {
                    if (~super.field6042 > -1) {
                        if (super.field6025 != 0) {
                            var16.method257(super.field6025 * 2048);
                        }
                    } else {
                        int var17 = 0;
                        int var18 = 0;
                        int var19 = 0;
                        if (var5.field3730 != null && var5.field3730[super.field6042] != null) {
                            var19 += var5.field3730[super.field6042][2];
                            var18 += var5.field3730[super.field6042][1];
                            var17 += var5.field3730[super.field6042][0];
                        }
                        if (var5.field3745 != null && var5.field3745[super.field6042] != null) {
                            var19 += var5.field3745[super.field6042][2];
                            var18 += var5.field3745[super.field6042][1];
                            var17 += var5.field3745[super.field6042][0];
                        }
                        if (~var19 != -1 || var17 != 0) {
                            int var20 = var11;
                            if (super.field6058 != null && ~super.field6058[super.field6042] != 0) {
                                var20 = super.field6058[super.field6042];
                            }
                            int var21 = 16383 & super.field6025 * 2048 + -var11 + var20;
                            if (~var21 != -1) {
                                var16.method257(var21);
                            }
                            int var22 = class373.field5548[var21];
                            int var23 = class373.field5549[var21];
                            int var24 = var17 * var23 + var19 * var22 >> 14;
                            var19 = var19 * var23 + -(var17 * var22) >> 14;
                            var17 = var24;
                        }
                        var16.method238(var17, var18, var19);
                    }
                    if (~super.field6070 != -1) {
                        var16.method238(0, -super.field6070 << 2, 0);
                    }
                    if (var14) {
                        if (~super.field6057 != -1) {
                            var16.method243(super.field6057);
                        }
                        if (super.field6078 != 0) {
                            var16.method279(super.field6078);
                        }
                        if (super.field6026 != 0) {
                            var16.method238(0, super.field6026, 0);
                        }
                    }
                }
            } else {
                super.field6136[1] = null;
            }
            if (super.field6107 != -1 && super.field6087 != -1) {
                class321 var25 = class499.field7100.method172(super.field6107, 3128);
                boolean var26 = ~var25.field4527 == -4 && (var8 != 0 || var9 != 0);
                int var27 = var4;
                if (var26) {
                    var27 = var4 | 7;
                } else {
                    if (~super.field6122 != -1) {
                        var27 = var4 | 5;
                    }
                    if (~super.field6119 != -1) {
                        var27 |= 2;
                    }
                    if (~super.field6029 <= -1) {
                        var27 |= 7;
                    }
                }
                class473 var28 = super.field6136[2] = var25.method2031(arg2, class742.field10404, 0, super.field6084, super.field6028, super.field6087, var27);
                if (var28 != null) {
                    if (super.field6029 >= 0 && var5.field3730 != null && var5.field3730[super.field6029] != null) {
                        int var29 = 0;
                        int var30 = 0;
                        int var31 = 0;
                        if (var5.field3730 != null && var5.field3730[super.field6029] != null) {
                            var29 += var5.field3730[super.field6029][0];
                            var31 += var5.field3730[super.field6029][2];
                            var30 += var5.field3730[super.field6029][1];
                        }
                        if (var5.field3745 != null && var5.field3745[super.field6029] != null) {
                            var29 += var5.field3745[super.field6029][0];
                            var30 += var5.field3745[super.field6029][1];
                            var31 += var5.field3745[super.field6029][2];
                        }
                        if (var31 != 0 || var29 != 0) {
                            int var32 = var11;
                            if (super.field6058 != null && ~super.field6058[super.field6029] != 0) {
                                var32 = super.field6058[super.field6029];
                            }
                            int var33 = 16383 & super.field6122 * 2048 + var32 - var11;
                            if (~var33 != -1) {
                                var28.method257(var33);
                            }
                            int var34 = class373.field5548[var33];
                            int var35 = class373.field5549[var33];
                            int var36 = var31 * var34 - -(var29 * var35) >> 14;
                            var31 = var31 * var35 + -(var29 * var34) >> 14;
                            var29 = var36;
                        }
                        var28.method238(var29, var30, var31);
                    } else if (~super.field6122 != -1) {
                        var28.method257(super.field6122 * 2048);
                    }
                    if (super.field6119 != 0) {
                        var28.method238(0, -super.field6119 << 2, 0);
                    }
                    if (var26) {
                        if (super.field6057 != 0) {
                            var28.method243(super.field6057);
                        }
                        if (~super.field6078 != -1) {
                            var28.method279(super.field6078);
                        }
                        if (~super.field6026 != -1) {
                            var28.method238(0, super.field6026, 0);
                        }
                    }
                }
            } else {
                super.field6136[2] = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lvd;Ljava/awt/Canvas;Ld;III)Lha;", line = 551)
    public static final class60 method1804(class39 arg0, Canvas arg1, class151 arg2, int arg3, int arg4, int arg5) {
        ++field3983;
        int var6 = 0;
        int var7 = -126 % ((-27 - arg5) / 57);
        int var8 = 0;
        if (arg1 != null) {
            Dimension var9 = arg1.getSize();
            var8 = var9.height;
            var6 = var9.width;
        }
        return class60.method451(arg4, arg0, var6, arg3, false, arg2, arg1, var8);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Lha;B)Lc;", line = 579)
    public final class187 method319(class60 arg0, byte arg1) {
        ++field4010;
        if (this.field4008 != null && this.method1803(2048, -115, arg0)) {
            class738 var3 = arg0.method442();
            int var4 = super.field6110.method752((byte) 105);
            var3.method764(var4);
            class186 var5 = class80.field1136[super.field8429][super.field8423 >> class459.field6769][super.field8428 >> class459.field6769];
            if (var5 != null && var5.field2844 != null) {
                int var6 = super.field6047 - var5.field2844.field4980;
                super.field6047 = (int) ((float) super.field6047 - (float) var6 / 10.0F);
            } else {
                super.field6047 = (int) ((float) super.field6047 - (float) super.field6047 / 10.0F);
            }
            var3.method758(super.field8423, super.field8421 + -20 - super.field6047, super.field8428);
            class264 var7 = this.method2577(-1);
            int var8 = 49 % ((-25 - arg1) / 60);
            class348 var9 = this.field4008.field5076 != null ? this.field4008.method2207(124, class83.field1160) : this.field4008;
            super.field6129 = false;
            class187 var10 = null;
            if (~class63.field916.field10205.method3892(17503) == -2 && var9.field5072 && var7.field3765) {
                class288 var11 = ~super.field6094 != 0 && ~super.field6056 == -1 ? class742.field10404.method2663(0, super.field6094) : null;
                class288 var12 = ~super.field6123 == 0 || super.field6032 && var11 != null ? null : class742.field10404.method2663(0, super.field6123);
                class473 var13 = class49.method358(super.field6078, var4, this.field4008.field5068 & 65535, this.field4008.field5053, super.field6026, 18, super.field6136[0], arg0, this.field4008.field5032 & 65535, super.field6057, var12 == null ? var11 : var12, var12 == null ? super.field6040 : super.field6076, 255 & this.field4008.field5056, this.field4008.field5099 & 255);
                if (var13 != null) {
                    var10 = class650.method3774(120, this.method1801((byte) 41), super.field6136.length + 1);
                    super.field6129 = true;
                    arg0.method463(false);
                    if (!class418.field6258) {
                        var13.method265(var3, var10.field2851[super.field6136.length], 0);
                    } else {
                        var13.method235(var3, var10.field2851[super.field6136.length], class188.field2859, 0);
                    }
                    arg0.method463(true);
                }
            }
            var3.method764(var4);
            var3.method758(super.field8423, super.field8421 - 5 + -super.field6047, super.field8428);
            if (var10 == null) {
                var10 = class650.method3774(104, this.method1801((byte) 41), super.field6136.length);
            }
            this.method2582((byte) -100, super.field6136, arg0, var3, false);
            if (!class418.field6258) {
                for (int var14 = 0; ~super.field6136.length < ~var14; ++var14) {
                    if (super.field6136[var14] != null) {
                        super.field6136[var14].method265(var3, var10.field2851[var14], 0);
                    }
                }
            } else {
                for (int var15 = 0; var15 < super.field6136.length; ++var15) {
                    if (super.field6136[var15] != null) {
                        super.field6136[var15].method235(var3, var10.field2851[var15], class188.field2859, 0);
                    }
                }
            }
            if (super.field6138 != null) {
                class624 var16 = super.field6138.method3603();
                if (!class418.field6258) {
                    arg0.method523(var16);
                } else {
                    arg0.method505(var16, class188.field2859);
                }
            }
            for (int var17 = 0; ~super.field6136.length < ~var17; ++var17) {
                if (super.field6136[var17] != null) {
                    super.field6129 |= super.field6136[var17].method275();
                }
            }
            super.field6136[0] = super.field6136[1] = super.field6136[2] = null;
            super.field6030 = class412.field6195;
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V", line = 703)
    public final void method1805(int arg0, int arg1, int arg2) {
        ++field3992;
        int var4 = super.field6133[0];
        int var5 = super.field6139[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (arg1 == 1) {
            ++var5;
            ++var4;
        }
        if (arg1 == 2) {
            ++var4;
        }
        if (~arg1 == -4) {
            ++var4;
            --var5;
        }
        if (arg1 == 4) {
            --var5;
        }
        if (arg1 == 5) {
            --var5;
            --var4;
        }
        if (arg1 == 6) {
            --var4;
        }
        if (arg1 == arg2) {
            ++var5;
            --var4;
        }
        if (~super.field6094 != 0 && ~class742.field10404.method2663(0, super.field6094).field4111 == -2) {
            super.field6039 = null;
            super.field6094 = -1;
        }
        if (super.field6061 != -1) {
            class321 var6 = class499.field7100.method172(super.field6061, 3128);
            if (var6.field4543 && var6.field4528 != -1 && class742.field10404.method2663(0, var6.field4528).field4111 == 1) {
                super.field6061 = -1;
            }
        }
        if (~super.field6107 != 0) {
            class321 var7 = class499.field7100.method172(super.field6107, arg2 ^ 3135);
            if (var7.field4543 && ~var7.field4528 != 0 && class742.field10404.method2663(0, var7.field4528).field4111 == 1) {
                super.field6107 = -1;
            }
        }
        if (~super.field6130 > -10) {
            ++super.field6130;
        }
        for (int var8 = super.field6130; var8 > 0; --var8) {
            super.field6133[var8] = super.field6133[var8 + -1];
            super.field6139[var8] = super.field6139[var8 + -1];
            super.field6131[var8] = super.field6131[var8 + -1];
        }
        super.field6133[0] = var4;
        super.field6139[0] = var5;
        super.field6131[0] = (byte) arg0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILow;)V", line = 805)
    public final void method1806(int arg0, class348 arg1) {
        ++field3994;
        this.field4008 = arg1;
        if (arg0 == -9430) {
            if (this.field4008 != null) {
                this.field4009 = this.field4008.field5036;
                this.field3995 = this.field4008.field5069;
            }
            if (super.field6138 != null) {
                super.field6138.method3602();
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)Z", line = 829)
    public final boolean method738(byte arg0) {
        if (arg0 != 88) {
            this.field4009 = 84;
        }
        ++field4006;
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)Z", line = 840)
    public final boolean method1807(boolean arg0) {
        ++field4011;
        if (!arg0) {
            this.field4009 = -34;
        }
        return this.field4008 != null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lha;I)Lria;", line = 862)
    public final class286 method325(class60 arg0, int arg1) {
        ++field3984;
        return arg1 != 92160000 ? null : null;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V", line = 883)
    public final void method741(int arg0) {
        if (arg0 <= -93) {
            ++field4000;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)I", line = 894)
    public final int method1808(int arg0) {
        ++field3998;
        if (arg0 != 14371) {
            this.field4008 = null;
        }
        if (this.field4008.field5076 != null) {
            class348 var2 = this.field4008.method2207(66, class83.field1160);
            if (var2 != null && var2.field5054 != -1) {
                return var2.field5054;
            }
        }
        return ~this.field4008.field5054 != 0 ? this.field4008.field5054 : super.method1808(14371);
    }
}
