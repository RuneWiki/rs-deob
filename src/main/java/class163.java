import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public abstract class class163 extends class445 {

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "Lnk;")
    public static class464 field2265 = null;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "Lh;")
    public static class434 field2266 = new class434(11, -1);

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "Lgd;")
    public static class206 field2268 = new class206("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "Lwm;")
    public static class364 field2269;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)V", line = 10)
    public static final void method954(byte arg0, int arg1) {
        field2267++;
        int var2 = -82 % ((arg0 + 4) / 58);
        class106 var3 = class250.method1400(3, 7, arg1);
        var3.method659(-82);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V", line = 27)
    public static void method955(int arg0) {
        field2269 = null;
        if (arg0 != 3) {
            method954((byte) 89, -116);
        }
        field2266 = null;
        field2265 = null;
        field2268 = null;
    }
}
