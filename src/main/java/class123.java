import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class123 {

    @OriginalMember(owner = "client!va", name = "a", descriptor = "[I")
    private int[] field2993 = new int[5];

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public int field2998 = 0;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public int field3002 = 500;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    private int field3004 = 100;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "[I")
    private int[] field3008 = new int[5];

    @OriginalMember(owner = "client!va", name = "g", descriptor = "[I")
    private int[] field2999 = new int[5];

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    private int field3011 = 0;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "[I")
    private static int[] field2997 = new int[32768];

    @OriginalMember(owner = "client!va", name = "o", descriptor = "[I")
    private static int[] field3007;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "[I")
    private static int[] field3001;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "[I")
    private static int[] field3013;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "[I")
    private static int[] field3016;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "[I")
    private static int[] field3015;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "[I")
    private static int[] field3014;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "[I")
    private static int[] field3017;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Lqe;")
    private class101 field2995;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Loa;")
    private class85 field2994;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "Loa;")
    private class85 field2996;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Loa;")
    private class85 field3000;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "Loa;")
    private class85 field3003;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "Loa;")
    private class85 field3005;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Loa;")
    private class85 field3006;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "Loa;")
    private class85 field3009;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "Loa;")
    private class85 field3010;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "Loa;")
    private class85 field3012;

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2997[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3007 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3007[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3001 = new int[220500];
        field3013 = new int[5];
        field3016 = new int[5];
        field3015 = new int[5];
        field3014 = new int[5];
        field3017 = new int[5];
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)[I", line = 13)
    public final int[] method970(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field3001[var3] = 0;
        }
        if (arg1 < 10) {
            return field3001;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3000.method680();
        this.field3006.method680();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field3010 != null) {
            this.field3010.method680();
            this.field3009.method680();
            var6 = (int) ((double) (this.field3010.field2198 - this.field3010.field2195) * 32.768D / var4);
            var7 = (int) ((double) this.field3010.field2195 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field2994 != null) {
            this.field2994.method680();
            this.field3003.method680();
            var9 = (int) ((double) (this.field2994.field2198 - this.field2994.field2195) * 32.768D / var4);
            var10 = (int) ((double) this.field2994.field2195 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field2999[var12] != 0) {
                field3014[var12] = 0;
                field3013[var12] = (int) ((double) this.field3008[var12] * var4);
                field3016[var12] = (this.field2999[var12] << 14) / 100;
                field3015[var12] = (int) ((double) (this.field3000.field2198 - this.field3000.field2195) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2993[var12]) / var4);
                field3017[var12] = (int) ((double) this.field3000.field2195 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field3000.method681(arg0);
            int var41 = this.field3006.method681(arg0);
            if (this.field3010 != null) {
                int var42 = this.field3010.method681(arg0);
                int var43 = this.field3009.method681(arg0);
                var40 += this.method971(var8, var43, this.field3010.field2197) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field2994 != null) {
                int var44 = this.field2994.method681(arg0);
                int var45 = this.field3003.method681(arg0);
                var41 = var41 * ((this.method971(var11, var45, this.field2994.field2197) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field2999[var46] != 0) {
                    int var47 = field3013[var46] + var13;
                    if (var47 < arg0) {
                        field3001[var47] += this.method971(field3014[var46], field3016[var46] * var41 >> 15, this.field3000.field2197);
                        field3014[var46] += (field3015[var46] * var40 >> 16) + field3017[var46];
                    }
                }
            }
        }
        if (this.field2996 != null) {
            this.field2996.method680();
            this.field3005.method680();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field2996.method681(arg0);
                int var19 = this.field3005.method681(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field2996.field2198 - this.field2996.field2195) * var18 >> 8) + this.field2996.field2195;
                } else {
                    var20 = ((this.field2996.field2198 - this.field2996.field2195) * var19 >> 8) + this.field2996.field2195;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field3001[var17] = 0;
                }
            }
        }
        if (this.field3011 > 0 && this.field3004 > 0) {
            int var21 = (int) ((double) this.field3011 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field3001[var22] += field3001[var22 - var21] * this.field3004 / 100;
            }
        }
        if (this.field2995.field2523[0] > 0 || this.field2995.field2523[1] > 0) {
            this.field3012.method680();
            int var23 = this.field3012.method681(arg0 + 1);
            int var24 = this.field2995.method773(0, (float) var23 / 65536.0F);
            int var25 = this.field2995.method773(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field3001[var24 + var26] * (long) class101.field2519 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field3001[var24 + var26 - var37 - 1] * (long) class101.field2522[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field3001[var26 - var38 - 1] * (long) class101.field2522[1][var38] >> 16);
                    }
                    field3001[var26] = var36;
                    var23 = this.field3012.method681(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field3001[var24 + var26] * (long) class101.field2519 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field3001[var24 + var26 - var34 - 1] * (long) class101.field2522[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field3001[var26 - var35 - 1] * (long) class101.field2522[1][var35] >> 16);
                        }
                        field3001[var26] = var33;
                        var23 = this.field3012.method681(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field3001[var24 + var26 - var30 - 1] * (long) class101.field2522[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field3001[var26 - var31 - 1] * (long) class101.field2522[1][var31] >> 16);
                            }
                            field3001[var26] = var29;
                            this.field3012.method681(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field2995.method773(0, (float) var23 / 65536.0F);
                    var25 = this.field2995.method773(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field3001[var39] < -32768) {
                field3001[var39] = -32768;
            }
            if (field3001[var39] > 32767) {
                field3001[var39] = 32767;
            }
        }
        return field3001;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)I", line = 321)
    private final int method971(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3007[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2997[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()V", line = 382)
    public static void method972() {
        field3001 = null;
        field2997 = null;
        field3007 = null;
        field3014 = null;
        field3013 = null;
        field3016 = null;
        field3015 = null;
        field3017 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lkd;)V", line = 396)
    public final void method973(class64 arg0) {
        this.field3000 = new class85();
        this.field3000.method682(arg0);
        this.field3006 = new class85();
        this.field3006.method682(arg0);
        int var2 = arg0.method520(-120);
        if (var2 != 0) {
            arg0.field1617--;
            this.field3010 = new class85();
            this.field3010.method682(arg0);
            this.field3009 = new class85();
            this.field3009.method682(arg0);
        }
        int var3 = arg0.method520(-119);
        if (var3 != 0) {
            arg0.field1617--;
            this.field2994 = new class85();
            this.field2994.method682(arg0);
            this.field3003 = new class85();
            this.field3003.method682(arg0);
        }
        int var4 = arg0.method520(-126);
        if (var4 != 0) {
            arg0.field1617--;
            this.field2996 = new class85();
            this.field2996.method682(arg0);
            this.field3005 = new class85();
            this.field3005.method682(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method486(114);
            if (var6 == 0) {
                break;
            }
            this.field2999[var5] = var6;
            this.field2993[var5] = arg0.method495((byte) 127);
            this.field3008[var5] = arg0.method486(127);
        }
        this.field3011 = arg0.method486(86);
        this.field3004 = arg0.method486(87);
        this.field3002 = arg0.method506((byte) -90);
        this.field2998 = arg0.method506((byte) -90);
        this.field2995 = new class101();
        this.field3012 = new class85();
        this.field2995.method776(arg0, this.field3012);
    }
}
