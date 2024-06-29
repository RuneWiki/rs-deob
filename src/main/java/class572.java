import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class572 extends class545 {

    @OriginalMember(owner = "client!bfa", name = "t", descriptor = "F")
    private float field8246 = 0.0F;

    @OriginalMember(owner = "client!bfa", name = "r", descriptor = "Lur;")
    private class617 field8244;

    @OriginalMember(owner = "client!bfa", name = "v", descriptor = "Lfba;")
    public static class348 field8248 = new class348(8);

    @OriginalMember(owner = "client!bfa", name = "F", descriptor = "[I")
    public static int[] field8258 = new int[1000];

    @OriginalMember(owner = "client!bfa", name = "q", descriptor = "I")
    public static int field8243;

    @OriginalMember(owner = "client!bfa", name = "s", descriptor = "I")
    public static int field8245;

    @OriginalMember(owner = "client!bfa", name = "u", descriptor = "I")
    public static int field8247;

    @OriginalMember(owner = "client!bfa", name = "w", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!bfa", name = "x", descriptor = "I")
    public static int field8250;

    @OriginalMember(owner = "client!bfa", name = "y", descriptor = "I")
    public static int field8251;

    @OriginalMember(owner = "client!bfa", name = "z", descriptor = "I")
    public static int field8252;

    @OriginalMember(owner = "client!bfa", name = "A", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!bfa", name = "B", descriptor = "I")
    public static int field8254;

    @OriginalMember(owner = "client!bfa", name = "C", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!bfa", name = "D", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!bfa", name = "E", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Lch;Lur;)V")
    public class572(class38 arg0, class617 arg1) {
        super(arg0);
        this.field8244 = arg1;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "([I[IZ[ILgt;)V")
    public static final void method3401(int[] arg0, int[] arg1, boolean arg2, int[] arg3, class571 arg4) {
        ++field8249;
        int var5 = 0;
        if (arg2) {
            field8258 = null;
        }
        while (var5 < arg3.length) {
            int var6 = arg3[var5];
            int var7 = arg0[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; ~var7 != -1 && ~arg4.field4615.length < ~var9; ++var9) {
                if (~(var7 & 1) != -1) {
                    if (~var6 != 0) {
                        class131 var10 = class610.field8698.method2999(var6, false);
                        int var11 = var10.field1806;
                        class196 var12 = arg4.field4615[var9];
                        if (var12 != null) {
                            if (~var12.field2873 == ~var6) {
                                if (~var11 == -1) {
                                    var12 = arg4.field4615[var9] = null;
                                } else if (~var11 != -2) {
                                    if (var11 == 2) {
                                        var12.field2864 = 0;
                                    }
                                } else {
                                    var12.field2858 = 0;
                                    var12.field2871 = 1;
                                    var12.field2862 = 0;
                                    var12.field2870 = var8;
                                    var12.field2864 = 0;
                                    if (!arg4.field4612) {
                                        class701.method3941(0, var10, (byte) 101, arg4);
                                    }
                                }
                            } else if (var10.field1784 >= class610.field8698.method2999(var12.field2873, false).field1784) {
                                var12 = arg4.field4615[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class196 var13 = arg4.field4615[var9] = new class196();
                            var13.field2858 = 0;
                            var13.field2871 = 1;
                            var13.field2873 = var6;
                            var13.field2862 = 0;
                            var13.field2870 = var8;
                            var13.field2864 = 0;
                            if (!arg4.field4612) {
                                class701.method3941(0, var10, (byte) 101, arg4);
                            }
                        }
                    } else {
                        arg4.field4615[var9] = null;
                    }
                }
                var7 >>>= 1;
            }
            ++var5;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V")
    public final void method452(int arg0) {
        super.field7920.method208(8, 1);
        ++field8255;
        super.field7920.method386((byte) 35, class281.field3934, class281.field3934);
        super.field7920.method230(class234.field3509, 0, 68);
        super.field7920.method242((byte) -114, class234.field3509, 0);
        super.field7920.method197(1, 32334);
        super.field7920.method264((class101) null, -2);
        super.field7920.method208(8, 0);
        super.field7920.method242((byte) -114, class234.field3509, 0);
        if (arg0 != 2) {
            this.field8246 = -0.36994314F;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)Z")
    public final boolean method459(int arg0) {
        ++field8250;
        if (arg0 <= 63) {
            this.field8244 = null;
        }
        return this.field8244.method3581(128);
    }

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "(I)V")
    public final void method1741(int arg0) {
        ++field8245;
        if (arg0 == 12) {
            if (~super.field7920.method198(91) == -1) {
                class417 var2 = super.field7920.method349((byte) 25);
                super.field7920.method208(arg0 + -4, 1);
                class417 var3 = super.field7920.method381((byte) 42);
                var3.method841(var2);
                var3.method2537((byte) -117, 0.125F, 1.0F, 0.125F);
                var3.method2538(0.0F, 0.0F, this.field8246, 17831);
                super.field7920.method238(115, class476.field6775);
                super.field7920.method208(8, 0);
            }
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(III)V")
    public final void method451(int arg0, int arg1, int arg2) {
        ++field8243;
        super.field7920.method208(arg0 ^ 8, 1);
        if ((128 & arg2) == arg0) {
            if ((arg1 & 1) != 1) {
                if (this.field8244.field8795) {
                    super.field7920.method264(this.field8244.field8796, -2);
                } else {
                    super.field7920.method264(this.field8244.field8787[0], -2);
                }
            } else if (this.field8244.field8795) {
                this.field8246 = (float) (super.field7920.field585 % 4000) / 4000.0F;
                super.field7920.method264(this.field8244.field8796, -2);
            } else {
                int var4 = super.field7920.field585 % 4000 * 16 / 4000;
                super.field7920.method264(this.field8244.field8787[var4], -2);
            }
        } else {
            super.field7920.method264((class101) null, -2);
        }
        super.field7920.method208(8, 0);
    }

    @OriginalMember(owner = "client!bfa", name = "i", descriptor = "(I)V")
    public static void method3402(int arg0) {
        int var1 = -126 / ((arg0 - 56) / 54);
        field8248 = null;
        field8258 = null;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZIII)I")
    public static final int method3403(boolean arg0, int arg1, int arg2, int arg3) {
        ++field8254;
        class37 var4 = class582.method3429(arg0, (byte) -106, arg3);
        if (var4 == null) {
            return 0;
        } else {
            return arg2 <= arg1 && arg1 < var4.field332.length ? var4.field332[arg1] : 0;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(Z)V")
    public static final void method3404(boolean arg0) {
        class557.method3341();
        if (arg0) {
            ++field8253;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IILec;)V")
    public final void method455(int arg0, int arg1, class101 arg2) {
        super.field7920.method264(arg2, arg0 + -4);
        ++field8252;
        if (arg0 != 2) {
            this.field8246 = 0.09062883F;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZZ)V")
    public final void method454(boolean arg0, boolean arg1) {
        ++field8251;
        super.field7920.method386((byte) -120, class567.field8198, class281.field3934);
        if (arg1) {
            field8248 = null;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BZ)V")
    public final void method457(byte arg0, boolean arg1) {
        super.field7920.method208(8, 1);
        ++field8247;
        super.field7920.method386((byte) -122, class567.field8198, class684.field9720);
        super.field7920.method282(false, true, (byte) -60, 0, class234.field3509);
        super.field7920.method242((byte) -121, class401.field5746, 0);
        if (arg0 < 101) {
            this.field8244 = null;
        }
        super.field7920.method197(0, 32334);
        super.field7920.method208(8, 0);
        super.field7920.method213(-16777216, 3);
        super.field7920.method242((byte) -115, class231.field3462, 0);
        this.method1741(12);
    }
}
