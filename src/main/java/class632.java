import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class632 extends class56 {

    @OriginalMember(owner = "client!ou", name = "N", descriptor = "I")
    private int field8631 = 4;

    @OriginalMember(owner = "client!ou", name = "P", descriptor = "I")
    private int field8633 = 4;

    @OriginalMember(owner = "client!ou", name = "M", descriptor = "S")
    public static short field8630 = 256;

    @OriginalMember(owner = "client!ou", name = "E", descriptor = "Lhj;")
    public static class596 field8624 = new class596(49, 4);

    @OriginalMember(owner = "client!ou", name = "D", descriptor = "I")
    public static int field8623;

    @OriginalMember(owner = "client!ou", name = "F", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!ou", name = "G", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!ou", name = "I", descriptor = "I")
    public static int field8628;

    @OriginalMember(owner = "client!ou", name = "K", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!ou", name = "O", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!ou", name = "Q", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!ou", name = "H", descriptor = "[I")
    public static int[] field8627;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(B)Les;")
    public static final class403 method3569(byte arg0) {
        int var1 = 109 / ((arg0 - 46) / 51);
        ++field8629;
        class403 var2 = new class403(518);
        field8627 = new int[4];
        field8627[2] = (int) (9.9999999E7D * Math.random());
        field8627[1] = (int) (9.9999999E7D * Math.random());
        field8627[3] = (int) (9.9999999E7D * Math.random());
        field8627[0] = (int) (Math.random() * 9.9999999E7D);
        var2.method2353(105, 10);
        var2.method2391(14, field8627[0]);
        var2.method2391(-118, field8627[1]);
        var2.method2391(-120, field8627[2]);
        var2.method2391(117, field8627[3]);
        return var2;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field8634;
        if (arg0 != 0) {
            field8630 = 90;
        }
        int[] var3 = super.field752.method1308(false, arg1);
        if (super.field752.field2441) {
            int var4 = class642.field8759 / this.field8631;
            int var5 = class784.field10832 / this.field8633;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method492(0, 0, (byte) 96);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method492(0, class784.field10832 * var7 / var5, (byte) 63);
            }
            for (int var8 = 0; ~var8 > ~class642.field8759; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class642.field8759 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (arg0 > -44) {
            method3569((byte) 97);
        }
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field8633 = arg2.method2396((byte) 54);
            }
        } else {
            this.field8631 = arg2.method2396((byte) -97);
        }
        ++field8625;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)[[I")
    public final int[][] method187(byte arg0, int arg1) {
        ++field8623;
        if (arg0 < 35) {
            this.field8633 = -34;
        }
        int[][] var3 = super.field759.method220(arg1, (byte) -91);
        if (super.field759.field341) {
            int var4 = class642.field8759 / this.field8631;
            int var5 = class784.field10832 / this.field8633;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method495(-66, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method495(76, class784.field10832 * var7 / var5, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class642.field8759; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class642.field8759 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "([I[ILvk;[IB)V")
    public static final void method3570(int[] arg0, int[] arg1, class388 arg2, int[] arg3, byte arg4) {
        if (arg4 != -37) {
            field8632 = 57;
        }
        for (int var5 = 0; ~arg0.length < ~var5; ++var5) {
            int var6 = arg0[var5];
            int var7 = arg3[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; ~var7 != -1 && ~var9 > ~arg2.field3435.length; ++var9) {
                if (~(1 & var7) != -1) {
                    if (~var6 != 0) {
                        class582 var10 = class362.field4504.method3600(-92, var6);
                        int var11 = var10.field7941;
                        class756 var12 = arg2.field3435[var9];
                        if (var12 != null) {
                            if (var12.field10471 != var6) {
                                if (var10.field7947 >= class362.field4504.method3600(-67, var12.field10471).field7947) {
                                    var12 = arg2.field3435[var9] = null;
                                }
                            } else if (var11 == 0) {
                                var12 = arg2.field3435[var9] = null;
                            } else if (var11 == 1) {
                                var12.field10467 = 1;
                                var12.field10473 = 0;
                                var12.field10469 = 0;
                                var12.field10468 = var8;
                                var12.field10470 = 0;
                                if (!arg2.field3363) {
                                    class60.method520(0, (byte) -59, arg2, var10);
                                }
                            } else if (~var11 == -3) {
                                var12.field10469 = 0;
                            }
                        }
                        if (var12 == null) {
                            class756 var13 = arg2.field3435[var9] = new class756();
                            var13.field10473 = 0;
                            var13.field10471 = var6;
                            var13.field10467 = 1;
                            var13.field10469 = 0;
                            var13.field10470 = 0;
                            var13.field10468 = var8;
                            if (!arg2.field3363) {
                                class60.method520(0, (byte) -104, arg2, var10);
                            }
                        }
                    } else {
                        arg2.field3435[var9] = null;
                    }
                }
                var7 >>>= 1;
            }
        }
        ++field8628;
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)V")
    public static void method3571(int arg0) {
        field8624 = null;
        if (arg0 != 22785) {
            field8630 = -12;
        }
        field8627 = null;
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "()V")
    public class632() {
        super(1, false);
    }
}
