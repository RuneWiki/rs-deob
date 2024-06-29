import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class263 extends class144 {

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "Lhn;")
    public static class317 field4493 = new class317(64);

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "Lhi;")
    public static class82 field4496 = class95.method664((byte) -123, "Chargement des interfaces )2 ");

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "[I")
    public static int[] field4491;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lum;B)I", line = 5)
    public static final int method1871(class222 arg0, byte arg1) {
        int var2 = 0;
        if (arg1 != 4) {
            field4491 = (int[]) null;
        }
        if (arg0.method1598(class129.field2251, -1)) {
            var2++;
        }
        if (arg0.method1598(class294.field4925, -1)) {
            var2++;
        }
        if (arg0.method1598(class124.field2170, -1)) {
            var2++;
        }
        if (arg0.method1598(class34.field525, -1)) {
            var2++;
        }
        if (arg0.method1598(class214.field3736, -1)) {
            var2++;
        }
        field4492++;
        if (arg0.method1598(class79.field1338, arg1 - 5)) {
            var2++;
        }
        if (arg0.method1598(class139.field2385, -1)) {
            var2++;
        }
        if (arg0.method1598(class129.field2250, -1)) {
            var2++;
        }
        if (arg0.method1598(class149.field2530, -1)) {
            var2++;
        }
        if (arg0.method1598(class236.field4103, -1)) {
            var2++;
        }
        if (arg0.method1598(class55.field879, -1)) {
            var2++;
        }
        if (arg0.method1598(class9.field69, -1)) {
            var2++;
        }
        if (arg0.method1598(class134.field2324, -1)) {
            var2++;
        }
        if (arg0.method1598(class243.field4230, -1)) {
            var2++;
        }
        if (arg0.method1598(class83.field1489, -1)) {
            var2++;
        }
        if (arg0.method1598(class93.field1700, -1)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZIIZZ)Lum;", line = 77)
    public static final class222 method1872(boolean arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        if (arg2 >= -47) {
            return (class222) null;
        }
        field4494++;
        class282 var5 = null;
        if (class321.field5535 != null) {
            var5 = new class282(arg1, class321.field5535, class28.field384[arg1], 1000000);
        }
        class98.field1764[arg1] = class328.field5598.method1561(class201.field3458, arg1, 255, var5);
        if (arg4) {
            class98.field1764[arg1].method1494(0);
        }
        return new class222(class98.field1764[arg1], arg0, arg3);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V", line = 110)
    public static void method1873(byte arg0) {
        field4491 = null;
        if (arg0 < 56) {
            field4493 = (class317) null;
        }
        field4493 = null;
        field4496 = null;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)I", line = 128)
    public static final int method1874(byte arg0) {
        class16.field148 = 0;
        field4495++;
        if (arg0 < 68) {
            method1874((byte) 104);
        }
        return class197.method1380((byte) 106);
    }
}
