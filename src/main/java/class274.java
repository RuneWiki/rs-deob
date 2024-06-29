import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class274 extends Canvas {

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field3545;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lwo;")
    public static class285 field3543;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method1721(int arg0) {
        if (arg0 != 0) {
            method1722(20);
        }
        field3543 = null;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public static final void method1722(int arg0) {
        class89.field1027.method1984((byte) 117);
        field3549++;
        if (arg0 != -16915) {
            method1722(49);
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class6.field42[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class340.field4641[var2] = 0L;
        }
        class202.field2380 = 0;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
    public static final void method1723(int arg0) {
        field3547++;
        class225.field2845.method2290(13831);
        if (arg0 != 72) {
            field3543 = null;
        }
        class298.field3973.method2290(13831);
    }

    @OriginalMember(owner = "client!ob", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field3545.update(arg0);
        field3548++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)I")
    public static final int method1724(byte arg0, int arg1) {
        field3546++;
        if (arg0 <= 68) {
            method1722(-69);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ob", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field3544++;
        this.field3545.paint(arg0);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class274(Component arg0) {
        this.field3545 = arg0;
    }
}
