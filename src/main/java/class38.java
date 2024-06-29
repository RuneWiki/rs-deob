import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class38 {

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "S")
    public static short field428 = 1;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "Z")
    public static boolean field430 = true;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field429 = 0;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "[I")
    public static int[] field434 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "[[[I")
    public static int[][][] field436 = new int[2][][];

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "Z")
    public static boolean field437 = false;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "[S")
    public static short[] field432 = new short[256];

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V", line = 8)
    public static void method241(int arg0) {
        field434 = null;
        field432 = null;
        if (arg0 > 42) {
            field436 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZ)V", line = 25)
    public static final void method242(int arg0, boolean arg1) {
        field435++;
        class26.method187(class360.field5705, class49.field560, class324.field5204, class201.field3060);
        if (arg0 < 126) {
            return;
        }
        class26.method194(class174.field2627, class310.field4874, arg1);
        class26.method190((float) class230.field3485, (float) class86.field1142, (float) class169.field2588);
        class26.method186();
        class47.field538 = class186.field2800;
        class47.field533 = class351.field5602;
        class267.field4205 = class96.field1317;
        class47.field534 = class123.field1693;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)Lng;", line = 51)
    public static final class182 method243(byte arg0) {
        field433++;
        if (class336.field5352 == null) {
            return null;
        } else if (arg0 == -16) {
            class99.field1338.method30(false, class336.field5352);
            class182 var1 = (class182) class99.field1338.method31(0);
            class103 var2 = class79.method521(var1.field2735, -50);
            return var2 != null && var2.field1384 && var2.method657(107) ? var1 : class232.method1607(30398);
        } else {
            return (class182) null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V", line = 75)
    public static final void method244(boolean arg0) {
        if (arg0) {
            field434 = (int[]) null;
        }
        if (class188.field2839 != null) {
            class321 var1 = class188.field2839;
            synchronized (class188.field2839) {
                class188.field2839 = null;
            }
        }
        field431++;
    }
}
