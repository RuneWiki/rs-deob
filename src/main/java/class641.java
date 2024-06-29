import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class641 {

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
    private int field9119 = -1;

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "Z")
    public boolean field9128 = true;

    @OriginalMember(owner = "client!lca", name = "q", descriptor = "Lica;")
    private class660 field9131;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "Lgt;")
    private class453 field9115;

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "I")
    private int field9122;

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
    private int field9129;

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
    public int field9121;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "Lwda;")
    private class636 field9116;

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
    private int field9123;

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "I")
    private int field9117;

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "Lida;")
    private class234 field9126;

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "[[I")
    public static int[][] field9130 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
    public static int field9124 = 1;

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "I")
    public static int field9118;

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V", line = 3)
    public final void method3659(int arg0) {
        if (arg0 >= 60) {
            field9120++;
            this.method3660(-6781, this.field9121, this.field9126);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IILida;)V", line = 16)
    public final void method3660(int arg0, int arg1, class234 arg2) {
        if (arg0 != -6781) {
            return;
        }
        field9127++;
        if (arg1 > 0) {
            this.method3662(false);
            this.field9115.method2732(-68, this.field9116);
            this.field9115.method1046(0, this.field9123 + 1 - this.field9117, arg2, (byte) 95, arg1, class428.field5978, this.field9117);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V", line = 33)
    public static void method3661(byte arg0) {
        if (arg0 == -119) {
            field9130 = null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lgt;Lica;Lov;IIIII)V", line = 241)
    public class641(class453 arg0, class660 arg1, class186 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field9131 = arg1;
        this.field9115 = arg0;
        this.field9122 = arg6;
        this.field9129 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field3924 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field2667[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field9121 = 0;
            this.field9116 = null;
        } else {
            this.field9123 = Integer.MIN_VALUE;
            this.field9117 = Integer.MAX_VALUE;
            this.field9126 = this.field9115.method1047(-123, false);
            this.field9126.method1600(var10, 113);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field9126.method1599(true, (byte) 0);
                if (var15 != null) {
                    Stream var16 = this.field9115.method2764(var15, (byte) -76);
                    if (Stream.method3762()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field3924 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field2667[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field9123 < var22) {
                                            this.field9123 = var22;
                                        }
                                        if (var22 < this.field9117) {
                                            this.field9117 = var22;
                                        }
                                        var16.method3766(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field3924 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field2667[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 < this.field9117) {
                                            this.field9117 = var28;
                                        }
                                        if (var28 > this.field9123) {
                                            this.field9123 = var28;
                                        }
                                        var16.method3768(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3761();
                    if (this.field9126.method1601(123)) {
                        break;
                    }
                }
            }
            this.field9121 = var10 / 3;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Z)V", line = 62)
    private final void method3662(boolean arg0) {
        field9125++;
        if (!this.field9128) {
            return;
        }
        this.field9128 = arg0;
        byte[] var2 = this.field9131.field9292;
        int var3 = 0;
        int var4 = this.field9131.field9303;
        int var5 = this.field9131.field9303 * this.field9129 + this.field9122;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field9116 != null && this.field9119 == var3) {
            this.field9128 = false;
            return;
        }
        this.field9119 = var3;
        int var7 = 0;
        int var8 = this.field9122 + (this.field9129 * var4);
        if (!this.field9115.method1035(-97, class438.field6117, class643.field9137)) {
            if (class359.field5045 == null) {
                class359.field5045 = new int[16384];
            }
            int[] var13 = class359.field5045;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var8] == 0) {
                        int var16 = 0;
                        if (var2[var8 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var4 + var8] != 0) {
                            var16++;
                        }
                        var13[var7++] = var16 * 17 << 24;
                    } else {
                        var13[var7++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field9131.field9303 - 128;
            }
            if (this.field9116 == null) {
                this.field9116 = this.field9115.method2740(false, 128, 128, class359.field5045, (byte) -100);
                this.field9116.method427(false, (byte) 66, false);
            } else {
                this.field9116.method434(128, 0, 0, !arg0, 128, 128, class359.field5045, 0);
            }
            return;
        }
        if (class22.field285 == null) {
            class22.field285 = new byte[16384];
        }
        byte[] var9 = class22.field285;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var8 + var4] != 0) {
                        var12++;
                    }
                    var9[var7++] = (byte) (var12 * 17);
                } else {
                    var9[var7++] = 68;
                }
                var8++;
            }
            var8 += this.field9131.field9303 - 128;
        }
        if (this.field9116 == null) {
            this.field9116 = this.field9115.method2750(class22.field285, false, 128, class643.field9137, 128, -19);
            this.field9116.method427(false, (byte) 66, false);
        } else {
            this.field9116.method433(128, 128, 0, 0, 128, class643.field9137, false, class22.field285, 0);
        }
    }
}
