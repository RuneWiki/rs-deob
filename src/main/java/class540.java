import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class540 extends class535 {

    @OriginalMember(owner = "client!lo", name = "F", descriptor = "I")
    private int field7941 = 4096;

    @OriginalMember(owner = "client!lo", name = "H", descriptor = "I")
    private int field7943 = 4096;

    @OriginalMember(owner = "client!lo", name = "I", descriptor = "I")
    private int field7944 = 4096;

    @OriginalMember(owner = "client!lo", name = "O", descriptor = "[I")
    private int[] field7950 = new int[3];

    @OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
    private int field7945 = 409;

    @OriginalMember(owner = "client!lo", name = "L", descriptor = "Lbd;")
    public static class44 field7947 = new class44("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!lo", name = "P", descriptor = "I")
    public static int field7951 = 0;

    @OriginalMember(owner = "client!lo", name = "Q", descriptor = "Lbd;")
    public static class44 field7952;

    @OriginalMember(owner = "client!lo", name = "G", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!lo", name = "K", descriptor = "I")
    public static int field7946;

    @OriginalMember(owner = "client!lo", name = "M", descriptor = "I")
    public static int field7948;

    @OriginalMember(owner = "client!lo", name = "N", descriptor = "I")
    public static int field7949;

    @OriginalMember(owner = "client!lo", name = "R", descriptor = "I")
    public static int field7953;

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
    public class540() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)V")
    public static void method3177(int arg0) {
        if (arg0 <= 1) {
            method3178((class519) null, 28);
        }
        field7947 = null;
        field7952 = null;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)[[I")
    public final int[][] method61(int arg0, int arg1) {
        ++field7942;
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (arg0 > -116) {
            this.method61(67, -128);
        }
        if (super.field7879.field1528) {
            int[][] var4 = this.method3157((byte) 67, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class174.field2597; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field7950[0];
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~this.field7945 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field7950[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~this.field7945 > ~var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field7950[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field7945) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field7943 * var12 >> 12;
                            var9[var11] = this.field7941 * var14 >> 12;
                            var10[var11] = this.field7944 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lwn;I)Lpn;")
    public static final class535 method3178(class519 arg0, int arg1) {
        ++field7946;
        arg0.method3072((byte) -124);
        int var2 = arg0.method3072((byte) -125);
        class535 var3 = class5.method15(24, var2);
        var3.field7889 = arg0.method3072((byte) -121);
        int var4 = arg0.method3072((byte) -127);
        for (int var5 = arg1; var5 < var4; ++var5) {
            int var6 = arg0.method3072((byte) -121);
            var3.method60(var6, arg0, arg1 + -6232);
        }
        var3.method66((byte) 124);
        return var3;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILwn;I)V")
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg2 != -6232) {
            this.field7943 = -102;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            int var5 = arg1.method3040((byte) -3);
                            this.field7950[2] = class168.method1203(0, var5 >> 12);
                            this.field7950[0] = class168.method1203(16711680, var5) << 4;
                            this.field7950[1] = class168.method1203(4080, var5 >> 4);
                        }
                    } else {
                        this.field7943 = arg1.method3018(arg2 ^ -566984816);
                    }
                } else {
                    this.field7941 = arg1.method3018(566990904);
                }
            } else {
                this.field7944 = arg1.method3018(566990904);
            }
        } else {
            this.field7945 = arg1.method3018(566990904);
        }
        ++field7948;
    }

    static {
        new class44("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        new class44("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field7952 = new class44(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");
    }
}
