import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public abstract class class10 {

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "I")
    public static int field93 = 0;

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "Z")
    public static boolean field94 = false;

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "mapview!ea", name = "e", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "[[Lpa;")
    public static class32[][] field95;

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(B)V", line = 26)
    public static void method49(byte arg0) {
        field95 = null;
        if (arg0 > -108) {
            method49((byte) -114);
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 36)
    public static final void method50(Component arg0, int arg1) {
        arg0.addMouseListener(class9.field87);
        int var2 = 61 / ((65 - arg1) / 56);
        arg0.addMouseMotionListener(class9.field87);
        arg0.addFocusListener(class9.field87);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(III)I")
    public abstract int method2(int arg0, int arg1, int arg2);
}
