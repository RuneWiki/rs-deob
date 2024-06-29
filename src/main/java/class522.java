import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class522 extends class502 {

    @OriginalMember(owner = "client!iaa", name = "i", descriptor = "[I")
    public static int[] field7072 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!iaa", name = "k", descriptor = "Lfja;")
    public static class783 field7074 = new class783(10, 0);

    @OriginalMember(owner = "client!iaa", name = "j", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!iaa", name = "l", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!iaa", name = "n", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!iaa", name = "o", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!iaa", name = "p", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!iaa", name = "q", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!iaa", name = "r", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!iaa", name = "s", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!iaa", name = "t", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!iaa", name = "m", descriptor = "[J")
    public static long[] field7076;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)V", line = 11)
    public final void method58(boolean arg0) {
        if (~super.field6865 != -2 && ~super.field6865 != -1) {
            super.field6865 = this.method55(-2);
        }
        ++field7079;
        if (!arg0) {
            this.method57(-62, -70);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "(B)I", line = 24)
    public final int method2964(byte arg0) {
        if (arg0 <= 49) {
            method2965(true, false);
        }
        ++field7073;
        return super.field6865;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)I", line = 41)
    public final int method57(int arg0, int arg1) {
        ++field7082;
        return arg1 != 0 ? -124 : 1;
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(ILeka;)V", line = 53)
    public class522(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)I", line = 56)
    public final int method55(int arg0) {
        ++field7080;
        return arg0 != -2 ? -114 : 1;
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZZ)V", line = 70)
    public static final void method2965(boolean arg0, boolean arg1) {
        ++field7077;
        int var2 = class427.field5835;
        int var3 = class81.field1130;
        if (arg0) {
            method2966(125, -66, -96, -97, -94, -78, -70, (byte) -42);
        }
        if (arg1 && class507.field6967) {
            var2 <<= 1;
            var3 = -var2;
        }
        class95.field1472.method509(var3, var2);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIIIIB)V", line = 92)
    public static final void method2966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 < -82) {
            ++field7075;
            if (arg4 == arg5) {
                class45.method332(4, arg5, arg2, arg6, arg3, arg0, arg1);
            } else if (class268.field3766 <= -arg5 + arg3 && ~(arg3 + arg5) >= ~class236.field3392 && class223.field3260 <= -arg4 + arg6 && arg4 + arg6 <= class706.field9700) {
                class330.method2085(arg1, arg2, arg5, arg3, arg0, (byte) -2, arg4, arg6);
            } else {
                class562.method3253(arg3, arg5, arg0, arg6, -59, arg1, arg2, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Leka;)V", line = 116)
    public class522(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)V", line = 120)
    public static final void method2967(int arg0) {
        ++field7078;
        int var1 = 59 / ((arg0 - 65) / 35);
        class139.field2364 = new class534(class641.field8821.method3566((byte) 122, class464.field6309), "", class335.field4516, 1004, -1, 0L, 0, 0, true, false, 0L, true);
    }

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "(Z)V", line = 130)
    public static void method2968(boolean arg0) {
        if (arg0) {
            field7072 = null;
            field7076 = null;
            field7074 = null;
        }
    }

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "(II)V", line = 142)
    public final void method52(int arg0, int arg1) {
        if (arg1 != 0) {
            method2965(false, true);
        }
        super.field6865 = arg0;
        ++field7081;
    }
}
