import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class95 {

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field1407 = 0;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Lok;")
    public static class41 field1411 = class137.method956("Fallen lassen", 45);

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field1408 = -1;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Lok;")
    private static class41 field1413 = class137.method956("Cancel", 45);

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field1416 = 0;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field1414 = 0;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Lok;")
    public static class41 field1406 = class137.method956("Hidden)2", 45);

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Lok;")
    public static class41 field1417 = field1413;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Lfd;")
    public static class64 field1409;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "[I")
    public static int[] field1412;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "[I")
    public static int[] field1418;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)J", line = 39)
    public static final long method679(int arg0, int arg1, int arg2) {
        class308 var3 = class205.field3312[arg0][arg1][arg2];
        return var3 == null || var3.field5210 == null ? 0L : var3.field5210.field3856;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)V", line = 88)
    public static final void method680(int arg0, byte arg1) {
        field1415++;
        int var2 = -52 / ((31 - arg1) / 35);
        class107.field1512.method138(arg0, 0);
        class112.field1597.method138(arg0, 0);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lok;I)I", line = 101)
    public static final int method681(class41 arg0, int arg1) {
        field1410++;
        for (int var2 = 0; var2 < class136.field2021.length; var2++) {
            if (class136.field2021[var2].method306(arg0, 27080)) {
                return var2;
            }
        }
        if (arg1 == -2957) {
            return -1;
        } else {
            return 30;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 127)
    public static void method682(int arg0) {
        field1406 = null;
        field1409 = null;
        field1418 = null;
        field1412 = null;
        field1417 = null;
        field1411 = null;
        field1413 = null;
        int var1 = 107 / ((arg0 + 35) / 35);
    }
}
