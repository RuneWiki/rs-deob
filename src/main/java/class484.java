import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class484 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "Lhj;")
    public static class596 field6746 = new class596(92, 10);

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "[I")
    public static int[] field6749 = new int[128];

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "Loh;")
    public static class425 field6754;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public int field6747;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public int field6750;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public int field6752;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public int field6753;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
    public static void method2870(int arg0) {
        field6749 = null;
        field6754 = null;
        field6746 = null;
        int var1 = -127 % ((arg0 + 46) / 53);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
    public static final void method2871(int arg0) {
        field6748++;
        class357.method2091(2, 22050, class118.field1503.field10633.method3227(0) == 1, -2425);
        if (arg0 < 28) {
            method2870(76);
        }
        class388.field4979 = class621.method3538(class109.field1370, 1, class521.field7389, 0, 22050);
        class455.method2752(true, class82.method774(null, 118), (byte) -76);
        class95.field1247 = class621.method3538(class109.field1370, 1, class521.field7389, 1, 2048);
        class783.field10811 = new class560();
        class95.field1247.method1554(false, class783.field10811);
        class555.field7727 = new class193(22050, class478.field6632);
        class133.method991(77);
    }

    static {
        for (int var0 = 0; var0 < field6749.length; var0++) {
            field6749[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field6749[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field6749[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field6749[var3] = var3 + 52 - 48;
        }
        field6749[45] = field6749[47] = 63;
        field6749[42] = field6749[43] = 62;
        field6754 = new class425("", 17);
    }
}
