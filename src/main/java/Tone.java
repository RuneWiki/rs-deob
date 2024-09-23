import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class Tone {

    @OriginalMember(owner = "dc", name = "i", descriptor = "[I")
    private int[] field915 = new int[5];

    @OriginalMember(owner = "dc", name = "j", descriptor = "[I")
    private int[] field916 = new int[5];

    @OriginalMember(owner = "dc", name = "k", descriptor = "[I")
    private int[] field917 = new int[5];

    @OriginalMember(owner = "dc", name = "m", descriptor = "I")
    private int field919 = 100;

    @OriginalMember(owner = "dc", name = "n", descriptor = "I")
    public int field920 = 500;

    @OriginalMember(owner = "dc", name = "s", descriptor = "[I")
    private static int[] field925 = new int[5];

    @OriginalMember(owner = "dc", name = "t", descriptor = "[I")
    private static int[] field926 = new int[5];

    @OriginalMember(owner = "dc", name = "u", descriptor = "[I")
    private static int[] field927 = new int[5];

    @OriginalMember(owner = "dc", name = "v", descriptor = "[I")
    private static int[] field928 = new int[5];

    @OriginalMember(owner = "dc", name = "w", descriptor = "[I")
    private static int[] field929 = new int[5];

    @OriginalMember(owner = "dc", name = "l", descriptor = "I")
    private int field918;

    @OriginalMember(owner = "dc", name = "o", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "dc", name = "x", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "dc", name = "a", descriptor = "Lbc;")
    private Envelope field907;

    @OriginalMember(owner = "dc", name = "b", descriptor = "Lbc;")
    private Envelope field908;

    @OriginalMember(owner = "dc", name = "c", descriptor = "Lbc;")
    private Envelope field909;

    @OriginalMember(owner = "dc", name = "d", descriptor = "Lbc;")
    private Envelope field910;

    @OriginalMember(owner = "dc", name = "e", descriptor = "Lbc;")
    private Envelope field911;

    @OriginalMember(owner = "dc", name = "f", descriptor = "Lbc;")
    private Envelope field912;

    @OriginalMember(owner = "dc", name = "g", descriptor = "Lbc;")
    private Envelope field913;

    @OriginalMember(owner = "dc", name = "h", descriptor = "Lbc;")
    private Envelope field914;

    @OriginalMember(owner = "dc", name = "p", descriptor = "[I")
    private static int[] field922;

    @OriginalMember(owner = "dc", name = "q", descriptor = "[I")
    private static int[] field923;

    @OriginalMember(owner = "dc", name = "r", descriptor = "[I")
    private static int[] field924;

    @OriginalMember(owner = "dc", name = "a", descriptor = "()V")
    public static final void method328() {
        field923 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field923[var0] = 1;
            } else {
                field923[var0] = -1;
            }
        }
        field924 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field924[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field922 = new int[220500];
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(II)[I")
    public final int[] method329(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field922[var3] = 0;
        }
        if (arg1 < 10) {
            return field922;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field907.method320(-373);
        this.field908.method320(-373);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field909 != null) {
            this.field909.method320(-373);
            this.field910.method320(-373);
            var6 = (int) ((double) (this.field909.field891 - this.field909.field890) * 32.768D / var4);
            var7 = (int) ((double) this.field909.field890 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field911 != null) {
            this.field911.method320(-373);
            this.field912.method320(-373);
            var9 = (int) ((double) (this.field911.field891 - this.field911.field890) * 32.768D / var4);
            var10 = (int) ((double) this.field911.field890 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field915[var12] != 0) {
                field925[var12] = 0;
                field926[var12] = (int) ((double) this.field917[var12] * var4);
                field927[var12] = (this.field915[var12] << 14) / 100;
                field928[var12] = (int) ((double) (this.field907.field891 - this.field907.field890) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field916[var12]) / var4);
                field929[var12] = (int) ((double) this.field907.field890 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var24 = this.field907.method321(9, arg0);
            int var25 = this.field908.method321(9, arg0);
            if (this.field909 != null) {
                int var26 = this.field909.method321(9, arg0);
                int var27 = this.field910.method321(9, arg0);
                var24 += this.method330(var8, 3, this.field909.field892, var27) >> 1;
                var8 += (var6 * var26 >> 16) + var7;
            }
            if (this.field911 != null) {
                int var28 = this.field911.method321(9, arg0);
                int var29 = this.field912.method321(9, arg0);
                var25 = var25 * ((this.method330(var11, 3, this.field911.field892, var29) >> 1) + 32768) >> 15;
                var11 += (var9 * var28 >> 16) + var10;
            }
            for (int var30 = 0; var30 < 5; var30++) {
                if (this.field915[var30] != 0) {
                    int var31 = field926[var30] + var13;
                    if (var31 < arg0) {
                        field922[var31] += this.method330(field925[var30], 3, this.field907.field892, field927[var30] * var25 >> 15);
                        field925[var30] += (field928[var30] * var24 >> 16) + field929[var30];
                    }
                }
            }
        }
        if (this.field913 != null) {
            this.field913.method320(-373);
            this.field914.method320(-373);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field913.method321(9, arg0);
                int var19 = this.field914.method321(9, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field913.field891 - this.field913.field890) * var18 >> 8) + this.field913.field890;
                } else {
                    var20 = ((this.field913.field891 - this.field913.field890) * var19 >> 8) + this.field913.field890;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field922[var17] = 0;
                }
            }
        }
        if (this.field918 > 0 && this.field919 > 0) {
            int var21 = (int) ((double) this.field918 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field922[var22] += field922[var22 - var21] * this.field919 / 100;
            }
        }
        for (int var23 = 0; var23 < arg0; var23++) {
            if (field922[var23] < -32768) {
                field922[var23] = -32768;
            }
            if (field922[var23] > 32767) {
                field922[var23] = 32767;
            }
        }
        return field922;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(IIII)I")
    private final int method330(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 3 || arg1 > 3) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg3 : -arg3;
        } else if (arg2 == 2) {
            return field924[arg0 & 0x7FFF] * arg3 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg3 >> 14) - arg3;
        } else if (arg2 == 4) {
            return field923[arg0 / 2607 & 0x7FFF] * arg3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(ILmb;)V")
    public final void method331(int arg0, Packet arg1) {
        this.field907 = new Envelope();
        this.field907.method319(891, arg1);
        this.field908 = new Envelope();
        this.field908.method319(891, arg1);
        int var3 = arg1.method239();
        if (var3 != 0) {
            arg1.field717--;
            this.field909 = new Envelope();
            this.field909.method319(891, arg1);
            this.field910 = new Envelope();
            this.field910.method319(891, arg1);
        }
        int var4 = arg1.method239();
        if (var4 != 0) {
            arg1.field717--;
            this.field911 = new Envelope();
            this.field911.method319(891, arg1);
            this.field912 = new Envelope();
            this.field912.method319(891, arg1);
        }
        int var5 = arg1.method239();
        if (arg0 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (var5 != 0) {
            arg1.field717--;
            this.field913 = new Envelope();
            this.field913.method319(891, arg1);
            this.field914 = new Envelope();
            this.field914.method319(891, arg1);
        }
        for (int var7 = 0; var7 < 10; var7++) {
            int var8 = arg1.method253();
            if (var8 == 0) {
                break;
            }
            this.field915[var7] = var8;
            this.field916[var7] = arg1.method252();
            this.field917[var7] = arg1.method253();
        }
        this.field918 = arg1.method253();
        this.field919 = arg1.method253();
        this.field920 = arg1.method241();
        this.field921 = arg1.method241();
    }
}
