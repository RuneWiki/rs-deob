import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class Tone {

    @OriginalMember(owner = "dc", name = "a", descriptor = "I")
    private int field911 = -27771;

    @OriginalMember(owner = "dc", name = "k", descriptor = "[I")
    private int[] field921 = new int[5];

    @OriginalMember(owner = "dc", name = "l", descriptor = "[I")
    private int[] field922 = new int[5];

    @OriginalMember(owner = "dc", name = "m", descriptor = "[I")
    private int[] field923 = new int[5];

    @OriginalMember(owner = "dc", name = "o", descriptor = "I")
    private int field925 = 100;

    @OriginalMember(owner = "dc", name = "r", descriptor = "I")
    public int field928 = 500;

    @OriginalMember(owner = "dc", name = "w", descriptor = "[I")
    private static int[] field933 = new int[5];

    @OriginalMember(owner = "dc", name = "x", descriptor = "[I")
    private static int[] field934 = new int[5];

    @OriginalMember(owner = "dc", name = "y", descriptor = "[I")
    private static int[] field935 = new int[5];

    @OriginalMember(owner = "dc", name = "z", descriptor = "[I")
    private static int[] field936 = new int[5];

    @OriginalMember(owner = "dc", name = "A", descriptor = "[I")
    private static int[] field937 = new int[5];

    @OriginalMember(owner = "dc", name = "b", descriptor = "I")
    private int field912;

    @OriginalMember(owner = "dc", name = "n", descriptor = "I")
    private int field924;

    @OriginalMember(owner = "dc", name = "s", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "dc", name = "c", descriptor = "Lac;")
    private Envelope field913;

    @OriginalMember(owner = "dc", name = "d", descriptor = "Lac;")
    private Envelope field914;

    @OriginalMember(owner = "dc", name = "e", descriptor = "Lac;")
    private Envelope field915;

    @OriginalMember(owner = "dc", name = "f", descriptor = "Lac;")
    private Envelope field916;

    @OriginalMember(owner = "dc", name = "g", descriptor = "Lac;")
    private Envelope field917;

    @OriginalMember(owner = "dc", name = "h", descriptor = "Lac;")
    private Envelope field918;

    @OriginalMember(owner = "dc", name = "i", descriptor = "Lac;")
    private Envelope field919;

    @OriginalMember(owner = "dc", name = "j", descriptor = "Lac;")
    private Envelope field920;

    @OriginalMember(owner = "dc", name = "q", descriptor = "Lac;")
    private Envelope field927;

    @OriginalMember(owner = "dc", name = "p", descriptor = "Lbc;")
    private Filter field926;

    @OriginalMember(owner = "dc", name = "t", descriptor = "[I")
    private static int[] field930;

    @OriginalMember(owner = "dc", name = "u", descriptor = "[I")
    private static int[] field931;

    @OriginalMember(owner = "dc", name = "v", descriptor = "[I")
    private static int[] field932;

    @OriginalMember(owner = "dc", name = "a", descriptor = "()V")
    public static final void method319() {
        field931 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field931[var0] = 1;
            } else {
                field931[var0] = -1;
            }
        }
        field932 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field932[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field930 = new int[220500];
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(II)[I")
    public final int[] method320(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field930[var3] = 0;
        }
        if (arg1 < 10) {
            return field930;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field913.method306(39192);
        this.field914.method306(39192);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field915 != null) {
            this.field915.method306(39192);
            this.field916.method306(39192);
            var6 = (int) ((double) (this.field915.field881 - this.field915.field880) * 32.768D / var4);
            var7 = (int) ((double) this.field915.field880 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field917 != null) {
            this.field917.method306(39192);
            this.field918.method306(39192);
            var9 = (int) ((double) (this.field917.field881 - this.field917.field880) * 32.768D / var4);
            var10 = (int) ((double) this.field917.field880 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field921[var12] != 0) {
                field933[var12] = 0;
                field934[var12] = (int) ((double) this.field923[var12] * var4);
                field935[var12] = (this.field921[var12] << 14) / 100;
                field936[var12] = (int) ((double) (this.field913.field881 - this.field913.field880) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field922[var12]) / var4);
                field937[var12] = (int) ((double) this.field913.field880 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field913.method307(-757, arg0);
            int var42 = this.field914.method307(-757, arg0);
            if (this.field915 != null) {
                int var43 = this.field915.method307(-757, arg0);
                int var44 = this.field916.method307(-757, arg0);
                var41 += this.method321(var44, -27771, var8, this.field915.field882) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field917 != null) {
                int var45 = this.field917.method307(-757, arg0);
                int var46 = this.field918.method307(-757, arg0);
                var42 = var42 * ((this.method321(var46, -27771, var11, this.field917.field882) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field921[var47] != 0) {
                    int var48 = field934[var47] + var13;
                    if (var48 < arg0) {
                        field930[var48] += this.method321(field935[var47] * var42 >> 15, -27771, field933[var47], this.field913.field882);
                        field933[var47] += (field936[var47] * var41 >> 16) + field937[var47];
                    }
                }
            }
        }
        if (this.field919 != null) {
            this.field919.method306(39192);
            this.field920.method306(39192);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field919.method307(-757, arg0);
                int var19 = this.field920.method307(-757, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field919.field881 - this.field919.field880) * var18 >> 8) + this.field919.field880;
                } else {
                    var20 = ((this.field919.field881 - this.field919.field880) * var19 >> 8) + this.field919.field880;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field930[var17] = 0;
                }
            }
        }
        if (this.field924 > 0 && this.field925 > 0) {
            int var21 = (int) ((double) this.field924 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field930[var22] += field930[var22 - var21] * this.field925 / 100;
            }
        }
        if (this.field926.field893[0] > 0 || this.field926.field893[1] > 0) {
            this.field927.method306(39192);
            int var23 = this.field927.method307(-757, arg0 + 1);
            int var24 = this.field926.method311(-764, (float) var23 / 65536.0F, 0);
            int var25 = this.field926.method311(-764, (float) var23 / 65536.0F, 1);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field930[var24 + var26] * (long) Filter.field900 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field930[var24 + var26 - var38 - 1] * (long) Filter.field898[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field930[var26 - var39 - 1] * (long) Filter.field898[1][var39] >> 16);
                    }
                    field930[var26] = var37;
                    var23 = this.field927.method307(-757, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field930[var24 + var26] * (long) Filter.field900 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field930[var24 + var26 - var35 - 1] * (long) Filter.field898[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field930[var26 - var36 - 1] * (long) Filter.field898[1][var36] >> 16);
                        }
                        field930[var26] = var34;
                        var23 = this.field927.method307(-757, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field930[var24 + var26 - var31 - 1] * (long) Filter.field898[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field930[var26 - var32 - 1] * (long) Filter.field898[1][var32] >> 16);
                            }
                            field930[var26] = var30;
                            this.field927.method307(-757, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field926.method311(-764, (float) var23 / 65536.0F, 0);
                    var25 = this.field926.method311(-764, (float) var23 / 65536.0F, 1);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field930[var40] < -32768) {
                field930[var40] = -32768;
            }
            if (field930[var40] > 32767) {
                field930[var40] = 32767;
            }
        }
        return field930;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(IIII)I")
    private final int method321(int arg0, int arg1, int arg2, int arg3) {
        if (this.field911 != arg1) {
            return this.field912;
        } else if (arg3 == 1) {
            return (arg2 & 0x7FFF) < 16384 ? arg0 : -arg0;
        } else if (arg3 == 2) {
            return field932[arg2 & 0x7FFF] * arg0 >> 14;
        } else if (arg3 == 3) {
            return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
        } else if (arg3 == 4) {
            return field931[arg2 / 2607 & 0x7FFF] * arg0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(Llb;I)V")
    public final void method322(Packet arg0, int arg1) {
        this.field913 = new Envelope();
        this.field913.method304(arg0, -32477);
        this.field914 = new Envelope();
        this.field914.method304(arg0, -32477);
        int var3 = arg0.method224();
        if (var3 != 0) {
            arg0.field702--;
            this.field915 = new Envelope();
            this.field915.method304(arg0, -32477);
            this.field916 = new Envelope();
            this.field916.method304(arg0, -32477);
        }
        int var4 = arg0.method224();
        if (arg1 != -32477) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (var4 != 0) {
            arg0.field702--;
            this.field917 = new Envelope();
            this.field917.method304(arg0, -32477);
            this.field918 = new Envelope();
            this.field918.method304(arg0, -32477);
        }
        int var6 = arg0.method224();
        if (var6 != 0) {
            arg0.field702--;
            this.field919 = new Envelope();
            this.field919.method304(arg0, -32477);
            this.field920 = new Envelope();
            this.field920.method304(arg0, -32477);
        }
        for (int var7 = 0; var7 < 10; var7++) {
            int var8 = arg0.method238();
            if (var8 == 0) {
                break;
            }
            this.field921[var7] = var8;
            this.field922[var7] = arg0.method237();
            this.field923[var7] = arg0.method238();
        }
        this.field924 = arg0.method238();
        this.field925 = arg0.method238();
        this.field928 = arg0.method226();
        this.field929 = arg0.method226();
        this.field926 = new Filter();
        this.field927 = new Envelope();
        this.field926.method312(0, this.field927, arg0);
    }
}
