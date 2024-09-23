import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class Tone {

    @OriginalMember(owner = "dc", name = "i", descriptor = "[I")
    private int[] field933 = new int[5];

    @OriginalMember(owner = "dc", name = "j", descriptor = "[I")
    private int[] field934 = new int[5];

    @OriginalMember(owner = "dc", name = "k", descriptor = "[I")
    private int[] field935 = new int[5];

    @OriginalMember(owner = "dc", name = "m", descriptor = "I")
    private int field937 = 100;

    @OriginalMember(owner = "dc", name = "p", descriptor = "I")
    public int field940 = 500;

    @OriginalMember(owner = "dc", name = "u", descriptor = "[I")
    private static int[] field945 = new int[5];

    @OriginalMember(owner = "dc", name = "v", descriptor = "[I")
    private static int[] field946 = new int[5];

    @OriginalMember(owner = "dc", name = "w", descriptor = "[I")
    private static int[] field947 = new int[5];

    @OriginalMember(owner = "dc", name = "x", descriptor = "[I")
    private static int[] field948 = new int[5];

    @OriginalMember(owner = "dc", name = "y", descriptor = "[I")
    private static int[] field949 = new int[5];

    @OriginalMember(owner = "dc", name = "l", descriptor = "I")
    private int field936;

    @OriginalMember(owner = "dc", name = "q", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "dc", name = "a", descriptor = "Lac;")
    private Envelope field925;

    @OriginalMember(owner = "dc", name = "b", descriptor = "Lac;")
    private Envelope field926;

    @OriginalMember(owner = "dc", name = "c", descriptor = "Lac;")
    private Envelope field927;

    @OriginalMember(owner = "dc", name = "d", descriptor = "Lac;")
    private Envelope field928;

    @OriginalMember(owner = "dc", name = "e", descriptor = "Lac;")
    private Envelope field929;

    @OriginalMember(owner = "dc", name = "f", descriptor = "Lac;")
    private Envelope field930;

    @OriginalMember(owner = "dc", name = "g", descriptor = "Lac;")
    private Envelope field931;

    @OriginalMember(owner = "dc", name = "h", descriptor = "Lac;")
    private Envelope field932;

    @OriginalMember(owner = "dc", name = "o", descriptor = "Lac;")
    private Envelope field939;

    @OriginalMember(owner = "dc", name = "n", descriptor = "Lbc;")
    private Filter field938;

    @OriginalMember(owner = "dc", name = "r", descriptor = "[I")
    private static int[] field942;

    @OriginalMember(owner = "dc", name = "s", descriptor = "[I")
    private static int[] field943;

    @OriginalMember(owner = "dc", name = "t", descriptor = "[I")
    private static int[] field944;

    @OriginalMember(owner = "dc", name = "a", descriptor = "()V")
    public static final void method324() {
        field943 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field943[var0] = 1;
            } else {
                field943[var0] = -1;
            }
        }
        field944 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field944[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field942 = new int[220500];
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(II)[I")
    public final int[] method325(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field942[var3] = 0;
        }
        if (arg1 < 10) {
            return field942;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field925.method311((byte) 0);
        this.field926.method311((byte) 0);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field927 != null) {
            this.field927.method311((byte) 0);
            this.field928.method311((byte) 0);
            var6 = (int) ((double) (this.field927.field898 - this.field927.field897) * 32.768D / var4);
            var7 = (int) ((double) this.field927.field897 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field929 != null) {
            this.field929.method311((byte) 0);
            this.field930.method311((byte) 0);
            var9 = (int) ((double) (this.field929.field898 - this.field929.field897) * 32.768D / var4);
            var10 = (int) ((double) this.field929.field897 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field933[var12] != 0) {
                field945[var12] = 0;
                field946[var12] = (int) ((double) this.field935[var12] * var4);
                field947[var12] = (this.field933[var12] << 14) / 100;
                field948[var12] = (int) ((double) (this.field925.field898 - this.field925.field897) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field934[var12]) / var4);
                field949[var12] = (int) ((double) this.field925.field897 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field925.method312(733, arg0);
            int var42 = this.field926.method312(733, arg0);
            if (this.field927 != null) {
                int var43 = this.field927.method312(733, arg0);
                int var44 = this.field928.method312(733, arg0);
                var41 += this.method326((byte) 6, this.field927.field899, var44, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field929 != null) {
                int var45 = this.field929.method312(733, arg0);
                int var46 = this.field930.method312(733, arg0);
                var42 = var42 * ((this.method326((byte) 6, this.field929.field899, var46, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field933[var47] != 0) {
                    int var48 = field946[var47] + var13;
                    if (var48 < arg0) {
                        field942[var48] += this.method326((byte) 6, this.field925.field899, field947[var47] * var42 >> 15, field945[var47]);
                        field945[var47] += (field948[var47] * var41 >> 16) + field949[var47];
                    }
                }
            }
        }
        if (this.field931 != null) {
            this.field931.method311((byte) 0);
            this.field932.method311((byte) 0);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field931.method312(733, arg0);
                int var19 = this.field932.method312(733, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field931.field898 - this.field931.field897) * var18 >> 8) + this.field931.field897;
                } else {
                    var20 = ((this.field931.field898 - this.field931.field897) * var19 >> 8) + this.field931.field897;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field942[var17] = 0;
                }
            }
        }
        if (this.field936 > 0 && this.field937 > 0) {
            int var21 = (int) ((double) this.field936 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field942[var22] += field942[var22 - var21] * this.field937 / 100;
            }
        }
        if (this.field938.field908[0] > 0 || this.field938.field908[1] > 0) {
            this.field939.method311((byte) 0);
            int var23 = this.field939.method312(733, arg0 + 1);
            int var24 = this.field938.method316(0, 0, (float) var23 / 65536.0F);
            int var25 = this.field938.method316(0, 1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field942[var24 + var26] * (long) Filter.field915 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field942[var24 + var26 - var38 - 1] * (long) Filter.field913[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field942[var26 - var39 - 1] * (long) Filter.field913[1][var39] >> 16);
                    }
                    field942[var26] = var37;
                    var23 = this.field939.method312(733, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field942[var24 + var26] * (long) Filter.field915 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field942[var24 + var26 - var35 - 1] * (long) Filter.field913[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field942[var26 - var36 - 1] * (long) Filter.field913[1][var36] >> 16);
                        }
                        field942[var26] = var34;
                        var23 = this.field939.method312(733, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field942[var24 + var26 - var31 - 1] * (long) Filter.field913[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field942[var26 - var32 - 1] * (long) Filter.field913[1][var32] >> 16);
                            }
                            field942[var26] = var30;
                            this.field939.method312(733, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field938.method316(0, 0, (float) var23 / 65536.0F);
                    var25 = this.field938.method316(0, 1, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field942[var40] < -32768) {
                field942[var40] = -32768;
            }
            if (field942[var40] > 32767) {
                field942[var40] = 32767;
            }
        }
        return field942;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(BIII)I")
    private final int method326(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 6) {
            return 2;
        }
        boolean var5 = false;
        if (arg1 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg1 == 2) {
            return field944[arg3 & 0x7FFF] * arg2 >> 14;
        } else if (arg1 == 3) {
            return ((arg3 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg1 == 4) {
            return field943[arg3 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(ILlb;)V")
    public final void method327(int arg0, Packet arg1) {
        this.field925 = new Envelope();
        this.field925.method309(210, arg1);
        this.field926 = new Envelope();
        this.field926.method309(210, arg1);
        int var3 = arg1.method229();
        if (var3 != 0) {
            arg1.field713--;
            this.field927 = new Envelope();
            this.field927.method309(210, arg1);
            this.field928 = new Envelope();
            this.field928.method309(210, arg1);
        }
        int var4 = arg1.method229();
        if (var4 != 0) {
            arg1.field713--;
            this.field929 = new Envelope();
            this.field929.method309(210, arg1);
            this.field930 = new Envelope();
            this.field930.method309(210, arg1);
        }
        int var5 = arg1.method229();
        if (var5 != 0) {
            arg1.field713--;
            this.field931 = new Envelope();
            this.field931.method309(210, arg1);
            this.field932 = new Envelope();
            this.field932.method309(210, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method243();
            if (var7 == 0) {
                break;
            }
            this.field933[var6] = var7;
            this.field934[var6] = arg1.method242();
            this.field935[var6] = arg1.method243();
        }
        this.field936 = arg1.method243();
        int var8 = 49 / arg0;
        this.field937 = arg1.method243();
        this.field940 = arg1.method231();
        this.field941 = arg1.method231();
        this.field938 = new Filter();
        this.field939 = new Envelope();
        this.field938.method317(this.field939, arg1, -45931);
    }
}
