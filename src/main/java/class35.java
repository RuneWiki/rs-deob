import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class35 {

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Ljava/lang/String;")
    public static String field450 = " from your friend list first.";

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lpi;")
    public static class239 field446;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 7)
    public static void method256(byte arg0) {
        field446 = null;
        field450 = null;
        int var1 = 97 / ((-arg0 - 61) / 61);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lwf;I)V", line = 22)
    public static final void method257(class306 arg0, int arg1) {
        field448++;
        if (arg1 != -3969) {
            field446 = (class239) null;
        }
        class196.field2935 = arg0.method2107("runes", (byte) 116);
    }
}
