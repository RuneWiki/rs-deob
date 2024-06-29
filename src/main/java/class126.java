import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class126 extends class240 {

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "I")
    private int field2269 = 1;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "I")
    private int field2270 = 1;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "I")
    public static int field2264 = 0;

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "I")
    public static int field2272 = 0;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!ml", name = "W", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!ml", name = "Y", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V", line = 4)
    public static final void method909(int arg0) {
        class120.field2169 = 0;
        field2265++;
        class48.field794 = 0;
        class283.field4867 = 0;
        class249.field4333 = arg0;
        class260.field4478 = 0;
        class10.field206 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILkh;)V", line = 17)
    public final void method16(int arg0, int arg1, class13 arg2) {
        field2266++;
        if (arg1 == 0) {
            this.field2270 = arg2.method152((byte) -103);
        } else if (arg1 == 1) {
            this.field2269 = arg2.method152((byte) -128);
        } else if (arg1 == 2) {
            this.field4113 = arg2.method152((byte) -116) == 1;
        }
        if (arg0 != 2) {
            method911(-54, 105);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)[[I", line = 76)
    public final int[][] method286(byte arg0, int arg1) {
        if (arg0 < 34) {
            method910(-125, 21, -100);
        }
        int[][] var3 = this.field4095.method1797(arg1, -105);
        if (this.field4095.field4355) {
            int var4 = this.field2269 + this.field2269 + 1;
            int var5 = this.field2270 + this.field2270 + 1;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg1 - this.field2269; var9 <= (this.field2269 + arg1); var9++) {
                int[][] var10 = this.method1746(-63, class74.field1407 & var9, 0);
                int[][] var11 = new int[3][class169.field2936];
                int var12 = 0;
                int var13 = 0;
                int[] var14 = var10[1];
                int var15 = 0;
                int[] var16 = var10[2];
                int[] var17 = var10[0];
                for (int var18 = -this.field2270; var18 <= this.field2270; var18++) {
                    int var19 = var18 & class132.field2356;
                    var15 += var16[var19];
                    var13 += var14[var19];
                    var12 += var17[var19];
                }
                int[] var20 = var11[0];
                int[] var21 = var11[2];
                int[] var22 = var11[1];
                int var23 = 0;
                while (class169.field2936 > var23) {
                    var20[var23] = var7 * var12 >> 16;
                    var22[var23] = var7 * var13 >> 16;
                    var21[var23] = var7 * var15 >> 16;
                    int var24 = class132.field2356 & var23 - this.field2270;
                    var23++;
                    int var25 = var15 - var16[var24];
                    int var26 = var12 - var17[var24];
                    int var27 = var13 - var14[var24];
                    int var28 = this.field2270 + var23 & class132.field2356;
                    var12 = var17[var28] + var26;
                    var13 = var14[var28] + var27;
                    var15 = var16[var28] + var25;
                }
                var8[var9 + this.field2269 - arg1] = var11;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[2];
            int[] var31 = var3[1];
            for (int var32 = 0; var32 < class169.field2936; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var34 += var37[2][var32];
                    var35 += var37[1][var32];
                    var33 += var37[0][var32];
                }
                var29[var32] = var6 * var33 >> 16;
                var31[var32] = var6 * var35 >> 16;
                var30[var32] = var6 * var34 >> 16;
            }
        }
        field2273++;
        return var3;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(III)V", line = 208)
    public static final void method910(int arg0, int arg1, int arg2) {
        field2267++;
        if (arg2 != 27690) {
            method911(8, -37);
        }
        class299 var3 = class158.method1135(arg1, -120, 6);
        var3.method2091(arg2 ^ 0x6C7C);
        var3.field5153 = arg0;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)Lcd;", line = 224)
    public static final class64 method911(int arg0, int arg1) {
        field2268++;
        class64 var2 = class310.method2149(arg0, (byte) 117);
        for (int var3 = var2.method540(28981) - 3; var3 > 0; var3 -= 3) {
            var2 = class104.method768(new class64[] { var2.method524(var3, (byte) 56, 0), class310.field5271, var2.method508((byte) 99, var3) }, false);
        }
        if (var2.method540(28981) <= 9) {
            if (arg1 != 0) {
                method911(9, 48);
            }
            return var2.method540(28981) <= 6 ? class104.method768(new class64[] { class26.field422, var2, class99.field1801 }, false) : class104.method768(new class64[] { class132.field2355, var2.method524(var2.method540(28981) - 4, (byte) 94, 0), class6.field143, class240.field4102, var2, class313.field5316 }, false);
        } else {
            return class104.method768(new class64[] { class251.field4368, var2.method524(var2.method540(28981) - 8, (byte) 62, 0), class138.field2464, class240.field4102, var2, class313.field5316 }, false);
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V", line = 254)
    public class126() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)[I", line = 274)
    public final int[] method12(int arg0, int arg1) {
        field2271++;
        if (arg0 != 64) {
            this.field2270 = -11;
        }
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            int var4 = this.field2269 + this.field2269 + 1;
            int var5 = this.field2270 + this.field2270 + 1;
            int var6 = 65536 / var4;
            int[][] var7 = new int[var4][];
            int var8 = 65536 / var5;
            for (int var9 = arg1 - this.field2269; var9 <= this.field2269 + arg1; var9++) {
                int[] var10 = this.method1745(class74.field1407 & var9, 0, (byte) 110);
                int var11 = 0;
                int[] var12 = new int[class169.field2936];
                for (int var13 = -this.field2270; var13 <= this.field2270; var13++) {
                    var11 += var10[var13 & class132.field2356];
                }
                int var14 = 0;
                while (var14 < class169.field2936) {
                    var12[var14] = var8 * var11 >> 16;
                    int var15 = var11 - var10[var14 - this.field2270 & class132.field2356];
                    var14++;
                    var11 = var10[class132.field2356 & this.field2270 + var14] + var15;
                }
                var7[this.field2269 + var9 - arg1] = var12;
            }
            for (int var16 = 0; var16 < class169.field2936; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var7[var18][var16];
                }
                var3[var16] = var6 * var17 >> 16;
            }
        }
        return var3;
    }
}
