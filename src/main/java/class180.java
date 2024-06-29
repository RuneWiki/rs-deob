import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class180 extends class359 {

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "Ljava/lang/String;")
    public String field2477;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2473 = "Stellar Dawn is loading - please wait...";

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "[B")
    public static byte[] field2476 = new byte[520];

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Lrb;")
    public static class197 field2475;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public static void method1174(int arg0) {
        field2475 = null;
        field2473 = null;
        if (arg0 == -1) {
            field2476 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBI)I")
    public static final int method1175(int arg0, byte arg1, int arg2) {
        if (arg1 != 63) {
            method1175(23, (byte) 10, 20);
        }
        field2478++;
        class417 var3 = (class417) class201.field2774.method1204((byte) -104, (long) arg2);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && var3.field5987.length > arg0) {
            return var3.field5987[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class180() {
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class180(String arg0, int arg1) {
        this.field2477 = arg0;
    }
}
