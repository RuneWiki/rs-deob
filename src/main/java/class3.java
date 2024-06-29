import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public int field38 = 500;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public int field30 = 0;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    private int field36 = 0;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "[I")
    private int[] field34 = new int[5];

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "[I")
    private int[] field37 = new int[5];

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "[I")
    private int[] field44 = new int[5];

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    private int field48 = 100;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "[I")
    private static int[] field46 = new int[32768];

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "[I")
    private static int[] field42;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "[I")
    private static int[] field49;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "[I")
    private static int[] field51;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "[I")
    private static int[] field50;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "[I")
    private static int[] field52;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "[I")
    private static int[] field54;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "[I")
    private static int[] field53;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Lae;")
    private class6 field31;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lae;")
    private class6 field32;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Lae;")
    private class6 field33;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Lae;")
    private class6 field35;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lae;")
    private class6 field39;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Lae;")
    private class6 field41;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Lae;")
    private class6 field43;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "Lae;")
    private class6 field45;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Lae;")
    private class6 field47;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Lod;")
    private class88 field40;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field46[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field42 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field42[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field49 = new int[220500];
        field51 = new int[5];
        field50 = new int[5];
        field52 = new int[5];
        field54 = new int[5];
        field53 = new int[5];
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ltc;)V", line = 5)
    public final void method23(class113 arg0) {
        this.field45 = new class6();
        this.field45.method40(arg0);
        this.field39 = new class6();
        this.field39.method40(arg0);
        int var2 = arg0.method821(true);
        if (var2 != 0) {
            arg0.field2507--;
            this.field31 = new class6();
            this.field31.method40(arg0);
            this.field32 = new class6();
            this.field32.method40(arg0);
        }
        int var3 = arg0.method821(true);
        if (var3 != 0) {
            arg0.field2507--;
            this.field41 = new class6();
            this.field41.method40(arg0);
            this.field35 = new class6();
            this.field35.method40(arg0);
        }
        int var4 = arg0.method821(true);
        if (var4 != 0) {
            arg0.field2507--;
            this.field43 = new class6();
            this.field43.method40(arg0);
            this.field33 = new class6();
            this.field33.method40(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method846(false);
            if (var6 == 0) {
                break;
            }
            this.field34[var5] = var6;
            this.field37[var5] = arg0.method831(23138);
            this.field44[var5] = arg0.method846(false);
        }
        this.field36 = arg0.method846(false);
        this.field48 = arg0.method846(false);
        this.field38 = arg0.method870(-1);
        this.field30 = arg0.method870(-1);
        this.field40 = new class88();
        this.field47 = new class6();
        this.field40.method604(arg0, this.field47);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)I", line = 85)
    private final int method24(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field42[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field46[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[I", line = 117)
    public final int[] method25(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field49[var3] = 0;
        }
        if (arg1 < 10) {
            return field49;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field45.method38();
        this.field39.method38();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field31 != null) {
            this.field31.method38();
            this.field32.method38();
            var6 = (int) ((double) (this.field31.field97 - this.field31.field99) * 32.768D / var4);
            var7 = (int) ((double) this.field31.field99 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field41 != null) {
            this.field41.method38();
            this.field35.method38();
            var9 = (int) ((double) (this.field41.field97 - this.field41.field99) * 32.768D / var4);
            var10 = (int) ((double) this.field41.field99 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field34[var12] != 0) {
                field52[var12] = 0;
                field53[var12] = (int) ((double) this.field44[var12] * var4);
                field51[var12] = (this.field34[var12] << 14) / 100;
                field50[var12] = (int) ((double) (this.field45.field97 - this.field45.field99) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field37[var12]) / var4);
                field54[var12] = (int) ((double) this.field45.field99 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field45.method37(arg0);
            int var41 = this.field39.method37(arg0);
            if (this.field31 != null) {
                int var42 = this.field31.method37(arg0);
                int var43 = this.field32.method37(arg0);
                var40 += this.method24(var8, var43, this.field31.field96) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field41 != null) {
                int var44 = this.field41.method37(arg0);
                int var45 = this.field35.method37(arg0);
                var41 = var41 * ((this.method24(var11, var45, this.field41.field96) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field34[var46] != 0) {
                    int var47 = field53[var46] + var13;
                    if (var47 < arg0) {
                        field49[var47] += this.method24(field52[var46], field51[var46] * var41 >> 15, this.field45.field96);
                        field52[var46] += (field50[var46] * var40 >> 16) + field54[var46];
                    }
                }
            }
        }
        if (this.field43 != null) {
            this.field43.method38();
            this.field33.method38();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field43.method37(arg0);
                int var19 = this.field33.method37(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field43.field97 - this.field43.field99) * var18 >> 8) + this.field43.field99;
                } else {
                    var20 = ((this.field43.field97 - this.field43.field99) * var19 >> 8) + this.field43.field99;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field49[var17] = 0;
                }
            }
        }
        if (this.field36 > 0 && this.field48 > 0) {
            int var21 = (int) ((double) this.field36 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field49[var22] += field49[var22 - var21] * this.field48 / 100;
            }
        }
        if (this.field40.field2004[0] > 0 || this.field40.field2004[1] > 0) {
            this.field47.method38();
            int var23 = this.field47.method37(arg0 + 1);
            int var24 = this.field40.method607(0, (float) var23 / 65536.0F);
            int var25 = this.field40.method607(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field49[var24 + var26] * (long) class88.field2008 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field49[var24 + var26 - var37 - 1] * (long) class88.field2006[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field49[var26 - var38 - 1] * (long) class88.field2006[1][var38] >> 16);
                    }
                    field49[var26] = var36;
                    var23 = this.field47.method37(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field49[var24 + var26] * (long) class88.field2008 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field49[var24 + var26 - var34 - 1] * (long) class88.field2006[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field49[var26 - var35 - 1] * (long) class88.field2006[1][var35] >> 16);
                        }
                        field49[var26] = var33;
                        var23 = this.field47.method37(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field49[var24 + var26 - var30 - 1] * (long) class88.field2006[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field49[var26 - var31 - 1] * (long) class88.field2006[1][var31] >> 16);
                            }
                            field49[var26] = var29;
                            this.field47.method37(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field40.method607(0, (float) var23 / 65536.0F);
                    var25 = this.field40.method607(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field49[var39] < -32768) {
                field49[var39] = -32768;
            }
            if (field49[var39] > 32767) {
                field49[var39] = 32767;
            }
        }
        return field49;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()V", line = 406)
    public static void method26() {
        field49 = null;
        field46 = null;
        field42 = null;
        field52 = null;
        field53 = null;
        field51 = null;
        field50 = null;
        field54 = null;
    }
}
