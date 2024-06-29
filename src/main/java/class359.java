import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class359 {

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    public static int field5179 = -1;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "[I")
    public static int[] field5180 = new int[13];

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IILd;Ljava/awt/Canvas;I)Lha;")
    public static final class59 method2302(int arg0, int arg1, class152 arg2, Canvas arg3, int arg4) {
        if (arg0 != -6) {
            method2302(23, -44, null, null, -57);
        }
        field5182++;
        return new class694(arg3, arg2, arg4, arg1);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2303(byte arg0, String arg1) {
        field5183++;
        if (class166.field2601 == null) {
            return;
        }
        class182.field2753++;
        class564 var2 = class227.method1594(class384.field5576, class72.field1320, -97);
        var2.field7778.method1526(false, class621.method3541(arg1, -65));
        var2.field7778.method1481((byte) -5, arg1);
        if (arg0 > -50) {
            method2302(104, 26, null, null, -19);
        }
        class167.method1260(-43, var2);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V")
    public static void method2304(byte arg0) {
        field5180 = null;
        if (arg0 != -128) {
            method2302(66, -48, null, null, 100);
        }
    }
}
