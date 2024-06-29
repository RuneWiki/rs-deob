import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class239 {

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "F")
    public static float field3569;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILre;)V", line = 5)
    public static final void method1625(int arg0, class263 arg1) {
        int var2 = class156.field2336 >> 2 << 10;
        if (arg0 <= 126) {
            method1625(68, (class263) null);
        }
        field3568++;
        int var3 = class306.field4669 >> 1;
        byte[][] var4 = new byte[class41.field497][class111.field1719];
        while (arg1.field4025 < arg1.field3986.length) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg1.method1787(false) == 1) {
                var7 = arg1.method1787(false);
                var5 = true;
                var6 = arg1.method1787(false);
            }
            int var8 = arg1.method1787(false);
            int var9 = arg1.method1787(false);
            int var10 = var8 * 64 - class292.field4439;
            int var11 = class296.field4533 + class111.field1719 - (var9 * 64) - 1;
            if (var10 >= 0 && var11 - 63 >= 0 && (var10 + 63) < class41.field497 && class111.field1719 > var11) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var7 * 8 <= var12 && var12 < var7 * 8 + 8 && var6 * 8 <= var14 && var6 * 8 + 8 > var14) {
                            var13[var11 - var14] = arg1.method1810((byte) 112);
                        }
                    }
                }
            } else if (var5) {
                arg1.field4025 += 64;
            } else {
                arg1.field4025 += 4096;
            }
        }
        int var15 = class41.field497;
        int var16 = class111.field1719;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var15) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class304 var26 = class81.method543(true, var25 - 1);
                        var17[var23] += var26.field4635;
                        var18[var23] += var26.field4627;
                        var19[var23] += var26.field4639;
                        var20[var23] += var26.field4632;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class304 var29 = class81.method543(true, var28 - 1);
                        var17[var23] -= var29.field4635;
                        var18[var23] -= var29.field4627;
                        var19[var23] -= var29.field4639;
                        var20[var23] -= var29.field4632;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class135.field2058[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 + 5;
                    if (var16 > var37) {
                        var31 += var17[var37];
                        var35 += var20[var37];
                        var33 += var18[var37];
                        var32 += var19[var37];
                        var34 += var21[var37];
                    }
                    int var38 = var36 - 5;
                    if (var38 >= 0) {
                        var32 -= var19[var38];
                        var35 -= var20[var38];
                        var33 -= var18[var38];
                        var31 -= var17[var38];
                        var34 -= var21[var38];
                    }
                    if (var36 >= 0 && var34 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var35 == 0 ? 0 : class7.method19(var31 * 256 / var35, var32 / var34, var33 / var34, 23674);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var3;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var2 + var40 & 0xFC00) - (-(var40 & 0x380) - var41);
                            var39[class124.method893(var22, 63) + class124.method893(4032, var36 << 6)] = class148.field2222[class150.method1081(var42, -114, 96)];
                        } else if (var39 != null) {
                            var39[class124.method893(var22, 63) + (class124.method893(var36, 63) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V", line = 246)
    public static final void method1626(int arg0, int arg1) {
        field3567++;
        class43 var2 = class186.field2779;
        synchronized (class186.field2779) {
            class230.field3475 = arg0;
            if (arg1 != -1714174746) {
                method1625(71, (class263) null);
            }
        }
    }
}
