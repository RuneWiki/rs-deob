import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class304 extends RuntimeException {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4436;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Ljava/lang/String;")
    public String field4440;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Luu;")
    public static class191 field4439;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "[[[B")
    public static byte[][][] field4438;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 5)
    public static void method1917(int arg0) {
        if (arg0 != 11014) {
            method1917(57);
        }
        field4438 = null;
        field4439 = null;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 22)
    public class304(Throwable arg0, String arg1) {
        this.field4436 = arg0;
        this.field4440 = arg1;
    }
}
