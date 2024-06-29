import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public abstract class class143 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "S")
    public static short field2391 = 205;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Ldf;")
    public static class51 field2397 = class46.method233(")4g", 100);

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "Ldf;")
    public static class51 field2400 = class46.method233("Eingabeprozedur geladen)3", 100);

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field2398 = -1;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "F")
    public static float field2395;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "Lja;")
    public static class55 field2392;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "[I")
    public static int[] field2393;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "[Ltg;")
    public static class171[] field2396;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)V")
    public static final void method1032(int arg0, byte arg1) {
        field2394++;
        if (!class207.method1426((byte) 95, arg0)) {
            return;
        }
        if (arg1 != 69) {
            field2393 = null;
        }
        class213[] var2 = class10.field106[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class213 var4 = var2[var3];
            if (var4 != null) {
                var4.field3697 = 0;
                var4.field3618 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1033(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2399++;
        if (arg8 != 3) {
            field2398 = -9;
        }
        if (arg3 == arg4 && arg0 == arg2 && arg1 == arg6 && arg5 == arg9) {
            class10.method50(arg8 ^ 0xFFFFEF93, arg0, arg1, arg7, arg5, arg3);
            return;
        }
        int var10 = arg3;
        int var11 = arg0 * 3;
        int var12 = arg4 * 3;
        int var13 = arg0;
        int var14 = arg3 * 3;
        int var15 = arg6 * 3;
        int var16 = arg2 * 3;
        int var17 = var12 + arg1 - arg3 - var15;
        int var18 = arg9 * 3;
        int var19 = var14 + var15 - var12 - var12;
        int var20 = arg5 - (var18 - var16) - arg0;
        int var21 = var12 - var14;
        int var22 = var18 - (var16 - var11) - var16;
        int var23 = var16 - var11;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var17 * var26;
            int var28 = var20 * var26;
            int var29 = var19 * var25;
            int var30 = var22 * var25;
            int var31 = var23 * var24;
            int var32 = (var28 + var30 + var31 >> 12) + arg0;
            int var33 = var21 * var24;
            int var34 = (var27 - (-var29 - var33) >> 12) + arg3;
            class10.method50(-4208, var13, var34, arg7, var32, var10);
            var10 = var34;
            var13 = var32;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public abstract void method834(byte arg0);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)I")
    public abstract int method833(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method1034(int arg0) {
        if (arg0 != 3) {
            field2398 = 106;
        }
        field2396 = null;
        field2397 = null;
        field2400 = null;
        field2393 = null;
        field2392 = null;
    }
}
