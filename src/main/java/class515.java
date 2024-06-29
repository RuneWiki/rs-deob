import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class515 {

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "Lpl;")
    private class612 field7030;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    private int field7033;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "[[I")
    private int[][] field7028;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "[Z")
    private boolean[] field7032;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "Lrga;")
    public static class280 field7029 = new class280(60, 16);

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2788(int arg0) {
        class650.field9179 = 0;
        field7031++;
        int var1 = (class376.field4748.field6461 >> 9) + class145.field1879;
        int var2 = (class376.field4748.field6464 >> 9) + class630.field8817;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class650.field9179 = 1;
        }
        if (~var1 <= arg0 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class650.field9179 = 1;
        }
        if (class650.field9179 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class650.field9179 = 0;
        }
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V", line = 25)
    public static void method2789(int arg0) {
        int var1 = -84 / ((arg0 - 22) / 54);
        field7029 = null;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)Lnh;", line = 37)
    public final class680 method2790(int arg0, int arg1) {
        field7035++;
        byte[] var3 = this.field7030.method3365(arg1, -111, 1);
        if (arg0 < 14) {
            method2788(-7);
        }
        class680 var4 = new class680();
        var4.method3825(new class630(var3), (byte) -80);
        return var4;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)Z", line = 55)
    public final boolean method2791(byte arg0) {
        if (arg0 != -86) {
            this.field7030 = null;
        }
        field7036++;
        return this.field7033 != -1;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lrf;ILpl;)V", line = 76)
    public class515(class112 arg0, int arg1, class612 arg2) {
        this.field7030 = arg2;
        this.field7030.method3349(1, true);
        class630 var4 = new class630(this.field7030.method3365(0, -4, 0));
        int var5 = var4.method3501(-9268);
        if (var5 > 3) {
            this.field7032 = new boolean[0];
            this.field7028 = new int[0][];
            this.field7033 = -1;
        } else {
            int var6 = var4.method3501(-9268);
            class259[] var7 = class252.method1477(true);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method3501(-9268);
                    if (var7[var9].field3172 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method3501(-9268);
                int var12 = var4.method3501(-9268);
                if (var5 > 2) {
                    this.field7033 = var4.method3510(58);
                } else {
                    this.field7033 = -1;
                }
                this.field7032 = new boolean[var12 + 1];
                this.field7028 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method3501(-9268);
                    this.field7032[var15] = var4.method3501(-9268) == 1;
                    int var16 = var4.method3470(13111);
                    if (this.field7033 == -1) {
                        this.field7028[var15] = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field7028[var15][var17] = var4.method3470(13111);
                        }
                    } else {
                        this.field7028[var15] = new int[var16 + 1];
                        this.field7028[var15][0] = this.field7033;
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field7028[var15][var18 + 1] = var4.method3470(13111);
                        }
                    }
                }
                for (int var14 = 0; var14 < (var12 + 1); var14++) {
                    if (this.field7028[var14] == null) {
                        if (this.field7033 == -1) {
                            this.field7028[var14] = new int[0];
                        } else {
                            this.field7028[var14] = new int[] { this.field7033 };
                        }
                    }
                }
            } else {
                this.field7033 = -1;
                this.field7028 = new int[0][];
                this.field7032 = new boolean[0];
            }
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(BI)[I", line = 219)
    public final int[] method2792(byte arg0, int arg1) {
        field7034++;
        if (arg1 < 0 || this.field7028.length <= arg1) {
            return this.field7033 == -1 ? new int[0] : new int[] { this.field7033 };
        } else if (this.field7032[arg1] && this.field7028[arg1].length > 1) {
            int var3 = this.field7033 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field7028[arg1].length];
            class293.method1640(this.field7028[arg1], 0, var5, 0, var5.length);
            int var6 = 29 / ((arg0 - 43) / 52);
            for (int var7 = var3; var7 < var5.length; var7++) {
                int var8 = var3 + class517.method2801(var4, var5.length - var3, 124);
                int var9 = var5[var7];
                var5[var7] = var5[var8];
                var5[var8] = var9;
            }
            return var5;
        } else {
            return this.field7028[arg1];
        }
    }
}
