import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class634 extends class55 {

    @OriginalMember(owner = "client!am", name = "p", descriptor = "F")
    private float field8744 = 0.0F;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "Ltn;")
    private class88 field8741;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "[Llaa;")
    public static class123[] field8747 = new class123[8];

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field8740;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public static int field8746;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "I")
    public static int field8750;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "[I")
    public static int[] field8751;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIII)V", line = 4)
    public static final void method3553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field8749;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg2 - arg0;
        int var12 = -arg0 + arg6;
        int var13 = arg2 * arg2;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg6 << 1;
        int var22 = 60 % ((arg3 - -21) / 41);
        int var23 = var12 << 1;
        int var24 = (1 - var21) * var13 + var17;
        int var25 = -((var21 + -1) * var18) + var14;
        int var26 = (-var23 + 1) * var15 + var19;
        int var27 = var16 - (var23 + -1) * var20;
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var15 << 2;
        int var31 = var16 << 2;
        int var32 = var17 * 3;
        int var33 = (var21 + -3) * var18;
        int var34 = var19 * 3;
        int var35 = (var23 - 3) * var20;
        int var36 = var29;
        int var37 = (arg6 + -1) * var28;
        int var38 = var31;
        int var39 = (var12 + -1) * var30;
        int[] var40 = class432.field5765[arg4];
        class636.method3569(-var11 + arg7, arg5, -arg2 + arg7, 347845800, var40);
        class636.method3569(arg7 + var11, arg1, -var11 + arg7, 347845800, var40);
        class636.method3569(arg2 + arg7, arg5, arg7 + var11, 347845800, var40);
        while (var9 > 0) {
            boolean var41 = var9 <= var12;
            if (~var24 > -1) {
                while (~var24 > -1) {
                    var25 += var36;
                    var24 += var32;
                    var32 += var29;
                    var36 += var29;
                    ++var8;
                }
            }
            if (var41) {
                if (var26 < 0) {
                    while (~var26 > -1) {
                        var27 += var38;
                        var26 += var34;
                        var34 += var31;
                        var38 += var31;
                        ++var10;
                    }
                }
                if (~var27 > -1) {
                    var27 += var38;
                    var26 += var34;
                    var34 += var31;
                    var38 += var31;
                    ++var10;
                }
                var26 += -var39;
                var27 += -var35;
                var35 -= var30;
                var39 -= var30;
            }
            if (~var25 > -1) {
                var25 += var36;
                var24 += var32;
                var36 += var29;
                var32 += var29;
                ++var8;
            }
            var25 += -var33;
            var24 += -var37;
            --var9;
            var33 -= var28;
            var37 -= var28;
            int var42 = arg4 - var9;
            int var43 = arg4 + var9;
            int var44 = arg7 - -var8;
            int var45 = arg7 - var8;
            if (!var41) {
                class636.method3569(var44, arg5, var45, 347845800, class432.field5765[var42]);
                class636.method3569(var44, arg5, var45, 347845800, class432.field5765[var43]);
            } else {
                int var46 = arg7 + var10;
                int var47 = -var10 + arg7;
                class636.method3569(var47, arg5, var45, 347845800, class432.field5765[var42]);
                class636.method3569(var46, arg1, var47, 347845800, class432.field5765[var42]);
                class636.method3569(var44, arg5, var46, 347845800, class432.field5765[var42]);
                class636.method3569(var47, arg5, var45, 347845800, class432.field5765[var43]);
                class636.method3569(var46, arg1, var47, 347845800, class432.field5765[var43]);
                class636.method3569(var44, arg5, var46, 347845800, class432.field5765[var43]);
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(I)V", line = 172)
    public final void method406(int arg0) {
        if (super.field759.method2386(4) == 0) {
            class477 var2 = super.field759.method2406(false);
            super.field759.method2393(1, (byte) 94);
            class477 var3 = super.field759.method2364((byte) -127);
            var3.method604(var2);
            var3.method2738(0.125F, 1.0F, -14019, 0.125F);
            var3.method2732(this.field8744, arg0 + 14750, 0.0F, 0.0F);
            super.field759.method2384(2, class559.field7776);
            super.field759.method2393(0, (byte) -126);
        }
        if (arg0 != 1) {
            this.method202(-24);
        }
        ++field8746;
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "(I)Z", line = 196)
    public final boolean method202(int arg0) {
        if (arg0 != 1) {
            field8747 = null;
        }
        ++field8752;
        return this.field8741.method722((byte) 17);
    }

    @OriginalMember(owner = "client!am", name = "g", descriptor = "(I)V", line = 209)
    public static void method3554(int arg0) {
        field8747 = null;
        field8751 = null;
        if (arg0 != 0) {
            method3553(32, 101, 3, 60, 12, -61, 119, 81);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIZ)V", line = 220)
    public final void method199(int arg0, int arg1, boolean arg2) {
        ++field8742;
        super.field759.method2393(1, (byte) 57);
        if (~(128 & arg0) != -1) {
            super.field759.method2396(22357, (class572) null);
        } else if (~(arg1 & 1) == -2) {
            if (!this.field8741.field1225) {
                int var4 = super.field759.field5633 % 4000 * 16 / 4000;
                super.field759.method2396(22357, this.field8741.field1220[var4]);
            } else {
                this.field8744 = (float) (super.field759.field5633 % 4000) / 4000.0F;
                super.field759.method2396(22357, this.field8741.field1222);
            }
        } else if (!this.field8741.field1225) {
            super.field759.method2396(22357, this.field8741.field1220[0]);
        } else {
            super.field759.method2396(22357, this.field8741.field1222);
        }
        super.field759.method2393(0, (byte) 92);
        if (!arg2) {
            this.field8744 = -0.8067022F;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZB)V", line = 264)
    public final void method197(boolean arg0, byte arg1) {
        int var3 = -75 % ((-61 - arg1) / 44);
        ++field8743;
        super.field759.method2397(class405.field5120, class476.field6418, (byte) 125);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILfe;)V", line = 274)
    public final void method200(int arg0, int arg1, class572 arg2) {
        ++field8745;
        if (arg1 >= 30) {
            super.field759.method2396(22357, arg2);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V", line = 290)
    public final void method201(boolean arg0) {
        ++field8740;
        super.field759.method2393(1, (byte) 29);
        if (arg0) {
            super.field759.method2397(class405.field5120, class405.field5120, (byte) -90);
            super.field759.method2394(class447.field5937, (byte) 67, 0);
            super.field759.method2422(class447.field5937, 0, (byte) -10);
            super.field759.method2006((byte) 96, 1);
            super.field759.method2396(22357, (class572) null);
            super.field759.method2393(0, (byte) -99);
            super.field759.method2422(class447.field5937, 0, (byte) -10);
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lij;Ltn;)V", line = 311)
    public class634(class424 arg0, class88 arg1) {
        super(arg0);
        this.field8741 = arg1;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ)V", line = 331)
    public final void method196(int arg0, boolean arg1) {
        if (arg0 == 5) {
            ++field8748;
            super.field759.method2393(1, (byte) 8);
            super.field759.method2397(class155.field2108, class476.field6418, (byte) 89);
            super.field759.method2036((byte) -86, false, true, class447.field5937, 0);
            super.field759.method2422(class84.field1162, 0, (byte) -10);
            super.field759.method2006((byte) 65, 0);
            super.field759.method2393(0, (byte) 50);
            super.field759.method2382(-16777216, -4068);
            super.field759.method2422(class21.field383, 0, (byte) -10);
            this.method406(1);
        }
    }

    @OriginalMember(owner = "client!am", name = "h", descriptor = "(I)V", line = 351)
    public static final void method3555(int arg0) {
        int var1 = -19 % ((arg0 - 47) / 41);
        ++field8750;
        if (class193.field2651) {
            while (true) {
                while (~class411.field5232.length < ~class647.field8960) {
                    class138 var2 = class411.field5232[class647.field8960];
                    if (var2 != null && var2.field1978 == -1) {
                        if (class472.field6327 == null) {
                            class472.field6327 = class140.field1993.method1782(var2.field1977, false);
                        }
                        int var3 = class472.field6327.field1987;
                        if (~var3 == 0) {
                            return;
                        }
                        ++class647.field8960;
                        var2.field1978 = var3;
                        class472.field6327 = null;
                    } else {
                        ++class647.field8960;
                    }
                }
                return;
            }
        }
    }
}
