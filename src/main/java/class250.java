import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class250 extends Canvas {

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field4521;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[J")
    public static long[] field4518 = new long[32];

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Lbf;")
    public static class199 field4522 = new class199(20);

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field4524 = 0;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Lqk;")
    public static class207 field4526 = class24.method212(255, "cookiehost");

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "Ldd;")
    public static class132 field4527 = new class132();

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static void method1754(byte arg0) {
        field4527 = null;
        field4522 = null;
        field4518 = null;
        field4526 = null;
        if (arg0 > -67) {
            method1754((byte) -102);
        }
    }

    @OriginalMember(owner = "client!fj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4519++;
        this.field4521.update(arg0);
    }

    @OriginalMember(owner = "client!fj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field4520++;
        this.field4521.paint(arg0);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lv;I)V")
    public static final void method1755(class149 arg0, int arg1) {
        field4525++;
        if (class261.field4649 != null) {
            try {
                class261.field4649.method879(0, 0L);
                class261.field4649.method875(24, -1, arg0.field2593, arg0.field2568);
            } catch (Exception var2) {
            }
        }
        if (arg1 <= 73) {
            field4522 = null;
        }
        arg0.field2593 += 24;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class250(Component arg0) {
        this.field4521 = arg0;
    }
}
