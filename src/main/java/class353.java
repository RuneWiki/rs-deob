import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class353 {

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public int field5016;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "B")
    public static byte field5018 = -6;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "Lrt;")
    public static class470 field5017;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V", line = 6)
    public static void method2139(boolean arg0) {
        if (arg0) {
            field5017 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 16)
    public static final void method2140(int arg0) {
        class494 var1 = class725.field10099;
        synchronized (class725.field10099) {
            class725.field10099.method2893((byte) -103);
        }
        field5015++;
        class494 var2 = class677.field9507;
        synchronized (class677.field9507) {
            class677.field9507.method2893((byte) 105);
        }
        if (arg0 >= -13) {
            method2141(true, (char) 65500);
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(II)V", line = 33)
    public class353(int arg0, int arg1) {
        this.field5016 = arg1;
    }

    @OriginalMember(owner = "client!hl", name = "toString", descriptor = "()Ljava/lang/String;", line = 48)
    public final String toString() {
        field5014++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZC)Z", line = 59)
    public static final boolean method2141(boolean arg0, char arg1) {
        if (!arg0) {
            method2140(-20);
        }
        field5019++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }
}
