import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class277 extends Canvas {

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field3873;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "[[Z")
    public static boolean[][] field3868 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "[I")
    public static int[] field3871 = new int[14];

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "Lde;")
    public static class497 field3872;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "Z")
    public static boolean field3867;

    @OriginalMember(owner = "client!mu", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 3)
    public final void paint(Graphics arg0) {
        field3874++;
        this.field3873.paint(arg0);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZ)I", line = 18)
    public static final int method1677(int arg0, boolean arg1) {
        field3870++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        if (arg1) {
            method1677(-81, true);
        }
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!mu", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 35)
    public final void update(Graphics arg0) {
        this.field3873.update(arg0);
        field3869++;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V", line = 51)
    public static void method1678(int arg0) {
        field3868 = null;
        field3872 = null;
        if (arg0 != -889217044) {
            method1677(-52, false);
        }
        field3871 = null;
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 64)
    public class277(Component arg0) {
        this.field3873 = arg0;
    }
}
