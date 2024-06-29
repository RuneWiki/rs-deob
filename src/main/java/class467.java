import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class467 extends class4 {

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    private int field6624 = 4096;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    private int field6628 = 0;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "Lgn;")
    public static class635 field6627 = new class635();

    @OriginalMember(owner = "client!li", name = "L", descriptor = "[I")
    public static int[] field6629;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (arg0 > -89) {
            this.method17(-109, (byte) 98);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field44 = ~arg1.method3045(-126) == -2;
                }
            } else {
                this.field6624 = arg1.method3090(-103);
            }
        } else {
            this.field6628 = arg1.method3090(-76);
        }
        ++field6623;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field6625;
        int[] var3 = super.field31.method2252(arg1, 11);
        if (super.field31.field5127) {
            int[] var4 = this.method20(0, -21986, arg1);
            for (int var5 = 0; ~class132.field1627 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (this.field6628 <= var6) {
                    if (~this.field6624 <= ~var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field6624;
                    }
                } else {
                    var3[var5] = this.field6628;
                }
            }
        }
        return arg0 != 10 ? null : var3;
    }

    @OriginalMember(owner = "client!li", name = "i", descriptor = "(I)V")
    public static void method2682(int arg0) {
        if (arg0 != 2) {
            field6629 = null;
        }
        field6629 = null;
        field6627 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        ++field6626;
        int[][] var3 = super.field38.method3021((byte) 89, arg0);
        if (arg1 > -83) {
            this.method15((byte) -38, 109);
        }
        if (super.field38.field7618) {
            int[][] var4 = this.method22(arg0, (byte) -121, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class132.field1627 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~this.field6628 < ~var12) {
                    var8[var11] = this.field6628;
                } else if (this.field6624 >= var12) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field6624;
                }
                if (this.field6628 <= var13) {
                    if (~this.field6624 > ~var13) {
                        var9[var11] = this.field6624;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field6628;
                }
                if (this.field6628 > var14) {
                    var10[var11] = this.field6628;
                } else if (this.field6624 >= var14) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field6624;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
    public class467() {
        super(1, false);
    }

    static {
        new class344("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field6629 = new int[1];
    }
}
