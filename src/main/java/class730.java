import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class730 implements class344 {

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "Lwm;")
    private class30 field9571;

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "Lgp;")
    public static class576 field9570 = new class576(1, 2);

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "I")
    public static int field9568;

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "I")
    public static int field9569;

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "I")
    public static int field9572;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)Ldca;", line = 4)
    public final class571 method254(byte arg0) {
        int var2 = -80 % ((48 - arg0) / 51);
        field9569++;
        return class571.field7216;
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(Z)V", line = 15)
    public static void method3898(boolean arg0) {
        if (!arg0) {
            method3898(false);
        }
        field9570 = null;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Z)I", line = 26)
    public final int method256(boolean arg0) {
        if (arg0) {
            this.method256(true);
        }
        field9568++;
        return this.field9571.method157(-66) ? 100 : this.field9571.method159(0);
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Lwm;)V", line = 43)
    public class730(class30 arg0) {
        this.field9571 = arg0;
    }
}
