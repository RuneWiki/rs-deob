import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class589 extends class260 {

    @OriginalMember(owner = "client!sp", name = "bd", descriptor = "I")
    public int field8358 = -1;

    @OriginalMember(owner = "client!sp", name = "ud", descriptor = "I")
    public int field8377 = -1;

    @OriginalMember(owner = "client!sp", name = "fd", descriptor = "Lhga;")
    public static class158 field8362 = new class158(55, 4);

    @OriginalMember(owner = "client!sp", name = "rd", descriptor = "I")
    public static int field8374 = 0;

    @OriginalMember(owner = "client!sp", name = "sd", descriptor = "I")
    public static int field8375 = 0;

    @OriginalMember(owner = "client!sp", name = "gd", descriptor = "Lws;")
    public static class328 field8363 = new class328(12, 4);

    @OriginalMember(owner = "client!sp", name = "Yc", descriptor = "I")
    public static int field8355;

    @OriginalMember(owner = "client!sp", name = "Zc", descriptor = "I")
    public static int field8356;

    @OriginalMember(owner = "client!sp", name = "ad", descriptor = "I")
    public static int field8357;

    @OriginalMember(owner = "client!sp", name = "cd", descriptor = "I")
    public static int field8359;

    @OriginalMember(owner = "client!sp", name = "dd", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!sp", name = "ed", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!sp", name = "hd", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!sp", name = "id", descriptor = "I")
    public static int field8365;

    @OriginalMember(owner = "client!sp", name = "jd", descriptor = "I")
    public static int field8366;

    @OriginalMember(owner = "client!sp", name = "kd", descriptor = "I")
    public static int field8367;

    @OriginalMember(owner = "client!sp", name = "ld", descriptor = "I")
    public static int field8368;

    @OriginalMember(owner = "client!sp", name = "md", descriptor = "I")
    public static int field8369;

    @OriginalMember(owner = "client!sp", name = "nd", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!sp", name = "od", descriptor = "I")
    public static int field8371;

    @OriginalMember(owner = "client!sp", name = "pd", descriptor = "I")
    public static int field8372;

    @OriginalMember(owner = "client!sp", name = "qd", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!sp", name = "td", descriptor = "I")
    public static int field8376;

    @OriginalMember(owner = "client!sp", name = "vd", descriptor = "I")
    public static int field8378;

    @OriginalMember(owner = "client!sp", name = "wd", descriptor = "I")
    public static int field8379;

    @OriginalMember(owner = "client!sp", name = "xd", descriptor = "I")
    public static int field8380;

    @OriginalMember(owner = "client!sp", name = "Xc", descriptor = "Lms;")
    public class705 field8354;

    @OriginalMember(owner = "client!sp", name = "yd", descriptor = "[Ljava/lang/String;")
    public static String[] field8381;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(III)V")
    public final void method3437(int arg0, int arg1, int arg2) {
        ++field8366;
        int var4 = super.field4264[0];
        int var5 = super.field4265[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (~arg1 == -2) {
            ++var4;
            ++var5;
        }
        if (arg0 == arg1) {
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
        if (super.field4215 != -1 && ~class636.field8942.method2872((byte) 11, super.field4215).field6528 == -2) {
            super.field4215 = -1;
            super.field4174 = null;
        }
        if (arg1 == 7) {
            ++var5;
            --var4;
        }
        if (super.field4220 != -1) {
            class578 var6 = class65.field826.method3686(false, super.field4220);
            if (var6.field8230 && var6.field8241 != -1 && ~class636.field8942.method2872((byte) 11, var6.field8241).field6528 == -2) {
                super.field4220 = -1;
            }
        }
        if (~super.field4170 != 0) {
            class578 var7 = class65.field826.method3686(false, super.field4170);
            if (var7.field8230 && ~var7.field8241 != 0 && ~class636.field8942.method2872((byte) 11, var7.field8241).field6528 == -2) {
                super.field4170 = -1;
            }
        }
        if (~super.field4267 > -10) {
            ++super.field4267;
        }
        for (int var8 = super.field4267; var8 > 0; --var8) {
            super.field4264[var8] = super.field4264[var8 + -1];
            super.field4265[var8] = super.field4265[var8 + -1];
            super.field4263[var8] = super.field4263[var8 - 1];
        }
        super.field4264[0] = var4;
        super.field4263[0] = (byte) arg2;
        super.field4265[0] = var5;
    }

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "(I)I")
    public final int method1847(int arg0) {
        ++field8361;
        if (arg0 != 92160000) {
            field8362 = null;
        }
        if (this.field8354.field9912 != null) {
            class705 var2 = this.field8354.method3973(true, class539.field7869);
            if (var2 != null && ~var2.field9926 != 0) {
                return var2.field9926;
            }
        }
        return this.field8354.field9926;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILr;)V")
    public static final void method3438(int arg0, int arg1, class167 arg2) {
        ++field8370;
        if (!class185.field3114) {
            class95.field1489 = 0;
        } else {
            if (class534.field7792) {
                class28.field438 = class390.field6049.method2907(-22760);
            }
            class233.field3699 = 0;
            class544.field7915 = arg1;
            class524.field7621 = 0;
            int[] var3 = arg2.method353();
            class527.field7692 = (int) ((float) var3[2] / 3.0F);
            class443.field6735 = (int) ((float) var3[3] / 3.0F);
            arg2.method268(class384.field5938);
            if ((int) ((float) class384.field5938[0] / 3.0F) != class245.field3908 || (int) ((float) class384.field5938[1] / 3.0F) != class570.field8156) {
                class570.field8156 = (int) ((float) class384.field5938[1] / 3.0F);
                class245.field3908 = (int) ((float) class384.field5938[0] / 3.0F);
                class651.field9125 = class245.field3908 >> 1;
                class239.field3788 = new int[class570.field8156 * class245.field3908];
                class220.field3584 = class570.field8156 >> 1;
            }
            class694.field9727 = arg2.method259();
            class95.field1489 = 0;
            for (int var4 = 0; ~class669.field9454 < ~var4; ++var4) {
                class426.method2701(arg2, class257.field4073[var4], arg0, -38);
            }
            for (int var5 = 0; class288.field4579 > var5; ++var5) {
                class426.method2701(arg2, class48.field647[var5], arg0, arg1 ^ -76);
            }
            for (int var6 = 0; var6 < class102.field1684; ++var6) {
                class426.method2701(arg2, class678.field9535[var6], arg0, -103);
            }
            class504.field7375 = 0;
            if (~class95.field1489 < -1) {
                int var7 = class239.field3788.length;
                int var8 = -var7 + var7 & 7;
                int var9 = 0;
                while (~var8 < ~var9) {
                    class239.field3788[var9++] = Integer.MAX_VALUE;
                    class239.field3788[var9++] = Integer.MAX_VALUE;
                    class239.field3788[var9++] = Integer.MAX_VALUE;
                    class239.field3788[var9++] = Integer.MAX_VALUE;
                    class239.field3788[var9++] = Integer.MAX_VALUE;
                    class239.field3788[var9++] = Integer.MAX_VALUE;
                    class239.field3788[var9++] = Integer.MAX_VALUE;
                    class239.field3788[var9++] = Integer.MAX_VALUE;
                }
                while (~var9 > ~var7) {
                    class239.field3788[var9++] = Integer.MAX_VALUE;
                }
                class182.field3061 = 1;
                for (int var10 = 0; var10 < class95.field1489; ++var10) {
                    class686 var11 = class331.field5131[var10];
                    class183.method1487(var11.field9616[1], (byte) 19, var11.field9613[3], var11.field9613[1], var11.field9613[0], var11.field9612[0], var11.field9612[1], var11.field9612[3], var11.field9616[0], var11.field9616[3]);
                    class183.method1487(var11.field9616[2], (byte) 111, var11.field9613[3], var11.field9613[2], var11.field9613[1], var11.field9612[1], var11.field9612[2], var11.field9612[3], var11.field9616[1], var11.field9616[3]);
                }
                class182.field3061 = 2;
            }
            if (class534.field7792) {
                class469.field6956 = class390.field6049.method2907(-22760) - class28.field438;
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(IIIIII)V")
    public static final void method3439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8380;
        if (arg0 == arg2) {
            class107.method1009(arg4, arg1, arg0, 100, arg5);
        } else {
            if (arg3 != -1) {
                method3439(-25, -63, 78, 15, -13, -106);
            }
            if (class576.field8218 <= -arg0 + arg1 && class340.field5510 >= arg0 + arg1 && -arg2 + arg4 >= class545.field7931 && class585.field8331 >= arg2 + arg4) {
                class239.method1721(arg5, -1, arg0, arg4, arg2, arg1);
            } else {
                class534.method3235(arg2, false, arg5, arg1, arg4, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(ILr;)Lod;")
    public final class468 method403(int arg0, class167 arg1) {
        ++field8372;
        if (this.field8354 != null && this.method3443(arg1, 19571, 2048)) {
            class393 var3 = arg1.method339();
            int var4 = super.field4244.method1707(-96);
            var3.method506(var4);
            if (arg0 > -38) {
                this.field8354 = null;
            }
            class252 var5 = class454.field6818[super.field9695][super.field9696 >> class439.field6699][super.field9705 >> class439.field6699];
            if (var5 != null && var5.field4025 != null) {
                int var6 = -var5.field4025.field7864 + super.field4181;
                super.field4181 = (int) ((float) super.field4181 - (float) var6 / 10.0F);
            } else {
                super.field4181 = (int) ((float) super.field4181 - (float) super.field4181 / 10.0F);
            }
            var3.method505(super.field9696, -super.field4181 + super.field9701 - 20, super.field9705);
            class642 var7 = this.method1856(1208);
            class705 var8 = this.field8354.field9912 != null ? this.field8354.method3973(true, class539.field7869) : this.field8354;
            super.field4258 = false;
            if (class17.field282.field4887 && var8.field9929 && var7.field9048) {
                class428 var9 = super.field4215 != -1 && ~super.field4150 == -1 ? class636.field8942.method2872((byte) 11, super.field4215) : null;
                class428 var10 = super.field4183 == -1 || super.field4217 && var9 != null ? null : class636.field8942.method2872((byte) 11, super.field4183);
                class55 var11 = class332.method2283(this.field8354.field9935 & 65535, arg1, this.field8354.field9965 & 255, var10 != null ? var10 : var9, this.field8354.field9949, super.field4204, super.field4266[0], this.field8354.field9937 & 65535, (byte) -118, super.field4228, var10 == null ? super.field4209 : super.field4184, super.field4166, 255 & this.field8354.field9936, var4);
                if (var11 != null) {
                    super.field4258 = true;
                    arg1.method334(false);
                    if (!class534.field7778) {
                        var11.method606(var3, (class306) null, 0);
                    } else {
                        var11.method613(var3, (class306) null, class609.field8652, 0);
                    }
                    arg1.method334(true);
                }
            }
            var3.method506(var4);
            var3.method505(super.field9696, super.field9701 - 5 + -super.field4181, super.field9705);
            class468 var12 = null;
            if (this.method3441(-127)) {
                var12 = class429.method2720(super.field4266.length, 0);
            }
            this.method1836(arg1, var3, super.field4266, 104, false);
            if (class534.field7778) {
                for (int var13 = 0; ~var13 > ~super.field4266.length; ++var13) {
                    if (super.field4266[var13] != null) {
                        super.field4266[var13].method613(var3, var12 != null ? var12.field6948[var13] : null, class609.field8652, 0);
                    }
                }
            } else {
                for (int var14 = 0; super.field4266.length > var14; ++var14) {
                    if (super.field4266[var14] != null) {
                        super.field4266[var14].method606(var3, var12 == null ? null : var12.field6948[var14], 0);
                    }
                }
            }
            if (super.field4260 != null) {
                class79 var15 = super.field4260.method3250();
                if (class534.field7778) {
                    arg1.method320(var15, class609.field8652);
                } else {
                    arg1.method354(var15);
                }
            }
            for (int var16 = 0; super.field4266.length > var16; ++var16) {
                if (super.field4266[var16] != null) {
                    super.field4258 |= super.field4266[var16].method614();
                }
            }
            super.field4266[0] = super.field4266[1] = super.field4266[2] = null;
            super.field4237 = class607.field8632;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IBZIII)V")
    public final void method3440(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5) {
        super.field9695 = super.field9703 = (byte) arg4;
        ++field8359;
        if (class437.method2774(true, arg3, arg5)) {
            ++super.field9703;
        }
        if (~super.field4215 != 0 && ~class636.field8942.method2872((byte) 11, super.field4215).field6528 == -2) {
            super.field4174 = null;
            super.field4215 = -1;
        }
        if (~super.field4220 != 0) {
            class578 var7 = class65.field826.method3686(false, super.field4220);
            if (var7.field8230 && var7.field8241 != -1 && class636.field8942.method2872((byte) 11, var7.field8241).field6528 == 1) {
                super.field4220 = -1;
            }
        }
        if (~super.field4170 != 0) {
            class578 var8 = class65.field826.method3686(false, super.field4170);
            if (var8.field8230 && var8.field8241 != -1 && ~class636.field8942.method2872((byte) 11, var8.field8241).field6528 == -2) {
                super.field4170 = -1;
            }
        }
        if (arg1 != 114) {
            this.method392(true, -20, (class167) null, 2);
        }
        if (!arg2) {
            int var9 = arg3 - super.field4264[0];
            int var10 = -super.field4265[0] + arg5;
            if (~var9 <= 7 && ~var9 >= -9 && var10 >= -8 && ~var10 >= -9) {
                if (super.field4267 < 9) {
                    ++super.field4267;
                }
                for (int var11 = super.field4267; var11 > 0; --var11) {
                    super.field4264[var11] = super.field4264[var11 + -1];
                    super.field4265[var11] = super.field4265[var11 + -1];
                    super.field4263[var11] = super.field4263[var11 - 1];
                }
                super.field4264[0] = arg3;
                super.field4265[0] = arg5;
                super.field4263[0] = 1;
                return;
            }
        }
        super.field4267 = 0;
        super.field4259 = 0;
        super.field4264[0] = arg3;
        super.field4262 = 0;
        super.field4265[0] = arg5;
        super.field9696 = (super.field4264[0] << 9) + (arg0 << 8);
        super.field9705 = (super.field4265[0] << 9) + (arg0 << 8);
        if (super.field4260 != null) {
            super.field4260.method3258();
        }
    }

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "(B)V")
    public final void method404(byte arg0) {
        ++field8371;
        if (arg0 > -40) {
            this.method3443((class167) null, -31, 46);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZILr;I)Z")
    public final boolean method392(boolean arg0, int arg1, class167 arg2, int arg3) {
        ++field8356;
        if (this.field8354 != null && this.method3443(arg2, 19571, 131072)) {
            class393 var5 = arg2.method339();
            int var6 = super.field4244.method1707(-47);
            var5.method506(var6);
            var5.method505(super.field9696, super.field9701, super.field9705);
            boolean var7 = arg0;
            for (int var8 = 0; var8 < super.field4266.length; ++var8) {
                if (super.field4266[var8] != null) {
                    boolean var9 = ~this.field8354.field9956 == 0 ? ~this.field8354.field9949 == -2 : ~this.field8354.field9956 == -2;
                    boolean var10;
                    if (class534.field7778) {
                        var10 = super.field4266[var8].method598(arg3, arg1, var5, var9, class609.field8652);
                    } else {
                        var10 = super.field4266[var8].method648(arg3, arg1, var5, var9);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            super.field4266[0] = super.field4266[1] = super.field4266[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BLr;)Lll;")
    public final class334 method408(byte arg0, class167 arg1) {
        ++field8378;
        if (arg0 != 111) {
            this.method392(false, -78, (class167) null, -113);
        }
        return null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIILr;ZILpn;)V")
    public final void method415(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, int arg5, class692 arg6) {
        ++field8364;
        if (arg2 != 1) {
            field8379 = 33;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "(B)Z")
    public final boolean method398(byte arg0) {
        ++field8376;
        if (arg0 >= -92) {
            this.method3441(93);
        }
        return false;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)I")
    public final int method1838(byte arg0) {
        ++field8369;
        if (arg0 < 115) {
            return -118;
        } else {
            if (this.field8354.field9912 != null) {
                class705 var2 = this.field8354.method3973(true, class539.field7869);
                if (var2 != null && var2.field9923 != -1) {
                    return var2.field9923;
                }
            }
            return this.field8354.field9923;
        }
    }

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "(I)Z")
    private final boolean method3441(int arg0) {
        if (arg0 >= -68) {
            field8374 = 91;
        }
        ++field8360;
        return this.field8354.field9981;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BLms;)V")
    public final void method3442(byte arg0, class705 arg1) {
        int var3 = -55 % ((arg0 - 37) / 50);
        ++field8367;
        this.field8354 = arg1;
        if (super.field4260 != null) {
            super.field4260.method3258();
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lr;II)Z")
    private final boolean method3443(class167 arg0, int arg1, int arg2) {
        ++field8368;
        if (arg1 != 19571) {
            this.field8377 = 63;
        }
        int var4 = arg2;
        class642 var5 = this.method1856(1208);
        class428 var6 = ~super.field4215 != 0 && super.field4150 == 0 ? class636.field8942.method2872((byte) 11, super.field4215) : null;
        class428 var7 = super.field4183 == -1 || super.field4217 && var6 != null ? null : class636.field8942.method2872((byte) 11, super.field4183);
        int var8 = var5.field9007;
        int var9 = var5.field9012;
        if (var8 != 0 || var9 != 0 || ~var5.field9044 != -1 || var5.field9016 != 0) {
            arg2 |= 7;
        }
        boolean var10 = ~super.field4241 != -1 && ~super.field4198 >= ~class562.field8084 && ~super.field4172 < ~class562.field8084;
        if (var10) {
            arg2 |= 524288;
        }
        int var11 = super.field4244.method1707(-45);
        class55 var12 = super.field4266[0] = this.field8354.method3977(var11, var6, var7, super.field4192, super.field4194, class472.field6988, super.field4184, super.field4178, super.field4189, super.field4188, arg2, super.field4201, super.field4209, class539.field7869, arg0, arg1 + -19715, class636.field8942);
        if (var12 == null) {
            return false;
        } else {
            super.field4235 = var12.method623();
            super.field4156 = var12.method612();
            this.method1839(var12, arg1 + -19571);
            if (var8 == 0 && var9 == 0) {
                this.method1852(0, this.method1841(arg1 ^ 7547) << 9, 0, this.method1841(arg1 + 1173) << 9, 76, var11);
            } else {
                this.method1852(var5.field9037, var8, var5.field8998, var9, 89, var11);
                if (super.field4228 != 0) {
                    super.field4266[0].method644(super.field4228);
                }
                if (super.field4204 != 0) {
                    super.field4266[0].method610(super.field4204);
                }
                if (~super.field4166 != -1) {
                    super.field4266[0].method639(0, super.field4166, 0);
                }
            }
            if (var10) {
                var12.method636(super.field4162, super.field4218, super.field4251, super.field4241 & 255);
            }
            if (super.field4220 != -1 && ~super.field4240 != 0) {
                class578 var13 = class65.field826.method3686(false, super.field4220);
                boolean var14 = var13.field8228 == 3 && (var8 != 0 || ~var9 != -1);
                int var15 = var4;
                if (var14) {
                    var15 = var4 | 7;
                } else {
                    if (super.field4157 != 0) {
                        var15 = var4 | 5;
                    }
                    if (super.field4207 != 0) {
                        var15 |= 2;
                    }
                }
                class55 var16 = super.field4266[1] = var13.method3382(super.field4240, class636.field8942, super.field4234, arg0, super.field4210, var15, -11243);
                if (var16 != null) {
                    if (~super.field4207 != -1) {
                        var16.method639(0, -super.field4207 << 2, 0);
                    }
                    if (~super.field4157 != -1) {
                        var16.method618(super.field4157 * 2048);
                    }
                    if (var14) {
                        if (super.field4228 != 0) {
                            var16.method644(super.field4228);
                        }
                        if (super.field4204 != 0) {
                            var16.method610(super.field4204);
                        }
                        if (~super.field4166 != -1) {
                            var16.method639(0, super.field4166, 0);
                        }
                    }
                }
            } else {
                super.field4266[1] = null;
            }
            if (super.field4170 != -1 && super.field4153 != -1) {
                class578 var17 = class65.field826.method3686(false, super.field4170);
                boolean var18 = var17.field8228 == 3 && (~var8 != -1 || ~var9 != -1);
                int var19 = var4;
                if (!var18) {
                    if (super.field4230 != 0) {
                        var19 = var4 | 5;
                    }
                    if (~super.field4238 != -1) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class55 var20 = super.field4266[2] = var17.method3381(arg1 + -19571, arg0, var19, super.field4158, super.field4153, class636.field8942, super.field4165);
                if (var20 != null) {
                    if (~super.field4238 != -1) {
                        var20.method639(0, -super.field4238 << 2, 0);
                    }
                    if (super.field4230 != 0) {
                        var20.method618(super.field4230 * 2048);
                    }
                    if (var18) {
                        if (super.field4228 != 0) {
                            var20.method644(super.field4228);
                        }
                        if (super.field4204 != 0) {
                            var20.method610(super.field4204);
                        }
                        if (super.field4166 != 0) {
                            var20.method639(0, super.field4166, 0);
                        }
                    }
                }
            } else {
                super.field4266[2] = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lr;Z)V")
    public final void method412(class167 arg0, boolean arg1) {
        ++field8373;
        if (this.field8354 != null) {
            if (super.field4261 || this.method3443(arg0, 19571, 0)) {
                class393 var3 = arg0.method339();
                if (arg1) {
                    field8381 = null;
                }
                var3.method506(super.field4244.method1707(-26));
                var3.method505(super.field9696, super.field9701 + -20, super.field9705);
                this.method1836(arg0, var3, super.field4266, 96, super.field4261);
                super.field4266[0] = super.field4266[1] = super.field4266[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "(B)V")
    public static void method3444(byte arg0) {
        field8363 = null;
        field8381 = null;
        field8362 = null;
        if (arg0 <= 100) {
            field8379 = 5;
        }
    }

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "(I)V")
    public static final void method3445(int arg0) {
        ++field8365;
        class640 var1 = (class640) class580.field8270.method3465((byte) -123);
        if (arg0 >= 51) {
            while (var1 != null) {
                if (~var1.field8983 != 0) {
                    var1.method707((byte) -45);
                } else {
                    var1.field8979 = 0;
                    if (~var1.field8975 <= -1 && ~var1.field8980 <= -1 && var1.field8975 < class275.field4426 && var1.field8980 < class417.field6374) {
                        class455.method2863(var1, -89);
                    }
                }
                var1 = (class640) class580.field8270.method3469(0);
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(B)I")
    public final int method1848(byte arg0) {
        ++field8357;
        if (this.field8354.field9912 != null) {
            class705 var2 = this.field8354.method3973(true, class539.field7869);
            if (var2 != null && ~var2.field9961 != 0) {
                return var2.field9961;
            }
        }
        if (arg0 < 72) {
            field8381 = null;
        }
        return this.field8354.field9961 != -1 ? this.field8354.field9961 : super.method1848((byte) 94);
    }

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "(I)Z")
    public final boolean method3446(int arg0) {
        ++field8355;
        if (this.field8354 == null) {
            return false;
        } else {
            return arg0 == 160;
        }
    }
}
