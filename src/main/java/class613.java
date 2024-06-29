import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class613 {

    @OriginalMember(owner = "client!cia", name = "e", descriptor = "I")
    public static int field8162 = 0;

    @OriginalMember(owner = "client!cia", name = "d", descriptor = "Z")
    public static boolean field8161 = true;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "I")
    public static int field8158;

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!cia", name = "c", descriptor = "I")
    public static int field8160;

    @OriginalMember(owner = "client!cia", name = "f", descriptor = "I")
    public static int field8163;

    @OriginalMember(owner = "client!cia", name = "g", descriptor = "I")
    public static int field8164;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
    public static final void method3334(int[] arg0, Object[] arg1, int arg2) {
        int var3 = 111 % ((arg2 - 44) / 41);
        field8159++;
        class104.method779(arg0.length - 1, 0, true, arg0, arg1);
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(III)Z")
    public static final boolean method3335(int arg0, int arg1, int arg2) {
        field8160++;
        if (arg0 != 5) {
            method3337(-71);
        }
        return false;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(ILwu;)V")
    public static final void method3336(int arg0, class376 arg1) {
        field8164++;
        class232.field3292 = arg1;
        if (arg0 != 5) {
            field8163 = 104;
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(I)V")
    public static final void method3337(int arg0) {
        field8158++;
        class69.field845.method2800((byte) -103, 5);
        class708.field9822.method2950(5, (byte) -57);
        class210.field3095.method3986(122, 5);
        if (arg0 != -25694) {
            return;
        }
        class462.field6333.method2009(arg0 ^ 0xFFFF9BE2, 5);
        class292.field4177.method2349(1, 5);
        class77.field948.method1170(5, -121);
        class509.field6780.method657(5, -9707);
        class226.field3216.method3930(5, false);
        class224.field3172.method2589(5, false);
        class70.field854.method4076((byte) 85, 5);
        class372.field5174.method3204(111, 5);
        class361.field5088.method3195(-99, 5);
        class468.field6426.method1625(5, arg0 + 25696);
        class505.field6754.method4148(5, (byte) -49);
        class21.field391.method1770(5, (byte) 42);
        class2.field26.method3684(5, true);
        class137.field2187.method2701(5, arg0 ^ 0x645D);
        class538.field7087.method961(5, (byte) -118);
        class202.field3024.method2727((byte) 122, 5);
        class417.field5754.method1216(26, 5);
        class468.field6422.method1550(5, arg0 ^ 0xFFFF9B8C);
        class101.method758(-57, 5);
        class419.method2431(50, (byte) 125);
        class471.method2653(-121, 50);
        class64.method546(5, (byte) 123);
        class712.method3999(5, -126);
        class34.field503.method553(5, -15782);
        class384.field5375.method553(5, arg0 ^ 0x59F8);
        class99.field1271.method553(5, -15782);
        class635.field8452.method553(5, -15782);
        class182.field2738.method553(5, -15782);
    }
}
