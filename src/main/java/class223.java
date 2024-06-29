import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class223 extends class238 {

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "Lbg;")
    public static class310 field3439 = new class310(39, 7);

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "[J")
    public static long[] field3443 = new long[100];

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Lja;")
    public static class174 field3441;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIB)V")
    public static final void method1355(int arg0, int arg1, byte arg2) {
        if (arg2 != 14) {
            return;
        }
        if (class431.field6348 != arg1) {
            class167.field2594 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class167.field2594[var3] = (var3 << 12) / arg1;
            }
            class282.field4274 = arg1 * 32;
            class98.field1757 = arg1 - 1;
            class431.field6348 = arg1;
        }
        field3442++;
        if (class437.field6437 == arg0) {
            return;
        }
        if (class431.field6348 == arg0) {
            class289.field4381 = class167.field2594;
        } else {
            class289.field4381 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class289.field4381[var4] = (var4 << 12) / arg0;
            }
        }
        class437.field6437 = arg0;
        class435.field6374 = arg0 - 1;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
    public static void method1356(int arg0) {
        field3441 = null;
        if (arg0 == 39) {
            field3443 = null;
            field3439 = null;
        }
    }
}
