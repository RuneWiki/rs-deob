import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class285 extends Canvas {

    @OriginalMember(owner = "client!im", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field3629;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field3634 = 0;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Z")
    public static boolean field3633 = false;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "Lje;")
    public static class189 field3637;

    @OriginalMember(owner = "client!im", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 3)
    public final void update(Graphics arg0) {
        this.field3629.update(arg0);
        field3630++;
    }

    @OriginalMember(owner = "client!im", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 11)
    public final void paint(Graphics arg0) {
        field3632++;
        this.field3629.paint(arg0);
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 22)
    public class285(Component arg0) {
        this.field3629 = arg0;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)I", line = 31)
    public static final int method1732(int arg0, byte arg1) {
        field3631++;
        int var2 = 74 % ((arg1 - 42) / 39);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILqa;Ldn;Ldn;)V", line = 44)
    public static final void method1733(int arg0, class129 arg1, class201 arg2, class201 arg3) {
        class113.field1553 = class293.method1763(32516, arg2, 0, class356.field4575);
        field3635++;
        class254.field3211 = arg1.method867(class113.field1553, class136.method954(arg3, class356.field4575, 0), true);
        class99.field1379 = class293.method1763(arg0 + 32516, arg2, arg0, class419.field5576);
        class43.field635 = arg1.method867(class99.field1379, class136.method954(arg3, class419.field5576, 0), true);
        class157.field2070 = class293.method1763(32516, arg2, 0, class187.field2444);
        class200.field2590 = arg1.method867(class157.field2070, class136.method954(arg3, class187.field2444, 0), true);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 67)
    public static void method1734(int arg0) {
        field3637 = null;
        int var1 = -110 % ((arg0 + 5) / 34);
    }
}
