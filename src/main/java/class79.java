import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class79 extends class13 {

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "Lkn;")
    public static class442 field1121;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "Lar;")
    public static class407 field1123;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "Ljava/awt/Frame;")
    public static Frame field1119;

    static {
        new class442("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field1121 = new class442(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)Lsd;", line = 5)
    public static final class51 method570(int arg0, int arg1) {
        ++field1117;
        class51 var2 = (class51) class285.field4015.method904(false, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class302.field4171.method1745(arg1, (byte) 67, 35);
            class51 var4 = new class51();
            if (var3 != null) {
                var4.method429((byte) -70, new class11(var3));
            }
            if (arg0 != -31346) {
                return null;
            } else {
                var4.method430(false);
                class285.field4015.method902((long) arg1, (byte) 112, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIBIIIIII)V", line = 32)
    public static final void method571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field1116;
        class273 var13 = new class273();
        var13.field3796 = arg1;
        var13.field3792 = arg9;
        var13.field3794 = arg8;
        var13.field3784 = arg3;
        var13.field3795 = arg0;
        var13.field3785 = arg10;
        var13.field3787 = arg7;
        var13.field3797 = arg4;
        int var14 = 21 % ((29 - arg6) / 39);
        var13.field3798 = arg11;
        var13.field3791 = arg12;
        var13.field3778 = arg5;
        var13.field3779 = arg2;
        class438.field6168.method643(var13, -29);
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V", line = 58)
    public static final void method572(int arg0) {
        ++field1122;
        class131 var1 = class67.field1004;
        synchronized (class67.field1004) {
            class67.field1004.method905((byte) 8);
            if (arg0 != 1) {
                method571(38, 53, -54, -17, -107, -65, (byte) -57, 37, -62, -71, 70, -89, -122);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lkh;BI)V", line = 71)
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (arg1 >= 50) {
            ++field1118;
            if (~arg2 == -1) {
                super.field259 = arg0.method172((byte) 52) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 85)
    public class79() {
        super(3, false);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[[I", line = 91)
    public final int[][] method222(int arg0, int arg1) {
        ++field1115;
        int[][] var3 = super.field256.method1930(arg1, (byte) 110);
        if (arg0 != -27832) {
            method573((byte) -74);
        }
        if (super.field256.field4154) {
            int[] var4 = this.method223(2, -11541, arg1);
            int[][] var5 = this.method227(false, arg1, 0);
            int[][] var6 = this.method227(false, arg1, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class269.field3751; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 != 0) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)[I", line = 175)
    public final int[] method29(boolean arg0, int arg1) {
        ++field1120;
        if (!arg0) {
            field1119 = null;
        }
        int[] var3 = super.field263.method893(arg1, 1578);
        if (super.field263.field1845) {
            int[] var4 = this.method223(0, -11541, arg1);
            int[] var5 = this.method223(1, -11541, arg1);
            int[] var6 = this.method223(2, -11541, arg1);
            for (int var7 = 0; ~class269.field3751 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(B)V", line = 230)
    public static void method573(byte arg0) {
        field1119 = null;
        field1121 = null;
        if (arg0 == 19) {
            field1123 = null;
        }
    }
}
