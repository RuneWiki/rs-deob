import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class285 extends class194 {

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    private int field3926;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    private int field3925;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    private int field3930;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    private int field3928;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "[Lge;")
    public static class423[] field3921 = new class423[29];

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "[I")
    public static int[] field3924 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(III)V", line = 3)
    public final void method1042(int arg0, int arg1, int arg2) {
        ++field3929;
        if (arg0 != 0) {
            this.method1041(71, 49, 123);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lqj;ILqj;)V", line = 13)
    public static final void method1842(class296 arg0, int arg1, class296 arg2) {
        class24.field324 = arg0;
        class262.field3578 = arg2;
        ++field3922;
        class381.field5401 = class24.field324.method1911(0, arg1);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIII)V", line = 24)
    public class285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3926 = arg3;
        this.field3925 = arg0;
        this.field3930 = arg1;
        this.field3928 = arg2;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V", line = 36)
    public final void method1041(int arg0, int arg1, int arg2) {
        ++field3919;
        int var4 = this.field3925 * arg1 >> 12;
        if (arg2 != 0) {
            method1843((byte) 48);
        }
        int var5 = this.field3928 * arg1 >> 12;
        int var6 = this.field3930 * arg0 >> 12;
        int var7 = this.field3926 * arg0 >> 12;
        class12.method70(var4, var6, super.field2691, var7, var5, (byte) 2);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 55)
    public static void method1843(byte arg0) {
        field3921 = null;
        field3924 = null;
        if (arg0 != -114) {
            field3924 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)I", line = 75)
    public static final int method1844(int arg0, int arg1, int arg2, int arg3) {
        ++field3927;
        int var4 = arg0 / arg3;
        int var5 = arg3 + -1 & arg0;
        int var6 = arg1 / arg3;
        int var7 = arg1 & arg3 + -1;
        if (arg2 >= -61) {
            return 23;
        } else {
            int var8 = class194.method1291(var4, var6, -21153);
            int var9 = class194.method1291(var4 + 1, var6, -21153);
            int var10 = class194.method1291(var4, var6 - -1, -21153);
            int var11 = class194.method1291(var4 - -1, var6 + 1, -21153);
            int var12 = class446.method2782(true, var8, arg3, var9, var5);
            int var13 = class446.method2782(true, var10, arg3, var11, var5);
            return class446.method2782(true, var12, arg3, var13, var7);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)Ldq;", line = 111)
    public static final class414 method1845(byte arg0, int arg1) {
        ++field3918;
        class190 var2 = class412.field5982;
        class414 var3;
        synchronized (class412.field5982) {
            var3 = (class414) class412.field5982.method1246((byte) -37, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class65.field1029.method1920(arg1, false, 16);
            class414 var5 = new class414();
            if (var4 != null) {
                var5.method2651(new class371(var4), -1);
            }
            class190 var6 = class412.field5982;
            synchronized (class412.field5982) {
                if (arg0 <= 17) {
                    method1845((byte) 28, 119);
                }
                class412.field5982.method1247((long) arg1, (byte) 107, var5);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBLsh;)V", line = 141)
    public static final void method1846(int arg0, byte arg1, class44 arg2) {
        ++field3931;
        if (class403.field5872) {
            class403.field5872 = false;
            arg0 = 0;
        }
        if (arg1 != -28) {
            method1842((class296) null, -42, (class296) null);
        }
        if (class229.field3054 == null || !class229.field3054.method317(arg2, arg1 + -498)) {
            class229.field3054 = arg2;
            class76.field1193 = class224.method1425(-26805);
            class232.field3141 = arg0;
            class432.field6216 = arg0;
            if (~class432.field6216 != -1) {
                class294.field4062 = class83.field1272;
                class3.field35 = class115.field1674;
                class450.field6524 = class446.field6436;
                class249.field3450 = class182.field2551;
                class124.field1743 = class436.field6266;
                class141.field2020 = class250.field3462;
                class248.field3441 = class280.field3843;
                class41.field612 = class176.field2488;
                class450.field6531 = class9.field135;
                class65.field1028 = class262.field3577;
                return;
            }
            class194.method1292(16);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)V", line = 183)
    public final void method1039(byte arg0, int arg1, int arg2) {
        ++field3923;
        int var4 = this.field3925 * arg1 >> 12;
        int var5 = this.field3928 * arg1 >> 12;
        int var6 = this.field3930 * arg2 >> 12;
        int var7 = this.field3926 * arg2 >> 12;
        int var8 = -27 % ((9 - arg0) / 39);
        class429.method2704(var5, var6, (byte) -121, super.field2691, var7, super.field2686, super.field2685, var4);
    }
}
