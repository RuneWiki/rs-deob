import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class184 {

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field3162 = 0;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field3166 = 0;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Ldb;")
    public static class110 field3167;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)I")
    public static final int method1266(int arg0, int arg1) {
        field3161++;
        if (arg0 > -110) {
            field3166 = 73;
        }
        return (arg1 & 0xFDB29) >> 17;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)I")
    public static int method1267(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static void method1268(int arg0) {
        field3167 = null;
        if (arg0 > -66) {
            method1269(-22, -110, -11, -114, -115, -23, -62, 64, -126, -52);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 != -25) {
            method1271(25L, true);
        }
        field3163++;
        if (arg8 == arg9 && arg4 == arg5 && arg0 == arg3 && arg2 == arg7) {
            class142.method1059(0, arg8, arg0, arg4, arg1, arg2);
            return;
        }
        int var10 = arg8 * 3;
        int var11 = arg8;
        int var12 = arg4 * 3;
        int var13 = arg4;
        int var14 = arg9 * 3;
        int var15 = arg3 * 3;
        int var16 = arg5 * 3;
        int var17 = arg7 * 3;
        int var18 = arg0 + var14 - arg8 - var15;
        int var19 = var15 + var10 - var14 - var14;
        int var20 = arg2 + var16 - var17 - arg4;
        int var21 = var16 - var12;
        int var22 = var14 - var10;
        int var23 = var17 - var16 - (var16 - var12);
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var20 * var26;
            int var28 = var18 * var26;
            int var29 = var23 * var25;
            int var30 = var19 * var25;
            int var31 = var22 * var24;
            int var32 = arg8 + (var28 + var30 + var31 >> 12);
            int var33 = var21 * var24;
            int var34 = arg4 + (var27 + var29 + var33 >> 12);
            class142.method1059(0, var11, var32, var13, arg1, var34);
            var13 = var34;
            var11 = var32;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Llj;Z)V")
    public static final void method1270(class216 arg0, boolean arg1) {
        if (arg1) {
            field3164 = 97;
        }
        field3168++;
        byte[] var2 = new byte[24];
        if (class144.field2534 != null) {
            try {
                class144.field2534.method342(4, 0L);
                class144.field2534.method336(0, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1488(0, -89, var2, 24);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(JZ)V")
    public static final void method1271(long arg0, boolean arg1) {
        class237.field4084.field3728 = 0;
        class237.field4084.method1477(29, -26755);
        class237.field4084.method1484(arg0, (byte) 38);
        if (!arg1) {
            return;
        }
        class177.field3070 = 0;
        class245.field4331 = 0;
        class9.field210 = 1;
        class202.field3440 = -3;
        field3165++;
    }
}
