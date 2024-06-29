import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class401 extends RuntimeException {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Ljava/lang/String;")
    public String field5554;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field5555;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Lsea;")
    public static class399 field5557 = new class399();

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field5559 = 1;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field5560 = 0;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 5)
    public static void method2379(byte arg0) {
        field5557 = null;
        int var1 = 65 % ((arg0 + 54) / 51);
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 14)
    public class401(Throwable arg0, String arg1) {
        this.field5554 = arg1;
        this.field5555 = arg0;
    }
}
