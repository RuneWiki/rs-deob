import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class220 extends class3 {

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "[I")
    public static int[] field2886 = null;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "B")
    public byte field2888;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public int field2885;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "Lfd;")
    public class418 field2883;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)I")
    public final int method11(int arg0) {
        ++field2887;
        if (this.field2883 == null) {
            return 0;
        } else {
            return arg0 >= -113 ? 78 : this.field2883.field5367 * 100 / (this.field2883.field5393.length + -this.field2888);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
    public static void method1400(boolean arg0) {
        if (!arg0) {
            field2886 = null;
        }
        field2886 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)I")
    public static final int method1401(int arg0, int arg1, int arg2) {
        ++field2884;
        if (arg0 != 4 && ~arg0 != -6) {
            if (arg2 != -13185) {
                method1401(-16, 82, -107);
            }
            return 256;
        } else {
            return class590.field8002[arg1 & 3];
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)[B")
    public final byte[] method8(byte arg0) {
        ++field2889;
        if (!super.field20 && this.field2883.field5367 >= this.field2883.field5393.length - this.field2888) {
            return arg0 != 2 ? null : this.field2883.field5393;
        } else {
            throw new RuntimeException();
        }
    }
}
