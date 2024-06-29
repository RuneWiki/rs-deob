import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class353 extends Canvas {

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field5237;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5236 = "Loaded config";

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5233 = "K";

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "Lir;")
    public static class185 field5234;

    @OriginalMember(owner = "client!fm", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field5231++;
        this.field5237.paint(arg0);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)V")
    public static final void method2326(int arg0, byte arg1) {
        if (arg1 != -127) {
            return;
        }
        class51 var2 = class257.field3768;
        synchronized (class257.field3768) {
            class257.field3768.method379(arg0, false);
        }
        field5232++;
    }

    @OriginalMember(owner = "client!fm", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field5235++;
        this.field5237.update(arg0);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public static final void method2327(int arg0) {
        if (arg0 != -4698) {
            field5236 = null;
        }
        class51 var1 = class38.field565;
        synchronized (class38.field565) {
            class38.field565.method372(arg0 ^ 0xFFFFEDD1);
        }
        field5238++;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V")
    public static void method2328(int arg0) {
        if (arg0 != 5058) {
            method2326(-24, (byte) 71);
        }
        field5233 = null;
        field5236 = null;
        field5234 = null;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class353(Component arg0) {
        this.field5237 = arg0;
    }
}
