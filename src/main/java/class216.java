import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class216 extends Canvas {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field3905;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field3906 = 1;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field3907 = 0;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "Lhj;")
    public static class69 field3913 = class181.method1318("; Max)2Age=", (byte) -128);

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Lhj;")
    public static class69 field3909 = class181.method1318(" ", (byte) -106);

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Lhj;")
    public static class69 field3916 = class181.method1318(")4a=", (byte) -111);

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "Lhj;")
    public static class69 field3918 = class181.method1318("blinken3:", (byte) -112);

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "[Lhj;")
    public static class69[] field3917 = new class69[500];

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "Lhj;")
    public static class69 field3919 = class181.method1318(":assistreq:", (byte) -111);

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "[Lhk;")
    public static class121[] field3911;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)I")
    public static final int method1551(int arg0, int arg1) {
        field3914++;
        if (arg0 < 20) {
            method1551(39, -128);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!eg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field3912++;
        this.field3905.paint(arg0);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static void method1552(int arg0) {
        field3919 = null;
        field3918 = null;
        field3913 = null;
        field3917 = null;
        field3911 = null;
        field3916 = null;
        field3909 = null;
        if (arg0 >= -125) {
            field3918 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3908++;
        this.field3905.update(arg0);
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class216(Component arg0) {
        this.field3905 = arg0;
    }
}
