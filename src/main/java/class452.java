import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class452 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public int field6706;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public int field6710;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public int field6711;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public int field6713;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public int field6714;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public int field6715;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "Lsi;")
    public static class395 field6708;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method2698(boolean arg0) {
        class263.field4025.method1891(-3);
        field6712++;
        for (class328 var1 = (class328) class373.field5469.method1892(118); var1 != null; var1 = (class328) class373.field5469.method1893((byte) -2)) {
            if (var1.field4972 < 1000) {
                var1.method1676(true);
                class263.field4025.method1885(!arg0, var1);
            }
        }
        class263.field4025.method1895((byte) 111, class373.field5469);
        int var2 = -1;
        if (!arg0) {
            field6708 = null;
        }
        class356 var3 = (class356) class293.field4478.method1892(122);
        if (var3 != null) {
            var2 = var3.method50(8);
        }
        if (!class76.field1543) {
            if (var2 == 0 && (class47.field971 == 1 && class332.field5041 > 2 || class290.method1882(-1453414076))) {
                var2 = 2;
            }
            if (var2 == 2 && class332.field5041 > 0 && var3 != null) {
                if (class253.field3885 == null && class218.field3435 == 0) {
                    class194.method1311(var3.method54(!arg0), var3.method52(-87), 2);
                } else {
                    class12.field214 = 2;
                }
            }
            if (var2 == 0 && class332.field5041 > 0) {
                class442.method2632((byte) 91);
            }
            if (class253.field3885 != null || class218.field3435 != 0) {
                return;
            }
            class12.field214 = 0;
            class513.field7452 = null;
            return;
        }
        if (var2 == -1) {
            int var4 = class393.field5991.method132(37);
            int var5 = class393.field5991.method139(-77);
            if (var4 < (class229.field3561 - 10) || class229.field3561 + class383.field5601 + 10 < var4 || var5 < class280.field4218 - 10 || var5 > (class280.field4218 + class186.field2991 + 10)) {
                class18.method120((byte) 67);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class229.field3561;
        int var7 = class280.field4218;
        int var8 = class383.field5601;
        int var9 = var3.method52(-83);
        int var10 = var3.method54(!arg0);
        int var11 = -1;
        for (int var12 = 0; var12 < class332.field5041; var12++) {
            if (class192.field3105) {
                int var16 = (class332.field5041 - var12 - 1) * 16 + var7 + 33;
                if (var6 < var9 && var6 + var8 > var9 && var10 > (var16 - 13) && (var16 + 4) > var10) {
                    var11 = var12;
                }
            } else {
                int var17 = (class332.field5041 - var12 - 1) * 16 + var7 + 31;
                if (var9 > var6 && var6 + var8 > var9 && (var17 - 13) < var10 && var10 < var17 + 3) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class482 var14 = new class482(class373.field5469);
            for (class328 var15 = (class328) var14.method2893(104); var15 != null; var15 = (class328) var14.method2895(31)) {
                if (var11 == var13) {
                    class421.method2571(var15, var9, var10, (byte) 69);
                }
                var13++;
            }
        }
        class18.method120((byte) 67);
        return;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)Z", line = 153)
    public static final boolean method2699(byte arg0) {
        if (arg0 < 38) {
            method2698(false);
        }
        field6707++;
        return class491.field7200 == 0 ? class470.field6983.method638(922198381) : true;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V", line = 174)
    public static final void method2700(byte arg0) {
        field6709++;
        class293.field4482.method2080(5166);
        class127.field2174.method676((byte) 18);
        class428.field6404.method524(3);
        if (arg0 <= 2) {
            return;
        }
        class123.field2142.method1523((byte) -96);
        class102.field1942.method844(-37);
        class135.field2271.method1631((byte) 122);
        class422.field6355.method238(1);
        class514.field7469.method594(true);
        class155.field2526.method1451(-442057458);
        class161.field2593.method1402(-16777216);
        field6708.method2455(21131);
        class160.field2586.method2133((byte) -105);
        class309.field4682.method1251((byte) -17);
        class523.field7610.method1553(15972);
        class453.field6727.method461(102);
        class159.field2574.method2514((byte) 126);
        class464.field6883.method2410(0);
        class214.field3396.method1084(15090);
        class62.field1264.method1693(255);
        class60.field1255.method978(8857);
        class497.method3000(false);
        class317.method2009(false);
        class141.method1051((byte) 120);
        class5.method37(true);
        class187.field2998.method2477(-110);
        class491.field7197.method2477(61);
        class130.field2208.method2477(28);
        class486.field7162.method2477(-120);
        class495.field7269.method2477(115);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 213)
    public static void method2701(int arg0) {
        if (arg0 != 2) {
            method2699((byte) -55);
        }
        field6708 = null;
    }
}
