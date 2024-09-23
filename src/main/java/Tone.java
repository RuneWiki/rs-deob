import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class Tone {

    @OriginalMember(owner = "dc", name = "i", descriptor = "[I")
    private int[] field916 = new int[5];

    @OriginalMember(owner = "dc", name = "j", descriptor = "[I")
    private int[] field917 = new int[5];

    @OriginalMember(owner = "dc", name = "k", descriptor = "[I")
    private int[] field918 = new int[5];

    @OriginalMember(owner = "dc", name = "m", descriptor = "I")
    private int field920 = 100;

    @OriginalMember(owner = "dc", name = "p", descriptor = "I")
    public int field923 = 500;

    @OriginalMember(owner = "dc", name = "u", descriptor = "[I")
    private static int[] field928 = new int[5];

    @OriginalMember(owner = "dc", name = "v", descriptor = "[I")
    private static int[] field929 = new int[5];

    @OriginalMember(owner = "dc", name = "w", descriptor = "[I")
    private static int[] field930 = new int[5];

    @OriginalMember(owner = "dc", name = "x", descriptor = "[I")
    private static int[] field931 = new int[5];

    @OriginalMember(owner = "dc", name = "y", descriptor = "[I")
    private static int[] field932 = new int[5];

    @OriginalMember(owner = "dc", name = "l", descriptor = "I")
    private int field919;

    @OriginalMember(owner = "dc", name = "q", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "dc", name = "a", descriptor = "Lac;")
    private Envelope field908;

    @OriginalMember(owner = "dc", name = "b", descriptor = "Lac;")
    private Envelope field909;

    @OriginalMember(owner = "dc", name = "c", descriptor = "Lac;")
    private Envelope field910;

    @OriginalMember(owner = "dc", name = "d", descriptor = "Lac;")
    private Envelope field911;

    @OriginalMember(owner = "dc", name = "e", descriptor = "Lac;")
    private Envelope field912;

    @OriginalMember(owner = "dc", name = "f", descriptor = "Lac;")
    private Envelope field913;

    @OriginalMember(owner = "dc", name = "g", descriptor = "Lac;")
    private Envelope field914;

    @OriginalMember(owner = "dc", name = "h", descriptor = "Lac;")
    private Envelope field915;

    @OriginalMember(owner = "dc", name = "o", descriptor = "Lac;")
    private Envelope field922;

    @OriginalMember(owner = "dc", name = "n", descriptor = "Lbc;")
    private Filter field921;

    @OriginalMember(owner = "dc", name = "r", descriptor = "[I")
    private static int[] field925;

    @OriginalMember(owner = "dc", name = "s", descriptor = "[I")
    private static int[] field926;

    @OriginalMember(owner = "dc", name = "t", descriptor = "[I")
    private static int[] field927;

    @OriginalMember(owner = "dc", name = "a", descriptor = "()V")
    public static final void method324() {
        field926 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field926[var0] = 1;
            } else {
                field926[var0] = -1;
            }
        }
        field927 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field927[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field925 = new int[220500];
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(II)[I")
    public final int[] method325(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field925[var3] = 0;
        }
        if (arg1 < 10) {
            return field925;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field908.method311(false);
        this.field909.method311(false);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field910 != null) {
            this.field910.method311(false);
            this.field911.method311(false);
            var6 = (int) ((double) (this.field910.field879 - this.field910.field878) * 32.768D / var4);
            var7 = (int) ((double) this.field910.field878 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field912 != null) {
            this.field912.method311(false);
            this.field913.method311(false);
            var9 = (int) ((double) (this.field912.field879 - this.field912.field878) * 32.768D / var4);
            var10 = (int) ((double) this.field912.field878 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field916[var12] != 0) {
                field928[var12] = 0;
                field929[var12] = (int) ((double) this.field918[var12] * var4);
                field930[var12] = (this.field916[var12] << 14) / 100;
                field931[var12] = (int) ((double) (this.field908.field879 - this.field908.field878) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field917[var12]) / var4);
                field932[var12] = (int) ((double) this.field908.field878 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field908.method312(arg0, -936);
            int var42 = this.field909.method312(arg0, -936);
            if (this.field910 != null) {
                int var43 = this.field910.method312(arg0, -936);
                int var44 = this.field911.method312(arg0, -936);
                var41 += this.method326(this.field910.field880, var8, false, var44) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field912 != null) {
                int var45 = this.field912.method312(arg0, -936);
                int var46 = this.field913.method312(arg0, -936);
                var42 = var42 * ((this.method326(this.field912.field880, var11, false, var46) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field916[var47] != 0) {
                    int var48 = field929[var47] + var13;
                    if (var48 < arg0) {
                        field925[var48] += this.method326(this.field908.field880, field928[var47], false, field930[var47] * var42 >> 15);
                        field928[var47] += (field931[var47] * var41 >> 16) + field932[var47];
                    }
                }
            }
        }
        if (this.field914 != null) {
            this.field914.method311(false);
            this.field915.method311(false);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field914.method312(arg0, -936);
                int var19 = this.field915.method312(arg0, -936);
                int var20;
                if (var16) {
                    var20 = ((this.field914.field879 - this.field914.field878) * var18 >> 8) + this.field914.field878;
                } else {
                    var20 = ((this.field914.field879 - this.field914.field878) * var19 >> 8) + this.field914.field878;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field925[var17] = 0;
                }
            }
        }
        if (this.field919 > 0 && this.field920 > 0) {
            int var21 = (int) ((double) this.field919 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field925[var22] += field925[var22 - var21] * this.field920 / 100;
            }
        }
        if (this.field921.field889[0] > 0 || this.field921.field889[1] > 0) {
            this.field922.method311(false);
            int var23 = this.field922.method312(arg0 + 1, -936);
            int var24 = this.field921.method316((float) var23 / 65536.0F, 3, 0);
            int var25 = this.field921.method316((float) var23 / 65536.0F, 3, 1);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field925[var24 + var26] * (long) Filter.field896 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field925[var24 + var26 - var38 - 1] * (long) Filter.field894[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field925[var26 - var39 - 1] * (long) Filter.field894[1][var39] >> 16);
                    }
                    field925[var26] = var37;
                    var23 = this.field922.method312(arg0 + 1, -936);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field925[var24 + var26] * (long) Filter.field896 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field925[var24 + var26 - var35 - 1] * (long) Filter.field894[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field925[var26 - var36 - 1] * (long) Filter.field894[1][var36] >> 16);
                        }
                        field925[var26] = var34;
                        var23 = this.field922.method312(arg0 + 1, -936);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field925[var24 + var26 - var31 - 1] * (long) Filter.field894[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field925[var26 - var32 - 1] * (long) Filter.field894[1][var32] >> 16);
                            }
                            field925[var26] = var30;
                            this.field922.method312(arg0 + 1, -936);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field921.method316((float) var23 / 65536.0F, 3, 0);
                    var25 = this.field921.method316((float) var23 / 65536.0F, 3, 1);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field925[var40] < -32768) {
                field925[var40] = -32768;
            }
            if (field925[var40] > 32767) {
                field925[var40] = 32767;
            }
        }
        return field925;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(IIZI)I")
    private final int method326(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg0 == 1) {
            return (arg1 & 0x7FFF) < 16384 ? arg3 : -arg3;
        } else if (arg0 == 2) {
            return field927[arg1 & 0x7FFF] * arg3 >> 14;
        } else if (arg0 == 3) {
            return ((arg1 & 0x7FFF) * arg3 >> 14) - arg3;
        } else if (arg0 == 4) {
            return field926[arg1 / 2607 & 0x7FFF] * arg3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(ILlb;)V")
    public final void method327(int arg0, Packet arg1) {
        this.field908 = new Envelope();
        this.field908.method309(8, arg1);
        this.field909 = new Envelope();
        this.field909.method309(8, arg1);
        if (arg0 < 8 || arg0 > 8) {
            throw new NullPointerException();
        }
        int var3 = arg1.method229();
        if (var3 != 0) {
            arg1.field703--;
            this.field910 = new Envelope();
            this.field910.method309(8, arg1);
            this.field911 = new Envelope();
            this.field911.method309(8, arg1);
        }
        int var4 = arg1.method229();
        if (var4 != 0) {
            arg1.field703--;
            this.field912 = new Envelope();
            this.field912.method309(8, arg1);
            this.field913 = new Envelope();
            this.field913.method309(8, arg1);
        }
        int var5 = arg1.method229();
        if (var5 != 0) {
            arg1.field703--;
            this.field914 = new Envelope();
            this.field914.method309(8, arg1);
            this.field915 = new Envelope();
            this.field915.method309(8, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method243();
            if (var7 == 0) {
                break;
            }
            this.field916[var6] = var7;
            this.field917[var6] = arg1.method242();
            this.field918[var6] = arg1.method243();
        }
        this.field919 = arg1.method243();
        this.field920 = arg1.method243();
        this.field923 = arg1.method231();
        this.field924 = arg1.method231();
        this.field921 = new Filter();
        this.field922 = new Envelope();
        this.field921.method317(this.field922, arg1, 12249);
    }
}
