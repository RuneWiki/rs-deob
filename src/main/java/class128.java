import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class128 {

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "[[I")
    public static int[][] field2153;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V", line = 3)
    public static void method1087(byte arg0) {
        int var1 = 16 % ((arg0 - 47) / 58);
        field2153 = null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)V", line = 13)
    public static final void method1088(int arg0, int arg1) {
        field2155++;
        if (arg1 != 9005) {
            return;
        }
        class630.field8932 = -1;
        if (arg0 == 37) {
            class751.field10428 = 3.0F;
        } else if (arg0 == 50) {
            class751.field10428 = 4.0F;
        } else if (arg0 == 75) {
            class751.field10428 = 6.0F;
        } else if (arg0 == 100) {
            class751.field10428 = 8.0F;
        } else if (arg0 == 200) {
            class751.field10428 = 16.0F;
        }
        class630.field8932 = -1;
    }
}
