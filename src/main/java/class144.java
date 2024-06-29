import java.applet.Applet;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class144 {

    @OriginalMember(owner = "client!an", name = "a", descriptor = "[I")
    public static int[] field1865 = new int[13];

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Ljava/applet/Applet;")
    public static Applet field1866;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lha;II)Lpu;", line = 4)
    public static final class772 method829(class570 arg0, int arg1, int arg2) {
        if (arg1 != 18294) {
            return null;
        }
        field1868++;
        class720 var3 = (class720) class479.field6198.method2616((long) arg2, (byte) -109);
        if (var3 != null) {
            class407 var4 = var3.field9464.method583(true);
            var3.field9462 = true;
            if (var4 != null) {
                return var4.method2365(16621, arg0);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lha;I)V", line = 30)
    public static final void method830(class570 arg0, int arg1) {
        field1867++;
        if (class26.field225.method3597(-128) == 0 || arg1 != -15067) {
            return;
        }
        if (class485.field6252.field6949.method2402(false) == 0) {
            for (class453 var2 = (class453) class26.field225.method3591(0); var2 != null; var2 = (class453) class26.field225.method3600((byte) 38)) {
                class640.field8189.method701(var2.field5913 ? class422.field5564.field352 : null, arg0, false, var2.field5906, arg0, var2.field5909, var2.field5912, class399.field5278, var2.field5911, false, var2.field5903, true);
                var2.method1946(-10364);
            }
            class135.method783(0);
            return;
        }
        if (class763.field10390 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class763.field10390 = class576.method3099(true, 0, 0, var3, class790.field10813, class345.field4229);
            class464.field6025 = class763.field10390.method1002(class165.method1046(-116, 0, class171.field2264, class234.field3199), class388.method2226(class172.field2270, class234.field3199, 0), true);
        }
        for (class453 var4 = (class453) class26.field225.method3591(arg1 + 15067); var4 != null; var4 = (class453) class26.field225.method3600((byte) 64)) {
            class640.field8189.method701(var4.field5913 ? class422.field5564.field352 : null, class763.field10390, false, var4.field5906, arg0, var4.field5909, var4.field5912, class464.field6025, var4.field5911, false, var4.field5903, true);
            var4.method1946(-10364);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V", line = 91)
    public static void method831(int arg0) {
        if (arg0 != 13008) {
            method830(null, -98);
        }
        field1866 = null;
        field1865 = null;
    }
}
