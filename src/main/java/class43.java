import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class43 extends class5 {

    @OriginalMember(owner = "client!g", name = "S", descriptor = "I")
    public int field1103 = -1;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    public int field1101 = 0;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "I")
    public static int field1093 = 0;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "[I")
    public static int[] field1096 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "Lhe;")
    private static class54 field1109 = class6.method58("skill)2", false);

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "Lhe;")
    public static class54 field1113 = class6.method58("b12_full", false);

    @OriginalMember(owner = "client!g", name = "L", descriptor = "Lhe;")
    public static class54 field1097 = field1109;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "Lhe;")
    public static class54 field1106 = class6.method58(" (X", false);

    @OriginalMember(owner = "client!g", name = "db", descriptor = "Lhe;")
    public static class54 field1114 = class6.method58("RuneScape wurde aktualisiert(Q", false);

    @OriginalMember(owner = "client!g", name = "I", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "client!g", name = "X", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "Lef;")
    public static class35 field1105;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lde;")
    public static final class27 method327(int arg0, int arg1) {
        field1112++;
        class27 var2 = (class27) class13.field365.method991((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class130.field2953.method266(14, (byte) 95, arg0);
        if (arg1 <= 64) {
            field1114 = null;
        }
        class27 var4 = new class27();
        if (var3 != null) {
            var4.method207(-1, new class83(var3));
        }
        class13.field365.method990(true, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public static void method328(int arg0) {
        field1105 = null;
        if (arg0 != 1) {
            field1114 = null;
        }
        field1114 = null;
        field1109 = null;
        field1106 = null;
        field1113 = null;
        field1096 = null;
        field1097 = null;
    }
}
