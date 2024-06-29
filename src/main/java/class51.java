import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class51 extends class5 {

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "Lhe;")
    private static class54 field1223 = class6.method58("Select a world", false);

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "Lhe;")
    public static class54 field1221 = class6.method58("Freie Welt", false);

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "Lhe;")
    private static class54 field1225 = class6.method58("Username: ", false);

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "Lhe;")
    public static class54 field1226 = class6.method58("<col=ffffff>", false);

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "[I")
    public static int[] field1234 = new int[1000];

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "Lhe;")
    public static class54 field1231 = class6.method58("Hierhin gehen", false);

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "Lhe;")
    public static class54 field1229 = field1223;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "Lhe;")
    public static class54 field1232 = field1225;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "Lsf;")
    public static class131 field1227 = new class131(30);

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "[I")
    public static int[] field1235 = new int[128];

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "B")
    public byte field1228;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    public int field1224;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "Lhe;")
    public class54 field1230;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
    public static final void method362(int arg0, int arg1) {
        field1233++;
        if (arg0 > -117) {
            method363(53);
        }
        if (class56.field1414 != null && arg1 >= 0 && class56.field1414.length > arg1 && class56.field1414[arg1] != null) {
            class131.field2969.method454(161, -30);
            class15.field456++;
            class131.field2969.method677(189354448, class56.field1414[arg1].field154);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public static void method363(int arg0) {
        field1221 = null;
        field1235 = null;
        field1229 = null;
        field1227 = null;
        field1231 = null;
        field1232 = null;
        field1223 = null;
        field1226 = null;
        field1234 = null;
        if (arg0 != 30) {
            method363(92);
        }
        field1225 = null;
    }
}
