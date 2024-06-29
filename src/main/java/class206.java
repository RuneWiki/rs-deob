import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class206 extends class26 {

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public int field2866;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public int field2865;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "[I")
    public static int[] field2864 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "[Lte;")
    public static class261[] field2869 = new class261[14];

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2868 = "Loaded update list";

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2861 = "red:";

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "[I")
    public static int[] field2872 = new int[256];

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "[F")
    public static float[] field2870 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "F")
    public static float field2874 = 0.0F;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field2860 = -1;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(BI)V", line = 5)
    public static final void method1493(byte arg0, int arg1) {
        field2873++;
        if (arg0 != 42) {
            method1494(76, (byte) 87);
        }
        for (class26 var2 = class227.field3259.method2277(13292); var2 != null; var2 = class227.field3259.method2278((byte) -117)) {
            if ((var2.field304 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method179((byte) 51);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)I", line = 26)
    public static final int method1494(int arg0, byte arg1) {
        if (arg1 != 22) {
            field2864 = (int[]) null;
        }
        field2867++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V", line = 37)
    public static void method1495(int arg0) {
        field2864 = null;
        field2872 = null;
        if (arg0 != -3909) {
            field2872 = (int[]) null;
        }
        field2868 = null;
        field2861 = null;
        field2869 = null;
        field2870 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILfh;IBIIZ)V", line = 58)
    public static final void method1496(int arg0, class140 arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        field2871++;
        class233.field3338 = arg2;
        class317.field4671 = arg5;
        class229.field3287 = arg1;
        class29.field330 = arg6;
        class314.field4639 = arg0;
        class172.field2384 = arg4;
        class194.field2673 = 1;
        if (arg3 >= -126) {
            method1495(-15);
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(II)V", line = 107)
    public class206(int arg0, int arg1) {
        this.field2866 = arg0;
        this.field2865 = arg1;
    }
}
