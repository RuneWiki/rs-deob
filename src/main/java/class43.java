import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class43 extends class107 {

    @OriginalMember(owner = "client!ha", name = "nb", descriptor = "I")
    public int field989 = 0;

    @OriginalMember(owner = "client!ha", name = "jb", descriptor = "I")
    public static int field985 = 0;

    @OriginalMember(owner = "client!ha", name = "lb", descriptor = "[[I")
    public static int[][] field987 = new int[104][104];

    @OriginalMember(owner = "client!ha", name = "eb", descriptor = "Lrc;")
    public static class105 field980 = method374("RuneScape wurde aktualisiert(Q", 0);

    @OriginalMember(owner = "client!ha", name = "mb", descriptor = "[I")
    public static int[] field988 = new int[4000];

    @OriginalMember(owner = "client!ha", name = "ob", descriptor = "Lrc;")
    public static class105 field990 = method374("nicht hergestellt werden)3", 0);

    @OriginalMember(owner = "client!ha", name = "pb", descriptor = "Lrc;")
    public static class105 field991 = method374("@yel@*V", 0);

    @OriginalMember(owner = "client!ha", name = "db", descriptor = "Lmb;")
    public static class74 field979 = new class74(32);

    @OriginalMember(owner = "client!ha", name = "wb", descriptor = "Lrc;")
    public static class105 field998 = method374("@cr2@", 0);

    @OriginalMember(owner = "client!ha", name = "yb", descriptor = "Lrc;")
    private static class105 field1000 = method374("Use", 0);

    @OriginalMember(owner = "client!ha", name = "qb", descriptor = "Lrc;")
    public static class105 field992 = method374("", 0);

    @OriginalMember(owner = "client!ha", name = "rb", descriptor = "I")
    public static int field993 = 0;

    @OriginalMember(owner = "client!ha", name = "ub", descriptor = "Lrc;")
    private static class105 field996 = method374("Cancel", 0);

    @OriginalMember(owner = "client!ha", name = "Ab", descriptor = "Lrc;")
    public static class105 field1002 = field992;

    @OriginalMember(owner = "client!ha", name = "vb", descriptor = "Lrc;")
    public static class105 field997 = field992;

    @OriginalMember(owner = "client!ha", name = "xb", descriptor = "Lrc;")
    public static class105 field999 = field992;

    @OriginalMember(owner = "client!ha", name = "Cb", descriptor = "Lrc;")
    public static class105 field1004 = field992;

    @OriginalMember(owner = "client!ha", name = "Db", descriptor = "I")
    public static int field1005 = -1;

    @OriginalMember(owner = "client!ha", name = "Fb", descriptor = "Lrc;")
    public static class105 field1007 = field1000;

    @OriginalMember(owner = "client!ha", name = "zb", descriptor = "Lrc;")
    public static class105 field1001 = method374("System)2Update in: ", 0);

    @OriginalMember(owner = "client!ha", name = "Eb", descriptor = "Lrc;")
    public static class105 field1006 = field996;

    @OriginalMember(owner = "client!ha", name = "Gb", descriptor = "Lrc;")
    public static class105 field1008 = field992;

    @OriginalMember(owner = "client!ha", name = "Bb", descriptor = "Lrc;")
    public static class105 field1003 = field992;

    @OriginalMember(owner = "client!ha", name = "Z", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!ha", name = "bb", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!ha", name = "cb", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!ha", name = "gb", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ha", name = "hb", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!ha", name = "ib", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!ha", name = "kb", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!ha", name = "tb", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!ha", name = "sb", descriptor = "Lbd;")
    public static class11 field994;

    @OriginalMember(owner = "client!ha", name = "ab", descriptor = "Lpb;")
    public static class92 field976;

    @OriginalMember(owner = "client!ha", name = "fb", descriptor = "[I")
    public static int[] field981;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLb;)V", line = 13)
    public final void method373(byte arg0, class7 arg1) {
        while (true) {
            int var3 = arg1.method96(27023);
            if (var3 == 0) {
                field983++;
                if (arg0 != -81) {
                    this.method373((byte) 90, null);
                    return;
                }
                return;
            }
            this.method375(arg1, var3, 62);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;I)Lrc;", line = 36)
    public static final class105 method374(String arg0, int arg1) {
        field984++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class105 var4 = new class105();
        var4.field2417 = new byte[var3];
        int var5 = arg1;
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field2417[var4.field2383++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field2417[var4.field2383++] = (byte) var6;
            }
        }
        var4.method839(-94);
        return var4.method854(-127);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lb;II)V", line = 78)
    private final void method375(class7 arg0, int arg1, int arg2) {
        field978++;
        if (arg1 == 5) {
            this.field989 = arg0.method101(2);
        }
        if (arg2 < 52) {
            method374(null, -57);
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)V", line = 106)
    public static void method376(byte arg0) {
        field991 = null;
        field1000 = null;
        field1001 = null;
        field997 = null;
        field1004 = null;
        field987 = null;
        field981 = null;
        field996 = null;
        field1003 = null;
        field990 = null;
        field1007 = null;
        field979 = null;
        if (arg0 != -50) {
            method374(null, -65);
        }
        field1002 = null;
        field999 = null;
        field980 = null;
        field1008 = null;
        field994 = null;
        field992 = null;
        field976 = null;
        field998 = null;
        field1006 = null;
        field988 = null;
    }
}
