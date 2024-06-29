import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class32 extends class217 {

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "Lada;")
    public static class144 field396 = new class144(88, 2);

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "B")
    public byte field392;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "Lgw;")
    public class148 field390;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "Llv;")
    public static class379 field393;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)[B", line = 3)
    public final byte[] method207(int arg0) {
        ++field395;
        if (arg0 != 192) {
            field396 = null;
        }
        if (!super.field3178 && ~this.field390.field2177 <= ~(this.field390.field2146.length + -this.field392)) {
            return this.field390.field2146;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lvp;Lqa;I)V", line = 24)
    public static final void method208(class162 arg0, class208 arg1, int arg2) {
        ++field391;
        boolean var3 = class150.field2242.method3597(arg0.field2444, !arg0.field2488 ? null : class541.field8119.field5127, arg1, -16777216 | arg0.field2495, arg0.field2432, arg0.field2434, true, arg0.field2402) == null;
        if (arg2 == 2) {
            if (var3) {
                class345.field4748.method131(new class539(arg0.field2434, arg0.field2444, arg0.field2402, -16777216 | arg0.field2495, arg0.field2432, arg0.field2488), 0);
                class403.method2371(arg0, (byte) -62);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)I", line = 47)
    public final int method209(byte arg0) {
        ++field389;
        if (arg0 != 40) {
            field393 = null;
        }
        return this.field390 == null ? 0 : this.field390.field2177 * 100 / (this.field390.field2146.length + -this.field392);
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V", line = 62)
    public static void method210(int arg0) {
        if (arg0 < 40) {
            method210(113);
        }
        field396 = null;
        field393 = null;
    }
}
