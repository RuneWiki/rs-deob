import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class11 {

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "[I")
    public static int[] field211 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field215 = 50;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "[I")
    public static int[] field213 = new int[field215];

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field220 = 0;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "[I")
    public static int[] field214 = new int[field215];

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "[I")
    public static int[] field225 = new int[field215];

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Lcc;")
    private static class209 field223 = class95.method669(97, "Choose Option");

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Lcc;")
    public static class209 field212 = field223;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "[I")
    public static int[] field209 = new int[field215];

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lcc;")
    public static class209 field219 = class95.method669(96, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "[Lcc;")
    public static class209[] field216 = new class209[field215];

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "[I")
    public static int[] field218 = new int[field215];

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "[I")
    public static int[] field210 = new int[field215];

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "[I")
    public static int[] field226 = new int[field215];

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "F")
    public static float field224;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public int field208;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Lcc;")
    public class209 field221;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "Lsj;")
    public static class49 field227;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([BB)Lve;")
    public static final class188 method92(byte[] arg0, byte arg1) {
        field217++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 < 11) {
            field225 = null;
        }
        class77 var2 = new class77(arg0, class182.field3289, class271.field4815, class110.field2226, class185.field3332, class202.field3638);
        class63.method468(114);
        return var2;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method93(byte arg0) {
        field210 = null;
        field211 = null;
        field227 = null;
        field219 = null;
        if (arg0 <= 63) {
            field219 = null;
        }
        field225 = null;
        field213 = null;
        field226 = null;
        field214 = null;
        field223 = null;
        field209 = null;
        field218 = null;
        field212 = null;
        field216 = null;
    }
}
