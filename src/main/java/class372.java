import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class372 implements class692 {

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "I")
    public int field4702;

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "[I")
    public static int[] field4700 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "[Lf;")
    public static class536[] field4697;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)V", line = 4)
    public static void method2029(byte arg0) {
        if (arg0 >= 65) {
            field4700 = null;
            field4697 = null;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILmc;I)V", line = 23)
    public static final void method2030(int arg0, class424 arg1, int arg2) {
        field4698++;
        if (arg2 > -119) {
            method2030(119, null, -50);
        }
        if (class199.field2530) {
            arg0 = 0;
            class199.field2530 = false;
        }
        if (class629.field8758 != null && class629.field8758.method2250(100, arg1)) {
            return;
        }
        class629.field8758 = arg1;
        class330.field4213 = class571.method3150(105);
        class688.field9759 = arg0;
        class393.field4951 = arg0;
        if (class393.field4951 == 0) {
            class290.method1634(true);
            return;
        }
        class83.field1173 = class395.field4968;
        class480.field6378 = class172.field2249;
        class431.field5396 = class361.field4595;
        class518.field7074 = class384.field4843;
        class175.field2269 = class406.field5079;
        class56.field800 = class30.field431;
        class378.field4790 = class462.field5894;
        class318.field4071 = class556.field7728;
        class17.field268 = class184.field2339;
        class483.field6415 = class349.field4464;
    }

    @OriginalMember(owner = "client!qfa", name = "toString", descriptor = "()Ljava/lang/String;", line = 72)
    public final String toString() {
        field4699++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 81)
    public class372(String arg0, int arg1) {
        this.field4702 = arg1;
    }
}
