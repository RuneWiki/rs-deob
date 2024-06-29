import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class296 {

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Z")
    public static boolean field4927 = false;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lce;")
    public static class126 field4928 = class206.method1445(-7923, "<col=ffff00>");

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "[I")
    public static int[] field4925 = new int[256];

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field4933 = 0;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "[Lce;")
    public static class126[] field4932 = new class126[500];

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "Lce;")
    public static class126 field4935 = class206.method1445(-7923, "rect_debug=");

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "[Lie;")
    public static class2[] field4934;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1999(int arg0) {
        if (arg0 <= 62) {
            method2001((byte) -126);
        }
        field4931++;
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class160.method1181(var2, class297.field4940, true, var1, 1, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 50)
    public static void method2000(byte arg0) {
        field4925 = null;
        field4932 = null;
        field4934 = null;
        if (arg0 <= -10) {
            field4935 = null;
            field4928 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)Z", line = 96)
    public static final boolean method2001(byte arg0) {
        field4926++;
        class264 var1 = class50.field761;
        synchronized (class50.field761) {
            if (class70.field1151 == class14.field196) {
                return false;
            } else if (arg0 > -9) {
                return true;
            } else {
                class65.field1095 = class117.field1977[class14.field196];
                class190.field3261 = class160.field2899[class14.field196];
                class14.field196 = class14.field196 + 1 & 0x7F;
                return true;
            }
        }
    }
}
