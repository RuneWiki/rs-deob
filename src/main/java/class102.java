import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class102 extends class512 {

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
    private int field1687 = 1365;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
    private int field1689 = 0;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
    private int field1691 = 0;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    private int field1694 = 20;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public static int field1688 = -1;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)[I", line = 4)
    public final int[] method75(int arg0, byte arg1) {
        ++field1690;
        int[] var3 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            for (int var4 = 0; ~var4 > ~class402.field6113; ++var4) {
                int var5 = (class276.field4540[var4] << 12) / this.field1687 - -this.field1689;
                int var6 = (class412.field6233[arg0] << 12) / this.field1687 - -this.field1691;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 - -var12 < 16384 && ~this.field1694 < ~var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var11 - -var7 + -var12;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = this.field1694 + -1 <= var13 ? 0 : (var13 << 12) / this.field1694;
            }
        }
        int var14 = 4 % ((arg1 - 43) / 48);
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II[S)[S", line = 64)
    public static final short[] method700(int arg0, int arg1, short[] arg2) {
        ++field1692;
        short[] var3 = new short[arg1];
        class85.method609(arg2, 0, var3, arg0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 76)
    public class102() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZILia;)V", line = 79)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        ++field1693;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 == 3) {
                        this.field1691 = arg2.method132(104);
                    }
                } else {
                    this.field1689 = arg2.method132(108);
                }
            } else {
                this.field1694 = arg2.method132(123);
            }
        } else {
            this.field1687 = arg2.method132(112);
        }
        if (!arg0) {
            this.field1689 = -20;
        }
    }
}
