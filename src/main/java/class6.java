import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public abstract class class6 {

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "Lj;")
    private static class17 field121 = class30.method190(-118, "Chainmail Shop");

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "I")
    public static int field123 = 50;

    @OriginalMember(owner = "mapview!ca", name = "j", descriptor = "Lj;")
    private static class17 field130 = class30.method190(-105, "Loom");

    @OriginalMember(owner = "mapview!ca", name = "i", descriptor = "I")
    public static int field129 = 0;

    @OriginalMember(owner = "mapview!ca", name = "f", descriptor = "Lj;")
    private static class17 field126 = class30.method190(-98, "Saw Mill");

    @OriginalMember(owner = "mapview!ca", name = "n", descriptor = "[[B")
    public static byte[][] field134 = new byte[1000][];

    @OriginalMember(owner = "mapview!ca", name = "o", descriptor = "Lj;")
    private static class17 field135 = class30.method190(-90, "Staff Shop");

    @OriginalMember(owner = "mapview!ca", name = "e", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "mapview!ca", name = "g", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "mapview!ca", name = "l", descriptor = "I")
    public int field132;

    @OriginalMember(owner = "mapview!ca", name = "m", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "Loa;")
    public static class28 field122;

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "Ljava/awt/Image;")
    public static Image field124;

    @OriginalMember(owner = "mapview!ca", name = "k", descriptor = "Ljava/awt/Image;")
    public Image field131;

    @OriginalMember(owner = "mapview!ca", name = "h", descriptor = "[I")
    public int[] field128;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(I)[Lj;", line = 28)
    public static final class17[] method61(int arg0) {
        if (arg0 != 0) {
            method61(-106);
        }
        return new class17[] { class35.field443, class4.field110, class13.field236, class24.field313, class11.field224, class12.field230, class27.field351, class27.field349, class11.field218, class4.field96, class15.field242, class26.field342, class13.field240, field135, class28.field365, class26.field347, class4.field116, class28.field372, class18.field280, class17.field257, class3.field95, class28.field371, mapview.field29, class4.field104, class30.field385, class27.field361, class15.field241, class35.field448, class2.field83, class20.field288, class26.field339, class1.field80, class1.field79, class31.field391, class12.field227, class16.field252, class35.field442, class23.field307, class12.field231, class24.field322, class15.field250, class28.field363, class33.field414, class29.field380, class30.field386, field121, class24.field312, class29.field381, class17.field264, class17.field267, class20.field291, class2.field89, class35.field441, class26.field343, class31.field392, class31.field394, class15.field243, class2.field88, class3.field91, field130, class30.field389, class31.field393, class29.field382, mapview.field57, class29.field382, class15.field245, class29.field382, class27.field353, field126, class29.field382, class1.field73 };
    }

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "(I)V", line = 44)
    public final void method63(int arg0) {
        if (arg0 >= 64) {
            class25.method175(this.field128, this.field133, this.field132);
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "(I)V", line = 54)
    public static void method64(int arg0) {
        field121 = null;
        int var1 = -52 / ((arg0 - 61) / 38);
        field134 = null;
        field126 = null;
        field130 = null;
        field124 = null;
        field122 = null;
        field135 = null;
    }

    @OriginalMember(owner = "mapview!ca", name = "<init>", descriptor = "()V", line = 87)
    protected class6() {
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method62(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IZILjava/awt/Component;)V")
    public abstract void method65(int arg0, boolean arg1, int arg2, Component arg3);
}
