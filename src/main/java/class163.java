import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class163 extends class58 {

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    public static int field2862 = 0;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "Lcd;")
    public static class64 field2857 = class44.method335((byte) 71, "<img=1>");

    @OriginalMember(owner = "client!hg", name = "W", descriptor = "I")
    public static int field2865 = 255;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2858 = Calendar.getInstance();

    @OriginalMember(owner = "client!hg", name = "Z", descriptor = "Lcd;")
    public static class64 field2868 = class44.method335((byte) 71, "floorshadows");

    @OriginalMember(owner = "client!hg", name = "bb", descriptor = "Lcd;")
    public static class64 field2870 = class44.method335((byte) 71, "www)2wtrc");

    @OriginalMember(owner = "client!hg", name = "db", descriptor = "Z")
    public static boolean field2872 = false;

    @OriginalMember(owner = "client!hg", name = "ab", descriptor = "I")
    public static int field2869 = 0;

    @OriginalMember(owner = "client!hg", name = "cb", descriptor = "J")
    public static long field2871 = 0L;

    @OriginalMember(owner = "client!hg", name = "fb", descriptor = "Lcd;")
    public static class64 field2874 = class44.method335((byte) 71, "<)4col>");

    @OriginalMember(owner = "client!hg", name = "eb", descriptor = "Lhk;")
    public static class292 field2873 = new class292();

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "B")
    public byte field2859;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public int field2863;

    @OriginalMember(owner = "client!hg", name = "Y", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "Lkh;")
    public class13 field2866;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "Lli;")
    public static class209 field2864;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)I", line = 6)
    public final int method442(boolean arg0) {
        if (arg0) {
            return -123;
        } else {
            field2861++;
            return this.field2866 == null ? 0 : this.field2866.field281 * 100 / (this.field2866.field254.length - this.field2859);
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)V", line = 35)
    public static void method1167(boolean arg0) {
        field2868 = null;
        if (!arg0) {
            return;
        }
        field2870 = null;
        field2857 = null;
        field2874 = null;
        field2864 = null;
        field2858 = null;
        field2873 = null;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(B)Lub;", line = 54)
    public static final class20 method1168(byte arg0) {
        if (arg0 >= -101) {
            field2870 = (class64) null;
        }
        field2860++;
        try {
            return (class20) Class.forName("jh").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V", line = 81)
    public static final void method1169(int arg0) {
        field2856++;
        class149.field2616.method1187(0);
        class12.field231.method1187(0);
        class168.field2926.method1187(0);
        if (arg0 != 100) {
            method1170(-82);
        }
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V", line = 94)
    public static final void method1170(int arg0) {
        field2855++;
        if (arg0 != 3301) {
            method1170(-77);
        }
        class76.field1432.method1198(false);
        class55.field924.method1198(false);
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)[B", line = 106)
    public final byte[] method451(int arg0) {
        if (arg0 != 28985) {
            field2871 = -8L;
        }
        field2867++;
        if (this.field961 || (this.field2866.field254.length - this.field2859) > this.field2866.field281) {
            throw new RuntimeException();
        }
        return this.field2866.field254;
    }
}
