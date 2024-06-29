import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class178 {

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "Lrk;")
    public static class419 field2698 = new class419();

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "Lfo;")
    public static class22 field2700 = new class22(6, 3);

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public static int field2703 = 0;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "Lnj;")
    public static class487 field2702 = new class487("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
    public static int field2706 = 0;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "Llr;")
    public static class261 field2704;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V")
    public static final void method1186(byte arg0) {
        class636.field9264.method2346(-106, 5);
        field2705++;
        if (arg0 <= 46) {
            return;
        }
        class264.field3924.method20(5, 104);
        class42.field507.method61(5, (byte) -126);
        class312.field4690.method2011((byte) -80, 5);
        class369.field5329.method1782((byte) 109, 5);
        class216.field3204.method3363(false, 5);
        class470.field7205.method3502(5, false);
        class138.field1821.method2252(5, 65280);
        class23.field200.method2977(5, (byte) -84);
        class239.field3501.method3655(5, (byte) -114);
        class345.field5023.method524(64, 5);
        class540.field8011.method1219(5, (byte) 94);
        class402.field5766.method1717(5, -73);
        class8.field74.method3293(5, (byte) -30);
        class247.field3618.method2893(5, 64);
        class28.field255.method2313(65, 5);
        class458.field6652.method3714(5, (byte) 41);
        class191.field2897.method2921(1, 5);
        class271.field4008.method1356(-119, 5);
        class77.field888.method3194(5, -64);
        class467.method2769(5, -21766);
        class301.method1862(5, 50);
        class191.method1242((byte) -52, 5);
        class288.method1789((byte) -32, 5);
        class606.field8927.method2028(5, true);
        class296.field4337.method2028(5, true);
        class120.field1560.method2028(5, true);
        class605.field8916.method2028(5, true);
        class330.field4901.method2028(5, true);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)I")
    public static final int method1187(int arg0, int arg1) {
        field2697++;
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
        if (arg1 <= 76) {
            return 31;
        }
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)V")
    public static final void method1188(byte arg0) {
        field2701++;
        if (!class369.field5337) {
            return;
        }
        int var1 = 20 / ((arg0 - 76) / 49);
        class311 var2 = class240.method1540(class564.field8360, class427.field6085, true);
        if (var2 != null && var2.field4532 != null) {
            class355 var3 = new class355();
            var3.field5150 = var2;
            var3.field5160 = var2.field4532;
            class330.method2072(var3);
        }
        class546.field8160 = -1;
        class362.field5233 = -1;
        class369.field5337 = false;
        if (var2 != null) {
            class619.method3586(33, var2);
        }
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(B)V")
    public static void method1189(byte arg0) {
        field2702 = null;
        if (arg0 != 64) {
            method1186((byte) -69);
        }
        field2698 = null;
        field2700 = null;
        field2704 = null;
    }
}
