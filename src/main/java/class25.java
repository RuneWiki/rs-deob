import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public abstract class class25 {

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "Lta;")
    public static class37 field307 = class20.method87(-98, "Dairy Churn");

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "Lta;")
    public static class37 field308 = class20.method87(-127, "Suchen");

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "Z")
    public static boolean field305 = false;

    @OriginalMember(owner = "mapview!ma", name = "i", descriptor = "Z")
    public static boolean field310 = true;

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "Lta;")
    public static class37 field306 = class20.method87(-95, "Altar");

    @OriginalMember(owner = "mapview!ma", name = "l", descriptor = "Lta;")
    public static class37 field313 = class20.method87(-113, " )2 ");

    @OriginalMember(owner = "mapview!ma", name = "o", descriptor = "Lta;")
    public static class37 field316 = class20.method87(-99, "sprites");

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "I")
    public int field304;

    @OriginalMember(owner = "mapview!ma", name = "h", descriptor = "I")
    public int field309;

    @OriginalMember(owner = "mapview!ma", name = "k", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "mapview!ma", name = "m", descriptor = "Ljava/awt/Image;")
    public Image field314;

    @OriginalMember(owner = "mapview!ma", name = "n", descriptor = "Ljava/awt/Image;")
    public static Image field315;

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field303;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "[I")
    public int[] field302;

    @OriginalMember(owner = "mapview!ma", name = "j", descriptor = "[Lf;")
    public static class10[] field311;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(I)V", line = 19)
    public static void method138(int arg0) {
        field313 = null;
        field306 = null;
        field303 = null;
        field307 = null;
        field308 = null;
        field311 = null;
        if (arg0 == -3237) {
            field316 = null;
            field315 = null;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(I)V", line = 42)
    public final void method139(int arg0) {
        class22.method109(this.field302, this.field309, this.field304);
        if (arg0 != 0) {
            method138(83);
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Z)B", line = 68)
    public static final byte method140(boolean arg0) {
        if (!arg0) {
            method140(false);
        }
        return class31.field454 == null ? 0 : class31.field454[class11.field127];
    }

    @OriginalMember(owner = "mapview!ma", name = "<init>", descriptor = "()V", line = 123)
    protected class25() {
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method137(Component arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Ljava/awt/Graphics;IZI)V")
    public abstract void method141(Graphics arg0, int arg1, boolean arg2, int arg3);
}
