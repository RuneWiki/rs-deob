import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class321 extends class11 {

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
    private int field4385 = 4096;

    @OriginalMember(owner = "client!nq", name = "L", descriptor = "I")
    private int field4387 = 4096;

    @OriginalMember(owner = "client!nq", name = "M", descriptor = "I")
    private int field4388 = 4096;

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "[I")
    public static int[] field4386 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!nq", name = "G", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!nq", name = "H", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
    public static int field4384;

    static {
        new class466("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        new class466("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)[[I", line = 4)
    public final int[][] method41(int arg0, int arg1) {
        ++field4384;
        int var3 = 113 % ((-75 - arg0) / 49);
        int[][] var4 = super.field156.method1719(arg1, 3);
        if (super.field156.field4001) {
            int[][] var5 = this.method49(arg1, 0, 127);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class90.field1316; ++var12) {
                int var13 = var6[var12];
                int var14 = var8[var12];
                int var15 = var7[var12];
                if (var13 == var14 && ~var14 == ~var15) {
                    var9[var12] = this.field4387 * var13 >> 12;
                    var10[var12] = this.field4385 * var14 >> 12;
                    var11[var12] = this.field4388 * var15 >> 12;
                } else {
                    var9[var12] = this.field4387;
                    var10[var12] = this.field4385;
                    var11[var12] = this.field4388;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(B)V", line = 68)
    public static void method1862(byte arg0) {
        field4386 = null;
        if (arg0 != 122) {
            field4386 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lsi;II)V", line = 80)
    public final void method43(class391 arg0, int arg1, int arg2) {
        if (arg1 < -40) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        this.field4388 = arg0.method2353((byte) 78);
                    }
                } else {
                    this.field4385 = arg0.method2353((byte) 71);
                }
            } else {
                this.field4387 = arg0.method2353((byte) 82);
            }
            ++field4382;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIII)V", line = 124)
    public static final void method1863(int arg0, int arg1, int arg2, int arg3) {
        ++field4383;
        class481.field7027.method2359(arg2, -86);
        class481.field7027.method2307(arg3, -1069935832);
        if (arg1 <= 112) {
            field4386 = null;
        }
        class481.field7027.method2307(arg0, -1069935832);
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V", line = 148)
    public class321() {
        super(1, false);
    }
}
