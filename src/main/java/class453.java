import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class453 {

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public int field6607;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "Ljava/lang/String;")
    public String field6605;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "Lci;")
    public static class320 field6608;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)V", line = 4)
    public static final void method2698(int arg0, boolean arg1) {
        if (!arg1) {
            method2699(93);
        }
        field6606++;
        class275 var2 = class213.method1433((byte) 57, 5, arg0);
        var2.method1774((byte) -45);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 21)
    public static void method2699(int arg0) {
        if (arg0 >= 59) {
            field6608 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "toString", descriptor = "()Ljava/lang/String;", line = 31)
    public final String toString() {
        field6610++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 41)
    public class453(String arg0, int arg1) {
        this.field6607 = arg1;
        this.field6605 = arg0;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIII)V", line = 53)
    public static final void method2700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 16730) {
            field6608 = null;
        }
        if (class220.field3371.field2549 != 0 && arg1 != 0 && class215.field3238 < 50 && arg3 != -1) {
            class79.field1281[class215.field3238++] = new class306((byte) 1, arg3, arg1, arg5, arg0, arg2);
        }
        field6609++;
    }
}
