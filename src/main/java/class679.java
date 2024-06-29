import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class679 {

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "[I")
    public static int[] field9632 = new int[4];

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field9636 = 0;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field9637 = 0;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field9633 = 0;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field9638 = -1;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "[I")
    public static int[] field9631 = new int[5];

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field9635;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public static int field9639;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "[J")
    public static long[] field9630;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
    public static void method3817(int arg0) {
        field9632 = null;
        field9631 = null;
        if (arg0 < 121) {
            field9638 = -5;
        }
        field9630 = null;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)Z")
    public static final boolean method3818(int arg0) {
        field9635++;
        return arg0 < 68 ? true : class144.field2519;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
    public static final void method3819(int arg0) {
        if (arg0 >= 4) {
            field9634++;
            class308.field4551 = false;
            class521.method3066(class337.field5033, class640.field9206, (byte) 100, class134.field2391, class43.field1086);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BILlk;I)V")
    public static final void method3820(byte arg0, int arg1, class545 arg2, int arg3) {
        field9639++;
        if (class44.field1094 != null || class308.field4551 || arg2 == null || class251.method1682(arg2, 52) == null) {
            return;
        }
        class44.field1094 = arg2;
        if (arg0 < 110) {
            field9632 = null;
        }
        class617.field8960 = class251.method1682(arg2, -90);
        class396.field5779 = arg3;
        class437.field6305 = arg1;
        class155.field2617 = 0;
        class287.field4274 = false;
    }
}
