import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class292 {

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public int field4681;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "[Ljh;")
    public class269[] field4686;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "[I")
    public int[] field4685;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "Z")
    public static boolean field4683 = false;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field4688 = 0;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field4687 = 0;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V")
    public static final void method1946(byte arg0) {
        class212.field3508.method1255(-88);
        if (arg0 >= -52) {
            field4688 = -128;
        }
        field4684++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIILdk;Ldk;)Lfm;")
    public static final class93 method1947(int arg0, int arg1, int arg2, class251 arg3, class251 arg4) {
        if (arg2 != 0) {
            field4680 = 34;
        }
        field4682++;
        return class290.method1932(122, arg1, arg0, arg3) ? class264.method1771(arg4.method1680(arg0, arg1, arg2 ^ 0xFFFFFF82), arg2 ^ 0x8) : null;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(I)V")
    public class292(int arg0) {
        this.field4681 = arg0;
        this.field4686 = new class269[this.field4681];
        this.field4685 = new int[this.field4681];
    }
}
