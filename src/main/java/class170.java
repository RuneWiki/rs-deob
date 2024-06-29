import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class170 {

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "[[Lhc;")
    public static class174[][] field2537 = new class174[13][13];

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field2539 = 0;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2536 = 255;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Lta;")
    public static class197 field2534 = new class197(50);

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Z")
    public static boolean field2540 = false;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 9)
    public static final void method1248(int arg0) {
        class88.field1293.method69((byte) 57);
        field2538++;
        int var1 = class88.field1293.method63(arg0 ^ 0x5C, 1);
        if (var1 == 0 || arg0 != 32) {
            return;
        }
        int var2 = class88.field1293.method63(arg0 ^ 0x5E, 2);
        if (var2 == 0) {
            class227.field3515[class122.field1922++] = 2047;
        } else if (var2 == 1) {
            int var3 = class88.field1293.method63(127, 3);
            class235.field3602.method2034(var3, (byte) 60, 1);
            int var4 = class88.field1293.method63(125, 1);
            if (var4 == 1) {
                class227.field3515[class122.field1922++] = 2047;
            }
        } else if (var2 == 2) {
            if (class88.field1293.method63(114, 1) == 1) {
                int var6 = class88.field1293.method63(118, 3);
                class235.field3602.method2034(var6, (byte) 60, 2);
                int var7 = class88.field1293.method63(arg0 ^ 0x54, 3);
                class235.field3602.method2034(var7, (byte) 34, 2);
            } else {
                int var5 = class88.field1293.method63(arg0 ^ 0x5A, 3);
                class235.field3602.method2034(var5, (byte) 127, 0);
            }
            int var8 = class88.field1293.method63(117, 1);
            if (var8 == 1) {
                class227.field3515[class122.field1922++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class88.field1293.method63(arg0 + 90, 1);
            class50.field775 = class88.field1293.method63(126, 2);
            int var10 = class88.field1293.method63(120, 7);
            int var11 = class88.field1293.method63(119, 7);
            int var12 = class88.field1293.method63(115, 1);
            if (var12 == 1) {
                class227.field3515[class122.field1922++] = 2047;
            }
            class235.field3602.method932((byte) 72, var10, var11, var9 == 1);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([IIIIII)V", line = 96)
    public static final void method1249(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class99 var6 = class250.field3746[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class107 var7 = var6.field1489;
        if (var7 != null) {
            int var8 = var7.field1642;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class24 var10 = var6.field1490;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field265;
        int var12 = var10.field267;
        int var13 = var10.field256;
        int var14 = var10.field263;
        int[] var15 = class132.field2059[var11];
        int[] var16 = class193.field3081[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V", line = 190)
    public static void method1250(int arg0) {
        if (arg0 == 2) {
            field2534 = null;
            field2537 = (class174[][]) null;
        }
    }
}
