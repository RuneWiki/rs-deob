import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class265 extends class197 {

    @OriginalMember(owner = "client!bl", name = "Oc", descriptor = "I")
    public int field4434 = -1;

    @OriginalMember(owner = "client!bl", name = "dd", descriptor = "I")
    public int field4449 = -1;

    @OriginalMember(owner = "client!bl", name = "Mc", descriptor = "I")
    public static int field4432 = -1;

    @OriginalMember(owner = "client!bl", name = "Cc", descriptor = "[S")
    public static short[] field4422 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!bl", name = "Xc", descriptor = "[I")
    public static int[] field4443 = new int[1];

    @OriginalMember(owner = "client!bl", name = "Fc", descriptor = "I")
    public static int field4425 = 0;

    @OriginalMember(owner = "client!bl", name = "Tc", descriptor = "Lnk;")
    public static class326 field4439 = new class326(27, -1);

    @OriginalMember(owner = "client!bl", name = "cd", descriptor = "[C")
    public static char[] field4448 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!bl", name = "bd", descriptor = "I")
    public static int field4447 = 0;

    @OriginalMember(owner = "client!bl", name = "zc", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!bl", name = "Ac", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!bl", name = "Bc", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!bl", name = "Dc", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!bl", name = "Ec", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!bl", name = "Gc", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!bl", name = "Hc", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!bl", name = "Ic", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!bl", name = "Jc", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!bl", name = "Lc", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!bl", name = "Nc", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!bl", name = "Pc", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!bl", name = "Qc", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!bl", name = "Rc", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!bl", name = "Sc", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!bl", name = "Uc", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!bl", name = "Vc", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!bl", name = "Wc", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!bl", name = "Yc", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!bl", name = "Zc", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!bl", name = "ad", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!bl", name = "ed", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!bl", name = "fd", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!bl", name = "Kc", descriptor = "Lak;")
    public class510 field4430;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILak;)V", line = 7)
    public final void method1764(int arg0, class510 arg1) {
        ++field4436;
        this.field4430 = arg1;
        if (arg0 == -1) {
            if (super.field3151 != null) {
                super.field3151.method966();
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)I", line = 23)
    public final int method1141(int arg0) {
        ++field4423;
        if (arg0 != -3) {
            this.method325(59);
        }
        if (this.field4430.field7448 != null) {
            class510 var2 = this.field4430.method3000(arg0 + 4, class327.field5160);
            if (var2 != null && var2.field7478 != -1) {
                return var2.field7478;
            }
        }
        return this.field4430.field7478;
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(B)V", line = 44)
    public static void method1765(byte arg0) {
        field4448 = null;
        field4443 = null;
        field4422 = null;
        int var1 = 2 / ((-74 - arg0) / 46);
        field4439 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZLbl;)V", line = 59)
    public static final void method1766(boolean arg0, class265 arg1) {
        ++field4441;
        if (!arg0) {
            field4428 = 127;
        }
        for (class451 var2 = (class451) class511.field7481.method2538(-3); var2 != null; var2 = (class451) class511.field7481.method2535((byte) -66)) {
            if (var2.field6728 == arg1) {
                if (var2.field6723 != null) {
                    class510.field7455.method1734(var2.field6723);
                    var2.field6723 = null;
                }
                var2.method1821((byte) 34);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(BLza;)V", line = 92)
    public final void method43(byte arg0, class491 arg1) {
        if (arg0 == 35) {
            ++field4446;
            if (this.field4430 != null) {
                if (super.field3157 || this.method1774(arg1, -112, 0)) {
                    this.method1314(super.field3160, false, super.field3157, arg1);
                    super.field3160[0] = super.field3160[1] = super.field3160[2] = super.field3160[3] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZIIII)V", line = 124)
    public final void method1767(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4450;
        super.field4720 = (byte) arg5;
        if (super.field3136 != -1 && ~class130.field2232.method634(-1271654143, super.field3136).field2365 == -2) {
            super.field3136 = -1;
        }
        if (super.field3107 != -1) {
            class526 var7 = class30.field482.method2630((byte) 122, super.field3107);
            if (var7.field7743 && var7.field7752 != -1 && class130.field2232.method634(-1271654143, var7.field7752).field2365 == 1) {
                super.field3107 = -1;
            }
        }
        int var8 = 113 % ((63 - arg3) / 55);
        if (~super.field3071 != 0) {
            class526 var9 = class30.field482.method2630((byte) 103, super.field3071);
            if (var9.field7743 && ~var9.field7752 != 0 && class130.field2232.method634(-1271654143, var9.field7752).field2365 == 1) {
                super.field3071 = -1;
            }
        }
        if (!arg1) {
            int var10 = arg0 - super.field3159[0];
            int var11 = -super.field3158[0] + arg2;
            if (~var10 <= 7 && var10 <= 8 && ~var11 <= 7 && var11 <= 8) {
                if (~super.field3153 > -10) {
                    ++super.field3153;
                }
                for (int var12 = super.field3153; ~var12 < -1; --var12) {
                    super.field3159[var12] = super.field3159[var12 + -1];
                    super.field3158[var12] = super.field3158[var12 - 1];
                    super.field3152[var12] = super.field3152[var12 + -1];
                }
                super.field3159[0] = arg0;
                super.field3152[0] = 1;
                super.field3158[0] = arg2;
                return;
            }
        }
        super.field3153 = 0;
        super.field3155 = 0;
        super.field3159[0] = arg0;
        super.field3154 = 0;
        super.field3158[0] = arg2;
        super.field4716 = (super.field3159[0] << 7) - -(arg4 << 6);
        super.field4714 = (super.field3158[0] << 7) + (arg4 << 6);
        if (super.field3151 != null) {
            super.field3151.method966();
        }
    }

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "(I)Z", line = 202)
    private final boolean method1768(int arg0) {
        ++field4435;
        if (arg0 != 7) {
            this.method1774((class491) null, 47, -118);
        }
        return this.field4430.field7457;
    }

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)I", line = 218)
    public final int method1307(int arg0) {
        ++field4424;
        if (this.field4430.field7448 != null) {
            class510 var2 = this.field4430.method3000(1, class327.field5160);
            if (var2 != null && ~var2.field7468 != 0) {
                return var2.field7468;
            }
        }
        if (arg0 >= -96) {
            this.field4434 = 88;
        }
        return ~this.field4430.field7468 != 0 ? this.field4430.field7468 : super.method1307(-109);
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)I", line = 241)
    public final int method325(int arg0) {
        if (arg0 != 5) {
            field4443 = null;
        }
        ++field4420;
        return super.field3080;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lza;III)Z", line = 252)
    public final boolean method27(class491 arg0, int arg1, int arg2, int arg3) {
        ++field4429;
        if (this.field4430 != null && this.method1774(arg0, -111, 131072)) {
            class202 var5 = arg0.method820();
            int var6 = super.field3087.method2112((byte) 127);
            var5.method1250(var6);
            var5.method1237(super.field4716, super.field4728, super.field4714);
            boolean var7 = false;
            int var8 = 0;
            if (arg1 <= 121) {
                return false;
            } else {
                while (super.field3160.length > var8) {
                    if (super.field3160[var8] != null && super.field3160[var8].method776(arg3, arg2, var5, this.field4430.field7416 == 1)) {
                        var7 = true;
                        break;
                    }
                    ++var8;
                }
                super.field3160[0] = super.field3160[1] = super.field3160[2] = super.field3160[3] = null;
                return var7;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "(I)V", line = 290)
    public static final void method1769(int arg0) {
        ++field4438;
        if (class226.field3894 == null) {
            class226.field3894 = new int[65536];
            double var1 = Math.random() * 0.03D - 0.015D + 0.7D;
            int var3 = 0;
            if (arg0 != 98) {
                field4428 = -65;
            }
            for (int var4 = 0; var4 < 512; ++var4) {
                float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                float var6 = (float) (7 & var4) / 8.0F + 0.0625F;
                for (int var7 = 0; ~var7 > -129; ++var7) {
                    float var8 = (float) var7 / 128.0F;
                    float var9 = 0.0F;
                    float var10 = 0.0F;
                    float var11 = 0.0F;
                    float var12 = var5 / 60.0F;
                    int var13 = (int) var12;
                    int var14 = var13 % 6;
                    float var15 = (float) (-var13) + var12;
                    float var16 = (1.0F - var6) * var8;
                    float var17 = (1.0F - var6 * var15) * var8;
                    float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                    if (var14 == 0) {
                        var9 = var8;
                        var10 = var18;
                        var11 = var16;
                    } else if (~var14 != -2) {
                        if (~var14 == -3) {
                            var9 = var16;
                            var11 = var18;
                            var10 = var8;
                        } else if (var14 != 3) {
                            if (~var14 == -5) {
                                var9 = var18;
                                var11 = var8;
                                var10 = var16;
                            } else if (~var14 == -6) {
                                var10 = var16;
                                var11 = var17;
                                var9 = var8;
                            }
                        } else {
                            var10 = var17;
                            var11 = var8;
                            var9 = var16;
                        }
                    } else {
                        var11 = var16;
                        var9 = var17;
                        var10 = var8;
                    }
                    float var19 = (float) Math.pow((double) var9, var1);
                    float var20 = (float) Math.pow((double) var10, var1);
                    float var21 = (float) Math.pow((double) var11, var1);
                    int var22 = (int) (var19 * 256.0F);
                    int var23 = (int) (var20 * 256.0F);
                    int var24 = (int) (var21 * 256.0F);
                    int var25 = (var23 << 8) + (var22 << 16) + -16777216 + var24;
                    class226.field3894[var3++] = var25;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)V", line = 422)
    public final void method36(boolean arg0) {
        if (arg0) {
            this.method325(87);
        }
        ++field4437;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBI)V", line = 437)
    public final void method1770(int arg0, byte arg1, int arg2) {
        ++field4444;
        int var4 = super.field3159[0];
        if (arg1 != 49) {
            method1772(true, -75, 12, 0.7347208F, (byte) -40, 84, -108, -112);
        }
        int var5 = super.field3158[0];
        if (arg2 == 0) {
            ++var5;
        }
        if (arg2 == 1) {
            ++var5;
            ++var4;
        }
        if (arg2 == 2) {
            ++var4;
        }
        if (arg2 == 3) {
            ++var4;
            --var5;
        }
        if (arg2 == 4) {
            --var5;
        }
        if (arg2 == 5) {
            --var5;
            --var4;
        }
        if (~arg2 == -7) {
            --var4;
        }
        if (~arg2 == -8) {
            --var4;
            ++var5;
        }
        if (~super.field3136 != 0 && ~class130.field2232.method634(-1271654143, super.field3136).field2365 == -2) {
            super.field3136 = -1;
        }
        if (super.field3107 != -1) {
            class526 var6 = class30.field482.method2630((byte) 109, super.field3107);
            if (var6.field7743 && var6.field7752 != -1 && class130.field2232.method634(arg1 ^ -1271654096, var6.field7752).field2365 == 1) {
                super.field3107 = -1;
            }
        }
        if (~super.field3071 != 0) {
            class526 var7 = class30.field482.method2630((byte) 103, super.field3071);
            if (var7.field7743 && ~var7.field7752 != 0 && ~class130.field2232.method634(-1271654143, var7.field7752).field2365 == -2) {
                super.field3071 = -1;
            }
        }
        if (super.field3153 < 9) {
            ++super.field3153;
        }
        for (int var8 = super.field3153; ~var8 < -1; --var8) {
            super.field3159[var8] = super.field3159[var8 + -1];
            super.field3158[var8] = super.field3158[var8 + -1];
            super.field3152[var8] = super.field3152[var8 + -1];
        }
        super.field3159[0] = var4;
        super.field3158[0] = var5;
        super.field3152[0] = (byte) arg0;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)I", line = 535)
    public final int method1142(int arg0) {
        ++field4433;
        if (this.field4430.field7448 != null) {
            class510 var2 = this.field4430.method3000(1, class327.field5160);
            if (var2 != null && var2.field7444 != -1) {
                return var2.field7444;
            }
        }
        if (arg0 != -308) {
            field4447 = -107;
        }
        return this.field4430.field7444;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)Z", line = 556)
    public final boolean method42(boolean arg0) {
        ++field4440;
        if (arg0) {
            this.method1307(32);
        }
        return false;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(Z)Z", line = 567)
    public final boolean method1771(boolean arg0) {
        ++field4442;
        if (this.field4430 == null) {
            return false;
        } else {
            if (arg0) {
                field4447 = 83;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZIIFBIII)[I", line = 583)
    public static final int[] method1772(boolean arg0, int arg1, int arg2, float arg3, byte arg4, int arg5, int arg6, int arg7) {
        ++field4421;
        int[] var8 = new int[arg5];
        class65 var9 = new class65();
        var9.field957 = arg0;
        var9.field967 = arg2;
        int var10 = 73 / ((arg4 - 5) / 49);
        var9.field974 = arg1;
        var9.field960 = arg7;
        var9.field966 = arg6;
        var9.field959 = (int) (arg3 * 4096.0F);
        var9.method74(12388);
        class34.method258(-112, 1, arg5);
        var9.method425(var8, -22048, 0);
        return var8;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BJ)V", line = 607)
    public static final void method1773(byte arg0, long arg1) {
        ++field4426;
        int var3 = class296.field4782;
        int var4 = class535.field7865;
        if (~class165.field2606 != ~var3) {
            int var5 = -class165.field2606 + var3;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (~var5 >= -1) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class165.field2606 += var6;
        }
        if (~class139.field2318 != ~var4) {
            int var7 = -class139.field2318 + var4;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (~var8 != -1) {
                    if (var7 < var8) {
                        var8 = var7;
                    }
                } else {
                    var8 = 1;
                }
            } else if (~var8 != -1) {
                if (~var7 < ~var8) {
                    var8 = var7;
                }
            } else {
                var8 = -1;
            }
            class139.field2318 += var8;
        }
        if (arg0 == -75) {
            if (!class510.field7403.field5116) {
                class509.field7395 += (float) arg1 * class380.field5886 / 40.0F * 8.0F;
                class88.field1483 += (float) arg1 * class100.field1663 / 40.0F * 8.0F;
            }
            class249.method1690(arg0 + 71);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lza;II)Z", line = 697)
    private final boolean method1774(class491 arg0, int arg1, int arg2) {
        ++field4445;
        int var4 = arg2;
        class49 var5 = this.method1308(-13076);
        class145 var6 = super.field3136 != -1 && super.field3098 == 0 ? class130.field2232.method634(-1271654143, super.field3136) : null;
        class145 var7 = super.field3078 == -1 || super.field3111 && var6 != null ? null : class130.field2232.method634(-1271654143, super.field3078);
        int var8 = var5.field776;
        int var9 = var5.field794;
        if (var8 != 0 || ~var9 != -1 || ~var5.field798 != -1 || var5.field819 != 0) {
            arg2 |= 7;
        }
        if (arg1 >= -104) {
            return true;
        } else {
            boolean var10 = super.field3059 != 0 && super.field3081 <= class504.field7348 && class504.field7348 < super.field3145;
            if (var10) {
                arg2 |= 524288;
            }
            class530 var11 = super.field3160[0] = this.field4430.method2996(class327.field5160, super.field3128, var6, arg0, super.field3093, -136, arg2, super.field3063, super.field3123, var7, super.field3125, super.field3083, class224.field3870, super.field3105, class130.field2232);
            if (var11 == null) {
                return false;
            } else {
                super.field3080 = var11.method726();
                this.method1315(var11, 18054);
                int var12 = super.field3087.method2112((byte) 121);
                if (var8 == 0 && var9 == 0) {
                    this.method1301(0, this.method1143(0) << 7, -1845326431, var12, 0, this.method1143(0) << 7);
                } else {
                    this.method1301(var5.field822, var9, -1845326431, var12, var5.field828, var8);
                    if (~super.field3115 != -1) {
                        super.field3160[0].method734(super.field3115);
                    }
                    if (~super.field3100 != -1) {
                        super.field3160[0].method761(super.field3100);
                    }
                    if (~super.field3072 != -1) {
                        super.field3160[0].method773(0, super.field3072, 0);
                    }
                }
                if (var10) {
                    var11.method755(super.field3131, super.field3121, super.field3064, super.field3059 & 255);
                }
                if (~super.field3107 != 0 && super.field3084 != -1) {
                    class526 var13 = class30.field482.method2630((byte) 108, super.field3107);
                    boolean var14 = var13.field7741 == 3 && (var8 != 0 || ~var9 != -1);
                    int var15 = var4;
                    if (var14) {
                        var15 = var4 | 7;
                    } else {
                        if (~super.field3142 != -1) {
                            var15 = var4 | 5;
                        }
                        if (~super.field3127 != -1) {
                            var15 |= 2;
                        }
                    }
                    class530 var16 = super.field3160[1] = var13.method3115(var15, super.field3084, class130.field2232, arg0, super.field3088, -6415, super.field3113);
                    if (var16 != null) {
                        if (~super.field3127 != -1) {
                            var16.method773(0, -super.field3127 << 0, 0);
                        }
                        if (super.field3142 != 0) {
                            var16.method756(super.field3142 * 2048);
                        }
                        if (var14) {
                            if (super.field3115 != 0) {
                                var16.method734(super.field3115);
                            }
                            if (super.field3100 != 0) {
                                var16.method761(super.field3100);
                            }
                            if (~super.field3072 != -1) {
                                var16.method773(0, super.field3072, 0);
                            }
                        }
                    }
                } else {
                    super.field3160[1] = null;
                }
                if (~super.field3071 != 0 && super.field3075 != -1) {
                    class526 var17 = class30.field482.method2630((byte) 119, super.field3071);
                    boolean var18 = var17.field7741 == 3 && (~var8 != -1 || var9 != 0);
                    int var19 = var4;
                    if (var18) {
                        var19 = var4 | 7;
                    } else {
                        if (super.field3102 != 0) {
                            var19 = var4 | 5;
                        }
                        if (~super.field3116 != -1) {
                            var19 |= 2;
                        }
                    }
                    class530 var20 = super.field3160[3] = var17.method3118(super.field3097, arg0, -92, super.field3118, super.field3075, class130.field2232, var19);
                    if (var20 != null) {
                        if (~super.field3116 != -1) {
                            var20.method773(0, -super.field3116 << 0, 0);
                        }
                        if (~super.field3102 != -1) {
                            var20.method756(super.field3102 * 2048);
                        }
                        if (var18) {
                            if (super.field3115 != 0) {
                                var20.method734(super.field3115);
                            }
                            if (~super.field3100 != -1) {
                                var20.method761(super.field3100);
                            }
                            if (super.field3072 != 0) {
                                var20.method773(0, super.field3072, 0);
                            }
                        }
                    }
                } else {
                    super.field3160[3] = null;
                }
                super.field3160[2] = null;
                if (super.field3161 != null) {
                    if (class504.field7348 >= super.field3161.field118) {
                        super.field3161 = null;
                    } else if (~class504.field7348 <= ~super.field3161.field115) {
                        class530 var21 = super.field3161.method60(7 | var4, arg0, (byte) 121);
                        if (var21 != null) {
                            var21.method773(-super.field4716 + super.field3161.field126, -super.field4728 + super.field3161.field116, -super.field4714 + super.field3161.field127);
                            if (var12 != 0) {
                                var21.method756(var12);
                            }
                            super.field3160[2] = var21;
                        }
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILnk;)V", line = 895)
    public static final void method1775(int arg0, class326 arg1) {
        ++field4427;
        class261.field4357.method2156(arg1.method2048(false), arg0 ^ 3496);
        if (arg0 != -2) {
            field4422 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILza;IILvl;Z)V", line = 906)
    public final void method39(int arg0, int arg1, class491 arg2, int arg3, int arg4, class243 arg5, boolean arg6) {
        if (arg0 == 0) {
            ++field4431;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(ILza;)Lsr;", line = 917)
    public final class430 method40(int arg0, class491 arg1) {
        ++field4451;
        if (this.field4430 != null && this.method1774(arg1, -110, 2048)) {
            class202 var3 = arg1.method820();
            int var4 = super.field3087.method2112((byte) 123);
            var3.method1250(var4);
            var3.method1237(super.field4716, super.field4728, super.field4714);
            if (arg0 > -24) {
                return null;
            } else {
                class49 var5 = this.method1308(-13076);
                class510 var6 = this.field4430.field7448 != null ? this.field4430.method3000(1, class327.field5160) : this.field4430;
                if (class510.field7403.field5112 && var6.field7477 && var5.field791) {
                    class145 var7 = super.field3136 != -1 && super.field3098 == 0 ? class130.field2232.method634(-1271654143, super.field3136) : null;
                    class145 var8 = super.field3078 == -1 || super.field3111 && var7 != null ? null : class130.field2232.method634(-1271654143, super.field3078);
                    int var9 = 0;
                    if (super.field3129 != 0) {
                        var9 = this.method1313(25080);
                    }
                    class530 var10 = class91.method638(65535 & this.field4430.field7427, 255 & this.field4430.field7446, var4, 255 & this.field4430.field7474, this.field4430.field7416, var9, -3530, super.field3100, super.field3115, var8 == null ? super.field3125 : super.field3128, super.field3160[0], var8 == null ? var7 : var8, arg1, super.field3072, 65535 & this.field4430.field7456);
                    if (var10 != null) {
                        float var11 = arg1.method850();
                        float var12 = arg1.method898();
                        arg1.method886(false);
                        arg1.method877(var11, var12 - 150.0F);
                        var10.method736(var3, (class273) null, 0);
                        arg1.method877(var11, var12);
                        arg1.method886(true);
                    }
                }
                class430 var13 = null;
                if (this.method1768(7)) {
                    var13 = class21.method111((byte) -83, super.field3160.length);
                }
                if (super.field3151 != null) {
                    class66 var14 = super.field3151.method964();
                    arg1.method838(super.field3160, var14, var3, var13 == null ? null : var13.field6447, 0);
                } else {
                    arg1.method880(super.field3160, var3, var13 != null ? var13.field6447 : null, 0);
                }
                this.method1314(super.field3160, false, false, arg1);
                if (super.field3160[2] != null) {
                    if (~var4 != -1) {
                        super.field3160[2].method756(var4);
                    }
                    super.field3160[2].method773(super.field4716 - super.field3161.field126, super.field4728 - super.field3161.field116, -super.field3161.field127 + super.field4714);
                }
                super.field3160[0] = super.field3160[1] = super.field3160[2] = super.field3160[3] = null;
                super.field3073 = class536.field7878;
                return var13;
            }
        } else {
            return null;
        }
    }
}
