import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public abstract class class318 {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Lkd;")
    public class188 field4800;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Los;")
    public static class309 field4802 = new class309(0);

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Loe;")
    public static class137 field4803 = new class137();

    @OriginalMember(owner = "client!td", name = "f", descriptor = "[I")
    public static int[] field4804 = new int[2048];

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field4806 = 0;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lav;IB)V")
    public abstract void method715(class454 arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)[Lhn;")
    public static final class509[] method2044(int arg0) {
        field4799++;
        if (arg0 != 0) {
            field4802 = null;
        }
        return new class509[] { class76.field1098, class199.field3320, class389.field5838, class234.field3777, class207.field3395, class2.field6, class150.field2244, class387.field5816, class523.field7648, class416.field6202, class337.field5008, class452.field6601, class94.field1327, class518.field7558, class346.field5119, class139.field2124, class428.field6364, class409.field6099, class419.field6259, class447.field6550, class48.field624, class424.field6320, class201.field3343, class137.field2089, class529.field7732, class17.field221, class389.field5840, class146.field2228, class301.field4571, class178.field2684, class459.field6686, class75.field1078, class424.field6316, class237.field3798, class177.field2637, class348.field5148, class378.field5706, class355.field5259, class310.field4668, class258.field3943, class471.field6808, class294.field4464, class429.field6374, class508.field7445, class484.field6961, class97.field1391, class109.field1520, class468.field6762, class55.field679, class443.field6517, class264.field4057, class171.field2548, class377.field5693, class103.field1482, class346.field5115, class99.field1416, class287.field4351, class1.field4, class363.field5376, class266.field4082, class94.field1328, class146.field2222, class486.field7005, class91.field1300, class179.field2702, class398.field5953, class372.field5539, class182.field2724, class338.field5038, class484.field6968, class225.field3677, class494.field7127, class162.field2409, class131.field2008, class194.field3265, class128.field1871, class473.field6824, class403.field5983, class88.field1256, class367.field5398, class257.field3935, class357.field5287, class402.field5969, class146.field2226, class232.field3748, class366.field5391, class429.field6376, class398.field5954, class89.field1270, class226.field3690, class65.field849, class179.field2699, class55.field670, class45.field569, class25.field311, class287.field4350, class78.field1128, class233.field3769, class268.field4101, class85.field1216, class519.field7580, class147.field2234, class157.field2372, class530.field7737, class336.field5000, class498.field7154, class107.field1499, class147.field2232, class417.field6231, class396.field5926, class267.field4084, class445.field6533 };
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static void method2045(byte arg0) {
        int var1 = 113 / ((arg0 - 79) / 44);
        field4804 = null;
        field4802 = null;
        field4803 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
    public abstract void method719(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lkd;)V")
    public class318(class188 arg0) {
        this.field4800 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
    public abstract void method723(byte arg0);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZZ)V")
    public abstract void method718(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)V")
    public abstract void method722(int arg0, boolean arg1);

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Z")
    public abstract boolean method721(int arg0);
}
