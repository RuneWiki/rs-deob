import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class412 {

    @OriginalMember(owner = "client!sba", name = "h", descriptor = "B")
    private byte field5823;

    @OriginalMember(owner = "client!sba", name = "i", descriptor = "I")
    public int field5824;

    @OriginalMember(owner = "client!sba", name = "j", descriptor = "I")
    public int field5825;

    @OriginalMember(owner = "client!sba", name = "k", descriptor = "I")
    public int field5826;

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "I")
    public int field5817;

    @OriginalMember(owner = "client!sba", name = "g", descriptor = "I")
    public int field5822;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "Lgaa;")
    public static class460 field5821;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)[Lgq;", line = 3)
    public static final class761[] method2441(int arg0) {
        if (arg0 > -29) {
            method2441(46);
        }
        field5820++;
        return new class761[] { class528.field7446, class471.field6761, class494.field6997 };
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)I", line = 17)
    public final int method2442(int arg0) {
        if (arg0 == 1) {
            field5818++;
            return (this.field5823 & 0x8) == 8 ? 1 : 0;
        } else {
            return -12;
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(III)V", line = 30)
    public static final void method2443(int arg0, int arg1, int arg2) {
        field5816++;
        class548 var3 = class696.method3872(0, 15, -1633381944);
        if (arg0 != 8) {
            method2444((byte) -96);
        }
        var3.method3130(arg0 + 68);
        var3.field7726 = arg1;
        var3.field7725 = arg2;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)V", line = 50)
    public static void method2444(byte arg0) {
        int var1 = 44 / ((-arg0 - 76) / 43);
        field5821 = null;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Z)I", line = 65)
    public final int method2445(boolean arg0) {
        if (arg0) {
            method2444((byte) 65);
        }
        field5819++;
        return this.field5823 & 0x7;
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "()V", line = 77)
    public class412() {
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Ltn;)V", line = 79)
    public class412(class179 arg0) {
        this.field5823 = arg0.method1133(8);
        this.field5824 = arg0.method1107(false);
        this.field5825 = arg0.method1095((byte) 127);
        this.field5826 = arg0.method1095((byte) 119);
        this.field5817 = arg0.method1095((byte) 126);
        this.field5822 = arg0.method1095((byte) 122);
    }
}
