import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public abstract class class86 extends class135 {

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "Lvj;")
    public static class115 field1359 = new class115(64);

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
    public static int field1362 = 0;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "Z")
    public static boolean field1365 = false;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1366 = "Choose Option";

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1364;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "[S")
    public static short[] field1363;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)Z")
    public abstract boolean method329(byte arg0);

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)V")
    public static void method593(boolean arg0) {
        field1364 = null;
        field1363 = null;
        field1366 = null;
        if (arg0) {
            method593(false);
        }
        field1359 = null;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method330(byte arg0);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Llj;B)V")
    public static final void method594(class25 arg0, byte arg1) {
        field1358++;
        int var2 = class207.field3241 >> 2 << 10;
        int var3 = class234.field3759 >> 1;
        byte[][] var4 = new byte[class165.field2565][class104.field1611];
        while (arg0.field349 < arg0.field339.length) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg0.method201(arg1 + 160) == 1) {
                var33 = true;
                var34 = arg0.method201(255);
                var35 = arg0.method201(255);
            }
            int var36 = arg0.method201(255);
            int var37 = arg0.method201(255);
            int var38 = class104.field1611 - ((var37 * 64) + 1 - class120.field1751);
            int var39 = var36 * 64 - class47.field599;
            if (var39 >= 0 && var38 - 63 >= 0 && class165.field2565 > (var39 + 63) && var38 < class104.field1611) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var39 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || var34 * 8 <= var40 && var40 < (var34 * 8 + 8) && var35 * 8 <= var42 && var42 < var35 * 8 + 8) {
                            var41[var38 - var42] = arg0.method188(arg1 + 8);
                        }
                    }
                }
            } else if (var33) {
                arg0.field349 += 64;
            } else {
                arg0.field349 += 4096;
            }
        }
        int var5 = class165.field2565;
        if (arg1 != 95) {
            return;
        }
        int var6 = class104.field1611;
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
                        class39 var29 = class164.method1128(var28 - 1, 17237);
                        var7[var13] += var29.field535;
                        var8[var13] += var29.field531;
                        var9[var13] += var29.field536;
                        var10[var13] += var29.field525;
                        var10002 = var11[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class39 var32 = class164.method1128(var31 - 1, 17237);
                        var7[var13] -= var32.field535;
                        var8[var13] -= var32.field531;
                        var9[var13] -= var32.field536;
                        var10[var13] -= var32.field525;
                        var10002 = var11[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int var14 = 0;
                int[][] var15 = class177.field2759[var12 >> 6];
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    if (var6 > var21) {
                        var17 += var9[var21];
                        var19 += var10[var21];
                        var18 += var11[var21];
                        var14 += var7[var21];
                        var16 += var8[var21];
                    }
                    int var22 = var20 - 5;
                    if (var22 >= 0) {
                        var19 -= var10[var22];
                        var14 -= var7[var22];
                        var16 -= var8[var22];
                        var18 -= var11[var22];
                        var17 -= var9[var22];
                    }
                    if (var20 >= 0 && var18 > 0) {
                        int[] var23 = var15[var20 >> 6];
                        int var24 = var19 == 0 ? 0 : class225.method1536(var16 / var18, (byte) -67, var14 * 256 / var19, var17 / var18);
                        if (var4[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var15[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var3;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var24 + var2 & 0xFC00) + (var24 & 0x380) + var25;
                            var23[class224.method1526(4032, var20 << 6) + class224.method1526(var12, 63)] = class171.field2676[class239.method1620(96, 102, var26)];
                        } else if (var23 != null) {
                            var23[(class224.method1526(var20, 63) << 6) + class224.method1526(63, var12)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)V")
    public static final void method595(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1360++;
        if (arg4 < 59) {
            return;
        }
        if (class51.field710 <= (arg2 - arg1) && class96.field1484 >= (arg1 + arg2) && (arg3 - arg1) >= class110.field1669 && arg3 + arg1 <= class189.field2984) {
            class225.method1538(arg3, (byte) -19, arg1, arg2, arg0);
        } else {
            class121.method792(arg0, arg1, (byte) -111, arg3, arg2);
        }
    }
}
