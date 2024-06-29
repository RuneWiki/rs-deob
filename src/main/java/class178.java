import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class178 {

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field2785 = 0;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "[I")
    public static int[] field2784 = new int[14];

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field2788 = 0;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "Lsk;")
    public static class423 field2789 = new class423("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "Z")
    public static boolean field2790 = false;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field2791 = new String[100];

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "J")
    public static long field2792 = 0L;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Lgq;")
    public static class340 field2786;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BII)Z")
    public static final boolean method1118(byte arg0, int arg1, int arg2) {
        field2787++;
        return arg0 >= -67 ? false : (class247.method1494(arg2, -15, arg1) | class313.method1873(arg1, (byte) 85, arg2) | class208.method1277(arg2, 24719, arg1)) & class370.method2241((byte) -120, arg2, arg1);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
    public static void method1119(byte arg0) {
        field2791 = null;
        field2786 = null;
        field2784 = null;
        field2789 = null;
        if (arg0 != 53) {
            method1118((byte) -33, -43, 25);
        }
    }
}
