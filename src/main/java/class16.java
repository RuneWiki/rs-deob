import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public abstract class class16 {

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "Lea;")
    public static class10 field172 = class3.method8("Mini)2Game", -12);

    @OriginalMember(owner = "mapview!i", name = "h", descriptor = "Lea;")
    public static class10 field177 = class3.method8("Mining Shop", -120);

    @OriginalMember(owner = "mapview!i", name = "j", descriptor = "Lea;")
    public static class10 field179 = class3.method8("Find", -113);

    @OriginalMember(owner = "mapview!i", name = "k", descriptor = "Lea;")
    public static class10 field180 = class3.method8("Loading", 97);

    @OriginalMember(owner = "mapview!i", name = "f", descriptor = "Lea;")
    public static class10 field175 = class3.method8("_", -88);

    @OriginalMember(owner = "mapview!i", name = "l", descriptor = "I")
    public static int field181 = 0;

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "[Z")
    public static boolean[] field171 = new boolean[112];

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "Lea;")
    public static class10 field173 = class3.method8("Brewery", -34);

    @OriginalMember(owner = "mapview!i", name = "m", descriptor = "Lea;")
    public static class10 field182 = class3.method8("Platebody Shop", 116);

    @OriginalMember(owner = "mapview!i", name = "e", descriptor = "I")
    public int field174;

    @OriginalMember(owner = "mapview!i", name = "n", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "mapview!i", name = "g", descriptor = "Lca;")
    public static class6 field176;

    @OriginalMember(owner = "mapview!i", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field178;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "[I")
    public int[] field170;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(I)V", line = 5)
    public final void method111(int arg0) {
        if (arg0 < -123) {
            class27.method203(this.field170, this.field183, this.field174);
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(B)V", line = 21)
    public static void method112(byte arg0) {
        field180 = null;
        field182 = null;
        field179 = null;
        field173 = null;
        if (arg0 > -97) {
            return;
        }
        field176 = null;
        field172 = null;
        field177 = null;
        field175 = null;
        field171 = null;
    }

    @OriginalMember(owner = "mapview!i", name = "<init>", descriptor = "()V", line = 104)
    protected class16() {
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method103(Graphics arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
    public abstract void method99(boolean arg0, Component arg1, int arg2, int arg3);
}
