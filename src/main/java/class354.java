import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class354 extends class508 {

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public int field4540 = 0;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    public int field4545 = -1;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "[I")
    public static int[] field4536 = new int[32];

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "Lpi;")
    public static class340 field4547;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "Z")
    public static boolean field4549;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public int field4533;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public int field4534;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public int field4535;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public int field4537;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public int field4538;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public int field4539;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    public int field4542;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    public int field4544;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public int field4546;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    public int field4548;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "Ldn;")
    public static class201 field4551;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "[[[Ltg;")
    public static class510[][][] field4550;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4536[var1] = var0 - 1;
            var0 += var0;
        }
        field4547 = new class340(91, 3);
        field4549 = false;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLdn;)V", line = 4)
    public static final void method2076(byte arg0, class201 arg1) {
        if (arg0 != -36) {
            field4551 = null;
        }
        field4543++;
        class245.field3145 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIZIII)V", line = 21)
    public static final void method2077(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg6) {
            method2078(93);
        }
        field4541++;
        if (arg4 == arg7 && arg0 == arg3 && arg1 == arg8 && arg5 == arg9) {
            class148.method1026(arg4, arg2, arg8, arg9, arg0, 9114);
            return;
        }
        int var10 = arg4;
        int var11 = arg0;
        int var12 = arg4 * 3;
        int var13 = arg0 * 3;
        int var14 = arg7 * 3;
        int var15 = arg3 * 3;
        int var16 = arg1 * 3;
        int var17 = arg5 * 3;
        int var18 = arg8 + var14 - var16 - arg4;
        int var19 = var15 + arg9 - var17 - arg0;
        int var20 = var12 + var16 - var14 - var14;
        int var21 = var13 + var17 - var15 - var15;
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
            int var33 = (var27 + var29 + var31 >> 12) + arg4;
            int var34 = (var28 + var32 + var30 >> 12) + arg0;
            class148.method1026(var10, arg2, var33, var34, var11, 9114);
            var10 = var33;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 102)
    public static void method2078(int arg0) {
        field4551 = null;
        field4547 = null;
        field4536 = null;
        if (arg0 <= 48) {
            field4551 = null;
        }
        field4550 = null;
    }
}
