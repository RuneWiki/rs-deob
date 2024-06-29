import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 extends Canvas {

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field54;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Lwd;")
    public static class150 field53 = class2.method9(true, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Z")
    public static boolean field55 = true;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Lwd;")
    private static class150 field58 = class2.method9(true, "Your ignore list is full)3 Max of 100 hit");

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Lwd;")
    public static class150 field59 = class2.method9(true, "@whi@");

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "[J")
    public static long[] field61 = new long[200];

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Lwd;")
    private static class150 field63 = class2.method9(true, "wave:");

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Lwd;")
    public static class150 field60 = field63;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lwd;")
    public static class150 field62 = field63;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field64 = 0;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field67 = 0;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Lwd;")
    public static class150 field66 = field58;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lva;")
    public static class141 field57;

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class3(Component arg0) {
        this.field54 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method15(byte arg0) {
        field53 = null;
        field66 = null;
        field58 = null;
        if (arg0 > -113) {
            method15((byte) 96);
        }
        field61 = null;
        field57 = null;
        field63 = null;
        field60 = null;
        field59 = null;
        field62 = null;
    }

    @OriginalMember(owner = "client!ab", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field54.paint(arg0);
        field56++;
    }

    @OriginalMember(owner = "client!ab", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field54.update(arg0);
        field68++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILwd;Lwd;)V")
    public static final void method16(int arg0, int arg1, class150 arg2, class150 arg3) {
        if (arg1 == 0 && class29.field882 != -1) {
            client.field618 = 0;
            class113.field2634 = arg2;
        }
        if (class66.field1688 == -1) {
            class40.field1067 = true;
        }
        field65++;
        for (int var4 = arg0; var4 > 0; var4--) {
            class133.field3121[var4] = class133.field3121[var4 - 1];
            class26.field790[var4] = class26.field790[var4 - 1];
            class38.field1042[var4] = class38.field1042[var4 - 1];
        }
        class26.field790[0] = arg3;
        class38.field1042[0] = arg2;
        class133.field3121[0] = arg1;
    }
}
