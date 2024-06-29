import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class256 {

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field4478 = 500;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Z")
    public static boolean field4470 = false;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field4481 = 0;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field4475 = 0;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "Lid;")
    public static class149 field4482 = class60.method382("RuneScape wird geladen )2 bitte warten)3)3)3", (byte) 44);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public int field4477;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public int field4484;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public int field4485;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "[[[B")
    public static byte[][][] field4480;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Z")
    public final boolean method1762(int arg0) {
        int var2 = 107 % ((65 - arg0) / 59);
        field4471++;
        return (this.field4485 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)Z")
    public final boolean method1763(byte arg0) {
        if (arg0 >= -89) {
            return false;
        } else {
            field4472++;
            return (this.field4485 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)Z")
    public final boolean method1764(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field4468++;
            return (this.field4485 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lal;Z)I")
    public static final int method1765(class230 arg0, boolean arg1) {
        field4486++;
        int var2 = 0;
        if (arg0.method1556(class252.field4424, true)) {
            var2++;
        }
        if (arg0.method1556(class214.field3784, !arg1)) {
            var2++;
        }
        if (arg0.method1556(class155.field2841, true)) {
            var2++;
        }
        if (arg0.method1556(class176.field3229, true)) {
            var2++;
        }
        if (arg0.method1556(class115.field1968, true)) {
            var2++;
        }
        if (arg0.method1556(class195.field3505, true)) {
            var2++;
        }
        if (arg0.method1556(class161.field2996, !arg1)) {
            var2++;
        }
        if (arg1) {
            return -54;
        }
        if (arg0.method1556(class97.field1730, !arg1)) {
            var2++;
        }
        if (arg0.method1556(class50.field904, !arg1)) {
            var2++;
        }
        if (arg0.method1556(class192.field3445, !arg1)) {
            var2++;
        }
        if (arg0.method1556(class126.field2217, !arg1)) {
            var2++;
        }
        if (arg0.method1556(class259.field4554, true)) {
            var2++;
        }
        if (arg0.method1556(class113.field1933, true)) {
            var2++;
        }
        if (arg0.method1556(class258.field4518, true)) {
            var2++;
        }
        if (arg0.method1556(class272.field4899, true)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
    public static void method1766(byte arg0) {
        field4482 = null;
        if (arg0 != -125) {
            method1765((class230) null, true);
        }
        field4480 = null;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static final void method1767(int arg0) {
        field4474++;
        if (arg0 != 100) {
            method1765((class230) null, false);
        }
        class259.field4552.method1291(0);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLqk;IZILqk;B)I")
    public static final int method1768(boolean arg0, class208 arg1, int arg2, boolean arg3, int arg4, class208 arg5, byte arg6) {
        int var7 = class164.method1201((byte) -88, arg5, arg0, arg4, arg1);
        field4479++;
        if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (arg6 > -3) {
            return 94;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var8 = class164.method1201((byte) -88, arg5, arg3, arg2, arg1);
            return arg3 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method1769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4473++;
        class246.field4321 = arg1;
        class197.field3584 = arg5;
        class273.field4903 = arg3;
        if (arg4 > -55) {
            field4481 = -27;
        }
        class2.field31 = arg2;
        class156.field2873 = arg0;
        if (arg6 && class156.field2873 >= 100) {
            class2.field29 = class197.field3584 * 128 + 64;
            class269.field4853 = class246.field4321 * 128 + 64;
            class10.field140 = class287.method1968(class277.field4948, class269.field4853, class2.field29, (byte) 111) - class2.field31;
        }
        class194.field3468 = 2;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)Z")
    public final boolean method1770(boolean arg0) {
        if (!arg0) {
            field4482 = null;
        }
        field4469++;
        return (this.field4485 & 0x2) != 0;
    }
}
