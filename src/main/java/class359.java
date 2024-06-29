import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class359 {

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "Lob;")
    public static class521 field5325 = new class521(45, 3);

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "Z")
    public static boolean field5330 = false;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "Lkh;")
    public static class13 field5331 = new class13(64);

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field5332 = 0;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "Lfw;")
    public static class41 field5328;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "Z")
    public static boolean field5329;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "[[I")
    public static int[][] field5327;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
    public static final void method2253(int arg0) {
        class384.field5774 = arg0;
        class522.field7636 = new class85[50];
        field5322++;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lya;Lkn;ILql;)V")
    public static final void method2254(class38 arg0, class523 arg1, int arg2, class519 arg3) {
        field5326++;
        class16 var4 = arg3.method3081(131072, arg0);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method123();
        if (var4.method125() > var5) {
            var5 = var4.method125();
        }
        byte var6 = 10;
        int var7 = arg1.field7646;
        int var8 = arg1.field7644;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field7576 != null) {
            var9 = class431.field6391.method2164(null, (byte) 79, arg3.field7576, null, class227.field3697);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class227.field3697[var12];
                if (var12 < (var9 - 1)) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class181.field2718.method1421(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class181.field2718.method1427() * var9 + class181.field2718.method1423() / 2;
        }
        int var15 = arg1.field7646 + (var5 / 2);
        int var16 = arg1.field7644;
        if (var7 < (class7.field94 + var5)) {
            var7 = class7.field94;
            var15 = class7.field94 + (var5 / 2) + 5 - (-(var10 / 2) + -var6);
        } else if (var7 > class7.field111 - var5) {
            var7 = class7.field111 - var5;
            var15 = class7.field111 - (var5 / 2) - var6 - (var10 / 2) - 5;
        }
        if (class7.field113 + var5 > var8) {
            var16 = var5 / 2 + class7.field113 + var6;
            var8 = class7.field113;
        } else if (var8 > (class7.field98 - var5)) {
            var8 = class7.field98 - var5;
            var16 = class7.field98 - (var5 / 2) - var6 - var11;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg1.field7646), (double) (var8 - arg1.field7644)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method128((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg2 != -1) {
            field5331 = null;
        }
        if (arg3.field7576 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var21 = var16 + (class181.field2718.method1427() * var9 + 3);
            var20 = var18 + var10 + 10;
            if (arg3.field7564 != 0) {
                arg0.method364(var16, 1, arg3.field7564, var20 - var18, var18, var21 - var16);
            }
            if (arg3.field7589 != 0) {
                arg0.method276(arg3.field7589, var18, 1, var20 - var18, var16, var21 - var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class227.field3697[var22];
                if (var9 - 1 > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class181.field2718.method1426(arg0, var23, var15, var16, arg3.field7566, true);
                var16 += class181.field2718.method1427();
            }
        }
        if (arg3.field7581 == -1 && arg3.field7576 == null) {
            return;
        }
        class162 var24 = new class162(arg1);
        int var25 = var5 >> 1;
        var24.field2403 = var21;
        var24.field2401 = var8 + var25;
        var24.field2405 = var7 + var25;
        var24.field2402 = var20;
        var24.field2408 = var19;
        var24.field2410 = var8 - var25;
        var24.field2411 = var7 - var25;
        var24.field2412 = var18;
        class34.field394.method994(var24, arg2 - 3609);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B[IIII)V")
    public static final void method2255(byte arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field5324++;
        arg3--;
        int var6 = arg2 - 1;
        int var5 = var6 - 7;
        while (var5 > arg3) {
            int var7 = arg3 + 1;
            arg1[var7] = arg4;
            int var8 = var7 + 1;
            arg1[var8] = arg4;
            int var9 = var8 + 1;
            arg1[var9] = arg4;
            int var10 = var9 + 1;
            arg1[var10] = arg4;
            int var11 = var10 + 1;
            arg1[var11] = arg4;
            int var12 = var11 + 1;
            arg1[var12] = arg4;
            int var13 = var12 + 1;
            arg1[var13] = arg4;
            arg3 = var13 + 1;
            arg1[arg3] = arg4;
        }
        while (var6 > arg3) {
            arg3++;
            arg1[arg3] = arg4;
        }
        if (arg0 >= -64) {
            method2257(-44);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5323++;
        if (arg5 == arg6) {
            class201.method1406(arg3, arg7, arg0, arg2, 22, arg4, arg6);
        } else if (arg1 == -1) {
            if (arg3 - arg6 >= class327.field4931 && (arg3 + arg6) <= class184.field2777 && class404.field5987 <= arg4 - arg5 && arg4 + arg5 <= class433.field6414) {
                class325.method2072(arg0, arg7, (byte) -46, arg4, arg5, arg2, arg6, arg3);
            } else {
                class81.method686(arg0, 106, arg5, arg2, arg6, arg7, arg3, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
    public static void method2257(int arg0) {
        field5325 = null;
        field5327 = null;
        if (arg0 == -1) {
            field5331 = null;
            field5328 = null;
        }
    }
}
