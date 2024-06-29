import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class86 extends class485 {

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public static int field1259 = 1401;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BILin;)I")
    public static final int method641(byte arg0, int arg1, class78 arg2) {
        ++field1261;
        if (!client.method1679(arg2).method1847(1, arg1) && arg2.field1079 == null) {
            return -1;
        } else {
            if (arg0 != -3) {
                field1259 = -64;
            }
            return arg2.field1119 != null && arg1 < arg2.field1119.length ? arg2.field1119[arg1] : -1;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lr;I)V")
    public static final void method642(class166 arg0, int arg1) {
        if (arg1 != 255) {
            field1259 = 95;
        }
        ++field1258;
        if (~class234.field3232 != ~class143.field2063.field4053) {
            if (class295.field4051 != null) {
                if (class449.method2555(class143.field2063.field4053, arg0, (byte) 106)) {
                    class234.field3232 = class143.field2063.field4053;
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lsea;Lsea;Lqfa;)V")
    public class86(class648 arg0, class648 arg1, class85 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZIIB)V")
    public final void method480(boolean arg0, int arg1, int arg2, byte arg3) {
        ++field1260;
        if (arg3 == 113) {
            int var5 = this.method2761(93) * super.field6672.field6764 / 10000;
            class334.field4506.method110(arg1, arg2 - -2, var5, super.field6672.field6757 + -2, ((class85) super.field6672).field1253, 0);
            class334.field4506.method110(arg1 + var5, arg2 + 2, super.field6672.field6764 - var5, super.field6672.field6757 - 2, 0, 0);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([IIIIIIII)V")
    public static final void method643(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1257;
        if (arg4 > 0 && !class588.method3342(-124, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg6 > 0 && !class588.method3342(-120, arg6)) {
            throw new IllegalArgumentException("");
        } else if (~arg1 != -32994) {
            throw new IllegalArgumentException("");
        } else {
            int var8 = 0;
            int var9 = ~arg4 <= ~arg6 ? arg6 : arg4;
            int var10 = -64 % ((arg2 - -54) / 57);
            int var11 = arg4 >> 1;
            int var12 = arg6 >> 1;
            int[] var13 = arg0;
            int[] var14 = new int[var11 * var12];
            while (true) {
                OpenGL.glTexImage2Di(arg7, var8, arg3, arg4, arg6, 0, arg1, arg5, var13, 0);
                if (~var9 >= -2) {
                    return;
                }
                int var15 = 0;
                int var16 = 0;
                int var17 = arg4 + var16;
                int[] var18 = var14;
                for (int var19 = 0; ~var12 < ~var19; ++var19) {
                    for (int var20 = 0; var11 > var20; ++var20) {
                        int var21 = var13[var16++];
                        int var22 = var13[var16++];
                        int var23 = var13[var17++];
                        int var24 = var21 & 255;
                        int var25 = var21 >> 16 & 255;
                        int var26 = 255 & var21 >> 8;
                        int var27 = var21 >> 24 & 255;
                        int var28 = var13[var17++];
                        int var29 = (255 & var22) + var24;
                        int var30 = (var22 >> 16 & 255) + var25;
                        int var31 = ((65363 & var22) >> 8) + var26;
                        int var32 = (255 & var22 >> 24) + var27;
                        int var33 = (255 & var23 >> 24) + var32;
                        int var34 = (255 & var23 >> 8) + var31;
                        int var35 = (255 & var23) + var29;
                        int var36 = ((var23 & 16711800) >> 16) + var30;
                        int var37 = (255 & var28 >> 8) + var34;
                        int var38 = ((16718900 & var28) >> 16) + var36;
                        int var39 = (255 & var28) + var35;
                        int var40 = (255 & var28 >> 24) + var33;
                        var14[var15++] = class647.method3617(class136.method950(1020, var39) >> 2, class647.method3617(class136.method950(65280, var37 << 6), class647.method3617(class136.method950(1020, var38) << 14, class136.method950(var40 << 22, -16777216))));
                    }
                    var17 += arg4;
                    var16 += arg4;
                }
                var14 = var13;
                var13 = var18;
                arg6 = var12;
                arg4 = var11;
                var11 >>= 1;
                ++var8;
                var9 >>= 1;
                var12 >>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIZI)V")
    public final void method481(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 <= -113) {
            class334.field4506.method190(arg0 + -2, arg3, super.field6672.field6764 + 4, super.field6672.field6757 + 2, ((class85) super.field6672).field1252, 0);
            ++field1262;
            class334.field4506.method190(arg0 + -1, arg3 - -1, super.field6672.field6764 - -2, super.field6672.field6757, 0, 0);
        }
    }
}
