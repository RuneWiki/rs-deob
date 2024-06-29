import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class327 {

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public int field4703 = 500;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "[I")
    private int[] field4715 = new int[5];

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "[I")
    private int[] field4704 = new int[5];

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    private int field4714 = 0;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "[I")
    private int[] field4717 = new int[5];

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public int field4708 = 0;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    private int field4718 = 100;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "[I")
    private static int[] field4712 = new int[32768];

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "[I")
    private static int[] field4711;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "[I")
    private static int[] field4710;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "[I")
    private static int[] field4723;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "[I")
    private static int[] field4721;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "[I")
    private static int[] field4722;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "[I")
    private static int[] field4724;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "[I")
    private static int[] field4725;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "Lvn;")
    private class424 field4706;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "Lki;")
    private class94 field4701;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Lki;")
    private class94 field4702;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "Lki;")
    private class94 field4705;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "Lki;")
    private class94 field4707;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Lki;")
    private class94 field4709;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "Lki;")
    private class94 field4713;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "Lki;")
    private class94 field4716;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "Lki;")
    private class94 field4719;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "Lki;")
    private class94 field4720;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lec;)V")
    public final void method2156(class37 arg0) {
        this.field4716 = new class94();
        this.field4716.method788(arg0);
        this.field4709 = new class94();
        this.field4709.method788(arg0);
        int var2 = arg0.method271((byte) 123);
        if (var2 != 0) {
            arg0.field565--;
            this.field4719 = new class94();
            this.field4719.method788(arg0);
            this.field4705 = new class94();
            this.field4705.method788(arg0);
        }
        int var3 = arg0.method271((byte) 116);
        if (var3 != 0) {
            arg0.field565--;
            this.field4701 = new class94();
            this.field4701.method788(arg0);
            this.field4707 = new class94();
            this.field4707.method788(arg0);
        }
        int var4 = arg0.method271((byte) 125);
        if (var4 != 0) {
            arg0.field565--;
            this.field4713 = new class94();
            this.field4713.method788(arg0);
            this.field4702 = new class94();
            this.field4702.method788(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method316((byte) 118);
            if (var6 == 0) {
                break;
            }
            this.field4704[var5] = var6;
            this.field4715[var5] = arg0.method263(false);
            this.field4717[var5] = arg0.method316((byte) 121);
        }
        this.field4714 = arg0.method316((byte) 116);
        this.field4718 = arg0.method316((byte) 127);
        this.field4703 = arg0.method320((byte) -87);
        this.field4708 = arg0.method320((byte) -87);
        this.field4706 = new class424();
        this.field4720 = new class94();
        this.field4706.method2663(arg0, this.field4720);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)I")
    private final int method2157(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field4711[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field4712[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)[I")
    public final int[] method2158(int arg0, int arg1) {
        class82.method639(field4710, 0, arg0);
        if (arg1 < 10) {
            return field4710;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field4716.method791();
        this.field4709.method791();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field4719 != null) {
            this.field4719.method791();
            this.field4705.method791();
            var5 = (int) ((double) (this.field4719.field1479 - this.field4719.field1482) * 32.768D / var3);
            var6 = (int) ((double) this.field4719.field1482 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field4701 != null) {
            this.field4701.method791();
            this.field4707.method791();
            var8 = (int) ((double) (this.field4701.field1479 - this.field4701.field1482) * 32.768D / var3);
            var9 = (int) ((double) this.field4701.field1482 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field4704[var11] != 0) {
                field4721[var11] = 0;
                field4723[var11] = (int) ((double) this.field4717[var11] * var3);
                field4724[var11] = (this.field4704[var11] << 14) / 100;
                field4722[var11] = (int) ((double) (this.field4716.field1479 - this.field4716.field1482) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field4715[var11]) / var3);
                field4725[var11] = (int) ((double) this.field4716.field1482 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field4716.method790(arg0);
            int var40 = this.field4709.method790(arg0);
            if (this.field4719 != null) {
                int var41 = this.field4719.method790(arg0);
                int var42 = this.field4705.method790(arg0);
                var39 += this.method2157(var7, var42, this.field4719.field1477) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field4701 != null) {
                int var43 = this.field4701.method790(arg0);
                int var44 = this.field4707.method790(arg0);
                var40 = var40 * ((this.method2157(var10, var44, this.field4701.field1477) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field4704[var45] != 0) {
                    int var46 = field4723[var45] + var12;
                    if (var46 < arg0) {
                        field4710[var46] += this.method2157(field4721[var45], field4724[var45] * var40 >> 15, this.field4716.field1477);
                        field4721[var45] += (field4722[var45] * var39 >> 16) + field4725[var45];
                    }
                }
            }
        }
        if (this.field4713 != null) {
            this.field4713.method791();
            this.field4702.method791();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field4713.method790(arg0);
                int var18 = this.field4702.method790(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field4713.field1479 - this.field4713.field1482) * var17 >> 8) + this.field4713.field1482;
                } else {
                    var19 = ((this.field4713.field1479 - this.field4713.field1482) * var18 >> 8) + this.field4713.field1482;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field4710[var16] = 0;
                }
            }
        }
        if (this.field4714 > 0 && this.field4718 > 0) {
            int var20 = (int) ((double) this.field4714 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field4710[var21] += field4710[var21 - var20] * this.field4718 / 100;
            }
        }
        if (this.field4706.field6178[0] > 0 || this.field4706.field6178[1] > 0) {
            this.field4720.method791();
            int var22 = this.field4720.method790(arg0 + 1);
            int var23 = this.field4706.method2661(0, (float) var22 / 65536.0F);
            int var24 = this.field4706.method2661(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field4710[var23 + var25] * (long) class424.field6175 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field4710[var23 + var25 - var36 - 1] * (long) class424.field6176[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field4710[var25 - var37 - 1] * (long) class424.field6176[1][var37] >> 16);
                    }
                    field4710[var25] = var35;
                    var22 = this.field4720.method790(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field4710[var23 + var25] * (long) class424.field6175 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field4710[var23 + var25 - var33 - 1] * (long) class424.field6176[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field4710[var25 - var34 - 1] * (long) class424.field6176[1][var34] >> 16);
                        }
                        field4710[var25] = var32;
                        var22 = this.field4720.method790(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field4710[var23 + var25 - var29 - 1] * (long) class424.field6176[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field4710[var25 - var30 - 1] * (long) class424.field6176[1][var30] >> 16);
                            }
                            field4710[var25] = var28;
                            this.field4720.method790(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field4706.method2661(0, (float) var22 / 65536.0F);
                    var24 = this.field4706.method2661(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field4710[var38] < -32768) {
                field4710[var38] = -32768;
            }
            if (field4710[var38] > 32767) {
                field4710[var38] = 32767;
            }
        }
        return field4710;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()V")
    public static void method2159() {
        field4710 = null;
        field4712 = null;
        field4711 = null;
        field4721 = null;
        field4723 = null;
        field4724 = null;
        field4722 = null;
        field4725 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field4712[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field4711 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field4711[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field4710 = new int[220500];
        field4723 = new int[5];
        field4721 = new int[5];
        field4722 = new int[5];
        field4724 = new int[5];
        field4725 = new int[5];
    }
}
