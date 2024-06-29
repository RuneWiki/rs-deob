import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class156 extends class210 {

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "[I")
    public static int[] field3095 = new int[1000];

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field3098 = -2;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public static int field3106 = 0;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public static int field3109 = -1;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Lsf;")
    public static class176 field3094 = new class176();

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "[I")
    public static int[] field3111 = new int[32];

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "Loe;")
    public static class139 field3112 = new class139(50);

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public int field3101;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public int field3102;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public int field3110;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "Lnh;")
    public static class133 field3100;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "La;")
    public class1 field3097;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "La;")
    public class1 field3103;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "Ljd;")
    public class92 field3104;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "[Ljava/lang/Object;")
    public Object[] field3108;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lib;IIIIII)V")
    public static final void method1011(class82 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0.field1662.length;
        for (int var8 = 0; var8 < var7; var8++) {
            int var21 = arg0.field1662[var8] - class129.field2601;
            int var22 = arg0.field1669[var8] - class99.field2020;
            int var23 = arg0.field1660[var8] - class92.field1829;
            int var24 = arg3 * var23 + arg4 * var21 >> 16;
            int var25 = arg4 * var23 - arg3 * var21 >> 16;
            int var27 = arg2 * var22 - arg1 * var25 >> 16;
            int var28 = arg1 * var22 + arg2 * var25 >> 16;
            if (var28 < 50) {
                return;
            }
            if (arg0.field1665 != null) {
                class82.field1677[var8] = var24;
                class82.field1678[var8] = var27;
                class82.field1673[var8] = var28;
            }
            class82.field1664[var8] = (var24 << 9) / var28 + class194.field3797;
            class82.field1667[var8] = (var27 << 9) / var28 + class194.field3795;
        }
        class194.field3802 = 0;
        int var9 = arg0.field1674.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var11 = arg0.field1674[var10];
            int var12 = arg0.field1659[var10];
            int var13 = arg0.field1671[var10];
            int var14 = class82.field1664[var11];
            int var15 = class82.field1664[var12];
            int var16 = class82.field1664[var13];
            int var17 = class82.field1667[var11];
            int var18 = class82.field1667[var12];
            int var19 = class82.field1667[var13];
            if ((var14 - var15) * (var19 - var18) - (var16 - var15) * (var17 - var18) > 0) {
                if (class31.field714 && class175.method1151(class33.field733, class150.field2971, var17, var18, var19, var14, var15, var16)) {
                    class116.field2353 = arg5;
                    class214.field4190 = arg6;
                }
                class194.field3790 = false;
                if (var14 < 0 || var15 < 0 || var16 < 0 || var14 > class194.field3800 || var15 > class194.field3800 || var16 > class194.field3800) {
                    class194.field3790 = true;
                }
                if (arg0.field1665 == null || arg0.field1665[var10] == -1) {
                    if (arg0.field1661[var10] != 12345678) {
                        class194.method1284(var17, var18, var19, var14, var15, var16, arg0.field1661[var10], arg0.field1676[var10], arg0.field1657[var10]);
                    }
                } else if (class212.field4108) {
                    int var20 = class194.field3786.method168(arg0.field1665[var10], -127);
                    class194.method1284(var17, var18, var19, var14, var15, var16, class12.method82(var20, arg0.field1661[var10]), class12.method82(var20, arg0.field1676[var10]), class12.method82(var20, arg0.field1657[var10]));
                } else if (arg0.field1668) {
                    class194.method1290(var17, var18, var19, var14, var15, var16, arg0.field1661[var10], arg0.field1676[var10], arg0.field1657[var10], class82.field1677[0], class82.field1677[1], class82.field1677[3], class82.field1678[0], class82.field1678[1], class82.field1678[3], class82.field1673[0], class82.field1673[1], class82.field1673[3], arg0.field1665[var10]);
                } else {
                    class194.method1290(var17, var18, var19, var14, var15, var16, arg0.field1661[var10], arg0.field1676[var10], arg0.field1657[var10], class82.field1677[var11], class82.field1677[var12], class82.field1677[var13], class82.field1678[var11], class82.field1678[var12], class82.field1678[var13], class82.field1673[var11], class82.field1673[var12], class82.field1673[var13], arg0.field1665[var10]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
    public static void method1012(int arg0) {
        field3111 = null;
        field3100 = null;
        if (arg0 < 115) {
            method1012(-26);
        }
        field3094 = null;
        field3095 = null;
        field3112 = null;
    }
}
