import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class440 extends class136 {

    @OriginalMember(owner = "client!oo", name = "F", descriptor = "I")
    private int field6538 = 0;

    @OriginalMember(owner = "client!oo", name = "H", descriptor = "I")
    private int field6540 = 20;

    @OriginalMember(owner = "client!oo", name = "E", descriptor = "I")
    private int field6537 = 1365;

    @OriginalMember(owner = "client!oo", name = "K", descriptor = "I")
    private int field6543 = 0;

    @OriginalMember(owner = "client!oo", name = "G", descriptor = "S")
    public static short field6539 = 1;

    @OriginalMember(owner = "client!oo", name = "D", descriptor = "Lpk;")
    public static class133 field6536 = new class133();

    @OriginalMember(owner = "client!oo", name = "I", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!oo", name = "J", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!oo", name = "L", descriptor = "Lln;")
    public static class257 field6544;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)[I")
    public final int[] method82(int arg0, int arg1) {
        ++field6542;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        if (super.field1957.field7031) {
            for (int var4 = 0; ~class467.field6889 < ~var4; ++var4) {
                int var5 = (class453.field6672[var4] << 12) / this.field6537 + this.field6543;
                int var6 = (class290.field4168[arg1] << 12) / this.field6537 + this.field6538;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && var13 < this.field6540) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var7 + var11 + -var12;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = var13 < this.field6540 - 1 ? (var13 << 12) / this.field6540 : 0;
            }
        }
        int var14 = 102 / ((67 - arg0) / 50);
        return var3;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
    public class440() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "(I)V")
    public static void method2690(int arg0) {
        if (arg0 > -84) {
            field6539 = 101;
        }
        field6536 = null;
        field6544 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (arg0 != 4) {
            this.method268(100, 48, (class65) null);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        this.field6538 = arg2.method623((byte) 99);
                    }
                } else {
                    this.field6543 = arg2.method623((byte) 82);
                }
            } else {
                this.field6540 = arg2.method623((byte) 87);
            }
        } else {
            this.field6537 = arg2.method623((byte) 105);
        }
        ++field6541;
    }
}
