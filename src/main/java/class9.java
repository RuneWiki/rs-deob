import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!e")
public abstract class class9 {

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "Lh;")
    public static class15 field116 = class18.method153("Staff Shop", 1);

    @OriginalMember(owner = "mapview!e", name = "f", descriptor = "Z")
    public static boolean field120 = false;

    @OriginalMember(owner = "mapview!e", name = "k", descriptor = "Lh;")
    public static class15 field125 = class18.method153("Skirt Shop", 1);

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "I")
    public static int field115 = 0;

    @OriginalMember(owner = "mapview!e", name = "m", descriptor = "Lh;")
    public static class15 field127 = class18.method153("POH Portal", 1);

    @OriginalMember(owner = "mapview!e", name = "o", descriptor = "I")
    public static int field129 = 0;

    @OriginalMember(owner = "mapview!e", name = "n", descriptor = "Lh;")
    public static class15 field128 = class18.method153("Helmet Shop", 1);

    @OriginalMember(owner = "mapview!e", name = "e", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "mapview!e", name = "h", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "mapview!e", name = "i", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "mapview!e", name = "j", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "mapview!e", name = "l", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field117;

    @OriginalMember(owner = "mapview!e", name = "p", descriptor = "Ljava/awt/Image;")
    public Image field130;

    @OriginalMember(owner = "mapview!e", name = "d", descriptor = "[I")
    public static int[] field118;

    @OriginalMember(owner = "mapview!e", name = "g", descriptor = "[I")
    public int[] field121;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(I)V", line = 34)
    public static final void method80(int arg0) {
        class20 var1 = class19.field262;
        synchronized (class19.field262) {
            class21.field292 = class23.field315;
            class33.field426 = class19.field270;
            if (arg0 == 8731) {
                class32.field407 = class36.field445;
                class33.field429 = class19.field274;
                class20.field279 = class21.field291;
                class36.field456 = class15.field232;
                class19.field274 = 0;
            }
        }
    }

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "(I)V", line = 60)
    public static void method81(int arg0) {
        field125 = null;
        field116 = null;
        field117 = null;
        field127 = null;
        if (arg0 != -21853) {
            field116 = null;
        }
        field128 = null;
        field118 = null;
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(Z)V", line = 91)
    public final void method82(boolean arg0) {
        if (!arg0) {
            this.method82(false);
        }
        class8.method66(this.field121, this.field122, this.field124);
    }

    @OriginalMember(owner = "mapview!e", name = "<init>", descriptor = "()V", line = 121)
    protected class9() {
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
    public abstract void method78(Component arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public abstract void method79(int arg0, byte arg1, Graphics arg2, int arg3);
}
