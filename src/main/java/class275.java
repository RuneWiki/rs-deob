import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class275 {

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    private int field4380;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    private int field4385;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    private int field4381;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "Z")
    private boolean field4390;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    private int field4375;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    private int field4376;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    private int field4382;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    private int field4378;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "[I")
    private static int[] field4389 = new int[4];

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    private int field4377;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    private int field4379;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    private int field4384;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public int field4387;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    private int field4388;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Lfe;")
    private static class271 field4383;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Lej;")
    private class51 field4386;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "[B")
    private static byte[] field4374;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lwa;)Z")
    private final boolean method1873(class275 arg0) {
        if (this.field4386 == null) {
            if (this.field4378 == 0) {
                this.field4386 = class224.field3596.method733(55, true, class224.field3609, this.field4377, this.field4375);
            } else if (this.field4378 == 2) {
                this.method1884(arg0);
            } else if (this.field4378 == 1) {
                this.method1874(arg0);
            }
        }
        return this.field4386 != null;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Lwa;)V")
    private final void method1874(class275 arg0) {
        method1879();
        method1881();
        this.field4386 = new class256(this.field4377, this.field4377);
        class66.method521(field4389);
        this.field4386.method433();
        class224.method1543();
        class66.method532(0, 0, this.field4377, this.field4377, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field4390) {
                var2 = -arg0.field4380;
                var3 = -arg0.field4385;
                var4 = -arg0.field4381;
            } else {
                var2 = this.field4380 - arg0.field4380;
                var3 = this.field4385 - arg0.field4385;
                var4 = this.field4381 - arg0.field4381;
            }
        }
        if (this.field4384 != 0) {
            int var5 = class224.field3601[this.field4384];
            int var6 = class224.field3597[this.field4384];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field4379 != 0) {
            int var8 = this.field4379 - 1024 & 0x7FF;
            int var9 = class224.field3601[var8];
            int var10 = class224.field3597[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class81.method639(field4383.field4313, 0, field4383.field4335, (short) class224.field3596.method732(true, this.field4375));
        class87 var12 = field4383.method1856(64, 512, -var2, -var3, -var4);
        int var13 = var12.method89() - var12.method67();
        int var14 = var12.method659() - var12.method82();
        if (var13 > var14) {
            int var15 = this.field4376 == 0 ? (var13 << 9) / this.field4377 : (var13 * 16 << 9) / (this.field4377 * 13);
            var12.method665(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field4376 == 0 ? (var14 << 9) / this.field4377 : (var14 * 16 << 9) / (this.field4377 * 13);
            var12.method665(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field4376 == 0) {
            for (int var17 = 0; var17 < class66.field1032.length; var17++) {
                if (class66.field1032[var17] != 0) {
                    class66.field1032[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method1878();
            this.method1883();
        }
        class143.field2140.method1862(false);
        class66.method529(field4389);
        class224.method1543();
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method1875(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field4374[(arg3 >> 16) + var15] & 0xFF) + 64;
                    if (var18 > 255) {
                        var18 = 255;
                    }
                    int var19 = 256 - var18;
                    arg0[arg5] = ((arg2 & 0xFF00FF) * var19 + (var17 & 0xFF00FF) * var18 & -16711936) + ((arg2 & 0xFF00) * var19 + (var17 & 0xFF00) * var18 & 0xFF0000) >> 8 | 0xFF000000;
                }
                arg5++;
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()V")
    private final void method1876() {
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIILwa;)V")
    public final void method1877(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class275 arg6) {
        int var8 = this.field4384 - arg4 & 0x7FF;
        int var9 = this.field4379 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field4388) / 2 + var10;
        int var13 = (arg2 - this.field4388) / 2 + var11;
        if (var12 < arg3 && this.field4388 + var12 > 0 && var13 < arg2 && this.field4388 + var13 > 0 && this.method1873(arg6)) {
            this.field4386.method431(arg0 + var13, arg1 + var12, this.field4388, this.field4388);
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "()V")
    private final void method1878() {
        int var1 = this.field4377 * 3 / 32;
        int var3 = this.field4377 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class66.field1036 * var1 + var1;
        int var8 = class66.field1036 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class66.field1029) {
            var4 = var3 - (var1 + var3 - class66.field1029);
        }
        if (var1 < class66.field1033) {
            int var11 = class66.field1033 - var1;
            var4 -= var11;
            var7 += class66.field1036 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class66.field1030) {
            int var12 = var1 + var3 - class66.field1030;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class66.field1031) {
            int var13 = class66.field1031 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method1875(class66.field1032, 0, this.field4376, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1876();
        super.finalize();
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "()V")
    private static final void method1879() {
        if (field4383 != null) {
            return;
        }
        class271 var0 = field4383 = new class271(260, 480, 0);
        int[] var1 = var0.field4296;
        int[] var2 = var0.field4328;
        int[] var3 = var0.field4334;
        int[] var4 = var0.field4292;
        int[] var5 = var0.field4325;
        int[] var6 = var0.field4331;
        var0.field4333 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class224.field3601[var8] >> 1;
            int var10 = class224.field3597[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var17 = var11 * 1024 / 16;
                int var18 = class224.field3597[var17] >> 9;
                int var19 = (class224.field3601[var17] >> 1) * var9 >> 23;
                int var20 = (class224.field3601[var17] >> 1) * var10 >> 23;
                var1[var0.field4333] = var20;
                var2[var0.field4333] = var18;
                var3[var0.field4333] = -var19;
                var0.field4333++;
            }
            if (var7 > 0) {
                int var12 = var7 * 15 + 2;
                int var13 = var12 - 15;
                var4[var0.field4335] = 0;
                var5[var0.field4335] = var13;
                var6[var0.field4335] = var12;
                var0.field4335++;
                for (int var14 = 1; var14 < 15; var14++) {
                    int var15 = var13 + 1;
                    int var16 = var12 + 1;
                    var4[var0.field4335] = var13;
                    var5[var0.field4335] = var15;
                    var6[var0.field4335] = var12;
                    var0.field4335++;
                    var4[var0.field4335] = var15;
                    var5[var0.field4335] = var16;
                    var6[var0.field4335] = var12;
                    var0.field4335++;
                    var13 = var15;
                    var12 = var16;
                }
                var4[var0.field4335] = var12;
                var5[var0.field4335] = var13;
                var6[var0.field4335] = 1;
                var0.field4335++;
            }
        }
        var0.field4307 = var0.field4333;
        var0.field4291 = null;
        var0.field4326 = null;
        var0.field4339 = null;
        var0.field4289 = null;
        var0.field4302 = null;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "()V")
    public static void method1880() {
        field4383 = null;
        field4374 = null;
        field4389 = null;
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "()V")
    private static final void method1881() {
        if (field4374 != null) {
            return;
        }
        field4374 = new byte[16384];
        for (int var0 = 0; var0 < 64; var0++) {
            int var1 = 64 - var0;
            int var2 = var1 * var1;
            int var3 = 128 - var0 - 1;
            int var4 = var0 * 128;
            int var5 = var3 * 128;
            for (int var6 = 0; var6 < 64; var6++) {
                int var7 = 64 - var6;
                int var8 = var7 * var7;
                int var9 = 128 - var6 - 1;
                int var10 = 256 - (var2 + var8 << 8) / 4096;
                int var11 = var10 * 16 * 192 / 1536;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                field4374[var4 + var6] = field4374[var4 + var9] = field4374[var5 + var6] = field4374[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)Z")
    public final boolean method1882(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field4390) {
            this.field4387 = 1073741823;
            var8 = this.field4380;
            var9 = this.field4385;
            var10 = this.field4381;
        } else {
            int var5 = this.field4380 - arg0;
            int var6 = this.field4385 - arg1;
            int var7 = this.field4381 - arg2;
            this.field4387 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4387 == 0) {
                this.field4387 = 1;
            }
            var8 = (var5 << 8) / this.field4387;
            var9 = (var6 << 8) / this.field4387;
            var10 = (var7 << 8) / this.field4387;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field4388 = this.field4382 * arg3 / (this.field4390 ? 1024 : this.field4387);
        } else {
            this.field4388 = 0;
        }
        if (this.field4388 < 8) {
            this.method1876();
            this.field4386 = null;
            return false;
        }
        int var12 = class15.method115((byte) 27, this.field4388);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4377 != var12) {
            this.field4377 = var12;
        }
        this.field4384 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field4379 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field4386 = null;
        return true;
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "()V")
    private final void method1883() {
        int var1 = this.field4377;
        int var2 = this.field4377;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class66.field1036 - var1;
        if (var2 > class66.field1029) {
            var2 -= var2 - class66.field1029;
        }
        if (class66.field1033 > 0) {
            int var9 = class66.field1033;
            var2 -= var9;
            var7 += class66.field1036 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class66.field1030) {
            int var10 = var1 - class66.field1030;
            var1 -= var10;
            var8 += var10;
        }
        if (class66.field1031 > 0) {
            int var11 = class66.field1031;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method1885(class66.field1032, this.field4376, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(Lwa;)V")
    private final void method1884(class275 arg0) {
        class271 var2 = class271.method1859(class146.field2162, this.field4375, 0);
        if (var2 == null) {
            return;
        }
        this.field4386 = new class51(this.field4377, this.field4377);
        class66.method521(field4389);
        this.field4386.method433();
        class224.method1543();
        class66.method532(0, 0, this.field4377, this.field4377, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field4390) {
                var3 = -arg0.field4380;
                var4 = -arg0.field4385;
                var5 = -arg0.field4381;
            } else {
                var3 = this.field4380 - arg0.field4380;
                var4 = this.field4385 - arg0.field4385;
                var5 = this.field4381 - arg0.field4381;
            }
        }
        if (this.field4384 != 0) {
            int var6 = class224.field3601[this.field4384];
            int var7 = class224.field3597[this.field4384];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field4379 != 0) {
            int var9 = this.field4379 - 1024 & 0x7FF;
            int var10 = class224.field3601[var9];
            int var11 = class224.field3597[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class87 var13 = var2.method1856(64, 768, -var3, -var4, -var5);
        int var14 = var13.method89() - var13.method67();
        int var15 = var13.method659() - var13.method82();
        int var16 = var13.method67() + var14 / 2;
        int var17 = var13.method82() + var15 / 2;
        if (var14 > var15) {
            var13.method665(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field4377);
        } else {
            var13.method665(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field4377);
        }
        class143.field2140.method1862(false);
        class66.method529(field4389);
        class224.method1543();
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([IIIIIIIIIII)V")
    private final void method1885(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field4374[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
                } else {
                    arg0[arg4] |= 0xFF000000;
                }
                arg4++;
                arg2 += arg8;
            }
            arg3 += arg9;
            arg2 = var12;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field4380 = arg2;
        this.field4385 = arg3;
        this.field4381 = arg4;
        this.field4390 = arg7;
        this.field4375 = arg1;
        this.field4376 = arg6;
        this.field4382 = arg5;
        this.field4378 = arg0;
    }
}
