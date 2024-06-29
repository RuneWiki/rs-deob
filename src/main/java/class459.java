import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class459 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "[I")
    private int[] field6719 = new int[5];

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    private int field6726 = 0;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    private int field6733 = 100;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "[I")
    private int[] field6725 = new int[5];

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "[I")
    private int[] field6724 = new int[5];

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public int field6722 = 500;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public int field6731 = 0;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "[I")
    private static int[] field6720 = new int[32768];

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "[I")
    private static int[] field6732;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "[I")
    private static int[] field6734;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "[I")
    private static int[] field6738;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "[I")
    private static int[] field6742;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "[I")
    private static int[] field6740;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "[I")
    private static int[] field6741;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "[I")
    private static int[] field6743;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "Lbd;")
    private class44 field6721;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "Lej;")
    private class79 field6723;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "Lej;")
    private class79 field6727;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Lej;")
    private class79 field6728;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "Lej;")
    private class79 field6729;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "Lej;")
    private class79 field6730;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "Lej;")
    private class79 field6735;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "Lej;")
    private class79 field6736;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "Lej;")
    private class79 field6737;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "Lej;")
    private class79 field6739;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Liv;)V")
    public final void method2757(class65 arg0) {
        this.field6737 = new class79();
        this.field6737.method721(arg0);
        this.field6727 = new class79();
        this.field6727.method721(arg0);
        int var2 = arg0.method577(255);
        if (var2 != 0) {
            arg0.field827--;
            this.field6736 = new class79();
            this.field6736.method721(arg0);
            this.field6735 = new class79();
            this.field6735.method721(arg0);
        }
        int var3 = arg0.method577(255);
        if (var3 != 0) {
            arg0.field827--;
            this.field6723 = new class79();
            this.field6723.method721(arg0);
            this.field6729 = new class79();
            this.field6729.method721(arg0);
        }
        int var4 = arg0.method577(255);
        if (var4 != 0) {
            arg0.field827--;
            this.field6739 = new class79();
            this.field6739.method721(arg0);
            this.field6728 = new class79();
            this.field6728.method721(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method593((byte) 124);
            if (var6 == 0) {
                break;
            }
            this.field6724[var5] = var6;
            this.field6719[var5] = arg0.method589(-5115);
            this.field6725[var5] = arg0.method593((byte) 89);
        }
        this.field6726 = arg0.method593((byte) 72);
        this.field6733 = arg0.method593((byte) 92);
        this.field6722 = arg0.method623((byte) -71);
        this.field6731 = arg0.method623((byte) -61);
        this.field6721 = new class44();
        this.field6730 = new class79();
        this.field6721.method476(arg0, this.field6730);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "()V")
    public static void method2758() {
        field6734 = null;
        field6720 = null;
        field6732 = null;
        field6741 = null;
        field6742 = null;
        field6740 = null;
        field6743 = null;
        field6738 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)[I")
    public final int[] method2759(int arg0, int arg1) {
        class201.method1408(field6734, 0, arg0);
        if (arg1 < 10) {
            return field6734;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field6737.method720();
        this.field6727.method720();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field6736 != null) {
            this.field6736.method720();
            this.field6735.method720();
            var5 = (int) ((double) (this.field6736.field1056 - this.field6736.field1055) * 32.768D / var3);
            var6 = (int) ((double) this.field6736.field1055 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field6723 != null) {
            this.field6723.method720();
            this.field6729.method720();
            var8 = (int) ((double) (this.field6723.field1056 - this.field6723.field1055) * 32.768D / var3);
            var9 = (int) ((double) this.field6723.field1055 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field6724[var11] != 0) {
                field6741[var11] = 0;
                field6742[var11] = (int) ((double) this.field6725[var11] * var3);
                field6740[var11] = (this.field6724[var11] << 14) / 100;
                field6743[var11] = (int) ((double) (this.field6737.field1056 - this.field6737.field1055) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field6719[var11]) / var3);
                field6738[var11] = (int) ((double) this.field6737.field1055 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field6737.method722(arg0);
            int var40 = this.field6727.method722(arg0);
            if (this.field6736 != null) {
                int var41 = this.field6736.method722(arg0);
                int var42 = this.field6735.method722(arg0);
                var39 += this.method2760(var7, var42, this.field6736.field1054) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field6723 != null) {
                int var43 = this.field6723.method722(arg0);
                int var44 = this.field6729.method722(arg0);
                var40 = var40 * ((this.method2760(var10, var44, this.field6723.field1054) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field6724[var45] != 0) {
                    int var46 = field6742[var45] + var12;
                    if (var46 < arg0) {
                        field6734[var46] += this.method2760(field6741[var45], field6740[var45] * var40 >> 15, this.field6737.field1054);
                        field6741[var45] += (field6743[var45] * var39 >> 16) + field6738[var45];
                    }
                }
            }
        }
        if (this.field6739 != null) {
            this.field6739.method720();
            this.field6728.method720();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field6739.method722(arg0);
                int var18 = this.field6728.method722(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field6739.field1056 - this.field6739.field1055) * var17 >> 8) + this.field6739.field1055;
                } else {
                    var19 = ((this.field6739.field1056 - this.field6739.field1055) * var18 >> 8) + this.field6739.field1055;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field6734[var16] = 0;
                }
            }
        }
        if (this.field6726 > 0 && this.field6733 > 0) {
            int var20 = (int) ((double) this.field6726 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field6734[var21] += field6734[var21 - var20] * this.field6733 / 100;
            }
        }
        if (this.field6721.field500[0] > 0 || this.field6721.field500[1] > 0) {
            this.field6730.method720();
            int var22 = this.field6730.method722(arg0 + 1);
            int var23 = this.field6721.method477(0, (float) var22 / 65536.0F);
            int var24 = this.field6721.method477(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field6734[var23 + var25] * (long) class44.field501 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field6734[var23 + var25 - var36 - 1] * (long) class44.field496[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field6734[var25 - var37 - 1] * (long) class44.field496[1][var37] >> 16);
                    }
                    field6734[var25] = var35;
                    var22 = this.field6730.method722(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field6734[var23 + var25] * (long) class44.field501 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field6734[var23 + var25 - var33 - 1] * (long) class44.field496[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field6734[var25 - var34 - 1] * (long) class44.field496[1][var34] >> 16);
                        }
                        field6734[var25] = var32;
                        var22 = this.field6730.method722(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field6734[var23 + var25 - var29 - 1] * (long) class44.field496[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field6734[var25 - var30 - 1] * (long) class44.field496[1][var30] >> 16);
                            }
                            field6734[var25] = var28;
                            this.field6730.method722(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field6721.method477(0, (float) var22 / 65536.0F);
                    var24 = this.field6721.method477(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field6734[var38] < -32768) {
                field6734[var38] = -32768;
            }
            if (field6734[var38] > 32767) {
                field6734[var38] = 32767;
            }
        }
        return field6734;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)I")
    private final int method2760(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field6732[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field6720[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field6720[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field6732 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field6732[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field6734 = new int[220500];
        field6738 = new int[5];
        field6742 = new int[5];
        field6740 = new int[5];
        field6741 = new int[5];
        field6743 = new int[5];
    }
}
