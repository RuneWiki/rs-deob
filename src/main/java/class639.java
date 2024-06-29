import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class639 {

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Ltu;")
    private class294 field9179;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Lha;")
    private class53 field9185;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public int field9182;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    private int field9172;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    private int field9184;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "[B")
    public byte[] field9175;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    private int field9174;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    private int field9176;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "Lig;")
    public static class206 field9183 = new class206(19, 12);

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "F")
    public static float field9187 = 1024.0F;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field9189 = 2;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field9192 = 1;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field9178;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field9181;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field9188;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public static int field9191;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "[[B")
    public static byte[][] field9186;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "[[Lhq;")
    private class139[][] field9190;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZLw;)Z", line = 3)
    public final boolean method3637(int arg0, int arg1, boolean arg2, class252 arg3) {
        field9173++;
        class514 var5 = (class514) arg3;
        int var6 = var5.field7502 + arg1 + 1;
        if (arg2) {
            return true;
        }
        int var7 = var5.field7504 + arg0 + 1;
        int var8 = this.field9182 * var6 + var7;
        int var9 = var5.field7497;
        int var10 = var5.field7491;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var8 += this.field9182 * var11;
            var9 -= var11;
            var6 = 1;
        }
        int var12 = this.field9182 - var10;
        if (this.field9172 <= var6 + var9) {
            int var13 = var6 + var9 + 1 - this.field9172;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var8 += var14;
            var7 = 1;
            var12 += var14;
        }
        if (this.field9182 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field9182;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field9182 + var12;
            return class122.method755(this.field9175, var9, var17, 80, var10, var16, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIII)V", line = 75)
    private final void method3638(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9181++;
        int var6 = 19 % ((arg1 - 63) / 37);
        if (this.field9190 == null) {
            return;
        }
        int var7 = arg0 - 1 >> 7;
        int var8 = arg2 + arg0 - 1 - 1 >> 7;
        int var9 = arg3 - 1 >> 7;
        int var10 = arg3 + arg4 - 1 - 1 >> 7;
        for (int var11 = var7; var11 <= var8; var11++) {
            class139[] var12 = this.field9190[var11];
            for (int var13 = var9; var13 <= var10; var13++) {
                if (var12[var13] != null) {
                    var12[var13].field1716 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBILw;)V", line = 118)
    public final void method3639(int arg0, byte arg1, int arg2, class252 arg3) {
        field9177++;
        class514 var5 = (class514) arg3;
        int var6 = var5.field7504 + arg0 + 1;
        int var7 = var5.field7502 + arg2 + 1;
        int var8 = this.field9182 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field7497;
        int var11 = var5.field7491;
        int var12 = this.field9182 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var9 += var11 * var13;
            var10 -= var13;
            var8 += this.field9182 * var13;
        }
        int var14 = 0;
        if (var7 + var10 >= this.field9172) {
            int var15 = var7 - (-var10 - 1) - this.field9172;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var12 += var16;
            var11 -= var16;
            var14 += var16;
            var6 = 1;
            var8 += var16;
        }
        if ((var6 + var11) >= this.field9182) {
            int var17 = var11 + var6 + 1 - this.field9182;
            var11 -= var17;
            var14 += var17;
            var12 += var17;
        }
        if (arg1 != 75) {
            this.method3638(35, 37, -113, 20, -68);
        }
        if (var11 > 0 && var10 > 0) {
            class157.method909(var12, var9, var5.field7499, var14, var10, var11, var8, (byte) 4, this.field9175);
            this.method3638(var6, 122, var11, var7, var10);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V", line = 190)
    public static void method3640(boolean arg0) {
        field9183 = null;
        field9186 = null;
        if (arg0) {
            method3645(-53, (byte) -72);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 204)
    public final void method3641(byte arg0) {
        field9180++;
        this.field9190 = new class139[this.field9174][this.field9176];
        if (arg0 >= -48) {
            return;
        }
        for (int var2 = 0; var2 < this.field9176; var2++) {
            for (int var3 = 0; var3 < this.field9174; var3++) {
                this.field9190[var3][var2] = new class139(this.field9179, this, this.field9185, var3, var2, this.field9184, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field9190[var3][var2].field1710 == 0) {
                    this.field9190[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIZ[[ZB)V", line = 239)
    public final void method3642(int arg0, int arg1, int arg2, boolean arg3, boolean[][] arg4, byte arg5) {
        this.field9179.method1931(false, -26);
        field9178++;
        this.field9179.method1905((byte) 10, false);
        this.field9179.method1961(1, 11557);
        this.field9179.method1904(1, -118);
        this.field9179.method1899(false, -2, false, 0);
        float var7 = 1.0F / (float) (this.field9179.field4323 * 128);
        if (arg3) {
            for (int var8 = 0; var8 < this.field9176; var8++) {
                int var9 = var8 << this.field9184;
                int var10 = var8 + 1 << this.field9184;
                label146: for (int var11 = 0; var11 < this.field9174; var11++) {
                    if (this.field9190[var11][var8] != null) {
                        int var12 = var11 << this.field9184;
                        int var13 = var11 + 1 << this.field9184;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if (var14 - arg0 >= -arg2 && var14 - arg0 <= arg2) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if ((-arg2) <= (var15 - arg1) && (var15 - arg1) <= arg2 && arg4[var14 + arg2 - arg0][var15 + arg2 - arg1]) {
                                        class646 var16 = this.field9179.method1930(1);
                                        var16.method3705(1.0F, var7, -1, var7);
                                        var16.method2006(-var11, -var8, 0);
                                        this.field9179.method1935(class199.field2681, true);
                                        this.field9190[var11][var8].method838(false);
                                        continue label146;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field9176; var17++) {
                int var18 = var17 << this.field9184;
                int var19 = var17 + 1 << this.field9184;
                for (int var20 = 0; var20 < this.field9174; var20++) {
                    class139 var21 = this.field9190[var20][var17];
                    if (var21 != null) {
                        class396 var22 = this.field9179.method1924(-9248, var21.field1710 * 3);
                        Buffer var23 = var22.method652(true, 31983);
                        if (var23 != null) {
                            Stream var24 = this.field9179.method1932(var23, (byte) -82);
                            int var25 = 0;
                            int var26 = var20 << this.field9184;
                            int var27 = var20 + 1 << this.field9184;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if ((var28 - arg1) >= (-arg2) && arg2 >= (var28 - arg1)) {
                                    int var30 = this.field9185.field1656 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if (-arg2 <= var31 - arg0 && arg2 >= var31 - arg0 && arg4[var31 + arg2 - arg0][arg2 + var28 - arg1]) {
                                            short[] var32 = this.field9185.field550[var30];
                                            if (var32 != null) {
                                                if (Stream.method3423()) {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var24.method3414(var32[var33] & 0xFFFF);
                                                        var25++;
                                                    }
                                                } else {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var24.method3413(var32[var34] & 0xFFFF);
                                                        var25++;
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method3411();
                            if (var22.method651(-15045) && var25 > 0) {
                                class646 var29 = this.field9179.method1930(1);
                                var29.method3705(1.0F, var7, -1, var7);
                                var29.method2006(-var20, -var17, 0);
                                this.field9179.method1935(class199.field2681, true);
                                var21.method834(var22, var25 / 3, -107);
                            }
                        }
                    }
                }
            }
        }
        if (arg5 <= 33) {
            method3643(-45, -38, 64);
        }
        this.field9179.method1950(7869);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V", line = 444)
    public static final void method3643(int arg0, int arg1, int arg2) {
        boolean var3 = class431.field6408[0][arg1][arg2] != null && class431.field6408[0][arg1][arg2].field1162 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class431.field6408[var4][arg1][arg2] == null) {
                class99 var5 = class431.field6408[var4][arg1][arg2] = new class99(var4, arg1, arg2);
                if (var3) {
                    var5.field1178++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lw;III)V", line = 473)
    public final void method3644(class252 arg0, int arg1, int arg2, int arg3) {
        field9188++;
        class514 var5 = (class514) arg0;
        int var6 = var5.field7502 + arg1 + 1;
        int var7 = var5.field7504 + arg3 + 1;
        int var8 = this.field9182 * var6 + var7;
        int var9 = arg2;
        int var10 = var5.field7497;
        int var11 = var5.field7491;
        int var12 = this.field9182 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 = var11 * var14 + arg2;
            var6 = 1;
            var8 += this.field9182 * var14;
            var10 -= var14;
        }
        if ((var6 + var10) >= this.field9172) {
            int var15 = var6 + var10 - (this.field9172 + -1);
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var7 = 1;
            var12 += var16;
            var8 += var16;
            var9 += var16;
            var13 += var16;
            var11 -= var16;
        }
        if (var7 + var11 >= this.field9182) {
            int var17 = var7 + var11 + 1 - this.field9182;
            var12 += var17;
            var13 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class86.method555(var10, this.field9175, -105, var12, var5.field7499, var9, var11, var8, var13);
            this.method3638(var7, 105, var11, var6, var10);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)I", line = 543)
    public static final int method3645(int arg0, byte arg1) {
        field9191++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg0 & 0xFF77) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = 88 % ((-arg1 - 4) / 55);
        int var22 = (int) (var14 * 256.0D);
        int var23 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var22 >>= 0x4;
        } else if (var23 > 217) {
            var22 >>= 0x3;
        } else if (var23 > 192) {
            var22 >>= 0x2;
        } else if (var23 > 179) {
            var22 >>= 0x1;
        }
        return (var23 >> 1) + ((var20 & 0xFF) >> 2 << 10) + (var22 >> 5 << 7);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ltu;Lha;)V", line = 654)
    public class639(class294 arg0, class53 arg1) {
        this.field9179 = arg0;
        this.field9185 = arg1;
        this.field9182 = (this.field9185.field1662 * this.field9185.field1656 >> this.field9179.field4303) + 2;
        this.field9172 = (this.field9185.field1662 * this.field9185.field1660 >> this.field9179.field4303) + 2;
        this.field9184 = this.field9179.field4303 + 7 - this.field9185.field1663;
        this.field9175 = new byte[this.field9182 * this.field9172];
        this.field9174 = this.field9185.field1656 >> this.field9184;
        this.field9176 = this.field9185.field1660 >> this.field9184;
    }
}
