import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class372 extends class337 {

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    private int field5538 = 1;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    private int field5534 = 1;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "[I")
    public static int[] field5541 = new int[64];

    @OriginalMember(owner = "client!de", name = "J", descriptor = "[I")
    public static int[] field5540 = new int[32];

    @OriginalMember(owner = "client!de", name = "I", descriptor = "Lhn;")
    public static class509 field5539 = new class509(66, -2);

    @OriginalMember(owner = "client!de", name = "L", descriptor = "Lak;")
    public static class234 field5542 = new class234("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!de", name = "M", descriptor = "Lkh;")
    public static class13 field5543 = new class13(200);

    @OriginalMember(owner = "client!de", name = "N", descriptor = "[I")
    public static int[] field5544 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V", line = 10)
    public static void method2331(byte arg0) {
        field5542 = null;
        field5540 = null;
        if (arg0 != -2) {
            field5541 = null;
        }
        field5539 = null;
        field5544 = null;
        field5543 = null;
        field5541 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BILhp;)V", line = 25)
    public final void method177(byte arg0, int arg1, class217 arg2) {
        int var4 = 101 % ((82 - arg0) / 40);
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field5019 = arg2.method1515((byte) 127) == 1;
                }
            } else {
                this.field5534 = arg2.method1515((byte) 123);
            }
        } else {
            this.field5538 = arg2.method1515((byte) 121);
        }
        ++field5536;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[[I", line = 67)
    public final int[][] method673(int arg0, int arg1) {
        int var3 = -8 % ((-41 - arg1) / 49);
        ++field5533;
        int[][] var4 = super.field5011.method1410(arg0, 31649);
        if (super.field5011.field3346) {
            int var5 = this.field5534 - -this.field5534 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field5538 + 1 + this.field5538;
            int var8 = 65536 / var7;
            int[][][] var9 = new int[var5][][];
            for (int var10 = -this.field5534 + arg0; ~var10 >= ~(this.field5534 + arg0); ++var10) {
                int[][] var20 = this.method2123(var10 & class123.field1843, 0, -76);
                int[][] var21 = new int[3][class402.field5977];
                int var22 = 0;
                int var23 = 0;
                int var24 = 0;
                int[] var25 = var20[0];
                int[] var26 = var20[1];
                int[] var27 = var20[2];
                for (int var28 = -this.field5538; var28 <= this.field5538; ++var28) {
                    int var38 = class446.field6541 & var28;
                    var23 += var26[var38];
                    var22 += var25[var38];
                    var24 += var27[var38];
                }
                int[] var29 = var21[0];
                int[] var30 = var21[1];
                int[] var31 = var21[2];
                int var32 = 0;
                while (~class402.field5977 < ~var32) {
                    var29[var32] = var8 * var22 >> 16;
                    var30[var32] = var8 * var23 >> 16;
                    var31[var32] = var8 * var24 >> 16;
                    int var33 = class446.field6541 & var32 - this.field5538;
                    int var34 = var22 - var25[var33];
                    ++var32;
                    int var35 = var24 - var27[var33];
                    int var36 = var23 - var26[var33];
                    int var37 = this.field5538 + var32 & class446.field6541;
                    var23 = var26[var37] + var36;
                    var24 = var27[var37] + var35;
                    var22 = var25[var37] + var34;
                }
                var9[-arg0 + this.field5534 + var10] = var21;
            }
            int[] var11 = var4[0];
            int[] var12 = var4[1];
            int[] var13 = var4[2];
            for (int var14 = 0; var14 < class402.field5977; ++var14) {
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                for (int var18 = 0; ~var18 > ~var5; ++var18) {
                    int[][] var19 = var9[var18];
                    var16 += var19[1][var14];
                    var17 += var19[2][var14];
                    var15 += var19[0][var14];
                }
                var11[var14] = var6 * var15 >> 16;
                var12[var14] = var6 * var16 >> 16;
                var13[var14] = var6 * var17 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V", line = 207)
    public class372() {
        super(1, false);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)V", line = 210)
    public static final void method2332(int arg0, int arg1) {
        if (arg1 <= 31) {
            field5541 = null;
        }
        ++field5535;
        class211 var2 = class452.method2749(11, -28, arg0);
        var2.method1460(true);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)[I", line = 248)
    public final int[] method179(int arg0, byte arg1) {
        if (arg1 != -11) {
            method2331((byte) 50);
        }
        ++field5537;
        int[] var3 = super.field5007.method512(arg0, 0);
        if (super.field5007.field687) {
            int var4 = this.field5534 + this.field5534 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field5538 + 1 + this.field5538;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field5534 + arg0; var9 <= this.field5534 + arg0; ++var9) {
                int[] var13 = this.method2124(var9 & class123.field1843, 0, -59);
                int[] var14 = new int[class402.field5977];
                int var15 = 0;
                for (int var16 = -this.field5538; ~var16 >= ~this.field5538; ++var16) {
                    var15 += var13[class446.field6541 & var16];
                }
                int var17 = 0;
                while (class402.field5977 > var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class446.field6541 & var17 - this.field5538];
                    ++var17;
                    var15 = var13[this.field5538 + var17 & class446.field6541] + var18;
                }
                var8[var9 - -this.field5534 + -arg0] = var14;
            }
            for (int var10 = 0; ~var10 > ~class402.field5977; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }
}
