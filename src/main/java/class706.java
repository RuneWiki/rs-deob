import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class706 {

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "[I")
    public static int[] field9985 = new int[13];

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field9988 = 0;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public static int field9990 = 0;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "[J")
    public static long[] field9995 = new long[100];

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "F")
    public static float field9986;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "F")
    public static float field9994;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public int field9984;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public static int field9992;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public static int field9993;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "Lgg;")
    public class159 field9989;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "[I")
    public int[] field9987;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "[Lf;")
    public static class702[] field9991;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V", line = 9)
    public static final void method3985(byte arg0) {
        if (arg0 <= 19) {
            method3986((byte) 74);
        }
        field9992++;
        if (class623.field8796) {
            return;
        }
        class328.field5085 = true;
        if (class17.field282.field4878) {
            class162.field2746 = ((int) class162.field2746 + 47 & 0xFFFFFFF0);
        } else {
            class254.field4045 += (12.0F - class254.field4045) / 2.0F;
        }
        class623.field8796 = true;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(B)V", line = 59)
    public static void method3986(byte arg0) {
        if (arg0 != -24) {
            field9990 = -101;
        }
        field9991 = null;
        field9985 = null;
        field9995 = null;
    }
}
