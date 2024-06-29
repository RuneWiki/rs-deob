import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class144 extends class89 {

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "Lda;")
    public static class275 field2525 = class255.method1672(121, " GMT");

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "Lda;")
    public static class275 field2528 = class255.method1672(120, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "Z")
    public static boolean field2523 = false;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!gb", name = "cb", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "Lma;")
    public static class105 field2530;

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "[I")
    public static int[] field2531;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "[[B")
    public static byte[][] field2520;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "[[[B")
    public static byte[][][] field2526;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)V")
    public static final void method1029(int arg0, int arg1) {
        ++field2527;
        if (class267.method1755(0, arg0)) {
            if (arg1 != 1) {
                method1032((byte) -109);
            }
            class229[] var2 = class173.field3005[arg0];
            for (int var3 = 0; var3 < var2.length; ++var3) {
                class229 var4 = var2[var3];
                if (var4 != null) {
                    var4.field3912 = 0;
                    var4.field3863 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method1030(byte[] arg0, boolean arg1) {
        ++field2529;
        if (arg1) {
            return null;
        } else {
            int var2 = arg0.length;
            byte[] var3 = new byte[var2];
            class154.method1085(arg0, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1031(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 15854) {
            field2520 = null;
        }
        if (~arg7 <= -1 && arg3 >= 0 && arg7 < 103 && arg3 < 103) {
            if (~arg5 == -1) {
                class139 var8 = class131.method960(arg6, arg7, arg3);
                if (var8 != null) {
                    int var9 = (int) (var8.field2426 >>> 32) & Integer.MAX_VALUE;
                    if (arg4 == 2) {
                        var8.field2444 = new class207(var9, 2, arg2 + 4, arg6, arg7, arg3, arg1, false, var8.field2444);
                        var8.field2446 = new class207(var9, 2, 3 & arg2 + 1, arg6, arg7, arg3, arg1, false, var8.field2446);
                    } else {
                        var8.field2444 = new class207(var9, arg4, arg2, arg6, arg7, arg3, arg1, false, var8.field2444);
                    }
                }
            }
            if (arg5 == 1) {
                class119 var10 = class200.method1310(arg6, arg7, arg3);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field2142 >>> 32);
                    if (arg4 != 4 && arg4 != 5) {
                        if (arg4 == 6) {
                            var10.field2136 = new class207(var11, 4, arg2 + 4, arg6, arg7, arg3, arg1, false, var10.field2136);
                        } else if (~arg4 != -8) {
                            if (arg4 == 8) {
                                var10.field2136 = new class207(var11, 4, arg2 + 4, arg6, arg7, arg3, arg1, false, var10.field2136);
                                var10.field2135 = new class207(var11, 4, (3 & arg2 + 2) + 4, arg6, arg7, arg3, arg1, false, var10.field2135);
                            }
                        } else {
                            var10.field2136 = new class207(var11, 4, (arg2 + 2 & 3) + 4, arg6, arg7, arg3, arg1, false, var10.field2136);
                        }
                    } else {
                        var10.field2136 = new class207(var11, 4, arg2, arg6, arg7, arg3, arg1, false, var10.field2136);
                    }
                }
            }
            if (arg5 == 2) {
                if (arg4 == 11) {
                    arg4 = 10;
                }
                class37 var12 = class65.method439(arg6, arg7, arg3);
                if (var12 != null) {
                    var12.field612 = new class207(Integer.MAX_VALUE & (int) (var12.field608 >>> 32), arg4, arg2, arg6, arg7, arg3, arg1, false, var12.field612);
                }
            }
            if (arg5 == 3) {
                class214 var13 = class150.method1062(arg6, arg7, arg3);
                if (var13 != null) {
                    var13.field3648 = new class207((int) (var13.field3645 >>> 32) & Integer.MAX_VALUE, 22, arg2, arg6, arg7, arg3, arg1, false, var13.field3648);
                }
            }
        }
        ++field2524;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class144() {
        super(3, false);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        ++field2532;
        int[][] var3 = super.field1512.method824(arg1, (byte) -33);
        if (!arg0) {
            field2528 = null;
        }
        if (super.field1512.field2007) {
            int[] var4 = this.method645(73, 2, arg1);
            int[][] var5 = this.method648(true, 0, arg1);
            int[][] var6 = this.method648(true, 1, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[1];
            int[] var11 = var5[2];
            int[] var12 = var5[0];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class65.field1070 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var12[var16];
                    var8[var16] = var10[var16];
                    var9[var16] = var11[var16];
                } else if (~var17 != -1) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var12[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var10[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (arg0 == -20503) {
            if (~arg2 == -1) {
                super.field1508 = arg1.method564((byte) 126) == 1;
            }
            ++field2522;
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
    public static void method1032(byte arg0) {
        field2520 = null;
        field2525 = null;
        if (arg0 != -37) {
            field2526 = null;
        }
        field2530 = null;
        field2531 = null;
        field2526 = null;
        field2528 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        ++field2521;
        int[] var3 = super.field1503.method229(arg0, (byte) -51);
        if (arg1) {
            field2526 = null;
        }
        if (super.field1503.field664) {
            int[] var4 = this.method645(46, 0, arg0);
            int[] var5 = this.method645(-22, 1, arg0);
            int[] var6 = this.method645(107, 2, arg0);
            for (int var7 = 0; ~class65.field1070 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (~var8 != -1) {
                        var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }
}
