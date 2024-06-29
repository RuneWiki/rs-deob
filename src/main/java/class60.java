import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class60 extends class3 {

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
    private int field909 = 0;

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "[S")
    private short[] field913 = new short[257];

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "Ljava/lang/String;")
    public static String field907 = "Please wait...";

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
    public static int field916 = 0;

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "I")
    public static int field917 = 0;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "Ljava/lang/String;")
    public static String field914;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "[I")
    private int[] field906;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "[I")
    private int[] field908;

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "[[I")
    private int[][] field910;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V", line = 7)
    private final void method437(int arg0) {
        field915++;
        int[] var2 = this.field910[0];
        int[] var3 = this.field910[1];
        if (arg0 != 6027) {
            method438(true);
        }
        int[] var4 = this.field910[this.field910.length - 2];
        int[] var5 = this.field910[this.field910.length - 1];
        this.field908 = new int[] { var2[0] + var2[0] - var3[0], var2[1] + -var3[1] + var2[1] };
        this.field906 = new int[] { var4[0] + var4[0] - var5[0], var4[1] - var5[1] - -var4[1] };
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)[I", line = 26)
    public final int[] method25(byte arg0, int arg1) {
        field912++;
        int[] var3 = this.field21.method1258(arg1, 0);
        if (arg0 <= 57) {
            return (int[]) null;
        }
        if (this.field21.field2808) {
            int[] var4 = this.method24(arg1, 1, 0);
            for (int var5 = 0; var5 < class326.field5342; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field913[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V", line = 66)
    public class60() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V", line = 70)
    public static void method438(boolean arg0) {
        field914 = null;
        field907 = null;
        if (arg0) {
            method440(11);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)[I", line = 83)
    private final int[] method439(int arg0, int arg1) {
        field903++;
        if (arg1 >= 0) {
            if (arg0 != 4096) {
                this.method437(14);
            }
            return this.field910.length <= arg1 ? this.field906 : this.field910[arg1];
        } else {
            return this.field908;
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)V", line = 108)
    public final void method20(byte arg0) {
        field902++;
        if (this.field910 == null) {
            this.field910 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        int var2 = 107 / ((-arg0 - 20) / 58);
        if (this.field910.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field909 == 2) {
            this.method437(6027);
        }
        class291.method2061(0);
        this.method441(0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lfh;IZ)V", line = 129)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.field909 = arg0.method2224(-126);
            this.field910 = new int[arg0.method2224(-123)][2];
            for (int var4 = 0; var4 < this.field910.length; var4++) {
                this.field910[var4][0] = arg0.method2250(-1613178296);
                this.field910[var4][1] = arg0.method2250(-1613178296);
            }
        }
        field905++;
        if (arg2) {
            this.field906 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V", line = 159)
    public static final void method440(int arg0) {
        field918++;
        int var1 = -1;
        if (arg0 != 1) {
            field916 = -116;
        }
        while (class38.field561 > var1) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class150.field2410[var1];
            }
            class39 var3 = class130.field1984[var2];
            if (var3 != null) {
                class148.method1056(true, var3.method312(92), var3);
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V", line = 201)
    private final void method441(int arg0) {
        int var2 = this.field909;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < (this.field910.length - 1) && this.field910[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field910[var5 - 1];
                int[] var7 = this.field910[var5];
                int var8 = this.method439(4096, var5 - 2)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var11 = this.method439(arg0 + 4096, var5 + 1)[1];
                int var12 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                int var13 = var11 + var9 - var8 - var10;
                int var14 = var8 - var9 - var13;
                int var15 = var12 * var12 >> 12;
                int var16 = (var12 * var13 >> 12) * var15 >> 12;
                int var17 = var10 - var8;
                int var19 = var14 * var15 >> 12;
                int var20 = var12 * var17 >> 12;
                int var21 = var16 + var20 - (-var9 - var19);
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field913[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var30 = 0; var30 < 257; var30++) {
                int var31 = var30 << 4;
                int var32;
                for (var32 = 1; var32 < (this.field910.length - 1) && this.field910[var32][0] <= var31; var32++) {
                }
                int[] var33 = this.field910[var32];
                int[] var34 = this.field910[var32 - 1];
                int var35 = (var31 - var34[0] << 12) / (var33[0] - var34[0]);
                int var36 = 4096 - class18.field225[var35 >> 5 & 0xFF] >> 1;
                int var37 = 4096 - var36;
                int var38 = var34[1] * var37 + (var33[1] * var36) >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field913[var30] = (short) var38;
            }
        } else {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; var24 < (this.field910.length - 1) && this.field910[var24][0] <= var23; var24++) {
                }
                int[] var25 = this.field910[var24];
                int[] var26 = this.field910[var24 - 1];
                int var27 = (var23 - var26[0] << 12) / (var25[0] - var26[0]);
                int var28 = 4096 - var27;
                int var29 = var25[1] * var27 + var26[1] * var28 >> 12;
                if (var29 <= -32768) {
                    var29 = -32767;
                }
                if (var29 >= 32768) {
                    var29 = 32767;
                }
                this.field913[var22] = (short) var29;
            }
        }
        if (arg0 != 0) {
            field919 = -81;
        }
        field911++;
    }
}
