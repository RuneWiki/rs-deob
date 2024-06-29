import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class550 {

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "Z")
    public boolean field7889 = true;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    private int field7894 = -1;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "Lln;")
    private class377 field7897;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    private int field7890;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    private int field7888;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "Lnw;")
    private class584 field7886;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    private int field7893;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    private int field7887;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "Lkga;")
    private class543 field7892;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
    public int field7891;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "Loq;")
    private class358 field7901;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "Z")
    public static boolean field7899 = false;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "Lbq;")
    public static class289 field7900 = new class289();

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "Ldh;")
    public static class320 field7902 = new class320(38, 4);

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "D")
    public static double field7903;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public static int field7895;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field7896;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "[I")
    private static int[] field7904;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILkga;)V")
    public final void method3227(int arg0, int arg1, class543 arg2) {
        if (arg1 > 0) {
            this.method3230((byte) 49);
            this.field7897.method2207((byte) -61, this.field7901);
            this.field7897.method2295(class178.field2092, -105, arg2, this.field7893, arg1, 0, this.field7887 + 1 - this.field7893);
        }
        if (arg0 != 1) {
            method3228((byte) -111);
        }
        field7896++;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V")
    public static void method3228(byte arg0) {
        field7900 = null;
        field7902 = null;
        if (arg0 != -67) {
            field7899 = true;
        }
        field7904 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
    public final void method3229(int arg0) {
        if (arg0 >= -32) {
            this.field7886 = null;
        }
        this.method3227(1, this.field7891, this.field7892);
        field7898++;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V")
    private final void method3230(byte arg0) {
        field7895++;
        if (!this.field7889) {
            return;
        }
        this.field7889 = false;
        byte[] var2 = this.field7886.field8235;
        int var3 = 0;
        int var4 = this.field7886.field8248;
        int var5 = this.field7888 + (this.field7886.field8248 * this.field7890);
        int var6 = -128;
        if (arg0 <= 19) {
            this.method3227(-83, 72, null);
        }
        while (var6 < 0) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
            var6++;
        }
        if (this.field7901 != null && this.field7894 == var3) {
            this.field7889 = false;
            return;
        }
        this.field7894 = var3;
        int var7 = 0;
        int var8 = this.field7890 * var4 + this.field7888;
        if (!this.field7897.method2192(class252.field3039, class687.field9697, true)) {
            if (field7904 == null) {
                field7904 = new int[16384];
            }
            int[] var9 = field7904;
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
                        var9[var7++] = var12 * 17 << 24;
                    } else {
                        var9[var7++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field7886.field8248 - 128;
            }
            if (this.field7901 == null) {
                this.field7901 = this.field7897.method2266(field7904, -128, 128, 128, false);
                this.field7901.method604(false, false, (byte) -43);
            } else {
                this.field7901.method605(0, 128, 128, 0, field7904, 0, false, 128);
            }
            return;
        }
        if (class22.field203 == null) {
            class22.field203 = new byte[16384];
        }
        byte[] var13 = class22.field203;
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
                    var13[var7++] = (byte) (var16 * 17);
                } else {
                    var13[var7++] = 68;
                }
                var8++;
            }
            var8 += this.field7886.field8248 - 128;
        }
        if (this.field7901 == null) {
            this.field7901 = this.field7897.method2323(class22.field203, class252.field3039, 128, 128, -113, false);
            this.field7901.method604(false, false, (byte) -43);
        } else {
            this.field7901.method601(128, 128, (byte) -1, class22.field203, 0, 128, 0, class252.field3039, 0);
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lln;Lnw;Lum;IIIII)V")
    public class550(class377 arg0, class584 arg1, class523 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field7897 = arg0;
        this.field7890 = arg7;
        this.field7888 = arg6;
        this.field7886 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field3410 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field7444[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field7901 = null;
            this.field7891 = 0;
        } else {
            this.field7893 = Integer.MAX_VALUE;
            this.field7887 = Integer.MIN_VALUE;
            this.field7892 = this.field7897.method2235(false, 9);
            this.field7892.method267(30903, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field7892.method263(13931, true);
                if (var15 != null) {
                    Stream var16 = this.field7897.method2299(var15, 0);
                    if (Stream.method3823()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field3410 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field7444[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 > this.field7887) {
                                            this.field7887 = var28;
                                        }
                                        if (this.field7893 > var28) {
                                            this.field7893 = var28;
                                        }
                                        var16.method3820(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field3410 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field7444[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 < this.field7893) {
                                            this.field7893 = var22;
                                        }
                                        if (this.field7887 < var22) {
                                            this.field7887 = var22;
                                        }
                                        var16.method3816(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3821();
                    if (this.field7892.method266(-19067)) {
                        break;
                    }
                }
            }
            this.field7891 = var10 / 3;
        }
    }
}
