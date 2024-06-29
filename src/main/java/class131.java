import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class131 extends Canvas {

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field2169;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field2168 = 0;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "[I")
    public static int[] field2173 = new int[500];

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field2175 = -1;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "[[[I")
    public static int[][][] field2171;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZLlc;)[Laf;")
    public static final class176[] method1007(int arg0, boolean arg1, class270 arg2) {
        if (arg1) {
            method1007(115, false, (class270) null);
        }
        field2170++;
        return class248.method1706((byte) 114, arg0, arg2) ? class68.method516((byte) 111) : null;
    }

    @OriginalMember(owner = "client!wb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field2169.paint(arg0);
        field2176++;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class131(Component arg0) {
        this.field2169 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2172++;
        this.field2169.update(arg0);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
    public static final int method1008(int arg0, int arg1) {
        if (arg1 > -122) {
            field2175 = 86;
        }
        field2167++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static void method1009(int arg0) {
        field2171 = null;
        if (arg0 != -1) {
            method1007(15, true, (class270) null);
        }
        field2173 = null;
    }
}
