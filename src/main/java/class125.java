import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class125 {

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "Z")
    public static boolean field1497 = false;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field1499 = 0;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "Lqi;")
    public static class669 field1495 = new class669(1, 2);

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "B")
    public byte field1504;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "Ljava/lang/String;")
    public String field1496;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "Ljava/lang/String;")
    public String field1498;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "Ljava/lang/String;")
    public String field1500;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "Ljava/lang/String;")
    public String field1505;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 5)
    public static final void method811(int arg0) {
        field1506++;
        if (class638.field8834 == -1) {
            return;
        }
        int var1 = class402.field5566.method2337(-121);
        int var2 = class402.field5566.method2336((byte) 77);
        class283 var3 = (class283) class679.field9210.method3111(62);
        if (var3 != null) {
            var1 = var3.method1702((byte) -101);
            var2 = var3.method1706(true);
        }
        int var4 = arg0;
        int var5 = 0;
        if (class107.field1323) {
            var4 = class173.method1075(122);
            var5 = class203.method1259((byte) 127);
        }
        class288.method1728(class638.field8834, var4, var1 + var4, (byte) 127, var5, var2, var1, class84.field1083 + var5, var2 + var5, var5, var4, class599.field8320 + var4);
        if (class412.field5821 != null) {
            class486.method2836(var2 + var5, var1 + var4, 7);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/awt/Canvas;B)V", line = 53)
    public static final void method812(Canvas arg0, byte arg1) {
        if (arg1 != 127) {
            field1497 = true;
        }
        field1501++;
        Dimension var2 = arg0.getSize();
        class181.method1165(var2.width, var2.height, 44);
        if (class709.field9973 == 1) {
            class422.field5998.method151(arg0, class635.field8800, class162.field2073);
        } else {
            class422.field5998.method151(arg0, class199.field2547, class210.field2691);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V", line = 86)
    public static void method813(byte arg0) {
        field1495 = null;
        if (arg0 <= 57) {
            field1497 = true;
        }
    }
}
