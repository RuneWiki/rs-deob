import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class74 extends class209 {

    @OriginalMember(owner = "client!hd", name = "hc", descriptor = "Ljd;")
    private static class92 field1560 = class202.method1325((byte) 90, "scroll:");

    @OriginalMember(owner = "client!hd", name = "bc", descriptor = "Ljd;")
    public static class92 field1554 = field1560;

    @OriginalMember(owner = "client!hd", name = "fc", descriptor = "Ljd;")
    public static class92 field1558 = field1560;

    @OriginalMember(owner = "client!hd", name = "gc", descriptor = "I")
    public static int field1559 = 0;

    @OriginalMember(owner = "client!hd", name = "jc", descriptor = "Ljd;")
    public static class92 field1562 = class202.method1325((byte) 90, "hint_mapmarkers");

    @OriginalMember(owner = "client!hd", name = "dc", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1556 = Calendar.getInstance();

    @OriginalMember(owner = "client!hd", name = "kc", descriptor = "I")
    public static int field1563 = 0;

    @OriginalMember(owner = "client!hd", name = "lc", descriptor = "[I")
    public static int[] field1564 = new int[100];

    @OriginalMember(owner = "client!hd", name = "cc", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!hd", name = "ec", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!hd", name = "ic", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(III)J")
    public static final long method515(int arg0, int arg1, int arg2) {
        class43 var3 = class31.field698[arg0][arg1][arg2];
        return var3 != null && var3.field953 != null ? var3.field953.field2759 : 0L;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        int[][] var3 = super.field1873.method553(arg0, 0);
        if (arg1 != 4096) {
            field1558 = null;
        }
        if (super.field1873.field1656 && this.method1361(true)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int var6 = arg0 % super.field4019 * super.field4019;
            int[] var7 = var3[2];
            for (int var8 = 0; ~class150.field2985 < ~var8; ++var8) {
                int var9 = super.field4013[var6 - -(var8 % super.field4015)];
                var7[var8] = class196.method1301(255, var9) << 4;
                var4[var8] = class196.method1301(var9, 65280) >> 4;
                var5[var8] = class196.method1301(16711680, var9) >> 12;
            }
        }
        ++field1557;
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(BI)Z")
    public static final boolean method516(byte arg0, int arg1) {
        if (arg0 != 16) {
            method516((byte) -46, -48);
        }
        ++field1555;
        return ~((791313931 & arg1) >> 29) != -1;
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V")
    public static void method517(int arg0) {
        field1558 = null;
        if (arg0 != 14418) {
            method518((int[]) null, -61, 47, -9, 19, -97, 94);
        }
        field1554 = null;
        field1556 = null;
        field1560 = null;
        field1562 = null;
        field1564 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([IIIIIII)V")
    public static final void method518(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class155.field3088 = arg5;
        class80.field1622 = new boolean[8][32][class155.field3088 + class155.field3088 + 1][class155.field3088 + class155.field3088 + 1];
        class202.field3920 = 0;
        class131.field2630 = 0;
        class60.field1254 = arg3;
        class204.field3933 = arg4;
        class117.field2357 = arg3 / 2;
        class4.field230 = arg4 / 2;
        boolean[][][][] var7 = new boolean[9][32][class155.field3088 + class155.field3088 + 3][class155.field3088 + class155.field3088 + 3];
        for (int var8 = 128; var8 <= 384; var8 += 32) {
            for (int var16 = 0; var16 < 2048; var16 += 64) {
                class58.field1219 = class194.field3787[var8];
                class89.field1753 = class194.field3803[var8];
                class61.field1264 = class194.field3787[var16];
                class202.field3915 = class194.field3803[var16];
                int var17 = (var8 - 128) / 32;
                int var18 = var16 / 64;
                for (int var19 = -(class155.field3088 + 1); var19 <= class155.field3088 + 1; ++var19) {
                    for (int var20 = -(class155.field3088 + 1); var20 <= class155.field3088 + 1; ++var20) {
                        int var21 = var19 * 128;
                        int var22 = var20 * 128;
                        boolean var23 = false;
                        for (int var24 = -arg1; var24 <= arg2; var24 += 128) {
                            if (class104.method714(var21, arg0[var17] + var24, var22, arg6)) {
                                var23 = true;
                                break;
                            }
                        }
                        var7[var17][var18][class155.field3088 + var19 + 1][class155.field3088 + var20 + 1] = var23;
                    }
                }
            }
        }
        for (int var9 = 0; var9 < 8; ++var9) {
            for (int var10 = 0; var10 < 32; ++var10) {
                for (int var11 = -class155.field3088; var11 < class155.field3088; ++var11) {
                    for (int var12 = -class155.field3088; var12 < class155.field3088; ++var12) {
                        boolean var13 = false;
                        label78: for (int var14 = -1; var14 <= 1; ++var14) {
                            for (int var15 = -1; var15 <= 1; ++var15) {
                                if (var7[var9][var10][var11 + var14 + class155.field3088 + 1][var12 + var15 + class155.field3088 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9][(var10 + 1) % 31][var11 + var14 + class155.field3088 + 1][var12 + var15 + class155.field3088 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][var10][var11 + var14 + class155.field3088 + 1][var12 + var15 + class155.field3088 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][(var10 + 1) % 31][var11 + var14 + class155.field3088 + 1][var12 + var15 + class155.field3088 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                            }
                        }
                        class80.field1622[var9][var10][class155.field3088 + var11][class155.field3088 + var12] = var13;
                    }
                }
            }
        }
    }
}
