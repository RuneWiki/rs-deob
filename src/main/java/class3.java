import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class3 {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public int field53 = 0;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    private int field59 = 100;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    private int field60 = 0;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "[I")
    private int[] field67 = new int[5];

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "[I")
    private int[] field68 = new int[5];

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public int field72 = 500;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "[I")
    private int[] field75 = new int[5];

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "[I")
    private static int[] field63 = new int[32768];

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "[I")
    private static int[] field65;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "[I")
    private static int[] field61;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "[I")
    private static int[] field70;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "[I")
    private static int[] field71;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "[I")
    private static int[] field74;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "[I")
    private static int[] field73;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "[I")
    private static int[] field69;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Leb;")
    private class26 field54;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lfb;")
    private class32 field51;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lfb;")
    private class32 field52;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Lfb;")
    private class32 field55;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "Lfb;")
    private class32 field56;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Lfb;")
    private class32 field57;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Lfb;")
    private class32 field58;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Lfb;")
    private class32 field62;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Lfb;")
    private class32 field64;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Lfb;")
    private class32 field66;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field63[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field65 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field65[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field61 = new int[220500];
        field70 = new int[5];
        field71 = new int[5];
        field74 = new int[5];
        field73 = new int[5];
        field69 = new int[5];
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lrc;)V", line = 11)
    public final void method10(class104 arg0) {
        this.field56 = new class32();
        this.field56.method211(arg0);
        this.field55 = new class32();
        this.field55.method211(arg0);
        int var2 = arg0.method798((byte) -128);
        if (var2 != 0) {
            arg0.field2563--;
            this.field57 = new class32();
            this.field57.method211(arg0);
            this.field62 = new class32();
            this.field62.method211(arg0);
        }
        int var3 = arg0.method798((byte) -127);
        if (var3 != 0) {
            arg0.field2563--;
            this.field64 = new class32();
            this.field64.method211(arg0);
            this.field51 = new class32();
            this.field51.method211(arg0);
        }
        int var4 = arg0.method798((byte) -46);
        if (var4 != 0) {
            arg0.field2563--;
            this.field58 = new class32();
            this.field58.method211(arg0);
            this.field66 = new class32();
            this.field66.method211(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method803((byte) -94);
            if (var6 == 0) {
                break;
            }
            this.field67[var5] = var6;
            this.field75[var5] = arg0.method788(-49152);
            this.field68[var5] = arg0.method803((byte) -115);
        }
        this.field60 = arg0.method803((byte) -68);
        this.field59 = arg0.method803((byte) 119);
        this.field72 = arg0.method797(-7916);
        this.field53 = arg0.method797(-7916);
        this.field54 = new class26();
        this.field52 = new class32();
        this.field54.method153(arg0, this.field52);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)I", line = 71)
    private final int method11(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field65[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field63[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[I", line = 98)
    public final int[] method12(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field61[var3] = 0;
        }
        if (arg1 < 10) {
            return field61;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field56.method209();
        this.field55.method209();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field57 != null) {
            this.field57.method209();
            this.field62.method209();
            var6 = (int) ((double) (this.field57.field844 - this.field57.field841) * 32.768D / var4);
            var7 = (int) ((double) this.field57.field841 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field64 != null) {
            this.field64.method209();
            this.field51.method209();
            var9 = (int) ((double) (this.field64.field844 - this.field64.field841) * 32.768D / var4);
            var10 = (int) ((double) this.field64.field841 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field67[var12] != 0) {
                field71[var12] = 0;
                field74[var12] = (int) ((double) this.field68[var12] * var4);
                field69[var12] = (this.field67[var12] << 14) / 100;
                field73[var12] = (int) ((double) (this.field56.field844 - this.field56.field841) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field75[var12]) / var4);
                field70[var12] = (int) ((double) this.field56.field841 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field56.method210(arg0);
            int var41 = this.field55.method210(arg0);
            if (this.field57 != null) {
                int var42 = this.field57.method210(arg0);
                int var43 = this.field62.method210(arg0);
                var40 += this.method11(var8, var43, this.field57.field840) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field64 != null) {
                int var44 = this.field64.method210(arg0);
                int var45 = this.field51.method210(arg0);
                var41 = var41 * ((this.method11(var11, var45, this.field64.field840) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field67[var46] != 0) {
                    int var47 = field74[var46] + var13;
                    if (var47 < arg0) {
                        field61[var47] += this.method11(field71[var46], field69[var46] * var41 >> 15, this.field56.field840);
                        field71[var46] += (field73[var46] * var40 >> 16) + field70[var46];
                    }
                }
            }
        }
        if (this.field58 != null) {
            this.field58.method209();
            this.field66.method209();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field58.method210(arg0);
                int var19 = this.field66.method210(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field58.field844 - this.field58.field841) * var18 >> 8) + this.field58.field841;
                } else {
                    var20 = ((this.field58.field844 - this.field58.field841) * var19 >> 8) + this.field58.field841;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field61[var17] = 0;
                }
            }
        }
        if (this.field60 > 0 && this.field59 > 0) {
            int var21 = (int) ((double) this.field60 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field61[var22] += field61[var22 - var21] * this.field59 / 100;
            }
        }
        if (this.field54.field598[0] > 0 || this.field54.field598[1] > 0) {
            this.field52.method209();
            int var23 = this.field52.method210(arg0 + 1);
            int var24 = this.field54.method154(0, (float) var23 / 65536.0F);
            int var25 = this.field54.method154(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field61[var24 + var26] * (long) class26.field592 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field61[var24 + var26 - var37 - 1] * (long) class26.field594[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field61[var26 - var38 - 1] * (long) class26.field594[1][var38] >> 16);
                    }
                    field61[var26] = var36;
                    var23 = this.field52.method210(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field61[var24 + var26] * (long) class26.field592 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field61[var24 + var26 - var34 - 1] * (long) class26.field594[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field61[var26 - var35 - 1] * (long) class26.field594[1][var35] >> 16);
                        }
                        field61[var26] = var33;
                        var23 = this.field52.method210(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field61[var24 + var26 - var30 - 1] * (long) class26.field594[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field61[var26 - var31 - 1] * (long) class26.field594[1][var31] >> 16);
                            }
                            field61[var26] = var29;
                            this.field52.method210(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field54.method154(0, (float) var23 / 65536.0F);
                    var25 = this.field54.method154(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field61[var39] < -32768) {
                field61[var39] = -32768;
            }
            if (field61[var39] > 32767) {
                field61[var39] = 32767;
            }
        }
        return field61;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()V", line = 453)
    public static void method13() {
        field61 = null;
        field63 = null;
        field65 = null;
        field71 = null;
        field74 = null;
        field69 = null;
        field73 = null;
        field70 = null;
    }
}
