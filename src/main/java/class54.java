import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class54 extends class109 {

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public int field1209 = 0;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "[I")
    public int[] field1220 = new int[5];

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "[Lnf;")
    public class131[] field1225 = new class131[5];

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public int field1217;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public int field1233;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field1204 = 0;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Ldd;")
    public static class35 field1207 = class180.method1196((byte) 127, "blaugr-Un:");

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field1216 = 0;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "Ldd;")
    private static class35 field1229 = class180.method1196((byte) -109, "Welcome to RuneScape");

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "Ldd;")
    public static class35 field1234 = field1229;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public int field1213;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public int field1218;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public int field1222;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public int field1226;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    public int field1236;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "Lkb;")
    public class100 field1219;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "Lma;")
    public class117 field1212;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "Lnb;")
    public class127 field1230;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "Lpg;")
    public class150 field1231;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "Lca;")
    public class22 field1210;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "Lfc;")
    public class54 field1214;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "Lfe;")
    public class56 field1224;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Z")
    public static boolean field1206;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "Z")
    public boolean field1221;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "Z")
    public boolean field1223;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "Z")
    public boolean field1235;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "[I")
    public static int[] field1232;

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(III)V")
    public class54(int arg0, int arg1, int arg2) {
        this.field1217 = arg1;
        this.field1211 = this.field1208 = arg0;
        this.field1233 = arg2;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
    public static void method474(byte arg0) {
        field1232 = null;
        field1234 = null;
        if (arg0 <= -104) {
            field1207 = null;
            field1229 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLfd;)Z")
    public static final boolean method475(byte arg0, class55 arg1) {
        field1215++;
        if (arg0 != -38) {
            return true;
        }
        int var2 = arg1.field1299;
        if (var2 == 205) {
            class79.field1848 = 250;
            return true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class40.field883.method182(var3, var4 == 1, (byte) -124);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class40.field883.method187(var5, arg0 + 37, var6 == 1);
        }
        if (var2 == 324) {
            class40.field883.method177(false, true);
        }
        if (var2 == 325) {
            class40.field883.method177(true, true);
        }
        if (var2 == 326) {
            class3.field45++;
            class1.field11.method659(30, true);
            class40.field883.method188((byte) 57, class1.field11);
            return true;
        } else {
            return false;
        }
    }
}
