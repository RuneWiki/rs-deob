import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class7 extends Canvas {

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field66;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "Laa;")
    public static class2 field65 = new class2();

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "I")
    public static int field68 = 50;

    @OriginalMember(owner = "mapview!d", name = "g", descriptor = "Lf;")
    public static class10 field71 = class23.method139("overlay2)3dat", (byte) -98);

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "Lf;")
    public static class10 field70 = class23.method139("Windmill", (byte) -78);

    @OriginalMember(owner = "mapview!d", name = "h", descriptor = "Lf;")
    public static class10 field72 = class23.method139("Apothecary", (byte) -61);

    @OriginalMember(owner = "mapview!d", name = "i", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "[La;")
    public static class1[] field67;

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "[[[I")
    public static int[][][] field69;

    @OriginalMember(owner = "mapview!d", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 6)
    public final void update(Graphics arg0) {
        this.field66.update(arg0);
    }

    @OriginalMember(owner = "mapview!d", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 31)
    public class7(Component arg0) {
        this.field66 = arg0;
    }

    @OriginalMember(owner = "mapview!d", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 43)
    public final void paint(Graphics arg0) {
        this.field66.paint(arg0);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Z)Lt;", line = 56)
    public static final class38 method39(boolean arg0) {
        try {
            if (!arg0) {
                field67 = null;
            }
            return (class38) Class.forName("e").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class35();
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(I)V", line = 78)
    public static void method40(int arg0) {
        field65 = null;
        field69 = null;
        field70 = null;
        if (arg0 < 3) {
            field68 = 43;
        }
        field67 = null;
        field71 = null;
        field72 = null;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(ZLf;Lc;Lf;Lc;)Lg;", line = 97)
    public static final class12 method41(boolean arg0, class10 arg1, class5 arg2, class10 arg3, class5 arg4) {
        if (!arg0) {
            field73 = -41;
        }
        int var5 = arg2.method31(arg1, -113);
        int var6 = arg2.method28(-122, arg3, var5);
        return class35.method233(var5, -89, var6, arg2, arg4);
    }
}
