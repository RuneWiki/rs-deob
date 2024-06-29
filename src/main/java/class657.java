import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class657 extends class601 {

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
    private int field8686 = 0;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    private int field8687 = 10;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    private int field8684 = 2048;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    public static int field8685;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public static int field8688;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
    public static int field8689;

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
    public static int field8691;

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "[I")
    private int[] field8683;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "[I")
    private int[] field8690;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "[Lhu;")
    public static class133[] field8682;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lee;BI)V")
    public final void method6(class677 arg0, byte arg1, int arg2) {
        ++field8689;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field8686 = arg0.method3821((byte) 127);
                }
            } else {
                this.field8684 = arg0.method3807(-1);
            }
        } else {
            this.field8687 = arg0.method3821((byte) -88);
        }
        if (arg1 != -61) {
            method3568(-93);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        this.method3569(4096);
        ++field8685;
        if (arg0 != 8351) {
            this.method6((class677) null, (byte) -55, -79);
        }
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)V")
    public static void method3568(int arg0) {
        field8682 = null;
        if (arg0 != 2048) {
            field8682 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)V")
    private final void method3569(int arg0) {
        ++field8688;
        this.field8683 = new int[this.field8687 - -1];
        this.field8690 = new int[this.field8687 - -1];
        int var2 = 0;
        int var3 = arg0 / this.field8687;
        int var4 = this.field8684 * var3 >> 12;
        for (int var5 = 0; this.field8687 > var5; ++var5) {
            this.field8683[var5] = var2;
            this.field8690[var5] = var2 + var4;
            var2 += var3;
        }
        this.field8683[this.field8687] = 4096;
        this.field8690[this.field8687] = this.field8690[0] + 4096;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class657() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)[I")
    public final int[] method5(byte arg0, int arg1) {
        ++field8691;
        if (arg0 != -40) {
            this.method108(31);
        }
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            int var4 = class250.field3446[arg1];
            if (this.field8686 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field8687; ++var6) {
                    if (var4 >= this.field8683[var6] && ~this.field8683[var6 + 1] < ~var4) {
                        if (~this.field8690[var6] < ~var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class335.method2021(var3, 0, class171.field2624, var5);
            } else {
                for (int var7 = 0; ~class171.field2624 < ~var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class453.field6186[var7];
                    int var11 = this.field8686;
                    if (~var11 != -2) {
                        if (var11 != 2) {
                            if (var11 == 3) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var10 - -var4 - 4096 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; this.field8687 > var12; ++var12) {
                        if (var8 >= this.field8683[var12] && this.field8683[var12 + 1] > var8) {
                            if (var8 < this.field8690[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }
}
