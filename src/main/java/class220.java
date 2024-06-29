import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class220 extends class237 {

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public int field3520 = -1;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public int field3516 = 0;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "[I")
    public static int[] field3525 = new int[5];

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "[Lti;")
    public static class169[] field3526 = new class169[50];

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public static int field3528 = 0;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public int field3513;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public int field3515;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public int field3517;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public int field3518;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public int field3519;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public int field3523;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public int field3527;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public int field3529;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public int field3530;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V")
    public static void method1555(byte arg0) {
        if (arg0 == 111) {
            field3525 = null;
            field3526 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILid;)V")
    public static final void method1556(int arg0, class230 arg1) {
        field3521++;
        int var2 = arg1.field3799 - class73.field924;
        int var3 = arg1.field3748 * 128 + (arg1.method1638(-6377) * 64);
        int var4 = arg1.field3785 * 128 + (arg0 * arg1.method1638(-6377));
        arg1.field3821 = 0;
        if (arg1.field3764 == 0) {
            arg1.field3835 = 1024;
        }
        arg1.field3818 += (var3 - arg1.field3818) / var2;
        arg1.field3820 += (var4 - arg1.field3820) / var2;
        if (arg1.field3764 == 1) {
            arg1.field3835 = 1536;
        }
        if (arg1.field3764 == 2) {
            arg1.field3835 = 0;
        }
        if (arg1.field3764 == 3) {
            arg1.field3835 = 512;
        }
    }
}
