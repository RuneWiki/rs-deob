import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class240 extends class62 {

    @OriginalMember(owner = "client!te", name = "x", descriptor = "J")
    public long field4267;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "Leg;")
    public static class37 field4269 = class174.method1167("Benutzen", 69);

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field4265 = 0;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLjl;I)[Lrk;")
    public static final class14[] method1643(byte arg0, class101 arg1, int arg2) {
        field4268++;
        if (class170.method1139((byte) 26, arg2, arg1)) {
            return arg0 == 1 ? class29.method169(-56) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
    public static void method1644(int arg0) {
        field4269 = null;
        if (arg0 > -34) {
            field4270 = -4;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(BI)V")
    public static final void method1645(byte arg0, int arg1) {
        class53.field824.method1402((byte) -76, arg1);
        if (arg0 < 105) {
            field4265 = -30;
        }
        class173.field2902.method1402((byte) -73, arg1);
        class72.field1135.method1402((byte) -90, arg1);
        class126.field2102.method1402((byte) -12, arg1);
        field4266++;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class240() {
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(J)V")
    public class240(long arg0) {
        this.field4267 = arg0;
    }
}
