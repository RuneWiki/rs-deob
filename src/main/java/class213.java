import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class213 {

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "Lqd;")
    public static class173 field3529 = new class173(128);

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public int field3521;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public int field3527;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public int field3528;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "Le;")
    public class178 field3522;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "[I")
    public int[] field3517;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "[I")
    public int[] field3518;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "[I")
    public int[] field3520;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "[I")
    public int[] field3524;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "[I")
    public int[] field3525;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "[I")
    public int[] field3531;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "[Le;")
    public class178[] field3533;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "[[I")
    public int[][] field3523;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "[[I")
    public int[][] field3532;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B[B)V")
    private final void method1484(byte arg0, byte[] arg1) {
        class162 var3 = new class162(class267.method1795(arg1, -25620));
        int var4 = var3.method1133((byte) 53);
        field3526++;
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field3521 = var3.method1157(65280);
        } else {
            this.field3521 = 0;
        }
        int var5 = 0;
        int var6 = -1;
        int var7 = var3.method1133((byte) 53);
        this.field3527 = var3.method1142(-18970);
        this.field3531 = new int[this.field3527];
        for (int var8 = 0; var8 < this.field3527; var8++) {
            this.field3531[var8] = var5 += var3.method1142(-18970);
            if (var6 < this.field3531[var8]) {
                var6 = this.field3531[var8];
            }
        }
        this.field3528 = var6 + 1;
        this.field3525 = new int[this.field3528];
        this.field3517 = new int[this.field3528];
        this.field3524 = new int[this.field3528];
        this.field3518 = new int[this.field3528];
        this.field3523 = new int[this.field3528][];
        if (var7 != 0) {
            this.field3520 = new int[this.field3528];
            for (int var9 = 0; var9 < this.field3528; var9++) {
                this.field3520[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3527; var10++) {
                this.field3520[this.field3531[var10]] = var3.method1157(65280);
            }
            this.field3522 = new class178(this.field3520);
        }
        for (int var11 = 0; var11 < this.field3527; var11++) {
            this.field3517[this.field3531[var11]] = var3.method1157(65280);
        }
        for (int var12 = 0; var12 < this.field3527; var12++) {
            this.field3518[this.field3531[var12]] = var3.method1157(65280);
        }
        if (arg0 < 103) {
            this.field3524 = null;
        }
        for (int var13 = 0; var13 < this.field3527; var13++) {
            this.field3525[this.field3531[var13]] = var3.method1142(-18970);
        }
        for (int var14 = 0; var14 < this.field3527; var14++) {
            int var21 = this.field3531[var14];
            int var22 = 0;
            int var23 = this.field3525[var21];
            this.field3523[var21] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field3523[var21][var25] = var22 += var3.method1142(-18970);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field3524[var21] = var24 + 1;
            if (var24 + 1 == var23) {
                this.field3523[var21] = null;
            }
        }
        if (var7 == 0) {
            return;
        }
        this.field3533 = new class178[var6 + 1];
        this.field3532 = new int[var6 + 1][];
        for (int var15 = 0; var15 < this.field3527; var15++) {
            int var16 = this.field3531[var15];
            int var17 = this.field3525[var16];
            this.field3532[var16] = new int[this.field3524[var16]];
            for (int var18 = 0; var18 < this.field3524[var16]; var18++) {
                this.field3532[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field3523[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field3523[var16][var19];
                }
                this.field3532[var16][var20] = var3.method1157(65280);
            }
            this.field3533[var16] = new class178(this.field3532[var16]);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
    public static void method1485(byte arg0) {
        if (arg0 <= 90) {
            field3529 = null;
        }
        field3529 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)I")
    public static final int method1486(int arg0, int arg1) {
        int var2 = 55 % ((-arg1 - 33) / 54);
        field3530++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "([BI)V")
    public class213(byte[] arg0, int arg1) {
        this.field3534 = class39.method245(arg0, arg0.length, -121);
        if (this.field3534 != arg1) {
            throw new RuntimeException();
        }
        this.method1484((byte) 121, arg0);
    }
}
