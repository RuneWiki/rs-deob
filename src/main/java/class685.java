import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class685 {

    @OriginalMember(owner = "client!au", name = "i", descriptor = "Lri;")
    private class97 field9605;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "[Z")
    private boolean[] field9600;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    private int field9597;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "[[I")
    private int[][] field9601;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "Z")
    public static boolean field9606 = false;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field9599;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    public static int field9602;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "I")
    public static int field9603;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "I")
    public static int field9604;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "I")
    public static int field9607;

    @OriginalMember(owner = "client!au", name = "l", descriptor = "I")
    public static int field9608;

    @OriginalMember(owner = "client!au", name = "m", descriptor = "I")
    public static int field9609;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "Lwm;")
    public static class524 field9610;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "[I")
    public static int[] field9598;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ZI)[I")
    public final int[] method3890(boolean arg0, int arg1) {
        field9609++;
        if (arg1 < 0 || this.field9601.length <= arg1) {
            return this.field9597 == -1 ? new int[0] : new int[] { this.field9597 };
        } else if (this.field9600[arg1] && this.field9601[arg1].length > 1) {
            int var3 = this.field9597 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field9601[arg1].length];
            class398.method2565(this.field9601[arg1], 0, var5, 0, var5.length);
            if (arg0) {
                this.field9601 = null;
            }
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = var3 + class93.method902(8047, var4, var5.length - var3);
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field9601[arg1];
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V")
    public static void method3891(byte arg0) {
        int var1 = 21 / ((-arg0 - 59) / 61);
        field9610 = null;
        field9598 = null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Lab;")
    public final class621 method3892(int arg0, int arg1) {
        field9599++;
        if (arg0 != 10065) {
            method3895(40);
        }
        byte[] var3 = this.field9605.method926(1, -127, arg1);
        class621 var4 = new class621();
        var4.method3601(false, new class6(var3));
        return var4;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIB)I")
    public static final int method3893(int arg0, int arg1, byte arg2) {
        if (arg2 != 39) {
            return -101;
        }
        field9602++;
        int var3 = arg0 + (arg1 * 57);
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return (var5 & 0x7FCF4E8) >> 19;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(B)V")
    public static final void method3894(byte arg0) {
        class472.field6984.method747((byte) 56, 5);
        field9607++;
        class61.field789.method13(5, false);
        class385.field5985.method2462(-6914, 5);
        class213.field3537.method92(-26139, 5);
        class538.field7860.method3223(5, (byte) 8);
        class91.field1083.method2858(5, (byte) 119);
        class636.field8942.method2874(false, 5);
        if (arg0 < 101) {
            field9610 = null;
        }
        class65.field826.method3683(5, 4194304);
        class585.field8317.method723((byte) -94, 5);
        class566.field8134.method3115(64, 5);
        class472.field6988.method2677((byte) 116, 5);
        class498.field7303.method3288(5, (byte) 81);
        class584.field8299.method1882(5, -624);
        class610.field8680.method3571(11, 5);
        class690.field9681.method1036(5, 102);
        class275.field4412.method1403(2, 5);
        class254.field4046.method3586(5, -114);
        class357.field5693.method2627(128, 5);
        class489.field7154.method1811(5, -94);
        class243.field3854.method2534((byte) 48, 5);
        class53.method591((byte) -119, 5);
        class403.method2587(50, -111);
        class344.method2340(50, 28);
        class510.method3094(5, 0);
        class271.method1916(98, 5);
        class462.field6900.method573((byte) 117, 5);
        class206.field3450.method573((byte) 122, 5);
        class10.field173.method573((byte) 123, 5);
        class300.field4688.method573((byte) 118, 5);
        class142.field2397.method573((byte) 126, 5);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
    public static final void method3895(int arg0) {
        for (int var1 = arg0; var1 < class224.field3610.length; var1++) {
            for (int var2 = 0; var2 < class224.field3610[var1].length; var2++) {
                class224.field3610[var1][var2] = class576.field8216;
            }
        }
        field9608++;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)Z")
    public final boolean method3896(int arg0) {
        if (arg0 == 12288) {
            field9603++;
            return this.field9597 != -1;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lol;I)V")
    public static final void method3897(class260 arg0, int arg1) {
        field9604++;
        boolean var2 = false;
        if (arg1 != 256) {
            return;
        }
        if (class562.field8084 == arg0.field4151 || arg0.field4215 == -1 || arg0.field4150 != 0) {
            var2 = true;
        } else {
            class428 var3 = class636.field8942.method2872((byte) 11, arg0.field4215);
            if (var3.field6531 || var3.field6532[arg0.field4209] < (arg0.field4188 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field4151 - arg0.field4203;
            int var5 = class562.field8084 - arg0.field4203;
            int var6 = arg0.field4226 * 512 + arg0.method1841(20744) * 256;
            int var7 = arg0.field4216 * 512 + arg0.method1841(20744) * 256;
            int var8 = arg0.field4229 * 512 + arg0.method1841(20744) * 256;
            int var9 = arg0.field4202 * 512 + arg0.method1841(20744) * 256;
            arg0.field9696 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
            arg0.field9705 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg0.field4262 = 0;
        if (arg0.field4177 == 0) {
            arg0.method1845(false, arg1 ^ 0x100, 8192);
        }
        if (arg0.field4177 == 1) {
            arg0.method1845(false, 0, 12288);
        }
        if (arg0.field4177 == 2) {
            arg0.method1845(false, 0, 0);
        }
        if (arg0.field4177 == 3) {
            arg0.method1845(false, 0, 4096);
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lei;ILri;)V")
    public class685(class162 arg0, int arg1, class97 arg2) {
        this.field9605 = arg2;
        this.field9605.method949(1, 0);
        class6 var4 = new class6(this.field9605.method926(0, -125, 0));
        int var5 = var4.method70(-9059);
        if (var5 > 3) {
            this.field9597 = -1;
            this.field9600 = new boolean[0];
            this.field9601 = new int[0][];
        } else {
            int var6 = var4.method70(-9059);
            class444[] var7 = class260.method1854(123);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method70(-9059);
                    if (var7[var9].field6750 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method70(-9059);
                int var12 = var4.method70(-9059);
                if (var5 <= 2) {
                    this.field9597 = -1;
                } else {
                    this.field9597 = var4.method45(-8652);
                }
                this.field9600 = new boolean[var12 + 1];
                this.field9601 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method70(-9059);
                    this.field9600[var15] = var4.method70(-9059) == 1;
                    int var16 = var4.method67(12021);
                    if (this.field9597 == -1) {
                        this.field9601[var15] = new int[var16];
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field9601[var15][var18] = var4.method67(12021);
                        }
                    } else {
                        this.field9601[var15] = new int[var16 + 1];
                        this.field9601[var15][0] = this.field9597;
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field9601[var15][var17 + 1] = var4.method67(12021);
                        }
                    }
                }
                for (int var14 = 0; var14 < (var12 + 1); var14++) {
                    if (this.field9601[var14] == null) {
                        if (this.field9597 == -1) {
                            this.field9601[var14] = new int[0];
                        } else {
                            this.field9601[var14] = new int[] { this.field9597 };
                        }
                    }
                }
            } else {
                this.field9600 = new boolean[0];
                this.field9597 = -1;
                this.field9601 = new int[0][];
            }
        }
    }
}
