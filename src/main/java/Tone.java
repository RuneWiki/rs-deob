import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class Tone {

    @OriginalMember(owner = "dc", name = "a", descriptor = "Z")
    private boolean field909 = true;

    @OriginalMember(owner = "dc", name = "k", descriptor = "[I")
    private int[] field919 = new int[5];

    @OriginalMember(owner = "dc", name = "l", descriptor = "[I")
    private int[] field920 = new int[5];

    @OriginalMember(owner = "dc", name = "m", descriptor = "[I")
    private int[] field921 = new int[5];

    @OriginalMember(owner = "dc", name = "o", descriptor = "I")
    private int field923 = 100;

    @OriginalMember(owner = "dc", name = "p", descriptor = "I")
    public int field924 = 500;

    @OriginalMember(owner = "dc", name = "b", descriptor = "I")
    private static int field910 = 6;

    @OriginalMember(owner = "dc", name = "u", descriptor = "[I")
    private static int[] field929 = new int[5];

    @OriginalMember(owner = "dc", name = "v", descriptor = "[I")
    private static int[] field930 = new int[5];

    @OriginalMember(owner = "dc", name = "w", descriptor = "[I")
    private static int[] field931 = new int[5];

    @OriginalMember(owner = "dc", name = "x", descriptor = "[I")
    private static int[] field932 = new int[5];

    @OriginalMember(owner = "dc", name = "y", descriptor = "[I")
    private static int[] field933 = new int[5];

    @OriginalMember(owner = "dc", name = "n", descriptor = "I")
    private int field922;

    @OriginalMember(owner = "dc", name = "q", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "dc", name = "z", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "dc", name = "c", descriptor = "Lbc;")
    private Envelope field911;

    @OriginalMember(owner = "dc", name = "d", descriptor = "Lbc;")
    private Envelope field912;

    @OriginalMember(owner = "dc", name = "e", descriptor = "Lbc;")
    private Envelope field913;

    @OriginalMember(owner = "dc", name = "f", descriptor = "Lbc;")
    private Envelope field914;

    @OriginalMember(owner = "dc", name = "g", descriptor = "Lbc;")
    private Envelope field915;

    @OriginalMember(owner = "dc", name = "h", descriptor = "Lbc;")
    private Envelope field916;

    @OriginalMember(owner = "dc", name = "i", descriptor = "Lbc;")
    private Envelope field917;

    @OriginalMember(owner = "dc", name = "j", descriptor = "Lbc;")
    private Envelope field918;

    @OriginalMember(owner = "dc", name = "r", descriptor = "[I")
    private static int[] field926;

    @OriginalMember(owner = "dc", name = "s", descriptor = "[I")
    private static int[] field927;

    @OriginalMember(owner = "dc", name = "t", descriptor = "[I")
    private static int[] field928;

    @OriginalMember(owner = "dc", name = "a", descriptor = "()V")
    public static final void method327() {
        field927 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field927[var0] = 1;
            } else {
                field927[var0] = -1;
            }
        }
        field928 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field928[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field926 = new int[220500];
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(II)[I")
    public final int[] method328(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field926[var3] = 0;
        }
        if (arg1 < 10) {
            return field926;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field911.method319((byte) 3);
        this.field912.method319((byte) 3);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field913 != null) {
            this.field913.method319((byte) 3);
            this.field914.method319((byte) 3);
            var6 = (int) ((double) (this.field913.field892 - this.field913.field891) * 32.768D / var4);
            var7 = (int) ((double) this.field913.field891 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field915 != null) {
            this.field915.method319((byte) 3);
            this.field916.method319((byte) 3);
            var9 = (int) ((double) (this.field915.field892 - this.field915.field891) * 32.768D / var4);
            var10 = (int) ((double) this.field915.field891 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field919[var12] != 0) {
                field929[var12] = 0;
                field930[var12] = (int) ((double) this.field921[var12] * var4);
                field931[var12] = (this.field919[var12] << 14) / 100;
                field932[var12] = (int) ((double) (this.field911.field892 - this.field911.field891) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field920[var12]) / var4);
                field933[var12] = (int) ((double) this.field911.field891 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var24 = this.field911.method320(arg0, field910);
            int var25 = this.field912.method320(arg0, field910);
            if (this.field913 != null) {
                int var26 = this.field913.method320(arg0, field910);
                int var27 = this.field914.method320(arg0, field910);
                var24 += this.method329(this.field913.field893, var27, var8, 2) >> 1;
                var8 += (var6 * var26 >> 16) + var7;
            }
            if (this.field915 != null) {
                int var28 = this.field915.method320(arg0, field910);
                int var29 = this.field916.method320(arg0, field910);
                var25 = var25 * ((this.method329(this.field915.field893, var29, var11, 2) >> 1) + 32768) >> 15;
                var11 += (var9 * var28 >> 16) + var10;
            }
            for (int var30 = 0; var30 < 5; var30++) {
                if (this.field919[var30] != 0) {
                    int var31 = field930[var30] + var13;
                    if (var31 < arg0) {
                        field926[var31] += this.method329(this.field911.field893, field931[var30] * var25 >> 15, field929[var30], 2);
                        field929[var30] += (field932[var30] * var24 >> 16) + field933[var30];
                    }
                }
            }
        }
        if (this.field917 != null) {
            this.field917.method319((byte) 3);
            this.field918.method319((byte) 3);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field917.method320(arg0, field910);
                int var19 = this.field918.method320(arg0, field910);
                int var20;
                if (var16) {
                    var20 = ((this.field917.field892 - this.field917.field891) * var18 >> 8) + this.field917.field891;
                } else {
                    var20 = ((this.field917.field892 - this.field917.field891) * var19 >> 8) + this.field917.field891;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field926[var17] = 0;
                }
            }
        }
        if (this.field922 > 0 && this.field923 > 0) {
            int var21 = (int) ((double) this.field922 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field926[var22] += field926[var22 - var21] * this.field923 / 100;
            }
        }
        for (int var23 = 0; var23 < arg0; var23++) {
            if (field926[var23] < -32768) {
                field926[var23] = -32768;
            }
            if (field926[var23] > 32767) {
                field926[var23] = 32767;
            }
        }
        return field926;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(IIII)I")
    private final int method329(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 2) {
            this.field909 = !this.field909;
        }
        if (arg0 == 1) {
            return (arg2 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg0 == 2) {
            return field928[arg2 & 0x7FFF] * arg1 >> 14;
        } else if (arg0 == 3) {
            return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg0 == 4) {
            return field927[arg2 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(ILmb;)V")
    public final void method330(int arg0, Packet arg1) {
        this.field911 = new Envelope();
        this.field911.method318(168, arg1);
        this.field912 = new Envelope();
        this.field912.method318(168, arg1);
        int var3 = arg1.method238();
        if (var3 != 0) {
            arg1.field719--;
            this.field913 = new Envelope();
            this.field913.method318(168, arg1);
            this.field914 = new Envelope();
            this.field914.method318(168, arg1);
        }
        int var4 = arg1.method238();
        int var5 = 82 / arg0;
        if (var4 != 0) {
            arg1.field719--;
            this.field915 = new Envelope();
            this.field915.method318(168, arg1);
            this.field916 = new Envelope();
            this.field916.method318(168, arg1);
        }
        int var6 = arg1.method238();
        if (var6 != 0) {
            arg1.field719--;
            this.field917 = new Envelope();
            this.field917.method318(168, arg1);
            this.field918 = new Envelope();
            this.field918.method318(168, arg1);
        }
        for (int var7 = 0; var7 < 10; var7++) {
            int var8 = arg1.method252();
            if (var8 == 0) {
                break;
            }
            this.field919[var7] = var8;
            this.field920[var7] = arg1.method251();
            this.field921[var7] = arg1.method252();
        }
        this.field922 = arg1.method252();
        this.field923 = arg1.method252();
        this.field924 = arg1.method240();
        this.field925 = arg1.method240();
    }
}
