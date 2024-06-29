import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class441 {

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public int field6472;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field6470 = 1337;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "[I")
    public static int[] field6477 = new int[32];

    @OriginalMember(owner = "client!og", name = "m", descriptor = "F")
    public static float field6471;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public int field6460;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public int field6465;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public int field6474;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "Lej;")
    public class74 field6473;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "[I")
    public int[] field6459;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "[I")
    public int[] field6461;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "[I")
    public int[] field6469;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "[I")
    public int[] field6475;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "[I")
    public int[] field6476;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "[I")
    public int[] field6479;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "[Lej;")
    public class74[] field6463;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "[[I")
    public int[][] field6462;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "[[I")
    public int[][] field6478;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([BI)V", line = 3)
    private final void method2571(byte[] arg0, int arg1) {
        field6468++;
        class40 var3 = new class40(class424.method2495((byte) 35, arg0));
        int var4 = var3.method257((byte) 94);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field6474 = var3.method255((byte) 96);
        } else {
            this.field6474 = 0;
        }
        int var5 = var3.method257((byte) 64);
        this.field6460 = var3.method254((byte) -39);
        int var6 = 0;
        int var7 = -1;
        this.field6459 = new int[this.field6460];
        for (int var8 = 0; var8 < this.field6460; var8++) {
            this.field6459[var8] = var6 += var3.method254((byte) -35);
            if (this.field6459[var8] > var7) {
                var7 = this.field6459[var8];
            }
        }
        if (arg1 <= 28) {
            this.field6474 = 37;
        }
        this.field6465 = var7 + 1;
        this.field6475 = new int[this.field6465];
        this.field6476 = new int[this.field6465];
        this.field6461 = new int[this.field6465];
        this.field6462 = new int[this.field6465][];
        this.field6469 = new int[this.field6465];
        if (var5 != 0) {
            this.field6479 = new int[this.field6465];
            for (int var9 = 0; var9 < this.field6465; var9++) {
                this.field6479[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field6460; var10++) {
                this.field6479[this.field6459[var10]] = var3.method255((byte) 96);
            }
            this.field6473 = new class74(this.field6479);
        }
        for (int var11 = 0; var11 < this.field6460; var11++) {
            this.field6476[this.field6459[var11]] = var3.method255((byte) 96);
        }
        for (int var12 = 0; var12 < this.field6460; var12++) {
            this.field6475[this.field6459[var12]] = var3.method255((byte) 96);
        }
        for (int var13 = 0; var13 < this.field6460; var13++) {
            this.field6469[this.field6459[var13]] = var3.method254((byte) -102);
        }
        for (int var14 = 0; var14 < this.field6460; var14++) {
            int var21 = this.field6459[var14];
            int var22 = this.field6469[var21];
            int var23 = 0;
            int var24 = -1;
            this.field6462[var21] = new int[var22];
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field6462[var21][var25] = var23 += var3.method254((byte) -123);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field6461[var21] = var24 + 1;
            if ((var24 + 1) == var22) {
                this.field6462[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field6478 = new int[var7 + 1][];
        this.field6463 = new class74[var7 + 1];
        for (int var15 = 0; var15 < this.field6460; var15++) {
            int var16 = this.field6459[var15];
            int var17 = this.field6469[var16];
            this.field6478[var16] = new int[this.field6461[var16]];
            for (int var18 = 0; var18 < this.field6461[var16]; var18++) {
                this.field6478[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field6462[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field6462[var16][var19];
                }
                this.field6478[var16][var20] = var3.method255((byte) 96);
            }
            this.field6463[var16] = new class74(this.field6478[var16]);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 187)
    public static void method2572(int arg0) {
        if (arg0 == 26338) {
            field6477 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B[FIIIIFIII)V", line = 198)
    public static final void method2573(byte arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7, int arg8, int arg9) {
        int var10 = arg2 - arg7;
        int var11 = arg5 - arg3;
        field6464++;
        if (arg0 < 76) {
            method2573((byte) 17, null, -86, -83, -97, -41, 0.45376828F, 65, -93, -64);
        }
        int var12 = arg9 - arg4;
        float var13 = arg1[2] * (float) var12 + arg1[1] * (float) var10 + arg1[0] * (float) var11;
        float var14 = arg1[5] * (float) var12 + arg1[4] * (float) var10 + arg1[3] * (float) var11;
        float var15 = arg1[8] * (float) var12 + arg1[6] * (float) var11 + arg1[7] * (float) var10;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg6 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg8 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class21.field273 = var17;
        class504.field7608 = var18;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V", line = 254)
    public static final void method2574(int arg0, int arg1, int arg2) {
        field6466++;
        if (class64.field1064 == class298.field4512) {
            if (class376.method2262(1, false, 1, -2, arg2, arg0, 3, 0, 0)) {
                return;
            }
            class376.method2262(1, false, 1, -3, arg2, arg0, -68, 0, 0);
        } else if (class376.method2262(1, false, 1, -3, arg2, arg0, 118, 0, 0)) {
            return;
        } else {
            class376.method2262(1, false, 1, -2, arg2, arg0, -35, 0, 0);
        }
        if (arg1 != -1) {
            method2572(-72);
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "([BI)V", line = 291)
    public class441(byte[] arg0, int arg1) {
        this.field6472 = class451.method2689(arg0.length, arg0, (byte) -111);
        if (this.field6472 != arg1) {
            throw new RuntimeException();
        }
        this.method2571(arg0, 119);
    }
}
