import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class328 extends class270 {

    @OriginalMember(owner = "client!el", name = "G", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!el", name = "K", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!el", name = "M", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!el", name = "L", descriptor = "Lho;")
    public static class359 field4731;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IZIIIIII)V", line = 4)
    public static final void method2160(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4732;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = -arg6 + arg3;
        int var12 = arg2 - arg6;
        int var13 = arg3 * arg3;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 + var17;
        int var24 = -((var21 + -1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 + var19;
        int var26 = -((var22 - 1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 + -3) * var20;
        int var35 = var28;
        if (!arg1) {
            int var36 = (arg2 + -1) * var27;
            int var37 = var30;
            int var38 = (var12 + -1) * var29;
            int[] var39 = class286.field4283[arg4];
            class47.method379(arg5 - var11, (byte) 87, arg0, var39, -arg3 + arg5);
            class47.method379(arg5 - -var11, (byte) 100, arg7, var39, arg5 - var11);
            class47.method379(arg5 - -arg3, (byte) 87, arg0, var39, arg5 - -var11);
            while (~var9 < -1) {
                boolean var40 = var9 <= var12;
                if (var40) {
                    if (var25 < 0) {
                        while (var25 < 0) {
                            var26 += var37;
                            var25 += var33;
                            var33 += var30;
                            var37 += var30;
                            ++var10;
                        }
                    }
                    if (var26 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        ++var10;
                        var37 += var30;
                    }
                    var25 += -var38;
                    var26 += -var34;
                    var34 -= var29;
                    var38 -= var29;
                }
                if (~var23 > -1) {
                    while (~var23 > -1) {
                        var23 += var31;
                        var24 += var35;
                        var35 += var28;
                        var31 += var28;
                        ++var8;
                    }
                }
                if (var24 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    ++var8;
                    var31 += var28;
                }
                var24 += -var32;
                var23 += -var36;
                --var9;
                var36 -= var27;
                var32 -= var27;
                int var41 = -var9 + arg4;
                int var42 = arg4 - -var9;
                int var43 = arg5 - -var8;
                int var44 = arg5 - var8;
                if (!var40) {
                    class47.method379(var43, (byte) 119, arg0, class286.field4283[var41], var44);
                    class47.method379(var43, (byte) 98, arg0, class286.field4283[var42], var44);
                } else {
                    int var45 = arg5 + var10;
                    int var46 = -var10 + arg5;
                    class47.method379(var46, (byte) 86, arg0, class286.field4283[var41], var44);
                    class47.method379(var45, (byte) 120, arg7, class286.field4283[var41], var46);
                    class47.method379(var43, (byte) 78, arg0, class286.field4283[var41], var45);
                    class47.method379(var46, (byte) 59, arg0, class286.field4283[var42], var44);
                    class47.method379(var45, (byte) 103, arg7, class286.field4283[var42], var46);
                    class47.method379(var43, (byte) 78, arg0, class286.field4283[var42], var45);
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)I", line = 172)
    public static final int method2161(int arg0, byte arg1) {
        ++field4730;
        if (arg1 != -109) {
            method2161(3, (byte) -75);
        }
        if (arg0 < 0) {
            return 0;
        } else {
            class188 var2 = (class188) class319.field4606.method1219((long) arg0, arg1 + -13);
            if (var2 == null) {
                return class354.method2272(arg0, 10).field855;
            } else {
                int var3 = 0;
                for (int var4 = 0; ~var2.field2781.length < ~var4; ++var4) {
                    if (var2.field2781[var4] == -1) {
                        ++var3;
                    }
                }
                return var3 + class354.method2272(arg0, 10).field855 + -var2.field2781.length;
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "(I)V", line = 207)
    public static void method2162(int arg0) {
        if (arg0 == -4466) {
            field4731 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V", line = 223)
    public class328() {
        super(0, true);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(IB)V", line = 229)
    public static final void method2163(int arg0, byte arg1) {
        ++field4726;
        class221 var2 = class447.method2795(12, (byte) -49, arg0);
        int var3 = 4 % ((-41 - arg1) / 42);
        var2.method1689(122);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)[I", line = 241)
    public final int[] method81(byte arg0, int arg1) {
        ++field4728;
        if (arg0 <= 26) {
            return null;
        } else {
            int[] var3 = super.field4053.method396(arg1, -47);
            if (super.field4053.field815) {
                class82.method638(var3, 0, class161.field2445, class364.field5185[arg1]);
            }
            return var3;
        }
    }
}
