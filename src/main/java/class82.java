import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class82 {

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public int field1019;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field1020 = -2;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1022 = null;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field1021 = 0;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!um", name = "toString", descriptor = "()Ljava/lang/String;", line = 13)
    public final String toString() {
        field1023++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V", line = 27)
    public static void method468(byte arg0) {
        field1022 = null;
        if (arg0 < 112) {
            method468((byte) 28);
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 39)
    public class82(String arg0, int arg1) {
        this.field1019 = arg1;
    }
}
