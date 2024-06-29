import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lod;")
    public static class101 field78 = class46.method335(97, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Lod;")
    public static class101 field85 = class46.method335(92, ": ");

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Lod;")
    private static class101 field88 = class46.method335(86, "Connection timed out)3");

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Lod;")
    public static class101 field81 = class46.method335(70, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "[I")
    public static int[] field92 = new int[1000];

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field82 = 0;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Lod;")
    public static class101 field89 = class46.method335(114, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Lod;")
    public static class101 field91 = class46.method335(-72, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Lod;")
    public static class101 field86 = field88;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "[I")
    public static int[] field87 = new int[128];

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Lqe;")
    public static class116 field79;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "Lhc;")
    public static class52 field95;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static final void method29(int arg0) {
        field90++;
        class94.field2014.method135(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIII)V")
    public static final void method30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = (arg2 - 32) * arg2 / arg5;
        class44.field1057[0].method884(arg3, arg1);
        if (var6 < 8) {
            var6 = 8;
        }
        class44.field1057[1].method884(arg3, arg1 + arg2 - 16);
        int var7 = (arg2 - var6 - 32) * arg0 / (arg5 - arg2);
        if (arg4 != 17) {
            return;
        }
        class38.method275(arg3, arg1 + 16, 16, arg2 - 32, class23.field542);
        class38.method275(arg3, var7 + arg1 + 16, 16, var6, class90.field1953);
        field80++;
        class38.method273(arg3, arg1 + var7 + 16, var6, class3.field41);
        class38.method273(arg3 + 1, arg1 - -var7 + 16, var6, class3.field41);
        class38.method280(arg3, arg1 + var7 + 16, 16, class3.field41);
        class38.method280(arg3, arg1 + var7 + 17, 16, class3.field41);
        class38.method273(arg3 + 15, arg1 + 16 - -var7, var6, class17.field357);
        class38.method273(arg3 + 14, arg1 + 17 + var7, var6 - 1, class17.field357);
        class38.method280(arg3, arg1 + var7 + var6 + 15, 16, class17.field357);
        class38.method280(arg3 + 1, arg1 + 14 + var6 + var7, 15, class17.field357);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static void method31(byte arg0) {
        field81 = null;
        if (arg0 != -29) {
            field88 = null;
        }
        field86 = null;
        field87 = null;
        field89 = null;
        field88 = null;
        field78 = null;
        field95 = null;
        field91 = null;
        field85 = null;
        field92 = null;
        field79 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field84++;
        if (class143.method1139(124, arg0) && arg7 > 90) {
            class32.method250(arg5, -12807, class100.field2161[arg0], arg1, arg2, arg4, -1, arg6, arg3);
        }
    }
}
