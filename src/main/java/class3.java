import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    private int field86 = 0;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public int field84 = 0;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    private int field82 = 100;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "[I")
    private int[] field83 = new int[5];

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "[I")
    private int[] field80 = new int[5];

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "[I")
    private int[] field81 = new int[5];

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public int field78 = 500;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "[I")
    private static int[] field70 = new int[32768];

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "[I")
    private static int[] field85;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "[I")
    private static int[] field73;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "[I")
    private static int[] field87;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "[I")
    private static int[] field91;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "[I")
    private static int[] field88;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "[I")
    private static int[] field89;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "[I")
    private static int[] field92;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Lsd;")
    private class123 field69;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lsd;")
    private class123 field71;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Lsd;")
    private class123 field74;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Lsd;")
    private class123 field75;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Lsd;")
    private class123 field76;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Lsd;")
    private class123 field77;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Lsd;")
    private class123 field79;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Lsd;")
    private class123 field90;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "Lsd;")
    private class123 field93;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Loc;")
    private class98 field72;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lbf;)V")
    public final void method27(class14 arg0) {
        this.field71 = new class123();
        this.field71.method997(arg0);
        this.field93 = new class123();
        this.field93.method997(arg0);
        int var2 = arg0.method153(true);
        if (var2 != 0) {
            arg0.field314--;
            this.field74 = new class123();
            this.field74.method997(arg0);
            this.field76 = new class123();
            this.field76.method997(arg0);
        }
        int var3 = arg0.method153(true);
        if (var3 != 0) {
            arg0.field314--;
            this.field75 = new class123();
            this.field75.method997(arg0);
            this.field79 = new class123();
            this.field79.method997(arg0);
        }
        int var4 = arg0.method153(true);
        if (var4 != 0) {
            arg0.field314--;
            this.field77 = new class123();
            this.field77.method997(arg0);
            this.field90 = new class123();
            this.field90.method997(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method169(93);
            if (var6 == 0) {
                break;
            }
            this.field81[var5] = var6;
            this.field83[var5] = arg0.method117((byte) -102);
            this.field80[var5] = arg0.method169(111);
        }
        this.field86 = arg0.method169(102);
        this.field82 = arg0.method169(104);
        this.field78 = arg0.method138((byte) 120);
        this.field84 = arg0.method138((byte) 85);
        this.field72 = new class98();
        this.field69 = new class123();
        this.field72.method837(arg0, this.field69);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[I")
    public final int[] method28(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field73[var3] = 0;
        }
        if (arg1 < 10) {
            return field73;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field71.method996();
        this.field93.method996();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field74 != null) {
            this.field74.method996();
            this.field76.method996();
            var6 = (int) ((double) (this.field74.field2979 - this.field74.field2984) * 32.768D / var4);
            var7 = (int) ((double) this.field74.field2984 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field75 != null) {
            this.field75.method996();
            this.field79.method996();
            var9 = (int) ((double) (this.field75.field2979 - this.field75.field2984) * 32.768D / var4);
            var10 = (int) ((double) this.field75.field2984 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field81[var12] != 0) {
                field91[var12] = 0;
                field92[var12] = (int) ((double) this.field80[var12] * var4);
                field88[var12] = (this.field81[var12] << 14) / 100;
                field89[var12] = (int) ((double) (this.field71.field2979 - this.field71.field2984) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field83[var12]) / var4);
                field87[var12] = (int) ((double) this.field71.field2984 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field71.method998(arg0);
            int var41 = this.field93.method998(arg0);
            if (this.field74 != null) {
                int var42 = this.field74.method998(arg0);
                int var43 = this.field76.method998(arg0);
                var40 += this.method30(var8, var43, this.field74.field2982) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field75 != null) {
                int var44 = this.field75.method998(arg0);
                int var45 = this.field79.method998(arg0);
                var41 = var41 * ((this.method30(var11, var45, this.field75.field2982) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field81[var46] != 0) {
                    int var47 = field92[var46] + var13;
                    if (var47 < arg0) {
                        field73[var47] += this.method30(field91[var46], field88[var46] * var41 >> 15, this.field71.field2982);
                        field91[var46] += (field89[var46] * var40 >> 16) + field87[var46];
                    }
                }
            }
        }
        if (this.field77 != null) {
            this.field77.method996();
            this.field90.method996();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field77.method998(arg0);
                int var19 = this.field90.method998(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field77.field2979 - this.field77.field2984) * var18 >> 8) + this.field77.field2984;
                } else {
                    var20 = ((this.field77.field2979 - this.field77.field2984) * var19 >> 8) + this.field77.field2984;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field73[var17] = 0;
                }
            }
        }
        if (this.field86 > 0 && this.field82 > 0) {
            int var21 = (int) ((double) this.field86 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field73[var22] += field73[var22 - var21] * this.field82 / 100;
            }
        }
        if (this.field72.field2449[0] > 0 || this.field72.field2449[1] > 0) {
            this.field69.method996();
            int var23 = this.field69.method998(arg0 + 1);
            int var24 = this.field72.method834(0, (float) var23 / 65536.0F);
            int var25 = this.field72.method834(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field73[var24 + var26] * (long) class98.field2446 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field73[var24 + var26 - var37 - 1] * (long) class98.field2451[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field73[var26 - var38 - 1] * (long) class98.field2451[1][var38] >> 16);
                    }
                    field73[var26] = var36;
                    var23 = this.field69.method998(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field73[var24 + var26] * (long) class98.field2446 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field73[var24 + var26 - var34 - 1] * (long) class98.field2451[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field73[var26 - var35 - 1] * (long) class98.field2451[1][var35] >> 16);
                        }
                        field73[var26] = var33;
                        var23 = this.field69.method998(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field73[var24 + var26 - var30 - 1] * (long) class98.field2451[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field73[var26 - var31 - 1] * (long) class98.field2451[1][var31] >> 16);
                            }
                            field73[var26] = var29;
                            this.field69.method998(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field72.method834(0, (float) var23 / 65536.0F);
                    var25 = this.field72.method834(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field73[var39] < -32768) {
                field73[var39] = -32768;
            }
            if (field73[var39] > 32767) {
                field73[var39] = 32767;
            }
        }
        return field73;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()V")
    public static void method29() {
        field73 = null;
        field70 = null;
        field85 = null;
        field91 = null;
        field92 = null;
        field88 = null;
        field89 = null;
        field87 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)I")
    private final int method30(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field85[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field70[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field70[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field85 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field85[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field73 = new int[220500];
        field87 = new int[5];
        field91 = new int[5];
        field88 = new int[5];
        field89 = new int[5];
        field92 = new int[5];
    }
}
