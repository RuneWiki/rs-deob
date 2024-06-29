import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class210 {

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public int field3672 = 0;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "Leb;")
    public static class230 field3660 = class68.method589(0, ": ");

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field3668 = 0;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Leb;")
    public static class230 field3661 = class68.method589(0, "settings");

    @OriginalMember(owner = "client!og", name = "o", descriptor = "Leb;")
    public static class230 field3674 = class68.method589(0, "welle:");

    @OriginalMember(owner = "client!og", name = "j", descriptor = "[I")
    public static int[] field3669 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Li;")
    public static class55 field3663;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Z")
    public static boolean field3666;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIILhj;IJ)Z")
    public static final boolean method1459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class70 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class150.method1134(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static final void method1460(int arg0) {
        field3665++;
        int[] var1 = new int[class56.field1037];
        int var2 = 0;
        int var3 = -44 / ((-arg0 - 10) / 38);
        for (int var4 = 0; var4 < class56.field1037; var4++) {
            class12 var6 = class214.method1484(var4, -1);
            if (var6.field218 >= 0 || var6.field230 >= 0) {
                var1[var2++] = var4;
            }
        }
        class154.field2752 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class154.field2752[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lfk;Z)V")
    public final void method1461(class14 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method200(255);
            if (var3 == 0) {
                if (!arg1) {
                    field3676 = 25;
                }
                field3667++;
                return;
            }
            this.method1465(0, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public static void method1462(int arg0) {
        field3661 = null;
        field3660 = null;
        field3674 = null;
        field3669 = null;
        field3663 = null;
        if (arg0 != 3) {
            method1466(true);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)[B")
    public static final byte[] method1463(int arg0, boolean arg1) {
        if (!arg1) {
            method1466(false);
        }
        field3673++;
        class71 var2 = (class71) class120.field2114.method273((long) arg0, 255);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class51.method413(var4, var7, Integer.MIN_VALUE);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class71(var3);
            class120.field2114.method276(var2, (long) arg0, -106);
        }
        return var2.field1302;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3675++;
        int var8 = arg0;
        int var9 = 0;
        int var10 = arg2 - arg3;
        int var11 = 0;
        int var12 = arg2 * arg2;
        int var13 = arg0 - arg3;
        int var14 = arg0 * arg0;
        int var15 = var10 * var10;
        int var16 = var12 << 1;
        int var17 = var13 * var13;
        int var18 = var15 << 1;
        int var19 = var17 << 1;
        int var20 = arg0 << 1;
        int var21 = var14 << 1;
        int var22 = var13 << 1;
        int var23 = (1 - var20) * var12 + var21;
        int var24 = var14 - (var20 - 1) * var16;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var17 - ((var22 - 1) * var18);
        int var27 = var12 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var17 << 2;
        int var31 = (var20 - 3) * var16;
        int var32 = (var22 - 3) * var18;
        int var33 = var21 * 3;
        int var34 = arg7 * var19;
        int var35 = var28;
        int var36 = (arg0 - 1) * var27;
        int var37 = var30;
        int var38 = (var13 - 1) * var29;
        if (arg5 >= class15.field345 && class259.field4587 >= arg5) {
            int[] var39 = class66.field1254[arg5];
            int var40 = class106.method882(class78.field1404, arg7 - 2, class42.field769, arg1 - arg2);
            int var41 = class106.method882(class78.field1404, 1, class42.field769, arg1 + arg2);
            int var42 = class106.method882(class78.field1404, 1, class42.field769, arg1 - var10);
            int var43 = class106.method882(class78.field1404, 1, class42.field769, arg1 + var10);
            class182.method1311(arg6, var42, true, var39, var40);
            class182.method1311(arg4, var43, true, var39, var42);
            class182.method1311(arg6, var41, true, var39, var43);
        }
        while (var8 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var33;
                    var35 += var28;
                    var33 += var28;
                    var9++;
                }
            }
            if (var24 < 0) {
                var9++;
                var24 += var35;
                var23 += var33;
                var33 += var28;
                var35 += var28;
            }
            var23 += -var36;
            boolean var44 = var8 <= var13;
            var36 -= var27;
            var8--;
            int var45 = arg5 - var8;
            var24 += -var31;
            var31 -= var27;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var34;
                        var11++;
                        var26 += var37;
                        var34 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var34;
                    var11++;
                    var34 += var30;
                    var26 += var37;
                    var37 += var30;
                }
                var25 += -var38;
                var38 -= var29;
                var26 += -var32;
                var32 -= var29;
            }
            int var46 = arg5 + var8;
            if (var46 >= class15.field345 && class259.field4587 >= var45) {
                int var47 = class106.method882(class78.field1404, 1, class42.field769, arg1 + var9);
                int var48 = class106.method882(class78.field1404, 1, class42.field769, arg1 - var9);
                if (var44) {
                    int var49 = class106.method882(class78.field1404, 1, class42.field769, arg1 + var11);
                    int var50 = class106.method882(class78.field1404, 1, class42.field769, arg1 - var11);
                    if (var45 >= class15.field345) {
                        int[] var51 = class66.field1254[var45];
                        class182.method1311(arg6, var50, true, var51, var48);
                        class182.method1311(arg4, var49, true, var51, var50);
                        class182.method1311(arg6, var47, true, var51, var49);
                    }
                    if (class259.field4587 >= var46) {
                        int[] var52 = class66.field1254[var46];
                        class182.method1311(arg6, var50, true, var52, var48);
                        class182.method1311(arg4, var49, true, var52, var50);
                        class182.method1311(arg6, var47, true, var52, var49);
                    }
                } else {
                    if (var45 >= class15.field345) {
                        class182.method1311(arg6, var47, true, class66.field1254[var45], var48);
                    }
                    if (var46 <= class259.field4587) {
                        class182.method1311(arg6, var47, true, class66.field1254[var46], var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILfk;)V")
    private final void method1465(int arg0, int arg1, class14 arg2) {
        if (arg0 != 0) {
            field3674 = null;
        }
        if (arg1 == 5) {
            this.field3672 = arg2.method161(4);
        }
        field3664++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
    public static final void method1466(boolean arg0) {
        if (class213.field3695 == null || class72.field1320 == null) {
            class72.field1320 = new int[256];
            class213.field3695 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class213.field3695[var1] = (int) (Math.sin(var2) * 4096.0D);
                class72.field1320[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (!arg0) {
            method1466(true);
        }
        field3671++;
    }
}
