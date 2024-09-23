import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class Tone {

    @OriginalMember(owner = "dc", name = "a", descriptor = "I")
    private int field900 = 9;

    @OriginalMember(owner = "dc", name = "b", descriptor = "I")
    private int field901 = 614;

    @OriginalMember(owner = "dc", name = "k", descriptor = "[I")
    private int[] field910 = new int[5];

    @OriginalMember(owner = "dc", name = "l", descriptor = "[I")
    private int[] field911 = new int[5];

    @OriginalMember(owner = "dc", name = "m", descriptor = "[I")
    private int[] field912 = new int[5];

    @OriginalMember(owner = "dc", name = "o", descriptor = "I")
    private int field914 = 100;

    @OriginalMember(owner = "dc", name = "p", descriptor = "I")
    public int field915 = 500;

    @OriginalMember(owner = "dc", name = "u", descriptor = "[I")
    private static int[] field920 = new int[5];

    @OriginalMember(owner = "dc", name = "v", descriptor = "[I")
    private static int[] field921 = new int[5];

    @OriginalMember(owner = "dc", name = "w", descriptor = "[I")
    private static int[] field922 = new int[5];

    @OriginalMember(owner = "dc", name = "x", descriptor = "[I")
    private static int[] field923 = new int[5];

    @OriginalMember(owner = "dc", name = "y", descriptor = "[I")
    private static int[] field924 = new int[5];

    @OriginalMember(owner = "dc", name = "n", descriptor = "I")
    private int field913;

    @OriginalMember(owner = "dc", name = "q", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "dc", name = "z", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "dc", name = "c", descriptor = "Lbc;")
    private Envelope field902;

    @OriginalMember(owner = "dc", name = "d", descriptor = "Lbc;")
    private Envelope field903;

    @OriginalMember(owner = "dc", name = "e", descriptor = "Lbc;")
    private Envelope field904;

    @OriginalMember(owner = "dc", name = "f", descriptor = "Lbc;")
    private Envelope field905;

    @OriginalMember(owner = "dc", name = "g", descriptor = "Lbc;")
    private Envelope field906;

    @OriginalMember(owner = "dc", name = "h", descriptor = "Lbc;")
    private Envelope field907;

    @OriginalMember(owner = "dc", name = "i", descriptor = "Lbc;")
    private Envelope field908;

    @OriginalMember(owner = "dc", name = "j", descriptor = "Lbc;")
    private Envelope field909;

    @OriginalMember(owner = "dc", name = "r", descriptor = "[I")
    private static int[] field917;

    @OriginalMember(owner = "dc", name = "s", descriptor = "[I")
    private static int[] field918;

    @OriginalMember(owner = "dc", name = "t", descriptor = "[I")
    private static int[] field919;

    @OriginalMember(owner = "dc", name = "a", descriptor = "()V")
    public static final void method328() {
        field918 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field918[var0] = 1;
            } else {
                field918[var0] = -1;
            }
        }
        field919 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field919[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field917 = new int[220500];
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(II)[I")
    public final int[] method329(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field917[var3] = 0;
        }
        if (arg1 < 10) {
            return field917;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field902.method320(7);
        this.field903.method320(7);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field904 != null) {
            this.field904.method320(7);
            this.field905.method320(7);
            var6 = (int) ((double) (this.field904.field885 - this.field904.field884) * 32.768D / var4);
            var7 = (int) ((double) this.field904.field884 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field906 != null) {
            this.field906.method320(7);
            this.field907.method320(7);
            var9 = (int) ((double) (this.field906.field885 - this.field906.field884) * 32.768D / var4);
            var10 = (int) ((double) this.field906.field884 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field910[var12] != 0) {
                field920[var12] = 0;
                field921[var12] = (int) ((double) this.field912[var12] * var4);
                field922[var12] = (this.field910[var12] << 14) / 100;
                field923[var12] = (int) ((double) (this.field902.field885 - this.field902.field884) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field911[var12]) / var4);
                field924[var12] = (int) ((double) this.field902.field884 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var24 = this.field902.method321(arg0, -71);
            int var25 = this.field903.method321(arg0, -71);
            if (this.field904 != null) {
                int var26 = this.field904.method321(arg0, -71);
                int var27 = this.field905.method321(arg0, -71);
                var24 += this.method330(this.field904.field886, (byte) 18, var27, var8) >> 1;
                var8 += (var6 * var26 >> 16) + var7;
            }
            if (this.field906 != null) {
                int var28 = this.field906.method321(arg0, -71);
                int var29 = this.field907.method321(arg0, -71);
                var25 = var25 * ((this.method330(this.field906.field886, (byte) 18, var29, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var28 >> 16) + var10;
            }
            for (int var30 = 0; var30 < 5; var30++) {
                if (this.field910[var30] != 0) {
                    int var31 = field921[var30] + var13;
                    if (var31 < arg0) {
                        field917[var31] += this.method330(this.field902.field886, (byte) 18, field922[var30] * var25 >> 15, field920[var30]);
                        field920[var30] += (field923[var30] * var24 >> 16) + field924[var30];
                    }
                }
            }
        }
        if (this.field908 != null) {
            this.field908.method320(7);
            this.field909.method320(7);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field908.method321(arg0, -71);
                int var19 = this.field909.method321(arg0, -71);
                int var20;
                if (var16) {
                    var20 = ((this.field908.field885 - this.field908.field884) * var18 >> 8) + this.field908.field884;
                } else {
                    var20 = ((this.field908.field885 - this.field908.field884) * var19 >> 8) + this.field908.field884;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field917[var17] = 0;
                }
            }
        }
        if (this.field913 > 0 && this.field914 > 0) {
            int var21 = (int) ((double) this.field913 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field917[var22] += field917[var22 - var21] * this.field914 / 100;
            }
        }
        for (int var23 = 0; var23 < arg0; var23++) {
            if (field917[var23] < -32768) {
                field917[var23] = -32768;
            }
            if (field917[var23] > 32767) {
                field917[var23] = 32767;
            }
        }
        return field917;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(IBII)I")
    private final int method330(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 18) {
            this.field901 = -327;
        }
        if (arg0 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg0 == 2) {
            return field919[arg3 & 0x7FFF] * arg2 >> 14;
        } else if (arg0 == 3) {
            return ((arg3 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg0 == 4) {
            return field918[arg3 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(ILmb;)V")
    public final void method331(int arg0, Packet arg1) {
        this.field902 = new Envelope();
        this.field902.method319(9, arg1);
        this.field903 = new Envelope();
        this.field903.method319(9, arg1);
        int var3 = arg1.method239();
        if (var3 != 0) {
            arg1.field711--;
            this.field904 = new Envelope();
            this.field904.method319(9, arg1);
            this.field905 = new Envelope();
            this.field905.method319(9, arg1);
        }
        int var4 = arg1.method239();
        if (var4 != 0) {
            arg1.field711--;
            this.field906 = new Envelope();
            this.field906.method319(9, arg1);
            this.field907 = new Envelope();
            this.field907.method319(9, arg1);
        }
        int var5 = arg1.method239();
        if (var5 != 0) {
            arg1.field711--;
            this.field908 = new Envelope();
            this.field908.method319(9, arg1);
            this.field909 = new Envelope();
            this.field909.method319(9, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method253();
            if (var7 == 0) {
                break;
            }
            this.field910[var6] = var7;
            this.field911[var6] = arg1.method252();
            this.field912[var6] = arg1.method253();
        }
        this.field913 = arg1.method253();
        this.field914 = arg1.method253();
        this.field915 = arg1.method241();
        if (arg0 != 9) {
            this.field900 = -185;
        }
        this.field916 = arg1.method241();
    }
}
