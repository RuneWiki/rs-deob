import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class87 {

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "Laq;")
    public static class494 field1292 = new class494(50);

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1295 = null;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "Lin;")
    public static class380 field1293 = new class380(80, 3);

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "Z")
    public static boolean field1297 = true;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "Lhk;")
    public static class153 field1298 = new class153(12, 0, 1, 0);

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
    public static int field1299 = 0;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "Lom;")
    public static class390 field1296;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
    public static void method768(byte arg0) {
        field1296 = null;
        if (arg0 < 5) {
            field1293 = null;
        }
        field1298 = null;
        field1295 = null;
        field1292 = null;
        field1293 = null;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IZ)V")
    public static final void method769(int arg0, boolean arg1) {
        if (!arg1) {
            field1290++;
            class371 var2 = class490.method2867((byte) -84, 4, (long) arg0);
            var2.method2215(4);
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(III)Lmb;")
    public static final class427 method770(int arg0, int arg1, int arg2) {
        class172 var3 = class514.field7096[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2591;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)I")
    public static final int method771(int arg0) {
        field1291++;
        return ~class388.field5420 == arg0 ? class65.field982 : 0;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIIB)V")
    public static final void method772(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 <= 39) {
            field1293 = null;
        }
        field1294++;
        class371 var5 = class490.method2867((byte) -56, 19, (long) arg0 | (long) arg2 << 32);
        var5.method2212(-68);
        var5.field5233 = arg3;
        var5.field5225 = arg1;
    }
}
