import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class79 extends class23 {

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    public static int field1432 = -1;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "Llc;")
    public static class143 field1434 = class66.method374("Continuer", -1);

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "Lli;")
    public static class191 field1429 = new class191();

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "Ljd;")
    public static class121 field1442 = null;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "Llc;")
    private static class143 field1441 = class66.method374("Continue", -1);

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "Llc;")
    private static class143 field1440 = class66.method374("Loaded sprites", -1);

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "Llc;")
    public static class143 field1439 = field1440;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "Llc;")
    public static class143 field1444 = field1441;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    private int field1427;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "Lfe;")
    public static class212 field1438;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "Loi;")
    public static class282 field1430;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "[[Z")
    public static boolean[][] field1443;

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I)V")
    private class79(int arg0) {
        super(0, false);
        this.method448(1827239780, arg0);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBIIII)V")
    public static final void method447(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 35 / ((46 - arg1) / 44);
        ++field1433;
        long var7 = class13.method104(arg2, arg3, arg5);
        if (var7 != 0L) {
            int var9 = (int) var7 >> 20 & 3;
            int var10 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
            class209 var11 = class34.method232(167, var10);
            int var12 = (int) var7 >> 14 & 31;
            if (~var11.field3857 != 0) {
                class100 var13 = null;
                int var14 = var11.field3836;
                if (!var11.field3885) {
                    var13 = class3.field46[var11.field3857];
                } else if (var9 != 0) {
                    if (var9 == 1) {
                        var13 = class115.field2026[var11.field3857];
                        var14 = var11.field3877;
                    } else if (~var9 != -3) {
                        if (var9 == 3) {
                            var14 = var11.field3877;
                            var13 = class214.field3952[var11.field3857];
                        }
                    } else {
                        var13 = class283.field4993[var11.field3857];
                    }
                } else {
                    var13 = class3.field46[var11.field3857];
                }
                if (var13 != null) {
                    var13.method598(arg3 * 4 + 48, 48 - -((104 - arg5 - var14) * 4));
                }
            } else {
                int var15 = arg0;
                if (var7 > 0L) {
                    var15 = arg4;
                }
                int var16 = (-(arg5 * 512) + 52736) * 4 + arg3 * 4 + 24624;
                int[] var17 = class260.field4651;
                if (~var12 == -1 || ~var12 == -3) {
                    if (var9 == 0) {
                        var17[var16] = var15;
                        var17[var16 + 512] = var15;
                        var17[var16 + 1024] = var15;
                        var17[var16 + 1536] = var15;
                    } else if (var9 == 1) {
                        var17[var16] = var15;
                        var17[var16 + 1] = var15;
                        var17[var16 + 2] = var15;
                        var17[var16 - -3] = var15;
                    } else if (var9 == 2) {
                        var17[var16 + 3] = var15;
                        var17[var16 + 3 + 512] = var15;
                        var17[var16 + 3 + 1024] = var15;
                        var17[var16 + 3 + 1536] = var15;
                    } else if (var9 == 3) {
                        var17[var16 + 1536] = var15;
                        var17[var16 - -1536 + 1] = var15;
                        var17[var16 - -2 + 1536] = var15;
                        var17[var16 + 1536 - -3] = var15;
                    }
                }
                if (var12 == 3) {
                    if (~var9 == -1) {
                        var17[var16] = var15;
                    } else if (~var9 == -2) {
                        var17[var16 - -3] = var15;
                    } else if (var9 == 2) {
                        var17[var16 + 3 + 1536] = var15;
                    } else if (~var9 == -4) {
                        var17[var16 - -1536] = var15;
                    }
                }
                if (~var12 == -3) {
                    if (var9 == 3) {
                        var17[var16] = var15;
                        var17[var16 + 512] = var15;
                        var17[var16 - -1024] = var15;
                        var17[var16 - -1536] = var15;
                    } else if (~var9 == -1) {
                        var17[var16] = var15;
                        var17[var16 + 1] = var15;
                        var17[var16 + 2] = var15;
                        var17[var16 - -3] = var15;
                    } else if (var9 == 1) {
                        var17[var16 + 3] = var15;
                        var17[var16 - -512 + 3] = var15;
                        var17[var16 + 1027] = var15;
                        var17[var16 + 1536 - -3] = var15;
                    } else if (var9 == 2) {
                        var17[var16 + 1536] = var15;
                        var17[var16 + 1536 - -1] = var15;
                        var17[var16 + 1536 + 2] = var15;
                        var17[var16 + 1536 + 3] = var15;
                    }
                }
            }
        }
        long var18 = class141.method851(arg2, arg3, arg5);
        if (var18 != 0L) {
            int var20 = (3729142 & (int) var18) >> 20;
            int var21 = 31 & (int) var18 >> 14;
            int var22 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            class209 var23 = class34.method232(167, var22);
            if (~var23.field3857 == 0) {
                if (~var21 == -10) {
                    int var24 = 15658734;
                    if (~var18 < -1L) {
                        var24 = 15597568;
                    }
                    int[] var25 = class260.field4651;
                    int var26 = (-arg5 + 103) * 4 * 512 + (24624 - -(arg3 * 4));
                    if (var20 != 0 && ~var20 != -3) {
                        var25[var26] = var24;
                        var25[var26 + 513] = var24;
                        var25[var26 - -1026] = var24;
                        var25[var26 + 1536 - -3] = var24;
                    } else {
                        var25[var26 - -1536] = var24;
                        var25[var26 + 1 + 1024] = var24;
                        var25[var26 + 514] = var24;
                        var25[var26 + 3] = var24;
                    }
                }
            } else {
                int var27 = var23.field3836;
                class100 var28 = null;
                if (!var23.field3885) {
                    var28 = class3.field46[var23.field3857];
                } else if (~var20 != -1) {
                    if (~var20 != -2) {
                        if (var20 == 2) {
                            var28 = class283.field4993[var23.field3857];
                        } else if (var20 == 3) {
                            var27 = var23.field3877;
                            var28 = class214.field3952[var23.field3857];
                        }
                    } else {
                        var27 = var23.field3877;
                        var28 = class115.field2026[var23.field3857];
                    }
                } else {
                    var28 = class3.field46[var23.field3857];
                }
                if (var28 != null) {
                    var28.method598(arg3 * 4 + 48, (-arg5 + 104 - var27) * 4 + 48);
                }
            }
        }
        long var29 = class273.method1801(arg2, arg3, arg5);
        if (~var29 != -1L) {
            int var31 = 3 & (int) var29 >> 20;
            int var32 = (int) (var29 >>> 32) & Integer.MAX_VALUE;
            class209 var33 = class34.method232(167, var32);
            if (~var33.field3857 != 0) {
                class100 var34 = null;
                int var35 = var33.field3836;
                if (!var33.field3885) {
                    var34 = class3.field46[var33.field3857];
                } else if (~var31 == -1) {
                    var34 = class3.field46[var33.field3857];
                } else if (~var31 != -2) {
                    if (var31 == 2) {
                        var34 = class283.field4993[var33.field3857];
                    } else if (var31 == 3) {
                        var35 = var33.field3877;
                        var34 = class214.field3952[var33.field3857];
                    }
                } else {
                    var35 = var33.field3877;
                    var34 = class115.field2026[var33.field3857];
                }
                if (var34 != null) {
                    var34.method598(arg3 * 4 + 48, (-arg5 + -var35 + 104) * 4 + 48);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        ++field1436;
        if (~arg1 == -1) {
            this.method448(1827239780, arg0.method1282(127));
        }
        if (!arg2) {
            method447(-113, (byte) -47, -117, -99, 108, -53);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        ++field1435;
        if (arg1 != 1) {
            return null;
        } else {
            int[][] var3 = super.field366.method209(0, arg0);
            if (super.field366.field508) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~class72.field1359 < ~var7; ++var7) {
                    var4[var7] = this.field1431;
                    var5[var7] = this.field1427;
                    var6[var7] = this.field1437;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(II)V")
    private final void method448(int arg0, int arg1) {
        ++field1428;
        this.field1431 = (16711680 & arg1) >> 12;
        if (arg0 != 1827239780) {
            field1444 = null;
        }
        this.field1437 = 4080 & arg1 << 4;
        this.field1427 = 4080 & arg1 >> 4;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class79() {
        this(0);
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
    public static void method449(int arg0) {
        if (arg0 == -11438) {
            field1444 = null;
            field1429 = null;
            field1443 = null;
            field1439 = null;
            field1434 = null;
            field1440 = null;
            field1438 = null;
            field1441 = null;
            field1442 = null;
            field1430 = null;
        }
    }
}
