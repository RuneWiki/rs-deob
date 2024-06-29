import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class308 {

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "[I")
    public static int[] field4320 = new int[1];

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "Lka;")
    public class284 field4319;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "Lr;")
    public class709 field4321;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
    public static void method2016(byte arg0) {
        field4320 = null;
        int var1 = 5 / ((arg0 + 27) / 32);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
    public static final void method2017(int arg0) {
        class612.method3471();
        field4318++;
        for (int var1 = 0; var1 < 4; var1++) {
            class209.field2735[var1].method1354((byte) 104);
        }
        if (arg0 != 4) {
            field4320 = null;
        }
        class367.method2313(true);
        class4.method20(0);
        class49.method352(arg0 ^ 0xFFFFFF9D);
        System.gc();
        class129.field1802.method346();
    }
}
