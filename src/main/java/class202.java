import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class202 extends class214 {

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    private int field3423 = 4096;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "[I")
    public static int[] field3427 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V")
    public static void method1498(int arg0) {
        if (arg0 != 7400) {
            field3427 = null;
        }
        field3427 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field3424;
        int[] var3 = super.field3544.method3869(arg0, -115);
        if (arg1 != 5) {
            return null;
        } else {
            if (super.field3544.field9836) {
                int[] var4 = this.method1545(arg0 + -1 & class580.field8203, 0, -1);
                int[] var5 = this.method1545(arg0, 0, -1);
                int[] var6 = this.method1545(arg0 + 1 & class580.field8203, 0, -1);
                for (int var7 = 0; class626.field8787 > var7; ++var7) {
                    int var8 = (var6[var7] + -var4[var7]) * this.field3423;
                    int var9 = (var5[var7 + 1 & class245.field3948] + -var5[class245.field3948 & var7 + -1]) * this.field3423;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (Math.sqrt((double) ((float) (var13 - -4096 + var12) / 4096.0F)) * 4096.0D);
                    int var15 = var14 != 0 ? 16777216 / var14 : 0;
                    var3[var7] = 4096 - var15;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public static final void method1499(byte arg0, String arg1, int arg2) {
        ++class338.field4948;
        ++field3425;
        class540 var3 = class257.method1732(true, class115.field1789, class655.field9332);
        var3.field7707.method1926(class16.method101(-31, arg1) + 1, 65280);
        var3.field7707.method1955((byte) -65, arg2);
        var3.field7707.method1931(124, arg1);
        class756.method4211(var3, 122);
        if (arg0 <= 121) {
            method1498(-9);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILofa;I)V")
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (arg0 > 92) {
            ++field3426;
            if (arg2 == 0) {
                this.field3423 = arg1.method1989((byte) -37);
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class202() {
        super(1, true);
    }
}
