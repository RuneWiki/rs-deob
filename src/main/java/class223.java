import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class223 extends class269 {

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3604 = " ";

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field3606 = -1;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "Lid;")
    public static class149 field3608;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method1518(int arg0) {
        field3604 = null;
        field3608 = null;
        int var1 = -22 / ((arg0 - 69) / 46);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IZBILgk;Lgk;Z)I")
    public static final int method1519(int arg0, boolean arg1, byte arg2, int arg3, class157 arg4, class157 arg5, boolean arg6) {
        if (arg2 != -122) {
            field3606 = -40;
        }
        int var7 = class79.method542(arg3, -78, arg4, arg5, arg6);
        field3607++;
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var8 = class79.method542(arg0, arg2 + 163, arg4, arg5, arg1);
            return arg1 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 > -83) {
            return -90;
        }
        int var7 = arg1 & 0x3;
        field3610++;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return arg6;
        } else if (var7 == 2) {
            return 7 + 1 - arg4 - arg5;
        } else {
            return 7 + 1 - arg6 - arg2;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I[[I)V")
    public static final void method1521(int arg0, int[][] arg1) {
        class106.field1637 = arg1;
        int var2 = -106 / ((arg0 + 75) / 39);
        field3603++;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static final void method1522(int arg0) {
        class79.field1136.method1420(-1);
        field3605++;
        int var1 = 44 / ((40 - arg0) / 55);
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)[Lfg;")
    public static final class12[] method1523(int arg0) {
        field3611++;
        class12[] var1 = new class12[class35.field454];
        for (int var2 = 0; var2 < class35.field454; var2++) {
            int var3 = class236.field3777[var2] * class228.field3696[var2];
            byte[] var4 = class101.field1574[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class72.field1023[class224.method1526(255, var4[var6])];
            }
            var1[var2] = new class12(class46.field583, class209.field3253, class206.field3221[var2], class226.field3653[var2], class236.field3777[var2], class228.field3696[var2], var5);
        }
        class222.method1506((byte) -16);
        if (arg0 < 4) {
            field3609 = 108;
        }
        return var1;
    }
}
