import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 {

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public int field206 = 0;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "[I")
    private int[] field208 = new int[5];

    @OriginalMember(owner = "client!af", name = "m", descriptor = "[I")
    private int[] field217 = new int[5];

    @OriginalMember(owner = "client!af", name = "h", descriptor = "[I")
    private int[] field212 = new int[5];

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    private int field220 = 0;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public int field213 = 500;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    private int field228 = 100;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "[I")
    private static int[] field221 = new int[32768];

    @OriginalMember(owner = "client!af", name = "l", descriptor = "[I")
    private static int[] field216;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "[I")
    private static int[] field219;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "[I")
    private static int[] field225;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "[I")
    private static int[] field227;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "[I")
    private static int[] field223;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "[I")
    private static int[] field222;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "[I")
    private static int[] field229;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lmb;")
    private class85 field205;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Lmb;")
    private class85 field207;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lmb;")
    private class85 field209;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Lmb;")
    private class85 field210;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Lmb;")
    private class85 field211;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Lmb;")
    private class85 field214;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Lmb;")
    private class85 field218;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "Lmb;")
    private class85 field224;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "Lmb;")
    private class85 field226;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "Lnf;")
    private class96 field215;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)I")
    private final int method30(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field216[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field221[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        class128.method1078(field219, 0, arg0);
        if (arg1 < 10) {
            return field219;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field209.method717();
        this.field211.method717();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field226 != null) {
            this.field226.method717();
            this.field224.method717();
            var5 = (int) ((double) (this.field226.field2156 - this.field226.field2151) * 32.768D / var3);
            var6 = (int) ((double) this.field226.field2151 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field218 != null) {
            this.field218.method717();
            this.field207.method717();
            var8 = (int) ((double) (this.field218.field2156 - this.field218.field2151) * 32.768D / var3);
            var9 = (int) ((double) this.field218.field2151 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field212[var11] != 0) {
                field222[var11] = 0;
                field229[var11] = (int) ((double) this.field217[var11] * var3);
                field223[var11] = (this.field212[var11] << 14) / 100;
                field227[var11] = (int) ((double) (this.field209.field2156 - this.field209.field2151) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field208[var11]) / var3);
                field225[var11] = (int) ((double) this.field209.field2151 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field209.method714(arg0);
            int var40 = this.field211.method714(arg0);
            if (this.field226 != null) {
                int var41 = this.field226.method714(arg0);
                int var42 = this.field224.method714(arg0);
                var39 += this.method30(var7, var42, this.field226.field2152) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field218 != null) {
                int var43 = this.field218.method714(arg0);
                int var44 = this.field207.method714(arg0);
                var40 = var40 * ((this.method30(var10, var44, this.field218.field2152) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field212[var45] != 0) {
                    int var46 = field229[var45] + var12;
                    if (var46 < arg0) {
                        field219[var46] += this.method30(field222[var45], field223[var45] * var40 >> 15, this.field209.field2152);
                        field222[var45] += (field227[var45] * var39 >> 16) + field225[var45];
                    }
                }
            }
        }
        if (this.field210 != null) {
            this.field210.method717();
            this.field205.method717();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field210.method714(arg0);
                int var18 = this.field205.method714(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field210.field2156 - this.field210.field2151) * var17 >> 8) + this.field210.field2151;
                } else {
                    var19 = ((this.field210.field2156 - this.field210.field2151) * var18 >> 8) + this.field210.field2151;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field219[var16] = 0;
                }
            }
        }
        if (this.field220 > 0 && this.field228 > 0) {
            int var20 = (int) ((double) this.field220 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field219[var21] += field219[var21 - var20] * this.field228 / 100;
            }
        }
        if (this.field215.field2431[0] > 0 || this.field215.field2431[1] > 0) {
            this.field214.method717();
            int var22 = this.field214.method714(arg0 + 1);
            int var23 = this.field215.method798(0, (float) var22 / 65536.0F);
            int var24 = this.field215.method798(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field219[var23 + var25] * (long) class96.field2434 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field219[var23 + var25 - var36 - 1] * (long) class96.field2433[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field219[var25 - var37 - 1] * (long) class96.field2433[1][var37] >> 16);
                    }
                    field219[var25] = var35;
                    var22 = this.field214.method714(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field219[var23 + var25] * (long) class96.field2434 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field219[var23 + var25 - var33 - 1] * (long) class96.field2433[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field219[var25 - var34 - 1] * (long) class96.field2433[1][var34] >> 16);
                        }
                        field219[var25] = var32;
                        var22 = this.field214.method714(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field219[var23 + var25 - var29 - 1] * (long) class96.field2433[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field219[var25 - var30 - 1] * (long) class96.field2433[1][var30] >> 16);
                            }
                            field219[var25] = var28;
                            this.field214.method714(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field215.method798(0, (float) var22 / 65536.0F);
                    var24 = this.field215.method798(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field219[var38] < -32768) {
                field219[var38] = -32768;
            }
            if (field219[var38] > 32767) {
                field219[var38] = 32767;
            }
        }
        return field219;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lqc;)V")
    public final void method32(class114 arg0) {
        this.field209 = new class85();
        this.field209.method716(arg0);
        this.field211 = new class85();
        this.field211.method716(arg0);
        int var2 = arg0.method957((byte) 79);
        if (var2 != 0) {
            arg0.field2816--;
            this.field226 = new class85();
            this.field226.method716(arg0);
            this.field224 = new class85();
            this.field224.method716(arg0);
        }
        int var3 = arg0.method957((byte) 20);
        if (var3 != 0) {
            arg0.field2816--;
            this.field218 = new class85();
            this.field218.method716(arg0);
            this.field207 = new class85();
            this.field207.method716(arg0);
        }
        int var4 = arg0.method957((byte) 19);
        if (var4 != 0) {
            arg0.field2816--;
            this.field210 = new class85();
            this.field210.method716(arg0);
            this.field205 = new class85();
            this.field205.method716(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method963((byte) -116);
            if (var6 == 0) {
                break;
            }
            this.field212[var5] = var6;
            this.field208[var5] = arg0.method923((byte) -114);
            this.field217[var5] = arg0.method963((byte) -116);
        }
        this.field220 = arg0.method963((byte) -116);
        this.field228 = arg0.method963((byte) -116);
        this.field213 = arg0.method944((byte) 125);
        this.field206 = arg0.method944((byte) 109);
        this.field215 = new class96();
        this.field214 = new class85();
        this.field215.method799(arg0, this.field214);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()V")
    public static void method33() {
        field219 = null;
        field221 = null;
        field216 = null;
        field222 = null;
        field229 = null;
        field223 = null;
        field227 = null;
        field225 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field221[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field216 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field216[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field219 = new int[220500];
        field225 = new int[5];
        field227 = new int[5];
        field223 = new int[5];
        field222 = new int[5];
        field229 = new int[5];
    }
}
