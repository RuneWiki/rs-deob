import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class520 {

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "[B")
    private byte[] field7226 = new byte[64];

    @OriginalMember(owner = "client!iaa", name = "f", descriptor = "I")
    private int field7231 = 0;

    @OriginalMember(owner = "client!iaa", name = "m", descriptor = "[J")
    private long[] field7238 = new long[8];

    @OriginalMember(owner = "client!iaa", name = "k", descriptor = "[J")
    private long[] field7236 = new long[8];

    @OriginalMember(owner = "client!iaa", name = "l", descriptor = "[B")
    private byte[] field7237 = new byte[32];

    @OriginalMember(owner = "client!iaa", name = "g", descriptor = "[J")
    private long[] field7232 = new long[8];

    @OriginalMember(owner = "client!iaa", name = "o", descriptor = "[J")
    private long[] field7240 = new long[8];

    @OriginalMember(owner = "client!iaa", name = "q", descriptor = "I")
    private int field7242 = 0;

    @OriginalMember(owner = "client!iaa", name = "s", descriptor = "[J")
    private long[] field7244 = new long[8];

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "[I")
    public static int[] field7229 = new int[2];

    @OriginalMember(owner = "client!iaa", name = "h", descriptor = "[I")
    public static int[] field7233 = new int[8];

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!iaa", name = "i", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!iaa", name = "j", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!iaa", name = "n", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!iaa", name = "p", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!iaa", name = "r", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V")
    public static void method3021(int arg0) {
        field7233 = null;
        if (arg0 == 28219) {
            field7229 = null;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)V")
    public final void method3022(byte arg0) {
        field7230++;
        for (int var2 = 0; var2 < 32; var2++) {
            this.field7237[var2] = 0;
        }
        this.field7231 = this.field7242 = 0;
        this.field7226[0] = 0;
        if (arg0 <= 77) {
            this.method3024(false, -53, null);
        }
        for (int var3 = 0; var3 < 8; var3++) {
            this.field7238[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZJ[B)V")
    public final void method3023(boolean arg0, long arg1, byte[] arg2) {
        field7228++;
        if (!arg0) {
            this.method3024(true, -27, null);
        }
        int var5 = 0;
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        int var7 = this.field7231 & 0x7;
        long var8 = arg1;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field7237[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field7237[var10] = (byte) var16;
            var11 = var16 >>> 8;
            var8 >>>= 0x8;
            var10--;
        }
        while (arg1 > 8L) {
            int var15 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field7226[this.field7242] = (byte) class670.method3699(this.field7226[this.field7242], var15 >>> var7);
            this.field7242++;
            this.field7231 += 8 - var7;
            if (this.field7231 == 512) {
                this.method3026(8);
                this.field7231 = this.field7242 = 0;
            }
            this.field7226[this.field7242] = (byte) class519.method3018(var15 << 8 - var7, 255);
            this.field7231 += var7;
            arg1 -= 8L;
            var5++;
        }
        int var12;
        if (arg1 > 0L) {
            var12 = arg2[var5] << var6 & 0xFF;
            this.field7226[this.field7242] = (byte) class670.method3699(this.field7226[this.field7242], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if ((long) var7 + arg1 < 8L) {
            this.field7231 = (int) ((long) this.field7231 + arg1);
            return;
        }
        this.field7231 += 8 - var7;
        long var13 = arg1 - (long) (8 - var7);
        this.field7242++;
        if (this.field7231 == 512) {
            this.method3026(8);
            this.field7231 = this.field7242 = 0;
        }
        this.field7226[this.field7242] = (byte) class519.method3018(var12 << 8 - var7, 255);
        this.field7231 += (int) var13;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZI[B)V")
    public final void method3024(boolean arg0, int arg1, byte[] arg2) {
        this.field7226[this.field7242] = (byte) class670.method3699(this.field7226[this.field7242], 0x80 >>> class519.method3018(this.field7231, 7));
        field7239++;
        this.field7242++;
        if (this.field7242 > 32) {
            while (true) {
                if (this.field7242 >= 64) {
                    this.method3026(8);
                    this.field7242 = 0;
                    break;
                }
                this.field7226[this.field7242++] = 0;
            }
        }
        while (this.field7242 < 32) {
            this.field7226[this.field7242++] = 0;
        }
        class421.method2534(this.field7237, 0, this.field7226, 32, 32);
        this.method3026(8);
        int var4 = 0;
        if (arg0) {
            method3021(123);
        }
        int var5 = arg1;
        while (var4 < 8) {
            long var6 = this.field7238[var4];
            arg2[var5] = (byte) ((int) (var6 >>> 56));
            arg2[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg2[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg2[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg2[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg2[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg2[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg2[var5 + 7] = (byte) ((int) var6);
            var5 += 8;
            var4++;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IBIII[B)Z")
    public static final boolean method3025(int arg0, byte arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field7241++;
        if (arg1 != 40) {
            field7234 = -73;
        }
        boolean var6 = true;
        class254 var7 = new class254(arg5);
        int var8 = -1;
        label60: while (true) {
            int var9 = var7.method1707(-32768);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method1673(-32768);
                    if (var13 == 0) {
                        continue label60;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = (var10 & 0xFE8) >> 6;
                    int var16 = var7.method1731((byte) 64) >> 2;
                    int var17 = arg0 + var15;
                    int var18 = arg3 + var14;
                    if (var17 > 0 && var18 > 0 && var17 < arg2 - 1 && var18 < (arg4 - 1)) {
                        class412 var19 = class210.field2705.method1362(0, var8);
                        if (var16 != 22 || class125.field1721.field5166.method2848(43) != 0 || var19.field5905 != 0 || var19.field5895 == 1 || var19.field5904) {
                            if (!var19.method2487((byte) -25)) {
                                class493.field6947++;
                                var6 = false;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.method1673(arg1 - 32808);
                if (var12 == 0) {
                    break;
                }
                var7.method1731((byte) 64);
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)V")
    private final void method3026(int arg0) {
        field7227++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 != 8) {
            this.method3024(true, 98, null);
        }
        while (var2 < 8) {
            this.field7236[var2] = class380.method2370(class380.method2370(class380.method2370(class380.method2370(class449.method2674(0xFFL << 24, (long) this.field7226[var3 + 4] << 24), class380.method2370(class449.method2674(0xFFL << 32, (long) this.field7226[var3 + 3] << 32), class380.method2370(class380.method2370((long) this.field7226[var3] << 56, class449.method2674((long) this.field7226[var3 + 1] << 48, 0xFFL << 48)), class449.method2674((long) this.field7226[var3 + 2], 255L) << 40))), class449.method2674((long) this.field7226[var3 + 5], 255L) << 16), class449.method2674(0xFFL << 8, (long) this.field7226[var3 + 6] << 8)), class449.method2674((long) this.field7226[var3 + 7], 255L));
            var3 += 8;
            var2++;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field7244[var4] = class380.method2370(this.field7236[var4], this.field7240[var4] = this.field7238[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field7232[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field7232[var7] = class380.method2370(this.field7232[var7], class532.field7347[var13][class519.method3018((int) (this.field7240[class519.method3018(7, var7 - var13)] >>> var14), 255)]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field7240[var8] = this.field7232[var8];
            }
            this.field7240[0] = class380.method2370(this.field7240[0], class532.field7390[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field7232[var9] = this.field7240[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field7232[var9] = class380.method2370(this.field7232[var9], class532.field7347[var11][class519.method3018(255, (int) (this.field7244[class519.method3018(var9 - var11, 7)] >>> var12))]);
                    var12 -= 8;
                    var11++;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field7244[var10] = this.field7232[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field7238[var6] = class380.method2370(this.field7238[var6], class380.method2370(this.field7244[var6], this.field7236[var6]));
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7235++;
        if (arg1 == arg5 && arg6 == arg7 && arg8 == arg9 && arg2 == arg4) {
            class588.method3303(arg8, arg2, arg0, arg7, arg1, 25341);
        } else {
            int var10 = arg1;
            int var11 = arg7;
            int var12 = arg1 * 3;
            int var13 = arg7 * 3;
            int var14 = arg5 * 3;
            int var15 = arg6 * 3;
            int var16 = arg9 * 3;
            int var17 = arg4 * 3;
            int var18 = arg8 + var14 - var16 - arg1;
            int var19 = arg2 + var15 - var17 - arg7;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 - (var15 - var13) - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var29 + var31 + var27 >> 12) + arg1;
                int var34 = arg7 + (var28 + var32 + var30 >> 12);
                class588.method3303(var33, var34, arg0, var11, var10, 25341);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg3 != 3) {
            method3025(113, (byte) 4, -119, 97, 107, null);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIII)V")
    public static final void method3028(int arg0, int arg1, int arg2, int arg3) {
        field7243++;
        if (arg3 == 1006) {
            class727.method4014(class756.field10226, arg0, arg2);
        } else if (arg3 == 1007) {
            class727.method4014(class196.field2539, arg0, arg2);
        } else if (arg3 == 1010) {
            class727.method4014(class138.field1864, arg0, arg2);
        } else if (arg3 == 1011) {
            class727.method4014(class554.field7639, arg0, arg2);
        } else if (arg3 == 1001) {
            class727.method4014(class632.field8550, arg0, arg2);
        }
        if (arg1 != -1011) {
            field7234 = -45;
        }
    }
}
