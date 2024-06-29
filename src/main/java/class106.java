import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class106 {

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lrc;")
    private static class105 field2426 = class43.method374("Please wait )2 attempting to reestablish", 0);

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "[I")
    public static int[] field2429 = new int[128];

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Lrc;")
    public static class105 field2427 = class43.method374(" steht bereits auf Ihrer Freunde)2Liste(Q", 0);

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Lrc;")
    public static class105 field2431 = field2426;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lrc;")
    public static class105 field2428 = class43.method374("(U3", 0);

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Lrc;")
    public static class105 field2434 = class43.method374("welle:", 0);

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Lrc;")
    public static class105 field2438 = class43.method374("Weiter", 0);

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Lrc;")
    public static class105 field2435 = class43.method374("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 0);

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Lcc;")
    public static class16 field2436;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "Lmd;")
    public static class76 field2439;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZJ)V", line = 63)
    public static final void method866(boolean arg0, long arg1) {
        field2432++;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        if (arg0) {
            field2435 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lpb;I)V", line = 83)
    public static final void method867(class92 arg0, int arg1) {
        if (arg1 != -19474) {
            method868((byte) -8);
        }
        class22.field530 = arg0;
        field2437++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V", line = 98)
    public static void method868(byte arg0) {
        field2434 = null;
        if (arg0 <= 71) {
            field2438 = null;
        }
        field2431 = null;
        field2438 = null;
        field2435 = null;
        field2426 = null;
        field2429 = null;
        field2439 = null;
        field2427 = null;
        field2436 = null;
        field2428 = null;
    }
}
