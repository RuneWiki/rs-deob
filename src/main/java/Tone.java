import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class Tone {

    @OriginalMember(owner = "dc", name = "a", descriptor = "I")
    private int field907 = -856;

    @OriginalMember(owner = "dc", name = "b", descriptor = "Z")
    private boolean field908 = false;

    @OriginalMember(owner = "dc", name = "l", descriptor = "[I")
    private int[] field918 = new int[5];

    @OriginalMember(owner = "dc", name = "m", descriptor = "[I")
    private int[] field919 = new int[5];

    @OriginalMember(owner = "dc", name = "n", descriptor = "[I")
    private int[] field920 = new int[5];

    @OriginalMember(owner = "dc", name = "p", descriptor = "I")
    private int field922 = 100;

    @OriginalMember(owner = "dc", name = "q", descriptor = "I")
    public int field923 = 500;

    @OriginalMember(owner = "dc", name = "c", descriptor = "B")
    private static byte field909 = 5;

    @OriginalMember(owner = "dc", name = "v", descriptor = "[I")
    private static int[] field928 = new int[5];

    @OriginalMember(owner = "dc", name = "w", descriptor = "[I")
    private static int[] field929 = new int[5];

    @OriginalMember(owner = "dc", name = "x", descriptor = "[I")
    private static int[] field930 = new int[5];

    @OriginalMember(owner = "dc", name = "y", descriptor = "[I")
    private static int[] field931 = new int[5];

    @OriginalMember(owner = "dc", name = "z", descriptor = "[I")
    private static int[] field932 = new int[5];

    @OriginalMember(owner = "dc", name = "o", descriptor = "I")
    private int field921;

    @OriginalMember(owner = "dc", name = "r", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "dc", name = "A", descriptor = "I")
    public static int field933;

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

    @OriginalMember(owner = "dc", name = "i", descriptor = "Lbc;")
    private Envelope field915;

    @OriginalMember(owner = "dc", name = "j", descriptor = "Lbc;")
    private Envelope field916;

    @OriginalMember(owner = "dc", name = "k", descriptor = "Lbc;")
    private Envelope field917;

    @OriginalMember(owner = "dc", name = "s", descriptor = "[I")
    private static int[] field925;

    @OriginalMember(owner = "dc", name = "t", descriptor = "[I")
    private static int[] field926;

    @OriginalMember(owner = "dc", name = "u", descriptor = "[I")
    private static int[] field927;

    @OriginalMember(owner = "dc", name = "a", descriptor = "()V")
    public static final void method327() {
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
    public final int[] method328(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field925[var3] = 0;
        }
        if (arg1 < 10) {
            return field925;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field910.method319(field909);
        this.field911.method319(field909);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field912 != null) {
            this.field912.method319(field909);
            this.field913.method319(field909);
            var6 = (int) ((double) (this.field912.field891 - this.field912.field890) * 32.768D / var4);
            var7 = (int) ((double) this.field912.field890 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field914 != null) {
            this.field914.method319(field909);
            this.field915.method319(field909);
            var9 = (int) ((double) (this.field914.field891 - this.field914.field890) * 32.768D / var4);
            var10 = (int) ((double) this.field914.field890 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field918[var12] != 0) {
                field928[var12] = 0;
                field929[var12] = (int) ((double) this.field920[var12] * var4);
                field930[var12] = (this.field918[var12] << 14) / 100;
                field931[var12] = (int) ((double) (this.field910.field891 - this.field910.field890) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field919[var12]) / var4);
                field932[var12] = (int) ((double) this.field910.field890 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var24 = this.field910.method320(370, arg0);
            int var25 = this.field911.method320(370, arg0);
            if (this.field912 != null) {
                int var26 = this.field912.method320(370, arg0);
                int var27 = this.field913.method320(370, arg0);
                var24 += this.method329(38283, var27, this.field912.field892, var8) >> 1;
                var8 += (var6 * var26 >> 16) + var7;
            }
            if (this.field914 != null) {
                int var28 = this.field914.method320(370, arg0);
                int var29 = this.field915.method320(370, arg0);
                var25 = var25 * ((this.method329(38283, var29, this.field914.field892, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var28 >> 16) + var10;
            }
            for (int var30 = 0; var30 < 5; var30++) {
                if (this.field918[var30] != 0) {
                    int var31 = field929[var30] + var13;
                    if (var31 < arg0) {
                        field925[var31] += this.method329(38283, field930[var30] * var25 >> 15, this.field910.field892, field928[var30]);
                        field928[var30] += (field931[var30] * var24 >> 16) + field932[var30];
                    }
                }
            }
        }
        if (this.field916 != null) {
            this.field916.method319(field909);
            this.field917.method319(field909);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field916.method320(370, arg0);
                int var19 = this.field917.method320(370, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field916.field891 - this.field916.field890) * var18 >> 8) + this.field916.field890;
                } else {
                    var20 = ((this.field916.field891 - this.field916.field890) * var19 >> 8) + this.field916.field890;
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
        if (this.field921 > 0 && this.field922 > 0) {
            int var21 = (int) ((double) this.field921 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field925[var22] += field925[var22 - var21] * this.field922 / 100;
            }
        }
        for (int var23 = 0; var23 < arg0; var23++) {
            if (field925[var23] < -32768) {
                field925[var23] = -32768;
            }
            if (field925[var23] > 32767) {
                field925[var23] = 32767;
            }
        }
        return field925;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(IIII)I")
    private final int method329(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 38283) {
            this.field907 = -283;
        }
        if (arg2 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field927[arg3 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg3 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field926[arg3 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(ZLmb;)V")
    public final void method330(boolean arg0, Packet arg1) {
        this.field910 = new Envelope();
        this.field910.method318(true, arg1);
        this.field911 = new Envelope();
        this.field911.method318(true, arg1);
        int var3 = arg1.method238();
        if (var3 != 0) {
            arg1.field713--;
            this.field912 = new Envelope();
            this.field912.method318(true, arg1);
            this.field913 = new Envelope();
            this.field913.method318(true, arg1);
        }
        int var4 = arg1.method238();
        if (var4 != 0) {
            arg1.field713--;
            this.field914 = new Envelope();
            this.field914.method318(true, arg1);
            this.field915 = new Envelope();
            this.field915.method318(true, arg1);
        }
        int var5 = arg1.method238();
        if (!arg0) {
            this.field908 = !this.field908;
        }
        if (var5 != 0) {
            arg1.field713--;
            this.field916 = new Envelope();
            this.field916.method318(true, arg1);
            this.field917 = new Envelope();
            this.field917.method318(true, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method252();
            if (var7 == 0) {
                break;
            }
            this.field918[var6] = var7;
            this.field919[var6] = arg1.method251();
            this.field920[var6] = arg1.method252();
        }
        this.field921 = arg1.method252();
        this.field922 = arg1.method252();
        this.field923 = arg1.method240();
        this.field924 = arg1.method240();
    }
}
