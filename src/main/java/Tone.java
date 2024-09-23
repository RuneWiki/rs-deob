import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class Tone {

    @OriginalMember(owner = "dc", name = "a", descriptor = "Z")
    private boolean field918 = false;

    @OriginalMember(owner = "dc", name = "b", descriptor = "I")
    private int field919 = 188;

    @OriginalMember(owner = "dc", name = "c", descriptor = "I")
    private int field920 = 810;

    @OriginalMember(owner = "dc", name = "l", descriptor = "[I")
    private int[] field929 = new int[5];

    @OriginalMember(owner = "dc", name = "m", descriptor = "[I")
    private int[] field930 = new int[5];

    @OriginalMember(owner = "dc", name = "n", descriptor = "[I")
    private int[] field931 = new int[5];

    @OriginalMember(owner = "dc", name = "p", descriptor = "I")
    private int field933 = 100;

    @OriginalMember(owner = "dc", name = "s", descriptor = "I")
    public int field936 = 500;

    @OriginalMember(owner = "dc", name = "x", descriptor = "[I")
    private static int[] field941 = new int[5];

    @OriginalMember(owner = "dc", name = "y", descriptor = "[I")
    private static int[] field942 = new int[5];

    @OriginalMember(owner = "dc", name = "z", descriptor = "[I")
    private static int[] field943 = new int[5];

    @OriginalMember(owner = "dc", name = "A", descriptor = "[I")
    private static int[] field944 = new int[5];

    @OriginalMember(owner = "dc", name = "B", descriptor = "[I")
    private static int[] field945 = new int[5];

    @OriginalMember(owner = "dc", name = "o", descriptor = "I")
    private int field932;

    @OriginalMember(owner = "dc", name = "t", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "dc", name = "d", descriptor = "Lac;")
    private Envelope field921;

    @OriginalMember(owner = "dc", name = "e", descriptor = "Lac;")
    private Envelope field922;

    @OriginalMember(owner = "dc", name = "f", descriptor = "Lac;")
    private Envelope field923;

    @OriginalMember(owner = "dc", name = "g", descriptor = "Lac;")
    private Envelope field924;

    @OriginalMember(owner = "dc", name = "h", descriptor = "Lac;")
    private Envelope field925;

    @OriginalMember(owner = "dc", name = "i", descriptor = "Lac;")
    private Envelope field926;

    @OriginalMember(owner = "dc", name = "j", descriptor = "Lac;")
    private Envelope field927;

    @OriginalMember(owner = "dc", name = "k", descriptor = "Lac;")
    private Envelope field928;

    @OriginalMember(owner = "dc", name = "r", descriptor = "Lac;")
    private Envelope field935;

    @OriginalMember(owner = "dc", name = "q", descriptor = "Lbc;")
    private Filter field934;

    @OriginalMember(owner = "dc", name = "u", descriptor = "[I")
    private static int[] field938;

    @OriginalMember(owner = "dc", name = "v", descriptor = "[I")
    private static int[] field939;

    @OriginalMember(owner = "dc", name = "w", descriptor = "[I")
    private static int[] field940;

    @OriginalMember(owner = "dc", name = "a", descriptor = "()V")
    public static final void method322() {
        field939 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field939[var0] = 1;
            } else {
                field939[var0] = -1;
            }
        }
        field940 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field940[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field938 = new int[220500];
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(II)[I")
    public final int[] method323(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field938[var3] = 0;
        }
        if (arg1 < 10) {
            return field938;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field921.method309(-9520);
        this.field922.method309(-9520);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field923 != null) {
            this.field923.method309(-9520);
            this.field924.method309(-9520);
            var6 = (int) ((double) (this.field923.field890 - this.field923.field889) * 32.768D / var4);
            var7 = (int) ((double) this.field923.field889 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field925 != null) {
            this.field925.method309(-9520);
            this.field926.method309(-9520);
            var9 = (int) ((double) (this.field925.field890 - this.field925.field889) * 32.768D / var4);
            var10 = (int) ((double) this.field925.field889 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field929[var12] != 0) {
                field941[var12] = 0;
                field942[var12] = (int) ((double) this.field931[var12] * var4);
                field943[var12] = (this.field929[var12] << 14) / 100;
                field944[var12] = (int) ((double) (this.field921.field890 - this.field921.field889) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field930[var12]) / var4);
                field945[var12] = (int) ((double) this.field921.field889 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field921.method310(0, arg0);
            int var42 = this.field922.method310(0, arg0);
            if (this.field923 != null) {
                int var43 = this.field923.method310(0, arg0);
                int var44 = this.field924.method310(0, arg0);
                var41 += this.method324(var44, 0, var8, this.field923.field891) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field925 != null) {
                int var45 = this.field925.method310(0, arg0);
                int var46 = this.field926.method310(0, arg0);
                var42 = var42 * ((this.method324(var46, 0, var11, this.field925.field891) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field929[var47] != 0) {
                    int var48 = field942[var47] + var13;
                    if (var48 < arg0) {
                        field938[var48] += this.method324(field943[var47] * var42 >> 15, 0, field941[var47], this.field921.field891);
                        field941[var47] += (field944[var47] * var41 >> 16) + field945[var47];
                    }
                }
            }
        }
        if (this.field927 != null) {
            this.field927.method309(-9520);
            this.field928.method309(-9520);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field927.method310(0, arg0);
                int var19 = this.field928.method310(0, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field927.field890 - this.field927.field889) * var18 >> 8) + this.field927.field889;
                } else {
                    var20 = ((this.field927.field890 - this.field927.field889) * var19 >> 8) + this.field927.field889;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field938[var17] = 0;
                }
            }
        }
        if (this.field932 > 0 && this.field933 > 0) {
            int var21 = (int) ((double) this.field932 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field938[var22] += field938[var22 - var21] * this.field933 / 100;
            }
        }
        if (this.field934.field900[0] > 0 || this.field934.field900[1] > 0) {
            this.field935.method309(-9520);
            int var23 = this.field935.method310(0, arg0 + 1);
            int var24 = this.field934.method314(0, 0, (float) var23 / 65536.0F);
            int var25 = this.field934.method314(1, 0, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field938[var24 + var26] * (long) Filter.field907 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field938[var24 + var26 - var38 - 1] * (long) Filter.field905[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field938[var26 - var39 - 1] * (long) Filter.field905[1][var39] >> 16);
                    }
                    field938[var26] = var37;
                    var23 = this.field935.method310(0, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field938[var24 + var26] * (long) Filter.field907 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field938[var24 + var26 - var35 - 1] * (long) Filter.field905[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field938[var26 - var36 - 1] * (long) Filter.field905[1][var36] >> 16);
                        }
                        field938[var26] = var34;
                        var23 = this.field935.method310(0, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field938[var24 + var26 - var31 - 1] * (long) Filter.field905[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field938[var26 - var32 - 1] * (long) Filter.field905[1][var32] >> 16);
                            }
                            field938[var26] = var30;
                            this.field935.method310(0, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field934.method314(0, 0, (float) var23 / 65536.0F);
                    var25 = this.field934.method314(1, 0, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field938[var40] < -32768) {
                field938[var40] = -32768;
            }
            if (field938[var40] > 32767) {
                field938[var40] = 32767;
            }
        }
        return field938;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(IIII)I")
    private final int method324(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            this.field919 = 302;
        }
        if (arg3 == 1) {
            return (arg2 & 0x7FFF) < 16384 ? arg0 : -arg0;
        } else if (arg3 == 2) {
            return field940[arg2 & 0x7FFF] * arg0 >> 14;
        } else if (arg3 == 3) {
            return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
        } else if (arg3 == 4) {
            return field939[arg2 / 2607 & 0x7FFF] * arg0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(ZLlb;)V")
    public final void method325(boolean arg0, Packet arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        this.field921 = new Envelope();
        this.field921.method307(false, arg1);
        this.field922 = new Envelope();
        this.field922.method307(false, arg1);
        int var3 = arg1.method227();
        if (var3 != 0) {
            arg1.field710--;
            this.field923 = new Envelope();
            this.field923.method307(false, arg1);
            this.field924 = new Envelope();
            this.field924.method307(false, arg1);
        }
        int var4 = arg1.method227();
        if (var4 != 0) {
            arg1.field710--;
            this.field925 = new Envelope();
            this.field925.method307(false, arg1);
            this.field926 = new Envelope();
            this.field926.method307(false, arg1);
        }
        int var5 = arg1.method227();
        if (var5 != 0) {
            arg1.field710--;
            this.field927 = new Envelope();
            this.field927.method307(false, arg1);
            this.field928 = new Envelope();
            this.field928.method307(false, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method241();
            if (var7 == 0) {
                break;
            }
            this.field929[var6] = var7;
            this.field930[var6] = arg1.method240();
            this.field931[var6] = arg1.method241();
        }
        this.field932 = arg1.method241();
        this.field933 = arg1.method241();
        this.field936 = arg1.method229();
        this.field937 = arg1.method229();
        this.field934 = new Filter();
        this.field935 = new Envelope();
        this.field934.method315(this.field920, this.field935, arg1);
    }

    @OriginalMember(owner = "dc", name = "<init>", descriptor = "()V")
    public Tone() {
        if (Linkable.field361) {
        }
    }
}
