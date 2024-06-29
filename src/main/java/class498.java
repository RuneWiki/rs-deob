import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class498 {

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public int field7041 = 0;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "[S")
    private static short[] field7036 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "[S")
    private static short[] field7038 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "[S")
    private static short[] field7039 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "[S")
    private static short[] field7040 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "[Lwe;")
    public static class126[] field7043 = new class126[8];

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[[S")
    public static short[][] field7037 = new short[][] { field7040, field7039, field7036, field7038 };

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2888(int arg0) {
        if (arg0 <= 15) {
            return;
        }
        field7044++;
        if (class469.field6741 != -1) {
            class157.method982(false, class469.field6741, -1, -1, (byte) -121);
            class469.field6741 = -1;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ltn;BI)V", line = 23)
    private final void method2889(class179 arg0, byte arg1, int arg2) {
        field7045++;
        if (arg1 != 85) {
            field7037 = null;
        }
        if (arg2 == 5) {
            this.field7041 = arg0.method1107(false);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILgaa;)V", line = 42)
    public static final void method2890(int arg0, class460 arg1) {
        field7035++;
        if (!class138.field1656) {
            return;
        }
        if (arg1.field6554 != null) {
            class460 var2 = class611.method3340(class210.field2693, class545.field7651, -119);
            if (var2 != null) {
                class575 var3 = new class575();
                var3.field8027 = arg1.field6554;
                var3.field8032 = var2;
                var3.field8028 = arg1;
                class445.method2625(var3);
            }
        }
        if (arg0 >= -75) {
            return;
        }
        class275.field3480++;
        class650 var4 = class314.method1837(class309.field3952, true, class625.field8727);
        var4.field8928.method1112(arg1.field6524, -118);
        var4.field8928.method1124((byte) 106, arg1.field6601);
        var4.field8928.method1116(class563.field7893, 9571);
        var4.field8928.method1116(arg1.field6556, 9571);
        var4.field8928.method1116(class210.field2693, 9571);
        var4.field8928.method1112(class545.field7651, -127);
        class108.method745(var4, -77);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 83)
    public static void method2891(int arg0) {
        field7037 = null;
        field7038 = null;
        field7043 = null;
        field7040 = null;
        field7039 = null;
        field7036 = null;
        if (arg0 != 11209) {
            field7036 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ltn;B)V", line = 102)
    public final void method2892(class179 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1094(255);
            if (var3 == 0) {
                field7042++;
                int var4 = 91 % ((arg1 - 6) / 63);
                return;
            }
            this.method2889(arg0, (byte) 85, var3);
        }
    }
}
