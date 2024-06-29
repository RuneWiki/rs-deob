import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class196 {

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field2635 = -1;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "F")
    public static float field2634;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)Z", line = 11)
    public static final boolean method1205(int arg0, int arg1, int arg2) {
        if (arg2 != 12700) {
            field2634 = -0.8107551F;
        }
        field2638++;
        if (((arg0 & 0x10000) != 0 | class670.method3782(arg1, 544, arg0)) || class381.method2386((byte) -59, arg0, arg1)) {
            return true;
        } else {
            return (arg1 & 0x37) == 0 && class489.method2970(true, arg0, arg1);
        }
    }
}
