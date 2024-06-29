import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class15 extends class70 {

    @OriginalMember(owner = "client!c", name = "gb", descriptor = "Lic;")
    public static class59 field292 = class59.method433(0, "Null");

    @OriginalMember(owner = "client!c", name = "hb", descriptor = "Lic;")
    public static class59 field293 = class59.method433(0, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!c", name = "ob", descriptor = "Lic;")
    public static class59 field300 = class59.method433(0, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!c", name = "qb", descriptor = "[I")
    public static int[] field302 = new int[5];

    @OriginalMember(owner = "client!c", name = "kb", descriptor = "Lic;")
    public static class59 field296 = class59.method433(0, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!c", name = "ib", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!c", name = "jb", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!c", name = "lb", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!c", name = "nb", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!c", name = "pb", descriptor = "I")
    public int field301;

    @OriginalMember(owner = "client!c", name = "rb", descriptor = "I")
    public int field303;

    @OriginalMember(owner = "client!c", name = "mb", descriptor = "[I")
    public static int[] field298;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(B)Lnb;")
    public final class92 method43(byte arg0) {
        if (arg0 < 21) {
            this.method43((byte) 52);
        }
        field294++;
        return class7.method39(30996, this.field303).method647(this.field301, -1);
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(B)V")
    public static final void method82(byte arg0) {
        if (arg0 >= -69) {
            method83(-75, null);
        }
        class127.field2882 = true;
        field297++;
        class111.field2651 = true;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILpc;)V")
    public static final void method83(int arg0, class107 arg1) {
        field299++;
        if (arg0 != 0) {
            field300 = null;
        }
        if (class41.field1065 != 1) {
            return;
        }
        short var2 = 280;
        if (class3.field68 >= var2 && var2 + 14 >= class3.field68 && class81.field2005 >= 4 && class81.field2005 <= 18) {
            class4.method23((byte) 88, 0, 0);
            return;
        }
        if (var2 + 15 <= class3.field68 && var2 + 80 >= class3.field68 && class81.field2005 >= 4 && class81.field2005 <= 18) {
            class4.method23((byte) 92, 1, 0);
            return;
        }
        short var3 = 390;
        if (class3.field68 >= var3 && var3 + 14 >= class3.field68 && class81.field2005 >= 4 && class81.field2005 <= 18) {
            class4.method23((byte) 45, 0, 1);
            return;
        }
        if (var3 + 15 <= class3.field68 && var3 + 80 >= class3.field68 && class81.field2005 >= 4 && class81.field2005 <= 18) {
            class4.method23((byte) 52, 1, 1);
            return;
        }
        short var4 = 500;
        if (class3.field68 >= var4 && var4 + 14 >= class3.field68 && class81.field2005 >= 4 && class81.field2005 <= 18) {
            class4.method23((byte) 103, 0, 2);
            return;
        }
        if (var4 + 15 <= class3.field68 && class3.field68 <= var4 + 80 && class81.field2005 >= 4 && class81.field2005 <= 18) {
            class4.method23((byte) 28, 1, 2);
            return;
        }
        short var5 = 610;
        if (class3.field68 >= var5 && class3.field68 <= var5 + 14 && class81.field2005 >= 4 && class81.field2005 <= 18) {
            class4.method23((byte) 12, 0, 3);
            return;
        }
        if (class3.field68 >= var5 + 15 && class3.field68 <= var5 + 80 && class81.field2005 >= 4 && class81.field2005 <= 18) {
            class4.method23((byte) 113, 1, 3);
            return;
        }
        if (class3.field68 >= 708 && class81.field2005 >= 4 && class3.field68 <= 758 && class81.field2005 <= 20) {
            class136.field3021 = false;
            class147.field3200.method1020(0, 0);
            class131.field2941.method1020(382, 0);
            class84.field2121.method111(382 - class84.field2121.field440 / 2, 18);
            return;
        }
        if (class46.field1178 == -1) {
            return;
        }
        class2 var6 = class99.field2463[class46.field1178];
        if (class18.field367 == var6.field40) {
            byte[] var7 = class46.method358(new class59[] { var6.field46, class47.field1196 }, (byte) -75).method453((byte) -128);
            class89.field2263 = new String(var7, 0, var7.length);
            if (class96.field2432 != 0) {
                class96.field2432 = 0;
                class57.field1397 = 443;
                class73.field1817 = 43594;
                class68.field1723 = 43594;
            }
            class136.field3021 = false;
            class9.field179 = var6.field38;
            class147.field3200.method1020(0, 0);
            class131.field2941.method1020(382, 0);
            class84.field2121.method111(382 - class84.field2121.field440 / 2, 18);
            return;
        }
        class59 var8 = class46.method358(new class59[] { class154.field3341, var6.field46, class47.field1196, class38.field996, class89.field2250, class46.method361(class127.field2882 ? 1 : 0, 69), class75.field1859, class46.method361(class52.field1300, -86), class127.field2879, class46.method361(class137.field3055, -103) }, (byte) -75);
        try {
            arg1.getAppletContext().showDocument(var8.method449(125), "_self");
            return;
        } catch (Exception var9) {
            return;
        }
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(B)V")
    public static void method84(byte arg0) {
        field300 = null;
        field302 = null;
        field293 = null;
        field296 = null;
        if (arg0 > 99) {
            field292 = null;
            field298 = null;
        }
    }
}
