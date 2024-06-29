import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class190 {

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "[J")
    public static long[] field3415 = new long[32];

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "Loh;")
    public static class263 field3419 = class253.method1681(-121, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field3416 = -1;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Loh;")
    public static class263 field3420 = class253.method1681(-118, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "Lsb;")
    public static class216 field3414 = new class216(128);

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "Loh;")
    public static class263 field3421 = class253.method1681(-118, "titlebg");

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "Lue;")
    public static class86 field3413;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "[I")
    public static int[] field3418;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(JI)V")
    public static final void method1244(long arg0, int arg1) {
        field3411++;
        if (arg0 != 0L) {
            class154.field2792.method1516(65, 3);
            class154.field2792.method1272((byte) 41, arg0);
            int var3 = -123 % ((arg1 + 34) / 61);
            class204.field3662++;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public static void method1245(byte arg0) {
        field3420 = null;
        field3414 = null;
        field3421 = null;
        if (arg0 == -120) {
            field3418 = null;
            field3415 = null;
            field3419 = null;
            field3413 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII)V")
    public static final void method1246(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= -97) {
            return;
        }
        field3410++;
        class64 var5 = class84.method563(8, arg3, -102);
        var5.method396(true);
        var5.field1290 = arg1;
        var5.field1298 = arg2;
        var5.field1281 = arg0;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIBLlf;I)V")
    public static final void method1247(int arg0, int arg1, byte arg2, class204 arg3, int arg4) {
        if (arg2 < 120) {
            return;
        }
        field3417++;
        if (class252.field4384 >= 400) {
            return;
        }
        if (arg3.field3691 != null) {
            arg3 = arg3.method1407((byte) -31);
        }
        if (arg3 == null || !arg3.field3708) {
            return;
        }
        class263 var5 = arg3.field3681;
        if (arg3.field3659 != 0) {
            var5 = class124.method797(-64, new class263[] { var5, class1.method1(-1674, class229.field4018.field2522, arg3.field3659), class101.field1919, class134.field2460, class136.method891(-81, arg3.field3659), class68.field1378 });
        }
        if (class49.field1060 == 1) {
            class162.field2948++;
            class119.method769(arg4, (long) arg1, true, arg0, (short) 6, class124.method797(-54, new class263[] { class236.field4127, class201.field3628, var5 }), class152.field2739);
        } else if (!class130.field2387) {
            class263[] var6 = arg3.field3675;
            class57.field1182++;
            if (class125.field2306) {
                var6 = class82.method551(var6, 24526);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class136.field2475 != 0 || !var6[var7].method1766(-1, class141.field2575))) {
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 51;
                        }
                        class60.field1240++;
                        if (var7 == 1) {
                            var8 = 44;
                        }
                        if (var7 == 2) {
                            var8 = 8;
                        }
                        if (var7 == 3) {
                            var8 = 21;
                        }
                        if (var7 == 4) {
                            var8 = 46;
                        }
                        class119.method769(arg4, (long) arg1, true, arg0, var8, class124.method797(-54, new class263[] { class73.field1529, var5 }), var6[var7]);
                    }
                }
            }
            if (class136.field2475 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1766(-1, class141.field2575)) {
                        class275.field4824++;
                        short var10 = 0;
                        if (var9 == 0) {
                            var10 = 51;
                        }
                        short var11 = 0;
                        if (class229.field4018.field2522 < arg3.field3659) {
                            var11 = 2000;
                        }
                        if (var9 == 1) {
                            var10 = 44;
                        }
                        if (var9 == 2) {
                            var10 = 8;
                        }
                        if (var9 == 3) {
                            var10 = 21;
                        }
                        if (var9 == 4) {
                            var10 = 46;
                        }
                        if (var10 != 0) {
                            var10 += var11;
                        }
                        class119.method769(arg4, (long) arg1, true, arg0, var10, class124.method797(-120, new class263[] { class73.field1529, var5 }), var6[var9]);
                    }
                }
            }
            class119.method769(arg4, (long) arg1, true, arg0, (short) 1001, class124.method797(-56, new class263[] { class73.field1529, var5 }), class162.field2958);
            return;
        } else if ((class5.field108 & 0x2) == 2) {
            class119.method769(arg4, (long) arg1, true, arg0, (short) 4, class124.method797(-67, new class263[] { class39.field875, class201.field3628, var5 }), class151.field2727);
            class75.field1561++;
            return;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIIILnj;IZJ)Z")
    public static final boolean method1248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class139 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class157.field2825 == class112.field2102;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class254.field4425 || var24 >= class85.field1678) {
                    return false;
                }
                class2 var25 = class18.field417[arg0][var15][var24];
                if (var25 != null && var25.field27 >= 5) {
                    return false;
                }
            }
        }
        class70 var16 = new class70();
        var16.field1408 = arg11;
        var16.field1399 = arg0;
        var16.field1402 = arg5;
        var16.field1400 = arg6;
        var16.field1416 = arg7;
        var16.field1398 = arg8;
        var16.field1407 = arg9;
        var16.field1405 = arg1;
        var16.field1403 = arg2;
        var16.field1418 = arg1 + arg3 - 1;
        var16.field1413 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class18.field417[var22][var17][var20] == null) {
                        class18.field417[var22][var17][var20] = new class2(var22, var17, var20);
                    }
                }
                class2 var23 = class18.field417[arg0][var17][var20];
                var23.field37[var23.field27] = var16;
                var23.field36[var23.field27] = var21;
                var23.field41 |= var21;
                var23.field27++;
                if (var13 && class112.field2103[var17][var20] != 0) {
                    var14 = class112.field2103[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class112.field2103[var18][var19] == 0) {
                        class112.field2103[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class93.field1827[class86.field1728++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)[B")
    public static final byte[] method1249(int arg0, int arg1) {
        class198 var2 = (class198) class243.field4291.method1464((byte) 41, (long) arg1);
        if (arg0 < 125) {
            method1244(33L, -89);
        }
        if (var2 == null) {
            Random var3 = new Random((long) arg1);
            byte[] var4 = new byte[512];
            for (int var5 = 0; var5 < 255; var5++) {
                var4[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class256.method1699(var3, 120, var7);
                byte var9 = var4[var8];
                var4[var8] = var4[var7];
                var4[var7] = var4[511 - var6] = var9;
            }
            var2 = new class198(var4);
            class243.field4291.method1472((byte) -29, (long) arg1, var2);
        }
        field3412++;
        return var2.field3585;
    }
}
