import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class410 {

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "Z")
    public static boolean field6174 = false;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "[I")
    public static int[] field6170 = new int[8];

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field6171 = 0;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method2470(int arg0, int arg1, int arg2, int arg3) {
        field6172++;
        class234 var4 = class491.field7281[arg0][arg1];
        if (arg3 < 95) {
            method2471(113, 21);
        }
        class420.method2526(var4 == null ? class235.field3486 : var4, arg2, false);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I", line = 18)
    public static final int method2471(int arg0, int arg1) {
        if (arg1 != 1023) {
            method2470(-82, 24, 115, -121);
        }
        field6173++;
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 50)
    public static void method2472(int arg0) {
        if (arg0 == -1) {
            field6170 = null;
        }
    }
}
