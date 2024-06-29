import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class287 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "[I")
    public static int[] field5018 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Loa;")
    public static class99 field5019 = class221.method1463(2844, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "Loa;")
    public static class99 field5024 = class221.method1463(2844, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "[I")
    public static int[] field5022 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Loa;")
    private static class99 field5027 = class221.method1463(2844, "Loaded world list data");

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "Loa;")
    public static class99 field5025 = field5027;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "[Ltf;")
    public static class107[] field5020;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(JI)V")
    public static final void method1930(long arg0, int arg1) {
        field5021++;
        if ((long) arg1 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < class122.field2138; var3++) {
            if (class160.field2846[var3] == arg0) {
                class122.field2138--;
                for (int var4 = var3; var4 < class122.field2138; var4++) {
                    class160.field2846[var4] = class160.field2846[var4 + 1];
                    class218.field3795[var4] = class218.field3795[var4 + 1];
                }
                class290.field5084 = class28.field514;
                class146.field2582++;
                class131.field2277.method966((byte) 49, 50);
                class131.field2277.method1699(arg0, -65);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V")
    public static void method1931(boolean arg0) {
        if (arg0) {
            method1932(true);
        }
        field5024 = null;
        field5019 = null;
        field5022 = null;
        field5018 = null;
        field5027 = null;
        field5025 = null;
        field5020 = null;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)V")
    public static final void method1932(boolean arg0) {
        if (!arg0) {
            method1932(true);
        }
        for (int var1 = 0; var1 < class64.field1078; var1++) {
            int var2 = class25.field438[var1];
            class156 var3 = class248.field4287[var2];
            int var4 = class129.field2252.method1693((byte) 69);
            if ((var4 & 0x10) != 0) {
                int var5 = class129.field2252.method1694(0);
                int var6 = class129.field2252.method1714(-1640531527);
                var3.method519(var6, class56.field926, 22, var5);
            }
            if ((var4 & 0x40) != 0) {
                var3.field1313 = class129.field2252.method1729((byte) -16);
                int var7 = class129.field2252.method1730((byte) 105);
                var3.field1295 = 0;
                var3.field1277 = var7 >> 16;
                var3.field1262 = (var7 & 0xFFFF) + class56.field926;
                if (var3.field1262 > class56.field926) {
                    var3.field1295 = -1;
                }
                var3.field1312 = 0;
                if (var3.field1313 == 65535) {
                    var3.field1313 = -1;
                }
                if (var3.field1313 != -1 && class56.field926 == var3.field1262) {
                    int var8 = class90.method610(var3.field1313, true).field3137;
                    if (var8 != -1) {
                        class270 var9 = class38.method297(132, var8);
                        if (var9 != null && var9.field4740 != null) {
                            class250.method1621(var3.field1325, 0, var3.field1301, 76, false, var9);
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field1306 = class129.field2252.method1713((byte) 28);
                var3.field1331 = class129.field2252.method1729((byte) 121);
            }
            if ((var4 & 0x20) != 0) {
                int var10 = class129.field2252.method1694(0);
                int var11 = class129.field2252.method1714(-1640531527);
                var3.method519(var11, class56.field926, 22, var10);
                var3.field1304 = class56.field926 + 300;
                var3.field1287 = class129.field2252.method1694(0);
            }
            if ((var4 & 0x4) != 0) {
                var3.field1265 = class129.field2252.method1713((byte) 28);
                if (var3.field1265 == 65535) {
                    var3.field1265 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var12 = class129.field2252.method1713((byte) 28);
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = class129.field2252.method1694(0);
                class25.method194(var3, 71, var13, var12);
            }
            if ((var4 & 0x1) != 0) {
                var3.field1324 = class129.field2252.method1705(115);
                var3.field1300 = 100;
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field2793.method1670((byte) -87)) {
                    class41.method315(var3, (byte) 90);
                }
                var3.method1073(0, class50.method348(class129.field2252.method1713((byte) 28), -30026));
                var3.method522(true, var3.field2793.field4469);
                var3.field1273 = var3.field2793.field4474;
                var3.field1328 = var3.field2793.field4457;
                var3.field1308 = var3.field2793.field4467;
                var3.field1292 = var3.field2793.field4484;
                var3.field1316 = var3.field2793.field4465;
                var3.field1330 = var3.field2793.field4470;
                var3.field1305 = var3.field2793.field4429;
                var3.field1291 = var3.field2793.field4472;
                if (var3.field2793.method1670((byte) -87)) {
                    class96.method643((class183) null, var3.field1259[0], -33, class255.field4407, 0, var3.field1317[0], (class153) null, var3);
                }
            }
        }
        field5026++;
    }
}
