import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class378 extends class11 {

    @OriginalMember(owner = "client!j", name = "H", descriptor = "[Ldw;")
    public static class502[] field5533 = new class502[32768];

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    public static int field5537 = -1;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field5539 = new String[100];

    @OriginalMember(owner = "client!j", name = "P", descriptor = "[I")
    public static int[] field5541 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!j", name = "J", descriptor = "Lqp;")
    public static class466 field5535 = new class466("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
    public static int field5542 = 0;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "[Lqe;")
    private class328[] field5538;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V", line = 4)
    public static void method2250(int arg0) {
        field5535 = null;
        if (arg0 != -1) {
            field5537 = 17;
        }
        field5533 = null;
        field5541 = null;
        field5539 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[[I", line = 19)
    public final int[][] method41(int arg0, int arg1) {
        int var3 = 45 % ((-75 - arg0) / 49);
        ++field5532;
        int[][] var4 = super.field156.method1719(arg1, 3);
        if (super.field156.field4001) {
            int var5 = class90.field1316;
            int var6 = class508.field7537;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field156.method1720(-13702);
            this.method2251(var7, -1);
            for (int var9 = 0; class508.field7537 > var9; ++var9) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[1];
                int[] var14 = var11[2];
                for (int var15 = 0; ~var15 > ~class90.field1316; ++var15) {
                    int var16 = var10[var15];
                    var14[var15] = class251.method1501(var16 << 4, 4080);
                    var13[var15] = class251.method1501(var16 >> 4, 4080);
                    var12[var15] = class251.method1501(4080, var16 >> 12);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([[II)V", line = 86)
    private final void method2251(int[][] arg0, int arg1) {
        ++field5536;
        if (arg1 != -1) {
            this.field5538 = null;
        }
        int var3 = class90.field1316;
        int var4 = class508.field7537;
        class417.method2480(arg0, arg1 + 1);
        class469.method2742(class99.field1490, class183.field2683, 0, 0, 0);
        if (this.field5538 != null) {
            for (int var5 = 0; ~this.field5538.length < ~var5; ++var5) {
                class328 var6 = this.field5538[var5];
                int var7 = var6.field4486;
                int var8 = var6.field4487;
                if (~var7 <= -1) {
                    if (var8 >= 0) {
                        var6.method5(var3, false, var4);
                    } else {
                        var6.method4(var4, 0, var3);
                    }
                } else if (~var8 <= -1) {
                    var6.method3(var3, var4, -1342);
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(II)[I", line = 137)
    public final int[] method44(int arg0, int arg1) {
        ++field5534;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (arg0 > -42) {
            field5537 = 91;
        }
        if (super.field158.field2966) {
            this.method2251(super.field158.method1310(3286), -1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V", line = 160)
    public class378() {
        super(0, true);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lsi;II)V", line = 178)
    public final void method43(class391 arg0, int arg1, int arg2) {
        if (arg1 >= -40) {
            field5533 = null;
        }
        ++field5540;
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field167 = ~arg0.method2348(-2) == -2;
                return;
            }
        } else {
            this.field5538 = new class328[arg0.method2348(-2)];
            for (int var4 = 0; ~this.field5538.length < ~var4; ++var4) {
                int var5 = arg0.method2348(-2);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field5538[var4] = class228.method1417(arg0, 28485);
                            }
                        } else {
                            this.field5538[var4] = class465.method2729(arg0, (byte) -12);
                        }
                    } else {
                        this.field5538[var4] = class164.method1093(true, arg0);
                    }
                } else {
                    this.field5538[var4] = class206.method1274(arg0, false);
                }
            }
        }
    }
}
