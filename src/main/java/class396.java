import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class396 extends Canvas {

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field6149;

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "Lhga;")
    public static class158 field6151 = new class158(76, 2);

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!uba", name = "e", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!uba", name = "f", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!uba", name = "g", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2555(int arg0) {
        int var1 = 67 % ((81 - arg0) / 41);
        class106.field1728 = null;
        field6152++;
    }

    @OriginalMember(owner = "client!uba", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 13)
    public final void update(Graphics arg0) {
        field6150++;
        this.field6149.update(arg0);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V", line = 22)
    public static void method2556(byte arg0) {
        if (arg0 == 60) {
            field6151 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lri;Z)V", line = 33)
    public static final void method2557(class97 arg0, boolean arg1) {
        class88.field1071 = arg0;
        if (!arg1) {
            method2556((byte) 51);
        }
        field6155++;
    }

    @OriginalMember(owner = "client!uba", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 48)
    public final void paint(Graphics arg0) {
        field6154++;
        this.field6149.paint(arg0);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(BII)Z", line = 60)
    public static final boolean method2558(byte arg0, int arg1, int arg2) {
        field6153++;
        if (arg0 != -18) {
            field6151 = null;
        }
        return (arg1 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(JJ)J", line = 71)
    public static long method2559(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 77)
    public class396(Component arg0) {
        this.field6149 = arg0;
    }
}
