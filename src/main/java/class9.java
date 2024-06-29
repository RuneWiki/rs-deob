import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class9 extends class67 {

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "[Lm;")
    public static class131[] field140 = new class131[6];

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public int field136;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "Lbj;")
    public static class22 field137;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "[I")
    public int[] field128;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "[I")
    public int[] field129;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "[I")
    public int[] field132;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "[Lp;")
    public class163[] field138;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "[Lp;")
    public class163[] field139;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "[[[B")
    public byte[][][] field131;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIII)V")
    public static final void method46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field135++;
        class136.method908(arg3, false);
        int var7 = arg3 - arg6;
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = 0;
        int var9 = arg3;
        int var10 = -var7;
        int var11 = var7;
        int var12 = arg4;
        int var13 = -arg3;
        int var14 = -1;
        int var15 = arg1 - var7;
        int var16 = arg1 + var7;
        int[] var17 = class3.field42[arg5];
        class230.method1536(arg1 - arg3, arg2, -7, var15, var17);
        class230.method1536(var15, arg0, -7, var16, var17);
        class230.method1536(var16, arg2, arg4 - 6, arg1 + arg3, var17);
        while (var8 < var9) {
            var14 += 2;
            var10 += var14;
            var12 += 2;
            if (var10 >= 0 && var11 >= 1) {
                class29.field482[var11] = var8;
                var11--;
                var10 -= var11 << 1;
            }
            var13 += var12;
            var8++;
            if (var13 >= 0) {
                var9--;
                if (var9 < var7) {
                    int[] var18 = class3.field42[arg5 + var9];
                    int var19 = class29.field482[var9];
                    int[] var20 = class3.field42[arg5 - var9];
                    int var21 = arg1 - var8;
                    int var22 = arg1 + var8;
                    int var23 = arg1 + var19;
                    int var24 = arg1 - var19;
                    class230.method1536(var21, arg2, -7, var24, var18);
                    class230.method1536(var24, arg0, -7, var23, var18);
                    class230.method1536(var23, arg2, -7, var22, var18);
                    class230.method1536(var21, arg2, -7, var24, var20);
                    class230.method1536(var24, arg0, -7, var23, var20);
                    class230.method1536(var23, arg2, -7, var22, var20);
                } else {
                    int[] var25 = class3.field42[arg5 + var9];
                    int[] var26 = class3.field42[arg5 - var9];
                    int var27 = arg1 + var8;
                    int var28 = arg1 - var8;
                    class230.method1536(var28, arg2, -7, var27, var25);
                    class230.method1536(var28, arg2, -7, var27, var26);
                }
                var13 -= var9 << 1;
            }
            int[] var29 = class3.field42[arg5 + var8];
            int[] var30 = class3.field42[arg5 - var8];
            int var31 = arg1 + var9;
            int var32 = arg1 - var9;
            if (var7 <= var8) {
                class230.method1536(var32, arg2, -7, var31, var29);
                class230.method1536(var32, arg2, arg4 - 6, var31, var30);
            } else {
                int var33 = var11 < var8 ? class29.field482[var8] : var11;
                int var34 = arg1 - var33;
                class230.method1536(var32, arg2, -7, var34, var29);
                int var35 = arg1 + var33;
                class230.method1536(var34, arg0, -7, var35, var29);
                class230.method1536(var35, arg2, -7, var31, var29);
                class230.method1536(var32, arg2, arg4 - 6, var34, var30);
                class230.method1536(var34, arg0, arg4 - 6, var35, var30);
                class230.method1536(var35, arg2, -7, var31, var30);
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public static void method47(int arg0) {
        if (arg0 != 16594) {
            method50(43, (byte) -71);
        }
        field140 = null;
        field137 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)I")
    public static final int method48(int arg0, int arg1, int arg2) {
        int var3 = class192.method1332(arg0 - 1, arg2 + -1, 16911) + class192.method1332(arg0 - 1, arg2 + 1, 16911) + class192.method1332(arg0 + 1, arg2 + -1, 16911) + class192.method1332(arg0 - -1, arg2 - -1, 16911);
        field125++;
        if (arg1 < 49) {
            return 28;
        } else {
            int var4 = class192.method1332(arg0, arg2 - 1, 16911) + class192.method1332(arg0, arg2 + 1, 16911) + class192.method1332(arg0 + -1, arg2, 16911) + class192.method1332(arg0 - -1, arg2, 16911);
            int var5 = class192.method1332(arg0, arg2, 16911);
            return var3 / 16 + var4 / 8 + var5 / 4;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Li;BLnb;Li;)Lpf;")
    public static final class169 method49(class88 arg0, byte arg1, class144 arg2, class88 arg3) {
        field127++;
        int var4 = -10 / ((arg1 + 77) / 42);
        int var5 = arg2.method966(arg0, (byte) -3);
        int var6 = arg2.method968(arg3, var5, 99);
        return class32.method203(true, arg2, var6, var5);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)I")
    public static final int method50(int arg0, byte arg1) {
        if (arg1 >= -7) {
            method51(-40, 18);
        }
        field126++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)I")
    public static final int method51(int arg0, int arg1) {
        field133++;
        int var2 = 51 % ((arg1 - 17) / 35);
        if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }
}
