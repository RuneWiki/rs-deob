import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class239 extends class169 implements class401 {

    @OriginalMember(owner = "client!vl", name = "O", descriptor = "Loa;")
    public class169 field3352;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "Luv;")
    public static class2 field3342 = new class2(89, 8);

    @OriginalMember(owner = "client!vl", name = "Q", descriptor = "[[I")
    public static int[][] field3353;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!vl", name = "I", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!vl", name = "L", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!vl", name = "M", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!vl", name = "N", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!vl", name = "K", descriptor = "Lmq;")
    public static class59 field3348;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lya;I)V")
    public final void method234(class11 arg0, int arg1) {
        if (arg1 != 28007) {
            method1468((byte) -4);
        }
        field3347++;
    }

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "(B)V")
    public static final void method1468(byte arg0) {
        field3339++;
        if (class170.field2508 < 0) {
            class170.field2508 = 0;
            class30.field425 = -1;
            class9.field87 = -1;
        }
        int var1 = -6 % ((arg0 + 18) / 35);
        if (class170.field2508 > class137.field2053) {
            class9.field87 = -1;
            class170.field2508 = class137.field2053;
            class30.field425 = -1;
        }
        if (class473.field6977 < 0) {
            class30.field425 = -1;
            class9.field87 = -1;
            class473.field6977 = 0;
        }
        if (class137.field2049 < class473.field6977) {
            class473.field6977 = class137.field2049;
            class30.field425 = -1;
            class9.field87 = -1;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)I")
    public final int method240(int arg0) {
        field3336++;
        if (arg0 != -15578) {
            field3353 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)I")
    public final int method222(byte arg0) {
        if (arg0 > -99) {
            this.method240(30);
        }
        field3345++;
        return 0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lya;B)V")
    public final void method225(class11 arg0, byte arg1) {
        field3351++;
        int var3 = -36 % ((arg1 - 42) / 36);
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(Lya;I)Lmo;")
    public final class268 method238(class11 arg0, int arg1) {
        field3349++;
        return arg1 == -1 ? null : null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLya;)V")
    public final void method231(byte arg0, class11 arg1) {
        if (arg0 != 33) {
            field3353 = null;
        }
        field3338++;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)V")
    public final void method229(boolean arg0) {
        if (arg0) {
            field3342 = null;
        }
        field3346++;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(IIIIILoa;)V")
    public class239(int arg0, int arg1, int arg2, int arg3, int arg4, class169 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class368.method2199(-125, arg1, arg0));
        this.field3352 = arg5;
    }

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "(B)V")
    public static void method1469(byte arg0) {
        field3348 = null;
        if (arg0 > -126) {
            method1470(126, 42, 75, 64, 31, -16, null);
        }
        field3353 = null;
        field3342 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIILya;)Lt;")
    public static final class398 method1470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class11 arg6) {
        field3343++;
        long var7 = (long) arg0;
        class398 var9 = (class398) class452.field6647.method2288(var7, 0);
        short var10 = 2055;
        if (var9 == null) {
            class118 var11 = class132.method975(class503.field7416, arg0, 0, -65);
            if (var11 == null) {
                return null;
            }
            if (var11.field1781 < 13) {
                var11.method881(arg5 - 21473, 0);
            }
            var9 = arg6.method150(var11, var10, class115.field1738, 64, 768);
            class452.field6647.method2290(var7, var9, 98);
        }
        class398 var12 = var9.method610((byte) 2, var10, true);
        if (arg2 != 0) {
            var12.method650(arg2);
        }
        if (arg4 != 0) {
            var12.method657(arg4);
        }
        if (arg1 != 0) {
            var12.method595(arg1);
        }
        if (arg3 != 0) {
            var12.method601(0, arg3, 0);
        }
        if (arg5 != 21471) {
            field3342 = null;
        }
        return var12;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILya;II)Z")
    public final boolean method233(int arg0, class11 arg1, int arg2, int arg3) {
        field3350++;
        return arg2 != 2;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)I")
    public final int method223(int arg0) {
        if (arg0 != -19634) {
            this.method234(null, 70);
        }
        field3340++;
        return 0;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)I")
    public final int method921(byte arg0) {
        field3337++;
        if (arg0 > -109) {
            field3342 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILya;I)Lt;")
    public final class398 method241(int arg0, class11 arg1, int arg2) {
        field3344++;
        int var4 = 96 % ((62 - arg2) / 42);
        return null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)Z")
    public final boolean method232(boolean arg0) {
        field3341++;
        if (arg0) {
            this.method921((byte) -63);
        }
        return false;
    }

    static {
        new class347("Use", "Benutzen", "Utiliser", "Usar");
        field3353 = new int[128][128];
    }
}
