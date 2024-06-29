import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class36 {

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Lob;")
    public static class141 field714 = class175.method1195(40, ":duelfriend:");

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Lob;")
    public static class141 field724 = class175.method1195(40, ":trade:");

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Lob;")
    public static class141 field720 = class175.method1195(40, "::qa_op_test");

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Lob;")
    public static class141 field721 = class175.method1195(40, "Fertigkeit)2");

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Lob;")
    public static class141 field717 = class175.method1195(40, ":assist:");

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Lob;")
    public static class141 field713 = class175.method1195(40, "leuchten2:");

    @OriginalMember(owner = "client!de", name = "r", descriptor = "[I")
    public static int[] field728 = new int[25];

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Lob;")
    private static class141 field715 = class175.method1195(40, "Please try again)3");

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Lob;")
    public static class141 field726 = class175.method1195(40, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Lob;")
    public static class141 field718 = field715;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public int field719;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "J")
    public long field727;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Laa;")
    public class2 field722;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Laa;")
    public class2 field725;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "Laa;")
    public class2 field729;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
    public static final void method247(int arg0, int arg1) {
        if (arg0 != -3) {
            field718 = null;
        }
        field712++;
        if (arg1 == -1 || !class69.field1363[arg1]) {
            return;
        }
        class168.field3234.method1072(arg0 + 385, arg1);
        if (class224.field4232[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class224.field4232[arg1].length; var3++) {
            if (class224.field4232[arg1][var3] != null) {
                if (class224.field4232[arg1][var3].field3392 == 2) {
                    var2 = false;
                } else {
                    class224.field4232[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class224.field4232[arg1] = null;
        }
        class69.field1363[arg1] = false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method248(int arg0) {
        field728 = null;
        field715 = null;
        field721 = null;
        field714 = null;
        field717 = null;
        field726 = null;
        if (arg0 != -23) {
            method248(-22);
        }
        field713 = null;
        field720 = null;
        field718 = null;
        field724 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([[II)V")
    public static final void method249(int[][] arg0, int arg1) {
        field730++;
        int var2 = -46 % ((arg1 - 46) / 49);
        class41.field805 = arg0;
    }
}
