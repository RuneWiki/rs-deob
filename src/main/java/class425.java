import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class425 {

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "[S")
    public short[] field5592;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "[S")
    public short[] field5593;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "J")
    public long field5585;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "[I")
    public int[] field5591;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "[Laca;")
    public static class230[] field5588;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public static final void method2448(boolean arg0) {
        class746.field10200 = -1;
        class575.field7313 = -1;
        class467.field6041 = null;
        class596.field7567 = -1;
        class212.field2921 = null;
        class384.field4802 = null;
        if (arg0) {
            return;
        }
        class58.field765 = null;
        class264.field3511 = null;
        field5590++;
        class699.field9263 = null;
        class465.field6034 = null;
        class203.field2814 = -1;
        class734.field9967.method4275(0);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5586++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg5 - arg1;
        int var12 = arg7 - arg1;
        int var13 = arg5 * arg5;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        if (arg3 != 13668) {
            method2448(false);
        }
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg7 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class80.field1131 <= arg6 && arg6 <= class405.field5375) {
            int[] var39 = class207.field2840[arg6];
            int var40 = class774.method4226(class498.field6390, (byte) -76, class30.field274, arg2 - arg5);
            int var41 = class774.method4226(class498.field6390, (byte) -31, class30.field274, arg2 + arg5);
            int var42 = class774.method4226(class498.field6390, (byte) -91, class30.field274, arg2 - var11);
            int var43 = class774.method4226(class498.field6390, (byte) -53, class30.field274, arg2 + var11);
            class54.method333(var42, var39, 7, var40, arg0);
            class54.method333(var43, var39, 7, var42, arg4);
            class54.method333(var41, var39, 7, var43, arg0);
        }
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var10++;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var8++;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var35 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var36;
            var36 -= var27;
            var9--;
            var32 -= var27;
            int var45 = arg6 - var9;
            int var46 = arg6 + var9;
            if (var46 >= class80.field1131 && class405.field5375 >= var45) {
                int var47 = class774.method4226(class498.field6390, (byte) -97, class30.field274, arg2 + var8);
                int var48 = class774.method4226(class498.field6390, (byte) -24, class30.field274, arg2 - var8);
                if (var44) {
                    int var49 = class774.method4226(class498.field6390, (byte) -45, class30.field274, arg2 + var10);
                    int var50 = class774.method4226(class498.field6390, (byte) -54, class30.field274, arg2 - var10);
                    if (class80.field1131 <= var45) {
                        int[] var51 = class207.field2840[var45];
                        class54.method333(var50, var51, arg3 - 13661, var48, arg0);
                        class54.method333(var49, var51, 7, var50, arg4);
                        class54.method333(var47, var51, 7, var49, arg0);
                    }
                    if (class405.field5375 >= var46) {
                        int[] var52 = class207.field2840[var46];
                        class54.method333(var50, var52, 7, var48, arg0);
                        class54.method333(var49, var52, 7, var50, arg4);
                        class54.method333(var47, var52, 7, var49, arg0);
                    }
                } else {
                    if (var45 >= class80.field1131) {
                        class54.method333(var47, class207.field2840[var45], 7, var48, arg0);
                    }
                    if (class405.field5375 >= var46) {
                        class54.method333(var47, class207.field2840[var46], 7, var48, arg0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Z")
    public static final boolean method2450(int arg0) {
        field5587++;
        boolean var1 = true;
        if (class196.field2732 == null) {
            if (class172.field2270.method130(-2, class100.field1338)) {
                class196.field2732 = class388.method2239(class172.field2270, class100.field1338);
            } else {
                var1 = false;
            }
        }
        if (class164.field2174 == null) {
            if (class172.field2270.method130(arg0 ^ 0xFFFFFFFD, class570.field7204)) {
                class164.field2174 = class388.method2239(class172.field2270, class570.field7204);
            } else {
                var1 = false;
            }
        }
        if (class81.field1147 == null) {
            if (class172.field2270.method130(-2, class188.field2617)) {
                class81.field1147 = class388.method2239(class172.field2270, class188.field2617);
            } else {
                var1 = false;
            }
        }
        if (class718.field9422 == null) {
            if (class171.field2264.method130(-2, class246.field3378)) {
                class718.field9422 = class663.method3610(class171.field2264, class246.field3378, -124);
            } else {
                var1 = false;
            }
        }
        if (class279.field3626 == null) {
            if (class172.field2270.method130(-2, class246.field3378)) {
                class279.field3626 = class388.method2237(class172.field2270, class246.field3378);
            } else {
                var1 = false;
            }
        }
        return arg0 == 3 ? var1 : false;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
    public static void method2451(boolean arg0) {
        if (arg0) {
            field5588 = null;
        }
        field5588 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2452(String arg0, int arg1) {
        field5589++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 <= 39) {
            method2450(7);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(J[I[S[S)V")
    public class425(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field5592 = arg3;
        this.field5593 = arg2;
        this.field5585 = arg0;
        this.field5591 = arg1;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    protected class425() {
    }
}
