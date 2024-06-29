import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class666 extends class385 {

    @OriginalMember(owner = "client!wda", name = "Xc", descriptor = "I")
    public int field9252 = 1;

    @OriginalMember(owner = "client!wda", name = "ad", descriptor = "I")
    public int field9255 = 1;

    @OriginalMember(owner = "client!wda", name = "dd", descriptor = "I")
    public int field9258 = -1;

    @OriginalMember(owner = "client!wda", name = "Ic", descriptor = "I")
    public int field9237 = -1;

    @OriginalMember(owner = "client!wda", name = "Uc", descriptor = "Lfja;")
    public static class783 field9249 = new class783(49, 3);

    @OriginalMember(owner = "client!wda", name = "cd", descriptor = "Lwm;")
    public static class591 field9257 = new class591();

    @OriginalMember(owner = "client!wda", name = "md", descriptor = "I")
    public static int field9267 = -1;

    @OriginalMember(owner = "client!wda", name = "nd", descriptor = "Lvl;")
    public static class15 field9268 = new class15(11, 2);

    @OriginalMember(owner = "client!wda", name = "pd", descriptor = "Lmo;")
    public static class780 field9270 = new class780("", 17);

    @OriginalMember(owner = "client!wda", name = "qd", descriptor = "[F")
    public static float[] field9271 = new float[4];

    @OriginalMember(owner = "client!wda", name = "rd", descriptor = "[I")
    public static int[] field9272 = new int[14];

    @OriginalMember(owner = "client!wda", name = "Kc", descriptor = "I")
    public static int field9239;

    @OriginalMember(owner = "client!wda", name = "Lc", descriptor = "I")
    public static int field9240;

    @OriginalMember(owner = "client!wda", name = "Mc", descriptor = "I")
    public static int field9241;

    @OriginalMember(owner = "client!wda", name = "Nc", descriptor = "I")
    public static int field9242;

    @OriginalMember(owner = "client!wda", name = "Oc", descriptor = "I")
    public static int field9243;

    @OriginalMember(owner = "client!wda", name = "Pc", descriptor = "I")
    public static int field9244;

    @OriginalMember(owner = "client!wda", name = "Qc", descriptor = "I")
    public static int field9245;

    @OriginalMember(owner = "client!wda", name = "Rc", descriptor = "I")
    public static int field9246;

    @OriginalMember(owner = "client!wda", name = "Sc", descriptor = "I")
    public static int field9247;

    @OriginalMember(owner = "client!wda", name = "Vc", descriptor = "I")
    public int field9250;

    @OriginalMember(owner = "client!wda", name = "Wc", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!wda", name = "Zc", descriptor = "I")
    public static int field9254;

    @OriginalMember(owner = "client!wda", name = "bd", descriptor = "I")
    public static int field9256;

    @OriginalMember(owner = "client!wda", name = "ed", descriptor = "I")
    public static int field9259;

    @OriginalMember(owner = "client!wda", name = "fd", descriptor = "I")
    public static int field9260;

    @OriginalMember(owner = "client!wda", name = "gd", descriptor = "I")
    public static int field9261;

    @OriginalMember(owner = "client!wda", name = "hd", descriptor = "I")
    public static int field9262;

    @OriginalMember(owner = "client!wda", name = "id", descriptor = "I")
    public static int field9263;

    @OriginalMember(owner = "client!wda", name = "jd", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!wda", name = "kd", descriptor = "I")
    public static int field9265;

    @OriginalMember(owner = "client!wda", name = "od", descriptor = "I")
    public static int field9269;

    @OriginalMember(owner = "client!wda", name = "Tc", descriptor = "Lle;")
    public class325 field9248;

    @OriginalMember(owner = "client!wda", name = "Yc", descriptor = "Lac;")
    public class568 field9253;

    @OriginalMember(owner = "client!wda", name = "Jc", descriptor = "Ljava/lang/String;")
    public String field9238;

    @OriginalMember(owner = "client!wda", name = "ld", descriptor = "[Lcn;")
    public static class543[] field9266;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lha;Lcn;IIBZI)V")
    public final void method903(class66 arg0, class543 arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        ++field9256;
        if (arg4 > 41) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!wda", name = "m", descriptor = "(I)Z")
    public final boolean method3760(int arg0) {
        ++field9247;
        if (arg0 != 32767) {
            field9268 = null;
        }
        return this.field9253 != null;
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(III)V")
    public final void method3761(int arg0, int arg1, int arg2) {
        ++field9263;
        int var4 = super.field5304[0];
        int var5 = super.field5308[0];
        if (~arg2 == -1) {
            ++var5;
        }
        if (~arg2 == -2) {
            ++var5;
            ++var4;
        }
        if (~arg2 == -3) {
            ++var4;
        }
        if (~arg2 == -4) {
            --var5;
            ++var4;
        }
        if (arg2 == 4) {
            --var5;
        }
        if (~arg2 == -6) {
            --var5;
            --var4;
        }
        if (arg2 == 6) {
            --var4;
        }
        if (super.field5230 != -1 && class108.field1696.method1279((byte) 92, super.field5230).field3022 == 1) {
            super.field5230 = -1;
            super.field5214 = null;
        }
        if (~arg2 == -8) {
            --var4;
            ++var5;
        }
        if (arg1 != -13677) {
            this.field9258 = 22;
        }
        for (int var6 = 0; var6 < super.field5234.length; ++var6) {
            if (~super.field5234[var6].field6324 != 0) {
                class491 var8 = class707.field9727.method2143(-2, super.field5234[var6].field6324);
                if (var8.field6690 && ~var8.field6695 != 0 && class108.field1696.method1279((byte) 92, var8.field6695).field3022 == 1) {
                    super.field5234[var6].field6324 = -1;
                }
            }
        }
        if (~super.field5307 > -10) {
            ++super.field5307;
        }
        for (int var7 = super.field5307; var7 > 0; --var7) {
            super.field5304[var7] = super.field5304[var7 - 1];
            super.field5308[var7] = super.field5308[var7 - 1];
            super.field5306[var7] = super.field5306[var7 + -1];
        }
        super.field5304[0] = var4;
        super.field5308[0] = var5;
        super.field5306[0] = (byte) arg0;
    }

    @OriginalMember(owner = "client!wda", name = "n", descriptor = "(I)V")
    public static void method3762(int arg0) {
        field9270 = null;
        field9271 = null;
        field9249 = null;
        field9268 = null;
        if (arg0 != -1) {
            field9269 = 2;
        }
        field9272 = null;
        field9266 = null;
        field9257 = null;
    }

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "(B)Z")
    private final boolean method3763(byte arg0) {
        ++field9244;
        return arg0 >= -74 ? true : this.field9253.field8073;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILac;)V")
    public final void method3764(int arg0, class568 arg1) {
        this.field9253 = arg1;
        ++field9242;
        if (this.field9253 != null) {
            this.field9250 = this.field9253.field8079;
            this.field9238 = this.field9253.field8070;
        }
        if (super.field5303 != null) {
            super.field5303.method4300();
        }
        if (arg0 < 23) {
            field9257 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ld;ILjava/awt/Canvas;I)Lha;")
    public static final class66 method3765(class162 arg0, int arg1, Canvas arg2, int arg3) {
        ++field9260;
        return arg3 != -1 ? null : new class111(arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(BLha;)Lhga;")
    public final class186 method898(byte arg0, class66 arg1) {
        ++field9254;
        if (this.field9253 != null && this.method3767((byte) 68, arg1, 2048)) {
            class650 var3 = arg1.method533();
            int var4 = super.field5246.method1062(false);
            var3.method1879(var4);
            class549 var5 = class325.field4448[super.field7391][super.field7396 >> class654.field9055][super.field7398 >> class654.field9055];
            if (var5 != null && var5.field7471 != null) {
                int var6 = super.field5245 - var5.field7471.field5931;
                super.field5245 = (int) ((float) super.field5245 - (float) var6 / 10.0F);
            } else {
                super.field5245 = (int) ((float) super.field5245 - (float) super.field5245 / 10.0F);
            }
            var3.method1860(super.field7396, super.field7405 + -20 + -super.field5245, super.field7398);
            class540 var7 = this.method2347(16383);
            class568 var8 = this.field9253.field8023 != null ? this.field9253.method3283((byte) -118, class694.field9613) : this.field9253;
            super.field5301 = false;
            class186 var9 = null;
            if (class111.field1911.field6742.method2083((byte) 107) == 1 && var8.field8071 && var7.field7355) {
                class200 var10 = super.field5230 != -1 && super.field5296 == 0 ? class108.field1696.method1279((byte) 92, super.field5230) : null;
                class200 var11 = ~super.field5249 == 0 || super.field5262 && var10 != null ? null : class108.field1696.method1279((byte) 92, super.field5249);
                class499 var12 = client.method2021(super.field5275, super.field5239, true, arg1, var11 != null ? var11 : var10, super.field5310[0], 255 & this.field9253.field8035, 65535 & this.field9253.field8091, var11 != null ? super.field5293 : super.field5270, var4, this.field9253.field8076, this.field9253.field8021 & 255, super.field5273, this.field9253.field8067 & 65535);
                if (var12 != null) {
                    var9 = class174.method1320(super.field5310.length + 1, this.method3763((byte) -114), 17832);
                    super.field5301 = true;
                    arg1.method557(false);
                    if (!class507.field6967) {
                        var12.method301(var3, var9.field2877[super.field5310.length], 0);
                    } else {
                        var12.method310(var3, var9.field2877[super.field5310.length], class90.field1369, 0);
                    }
                    arg1.method557(true);
                }
            }
            var3.method1879(var4);
            if (arg0 < 123) {
                this.method2331((byte) 43);
            }
            var3.method1860(super.field7396, super.field7405 + -5 - super.field5245, super.field7398);
            if (var9 == null) {
                var9 = class174.method1320(super.field5310.length, this.method3763((byte) -92), 17832);
            }
            this.method2343(super.field5310, var3, false, 0, arg1);
            if (!class507.field6967) {
                for (int var13 = 0; ~var13 > ~super.field5310.length; ++var13) {
                    if (super.field5310[var13] != null) {
                        super.field5310[var13].method301(var3, var9.field2877[var13], 0);
                    }
                }
            } else {
                for (int var14 = 0; ~var14 > ~super.field5310.length; ++var14) {
                    if (super.field5310[var14] != null) {
                        super.field5310[var14].method310(var3, var9.field2877[var14], class90.field1369, 0);
                    }
                }
            }
            if (super.field5303 != null) {
                class442 var15 = super.field5303.method4299();
                if (!class507.field6967) {
                    arg1.method478(var15);
                } else {
                    arg1.method474(var15, class90.field1369);
                }
            }
            for (int var16 = 0; ~super.field5310.length < ~var16; ++var16) {
                if (super.field5310[var16] != null) {
                    super.field5301 |= super.field5310[var16].method327();
                }
            }
            super.field5310[0] = super.field5310[1] = super.field5310[2] = null;
            super.field5215 = class93.field1455;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(Lha;B)Ldg;")
    public final class435 method894(class66 arg0, byte arg1) {
        ++field9239;
        if (arg1 >= -38) {
            this.method2330(true);
        }
        return null;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)I")
    public final int method2331(byte arg0) {
        ++field9251;
        int var2 = -125 % ((arg0 - -2) / 62);
        if (this.field9253.field8023 != null) {
            class568 var3 = this.field9253.method3283((byte) -103, class694.field9613);
            if (var3 != null && var3.field8042 != -1) {
                return var3.field8042;
            }
        }
        return this.field9253.field8042;
    }

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "(I)Z")
    public final boolean method904(int arg0) {
        ++field9259;
        if (arg0 != 0) {
            field9268 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(IIIIIZ)V")
    public final void method3766(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        super.field7391 = super.field7404 = (byte) arg1;
        ++field9245;
        if (class61.method425(arg0, 16340, arg3)) {
            ++super.field7404;
        }
        if (~super.field5230 != 0 && class108.field1696.method1279((byte) 92, super.field5230).field3022 == 1) {
            super.field5214 = null;
            super.field5230 = -1;
        }
        if (arg4 <= 101) {
            field9267 = 58;
        }
        for (int var7 = 0; ~super.field5234.length < ~var7; ++var7) {
            if (super.field5234[var7].field6324 != -1) {
                class491 var11 = class707.field9727.method2143(-2, super.field5234[var7].field6324);
                if (var11.field6690 && ~var11.field6695 != 0 && ~class108.field1696.method1279((byte) 92, var11.field6695).field3022 == -2) {
                    super.field5234[var7].field6324 = -1;
                }
            }
        }
        if (!arg5) {
            int var8 = -super.field5304[0] + arg3;
            int var9 = -super.field5308[0] + arg0;
            if (var8 >= -8 && ~var8 >= -9 && var9 >= -8 && ~var9 >= -9) {
                if (super.field5307 < 9) {
                    ++super.field5307;
                }
                for (int var10 = super.field5307; ~var10 < -1; --var10) {
                    super.field5304[var10] = super.field5304[var10 + -1];
                    super.field5308[var10] = super.field5308[var10 + -1];
                    super.field5306[var10] = super.field5306[var10 + -1];
                }
                super.field5304[0] = arg3;
                super.field5306[0] = 1;
                super.field5308[0] = arg0;
                return;
            }
        }
        super.field5309 = 0;
        super.field5307 = 0;
        super.field5305 = 0;
        super.field5304[0] = arg3;
        super.field5308[0] = arg0;
        super.field7398 = (super.field5308[0] << 9) + (arg2 << 8);
        super.field7396 = (super.field5304[0] << 9) + (arg2 << 8);
        if (super.field5303 != null) {
            super.field5303.method4300();
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)I")
    public final int method2330(boolean arg0) {
        ++field9265;
        if (this.field9253.field8023 != null) {
            class568 var2 = this.field9253.method3283((byte) -116, class694.field9613);
            if (var2 != null && var2.field8059 != -1) {
                return var2.field8059;
            }
        }
        if (arg0) {
            field9268 = null;
        }
        return this.field9253.field8059 != -1 ? this.field9253.field8059 : super.method2330(false);
    }

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "(I)I")
    public final int method2346(int arg0) {
        ++field9241;
        if (this.field9253.field8023 != null) {
            class568 var2 = this.field9253.method3283((byte) -100, class694.field9613);
            if (var2 != null && var2.field8036 != -1) {
                return var2.field8036;
            }
        }
        return arg0 != -730315383 ? -22 : this.field9253.field8036;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method908(class66 arg0, int arg1, int arg2, int arg3) {
        ++field9262;
        if (this.field9253 != null && this.method3767((byte) 68, arg0, 131072)) {
            if (arg2 != 131072) {
                return false;
            } else {
                class650 var5 = arg0.method533();
                int var6 = super.field5246.method1062(false);
                var5.method1879(var6);
                var5.method1860(super.field7396, super.field7405, super.field7398);
                boolean var7 = false;
                for (int var8 = 0; super.field5310.length > var8; ++var8) {
                    if (super.field5310[var8] != null) {
                        boolean var10000;
                        label47: {
                            if (~this.field9253.field8061 >= -1) {
                                label45: {
                                    if (~this.field9253.field8072 == 0) {
                                        if (~this.field9253.field8076 == -2) {
                                            break label45;
                                        }
                                        var10000 = false;
                                    } else {
                                        if (this.field9253.field8072 == 1) {
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
                        if (!class507.field6967) {
                            var10 = super.field5310[var8].method290(arg1, arg3, var5, var9, this.field9253.field8061);
                        } else {
                            var10 = super.field5310[var8].method286(arg1, arg3, var5, var9, this.field9253.field8061, class90.field1369);
                        }
                        if (var10) {
                            var7 = true;
                            break;
                        }
                    }
                }
                super.field5310[0] = super.field5310[1] = super.field5310[2] = null;
                return var7;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLha;I)Z")
    private final boolean method3767(byte arg0, class66 arg1, int arg2) {
        ++field9246;
        int var4 = arg2;
        class540 var5 = this.method2347(16383);
        class200 var6 = super.field5230 != -1 && ~super.field5296 == -1 ? class108.field1696.method1279((byte) 92, super.field5230) : null;
        class200 var7 = super.field5249 == -1 || super.field5262 && var6 != null ? null : class108.field1696.method1279((byte) 92, super.field5249);
        int var8 = var5.field7352;
        if (arg0 != 68) {
            this.method894((class66) null, (byte) -97);
        }
        int var9 = var5.field7325;
        if (var8 != 0 || ~var9 != -1 || var5.field7371 != 0 || ~var5.field7332 != -1) {
            arg2 |= 7;
        }
        boolean var10 = ~super.field5268 != -1 && ~super.field5284 >= ~class440.field5977 && super.field5255 > class440.field5977;
        if (var10) {
            arg2 |= 524288;
        }
        int var11 = super.field5246.method1062(false);
        class499 var12 = super.field5310[0] = this.field9253.method3290(var7, super.field5270, this.field9248, var6, class18.method125(arg0, 790), super.field5221, super.field5242, arg1, var11, arg2, super.field5233, super.field5243, class694.field9613, class706.field9695, super.field5238, super.field5285, super.field5293, class108.field1696);
        if (var12 == null) {
            return false;
        } else {
            super.field5294 = var12.method276();
            super.field5272 = var12.method298();
            this.method2345(var12, (byte) 109);
            if (~var8 == -1 && ~var9 == -1) {
                this.method2348(this.method2342((byte) 123) << 9, 0, this.method2342((byte) -84) << 9, var11, 0, true);
            } else {
                this.method2348(var9, var5.field7334, var8, var11, var5.field7339, true);
                if (super.field5273 != 0) {
                    super.field5310[0].method316(super.field5273);
                }
                if (~super.field5275 != -1) {
                    super.field5310[0].method302(super.field5275);
                }
                if (super.field5239 != 0) {
                    super.field5310[0].method305(0, super.field5239, 0);
                }
            }
            if (var10) {
                var12.method306(super.field5290, super.field5211, super.field5279, 255 & super.field5268);
            }
            this.method2339(var8, arg1, (byte) -120, var5, var9, var4, var11);
            return true;
        }
    }

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "(I)V")
    public final void method905(int arg0) {
        ++field9240;
        if (arg0 != -16665) {
            this.field9238 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "(III)V")
    public static final void method3768(int arg0, int arg1, int arg2) {
        ++field9261;
        class281 var3 = class54.method395((byte) -53, 0L, 15);
        var3.method1821((byte) -125);
        var3.field3901 = arg1;
        int var4 = 101 / ((arg0 - -55) / 47);
        var3.field3910 = arg2;
    }

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "(B)I")
    public final int method1461(byte arg0) {
        ++field9243;
        if (this.field9253 == null) {
            return 0;
        } else {
            int var2 = 13 / ((arg0 - -58) / 47);
            return this.field9253.field8061;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(BLha;)V")
    public final void method901(byte arg0, class66 arg1) {
        ++field9264;
        if (this.field9253 != null) {
            if (super.field5302 || this.method3767((byte) 68, arg1, 0)) {
                if (arg0 >= 114) {
                    class650 var3 = arg1.method533();
                    var3.method1879(super.field5246.method1062(false));
                    var3.method1860(super.field7396, super.field7405 + -20, super.field7398);
                    this.method2343(super.field5310, var3, super.field5302, 0, arg1);
                    super.field5310[0] = super.field5310[1] = super.field5310[2] = null;
                }
            }
        }
    }
}
