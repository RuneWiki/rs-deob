import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public abstract class class96 {

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "Lwj;")
    public static class270 field1462 = new class270(102, -1);

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)J")
    public abstract long method705(byte arg0);

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZ)V")
    public static final void method706(int arg0, boolean arg1) {
        field1463++;
        if (arg1 && class350.field5111 != null) {
            class481.field7028 = class350.field5111.field3487;
        } else {
            class481.field7028 = -1;
        }
        class350.field5111 = null;
        class373.field5474 = 0;
        class68.field931 = null;
        class212.field2958 = null;
        class350.method2082();
        class350.field5114.method2814((byte) 105);
        class78.field1140 = null;
        class354.field5187 = null;
        class315.field4300 = null;
        class361.field5260 = null;
        class217.field3029 = null;
        if (arg0 != -4701) {
            method706(3, false);
        }
        class401.field5882 = null;
        class24.field316 = null;
        class295.field4056 = -1;
        class350.field5120 = null;
        class495.field7230 = -1;
        class84.field1257 = null;
        class421.field6172 = null;
        class350.field5106.method145((byte) 126);
        class350.field5108.method2421(64, 64, 9);
        class350.field5106.method146(64, 128, 85);
        class350.field5110.method2104(50, 64);
        class302.field4142.method1571((byte) -111, 64);
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V")
    public static void method707(byte arg0) {
        field1462 = null;
        if (arg0 != 14) {
            method707((byte) -56);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)I")
    public abstract int method708(int arg0, int arg1);

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
    public abstract void method709(int arg0);
}
