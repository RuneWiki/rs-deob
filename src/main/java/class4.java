import java.awt.Canvas;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class4 extends Canvas {

    @OriginalMember(owner = "mapview!ba", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field27;

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "Lw;")
    public static class38 field23 = class35.method219("Silver Shop", true);

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "Lw;")
    public static class38 field25 = class35.method219("(U", true);

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "I")
    public static volatile int field21 = 0;

    @OriginalMember(owner = "mapview!ba", name = "h", descriptor = "[I")
    public static int[] field28 = new int[128];

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "J")
    public static long field22;

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field24;

    @OriginalMember(owner = "mapview!ba", name = "f", descriptor = "[Lw;")
    public static class38[] field26;

    @OriginalMember(owner = "mapview!ba", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 9)
    public final void paint(Graphics arg0) {
        this.field27.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Z)I", line = 16)
    public static final int method13(boolean arg0) {
        if (!arg0) {
            field21 = -18;
        }
        return class31.field396 == null ? 0 : class31.field396[mapview.field257];
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 30)
    public static final void method14(Component arg0, byte arg1) {
        arg0.addMouseListener(class9.field67);
        arg0.addMouseMotionListener(class9.field67);
        if (arg1 != -105) {
            field25 = null;
        }
        arg0.addFocusListener(class9.field67);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Lw;Lha;ILw;)[Ld;", line = 46)
    public static final class7[] method15(class38 arg0, class13 arg1, int arg2, class38 arg3) {
        if (arg2 < 54) {
            return (class7[]) null;
        } else {
            int var4 = arg1.method61(115, arg0);
            int var5 = arg1.method63(var4, (byte) 115, arg3);
            return class16.method89(var5, var4, 66, arg1);
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I)V", line = 67)
    public static final void method16(int arg0) {
        if (++class26.field367 >= 64) {
            class9.field70++;
            class26.field367 = 0;
            if (class9.field70 < class13.field122 >> 6) {
                mapview.method137(-6519);
            }
        }
        if (arg0 < -63) {
            mapview.field257 = (class26.field367 << 6) + class16.field144;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 122)
    public class4(Component arg0) {
        this.field27 = arg0;
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(I)V", line = 156)
    public static void method17(int arg0) {
        field26 = null;
        field25 = null;
        field24 = null;
        field23 = null;
        field28 = null;
        if (arg0 != -65) {
            field28 = null;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 170)
    public final void update(Graphics arg0) {
        this.field27.update(arg0);
    }
}
