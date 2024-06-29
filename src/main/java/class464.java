import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class464 {

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field6473 = 2;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field6471 = 0;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field6474 = 4;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)V", line = 10)
    public static final void method2785(int arg0, byte arg1) {
        class95.field1108 = arg0;
        class457.field6394 = -1;
        if (arg1 < -63) {
            class160.field2064 = 100;
            class202.field2840 = 3;
            field6472++;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 35)
    public static final void method2786(int arg0) {
        class688.field9602.method3503(class688.field9602.field8539, -125, 1);
        field6470++;
        class688.field9602.method3503(class688.field9602.field8542, -123, 1);
        class688.field9602.method3503(class688.field9602.field8530, -125, 2);
        class688.field9602.method3503(class688.field9602.field8532, -127, 2);
        class688.field9602.method3503(class688.field9602.field8508, -126, 1);
        class688.field9602.method3503(class688.field9602.field8551, -122, 1);
        int var1 = -105 % ((75 - arg0) / 38);
        class688.field9602.method3503(class688.field9602.field8501, -124, 1);
        class688.field9602.method3503(class688.field9602.field8512, -123, 1);
        class688.field9602.method3503(class688.field9602.field8547, -124, 1);
        class688.field9602.method3503(class688.field9602.field8506, -126, 1);
        class688.field9602.method3503(class688.field9602.field8538, -126, 2);
        class688.field9602.method3503(class688.field9602.field8528, -128, 1);
        class688.field9602.method3503(class688.field9602.field8507, -123, 2);
        class688.field9602.method3503(class688.field9602.field8499, -123, 1);
        class688.field9602.method3503(class688.field9602.field8540, -127, 0);
        class688.field9602.method3503(class688.field9602.field8529, -126, 0);
        class688.field9602.method3503(class688.field9602.field8541, -126, 2);
        class688.field9602.method3503(class688.field9602.field8516, -123, 0);
        class688.field9602.method3503(class688.field9602.field8544, -126, 0);
        class679.method3864(true);
        class688.field9602.method3503(class688.field9602.field8523, -128, 0);
        class688.field9602.method3503(class688.field9602.field8553, -123, 4);
        class511.method3009(-14603);
        class271.method1768((byte) -70);
        class501.field6854 = true;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V", line = 72)
    public static final void method2787(int arg0, int arg1) {
        field6475++;
        if (arg1 != 65535) {
            field6471 = 21;
        }
        for (class69 var2 = class638.field8966.method3668(13); var2 != null; var2 = class638.field8966.method3667((byte) -76)) {
            if ((var2.field762 >> 48 & 0xFFFFL) == ((long) arg0)) {
                var2.method527(-11229);
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)V", line = 93)
    public static final void method2788(int arg0, int arg1) {
        field6469++;
        class469 var2 = (class469) class297.field4327.method3669(false, (long) arg1);
        if (var2 != null) {
            var2.field6504 = !var2.field6504;
            var2.field6502.method2962(var2.field6504, (byte) 95);
        }
        if (arg0 != 2324) {
            method2787(85, -15);
        }
    }
}
