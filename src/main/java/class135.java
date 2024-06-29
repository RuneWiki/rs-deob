import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class135 {

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "[I")
    private int[] field3297 = new int[5];

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "[I")
    private int[] field3301 = new int[5];

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "[I")
    private int[] field3302 = new int[5];

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    private int field3305 = 0;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public int field3309 = 500;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public int field3317 = 0;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    private int field3318 = 100;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "[I")
    private static int[] field3298 = new int[32768];

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "[I")
    private static int[] field3296;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "[I")
    private static int[] field3303;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "[I")
    private static int[] field3307;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "[I")
    private static int[] field3313;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "[I")
    private static int[] field3314;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "[I")
    private static int[] field3315;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "[I")
    private static int[] field3316;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Ldb;")
    private class21 field3295;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lhd;")
    private class46 field3294;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Lhd;")
    private class46 field3299;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lhd;")
    private class46 field3300;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Lhd;")
    private class46 field3304;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Lhd;")
    private class46 field3306;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Lhd;")
    private class46 field3308;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "Lhd;")
    private class46 field3310;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Lhd;")
    private class46 field3311;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "Lhd;")
    private class46 field3312;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3298[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3296 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3296[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3303 = new int[220500];
        field3307 = new int[5];
        field3313 = new int[5];
        field3314 = new int[5];
        field3315 = new int[5];
        field3316 = new int[5];
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lb;)V", line = 8)
    public final void method1063(class7 arg0) {
        this.field3306 = new class46();
        this.field3306.method384(arg0);
        this.field3299 = new class46();
        this.field3299.method384(arg0);
        int var2 = arg0.method96(27023);
        if (var2 != 0) {
            arg0.field143--;
            this.field3304 = new class46();
            this.field3304.method384(arg0);
            this.field3294 = new class46();
            this.field3294.method384(arg0);
        }
        int var3 = arg0.method96(27023);
        if (var3 != 0) {
            arg0.field143--;
            this.field3308 = new class46();
            this.field3308.method384(arg0);
            this.field3311 = new class46();
            this.field3311.method384(arg0);
        }
        int var4 = arg0.method96(27023);
        if (var4 != 0) {
            arg0.field143--;
            this.field3300 = new class46();
            this.field3300.method384(arg0);
            this.field3312 = new class46();
            this.field3312.method384(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method66(-690477040);
            if (var6 == 0) {
                break;
            }
            this.field3302[var5] = var6;
            this.field3301[var5] = arg0.method93(-102);
            this.field3297[var5] = arg0.method66(-690477040);
        }
        this.field3305 = arg0.method66(-690477040);
        this.field3318 = arg0.method66(-690477040);
        this.field3309 = arg0.method101(2);
        this.field3317 = arg0.method101(2);
        this.field3295 = new class21();
        this.field3310 = new class46();
        this.field3295.method230(arg0, this.field3310);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)I", line = 79)
    private final int method1064(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3296[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3298[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()V", line = 126)
    public static void method1065() {
        field3303 = null;
        field3298 = null;
        field3296 = null;
        field3315 = null;
        field3307 = null;
        field3313 = null;
        field3314 = null;
        field3316 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[I", line = 151)
    public final int[] method1066(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field3303[var3] = 0;
        }
        if (arg1 < 10) {
            return field3303;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3306.method385();
        this.field3299.method385();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field3304 != null) {
            this.field3304.method385();
            this.field3294.method385();
            var6 = (int) ((double) (this.field3304.field1030 - this.field3304.field1029) * 32.768D / var4);
            var7 = (int) ((double) this.field3304.field1029 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field3308 != null) {
            this.field3308.method385();
            this.field3311.method385();
            var9 = (int) ((double) (this.field3308.field1030 - this.field3308.field1029) * 32.768D / var4);
            var10 = (int) ((double) this.field3308.field1029 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field3302[var12] != 0) {
                field3315[var12] = 0;
                field3307[var12] = (int) ((double) this.field3297[var12] * var4);
                field3313[var12] = (this.field3302[var12] << 14) / 100;
                field3314[var12] = (int) ((double) (this.field3306.field1030 - this.field3306.field1029) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3301[var12]) / var4);
                field3316[var12] = (int) ((double) this.field3306.field1029 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field3306.method386(arg0);
            int var41 = this.field3299.method386(arg0);
            if (this.field3304 != null) {
                int var42 = this.field3304.method386(arg0);
                int var43 = this.field3294.method386(arg0);
                var40 += this.method1064(var8, var43, this.field3304.field1034) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field3308 != null) {
                int var44 = this.field3308.method386(arg0);
                int var45 = this.field3311.method386(arg0);
                var41 = var41 * ((this.method1064(var11, var45, this.field3308.field1034) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field3302[var46] != 0) {
                    int var47 = field3307[var46] + var13;
                    if (var47 < arg0) {
                        field3303[var47] += this.method1064(field3315[var46], field3313[var46] * var41 >> 15, this.field3306.field1034);
                        field3315[var46] += (field3314[var46] * var40 >> 16) + field3316[var46];
                    }
                }
            }
        }
        if (this.field3300 != null) {
            this.field3300.method385();
            this.field3312.method385();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field3300.method386(arg0);
                int var19 = this.field3312.method386(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field3300.field1030 - this.field3300.field1029) * var18 >> 8) + this.field3300.field1029;
                } else {
                    var20 = ((this.field3300.field1030 - this.field3300.field1029) * var19 >> 8) + this.field3300.field1029;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field3303[var17] = 0;
                }
            }
        }
        if (this.field3305 > 0 && this.field3318 > 0) {
            int var21 = (int) ((double) this.field3305 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field3303[var22] += field3303[var22 - var21] * this.field3318 / 100;
            }
        }
        if (this.field3295.field513[0] > 0 || this.field3295.field513[1] > 0) {
            this.field3310.method385();
            int var23 = this.field3310.method386(arg0 + 1);
            int var24 = this.field3295.method227(0, (float) var23 / 65536.0F);
            int var25 = this.field3295.method227(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field3303[var24 + var26] * (long) class21.field507 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field3303[var24 + var26 - var37 - 1] * (long) class21.field508[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field3303[var26 - var38 - 1] * (long) class21.field508[1][var38] >> 16);
                    }
                    field3303[var26] = var36;
                    var23 = this.field3310.method386(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field3303[var24 + var26] * (long) class21.field507 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field3303[var24 + var26 - var34 - 1] * (long) class21.field508[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field3303[var26 - var35 - 1] * (long) class21.field508[1][var35] >> 16);
                        }
                        field3303[var26] = var33;
                        var23 = this.field3310.method386(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field3303[var24 + var26 - var30 - 1] * (long) class21.field508[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field3303[var26 - var31 - 1] * (long) class21.field508[1][var31] >> 16);
                            }
                            field3303[var26] = var29;
                            this.field3310.method386(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field3295.method227(0, (float) var23 / 65536.0F);
                    var25 = this.field3295.method227(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field3303[var39] < -32768) {
                field3303[var39] = -32768;
            }
            if (field3303[var39] > 32767) {
                field3303[var39] = 32767;
            }
        }
        return field3303;
    }
}
