import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class class3 extends Canvas {

    @OriginalMember(owner = "mapview!b", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field24;

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "Ll;")
    public static class21 field19 = class28.method185(-20839, "_");

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "Ll;")
    public static class21 field16 = class28.method185(-20839, "world");

    @OriginalMember(owner = "mapview!b", name = "h", descriptor = "Ll;")
    private static class21 field23 = class28.method185(-20839, "Hair Dressers");

    @OriginalMember(owner = "mapview!b", name = "g", descriptor = "Ll;")
    private static class21 field22 = class28.method185(-20839, "Fur Trader");

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "[I")
    public static int[] field17 = new int[128];

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "mapview!b", name = "e", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "mapview!b", name = "f", descriptor = "Lja;")
    public static class18 field21;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I)V", line = 6)
    public static void method7(int arg0) {
        field16 = null;
        field22 = null;
        if (arg0 != 128) {
            method8(null, -7);
        }
        field23 = null;
        field19 = null;
        field17 = null;
        field21 = null;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "([Ll;I)V", line = 21)
    public static final void method8(class21[] arg0, int arg1) {
        if (arg1 < -69) {
            class4.method12(0, arg0, arg0.length, -3518);
        }
    }

    @OriginalMember(owner = "mapview!b", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 32)
    public final void update(Graphics arg0) {
        this.field24.update(arg0);
    }

    @OriginalMember(owner = "mapview!b", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 41)
    public final void paint(Graphics arg0) {
        this.field24.paint(arg0);
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "(I)[Ll;", line = 67)
    public static final class21[] method9(int arg0) {
        if (arg0 != 128) {
            method7(-109);
        }
        return new class21[] { class1.field4, class10.field77, class20.field182, class11.field84, class31.field362, class16.field148, class10.field74, class11.field80, class27.field328, class1.field1, class30.field348, class20.field193, class13.field119, PixMap.field225, class14.field141, class10.field78, class21.field200, PixMap.field232, class14.field140, class29.field343, class18.field160, class21.field206, class13.field116, PixMap.field228, class20.field175, PixMap.field230, PixMap.field220, class21.field210, class4.field35, class13.field129, class30.field349, class14.field142, class30.field354, class28.field332, class31.field360, class1.field3, class34.field387, class29.field337, class6.field50, class6.field45, class26.field315, class29.field347, class26.field316, class1.field6, class26.field317, PixMap.field221, class17.field151, field22, class30.field352, class31.field358, class14.field139, class20.field191, field23, mapview.field302, class1.field2, class6.field51, class16.field146, class21.field196, class10.field73, class1.field7, class34.field393, class29.field345, class17.field159, class4.field33, class4.field33, class4.field33, class4.field33, class17.field157, class27.field327, class4.field29 };
    }

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 98)
    public class3(Component arg0) {
        this.field24 = arg0;
    }
}
