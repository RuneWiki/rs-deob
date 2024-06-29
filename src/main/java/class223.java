import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class223 {

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Z")
    public static boolean field4068 = true;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field4071 = 1;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "[S")
    public static short[] field4074 = new short[256];

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Lde;")
    public static class108 field4069;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Lsj;")
    public static class49 field4072;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "[I")
    public static int[] field4073;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "[I")
    public static int[] field4075;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)V")
    public static final void method1572(boolean arg0, int arg1) {
        class159.field2900 = new int[104];
        class234.field4219 = new int[104];
        class158.field2889 = new int[104];
        class79.field1464 = new int[104];
        field4066++;
        class249.field4483 = new int[104];
        class84.field1669 = 99;
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        if (arg1 <= 76) {
            field4072 = null;
        }
        class80.field1497 = new byte[var2][105][105];
        class14.field266 = new byte[var2][104][104];
        class44.field868 = new byte[var2][104][104];
        class47.field914 = new byte[var2][104][104];
        class284.field5009 = new byte[var2][104][104];
        class97.field1887 = new int[var2][105][105];
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIII)V")
    public static final void method1573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4070++;
        int var9 = arg3 + 1;
        class176.method1215(arg1, arg0, class252.field4543[arg3], arg5, (byte) 125);
        int var8 = arg2 - 1;
        class176.method1215(arg1, arg0, class252.field4543[arg2], arg5, (byte) 108);
        if (arg4 != 140) {
            method1572(false, 9);
        }
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class252.field4543[var6];
            var7[arg1] = var7[arg5] = arg0;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)Led;")
    public static final class181 method1574(int arg0, int arg1, int arg2) {
        class109 var3 = class106.field2089[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2218;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
    public static final void method1575(int arg0, int arg1) {
        field4065++;
        if (class161.method1111((byte) 67, arg0)) {
            class34.method265((byte) 127, arg1, class50.field984[arg0]);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static void method1576(byte arg0) {
        field4075 = null;
        field4072 = null;
        field4073 = null;
        if (arg0 == 112) {
            field4074 = null;
            field4069 = null;
        }
    }
}
