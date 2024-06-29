import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class90 {

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "Lqq;")
    private class651 field1088;

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "Ljba;")
    private class704 field1101;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
    public int field1092;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
    private int field1093;

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "[B")
    public byte[] field1102;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
    private int field1094;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    private int field1086;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
    private int field1096;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "Leba;")
    public static class550 field1098 = new class550(25, -1);

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "[[Law;")
    private class670[][] field1103;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILha;I)V")
    public final void method489(int arg0, int arg1, class117 arg2, int arg3) {
        field1097++;
        class239 var5 = (class239) arg2;
        int var6 = var5.field3163 + arg1 + 1;
        int var7 = var5.field3170 + arg3 + 1;
        int var8 = var6 + (this.field1092 * var7);
        int var9 = 0;
        if (arg0 != -1401718841) {
            return;
        }
        int var10 = var5.field3169;
        int var11 = var5.field3166;
        int var12 = this.field1092 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var9 += var11 * var13;
            var8 += this.field1092 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if (var7 + var10 >= this.field1093) {
            int var15 = var7 + var10 + 1 - this.field1093;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var6 = 1;
            var8 += var16;
            var12 += var16;
            var9 += var16;
            var14 += var16;
            var11 -= var16;
        }
        if ((var6 + var11) >= this.field1092) {
            int var17 = var6 + var11 + 1 - this.field1092;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class53.method312(arg0 + 1401718840, var11, var10, var9, var12, this.field1102, var8, var5.field3160, var14);
            this.method493(var6, var11, var10, var7, -1);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
    public final void method490(int arg0) {
        field1089++;
        this.field1103 = new class670[this.field1086][this.field1096];
        if (arg0 >= -98) {
            this.field1086 = 109;
        }
        for (int var2 = 0; var2 < this.field1096; var2++) {
            for (int var3 = 0; var3 < this.field1086; var3++) {
                this.field1103[var3][var2] = new class670(this.field1088, this, this.field1101, var3, var2, this.field1094, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field1103[var3][var2].field9533 == 0) {
                    this.field1103[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I[[ZBZII)V")
    public final void method491(int arg0, boolean[][] arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        field1095++;
        this.field1088.method3615((byte) -125, false);
        this.field1088.method3628(false, (byte) 126);
        this.field1088.method3627(90, 1);
        this.field1088.method3676(1, (byte) -84);
        this.field1088.method3667(-2, false, false, 3);
        float var7 = 1.0F / (float) (this.field1088.field9258 * 128);
        if (arg3) {
            for (int var26 = 0; var26 < this.field1096; var26++) {
                int var28 = var26 << this.field1094;
                int var29 = var26 + 1 << this.field1094;
                label91: for (int var30 = 0; var30 < this.field1086; var30++) {
                    if (this.field1103[var30][var26] != null) {
                        int var31 = var30 << this.field1094;
                        int var32 = var30 + 1 << this.field1094;
                        for (int var33 = var31; var33 < var32; var33++) {
                            if (var33 - arg5 >= -arg0 && arg0 >= (var33 - arg5)) {
                                for (int var34 = var28; var34 < var29; var34++) {
                                    if ((-arg0) <= (var34 - arg4) && arg0 >= (var34 - arg4) && arg1[var33 + arg0 - arg5][var34 + arg0 - arg4]) {
                                        class149 var35 = this.field1088.method3682(76);
                                        var35.method866(var7, var7, 68, 1.0F);
                                        var35.method356(-var30, -var26, 0);
                                        this.field1088.method3616(class213.field2816, false);
                                        this.field1103[var30][var26].method3808(-106);
                                        continue label91;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field1096; var8++) {
                int var9 = var8 << this.field1094;
                int var10 = var8 + 1 << this.field1094;
                for (int var11 = 0; var11 < this.field1086; var11++) {
                    class670 var12 = this.field1103[var11][var8];
                    if (var12 != null) {
                        class556 var13 = this.field1088.method3639(0, var12.field9533 * 3);
                        Buffer var14 = var13.method2143(true, (byte) 77);
                        if (var14 != null) {
                            Stream var15 = this.field1088.method3614(var14, 0);
                            int var16 = 0;
                            int var17 = var11 << this.field1094;
                            int var18 = var11 + 1 << this.field1094;
                            for (int var19 = var9; var19 < var10; var19++) {
                                if (var19 - arg4 >= -arg0 && var19 - arg4 <= arg0) {
                                    int var21 = this.field1101.field3524 * var19 + var17;
                                    for (int var22 = var17; var22 < var18; var22++) {
                                        if ((var22 - arg5) >= (-arg0) && var22 - arg5 <= arg0 && arg1[var22 + arg0 - arg5][arg0 + var19 - arg4]) {
                                            short[] var23 = this.field1101.field9910[var21];
                                            if (var23 != null) {
                                                if (Stream.method3445()) {
                                                    for (int var24 = 0; var24 < var23.length; var24++) {
                                                        var15.method3433(var23[var24] & 0xFFFF);
                                                        var16++;
                                                    }
                                                } else {
                                                    for (int var25 = 0; var25 < var23.length; var25++) {
                                                        var15.method3443(var23[var25] & 0xFFFF);
                                                        var16++;
                                                    }
                                                }
                                            }
                                        }
                                        var21++;
                                    }
                                }
                            }
                            var15.method3440();
                            if (var13.method2145(false) && var16 > 0) {
                                class149 var20 = this.field1088.method3682(-55);
                                var20.method866(var7, var7, 103, 1.0F);
                                var20.method356(-var11, -var8, 0);
                                this.field1088.method3616(class213.field2816, false);
                                var12.method3804(117, var13, var16 / 3);
                            }
                        }
                    }
                }
            }
        }
        int var27 = 125 % ((27 - arg2) / 57);
        this.field1088.method3668(0);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIILha;)V")
    public final void method492(int arg0, int arg1, int arg2, class117 arg3) {
        field1090++;
        class239 var5 = (class239) arg3;
        int var6 = var5.field3163 + arg1 + 1;
        int var7 = var5.field3170 + arg0 + 1;
        int var8 = this.field1092 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field3169;
        int var11 = var5.field3166;
        int var12 = this.field1092 - var11;
        if (arg2 <= ~var7) {
            int var13 = 1 - var7;
            var10 -= var13;
            var8 += this.field1092 * var13;
            var9 += var11 * var13;
            var7 = 1;
        }
        int var14 = 0;
        if (this.field1093 <= (var7 + var10)) {
            int var15 = var10 + var7 + 1 - this.field1093;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var11 -= var16;
            var8 += var16;
            var12 += var16;
            var14 += var16;
            var6 = 1;
        }
        if (var6 + var11 >= this.field1092) {
            int var17 = var11 + var6 + 1 - this.field1092;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class352.method2081(var8, var10, var5.field3160, var11, this.field1102, var9, var14, var12, 31626);
            this.method493(var6, var11, var10, var7, arg2);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIII)V")
    private final void method493(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1100++;
        if (this.field1103 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 + arg1 - 2 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg2 + arg3 + arg4 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class670[] var11 = this.field1103[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field9518 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BILha;I)Z")
    public final boolean method494(byte arg0, int arg1, class117 arg2, int arg3) {
        if (arg0 < 69) {
            this.method493(1, -103, 7, -54, 71);
        }
        field1091++;
        class239 var5 = (class239) arg2;
        int var6 = var5.field3163 + arg1 + 1;
        int var7 = var5.field3170 + arg3 + 1;
        int var8 = this.field1092 * var7 + var6;
        int var9 = var5.field3169;
        int var10 = var5.field3166;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var9 -= var11;
            var8 += this.field1092 * var11;
            var7 = 1;
        }
        int var12 = this.field1092 - var10;
        if ((var7 + var9) >= this.field1093) {
            int var13 = var7 + var9 + 1 - this.field1093;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += var14;
            var10 -= var14;
            var6 = 1;
            var12 += var14;
        }
        if ((var6 + var10) >= this.field1092) {
            int var15 = var6 + var10 + 1 - this.field1092;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field1092 + var12;
            return class83.method443(var9, var10, var16, this.field1102, var8, (byte) -40, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lqq;Ljba;)V")
    public class90(class651 arg0, class704 arg1) {
        this.field1088 = arg0;
        this.field1101 = arg1;
        this.field1092 = (this.field1101.field3527 * this.field1101.field3524 >> this.field1088.field9236) + 2;
        this.field1093 = (this.field1101.field3527 * this.field1101.field3525 >> this.field1088.field9236) + 2;
        this.field1102 = new byte[this.field1093 * this.field1092];
        this.field1094 = this.field1088.field9236 + 7 - this.field1101.field3530;
        this.field1086 = this.field1101.field3524 >> this.field1094;
        this.field1096 = this.field1101.field3525 >> this.field1094;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)V")
    public static void method495(int arg0) {
        field1098 = null;
        if (arg0 != -1) {
            method495(114);
        }
    }
}
