import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class461 extends class51 implements class1 {

    @OriginalMember(owner = "client!or", name = "v", descriptor = "I")
    private int field6673;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "Lqv;")
    public static class316 field6671 = new class316(90, -2);

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!or", name = "x", descriptor = "[[[Lmm;")
    public static class188[][][] field6675;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)I", line = 3)
    public final int method4(int arg0) {
        if (arg0 > -24) {
            return -33;
        } else {
            ++field6669;
            return super.field932;
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(Z)J", line = 16)
    public final long method3(boolean arg0) {
        if (arg0) {
            this.field6673 = 90;
        }
        ++field6665;
        return 0L;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V", line = 29)
    public final void method451(int arg0) {
        if (arg0 != 0) {
            method2735((byte) 113);
        }
        ++field6668;
        super.field943.method254(this, 77);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IBIIIII)V", line = 40)
    public static final void method2732(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6667;
        class97.method736(arg0, 0);
        int var7 = 0;
        int var8 = arg0 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg1 != -5) {
            method2734(122, 65);
        }
        if (~class424.field5996 >= ~arg2 && class333.field4936 >= arg2) {
            int[] var15 = class271.field4078[arg2];
            int var16 = class252.method1631(class176.field2630, class465.field6763, -arg0 + arg4, -85);
            int var17 = class252.method1631(class176.field2630, class465.field6763, arg0 + arg4, -29);
            int var18 = class252.method1631(class176.field2630, class465.field6763, -var8 + arg4, arg1 ^ 45);
            int var19 = class252.method1631(class176.field2630, class465.field6763, arg4 - -var8, arg1 ^ 17);
            class479.method2839(var18, var16, var15, 95, arg5);
            class479.method2839(var19, var18, var15, 68, arg6);
            class479.method2839(var17, var19, var15, 120, arg5);
        }
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && ~var11 <= -2) {
                --var11;
                class176.field2632[var11] = var7;
                var12 -= var11 << 1;
            }
            ++var7;
            if (var10 >= 0) {
                --var9;
                var10 -= var9 << 1;
                int var20 = arg2 - var9;
                int var21 = arg2 + var9;
                if (var21 >= class424.field5996 && ~class333.field4936 <= ~var20) {
                    if (~var9 > ~var8) {
                        int var22 = class176.field2632[var9];
                        int var23 = class252.method1631(class176.field2630, class465.field6763, arg4 + var7, arg1 ^ 101);
                        int var24 = class252.method1631(class176.field2630, class465.field6763, arg4 - var7, arg1 + -46);
                        int var25 = class252.method1631(class176.field2630, class465.field6763, arg4 + var22, -124);
                        int var26 = class252.method1631(class176.field2630, class465.field6763, -var22 + arg4, -36);
                        if (~class333.field4936 <= ~var21) {
                            int[] var27 = class271.field4078[var21];
                            class479.method2839(var26, var24, var27, 71, arg5);
                            class479.method2839(var25, var26, var27, 104, arg6);
                            class479.method2839(var23, var25, var27, 83, arg5);
                        }
                        if (class424.field5996 <= var20) {
                            int[] var28 = class271.field4078[var20];
                            class479.method2839(var26, var24, var28, 67, arg5);
                            class479.method2839(var25, var26, var28, 120, arg6);
                            class479.method2839(var23, var25, var28, 103, arg5);
                        }
                    } else {
                        int var29 = class252.method1631(class176.field2630, class465.field6763, arg4 + var7, arg1 + -24);
                        int var30 = class252.method1631(class176.field2630, class465.field6763, -var7 + arg4, -79);
                        if (var21 <= class333.field4936) {
                            class479.method2839(var29, var30, class271.field4078[var21], 66, arg5);
                        }
                        if (~class424.field5996 >= ~var20) {
                            class479.method2839(var29, var30, class271.field4078[var20], 65, arg5);
                        }
                    }
                }
            }
            int var31 = arg2 - var7;
            int var32 = arg2 + var7;
            if (var32 >= class424.field5996 && class333.field4936 >= var31) {
                int var33 = arg4 + var9;
                int var34 = arg4 - var9;
                if (class465.field6763 <= var33 && ~var34 >= ~class176.field2630) {
                    int var35 = class252.method1631(class176.field2630, class465.field6763, var33, -65);
                    int var36 = class252.method1631(class176.field2630, class465.field6763, var34, -56);
                    if (~var7 > ~var8) {
                        int var37 = var7 > var11 ? class176.field2632[var7] : var11;
                        int var38 = class252.method1631(class176.field2630, class465.field6763, arg4 + var37, -110);
                        int var39 = class252.method1631(class176.field2630, class465.field6763, -var37 + arg4, -91);
                        if (~var32 >= ~class333.field4936) {
                            int[] var40 = class271.field4078[var32];
                            class479.method2839(var39, var36, var40, 83, arg5);
                            class479.method2839(var38, var39, var40, 95, arg6);
                            class479.method2839(var35, var38, var40, arg1 + 112, arg5);
                        }
                        if (var31 >= class424.field5996) {
                            int[] var41 = class271.field4078[var31];
                            class479.method2839(var39, var36, var41, 97, arg5);
                            class479.method2839(var38, var39, var41, arg1 ^ -102, arg6);
                            class479.method2839(var35, var38, var41, 86, arg5);
                        }
                    } else {
                        if (~var32 >= ~class333.field4936) {
                            class479.method2839(var35, var36, class271.field4078[var32], 103, arg5);
                        }
                        if (~var31 <= ~class424.field5996) {
                            class479.method2839(var35, var36, class271.field4078[var31], 88, arg5);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lbt;ILjaggl/memory/NativeBuffer;IZ)V", line = 224)
    public class461(class33 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field6673 = arg1;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(III[B)V", line = 232)
    public final void method1(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field6672;
        if (arg2 <= 55) {
            field6675 = null;
        }
        this.method449(arg3, (byte) -66, arg1);
        this.field6673 = arg0;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V", line = 244)
    public static void method2733(byte arg0) {
        field6675 = null;
        if (arg0 != 104) {
            method2732(-105, (byte) -97, -77, 33, -8, -105, 116);
        }
        field6671 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)I", line = 256)
    public final int method2(boolean arg0) {
        ++field6666;
        if (arg0) {
            this.field6673 = -81;
        }
        return this.field6673;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lbt;I[BIZ)V", line = 273)
    public class461(class33 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field6673 = arg1;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V", line = 281)
    public static final void method2734(int arg0, int arg1) {
        class332.field4921 = arg1;
        if (arg0 >= -60) {
            method2732(121, (byte) -20, -32, -72, -13, -89, 52);
        }
        ++field6670;
        class126.field1984.method2990((byte) -122);
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(B)V", line = 296)
    public static final void method2735(byte arg0) {
        ++field6674;
        if (class219.field3351) {
            class198 var1 = class539.method3173(class303.field4494, 2, class72.field1164);
            if (var1 != null && var1.field2887 != null) {
                class361 var2 = new class361();
                var2.field5252 = var1;
                var2.field5256 = var1.field2887;
                class281.method1805(var2);
            }
            class219.field3351 = false;
            class276.field4122 = -1;
            class28.field391 = -1;
            if (arg0 < -93) {
                if (var1 != null) {
                    class284.method1832(-17067, var1);
                }
            }
        }
    }
}
