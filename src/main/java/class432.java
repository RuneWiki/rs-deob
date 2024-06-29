import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class432 extends class354 {

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    private int field6297 = 4096;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    private int field6296 = 0;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "Lao;")
    public static class188 field6298 = new class188(1, 4);

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V")
    public static final void method2621(int arg0) {
        ++field6294;
        ++class169.field2535;
        int var1 = 117 / ((-44 - arg0) / 49);
        class114.method841(false, class271.field3926);
        class86.field1436.method1923((byte) 62, 0);
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)V")
    public static void method2622(byte arg0) {
        field6298 = null;
        if (arg0 != -91) {
            method2622((byte) -43);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILti;I)V")
    public final void method206(int arg0, class303 arg1, int arg2) {
        ++field6295;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field6297 = arg1.method1868(0);
            }
        } else {
            this.field6296 = arg1.method1868(0);
        }
        if (arg0 != 15180) {
            method2621(111);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)[I")
    public final int[] method253(int arg0, byte arg1) {
        ++field6299;
        int[] var3 = super.field5357.method861(true, arg0);
        if (arg1 != -95) {
            field6300 = -127;
        }
        if (super.field5357.field1869) {
            int[] var4 = this.method2293(0, arg0, (byte) 69);
            for (int var5 = 0; ~class404.field5952 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field6296 && var6 <= this.field6297 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class432() {
        super(1, true);
    }
}
