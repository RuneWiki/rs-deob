import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public abstract class class30 {

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "Lia;")
    public static class15 field421 = class28.method196("_", false);

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "Lia;")
    public static class15 field423 = class28.method196("Slayer Master", false);

    @OriginalMember(owner = "mapview!q", name = "h", descriptor = "Lia;")
    public static class15 field426 = class28.method196("Prev page", false);

    @OriginalMember(owner = "mapview!q", name = "f", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "mapview!q", name = "i", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "mapview!q", name = "j", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "mapview!q", name = "k", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "Ljava/awt/Image;")
    public Image field422;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "[I")
    public int[] field419;

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "[I")
    public static int[] field420;

    @OriginalMember(owner = "mapview!q", name = "g", descriptor = "[I")
    public static int[] field425;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I)I", line = 8)
    public static final int method202(int arg0) {
        if (arg0 == 0) {
            return class17.field178 == null ? 0 : class17.field178[class13.field111];
        } else {
            return -95;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I[B)Lm;", line = 46)
    public static final class22 method203(int arg0, byte[] arg1) {
        if (arg1 == null) {
            return null;
        } else {
            class22 var2 = new class22(arg1, class6.field60, field425, class33.field471, class25.field358, class10.field79, class9.field78);
            class39.method252(arg0);
            return var2;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "(I)V", line = 67)
    public static void method204(int arg0) {
        field426 = null;
        field423 = null;
        field420 = null;
        if (arg0 != 18186) {
            method203(-104, null);
        }
        field421 = null;
        field425 = null;
    }

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "(I)B", line = 86)
    public static final byte method205(int arg0) {
        int var1 = 93 / ((arg0 + 32) / 46);
        return mapview.field342 == null ? 0 : mapview.field342[class13.field111];
    }

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "(I)V", line = 101)
    public final void method206(int arg0) {
        int var2 = 105 % ((arg0 - 39) / 45);
        class8.method38(this.field419, this.field429, this.field428);
    }

    @OriginalMember(owner = "mapview!q", name = "<init>", descriptor = "()V", line = 117)
    protected class30() {
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method22(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method23(Graphics arg0, int arg1, int arg2, int arg3);
}
