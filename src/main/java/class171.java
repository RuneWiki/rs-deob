import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class171 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field2935 = 0;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Lia;")
    public static class257 field2939 = class28.method234(72, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Z")
    public static boolean field2937 = false;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lrg;")
    public static class121 field2941;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "[Lhj;")
    public static class132[] field2936;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method1170(byte arg0) {
        field2941 = null;
        field2936 = null;
        field2939 = null;
        int var1 = 81 % ((49 - arg0) / 58);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V")
    public static final void method1171(int arg0, int arg1) {
        class143.field2516 = -1;
        field2940++;
        if (arg0 < 126) {
            method1172(50, 106, (byte) 124, 122, 47, -76, 96, 62, 120, 22);
        }
        class233.field3997 = arg1;
        class143.field2516 = -1;
        class228.method1488((byte) 90);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIBIIIIIII)V")
    public static final void method1172(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 96 / ((-arg2 - 72) / 41);
        if (arg3 == arg8 && arg0 == arg1 && arg4 == arg6 && arg5 == arg9) {
            class152.method1061(arg9, -1, arg8, arg1, arg7, arg6);
        } else {
            int var11 = arg1;
            int var12 = arg8;
            int var13 = arg3 * 3;
            int var14 = arg1 * 3;
            int var15 = arg4 * 3;
            int var16 = arg8 * 3;
            int var17 = arg0 * 3;
            int var18 = arg5 * 3;
            int var19 = arg6 + var13 - arg8 - var15;
            int var20 = arg9 + var17 - arg1 - var18;
            int var21 = var16 + var15 - var13 - var13;
            int var22 = var18 + var14 - var17 - var17;
            int var23 = var13 - var16;
            int var24 = var17 - var14;
            for (int var25 = 128; var25 <= 4096; var25 += 128) {
                int var26 = var25 * var25 >> 12;
                int var27 = var25 * var26 >> 12;
                int var28 = var20 * var27;
                int var29 = var19 * var27;
                int var30 = var21 * var26;
                int var31 = var22 * var26;
                int var32 = var23 * var25;
                int var33 = var24 * var25;
                int var34 = arg8 + (var29 + var30 + var32 >> 12);
                int var35 = (var28 + var31 + var33 >> 12) + arg1;
                class152.method1061(var35, -1, var12, var11, arg7, var34);
                var12 = var34;
                var11 = var35;
            }
        }
        field2942++;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)[B")
    public static final synchronized byte[] method1173(int arg0, int arg1) {
        field2938++;
        if (arg0 == arg1 && class54.field1166 > 0) {
            byte[] var2 = class24.field467[--class54.field1166];
            class24.field467[class54.field1166] = null;
            return var2;
        } else if (arg0 == 5000 && class215.field3649 > 0) {
            byte[] var3 = class237.field4051[--class215.field3649];
            class237.field4051[class215.field3649] = null;
            return var3;
        } else if (arg0 == 30000 && class197.field3335 > 0) {
            byte[] var4 = class87.field1691[--class197.field3335];
            class87.field1691[class197.field3335] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }
}
