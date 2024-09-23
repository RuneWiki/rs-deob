import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class Tone {

    @OriginalMember(owner = "dc", name = "a", descriptor = "I")
    private int field928 = 168;

    @OriginalMember(owner = "dc", name = "j", descriptor = "[I")
    private int[] field937 = new int[5];

    @OriginalMember(owner = "dc", name = "k", descriptor = "[I")
    private int[] field938 = new int[5];

    @OriginalMember(owner = "dc", name = "l", descriptor = "[I")
    private int[] field939 = new int[5];

    @OriginalMember(owner = "dc", name = "n", descriptor = "I")
    private int field941 = 100;

    @OriginalMember(owner = "dc", name = "q", descriptor = "I")
    public int field944 = 500;

    @OriginalMember(owner = "dc", name = "v", descriptor = "[I")
    private static int[] field949 = new int[5];

    @OriginalMember(owner = "dc", name = "w", descriptor = "[I")
    private static int[] field950 = new int[5];

    @OriginalMember(owner = "dc", name = "x", descriptor = "[I")
    private static int[] field951 = new int[5];

    @OriginalMember(owner = "dc", name = "y", descriptor = "[I")
    private static int[] field952 = new int[5];

    @OriginalMember(owner = "dc", name = "z", descriptor = "[I")
    private static int[] field953 = new int[5];

    @OriginalMember(owner = "dc", name = "m", descriptor = "I")
    private int field940;

    @OriginalMember(owner = "dc", name = "r", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "dc", name = "b", descriptor = "Lac;")
    private Envelope field929;

    @OriginalMember(owner = "dc", name = "c", descriptor = "Lac;")
    private Envelope field930;

    @OriginalMember(owner = "dc", name = "d", descriptor = "Lac;")
    private Envelope field931;

    @OriginalMember(owner = "dc", name = "e", descriptor = "Lac;")
    private Envelope field932;

    @OriginalMember(owner = "dc", name = "f", descriptor = "Lac;")
    private Envelope field933;

    @OriginalMember(owner = "dc", name = "g", descriptor = "Lac;")
    private Envelope field934;

    @OriginalMember(owner = "dc", name = "h", descriptor = "Lac;")
    private Envelope field935;

    @OriginalMember(owner = "dc", name = "i", descriptor = "Lac;")
    private Envelope field936;

    @OriginalMember(owner = "dc", name = "p", descriptor = "Lac;")
    private Envelope field943;

    @OriginalMember(owner = "dc", name = "o", descriptor = "Lbc;")
    private Filter field942;

    @OriginalMember(owner = "dc", name = "s", descriptor = "[I")
    private static int[] field946;

    @OriginalMember(owner = "dc", name = "t", descriptor = "[I")
    private static int[] field947;

    @OriginalMember(owner = "dc", name = "u", descriptor = "[I")
    private static int[] field948;

    @OriginalMember(owner = "dc", name = "a", descriptor = "()V")
    public static final void method324() {
        field947 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field947[var0] = 1;
            } else {
                field947[var0] = -1;
            }
        }
        field948 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field948[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field946 = new int[220500];
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(II)[I")
    public final int[] method325(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field946[var3] = 0;
        }
        if (arg1 < 10) {
            return field946;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field929.method311(true);
        this.field930.method311(true);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field931 != null) {
            this.field931.method311(true);
            this.field932.method311(true);
            var6 = (int) ((double) (this.field931.field898 - this.field931.field897) * 32.768D / var4);
            var7 = (int) ((double) this.field931.field897 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field933 != null) {
            this.field933.method311(true);
            this.field934.method311(true);
            var9 = (int) ((double) (this.field933.field898 - this.field933.field897) * 32.768D / var4);
            var10 = (int) ((double) this.field933.field897 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field937[var12] != 0) {
                field949[var12] = 0;
                field950[var12] = (int) ((double) this.field939[var12] * var4);
                field951[var12] = (this.field937[var12] << 14) / 100;
                field952[var12] = (int) ((double) (this.field929.field898 - this.field929.field897) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field938[var12]) / var4);
                field953[var12] = (int) ((double) this.field929.field897 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field929.method312(-45088, arg0);
            int var42 = this.field930.method312(-45088, arg0);
            if (this.field931 != null) {
                int var43 = this.field931.method312(-45088, arg0);
                int var44 = this.field932.method312(-45088, arg0);
                var41 += this.method326(this.field931.field899, -377, var8, var44) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field933 != null) {
                int var45 = this.field933.method312(-45088, arg0);
                int var46 = this.field934.method312(-45088, arg0);
                var42 = var42 * ((this.method326(this.field933.field899, -377, var11, var46) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field937[var47] != 0) {
                    int var48 = field950[var47] + var13;
                    if (var48 < arg0) {
                        field946[var48] += this.method326(this.field929.field899, -377, field949[var47], field951[var47] * var42 >> 15);
                        field949[var47] += (field952[var47] * var41 >> 16) + field953[var47];
                    }
                }
            }
        }
        if (this.field935 != null) {
            this.field935.method311(true);
            this.field936.method311(true);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field935.method312(-45088, arg0);
                int var19 = this.field936.method312(-45088, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field935.field898 - this.field935.field897) * var18 >> 8) + this.field935.field897;
                } else {
                    var20 = ((this.field935.field898 - this.field935.field897) * var19 >> 8) + this.field935.field897;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field946[var17] = 0;
                }
            }
        }
        if (this.field940 > 0 && this.field941 > 0) {
            int var21 = (int) ((double) this.field940 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field946[var22] += field946[var22 - var21] * this.field941 / 100;
            }
        }
        if (this.field942.field910[0] > 0 || this.field942.field910[1] > 0) {
            this.field943.method311(true);
            int var23 = this.field943.method312(-45088, arg0 + 1);
            int var24 = this.field942.method316((float) var23 / 65536.0F, 0, false);
            int var25 = this.field942.method316((float) var23 / 65536.0F, 1, false);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field946[var24 + var26] * (long) Filter.field917 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field946[var24 + var26 - var38 - 1] * (long) Filter.field915[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field946[var26 - var39 - 1] * (long) Filter.field915[1][var39] >> 16);
                    }
                    field946[var26] = var37;
                    var23 = this.field943.method312(-45088, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field946[var24 + var26] * (long) Filter.field917 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field946[var24 + var26 - var35 - 1] * (long) Filter.field915[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field946[var26 - var36 - 1] * (long) Filter.field915[1][var36] >> 16);
                        }
                        field946[var26] = var34;
                        var23 = this.field943.method312(-45088, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field946[var24 + var26 - var31 - 1] * (long) Filter.field915[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field946[var26 - var32 - 1] * (long) Filter.field915[1][var32] >> 16);
                            }
                            field946[var26] = var30;
                            this.field943.method312(-45088, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field942.method316((float) var23 / 65536.0F, 0, false);
                    var25 = this.field942.method316((float) var23 / 65536.0F, 1, false);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field946[var40] < -32768) {
                field946[var40] = -32768;
            }
            if (field946[var40] > 32767) {
                field946[var40] = 32767;
            }
        }
        return field946;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(IIII)I")
    private final int method326(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 0) {
            return this.field928;
        } else if (arg0 == 1) {
            return (arg2 & 0x7FFF) < 16384 ? arg3 : -arg3;
        } else if (arg0 == 2) {
            return field948[arg2 & 0x7FFF] * arg3 >> 14;
        } else if (arg0 == 3) {
            return ((arg2 & 0x7FFF) * arg3 >> 14) - arg3;
        } else if (arg0 == 4) {
            return field947[arg2 / 2607 & 0x7FFF] * arg3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(Llb;I)V")
    public final void method327(Packet arg0, int arg1) {
        this.field929 = new Envelope();
        this.field929.method309(arg0, 8);
        this.field930 = new Envelope();
        this.field930.method309(arg0, 8);
        int var3 = arg0.method229();
        if (arg1 != 8) {
            this.field928 = -416;
        }
        if (var3 != 0) {
            arg0.field717--;
            this.field931 = new Envelope();
            this.field931.method309(arg0, 8);
            this.field932 = new Envelope();
            this.field932.method309(arg0, 8);
        }
        int var4 = arg0.method229();
        if (var4 != 0) {
            arg0.field717--;
            this.field933 = new Envelope();
            this.field933.method309(arg0, 8);
            this.field934 = new Envelope();
            this.field934.method309(arg0, 8);
        }
        int var5 = arg0.method229();
        if (var5 != 0) {
            arg0.field717--;
            this.field935 = new Envelope();
            this.field935.method309(arg0, 8);
            this.field936 = new Envelope();
            this.field936.method309(arg0, 8);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method243();
            if (var7 == 0) {
                break;
            }
            this.field937[var6] = var7;
            this.field938[var6] = arg0.method242();
            this.field939[var6] = arg0.method243();
        }
        this.field940 = arg0.method243();
        this.field941 = arg0.method243();
        this.field944 = arg0.method231();
        this.field945 = arg0.method231();
        this.field942 = new Filter();
        this.field943 = new Envelope();
        this.field942.method317(this.field943, 39196, arg0);
    }
}
