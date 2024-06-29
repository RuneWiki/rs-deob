import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class201 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "[I")
    public static int[] field3658 = new int[2500];

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lvm;")
    public static class297 field3662 = new class297(20);

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field3664 = 0;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Lke;")
    public static class256 field3666 = class316.method2202("_labels", 27626);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Lce;")
    public static class126 field3665;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 9)
    public static final void method1436(int arg0) {
        class297.field5156.method2084(-110);
        field3661++;
        class114.field2008.method2084(127);
        if (arg0 <= 107) {
            method1437(-65, 89, -70, -22, 2, 21);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIII)V", line = 21)
    public static final void method1437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 <= class274.field4748 && class105.field1887 <= arg0) {
            boolean var6;
            if (class244.field4161 > arg2) {
                var6 = false;
                arg2 = class244.field4161;
            } else if (arg2 > class175.field3106) {
                var6 = false;
                arg2 = class175.field3106;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg1 < class244.field4161) {
                arg1 = class244.field4161;
                var7 = false;
            } else if (arg1 > class175.field3106) {
                var7 = false;
                arg1 = class175.field3106;
            } else {
                var7 = true;
            }
            if (class105.field1887 <= arg4) {
                class73.method550(-29903, class308.field5329[arg4++], arg1, arg2, arg5);
            } else {
                arg4 = class105.field1887;
            }
            if (arg0 > class274.field4748) {
                arg0 = class274.field4748;
            } else {
                class73.method550(-29903, class308.field5329[arg0--], arg1, arg2, arg5);
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg0; var8++) {
                    int[] var9 = class308.field5329[var8];
                    var9[arg2] = var9[arg1] = arg5;
                }
            } else if (var6) {
                for (int var10 = arg4; var10 <= arg0; var10++) {
                    class308.field5329[var10][arg2] = arg5;
                }
            } else if (var7) {
                for (int var11 = arg4; var11 <= arg0; var11++) {
                    class308.field5329[var11][arg1] = arg5;
                }
            }
        }
        if (arg3 <= 76) {
            field3666 = (class256) null;
        }
        field3660++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lra;I)V", line = 139)
    public static final void method1438(class41 arg0, int arg1) {
        for (int var2 = 0; var2 < class88.field1580; var2++) {
            int var3 = arg0.method354((byte) -128);
            int var4 = arg0.method346(-16);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class316.field5448[var3] != null) {
                class316.field5448[var3].field3633 = var4;
            }
        }
        int var5 = -100 / ((-arg1 - 61) / 52);
        field3659++;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V", line = 182)
    public static void method1439(int arg0) {
        if (arg0 != -18195) {
            field3664 = -120;
        }
        field3658 = null;
        field3665 = null;
        field3666 = null;
        field3662 = null;
    }
}
