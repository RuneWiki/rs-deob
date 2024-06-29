import java.awt.Canvas;
import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public class class31 {

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "Lr;")
    public static class33 field438 = class29.method192("Hunter Training", (byte) 126);

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "Lr;")
    public static class33 field439 = class29.method192("Prev page", (byte) 126);

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "[J")
    public static long[] field437 = new long[32];

    @OriginalMember(owner = "mapview!q", name = "f", descriptor = "Lr;")
    public static class33 field442 = class29.method192("Quest Start", (byte) 126);

    @OriginalMember(owner = "mapview!q", name = "h", descriptor = "Lr;")
    public static class33 field444 = class29.method192("Pub)4Bar", (byte) 126);

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "[[[[B")
    public static byte[][][][] field441 = new byte[5][][][];

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "Lr;")
    public static class33 field440 = class29.method192("Skirt Shop", (byte) 126);

    @OriginalMember(owner = "mapview!q", name = "k", descriptor = "I")
    public static int field447 = 0;

    @OriginalMember(owner = "mapview!q", name = "j", descriptor = "Lr;")
    public static class33 field446 = class29.method192("Food Shop", (byte) 126);

    @OriginalMember(owner = "mapview!q", name = "g", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field443;

    @OriginalMember(owner = "mapview!q", name = "i", descriptor = "[Lh;")
    public static class15[] field445;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I)V", line = 30)
    public static final void method202(int arg0) {
        if (++class20.field204 >= 64) {
            class21.field216++;
            class20.field204 = 0;
            if (class14.field175 >> 6 > class21.field216) {
                class4.method27((byte) -47);
            }
        }
        if (arg0 != -17228) {
            method204(-4, null);
        }
        class26.field396 = (class20.field204 << 6) + class5.field49;
    }

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "(I)V", line = 81)
    public static void method203(int arg0) {
        if (arg0 != 255) {
            return;
        }
        field437 = null;
        field444 = null;
        field441 = null;
        field443 = null;
        field438 = null;
        field446 = null;
        field439 = null;
        field445 = null;
        field442 = null;
        field440 = null;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 101)
    public static final void method204(int arg0, Component arg1) {
        if (arg0 != 21463) {
            field439 = null;
        }
        Method var2 = class3.field23;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class35.field483);
        arg1.addFocusListener(class35.field483);
    }
}
