import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class137 extends Canvas {

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field2153;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "Lhf;")
    public static class333 field2155 = new class333();

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "Z")
    public static boolean field2157 = false;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "Lmc;")
    public static class114 field2159 = null;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "F")
    public static float field2152;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "F")
    public static float field2158;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!hq", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field2153.update(arg0);
        field2154++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIBI)I")
    public static final int method920(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2156++;
        int var5 = 65536 - class1.field7[arg4 * 8192 / arg1] >> 1;
        if (arg3 < 12) {
            method921(-17);
        }
        return ((65536 - var5) * arg0 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!hq", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field2153.paint(arg0);
        field2160++;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class137(Component arg0) {
        this.field2153 = arg0;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public static void method921(int arg0) {
        field2155 = null;
        if (arg0 == 8192) {
            field2159 = null;
        }
    }
}
