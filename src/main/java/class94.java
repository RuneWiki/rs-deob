import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class94 extends class275 {

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "Lqd;")
    public static class173 field1519 = new class173(5);

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "[I")
    public static int[] field1521 = new int[256];

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "Lqd;")
    public static class173 field1522 = new class173(64);

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "Loj;")
    public static class246 field1523;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lag;I)Z")
    public static final boolean method650(class211 arg0, int arg1) {
        if (arg1 > -14) {
            field1522 = null;
        }
        field1518++;
        if (arg0.field3446 == 205) {
            class182.field3008 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
    public static void method651(int arg0) {
        field1521 = null;
        field1522 = null;
        field1523 = null;
        field1519 = null;
        if (arg0 != 250) {
            method651(-61);
        }
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(II)V")
    public static final void method652(int arg0, int arg1) {
        field1520++;
        if (arg0 != 25999) {
            return;
        }
        class236.field3800 = 0;
        class129.field2023 = arg1;
        class22.field272 = 1;
        class237.field3810 = -1;
        class33.field509 = false;
        class62.field1026 = null;
        class293.field4691 = -1;
    }
}
