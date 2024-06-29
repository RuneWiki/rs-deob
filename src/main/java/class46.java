import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class46 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[I")
    public static int[] field936 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field937 = 0;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lvd;")
    private static class222 field940 = class212.method1357("Error connecting to server)3", 10731);

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Lvd;")
    public static class222 field939 = class212.method1357("p11_full", 10731);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Lvd;")
    public static class222 field935 = field940;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Lvd;")
    private static class222 field948 = class212.method1357("Loading wordpack )2 ", 10731);

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lvd;")
    public static class222 field945 = field948;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Lvd;")
    public static class222 field947 = class212.method1357("weiss:", 10731);

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Lph;")
    public static class166 field946 = new class166(50);

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "[Lca;")
    public static class23[] field950 = new class23[100];

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Lvd;")
    public static class222 field949 = class212.method1357("Diese Betatest)2Welt ist nur f-Ur eingeladene", 10731);

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "Lvd;")
    public static class222 field951 = class212.method1357("(U", 10731);

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static final void method338(int arg0) {
        field942++;
        if (arg0 != 26054) {
            field948 = null;
        }
        for (class56 var1 = (class56) class80.field1533.method236(0); var1 != null; var1 = (class56) class80.field1533.method237(true)) {
            if (var1.field1047 > 0) {
                var1.field1047--;
            }
            if (var1.field1047 != 0) {
                if (var1.field1061 > 0) {
                    var1.field1061--;
                }
                if (var1.field1061 == 0 && var1.field1058 >= 1 && var1.field1057 >= 1 && var1.field1058 <= 102 && var1.field1057 <= 102 && (var1.field1042 < 0 || class6.method54(var1.field1044, arg0 - 25942, var1.field1042))) {
                    class217.method1383(var1.field1042, var1.field1056, var1.field1055, var1.field1043, var1.field1057, 3605, var1.field1058, var1.field1044);
                    var1.field1061 = -1;
                    if (var1.field1046 == var1.field1042 && var1.field1046 == -1) {
                        var1.method826(-22101);
                    } else if (var1.field1046 == var1.field1042 && var1.field1056 == var1.field1048 && var1.field1052 == var1.field1044) {
                        var1.method826(-22101);
                    }
                }
            } else if (var1.field1046 < 0 || class6.method54(var1.field1052, arg0 ^ 0x65B6, var1.field1046)) {
                class217.method1383(var1.field1046, var1.field1048, var1.field1055, var1.field1043, var1.field1057, 3605, var1.field1058, var1.field1052);
                var1.method826(-22101);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
    public static final void method339(int arg0, int arg1) {
        if (arg0 != 1536) {
            field950 = null;
        }
        field943++;
        if (class92.field1730 == null || class92.field1730.length < arg1) {
            class92.field1730 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static void method340(int arg0) {
        field936 = null;
        field935 = null;
        if (arg0 != 15149) {
            method338(-53);
        }
        field939 = null;
        field951 = null;
        field948 = null;
        field947 = null;
        field946 = null;
        field940 = null;
        field950 = null;
        field949 = null;
        field945 = null;
    }
}
