import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FFMSWDBM")
public class class13 {

    @OriginalMember(owner = "client!FFMSWDBM", name = "i", descriptor = "[I")
    private int[] field686 = new int[5];

    @OriginalMember(owner = "client!FFMSWDBM", name = "j", descriptor = "[I")
    private int[] field687 = new int[5];

    @OriginalMember(owner = "client!FFMSWDBM", name = "k", descriptor = "[I")
    private int[] field688 = new int[5];

    @OriginalMember(owner = "client!FFMSWDBM", name = "m", descriptor = "I")
    private int field690 = 100;

    @OriginalMember(owner = "client!FFMSWDBM", name = "p", descriptor = "I")
    public int field693 = 500;

    @OriginalMember(owner = "client!FFMSWDBM", name = "u", descriptor = "[I")
    private static int[] field698 = new int[5];

    @OriginalMember(owner = "client!FFMSWDBM", name = "v", descriptor = "[I")
    private static int[] field699 = new int[5];

    @OriginalMember(owner = "client!FFMSWDBM", name = "w", descriptor = "[I")
    private static int[] field700 = new int[5];

    @OriginalMember(owner = "client!FFMSWDBM", name = "x", descriptor = "[I")
    private static int[] field701 = new int[5];

    @OriginalMember(owner = "client!FFMSWDBM", name = "y", descriptor = "[I")
    private static int[] field702 = new int[5];

    @OriginalMember(owner = "client!FFMSWDBM", name = "l", descriptor = "I")
    private int field689;

    @OriginalMember(owner = "client!FFMSWDBM", name = "q", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "client!FFMSWDBM", name = "a", descriptor = "LHXORSAZH;")
    private class19 field678;

    @OriginalMember(owner = "client!FFMSWDBM", name = "b", descriptor = "LHXORSAZH;")
    private class19 field679;

    @OriginalMember(owner = "client!FFMSWDBM", name = "c", descriptor = "LHXORSAZH;")
    private class19 field680;

    @OriginalMember(owner = "client!FFMSWDBM", name = "d", descriptor = "LHXORSAZH;")
    private class19 field681;

    @OriginalMember(owner = "client!FFMSWDBM", name = "e", descriptor = "LHXORSAZH;")
    private class19 field682;

    @OriginalMember(owner = "client!FFMSWDBM", name = "f", descriptor = "LHXORSAZH;")
    private class19 field683;

    @OriginalMember(owner = "client!FFMSWDBM", name = "g", descriptor = "LHXORSAZH;")
    private class19 field684;

    @OriginalMember(owner = "client!FFMSWDBM", name = "h", descriptor = "LHXORSAZH;")
    private class19 field685;

    @OriginalMember(owner = "client!FFMSWDBM", name = "o", descriptor = "LHXORSAZH;")
    private class19 field692;

    @OriginalMember(owner = "client!FFMSWDBM", name = "n", descriptor = "LZENSICXR;")
    private class70 field691;

    @OriginalMember(owner = "client!FFMSWDBM", name = "r", descriptor = "[I")
    private static int[] field695;

    @OriginalMember(owner = "client!FFMSWDBM", name = "s", descriptor = "[I")
    private static int[] field696;

    @OriginalMember(owner = "client!FFMSWDBM", name = "t", descriptor = "[I")
    private static int[] field697;

    @OriginalMember(owner = "client!FFMSWDBM", name = "a", descriptor = "()V")
    public static final void method195() {
        field696 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field696[var0] = 1;
            } else {
                field696[var0] = -1;
            }
        }
        field697 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field697[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field695 = new int[220500];
    }

    @OriginalMember(owner = "client!FFMSWDBM", name = "a", descriptor = "(II)[I")
    public final int[] method196(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field695[var3] = 0;
        }
        if (arg1 < 10) {
            return field695;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field678.method224(false);
        this.field679.method224(false);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field680 != null) {
            this.field680.method224(false);
            this.field681.method224(false);
            var6 = (int) ((double) (this.field680.field769 - this.field680.field768) * 32.768D / var4);
            var7 = (int) ((double) this.field680.field768 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field682 != null) {
            this.field682.method224(false);
            this.field683.method224(false);
            var9 = (int) ((double) (this.field682.field769 - this.field682.field768) * 32.768D / var4);
            var10 = (int) ((double) this.field682.field768 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field686[var12] != 0) {
                field698[var12] = 0;
                field699[var12] = (int) ((double) this.field688[var12] * var4);
                field700[var12] = (this.field686[var12] << 14) / 100;
                field701[var12] = (int) ((double) (this.field678.field769 - this.field678.field768) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field687[var12]) / var4);
                field702[var12] = (int) ((double) this.field678.field768 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field678.method225(arg0, (byte) -100);
            int var42 = this.field679.method225(arg0, (byte) -100);
            if (this.field680 != null) {
                int var43 = this.field680.method225(arg0, (byte) -100);
                int var44 = this.field681.method225(arg0, (byte) -100);
                var41 += this.method197(this.field680.field770, var8, 790, var44) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field682 != null) {
                int var45 = this.field682.method225(arg0, (byte) -100);
                int var46 = this.field683.method225(arg0, (byte) -100);
                var42 = var42 * ((this.method197(this.field682.field770, var11, 790, var46) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field686[var47] != 0) {
                    int var48 = field699[var47] + var13;
                    if (var48 < arg0) {
                        field695[var48] += this.method197(this.field678.field770, field698[var47], 790, field700[var47] * var42 >> 15);
                        field698[var47] += (field701[var47] * var41 >> 16) + field702[var47];
                    }
                }
            }
        }
        if (this.field684 != null) {
            this.field684.method224(false);
            this.field685.method224(false);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field684.method225(arg0, (byte) -100);
                int var19 = this.field685.method225(arg0, (byte) -100);
                int var20;
                if (var16) {
                    var20 = ((this.field684.field769 - this.field684.field768) * var18 >> 8) + this.field684.field768;
                } else {
                    var20 = ((this.field684.field769 - this.field684.field768) * var19 >> 8) + this.field684.field768;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field695[var17] = 0;
                }
            }
        }
        if (this.field689 > 0 && this.field690 > 0) {
            int var21 = (int) ((double) this.field689 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field695[var22] += field695[var22 - var21] * this.field690 / 100;
            }
        }
        if (this.field691.field1736[0] > 0 || this.field691.field1736[1] > 0) {
            this.field692.method224(false);
            int var23 = this.field692.method225(arg0 + 1, (byte) -100);
            int var24 = this.field691.method587(0, (float) var23 / 65536.0F, (byte) 8);
            int var25 = this.field691.method587(1, (float) var23 / 65536.0F, (byte) 8);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field695[var24 + var26] * (long) class70.field1743 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field695[var24 + var26 - var38 - 1] * (long) class70.field1741[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field695[var26 - var39 - 1] * (long) class70.field1741[1][var39] >> 16);
                    }
                    field695[var26] = var37;
                    var23 = this.field692.method225(arg0 + 1, (byte) -100);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field695[var24 + var26] * (long) class70.field1743 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field695[var24 + var26 - var35 - 1] * (long) class70.field1741[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field695[var26 - var36 - 1] * (long) class70.field1741[1][var36] >> 16);
                        }
                        field695[var26] = var34;
                        var23 = this.field692.method225(arg0 + 1, (byte) -100);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field695[var24 + var26 - var31 - 1] * (long) class70.field1741[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field695[var26 - var32 - 1] * (long) class70.field1741[1][var32] >> 16);
                            }
                            field695[var26] = var30;
                            this.field692.method225(arg0 + 1, (byte) -100);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field691.method587(0, (float) var23 / 65536.0F, (byte) 8);
                    var25 = this.field691.method587(1, (float) var23 / 65536.0F, (byte) 8);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field695[var40] < -32768) {
                field695[var40] = -32768;
            }
            if (field695[var40] > 32767) {
                field695[var40] = 32767;
            }
        }
        return field695;
    }

    @OriginalMember(owner = "client!FFMSWDBM", name = "a", descriptor = "(IIII)I")
    private final int method197(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 22 / arg2;
        if (arg0 == 1) {
            return (arg1 & 0x7FFF) < 16384 ? arg3 : -arg3;
        } else if (arg0 == 2) {
            return field697[arg1 & 0x7FFF] * arg3 >> 14;
        } else if (arg0 == 3) {
            return ((arg1 & 0x7FFF) * arg3 >> 14) - arg3;
        } else if (arg0 == 4) {
            return field696[arg1 / 2607 & 0x7FFF] * arg3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!FFMSWDBM", name = "a", descriptor = "(ILTQYMAXSO;)V")
    public final void method198(int arg0, class53 arg1) {
        this.field678 = new class19();
        this.field678.method222(3, arg1);
        this.field679 = new class19();
        this.field679.method222(3, arg1);
        int var3 = arg1.method468();
        if (var3 != 0) {
            arg1.field1457--;
            this.field680 = new class19();
            this.field680.method222(3, arg1);
            this.field681 = new class19();
            this.field681.method222(3, arg1);
        }
        int var4 = arg1.method468();
        if (var4 != 0) {
            arg1.field1457--;
            this.field682 = new class19();
            this.field682.method222(3, arg1);
            this.field683 = new class19();
            this.field683.method222(3, arg1);
        }
        int var5 = arg1.method468();
        if (var5 != 0) {
            arg1.field1457--;
            this.field684 = new class19();
            this.field684.method222(3, arg1);
            this.field685 = new class19();
            this.field685.method222(3, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method482();
            if (var7 == 0) {
                break;
            }
            this.field686[var6] = var7;
            this.field687[var6] = arg1.method481();
            this.field688[var6] = arg1.method482();
        }
        if (arg0 < 3 || arg0 > 3) {
            throw new NullPointerException();
        }
        this.field689 = arg1.method482();
        this.field690 = arg1.method482();
        this.field693 = arg1.method470();
        this.field694 = arg1.method470();
        this.field691 = new class70();
        this.field692 = new class19();
        this.field691.method588(this.field692, 0, arg1);
    }
}
