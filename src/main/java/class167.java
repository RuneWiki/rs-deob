import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class class167 {

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "[I")
    public static int[] field2560 = new int[500];

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "[I")
    public static int[] field2563 = new int[100];

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "F")
    public static float field2559;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)V", line = 8)
    public static final void method1137(int arg0, boolean arg1) {
        class326.method2218(class19.field258, class108.field1662, class285.field4368, class36.field456);
        if (arg0 != 100) {
            method1137(-100, false);
        }
        class326.method2217(class165.field2538, class10.field101, arg1);
        field2561++;
        class326.method2212((float) class96.field1474, (float) class193.field2912, (float) class63.field877);
        class326.method2213();
        class287.field4388 = class192.field2907;
        class173.field2636 = class177.field2697;
        class287.field4389 = class293.field4508;
        class287.field4394 = class264.field4069;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 28)
    public static void method1138(int arg0) {
        if (arg0 == -24231) {
            field2563 = null;
            field2560 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)Lnc;")
    public abstract class107 method1136(byte arg0);

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)I")
    public abstract int method1139(int arg0, byte arg1);

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)[B")
    public abstract byte[] method1140(int arg0, int arg1);

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)V")
    public abstract void method1141(int arg0, int arg1);
}
