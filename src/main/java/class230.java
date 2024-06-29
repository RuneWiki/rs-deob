import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class230 extends Canvas {

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field4003;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "Z")
    public static boolean field4004 = false;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public static int field4005 = 0;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "Lbu;")
    public static class407 field3999 = new class407(32);

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!mv", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field4003.paint(arg0);
        field4001++;
    }

    @OriginalMember(owner = "client!mv", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field4003.update(arg0);
        field4000++;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BI)V")
    public static final void method1590(byte arg0, int arg1) {
        class361.field5615 = new int[arg1];
        class155.field2512 = new int[arg1];
        class359.field5591 = new int[arg1];
        field4002++;
        if (arg0 == 71) {
            class460.field6821 = new int[arg1];
            class213.field3390 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
    public static void method1591(int arg0) {
        field3999 = null;
        if (arg0 != 0) {
            method1591(84);
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class230(Component arg0) {
        this.field4003 = arg0;
    }

    static {
        new class306("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
    }
}
