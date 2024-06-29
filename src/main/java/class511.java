import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class511 {

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "Ljava/lang/String;")
    public String field6992;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Ljava/lang/String;")
    public String field6994;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Ljava/lang/String;")
    public String field6991;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "J")
    public static long field6993 = -1L;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V", line = 13)
    public static final void method2838(byte arg0) {
        if (arg0 == 8) {
            field6990++;
            class278.field3897.method2060(0);
            class638.field9060.method2060(0);
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 26)
    public class511(String arg0, String arg1, String arg2) {
        this.field6992 = arg2;
        this.field6994 = arg1;
        this.field6991 = arg0;
    }
}
