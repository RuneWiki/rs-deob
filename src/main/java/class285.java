import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public abstract class class285 {

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Z")
    public boolean field3617 = true;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public int field3624 = 0;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public int field3626 = 0;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Z")
    public boolean field3625 = false;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Z")
    public boolean field3622 = true;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "Z")
    public boolean field3640 = false;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public int field3630 = 127;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "Z")
    public boolean field3628 = false;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public int field3621 = 0;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public int field3649 = 2;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    public int field3639 = 1;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public int field3643 = 0;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "Z")
    public boolean field3638 = true;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "Z")
    public boolean field3636 = true;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Z")
    public boolean field3616 = true;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Z")
    public boolean field3620 = true;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    public int field3635 = 2;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public int field3619 = 127;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public int field3645 = 0;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "Z")
    public boolean field3652 = true;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "Z")
    public boolean field3627 = true;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Z")
    public boolean field3618 = true;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Z")
    public boolean field3623 = true;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public int field3644 = 0;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public int field3629 = 255;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "Z")
    public boolean field3654 = true;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
    public int field3655 = 3;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "Z")
    public boolean field3634 = true;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
    public int field3656 = 2;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public int field3648 = 2;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    public int field3650 = 0;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public static int field3646 = 0;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Z")
    public boolean field3615;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "Z")
    public boolean field3633;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "Z")
    public boolean field3637;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "[Ll;")
    public static class16[] field3653;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZB)V", line = 16)
    public final void method1679(int arg0, boolean arg1, byte arg2) {
        if (arg2 >= -16) {
            return;
        }
        if (arg0 == 1 || arg0 == 3) {
            this.field3637 = arg1;
        } else {
            this.field3633 = arg1;
        }
        field3632++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIIBIIIII)V", line = 109)
    public static final void method1680(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field3647++;
        if (class520.field7520 == null) {
            return;
        }
        class375 var15;
        if (arg12 >= 0) {
            int var14 = arg12 - 1;
            var15 = class187.field2446[var14];
        } else {
            int var16 = -arg12 - 1;
            if (class66.field858 == var16) {
                var15 = class23.field336;
            } else {
                var15 = class387.field5107[var16];
            }
        }
        if (var15 == null) {
            return;
        }
        class102 var17 = class315.field4017.method1958(-10091, arg10);
        int var18;
        int var19;
        if (arg9 == 1 || arg9 == 3) {
            var19 = var17.field1282;
            var18 = var17.field1272;
        } else {
            var18 = var17.field1282;
            var19 = var17.field1272;
        }
        int var20 = arg0 + (var19 >> 1);
        int var21 = (var19 + 1 >> 1) + arg0;
        int var22 = (var18 >> 1) + arg4;
        int var23 = arg4 + (var18 + 1 >> 1);
        class143 var24 = class520.field7520[arg1];
        int var25 = var24.method399(var20, var22) + (var24.method399(var21, var22) + var24.method399(var20, var23)) + var24.method399(var21, var23) >> 2;
        class426 var26 = new class426();
        var26.field6048 = arg4;
        var26.field6056 = class163.field2065 + arg2;
        var26.field6047 = arg0;
        var26.field6057 = arg10;
        var26.field6043 = arg9;
        if (arg6 > arg3) {
            int var27 = arg6;
            arg6 = arg3;
            arg3 = var27;
        }
        var26.field6054 = var15.field2676;
        var26.field6055 = class163.field2065 + arg7;
        var26.field6045 = arg13;
        var26.field6053 = arg0 + arg6;
        var26.field6060 = arg0 + arg3;
        if (arg5 > arg11) {
            int var28 = arg5;
            arg5 = arg11;
            arg11 = var28;
        }
        var26.field6051 = (var26.field6048 << 7) + (var18 << 6);
        int var29 = -113 % ((arg8 + 14) / 55);
        var26.field6052 = (var26.field6047 << 7) + (var19 << 6);
        var26.field6058 = arg4 + arg5;
        var26.field6046 = var25;
        var26.field6063 = arg4 + arg11;
        class124.field1662.method163(var26, 0);
        var15.field4939 = var26;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I", line = 214)
    public final int method1681(int arg0, int arg1) {
        field3641++;
        if (arg1 == -28198) {
            return arg0 == 1 || arg0 == 3 ? this.field3649 : this.field3645;
        } else {
            return -51;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 226)
    public static void method1682(int arg0) {
        if (arg0 == 916811041) {
            field3653 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V", line = 246)
    public final void method1683(int arg0, int arg1, int arg2) {
        if (arg1 == 1 || arg1 == 3) {
            this.field3649 = arg2;
        } else {
            this.field3645 = arg2;
        }
        field3631++;
        if (arg0 < 111) {
            this.field3645 = -33;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)Z", line = 291)
    public final boolean method1684(int arg0, int arg1) {
        field3651++;
        if (arg0 == -2) {
            return arg1 == 1 || arg1 == 3 ? this.field3637 : this.field3633;
        } else {
            return false;
        }
    }
}
