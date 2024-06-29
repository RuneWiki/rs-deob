import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class24 {

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field613 = 0;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field607 = 20;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field608 = 0;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lae;")
    public static class6 field610 = class64.method474(116, " x");

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field611 = 0;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "J")
    public static long field612 = 0L;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lp;")
    public static class95 field609 = new class95();

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Lp;")
    public static class95 field616 = new class95();

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Lae;")
    private static class6 field617 = class64.method474(111, "Loading friend list");

    @OriginalMember(owner = "client!d", name = "p", descriptor = "[Lqb;")
    public static class99[] field618 = new class99[50];

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Lae;")
    public static class6 field619 = field617;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Lvb;")
    public static class129 field605;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/awt/Component;ZLed;I)V", line = 35)
    public static final void method227(int arg0, Component arg1, boolean arg2, class31 arg3, int arg4) {
        field615++;
        field603 = arg0;
        if (arg4 != 0) {
            field610 = null;
        }
        class126.field3090 = arg2;
        class118.field2812 = class5.method22(67);
        try {
            class86 var5 = (class86) Class.forName("pc").getDeclaredConstructor().newInstance();
            var5.method319(arg1, arg0, arg2);
            var5.method734(arg3, 2048);
            class27.field681 = var5;
        } catch (Throwable var9) {
            try {
                class36 var6 = new class36(arg3);
                var6.method319(arg1, arg0, arg2);
                var6.method734(arg3, 16384);
                class27.field681 = var6;
            } catch (Throwable var8) {
                if (class31.field751.toLowerCase().indexOf("microsoft") >= 0) {
                    try {
                        class27.field681 = new class132();
                        class126.field3090 = false;
                        field603 = 8000;
                        return;
                    } catch (Throwable var7) {
                    }
                }
                class27.field681 = new class19();
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V", line = 92)
    public static void method228(byte arg0) {
        field618 = null;
        if (arg0 < 16) {
            method228((byte) 9);
        }
        field617 = null;
        field616 = null;
        field605 = null;
        field619 = null;
        field610 = null;
        field609 = null;
    }
}
