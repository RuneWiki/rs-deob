import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class380 extends class649 implements class632 {

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    private int field5767;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lad;ILjaclib/memory/Buffer;)V", line = 5)
    public class380(class362 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field5767 = arg1;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lad;I[BI)V", line = 14)
    public class380(class362 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5767 = arg1;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[BIB)V", line = 23)
    public final void method447(int arg0, byte[] arg1, int arg2, byte arg3) {
        ++field5772;
        this.method3711(arg1, arg0);
        if (arg3 < 97) {
            this.field5767 = -1;
        }
        this.field5767 = arg2;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)I", line = 36)
    public final int method452(int arg0) {
        ++field5770;
        if (arg0 >= -114) {
            this.method452(-42);
        }
        return 0;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIII)V", line = 47)
    public static final void method2444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5765;
        int var6 = -37 % ((arg0 - 29) / 44);
        int var7 = arg2 - arg5;
        int var8 = -arg4 + arg1;
        if (var8 != 0) {
            if (var7 == 0) {
                class327.method2123(arg5, arg1, arg4, arg3, (byte) 17);
            } else {
                if (~var7 > -1) {
                    var7 = -var7;
                }
                if (var8 < 0) {
                    var8 = -var8;
                }
                boolean var9 = ~var8 > ~var7;
                if (var9) {
                    int var10 = arg4;
                    int var11 = arg1;
                    arg4 = arg5;
                    arg5 = var10;
                    arg1 = arg2;
                    arg2 = var11;
                }
                if (arg4 > arg1) {
                    int var12 = arg4;
                    arg4 = arg1;
                    int var13 = arg5;
                    arg1 = var12;
                    arg5 = arg2;
                    arg2 = var13;
                }
                int var14 = arg5;
                int var15 = -arg4 + arg1;
                int var16 = -arg5 + arg2;
                int var17 = -(var15 >> 1);
                if (~var16 > -1) {
                    var16 = -var16;
                }
                int var18 = arg5 < arg2 ? 1 : -1;
                if (!var9) {
                    for (int var19 = arg4; ~arg1 <= ~var19; ++var19) {
                        class402.field6087[var14][var19] = arg3;
                        var17 += var16;
                        if (~var17 < -1) {
                            var14 += var18;
                            var17 -= var15;
                        }
                    }
                } else {
                    for (int var20 = arg4; var20 <= arg1; ++var20) {
                        var17 += var16;
                        class402.field6087[var20][var14] = arg3;
                        if (var17 > 0) {
                            var14 += var18;
                            var17 -= var15;
                        }
                    }
                }
            }
        } else {
            if (~var7 != -1) {
                class547.method3184(arg2, 16247, arg3, arg4, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)I", line = 164)
    public final int method448(int arg0) {
        ++field5768;
        if (arg0 != -18785) {
            method2445(115, 89, 85);
        }
        return this.field5767;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)J", line = 177)
    public final long method450(byte arg0) {
        ++field5771;
        return arg0 > -22 ? 125L : super.field9374.getAddress();
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Z", line = 190)
    public static final boolean method2445(int arg0, int arg1, int arg2) {
        ++field5769;
        if (arg0 != -3448) {
            method2444(-5, -32, 104, 74, 39, -43);
        }
        return class429.method2674((byte) -4, arg2, arg1) & class490.method2947(arg1, arg2, false);
    }
}
