import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class214 {

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "Lrg;")
    public static class248 field3387 = null;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "[[[B")
    public static byte[][][] field3386;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3388++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg2 - arg4;
        int var12 = arg1 - arg4;
        int var13 = arg1 * arg1;
        int var14 = var11 * var11;
        int var15 = arg2 * arg2;
        int var16 = var12 * var12;
        int var17 = var13 << 1;
        int var18 = var15 << 1;
        int var19 = var16 << 1;
        int var20 = var14 << 1;
        int var21 = arg1 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var15 + var17;
        int var24 = var13 - ((var21 - 1) * var18);
        int var25 = var15 << 2;
        int var26 = (arg0 - var22) * var14 + var19;
        int var27 = var16 - ((var22 - 1) * var20);
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = (var22 - 3) * var20;
        int var34 = var19 * 3;
        int var35 = var28;
        int var36 = (arg1 - 1) * var25;
        int var37 = var30;
        if (class52.field766 <= arg6 && arg6 <= class191.field3112) {
            int[] var38 = class232.field3629[arg6];
            int var39 = class268.method1789(class148.field2371, arg0 - 128, arg3 - arg2, class34.field561);
            int var40 = class268.method1789(class148.field2371, 83, arg3 + arg2, class34.field561);
            int var41 = class268.method1789(class148.field2371, 92, arg3 - var11, class34.field561);
            int var42 = class268.method1789(class148.field2371, -95, arg3 + var11, class34.field561);
            class309.method2096(arg5, var41, (byte) -117, var38, var39);
            class309.method2096(arg7, var42, (byte) -117, var38, var41);
            class309.method2096(arg5, var40, (byte) -117, var38, var42);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var8++;
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            boolean var44 = var9 <= var12;
            var9--;
            int var45 = arg6 - var9;
            var32 -= var25;
            int var46 = arg6 + var9;
            if (var44) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var10++;
                        var26 += var34;
                        var27 += var37;
                        var34 += var30;
                        var37 += var30;
                    }
                }
                if (var27 < 0) {
                    var10++;
                    var27 += var37;
                    var37 += var30;
                    var26 += var34;
                    var34 += var30;
                }
                var27 += -var33;
                var33 -= var29;
                var26 += -var43;
                var43 -= var29;
            }
            var36 -= var25;
            if (class52.field766 <= var46 && var45 <= class191.field3112) {
                int var47 = class268.method1789(class148.field2371, -92, arg3 + var8, class34.field561);
                int var48 = class268.method1789(class148.field2371, arg0 ^ 0xFFFFFFAC, arg3 - var8, class34.field561);
                if (var44) {
                    int var49 = class268.method1789(class148.field2371, 15, arg3 + var10, class34.field561);
                    int var50 = class268.method1789(class148.field2371, 21, arg3 - var10, class34.field561);
                    if (var45 >= class52.field766) {
                        int[] var51 = class232.field3629[var45];
                        class309.method2096(arg5, var50, (byte) -117, var51, var48);
                        class309.method2096(arg7, var49, (byte) -117, var51, var50);
                        class309.method2096(arg5, var47, (byte) -117, var51, var49);
                    }
                    if (var46 <= class191.field3112) {
                        int[] var52 = class232.field3629[var46];
                        class309.method2096(arg5, var50, (byte) -117, var52, var48);
                        class309.method2096(arg7, var49, (byte) -117, var52, var50);
                        class309.method2096(arg5, var47, (byte) -117, var52, var49);
                    }
                } else {
                    if (var45 >= class52.field766) {
                        class309.method2096(arg5, var47, (byte) -117, class232.field3629[var45], var48);
                    }
                    if (class191.field3112 >= var46) {
                        class309.method2096(arg5, var47, (byte) -117, class232.field3629[var46], var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
    public static final void method1469(byte arg0) {
        field3385++;
        if (arg0 >= -121) {
            method1473(-9);
        }
        class103.field1626.method1873(-7401);
        class218.field3422.method1873(-7401);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
    public static final void method1470(int arg0) {
        class208.field3321 = null;
        class170.field2795 = arg0;
        field3391++;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V")
    public static void method1471(int arg0) {
        field3387 = null;
        field3386 = null;
        if (arg0 != 13246) {
            method1468(42, -50, -119, -1, -61, 95, -92, -92);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method1472(byte arg0, int arg1) {
        field3384++;
        if (arg0 == -55) {
            return arg1 < 999999999 ? Integer.toString(arg1) : "*";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)Le;")
    public static final class67 method1473(int arg0) {
        if (arg0 < 41) {
            return null;
        }
        field3390++;
        int var1 = class217.field3413[0] * class140.field2284[0];
        byte[] var2 = class232.field3635[0];
        class67 var6;
        if (class109.field1692[0]) {
            byte[] var3 = class93.field1487[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class76.method555(class310.field5024[class233.method1609(var2[var5], 255)], class233.method1609(255, var3[var5]) << 24);
            }
            var6 = new class185(class14.field295, class13.field272, class80.field1286[0], class211.field3364[0], class217.field3413[0], class140.field2284[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class310.field5024[class233.method1609(var2[var8], 255)];
            }
            var6 = new class67(class14.field295, class13.field272, class80.field1286[0], class211.field3364[0], class217.field3413[0], class140.field2284[0], var7);
        }
        class180.method1265(70);
        return var6;
    }
}
