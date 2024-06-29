import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class22 extends class333 {

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
    public int field168;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "F")
    public static float field167;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
    public static final void method99(int arg0) {
        class89.field891 = new class340[50];
        class309.field3825 = 0;
        int var1 = -83 % ((arg0 + 26) / 53);
        field164++;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BI)V")
    public static final void method100(byte arg0, int arg1) {
        field166++;
        if (arg1 == -1 || !class507.field7282[arg1]) {
            return;
        }
        class551.field7882.method3876(arg1, 116);
        class102.field1106[arg1] = null;
        class483.field6965[arg1] = null;
        if (arg0 >= 3) {
            class507.field7282[arg1] = false;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIII[B[BI)V")
    public static final void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, byte[] arg7, int arg8) {
        field162++;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg6[var10001] = (byte) (arg6[var10001] - arg7[arg0++]);
                int var14 = arg1++;
                arg6[var14] = (byte) (arg6[var14] - arg7[arg0++]);
                int var15 = arg1++;
                arg6[var15] = (byte) (arg6[var15] - arg7[arg0++]);
                int var16 = arg1++;
                arg6[var16] = (byte) (arg6[var16] - arg7[arg0++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg6[var10001] = (byte) (arg6[var10001] - arg7[arg0++]);
            }
            arg0 += arg8;
            arg1 += arg4;
        }
        if (arg5 != 0) {
            method102(null, false);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([BZ)Ljava/lang/String;")
    public static final String method102(byte[] arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            field163++;
            return class371.method2161(!arg1, 0, arg0, arg0.length);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IILwl;Lkca;Lr;I)Z")
    public static final boolean method103(int arg0, int arg1, class679 arg2, class655 arg3, class564 arg4, int arg5) {
        field165++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg3.field9217 != null) {
            var7 = (arg3.field9198 + arg2.field9572 - class482.field6963) * (class482.field6957 - class482.field6961) / (class482.field6955 - class482.field6963) + class482.field6961;
            var9 = class482.field6944 - (arg2.field9563 + arg3.field9229 - class482.field6958) * (class482.field6944 - class482.field6945) / (class482.field6948 - class482.field6958);
            var8 = class482.field6944 - ((arg2.field9563 + arg3.field9204 - class482.field6958) * (class482.field6944 - class482.field6945) / (class482.field6948 - class482.field6958));
            var6 = (arg3.field9199 + arg2.field9572 - class482.field6963) * (class482.field6957 - class482.field6961) / (class482.field6955 - class482.field6963) + class482.field6961;
        }
        class534 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg5 != -2) {
            field167 = 0.8994784F;
        }
        if (arg3.field9206 != -1) {
            if (arg2.field9570 && arg3.field9226 != -1) {
                var10 = arg3.method3646(false, true, arg4);
            } else {
                var10 = arg3.method3646(false, false, arg4);
            }
            if (var10 != null) {
                var11 = arg2.field9560 - (var10.method312() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg2.field9560 + (var10.method312() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                var13 = arg2.field9564 - (var10.method304() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                var14 = arg2.field9564 + (var10.method304() + 1 >> 1);
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class174 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg3.field9214 != null) {
            var15 = class426.method2461(arg3.field9230, (byte) -24);
            if (var15 != null) {
                var16 = class104.field1128.method2659(null, null, arg3.field9214, (byte) -112, class610.field8592);
                int var23 = arg2.field9564;
                if (var10 == null) {
                    var17 = var23 - var15.method1061() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method304() >> 1) + (var15.method1062() * var16));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class610.field8592[var24];
                    if (var24 < (var16 - 1)) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method1064(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg2.field9560 + arg0 - var18 / 2;
                var20 = var18 / 2 + arg0 + arg2.field9560;
                if (var6 > var19) {
                    var6 = var19;
                }
                var21 = arg1 + var17;
                if (var20 > var7) {
                    var7 = var20;
                }
                if (var8 > var21) {
                    var8 = var21;
                }
                var22 = arg1 + var17 + (var15.method1062() * var16);
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (class482.field6961 > var7 || class482.field6957 < var6 || var9 < class482.field6945 || var8 > class482.field6944) {
            return true;
        }
        if (arg3.field9217 != null) {
            int[] var27 = new int[arg3.field9217.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg3.field9217[var28 * 2] + arg2.field9572;
                int var31 = arg3.field9217[var28 * 2 + 1] + arg2.field9563;
                var27[var28 * 2] = (var30 - class482.field6963) * (class482.field6957 - class482.field6961) / (class482.field6955 - class482.field6963) + class482.field6961;
                var27[var28 * 2 + 1] = class482.field6944 - (var31 - class482.field6958) * (class482.field6944 - class482.field6945) / (class482.field6948 - class482.field6958);
            }
            class491.method2848(arg4, var27, arg3.field9191);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg4.method3204((byte) -55, var27[(var29 + 1) * 2], var27[var29 * 2 + 1], arg3.field9211, var27[var29 * 2], var27[(var29 + 1) * 2 + 1]);
            }
            arg4.method3204((byte) -55, var27[0], var27[var27.length - 1], arg3.field9211, var27[var27.length - 2], var27[1]);
        }
        if (var10 != null) {
            if (class269.field3346 > 0 && (class254.field3190 != -1 && class254.field3190 == arg2.field9562 || class599.field8437 != -1 && class599.field8437 == arg3.field9193)) {
                int var32;
                if (class348.field4660 > 50) {
                    var32 = 200 - (class348.field4660 * 2);
                } else {
                    var32 = class348.field4660 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg4.method3205(arg2.field9560, var10.method315() / 2 + 7, arg5 ^ 0xBD3, var33, arg2.field9564);
                arg4.method3205(arg2.field9560, var10.method315() / 2 + 5, -3027, var33, arg2.field9564);
                arg4.method3205(arg2.field9560, var10.method315() / 2 + 3, arg5 + -3025, var33, arg2.field9564);
                arg4.method3205(arg2.field9560, var10.method315() / 2 + 1, -3027, var33, arg2.field9564);
                arg4.method3205(arg2.field9560, var10.method315() / 2, -3027, var33, arg2.field9564);
            }
            var10.method3001(arg2.field9560 - (var10.method312() >> 1), arg2.field9564 - (var10.method304() >> 1));
        }
        if (arg3.field9214 != null && var15 != null) {
            class140.method780(arg2, var18, arg3, arg4, (byte) 35, var17, var15, var16);
        }
        if (arg3.field9206 != -1 || arg3.field9214 != null) {
            class375 var34 = new class375(arg2);
            var34.field5105 = var11;
            var34.field5099 = var20;
            var34.field5100 = var12;
            var34.field5102 = var21;
            var34.field5106 = var22;
            var34.field5094 = var19;
            var34.field5093 = var13;
            var34.field5096 = var14;
            class258.field3240.method3425(var34, false);
        }
        return false;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V")
    public class22() {
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(I)V")
    public class22(int arg0) {
        this.field168 = arg0;
    }
}
