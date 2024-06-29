import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class461 {

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field6665 = 503;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "[B")
    public static byte[] field6668 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "Loda;")
    public static class559 field6666 = null;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "[I")
    public static int[] field6667 = new int[8];

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field6669 = 0;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field6670 = 0;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field6672 = new String[100];

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field6673;

    static {
        new class487(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lwu;I)Z", line = 17)
    public static final boolean method2741(class500 arg0, int arg1) {
        field6671++;
        if (arg1 != 503) {
            field6668 = null;
        }
        return class118.field1545 == arg0 || class179.field2709 == arg0 || class177.field2694 == arg0 || class494.field7454 == arg0;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 35)
    public static void method2742(byte arg0) {
        if (arg0 == 35) {
            field6672 = null;
            field6666 = null;
            field6667 = null;
            field6668 = null;
        }
    }
}
