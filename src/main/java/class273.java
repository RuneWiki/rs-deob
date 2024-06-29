import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class273 {

    @OriginalMember(owner = "client!to", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3665 = " ";

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field3669 = -9017772;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field3670 = 0;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field3664 = 0;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "Lrk;")
    public static class427 field3667;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "[I")
    public static int[] field3663;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public static void method1743(int arg0) {
        if (arg0 < -125) {
            field3663 = null;
            field3667 = null;
            field3665 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
    public static final void method1744(int arg0) {
        field3666++;
        int[] var1 = new int[class128.field1824];
        int var2 = 0;
        if (arg0 != 5554) {
            return;
        }
        for (int var3 = 0; var3 < class128.field1824; var3++) {
            class452 var5 = class234.method1569(2142, var3);
            if (var5.field6532 >= 0 || var5.field6539 >= 0) {
                var1[var2++] = var3;
            }
        }
        class442.field6369 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class442.field6369[var4] = var1[var4];
        }
    }
}
