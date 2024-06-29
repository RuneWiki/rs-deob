import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class665 extends class330 {

    @OriginalMember(owner = "client!av", name = "jd", descriptor = "I")
    public int field9255 = -1;

    @OriginalMember(owner = "client!av", name = "ed", descriptor = "I")
    public int field9250 = 1;

    @OriginalMember(owner = "client!av", name = "qd", descriptor = "I")
    public int field9262 = 1;

    @OriginalMember(owner = "client!av", name = "pd", descriptor = "I")
    public int field9261 = -1;

    @OriginalMember(owner = "client!av", name = "Pc", descriptor = "I")
    public static int field9235;

    @OriginalMember(owner = "client!av", name = "Qc", descriptor = "I")
    public static int field9236;

    @OriginalMember(owner = "client!av", name = "Rc", descriptor = "I")
    public static int field9237;

    @OriginalMember(owner = "client!av", name = "Sc", descriptor = "I")
    public static int field9238;

    @OriginalMember(owner = "client!av", name = "Tc", descriptor = "I")
    public static int field9239;

    @OriginalMember(owner = "client!av", name = "Vc", descriptor = "I")
    public static int field9241;

    @OriginalMember(owner = "client!av", name = "Wc", descriptor = "I")
    public static int field9242;

    @OriginalMember(owner = "client!av", name = "Yc", descriptor = "I")
    public static int field9244;

    @OriginalMember(owner = "client!av", name = "Zc", descriptor = "I")
    public static int field9245;

    @OriginalMember(owner = "client!av", name = "ad", descriptor = "I")
    public static int field9246;

    @OriginalMember(owner = "client!av", name = "bd", descriptor = "I")
    public static int field9247;

    @OriginalMember(owner = "client!av", name = "cd", descriptor = "I")
    public int field9248;

    @OriginalMember(owner = "client!av", name = "dd", descriptor = "I")
    public static int field9249;

    @OriginalMember(owner = "client!av", name = "fd", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!av", name = "hd", descriptor = "I")
    public static int field9253;

    @OriginalMember(owner = "client!av", name = "id", descriptor = "I")
    public static int field9254;

    @OriginalMember(owner = "client!av", name = "kd", descriptor = "I")
    public static int field9256;

    @OriginalMember(owner = "client!av", name = "ld", descriptor = "I")
    public static int field9257;

    @OriginalMember(owner = "client!av", name = "md", descriptor = "I")
    public static int field9258;

    @OriginalMember(owner = "client!av", name = "nd", descriptor = "I")
    public static int field9259;

    @OriginalMember(owner = "client!av", name = "od", descriptor = "I")
    public static int field9260;

    @OriginalMember(owner = "client!av", name = "rd", descriptor = "I")
    public static int field9263;

    @OriginalMember(owner = "client!av", name = "sd", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!av", name = "td", descriptor = "I")
    public static int field9265;

    @OriginalMember(owner = "client!av", name = "ud", descriptor = "I")
    public static int field9266;

    @OriginalMember(owner = "client!av", name = "Uc", descriptor = "Lqha;")
    public class110 field9240;

    @OriginalMember(owner = "client!av", name = "gd", descriptor = "Ljka;")
    public class688 field9252;

    @OriginalMember(owner = "client!av", name = "Xc", descriptor = "Ljava/lang/String;")
    public String field9243;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lqha;I)V", line = 4)
    public final void method3783(class110 arg0, int arg1) {
        ++field9238;
        int var3 = 14 / ((68 - arg1) / 58);
        this.field9240 = arg0;
        if (this.field9240 != null) {
            this.field9243 = this.field9240.field1630;
            this.field9248 = this.field9240.field1664;
        }
        if (super.field4669 != null) {
            super.field4669.method3452();
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIBII[III)V", line = 25)
    public static final void method3784(int arg0, int arg1, byte arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        ++field9236;
        if (arg3 > 0 && !class262.method1704(arg3, 3)) {
            throw new IllegalArgumentException("");
        } else if (~arg0 < -1 && !class262.method1704(arg0, 3)) {
            throw new IllegalArgumentException("");
        } else {
            if (arg2 < 9) {
                field9257 = 94;
            }
            if (arg7 != 32993) {
                throw new IllegalArgumentException("");
            } else {
                int var8 = 0;
                int var9 = arg0 > arg3 ? arg3 : arg0;
                int var10 = arg3 >> 1;
                int var11 = arg0 >> 1;
                int[] var12 = arg5;
                int[] var13 = new int[var10 * var11];
                while (true) {
                    OpenGL.glTexImage2Di(arg1, var8, arg6, arg3, arg0, 0, arg7, arg4, var12, 0);
                    if (~var9 >= -2) {
                        return;
                    }
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = arg3 + var15;
                    for (int var17 = 0; ~var17 > ~var11; ++var17) {
                        for (int var19 = 0; ~var10 < ~var19; ++var19) {
                            int var20 = var12[var15++];
                            int var21 = var12[var16++];
                            int var22 = var12[var15++];
                            int var23 = (var20 & 16753402) >> 16;
                            int var24 = 255 & var20 >> 24;
                            int var25 = var12[var16++];
                            int var26 = var20 & 255;
                            int var27 = (var20 & 65477) >> 8;
                            int var28 = ((65350 & var22) >> 8) + var27;
                            int var29 = (var22 >> 24 & 255) + var24;
                            int var30 = ((var22 & 16730307) >> 16) + var23;
                            int var31 = (255 & var22) + var26;
                            int var32 = ((65514 & var21) >> 8) + var28;
                            int var33 = (var21 >> 16 & 255) + var30;
                            int var34 = (255 & var21 >> 24) + var29;
                            int var35 = (255 & var21) + var31;
                            int var36 = (255 & var25 >> 24) + var34;
                            int var37 = ((var25 & 16762720) >> 16) + var33;
                            int var38 = (255 & var25 >> 8) + var32;
                            int var39 = (var25 & 255) + var35;
                            var13[var14++] = class746.method4158(class746.method4158(class702.method3977(1020, var38) << 6, class746.method4158(class702.method3977(16711680, var37 << 14), class702.method3977(var36, 1020) << 22)), class702.method3977(var39 >> 2, 255));
                        }
                        var15 += arg3;
                        var16 += arg3;
                    }
                    int[] var18 = var13;
                    var13 = var12;
                    arg3 = var10;
                    arg0 = var11;
                    var12 = var18;
                    var11 >>= 1;
                    ++var8;
                    var9 >>= 1;
                    var10 >>= 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(B)I", line = 132)
    public final int method2104(byte arg0) {
        ++field9239;
        if (this.field9240.field1657 != null) {
            class110 var2 = this.field9240.method840(class537.field7727, 75);
            if (var2 != null && ~var2.field1642 != 0) {
                return var2.field1642;
            }
        }
        if (arg0 >= -36) {
            this.method2104((byte) -106);
        }
        return this.field9240.field1642 == -1 ? super.method2104((byte) -63) : this.field9240.field1642;
    }

    @OriginalMember(owner = "client!av", name = "f", descriptor = "(B)I", line = 153)
    public final int method2546(byte arg0) {
        ++field9251;
        if (this.field9240 == null) {
            return 0;
        } else {
            int var2 = 29 / ((-27 - arg0) / 42);
            return this.field9240.field1677;
        }
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(ILha;)V", line = 171)
    public final void method912(int arg0, class65 arg1) {
        ++field9258;
        if (this.field9240 != null) {
            if (arg0 <= 52) {
                this.method905(false, (class421) null, -82, 118, 54, (class65) null, -97);
            }
            if (super.field4678 || this.method3785(0, arg1, true)) {
                class326 var3 = arg1.method514();
                var3.method1868(super.field4647.method4200((byte) -3));
                var3.method1878(super.field5742, super.field5741 + -20, super.field5746);
                this.method2098(-1, arg1, super.field4678, var3, super.field4673);
                for (int var4 = 0; var4 < super.field4673.length; ++var4) {
                    super.field4673[var4] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "k", descriptor = "(I)I", line = 204)
    public final int method2101(int arg0) {
        ++field9247;
        if (this.field9240.field1657 != null) {
            class110 var2 = this.field9240.method840(class537.field7727, 116);
            if (var2 != null && ~var2.field1660 != 0) {
                return var2.field1660;
            }
        }
        return arg0 >= -62 ? 55 : this.field9240.field1660;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(Lha;I)Lrn;", line = 227)
    public final class281 method901(class65 arg0, int arg1) {
        if (arg1 < 50) {
            this.field9252 = null;
        }
        ++field9256;
        return null;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ILha;Z)Z", line = 239)
    private final boolean method3785(int arg0, class65 arg1, boolean arg2) {
        ++field9237;
        int var4 = arg0;
        if (!arg2) {
            field9264 = 77;
        }
        class539 var5 = this.method2096(0);
        class607 var6 = super.field4604 != -1 && super.field4580 == 0 ? class563.field7993.method651(super.field4604, (byte) 103) : null;
        class607 var7 = ~super.field4659 == 0 || super.field4615 && var6 != null ? null : class563.field7993.method651(super.field4659, (byte) 95);
        int var8 = var5.field7775;
        int var9 = var5.field7791;
        if (var8 != 0 || ~var9 != -1 || var5.field7759 != 0 || ~var5.field7761 != -1) {
            arg0 |= 7;
        }
        boolean var10 = super.field4662 != 0 && ~super.field4663 >= ~class192.field2961 && class192.field2961 < super.field4627;
        if (var10) {
            arg0 |= 524288;
        }
        int var11 = super.field4647.method4200((byte) -3);
        class496 var12 = super.field4673[0] = this.field9240.method847(this.field9252, super.field4597, class541.field7792, var6, super.field4605, class563.field7993, var7, arg0, false, super.field4634, super.field4657, class537.field7727, super.field4575, super.field4646, super.field4583, arg1, super.field4608, var11);
        if (var12 == null) {
            return false;
        } else {
            super.field4599 = var12.method118();
            super.field4648 = var12.method75();
            this.method2107((byte) -45, var12);
            if (~var8 == -1 && ~var9 == -1) {
                this.method2110(0, this.method2102(true) << 9, 0, -8193, this.method2102(arg2) << 9, var11);
            } else {
                this.method2110(var5.field7782, var8, var5.field7778, -8193, var9, var11);
                if (~super.field4654 != -1) {
                    super.field4673[0].method78(super.field4654);
                }
                if (~super.field4574 != -1) {
                    super.field4673[0].method74(super.field4574);
                }
                if (super.field4614 != 0) {
                    super.field4673[0].method114(0, super.field4614, 0);
                }
            }
            if (var10) {
                var12.method98(super.field4582, super.field4579, super.field4665, 255 & super.field4662);
            }
            this.method2106(var5, var9, var11, var4, 0, var8, arg1);
            return true;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IZIBIII)V", line = 303)
    public static final void method3786(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class287.field4226 = arg0;
        class778.field10686 = arg6;
        class345.field4813 = arg5;
        class309.field4420 = arg4;
        ++field9266;
        if (arg3 != 11) {
            field9264 = 105;
        }
        class791.field10878 = arg2;
        if (arg1 && ~class309.field4420 <= -101) {
            class614.field8619 = class287.field4226 * 512 - -256;
            class472.field6622 = class345.field4813 * 512 + 256;
            class546.field7862 = class702.method3970(class614.field8619, class368.field5113, arg3 + -20114, class472.field6622) - class778.field10686;
        }
        class375.field5176 = -1;
        class429.field5830 = -1;
        class416.field5704 = 2;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIILha;)Z", line = 330)
    public final boolean method902(int arg0, int arg1, int arg2, class65 arg3) {
        ++field9245;
        if (this.field9240 != null && this.method3785(131072, arg3, true)) {
            class326 var5 = arg3.method514();
            int var6 = super.field4647.method4200((byte) -3);
            var5.method1868(var6);
            var5.method1878(super.field5742, super.field5741, super.field5746);
            boolean var7 = false;
            for (int var8 = 0; ~super.field4673.length < ~var8; ++var8) {
                if (super.field4673[var8] != null) {
                    boolean var10000;
                    label56: {
                        if (this.field9240.field1677 <= 0) {
                            label54: {
                                if (~this.field9240.field1621 == 0) {
                                    if (~this.field9240.field1635 == -2) {
                                        break label54;
                                    }
                                    var10000 = false;
                                } else {
                                    if (~this.field9240.field1621 == -2) {
                                        break label54;
                                    }
                                    var10000 = false;
                                }
                                if (!var10000) {
                                    var10000 = false;
                                    break label56;
                                }
                            }
                        }
                        var10000 = true;
                    }
                    boolean var9 = var10000;
                    boolean var10;
                    if (!class576.field8120) {
                        var10 = super.field4673[var8].method95(arg0, arg2, var5, var9, this.field9240.field1677);
                    } else {
                        var10 = super.field4673[var8].method77(arg0, arg2, var5, var9, this.field9240.field1677, class740.field10205);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            if (arg1 != -17458) {
                this.field9240 = null;
            }
            for (int var11 = 0; super.field4673.length > var11; ++var11) {
                super.field4673[var11] = null;
            }
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ZLje;IIILha;I)V", line = 392)
    public final void method905(boolean arg0, class421 arg1, int arg2, int arg3, int arg4, class65 arg5, int arg6) {
        if (arg2 == 0) {
            ++field9263;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!av", name = "m", descriptor = "(I)Z", line = 403)
    public final boolean method3787(int arg0) {
        ++field9241;
        if (this.field9240 == null) {
            return false;
        } else {
            if (arg0 != 255) {
                this.method2101(-128);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIZIIZ)V", line = 417)
    public final void method3788(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        super.field5755 = super.field5749 = (byte) arg1;
        ++field9242;
        if (class124.method941(4, arg4, arg3)) {
            ++super.field5749;
        }
        if (super.field4604 != -1 && class563.field7993.method651(super.field4604, (byte) 94).field8503 == 1) {
            super.field4604 = -1;
            super.field4609 = null;
        }
        for (int var7 = 0; ~var7 > ~super.field4638.length; ++var7) {
            if (~super.field4638[var7].field10142 != 0) {
                class278 var11 = class456.field6385.method2382(super.field4638[var7].field10142, (byte) -115);
                if (var11.field4042 && var11.field4040 != -1 && class563.field7993.method651(var11.field4040, (byte) 98).field8503 == 1) {
                    super.field4638[var7].field10142 = -1;
                }
            }
        }
        if (!arg2) {
            int var8 = -super.field4670[0] + arg3;
            int var9 = -super.field4672[0] + arg4;
            if (~var8 <= 7 && ~var8 >= -9 && var9 >= -8 && ~var9 >= -9) {
                if (super.field4668 < 9) {
                    ++super.field4668;
                }
                for (int var10 = super.field4668; ~var10 < -1; --var10) {
                    super.field4670[var10] = super.field4670[var10 - 1];
                    super.field4672[var10] = super.field4672[var10 + -1];
                    super.field4674[var10] = super.field4674[var10 + -1];
                }
                super.field4670[0] = arg3;
                super.field4672[0] = arg4;
                super.field4674[0] = 1;
                return;
            }
        }
        super.field4670[0] = arg3;
        super.field4668 = 0;
        super.field4676 = 0;
        super.field4675 = 0;
        super.field4672[0] = arg4;
        super.field5746 = (super.field4672[0] << 9) + (arg0 << 8);
        super.field5742 = (super.field4670[0] << 9) - -(arg0 << 8);
        if (!arg5) {
            this.method910(false);
        }
        if (super.field4669 != null) {
            super.field4669.method3452();
        }
    }

    @OriginalMember(owner = "client!av", name = "n", descriptor = "(I)V", line = 502)
    public static final void method3789(int arg0) {
        ++field9260;
        int var1 = 40 % ((arg0 - -27) / 60);
        if (~class671.field9338 > -1) {
            class138.field2063 = -1;
            class67.field823 = -1;
            class671.field9338 = 0;
        }
        if (class117.field1816 < class671.field9338) {
            class138.field2063 = -1;
            class67.field823 = -1;
            class671.field9338 = class117.field1816;
        }
        if (class752.field10398 < 0) {
            class67.field823 = -1;
            class138.field2063 = -1;
            class752.field10398 = 0;
        }
        if (class752.field10398 > class117.field1803) {
            class752.field10398 = class117.field1803;
            class138.field2063 = -1;
            class67.field823 = -1;
        }
    }

    @OriginalMember(owner = "client!av", name = "g", descriptor = "(I)V", line = 543)
    public final void method903(int arg0) {
        ++field9253;
        if (arg0 != -772) {
            this.method2546((byte) 109);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lha;I)Lmaa;", line = 556)
    public final class495 method918(class65 arg0, int arg1) {
        ++field9265;
        if (this.field9240 != null && this.method3785(2048, arg0, true)) {
            class326 var3 = arg0.method514();
            int var4 = super.field4647.method4200((byte) -3);
            var3.method1868(var4);
            class46 var5 = class767.field10562[super.field5755][super.field5742 >> class645.field9018][super.field5746 >> class645.field9018];
            if (var5 != null && var5.field587 != null) {
                int var6 = super.field4630 - var5.field587.field5479;
                super.field4630 = (int) ((float) super.field4630 - (float) var6 / 10.0F);
            } else {
                super.field4630 = (int) ((float) super.field4630 - (float) super.field4630 / 10.0F);
            }
            var3.method1878(super.field5742, -super.field4630 + -20 + super.field5741, super.field5746);
            class539 var7 = this.method2096(0);
            class110 var8 = this.field9240.field1657 == null ? this.field9240 : this.field9240.method840(class537.field7727, arg1 ^ 30563);
            super.field4677 = false;
            class495 var9 = null;
            if (class21.field353.field10069.method1229(-29) == 1 && var8.field1649 && var7.field7768) {
                class607 var10 = ~super.field4604 != 0 && ~super.field4580 == -1 ? class563.field7993.method651(super.field4604, (byte) 110) : null;
                class607 var11 = super.field4659 == -1 || super.field4615 && var10 != null ? null : class563.field7993.method651(super.field4659, (byte) 111);
                class496 var12 = class563.method3324(var4, true, arg0, super.field4654, 65535 & this.field9240.field1643, var11 == null ? var10 : var11, 255 & this.field9240.field1680, var11 != null ? super.field4634 : super.field4583, super.field4614, this.field9240.field1635, this.field9240.field1646 & 65535, this.field9240.field1639 & 255, super.field4673[0], super.field4574);
                if (var12 != null) {
                    var9 = class86.method652(this.method3790((byte) 125), 0, super.field4673.length + 1);
                    super.field4677 = true;
                    arg0.method544(false);
                    if (class576.field8120) {
                        var12.method106(var3, var9.field7067[super.field4673.length], class740.field10205, 0);
                    } else {
                        var12.method88(var3, var9.field7067[super.field4673.length], 0);
                    }
                    arg0.method544(true);
                }
            }
            var3.method1868(var4);
            var3.method1878(super.field5742, super.field5741 + -5 + -super.field4630, super.field5746);
            if (var9 == null) {
                var9 = class86.method652(this.method3790((byte) 111), 0, super.field4673.length);
            }
            this.method2098(arg1 ^ 30513, arg0, false, var3, super.field4673);
            if (!class576.field8120) {
                for (int var13 = 0; super.field4673.length > var13; ++var13) {
                    if (super.field4673[var13] != null) {
                        super.field4673[var13].method88(var3, var9.field7067[var13], 0);
                    }
                }
            } else {
                for (int var14 = 0; super.field4673.length > var14; ++var14) {
                    if (super.field4673[var14] != null) {
                        super.field4673[var14].method106(var3, var9.field7067[var14], class740.field10205, 0);
                    }
                }
            }
            if (arg1 != -30514) {
                field9264 = -32;
            }
            if (super.field4669 != null) {
                class296 var15 = super.field4669.method3450();
                if (class576.field8120) {
                    arg0.method541(var15, class740.field10205);
                } else {
                    arg0.method504(var15);
                }
            }
            for (int var16 = 0; super.field4673.length > var16; ++var16) {
                if (super.field4673[var16] != null) {
                    super.field4677 |= super.field4673[var16].method121();
                }
            }
            super.field4673[0] = super.field4673[1] = super.field4673[2] = null;
            super.field4612 = class746.field10346;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!av", name = "i", descriptor = "(B)Z", line = 684)
    private final boolean method3790(byte arg0) {
        if (arg0 < 101) {
            this.field9250 = 7;
        }
        ++field9235;
        return this.field9240.field1662;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lmi;BIIII)V", line = 695)
    public static final void method3791(class520 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9249;
        if (arg1 != 101) {
            method3786(12, false, 81, (byte) -92, -54, -24, -40);
        }
        if (arg4 >= 1 && ~arg2 <= -2 && arg4 <= class768.field10571 + -2 && class350.field4898 + -2 >= arg2) {
            if (class767.field10562 == null) {
                return;
            }
            class484 var6 = class442.field6036.method2372(arg3, 0, arg5, arg2, arg4);
            if (var6 != null) {
                if (var6 instanceof class291) {
                    ((class291) var6).method1866(arg1 + -101, arg0);
                    return;
                }
                if (var6 instanceof class583) {
                    ((class583) var6).method3410(arg0, (byte) 88);
                    return;
                }
                if (var6 instanceof class216) {
                    ((class216) var6).method1486(true, arg0);
                    return;
                }
                if (var6 instanceof class715) {
                    ((class715) var6).method4018((byte) 113, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(Z)Z", line = 764)
    public final boolean method910(boolean arg0) {
        if (!arg0) {
            this.method3788(80, 2, false, 54, -120, true);
        }
        ++field9246;
        return false;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)I", line = 775)
    public final int method2094(byte arg0) {
        ++field9254;
        if (arg0 > -105) {
            this.field9250 = -41;
        }
        if (this.field9240.field1657 != null) {
            class110 var2 = this.field9240.method840(class537.field7727, 75);
            if (var2 != null && var2.field1631 != -1) {
                return var2.field1631;
            }
        }
        return this.field9240.field1631;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(BII)V", line = 797)
    public final void method3792(byte arg0, int arg1, int arg2) {
        ++field9244;
        int var4 = super.field4670[0];
        int var5 = super.field4672[0];
        if (~arg2 == -1) {
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
        if (~arg2 == -6) {
            --var4;
            --var5;
        }
        if (~arg2 == -7) {
            --var4;
        }
        if (super.field4604 != -1 && class563.field7993.method651(super.field4604, (byte) 122).field8503 == 1) {
            super.field4604 = -1;
            super.field4609 = null;
        }
        if (arg2 == 7) {
            --var4;
            ++var5;
        }
        for (int var6 = 0; ~var6 > ~super.field4638.length; ++var6) {
            if (super.field4638[var6].field10142 != -1) {
                class278 var8 = class456.field6385.method2382(super.field4638[var6].field10142, (byte) -76);
                if (var8.field4042 && var8.field4040 != -1 && class563.field7993.method651(var8.field4040, (byte) 125).field8503 == 1) {
                    super.field4638[var6].field10142 = -1;
                }
            }
        }
        if (arg0 < -84) {
            if (super.field4668 < 9) {
                ++super.field4668;
            }
            for (int var7 = super.field4668; ~var7 < -1; --var7) {
                super.field4670[var7] = super.field4670[var7 - 1];
                super.field4672[var7] = super.field4672[var7 + -1];
                super.field4674[var7] = super.field4674[var7 - 1];
            }
            super.field4670[0] = var4;
            super.field4672[0] = var5;
            super.field4674[0] = (byte) arg1;
        }
    }
}
