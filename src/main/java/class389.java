import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class389 extends Canvas {

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field5460;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "F")
    public static float field5459;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Lnp;")
    public static class338 field5456;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Ltv;")
    public static class392 field5455;

    @OriginalMember(owner = "client!fi", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field5460.paint(arg0);
        field5457++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public static void method2235(int arg0) {
        if (arg0 == 4706) {
            field5455 = null;
            field5456 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field5460.update(arg0);
        field5458++;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class389(Component arg0) {
        this.field5460 = arg0;
    }

    static {
        new class83("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
    }
}
