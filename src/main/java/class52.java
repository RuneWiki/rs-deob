import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class52 {

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field715 = 0;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field719 = 2;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field724 = 0;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field723 = 0;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "Ljg;")
    public static class168 field717;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZZ)V")
    public static final void method379(boolean arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field722++;
        if (class97.field1495 != arg0) {
            class97.field1495 = arg0;
            class51.method375(-10304);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
    public static void method380(byte arg0) {
        field717 = null;
        if (arg0 != 56) {
            method383(true, (String) null);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZC)C")
    public static final char method381(boolean arg0, char arg1) {
        field713++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else if (arg1 == 'œ') {
            return 'e';
        } else {
            return (char) (arg0 ? '\u0011' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
    public static final void method382(boolean arg0) {
        field718++;
        if (class236.field3776 || class184.field2892 == 2) {
            return;
        }
        if (arg0) {
            field724 = 109;
        }
        try {
            class113.method730(class215.field3506, 188, "tbrefresh");
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method383(boolean arg0, String arg1) {
        field716++;
        return arg0 ? false : class108.method704(arg1, true, 10, !arg0);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BII)I")
    public static final int method384(byte arg0, int arg1, int arg2) {
        field720++;
        if (arg0 != 75) {
            return -55;
        }
        class33 var3 = (class33) class82.field1233.method665((byte) 94, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var3.field428.length) {
            return var3.field428[arg1];
        } else {
            return 0;
        }
    }
}
