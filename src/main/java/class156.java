import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class156 extends class465 {

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!hq", name = "B", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!hq", name = "D", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!hq", name = "E", descriptor = "Z")
    public static boolean field2179;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II[JI[Ljava/lang/Object;)V", line = 5)
    public static final void method1043(int arg0, int arg1, long[] arg2, int arg3, Object[] arg4) {
        if (~arg3 < ~arg0) {
            int var5 = (arg0 - -arg3) / 2;
            int var6 = arg0;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            Object var9 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg0; ~var11 > ~arg3; ++var11) {
                if (~arg2[var11] > ~(var7 - -((long) (var10 & var11)))) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    Object var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var9;
            method1043(arg0, arg1, arg2, var6 + -1, arg4);
            method1043(var6 + 1, arg1, arg2, arg3, arg4);
        }
        ++field2176;
        if (arg1 != 29288) {
            method1045(-13L, 9);
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(IIIIIF)V", line = 62)
    public class156(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(FI)V", line = 72)
    public final void method1044(float arg0, int arg1) {
        super.field6582 = arg0;
        ++field2178;
        if (arg1 != 65536) {
            field2179 = false;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(JI)V", line = 84)
    public static final void method1045(long arg0, int arg1) {
        ++field2177;
        int var3 = class711.field9884;
        int var4 = class354.field5059;
        if (~class453.field6403 != ~var3) {
            int var5 = -class453.field6403 + var3;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (~var5 < -1) {
                if (~var6 == -1) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (~var6 > ~var5) {
                var6 = var5;
            }
            class453.field6403 += var6;
        }
        if (arg1 == 15784) {
            class2.field19 += (float) arg0 * class518.field7368 / 40.0F * 8.0F;
            if (~class191.field2552 != ~var4) {
                int var7 = -class191.field2552 + var4;
                int var8 = (int) ((long) var7 * arg0 / 320L);
                if (var7 <= 0) {
                    if (~var8 != -1) {
                        if (var7 > var8) {
                            var8 = var7;
                        }
                    } else {
                        var8 = -1;
                    }
                } else if (var8 != 0) {
                    if (var8 > var7) {
                        var8 = var7;
                    }
                } else {
                    var8 = 1;
                }
                class191.field2552 += var8;
            }
            class552.field7773 += (float) arg0 * class720.field9993 / 40.0F * 8.0F;
            class401.method2509(arg1 + -15735);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIII)V", line = 166)
    public final void method1046(int arg0, int arg1, int arg2, int arg3) {
        super.field6583 = arg1;
        ++field2175;
        super.field6579 = arg2;
        super.field6592 = arg0;
        if (arg3 != 16) {
            this.method1046(37, -126, -104, -120);
        }
    }
}
