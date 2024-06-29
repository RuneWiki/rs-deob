import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class412 {

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "[I")
    public static int[] field6018 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "Lqp;")
    public static class466 field6017 = new class466(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V", line = 3)
    public static final void method2466(int arg0, int arg1) {
        field6019++;
        int var2 = class441.field6516 - class369.field5401;
        if (var2 >= 100) {
            class491.field7168 = 1;
            return;
        }
        if (arg1 != 128) {
            method2467(-68);
        }
        int var3 = (int) class252.field3498;
        if (var3 < (class164.field2464 >> 8)) {
            var3 = class164.field2464 >> 8;
        }
        if (class80.field1225[4] && (class44.field534[4] + 128) > var3) {
            var3 = class44.field534[4] + 128;
        }
        int var4 = (int) class498.field7255 + class134.field1942 & 0x3FFF;
        class435.method2565((var3 >> 3) * 3 + 600 << 0, class121.field1818, class242.method1465(97, class436.field6379, class316.field4324.field1735, class316.field4324.field1732) - 50, var3, arg0, var4, 100, class240.field3370);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class373.field5478 = (int) ((float) (class373.field5478 - class58.field711) * var5 + (float) class58.field711);
        class62.field766 = (int) ((float) (class62.field766 - class76.field1019) * var5 + (float) class76.field1019);
        class107.field1604 = (int) ((float) (class107.field1604 - class353.field5179) * var5 + (float) class353.field5179);
        class329.field4493 = (int) ((float) (class329.field4493 - class397.field5795) * var5 + (float) class397.field5795);
        int var6 = class94.field1399 - class186.field2704;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class94.field1399 = (int) ((float) var6 * var5 + (float) class186.field2704);
        class94.field1399 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 53)
    public static void method2467(int arg0) {
        field6017 = null;
        field6018 = null;
        if (arg0 != 100) {
            field6018 = null;
        }
    }
}
