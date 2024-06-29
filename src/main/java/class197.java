import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class197 {

    @OriginalMember(owner = "client!bda", name = "g", descriptor = "Lmv;")
    private class295 field2699;

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "[[I")
    private int[][] field2694;

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "[Z")
    private boolean[] field2696;

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "I")
    private int field2703;

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "I")
    public static int field2698 = -1;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!bda", name = "i", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!bda", name = "l", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!bda", name = "j", descriptor = "Lmv;")
    public static class295 field2702;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
    public static void method1286(int arg0) {
        if (arg0 != 0) {
            field2698 = -65;
        }
        field2702 = null;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)Lgl;")
    public final class574 method1287(int arg0, int arg1) {
        field2701++;
        byte[] var3 = this.field2699.method1844(arg1, 31330, arg0);
        class574 var4 = new class574();
        var4.method3301(new class540(var3), 0);
        return var4;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(III)Z")
    public static final boolean method1288(int arg0, int arg1, int arg2) {
        field2697++;
        int var3 = 112 % ((41 - arg2) / 40);
        if ((class53.method313(116, arg0, arg1) | (arg1 & 0x10000) != 0) || class206.method1324(arg1, (byte) 70, arg0)) {
            return true;
        } else {
            return (arg0 & 0x37) == 0 && class264.method1587((byte) 95, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)Z")
    public final boolean method1289(byte arg0) {
        field2704++;
        if (arg0 != -92) {
            this.field2703 = -97;
        }
        return this.field2703 != -1;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lgk;I)Log;")
    public static final class461 method1290(class540 arg0, int arg1) {
        if (arg1 == 0) {
            field2695++;
            return new class461(arg0.method3129(arg1 ^ 0x7C), arg0.method3129(114), arg0.method3129(arg1 + 106), arg0.method3129(arg1 + 94), arg0.method3154((byte) -20), arg0.method3115(arg1 + 29871));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)V")
    public static final void method1291(int arg0) {
        if (class326.field4725 != null) {
            class126[] var1 = class326.field4725;
            for (int var2 = 0; var2 < var1.length; var2++) {
                class126 var3 = var1[var2];
                var3.method902((byte) -36);
            }
        }
        if (arg0 != 1760) {
            method1286(-100);
        }
        field2693++;
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lsea;ILmv;)V")
    public class197(class373 arg0, int arg1, class295 arg2) {
        this.field2699 = arg2;
        this.field2699.method1845(1, true);
        class540 var4 = new class540(this.field2699.method1844(0, 31330, 0));
        int var5 = var4.method3115(29871);
        if (var5 > 3) {
            this.field2694 = new int[0][];
            this.field2696 = new boolean[0];
            this.field2703 = -1;
        } else {
            int var6 = var4.method3115(29871);
            class139[] var7 = class317.method1968(true);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method3115(29871);
                    if (var7[var9].field2018 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method3115(29871);
                int var12 = var4.method3115(29871);
                if (var5 > 2) {
                    this.field2703 = var4.method3129(111);
                } else {
                    this.field2703 = -1;
                }
                this.field2696 = new boolean[var12 + 1];
                this.field2694 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method3115(29871);
                    this.field2696[var15] = var4.method3115(29871) == 1;
                    int var16 = var4.method3169(26488);
                    if (this.field2703 == -1) {
                        this.field2694[var15] = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field2694[var15][var17] = var4.method3169(26488);
                        }
                    } else {
                        this.field2694[var15] = new int[var16 + 1];
                        this.field2694[var15][0] = this.field2703;
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field2694[var15][var18 + 1] = var4.method3169(26488);
                        }
                    }
                }
                for (int var14 = 0; var14 < (var12 + 1); var14++) {
                    if (this.field2694[var14] == null) {
                        if (this.field2703 == -1) {
                            this.field2694[var14] = new int[0];
                        } else {
                            this.field2694[var14] = new int[] { this.field2703 };
                        }
                    }
                }
            } else {
                this.field2696 = new boolean[0];
                this.field2703 = -1;
                this.field2694 = new int[0][];
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(BI)[I")
    public final int[] method1292(byte arg0, int arg1) {
        field2700++;
        if (arg1 < 0 || this.field2694.length <= arg1) {
            return this.field2703 == -1 ? new int[0] : new int[] { this.field2703 };
        } else if (this.field2696[arg1] && this.field2694[arg1].length > 1) {
            int var3 = this.field2703 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field2694[arg1].length];
            class667.method3740(this.field2694[arg1], 0, var5, 0, var5.length);
            if (arg0 != 110) {
                return null;
            }
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class339.method2095(true, var4, var5.length - var3) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field2694[arg1];
        }
    }
}
