import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class Tone {

    @OriginalMember(owner = "dc", name = "a", descriptor = "I")
    private int field914 = 156;

    @OriginalMember(owner = "dc", name = "k", descriptor = "[I")
    private int[] field924 = new int[5];

    @OriginalMember(owner = "dc", name = "l", descriptor = "[I")
    private int[] field925 = new int[5];

    @OriginalMember(owner = "dc", name = "m", descriptor = "[I")
    private int[] field926 = new int[5];

    @OriginalMember(owner = "dc", name = "o", descriptor = "I")
    private int field928 = 100;

    @OriginalMember(owner = "dc", name = "r", descriptor = "I")
    public int field931 = 500;

    @OriginalMember(owner = "dc", name = "b", descriptor = "B")
    private static byte field915 = 7;

    @OriginalMember(owner = "dc", name = "w", descriptor = "[I")
    private static int[] field936 = new int[5];

    @OriginalMember(owner = "dc", name = "x", descriptor = "[I")
    private static int[] field937 = new int[5];

    @OriginalMember(owner = "dc", name = "y", descriptor = "[I")
    private static int[] field938 = new int[5];

    @OriginalMember(owner = "dc", name = "z", descriptor = "[I")
    private static int[] field939 = new int[5];

    @OriginalMember(owner = "dc", name = "A", descriptor = "[I")
    private static int[] field940 = new int[5];

    @OriginalMember(owner = "dc", name = "n", descriptor = "I")
    private int field927;

    @OriginalMember(owner = "dc", name = "s", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "dc", name = "c", descriptor = "Lac;")
    private Envelope field916;

    @OriginalMember(owner = "dc", name = "d", descriptor = "Lac;")
    private Envelope field917;

    @OriginalMember(owner = "dc", name = "e", descriptor = "Lac;")
    private Envelope field918;

    @OriginalMember(owner = "dc", name = "f", descriptor = "Lac;")
    private Envelope field919;

    @OriginalMember(owner = "dc", name = "g", descriptor = "Lac;")
    private Envelope field920;

    @OriginalMember(owner = "dc", name = "h", descriptor = "Lac;")
    private Envelope field921;

    @OriginalMember(owner = "dc", name = "i", descriptor = "Lac;")
    private Envelope field922;

    @OriginalMember(owner = "dc", name = "j", descriptor = "Lac;")
    private Envelope field923;

    @OriginalMember(owner = "dc", name = "q", descriptor = "Lac;")
    private Envelope field930;

    @OriginalMember(owner = "dc", name = "p", descriptor = "Lbc;")
    private Filter field929;

    @OriginalMember(owner = "dc", name = "t", descriptor = "[I")
    private static int[] field933;

    @OriginalMember(owner = "dc", name = "u", descriptor = "[I")
    private static int[] field934;

    @OriginalMember(owner = "dc", name = "v", descriptor = "[I")
    private static int[] field935;

    @OriginalMember(owner = "dc", name = "a", descriptor = "()V")
    public static final void method324() {
        field934 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field934[var0] = 1;
            } else {
                field934[var0] = -1;
            }
        }
        field935 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field935[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field933 = new int[220500];
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(II)[I")
    public final int[] method325(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field933[var3] = 0;
        }
        if (arg1 < 10) {
            return field933;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field916.method311(field915);
        this.field917.method311(field915);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field918 != null) {
            this.field918.method311(field915);
            this.field919.method311(field915);
            var6 = (int) ((double) (this.field918.field888 - this.field918.field887) * 32.768D / var4);
            var7 = (int) ((double) this.field918.field887 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field920 != null) {
            this.field920.method311(field915);
            this.field921.method311(field915);
            var9 = (int) ((double) (this.field920.field888 - this.field920.field887) * 32.768D / var4);
            var10 = (int) ((double) this.field920.field887 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field924[var12] != 0) {
                field936[var12] = 0;
                field937[var12] = (int) ((double) this.field926[var12] * var4);
                field938[var12] = (this.field924[var12] << 14) / 100;
                field939[var12] = (int) ((double) (this.field916.field888 - this.field916.field887) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field925[var12]) / var4);
                field940[var12] = (int) ((double) this.field916.field887 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field916.method312(arg0, 309);
            int var42 = this.field917.method312(arg0, 309);
            if (this.field918 != null) {
                int var43 = this.field918.method312(arg0, 309);
                int var44 = this.field919.method312(arg0, 309);
                var41 += this.method326(this.field918.field889, var8, var44, false) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field920 != null) {
                int var45 = this.field920.method312(arg0, 309);
                int var46 = this.field921.method312(arg0, 309);
                var42 = var42 * ((this.method326(this.field920.field889, var11, var46, false) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field924[var47] != 0) {
                    int var48 = field937[var47] + var13;
                    if (var48 < arg0) {
                        field933[var48] += this.method326(this.field916.field889, field936[var47], field938[var47] * var42 >> 15, false);
                        field936[var47] += (field939[var47] * var41 >> 16) + field940[var47];
                    }
                }
            }
        }
        if (this.field922 != null) {
            this.field922.method311(field915);
            this.field923.method311(field915);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field922.method312(arg0, 309);
                int var19 = this.field923.method312(arg0, 309);
                int var20;
                if (var16) {
                    var20 = ((this.field922.field888 - this.field922.field887) * var18 >> 8) + this.field922.field887;
                } else {
                    var20 = ((this.field922.field888 - this.field922.field887) * var19 >> 8) + this.field922.field887;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field933[var17] = 0;
                }
            }
        }
        if (this.field927 > 0 && this.field928 > 0) {
            int var21 = (int) ((double) this.field927 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field933[var22] += field933[var22 - var21] * this.field928 / 100;
            }
        }
        if (this.field929.field896[0] > 0 || this.field929.field896[1] > 0) {
            this.field930.method311(field915);
            int var23 = this.field930.method312(arg0 + 1, 309);
            int var24 = this.field929.method316(0, 3046, (float) var23 / 65536.0F);
            int var25 = this.field929.method316(1, 3046, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field933[var24 + var26] * (long) Filter.field903 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field933[var24 + var26 - var38 - 1] * (long) Filter.field901[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field933[var26 - var39 - 1] * (long) Filter.field901[1][var39] >> 16);
                    }
                    field933[var26] = var37;
                    var23 = this.field930.method312(arg0 + 1, 309);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field933[var24 + var26] * (long) Filter.field903 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field933[var24 + var26 - var35 - 1] * (long) Filter.field901[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field933[var26 - var36 - 1] * (long) Filter.field901[1][var36] >> 16);
                        }
                        field933[var26] = var34;
                        var23 = this.field930.method312(arg0 + 1, 309);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field933[var24 + var26 - var31 - 1] * (long) Filter.field901[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field933[var26 - var32 - 1] * (long) Filter.field901[1][var32] >> 16);
                            }
                            field933[var26] = var30;
                            this.field930.method312(arg0 + 1, 309);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field929.method316(0, 3046, (float) var23 / 65536.0F);
                    var25 = this.field929.method316(1, 3046, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field933[var40] < -32768) {
                field933[var40] = -32768;
            }
            if (field933[var40] > 32767) {
                field933[var40] = 32767;
            }
        }
        return field933;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(IIIZ)I")
    private final int method326(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            return this.field914;
        } else if (arg0 == 1) {
            return (arg1 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg0 == 2) {
            return field935[arg1 & 0x7FFF] * arg2 >> 14;
        } else if (arg0 == 3) {
            return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg0 == 4) {
            return field934[arg1 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(Llb;I)V")
    public final void method327(Packet arg0, int arg1) {
        this.field916 = new Envelope();
        this.field916.method309(arg0, 913);
        this.field917 = new Envelope();
        this.field917.method309(arg0, 913);
        int var3 = arg0.method229();
        if (var3 != 0) {
            arg0.field711--;
            this.field918 = new Envelope();
            this.field918.method309(arg0, 913);
            this.field919 = new Envelope();
            this.field919.method309(arg0, 913);
        }
        int var4 = arg0.method229();
        if (var4 != 0) {
            arg0.field711--;
            this.field920 = new Envelope();
            this.field920.method309(arg0, 913);
            this.field921 = new Envelope();
            this.field921.method309(arg0, 913);
        }
        int var5 = arg0.method229();
        if (var5 != 0) {
            arg0.field711--;
            this.field922 = new Envelope();
            this.field922.method309(arg0, 913);
            this.field923 = new Envelope();
            this.field923.method309(arg0, 913);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method243();
            if (var7 == 0) {
                break;
            }
            this.field924[var6] = var7;
            this.field925[var6] = arg0.method242();
            this.field926[var6] = arg0.method243();
        }
        this.field927 = arg0.method243();
        this.field928 = arg0.method243();
        this.field931 = arg0.method231();
        this.field932 = arg0.method231();
        this.field929 = new Filter();
        this.field930 = new Envelope();
        this.field929.method317(true, arg0, this.field930);
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
    }
}
