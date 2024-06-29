import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class54 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lae;")
    public static class6 field1187 = class64.method474(114, "");

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field1199 = 0;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "J")
    public static long field1190 = 0L;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field1198 = 0;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Lae;")
    public static class6 field1200 = class64.method474(109, " x ");

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field1201 = 0;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lae;")
    private static class6 field1193 = class64.method474(103, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Lae;")
    public static class6 field1191 = field1193;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "Lae;")
    private static class6 field1205 = class64.method474(107, "wishes to trade with you)3");

    @OriginalMember(owner = "client!id", name = "l", descriptor = "[[I")
    public static int[][] field1197 = new int[5][5000];

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Lae;")
    public static class6 field1203 = class64.method474(112, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field1206 = 50;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field1188 = 0;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Lae;")
    public static class6 field1202 = class64.method474(115, "backbase2");

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Lae;")
    public static class6 field1189 = field1205;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Lva;")
    public static class128 field1196;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 9)
    public static void method418(int arg0) {
        field1196 = null;
        field1200 = null;
        field1203 = null;
        field1193 = null;
        field1205 = null;
        field1191 = null;
        field1202 = null;
        field1189 = null;
        if (arg0 == 0) {
            field1197 = null;
            field1187 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)Lae;", line = 33)
    public static final class6 method419(int arg0, byte arg1) {
        field1186++;
        class6 var2 = new class6();
        var2.field93 = 0;
        var2.field114 = new byte[arg0];
        if (arg1 != -105) {
            field1206 = 31;
        }
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V", line = 76)
    public static final void method420(int arg0) {
        int var1 = -1;
        if (arg0 != 0) {
            method420(89);
        }
        while (class47.field1065 > var1) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class4.field47[var1];
            }
            class66 var3 = class20.field387[var2];
            if (var3 != null) {
                class32.method293((byte) 116, var3, 1);
            }
            var1++;
        }
        field1194++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)I", line = 119)
    public static final int method421(int arg0, int arg1, int arg2) {
        field1192++;
        long var3 = (long) ((arg0 << 16) + arg1);
        if (class129.field3115 != null && class129.field3115.field1501 == var3) {
            if (arg2 != -20500) {
                field1196 = null;
            }
            return class73.field1669.field1821 * 99 / (class73.field1669.field1858.length - class129.field3115.field804) + 1;
        } else {
            return 0;
        }
    }
}
