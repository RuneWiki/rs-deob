import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class108 extends class362 {

    @OriginalMember(owner = "client!qfa", name = "F", descriptor = "Z")
    private boolean field1700 = true;

    @OriginalMember(owner = "client!qfa", name = "H", descriptor = "Z")
    private boolean field1702 = true;

    @OriginalMember(owner = "client!qfa", name = "y", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!qfa", name = "A", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!qfa", name = "E", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!qfa", name = "G", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!qfa", name = "z", descriptor = "Lvf;")
    public static class163 field1696;

    @OriginalMember(owner = "client!qfa", name = "C", descriptor = "Ltl;")
    public static class647 field1698;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IB)[[I")
    public final int[][] method153(int arg0, byte arg1) {
        ++field1699;
        int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
        if (arg1 <= 57) {
            method923(-8);
        }
        if (super.field4938.field7848) {
            int[][] var4 = this.method2222(0, !this.field1702 ? arg0 : -arg0 + class606.field8463, 28008);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field1700) {
                for (int var11 = 0; ~var11 > ~class769.field10597; ++var11) {
                    var8[var11] = var5[-var11 + class522.field7083];
                    var9[var11] = var6[class522.field7083 - var11];
                    var10[var11] = var7[-var11 + class522.field7083];
                }
            } else {
                for (int var12 = 0; ~class769.field10597 < ~var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "()V")
    public class108() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(I)V")
    public static void method923(int arg0) {
        if (arg0 != 0) {
            field1697 = -38;
        }
        field1696 = null;
        field1698 = null;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II)[I")
    public final int[] method156(int arg0, int arg1) {
        ++field1695;
        int[] var3 = super.field4927.method808(-124, arg1);
        if (super.field4927.field1471) {
            int[] var4 = this.method2221(0, !this.field1702 ? arg1 : -arg1 + class606.field8463, -125);
            if (this.field1700) {
                for (int var5 = 0; class769.field10597 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class522.field7083];
                }
            } else {
                class275.method1770(var4, 0, var3, 0, class769.field10597);
            }
        }
        if (arg0 != -2026769311) {
            field1697 = -57;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        ++field1701;
        if (arg2 == -1) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        super.field4929 = arg0.method793((byte) 22) == 1;
                    }
                } else {
                    this.field1702 = ~arg0.method793((byte) 10) == -2;
                }
            } else {
                this.field1700 = ~arg0.method793((byte) 27) == -2;
            }
        }
    }
}
