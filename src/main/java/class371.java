import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class371 extends Canvas {

    @OriginalMember(owner = "client!or", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field5245;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "Ltm;")
    public static class112 field5244;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILed;)V")
    public static final void method2224(int arg0, class449 arg1) {
        field5249++;
        class349.field4779 = arg1;
        if (arg0 != -22982) {
            method2225(30);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
    public static void method2225(int arg0) {
        field5244 = null;
        if (arg0 <= 74) {
            field5246 = 45;
        }
    }

    @OriginalMember(owner = "client!or", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field5243++;
        this.field5245.update(arg0);
    }

    @OriginalMember(owner = "client!or", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field5247++;
        this.field5245.paint(arg0);
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class371(Component arg0) {
        this.field5245 = arg0;
    }

    static {
        new class112("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field5244 = new class112("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");
    }
}
