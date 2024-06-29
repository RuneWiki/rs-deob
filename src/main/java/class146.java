import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class146 extends Canvas {

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field3091;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field3079 = 0;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Ldd;")
    public static class35 field3081 = class180.method1196((byte) 127, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Ldd;")
    private static class35 field3082 = class180.method1196((byte) -87, "Please try using a different world)3");

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Ldd;")
    public static class35 field3080 = field3082;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "[I")
    public static int[] field3083 = new int[100];

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Ldd;")
    public static class35 field3090 = field3082;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Ldd;")
    public static class35 field3085 = field3082;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Ldd;")
    public static class35 field3078 = field3082;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Ldd;")
    public static class35 field3084 = field3082;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Ldd;")
    public static class35 field3088 = field3082;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Lag;")
    public static class8 field3087;

    @OriginalMember(owner = "client!pc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field3091.update(arg0);
        field3086++;
    }

    @OriginalMember(owner = "client!pc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field3091.paint(arg0);
        field3089++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method1005(byte arg0) {
        if (arg0 <= 1) {
            field3088 = null;
        }
        field3080 = null;
        field3083 = null;
        field3087 = null;
        field3078 = null;
        field3084 = null;
        field3090 = null;
        field3085 = null;
        field3082 = null;
        field3081 = null;
        field3088 = null;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class146(Component arg0) {
        this.field3091 = arg0;
    }
}
