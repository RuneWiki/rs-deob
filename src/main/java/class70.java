import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class70 extends Canvas {

    @OriginalMember(owner = "client!om", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field1088;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "Z")
    public static boolean field1083 = false;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIBI)V", line = 7)
    public static final void method469(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = -55 % ((arg2 - 50) / 37);
        field1082++;
        class120 var5 = class248.method1704(4, 107, arg1);
        var5.method844((byte) -28);
        var5.field2067 = arg3;
        var5.field2066 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 25)
    public final void update(Graphics arg0) {
        field1085++;
        this.field1088.update(arg0);
    }

    @OriginalMember(owner = "client!om", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 33)
    public final void paint(Graphics arg0) {
        field1086++;
        this.field1088.paint(arg0);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 47)
    public static final void method470(int arg0) {
        if (arg0 != 4) {
            field1083 = true;
        }
        field1087++;
        class327.field5579.method639(-121);
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 59)
    public class70(Component arg0) {
        this.field1088 = arg0;
    }
}
