import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public class class36 extends Canvas {

    @OriginalMember(owner = "mapview!v", name = "h", descriptor = "Ljava/awt/Component;")
    private Component field501;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "Ll;")
    public static class22 field494 = new class22();

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "[I")
    public static int[] field498 = new int[128];

    @OriginalMember(owner = "mapview!v", name = "g", descriptor = "Ld;")
    public static class7 field500 = class37.method242("Windmill", 1333943984);

    @OriginalMember(owner = "mapview!v", name = "f", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "mapview!v", name = "i", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "Lp;")
    public static class29 field495;

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "[Lj;")
    public static class18[] field496;

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "[[Lr;")
    public static class32[][] field497;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 13)
    public static final void method235(Component arg0, int arg1) {
        Method var2 = class5.field73;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        if (arg1 != 128) {
            method236((byte) 74);
        }
        arg0.addKeyListener(class8.field94);
        arg0.addFocusListener(class8.field94);
    }

    @OriginalMember(owner = "mapview!v", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 38)
    public final void update(Graphics arg0) {
        this.field501.update(arg0);
    }

    @OriginalMember(owner = "mapview!v", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 84)
    public final void paint(Graphics arg0) {
        this.field501.paint(arg0);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(B)V", line = 106)
    public static void method236(byte arg0) {
        field500 = null;
        field494 = null;
        field497 = null;
        field496 = null;
        field495 = null;
        if (arg0 <= 35) {
            method235(null, 113);
        }
        field498 = null;
    }

    @OriginalMember(owner = "mapview!v", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 121)
    public class36(Component arg0) {
        this.field501 = arg0;
    }
}
