import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class444 implements class365 {

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "J")
    public static long field6331 = -1L;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "Z")
    public static boolean field6332 = false;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I", line = 3)
    public static int method2618(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([IJII)Ljava/lang/String;", line = 18)
    public final String method2213(int[] arg0, long arg1, int arg2, int arg3) {
        field6333++;
        if (arg2 == arg3) {
            class64 var6 = class327.field4708.method1889(arg0[0], -36);
            return var6.method335(118, (int) arg1);
        } else if (arg3 == 1 || arg3 == 10) {
            class385 var7 = class422.field6096.method121((int) arg1, -1);
            return var7.field5469;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class327.field4708.method1889(arg0[0], -125).method335(124, (int) arg1);
        } else {
            return null;
        }
    }
}
