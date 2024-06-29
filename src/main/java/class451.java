import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class451 extends class260 {

    @OriginalMember(owner = "client!or", name = "o", descriptor = "Ljd;")
    private class153 field6629;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "Leg;")
    private class70 field6633;

    @OriginalMember(owner = "client!or", name = "v", descriptor = "Lef;")
    private class338 field6636;

    @OriginalMember(owner = "client!or", name = "z", descriptor = "I")
    private int field6640;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    private int field6625;

    @OriginalMember(owner = "client!or", name = "H", descriptor = "I")
    private int field6648;

    @OriginalMember(owner = "client!or", name = "x", descriptor = "I")
    private int field6638;

    @OriginalMember(owner = "client!or", name = "y", descriptor = "[[F")
    private float[][] field6639;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "[[F")
    private float[][] field6630;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "[[F")
    private float[][] field6626;

    @OriginalMember(owner = "client!or", name = "A", descriptor = "Lsi;")
    private class391 field6641;

    @OriginalMember(owner = "client!or", name = "C", descriptor = "Lki;")
    private class498 field6643;

    @OriginalMember(owner = "client!or", name = "B", descriptor = "Lmn;")
    private class247 field6642;

    @OriginalMember(owner = "client!or", name = "F", descriptor = "Lrt;")
    private class151 field6646;

    @OriginalMember(owner = "client!or", name = "G", descriptor = "Lap;")
    private class334 field6647;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "Lwc;")
    private class48 field6635;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "Lwc;")
    private class48 field6628;

    @OriginalMember(owner = "client!or", name = "K", descriptor = "Ldi;")
    public static class83 field6650 = new class83(4, 4);

    @OriginalMember(owner = "client!or", name = "M", descriptor = "Lgp;")
    public static class36 field6652 = new class36(8);

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "I")
    private int field6634;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "I")
    private int field6637;

    @OriginalMember(owner = "client!or", name = "D", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!or", name = "E", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!or", name = "I", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!or", name = "L", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!or", name = "N", descriptor = "Lla;")
    public static class315 field6653;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V", line = 3)
    public static void method2660(byte arg0) {
        int var1 = 81 % ((32 - arg0) / 53);
        field6653 = null;
        field6652 = null;
        field6650 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lya;I)V", line = 19)
    public static final void method2661(class38 arg0, int arg1) {
        field6644++;
        if (arg1 != 21497) {
            return;
        }
        if (class476.field6942) {
            class365.method2198((byte) 70, arg0);
        } else {
            class18.method112(arg0, 118);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIIIII)V", line = 36)
    private final void method2662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6649++;
        long var8 = -1L;
        int var10 = (arg5 << this.field6633.field2035) + arg6;
        int var11 = (arg4 << this.field6633.field2035) + arg1;
        int var12 = this.field6633.method361(var10, var11);
        if ((arg6 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = (long) var11 << 16 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
            class260 var13 = this.field6642.method1492(var8, 6340);
            if (var13 != null) {
                this.method2664((byte) -107, ((class44) var13).field537);
                return;
            }
        }
        short var14 = (short) (this.field6634++);
        if (var8 != -1L) {
            this.field6642.method1487(arg3 - 102, var8, new class44(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg1 == 0) {
            var15 = this.field6630[arg0][arg2];
            var16 = this.field6639[arg0][arg2];
            var17 = this.field6626[arg0][arg2];
        } else if (this.field6633.field2030 == arg6 && arg1 == 0) {
            var15 = this.field6630[arg0 + 1][arg2];
            var17 = this.field6626[arg0 + 1][arg2];
            var16 = this.field6639[arg0 + 1][arg2];
        } else if (this.field6633.field2030 == arg6 && this.field6633.field2030 == arg1) {
            var17 = this.field6626[arg0 + 1][arg2 + 1];
            var15 = this.field6630[arg0 + 1][arg2 + 1];
            var16 = this.field6639[arg0 + 1][arg2 + 1];
        } else if (arg6 == 0 && this.field6633.field2030 == arg1) {
            var17 = this.field6626[arg0][arg2 + 1];
            var15 = this.field6630[arg0][arg2 + 1];
            var16 = this.field6639[arg0][arg2 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field6633.field2030;
            float var19 = (float) arg1 / (float) this.field6633.field2030;
            float var20 = this.field6626[arg0][arg2];
            float var21 = this.field6630[arg0][arg2];
            float var22 = this.field6639[arg0][arg2];
            float var23 = this.field6626[arg0 + 1][arg2];
            float var24 = this.field6630[arg0 + 1][arg2];
            float var25 = (this.field6626[arg0][arg2 + 1] - var20) * var18 + var20;
            float var26 = (this.field6630[arg0][arg2 + 1] - var21) * var18 + var21;
            float var27 = this.field6639[arg0 + 1][arg2];
            float var28 = (this.field6630[arg0 + 1][arg2 + 1] - var24) * var18 + var24;
            float var29 = (this.field6639[arg0][arg2 + 1] - var22) * var18 + var22;
            float var30 = (this.field6626[arg0 + 1][arg2 + 1] - var23) * var18 + var23;
            var15 = (var28 - var26) * var19 + var26;
            float var31 = (this.field6639[arg0 + 1][arg2 + 1] - var27) * var18 + var27;
            var17 = (var30 - var25) * var19 + var25;
            var16 = (var31 - var29) * var19 + var29;
        }
        float var32 = (float) (this.field6629.method1026(true) - var10);
        float var33 = (float) (this.field6629.method1025((byte) -82) - var12);
        float var34 = (float) (this.field6629.method1027(arg3 ^ 0xFFFFFDA7) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field6629.method1029((byte) -126);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < (float) arg3) {
            var41 = 0.0F;
        }
        float var42 = var16 * var37 + var15 * var39 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field6629.method1021(14919);
        int var45 = (int) ((float) ((var44 & 0xFF832D) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF43) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field6636.field4772) {
            this.field6643.method2906((byte) 80, (float) var10);
            this.field6643.method2906((byte) 80, (float) var12);
            this.field6643.method2906((byte) 80, (float) var11);
        } else {
            this.field6643.method2909(1107866360, (float) var10);
            this.field6643.method2909(1107866360, (float) var12);
            this.field6643.method2909(1107866360, (float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field6643.method2302(arg3 - 4, var45);
        this.field6643.method2302(arg3 - 4, var46);
        this.field6643.method2302(-4, var47);
        this.field6643.method2302(-4, 255);
        this.method2664((byte) 71, var14);
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(B)V", line = 215)
    public static final void method2663(byte arg0) {
        class481.field7027.field5719 = 0;
        field6631++;
        class469.field6850 = null;
        class448.field6607 = null;
        class422.field6187 = 0;
        class521.field7731 = null;
        class179.field2631.field5719 = 0;
        class82.field1239 = 0;
        class122.field1831 = 0;
        class455.field6681 = null;
        class44.method411((byte) 53);
        class28.method156((byte) -114);
        for (int var1 = 0; var1 < 2048; var1++) {
            class12.field182[var1] = null;
        }
        class316.field4324 = null;
        if (arg0 <= 4) {
            method2661(null, 13);
        }
        for (int var2 = 0; var2 < class378.field5533.length; var2++) {
            class502 var4 = class378.field5533[var2];
            if (var4 != null) {
                var4.field1069 = -1;
            }
        }
        class102.method757((byte) -37);
        class491.field7168 = 1;
        class448.method2651(30, (byte) 112);
        for (int var3 = 0; var3 < 100; var3++) {
            class463.field6801[var3] = true;
        }
        class421.method2507(false);
        class203.field2852 = 0L;
        class349.field5098 = null;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lef;Leg;Ljd;[I)V", line = 273)
    public class451(class338 arg0, class70 arg1, class153 arg2, int[] arg3) {
        this.field6629 = arg2;
        this.field6633 = arg1;
        this.field6636 = arg0;
        int var5 = this.field6629.method1029((byte) -121) - (arg1.field2030 >> 1);
        this.field6640 = this.field6629.method1026(true) - var5 >> arg1.field2035;
        this.field6625 = var5 + this.field6629.method1026(true) >> arg1.field2035;
        this.field6648 = this.field6629.method1027(-601) - var5 >> arg1.field2035;
        this.field6638 = this.field6629.method1027(-601) + var5 >> arg1.field2035;
        int var6 = this.field6625 + 1 - this.field6640;
        int var7 = this.field6638 + 1 - this.field6648;
        this.field6639 = new float[var6 + 1][var7 + 1];
        this.field6630 = new float[var6 + 1][var7 + 1];
        this.field6626 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field6648 + var8;
            if (var24 > 0 && var24 < (this.field6633.field2031 - 1)) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field6640 + var25;
                    if (var26 > 0 && (this.field6633.field2037 - 1) > var26) {
                        int var27 = arg1.method351(var26 + 1, var24) - arg1.method351(var26 - 1, var24);
                        int var28 = arg1.method351(var26, var24 + 1) - arg1.method351(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + var27 * var27 + 65536)));
                        this.field6626[var25][var8] = (float) var27 * var29;
                        this.field6630[var25][var8] = var29 * -256.0F;
                        this.field6639[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field6648; var11 <= this.field6638; var11++) {
            if (var11 >= 0 && var11 < arg1.field2031) {
                for (int var21 = this.field6640; var21 <= this.field6625; var21++) {
                    if (var21 >= 0 && var21 < arg1.field2037) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field968[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field6625 - this.field6640;
            }
        }
        if (var9 > 0) {
            this.field6641 = new class391(var9 * 2);
            this.field6643 = new class498(var9 * 16);
            this.field6642 = new class247(class508.method3034(var9, true));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field6648; var14 <= this.field6638; var14++) {
                if (var14 >= 0 && arg1.field2031 > var14) {
                    int var15 = 0;
                    for (int var16 = this.field6640; var16 <= this.field6625; var16++) {
                        if (var16 >= 0 && arg1.field2037 > var16) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field968[var16][var14];
                            int[] var19 = arg1.field949[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method2662(var15, var19[var20], var12, 0, var14, var16, var18[var20]);
                                    }
                                } else if (var17 == 3) {
                                    this.method2662(var15, 0, var12, 0, var14, var16, 0);
                                    this.method2662(var15, 0, var12, 0, var14, var16, arg1.field2030);
                                    this.method2662(var15, arg1.field2030, var12, 0, var14, var16, 0);
                                } else if (var17 == 2) {
                                    this.method2662(var15, 0, var12, 0, var14, var16, arg1.field2030);
                                    this.method2662(var15, arg1.field2030, var12, 0, var14, var16, arg1.field2030);
                                    this.method2662(var15, 0, var12, 0, var14, var16, 0);
                                } else if (var17 == 5) {
                                    this.method2662(var15, arg1.field2030, var12, 0, var14, var16, arg1.field2030);
                                    this.method2662(var15, arg1.field2030, var12, 0, var14, var16, 0);
                                    this.method2662(var15, 0, var12, 0, var14, var16, arg1.field2030);
                                } else if (var17 == 4) {
                                    this.method2662(var15, arg1.field2030, var12, 0, var14, var16, 0);
                                    this.method2662(var15, 0, var12, 0, var14, var16, 0);
                                    this.method2662(var15, arg1.field2030, var12, 0, var14, var16, arg1.field2030);
                                }
                            }
                        }
                        var13++;
                        var15++;
                    }
                } else {
                    var13 += this.field6625 - this.field6640;
                }
                var12++;
            }
            this.field6646 = this.field6636.method1941(this.field6641.field5719, false, 0, this.field6641.field5678, 5123);
            this.field6647 = this.field6636.method1943(this.field6643.field5719, 16, this.field6643.field5678, (byte) 49, false);
            this.field6635 = new class48(this.field6647, 5126, 3, 0);
            this.field6628 = new class48(this.field6647, 5121, 4, 12);
        } else {
            this.field6646 = null;
            this.field6647 = null;
            this.field6635 = null;
            this.field6628 = null;
        }
        this.field6642 = null;
        this.field6626 = this.field6630 = this.field6639 = null;
        this.field6641 = null;
        this.field6643 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BS)V", line = 490)
    private final void method2664(byte arg0, short arg1) {
        if (this.field6636.field4772) {
            this.field6641.method2355(1686288168, arg1);
        } else {
            this.field6641.method2310((byte) 123, arg1);
        }
        int var3 = 18 % ((arg0 + 30) / 58);
        field6632++;
        this.field6637++;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I[[ZIII)V", line = 505)
    public final void method2665(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4) {
        field6627++;
        if (this.field6646 == null || arg3 + arg4 < this.field6640 || this.field6625 < (arg3 - arg4) || (arg2 + arg4) < this.field6648 || this.field6638 < (arg2 - arg4)) {
            return;
        }
        int var6 = this.field6648;
        if (arg0 < 63) {
            this.method2664((byte) 92, (short) -37);
        }
        while (this.field6638 >= var6) {
            for (int var7 = this.field6640; var7 <= this.field6625; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg2;
                if ((-arg4) < var8 && var8 < arg4 && var9 > (-arg4) && var9 < arg4 && arg1[arg4 + var8][arg4 + var9]) {
                    this.field6636.method1992((int) (this.field6629.method1023((byte) -110) * 255.0F) << 24, (byte) 119);
                    this.field6636.method1968(this.field6635, this.field6628, 114, null, null);
                    this.field6636.method1981((byte) -93, this.field6637, 0, 4, this.field6646);
                    return;
                }
            }
            var6++;
        }
    }
}
