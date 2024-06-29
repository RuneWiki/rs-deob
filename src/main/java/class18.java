import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class18 {

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "Lok;")
    private static class41 field226 = class137.method956("Connecting to update server", 45);

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "[I")
    public static int[] field227 = new int[50];

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Lok;")
    public static class41 field230 = field226;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "Lok;")
    public static class41 field229 = class137.method956("gelb:", 45);

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Lak;")
    public static class20 field228 = new class20(20);

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Lok;")
    private static class41 field231 = class137.method956("Use", 45);

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field234 = 0;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field236 = 0;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Lok;")
    public static class41 field237 = field231;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "Lok;")
    public static class41 field240 = class137.method956(":clanreq:", 45);

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Lok;")
    public static class41 field233 = class137.method956("Schlie-8en", 45);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Ltb;")
    public static class199 field238;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Lmh;")
    public static class65 field232;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILbc;)V", line = 29)
    public static final void method91(int arg0, class302 arg1) {
        field225++;
        if (class228.field3641 == arg1.field5051) {
            class195.field3151[arg1.field4901] = true;
        }
        if (arg0 != 28515) {
            field234 = 16;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 53)
    public static void method92(byte arg0) {
        field227 = null;
        field240 = null;
        field228 = null;
        field232 = null;
        field230 = null;
        field229 = null;
        field226 = null;
        field231 = null;
        if (arg0 < -105) {
            field238 = null;
            field233 = null;
            field237 = null;
        }
    }
}
