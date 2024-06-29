import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class70 extends class165 {

    @OriginalMember(owner = "client!hf", name = "vb", descriptor = "[I")
    public static int[] field1533 = new int[128];

    @OriginalMember(owner = "client!hf", name = "wb", descriptor = "Leh;")
    public static class47 field1534 = class195.method1282((byte) -4, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!hf", name = "zb", descriptor = "Leh;")
    private static class47 field1537 = class195.method1282((byte) -4, "Please reload this page)3");

    @OriginalMember(owner = "client!hf", name = "Bb", descriptor = "Leh;")
    public static class47 field1539 = field1537;

    @OriginalMember(owner = "client!hf", name = "Eb", descriptor = "I")
    public static int field1542 = 5063219;

    @OriginalMember(owner = "client!hf", name = "yb", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!hf", name = "Cb", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!hf", name = "Ab", descriptor = "Lfb;")
    public static class50 field1538;

    @OriginalMember(owner = "client!hf", name = "Db", descriptor = "Lfb;")
    public static class50 field1541;

    @OriginalMember(owner = "client!hf", name = "xb", descriptor = "[Ldh;")
    public static class38[] field1535;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method15(int arg0, boolean arg1) {
        ++field1536;
        if (!arg1) {
            method625((int[]) null, 51, -116, 123, 33, -71, 45);
        }
        int[][] var3 = super.field2186.method10(arg0, (byte) 51);
        if (super.field2186.field28 && this.method1123(-63)) {
            int[] var4 = var3[0];
            int var5 = arg0 % super.field3193 * super.field3193;
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; ~class149.field2928 < ~var8; ++var8) {
                int var9 = super.field3206[var5 - -(var8 % super.field3214)];
                var6[var8] = class142.method1018(255, var9) << 4;
                var7[var8] = class142.method1018(4080, var9 >> 4);
                var4[var8] = class142.method1018(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([IIIIIII)V")
    public static final void method625(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class200.field3897 = arg5;
        class40.field804 = new boolean[8][32][class200.field3897 + class200.field3897 + 1][class200.field3897 + class200.field3897 + 1];
        class23.field458 = 0;
        class173.field3350 = 0;
        class64.field1406 = arg3;
        class196.field3819 = arg4;
        class2.field24 = arg3 / 2;
        class59.field1141 = arg4 / 2;
        boolean[][][][] var7 = new boolean[9][32][class200.field3897 + class200.field3897 + 3][class200.field3897 + class200.field3897 + 3];
        for (int var8 = 128; var8 <= 384; var8 += 32) {
            for (int var16 = 0; var16 < 2048; var16 += 64) {
                class193.field3753 = class17.field341[var8];
                class149.field2918 = class17.field350[var8];
                class44.field882 = class17.field341[var16];
                class162.field3150 = class17.field350[var16];
                int var17 = (var8 - 128) / 32;
                int var18 = var16 / 64;
                for (int var19 = -(class200.field3897 + 1); var19 <= class200.field3897 + 1; ++var19) {
                    for (int var20 = -(class200.field3897 + 1); var20 <= class200.field3897 + 1; ++var20) {
                        int var21 = var19 * 128;
                        int var22 = var20 * 128;
                        boolean var23 = false;
                        for (int var24 = -arg1; var24 <= arg2; var24 += 128) {
                            if (class192.method1258(var21, arg0[var17] + var24, var22, arg6)) {
                                var23 = true;
                                break;
                            }
                        }
                        var7[var17][var18][class200.field3897 + var19 + 1][class200.field3897 + var20 + 1] = var23;
                    }
                }
            }
        }
        for (int var9 = 0; var9 < 8; ++var9) {
            for (int var10 = 0; var10 < 32; ++var10) {
                for (int var11 = -class200.field3897; var11 < class200.field3897; ++var11) {
                    for (int var12 = -class200.field3897; var12 < class200.field3897; ++var12) {
                        boolean var13 = false;
                        label78: for (int var14 = -1; var14 <= 1; ++var14) {
                            for (int var15 = -1; var15 <= 1; ++var15) {
                                if (var7[var9][var10][var11 + var14 + class200.field3897 + 1][var12 + var15 + class200.field3897 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9][(var10 + 1) % 31][var11 + var14 + class200.field3897 + 1][var12 + var15 + class200.field3897 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][var10][var11 + var14 + class200.field3897 + 1][var12 + var15 + class200.field3897 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][(var10 + 1) % 31][var11 + var14 + class200.field3897 + 1][var12 + var15 + class200.field3897 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                            }
                        }
                        class40.field804[var9][var10][class200.field3897 + var11][class200.field3897 + var12] = var13;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIII)Z")
    public static final boolean method626(int arg0, int arg1, int arg2, int arg3) {
        if (!class108.method873(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class40.method338(var4 + 1, class41.field821[arg0][arg1][arg2] + arg3, var5 + 1) && class40.method338(var4 + 128 - 1, class41.field821[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class40.method338(var4 + 128 - 1, class41.field821[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class40.method338(var4 + 1, class41.field821[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(Z)V")
    public static void method627(boolean arg0) {
        field1535 = null;
        field1537 = null;
        if (!arg0) {
            method625((int[]) null, -31, 117, 22, 39, -122, -106);
        }
        field1541 = null;
        field1533 = null;
        field1538 = null;
        field1534 = null;
        field1539 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }
}
