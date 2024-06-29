import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class237 extends class210 {

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "Z")
    public static boolean field3529 = false;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    public static int field3532 = 0;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "Lsl;")
    public static class30 field3528;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZI)B")
    public static final byte method1595(int arg0, boolean arg1, int arg2) {
        ++field3526;
        if (!arg1) {
            method1596((byte) -128);
        }
        if (~arg2 != -10) {
            return 0;
        } else {
            return (byte) (~(1 & arg0) == -1 ? 1 : 2);
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
    public static void method1596(byte arg0) {
        field3528 = null;
        if (arg0 != -54) {
            method1595(117, true, 67);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(IZI)V")
    public static final void method1597(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field3529 = true;
        }
        ++field3531;
        class125 var3 = class56.method428(arg0, 14, -3636);
        var3.method846(26848);
        var3.field1657 = arg2;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class237() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)[I")
    public final int[] method361(int arg0, byte arg1) {
        ++field3530;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            int var4 = class331.field4911[arg0];
            for (int var5 = 0; ~var5 > ~class202.field2852; ++var5) {
                var3[var5] = this.method1598(-23405, class430.field6250[var5], var4) % 4096;
            }
        }
        if (arg1 != -38) {
            method1596((byte) 8);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(III)I")
    private final int method1598(int arg0, int arg1, int arg2) {
        ++field3527;
        int var4 = arg2 * 57 + arg1;
        if (arg0 != -23405) {
            method1595(80, false, 84);
        }
        int var5 = var4 ^ var4 << 1;
        return -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }
}
