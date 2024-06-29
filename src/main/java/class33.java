import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class33 {

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    private int field743 = 0;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public int field742 = 0;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "[I")
    private int[] field741 = new int[5];

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
    private int[] field746 = new int[5];

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "[I")
    private int[] field750 = new int[5];

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public int field744 = 500;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    private int field756 = 100;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "[I")
    private static int[] field755 = new int[32768];

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "[I")
    private static int[] field748;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "[I")
    private static int[] field753;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "[I")
    private static int[] field758;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "[I")
    private static int[] field759;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "[I")
    private static int[] field760;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "[I")
    private static int[] field761;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "[I")
    private static int[] field763;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Ldc;")
    private class22 field739;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Ldc;")
    private class22 field745;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Ldc;")
    private class22 field747;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Ldc;")
    private class22 field749;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Ldc;")
    private class22 field751;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Ldc;")
    private class22 field752;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Ldc;")
    private class22 field754;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "Ldc;")
    private class22 field757;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "Ldc;")
    private class22 field762;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Li;")
    private class48 field740;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field755[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field748 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field748[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field753 = new int[220500];
        field758 = new int[5];
        field759 = new int[5];
        field760 = new int[5];
        field761 = new int[5];
        field763 = new int[5];
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()V", line = 4)
    public static void method257() {
        field753 = null;
        field755 = null;
        field748 = null;
        field760 = null;
        field759 = null;
        field763 = null;
        field761 = null;
        field758 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)[I", line = 24)
    public final int[] method258(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field753[var3] = 0;
        }
        if (arg1 < 10) {
            return field753;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field749.method157();
        this.field751.method157();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field745 != null) {
            this.field745.method157();
            this.field757.method157();
            var6 = (int) ((double) (this.field745.field430 - this.field745.field427) * 32.768D / var4);
            var7 = (int) ((double) this.field745.field427 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field752 != null) {
            this.field752.method157();
            this.field754.method157();
            var9 = (int) ((double) (this.field752.field430 - this.field752.field427) * 32.768D / var4);
            var10 = (int) ((double) this.field752.field427 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field746[var12] != 0) {
                field760[var12] = 0;
                field759[var12] = (int) ((double) this.field750[var12] * var4);
                field763[var12] = (this.field746[var12] << 14) / 100;
                field761[var12] = (int) ((double) (this.field749.field430 - this.field749.field427) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field741[var12]) / var4);
                field758[var12] = (int) ((double) this.field749.field427 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field749.method154(arg0);
            int var41 = this.field751.method154(arg0);
            if (this.field745 != null) {
                int var42 = this.field745.method154(arg0);
                int var43 = this.field757.method154(arg0);
                var40 += this.method260(var8, var43, this.field745.field428) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field752 != null) {
                int var44 = this.field752.method154(arg0);
                int var45 = this.field754.method154(arg0);
                var41 = var41 * ((this.method260(var11, var45, this.field752.field428) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field746[var46] != 0) {
                    int var47 = field759[var46] + var13;
                    if (var47 < arg0) {
                        field753[var47] += this.method260(field760[var46], field763[var46] * var41 >> 15, this.field749.field428);
                        field760[var46] += (field761[var46] * var40 >> 16) + field758[var46];
                    }
                }
            }
        }
        if (this.field762 != null) {
            this.field762.method157();
            this.field747.method157();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field762.method154(arg0);
                int var19 = this.field747.method154(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field762.field430 - this.field762.field427) * var18 >> 8) + this.field762.field427;
                } else {
                    var20 = ((this.field762.field430 - this.field762.field427) * var19 >> 8) + this.field762.field427;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field753[var17] = 0;
                }
            }
        }
        if (this.field743 > 0 && this.field756 > 0) {
            int var21 = (int) ((double) this.field743 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field753[var22] += field753[var22 - var21] * this.field756 / 100;
            }
        }
        if (this.field740.field1173[0] > 0 || this.field740.field1173[1] > 0) {
            this.field739.method157();
            int var23 = this.field739.method154(arg0 + 1);
            int var24 = this.field740.method363(0, (float) var23 / 65536.0F);
            int var25 = this.field740.method363(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field753[var24 + var26] * (long) class48.field1172 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field753[var24 + var26 - var37 - 1] * (long) class48.field1171[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field753[var26 - var38 - 1] * (long) class48.field1171[1][var38] >> 16);
                    }
                    field753[var26] = var36;
                    var23 = this.field739.method154(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field753[var24 + var26] * (long) class48.field1172 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field753[var24 + var26 - var34 - 1] * (long) class48.field1171[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field753[var26 - var35 - 1] * (long) class48.field1171[1][var35] >> 16);
                        }
                        field753[var26] = var33;
                        var23 = this.field739.method154(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field753[var24 + var26 - var30 - 1] * (long) class48.field1171[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field753[var26 - var31 - 1] * (long) class48.field1171[1][var31] >> 16);
                            }
                            field753[var26] = var29;
                            this.field739.method154(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field740.method363(0, (float) var23 / 65536.0F);
                    var25 = this.field740.method363(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field753[var39] < -32768) {
                field753[var39] = -32768;
            }
            if (field753[var39] > 32767) {
                field753[var39] = 32767;
            }
        }
        return field753;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lka;)V", line = 313)
    public final void method259(class61 arg0) {
        this.field749 = new class22();
        this.field749.method156(arg0);
        this.field751 = new class22();
        this.field751.method156(arg0);
        int var2 = arg0.method494(20471);
        if (var2 != 0) {
            arg0.field1556--;
            this.field745 = new class22();
            this.field745.method156(arg0);
            this.field757 = new class22();
            this.field757.method156(arg0);
        }
        int var3 = arg0.method494(20471);
        if (var3 != 0) {
            arg0.field1556--;
            this.field752 = new class22();
            this.field752.method156(arg0);
            this.field754 = new class22();
            this.field754.method156(arg0);
        }
        int var4 = arg0.method494(20471);
        if (var4 != 0) {
            arg0.field1556--;
            this.field762 = new class22();
            this.field762.method156(arg0);
            this.field747 = new class22();
            this.field747.method156(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method498(-129);
            if (var6 == 0) {
                break;
            }
            this.field746[var5] = var6;
            this.field741[var5] = arg0.method503(255);
            this.field750[var5] = arg0.method498(-129);
        }
        this.field743 = arg0.method498(-129);
        this.field756 = arg0.method498(-129);
        this.field744 = arg0.method507((byte) -116);
        this.field742 = arg0.method507((byte) -114);
        this.field740 = new class48();
        this.field739 = new class22();
        this.field740.method366(arg0, this.field739);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)I", line = 377)
    private final int method260(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field748[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field755[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }
}
