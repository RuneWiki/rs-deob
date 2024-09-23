import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class Tone {

    @OriginalMember(owner = "dc", name = "i", descriptor = "[I")
    private int[] field920 = new int[5];

    @OriginalMember(owner = "dc", name = "j", descriptor = "[I")
    private int[] field921 = new int[5];

    @OriginalMember(owner = "dc", name = "k", descriptor = "[I")
    private int[] field922 = new int[5];

    @OriginalMember(owner = "dc", name = "m", descriptor = "I")
    private int field924 = 100;

    @OriginalMember(owner = "dc", name = "p", descriptor = "I")
    public int field927 = 500;

    @OriginalMember(owner = "dc", name = "u", descriptor = "[I")
    private static int[] field932 = new int[5];

    @OriginalMember(owner = "dc", name = "v", descriptor = "[I")
    private static int[] field933 = new int[5];

    @OriginalMember(owner = "dc", name = "w", descriptor = "[I")
    private static int[] field934 = new int[5];

    @OriginalMember(owner = "dc", name = "x", descriptor = "[I")
    private static int[] field935 = new int[5];

    @OriginalMember(owner = "dc", name = "y", descriptor = "[I")
    private static int[] field936 = new int[5];

    @OriginalMember(owner = "dc", name = "l", descriptor = "I")
    private int field923;

    @OriginalMember(owner = "dc", name = "q", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "dc", name = "a", descriptor = "Lac;")
    private Envelope field912;

    @OriginalMember(owner = "dc", name = "b", descriptor = "Lac;")
    private Envelope field913;

    @OriginalMember(owner = "dc", name = "c", descriptor = "Lac;")
    private Envelope field914;

    @OriginalMember(owner = "dc", name = "d", descriptor = "Lac;")
    private Envelope field915;

    @OriginalMember(owner = "dc", name = "e", descriptor = "Lac;")
    private Envelope field916;

    @OriginalMember(owner = "dc", name = "f", descriptor = "Lac;")
    private Envelope field917;

    @OriginalMember(owner = "dc", name = "g", descriptor = "Lac;")
    private Envelope field918;

    @OriginalMember(owner = "dc", name = "h", descriptor = "Lac;")
    private Envelope field919;

    @OriginalMember(owner = "dc", name = "o", descriptor = "Lac;")
    private Envelope field926;

    @OriginalMember(owner = "dc", name = "n", descriptor = "Lbc;")
    private Filter field925;

    @OriginalMember(owner = "dc", name = "r", descriptor = "[I")
    private static int[] field929;

    @OriginalMember(owner = "dc", name = "s", descriptor = "[I")
    private static int[] field930;

    @OriginalMember(owner = "dc", name = "t", descriptor = "[I")
    private static int[] field931;

    @OriginalMember(owner = "dc", name = "a", descriptor = "()V")
    public static final void method320() {
        field930 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field930[var0] = 1;
            } else {
                field930[var0] = -1;
            }
        }
        field931 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field931[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field929 = new int[220500];
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(II)[I")
    public final int[] method321(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field929[var3] = 0;
        }
        if (arg1 < 10) {
            return field929;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field912.method307(false);
        this.field913.method307(false);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field914 != null) {
            this.field914.method307(false);
            this.field915.method307(false);
            var6 = (int) ((double) (this.field914.field883 - this.field914.field882) * 32.768D / var4);
            var7 = (int) ((double) this.field914.field882 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field916 != null) {
            this.field916.method307(false);
            this.field917.method307(false);
            var9 = (int) ((double) (this.field916.field883 - this.field916.field882) * 32.768D / var4);
            var10 = (int) ((double) this.field916.field882 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field920[var12] != 0) {
                field932[var12] = 0;
                field933[var12] = (int) ((double) this.field922[var12] * var4);
                field934[var12] = (this.field920[var12] << 14) / 100;
                field935[var12] = (int) ((double) (this.field912.field883 - this.field912.field882) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field921[var12]) / var4);
                field936[var12] = (int) ((double) this.field912.field882 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field912.method308((byte) 122, arg0);
            int var42 = this.field913.method308((byte) 122, arg0);
            if (this.field914 != null) {
                int var43 = this.field914.method308((byte) 122, arg0);
                int var44 = this.field915.method308((byte) 122, arg0);
                var41 += this.method322(9, var44, this.field914.field884, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field916 != null) {
                int var45 = this.field916.method308((byte) 122, arg0);
                int var46 = this.field917.method308((byte) 122, arg0);
                var42 = var42 * ((this.method322(9, var46, this.field916.field884, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field920[var47] != 0) {
                    int var48 = field933[var47] + var13;
                    if (var48 < arg0) {
                        field929[var48] += this.method322(9, field934[var47] * var42 >> 15, this.field912.field884, field932[var47]);
                        field932[var47] += (field935[var47] * var41 >> 16) + field936[var47];
                    }
                }
            }
        }
        if (this.field918 != null) {
            this.field918.method307(false);
            this.field919.method307(false);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field918.method308((byte) 122, arg0);
                int var19 = this.field919.method308((byte) 122, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field918.field883 - this.field918.field882) * var18 >> 8) + this.field918.field882;
                } else {
                    var20 = ((this.field918.field883 - this.field918.field882) * var19 >> 8) + this.field918.field882;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field929[var17] = 0;
                }
            }
        }
        if (this.field923 > 0 && this.field924 > 0) {
            int var21 = (int) ((double) this.field923 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field929[var22] += field929[var22 - var21] * this.field924 / 100;
            }
        }
        if (this.field925.field893[0] > 0 || this.field925.field893[1] > 0) {
            this.field926.method307(false);
            int var23 = this.field926.method308((byte) 122, arg0 + 1);
            int var24 = this.field925.method312(0, (float) var23 / 65536.0F, true);
            int var25 = this.field925.method312(1, (float) var23 / 65536.0F, true);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field929[var24 + var26] * (long) Filter.field900 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field929[var24 + var26 - var38 - 1] * (long) Filter.field898[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field929[var26 - var39 - 1] * (long) Filter.field898[1][var39] >> 16);
                    }
                    field929[var26] = var37;
                    var23 = this.field926.method308((byte) 122, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field929[var24 + var26] * (long) Filter.field900 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field929[var24 + var26 - var35 - 1] * (long) Filter.field898[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field929[var26 - var36 - 1] * (long) Filter.field898[1][var36] >> 16);
                        }
                        field929[var26] = var34;
                        var23 = this.field926.method308((byte) 122, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field929[var24 + var26 - var31 - 1] * (long) Filter.field898[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field929[var26 - var32 - 1] * (long) Filter.field898[1][var32] >> 16);
                            }
                            field929[var26] = var30;
                            this.field926.method308((byte) 122, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field925.method312(0, (float) var23 / 65536.0F, true);
                    var25 = this.field925.method312(1, (float) var23 / 65536.0F, true);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field929[var40] < -32768) {
                field929[var40] = -32768;
            }
            if (field929[var40] > 32767) {
                field929[var40] = 32767;
            }
        }
        return field929;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(IIII)I")
    private final int method322(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 9) {
            return 3;
        } else if (arg2 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field931[arg3 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg3 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field930[arg3 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(Llb;B)V")
    public final void method323(Packet arg0, byte arg1) {
        this.field912 = new Envelope();
        this.field912.method305(arg0, (byte) 81);
        this.field913 = new Envelope();
        this.field913.method305(arg0, (byte) 81);
        int var3 = arg0.method225();
        if (var3 != 0) {
            arg0.field708--;
            this.field914 = new Envelope();
            this.field914.method305(arg0, (byte) 81);
            this.field915 = new Envelope();
            this.field915.method305(arg0, (byte) 81);
        }
        int var4 = arg0.method225();
        if (var4 != 0) {
            arg0.field708--;
            this.field916 = new Envelope();
            this.field916.method305(arg0, (byte) 81);
            this.field917 = new Envelope();
            this.field917.method305(arg0, (byte) 81);
        }
        int var5 = arg0.method225();
        if (var5 != 0) {
            arg0.field708--;
            this.field918 = new Envelope();
            this.field918.method305(arg0, (byte) 81);
            this.field919 = new Envelope();
            this.field919.method305(arg0, (byte) 81);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method239();
            if (var7 == 0) {
                break;
            }
            this.field920[var6] = var7;
            this.field921[var6] = arg0.method238();
            this.field922[var6] = arg0.method239();
        }
        this.field923 = arg0.method239();
        this.field924 = arg0.method239();
        this.field927 = arg0.method227();
        if (arg1 != 81) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        this.field928 = arg0.method227();
        this.field925 = new Filter();
        this.field926 = new Envelope();
        this.field925.method313(this.field926, arg0, 6454);
    }
}
