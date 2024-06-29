import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public abstract class class30 {

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "[[B")
    public static byte[][] field407 = new byte[250][];

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "I")
    public static volatile int field406 = 0;

    @OriginalMember(owner = "mapview!p", name = "k", descriptor = "Lf;")
    public static class10 field415 = class23.method139("Archery Shop", (byte) -58);

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "Lja;")
    public static class19 field405 = null;

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "Lf;")
    public static class10 field408 = class23.method139("b12_full", (byte) -105);

    @OriginalMember(owner = "mapview!p", name = "l", descriptor = "Lf;")
    public static class10 field416 = class23.method139("u_pass", (byte) -114);

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "Lf;")
    public static class10 field411 = class23.method139("Pub)4Bar", (byte) -121);

    @OriginalMember(owner = "mapview!p", name = "n", descriptor = "I")
    public static int field418 = 0;

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "mapview!p", name = "m", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "mapview!p", name = "p", descriptor = "La;")
    public static class1 field420;

    @OriginalMember(owner = "mapview!p", name = "j", descriptor = "Ljava/awt/Image;")
    public static Image field414;

    @OriginalMember(owner = "mapview!p", name = "o", descriptor = "Ljava/awt/Image;")
    public Image field419;

    @OriginalMember(owner = "mapview!p", name = "h", descriptor = "[I")
    public int[] field412;

    @OriginalMember(owner = "mapview!p", name = "i", descriptor = "[I")
    public static int[] field413;

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "[Ln;")
    public static class26[] field410;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I)V", line = 12)
    public final void method192(int arg0) {
        class13.method98(this.field412, this.field409, this.field417);
        if (arg0 != 0) {
            field415 = null;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(I)V", line = 24)
    public static void method193(int arg0) {
        field420 = null;
        field408 = null;
        field413 = null;
        field414 = null;
        field410 = null;
        field416 = null;
        field415 = null;
        field407 = null;
        if (arg0 < 126) {
            method194(null, (byte) -115);
        }
        field411 = null;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 64)
    public static final void method194(Component arg0, byte arg1) {
        Method var2 = class9.field88;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        if (arg1 <= 26) {
            field420 = null;
        }
        arg0.addKeyListener(class21.field235);
        arg0.addFocusListener(class21.field235);
    }

    @OriginalMember(owner = "mapview!p", name = "<init>", descriptor = "()V", line = 108)
    protected class30() {
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method191(Component arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method195(Graphics arg0, int arg1, int arg2, int arg3);
}
