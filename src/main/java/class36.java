import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class36 extends class179 implements class562 {

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "Lkq;")
    private class594 field375;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field370 = 0;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field371 = -1;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lhl;Lkq;Z)V")
    public class36(class529 arg0, class594 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field375 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
    public final void method176(boolean arg0) {
        ++field373;
        super.method176(arg0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)I")
    public final int method177(int arg0) {
        ++field367;
        if (arg0 != 200) {
            this.field375 = null;
        }
        return super.method177(200);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Z")
    public final boolean method178(byte arg0) {
        ++field368;
        int var2 = 116 % ((-46 - arg0) / 32);
        return super.method1025((byte) -68, super.field2195.field7183);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method179(boolean arg0, int arg1) {
        if (arg1 > -79) {
            field371 = 20;
        }
        ++field372;
        return super.method1016(arg0, super.field2195.field7183, -15793);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
    public final void method180(int arg0, int arg1) {
        ++field374;
        super.method180(this.field375.field8274 * arg0, arg1);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Lkq;")
    public final class594 method181(int arg0) {
        ++field369;
        if (arg0 != -15448) {
            this.method177(120);
        }
        return this.field375;
    }
}
