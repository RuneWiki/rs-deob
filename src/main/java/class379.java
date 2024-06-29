import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class379 extends class298 {

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    private int field5367 = 1024;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    private int field5369 = 2048;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    private int field5368 = 3072;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
    public static int field5375;

    static {
        new class40("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        new class40("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIB)V", line = 9)
    public static final void method2268(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field5374;
        int var5 = 0;
        int var6 = -122 % ((-62 - arg4) / 46);
        int var7 = arg3;
        int var8 = -arg3;
        int var9 = -1;
        class270.method1633(class240.field3303[arg1], arg0 - -arg3, arg2, -arg3 + arg0, 117);
        while (var7 > var5) {
            var9 += 2;
            ++var5;
            var8 += var9;
            if (~var8 <= -1) {
                --var7;
                var8 -= var7 << 1;
                int[] var10 = class240.field3303[arg1 + var7];
                int[] var11 = class240.field3303[-var7 + arg1];
                int var12 = arg0 - -var5;
                int var13 = arg0 - var5;
                class270.method1633(var10, var12, arg2, var13, 92);
                class270.method1633(var11, var12, arg2, var13, 106);
            }
            int var14 = arg0 + var7;
            int var15 = -var7 + arg0;
            int[] var16 = class240.field3303[arg1 + var5];
            int[] var17 = class240.field3303[-var5 + arg1];
            class270.method1633(var16, var14, arg2, var15, 107);
            class270.method1633(var17, var14, arg2, var15, 94);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)[I", line = 60)
    public final int[] method13(int arg0, boolean arg1) {
        if (!arg1) {
            method2268(10, 114, -122, 67, (byte) -113);
        }
        ++field5370;
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (super.field4443.field6915) {
            int[] var4 = this.method1882(0, -2594, arg0);
            for (int var5 = 0; ~var5 > ~class158.field1877; ++var5) {
                var3[var5] = (var4[var5] * this.field5369 >> 12) + this.field5367;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V", line = 101)
    public class379() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[[I", line = 104)
    public final int[][] method157(int arg0, int arg1) {
        ++field5375;
        int[][] var3 = super.field4454.method1638((byte) -121, arg1);
        if (super.field4454.field3886) {
            int[][] var4 = this.method1878(0, arg1, arg0 ^ -24000);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class158.field1877; ++var11) {
                var8[var11] = (var5[var11] * this.field5369 >> 12) + this.field5367;
                var9[var11] = (var6[var11] * this.field5369 >> 12) + this.field5367;
                var10[var11] = (var7[var11] * this.field5369 >> 12) + this.field5367;
            }
        }
        return arg0 != -24032 ? null : var3;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V", line = 155)
    public final void method15(int arg0) {
        this.field5369 = -this.field5367 + this.field5368;
        if (arg0 >= -41) {
            method2268(-34, 75, 72, -128, (byte) -66);
        }
        ++field5366;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)I", line = 177)
    public static final int method2269(int arg0) {
        ++field5371;
        return arg0 != 16853 ? -46 : ((class224.field3102 == 0 ? 0 : 1) << 21) + ((class364.field5231 ? 1 : 0) << 19) + ((!class304.field4495 ? 0 : 1) << 16) + ((class27.field359 ? 1 : 0) << 13) + ((3 & class427.field6166) << 11) + (((!class22.field305 ? 0 : 1) << 10) + ((!class191.field2611 ? 0 : 1) << 8) + ((!class265.field3817 ? 0 : 1) << 6) + ((class198.field2745 ? 1 : 0) << 3) + (class283.field4124 & 7) + (((class445.field6337 ? 1 : 0) << 4) + ((class119.field1484 ? 1 : 0) << 5) - (-((class304.field4496 ? 1 : 0) << 9) + -((class342.field4899 ? 1 : 0) << 15))) - (-(class46.field597 << 17) + -((class304.field4494 != 0 ? 1 : 0) << 20) + (-((class376.field5363 != 0 ? 1 : 0) << 22) - (class175.method861(38) << 23)) + (-(class346.field4943 << 25) - ((class346.field4949 ? 1 : 0) << 27)) - (class300.field4466 << 28)));
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(B)V", line = 189)
    public static final void method2270(byte arg0) {
        if (arg0 == -37) {
            ++field5372;
            if (class293.field4359) {
                class256 var1 = class66.method339(class274.field3905, arg0 + 37, class145.field1749);
                if (var1 != null && var1.field3708 != null) {
                    class35 var2 = new class35();
                    var2.field429 = var1;
                    var2.field435 = var1.field3708;
                    class396.method2371(var2);
                }
                class293.field4359 = false;
                class283.field4126 = -1;
                class208.field2883 = -1;
                if (var1 != null) {
                    class398.method2383(var1, 108);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILvt;)V", line = 224)
    public final void method10(int arg0, int arg1, class179 arg2) {
        if (arg0 >= -44) {
            this.field5369 = 101;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field4449 = ~arg2.method895((byte) -94) == -2;
                }
            } else {
                this.field5368 = arg2.method916(21933);
            }
        } else {
            this.field5367 = arg2.method916(21933);
        }
        ++field5373;
    }
}
