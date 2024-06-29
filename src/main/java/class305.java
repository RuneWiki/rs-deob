import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class305 {

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public int field4795;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "[I")
    public static int[] field4792 = new int[1000];

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "Lss;")
    public static class213 field4794 = new class213("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Lhi;")
    public static class318 field4798 = new class318(16);

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field4800 = 0;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "[B")
    public static byte[] field4801 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "S")
    public static short field4802 = 320;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "Lmn;")
    public static class162 field4799;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "Lpo;")
    public static class258 field4797;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)I")
    public static final int method2055(int arg0, int arg1) {
        if (arg1 != -1) {
            field4800 = 47;
        }
        field4796++;
        return arg0 == 16711935 ? -1 : class328.method2193(arg0, 255);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
    public static void method2056(byte arg0) {
        field4792 = null;
        field4797 = null;
        field4798 = null;
        if (arg0 != 2) {
            method2056((byte) 92);
        }
        field4801 = null;
        field4799 = null;
        field4794 = null;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(I)V")
    public class305(int arg0) {
        this.field4795 = arg0;
    }

    @OriginalMember(owner = "client!vk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4793++;
        throw new IllegalStateException();
    }
}
