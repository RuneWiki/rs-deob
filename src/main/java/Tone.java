import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class Tone {

    @OriginalMember(owner = "dc", name = "a", descriptor = "B")
    private byte field915 = 6;

    @OriginalMember(owner = "dc", name = "k", descriptor = "[I")
    private int[] field925 = new int[5];

    @OriginalMember(owner = "dc", name = "l", descriptor = "[I")
    private int[] field926 = new int[5];

    @OriginalMember(owner = "dc", name = "m", descriptor = "[I")
    private int[] field927 = new int[5];

    @OriginalMember(owner = "dc", name = "o", descriptor = "I")
    private int field929 = 100;

    @OriginalMember(owner = "dc", name = "r", descriptor = "I")
    public int field932 = 500;

    @OriginalMember(owner = "dc", name = "w", descriptor = "[I")
    private static int[] field937 = new int[5];

    @OriginalMember(owner = "dc", name = "x", descriptor = "[I")
    private static int[] field938 = new int[5];

    @OriginalMember(owner = "dc", name = "y", descriptor = "[I")
    private static int[] field939 = new int[5];

    @OriginalMember(owner = "dc", name = "z", descriptor = "[I")
    private static int[] field940 = new int[5];

    @OriginalMember(owner = "dc", name = "A", descriptor = "[I")
    private static int[] field941 = new int[5];

    @OriginalMember(owner = "dc", name = "b", descriptor = "I")
    private int field916;

    @OriginalMember(owner = "dc", name = "n", descriptor = "I")
    private int field928;

    @OriginalMember(owner = "dc", name = "s", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "dc", name = "c", descriptor = "Lac;")
    private Envelope field917;

    @OriginalMember(owner = "dc", name = "d", descriptor = "Lac;")
    private Envelope field918;

    @OriginalMember(owner = "dc", name = "e", descriptor = "Lac;")
    private Envelope field919;

    @OriginalMember(owner = "dc", name = "f", descriptor = "Lac;")
    private Envelope field920;

    @OriginalMember(owner = "dc", name = "g", descriptor = "Lac;")
    private Envelope field921;

    @OriginalMember(owner = "dc", name = "h", descriptor = "Lac;")
    private Envelope field922;

    @OriginalMember(owner = "dc", name = "i", descriptor = "Lac;")
    private Envelope field923;

    @OriginalMember(owner = "dc", name = "j", descriptor = "Lac;")
    private Envelope field924;

    @OriginalMember(owner = "dc", name = "q", descriptor = "Lac;")
    private Envelope field931;

    @OriginalMember(owner = "dc", name = "p", descriptor = "Lbc;")
    private Filter field930;

    @OriginalMember(owner = "dc", name = "t", descriptor = "[I")
    private static int[] field934;

    @OriginalMember(owner = "dc", name = "u", descriptor = "[I")
    private static int[] field935;

    @OriginalMember(owner = "dc", name = "v", descriptor = "[I")
    private static int[] field936;

    @OriginalMember(owner = "dc", name = "a", descriptor = "()V")
    public static final void method319() {
        field935 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field935[var0] = 1;
            } else {
                field935[var0] = -1;
            }
        }
        field936 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field936[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field934 = new int[220500];
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(II)[I")
    public final int[] method320(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field934[var3] = 0;
        }
        if (arg1 < 10) {
            return field934;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field917.method306(0);
        this.field918.method306(0);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field919 != null) {
            this.field919.method306(0);
            this.field920.method306(0);
            var6 = (int) ((double) (this.field919.field886 - this.field919.field885) * 32.768D / var4);
            var7 = (int) ((double) this.field919.field885 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field921 != null) {
            this.field921.method306(0);
            this.field922.method306(0);
            var9 = (int) ((double) (this.field921.field886 - this.field921.field885) * 32.768D / var4);
            var10 = (int) ((double) this.field921.field885 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field925[var12] != 0) {
                field937[var12] = 0;
                field938[var12] = (int) ((double) this.field927[var12] * var4);
                field939[var12] = (this.field925[var12] << 14) / 100;
                field940[var12] = (int) ((double) (this.field917.field886 - this.field917.field885) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field926[var12]) / var4);
                field941[var12] = (int) ((double) this.field917.field885 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field917.method307((byte) -7, arg0);
            int var42 = this.field918.method307((byte) -7, arg0);
            if (this.field919 != null) {
                int var43 = this.field919.method307((byte) -7, arg0);
                int var44 = this.field920.method307((byte) -7, arg0);
                var41 += this.method321(-339, this.field919.field887, var8, var44) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field921 != null) {
                int var45 = this.field921.method307((byte) -7, arg0);
                int var46 = this.field922.method307((byte) -7, arg0);
                var42 = var42 * ((this.method321(-339, this.field921.field887, var11, var46) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field925[var47] != 0) {
                    int var48 = field938[var47] + var13;
                    if (var48 < arg0) {
                        field934[var48] += this.method321(-339, this.field917.field887, field937[var47], field939[var47] * var42 >> 15);
                        field937[var47] += (field940[var47] * var41 >> 16) + field941[var47];
                    }
                }
            }
        }
        if (this.field923 != null) {
            this.field923.method306(0);
            this.field924.method306(0);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field923.method307((byte) -7, arg0);
                int var19 = this.field924.method307((byte) -7, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field923.field886 - this.field923.field885) * var18 >> 8) + this.field923.field885;
                } else {
                    var20 = ((this.field923.field886 - this.field923.field885) * var19 >> 8) + this.field923.field885;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field934[var17] = 0;
                }
            }
        }
        if (this.field928 > 0 && this.field929 > 0) {
            int var21 = (int) ((double) this.field928 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field934[var22] += field934[var22 - var21] * this.field929 / 100;
            }
        }
        if (this.field930.field897[0] > 0 || this.field930.field897[1] > 0) {
            this.field931.method306(0);
            int var23 = this.field931.method307((byte) -7, arg0 + 1);
            int var24 = this.field930.method311(0, (float) var23 / 65536.0F, (byte) 1);
            int var25 = this.field930.method311(1, (float) var23 / 65536.0F, (byte) 1);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field934[var24 + var26] * (long) Filter.field904 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field934[var24 + var26 - var38 - 1] * (long) Filter.field902[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field934[var26 - var39 - 1] * (long) Filter.field902[1][var39] >> 16);
                    }
                    field934[var26] = var37;
                    var23 = this.field931.method307((byte) -7, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field934[var24 + var26] * (long) Filter.field904 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field934[var24 + var26 - var35 - 1] * (long) Filter.field902[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field934[var26 - var36 - 1] * (long) Filter.field902[1][var36] >> 16);
                        }
                        field934[var26] = var34;
                        var23 = this.field931.method307((byte) -7, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field934[var24 + var26 - var31 - 1] * (long) Filter.field902[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field934[var26 - var32 - 1] * (long) Filter.field902[1][var32] >> 16);
                            }
                            field934[var26] = var30;
                            this.field931.method307((byte) -7, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field930.method311(0, (float) var23 / 65536.0F, (byte) 1);
                    var25 = this.field930.method311(1, (float) var23 / 65536.0F, (byte) 1);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field934[var40] < -32768) {
                field934[var40] = -32768;
            }
            if (field934[var40] > 32767) {
                field934[var40] = 32767;
            }
        }
        return field934;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(IIII)I")
    private final int method321(int arg0, int arg1, int arg2, int arg3) {
        while (arg0 >= 0) {
            this.field916 = 47;
        }
        if (arg1 == 1) {
            if ((arg2 & 0x7FFF) < 16384) {
                return arg3;
            } else {
                return -arg3;
            }
        } else if (arg1 == 2) {
            return field936[arg2 & 0x7FFF] * arg3 >> 14;
        } else if (arg1 == 3) {
            return ((arg2 & 0x7FFF) * arg3 >> 14) - arg3;
        } else if (arg1 == 4) {
            return field935[arg2 / 2607 & 0x7FFF] * arg3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(BLlb;)V")
    public final void method322(byte arg0, Packet arg1) {
        this.field917 = new Envelope();
        this.field917.method304((byte) 2, arg1);
        this.field918 = new Envelope();
        this.field918.method304((byte) 2, arg1);
        int var3 = arg1.method224();
        if (var3 != 0) {
            arg1.field709--;
            this.field919 = new Envelope();
            this.field919.method304((byte) 2, arg1);
            this.field920 = new Envelope();
            this.field920.method304((byte) 2, arg1);
        }
        int var4 = arg1.method224();
        if (var4 != 0) {
            arg1.field709--;
            this.field921 = new Envelope();
            this.field921.method304((byte) 2, arg1);
            this.field922 = new Envelope();
            this.field922.method304((byte) 2, arg1);
        }
        int var5 = arg1.method224();
        if (var5 != 0) {
            arg1.field709--;
            this.field923 = new Envelope();
            this.field923.method304((byte) 2, arg1);
            this.field924 = new Envelope();
            this.field924.method304((byte) 2, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method238();
            if (var7 == 0) {
                break;
            }
            this.field925[var6] = var7;
            this.field926[var6] = arg1.method237();
            this.field927[var6] = arg1.method238();
        }
        this.field928 = arg1.method238();
        this.field929 = arg1.method238();
        this.field932 = arg1.method226();
        this.field933 = arg1.method226();
        this.field930 = new Filter();
        this.field931 = new Envelope();
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        this.field930.method312(arg1, this.field915, this.field931);
    }
}
