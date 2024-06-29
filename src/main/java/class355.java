import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class355 {

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "Lhm;")
    private class203 field5675;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Lrr;")
    private class332 field5666;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public int field5676;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    private int field5663;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    private int field5673;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "[B")
    public byte[] field5670;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    private int field5660;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    private int field5667;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Leu;")
    public static class444 field5664 = new class444(2, 2);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "[[Llo;")
    private class700[][] field5668;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2383(byte arg0) {
        int var1 = -77 % ((65 - arg0) / 33);
        field5661++;
        class600.method3500();
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V", line = 15)
    public final void method2384(byte arg0) {
        if (arg0 != -36) {
            this.field5663 = 61;
        }
        field5659++;
        this.field5668 = new class700[this.field5660][this.field5667];
        for (int var2 = 0; var2 < this.field5667; var2++) {
            for (int var3 = 0; var3 < this.field5660; var3++) {
                this.field5668[var3][var2] = new class700(this.field5666, this, this.field5675, var3, var2, this.field5673, var3 * 128 + 1, var2 * 128 - -1);
                if (this.field5668[var3][var2].field9867 == 0) {
                    this.field5668[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BIIII)V", line = 50)
    private final void method2385(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field5674++;
        if (this.field5668 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 - (1 - arg4) - 1 >> 7;
        int var8 = arg2 - 1 >> 7;
        int var9 = arg2 + arg3 - 1 - 1 >> 7;
        if (arg0 > -8) {
            this.field5676 = -14;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class700[] var11 = this.field5668[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field9879 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIZ[[ZIB)V", line = 95)
    public final void method2386(int arg0, int arg1, boolean arg2, boolean[][] arg3, int arg4, byte arg5) {
        field5672++;
        this.field5666.method2238(false, -45);
        this.field5666.method2224((byte) -18, false);
        this.field5666.method2259(-106, 1);
        this.field5666.method2280(2, 1);
        this.field5666.method2242(false, -14500, -2, false);
        float var7 = 1.0F / (float) (this.field5666.field5414 * 128);
        if (arg2) {
            for (int var26 = 0; var26 < this.field5667; var26++) {
                int var27 = var26 << this.field5673;
                int var28 = var26 + 1 << this.field5673;
                label95: for (int var29 = 0; var29 < this.field5660; var29++) {
                    if (this.field5668[var29][var26] != null) {
                        int var30 = var29 << this.field5673;
                        int var31 = var29 + 1 << this.field5673;
                        for (int var32 = var30; var32 < var31; var32++) {
                            if ((var32 - arg4) >= (-arg0) && arg0 >= var32 - arg4) {
                                for (int var33 = var27; var33 < var28; var33++) {
                                    if ((-arg0) <= (var33 - arg1) && var33 - arg1 <= arg0 && arg3[var32 + arg0 - arg4][arg0 + var33 - arg1]) {
                                        class498 var34 = this.field5666.method2282((byte) -5);
                                        var34.method3034(var7, var7, true, 1.0F);
                                        var34.method505(-var29, -var26, 0);
                                        this.field5666.method2291(class386.field5995, arg5 ^ 0xFFFF9F72);
                                        this.field5668[var29][var26].method3950(false);
                                        continue label95;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field5667; var8++) {
                int var9 = var8 << this.field5673;
                int var10 = var8 + 1 << this.field5673;
                for (int var11 = 0; var11 < this.field5660; var11++) {
                    class700 var12 = this.field5668[var11][var8];
                    if (var12 != null) {
                        class679 var13 = this.field5666.method2262((byte) -124, var12.field9867 * 3);
                        Buffer var14 = var13.method430(true, (byte) -107);
                        if (var14 != null) {
                            Stream var15 = this.field5666.method2286(var14, (byte) -114);
                            int var16 = 0;
                            int var17 = var11 << this.field5673;
                            int var18 = var11 + 1 << this.field5673;
                            for (int var19 = var9; var19 < var10; var19++) {
                                if (-arg0 <= var19 - arg1 && (var19 - arg1) <= arg0) {
                                    int var21 = this.field5675.field510 * var19 + var17;
                                    for (int var22 = var17; var22 < var18; var22++) {
                                        if (var22 - arg4 >= -arg0 && arg0 >= var22 - arg4 && arg3[var22 + arg0 - arg4][var19 + arg0 - arg1]) {
                                            short[] var23 = this.field5675.field3286[var21];
                                            if (var23 != null) {
                                                if (Stream.method3620()) {
                                                    for (int var24 = 0; var24 < var23.length; var24++) {
                                                        var16++;
                                                        var15.method3628(var23[var24] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var25 = 0; var25 < var23.length; var25++) {
                                                        var15.method3623(var23[var25] & 0xFFFF);
                                                        var16++;
                                                    }
                                                }
                                            }
                                        }
                                        var21++;
                                    }
                                }
                            }
                            var15.method3626();
                            if (var13.method425(30899) && var16 > 0) {
                                class498 var20 = this.field5666.method2282((byte) -39);
                                var20.method3034(var7, var7, true, 1.0F);
                                var20.method505(-var11, -var8, 0);
                                this.field5666.method2291(class386.field5995, arg5 + 24910);
                                var12.method3949((byte) -85, var13, var16 / 3);
                            }
                        }
                    }
                }
            }
        }
        if (arg5 != -97) {
            method2389((byte) 92);
        }
        this.field5666.method2263((byte) 125);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLjava/io/File;I)[B", line = 300)
    public static final byte[] method2387(byte arg0, File arg1, int arg2) {
        field5677++;
        try {
            if (arg0 == -79) {
                byte[] var3 = new byte[arg2];
                class401.method2577(arg0 ^ 0xFFFFFFB5, var3, arg1, arg2);
                return var3;
            } else {
                return null;
            }
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BILha;I)Z", line = 318)
    public final boolean method2388(byte arg0, int arg1, class54 arg2, int arg3) {
        field5662++;
        class164 var5 = (class164) arg2;
        int var6 = var5.field2760 + arg1 + 1;
        int var7 = var5.field2761 + arg3 + 1;
        int var8 = var7 + (this.field5676 * var6);
        int var9 = var5.field2757;
        if (arg0 < 24) {
            this.field5673 = -6;
        }
        int var10 = var5.field2759;
        int var11 = this.field5676 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var8 += this.field5676 * var12;
            var9 -= var12;
            var6 = 1;
        }
        if (var6 + var9 >= this.field5663) {
            int var13 = var6 + var9 + 1 - this.field5663;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var8 += var14;
            var7 = 1;
            var11 += var14;
        }
        if ((var7 + var10) >= this.field5676) {
            int var15 = var10 + var7 + 1 - this.field5676;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field5676 + var11;
            return class562.method3340((byte) -117, var10, var9, this.field5670, var16, var17, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)V", line = 399)
    public static void method2389(byte arg0) {
        field5664 = null;
        if (arg0 != -25) {
            field5664 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBLha;I)V", line = 413)
    public final void method2390(int arg0, byte arg1, class54 arg2, int arg3) {
        field5665++;
        class164 var5 = (class164) arg2;
        int var6 = var5.field2761 + arg3 + 1;
        int var7 = var5.field2760 + arg0 + 1;
        int var8 = this.field5676 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field2757;
        int var11 = var5.field2759;
        int var12 = this.field5676 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var9 += var11 * var13;
            var8 += this.field5676 * var13;
            var10 -= var13;
        }
        int var14 = 95 % ((arg1 - 75) / 48);
        int var15 = 0;
        if (var7 + var10 >= this.field5663) {
            int var16 = var7 + var10 + 1 - this.field5663;
            var10 -= var16;
        }
        if (var6 <= 0) {
            int var17 = 1 - var6;
            var8 += var17;
            var9 += var17;
            var11 -= var17;
            var6 = 1;
            var12 += var17;
            var15 += var17;
        }
        if ((var6 + var11) >= this.field5676) {
            int var18 = var11 + var6 + 1 - this.field5676;
            var12 += var18;
            var15 += var18;
            var11 -= var18;
        }
        if (var11 > 0 && var10 > 0) {
            class326.method2201(var10, var15, var8, this.field5670, var5.field2756, var9, 0, var12, var11);
            this.method2385((byte) -109, var6, var7, var10, var11);
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lrr;Lhm;)V", line = 486)
    public class355(class332 arg0, class203 arg1) {
        this.field5675 = arg1;
        this.field5666 = arg0;
        this.field5676 = (this.field5675.field516 * this.field5675.field510 >> this.field5666.field5400) + 2;
        this.field5663 = (this.field5675.field516 * this.field5675.field513 >> this.field5666.field5400) + 2;
        this.field5673 = this.field5666.field5400 + 7 - this.field5675.field515;
        this.field5670 = new byte[this.field5676 * this.field5663];
        this.field5660 = this.field5675.field510 >> this.field5673;
        this.field5667 = this.field5675.field513 >> this.field5673;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLha;II)V", line = 501)
    public final void method2391(boolean arg0, class54 arg1, int arg2, int arg3) {
        field5671++;
        class164 var5 = (class164) arg1;
        int var6 = var5.field2760 + arg3 + 1;
        if (!arg0) {
            return;
        }
        int var7 = var5.field2761 + arg2 + 1;
        int var8 = var7 + (this.field5676 * var6);
        int var9 = 0;
        int var10 = var5.field2757;
        int var11 = var5.field2759;
        int var12 = this.field5676 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var9 += var11 * var13;
            var6 = 1;
            var8 += this.field5676 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if (this.field5663 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field5663;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var9 += var16;
            var8 += var16;
            var14 += var16;
            var7 = 1;
            var12 += var16;
        }
        if (var7 + var11 >= this.field5676) {
            int var17 = var7 + var11 + 1 - this.field5676;
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class497.method3020(var9, 7, var8, var12, var14, this.field5670, var11, var10, var5.field2756);
            this.method2385((byte) -30, var7, var6, var10, var11);
        }
    }
}
