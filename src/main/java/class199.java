import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class199 extends class153 {

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3658 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "Lli;")
    public static class185 field3661 = class245.method1649("(U4", -4);

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "Lli;")
    public static class185 field3663 = class245.method1649("rouge:", -116);

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public int field3654;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "Lli;")
    public class185 field3656;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "Lli;")
    public class185 field3659;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "Lhi;")
    public static class250 field3650;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "[[Z")
    public static boolean[][] field3660;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "[[[B")
    public static byte[][][] field3662;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    public static final void method1425(byte arg0) {
        ++field3655;
        class136.field2557 = new class82[class142.field2725.method1699((byte) 16)][];
        class27.field461 = new boolean[class142.field2725.method1699((byte) 16)];
        if (arg0 != 83) {
            method1426(23, (class250) null, -120, -61);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILhi;II)[Ldd;")
    public static final class211[] method1426(int arg0, class250 arg1, int arg2, int arg3) {
        if (arg3 != -1) {
            return null;
        } else {
            ++field3652;
            return !class224.method1551(arg2, arg0, arg1, (byte) -94) ? null : class182.method1287(false);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLli;)V")
    public static final void method1427(boolean arg0, class185 arg1) {
        ++field3649;
        class25.field420 = arg1;
        if (class124.field2238.field3022 != null) {
            try {
                class185 var2 = class2.field52.method1300(class124.field2238.field3022, 26090);
                class185 var3 = class185.field3444.method1300(class124.field2238.field3022, 26090);
                class185 var4 = class87.method567(-11039, new class185[] { var2, class79.field1382, arg1, class220.field4010, var3 });
                class185 var5;
                if (~arg1.method1311((byte) 49) == -1) {
                    var5 = class87.method567(-11039, new class185[] { var4, class78.field1357 });
                } else {
                    var5 = class87.method567(-11039, new class185[] { var4, class5.field131, class15.method117(94608000000L + class244.method1644((byte) -112), 67), class7.field163, class235.method1600((byte) 120, 94608000L) });
                }
                class87.method567(-11039, new class185[] { class179.field3301, var5, class125.field2247 }).method1344(-15737, class124.field2238.field3022);
                if (arg0) {
                    method1425((byte) -49);
                }
            } catch (Throwable var6) {
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V")
    public static void method1428(byte arg0) {
        if (arg0 != 20) {
            field3651 = -3;
        }
        field3662 = null;
        field3663 = null;
        field3658 = null;
        field3660 = null;
        field3650 = null;
        field3661 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)Llk;")
    public final class237 method1429(boolean arg0) {
        ++field3653;
        return !arg0 ? null : class138.field2585[super.field2886];
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([[II)V")
    public static final void method1430(int[][] arg0, int arg1) {
        if (arg1 == -1) {
            ++field3657;
            class145.field2757 = arg0;
        }
    }
}
