import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class121 {

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
    public static int[] field1698 = new int[2500];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1696 = "Drop";

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "[I")
    public static int[] field1702 = new int[500];

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Z")
    public static boolean field1697 = false;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field1703 = 0;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Llc;")
    public static class175 field1704;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 4)
    public static void method820(int arg0) {
        field1702 = null;
        if (arg0 != 2541) {
            field1703 = -7;
        }
        field1696 = null;
        field1698 = null;
        field1704 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Llc;Llc;BLlc;)V", line = 22)
    public static final void method821(class175 arg0, class175 arg1, byte arg2, class175 arg3) {
        field1699++;
        class5.field79 = arg3;
        if (arg2 == 76) {
            class13.field174 = arg0;
            class150.field2084 = arg1;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)I", line = 52)
    public static final int method822(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field1700++;
        if (var4 == 0) {
            return arg3;
        }
        if (arg0 != 7) {
            field1704 = (class175) null;
        }
        if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V", line = 89)
    public static final void method823(int arg0) {
        class48.field562 = null;
        class188.field2711 = null;
        class295.field4606 = null;
        class275.field4287 = null;
        if (arg0 != 2) {
            return;
        }
        class141.field1970 = null;
        class289.field4529 = null;
        class79.field1009 = null;
        class322.field4948 = null;
        class255.field3888 = null;
        class5.field82 = null;
        class38.field458 = null;
        class243.field3658 = null;
        class276.field4292 = null;
        class282.field4373 = null;
        class269.field4245 = null;
        field1701++;
        class88.field1097 = null;
        class179.field2601 = null;
        class315.field4859 = null;
        class239.field3589 = null;
    }
}
