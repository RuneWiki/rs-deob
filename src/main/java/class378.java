import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class378 extends class337 {

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Ljava/lang/String;")
    public String field5765;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Z")
    public static boolean field5762 = false;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Lki;")
    public static class498 field5760 = new class498(59, -1);

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field5763 = 0;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "[I")
    public static int[] field5764 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field5767 = 0;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "[I")
    public static int[] field5766 = new int[1024];

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 13)
    public static void method2317(byte arg0) {
        field5764 = null;
        field5760 = null;
        int var1 = 60 % ((arg0 - 32) / 54);
        field5766 = null;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 33)
    public class378() {
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 39)
    public class378(String arg0, int arg1) {
        this.field5765 = arg0;
    }
}
