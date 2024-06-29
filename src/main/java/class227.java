import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class227 {

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lrc;")
    public static class9 field3199 = new class9(500);

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3202 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Z")
    public static boolean field3204 = false;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Lrc;")
    public static class9 field3200 = new class9(4);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V")
    public static final void method1470(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class177.field2514 = arg4;
        class286.field4431 = arg0;
        if (arg2 < -49) {
            class230.field3302 = arg1;
            field3196++;
            class279.field4238 = arg3;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg6 && arg2 == arg5 && arg3 == arg7 && arg0 == arg8) {
            class105.method637(1124985996, arg8, arg4, arg3, arg2, arg6);
        } else {
            int var10 = arg6;
            int var11 = arg2;
            int var12 = arg5 * 3;
            int var13 = arg2 * 3;
            int var14 = arg6 * 3;
            int var15 = arg7 * 3;
            int var16 = arg1 * 3;
            int var17 = var15 + var14 - var16 - var16;
            int var18 = arg0 * 3;
            int var19 = arg3 + var16 - arg6 - var15;
            int var20 = arg8 + var12 - var18 - arg2;
            int var21 = var16 - var14;
            int var22 = var12 - var13;
            int var23 = var18 + var13 - var12 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var20 * var26;
                int var28 = var19 * var26;
                int var29 = var17 * var25;
                int var30 = var23 * var25;
                int var31 = var21 * var24;
                int var32 = (var28 + var31 + var29 >> 12) + arg6;
                int var33 = var22 * var24;
                int var34 = (var27 + var30 + var33 >> 12) + arg2;
                class105.method637(1124985996, var34, arg4, var32, var11, var10);
                var11 = var34;
                var10 = var32;
            }
        }
        if (arg9 == 128) {
            field3203++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)Z")
    public static final boolean method1472(byte arg0, int arg1) {
        field3195++;
        if (arg0 > -78) {
            return true;
        } else {
            return (arg1 & -arg1) == arg1;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method1473(int arg0) {
        field3202 = null;
        field3200 = null;
        field3199 = null;
        if (arg0 != 4096) {
            method1473(45);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static final void method1474(int arg0) {
        field3197++;
        class215.field2997.method67((byte) 41);
        int var1 = -90 / ((-arg0 - 54) / 47);
    }
}
