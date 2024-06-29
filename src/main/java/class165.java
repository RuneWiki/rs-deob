import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class165 {

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "J")
    public long field2673 = 0L;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Ltl;")
    public static class59 field2687 = class85.method639("Lade Wordpack )2 ", 9588);

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field2678 = 0;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public int field2669;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public int field2670;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public int field2671;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public int field2672;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public int field2674;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public int field2675;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public int field2676;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public int field2677;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public int field2681;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public int field2682;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public int field2685;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Lfg;")
    public class176 field2688;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Z")
    public static boolean field2679;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I", line = 9)
    public static final int method1164(int arg0, int arg1) {
        if (arg1 != 2047) {
            method1165(-29, 37, 113, -37, -101);
        }
        field2683++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)V", line = 26)
    public static final void method1165(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2684++;
        if (arg4 != 0) {
            method1164(-112, -68);
        }
        if (arg2 >= class69.field1061 && class153.field2504 >= arg2) {
            int var5 = class262.method1808(arg1, class28.field369, 0, class62.field957);
            int var6 = class262.method1808(arg0, class28.field369, 0, class62.field957);
            class266.method1839(arg3, true, arg2, var5, var6);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 44)
    public static void method1166(byte arg0) {
        if (arg0 == 33) {
            field2687 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 89)
    public static final void method1167(int arg0) {
        for (int var1 = arg0; var1 < class29.field385; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class243.field4060[var1];
            }
            class102 var3 = class211.field3438[var2];
            if (var3 != null) {
                class150.method1083((byte) 116, var3.method776(true), var3);
            }
        }
        field2686++;
    }
}
