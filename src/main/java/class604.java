import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class604 extends class694 {

    @OriginalMember(owner = "client!sv", name = "H", descriptor = "Ljava/lang/String;")
    public static String field8392 = null;

    @OriginalMember(owner = "client!sv", name = "L", descriptor = "Z")
    public static boolean field8396 = true;

    @OriginalMember(owner = "client!sv", name = "J", descriptor = "[Ljca;")
    public static class629[] field8394 = new class629[50];

    @OriginalMember(owner = "client!sv", name = "K", descriptor = "F")
    public static float field8395;

    @OriginalMember(owner = "client!sv", name = "F", descriptor = "I")
    public static int field8391;

    @OriginalMember(owner = "client!sv", name = "I", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!sv", name = "N", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!sv", name = "M", descriptor = "[[B")
    public static byte[][] field8397;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field8391;
        if (arg0 <= 112) {
            return null;
        } else {
            int[] var3 = super.field9751.method2712(arg1, (byte) 118);
            if (super.field9751.field6674) {
                int[][] var4 = this.method3812(arg1, 0, -14032);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; ~class465.field6544 < ~var8; ++var8) {
                    var3[var8] = (var5[var8] - -var6[var8] + var7[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "(I)V")
    public static void method3346(int arg0) {
        if (arg0 == -1706347103) {
            field8397 = null;
            field8392 = null;
            field8394 = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8393;
        class647.method3605(false, arg6);
        int var7 = 0;
        int var8 = -arg3 + arg6;
        int var9 = -59 % ((-9 - arg5) / 48);
        if (~var8 > -1) {
            var8 = 0;
        }
        int var10 = arg6;
        int var11 = -arg6;
        int var12 = var8;
        int var13 = -var8;
        int var14 = -1;
        if (~class92.field1219 >= ~arg1 && ~arg1 >= ~class631.field8829) {
            int[] var15 = class476.field6655[arg1];
            int var16 = class355.method2104(class144.field2148, -arg6 + arg4, -113, class482.field6703);
            int var17 = class355.method2104(class144.field2148, arg4 + arg6, 37, class482.field6703);
            int var18 = class355.method2104(class144.field2148, -var8 + arg4, -114, class482.field6703);
            int var19 = class355.method2104(class144.field2148, arg4 + var8, -127, class482.field6703);
            class548.method3012(var18, (byte) 23, arg0, var16, var15);
            class548.method3012(var19, (byte) 23, arg2, var18, var15);
            class548.method3012(var17, (byte) 23, arg0, var19, var15);
        }
        int var20 = -1;
        while (var7 < var10) {
            var14 += 2;
            var20 += 2;
            var11 += var14;
            var13 += var20;
            if (~var13 <= -1 && ~var12 <= -2) {
                --var12;
                class525.field7175[var12] = var7;
                var13 -= var12 << 1;
            }
            ++var7;
            if (~var11 <= -1) {
                --var10;
                var11 -= var10 << 1;
                int var21 = -var10 + arg1;
                int var22 = arg1 + var10;
                if (~var22 <= ~class92.field1219 && ~class631.field8829 <= ~var21) {
                    if (var10 < var8) {
                        int var23 = class525.field7175[var10];
                        int var24 = class355.method2104(class144.field2148, arg4 + var7, -103, class482.field6703);
                        int var25 = class355.method2104(class144.field2148, -var7 + arg4, -106, class482.field6703);
                        int var26 = class355.method2104(class144.field2148, arg4 + var23, -118, class482.field6703);
                        int var27 = class355.method2104(class144.field2148, arg4 - var23, 73, class482.field6703);
                        if (~var22 >= ~class631.field8829) {
                            int[] var28 = class476.field6655[var22];
                            class548.method3012(var27, (byte) 23, arg0, var25, var28);
                            class548.method3012(var26, (byte) 23, arg2, var27, var28);
                            class548.method3012(var24, (byte) 23, arg0, var26, var28);
                        }
                        if (~class92.field1219 >= ~var21) {
                            int[] var29 = class476.field6655[var21];
                            class548.method3012(var27, (byte) 23, arg0, var25, var29);
                            class548.method3012(var26, (byte) 23, arg2, var27, var29);
                            class548.method3012(var24, (byte) 23, arg0, var26, var29);
                        }
                    } else {
                        int var30 = class355.method2104(class144.field2148, arg4 + var7, 32, class482.field6703);
                        int var31 = class355.method2104(class144.field2148, -var7 + arg4, -127, class482.field6703);
                        if (class631.field8829 >= var22) {
                            class548.method3012(var30, (byte) 23, arg0, var31, class476.field6655[var22]);
                        }
                        if (~class92.field1219 >= ~var21) {
                            class548.method3012(var30, (byte) 23, arg0, var31, class476.field6655[var21]);
                        }
                    }
                }
            }
            int var32 = -var7 + arg1;
            int var33 = arg1 + var7;
            if (~class92.field1219 >= ~var33 && class631.field8829 >= var32) {
                int var34 = arg4 + var10;
                int var35 = arg4 - var10;
                if (var34 >= class482.field6703 && ~var35 >= ~class144.field2148) {
                    int var36 = class355.method2104(class144.field2148, var34, 57, class482.field6703);
                    int var37 = class355.method2104(class144.field2148, var35, 54, class482.field6703);
                    if (var7 < var8) {
                        int var38 = var7 <= var12 ? var12 : class525.field7175[var7];
                        int var39 = class355.method2104(class144.field2148, arg4 + var38, -102, class482.field6703);
                        int var40 = class355.method2104(class144.field2148, arg4 - var38, 49, class482.field6703);
                        if (~var33 >= ~class631.field8829) {
                            int[] var41 = class476.field6655[var33];
                            class548.method3012(var40, (byte) 23, arg0, var37, var41);
                            class548.method3012(var39, (byte) 23, arg2, var40, var41);
                            class548.method3012(var36, (byte) 23, arg0, var39, var41);
                        }
                        if (class92.field1219 <= var32) {
                            int[] var42 = class476.field6655[var32];
                            class548.method3012(var40, (byte) 23, arg0, var37, var42);
                            class548.method3012(var39, (byte) 23, arg2, var40, var42);
                            class548.method3012(var36, (byte) 23, arg0, var39, var42);
                        }
                    } else {
                        if (~class631.field8829 <= ~var33) {
                            class548.method3012(var36, (byte) 23, arg0, var37, class476.field6655[var33]);
                        }
                        if (var32 >= class92.field1219) {
                            class548.method3012(var36, (byte) 23, arg0, var37, class476.field6655[var32]);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "()V")
    public class604() {
        super(1, true);
    }
}
