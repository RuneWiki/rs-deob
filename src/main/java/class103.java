import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class103 extends class175 {

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
    private int field1468 = 4096;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
    private int field1475 = 4096;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
    private int field1473 = 4096;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "Ldaa;")
    public static class12 field1470 = new class12(2);

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "F")
    public static float field1476;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "Lhh;")
    public static class140 field1472;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "Lck;")
    public static class666 field1471;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V", line = 8)
    public static void method794(byte arg0) {
        if (arg0 != 45) {
            field1471 = null;
        }
        field1471 = null;
        field1472 = null;
        field1470 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)[[I", line = 20)
    public final int[][] method238(int arg0, byte arg1) {
        ++field1474;
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (super.field2316.field8746) {
            int[][] var4 = this.method1205(0, arg0, 29179);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class598.field8136 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field1468 * var12 >> 12;
                    var9[var11] = this.field1473 * var13 >> 12;
                    var10[var11] = this.field1475 * var14 >> 12;
                } else {
                    var8[var11] = this.field1468;
                    var9[var11] = this.field1473;
                    var10[var11] = this.field1475;
                }
            }
        }
        if (arg1 >= -47) {
            method795(27, 9);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V", line = 88)
    public class103() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILdt;Z)V", line = 97)
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        ++field1477;
        if (!arg2) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        this.field1475 = arg1.method1728((byte) 98);
                    }
                } else {
                    this.field1473 = arg1.method1728((byte) 91);
                }
            } else {
                this.field1468 = arg1.method1728((byte) 20);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I", line = 141)
    public static final int method795(int arg0, int arg1) {
        int var2 = 73 / ((arg1 - -1) / 33);
        ++field1469;
        return arg0 >>> 10;
    }
}
