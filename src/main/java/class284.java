import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class284 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Lfca;")
    public static class139 field3528 = new class139();

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field3531 = 0;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V", line = 3)
    public static final void method1597(int arg0, int arg1) {
        field3529++;
        int var2 = class133.field1735 - class627.field8741;
        if (var2 >= 100) {
            class196.field2471 = -1;
            class306.field3890 = -1;
            class296.field3661 = 1;
            return;
        }
        int var3 = (int) class133.field1739;
        if (class551.field7678 >> 8 > var3) {
            var3 = class551.field7678 >> 8;
        }
        if (class451.field5788[4] && var3 < class98.field1333[4] + 128) {
            var3 = class98.field1333[4] + 128;
        }
        int var4 = (int) class331.field4223 + class237.field2965 & arg1;
        class298.method1656((var3 >> 3) * 3 + 600 << 2, class91.field1278, var3, class263.field3256, var4, 117, arg0, class467.method2469(class376.field4748.field6461, class476.field6039, arg1 ^ 0xFFFF8EF5, class376.field4748.field6464) - 200);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class276.field3464 = (int) ((float) (class276.field3464 - class460.field5849) * var5 + (float) class460.field5849);
        class20.field292 = (int) ((float) (class20.field292 - class269.field3403) * var5 + (float) class269.field3403);
        class571.field7982 = (int) ((float) (class571.field7982 - class395.field4985) * var5 + (float) class395.field4985);
        class215.field2673 = (int) ((float) (class215.field2673 - class137.field1775) * var5 + (float) class137.field1775);
        int var6 = class693.field9826 - class481.field6400;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class693.field9826 = (int) ((float) var6 * var5 + (float) class481.field6400);
        class693.field9826 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 59)
    public static void method1598(int arg0) {
        if (arg0 != -27669) {
            method1597(75, -89);
        }
        field3528 = null;
    }
}
