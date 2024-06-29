import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class527 {

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "[I")
    public static int[] field7752 = new int[1];

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "F")
    public static float field7755;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field7751;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public static int field7753;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIZ)V")
    public static final void method3124(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (class65.field802 == 0) {
            class75.method709(4095, false);
        } else {
            class149.field2114 = class65.field802;
            class88.method780(0, (byte) 115);
        }
        field7751++;
        class467.field6897 = arg1;
        class513.field7563 = arg0;
        class403.field5973 = arg4;
        class399.method2439(arg3);
        if (arg2 >= -92) {
            method3124(19, 69, 54, 7, true);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
    public static final void method3125(byte arg0) {
        field7753++;
        if (arg0 > -89) {
            method3124(-105, -90, 103, -19, false);
        }
        class306 var1 = (class306) class188.field2670.method1018(95);
        boolean var2 = class134.field1943 != null || class495.field7267 > 0;
        if (var2) {
            class353.field4926 = 1;
        }
        if (class223.field3272 && class229.field3360.method796(-82, 81) && class291.field4175 > 2) {
            if (var2) {
                class188.field2725 = (class97) class498.field7394.field1918.field3269.field3269;
            } else {
                class264.method1699(var1.method236((byte) -86), (class97) class498.field7394.field1918.field3269.field3269, var1.method233(78), true);
            }
        } else if (var2) {
            class188.field2725 = (class97) class498.field7394.field1918.field3269;
        } else {
            class264.method1699(var1.method236((byte) -87), (class97) class498.field7394.field1918.field3269, var1.method233(109), true);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public static void method3126(int arg0) {
        field7752 = null;
        if (arg0 != -1) {
            field7754 = -18;
        }
    }
}
