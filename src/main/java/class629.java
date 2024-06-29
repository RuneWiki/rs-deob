import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class629 {

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "Lnj;")
    public static class415 field8779 = new class415(13, 15);

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
    public static int field8781 = 0;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public static int field8777;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field8778;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
    public static final void method3489(int arg0) {
        if (arg0 != 16711680) {
            field8779 = null;
        }
        if (class529.field6872 >= 0) {
            long var1 = class584.method3191(arg0 - 16711679);
            class529.field6872 = (int) ((long) class529.field6872 - (var1 - class514.field6728));
            if (class529.field6872 <= 0) {
                class168.field2095 = class597.field8080.field7294;
                class529.field6872 = -1;
                class705.field9822 = class597.field8080.field7291;
                class7.field67 = class597.field8080.field7293;
                class37.field536 = class597.field8080.field7299;
                class17.field193 = class597.field8080.field7290;
                class80.field1105 = class597.field8080.field7304;
                class460.field6033 = class597.field8080.field7297;
                class196.field2561 = class597.field8080.field7305;
                class249.field3369 = class597.field8080.field7303;
                class407.field5182 = class597.field8080.field7292;
            } else {
                int var3 = (class529.field6872 << 8) / class710.field9922;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class460.field6033 = ((class103.field1370 & 0xFF00) * var3 + (class597.field8080.field7297 & 0xFF00) * var4 & 0xFF0000) + ((class103.field1370 & 0xFF00FF) * var3 + (class597.field8080.field7297 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class7.field67 = (class597.field8080.field7293 - class603.field8120) * var6 + class603.field8120;
                class705.field9822 = class13.field150 * var3 + class597.field8080.field7291 * var4 >> 8;
                class249.field3369 = (class597.field8080.field7303 - class199.field2600) * var6 + class199.field2600;
                class407.field5182 = ((class531.field6906 & 0xFF00) * var3 + ((class597.field8080.field7292 & 0xFF00) * var4) & 0xFF0000) + ((class531.field6906 & 0xFF00FF) * var3 + (class597.field8080.field7292 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class37.field536 = (class597.field8080.field7299 - class458.field6004) * var6 + class458.field6004;
                class80.field1105 = (class597.field8080.field7304 - class107.field1397) * var6 + class107.field1397;
                class168.field2095 = (class597.field8080.field7294 - class480.field6404) * var6 + class480.field6404;
                class196.field2561 = (class597.field8080.field7305 - class352.field4526) * var6 + class352.field4526;
                if (class381.field4889 != class597.field8080.field7290) {
                    class17.field193 = class408.field5286.method188(class381.field4889, class597.field8080.field7290, var6, class17.field193);
                }
            }
            class514.field6728 = var1;
        }
        field8780++;
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)[Lbn;")
    public static final class465[] method3490(int arg0) {
        if (arg0 != 570293128) {
            method3490(-64);
        }
        field8777++;
        return new class465[] { class206.field2649, class206.field2653, class206.field2654, class206.field2655, class206.field2656, class206.field2657, class206.field2658, class206.field2659, class206.field2660, class206.field2661, class206.field2662, class206.field2663, class206.field2664, class206.field2665 };
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)V")
    public static void method3491(int arg0) {
        if (arg0 != 15) {
            method3489(-22);
        }
        field8779 = null;
    }
}
