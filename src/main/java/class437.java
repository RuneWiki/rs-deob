import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class437 extends class39 {

    @OriginalMember(owner = "client!uca", name = "F", descriptor = "I")
    public static int field6202 = 0;

    @OriginalMember(owner = "client!uca", name = "L", descriptor = "[I")
    public static int[] field6208 = new int[2];

    @OriginalMember(owner = "client!uca", name = "J", descriptor = "B")
    public byte field6206;

    @OriginalMember(owner = "client!uca", name = "D", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!uca", name = "G", descriptor = "I")
    public int field6203;

    @OriginalMember(owner = "client!uca", name = "I", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!uca", name = "K", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!uca", name = "H", descriptor = "Ldaa;")
    public class11 field6204;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIZ)V")
    public static final void method2585(int arg0, int arg1, boolean arg2) {
        ++field6201;
        if (!arg2) {
            field6202 = -70;
        }
        class314 var3 = class483.method2819(1, arg1, 21303);
        var3.method1959(19793);
        var3.field4227 = arg0;
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(Z)V")
    public static void method2586(boolean arg0) {
        field6208 = null;
        if (arg0) {
            method2585(106, 10, false);
        }
    }

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "(I)I")
    public final int method411(int arg0) {
        ++field6205;
        if (arg0 < 84) {
            this.method410(94);
        }
        return this.field6204 == null ? 0 : this.field6204.field165 * 100 / (this.field6204.field138.length + -this.field6206);
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)[B")
    public final byte[] method410(int arg0) {
        if (arg0 != 14) {
            return null;
        } else {
            ++field6207;
            if (!super.field792 && this.field6204.field165 >= this.field6204.field138.length + -this.field6206) {
                return this.field6204.field138;
            } else {
                throw new RuntimeException();
            }
        }
    }
}
