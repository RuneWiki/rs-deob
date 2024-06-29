import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class154 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field2482 = 0;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field2488 = 0;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "[Lsb;")
    public static class98[] field2486 = new class98[6];

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2487 = 0;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Ljj;")
    public static class134 field2485;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "[Ljg;")
    public static class271[] field2481;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method1039(int arg0) {
        field2486 = null;
        int var1 = 11 / ((-arg0 - 56) / 45);
        field2485 = null;
        field2481 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
    public static final void method1040(boolean arg0) {
        field2483++;
        class21.method146((byte) 39, false);
        class67.field951 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class67.field948.length; var2++) {
            if (class216.field3471[var2] != -1 && class67.field948[var2] == null) {
                class67.field948[var2] = class250.field4004.method940((byte) 104, 0, class216.field3471[var2]);
                if (class67.field948[var2] == null) {
                    var1 = false;
                    class67.field951++;
                }
            }
            if (class116.field1981[var2] != -1 && class81.field1122[var2] == null) {
                class81.field1122[var2] = class250.field4004.method929(class39.field473[var2], (byte) -122, 0, class116.field1981[var2]);
                if (class81.field1122[var2] == null) {
                    class67.field951++;
                    var1 = false;
                }
            }
            if (class206.field3307 != null && class265.field4264[var2] == null && class206.field3307[var2] != -1) {
                class265.field4264[var2] = class250.field4004.method929(class39.field473[var2], (byte) -125, 0, class206.field3307[var2]);
                if (class265.field4264[var2] == null) {
                    class67.field951++;
                    var1 = false;
                }
            }
        }
        if (class233.field3699 == null) {
            if (class173.field2801 == null || !class200.field3219.method927((byte) 127, class173.field2801.field2090 + "_labels")) {
                class233.field3699 = new class79(0);
            } else if (class200.field3219.method921(class173.field2801.field2090 + "_labels", (byte) 107)) {
                class233.field3699 = class222.method1470(class200.field3219, (byte) -54, class173.field2801.field2090 + "_labels");
            } else {
                var1 = false;
                class67.field951++;
            }
        }
        if (!var1) {
            class108.field1878 = 1;
            return;
        }
        class7.field106 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class67.field948.length; var4++) {
            byte[] var20 = class81.field1122[var4];
            if (var20 != null) {
                int var21 = (class69.field958[var4] >> 8) * 64 - class296.field4685;
                int var22 = (class69.field958[var4] & 0xFF) * 64 - class93.field1321;
                if (class160.field2609) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class294.method1967(var22, -23, var21, var20);
            }
        }
        if (!var3) {
            class108.field1878 = 2;
            return;
        }
        if (class108.field1878 != 0) {
            class157.method1059(0, class21.field256 + "<br>(100%)", true);
        }
        boolean var5 = false;
        class280.method1873((byte) -54);
        class260.method1710((byte) 13);
        class130.method904(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class61.field839[var6].method1876(false);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class134.field2251[var7][var18][var19] = 0;
                }
            }
        }
        class219.method1455(false, 64);
        class280.method1873((byte) -54);
        System.gc();
        class21.method146((byte) 39, true);
        class208.method1415(false, 1);
        if (!class160.field2609) {
            class77.method582(true, false);
            class21.method146((byte) 39, true);
            class250.method1649(false, -109);
            if (class265.field4264 != null) {
                class224.method1484(0);
            }
        }
        if (class160.field2609) {
            class193.method1301(-106, false);
            class21.method146((byte) 39, true);
            class228.method1516((byte) -87, false);
        }
        class260.method1710((byte) 13);
        class21.method146((byte) 39, arg0);
        class74.method565((byte) -95, class61.field839, false, class160.field2609 ? class140.field2298 : null);
        class21.method146((byte) 39, true);
        int var8 = class184.field2945;
        if (var8 > class28.field336) {
            var8 = class28.field336;
        }
        if (var8 < class28.field336 - 1) {
            int var9 = class28.field336 - 1;
        }
        if (class200.method1349(false)) {
            class221.method1468(0);
        } else {
            class221.method1468(class184.field2945);
        }
        class181.method1252((byte) 116);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class294.method1966(var10, var17, (byte) -127);
            }
        }
        class58.method446(19956);
        class280.method1873((byte) -54);
        class177.method1220(-124);
        class260.method1710((byte) 13);
        if (class284.field4537 != null && class149.field2395 != null && class21.field249 == 25) {
            class83.field1148.method1238(12, -136478397);
            class228.field3630++;
            class83.field1148.method1789((byte) -38, 1057001181);
        }
        if (!class160.field2609) {
            int var11 = (class263.field4159 - 6) / 8;
            int var12 = (class263.field4159 + 6) / 8;
            int var13 = (class103.field1675 + 6) / 8;
            int var14 = (class103.field1675 - 6) / 8;
            for (int var15 = var11 - 1; var15 <= var12 + 1; var15++) {
                for (int var16 = var14 - 1; var16 <= (var13 + 1); var16++) {
                    if (var15 < var11 || var15 > var12 || var14 > var16 || var16 > var13) {
                        class250.field4004.method936(0, "m" + var15 + "_" + var16);
                        class250.field4004.method936(0, "l" + var15 + "_" + var16);
                    }
                }
            }
        }
        if (class21.field249 == 28) {
            class233.method1539(10, (byte) 32);
        } else {
            class233.method1539(30, (byte) 32);
            if (class149.field2395 != null) {
                class83.field1148.method1238(172, -136478397);
            }
        }
        class257.method1689((byte) 88);
        class280.method1873((byte) -54);
        class127.method891((byte) 126);
    }
}
