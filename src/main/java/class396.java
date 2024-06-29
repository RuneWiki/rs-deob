import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class396 {

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
    public static int field4997 = 0;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "[I")
    public static int[] field5000 = new int[500];

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "J")
    public static long field4996;

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "[[[Z")
    public static boolean[][][] field4999;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IBIII)V", line = 7)
    public static final void method2125(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= class263.field3294 && arg3 <= class314.field4052) {
            int var5 = class605.method3315(arg4, 4095, class289.field3595, class159.field2063);
            int var6 = class605.method3315(arg0, arg1 ^ 0xFFE, class289.field3595, class159.field2063);
            class26.method181(arg2, var6, (byte) 117, arg3, var5);
        }
        field4998++;
        if (arg1 != 1) {
            field4999 = null;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)V", line = 30)
    public static void method2126(byte arg0) {
        field4999 = null;
        field5000 = null;
        if (arg0 <= 123) {
            field4997 = -52;
        }
    }
}
