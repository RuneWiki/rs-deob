import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class307 extends class687 {

    @OriginalMember(owner = "client!ac", name = "Rc", descriptor = "I")
    public int field3899 = -1;

    @OriginalMember(owner = "client!ac", name = "bd", descriptor = "I")
    public int field3909 = -1;

    @OriginalMember(owner = "client!ac", name = "Xc", descriptor = "Lec;")
    public static class146 field3905 = new class146(2);

    @OriginalMember(owner = "client!ac", name = "kd", descriptor = "Lqfa;")
    public static class372 field3918 = new class372("", 11);

    @OriginalMember(owner = "client!ac", name = "Qc", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!ac", name = "Sc", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!ac", name = "Tc", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!ac", name = "Vc", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!ac", name = "Wc", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!ac", name = "Yc", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!ac", name = "Zc", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!ac", name = "ad", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!ac", name = "cd", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!ac", name = "dd", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!ac", name = "ed", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!ac", name = "fd", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!ac", name = "gd", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!ac", name = "hd", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!ac", name = "id", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!ac", name = "jd", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!ac", name = "ld", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!ac", name = "md", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!ac", name = "nd", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!ac", name = "Uc", descriptor = "Ldu;")
    public class586 field3902;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(ZLr;)V")
    public final void method67(boolean arg0, class566 arg1) {
        ++field3914;
        if (this.field3902 != null) {
            if (super.field9750 || this.method1780(21918, arg1, 0)) {
                class491 var3 = arg1.method995();
                if (arg0) {
                    this.field3909 = -13;
                }
                var3.method908(super.field9672.method2911((byte) 67));
                var3.method903(super.field6461, super.field6458 - 20, super.field6464);
                this.method3868(var3, super.field9750, arg1, super.field9751, (byte) -58);
                super.field9751[0] = super.field9751[1] = super.field9751[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)I")
    public final int method1770(boolean arg0) {
        ++field3903;
        if (arg0) {
            return -84;
        } else {
            if (this.field3902.field8205 != null) {
                class586 var2 = this.field3902.method3220(-4261, class684.field9606);
                if (var2 != null && ~var2.field8191 != 0) {
                    return var2.field8191;
                }
            }
            return this.field3902.field8191;
        }
    }

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "(B)Z")
    private final boolean method1771(byte arg0) {
        if (arg0 != 89) {
            field3918 = null;
        }
        ++field3898;
        return this.field3902.field8180;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lr;I)Lsd;")
    public final class362 method82(class566 arg0, int arg1) {
        if (arg1 != -1660704056) {
            return null;
        } else {
            ++field3910;
            return null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZIBLr;Llo;II)V")
    public final void method77(boolean arg0, int arg1, byte arg2, class566 arg3, class488 arg4, int arg5, int arg6) {
        int var8 = -101 % ((-50 - arg2) / 55);
        ++field3916;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "(B)Z")
    public final boolean method79(byte arg0) {
        if (arg0 > -26) {
            return true;
        } else {
            ++field3920;
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZIBIII)V")
    public final void method1772(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field3919;
        super.field6470 = super.field6456 = (byte) arg4;
        if (class3.method22(arg1, arg5, 5706)) {
            ++super.field6456;
        }
        if (super.field9689 != -1 && class583.field8149.method1844(64, super.field9689).field4974 == 1) {
            super.field9689 = -1;
            super.field9691 = null;
        }
        if (super.field9687 != -1) {
            class388 var7 = class370.field4686.method3943((byte) 12, super.field9687);
            if (var7.field4876 && ~var7.field4895 != 0 && class583.field8149.method1844(64, var7.field4895).field4974 == 1) {
                super.field9687 = -1;
            }
        }
        if (super.field9669 != -1) {
            class388 var8 = class370.field4686.method3943((byte) 12, super.field9669);
            if (var8.field4876 && ~var8.field4895 != 0 && class583.field8149.method1844(64, var8.field4895).field4974 == 1) {
                super.field9669 = -1;
            }
        }
        if (!arg0) {
            int var9 = arg5 - super.field9758[0];
            int var10 = -super.field9754[0] + arg1;
            if (var9 >= -8 && var9 <= 8 && ~var10 <= 7 && ~var10 >= -9) {
                if (super.field9756 < 9) {
                    ++super.field9756;
                }
                for (int var11 = super.field9756; ~var11 < -1; --var11) {
                    super.field9758[var11] = super.field9758[var11 - 1];
                    super.field9754[var11] = super.field9754[var11 + -1];
                    super.field9752[var11] = super.field9752[var11 + -1];
                }
                super.field9758[0] = arg5;
                super.field9754[0] = arg1;
                super.field9752[0] = 1;
                return;
            }
        }
        super.field9753 = 0;
        super.field9756 = 0;
        super.field9758[0] = arg5;
        super.field9748 = 0;
        super.field9754[0] = arg1;
        super.field6461 = (super.field9758[0] << 9) + (arg3 << 8);
        super.field6464 = (super.field9754[0] << 9) + (arg3 << 8);
        if (super.field9755 != null) {
            super.field9755.method536();
        }
        int var12 = -117 / ((arg2 - -37) / 62);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)Z")
    public static final boolean method1773(int arg0, int arg1) {
        int var2 = 80 / ((-57 - arg1) / 46);
        ++field3912;
        return arg0 >= 4 && ~arg0 >= -9;
    }

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "(I)V")
    public static void method1774(int arg0) {
        if (arg0 == 18986) {
            field3918 = null;
            field3905 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)I")
    public final int method1775(byte arg0) {
        if (arg0 != -7) {
            this.method67(false, (class566) null);
        }
        ++field3913;
        if (this.field3902.field8205 != null) {
            class586 var2 = this.field3902.method3220(arg0 + -4254, class684.field9606);
            if (var2 != null && var2.field8176 != -1) {
                return var2.field8176;
            }
        }
        return this.field3902.field8176;
    }

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "(I)Z")
    public final boolean method1776(int arg0) {
        int var2 = 63 / ((arg0 - 55) / 41);
        ++field3911;
        return this.field3902 != null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIB)V")
    public final void method1777(int arg0, int arg1, byte arg2) {
        ++field3901;
        if (arg2 != -79) {
            this.field3909 = -76;
        }
        int var4 = super.field9758[0];
        int var5 = super.field9754[0];
        if (arg0 == 0) {
            ++var5;
        }
        if (~arg0 == -2) {
            ++var5;
            ++var4;
        }
        if (~arg0 == -3) {
            ++var4;
        }
        if (arg0 == 3) {
            ++var4;
            --var5;
        }
        if (~arg0 == -5) {
            --var5;
        }
        if (~arg0 == -6) {
            --var4;
            --var5;
        }
        if (~arg0 == -7) {
            --var4;
        }
        if (~super.field9689 != 0 && ~class583.field8149.method1844(64, super.field9689).field4974 == -2) {
            super.field9689 = -1;
            super.field9691 = null;
        }
        if (arg0 == 7) {
            --var4;
            ++var5;
        }
        if (super.field9687 != -1) {
            class388 var6 = class370.field4686.method3943((byte) 12, super.field9687);
            if (var6.field4876 && var6.field4895 != -1 && ~class583.field8149.method1844(64, var6.field4895).field4974 == -2) {
                super.field9687 = -1;
            }
        }
        if (~super.field9669 != 0) {
            class388 var7 = class370.field4686.method3943((byte) 12, super.field9669);
            if (var7.field4876 && ~var7.field4895 != 0 && class583.field8149.method1844(64, var7.field4895).field4974 == 1) {
                super.field9669 = -1;
            }
        }
        if (~super.field9756 > -10) {
            ++super.field9756;
        }
        for (int var8 = super.field9756; var8 > 0; --var8) {
            super.field9758[var8] = super.field9758[var8 + -1];
            super.field9754[var8] = super.field9754[var8 + -1];
            super.field9752[var8] = super.field9752[var8 + -1];
        }
        super.field9758[0] = var4;
        super.field9754[0] = var5;
        super.field9752[0] = (byte) arg1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[FIIIIB)V")
    public static final void method1778(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        ++field3900;
        if (arg2 > 0 && !class4.method36(arg2, (byte) 98)) {
            throw new IllegalArgumentException("");
        } else if (~arg0 < -1 && !class4.method36(arg0, (byte) 98)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class358.method1973(arg3, (byte) -116);
            int var8 = 0;
            int var9 = arg2 >= arg0 ? arg0 : arg2;
            int var10 = arg2 >> 1;
            int var11 = arg0 >> 1;
            float[] var12 = arg1;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg5, var8, arg4, arg2, arg0, 0, arg3, 5126, var12, 0);
                if (var9 <= 1) {
                    if (arg6 != -65) {
                        method1778(-9, (float[]) null, 89, 47, -70, -119, (byte) -2);
                        return;
                    }
                    return;
                }
                int var14 = arg2 * var7;
                for (int var15 = 0; ~var7 < ~var15; ++var15) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; ~var20 > ~var11; ++var20) {
                        for (int var21 = 0; ~var10 < ~var21; ++var21) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                arg2 = var10;
                var12 = var16;
                arg0 = var11;
                var9 >>= 1;
                var11 >>= 1;
                ++var8;
                var10 >>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "(I)I")
    public final int method1779(int arg0) {
        ++field3917;
        if (arg0 != 17566) {
            this.field3909 = -105;
        }
        if (this.field3902.field8205 != null) {
            class586 var2 = this.field3902.method3220(-4261, class684.field9606);
            if (var2 != null && var2.field8243 != -1) {
                return var2.field8243;
            }
        }
        return this.field3902.field8243 == -1 ? super.method1779(17566) : this.field3902.field8243;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILr;I)Z")
    private final boolean method1780(int arg0, class566 arg1, int arg2) {
        ++field3906;
        int var4 = arg2;
        class601 var5 = this.method3872(32195);
        class395 var6 = ~super.field9689 != 0 && ~super.field9731 == -1 ? class583.field8149.method1844(64, super.field9689) : null;
        class395 var7 = ~super.field9744 == 0 || super.field9660 && var6 != null ? null : class583.field8149.method1844(arg0 ^ 21982, super.field9744);
        int var8 = var5.field8427;
        int var9 = var5.field8467;
        if (~var8 != -1 || var9 != 0 || var5.field8459 != 0 || ~var5.field8447 != -1) {
            arg2 |= 7;
        }
        boolean var10 = ~super.field9714 != -1 && ~class133.field1735 <= ~super.field9742 && class133.field1735 < super.field9693;
        if (arg0 != 21918) {
            this.field3899 = 23;
        }
        if (var10) {
            arg2 |= 524288;
        }
        class474 var11 = super.field9751[0] = this.field3902.method3227(super.field9741, super.field9734, super.field9661, class591.field8297, super.field9724, super.field9725, var7, 13770, super.field9699, var6, class583.field8149, arg2, super.field9704, arg1, class684.field9606);
        if (var11 == null) {
            return false;
        } else {
            super.field9743 = var11.method757();
            super.field9719 = var11.method704();
            this.method3874((byte) -34, var11);
            int var12 = super.field9672.method2911((byte) 67);
            if (~var8 == -1 && var9 == 0) {
                this.method3867(-2912, var12, this.method2785(-1) << 9, 0, this.method2785(-1) << 9, 0);
            } else {
                this.method3867(arg0 + -24830, var12, var8, var5.field8448, var9, var5.field8465);
                if (super.field9721 != 0) {
                    super.field9751[0].method762(super.field9721);
                }
                if (super.field9656 != 0) {
                    super.field9751[0].method715(super.field9656);
                }
                if (~super.field9680 != -1) {
                    super.field9751[0].method710(0, super.field9680, 0);
                }
            }
            if (var10) {
                var11.method755(super.field9686, super.field9703, super.field9710, 255 & super.field9714);
            }
            if (super.field9687 != -1 && super.field9727 != -1) {
                class388 var13 = class370.field4686.method3943((byte) 12, super.field9687);
                boolean var14 = var13.field4890 == 3 && (~var8 != -1 || ~var9 != -1);
                int var15 = var4;
                if (!var14) {
                    if (super.field9666 != 0) {
                        var15 = var4 | 5;
                    }
                    if (super.field9706 != 0) {
                        var15 |= 2;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class474 var16 = super.field9751[1] = var13.method2084(super.field9705, arg1, arg0 + -21806, class583.field8149, super.field9727, var15, super.field9681);
                if (var16 != null) {
                    if (~super.field9706 != -1) {
                        var16.method710(0, -super.field9706 << 2, 0);
                    }
                    if (super.field9666 != 0) {
                        var16.method722(super.field9666 * 2048);
                    }
                    if (var14) {
                        if (~super.field9721 != -1) {
                            var16.method762(super.field9721);
                        }
                        if (super.field9656 != 0) {
                            var16.method715(super.field9656);
                        }
                        if (~super.field9680 != -1) {
                            var16.method710(0, super.field9680, 0);
                        }
                    }
                }
            } else {
                super.field9751[1] = null;
            }
            if (super.field9669 != -1 && super.field9677 != -1) {
                class388 var17 = class370.field4686.method3943((byte) 12, super.field9669);
                boolean var18 = ~var17.field4890 == -4 && (var8 != 0 || var9 != 0);
                int var19 = var4;
                if (var18) {
                    var19 = var4 | 7;
                } else {
                    if (super.field9718 != 0) {
                        var19 = var4 | 5;
                    }
                    if (~super.field9652 != -1) {
                        var19 |= 2;
                    }
                }
                class474 var20 = super.field9751[2] = var17.method2085(class583.field8149, 79, arg1, super.field9654, var19, super.field9677, super.field9732);
                if (var20 != null) {
                    if (super.field9652 != 0) {
                        var20.method710(0, -super.field9652 << 2, 0);
                    }
                    if (super.field9718 != 0) {
                        var20.method722(super.field9718 * 2048);
                    }
                    if (var18) {
                        if (~super.field9721 != -1) {
                            var20.method762(super.field9721);
                        }
                        if (super.field9656 != 0) {
                            var20.method715(super.field9656);
                        }
                        if (super.field9680 != 0) {
                            var20.method710(0, super.field9680, 0);
                        }
                    }
                }
            } else {
                super.field9751[2] = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
    public final void method66(int arg0) {
        ++field3904;
        if (arg0 == -1) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLr;)Log;")
    public final class101 method73(boolean arg0, class566 arg1) {
        ++field3908;
        if (this.field3902 != null && this.method1780(21918, arg1, 2048)) {
            class491 var3 = arg1.method995();
            int var4 = super.field9672.method2911((byte) 67);
            var3.method908(var4);
            class75 var5 = class270.field3423[super.field6470][super.field6461 >> class52.field775][super.field6464 >> class52.field775];
            if (var5 != null && var5.field1031 != null) {
                int var6 = -var5.field1031.field4919 + super.field9668;
                super.field9668 = (int) ((float) super.field9668 - (float) var6 / 10.0F);
            } else {
                super.field9668 = (int) ((float) super.field9668 - (float) super.field9668 / 10.0F);
            }
            var3.method903(super.field6461, -super.field9668 + super.field6458 - 20, super.field6464);
            class601 var7 = this.method3872(32195);
            class586 var8 = this.field3902.field8205 == null ? this.field3902 : this.field3902.method3220(-4261, class684.field9606);
            super.field9757 = arg0;
            if (class301.field3698.field6613 && var8.field8173 && var7.field8429) {
                class395 var9 = super.field9689 != -1 && ~super.field9731 == -1 ? class583.field8149.method1844(64, super.field9689) : null;
                class395 var10 = super.field9744 == -1 || super.field9660 && var9 != null ? null : class583.field8149.method1844(64, super.field9744);
                class474 var11 = class601.method3294(this.field3902.field8236 & 255, var4, super.field9751[0], this.field3902.field8181 & 255, this.field3902.field8237 & 65535, this.field3902.field8210, super.field9656, arg1, this.field3902.field8215 & 65535, super.field9721, super.field9680, false, var10 == null ? super.field9741 : super.field9699, var10 != null ? var10 : var9);
                if (var11 != null) {
                    super.field9757 = true;
                    arg1.method1034(false);
                    if (class36.field498) {
                        var11.method751(var3, (class151) null, class432.field5406, 0);
                    } else {
                        var11.method717(var3, (class151) null, 0);
                    }
                    arg1.method1034(true);
                }
            }
            var3.method908(var4);
            var3.method903(super.field6461, super.field6458 + -5 + -super.field9668, super.field6464);
            class101 var12 = null;
            if (this.method1771((byte) 89)) {
                var12 = class676.method3794(true, super.field9751.length);
            }
            this.method3868(var3, false, arg1, super.field9751, (byte) -100);
            if (class36.field498) {
                for (int var13 = 0; var13 < super.field9751.length; ++var13) {
                    if (super.field9751[var13] != null) {
                        super.field9751[var13].method751(var3, var12 == null ? null : var12.field1361[var13], class432.field5406, 0);
                    }
                }
            } else {
                for (int var14 = 0; var14 < super.field9751.length; ++var14) {
                    if (super.field9751[var14] != null) {
                        super.field9751[var14].method717(var3, var12 != null ? var12.field1361[var14] : null, 0);
                    }
                }
            }
            if (super.field9755 != null) {
                class27 var15 = super.field9755.method545();
                if (class36.field498) {
                    arg1.method999(var15, class432.field5406);
                } else {
                    arg1.method993(var15);
                }
            }
            for (int var16 = 0; var16 < super.field9751.length; ++var16) {
                if (super.field9751[var16] != null) {
                    super.field9757 |= super.field9751[var16].method740();
                }
            }
            super.field9713 = class673.field9473;
            super.field9751[0] = super.field9751[1] = super.field9751[2] = null;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ldu;I)V")
    public final void method1781(class586 arg0, int arg1) {
        if (arg1 != 0) {
            this.method1776(85);
        }
        ++field3921;
        this.field3902 = arg0;
        if (super.field9755 != null) {
            super.field9755.method536();
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILr;I)Z")
    public final boolean method75(int arg0, int arg1, class566 arg2, int arg3) {
        ++field3907;
        if (this.field3902 != null && this.method1780(21918, arg2, 131072)) {
            class491 var5 = arg2.method995();
            int var6 = super.field9672.method2911((byte) 67);
            var5.method908(var6);
            var5.method903(super.field6461, super.field6458, super.field6464);
            boolean var7 = false;
            if (arg3 != 9678) {
                return true;
            } else {
                for (int var8 = 0; ~var8 > ~super.field9751.length; ++var8) {
                    if (super.field9751[var8] != null) {
                        boolean var9 = ~this.field3902.field8208 != 0 ? this.field3902.field8208 == 1 : this.field3902.field8210 == 1;
                        boolean var10;
                        if (class36.field498) {
                            var10 = super.field9751[var8].method738(arg0, arg1, var5, var9, class432.field5406);
                        } else {
                            var10 = super.field9751[var8].method744(arg0, arg1, var5, var9);
                        }
                        if (var10) {
                            var7 = true;
                            break;
                        }
                    }
                }
                super.field9751[0] = super.field9751[1] = super.field9751[2] = null;
                return var7;
            }
        } else {
            return false;
        }
    }
}
