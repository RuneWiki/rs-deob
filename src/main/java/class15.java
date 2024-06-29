import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class15 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Lub;")
    public static class20 field226;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V", line = 3)
    public static void method74(byte arg0) {
        if (arg0 != 102) {
            method75(null, -73, true, 35, 84);
        }
        field226 = null;
    }

    @OriginalMember(owner = "client!kh", name = "toString", descriptor = "()Ljava/lang/String;", line = 22)
    public final String toString() {
        field224++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;IZII)V", line = 30)
    public static final void method75(String arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            method75(null, -54, true, -3, -108);
        }
        field225++;
        class140 var5 = class474.method2695(-12025, arg4, arg3);
        if (var5 == null) {
            return;
        }
        if (var5.field1957 != null) {
            class388 var6 = new class388();
            var6.field5443 = var5;
            var6.field5450 = arg0;
            var6.field5451 = var5.field1957;
            var6.field5442 = arg1;
            class523.method2890(var6);
        }
        if (class340.field4947 != 10 || !client.method1655(var5).method2847((byte) -37, arg1 - 1)) {
            return;
        }
        if (arg1 == 1) {
            class595.field8269++;
            class1.method5(1, class175.field2616);
            class552.method3033(-1, arg4, arg3, var5.field1969);
        }
        if (arg1 == 2) {
            class1.method5(1, class229.field3274);
            class314.field4659++;
            class552.method3033(-1, arg4, arg3, var5.field1969);
        }
        if (arg1 == 3) {
            class671.field9455++;
            class1.method5(1, class83.field1162);
            class552.method3033(-1, arg4, arg3, var5.field1969);
        }
        if (arg1 == 4) {
            class407.field5735++;
            class1.method5(1, class85.field1172);
            class552.method3033(-1, arg4, arg3, var5.field1969);
        }
        if (arg1 == 5) {
            class95.field1242++;
            class1.method5(1, class313.field4652);
            class552.method3033(-1, arg4, arg3, var5.field1969);
        }
        if (arg1 == 6) {
            class446.field6249++;
            class1.method5(1, class113.field1533);
            class552.method3033(-1, arg4, arg3, var5.field1969);
        }
        if (arg1 == 7) {
            class238.field3436++;
            class1.method5(1, class91.field1206);
            class552.method3033(-1, arg4, arg3, var5.field1969);
        }
        if (arg1 == 8) {
            class1.method5(1, class143.field2129);
            class680.field9585++;
            class552.method3033(-1, arg4, arg3, var5.field1969);
        }
        if (arg1 == 9) {
            class376.field5323++;
            class1.method5(1, class181.field2677);
            class552.method3033(-1, arg4, arg3, var5.field1969);
        }
        if (arg1 == 10) {
            class1.method5(1, class586.field8198);
            class92.field1223++;
            class552.method3033(-1, arg4, arg3, var5.field1969);
        }
    }
}
