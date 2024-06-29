import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class119 extends Canvas {

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field2410;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Ljd;")
    private static class92 field2407 = class202.method1325((byte) 90, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field2415 = 0;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Z")
    public static boolean field2416 = false;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Ljd;")
    private static class92 field2418 = class202.method1325((byte) 90, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Ljd;")
    private static class92 field2413 = class202.method1325((byte) 90, "Type");

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Ljd;")
    public static class92 field2411 = field2413;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Ljd;")
    public static class92 field2417 = field2407;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Ljd;")
    public static class92 field2414 = class202.method1325((byte) 90, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Ljd;")
    public static class92 field2412 = field2418;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Loe;")
    public static class139 field2409 = new class139(128);

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Ljd;")
    public static class92 field2421 = class202.method1325((byte) 90, "<img=0>");

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lnh;")
    public static class133 field2408;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "[I")
    public static int[] field2419;

    @OriginalMember(owner = "client!mc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field2406++;
        this.field2410.paint(arg0);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method808(byte arg0) {
        field2412 = null;
        field2411 = null;
        field2414 = null;
        field2413 = null;
        field2409 = null;
        field2417 = null;
        field2408 = null;
        field2419 = null;
        int var1 = 33 / ((arg0 - 70) / 35);
        field2421 = null;
        field2407 = null;
        field2418 = null;
    }

    @OriginalMember(owner = "client!mc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2420++;
        this.field2410.update(arg0);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class119(Component arg0) {
        this.field2410 = arg0;
    }
}
