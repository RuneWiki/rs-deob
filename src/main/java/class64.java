import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class64 extends Canvas {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field1240;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Loc;")
    private static class151 field1245 = class137.method873(2, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Loc;")
    public static class151 field1241 = class137.method873(2, "mem=");

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field1249 = 0;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "Loc;")
    public static class151 field1243 = class137.method873(2, "::errortest");

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "Loc;")
    public static class151 field1250 = field1245;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field1246 = 0;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "Luc;")
    public static class211 field1244 = new class211(64);

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "Loc;")
    public static class151 field1254 = class137.method873(2, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "Lpg;")
    public static class165 field1251;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lsd;B)V")
    public static final void method428(class192 arg0, byte arg1) {
        client.field702 = arg0;
        field1248++;
        if (arg1 < 96) {
            field1252 = -6;
        }
    }

    @OriginalMember(owner = "client!fi", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1247++;
        this.field1240.update(arg0);
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class64(Component arg0) {
        this.field1240 = arg0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public static final void method429(int arg0) {
        field1242++;
        class139.method897(22036);
        class158.method1033(73);
        class138.method879((byte) 73);
        class193.method1215(0);
        class151.method963((byte) 23);
        if (arg0 >= -65) {
            field1254 = null;
        }
        class166.method1083((byte) -104);
        class68.method465(124);
        class102.method622(29);
        class236.method1537(0);
        class4.method29(104);
        class188.method1166(16776960);
        class134.method825((byte) -104);
        ((class68) class61.field1198).method461(-75);
        class113.field2013.method1317((byte) -126);
        class155.field2810.method1212(0);
        class228.field4023.method1212(0);
        class178.field3224.method1212(0);
        class56.field1126.method1212(0);
        class140.field2548.method1212(0);
        class16.field363.method1212(0);
        class176.field3188.method1212(0);
        class164.field2960.method1212(0);
        class23.field521.method1212(0);
        class106.field1884.method1212(0);
        class222.field3853.method1212(0);
    }

    @OriginalMember(owner = "client!fi", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1240.paint(arg0);
        field1257++;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
    public static void method430(int arg0) {
        field1251 = null;
        field1254 = null;
        field1241 = null;
        field1244 = null;
        if (arg0 == 64) {
            field1243 = null;
            field1250 = null;
            field1245 = null;
        }
    }
}
