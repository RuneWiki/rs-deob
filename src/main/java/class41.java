import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class41 {

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "Lfg;")
    public static class18 field628 = new class18(8);

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field632 = 0;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Lnk;")
    public static class206 field633 = new class206();

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "[J")
    public static long[] field634 = new long[100];

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "Z")
    public static boolean field635 = false;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Lid;")
    public static class240 field631;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "[[[I")
    public static int[][][] field630;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method341(int arg0) {
        field628 = null;
        field634 = null;
        if (arg0 >= 81) {
            field633 = null;
            field631 = null;
            field630 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lja;Z)V")
    public static final void method342(class90 arg0, boolean arg1) {
        field629++;
        if (class389.field5591 < 2 && class47.field765 == 0 && !class291.field4332) {
            return;
        }
        String var2;
        if (class47.field765 == 1 && class389.field5591 < 2) {
            var2 = class19.field267 + class105.field1745 + class85.field1377 + " ->";
        } else if (class291.field4332 && class389.field5591 < 2) {
            var2 = class171.field2549 + class105.field1745 + class79.field1339 + " ->";
        } else if (field635 && class33.field482[81] && class389.field5591 > 2) {
            var2 = class451.method2813(12001, (class278) class276.field4153.field322.field497.field497);
        } else {
            class278 var3 = (class278) class276.field4153.field322.field497;
            var2 = class451.method2813(12001, var3);
            int[] var4 = null;
            if (class183.method1422(-5, var3.field4182)) {
                var4 = class206.method1561(103, (int) var3.field4186).field2021;
            } else if (class8.method58(var3.field4182, 12015)) {
                class98 var5 = class447.field6512[(int) var3.field4186];
                if (var5 != null) {
                    var4 = var5.field1545.field179;
                }
            } else if (class407.method2574(var3.field4182, 8396)) {
                if (var3.field4182 == 1004) {
                    var4 = class451.method2812(49, (int) var3.field4186).field701;
                } else {
                    var4 = class451.method2812(58, (int) (var3.field4186 >>> 32 & 0x7FFFFFFFL)).field701;
                }
            }
            if (var4 != null) {
                var2 = var2 + class12.method77((byte) 111, var4);
            }
        }
        if (class389.field5591 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class389.field5591 - 2) + class98.field1535;
        }
        if (arg1) {
            field628 = null;
        }
        if (class180.field2672 != null) {
            class220 var6 = class180.field2672.method1867(arg0, -29873);
            if (var6 == null) {
                var6 = class250.field3620;
            }
            var6.method1667(true, var2, class180.field2672.field3766, class23.field351, class180.field2672.field3758, class255.field3689, class377.field5341, class180.field2672.field3764, class180.field2672.field3798, class111.field1807, class28.field415, class69.field1131, class180.field2672.field3772, class425.field6182, class180.field2672.field3788);
            class253.method1834(class425.field6182[2], class425.field6182[3], arg1, class425.field6182[0], class425.field6182[1]);
        } else if (class129.field2110 != null && class336.field4809 == 0) {
            int var7 = class250.field3620.method1681(0, 16777215, class276.field4159 + 16, class221.field3300 + 4, class377.field5341, class28.field415, class23.field351, 8583, var2, class111.field1807);
            class253.method1834(var7 + class150.field2295.method1448(var2, -20814), 16, false, class221.field3300 + 4, class276.field4159);
        }
    }
}
