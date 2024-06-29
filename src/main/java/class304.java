import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class304 extends class669 {

    @OriginalMember(owner = "client!ofa", name = "x", descriptor = "Z")
    private boolean field4220 = false;

    @OriginalMember(owner = "client!ofa", name = "t", descriptor = "Z")
    private boolean field4216;

    @OriginalMember(owner = "client!ofa", name = "n", descriptor = "[Lul;")
    private class537[] field4210;

    @OriginalMember(owner = "client!ofa", name = "w", descriptor = "[F")
    public static float[] field4219 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ofa", name = "m", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!ofa", name = "o", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!ofa", name = "p", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!ofa", name = "q", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!ofa", name = "r", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!ofa", name = "s", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!ofa", name = "u", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!ofa", name = "v", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!ofa", name = "z", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!ofa", name = "B", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!ofa", name = "y", descriptor = "Ldca;")
    public static class164 field4221;

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(Z)V", line = 3)
    public static void method1838(boolean arg0) {
        field4219 = null;
        if (arg0) {
            method1843(-34, 83, 41);
        }
        field4221 = null;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ZI)V", line = 17)
    public final void method4(boolean arg0, int arg1) {
        super.field9490.method909(class521.field6963, arg1 ^ -9555, class586.field7773);
        ++field4217;
        if (arg1 != 9512) {
            this.method4(false, 43);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(Lej;)V", line = 29)
    public class304(class111 arg0) {
        super(arg0);
        if (arg0.field1863) {
            this.field4216 = arg0.field1855 < 3;
            int var2 = !this.field4216 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var13;
                        } else if (var14 != 1) {
                            if (~var14 != -3) {
                                if (var14 == 3) {
                                    var15 = -var12;
                                } else if (var14 != 4) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field4210 = new class537[3];
            this.field4210[0] = super.field9490.method103(false, 64, var4, 0);
            this.field4210[1] = super.field9490.method103(false, 64, var5, 0);
            this.field4210[2] = super.field9490.method103(false, 64, var3, 0);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIII)I", line = 139)
    public static final int method1839(int arg0, int arg1, int arg2, int arg3) {
        ++field4215;
        if (~(8 & class477.field6362[arg1][arg2][arg3]) != -1) {
            return 0;
        } else if (arg0 != 2) {
            return -46;
        } else {
            return ~arg1 < -1 && ~(2 & class477.field6362[1][arg2][arg3]) != -1 ? arg1 + -1 : arg1;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(II)V", line = 157)
    public static final void method1840(int arg0, int arg1) {
        ++field4222;
        class683.field9616 = -1;
        class180.field2749 = arg1;
        class683.field9616 = -1;
        class659.method3693(1290);
        if (arg0 != 10569) {
            method1840(-46, 7);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "(I)V", line = 171)
    public final void method6(int arg0) {
        if (arg0 == -21106) {
            if (!this.field4220) {
                super.field9490.method828(arg0 ^ -21076, class350.field4792, 0);
            } else {
                super.field9490.method845(1, 121);
                super.field9490.method897((class430) null, true);
                super.field9490.method63(class17.field268, true);
                super.field9490.method842(arg0 + 20986);
                if (this.field4216) {
                    super.field9490.method909(class521.field6963, -121, class521.field6963);
                    super.field9490.method859((byte) 29, class350.field4792, 0);
                    super.field9490.method828(65, class350.field4792, 0);
                } else {
                    super.field9490.method909(class521.field6963, arg0 ^ -21116, class521.field6963);
                    super.field9490.method859((byte) 29, class350.field4792, 0);
                    super.field9490.method845(2, arg0 ^ -21033);
                    super.field9490.method909(class521.field6963, -122, class521.field6963);
                    super.field9490.method859((byte) 29, class350.field4792, 0);
                    super.field9490.method859((byte) 29, class291.field4117, 1);
                    super.field9490.method828(arg0 + 21209, class350.field4792, 0);
                    super.field9490.method897((class430) null, true);
                }
                super.field9490.method845(0, 82);
                this.field4220 = false;
            }
            ++field4209;
            super.field9490.method909(class521.field6963, arg0 + 20989, class521.field6963);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IILnq;)V", line = 212)
    public final void method7(int arg0, int arg1, class430 arg2) {
        super.field9490.method897(arg2, true);
        ++field4213;
        if (arg1 != -21254) {
            method1839(-82, 65, 75, -99);
        }
        super.field9490.method858(arg0, 25681);
    }

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(I)Z", line = 229)
    public final boolean method1(int arg0) {
        ++field4214;
        if (arg0 != 9567) {
            method1840(-71, -42);
        }
        return true;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Loa;ILbd;IIB)V", line = 242)
    public static final void method1841(class651 arg0, int arg1, class58 arg2, int arg3, int arg4, byte arg5) {
        ++field4223;
        class413 var6 = class457.field6215.method1600(arg2.field809, (byte) 73);
        if (var6.field5659 != -1) {
            int var8;
            if (arg2.field880) {
                int var7 = arg2.field843 + arg1;
                var8 = var7 & 3;
            } else {
                var8 = 0;
            }
            class468 var9 = var6.method2370(var8, (byte) 115, arg2.field817, arg0);
            if (var9 != null) {
                int var10 = arg2.field838;
                int var11 = arg2.field885;
                if (arg5 >= -89) {
                    method1841((class651) null, 69, (class58) null, 10, 35, (byte) -112);
                }
                if (~(1 & var8) == -2) {
                    var11 = arg2.field838;
                    var10 = arg2.field885;
                }
                int var12 = var9.method1025();
                int var13 = var9.method1030();
                if (var6.field5669) {
                    var13 = var11 * 4;
                    var12 = var10 * 4;
                }
                if (~var6.field5662 == -1) {
                    var9.method2641(arg4, -((var11 + -1) * 4) + arg3, var12, var13);
                } else {
                    var9.method274(arg4, -((var11 + -1) * 4) + arg3, var12, var13, 0, -16777216 | var6.field5662, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III)Ll;", line = 299)
    public static final class18 method1842(int arg0, int arg1, int arg2) {
        class24 var3 = class703.field9899[arg0][arg1][arg2];
        return var3 == null ? null : var3.field413;
    }

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(III)Z", line = 311)
    public static final boolean method1843(int arg0, int arg1, int arg2) {
        if (arg1 != -6515) {
            field4219 = null;
        }
        ++field4212;
        return class462.method2621(arg2, arg0, false) & class84.method689(arg2, 29196, arg0);
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BII)V", line = 326)
    public final void method2(byte arg0, int arg1, int arg2) {
        if (this.field4220) {
            super.field9490.method845(1, -43);
            super.field9490.method897(this.field4210[arg2 - 1], true);
            super.field9490.method845(0, 84);
        }
        ++field4218;
        if (arg0 <= 77) {
            this.field4216 = false;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ZZ)V", line = 345)
    public final void method5(boolean arg0, boolean arg1) {
        if (arg1) {
            field4221 = null;
        }
        if (this.field4210 != null && arg0) {
            super.field9490.method845(1, 95);
            super.field9490.method63(class262.field3598, true);
            class74 var3 = super.field9490.method879(0);
            var3.method586(1024);
            super.field9490.method866(5758, class37.field558);
            if (!this.field4216) {
                super.field9490.method909(class586.field7773, -128, class521.field6963);
                super.field9490.method859((byte) 29, class291.field4117, 0);
                super.field9490.method845(2, -45);
                super.field9490.method909(class32.field520, 51, class586.field7773);
                super.field9490.method859((byte) 29, class291.field4117, 0);
                super.field9490.method60(1, 1, true, false, class291.field4117);
                super.field9490.method828(70, class681.field9596, 0);
                super.field9490.method897(super.field9490.field1840, true);
            } else {
                super.field9490.method909(class32.field520, -115, class586.field7773);
                super.field9490.method60(1, 0, true, false, class350.field4792);
                super.field9490.method828(42, class681.field9596, 0);
            }
            super.field9490.method845(0, -58);
            this.field4220 = true;
        } else {
            super.field9490.method828(48, class681.field9596, 0);
        }
        ++field4211;
    }
}
