import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends Canvas {

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field65;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field55 = 0;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Lmb;")
    public static class132 field56 = class166.method1092("settings=", 123);

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "[[S")
    public static short[][] field59 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Lmb;")
    public static class132 field63 = class166.method1092("Eingabeprozedur geladen)3", 120);

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field60 = -1;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Lbf;")
    public static class18 field58;

    @OriginalMember(owner = "client!ae", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field65.update(arg0);
        field57++;
    }

    @OriginalMember(owner = "client!ae", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field62++;
        this.field65.paint(arg0);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method23(int arg0) {
        field58 = null;
        field59 = null;
        field56 = null;
        field63 = null;
        if (arg0 != -1) {
            method23(96);
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class6(Component arg0) {
        this.field65 = arg0;
    }
}
