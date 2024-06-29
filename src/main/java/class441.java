import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public class class441 {

    @OriginalMember(owner = "client!mja", name = "d", descriptor = "Ljava/lang/String;")
    public String field5924;

    @OriginalMember(owner = "client!mja", name = "f", descriptor = "I")
    public int field5926;

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!mja", name = "b", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!mja", name = "e", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!mja", name = "c", descriptor = "Ler;")
    public static class117 field5923;

    @OriginalMember(owner = "client!mja", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5925++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(B)V")
    public static void method2600(byte arg0) {
        field5923 = null;
        if (arg0 != -100) {
            method2600((byte) 102);
        }
    }

    @OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
    public class441(String arg0, String arg1, int arg2) {
        this.field5924 = arg0;
        this.field5926 = arg2;
    }
}
