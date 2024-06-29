import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public abstract class class203 {

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public int field3686;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public int field3696;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public int field3688;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Llc;")
    public static class143 field3683 = class66.method374("ul", -1);

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "Llc;")
    public static class143 field3687 = class66.method374("Starte 3D)2Softwarebibliothek)3", -1);

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "Llc;")
    public static class143 field3684 = class66.method374(")4", -1);

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "Llc;")
    private static class143 field3693 = class66.method374("Loaded world list data", -1);

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Llc;")
    public static class143 field3689 = field3693;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "[I")
    public static int[] field3690 = new int[32];

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "Lbg;")
    public static class177 field3695 = new class177(64);

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field3697 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IBI)V")
    public abstract void method497(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1383(int arg0, int arg1, int arg2, int arg3) {
        if (class264.method1764(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class89.method514(var4 + 1, class192.field3535[arg0][arg1][arg2] + arg3, var5 + 1) && class89.method514(var4 + 128 - 1, class192.field3535[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class89.method514(var4 + 128 - 1, class192.field3535[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class89.method514(var4 + 1, class192.field3535[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
    public static final void method1384(int arg0, int arg1, int arg2) {
        field3692++;
        class148.field2691[arg2] = arg1;
        class208 var3 = (class208) class55.field1062.method1824((long) arg2, 0);
        if (var3 == null) {
            class208 var4 = new class208(class205.method1403(-112) + 500L);
            class55.field1062.method1825(var4, (byte) 64, (long) arg2);
        } else {
            var3.field3820 = class205.method1403(-109) + 500L;
        }
        if (arg0 != 1) {
            field3693 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILvh;)V")
    public static final void method1385(int arg0, class43 arg1) {
        field3685++;
        class43 var2 = class263.method1756(arg1, (byte) -98);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class269.field4820;
            var4 = class10.field222;
        } else {
            var3 = var2.field831;
            var4 = var2.field735;
        }
        if (arg0 > -112) {
            method1387(-123, false);
        }
        class263.method1754(var4, var3, (byte) -65, arg1, false);
        class50.method302(arg1, (byte) 88, var3, var4);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BII)V")
    public abstract void method500(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
    public static void method1386(byte arg0) {
        int var1 = -113 % ((-arg0 - 44) / 35);
        field3690 = null;
        field3687 = null;
        field3684 = null;
        field3683 = null;
        field3695 = null;
        field3693 = null;
        field3689 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZ)V")
    public static final void method1387(int arg0, boolean arg1) {
        field3681++;
        class232.field4237.method835(1, arg0);
        if (arg1) {
            method1383(-6, -19, -28, -80);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method1388(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3) {
            field3684 = null;
        }
        if (class31.field481 <= arg5 && arg2 <= class9.field173 && arg6 >= class188.field3398 && class239.field4321 >= arg0) {
            class242.method1612(arg4, arg6, arg1, (byte) -63, arg0, arg2, arg5, arg7);
        } else {
            class289.method1932(arg5, arg7, arg2, arg4, (byte) -116, arg0, arg1, arg6);
        }
        field3682++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BZIIIIIIIIII)Z")
    public static final boolean method1389(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field3694++;
        if (class229.field4195.method218((byte) -122) == 2) {
            return class192.method1298(arg4, arg1, arg5, false, arg2, arg8, arg6, arg3, arg7, arg9, arg10, arg11);
        } else if (class229.field4195.method218((byte) -128) > 2) {
            return class166.method1093(arg2, arg7, arg6, class229.field4195.method218((byte) -126), (byte) -61, arg4, arg10, arg8, arg9, arg5, arg11, arg1, arg3);
        } else {
            if (arg0 > -2) {
                method1387(-30, false);
            }
            return class189.method1228(-1, arg3, arg1, arg8, arg9, arg5, arg10, arg6, arg7, arg2, arg11, arg4);
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(III)V")
    public abstract void method498(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(III)V")
    public class203(int arg0, int arg1, int arg2) {
        this.field3686 = arg2;
        this.field3696 = arg0;
        this.field3688 = arg1;
    }
}
