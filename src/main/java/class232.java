import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class232 {

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field3410 = 0;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Z")
    public static boolean field3415 = false;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "Lbg;")
    public static class324 field3417 = new class324(14, 3);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public int field3419;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Ljava/lang/String;")
    public String field3409;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "[[[B")
    public static byte[][][] field3411;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1554(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3413++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg3 * arg3;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        if (arg5 > -96) {
            return;
        }
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg0 - 1) * var15;
        if (class471.field6963 <= arg4 && arg4 <= class401.field5947) {
            int var21 = class332.method2034(class126.field1842, -24309, arg1 + arg3, class72.field992);
            int var22 = class332.method2034(class126.field1842, -24309, arg1 - arg3, class72.field992);
            class531.method3136(var22, -110, arg2, var21, class141.field1996[arg4]);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var17 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var20;
            var7--;
            var20 -= var15;
            var18 -= var15;
            int var23 = arg4 - var7;
            int var24 = arg4 + var7;
            if (class471.field6963 <= var24 && class401.field5947 >= var23) {
                int var25 = class332.method2034(class126.field1842, -24309, arg1 + var6, class72.field992);
                int var26 = class332.method2034(class126.field1842, -24309, arg1 - var6, class72.field992);
                if (class471.field6963 <= var23) {
                    class531.method3136(var26, -91, arg2, var25, class141.field1996[var23]);
                }
                if (var24 <= class401.field5947) {
                    class531.method3136(var26, -115, arg2, var25, class141.field1996[var24]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Luu;B)Luu;")
    public static final class188 method1555(class188 arg0, byte arg1) {
        field3408++;
        if (arg0.field2745 != -1) {
            return class371.method2286(0, arg0.field2745);
        }
        int var2 = arg0.field2678 >>> 16;
        class511 var3 = new class511(class49.field545);
        for (class305 var4 = (class305) var3.method3045(4); var4 != null; var4 = (class305) var3.method3044(true)) {
            if (var4.field4333 == var2) {
                return class371.method2286(0, (int) var4.field3271);
            }
        }
        if (arg1 < 55) {
            method1558(126, 51);
        }
        return null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILuu;)Luu;")
    public static final class188 method1556(int arg0, class188 arg1) {
        field3412++;
        class188 var2 = client.method1386(arg1);
        if (var2 == null) {
            var2 = arg1.field2687;
        }
        if (arg0 != 3547) {
            field3411 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public static final void method1557(byte arg0) {
        class326.field4576.method293(((float) class478.field7044.field3330 * 0.1F + 0.7F) * class233.field3427);
        if (arg0 != 84) {
            field3417 = null;
        }
        field3418++;
        class326.field4576.method305(class23.field248, class108.field1543, class223.field3274, (float) (class460.field6767 << 0), (float) (class14.field161 << 0), (float) (class156.field2220 << 0));
        class326.field4576.method359(class53.field580);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lho;")
    public static final class102 method1558(int arg0, int arg1) {
        field3416++;
        class102[] var2 = class398.method2434(-120);
        for (int var3 = arg1; var3 < var2.length; var3++) {
            if (var2[var3].field1430 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
    public static void method1559(boolean arg0) {
        field3417 = null;
        field3411 = null;
        if (arg0) {
            field3411 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method1560(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field3414++;
        int var8 = arg6 - arg7;
        if (arg5) {
            field3411 = null;
        }
        int var9 = arg0 + arg7;
        for (int var10 = arg0; var10 < var9; var10++) {
            class531.method3136(arg3, 126, arg4, arg1, class141.field1996[var10]);
        }
        int var11 = arg1 - arg7;
        for (int var12 = arg6; var12 > var8; var12--) {
            class531.method3136(arg3, -37, arg4, arg1, class141.field1996[var12]);
        }
        int var13 = arg3 + arg7;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class141.field1996[var14];
            class531.method3136(arg3, 118, arg4, var13, var15);
            class531.method3136(var13, 119, arg2, var11, var15);
            class531.method3136(var11, 125, arg4, arg1, var15);
        }
    }
}
