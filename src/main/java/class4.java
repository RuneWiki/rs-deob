import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 {

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "Z")
    public static boolean field35 = false;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "[I")
    public static int[] field37 = new int[13];

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V", line = 6)
    public static final void method10(byte arg0) throws IOException {
        if (arg0 < 77) {
            method11(true);
        }
        field34++;
        if (class582.field8161 == null || class758.field10572 <= 0) {
            return;
        }
        class505.field6853.field8520 = 0;
        while (true) {
            class103 var1 = (class103) class387.field5466.method724(32);
            if (var1 == null || class505.field6853.field8529.length - class505.field6853.field8520 < var1.field1386) {
                class582.field8161.method1434(-24305, class505.field6853.field8520, class505.field6853.field8529, 0);
                class677.field9451 += class505.field6853.field8520;
                class303.field4093 = 0;
                return;
            }
            class505.field6853.method3416(var1.field1379.field8529, var1.field1386, -1, 0);
            class758.field10572 -= var1.field1386;
            var1.method315(90);
            var1.field1379.method3400(0);
            var1.method706((byte) 6);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V", line = 45)
    public static void method11(boolean arg0) {
        if (arg0) {
            field36 = 59;
        }
        field37 = null;
    }
}
