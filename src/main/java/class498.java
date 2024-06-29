import java.awt.Canvas;
import java.awt.Graphics;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class class498 extends class362 {

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field6956 = 0;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public static int field6966 = -1;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6964 = new BigInteger("81623a54b9f051249834ac97893910ee91109ccd1a87694f9e128982180113d8a7e9e11579269bca981fbc40e666cd1d03a27a32eee39ab94be2f8d8efef02d9", 16);

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "Ljava/lang/String;")
    public static String field6969 = null;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "Lej;")
    public static class124 field6968 = new class124(31, 1);

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public int field6960;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public int field6963;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "[I")
    public int[] field6959;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(II)V")
    public static final void method2937(int arg0, int arg1) {
        class708.field9601 = -1;
        class539.field7455 = null;
        if (arg1 != 22684) {
            field6956 = -117;
        }
        field6965++;
        class185.field2789 = false;
        class37.field915 = null;
        class726.field9825 = -1;
        class394.field5789 = arg0;
        class326.field4513 = 1;
        class273.field3839 = 0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
    public abstract void method1107(Canvas arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method2938(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 == arg9 && arg0 == arg7 && arg3 == arg6 && arg1 == arg4) {
            class448.method2678(arg9, -1, arg7, arg4, arg3, arg8);
        } else {
            int var10 = arg9;
            int var11 = arg7;
            int var12 = arg9 * 3;
            int var13 = arg7 * 3;
            int var14 = arg2 * 3;
            int var15 = arg0 * 3;
            int var16 = arg6 * 3;
            int var17 = arg1 * 3;
            int var18 = var14 + arg3 - var16 - arg9;
            int var19 = var15 + arg4 - arg7 - var17;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var18 * var27;
                int var29 = var19 * var27;
                int var30 = var20 * var26;
                int var31 = var21 * var26;
                int var32 = var22 * var24;
                int var33 = var23 * var24;
                int var34 = (var30 + var32 + var28 >> 12) + arg9;
                int var35 = (var29 + var31 + var33 >> 12) + arg7;
                class448.method2678(var10, -1, var11, var35, var34, arg8);
                var11 = var35;
                var10 = var34;
            }
        }
        field6962++;
        int var25 = 64 % ((50 - arg5) / 51);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static void method2939(int arg0) {
        field6968 = null;
        field6964 = null;
        if (arg0 != -1316) {
            field6968 = null;
        }
        field6969 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIILjava/awt/Graphics;IIII)V")
    public abstract void method1106(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method2940(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field6961++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg2 - arg7;
        int var12 = arg0 - arg7;
        int var13 = arg2 * arg2;
        int var14 = arg0 * arg0;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg0 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg0 - 1) * var27;
        int var37 = 51 / ((arg5 + 63) / 44);
        int var38 = var30;
        int var39 = (var12 - 1) * var29;
        int[] var40 = class691.field9345[arg6];
        class47.method550(-27, arg4 - var11, var40, arg4 - arg2, arg3);
        class47.method550(-27, arg4 + var11, var40, arg4 - var11, arg1);
        class47.method550(-27, arg2 + arg4, var40, arg4 + var11, arg3);
        while (var9 > 0) {
            boolean var41 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var8++;
                    var31 += var28;
                }
            }
            if (var41) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var38;
                        var25 += var33;
                        var10++;
                        var38 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var38;
                    var25 += var33;
                    var33 += var30;
                    var10++;
                    var38 += var30;
                }
                var26 += -var34;
                var25 += -var39;
                var34 -= var29;
                var39 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var42 = arg6 - var9;
            int var43 = arg6 + var9;
            int var44 = arg4 + var8;
            int var45 = arg4 - var8;
            if (var41) {
                int var46 = arg4 + var10;
                int var47 = arg4 - var10;
                class47.method550(-27, var47, class691.field9345[var42], var45, arg3);
                class47.method550(-27, var46, class691.field9345[var42], var47, arg1);
                class47.method550(-27, var44, class691.field9345[var42], var46, arg3);
                class47.method550(-27, var47, class691.field9345[var43], var45, arg3);
                class47.method550(-27, var46, class691.field9345[var43], var47, arg1);
                class47.method550(-27, var44, class691.field9345[var43], var46, arg3);
            } else {
                class47.method550(-27, var44, class691.field9345[var42], var45, arg3);
                class47.method550(-27, var44, class691.field9345[var43], var45, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)I")
    public static final int method2941(int arg0, boolean arg1) {
        if (!arg1) {
            field6966 = -14;
        }
        field6958++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lcea;B)V")
    public static final void method2942(class215 arg0, byte arg1) {
        field6957++;
        if ((arg0.field3066.length - arg0.field3109) < 1) {
            return;
        }
        int var2 = arg0.method1535(255);
        if (var2 < 0 || var2 > 1 || (arg0.field3066.length - arg0.field3109) < 2) {
            return;
        }
        if (arg1 != -40) {
            method2940(13, -47, -27, 107, -90, (byte) -19, -61, 36);
        }
        int var3 = arg0.method1478(842397944);
        if (var3 * 6 > arg0.field3066.length - arg0.field3109) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method1478(842397944);
            int var6 = arg0.method1533((byte) -126);
            if (var5 < class377.field5346.length && class269.field3797[var5] && (class394.field5790.method2049(var5, -107).field5287 != '1' || var6 >= -1 && var6 <= 1)) {
                class377.field5346[var5] = var6;
            }
        }
    }
}
