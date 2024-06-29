import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class273 extends class324 {

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "Lqf;")
    public static class593 field3814 = null;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "[F")
    public static float[] field3816 = new float[16];

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "Lqf;")
    public static class593 field3821 = null;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
    public int field3817;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "I")
    public int field3825;

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "Lfda;")
    public static class270 field3824;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "[I")
    public int[] field3815;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "[I")
    public int[] field3819;

    @OriginalMember(owner = "client!fp", name = "r", descriptor = "[I")
    public int[] field3822;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "[Loc;")
    public class175[] field3818;

    @OriginalMember(owner = "client!fp", name = "s", descriptor = "[Loc;")
    public class175[] field3823;

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "[[[B")
    public byte[][][] field3826;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V", line = 12)
    public static void method1782(byte arg0) {
        field3821 = null;
        field3824 = null;
        int var1 = 33 % ((arg0 + 60) / 53);
        field3814 = null;
        field3816 = null;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IB)V", line = 30)
    public static final void method1783(int arg0, byte arg1) {
        field3820++;
        class467 var2 = class541.method3144(arg0, (byte) -128, 6);
        var2.method2852(0);
        if (arg1 != 101) {
            method1782((byte) -40);
        }
    }
}
