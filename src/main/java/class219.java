import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class219 extends class100 {

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "[Lik;")
    public static class78[] field3788 = new class78[5];

    @OriginalMember(owner = "client!ft", name = "t", descriptor = "I")
    public static int field3796 = -2;

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
    public int field3789;

    @OriginalMember(owner = "client!ft", name = "n", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!ft", name = "p", descriptor = "I")
    public int field3792;

    @OriginalMember(owner = "client!ft", name = "r", descriptor = "I")
    public int field3794;

    @OriginalMember(owner = "client!ft", name = "s", descriptor = "I")
    public int field3795;

    @OriginalMember(owner = "client!ft", name = "q", descriptor = "Lou;")
    public class197 field3793;

    @OriginalMember(owner = "client!ft", name = "o", descriptor = "[Los;")
    public static class185[] field3791;

    static {
        for (int var0 = 0; var0 < field3788.length; var0++) {
            field3788[var0] = new class78();
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Li;III[Z)Z", line = 10)
    public static final boolean method1506(class515 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class360.field5592 != class320.field5039) {
            int var6 = class511.field7488[arg1].method1517(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class220 var8 = class511.field7488[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1517(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1521(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1509(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "([J[Ljava/lang/Object;B)V", line = 49)
    public static final void method1507(long[] arg0, Object[] arg1, byte arg2) {
        int var3 = -106 % ((-arg2 - 6) / 53);
        class491.method2866(arg0, 0, (byte) 20, arg0.length - 1, arg1);
        field3790++;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)V", line = 60)
    public static void method1508(byte arg0) {
        field3791 = null;
        field3788 = null;
        if (arg0 <= 29) {
            field3788 = null;
        }
    }
}
