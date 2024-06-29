import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class661 extends class656 {

    @OriginalMember(owner = "client!lw", name = "n", descriptor = "I")
    public int field8725;

    @OriginalMember(owner = "client!lw", name = "p", descriptor = "I")
    public int field8727;

    @OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
    public int field8729;

    @OriginalMember(owner = "client!lw", name = "m", descriptor = "I")
    public int field8724;

    @OriginalMember(owner = "client!lw", name = "k", descriptor = "I")
    public int field8722;

    @OriginalMember(owner = "client!lw", name = "l", descriptor = "Z")
    public boolean field8723;

    @OriginalMember(owner = "client!lw", name = "i", descriptor = "[Z")
    public static boolean[] field8720 = new boolean[200];

    @OriginalMember(owner = "client!lw", name = "j", descriptor = "[I")
    public static int[] field8721 = new int[64];

    @OriginalMember(owner = "client!lw", name = "o", descriptor = "I")
    public static int field8726;

    @OriginalMember(owner = "client!lw", name = "q", descriptor = "I")
    public static int field8728;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V", line = 14)
    public static final void method3583(byte arg0) {
        if (arg0 != 70) {
            method3583((byte) 66);
        }
        field8726++;
        class78.field953.method2138(arg0 ^ 0xFFFFFFB9);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V", line = 25)
    public static void method3584(int arg0) {
        if (arg0 == 255) {
            field8720 = null;
            field8721 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(IIIIIZ)V", line = 42)
    public class661(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field8725 = arg4;
        this.field8727 = arg1;
        this.field8729 = arg0;
        this.field8724 = arg2;
        this.field8722 = arg3;
        this.field8723 = arg5;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIII)V", line = 55)
    public static final void method3585(int arg0, int arg1, int arg2, int arg3) {
        field8728++;
        int var4 = arg2 * class411.field5711.field3899.method2432(true) >> 8;
        if (arg0 != 64) {
            method3584(108);
        }
        if (var4 == 0 || arg1 == -1) {
            return;
        }
        if (!class122.field1996 && class453.field6192 != -1 && class438.method2521(-94) && !class480.method2700(-1)) {
            class637.field8466 = class540.method3011(352);
            class3 var5 = class729.method4091((byte) -98, class637.field8466);
            class75.method606(true, var5, true);
        }
        class238.method1498(false, 80, arg1, 0, var4, class680.field9504);
        class26.method246(255, -1, 2);
        class122.field1996 = true;
    }
}
