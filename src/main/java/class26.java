import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class26 extends Canvas {

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field466;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Lni;")
    public static class24 field469 = new class24(64);

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Ljf;")
    public static class229 field473 = class212.method1457((byte) 113, ":clan:");

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Ljf;")
    public static class229 field475 = class212.method1457((byte) 121, "(Z");

    @OriginalMember(owner = "client!od", name = "i", descriptor = "Ljf;")
    public static class229 field472 = null;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "[[I")
    public static int[][] field474 = new int[104][104];

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)I", line = 12)
    public static final int method236(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg2 != 1023) {
            return 60;
        }
        field468++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg3;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 34)
    public static void method237(int arg0) {
        field474 = (int[][]) null;
        field469 = null;
        field472 = null;
        field475 = null;
        if (arg0 != 2) {
            field469 = (class24) null;
        }
        field473 = null;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 58)
    public class26(Component arg0) {
        this.field466 = arg0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Ljf;", line = 67)
    public static final class229 method238(int arg0, int arg1) {
        field470++;
        int var2 = -25 / ((arg0 - 60) / 41);
        return class143.field2498[arg1].method1626(-103) <= 0 ? class150.field2584[arg1] : class142.method989(new class229[] { class150.field2584[arg1], class60.field1037, class143.field2498[arg1] }, -83);
    }

    @OriginalMember(owner = "client!od", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 83)
    public final void paint(Graphics arg0) {
        this.field466.paint(arg0);
        field465++;
    }

    @OriginalMember(owner = "client!od", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 100)
    public final void update(Graphics arg0) {
        this.field466.update(arg0);
        field464++;
    }
}
