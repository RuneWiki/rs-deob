import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class191 {

    @OriginalMember(owner = "client!op", name = "b", descriptor = "Lej;")
    public static class124 field2838 = new class124(19, -1);

    @OriginalMember(owner = "client!op", name = "c", descriptor = "Z")
    public static boolean field2839 = false;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V", line = 8)
    public static void method1373(byte arg0) {
        field2838 = null;
        if (arg0 >= -78) {
            method1374((byte) 54, null);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BLat;)V", line = 29)
    public static final void method1374(byte arg0, class378 arg1) {
        field2837++;
        if (arg0 < 69) {
            method1373((byte) -52);
        }
        if (!class184.field2785) {
            return;
        }
        class639.field8789++;
        if (arg1.field5355 != null) {
            class378 var2 = class751.method4199(class44.field980, (byte) -54, class406.field5949);
            if (var2 != null) {
                class33 var3 = new class33();
                var3.field847 = arg1;
                var3.field841 = var2;
                var3.field845 = arg1.field5355;
                class83.method788(var3);
            }
        }
        class564 var4 = class227.method1594(class386.field5602, class72.field1320, -120);
        var4.field7778.method1539((byte) 100, arg1.field5506);
        var4.field7778.method1504(class406.field5949, -4086);
        var4.field7778.method1483(-123, class44.field980);
        var4.field7778.method1485((byte) 107, class173.field2690);
        var4.field7778.method1483(92, arg1.field5380);
        var4.field7778.method1485((byte) 107, arg1.field5488);
        class167.method1260(-89, var4);
    }
}
