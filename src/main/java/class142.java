import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class142 extends class80 {

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public int field2604;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public int field2605;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "[Z")
    public static boolean[] field2607 = new boolean[100];

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
    public static void method983(int arg0) {
        int var1 = 86 / ((62 - arg0) / 33);
        field2607 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static final void method984(byte arg0) {
        if (class31.field461 != null) {
            class31.field461.method1591(7759444);
        }
        if (class20.field277 != null) {
            class20.field277.method1591(7759444);
        }
        field2602++;
        if (arg0 <= 62) {
            method985(-70, false, 8, -46, 86);
        }
        class31.method181(22050, 2, class250.field4401, 81);
        class31.field461 = class224.method1420(class95.field1835, (byte) 104, class131.field2452, 22050, 0);
        class31.field461.method1586(false, class51.field897);
        class20.field277 = class224.method1420(class95.field1835, (byte) 104, class131.field2452, 2048, 1);
        class20.field277.method1586(false, class206.field3528);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(II)V")
    public class142(int arg0, int arg1) {
        this.field2604 = arg0;
        this.field2605 = arg1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IZIII)V")
    public static final void method985(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class144.field2635 = class33.field500 * arg4 / arg3;
        field2606++;
        class214.field3684 = -1;
        class15.field196 = -1;
        class192.field3323 = class89.field1727 * arg2 / arg0;
        class167.method1130(-1);
        if (arg1) {
            method984((byte) -38);
        }
    }
}
