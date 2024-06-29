import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class241 {

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Lqk;")
    public static class207 field4390 = class24.method212(255, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lqk;")
    public static class207 field4394 = class24.method212(255, "");

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "[S")
    public static short[] field4397 = new short[256];

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field4393 = -1;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lqk;")
    public static class207 field4389 = class24.method212(255, ":assist:");

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4395 = new CRC32();

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lqk;")
    public static class207 field4400 = class24.method212(255, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "J")
    public static long field4403 = 0L;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lpk;")
    public static class99 field4399;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lpk;")
    public static class99 field4401;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "[I")
    public static int[] field4402;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lv;B)V")
    public static final void method1703(class149 arg0, byte arg1) {
        field4391++;
        int var2 = class252.field4535 >> 2 << 10;
        int var3 = class129.field2259 >> 1;
        if (arg1 >= -37) {
            field4394 = null;
        }
        byte[][] var4 = new byte[class197.field3463][class70.field1253];
        while (arg0.field2568.length > arg0.field2593) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg0.method1045((byte) -39) == 1) {
                var33 = true;
                var34 = arg0.method1045((byte) 114);
                var35 = arg0.method1045((byte) 94);
            }
            int var36 = arg0.method1045((byte) 125);
            int var37 = arg0.method1045((byte) -104);
            int var38 = class70.field1253 + class111.field1932 - (var37 * 64) - 1;
            int var39 = var36 * 64 - class198.field3473;
            if (var39 >= 0 && (var38 - 63) >= 0 && var39 + 63 < class197.field3463 && class70.field1253 > var38) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var39 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || var34 * 8 <= var40 && var40 < var34 * 8 + 8 && var42 >= (var35 * 8) && var42 < (var35 * 8 + 8)) {
                            var41[var38 - var42] = arg0.method1084((byte) 49);
                        }
                    }
                }
            } else if (var33) {
                arg0.field2593 += 64;
            } else {
                arg0.field2593 += 4096;
            }
        }
        int var5 = class197.field3463;
        int var6 = class70.field1253;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var27 < var5) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class11 var29 = class118.method841(var28 - 1, 1);
                        var7[var13] += var29.field151;
                        var8[var13] += var29.field160;
                        var9[var13] += var29.field157;
                        var11[var13] += var29.field156;
                        var10002 = var10[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class11 var32 = class118.method841(var31 - 1, 1);
                        var7[var13] -= var32.field151;
                        var8[var13] -= var32.field160;
                        var9[var13] -= var32.field157;
                        var11[var13] -= var32.field156;
                        var10002 = var10[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class170.field3018[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    if (var6 > var21) {
                        var19 += var7[var21];
                        var16 += var8[var21];
                        var18 += var10[var21];
                        var17 += var11[var21];
                        var15 += var9[var21];
                    }
                    int var22 = var20 - 5;
                    if (var22 >= 0) {
                        var19 -= var7[var22];
                        var17 -= var11[var22];
                        var15 -= var9[var22];
                        var16 -= var8[var22];
                        var18 -= var10[var22];
                    }
                    if (var20 >= 0 && var18 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var17 == 0 ? 0 : class188.method1315(var15 / var18, 1, var16 / var18, var19 * 256 / var17);
                        if (var4[var12][var20] != 0) {
                            int var25 = (var24 & 0x7F) + var3;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            int var26 = (var2 + var24 & 0xFC00) + (var24 & 0x380) + var25;
                            var23[class121.method860(var12, 63) + class121.method860(var20 << 6, 4032)] = class257.field4600[class70.method508(-1563918489, var26, 96)];
                        } else if (var23 != null) {
                            var23[class121.method860(63, var12) + (class121.method860(63, var20) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static final void method1704(int arg0) {
        if (arg0 == 256) {
            class189.field3334.method1382(arg0 ^ 0x7B72);
            field4396++;
            class133.field2315.method1382(arg0 + 31090);
            class165.field2917.method1382(31346);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static void method1705(int arg0) {
        field4400 = null;
        field4402 = null;
        field4390 = null;
        field4397 = null;
        field4389 = null;
        if (arg0 != 8) {
            method1705(112);
        }
        field4399 = null;
        field4394 = null;
        field4395 = null;
        field4401 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Lbe;")
    public static final class28 method1706(int arg0, int arg1, int arg2) {
        class174 var3 = class82.field1498[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class28 var4 = var3.field3142;
            var3.field3142 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
    public static final void method1707(int arg0, int arg1) {
        class102.field1843.method1383(-8052, arg0);
        field4392++;
        class56.field1041.method1383(-8052, arg0);
        if (arg1 != 64) {
            method1703((class149) null, (byte) 122);
        }
    }
}
