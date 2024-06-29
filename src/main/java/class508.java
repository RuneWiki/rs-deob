import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class508 extends class383 {

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public volatile int field7310 = -1;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "Ljava/lang/String;")
    public volatile String field7313;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "[Z")
    public static boolean[] field7311 = new boolean[100];

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "Lub;")
    public static class18 field7312 = new class18();

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 30)
    public class508(String arg0) {
        this.field7313 = arg0;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V", line = 13)
    public static void method3048(byte arg0) {
        if (arg0 >= 118) {
            field7312 = null;
            field7311 = null;
        }
    }
}
