import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class338 extends class400 {

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "[I")
    private int[] field5046 = new int[512];

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public static int field5049 = -1;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "[[I")
    public static int[][] field5047 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "[Z")
    public static boolean[] field5050 = new boolean[100];

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "Lvw;")
    public static class279 field5043;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "[I")
    public static int[] field5048;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIBIILfh;III)Z")
    public static final boolean method2173(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, class605 arg7, int arg8, int arg9, int arg10) {
        field5042++;
        int var11 = arg6;
        int var12 = arg2;
        int var13 = -23 / ((arg4 + 65) / 39);
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg6 - var14;
        class78.field1571[var14][var15] = 99;
        int var17 = arg2 - var15;
        class284.field4218[var14][var15] = 0;
        byte var18 = 0;
        class89.field1641[var18] = arg6;
        int var19 = 0;
        byte var10001 = var18;
        int var27 = var18 + 1;
        class257.field3795[var10001] = arg2;
        int[][] var20 = arg7.field8803;
        while (var27 != var19) {
            var12 = class257.field3795[var19];
            var11 = class89.field1641[var19];
            int var21 = var12 - var17;
            int var22 = var11 - var16;
            var19 = var19 + 1 & 0xFFF;
            int var23 = var11 - arg7.field8796;
            int var24 = var12 - arg7.field8807;
            if (arg5 == -4) {
                if (arg3 == var11 && arg1 == var12) {
                    class213.field3254 = var12;
                    class399.field5808 = var11;
                    return true;
                }
            } else if (arg5 == -3) {
                if (class2.method187(arg0, arg1, var11, 2, 2, arg9, 2, var12, arg3)) {
                    class399.field5808 = var11;
                    class213.field3254 = var12;
                    return true;
                }
            } else if (arg5 == -2) {
                if (arg7.method3468(2, arg0, arg1, var12, arg9, -1, arg8, var11, 2, arg3)) {
                    class213.field3254 = var12;
                    class399.field5808 = var11;
                    return true;
                }
            } else if (arg5 == -1) {
                if (arg7.method3475(arg3, arg8, arg1, true, arg0, var12, 2, arg9, var11)) {
                    class399.field5808 = var11;
                    class213.field3254 = var12;
                    return true;
                }
            } else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
                if (arg7.method3478(arg3, arg5, 2, arg1, 100, arg10, var12, var11)) {
                    class399.field5808 = var11;
                    class213.field3254 = var12;
                    return true;
                }
            } else if (arg7.method3476(2, arg3, var12, arg5, arg1, arg10, var11, -42)) {
                class213.field3254 = var12;
                class399.field5808 = var11;
                return true;
            }
            int var26 = class284.field4218[var22][var21] + 1;
            if (var22 > 0 && class78.field1571[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + 1] & 0x4E240000) == 0) {
                class89.field1641[var27] = var11 - 1;
                class257.field3795[var27] = var12;
                class78.field1571[var22 - 1][var21] = 2;
                var27 = var27 + 1 & 0xFFF;
                class284.field4218[var22 - 1][var21] = var26;
            }
            if (var22 < 126 && class78.field1571[var22 + 1][var21] == 0 && (var20[var23 + 2][var24] & 0x60E40000) == 0 && (var20[var23 + 2][var24 + 1] & 0x78240000) == 0) {
                class89.field1641[var27] = var11 + 1;
                class257.field3795[var27] = var12;
                class78.field1571[var22 + 1][var21] = 8;
                var27 = var27 + 1 & 0xFFF;
                class284.field4218[var22 + 1][var21] = var26;
            }
            if (var21 > 0 && class78.field1571[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + 1][var24 - 1] & 0x60E40000) == 0) {
                class89.field1641[var27] = var11;
                class257.field3795[var27] = var12 - 1;
                class78.field1571[var22][var21 - 1] = 1;
                var27 = var27 + 1 & 0xFFF;
                class284.field4218[var22][var21 - 1] = var26;
            }
            if (var21 < 126 && class78.field1571[var22][var21 + 1] == 0 && (var20[var23][var24 + 2] & 0x4E240000) == 0 && (var20[var23 + 1][var24 + 2] & 0x78240000) == 0) {
                class89.field1641[var27] = var11;
                class257.field3795[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class78.field1571[var22][var21 + 1] = 4;
                class284.field4218[var22][var21 + 1] = var26;
            }
            if (var22 > 0 && var21 > 0 && class78.field1571[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24] & 0x4FA40000) == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0 && (var20[var23][var24 - 1] & 0x63E40000) == 0) {
                class89.field1641[var27] = var11 - 1;
                class257.field3795[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class78.field1571[var22 - 1][var21 - 1] = 3;
                class284.field4218[var22 - 1][var21 - 1] = var26;
            }
            if (var22 < 126 && var21 > 0 && class78.field1571[var22 + 1][var21 - 1] == 0 && (var20[var23 + 1][var24 - 1] & 0x63E40000) == 0 && (var20[var23 + 2][var24 - 1] & 0x60E40000) == 0 && (var20[var23 + 2][var24] & 0x78E40000) == 0) {
                class89.field1641[var27] = var11 + 1;
                class257.field3795[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class78.field1571[var22 + 1][var21 - 1] = 9;
                class284.field4218[var22 + 1][var21 - 1] = var26;
            }
            if (var22 > 0 && var21 < 126 && class78.field1571[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][var24 + 1] & 0x4FA40000) == 0 && (var20[var23 - 1][var24 + 2] & 0x4E240000) == 0 && (var20[var23][var24 + 2] & 0x7E240000) == 0) {
                class89.field1641[var27] = var11 - 1;
                class257.field3795[var27] = var12 + 1;
                class78.field1571[var22 - 1][var21 + 1] = 6;
                var27 = var27 + 1 & 0xFFF;
                class284.field4218[var22 - 1][var21 + 1] = var26;
            }
            if (var22 < 126 && var21 < 126 && class78.field1571[var22 + 1][var21 + 1] == 0 && (var20[var23 + 1][var24 + 2] & 0x7E240000) == 0 && (var20[var23 + 2][var24 + 2] & 0x78240000) == 0 && (var20[var23 + 2][var24 + 1] & 0x78E40000) == 0) {
                class89.field1641[var27] = var11 + 1;
                class257.field3795[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class78.field1571[var22 + 1][var21 + 1] = 12;
                class284.field4218[var22 + 1][var21 + 1] = var26;
            }
        }
        class213.field3254 = var12;
        class399.field5808 = var11;
        return false;
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
    public static void method2174(int arg0) {
        field5047 = null;
        field5043 = null;
        field5050 = null;
        field5048 = null;
        if (arg0 != -24783) {
            field5048 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)Lai;")
    public static final class557 method2175(byte arg0) {
        field5045++;
        if (arg0 != -74) {
            field5047 = null;
        }
        return class407.field5871;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II[FIFIFIFIF)V")
    public final void method2176(int arg0, int arg1, float[] arg2, int arg3, float arg4, int arg5, float arg6, int arg7, float arg8, int arg9, float arg10) {
        field5044++;
        int var12 = (int) ((float) arg1 * arg10 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg0 * arg6 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg5 * arg4 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg9 * arg4;
        int var19 = (int) var18;
        if (arg3 != 2015625216) {
            method2173(-71, 63, 0, 80, (byte) 60, -86, -109, null, 31, 27, 76);
        }
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        int var23 = var20 & var17;
        float var24 = class203.method1434(var21, (byte) -49);
        int var25 = var19 & var17;
        int var26 = this.field5046[var25];
        int var27 = this.field5046[var23];
        for (int var28 = 0; var28 < arg0; var28++) {
            float var29 = (float) var28 * arg6;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            float var35 = class203.method1434(var32, (byte) -49);
            int var36 = var30 & var15;
            int var37 = this.field5046[var26 + var36];
            int var38 = this.field5046[var26 + var34];
            int var39 = this.field5046[var27 + var36];
            int var40 = this.field5046[var27 + var34];
            for (int var41 = 0; var41 < arg1; var41++) {
                float var42 = (float) var41 * arg10;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                int var48 = var44 & var13;
                float var49 = class203.method1434(var45, (byte) -49);
                arg2[arg7++] = arg8 * class11.method283(var24, class11.method283(var35, class11.method283(var49, class459.method2751(var46, var33, var22, class691.method3871(arg3, 2015625337), class481.method2919(this.field5046[var37 + var47], 7)), class459.method2751(var45, var33, var22, 113, class481.method2919(this.field5046[var37 + var48], 7)), 256), class11.method283(var49, class459.method2751(var46, var32, var22, arg3 - 2015625101, class481.method2919(this.field5046[var38 + var47], 7)), class459.method2751(var45, var32, var22, arg3 - 2015625207, class481.method2919(7, this.field5046[var38 + var48])), 256), 256), class11.method283(var35, class11.method283(var49, class459.method2751(var46, var33, var21, class691.method3871(arg3, -2015625236), class481.method2919(this.field5046[var39 + var47], 7)), class459.method2751(var45, var33, var21, arg3 - 2015625105, class481.method2919(7, this.field5046[var39 + var48])), class691.method3871(arg3, 2015625472)), class11.method283(var49, class459.method2751(var46, var32, var21, arg3 - 2015625091, class481.method2919(this.field5046[var40 + var47], 7)), class459.method2751(var45, var32, var21, arg3 - 2015625242, class481.method2919(this.field5046[var40 + var48], 7)), arg3 - 2015624960), arg3 - 2015624960), 256);
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(I)V")
    public class338(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field5046[var3] = this.field5046[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field5046[var5];
            this.field5046[var5] = this.field5046[var5 + 256] = this.field5046[var4];
            this.field5046[var4] = this.field5046[var4 + 256] = var6;
        }
    }
}
