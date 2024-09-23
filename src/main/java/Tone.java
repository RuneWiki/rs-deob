import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ec")
public class Tone {

    @OriginalMember(owner = "ec", name = "a", descriptor = "I")
    private int field921 = -939;

    @OriginalMember(owner = "ec", name = "b", descriptor = "Z")
    private boolean field922 = false;

    @OriginalMember(owner = "ec", name = "k", descriptor = "[I")
    private int[] field931 = new int[5];

    @OriginalMember(owner = "ec", name = "l", descriptor = "[I")
    private int[] field932 = new int[5];

    @OriginalMember(owner = "ec", name = "m", descriptor = "[I")
    private int[] field933 = new int[5];

    @OriginalMember(owner = "ec", name = "o", descriptor = "I")
    private int field935 = 100;

    @OriginalMember(owner = "ec", name = "r", descriptor = "I")
    public int field938 = 500;

    @OriginalMember(owner = "ec", name = "w", descriptor = "[I")
    private static int[] field943 = new int[5];

    @OriginalMember(owner = "ec", name = "x", descriptor = "[I")
    private static int[] field944 = new int[5];

    @OriginalMember(owner = "ec", name = "y", descriptor = "[I")
    private static int[] field945 = new int[5];

    @OriginalMember(owner = "ec", name = "z", descriptor = "[I")
    private static int[] field946 = new int[5];

    @OriginalMember(owner = "ec", name = "A", descriptor = "[I")
    private static int[] field947 = new int[5];

    @OriginalMember(owner = "ec", name = "n", descriptor = "I")
    private int field934;

    @OriginalMember(owner = "ec", name = "s", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "ec", name = "c", descriptor = "Lbc;")
    private Envelope field923;

    @OriginalMember(owner = "ec", name = "d", descriptor = "Lbc;")
    private Envelope field924;

    @OriginalMember(owner = "ec", name = "e", descriptor = "Lbc;")
    private Envelope field925;

    @OriginalMember(owner = "ec", name = "f", descriptor = "Lbc;")
    private Envelope field926;

    @OriginalMember(owner = "ec", name = "g", descriptor = "Lbc;")
    private Envelope field927;

    @OriginalMember(owner = "ec", name = "h", descriptor = "Lbc;")
    private Envelope field928;

    @OriginalMember(owner = "ec", name = "i", descriptor = "Lbc;")
    private Envelope field929;

    @OriginalMember(owner = "ec", name = "j", descriptor = "Lbc;")
    private Envelope field930;

    @OriginalMember(owner = "ec", name = "q", descriptor = "Lbc;")
    private Envelope field937;

    @OriginalMember(owner = "ec", name = "p", descriptor = "Lcc;")
    private Filter field936;

    @OriginalMember(owner = "ec", name = "t", descriptor = "[I")
    private static int[] field940;

    @OriginalMember(owner = "ec", name = "u", descriptor = "[I")
    private static int[] field941;

    @OriginalMember(owner = "ec", name = "v", descriptor = "[I")
    private static int[] field942;

    @OriginalMember(owner = "ec", name = "a", descriptor = "()V")
    public static final void method323() {
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

    @OriginalMember(owner = "ec", name = "a", descriptor = "(II)[I")
    public final int[] method324(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field940[var3] = 0;
        }
        if (arg1 < 10) {
            return field940;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field923.method310(359);
        this.field924.method310(359);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field925 != null) {
            this.field925.method310(359);
            this.field926.method310(359);
            var6 = (int) ((double) (this.field925.field891 - this.field925.field890) * 32.768D / var4);
            var7 = (int) ((double) this.field925.field890 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field927 != null) {
            this.field927.method310(359);
            this.field928.method310(359);
            var9 = (int) ((double) (this.field927.field891 - this.field927.field890) * 32.768D / var4);
            var10 = (int) ((double) this.field927.field890 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field931[var12] != 0) {
                field943[var12] = 0;
                field944[var12] = (int) ((double) this.field933[var12] * var4);
                field945[var12] = (this.field931[var12] << 14) / 100;
                field946[var12] = (int) ((double) (this.field923.field891 - this.field923.field890) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field932[var12]) / var4);
                field947[var12] = (int) ((double) this.field923.field890 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field923.method311(arg0, false);
            int var42 = this.field924.method311(arg0, false);
            if (this.field925 != null) {
                int var43 = this.field925.method311(arg0, false);
                int var44 = this.field926.method311(arg0, false);
                var41 += this.method325(var8, true, var44, this.field925.field892) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field927 != null) {
                int var45 = this.field927.method311(arg0, false);
                int var46 = this.field928.method311(arg0, false);
                var42 = var42 * ((this.method325(var11, true, var46, this.field927.field892) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field931[var47] != 0) {
                    int var48 = field944[var47] + var13;
                    if (var48 < arg0) {
                        field940[var48] += this.method325(field943[var47], true, field945[var47] * var42 >> 15, this.field923.field892);
                        field943[var47] += (field946[var47] * var41 >> 16) + field947[var47];
                    }
                }
            }
        }
        if (this.field929 != null) {
            this.field929.method310(359);
            this.field930.method310(359);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field929.method311(arg0, false);
                int var19 = this.field930.method311(arg0, false);
                int var20;
                if (var16) {
                    var20 = ((this.field929.field891 - this.field929.field890) * var18 >> 8) + this.field929.field890;
                } else {
                    var20 = ((this.field929.field891 - this.field929.field890) * var19 >> 8) + this.field929.field890;
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
        if (this.field936.field904[0] > 0 || this.field936.field904[1] > 0) {
            this.field937.method310(359);
            int var23 = this.field937.method311(arg0 + 1, false);
            int var24 = this.field936.method315((float) var23 / 65536.0F, 0, 1);
            int var25 = this.field936.method315((float) var23 / 65536.0F, 1, 1);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field940[var24 + var26] * (long) Filter.field911 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field940[var24 + var26 - var38 - 1] * (long) Filter.field909[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field940[var26 - var39 - 1] * (long) Filter.field909[1][var39] >> 16);
                    }
                    field940[var26] = var37;
                    var23 = this.field937.method311(arg0 + 1, false);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field940[var24 + var26] * (long) Filter.field911 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field940[var24 + var26 - var35 - 1] * (long) Filter.field909[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field940[var26 - var36 - 1] * (long) Filter.field909[1][var36] >> 16);
                        }
                        field940[var26] = var34;
                        var23 = this.field937.method311(arg0 + 1, false);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field940[var24 + var26 - var31 - 1] * (long) Filter.field909[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field940[var26 - var32 - 1] * (long) Filter.field909[1][var32] >> 16);
                            }
                            field940[var26] = var30;
                            this.field937.method311(arg0 + 1, false);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field936.method315((float) var23 / 65536.0F, 0, 1);
                    var25 = this.field936.method315((float) var23 / 65536.0F, 1, 1);
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

    @OriginalMember(owner = "ec", name = "a", descriptor = "(IZII)I")
    private final int method325(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            this.field921 = 19;
        }
        if (arg3 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg3 == 2) {
            return field942[arg0 & 0x7FFF] * arg2 >> 14;
        } else if (arg3 == 3) {
            return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg3 == 4) {
            return field941[arg0 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "ec", name = "a", descriptor = "(BLmb;)V")
    public final void method326(byte arg0, Packet arg1) {
        this.field923 = new Envelope();
        this.field923.method308((byte) 44, arg1);
        this.field924 = new Envelope();
        this.field924.method308((byte) 44, arg1);
        int var3 = arg1.method228();
        if (var3 != 0) {
            arg1.field714--;
            this.field925 = new Envelope();
            this.field925.method308((byte) 44, arg1);
            this.field926 = new Envelope();
            this.field926.method308((byte) 44, arg1);
        }
        int var4 = arg1.method228();
        if (arg0 != 44) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (var4 != 0) {
            arg1.field714--;
            this.field927 = new Envelope();
            this.field927.method308((byte) 44, arg1);
            this.field928 = new Envelope();
            this.field928.method308((byte) 44, arg1);
        }
        int var6 = arg1.method228();
        if (var6 != 0) {
            arg1.field714--;
            this.field929 = new Envelope();
            this.field929.method308((byte) 44, arg1);
            this.field930 = new Envelope();
            this.field930.method308((byte) 44, arg1);
        }
        for (int var7 = 0; var7 < 10; var7++) {
            int var8 = arg1.method242();
            if (var8 == 0) {
                break;
            }
            this.field931[var7] = var8;
            this.field932[var7] = arg1.method241();
            this.field933[var7] = arg1.method242();
        }
        this.field934 = arg1.method242();
        this.field935 = arg1.method242();
        this.field938 = arg1.method230();
        this.field939 = arg1.method230();
        this.field936 = new Filter();
        this.field937 = new Envelope();
        this.field936.method316(arg1, this.field937, this.field922);
    }
}
