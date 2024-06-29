import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class35 extends class120 {

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public static int field447 = 0;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "Ljava/lang/String;")
    public static String field450 = "rating: ";

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "Lnd;")
    public static class263 field448 = null;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "[I")
    public static int[] field452 = new int[5];

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "[[[B")
    public static byte[][][] field449 = new byte[4][104][104];

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "Lkf;")
    public static class180 field451;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "Z")
    public static boolean field446;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "[Lhc;")
    public static class229[] field453;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
    public static void method276(byte arg0) {
        field451 = null;
        field450 = null;
        field449 = null;
        if (arg0 != -117) {
            field453 = null;
        }
        field452 = null;
        field448 = null;
        field453 = null;
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V")
    public static final void method277(int arg0) {
        class94.field1460.method1430(-1);
        if (arg0 != 104) {
            method277(12);
        }
        field455++;
    }
}
