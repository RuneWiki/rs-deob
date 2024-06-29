import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class168 extends class134 {

    @OriginalMember(owner = "client!cfa", name = "E", descriptor = "Lln;")
    private class377 field1880;

    @OriginalMember(owner = "client!cfa", name = "l", descriptor = "Lada;")
    private class163 field1861;

    @OriginalMember(owner = "client!cfa", name = "k", descriptor = "Lum;")
    private class523 field1860;

    @OriginalMember(owner = "client!cfa", name = "C", descriptor = "I")
    private int field1878;

    @OriginalMember(owner = "client!cfa", name = "A", descriptor = "I")
    private int field1876;

    @OriginalMember(owner = "client!cfa", name = "j", descriptor = "I")
    private int field1859;

    @OriginalMember(owner = "client!cfa", name = "x", descriptor = "I")
    private int field1873;

    @OriginalMember(owner = "client!cfa", name = "u", descriptor = "[[F")
    private float[][] field1870;

    @OriginalMember(owner = "client!cfa", name = "o", descriptor = "[[F")
    private float[][] field1864;

    @OriginalMember(owner = "client!cfa", name = "n", descriptor = "[[F")
    private float[][] field1863;

    @OriginalMember(owner = "client!cfa", name = "y", descriptor = "I")
    private int field1874;

    @OriginalMember(owner = "client!cfa", name = "r", descriptor = "Lkga;")
    private class543 field1867;

    @OriginalMember(owner = "client!cfa", name = "t", descriptor = "Lel;")
    private class545 field1869;

    @OriginalMember(owner = "client!cfa", name = "q", descriptor = "Lpfa;")
    private class295 field1866;

    @OriginalMember(owner = "client!cfa", name = "s", descriptor = "Ljaclib/memory/Stream;")
    private Stream field1868;

    @OriginalMember(owner = "client!cfa", name = "v", descriptor = "Ljaclib/memory/Stream;")
    private Stream field1871;

    @OriginalMember(owner = "client!cfa", name = "m", descriptor = "I")
    private int field1862;

    @OriginalMember(owner = "client!cfa", name = "z", descriptor = "[I")
    public static int[] field1875 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!cfa", name = "p", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!cfa", name = "w", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!cfa", name = "B", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!cfa", name = "D", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "([[ZIIII)V")
    public final void method1041(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4) {
        field1879++;
        if (this.field1867 == null || arg1 + arg3 < this.field1878 || (arg1 - arg3) > this.field1876 || (arg3 + arg4) < this.field1859 || arg4 - arg3 > this.field1873 || arg2 != 20023) {
            return;
        }
        for (int var6 = this.field1859; var6 <= this.field1873; var6++) {
            for (int var7 = this.field1878; var7 <= this.field1876; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg4;
                if ((-arg3) < var8 && var8 < arg3 && (-arg3) < var9 && var9 < arg3 && arg0[arg3 + var8][arg3 + var9]) {
                    this.field1880.method2267(true, (byte) ((int) (this.field1861.method1011(24617) * 255.0F)));
                    this.field1880.method2301(true, this.field1869, 0);
                    this.field1880.method2285(arg2 - 20022, this.field1880.field5178);
                    this.field1880.method2295(class178.field2092, arg2 ^ 0xFFFFB1A4, this.field1867, 0, this.field1874 / 3, 0, this.field1862);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)V")
    public static void method1042(int arg0) {
        if (arg0 < 116) {
            field1875 = null;
        }
        field1875 = null;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(SB)V")
    private final void method1043(short arg0, byte arg1) {
        if (Stream.method3823()) {
            this.field1871.method3820(arg0);
        } else {
            this.field1871.method3816(arg0);
        }
        field1872++;
        if (arg1 != -63) {
            this.method1043((short) -66, (byte) 74);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIIIII)V")
    private final void method1044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1877++;
        long var8 = -1L;
        int var10 = (arg6 << this.field1860.field3409) + arg0;
        int var11 = (arg4 << this.field1860.field3409) + arg5;
        int var12 = this.field1860.method1675(var11, var10, 65286);
        if ((arg0 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class134 var13 = this.field1866.method1754(false, var8);
            if (var13 != null) {
                this.method1043(((class595) var13).field8395, (byte) -63);
                return;
            }
        }
        short var14 = (short) (this.field1862++);
        if (var8 != -1L) {
            this.field1866.method1751(new class595(var14), 3970, var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg0 == 0 && arg5 == 0) {
            var15 = this.field1870[arg2][arg1];
            var16 = this.field1864[arg2][arg1];
            var17 = this.field1863[arg2][arg1];
        } else if (this.field1860.field3413 == arg0 && arg5 == 0) {
            var16 = this.field1864[arg2 + 1][arg1];
            var15 = this.field1870[arg2 + 1][arg1];
            var17 = this.field1863[arg2 + 1][arg1];
        } else if (this.field1860.field3413 == arg0 && this.field1860.field3413 == arg5) {
            var15 = this.field1870[arg2 + 1][arg1 + 1];
            var17 = this.field1863[arg2 + 1][arg1 + 1];
            var16 = this.field1864[arg2 + 1][arg1 + 1];
        } else if (arg0 == 0 && this.field1860.field3413 == arg5) {
            var16 = this.field1864[arg2][arg1 + 1];
            var15 = this.field1870[arg2][arg1 + 1];
            var17 = this.field1863[arg2][arg1 + 1];
        } else {
            float var18 = (float) arg0 / (float) this.field1860.field3413;
            float var19 = (float) arg5 / (float) this.field1860.field3413;
            float var20 = this.field1863[arg2][arg1];
            float var21 = this.field1864[arg2][arg1];
            float var22 = this.field1870[arg2][arg1];
            float var23 = this.field1863[arg2 + 1][arg1];
            float var24 = this.field1864[arg2 + 1][arg1];
            float var25 = this.field1870[arg2 + 1][arg1];
            float var26 = (this.field1870[arg2][arg1 + 1] - var22) * var18 + var22;
            float var27 = (this.field1864[arg2 + 1][arg1 + 1] - var24) * var18 + var24;
            float var28 = (this.field1863[arg2 + 1][arg1 + 1] - var23) * var18 + var23;
            float var29 = (this.field1863[arg2][arg1 + 1] - var20) * var18 + var20;
            float var30 = (this.field1864[arg2][arg1 + 1] - var21) * var18 + var21;
            float var31 = (this.field1870[arg2 + 1][arg1 + 1] - var25) * var18 + var25;
            var16 = (var27 - var30) * var19 + var30;
            var17 = (var28 - var29) * var19 + var29;
            var15 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field1861.method1012((byte) 127) - var10);
        float var33 = (float) (this.field1861.method1006(31079) - var12);
        if (arg3 != 24218) {
            return;
        }
        float var34 = (float) (this.field1861.method1013(9179409) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field1861.method1007(arg3 - 24146);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var38 + var16 * var37 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field1861.method1010(-5636);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF4E) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method3823()) {
            this.field1868.method3810((float) var10);
            this.field1868.method3810((float) var12);
            this.field1868.method3810((float) var11);
        } else {
            this.field1868.method3815((float) var10);
            this.field1868.method3815((float) var12);
            this.field1868.method3815((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field1880.field5074 == 0) {
            this.field1868.method3814(var47);
            this.field1868.method3814(var46);
            this.field1868.method3814(var45);
        } else {
            this.field1868.method3814(var45);
            this.field1868.method3814(var46);
            this.field1868.method3814(var47);
        }
        this.field1868.method3814(255);
        this.method1043(var14, (byte) -63);
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lln;Lum;Lada;[I)V")
    public class168(class377 arg0, class523 arg1, class163 arg2, int[] arg3) {
        this.field1880 = arg0;
        this.field1861 = arg2;
        this.field1860 = arg1;
        int var5 = this.field1861.method1007(-103) - (arg1.field3413 >> 1);
        this.field1878 = this.field1861.method1012((byte) 127) - var5 >> arg1.field3409;
        this.field1876 = var5 + this.field1861.method1012((byte) 127) >> arg1.field3409;
        this.field1859 = this.field1861.method1013(9179409) - var5 >> arg1.field3409;
        this.field1873 = var5 + this.field1861.method1013(9179409) >> arg1.field3409;
        int var6 = this.field1876 + 1 - this.field1878;
        int var7 = this.field1873 + 1 - this.field1859;
        this.field1870 = new float[var6 + 1][var7 + 1];
        this.field1864 = new float[var6 + 1][var7 + 1];
        this.field1863 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field1859 + var8;
            if (var27 > 0 && var27 < (this.field1860.field3408 - 1)) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field1878 + var28;
                    if (var29 > 0 && this.field1860.field3410 - 1 > var29) {
                        int var30 = arg1.method1671(var27, var29 + 1, (byte) 119) - arg1.method1671(var27, var29 - 1, (byte) 79);
                        int var31 = arg1.method1671(var27 + 1, var29, (byte) -108) - arg1.method1671(var27 - 1, var29, (byte) -91);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var31 * var31 + var30 * var30 + 65536)));
                        this.field1863[var28][var8] = (float) var30 * var32;
                        this.field1864[var28][var8] = var32 * -256.0F;
                        this.field1870[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field1859; var10 <= this.field1873; var10++) {
            if (var10 >= 0 && var10 < arg1.field3408) {
                for (int var23 = this.field1878; var23 <= this.field1876; var23++) {
                    if (var23 >= 0 && var23 < arg1.field3410) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field7439[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field1874 += 3;
                                    }
                                }
                            } else {
                                this.field1874 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field1876 - this.field1878;
            }
        }
        if (this.field1874 <= 0) {
            this.field1867 = null;
            this.field1869 = null;
        } else {
            this.field1866 = new class295(class756.method4202(true, this.field1874));
            this.field1867 = this.field1880.method2235(false, 9);
            this.field1867.method267(30903, this.field1874);
            NativeHeapBuffer var11 = this.field1880.method2314(false, this.field1874 * 16, false);
            this.field1868 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field1867.method263(13931, true);
                } while (var12 == null);
                this.field1871 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field1859; var15 <= this.field1873; var15++) {
                    if (var15 >= 0 && arg1.field3408 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field1878; var17 <= this.field1876; var17++) {
                            if (var17 >= 0 && arg1.field3410 > var17) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field7439[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field7458[var17][var15];
                                        int[] var21 = arg1.field7443[var17][var15];
                                        int var22 = 0;
                                        label123: while (true) {
                                            while (true) {
                                                if (var19.length <= var22) {
                                                    break label123;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method1044(var20[var22], var13, var16, 24218, var15, var21[var22], var17);
                                                    var22++;
                                                    this.method1044(var20[var22], var13, var16, 24218, var15, var21[var22], var17);
                                                    var22++;
                                                    this.method1044(var20[var22], var13, var16, 24218, var15, var21[var22], var17);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method1044(0, var13, var16, 24218, var15, 0, var17);
                                        this.method1044(arg1.field3413, var13, var16, 24218, var15, 0, var17);
                                        this.method1044(0, var13, var16, 24218, var15, arg1.field3413, var17);
                                    } else if (var18 == 2) {
                                        this.method1044(arg1.field3413, var13, var16, 24218, var15, 0, var17);
                                        this.method1044(arg1.field3413, var13, var16, 24218, var15, arg1.field3413, var17);
                                        this.method1044(0, var13, var16, 24218, var15, 0, var17);
                                    } else if (var18 == 5) {
                                        this.method1044(arg1.field3413, var13, var16, 24218, var15, arg1.field3413, var17);
                                        this.method1044(0, var13, var16, 24218, var15, arg1.field3413, var17);
                                        this.method1044(arg1.field3413, var13, var16, 24218, var15, 0, var17);
                                    } else if (var18 == 4) {
                                        this.method1044(0, var13, var16, 24218, var15, arg1.field3413, var17);
                                        this.method1044(0, var13, var16, 24218, var15, 0, var17);
                                        this.method1044(arg1.field3413, var13, var16, 24218, var15, arg1.field3413, var17);
                                    }
                                }
                            }
                            var16++;
                            var14++;
                        }
                    } else {
                        var14 += this.field1876 - this.field1878;
                    }
                    var13++;
                }
                this.field1871.method3821();
                if (this.field1867.method266(-19067)) {
                    this.field1868.method3821();
                    this.field1869 = this.field1880.method2306(false, 0);
                    this.field1869.method3106(var11, (byte) -13, 16, this.field1862 * 16);
                    break;
                }
                this.field1868.method3811(0);
                this.field1866.method1758(-60);
            }
        }
        this.field1871 = null;
        this.field1863 = this.field1864 = this.field1870 = null;
        this.field1866 = null;
        this.field1868 = null;
    }
}
