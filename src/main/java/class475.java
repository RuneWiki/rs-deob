import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class475 {

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field6182 = 0;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field6184 = 1400;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLjava/awt/Component;)Llc;", line = 4)
    public static final class656 method2622(byte arg0, Component arg1) {
        if (arg0 <= 112) {
            method2622((byte) -29, null);
        }
        field6179++;
        return new class578(arg1);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "([[IB)V", line = 15)
    public static final void method2623(int[][] arg0, byte arg1) {
        if (arg1 == 112) {
            class213.field2746 = arg0;
            field6180++;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V", line = 28)
    public static final void method2624(int arg0) {
        class260.field3508 = 0;
        field6181++;
        int var1 = 0;
        if (arg0 < 67) {
            field6182 = 105;
        }
        while (var1 < 2048) {
            class122.field1564[var1] = null;
            class324.field4210[var1] = 1;
            class528.field6869[var1] = null;
            var1++;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "()V", line = 55)
    public static final void method2625() {
        class330.method1909(1, class20.field223);
    }
}
