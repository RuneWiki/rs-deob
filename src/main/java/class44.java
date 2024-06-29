import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class44 extends class202 {

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "Z")
    public boolean field957 = false;

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "Lae;")
    private class166 field971;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "Z")
    private boolean field955;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "Z")
    private boolean field968;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    private int field958;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    private int field963;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "Loh;")
    public static class263 field952 = class253.method1681(-123, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "Loh;")
    private static class263 field960 = class253.method1681(-126, "Ok");

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "Z")
    public static boolean field961 = false;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "Loh;")
    public static class263 field964 = class253.method1681(-119, "Cache:");

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "Loh;")
    public static class263 field967 = field960;

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
    public static int field969 = 0;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "F")
    private float field956;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "[I")
    private int[] field965;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lhc;FLue;IZ)[I")
    public final int[] method266(class221 arg0, float arg1, class86 arg2, int arg3, boolean arg4) {
        int var6 = -24 / ((arg3 - 86) / 40);
        field972++;
        if (this.field965 == null || this.field956 != arg1) {
            if (!this.field971.method1096(arg0, (byte) -125, arg2)) {
                return null;
            }
            int var7 = arg4 ? 64 : 128;
            this.field965 = this.field971.method1093(var7, false, this.field968, (double) arg1, arg0, arg2, var7, true);
            this.field956 = arg1;
            if (this.field955) {
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                int[] var11 = new int[var7 * var7];
                int var13 = var7 - 1;
                int var14 = var7;
                int var15 = var7;
                int var16 = var7;
                int var17 = var7 * var7;
                int var18 = var7 - 1;
                for (int var19 = 2; var19 >= 0; var19--) {
                    for (int var35 = var18; var35 >= 0; var35--) {
                        var15--;
                        int var36 = this.field965[var15];
                        var8[var35] += class263.method1777(255, var36 >> 16);
                        var9[var35] += class263.method1777(255, var36 >> 8);
                        var10[var35] += class263.method1777(255, var36);
                    }
                    if (var15 == 0) {
                        var15 = var17;
                    }
                }
                int var20 = var17;
                for (int var21 = var13; var21 >= 0; var21--) {
                    int var22 = 1;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var22--;
                        var25 += var8[var22];
                        var24 += var10[var22];
                        var23 += var9[var22];
                        if (var22 == 0) {
                            var22 = var14;
                        }
                    }
                    int var27 = 1;
                    for (int var28 = var18; var28 >= 0; var28--) {
                        var22--;
                        var27--;
                        int var32 = var24 / 9;
                        int var33 = var23 / 9;
                        int var34 = var25 / 9;
                        var20--;
                        var11[var20] = class160.method1052(var32, class160.method1052(var33 << 8, var34 << 16));
                        var23 += var9[var22] - var9[var27];
                        var25 += var8[var22] - var8[var27];
                        var24 += var10[var22] - var10[var27];
                        if (var27 == 0) {
                            var27 = var14;
                        }
                        if (var22 == 0) {
                            var22 = var14;
                        }
                    }
                    for (int var29 = var18; var29 >= 0; var29--) {
                        var16--;
                        int var30 = this.field965[var16];
                        var15--;
                        int var31 = this.field965[var15];
                        var8[var29] += -(class263.method1777(16748983, var30) >> 16) + (class263.method1777(var31, 16740381) >> 16);
                        var9[var29] += -(class263.method1777(var30, 65524) >> 8) + class263.method1777(255, var31 >> 8);
                        var10[var29] += class263.method1777(var31, 255) - class263.method1777(255, var30);
                    }
                    if (var15 == 0) {
                        var15 = var17;
                    }
                    if (var16 == 0) {
                        var16 = var17;
                    }
                }
                this.field965 = var11;
            }
        }
        return this.field965;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V")
    public final void method267(int arg0, int arg1) {
        field966++;
        if (this.field965 == null || ~this.field963 == arg1 && this.field958 == 0) {
            return;
        }
        if (class209.field3777 == null || class209.field3777.length < this.field965.length) {
            class209.field3777 = new int[this.field965.length];
        }
        int var3 = this.field965.length == 4096 ? 64 : 128;
        int var4 = this.field965.length;
        int var5 = this.field958 * arg0;
        int var6 = var3 - 1;
        int var7 = this.field963 * arg0 * var3;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var11 = var8 & var9 + var7;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = var9 + var12;
                int var14 = (var5 + var12 & var6) + var11;
                class209.field3777[var13] = this.field965[var14];
            }
        }
        int[] var10 = this.field965;
        this.field965 = class209.field3777;
        class209.field3777 = var10;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= 0 && arg4 >= 0 && arg1 < 103 && arg4 < 103) {
            if (arg7 == 0) {
                class22 var8 = class228.method1548(arg6, arg1, arg4);
                if (var8 != null) {
                    int var9 = (int) (var8.field646 >>> 32) & Integer.MAX_VALUE;
                    if (arg0 == 2) {
                        var8.field633 = new class82(var9, 2, arg3 + 4, arg6, arg1, arg4, arg5, false, var8.field633);
                        var8.field641 = new class82(var9, 2, arg3 + 1 & 0x3, arg6, arg1, arg4, arg5, false, var8.field641);
                    } else {
                        var8.field633 = new class82(var9, arg0, arg3, arg6, arg1, arg4, arg5, false, var8.field633);
                    }
                }
            }
            if (arg7 == 1) {
                class138 var10 = class173.method1140(arg6, arg1, arg4);
                if (var10 != null) {
                    int var11 = (int) (var10.field2550 >>> 32) & Integer.MAX_VALUE;
                    if (arg0 == 4 || arg0 == 5) {
                        var10.field2546 = new class82(var11, 4, arg3, arg6, arg1, arg4, arg5, false, var10.field2546);
                    } else if (arg0 == 6) {
                        var10.field2546 = new class82(var11, 4, arg3 + 4, arg6, arg1, arg4, arg5, false, var10.field2546);
                    } else if (arg0 == 7) {
                        var10.field2546 = new class82(var11, 4, (arg3 + 2 & 0x3) + 4, arg6, arg1, arg4, arg5, false, var10.field2546);
                    } else if (arg0 == 8) {
                        var10.field2546 = new class82(var11, 4, arg3 + 4, arg6, arg1, arg4, arg5, false, var10.field2546);
                        var10.field2559 = new class82(var11, 4, (arg3 + 2 & 0x3) + 4, arg6, arg1, arg4, arg5, false, var10.field2559);
                    }
                }
            }
            if (arg7 == 2) {
                class70 var12 = class24.method176(arg6, arg1, arg4);
                if (arg0 == 11) {
                    arg0 = 10;
                }
                if (var12 != null) {
                    var12.field1398 = new class82((int) (var12.field1408 >>> 32) & Integer.MAX_VALUE, arg0, arg3, arg6, arg1, arg4, arg5, false, var12.field1398);
                }
            }
            if (arg7 == 3) {
                class165 var13 = class217.method1478(arg6, arg1, arg4);
                if (var13 != null) {
                    var13.field3002 = new class82((int) (var13.field3013 >>> 32) & Integer.MAX_VALUE, 22, arg3, arg6, arg1, arg4, arg5, false, var13.field3002);
                }
            }
        }
        int var14 = -117 % ((arg2 - 20) / 53);
        field962++;
    }

    @OriginalMember(owner = "client!rh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field951++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lhc;ZLue;I)[I")
    public final int[] method269(class221 arg0, boolean arg1, class86 arg2, int arg3) {
        field954++;
        if (!this.field971.method1096(arg0, (byte) 100, arg2)) {
            return null;
        }
        if (arg3 != 64) {
            field969 = -29;
        }
        int var5 = arg1 ? 64 : 128;
        return this.field971.method1093(var5, false, this.field968, 1.0D, arg0, arg2, var5, false);
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
    public static void method270(int arg0) {
        field964 = null;
        if (arg0 != 2131512800) {
            field952 = null;
        }
        field967 = null;
        field960 = null;
        field952 = null;
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
    public static final void method271(int arg0) {
        class224.field3949.method830(50);
        class18.field406.method830(arg0 ^ 0xFFFFFFCD);
        if (arg0 == -1) {
            class103.field1956.method830(50);
            field970++;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lhc;Lue;I)Z")
    public final boolean method272(class221 arg0, class86 arg1, int arg2) {
        if (arg2 != Integer.MAX_VALUE) {
            this.method272((class221) null, (class86) null, -114);
        }
        field953++;
        return this.field971.method1096(arg0, (byte) 38, arg1);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V")
    public static final void method273(int arg0, int arg1, int arg2) {
        if (class49.field1052 != arg0) {
            class70.field1409 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class70.field1409[var3] = (var3 << 12) / arg0;
            }
            class200.field3622 = arg0 == 64 ? 2048 : 4096;
            class166.field3024 = arg0 - 1;
            class49.field1052 = arg0;
        }
        if (arg1 != 4269) {
            return;
        }
        field959++;
        if (class60.field1235 == arg2) {
            return;
        }
        if (class49.field1052 == arg2) {
            class275.field4825 = class70.field1409;
        } else {
            class275.field4825 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class275.field4825[var4] = (var4 << 12) / arg2;
            }
        }
        class60.field1235 = arg2;
        class277.field4846 = arg2 - 1;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lsi;)V")
    public class44(class194 arg0) {
        this.field971 = new class166(arg0);
        this.field955 = arg0.method1301(-8317) == 1;
        this.field968 = arg0.method1301(-8317) == 1;
        arg0.method1301(-8317);
        arg0.method1301(-8317);
        int var2 = arg0.method1301(-8317) & 0x3;
        this.field958 = arg0.method1281((byte) 126);
        this.field963 = arg0.method1281((byte) 124);
        arg0.method1301(-8317);
        arg0.method1301(-8317);
    }
}
