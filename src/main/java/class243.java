import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class243 extends class87 {

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    private int field3571 = 4;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "I")
    private int field3582 = 4;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "Z")
    public static boolean field3576 = false;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "Z")
    public static boolean field3577 = true;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public static int field3573 = 0;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    public static int field3574 = 0;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "Llc;")
    public static class270 field3578;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field3572;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "[[[B")
    public static byte[][][] field3584;

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class243() {
        super(1, false);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(IB)V")
    public static final void method1663(int arg0, byte arg1) {
        class43.field566.method1420((byte) -3);
        int var2 = -118 % ((-71 - arg1) / 43);
        ++field3583;
        class43.field566 = new class201(arg0);
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(I)V")
    public static void method1664(int arg0) {
        field3578 = null;
        field3572 = null;
        field3584 = null;
        if (arg0 != 578156820) {
            method1663(-71, (byte) 18);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        ++field3570;
        if (arg2 != 25645) {
            this.field3571 = 123;
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field3582 = arg0.method366(-16505);
            }
        } else {
            this.field3571 = arg0.method366(-16505);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZIIIIII)Z")
    public static final boolean method1665(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1) {
            return false;
        } else {
            ++field3581;
            long var8 = class205.method1455(arg4, arg3 + arg5, arg0 + arg6);
            if (~var8 != -1L) {
                int var10 = ((int) var8 & 3374705) >> 20;
                int var11 = 31 & (int) var8 >> 14;
                int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
                class93 var13 = class48.method297(arg1, var12);
                if (var13.field1550 == -1) {
                    int[] var14 = class130.field2164;
                    int var15 = (-(arg6 * 512) + 52736) * 4 + arg5 * 4 + 24624;
                    int var16 = arg2;
                    if (var8 > 0L) {
                        var16 = arg7;
                    }
                    if (~var11 == -1 || ~var11 == -3) {
                        if (var10 == 0) {
                            var14[var15] = var16;
                            var14[var15 + 512] = var16;
                            var14[var15 + 1024] = var16;
                            var14[var15 + 1536] = var16;
                        } else if (~var10 == -2) {
                            var14[var15] = var16;
                            var14[var15 + 1] = var16;
                            var14[var15 - -2] = var16;
                            var14[var15 + 3] = var16;
                        } else if (var10 == 2) {
                            var14[var15 - -3] = var16;
                            var14[var15 + 3 + 512] = var16;
                            var14[var15 + 1027] = var16;
                            var14[var15 + 3 + 1536] = var16;
                        } else if (~var10 == -4) {
                            var14[var15 + 1536] = var16;
                            var14[var15 + 1536 + 1] = var16;
                            var14[var15 + 1538] = var16;
                            var14[var15 + 3 + 1536] = var16;
                        }
                    }
                    if (var11 == 3) {
                        if (var10 != 0) {
                            if (var10 == 1) {
                                var14[var15 + 3] = var16;
                            } else if (~var10 != -3) {
                                if (~var10 == -4) {
                                    var14[var15 + 1536] = var16;
                                }
                            } else {
                                var14[var15 + 1536 - -3] = var16;
                            }
                        } else {
                            var14[var15] = var16;
                        }
                    }
                    if (var11 == 2) {
                        if (~var10 != -4) {
                            if (var10 != 0) {
                                if (var10 != 1) {
                                    if (var10 == 2) {
                                        var14[var15 + 1536] = var16;
                                        var14[var15 - -1536 + 1] = var16;
                                        var14[var15 + 1538] = var16;
                                        var14[var15 + 1536 - -3] = var16;
                                    }
                                } else {
                                    var14[var15 + 3] = var16;
                                    var14[var15 + 3 - -512] = var16;
                                    var14[var15 + 1027] = var16;
                                    var14[var15 + 3 + 1536] = var16;
                                }
                            } else {
                                var14[var15] = var16;
                                var14[var15 - -1] = var16;
                                var14[var15 + 2] = var16;
                                var14[var15 + 3] = var16;
                            }
                        } else {
                            var14[var15] = var16;
                            var14[var15 + 512] = var16;
                            var14[var15 + 1024] = var16;
                            var14[var15 + 1536] = var16;
                        }
                    }
                } else if (!class268.method1852(var10, arg5, arg0, arg3, false, var13, arg6)) {
                    return false;
                }
            }
            long var17 = class238.method1637(arg4, arg3 + arg5, arg0 + arg6);
            if (~var17 != -1L) {
                int var19 = 3 & (int) var17 >> 20;
                int var20 = (int) var17 >> 14 & 31;
                int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
                class93 var22 = class48.method297(false, var21);
                if (~var22.field1550 != 0) {
                    if (!class268.method1852(var19, arg5, arg0, arg3, false, var22, arg6)) {
                        return false;
                    }
                } else if (var20 == 9) {
                    int var23 = arg5 * 4 + (-arg6 + 103) * 4 * 512 + 24624;
                    int[] var24 = class130.field2164;
                    int var25 = 15658734;
                    if (~var17 < -1L) {
                        var25 = 15597568;
                    }
                    if (~var19 != -1 && var19 != 2) {
                        var24[var23] = var25;
                        var24[var23 + 513] = var25;
                        var24[var23 - -1026] = var25;
                        var24[var23 + 3 + 1536] = var25;
                    } else {
                        var24[var23 - -1536] = var25;
                        var24[var23 + 1024 + 1] = var25;
                        var24[var23 + 512 + 2] = var25;
                        var24[var23 + 3] = var25;
                    }
                }
            }
            long var26 = class91.method678(arg4, arg3 + arg5, arg6 - -arg0);
            if (var26 != 0L) {
                int var28 = ((int) var26 & 3928806) >> 20;
                int var29 = (int) (var26 >>> 32) & Integer.MAX_VALUE;
                class93 var30 = class48.method297(false, var29);
                if (~var30.field1550 != 0 && !class268.method1852(var28, arg5, arg0, arg3, false, var30, arg6)) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field3579;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            int var4 = class206.field3032 / this.field3571;
            int var5 = class123.field2045 / this.field3582;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method642(0, class123.field2045 * var6 / var5, true);
            } else {
                var7 = this.method642(0, 0, true);
            }
            for (int var8 = 0; var8 < class206.field3032; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class206.field3032 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)[[I")
    public final int[][] method143(int arg0, int arg1) {
        ++field3585;
        if (arg1 != 6) {
            return null;
        } else {
            int[][] var3 = super.field1390.method1902(arg1 ^ -100, arg0);
            if (super.field1390.field4428) {
                int var4 = class206.field3032 / this.field3571;
                int var5 = class123.field2045 / this.field3582;
                int[][] var7;
                if (~var5 < -1) {
                    int var6 = arg0 % var5;
                    var7 = this.method648(class123.field2045 * var6 / var5, arg1 ^ -128, 0);
                } else {
                    var7 = this.method648(0, 36, 0);
                }
                int[] var8 = var7[1];
                int[] var9 = var7[0];
                int[] var10 = var7[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; var14 < class206.field3032; ++var14) {
                    int var16;
                    if (var4 > 0) {
                        int var15 = var14 % var4;
                        var16 = class206.field3032 * var15 / var4;
                    } else {
                        var16 = 0;
                    }
                    var11[var14] = var9[var16];
                    var12[var14] = var8[var16];
                    var13[var14] = var10[var16];
                }
            }
            return var3;
        }
    }
}
