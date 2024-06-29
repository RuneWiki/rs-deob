import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class164 extends class197 {

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
    public static volatile int field2769 = 0;

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "Loh;")
    public static class258 field2772 = class153.method1046("<img=1>", 119);

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "I")
    public static int field2770 = 0;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "Loh;")
    public static class258 field2767 = class153.method1046("Schlie-8en", 108);

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "Loh;")
    public static class258 field2771 = class153.method1046("showVideoAd", 92);

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "Loh;")
    public static class258 field2766 = class153.method1046("Speicher wird zugewiesen)3", 123);

    @OriginalMember(owner = "client!vb", name = "X", descriptor = "J")
    public static long field2776 = 0L;

    @OriginalMember(owner = "client!vb", name = "V", descriptor = "I")
    public static int field2774 = 0;

    @OriginalMember(owner = "client!vb", name = "Z", descriptor = "Loh;")
    public static class258 field2778 = class153.method1046("Weiter", 109);

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!vb", name = "W", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!vb", name = "Y", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!vb", name = "ab", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!vb", name = "bb", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILoh;I)V", line = 20)
    public static final void method1095(int arg0, class258 arg1, int arg2) {
        field2765++;
        class286 var3 = class48.method389(arg0, arg2, 10738);
        var3.method2017(arg2 - 86);
        var3.field4928 = arg1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(SB)Z", line = 41)
    public static final boolean method1096(short arg0, byte arg1) {
        field2779++;
        if (arg1 <= 21) {
            return false;
        } else if (arg0 == 30 || arg0 == 25 || arg0 == 49 || arg0 == 8 || arg0 == 44 || arg0 == 31 || arg0 == 7 || arg0 == 21) {
            return true;
        } else if (arg0 == 9 || arg0 == 15 || arg0 == 1006 || arg0 == 1005) {
            return true;
        } else if (arg0 == 11 || arg0 == 29 || arg0 == 57 || arg0 == 12 || arg0 == 50) {
            return true;
        } else {
            return arg0 == 40 || arg0 == 34 || arg0 == 4 || arg0 == 36 || arg0 == 23 || arg0 == 22;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[I", line = 69)
    public final int[] method96(int arg0, int arg1) {
        if (arg0 != -16221) {
            field2770 = 59;
        }
        field2775++;
        return class166.field2822;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)Z", line = 80)
    public static final boolean method1097(int arg0, int arg1) {
        field2777++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class227.field3910[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        int var3 = 91 / ((arg1 + 23) / 38);
        return var2 == 1005;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 107)
    public class164() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V", line = 126)
    public static void method1098(int arg0) {
        field2778 = null;
        field2767 = null;
        if (arg0 <= 49) {
            method1098(9);
        }
        field2766 = null;
        field2771 = null;
        field2772 = null;
    }
}
