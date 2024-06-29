import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class33 {

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field587 = 0;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "Lcc;")
    private static class209 field586 = class95.method669(126, "Examine");

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "Lcc;")
    public static class209 field582 = field586;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Lcc;")
    public static class209 field583 = class95.method669(110, "::");

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "Lcc;")
    public static class209 field588 = class95.method669(114, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "[Lcc;")
    public static class209[] field592 = new class209[8];

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "Lsj;")
    public static class49 field589;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "[S")
    public static short[] field590;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static final void method259(int arg0) {
        field591++;
        if (arg0 >= -56) {
            method260((byte) 69, (class106) null);
        }
        class157.field2861.method665(1);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLtf;)V")
    public static final void method260(byte arg0, class106 arg1) {
        field584++;
        int var2 = class137.field2573 >> 2 << 10;
        int var3 = class272.field4825 >> 1;
        byte[][] var4 = new byte[class59.field1194][class98.field1921];
        while (arg1.field2108.length > arg1.field2085) {
            boolean var34 = false;
            int var35 = 0;
            int var36 = 0;
            if (arg1.method774((byte) 123) == 1) {
                var35 = arg1.method774((byte) 102);
                var36 = arg1.method774((byte) 118);
                var34 = true;
            }
            int var37 = arg1.method774((byte) 125);
            int var38 = arg1.method774((byte) 85);
            int var39 = var37 * 64 - class38.field654;
            int var40 = class224.field4082 + class98.field1921 - (var38 * 64) - 1;
            if (var39 >= 0 && var40 - 63 >= 0 && var39 + 63 < class59.field1194 && var40 < class98.field1921) {
                for (int var41 = 0; var41 < 64; var41++) {
                    byte[] var42 = var4[var39 + var41];
                    for (int var43 = 0; var43 < 64; var43++) {
                        if (!var34 || var35 * 8 <= var41 && var41 < var35 * 8 + 8 && (var36 * 8) <= var43 && var43 < var36 * 8 + 8) {
                            var42[var40 - var43] = arg1.method777(65);
                        }
                    }
                }
            } else if (var34) {
                arg1.field2085 += 64;
            } else {
                arg1.field2085 += 4096;
            }
        }
        int var5 = class59.field1194;
        int var6 = class98.field1921;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int var10 = -11 % ((arg0 + 8) / 39);
        int[] var11 = new int[var6];
        int[] var12 = new int[var6];
        for (int var13 = -5; var13 < var5; var13++) {
            for (int var14 = 0; var14 < var6; var14++) {
                int var28 = var13 + 5;
                int var10002;
                if (var28 < var5) {
                    int var29 = var4[var28][var14] & 0xFF;
                    if (var29 > 0) {
                        class44 var30 = class90.method642(-69, var29 - 1);
                        var7[var14] += var30.field889;
                        var8[var14] += var30.field874;
                        var9[var14] += var30.field875;
                        var11[var14] += var30.field886;
                        var10002 = var12[var14]++;
                    }
                }
                int var31 = var13 - 5;
                if (var31 >= 0) {
                    int var32 = var4[var31][var14] & 0xFF;
                    if (var32 > 0) {
                        class44 var33 = class90.method642(-44, var32 - 1);
                        var7[var14] -= var33.field889;
                        var8[var14] -= var33.field874;
                        var9[var14] -= var33.field875;
                        var11[var14] -= var33.field886;
                        var10002 = var12[var14]--;
                    }
                }
            }
            if (var13 >= 0) {
                int[][] var15 = class187.field3383[var13 >> 6];
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                int var20 = 0;
                for (int var21 = -5; var21 < var6; var21++) {
                    int var22 = var21 + 5;
                    int var23 = var21 - 5;
                    if (var6 > var22) {
                        var16 += var7[var22];
                        var17 += var8[var22];
                        var19 += var12[var22];
                        var20 += var11[var22];
                        var18 += var9[var22];
                    }
                    if (var23 >= 0) {
                        var20 -= var11[var23];
                        var16 -= var7[var23];
                        var17 -= var8[var23];
                        var19 -= var12[var23];
                        var18 -= var9[var23];
                    }
                    if (var21 >= 0 && var19 > 0) {
                        int[] var24 = var15[var21 >> 6];
                        int var25 = var20 == 0 ? 0 : class67.method488(2, var18 / var19, var17 / var19, var16 * 256 / var20);
                        if (var4[var13][var21] != 0) {
                            if (var24 == null) {
                                var24 = var15[var21 >> 6] = new int[4096];
                            }
                            int var26 = (var25 & 0x7F) + var3;
                            if (var26 < 0) {
                                var26 = 0;
                            } else if (var26 > 127) {
                                var26 = 127;
                            }
                            int var27 = (var2 + var25 & 0xFC00) + (var25 & 0x380) + var26;
                            var24[class27.method220(63, var13) + class27.method220(4032, var21 << 6)] = class15.field288[class258.method1791(var27, 96, -22053)];
                        } else if (var24 != null) {
                            var24[class27.method220(var13, 63) + class27.method220(4032, var21 << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public static void method261(byte arg0) {
        if (arg0 < 95) {
            field588 = null;
        }
        field582 = null;
        field589 = null;
        field590 = null;
        field588 = null;
        field592 = null;
        field586 = null;
        field583 = null;
    }
}
