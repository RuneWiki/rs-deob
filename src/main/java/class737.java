import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class737 {

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "I")
    public int field10197;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
    public static int field10198;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
    public static int field10199;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
    public static int field10200;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "Ljava/lang/String;")
    public String field10196;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(BIII)I", line = 6)
    public static final int method4102(byte arg0, int arg1, int arg2, int arg3) {
        field10200++;
        if (class433.field6043 == null) {
            return 0;
        }
        int var4 = arg1 >> 9;
        if (arg0 != 19) {
            method4103(-99, null);
        }
        int var5 = arg2 >> 9;
        if (var4 < 0 || var5 < 0 || class277.field4036 - 1 < var4 || class667.field9202 - 1 < var5) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class692.field9623[1][var4][var5] & 0x2) != 0) {
            var6 = arg3 + 1;
        }
        return class433.field6043[var6].method2172(arg1, -1, arg2);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILdc;)Lar;", line = 39)
    public static final class667 method4103(int arg0, class63 arg1) {
        field10198++;
        String var2 = arg1.method479((byte) -119);
        class557 var3 = client.method2746(0)[arg1.method505((byte) -119)];
        class125 var4 = class146.method947(-60)[arg1.method505((byte) -119)];
        int var5 = arg1.method496(-40);
        int var6 = arg1.method496(-84);
        int var7 = arg1.method505((byte) -119);
        if (arg0 <= 14) {
            return null;
        }
        int var8 = arg1.method505((byte) -119);
        int var9 = arg1.method505((byte) -119);
        int var10 = arg1.method482(-772591672);
        int var11 = arg1.method482(-772591672);
        int var12 = arg1.method457(-14532);
        int var13 = arg1.method457(-14532);
        int var14 = arg1.method457(-14532);
        return new class667(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)Ljava/lang/String;", line = 77)
    public static final String method4104(int arg0) {
        field10199++;
        if (class25.field320 || class655.field8752 == null) {
            return "";
        } else if ((class655.field8752.field7759 == null || class655.field8752.field7759.length() == 0) && class655.field8752.field7763 != null && class655.field8752.field7763.length() > 0) {
            return class655.field8752.field7763;
        } else if (arg0 == 0) {
            return class655.field8752.field7759;
        } else {
            return null;
        }
    }
}
