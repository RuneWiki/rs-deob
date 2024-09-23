import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class Tone {

    @OriginalMember(owner = "dc", name = "a", descriptor = "B")
    private byte field921 = 0;

    @OriginalMember(owner = "dc", name = "b", descriptor = "Z")
    private boolean field922 = false;

    @OriginalMember(owner = "dc", name = "k", descriptor = "[I")
    private int[] field931 = new int[5];

    @OriginalMember(owner = "dc", name = "l", descriptor = "[I")
    private int[] field932 = new int[5];

    @OriginalMember(owner = "dc", name = "m", descriptor = "[I")
    private int[] field933 = new int[5];

    @OriginalMember(owner = "dc", name = "o", descriptor = "I")
    private int field935 = 100;

    @OriginalMember(owner = "dc", name = "r", descriptor = "I")
    public int field938 = 500;

    @OriginalMember(owner = "dc", name = "w", descriptor = "[I")
    private static int[] field943 = new int[5];

    @OriginalMember(owner = "dc", name = "x", descriptor = "[I")
    private static int[] field944 = new int[5];

    @OriginalMember(owner = "dc", name = "y", descriptor = "[I")
    private static int[] field945 = new int[5];

    @OriginalMember(owner = "dc", name = "z", descriptor = "[I")
    private static int[] field946 = new int[5];

    @OriginalMember(owner = "dc", name = "A", descriptor = "[I")
    private static int[] field947 = new int[5];

    @OriginalMember(owner = "dc", name = "n", descriptor = "I")
    private int field934;

    @OriginalMember(owner = "dc", name = "s", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "dc", name = "c", descriptor = "Lac;")
    private Envelope field923;

    @OriginalMember(owner = "dc", name = "d", descriptor = "Lac;")
    private Envelope field924;

    @OriginalMember(owner = "dc", name = "e", descriptor = "Lac;")
    private Envelope field925;

    @OriginalMember(owner = "dc", name = "f", descriptor = "Lac;")
    private Envelope field926;

    @OriginalMember(owner = "dc", name = "g", descriptor = "Lac;")
    private Envelope field927;

    @OriginalMember(owner = "dc", name = "h", descriptor = "Lac;")
    private Envelope field928;

    @OriginalMember(owner = "dc", name = "i", descriptor = "Lac;")
    private Envelope field929;

    @OriginalMember(owner = "dc", name = "j", descriptor = "Lac;")
    private Envelope field930;

    @OriginalMember(owner = "dc", name = "q", descriptor = "Lac;")
    private Envelope field937;

    @OriginalMember(owner = "dc", name = "p", descriptor = "Lbc;")
    private Filter field936;

    @OriginalMember(owner = "dc", name = "t", descriptor = "[I")
    private static int[] field940;

    @OriginalMember(owner = "dc", name = "u", descriptor = "[I")
    private static int[] field941;

    @OriginalMember(owner = "dc", name = "v", descriptor = "[I")
    private static int[] field942;

    @OriginalMember(owner = "dc", name = "a", descriptor = "()V")
    public static final void method324() {
        field941 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field941[var0] = 1;
            } else {
                field941[var0] = -1;
            }
        }
        field942 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field942[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field940 = new int[220500];
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(II)[I")
    public final int[] method325(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field940[var3] = 0;
        }
        if (arg1 < 10) {
            return field940;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field923.method311((byte) 105);
        this.field924.method311((byte) 105);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field925 != null) {
            this.field925.method311((byte) 105);
            this.field926.method311((byte) 105);
            var6 = (int) ((double) (this.field925.field892 - this.field925.field891) * 32.768D / var4);
            var7 = (int) ((double) this.field925.field891 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field927 != null) {
            this.field927.method311((byte) 105);
            this.field928.method311((byte) 105);
            var9 = (int) ((double) (this.field927.field892 - this.field927.field891) * 32.768D / var4);
            var10 = (int) ((double) this.field927.field891 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field931[var12] != 0) {
                field943[var12] = 0;
                field944[var12] = (int) ((double) this.field933[var12] * var4);
                field945[var12] = (this.field931[var12] << 14) / 100;
                field946[var12] = (int) ((double) (this.field923.field892 - this.field923.field891) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field932[var12]) / var4);
                field947[var12] = (int) ((double) this.field923.field891 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field923.method312(arg0, false);
            int var42 = this.field924.method312(arg0, false);
            if (this.field925 != null) {
                int var43 = this.field925.method312(arg0, false);
                int var44 = this.field926.method312(arg0, false);
                var41 += this.method326(this.field925.field893, var8, 930, var44) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field927 != null) {
                int var45 = this.field927.method312(arg0, false);
                int var46 = this.field928.method312(arg0, false);
                var42 = var42 * ((this.method326(this.field927.field893, var11, 930, var46) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field931[var47] != 0) {
                    int var48 = field944[var47] + var13;
                    if (var48 < arg0) {
                        field940[var48] += this.method326(this.field923.field893, field943[var47], 930, field945[var47] * var42 >> 15);
                        field943[var47] += (field946[var47] * var41 >> 16) + field947[var47];
                    }
                }
            }
        }
        if (this.field929 != null) {
            this.field929.method311((byte) 105);
            this.field930.method311((byte) 105);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field929.method312(arg0, false);
                int var19 = this.field930.method312(arg0, false);
                int var20;
                if (var16) {
                    var20 = ((this.field929.field892 - this.field929.field891) * var18 >> 8) + this.field929.field891;
                } else {
                    var20 = ((this.field929.field892 - this.field929.field891) * var19 >> 8) + this.field929.field891;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field940[var17] = 0;
                }
            }
        }
        if (this.field934 > 0 && this.field935 > 0) {
            int var21 = (int) ((double) this.field934 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field940[var22] += field940[var22 - var21] * this.field935 / 100;
            }
        }
        if (this.field936.field902[0] > 0 || this.field936.field902[1] > 0) {
            this.field937.method311((byte) 105);
            int var23 = this.field937.method312(arg0 + 1, false);
            int var24 = this.field936.method316(-808, 0, (float) var23 / 65536.0F);
            int var25 = this.field936.method316(-808, 1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field940[var24 + var26] * (long) Filter.field909 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field940[var24 + var26 - var38 - 1] * (long) Filter.field907[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field940[var26 - var39 - 1] * (long) Filter.field907[1][var39] >> 16);
                    }
                    field940[var26] = var37;
                    var23 = this.field937.method312(arg0 + 1, false);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field940[var24 + var26] * (long) Filter.field909 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field940[var24 + var26 - var35 - 1] * (long) Filter.field907[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field940[var26 - var36 - 1] * (long) Filter.field907[1][var36] >> 16);
                        }
                        field940[var26] = var34;
                        var23 = this.field937.method312(arg0 + 1, false);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field940[var24 + var26 - var31 - 1] * (long) Filter.field907[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field940[var26 - var32 - 1] * (long) Filter.field907[1][var32] >> 16);
                            }
                            field940[var26] = var30;
                            this.field937.method312(arg0 + 1, false);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field936.method316(-808, 0, (float) var23 / 65536.0F);
                    var25 = this.field936.method316(-808, 1, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field940[var40] < -32768) {
                field940[var40] = -32768;
            }
            if (field940[var40] > 32767) {
                field940[var40] = 32767;
            }
        }
        return field940;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(IIII)I")
    private final int method326(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0) {
            this.field922 = !this.field922;
        }
        if (arg0 == 1) {
            return (arg1 & 0x7FFF) < 16384 ? arg3 : -arg3;
        } else if (arg0 == 2) {
            return field942[arg1 & 0x7FFF] * arg3 >> 14;
        } else if (arg0 == 3) {
            return ((arg1 & 0x7FFF) * arg3 >> 14) - arg3;
        } else if (arg0 == 4) {
            return field941[arg1 / 2607 & 0x7FFF] * arg3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(ZLlb;)V")
    public final void method327(boolean arg0, Packet arg1) {
        this.field923 = new Envelope();
        this.field923.method309(false, arg1);
        this.field924 = new Envelope();
        this.field924.method309(false, arg1);
        int var3 = arg1.method229();
        if (var3 != 0) {
            arg1.field712--;
            this.field925 = new Envelope();
            this.field925.method309(false, arg1);
            this.field926 = new Envelope();
            this.field926.method309(false, arg1);
        }
        int var4 = arg1.method229();
        if (var4 != 0) {
            arg1.field712--;
            this.field927 = new Envelope();
            this.field927.method309(false, arg1);
            this.field928 = new Envelope();
            this.field928.method309(false, arg1);
        }
        int var5 = arg1.method229();
        if (var5 != 0) {
            arg1.field712--;
            this.field929 = new Envelope();
            this.field929.method309(false, arg1);
            this.field930 = new Envelope();
            this.field930.method309(false, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method243();
            if (var7 == 0) {
                break;
            }
            this.field931[var6] = var7;
            this.field932[var6] = arg1.method242();
            this.field933[var6] = arg1.method243();
        }
        this.field934 = arg1.method243();
        this.field935 = arg1.method243();
        this.field938 = arg1.method231();
        this.field939 = arg1.method231();
        this.field936 = new Filter();
        this.field937 = new Envelope();
        this.field936.method317(this.field937, this.field921, arg1);
        if (arg0) {
            this.field922 = !this.field922;
        }
    }
}
