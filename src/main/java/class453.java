import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class453 {

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field6719 = 0;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Lki;")
    public static class498 field6720 = new class498(61, 8);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static final void method2723(int arg0) {
        field6718++;
        class185.field2754 = new class38[class354.field5428.method2943((byte) -33)][];
        if (arg0 != 1351874563) {
            method2725(-102);
        }
        class231.field3450 = new class38[class354.field5428.method2943((byte) -33)][];
        class45.field718 = new boolean[class354.field5428.method2943((byte) -33)];
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public static final void method2724(int arg0) {
        field6722++;
        if (class193.field2832 == 10 || class193.field2832 == 28) {
            class410.method2470(class24.field258 >> 10, class260.field3827 >> 10, 5000, 119);
        } else {
            int var1 = class500.field7365.field1997[0] >> 3;
            int var2 = class500.field7365.field1996[0] >> 3;
            if (var1 >= 0 && (class30.field323 >> 3) > var1 && var2 >= 0 && class182.field2661 >> 3 > var2) {
                class410.method2470(var1, var2, 5000, 112);
            } else {
                class410.method2470(class30.field323 >> 4, class182.field2661 >> 4, 0, 113);
            }
        }
        class133.method888(arg0 ^ 0xFFFFFFE3);
        class437.method2622(-591);
        if (arg0 != 28) {
            field6721 = 85;
        }
        class467.method2795(39);
        class258.method1716(arg0 ^ 0x1);
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
    public static void method2725(int arg0) {
        field6720 = null;
        if (arg0 != 5000) {
            method2723(126);
        }
    }
}
