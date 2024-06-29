import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class37 extends class134 {

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "[Lcc;")
    public static class18[] field1013 = new class18[32768];

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "Lwd;")
    public static class150 field1005 = class2.method9(true, "m");

    @OriginalMember(owner = "client!fa", name = "ib", descriptor = "Lwd;")
    public static class150 field1024 = class2.method9(true, "Verbindung mit");

    @OriginalMember(owner = "client!fa", name = "fb", descriptor = "Lwd;")
    public static class150 field1021 = class2.method9(true, "Chat panel redrawn");

    @OriginalMember(owner = "client!fa", name = "hb", descriptor = "Lwd;")
    private static class150 field1023 = class2.method9(true, "wishes to trade with you)3");

    @OriginalMember(owner = "client!fa", name = "lb", descriptor = "Lwd;")
    public static class150 field1027 = class2.method9(true, "Mitteilung");

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "Lwd;")
    public static class150 field1010 = field1023;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "[Lub;")
    public static class136[] field1006 = new class136[50];

    @OriginalMember(owner = "client!fa", name = "ob", descriptor = "Lwd;")
    public static class150 field1030 = class2.method9(true, "(U3");

    @OriginalMember(owner = "client!fa", name = "rb", descriptor = "Lwd;")
    private static class150 field1033 = class2.method9(true, "Click to switch");

    @OriginalMember(owner = "client!fa", name = "pb", descriptor = "Lwd;")
    public static class150 field1031 = field1033;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "I")
    public int field1014;

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "I")
    public int field1015;

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!fa", name = "bb", descriptor = "I")
    public int field1017;

    @OriginalMember(owner = "client!fa", name = "cb", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!fa", name = "db", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!fa", name = "jb", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!fa", name = "mb", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!fa", name = "nb", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!fa", name = "qb", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "[I")
    public int[] field1011;

    @OriginalMember(owner = "client!fa", name = "eb", descriptor = "[I")
    public int[] field1020;

    @OriginalMember(owner = "client!fa", name = "kb", descriptor = "[I")
    public static int[] field1026;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "[Lwd;")
    public class150[] field1008;

    @OriginalMember(owner = "client!fa", name = "gb", descriptor = "[[[B")
    public static byte[][][] field1022;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(B)V")
    public static final void method275(byte arg0) {
        field1028++;
        if (arg0 != -46) {
            field1033 = null;
        }
        class142.field3424.method431(0);
        class103.field2341.method431(0);
        class46.field1233.method431(0);
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
    public static final void method276(int arg0) {
        class10.field250 = null;
        class111.field2574 = null;
        field1025++;
        if (arg0 != 0) {
            field1005 = null;
        }
        class43.field1173 = null;
        class113.field2638 = null;
        class103.field2337 = null;
        class15.field414 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lkb;Z)V")
    public static final void method277(class71 arg0, boolean arg1) {
        if (arg0.field1790 != null) {
            arg0.field1790.field2798 = 0;
        }
        arg0.field1787 = arg1;
        for (class71 var2 = arg0.method23(); var2 != null; var2 = arg0.method29()) {
            method277(var2, arg1);
        }
        field1018++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
    public static final void method278(int arg0, int arg1) {
        field1032++;
        class130 var2 = (class130) class126.field2920.method534((byte) -110, (long) arg0);
        if (var2 != null) {
            var2.method678((byte) -26);
            int var3 = 127 % ((arg1 - 52) / 35);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
    public static void method279(boolean arg0) {
        field1023 = null;
        field1022 = null;
        field1013 = null;
        field1030 = null;
        if (!arg0) {
            return;
        }
        field1027 = null;
        field1021 = null;
        field1031 = null;
        field1024 = null;
        field1033 = null;
        field1005 = null;
        field1026 = null;
        field1006 = null;
        field1010 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([BIII)Lwd;")
    public static final class150 method280(byte[] arg0, int arg1, int arg2, int arg3) {
        class150 var4 = new class150();
        field1012++;
        var4.field3718 = arg2;
        var4.field3678 = new byte[arg3];
        for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
            if (arg0[var5] != 0) {
                var4.field3678[var4.field3718++] = arg0[var5];
            }
        }
        return var4;
    }
}
