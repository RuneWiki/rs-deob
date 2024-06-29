import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class326 {

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field4772 = 0;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public int field4771;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public int field4774;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public int field4775;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "Lom;")
    public static class344 field4776;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLqh;)V")
    public final void method2104(byte arg0, class61 arg1) {
        while (true) {
            int var3 = arg1.method732(-559537960);
            if (var3 == 0) {
                field4773++;
                int var4 = -17 / ((63 - arg0) / 39);
                return;
            }
            this.method2105(var3, arg1, -105);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILqh;I)V")
    private final void method2105(int arg0, class61 arg1, int arg2) {
        field4770++;
        if (arg2 >= -73) {
            method2106((byte) -46);
        }
        if (arg0 == 1) {
            this.field4771 = arg1.method723((byte) -25);
            this.field4775 = arg1.method732(-559537960);
            this.field4774 = arg1.method732(-559537960);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
    public static void method2106(byte arg0) {
        field4776 = null;
        if (arg0 != 90) {
            method2106((byte) -34);
        }
    }
}
