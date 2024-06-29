import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class52 {

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field1192 = 0;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field1189 = 0;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field1187 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Lc;")
    public static class18 field1188 = new class18(200);

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Lja;")
    public static class62 field1193 = class30.method243(43, "(U");

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Lja;")
    public static class62 field1197 = class30.method243(43, "leuchten1:");

    @OriginalMember(owner = "client!h", name = "i", descriptor = "Lja;")
    private static class62 field1194 = class30.method243(43, "red:");

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Lja;")
    public static class62 field1199 = field1194;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Lja;")
    public static class62 field1195 = class30.method243(43, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!h", name = "o", descriptor = "[Lqd;")
    public static class115[] field1200 = new class115[2048];

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field1196 = 0;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Lja;")
    public static class62 field1198 = class30.method243(43, "(Udns");

    @OriginalMember(owner = "client!h", name = "q", descriptor = "Lja;")
    public static class62 field1202 = field1194;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lj;IIBII)V")
    public static final void method358(class65 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1190++;
        class63 var6 = new class63();
        var6.field1545 = arg0.field1606;
        var6.field1543 = arg0.field1639;
        var6.field1575 = arg0.field1633;
        int var7 = arg0.field1612;
        var6.field1551 = arg5 * 128;
        if (arg3 != -94) {
            return;
        }
        var6.field1567 = arg2;
        var6.field1569 = arg0.field1585;
        var6.field1554 = arg0.field1637 * 128;
        var6.field1544 = arg4 * 128;
        int var8 = arg0.field1615;
        if (arg1 == 1 || arg1 == 3) {
            var7 = arg0.field1615;
            var8 = arg0.field1612;
        }
        var6.field1565 = (arg5 + var8) * 128;
        var6.field1562 = (arg4 + var7) * 128;
        if (arg0.field1594 != null) {
            var6.field1557 = arg0;
            var6.method481(-96);
        }
        class133.field3035.method847(var6, (byte) 119);
        if (var6.field1575 != null) {
            var6.field1550 = var6.field1545 + (int) (Math.random() * (double) (var6.field1569 - var6.field1545));
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static void method359(byte arg0) {
        field1200 = null;
        field1202 = null;
        field1197 = null;
        field1198 = null;
        field1188 = null;
        if (arg0 < 49) {
            method358(null, -107, -121, (byte) -93, 1, -99);
        }
        field1194 = null;
        field1193 = null;
        field1195 = null;
        field1199 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IBII)I")
    public static final int method360(int arg0, byte arg1, int arg2, int arg3) {
        field1186++;
        int var4 = 256 - arg2;
        int var5 = 111 / ((arg1 - 15) / 44);
        return ((arg0 & 0xFF00FF) * arg2 + (arg3 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 + (arg3 & 0xFF00) * var4 & 0xFF0000) >> 8;
    }
}
