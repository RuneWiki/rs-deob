import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class536 {

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
    public static int field7932 = -1;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "[I")
    public static int[] field7934 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
    public static int field7931;

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
    public static int field7935;

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "Lkn;")
    public static class455 field7933;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V")
    public static final void method3153(int arg0) {
        if (arg0 == 39) {
            class143.field1860.method1332(-22538);
            field7931++;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lwca;BLwca;)V")
    public static final void method3154(class311 arg0, byte arg1, class311 arg2) {
        class59.field708++;
        class165.method1046(-3466, class160.field2141);
        field7935++;
        class221.field3268.method2576(true, arg2.field4667);
        int var3 = -61 % ((-arg1 - 18) / 57);
        class221.field3268.method2608(arg2.field4661, (byte) 87);
        class221.field3268.method2576(true, arg0.field4667);
        class221.field3268.method2619(arg0.field4558, 1420669333);
        class221.field3268.method2619(arg2.field4558, 1420669333);
        class221.field3268.method2579(-122, arg0.field4661);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)V")
    public static void method3155(byte arg0) {
        if (arg0 < 14) {
            field7934 = null;
        }
        field7934 = null;
        field7933 = null;
    }
}
