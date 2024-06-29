import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class73 extends class88 {

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    private int field1294 = -32768;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "[[S")
    public static short[][] field1297 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "[I")
    public static int[] field1302 = new int[500];

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    public static int field1303 = 0;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "Z")
    public static boolean field1290;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()I")
    public final int method5() {
        field1291++;
        return this.field1294;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ[Ldc;I[S)V")
    public static final void method516(int arg0, boolean arg1, class37[] arg2, int arg3, short[] arg4) {
        if (arg1) {
            method518((byte) 96, null);
        }
        field1296++;
        if (arg3 <= arg0) {
            return;
        }
        int var5 = (arg0 + arg3) / 2;
        int var6 = arg0;
        class37 var7 = arg2[var5];
        arg2[var5] = arg2[arg3];
        arg2[arg3] = var7;
        short var8 = arg4[var5];
        arg4[var5] = arg4[arg3];
        arg4[arg3] = var8;
        for (int var9 = arg0; var9 < arg3; var9++) {
            if (var7 == null || arg2[var9] != null && arg2[var9].method314(!arg1, var7) < (var9 & 0x1)) {
                class37 var10 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6] = var10;
                short var11 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6++] = var11;
            }
        }
        arg2[arg3] = arg2[var6];
        arg2[var6] = var7;
        arg4[arg3] = arg4[var6];
        arg4[var6] = var8;
        method516(arg0, false, arg2, var6 - 1, arg4);
        method516(var6 + 1, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1300++;
        class1 var11 = class223.method1471(-75, this.field1295).method860(-17838, 0, this.field1299, null);
        if (var11 != null) {
            var11.method19(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1294 = var11.method5();
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public static void method517(int arg0) {
        field1302 = null;
        field1297 = null;
        if (arg0 <= 83) {
            method518((byte) -25, null);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B[B)V")
    public static final void method518(byte arg0, byte[] arg1) {
        field1301++;
        int var2 = 0;
        if (arg0 != 120) {
            return;
        }
        while (true) {
            while (arg1.length > var2) {
                int var3 = (arg1[var2++] & 0xFF) * 64 - class235.field4272;
                int var4 = (arg1[var2++] & 0xFF) * 64 - class68.field1224;
                if (var3 > 0 && var4 > 0 && class150.field2848 > var3 + 64 && class190.field3528 > var4 + 64) {
                    int var5 = var3 >> 6;
                    int var6 = class190.field3528 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg1[var2++];
                            if (var9 != 0) {
                                if (class228.field4193[var5][var6] == null) {
                                    class228.field4193[var5][var6] = new byte[4096];
                                }
                                class228.field4193[var5][var6][(-(var8 + 1) << 6) + var7] = var9;
                                byte var10 = arg1[var2++];
                                if (class107.field1872[var5][var6] == null) {
                                    class107.field1872[var5][var6] = new byte[4096];
                                }
                                class107.field1872[var5][var6][(-(var8 + 1) << 6) + var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; var11++) {
                        byte var12 = arg1[var2++];
                        if (var12 != 0) {
                            var2++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Lcg;")
    public static final class30 method519(int arg0, int arg1) {
        field1292++;
        class30 var2 = (class30) class60.field1112.method87(-33, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class12.field173.method1547(class171.method1159(arg1 ^ 0x525E, arg0), arg1 + 21035, class139.method966(1782395528, arg0));
        class30 var4 = new class30();
        var4.field599 = arg0;
        if (var3 != null) {
            var4.method251(new class28(var3), 1);
        }
        var4.method253(-92);
        if (var4.field566) {
            var4.field614 = 0;
            var4.field571 = false;
        }
        if (!class66.field1189 && var4.field567) {
            var4.field608 = null;
        }
        class60.field1112.method92((long) arg0, var4, true);
        return arg1 == -21035 ? var4 : null;
    }
}
