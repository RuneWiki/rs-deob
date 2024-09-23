import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class Tone {

    @OriginalMember(owner = "dc", name = "a", descriptor = "Z")
    private boolean field921 = false;

    @OriginalMember(owner = "dc", name = "j", descriptor = "[I")
    private int[] field930 = new int[5];

    @OriginalMember(owner = "dc", name = "k", descriptor = "[I")
    private int[] field931 = new int[5];

    @OriginalMember(owner = "dc", name = "l", descriptor = "[I")
    private int[] field932 = new int[5];

    @OriginalMember(owner = "dc", name = "n", descriptor = "I")
    private int field934 = 100;

    @OriginalMember(owner = "dc", name = "q", descriptor = "I")
    public int field937 = 500;

    @OriginalMember(owner = "dc", name = "v", descriptor = "[I")
    private static int[] field942 = new int[5];

    @OriginalMember(owner = "dc", name = "w", descriptor = "[I")
    private static int[] field943 = new int[5];

    @OriginalMember(owner = "dc", name = "x", descriptor = "[I")
    private static int[] field944 = new int[5];

    @OriginalMember(owner = "dc", name = "y", descriptor = "[I")
    private static int[] field945 = new int[5];

    @OriginalMember(owner = "dc", name = "z", descriptor = "[I")
    private static int[] field946 = new int[5];

    @OriginalMember(owner = "dc", name = "m", descriptor = "I")
    private int field933;

    @OriginalMember(owner = "dc", name = "r", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "dc", name = "b", descriptor = "Lac;")
    private Envelope field922;

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

    @OriginalMember(owner = "dc", name = "p", descriptor = "Lac;")
    private Envelope field936;

    @OriginalMember(owner = "dc", name = "o", descriptor = "Lbc;")
    private Filter field935;

    @OriginalMember(owner = "dc", name = "s", descriptor = "[I")
    private static int[] field939;

    @OriginalMember(owner = "dc", name = "t", descriptor = "[I")
    private static int[] field940;

    @OriginalMember(owner = "dc", name = "u", descriptor = "[I")
    private static int[] field941;

    @OriginalMember(owner = "dc", name = "a", descriptor = "()V")
    public static final void method324() {
        field940 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field940[var0] = 1;
            } else {
                field940[var0] = -1;
            }
        }
        field941 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field941[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field939 = new int[220500];
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(II)[I")
    public final int[] method325(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field939[var3] = 0;
        }
        if (arg1 < 10) {
            return field939;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field922.method311(447);
        this.field923.method311(447);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field924 != null) {
            this.field924.method311(447);
            this.field925.method311(447);
            var6 = (int) ((double) (this.field924.field891 - this.field924.field890) * 32.768D / var4);
            var7 = (int) ((double) this.field924.field890 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field926 != null) {
            this.field926.method311(447);
            this.field927.method311(447);
            var9 = (int) ((double) (this.field926.field891 - this.field926.field890) * 32.768D / var4);
            var10 = (int) ((double) this.field926.field890 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field930[var12] != 0) {
                field942[var12] = 0;
                field943[var12] = (int) ((double) this.field932[var12] * var4);
                field944[var12] = (this.field930[var12] << 14) / 100;
                field945[var12] = (int) ((double) (this.field922.field891 - this.field922.field890) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field931[var12]) / var4);
                field946[var12] = (int) ((double) this.field922.field890 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field922.method312(8, arg0);
            int var42 = this.field923.method312(8, arg0);
            if (this.field924 != null) {
                int var43 = this.field924.method312(8, arg0);
                int var44 = this.field925.method312(8, arg0);
                var41 += this.method326((byte) 4, this.field924.field892, var44, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field926 != null) {
                int var45 = this.field926.method312(8, arg0);
                int var46 = this.field927.method312(8, arg0);
                var42 = var42 * ((this.method326((byte) 4, this.field926.field892, var46, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field930[var47] != 0) {
                    int var48 = field943[var47] + var13;
                    if (var48 < arg0) {
                        field939[var48] += this.method326((byte) 4, this.field922.field892, field944[var47] * var42 >> 15, field942[var47]);
                        field942[var47] += (field945[var47] * var41 >> 16) + field946[var47];
                    }
                }
            }
        }
        if (this.field928 != null) {
            this.field928.method311(447);
            this.field929.method311(447);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field928.method312(8, arg0);
                int var19 = this.field929.method312(8, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field928.field891 - this.field928.field890) * var18 >> 8) + this.field928.field890;
                } else {
                    var20 = ((this.field928.field891 - this.field928.field890) * var19 >> 8) + this.field928.field890;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field939[var17] = 0;
                }
            }
        }
        if (this.field933 > 0 && this.field934 > 0) {
            int var21 = (int) ((double) this.field933 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field939[var22] += field939[var22 - var21] * this.field934 / 100;
            }
        }
        if (this.field935.field901[0] > 0 || this.field935.field901[1] > 0) {
            this.field936.method311(447);
            int var23 = this.field936.method312(8, arg0 + 1);
            int var24 = this.field935.method316((float) var23 / 65536.0F, 0, 0);
            int var25 = this.field935.method316((float) var23 / 65536.0F, 0, 1);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field939[var24 + var26] * (long) Filter.field908 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field939[var24 + var26 - var38 - 1] * (long) Filter.field906[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field939[var26 - var39 - 1] * (long) Filter.field906[1][var39] >> 16);
                    }
                    field939[var26] = var37;
                    var23 = this.field936.method312(8, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field939[var24 + var26] * (long) Filter.field908 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field939[var24 + var26 - var35 - 1] * (long) Filter.field906[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field939[var26 - var36 - 1] * (long) Filter.field906[1][var36] >> 16);
                        }
                        field939[var26] = var34;
                        var23 = this.field936.method312(8, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field939[var24 + var26 - var31 - 1] * (long) Filter.field906[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field939[var26 - var32 - 1] * (long) Filter.field906[1][var32] >> 16);
                            }
                            field939[var26] = var30;
                            this.field936.method312(8, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field935.method316((float) var23 / 65536.0F, 0, 0);
                    var25 = this.field935.method316((float) var23 / 65536.0F, 0, 1);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field939[var40] < -32768) {
                field939[var40] = -32768;
            }
            if (field939[var40] > 32767) {
                field939[var40] = 32767;
            }
        }
        return field939;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(BIII)I")
    private final int method326(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 4) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg1 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg1 == 2) {
            return field941[arg3 & 0x7FFF] * arg2 >> 14;
        } else if (arg1 == 3) {
            return ((arg3 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg1 == 4) {
            return field940[arg3 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(Llb;Z)V")
    public final void method327(Packet arg0, boolean arg1) {
        this.field922 = new Envelope();
        this.field922.method309(arg0, false);
        this.field923 = new Envelope();
        this.field923.method309(arg0, false);
        int var3 = arg0.method229();
        if (var3 != 0) {
            arg0.field716--;
            this.field924 = new Envelope();
            this.field924.method309(arg0, false);
            this.field925 = new Envelope();
            this.field925.method309(arg0, false);
        }
        int var4 = arg0.method229();
        if (var4 != 0) {
            arg0.field716--;
            this.field926 = new Envelope();
            this.field926.method309(arg0, false);
            this.field927 = new Envelope();
            this.field927.method309(arg0, false);
        }
        int var5 = arg0.method229();
        if (var5 != 0) {
            arg0.field716--;
            this.field928 = new Envelope();
            this.field928.method309(arg0, false);
            this.field929 = new Envelope();
            this.field929.method309(arg0, false);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method243();
            if (var7 == 0) {
                break;
            }
            this.field930[var6] = var7;
            this.field931[var6] = arg0.method242();
            this.field932[var6] = arg0.method243();
        }
        this.field933 = arg0.method243();
        this.field934 = arg0.method243();
        this.field937 = arg0.method231();
        this.field938 = arg0.method231();
        this.field935 = new Filter();
        if (arg1) {
            this.field921 = !this.field921;
        }
        this.field936 = new Envelope();
        this.field935.method317(arg0, this.field936, 2);
    }
}
