import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class155 {

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "Lct;")
    public static class285 field2160 = new class285(58, 7);

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "[I")
    public static int[] field2161 = new int[14];

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "Z")
    public static boolean field2162 = false;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "Lct;")
    public static class285 field2163 = new class285(35, 18);

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field2164 = -1;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)V", line = 8)
    public static final void method1058(int arg0, int arg1) {
        if (arg0 <= 122) {
            return;
        }
        class303.field4512 = -1;
        field2158++;
        if (arg1 == 37) {
            class189.field2894 = 3.0F;
        } else if (arg1 == 50) {
            class189.field2894 = 4.0F;
        } else if (arg1 == 75) {
            class189.field2894 = 6.0F;
        } else if (arg1 == 100) {
            class189.field2894 = 8.0F;
        } else if (arg1 == 200) {
            class189.field2894 = 16.0F;
        }
        class303.field4512 = -1;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V", line = 41)
    public static final void method1059(int arg0) {
        field2159++;
        class336.field5036.method585(((float) class337.field5038.field3932 * 0.1F + 0.7F) * class345.field5252);
        if (arg0 == -23097) {
            class336.field5036.method575(class244.field3498, class286.field4371, class360.field5460, (float) class389.field5723, (float) class389.field5725, (float) class422.field6046);
            class336.field5036.method498(class58.field809);
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V", line = 59)
    public static void method1060(int arg0) {
        field2161 = null;
        field2163 = null;
        field2160 = null;
        if (arg0 != 100) {
            field2161 = null;
        }
    }
}
