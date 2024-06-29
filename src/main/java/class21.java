import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class21 extends Canvas {

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field574;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field577 = 2;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Lpd;")
    public static class94 field580 = class28.method249(105, "backvmid2");

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field582 = 0;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Lpd;")
    public static class94 field566 = class28.method249(48, "p11_full");

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lpd;")
    private static class94 field576 = class28.method249(-128, "Remove");

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "Lpd;")
    private static class94 field575 = class28.method249(69, "Invalid username or password)3");

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lpd;")
    public static class94 field578 = field576;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Lpd;")
    public static class94 field567 = field575;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Lpd;")
    public static class94 field581 = class28.method249(54, "_");

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Lpd;")
    private static class94 field584 = class28.method249(94, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Lpd;")
    public static class94 field571 = field584;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Lpd;")
    public static class94 field579 = field584;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lte;")
    public static class119 field573 = new class119();

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static volatile int field588 = 0;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "Lpd;")
    private static class94 field586 = class28.method249(121, "Service unavailable)3");

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "Lpd;")
    public static class94 field587 = field586;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "Lpd;")
    private static class94 field590 = class28.method249(-66, " is already on your friend list");

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "Lpd;")
    public static class94 field589 = field590;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Z")
    public static boolean field568;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "[I")
    public static int[] field585;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)I", line = 14)
    public static int method156(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!dc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 29)
    public final void paint(Graphics arg0) {
        field583++;
        this.field574.paint(arg0);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 37)
    public static final void method157(int arg0) {
        field570++;
        for (int var1 = -1; var1 < class113.field2886; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class38.field985[var1];
            }
            class89 var6 = class85.field2138[var5];
            if (var6 != null && var6.field189 > 0) {
                var6.field189--;
                if (var6.field189 == 0) {
                    var6.field186 = null;
                }
            }
        }
        if (arg0 != -20863) {
            field581 = null;
        }
        for (int var2 = 0; var2 < class115.field2906; var2++) {
            int var3 = class95.field2442[var2];
            class80 var4 = class28.field803[var3];
            if (var4 != null && var4.field189 > 0) {
                var4.field189--;
                if (var4.field189 == 0) {
                    var4.field186 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V", line = 99)
    public static void method158(boolean arg0) {
        field575 = null;
        field578 = null;
        field566 = null;
        field586 = null;
        field589 = null;
        field585 = null;
        field590 = null;
        field581 = null;
        field580 = null;
        field584 = null;
        field576 = null;
        field573 = null;
        if (arg0) {
            field567 = null;
            field579 = null;
            field587 = null;
            field571 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 131)
    public final void update(Graphics arg0) {
        this.field574.update(arg0);
        field572++;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 146)
    public class21(Component arg0) {
        this.field574 = arg0;
    }
}
