import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class5 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lhh;")
    public static class163 field92 = class137.method1065("Fps:", 17);

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "[I")
    public static int[] field95 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Lhh;")
    private static class163 field94 = class137.method1065("Please wait )2 attempting to reestablish)3", 17);

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lhh;")
    public static class163 field96 = field94;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field101 = 0;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Ljava/awt/Font;")
    public static Font field97;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method38(int arg0, int arg1) {
        if (arg1 != 27379) {
            return null;
        }
        field93++;
        if (arg0 == 100 && class97.field1824 > 0) {
            byte[] var2 = class174.field3168[--class97.field1824];
            class174.field3168[class97.field1824] = null;
            return var2;
        } else if (arg0 == 5000 && class219.field3987 > 0) {
            byte[] var3 = class127.field2466[--class219.field3987];
            class127.field2466[class219.field3987] = null;
            return var3;
        } else if (arg0 == 30000 && class48.field800 > 0) {
            byte[] var4 = class71.field1351[--class48.field800];
            class71.field1351[class48.field800] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Lk;")
    public static final class93 method39(int arg0, int arg1, int arg2) {
        class144 var3 = class259.field4542[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2742;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZII)I")
    public static final int method40(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method38(112, -64);
        }
        field100++;
        class197 var3 = (class197) class76.field1427.method1743((long) arg1, false);
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var3.field3549.length) {
            return var3.field3549[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method41(int arg0) {
        if (arg0 != 32252) {
            method40(true, 4, -75);
        }
        field95 = null;
        field94 = null;
        field92 = null;
        field97 = null;
        field96 = null;
    }
}
