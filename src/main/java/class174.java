import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class174 implements Runnable {

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "[Lmca;")
    public volatile class28[] field2132 = new class28[2];

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "Z")
    public volatile boolean field2130 = false;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "Z")
    public volatile boolean field2129 = false;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "Lfea;")
    public static class123 field2133;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "Lig;")
    public static class206 field2136;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "Ltq;")
    public class545 field2131;

    static {
        new class474("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field2133 = new class123();
        field2136 = new class206(75, -1);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lkr;I)I", line = 8)
    public static final int method995(class645 arg0, int arg1) {
        field2128++;
        int var2 = arg0.method3671(2, (byte) 17);
        int var3 = 68 % ((arg1 - 11) / 32);
        int var4;
        if (var2 == 0) {
            var4 = 0;
        } else if (var2 == 1) {
            var4 = arg0.method3671(5, (byte) 17);
        } else if (var2 == 2) {
            var4 = arg0.method3671(8, (byte) 17);
        } else {
            var4 = arg0.method3671(11, (byte) 17);
        }
        return var4;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)V", line = 34)
    public static void method996(byte arg0) {
        field2136 = null;
        field2133 = null;
        if (arg0 != -21) {
            field2136 = null;
        }
    }

    @OriginalMember(owner = "client!tw", name = "run", descriptor = "()V", line = 45)
    public final void run() {
        field2135++;
        this.field2129 = true;
        try {
            while (!this.field2130) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class28 var2 = this.field2132[var1];
                    if (var2 != null) {
                        var2.method161(114);
                    }
                }
                class646.method3696(1, 10L);
                class119.method743(this.field2131, null, -51);
            }
        } catch (Exception var9) {
            class630.method3607(7, var9, null);
        } finally {
            Object var6 = null;
            this.field2129 = false;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lqf;B)V", line = 84)
    public static final void method997(class593 arg0, byte arg1) {
        field2134++;
        if (arg1 != 6) {
            field2133 = null;
        }
        if (arg0.field8507 == 5 && arg0.field8601 != -1) {
            class100.method619(arg0, (byte) -110, class413.field6264);
        }
    }
}
