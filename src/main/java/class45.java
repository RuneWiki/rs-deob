import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class45 extends Canvas {

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field678;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
    public static int field679 = 0;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "Liba;")
    public static class211 field682 = new class211(80, 1);

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "I")
    public static int field685 = 0;

    @OriginalMember(owner = "client!uda", name = "i", descriptor = "Lvg;")
    public static class622 field686 = new class622(64, 2);

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!uda", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 4)
    public final void paint(Graphics arg0) {
        this.field678.paint(arg0);
        field680++;
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 15)
    public class45(Component arg0) {
        this.field678 = arg0;
    }

    @OriginalMember(owner = "client!uda", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 24)
    public final void update(Graphics arg0) {
        field681++;
        this.field678.update(arg0);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)V", line = 32)
    public static final void method256(int arg0, int arg1) {
        field683++;
        class381 var2 = class584.field8483.method1993(-79);
        if (arg0 <= 96) {
            field682 = null;
        }
        while (var2 != null) {
            if ((var2.field5740 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method2360((byte) 66);
            }
            var2 = class584.field8483.method1997(9831);
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V", line = 54)
    public static void method257(int arg0) {
        if (arg0 > -19) {
            field679 = 59;
        }
        field682 = null;
        field686 = null;
    }
}
