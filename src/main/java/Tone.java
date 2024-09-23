import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class Tone {

    @OriginalMember(owner = "dc", name = "j", descriptor = "[I")
    private int[] field943 = new int[5];

    @OriginalMember(owner = "dc", name = "k", descriptor = "[I")
    private int[] field944 = new int[5];

    @OriginalMember(owner = "dc", name = "l", descriptor = "[I")
    private int[] field945 = new int[5];

    @OriginalMember(owner = "dc", name = "n", descriptor = "I")
    private int field947 = 100;

    @OriginalMember(owner = "dc", name = "o", descriptor = "I")
    public int field948 = 500;

    @OriginalMember(owner = "dc", name = "a", descriptor = "I")
    private static int field934 = -101;

    @OriginalMember(owner = "dc", name = "t", descriptor = "[I")
    private static int[] field953 = new int[5];

    @OriginalMember(owner = "dc", name = "u", descriptor = "[I")
    private static int[] field954 = new int[5];

    @OriginalMember(owner = "dc", name = "v", descriptor = "[I")
    private static int[] field955 = new int[5];

    @OriginalMember(owner = "dc", name = "w", descriptor = "[I")
    private static int[] field956 = new int[5];

    @OriginalMember(owner = "dc", name = "x", descriptor = "[I")
    private static int[] field957 = new int[5];

    @OriginalMember(owner = "dc", name = "m", descriptor = "I")
    private int field946;

    @OriginalMember(owner = "dc", name = "p", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "dc", name = "y", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "dc", name = "b", descriptor = "Lbc;")
    private Envelope field935;

    @OriginalMember(owner = "dc", name = "c", descriptor = "Lbc;")
    private Envelope field936;

    @OriginalMember(owner = "dc", name = "d", descriptor = "Lbc;")
    private Envelope field937;

    @OriginalMember(owner = "dc", name = "e", descriptor = "Lbc;")
    private Envelope field938;

    @OriginalMember(owner = "dc", name = "f", descriptor = "Lbc;")
    private Envelope field939;

    @OriginalMember(owner = "dc", name = "g", descriptor = "Lbc;")
    private Envelope field940;

    @OriginalMember(owner = "dc", name = "h", descriptor = "Lbc;")
    private Envelope field941;

    @OriginalMember(owner = "dc", name = "i", descriptor = "Lbc;")
    private Envelope field942;

    @OriginalMember(owner = "dc", name = "q", descriptor = "[I")
    private static int[] field950;

    @OriginalMember(owner = "dc", name = "r", descriptor = "[I")
    private static int[] field951;

    @OriginalMember(owner = "dc", name = "s", descriptor = "[I")
    private static int[] field952;

    @OriginalMember(owner = "dc", name = "a", descriptor = "()V")
    public static final void method328() {
        field951 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field951[var0] = 1;
            } else {
                field951[var0] = -1;
            }
        }
        field952 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field952[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field950 = new int[220500];
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(II)[I")
    public final int[] method329(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field950[var3] = 0;
        }
        if (arg1 < 10) {
            return field950;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field935.method320(field934);
        this.field936.method320(field934);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field937 != null) {
            this.field937.method320(field934);
            this.field938.method320(field934);
            var6 = (int) ((double) (this.field937.field916 - this.field937.field915) * 32.768D / var4);
            var7 = (int) ((double) this.field937.field915 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field939 != null) {
            this.field939.method320(field934);
            this.field940.method320(field934);
            var9 = (int) ((double) (this.field939.field916 - this.field939.field915) * 32.768D / var4);
            var10 = (int) ((double) this.field939.field915 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field943[var12] != 0) {
                field953[var12] = 0;
                field954[var12] = (int) ((double) this.field945[var12] * var4);
                field955[var12] = (this.field943[var12] << 14) / 100;
                field956[var12] = (int) ((double) (this.field935.field916 - this.field935.field915) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field944[var12]) / var4);
                field957[var12] = (int) ((double) this.field935.field915 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var24 = this.field935.method321(false, arg0);
            int var25 = this.field936.method321(false, arg0);
            if (this.field937 != null) {
                int var26 = this.field937.method321(false, arg0);
                int var27 = this.field938.method321(false, arg0);
                var24 += this.method330(this.field937.field917, var8, var27, 985) >> 1;
                var8 += (var6 * var26 >> 16) + var7;
            }
            if (this.field939 != null) {
                int var28 = this.field939.method321(false, arg0);
                int var29 = this.field940.method321(false, arg0);
                var25 = var25 * ((this.method330(this.field939.field917, var11, var29, 985) >> 1) + 32768) >> 15;
                var11 += (var9 * var28 >> 16) + var10;
            }
            for (int var30 = 0; var30 < 5; var30++) {
                if (this.field943[var30] != 0) {
                    int var31 = field954[var30] + var13;
                    if (var31 < arg0) {
                        field950[var31] += this.method330(this.field935.field917, field953[var30], field955[var30] * var25 >> 15, 985);
                        field953[var30] += (field956[var30] * var24 >> 16) + field957[var30];
                    }
                }
            }
        }
        if (this.field941 != null) {
            this.field941.method320(field934);
            this.field942.method320(field934);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field941.method321(false, arg0);
                int var19 = this.field942.method321(false, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field941.field916 - this.field941.field915) * var18 >> 8) + this.field941.field915;
                } else {
                    var20 = ((this.field941.field916 - this.field941.field915) * var19 >> 8) + this.field941.field915;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field950[var17] = 0;
                }
            }
        }
        if (this.field946 > 0 && this.field947 > 0) {
            int var21 = (int) ((double) this.field946 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field950[var22] += field950[var22 - var21] * this.field947 / 100;
            }
        }
        for (int var23 = 0; var23 < arg0; var23++) {
            if (field950[var23] < -32768) {
                field950[var23] = -32768;
            }
            if (field950[var23] > 32767) {
                field950[var23] = 32767;
            }
        }
        return field950;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(IIII)I")
    private final int method330(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 49 / arg3;
        if (arg0 == 1) {
            return (arg1 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg0 == 2) {
            return field952[arg1 & 0x7FFF] * arg2 >> 14;
        } else if (arg0 == 3) {
            return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg0 == 4) {
            return field951[arg1 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(Lmb;B)V")
    public final void method331(Packet arg0, byte arg1) {
        this.field935 = new Envelope();
        this.field935.method319(arg0, (byte) 66);
        if (arg1 != 66) {
            field934 = 205;
        }
        this.field936 = new Envelope();
        this.field936.method319(arg0, (byte) 66);
        int var3 = arg0.method239();
        if (var3 != 0) {
            arg0.field736--;
            this.field937 = new Envelope();
            this.field937.method319(arg0, (byte) 66);
            this.field938 = new Envelope();
            this.field938.method319(arg0, (byte) 66);
        }
        int var4 = arg0.method239();
        if (var4 != 0) {
            arg0.field736--;
            this.field939 = new Envelope();
            this.field939.method319(arg0, (byte) 66);
            this.field940 = new Envelope();
            this.field940.method319(arg0, (byte) 66);
        }
        int var5 = arg0.method239();
        if (var5 != 0) {
            arg0.field736--;
            this.field941 = new Envelope();
            this.field941.method319(arg0, (byte) 66);
            this.field942 = new Envelope();
            this.field942.method319(arg0, (byte) 66);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method253();
            if (var7 == 0) {
                break;
            }
            this.field943[var6] = var7;
            this.field944[var6] = arg0.method252();
            this.field945[var6] = arg0.method253();
        }
        this.field946 = arg0.method253();
        this.field947 = arg0.method253();
        this.field948 = arg0.method241();
        this.field949 = arg0.method241();
    }
}
