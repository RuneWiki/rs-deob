import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class117 {

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Lle;")
    public static class71 field2729 = new class71(20);

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field2735 = 0;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Lrc;")
    public static class105 field2732 = class43.method374("Titelbild geladen)3", 0);

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lrc;")
    public static class105 field2730 = class43.method374("Benutzen Sie bitte eine andere Welt)3", 0);

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lrc;")
    public static class105 field2734 = class43.method374("Ihr Spielkonto wurde deaktiviert)3", 0);

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Lrc;")
    public static class105 field2733 = class43.method374(":chalreq:", 0);

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lrc;")
    private static class105 field2736 = class43.method374("Select", 0);

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lrc;")
    public static class105 field2731 = class43.method374("Bitte wenden Sie sich an den Kundendienst)3", 0);

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Lrc;")
    public static class105 field2737 = class43.method374("Bitte starten Sie eine Mitgliedschaft", 0);

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "Lrc;")
    public static class105 field2744 = class43.method374("backbase2", 0);

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "Lrc;")
    public static class105 field2739 = class43.method374("Freund hinzuf-Ugen", 0);

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Lrc;")
    private static class105 field2740 = class43.method374(" is already on your friend list", 0);

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Z")
    public static boolean field2738 = false;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "Lrc;")
    public static class105 field2741 = field2736;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static volatile int field2747 = 0;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "Lrc;")
    public static class105 field2745 = field2740;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "Lbd;")
    public static class11 field2743;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "Lpb;")
    public static class92 field2742;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "Lpb;")
    public static class92 field2746;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 36)
    public static final void method951(int arg0, Component arg1) {
        Method var2 = class33.field781;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class76.field1706);
        arg1.addFocusListener(class76.field1706);
        if (arg0 != 20) {
            field2729 = null;
        }
        field2725++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lte;I)Z", line = 59)
    public static final boolean method952(class119 arg0, int arg1) {
        field2724++;
        if (arg0.field2806 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field2806.length; var2++) {
            int var4 = class121.method975(var2, (byte) -16, arg0);
            int var5 = arg0.field2813[var2];
            if (arg0.field2806[var2] == 2) {
                if (var4 >= var5) {
                    return false;
                }
            } else if (arg0.field2806[var2] == 3) {
                if (var5 >= var4) {
                    return false;
                }
            } else if (arg0.field2806[var2] == 4) {
                if (var4 == var5) {
                    return false;
                }
            } else if (var4 != var5) {
                return false;
            }
        }
        int var3 = 98 % ((-arg1 - 60) / 56);
        return true;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 115)
    public static void method953(int arg0) {
        field2736 = null;
        field2746 = null;
        if (arg0 >= -124) {
            field2735 = 51;
        }
        field2734 = null;
        field2739 = null;
        field2741 = null;
        field2730 = null;
        field2743 = null;
        field2731 = null;
        field2733 = null;
        field2732 = null;
        field2744 = null;
        field2745 = null;
        field2737 = null;
        field2729 = null;
        field2742 = null;
        field2740 = null;
    }
}
