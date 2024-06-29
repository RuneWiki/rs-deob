import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class562 extends class277 {

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "Ljava/lang/String;")
    public static String field7815 = "";

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "Lrga;")
    public static class280 field7810 = new class280(5, 4);

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field7812;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public static int field7814;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V")
    public final void method276(int arg0, int arg1, int arg2) {
        ++field7817;
        if (arg1 != 50) {
            this.method276(125, 23, 61);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)Z")
    public final boolean method284(byte arg0) {
        if (arg0 > -93) {
            return false;
        } else {
            ++field7814;
            return true;
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lqj;)V")
    public class562(class548 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILrg;)V")
    public final void method279(int arg0, int arg1, class615 arg2) {
        ++field7812;
        if (arg1 == 7) {
            super.field3475.method2960(arg2, -2);
            super.field3475.method3005(false, arg0);
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
    public static void method3085(int arg0) {
        field7815 = null;
        if (arg0 != 5495) {
            method3085(-91);
        }
        field7810 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZ)V")
    public final void method280(int arg0, boolean arg1) {
        if (arg0 >= -64) {
            this.method277(62, false);
        }
        ++field7811;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
    public final void method278(int arg0) {
        if (arg0 != 1268) {
            field7815 = null;
        }
        ++field7816;
        super.field3475.method3023((byte) -127, false);
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(IZ)V")
    public final void method277(int arg0, boolean arg1) {
        ++field7813;
        int var3 = -16 / ((65 - arg0) / 60);
        super.field3475.method3023((byte) 123, true);
    }
}
