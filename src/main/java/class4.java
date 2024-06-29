import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public abstract class class4 {

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "[[B")
    public static byte[][] field103 = new byte[1000][];

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "Z")
    public static boolean field104 = false;

    @OriginalMember(owner = "mapview!ba", name = "f", descriptor = "Ln;")
    public static class26 field108 = class9.method82(255, "Slayer Master");

    @OriginalMember(owner = "mapview!ba", name = "h", descriptor = "Ln;")
    public static class26 field110 = class9.method82(255, "Loom");

    @OriginalMember(owner = "mapview!ba", name = "j", descriptor = "Ln;")
    public static class26 field112 = class9.method82(255, "Anvil");

    @OriginalMember(owner = "mapview!ba", name = "g", descriptor = "Ln;")
    public static class26 field109 = class9.method82(255, "(U");

    @OriginalMember(owner = "mapview!ba", name = "l", descriptor = "Ln;")
    public static class26 field114 = class9.method82(255, "Spinning Wheel");

    @OriginalMember(owner = "mapview!ba", name = "p", descriptor = "I")
    public static int field118 = 0;

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "Ln;")
    public static class26 field106 = class9.method82(255, "Mining Shop");

    @OriginalMember(owner = "mapview!ba", name = "r", descriptor = "Ln;")
    public static class26 field120 = class9.method82(255, "Fishing Spot");

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "mapview!ba", name = "m", descriptor = "I")
    public int field115;

    @OriginalMember(owner = "mapview!ba", name = "o", descriptor = "I")
    public int field117;

    @OriginalMember(owner = "mapview!ba", name = "t", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "mapview!ba", name = "q", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field119;

    @OriginalMember(owner = "mapview!ba", name = "k", descriptor = "Ljava/awt/Image;")
    public Image field113;

    @OriginalMember(owner = "mapview!ba", name = "i", descriptor = "[B")
    public static byte[] field111;

    @OriginalMember(owner = "mapview!ba", name = "n", descriptor = "[I")
    public int[] field116;

    @OriginalMember(owner = "mapview!ba", name = "s", descriptor = "[I")
    public static int[] field121;

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "[[[I")
    public static int[][][] field105;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I)V", line = 22)
    public final void method56(int arg0) {
        class12.method94(this.field116, this.field115, this.field117);
        if (arg0 >= -67) {
            method59((byte) -113);
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(B)V", line = 86)
    public static void method59(byte arg0) {
        field120 = null;
        if (arg0 != 10) {
            field118 = -28;
        }
        field110 = null;
        field106 = null;
        field108 = null;
        field119 = null;
        field114 = null;
        field109 = null;
        field103 = null;
        field121 = null;
        field111 = null;
        field105 = null;
        field112 = null;
    }

    @OriginalMember(owner = "mapview!ba", name = "<init>", descriptor = "()V", line = 111)
    protected class4() {
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method57(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(ILjava/awt/Component;IB)V")
    public abstract void method58(int arg0, Component arg1, int arg2, byte arg3);
}
