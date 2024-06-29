import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class233 extends Canvas {

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field4149;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field4148 = 0;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Lsg;")
    public static class30 field4152 = class167.method1221((byte) 33, "leuchten1:");

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field4153 = 0;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Llk;")
    public static class232 field4147 = new class232(30);

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Lsg;")
    public static class30 field4154 = class167.method1221((byte) 33, ")3)3)3");

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Lmc;")
    public static class151 field4151;

    @OriginalMember(owner = "client!ae", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field4149.update(arg0);
        field4146++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BZ)V")
    public static final void method1653(byte arg0, boolean arg1) {
        if (arg0 > -121) {
            method1654(72);
        }
        if (arg1) {
            if (class196.field3548 != -1) {
                class43.method444(0, class196.field3548);
            }
            for (class180 var2 = (class180) class143.field2762.method1178(true); var2 != null; var2 = (class180) class143.field2762.method1176((byte) 22)) {
                class2.method13((byte) -73, true, var2);
            }
            class196.field3548 = -1;
            class143.field2762 = new class157(8);
            class231.method1638(7);
            class196.field3548 = class243.field4343;
            class73.method671(73, false);
            class247.method1736((byte) 124);
            class14.method150(-1, class196.field3548);
        }
        field4150++;
        class247.field4394 = new class120();
        class247.field4394.field1336 = 3000;
        class247.field4394.field1360 = 3000;
        class90.method736(class134.field2625, (byte) -71);
        class253.method1764((byte) -85, 10);
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class233(Component arg0) {
        this.field4149 = arg0;
    }

    @OriginalMember(owner = "client!ae", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field4145++;
        this.field4149.paint(arg0);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method1654(int arg0) {
        if (arg0 == 3000) {
            field4154 = null;
            field4147 = null;
            field4152 = null;
            field4151 = null;
        }
    }
}
