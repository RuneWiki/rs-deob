import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class124 extends class184 {

    @OriginalMember(owner = "client!ov", name = "H", descriptor = "Lkg;")
    public static class179 field1660 = new class179(71, 3);

    @OriginalMember(owner = "client!ov", name = "J", descriptor = "Lub;")
    public static class18 field1662 = new class18();

    @OriginalMember(owner = "client!ov", name = "D", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!ov", name = "E", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ov", name = "G", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ov", name = "I", descriptor = "Ll;")
    public static class16 field1661;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method6(int arg0, int arg1) {
        ++field1657;
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (arg1 != 578) {
            this.method6(-63, -106);
        }
        if (super.field2409.field436) {
            int[][] var4 = this.method1163(1, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class245.field3167; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "(I)V", line = 42)
    public static void method874(int arg0) {
        if (arg0 != 0) {
            field1661 = null;
        }
        field1660 = null;
        field1662 = null;
        field1661 = null;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILqc;II)V", line = 54)
    public static final void method875(int arg0, class524 arg1, int arg2, int arg3) {
        ++field1659;
        if (arg0 < 16) {
            field1661 = null;
        }
        class371.field4797[arg2][arg3] = arg1;
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(B)V", line = 65)
    public static final void method876(byte arg0) {
        class2.field13.method2382((byte) 105);
        ++field1658;
        class359.field4633.method2632(-22098);
        class360.field4654.method2043(-25876);
        class315.field4017.method1961(0);
        class390.field5244.method1329(-1);
        class376.field4949.method627(0);
        class404.field5756.method553((byte) 55);
        class120.field1624.method1838(-112);
        class242.field3132.method1686(29473);
        class436.field6239.method2961((byte) 62);
        class327.field4134.method2576(32);
        class72.field931.method948(false);
        class505.field7281.method1625(arg0 ^ 29231);
        class143.field1839.method3026((byte) -108);
        class199.field2592.method2583(111);
        class456.field6572.method752((byte) 121);
        class375.field4840.method2424(true);
        class38.field503.method1603(121);
        if (arg0 == 107) {
            class72.field927.method1725(-111);
            class100.field1217.method1044((byte) -120);
            class192.method1187(false);
            class155.method1015(14584);
            class517.method3085(arg0 ^ 163);
            if (class324.field4107 != class218.field2784) {
                for (int var1 = 0; class225.field2872.length > var1; ++var1) {
                    class225.field2872[var1] = null;
                }
                class161.field2050 = 0;
            }
            class515.method3074(-128);
            class125.method878((byte) 69);
            class431.method2525((byte) -73);
            class400.method2370(84);
            client.method1228(1024);
            class239.field3077.method2642(arg0 ^ 107);
            class33.field416.method352();
            class284.field3614.method1893(98);
            class480.method2928(false);
            class183.field2402.method483(0);
            class280.field3547.method483(0);
            class404.field5750.method483(arg0 ^ 107);
            class191.field2483.method483(0);
            class492.field7163.method483(0);
            class351.field4507.method483(0);
            class530.field7806.method483(0);
            class483.field7068.method483(0);
            class448.field6413.method483(0);
            class303.field3891.method483(0);
            class347.field4456.method483(0);
            class288.field3675.method483(0);
            class379.field4982.method483(0);
            class511.field7421.method483(0);
            class473.field6858.method483(0);
            class426.field6049.method483(arg0 + -107);
            class470.field6830.method483(0);
            class84.field1055.method483(arg0 + -107);
            class233.field2984.method483(0);
            class8.field76.method483(0);
            class3.field29.method483(0);
            class126.field1687.method483(0);
            class395.field5425.method483(arg0 ^ 107);
            class231.field2945.method483(0);
            class390.field5243.method483(0);
            class17.field259.method483(0);
            class354.field4558.method483(arg0 + -107);
            class123.field1655.method483(0);
            class264.field3330.method483(0);
            class42.field515.method483(arg0 ^ 107);
            class515.field7469.method2642(0);
            class489.field7110.method2642(0);
            class505.field7279.method2642(0);
            class42.field518.method2642(arg0 + -107);
        }
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "()V", line = 157)
    public class124() {
        super(1, true);
    }
}
