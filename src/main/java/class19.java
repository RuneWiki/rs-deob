import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class19 {

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public int field408 = 0;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "[I")
    private int[] field416 = new int[5];

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    private int field414 = 0;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    private int field406 = 100;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public int field419 = 500;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "[I")
    private int[] field417 = new int[5];

    @OriginalMember(owner = "client!d", name = "f", descriptor = "[I")
    private int[] field411 = new int[5];

    @OriginalMember(owner = "client!d", name = "b", descriptor = "[I")
    private static int[] field407 = new int[32768];

    @OriginalMember(owner = "client!d", name = "p", descriptor = "[I")
    private static int[] field421;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "[I")
    private static int[] field424;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "[I")
    private static int[] field427;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "[I")
    private static int[] field429;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "[I")
    private static int[] field428;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "[I")
    private static int[] field426;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "[I")
    private static int[] field430;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Lrb;")
    private class102 field415;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Lge;")
    private class41 field409;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Lge;")
    private class41 field410;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lge;")
    private class41 field412;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lge;")
    private class41 field413;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Lge;")
    private class41 field418;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Lge;")
    private class41 field420;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Lge;")
    private class41 field422;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Lge;")
    private class41 field423;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "Lge;")
    private class41 field425;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "()V")
    public static void method127() {
        field424 = null;
        field407 = null;
        field421 = null;
        field427 = null;
        field430 = null;
        field426 = null;
        field429 = null;
        field428 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)I")
    private final int method128(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field421[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field407[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lud;)V")
    public final void method129(class119 arg0) {
        this.field418 = new class41();
        this.field418.method323(arg0);
        this.field420 = new class41();
        this.field420.method323(arg0);
        int var2 = arg0.method879((byte) 45);
        if (var2 != 0) {
            arg0.field2554--;
            this.field425 = new class41();
            this.field425.method323(arg0);
            this.field410 = new class41();
            this.field410.method323(arg0);
        }
        int var3 = arg0.method879((byte) 45);
        if (var3 != 0) {
            arg0.field2554--;
            this.field422 = new class41();
            this.field422.method323(arg0);
            this.field412 = new class41();
            this.field412.method323(arg0);
        }
        int var4 = arg0.method879((byte) 45);
        if (var4 != 0) {
            arg0.field2554--;
            this.field423 = new class41();
            this.field423.method323(arg0);
            this.field409 = new class41();
            this.field409.method323(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method899(-4);
            if (var6 == 0) {
                break;
            }
            this.field416[var5] = var6;
            this.field411[var5] = arg0.method871(26470);
            this.field417[var5] = arg0.method899(-4);
        }
        this.field414 = arg0.method899(-4);
        this.field406 = arg0.method899(-4);
        this.field419 = arg0.method903(2);
        this.field408 = arg0.method903(2);
        this.field415 = new class102();
        this.field413 = new class41();
        this.field415.method722(arg0, this.field413);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)[I")
    public final int[] method130(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field424[var3] = 0;
        }
        if (arg1 < 10) {
            return field424;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field418.method321();
        this.field420.method321();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field425 != null) {
            this.field425.method321();
            this.field410.method321();
            var6 = (int) ((double) (this.field425.field881 - this.field425.field880) * 32.768D / var4);
            var7 = (int) ((double) this.field425.field880 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field422 != null) {
            this.field422.method321();
            this.field412.method321();
            var9 = (int) ((double) (this.field422.field881 - this.field422.field880) * 32.768D / var4);
            var10 = (int) ((double) this.field422.field880 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field416[var12] != 0) {
                field427[var12] = 0;
                field430[var12] = (int) ((double) this.field417[var12] * var4);
                field426[var12] = (this.field416[var12] << 14) / 100;
                field429[var12] = (int) ((double) (this.field418.field881 - this.field418.field880) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field411[var12]) / var4);
                field428[var12] = (int) ((double) this.field418.field880 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field418.method320(arg0);
            int var41 = this.field420.method320(arg0);
            if (this.field425 != null) {
                int var42 = this.field425.method320(arg0);
                int var43 = this.field410.method320(arg0);
                var40 += this.method128(var8, var43, this.field425.field876) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field422 != null) {
                int var44 = this.field422.method320(arg0);
                int var45 = this.field412.method320(arg0);
                var41 = var41 * ((this.method128(var11, var45, this.field422.field876) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field416[var46] != 0) {
                    int var47 = field430[var46] + var13;
                    if (var47 < arg0) {
                        field424[var47] += this.method128(field427[var46], field426[var46] * var41 >> 15, this.field418.field876);
                        field427[var46] += (field429[var46] * var40 >> 16) + field428[var46];
                    }
                }
            }
        }
        if (this.field423 != null) {
            this.field423.method321();
            this.field409.method321();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field423.method320(arg0);
                int var19 = this.field409.method320(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field423.field881 - this.field423.field880) * var18 >> 8) + this.field423.field880;
                } else {
                    var20 = ((this.field423.field881 - this.field423.field880) * var19 >> 8) + this.field423.field880;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field424[var17] = 0;
                }
            }
        }
        if (this.field414 > 0 && this.field406 > 0) {
            int var21 = (int) ((double) this.field414 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field424[var22] += field424[var22 - var21] * this.field406 / 100;
            }
        }
        if (this.field415.field2190[0] > 0 || this.field415.field2190[1] > 0) {
            this.field413.method321();
            int var23 = this.field413.method320(arg0 + 1);
            int var24 = this.field415.method720(0, (float) var23 / 65536.0F);
            int var25 = this.field415.method720(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field424[var24 + var26] * (long) class102.field2191 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field424[var24 + var26 - var37 - 1] * (long) class102.field2188[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field424[var26 - var38 - 1] * (long) class102.field2188[1][var38] >> 16);
                    }
                    field424[var26] = var36;
                    var23 = this.field413.method320(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field424[var24 + var26] * (long) class102.field2191 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field424[var24 + var26 - var34 - 1] * (long) class102.field2188[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field424[var26 - var35 - 1] * (long) class102.field2188[1][var35] >> 16);
                        }
                        field424[var26] = var33;
                        var23 = this.field413.method320(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field424[var24 + var26 - var30 - 1] * (long) class102.field2188[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field424[var26 - var31 - 1] * (long) class102.field2188[1][var31] >> 16);
                            }
                            field424[var26] = var29;
                            this.field413.method320(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field415.method720(0, (float) var23 / 65536.0F);
                    var25 = this.field415.method720(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field424[var39] < -32768) {
                field424[var39] = -32768;
            }
            if (field424[var39] > 32767) {
                field424[var39] = 32767;
            }
        }
        return field424;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field407[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field421 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field421[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field424 = new int[220500];
        field427 = new int[5];
        field429 = new int[5];
        field428 = new int[5];
        field426 = new int[5];
        field430 = new int[5];
    }
}
