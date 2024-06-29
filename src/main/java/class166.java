import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class166 extends class311 {

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public int field2342;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 5)
    public static final void method1183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field2341++;
        class255 var13 = new class255();
        var13.field3543 = arg5;
        var13.field3558 = arg1;
        if (arg12 != -11186) {
            field2340 = -47;
        }
        var13.field3552 = arg6;
        var13.field3545 = arg0;
        var13.field3544 = arg7;
        var13.field3555 = arg10;
        var13.field3547 = arg2;
        var13.field3550 = arg3;
        var13.field3541 = arg4;
        var13.field3551 = arg8;
        var13.field3561 = arg9;
        var13.field3542 = arg11;
        class350.field4715.method1162(arg12 + 11306, var13);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lvg;B)Ljava/lang/String;", line = 32)
    public static final String method1184(class108 arg0, byte arg1) {
        if (arg1 != -71) {
            return null;
        }
        field2343++;
        if (client.method1634(arg0).method1875(2644133) == 0) {
            return null;
        } else if (arg0.field1523 == null || arg0.field1523.trim().length() == 0) {
            return class42.field542 ? "Hidden-use" : null;
        } else {
            return arg0.field1523;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lea;I)V", line = 56)
    public static final void method1185(class58 arg0, int arg1) {
        field2344++;
        if (arg1 <= 99 || class120.field1824.method1170(true) == 0) {
            return;
        }
        if (class22.field284 == 0 || class22.field284 == 2) {
            for (class54 var4 = (class54) class120.field1824.method1173(0); var4 != null; var4 = (class54) class120.field1824.method1165(true)) {
                class399.method2471(var4.field687, false, true, arg0, arg0, var4.field693, var4.field691 ? class359.field4970.field5874 : null, class52.field669, var4.field688, var4.field685, false, var4.field697);
                var4.method1884(false);
            }
            class136.method1018((byte) 127);
            return;
        }
        if (class62.field844 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class62.field844 = class58.method452(var2, class122.field1839, 0, (byte) 54, 0, class122.field1846);
            class316.field4268 = class62.field844.method262(class1.method1(256, class170.field2406, 0, class156.field2224), class96.method748(class112.field1726, class156.field2224, 0), true);
        }
        for (class54 var3 = (class54) class120.field1824.method1173(0); var3 != null; var3 = (class54) class120.field1824.method1165(true)) {
            class399.method2471(var3.field687, false, true, arg0, class62.field844, var3.field693, var3.field691 ? class359.field4970.field5874 : null, class316.field4268, var3.field688, var3.field685, false, var3.field697);
            var3.method1884(false);
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V", line = 105)
    public class166() {
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(I)V", line = 107)
    public class166(int arg0) {
        this.field2342 = arg0;
    }
}
