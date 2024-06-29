import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class420 {

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field5751 = -1;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field5752 = 0;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "[[B")
    public static byte[][] field5754;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[B)Z")
    public static final boolean method2417(int arg0, byte[] arg1) {
        field5750++;
        class379 var2 = new class379(arg1);
        int var3 = -21 % ((arg0 + 21) / 59);
        int var4 = var2.method2238(255);
        if (var4 != 1) {
            return false;
        }
        boolean var5 = var2.method2238(255) == 1;
        if (var5) {
            class487.method2796(var2, 10493);
        }
        class29.method236(-11268, var2);
        return true;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
    public static final void method2418(int arg0, int arg1) {
        field5756++;
        class253 var2 = class332.method1911(arg0, (byte) -125, 2);
        var2.method1523((byte) -118);
        if (arg1 <= 91) {
            method2419(true);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
    public static final void method2419(boolean arg0) {
        field5757++;
        class507.method2898(1, 25);
        class21.method199((byte) 124);
        if (!arg0) {
            method2418(-53, -41);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    public static void method2420(byte arg0) {
        if (arg0 != -111) {
            method2420((byte) -38);
        }
        field5754 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 == arg5 && arg4 == arg9 && arg1 == arg8 && arg0 == arg7) {
            class514.method3028(arg4, arg6, -128, arg1, arg2, arg7);
        } else {
            int var10 = arg2;
            int var11 = arg4;
            int var12 = arg2 * 3;
            int var13 = arg4 * 3;
            int var14 = arg5 * 3;
            int var15 = arg9 * 3;
            int var16 = arg8 * 3;
            int var17 = arg0 * 3;
            int var18 = arg1 + var14 - var16 - arg2;
            int var19 = arg7 + var15 - var17 - arg4;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var29 + var31 + var27 >> 12) + arg2;
                int var34 = (var28 + var30 + var32 >> 12) + arg4;
                class514.method3028(var11, arg6, -128, var33, var10, var34);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg3 != 3) {
            method2420((byte) -7);
        }
        field5755++;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)V")
    public static final void method2422(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class154.field2244.field7775 * arg1 >> 8;
        field5753++;
        if (arg2 != 128) {
            method2422(-118, -119, 20, -63);
        }
        if (var4 != 0 && arg3 != -1) {
            class290.method1700(0, arg3, false, class53.field816, true, var4);
            class21.field380 = true;
        }
    }
}
