import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class49 {

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Lje;")
    public static class67 field940 = class85.method592(255, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field941 = 5063219;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lje;")
    public static class67 field937 = class85.method592(255, "Weiter");

    @OriginalMember(owner = "client!h", name = "h", descriptor = "[I")
    public static int[] field944 = new int[25];

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "[I")
    public static int[] field938;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "[Lkc;")
    public static class72[] field945;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILee;Lhb;II)V")
    public static final void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class34 arg6, class51 arg7, int arg8, int arg9) {
        field947++;
        class47 var10 = class130.method993(arg2, (byte) 106);
        int var11;
        int var12;
        if (arg3 == 1 || arg3 == 3) {
            var11 = var10.field931;
            var12 = var10.field875;
        } else {
            var11 = var10.field875;
            var12 = var10.field931;
        }
        int var13;
        int var14;
        if (arg9 + var11 <= 104) {
            var13 = (var11 + 1 >> 1) + arg9;
            var14 = (var11 >> 1) + arg9;
        } else {
            var13 = arg9 + 1;
            var14 = arg9;
        }
        int var15;
        int var16;
        if (arg0 + var12 <= 104) {
            var15 = (var12 + 1 >> 1) + arg0;
            var16 = (var12 >> 1) + arg0;
        } else {
            var15 = arg0 + 1;
            var16 = arg0;
        }
        int[][] var17 = class142.field3253[arg4];
        int var18 = var17[var13][var15] + var17[var13][var16] + var17[var14][var16] + var17[var14][var15] >> 2;
        int var19 = (arg0 << 7) + (arg2 << 14) + arg9 + 1073741824;
        int var20 = (arg0 << 7) + (var12 << 6);
        int var21 = (arg3 << 6) + arg1;
        int var22 = (arg9 << 7) + (var11 << 6);
        if (var10.field932 == 0) {
            var19 += Integer.MIN_VALUE;
        }
        if (var10.field883 == 1) {
            var21 += 256;
        }
        if (arg1 == 22) {
            class105 var23;
            if (var10.field903 == -1 && var10.field919 == null) {
                var23 = var10.method302(var18, var20, var22, 22, var17, arg3, arg8 + 12);
            } else {
                var23 = new class3(arg2, 22, arg3, arg4, arg9, arg0, var10.field903, true, null);
            }
            arg7.method349(arg5, arg9, arg0, var18, var23, var19, var21);
            if (var10.field894 == 1) {
                arg6.method218(arg0, arg9, (byte) -126);
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class105 var46;
            if (var10.field903 == -1 && var10.field919 == null) {
                var46 = var10.method302(var18, var20, var22, 10, var17, arg3, -1);
            } else {
                var46 = new class3(arg2, 10, arg3, arg4, arg9, arg0, var10.field903, true, null);
            }
            if (var46 != null) {
                arg7.method341(arg5, arg9, arg0, var18, var11, var12, var46, arg1 == 11 ? 256 : 0, var19, var21);
            }
            if (var10.field894 != 0) {
                arg6.method212((byte) -35, var12, arg9, var10.field918, var11, arg0);
            }
        } else if (~arg1 <= arg8) {
            class105 var24;
            if (var10.field903 == -1 && var10.field919 == null) {
                var24 = var10.method302(var18, var20, var22, arg1, var17, arg3, -1);
            } else {
                var24 = new class3(arg2, arg1, arg3, arg4, arg9, arg0, var10.field903, true, null);
            }
            arg7.method341(arg5, arg9, arg0, var18, 1, 1, var24, 0, var19, var21);
            if (var10.field894 != 0) {
                arg6.method212((byte) -35, var12, arg9, var10.field918, var11, arg0);
            }
        } else if (arg1 == 0) {
            class105 var25;
            if (var10.field903 == -1 && var10.field919 == null) {
                var25 = var10.method302(var18, var20, var22, 0, var17, arg3, -1);
            } else {
                var25 = new class3(arg2, 0, arg3, arg4, arg9, arg0, var10.field903, true, null);
            }
            arg7.method330(arg5, arg9, arg0, var18, var25, null, class122.field2737[arg3], 0, var19, var21);
            if (var10.field894 != 0) {
                arg6.method224(arg0, arg3, var10.field918, arg9, arg8 ^ 0x4B, arg1);
            }
        } else if (arg1 == 1) {
            class105 var26;
            if (var10.field903 == -1 && var10.field919 == null) {
                var26 = var10.method302(var18, var20, var22, 1, var17, arg3, -1);
            } else {
                var26 = new class3(arg2, 1, arg3, arg4, arg9, arg0, var10.field903, true, null);
            }
            arg7.method330(arg5, arg9, arg0, var18, var26, null, class144.field3298[arg3], 0, var19, var21);
            if (var10.field894 != 0) {
                arg6.method224(arg0, arg3, var10.field918, arg9, arg8 ^ 0x5E, arg1);
            }
        } else if (arg1 == 2) {
            int var27 = arg3 + 1 & 0x3;
            class105 var28;
            class105 var29;
            if (var10.field903 == -1 && var10.field919 == null) {
                var28 = var10.method302(var18, var20, var22, 2, var17, arg3 + 4, -1);
                var29 = var10.method302(var18, var20, var22, 2, var17, var27, -1);
            } else {
                var28 = new class3(arg2, 2, arg3 + 4, arg4, arg9, arg0, var10.field903, true, null);
                var29 = new class3(arg2, 2, var27, arg4, arg9, arg0, var10.field903, true, null);
            }
            arg7.method330(arg5, arg9, arg0, var18, var28, var29, class122.field2737[arg3], class122.field2737[var27], var19, var21);
            if (var10.field894 != 0) {
                arg6.method224(arg0, arg3, var10.field918, arg9, arg8 ^ 0x46, arg1);
            }
        } else if (arg1 == 3) {
            class105 var30;
            if (var10.field903 == -1 && var10.field919 == null) {
                var30 = var10.method302(var18, var20, var22, 3, var17, arg3, -1);
            } else {
                var30 = new class3(arg2, 3, arg3, arg4, arg9, arg0, var10.field903, true, null);
            }
            arg7.method330(arg5, arg9, arg0, var18, var30, null, class144.field3298[arg3], 0, var19, var21);
            if (var10.field894 != 0) {
                arg6.method224(arg0, arg3, var10.field918, arg9, arg8 + 116, arg1);
            }
        } else if (arg1 == 9) {
            class105 var31;
            if (var10.field903 == -1 && var10.field919 == null) {
                var31 = var10.method302(var18, var20, var22, arg1, var17, arg3, -1);
            } else {
                var31 = new class3(arg2, arg1, arg3, arg4, arg9, arg0, var10.field903, true, null);
            }
            arg7.method341(arg5, arg9, arg0, var18, 1, 1, var31, 0, var19, var21);
            if (var10.field894 != 0) {
                arg6.method212((byte) -35, var12, arg9, var10.field918, var11, arg0);
            }
        } else if (arg1 == 4) {
            class105 var32;
            if (var10.field903 == -1 && var10.field919 == null) {
                var32 = var10.method302(var18, var20, var22, 4, var17, arg3, -1);
            } else {
                var32 = new class3(arg2, 4, arg3, arg4, arg9, arg0, var10.field903, true, null);
            }
            arg7.method338(arg5, arg9, arg0, var18, var32, null, class122.field2737[arg3], 0, 0, 0, var19, var21);
        } else if (arg1 == 5) {
            int var33 = 16;
            int var34 = arg7.method347(arg5, arg9, arg0);
            if (var34 != 0) {
                var33 = class130.method993(var34 >> 14 & 0x7FFF, (byte) 126).field906;
            }
            class105 var35;
            if (var10.field903 == -1 && var10.field919 == null) {
                var35 = var10.method302(var18, var20, var22, 4, var17, arg3, -1);
            } else {
                var35 = new class3(arg2, 4, arg3, arg4, arg9, arg0, var10.field903, true, null);
            }
            arg7.method338(arg5, arg9, arg0, var18, var35, null, class122.field2737[arg3], 0, class126.field2762[arg3] * var33, class66.field1290[arg3] * var33, var19, var21);
        } else if (arg1 == 6) {
            int var36 = arg7.method347(arg5, arg9, arg0);
            int var37 = 8;
            if (var36 != 0) {
                var37 = class130.method993(var36 >> 14 & 0x7FFF, (byte) 105).field906 / 2;
            }
            class105 var38;
            if (var10.field903 == -1 && var10.field919 == null) {
                var38 = var10.method302(var18, var20, var22, 4, var17, arg3 + 4, -1);
            } else {
                var38 = new class3(arg2, 4, arg3 + 4, arg4, arg9, arg0, var10.field903, true, null);
            }
            arg7.method338(arg5, arg9, arg0, var18, var38, null, 256, arg3, class85.field1881[arg3] * var37, class72.field1465[arg3] * var37, var19, var21);
        } else if (arg1 == 7) {
            int var39 = arg3 + 2 & 0x3;
            class105 var40;
            if (var10.field903 == -1 && var10.field919 == null) {
                var40 = var10.method302(var18, var20, var22, 4, var17, var39 + 4, -1);
            } else {
                var40 = new class3(arg2, 4, var39 + 4, arg4, arg9, arg0, var10.field903, true, null);
            }
            arg7.method338(arg5, arg9, arg0, var18, var40, null, 256, var39, 0, 0, var19, var21);
        } else if (arg1 == 8) {
            int var41 = 8;
            int var42 = arg7.method347(arg5, arg9, arg0);
            if (var42 != 0) {
                var41 = class130.method993(var42 >> 14 & 0x7FFF, (byte) 109).field906 / 2;
            }
            int var43 = arg3 + 2 & 0x3;
            class105 var44;
            class105 var45;
            if (var10.field903 == -1 && var10.field919 == null) {
                var44 = var10.method302(var18, var20, var22, 4, var17, arg3 + 4, -1);
                var45 = var10.method302(var18, var20, var22, 4, var17, var43 + 4, -1);
            } else {
                var44 = new class3(arg2, 4, arg3 + 4, arg4, arg9, arg0, var10.field903, true, null);
                var45 = new class3(arg2, 4, var43 + 4, arg4, arg9, arg0, var10.field903, true, null);
            }
            arg7.method338(arg5, arg9, arg0, var18, var44, var45, 256, arg3, class85.field1881[arg3] * var41, class72.field1465[arg3] * var41, var19, var21);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Lje;I)Lje;")
    public static final class67 method314(class67[] arg0, int arg1) {
        if (arg1 != 0) {
            method318((byte) 116);
        }
        field939++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class105.method831(arg0, arg0.length, false, 0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lfd;Lfd;Ljava/awt/Component;I)V")
    public static final void method315(class40 arg0, class40 arg1, Component arg2, int arg3) {
        field943++;
        if (class131.field2891) {
            return;
        }
        class8.method76();
        byte[] var4 = arg1.method269(0, class106.field2422, class67.field1322);
        class116.field2620 = new class113(var4, arg2);
        class114.field2586 = class116.field2620.method914();
        class89.field1957 = class58.method404(class106.field2422, (byte) 36, class19.field370, arg0);
        class103.field2337 = class58.method404(class106.field2422, (byte) 36, class148.field3392, arg0);
        class105.field2391 = class58.method404(class106.field2422, (byte) 36, class147.field3371, arg0);
        class85.field1893 = class56.method394(class106.field2422, arg0, class143.field3284, -16958);
        class103.field2333 = class56.method394(class106.field2422, arg0, class99.field2197, -16958);
        class27.field485 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class27.field485[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class27.field485[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class27.field485[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class27.field485[var8 + 192] = 16777215;
        }
        class99.field2201 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class99.field2201[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class99.field2201[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class99.field2201[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class99.field2201[var12 + 192] = 16777215;
        }
        class85.field1891 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class85.field1891[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class85.field1891[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class85.field1891[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class85.field1891[var16 + 192] = 16777215;
        }
        class18.field336 = new int[32768];
        class37.field672 = new int[256];
        class138.field3121 = new int[32768];
        class86.method605(null, -94);
        class142.field3265 = 0;
        class106.field2413 = class106.field2422;
        if (arg3 != 192) {
            return;
        }
        class75.field1620 = false;
        class118.field2667 = new int[32768];
        class150.field3441 = new int[32768];
        class106.field2416 = class106.field2422;
        if (class99.field2203 == 0) {
            class134.field3016 = true;
        } else {
            class134.field3016 = false;
        }
        if (class134.field3016) {
            class30.method193((byte) -100, 2);
        } else {
            class133.method1011(false, class76.field1640, 110, 255, class106.field2422, 2, class27.field494);
        }
        class134.method1018(false, arg3 - 82);
        class131.field2891 = true;
        class116.field2620.method906(0, 0);
        class114.field2586.method906(382, 0);
        class89.field1957.method531(382 - class89.field1957.field1592 / 2, 18);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IZ)Lnc;")
    public static final class93 method316(int arg0, boolean arg1) {
        if (arg1) {
            field938 = null;
        }
        field942++;
        class93 var2 = (class93) class15.field261.method764((long) arg0, 24182);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class81.field1790.method267((byte) -124, arg0, 12);
        class93 var4 = new class93();
        if (var3 != null) {
            var4.method684(new class91(var3), arg1);
        }
        var4.method686(2);
        class15.field261.method765((long) arg0, var4, (byte) -66);
        return var4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILfd;)V")
    public static final void method317(int arg0, class40 arg1) {
        class155.field3524 = arg1;
        if (arg0 == -105) {
            field946++;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static void method318(byte arg0) {
        if (arg0 <= 110) {
            field944 = null;
        }
        field937 = null;
        field940 = null;
        field945 = null;
        field944 = null;
        field938 = null;
    }
}
