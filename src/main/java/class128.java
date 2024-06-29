import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class128 extends class23 {

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
    private int field2398 = 4096;

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "I")
    private int field2408 = 4096;

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "I")
    private int field2407 = 409;

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "[I")
    private int[] field2409 = new int[3];

    @OriginalMember(owner = "client!lh", name = "fb", descriptor = "I")
    private int field2412 = 4096;

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "Lob;")
    public static class154 field2397 = new class154(8);

    @OriginalMember(owner = "client!lh", name = "db", descriptor = "I")
    public static int field2410 = 0;

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "Li;")
    public static class88 field2402 = class208.method1425(105, ":assist:");

    @OriginalMember(owner = "client!lh", name = "gb", descriptor = "Li;")
    private static class88 field2413 = class208.method1425(105, "Members only world");

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "Li;")
    public static class88 field2406 = field2413;

    @OriginalMember(owner = "client!lh", name = "hb", descriptor = "Li;")
    public static class88 field2414 = class208.method1425(105, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!lh", name = "eb", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!lh", name = "X", descriptor = "[I")
    public static int[] field2404;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V")
    public static final void method871(byte arg0) {
        class89.field1695 = new class248();
        ++field2405;
        if (arg0 != 88) {
            method871((byte) -62);
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class128() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        int[][] var3 = super.field364.method1541(true, arg0);
        if (super.field364.field4312) {
            int[][] var4 = this.method121(0, (byte) 114, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class70.field1276 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field2409[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field2407) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field2409[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field2407 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field2409[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (var17 > this.field2407) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field2412 * var12 >> 12;
                            var9[var11] = this.field2408 * var14 >> 12;
                            var10[var11] = this.field2398 * var16 >> 12;
                        }
                    }
                }
            }
        }
        ++field2401;
        if (arg1 != 13) {
            this.field2408 = 80;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)V")
    public static void method872(int arg0) {
        if (arg0 >= -103) {
            field2406 = null;
        }
        field2413 = null;
        field2402 = null;
        field2397 = null;
        field2404 = null;
        field2414 = null;
        field2406 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            int var5 = arg0.method304(-29629);
                            this.field2409[0] = class70.method470(var5 << 4, 267386880);
                            this.field2409[1] = class70.method470(var5, 65280) >> 4;
                            this.field2409[2] = class70.method470(255, var5) >> 12;
                        }
                    } else {
                        this.field2412 = arg0.method301(arg1 + 73);
                    }
                } else {
                    this.field2408 = arg0.method301(arg1 + 55);
                }
            } else {
                this.field2398 = arg0.method301(arg1 ^ -26);
            }
        } else {
            this.field2407 = arg0.method301(68);
        }
        if (arg1 != -3) {
            field2413 = null;
        }
        ++field2400;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZIII)V")
    public static final void method873(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        long var6 = class157.method1064(arg3, arg5, arg0);
        if (!arg2) {
            field2413 = null;
        }
        ++field2403;
        if (var6 != 0L) {
            int var8 = ((int) var6 & 3747267) >> 20;
            int var9 = (508845 & (int) var6) >> 14;
            int var10 = arg4;
            int[] var11 = class72.field1331;
            int var12 = (52736 - arg0 * 512) * 4 + arg5 * 4 + 24624;
            int var13 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            if (~var6 < -1L) {
                var10 = arg1;
            }
            class148 var14 = class190.method1323(var13, -12450);
            if (~var14.field2834 == 0) {
                if (var9 == 0 || var9 == 2) {
                    if (~var8 != -1) {
                        if (var8 != 1) {
                            if (~var8 == -3) {
                                var11[var12 + 3] = var10;
                                var11[var12 + 515] = var10;
                                var11[var12 + 3 + 1024] = var10;
                                var11[var12 + 3 - -1536] = var10;
                            } else if (~var8 == -4) {
                                var11[var12 - -1536] = var10;
                                var11[var12 + 1 + 1536] = var10;
                                var11[var12 + 2 - -1536] = var10;
                                var11[var12 + 1536 + 3] = var10;
                            }
                        } else {
                            var11[var12] = var10;
                            var11[var12 + 1] = var10;
                            var11[var12 + 2] = var10;
                            var11[var12 + 3] = var10;
                        }
                    } else {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                    } else if (~var8 != -2) {
                        if (~var8 == -3) {
                            var11[var12 - -1536 + 3] = var10;
                        } else if (var8 == 3) {
                            var11[var12 + 1536] = var10;
                        }
                    } else {
                        var11[var12 + 3] = var10;
                    }
                }
                if (~var9 == -3) {
                    if (~var8 != -4) {
                        if (~var8 != -1) {
                            if (var8 == 1) {
                                var11[var12 + 3] = var10;
                                var11[var12 - -512 + 3] = var10;
                                var11[var12 + 3 + 1024] = var10;
                                var11[var12 + 1536 + 3] = var10;
                            } else if (~var8 == -3) {
                                var11[var12 + 1536] = var10;
                                var11[var12 + 1536 - -1] = var10;
                                var11[var12 - -1538] = var10;
                                var11[var12 + 1536 + 3] = var10;
                            }
                        } else {
                            var11[var12] = var10;
                            var11[var12 + 1] = var10;
                            var11[var12 - -2] = var10;
                            var11[var12 + 3] = var10;
                        }
                    } else {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 - -1536] = var10;
                    }
                }
            } else {
                class193 var15 = class240.field4462[var14.field2834];
                if (var15 != null) {
                    int var16 = (var14.field2776 * 4 + -var15.field2436) / 2;
                    int var17 = (var14.field2796 * 4 + -var15.field2439) / 2;
                    var15.method878(48 - -(arg5 * 4) + var16, 48 - -((104 - (arg0 - -var14.field2796)) * 4) + var17);
                }
            }
        }
        long var18 = class112.method772(arg3, arg5, arg0);
        if (~var18 != -1L) {
            int var20 = ((int) var18 & 3211596) >> 20;
            int var21 = ((int) var18 & 517438) >> 14;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class148 var23 = class190.method1323(var22, -12450);
            if (~var23.field2834 != 0) {
                class193 var24 = class240.field4462[var23.field2834];
                if (var24 != null) {
                    int var25 = (var23.field2776 * 4 - var24.field2436) / 2;
                    int var26 = (var23.field2796 * 4 - var24.field2439) / 2;
                    var24.method878(arg5 * 4 + 48 - -var25, (-var23.field2796 + -arg0 + 104) * 4 + var26 + 48);
                }
            } else if (var21 == 9) {
                int var27 = 15658734;
                int[] var28 = class72.field1331;
                if (~var18 < -1L) {
                    var27 = 15597568;
                }
                int var29 = arg5 * 4 + 24624 - -((103 - arg0) * 4 * 512);
                if (var20 != 0 && var20 != 2) {
                    var28[var29] = var27;
                    var28[var29 + 512 + 1] = var27;
                    var28[var29 + 1024 + 2] = var27;
                    var28[var29 + 1539] = var27;
                } else {
                    var28[var29 + 1536] = var27;
                    var28[var29 + 1025] = var27;
                    var28[var29 + 514] = var27;
                    var28[var29 - -3] = var27;
                }
            }
        }
        long var30 = class74.method501(arg3, arg5, arg0);
        if (~var30 != -1L) {
            int var32 = Integer.MAX_VALUE & (int) (var30 >>> 32);
            class148 var33 = class190.method1323(var32, -12450);
            if (~var33.field2834 != 0) {
                class193 var34 = class240.field4462[var33.field2834];
                if (var34 != null) {
                    int var35 = (var33.field2776 * 4 - var34.field2436) / 2;
                    int var36 = (var33.field2796 * 4 - var34.field2439) / 2;
                    var34.method878(arg5 * 4 + 48 + var35, (-var33.field2796 + 104 + -arg0) * 4 + 48 - -var36);
                    return;
                }
            }
        }
    }
}
