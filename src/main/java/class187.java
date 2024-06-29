import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class187 extends class47 {

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    private int field2705 = -32768;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "Llb;")
    public static class224 field2697 = new class224(16);

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public int field2695;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public int field2701;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 6)
    public static void method1296(int arg0) {
        field2697 = null;
        if (arg0 != -803) {
            method1299((class175) null, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLcc;II)V", line = 17)
    public static final void method1297(byte arg0, class263 arg1, int arg2, int arg3) {
        if (arg1.field4045 == 0) {
            arg1.field4074 = arg1.field4105;
        } else if (arg1.field4045 == 1) {
            arg1.field4074 = (arg3 - arg1.field4096) / 2 + arg1.field4105;
        } else if (arg1.field4045 == 2) {
            arg1.field4074 = arg3 - arg1.field4096 - arg1.field4105;
        } else if (arg1.field4045 == 3) {
            arg1.field4074 = arg1.field4105 * arg3 >> 14;
        } else if (arg1.field4045 == 4) {
            arg1.field4074 = (arg3 - arg1.field4096) / 2 + (arg1.field4105 * arg3 >> 14);
        } else {
            arg1.field4074 = arg3 - (arg1.field4105 * arg3 >> 14) - arg1.field4096;
        }
        if (arg0 < 64) {
            field2697 = (class224) null;
        }
        if (arg1.field4118 == 0) {
            arg1.field4027 = arg1.field3974;
        } else if (arg1.field4118 == 1) {
            arg1.field4027 = (arg2 - arg1.field3989) / 2 + arg1.field3974;
        } else if (arg1.field4118 == 2) {
            arg1.field4027 = arg2 - arg1.field3974 - arg1.field3989;
        } else if (arg1.field4118 == 3) {
            arg1.field4027 = arg1.field3974 * arg2 >> 14;
        } else if (arg1.field4118 == 4) {
            arg1.field4027 = (arg2 - arg1.field3989) / 2 + (arg1.field3974 * arg2 >> 14);
        } else {
            arg1.field4027 = arg2 - arg1.field3989 - (arg1.field3974 * arg2 >> 14);
        }
        if (class309.field4772 && (client.method1952(arg1).field2467 != 0 || arg1.field3981 == 0)) {
            if (arg1.field4027 < 0) {
                arg1.field4027 = 0;
            } else if (arg2 < arg1.field4027 + arg1.field3989) {
                arg1.field4027 = arg2 - arg1.field3989;
            }
            if (arg1.field4074 < 0) {
                arg1.field4074 = 0;
            } else if ((arg1.field4096 + arg1.field4074) > arg3) {
                arg1.field4074 = arg3 - arg1.field4096;
            }
        }
        field2700++;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "()I", line = 92)
    public final int method11() {
        field2702++;
        return this.field2705;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIIIIJILid;)V", line = 106)
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class274 arg10) {
        class201 var13 = class60.method353(this.field2695, (byte) -121).method560(-1, 0, -70, (class336) null, (class247) null, 0, this.field2701);
        field2703++;
        if (var13 != null) {
            var13.method8(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field2705 = var13.method11();
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIII)V", line = 121)
    public final void method12(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2699++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZI)Z", line = 130)
    public static final boolean method1298(boolean arg0, int arg1) {
        field2698++;
        if (arg1 != 0) {
            method1297((byte) 8, (class263) null, -98, -105);
        }
        boolean var2 = class124.method840();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class124.method837();
        } else if (!class124.method828() || !class124.method832() || !class124.method834()) {
            arg0 = false;
        }
        class308.field4759 = arg0;
        class319.method2223(class9.field131, 24398);
        if (var2 == arg0) {
            return false;
        } else {
            ((class63) class215.field3020).method367(arg1 ^ 0x1F77);
            return true;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Llc;B)V", line = 178)
    public static final void method1299(class175 arg0, byte arg1) {
        class85.field1086 = arg0;
        field2706++;
        if (arg1 > -13) {
            field2697 = (class224) null;
        }
    }
}
