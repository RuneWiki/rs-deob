import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class58 {

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field1145 = 4;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public static int field1150 = 0;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    public static int field1151 = 7000;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public static int field1146 = field1151;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "Lke;")
    public static class598 field1147;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "[I")
    public static int[] field1149;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V", line = 14)
    public static void method612(int arg0) {
        if (arg0 != 3) {
            method613(null, true, null, (byte) 70);
        }
        field1149 = null;
        field1147 = null;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;B)V", line = 26)
    public static final void method613(String arg0, boolean arg1, String arg2, byte arg3) {
        field1148++;
        class624.field8547 = arg0;
        class463.field6510 = arg2;
        class390.field5664 = arg1;
        if (!class390.field5664 && class624.field8547.equals("") || class463.field6510.equals("")) {
            class204.method1420(3, (byte) -100);
            return;
        }
        int var4 = 34 % ((16 - arg3) / 55);
        if (class640.field8799 != 1) {
            class565.field7792 = 0;
            class71.field1294 = -1;
        }
        class145.field2406 = false;
        class204.method1420(-3, (byte) -94);
        class399.field5899 = 1;
        class10.field141 = 0;
        class576.field7899 = 0;
    }
}
