import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class298 extends class512 {

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    private int field4793 = 4096;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    private int field4795 = 4096;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    private int field4791 = 4096;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "Llo;")
    public static class306 field4796;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "Lsd;")
    public static class199 field4798;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "Lqs;")
    public static class496 field4799;

    static {
        new class306(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field4796 = new class306("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 4)
    public class298() {
        super(1, false);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZILia;)V", line = 14)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        ++field4797;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field4791 = arg2.method132(78);
                }
            } else {
                this.field4795 = arg2.method132(81);
            }
        } else {
            this.field4793 = arg2.method132(121);
        }
        if (!arg0) {
            this.method278(24, 54);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)[[I", line = 58)
    public final int[][] method278(int arg0, int arg1) {
        ++field4794;
        int[][] var3 = super.field7496.method2777(arg1, 0);
        int var4 = 127 / ((-40 - arg0) / 47);
        if (super.field7496.field6942) {
            int[][] var5 = this.method3012(arg1, 67, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; var12 < class402.field6113; ++var12) {
                int var13 = var6[var12];
                int var14 = var8[var12];
                int var15 = var7[var12];
                if (~var13 == ~var14 && ~var14 == ~var15) {
                    var9[var12] = this.field4793 * var13 >> 12;
                    var10[var12] = this.field4795 * var14 >> 12;
                    var11[var12] = this.field4791 * var15 >> 12;
                } else {
                    var9[var12] = this.field4793;
                    var10[var12] = this.field4795;
                    var11[var12] = this.field4791;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V", line = 139)
    public static void method1916(int arg0) {
        field4798 = null;
        field4799 = null;
        if (arg0 >= 99) {
            field4796 = null;
        }
    }
}
