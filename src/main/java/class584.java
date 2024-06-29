import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class584 {

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "Lln;")
    private class377 field8240;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "Lum;")
    private class523 field8236;

    @OriginalMember(owner = "client!nw", name = "o", descriptor = "I")
    public int field8248;

    @OriginalMember(owner = "client!nw", name = "l", descriptor = "I")
    private int field8245;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "[B")
    public byte[] field8235;

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "I")
    private int field8239;

    @OriginalMember(owner = "client!nw", name = "m", descriptor = "I")
    private int field8246;

    @OriginalMember(owner = "client!nw", name = "n", descriptor = "I")
    private int field8247;

    @OriginalMember(owner = "client!nw", name = "r", descriptor = "Lpia;")
    public static class94 field8251 = new class94(56, 4);

    @OriginalMember(owner = "client!nw", name = "t", descriptor = "[I")
    public static int[] field8253 = new int[14];

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "I")
    public static int field8237;

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "I")
    public static int field8238;

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!nw", name = "j", descriptor = "I")
    public static int field8243;

    @OriginalMember(owner = "client!nw", name = "k", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!nw", name = "p", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!nw", name = "q", descriptor = "I")
    public static int field8250;

    @OriginalMember(owner = "client!nw", name = "s", descriptor = "I")
    public static int field8252;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "[[Llq;")
    private class550[][] field8234;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIILr;)V")
    public final void method3352(int arg0, int arg1, int arg2, class182 arg3) {
        field8241++;
        class192 var5 = (class192) arg3;
        int var6 = var5.field2270 + arg0 + 1;
        int var7 = var5.field2271 + arg1 - arg2;
        int var8 = var6 + (this.field8248 * var7);
        int var9 = 0;
        int var10 = var5.field2258;
        int var11 = var5.field2259;
        int var12 = this.field8248 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var9 += var11 * var13;
            var10 -= var13;
            var8 += this.field8248 * var13;
            var7 = 1;
        }
        int var14 = 0;
        if (this.field8245 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field8245;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var8 += var16;
            var9 += var16;
            var11 -= var16;
            var6 = 1;
            var12 += var16;
            var14 += var16;
        }
        if (this.field8248 <= var6 + var11) {
            int var17 = var11 + var6 + 1 - this.field8248;
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class646.method3681(126, var11, var5.field2261, var10, var14, var9, this.field8235, var12, var8);
            this.method3357(var7, false, var11, var6, var10);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V")
    public static void method3353(int arg0) {
        field8251 = null;
        int var1 = 112 / ((2 - arg0) / 48);
        field8253 = null;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZII[[ZII)V")
    public final void method3354(boolean arg0, int arg1, int arg2, boolean[][] arg3, int arg4, int arg5) {
        field8244++;
        this.field8240.method2284(false, 30315);
        this.field8240.method2234(false, 0);
        this.field8240.method2274(1, -2);
        this.field8240.method2255(1, 15818);
        this.field8240.method2275(false, false, (byte) 24, -2);
        int var7 = 59 / ((arg4 - 76) / 37);
        float var8 = 1.0F / (float) (this.field8240.field5130 * 128);
        if (arg0) {
            for (int var27 = 0; var27 < this.field8247; var27++) {
                int var28 = var27 << this.field8239;
                int var29 = var27 + 1 << this.field8239;
                label91: for (int var30 = 0; var30 < this.field8246; var30++) {
                    if (this.field8234[var30][var27] != null) {
                        int var31 = var30 << this.field8239;
                        int var32 = var30 + 1 << this.field8239;
                        for (int var33 = var31; var33 < var32; var33++) {
                            if ((var33 - arg5) >= (-arg1) && arg1 >= (var33 - arg5)) {
                                for (int var34 = var28; var34 < var29; var34++) {
                                    if (var34 - arg2 >= -arg1 && arg1 >= (var34 - arg2) && arg3[var33 + arg1 - arg5][var34 + arg1 - arg2]) {
                                        class427 var35 = this.field8240.method2224((byte) 23);
                                        var35.method2661(var8, 1.0F, (byte) 60, var8);
                                        var35.method1033(-var30, -var27, 0);
                                        this.field8240.method2226(class655.field9349, -110);
                                        this.field8234[var30][var27].method3229(-50);
                                        continue label91;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field8247; var9++) {
                int var10 = var9 << this.field8239;
                int var11 = var9 + 1 << this.field8239;
                for (int var12 = 0; var12 < this.field8246; var12++) {
                    class550 var13 = this.field8234[var12][var9];
                    if (var13 != null) {
                        class543 var14 = this.field8240.method2288(15951, var13.field7891 * 3);
                        Buffer var15 = var14.method263(13931, true);
                        if (var15 != null) {
                            Stream var16 = this.field8240.method2299(var15, 0);
                            int var17 = 0;
                            int var18 = var12 << this.field8239;
                            int var19 = var12 + 1 << this.field8239;
                            for (int var20 = var10; var20 < var11; var20++) {
                                if ((-arg1) <= (var20 - arg2) && (var20 - arg2) <= arg1) {
                                    int var22 = this.field8236.field3410 * var20 + var18;
                                    for (int var23 = var18; var23 < var19; var23++) {
                                        if (-arg1 <= var23 - arg5 && arg1 >= var23 - arg5 && arg3[var23 + arg1 - arg5][var20 + arg1 - arg2]) {
                                            short[] var24 = this.field8236.field7444[var22];
                                            if (var24 != null) {
                                                if (Stream.method3823()) {
                                                    for (int var25 = 0; var25 < var24.length; var25++) {
                                                        var16.method3820(var24[var25] & 0xFFFF);
                                                        var17++;
                                                    }
                                                } else {
                                                    for (int var26 = 0; var26 < var24.length; var26++) {
                                                        var17++;
                                                        var16.method3816(var24[var26] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var22++;
                                    }
                                }
                            }
                            var16.method3821();
                            if (var14.method266(-19067) && var17 > 0) {
                                class427 var21 = this.field8240.method2224((byte) 23);
                                var21.method2661(var8, 1.0F, (byte) 60, var8);
                                var21.method1033(-var12, -var9, 0);
                                this.field8240.method2226(class655.field9349, -108);
                                var13.method3227(1, var17 / 3, var14);
                            }
                        }
                    }
                }
            }
        }
        this.field8240.method2248((byte) 66);
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)Lm;")
    public static final class191 method3355(int arg0) {
        field8250++;
        if (class656.field9361 == null || class298.field3697 == null) {
            return null;
        }
        if (arg0 != 1) {
            field8253 = null;
        }
        for (class191 var1 = (class191) class298.field3697.method3070(true); var1 != null; var1 = (class191) class298.field3697.method3070(true)) {
            class228 var2 = class656.field9360.method2054(arg0 ^ 0x25, var1.field2252);
            if (var2 != null && var2.field2634 && var2.method1317(class656.field9358, 20099)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(II)Z")
    public static final boolean method3356(int arg0, int arg1) {
        field8242++;
        if (arg0 == -4) {
            return arg1 == 2 || arg1 == 3;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZIII)V")
    private final void method3357(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field8237++;
        if (this.field8234 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg2 + arg3 - 1 - 1 >> 7;
        if (arg1) {
            return;
        }
        int var8 = arg0 - 1 >> 7;
        int var9 = arg0 + arg4 - 2 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class550[] var11 = this.field8234[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field7889 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILr;II)Z")
    public final boolean method3358(int arg0, class182 arg1, int arg2, int arg3) {
        if (arg2 != -29624) {
            method3355(42);
        }
        field8249++;
        class192 var5 = (class192) arg1;
        int var6 = var5.field2270 + arg0 + 1;
        int var7 = var5.field2271 + arg3 + 1;
        int var8 = this.field8248 * var7 + var6;
        int var9 = var5.field2258;
        int var10 = var5.field2259;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var9 -= var11;
            var7 = 1;
            var8 += this.field8248 * var11;
        }
        int var12 = this.field8248 - var10;
        if (var7 + var9 >= this.field8245) {
            int var13 = var9 + var7 + 1 - this.field8245;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var8 += var14;
            var12 += var14;
            var6 = 1;
        }
        if ((var6 + var10) >= this.field8248) {
            int var15 = var6 + var10 + 1 - this.field8248;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field8248 + var12;
            return class595.method3398(var16, var17, var8, var10, -1, this.field8235, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(BILr;I)V")
    public final void method3359(byte arg0, int arg1, class182 arg2, int arg3) {
        field8252++;
        class192 var5 = (class192) arg2;
        int var6 = var5.field2270 + arg1 + 1;
        int var7 = var5.field2271 + arg3 + 1;
        int var8 = this.field8248 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field2258;
        if (arg0 != -88) {
            this.method3361(-11);
        }
        int var11 = var5.field2259;
        int var12 = this.field8248 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var8 += this.field8248 * var13;
            var10 -= var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field8245) {
            int var15 = var10 + var7 + 1 - this.field8245;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var12 += var16;
            var6 = 1;
            var9 += var16;
            var8 += var16;
            var14 += var16;
        }
        if (var6 + var11 >= this.field8248) {
            int var17 = var6 + var11 + 1 - this.field8248;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class340.method2023(var8, -1060076894, var14, var11, var9, var5.field2261, this.field8235, var12, var10);
            this.method3357(var7, false, var11, var6, var10);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZLig;)Lsv;")
    public static final class657 method3360(boolean arg0, class244 arg1) {
        field8238++;
        if (arg0) {
            field8253 = null;
        }
        class585 var2 = class475.method2857(arg1, 8);
        int var3 = arg1.method1459((byte) -124);
        return new class657(var2.field8265, var2.field8257, var2.field8264, var2.field8255, var2.field8258, var3);
    }

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "(I)V")
    public final void method3361(int arg0) {
        this.field8234 = new class550[this.field8246][this.field8247];
        field8243++;
        if (arg0 < 61) {
            this.field8234 = null;
        }
        for (int var2 = 0; var2 < this.field8247; var2++) {
            for (int var3 = 0; var3 < this.field8246; var3++) {
                this.field8234[var3][var2] = new class550(this.field8240, this, this.field8236, var3, var2, this.field8239, var3 * 128 + 1, var2 * 128 - -1);
                if (this.field8234[var3][var2].field7891 == 0) {
                    this.field8234[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lln;Lum;)V")
    public class584(class377 arg0, class523 arg1) {
        this.field8240 = arg0;
        this.field8236 = arg1;
        this.field8248 = (this.field8236.field3413 * this.field8236.field3410 >> this.field8240.field5103) + 2;
        this.field8245 = (this.field8236.field3413 * this.field8236.field3408 >> this.field8240.field5103) + 2;
        this.field8235 = new byte[this.field8248 * this.field8245];
        this.field8239 = this.field8240.field5103 + 7 - this.field8236.field3409;
        this.field8246 = this.field8236.field3410 >> this.field8239;
        this.field8247 = this.field8236.field3408 >> this.field8239;
    }
}
