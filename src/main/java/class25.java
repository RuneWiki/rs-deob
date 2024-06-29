import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class25 extends Canvas {

    @OriginalMember(owner = "mapview!n", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field348;

    @OriginalMember(owner = "mapview!n", name = "e", descriptor = "[I")
    public static int[] field346 = new int[128];

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "Lna;")
    public static class26 field344 = class30.method205((byte) 19, "Amulet Shop");

    @OriginalMember(owner = "mapview!n", name = "h", descriptor = "Lna;")
    public static class26 field349 = class30.method205((byte) 74, "Agility Training");

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "Lp;")
    public static class29 field342 = new class29();

    @OriginalMember(owner = "mapview!n", name = "j", descriptor = "Lna;")
    public static class26 field351 = class30.method205((byte) 35, "Key");

    @OriginalMember(owner = "mapview!n", name = "k", descriptor = "Lna;")
    public static class26 field352 = class30.method205((byte) 109, "Fishing Spot");

    @OriginalMember(owner = "mapview!n", name = "m", descriptor = "Lna;")
    public static class26 field354 = class30.method205((byte) 99, "Brewery");

    @OriginalMember(owner = "mapview!n", name = "l", descriptor = "[[[[B")
    public static byte[][][][] field353 = new byte[5][][][];

    @OriginalMember(owner = "mapview!n", name = "o", descriptor = "Lna;")
    public static class26 field356 = class30.method205((byte) 74, "fonts");

    @OriginalMember(owner = "mapview!n", name = "p", descriptor = "Lna;")
    public static class26 field357 = class30.method205((byte) 92, "Altar");

    @OriginalMember(owner = "mapview!n", name = "n", descriptor = "Lna;")
    public static class26 field355 = class30.method205((byte) 27, "Hunter Training");

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "mapview!n", name = "f", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "mapview!n", name = "i", descriptor = "[B")
    public static byte[] field350;

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "[I")
    public static int[] field343;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(I)V", line = 10)
    public static final void method164(int arg0) {
        class29 var1 = field342;
        synchronized (field342) {
            class6.field157 = class31.field414;
            class6.field161 = class31.field415;
            if (arg0 == 14288) {
                class27.field371 = class32.field424;
                class37.field475 = class36.field465;
                class31.field412 = class30.field402;
                class20.field279 = class30.field399;
                class36.field465 = 0;
            }
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Z)V", line = 34)
    public static final void method165(boolean arg0) {
        if (field342 != null) {
            class29 var1 = field342;
            synchronized (field342) {
                field342 = null;
            }
        }
        if (arg0) {
            method164(-33);
        }
    }

    @OriginalMember(owner = "mapview!n", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 68)
    public final void update(Graphics arg0) {
        this.field348.update(arg0);
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(B)V", line = 93)
    public static void method166(byte arg0) {
        field343 = null;
        field342 = null;
        field346 = null;
        field356 = null;
        field344 = null;
        field357 = null;
        field351 = null;
        field350 = null;
        field349 = null;
        field354 = null;
        field353 = null;
        if (arg0 >= 99) {
            field355 = null;
            field352 = null;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 115)
    public final void paint(Graphics arg0) {
        this.field348.paint(arg0);
    }

    @OriginalMember(owner = "mapview!n", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 126)
    public class25(Component arg0) {
        this.field348 = arg0;
    }
}
