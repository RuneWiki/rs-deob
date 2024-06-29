import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class39 {

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static volatile int field646 = 0;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "Lqc;")
    public static class258 field649 = new class258(16);

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Lhh;")
    private static class163 field652 = class137.method1065("K", 17);

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Lhh;")
    public static class163 field651 = field652;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "S")
    public static short field654 = 1;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "Lhh;")
    public static class163 field655 = field652;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Lad;")
    public static class43 field653 = new class43(128);

    @OriginalMember(owner = "client!og", name = "n", descriptor = "J")
    public static long field658 = 0L;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "[I")
    public static int[] field657 = new int[5];

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field656 = 0;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field659 = -1;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "Lud;")
    public static class198 field650;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static final void method273(int arg0) {
        class24.field388.method120((byte) -126);
        field645++;
        if (arg0 <= 97) {
            method276(6);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIILta;IJ)Z")
    public static final boolean method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class165 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class152.method1128(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 > -66) {
            method276(56);
        }
        if (arg3 == arg9 && arg0 == arg8 && arg2 == arg6 && arg1 == arg5) {
            class1.method6(928944748, arg2, arg5, arg3, arg4, arg0);
        } else {
            int var10 = arg3;
            int var11 = arg3 * 3;
            int var12 = arg0;
            int var13 = arg0 * 3;
            int var14 = arg9 * 3;
            int var15 = arg8 * 3;
            int var16 = arg6 * 3;
            int var17 = arg1 * 3;
            int var18 = var15 + arg5 - arg0 - var17;
            int var19 = arg2 + var14 - arg3 - var16;
            int var20 = var17 + var13 - var15 - var15;
            int var21 = var11 + var16 - var14 - var14;
            int var22 = var15 - var13;
            int var23 = var14 - var11;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var18 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var23 * var24;
                int var32 = arg3 + (var30 + var31 + var27 >> 12);
                int var33 = var22 * var24;
                int var34 = (var28 - (-var29 - var33) >> 12) + arg0;
                class1.method6(928944748, var32, var34, var10, arg4, var12);
                var10 = var32;
                var12 = var34;
            }
        }
        field647++;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public static void method276(int arg0) {
        field652 = null;
        if (arg0 != -6959) {
            method273(-122);
        }
        field651 = null;
        field655 = null;
        field649 = null;
        field650 = null;
        field653 = null;
        field657 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Lvd;")
    public static final class125 method277(int arg0, int arg1, int arg2) {
        class144 var3 = class259.field4542[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class125 var4 = var3.field2729;
            var3.field2729 = null;
            return var4;
        }
    }
}
