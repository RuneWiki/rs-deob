import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class40 extends Canvas {

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field1021;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field1010 = 0;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field1012 = 0;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Lv;")
    public static class122 field1014 = class55.method425(-62, "Handel)4Duell");

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field1018 = 0;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lv;")
    private static class122 field1017 = class55.method425(-96, "red:");

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field1019 = 0;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lv;")
    public static class122 field1011 = class55.method425(-120, "chatback");

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lv;")
    public static class122 field1009 = field1017;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 3)
    public static final void method343(byte arg0) {
        int var1 = 99 % ((arg0 - 75) / 51);
        class49.field1239.method434((byte) -76);
        class56.field1477.method434((byte) -76);
        field1020++;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V", line = 39)
    public static void method344(byte arg0) {
        field1009 = null;
        field1017 = null;
        if (arg0 <= 2) {
            method344((byte) 20);
        }
        field1014 = null;
        field1011 = null;
    }

    @OriginalMember(owner = "client!gd", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 55)
    public final void update(Graphics arg0) {
        this.field1021.update(arg0);
        field1015++;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 76)
    public class40(Component arg0) {
        this.field1021 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILv;Lv;Lmb;)Lrc;", line = 92)
    public static final class105 method345(int arg0, class122 arg1, class122 arg2, class74 arg3) {
        if (arg0 != 0) {
            field1014 = null;
        }
        int var4 = arg3.method628(arg1, true);
        int var5 = arg3.method605(arg2, var4, 1036);
        field1016++;
        return class28.method269(var4, var5, arg3, -11813);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V", line = 108)
    public static final void method346(boolean arg0) {
        class21.field556.method434((byte) -76);
        if (arg0) {
            method345(-51, null, null, null);
        }
        field1024++;
    }

    @OriginalMember(owner = "client!gd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 120)
    public final void paint(Graphics arg0) {
        this.field1021.paint(arg0);
        field1023++;
    }
}
