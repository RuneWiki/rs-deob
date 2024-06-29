import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class467 extends class264 {

    @OriginalMember(owner = "client!qv", name = "n", descriptor = "I")
    public static int field6635 = 0;

    @OriginalMember(owner = "client!qv", name = "q", descriptor = "Z")
    public static boolean field6638 = true;

    @OriginalMember(owner = "client!qv", name = "o", descriptor = "I")
    public static int field6636 = -1;

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!qv", name = "m", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!qv", name = "r", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!qv", name = "s", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!qv", name = "t", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!qv", name = "u", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "[[B")
    public static byte[][] field6632;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        if (arg0 != -38) {
            return 127;
        } else {
            ++field6640;
            return super.field3731.method3639(true) == class234.field3384 && super.field3731.method3633(123) ? 0 : 1;
        }
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        int var2 = 84 % ((1 - arg0) / 41);
        super.field3733 = this.method663((byte) -38);
        ++field6634;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        super.field3733 = arg1;
        ++field6642;
        if (arg0 > -114) {
            this.method663((byte) -17);
        }
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(ILmfa;)V")
    public class467(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)V")
    public static void method2755(int arg0) {
        if (arg0 != 1) {
            field6632 = null;
        }
        field6632 = null;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IB)V")
    public static final void method2756(int arg0, byte arg1) {
        ++field6639;
        class222.field3160 = arg0;
        class544.field7651 = 2;
        if (arg1 <= 96) {
            method2755(124);
        }
        long var2 = 0L;
        if (class669.field9400 == null) {
            class399.method2423(201, 35);
        } else {
            class120 var4 = new class120(class130.method939((byte) 78, class266.method1750(-30703, class669.field9400)));
            long var5 = var4.method834(-8616);
            class530.field7517 = var4.method834(-8616);
            class731.method4097("", 31533, true, class520.method3030((byte) 65, var5));
        }
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(B)I")
    public final int method2757(byte arg0) {
        if (arg0 >= -31) {
            return -91;
        } else {
            ++field6641;
            return super.field3733;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(BIIIIII)V")
    public static final void method2758(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~class450.field6463 >= ~arg2 && ~class285.field4372 <= ~arg4 && arg6 >= class738.field10297 && ~arg5 >= ~class414.field5846) {
            if (arg1 == 1) {
                class67.method526(arg5, arg6, arg2, arg3, (byte) 32, arg4);
            } else {
                class191.method1404(arg4, (byte) 126, arg1, arg3, arg2, arg5, arg6);
            }
        } else if (~arg1 == -2) {
            class422.method2522(75, arg3, arg2, arg5, arg4, arg6);
        } else {
            class493.method2881(arg3, arg6, arg1, arg5, 0, arg4, arg2);
        }
        if (arg0 != 11) {
            method2756(40, (byte) -26);
        }
        ++field6633;
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lmfa;)V")
    public class467(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        if (arg0 != 112) {
            return 3;
        } else {
            ++field6637;
            return 3;
        }
    }
}
