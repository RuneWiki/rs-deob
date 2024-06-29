import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class104 {

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field1709 = 0;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Le;")
    public static class191 field1715 = class54.method368("Musik)2Engine vorbereitet)3", 2047);

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Le;")
    public static class191 field1708 = class54.method368(" loggt sich ein)3", 2047);

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Le;")
    public static class191 field1721 = class54.method368("Okay", 2047);

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Le;")
    public static class191 field1723 = class54.method368("W-=hlen Sie eine Option", 2047);

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Le;")
    public static class191 field1717 = class54.method368("Wordpack geladen)3", 2047);

    @OriginalMember(owner = "client!w", name = "w", descriptor = "Le;")
    private static class191 field1725 = class54.method368("slide:", 2047);

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Le;")
    public static class191 field1712 = field1725;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Le;")
    public static class191 field1722 = class54.method368("huffman", 2047);

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Le;")
    public static class191 field1716 = field1725;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "J")
    public long field1713;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lw;")
    public class104 field1711;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Lw;")
    public class104 field1724;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "[Lmh;")
    public static class232[] field1718;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lng;Z)V")
    public static final void method648(class121 arg0, boolean arg1) {
        if (arg1) {
            field1707++;
            class3.field19 = arg0;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lji;I)V")
    public static final void method649(class225 arg0, int arg1) {
        field1719++;
        int var2 = class248.field4418 >> 2 << 10;
        byte[][] var3 = new byte[class189.field3327][class161.field2728];
        int var4 = class166.field2806 >> 1;
        while (arg0.field3995.length > arg0.field3996) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg0.method1580(arg1 ^ 0xFFFFFFD3) == 1) {
                var34 = arg0.method1580(-97);
                var35 = arg0.method1580(arg1 - 119);
                var33 = true;
            }
            int var36 = arg0.method1580(arg1 - 52);
            int var37 = arg0.method1580(-88);
            int var38 = class76.field1319 + class161.field2728 - (var37 * 64) - 1;
            int var39 = var36 * 64 - class54.field1009;
            if (var39 >= 0 && (var38 - 63) >= 0 && class189.field3327 > var39 + 63 && class161.field2728 > var38) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var3[var39 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || var40 >= var34 * 8 && (var34 * 8 + 8) > var40 && (var35 * 8) <= var42 && var42 < var35 * 8 + 8) {
                            var41[var38 - var42] = arg0.method1575(false);
                        }
                    }
                }
            } else if (var33) {
                arg0.field3996 += 64;
            } else {
                arg0.field3996 += 4096;
            }
        }
        int var5 = class189.field3327;
        if (arg1 != 0) {
            return;
        }
        int var6 = class161.field2728;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var5 > var27) {
                    int var28 = var3[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class90 var29 = class75.method484(-126, var28 - 1);
                        var8[var13] += var29.field1468;
                        var7[var13] += var29.field1464;
                        var9[var13] += var29.field1474;
                        var11[var13] += var29.field1459;
                        var10002 = var10[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var3[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class90 var32 = class75.method484(arg1 - 120, var31 + -1);
                        var8[var13] -= var32.field1468;
                        var7[var13] -= var32.field1464;
                        var9[var13] -= var32.field1474;
                        var11[var13] -= var32.field1459;
                        var10002 = var10[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class147.field2480[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 - 5;
                    int var22 = var20 + 5;
                    if (var22 < var6) {
                        var15 += var8[var22];
                        var17 += var9[var22];
                        var16 += var7[var22];
                        var19 += var10[var22];
                        var18 += var11[var22];
                    }
                    if (var21 >= 0) {
                        var17 -= var9[var21];
                        var15 -= var8[var21];
                        var16 -= var7[var21];
                        var18 -= var11[var21];
                        var19 -= var10[var21];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var18 == 0 ? 0 : class9.method67(var17 / var19, 1, var15 * 256 / var18, var16 / var19);
                        if (var3[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var4;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var24 & 0x380) + (var2 + var24 & 0xFC00) + var25;
                            var23[(class167.method1128(63, var20) << 6) + class167.method1128(var12, 63)] = class15.field196[class265.method1820((byte) 24, var26, 96)];
                        } else if (var23 != null) {
                            var23[class167.method1128(63, var12) + class167.method1128(4032, var20 << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLe;)Lmg;")
    public static final class49 method650(byte arg0, class191 arg1) {
        field1705++;
        if (arg0 != -85) {
            return null;
        }
        for (class49 var2 = (class49) class149.field2577.method1173(100); var2 != null; var2 = (class49) class149.field2577.method1175(arg0 + 84)) {
            if (var2.field883.method1317(-27518, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
    public static final void method651(int arg0, int arg1, int arg2, int arg3) {
        class191 var4 = class228.method1629(new class191[] { class235.field4181, class92.method563(-96, arg3), class254.field4505, class92.method563(-103, arg0 >> 6), class254.field4505, class92.method563(-70, arg2 >> 6), class254.field4505, class92.method563(-119, arg0 & 0x3F), class254.field4505, class92.method563(-49, arg2 & 0x3F) }, (byte) -25);
        field1704++;
        var4.method1325((byte) -38);
        class152.method1034(-110, var4);
        if (arg1 >= -52) {
            method648((class121) null, false);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static final void method652(int arg0) {
        field1703++;
        class169.field2868.method992(-31);
        if (arg0 != 896) {
            field1712 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static void method653(byte arg0) {
        field1717 = null;
        field1722 = null;
        field1712 = null;
        field1708 = null;
        if (arg0 != 13) {
            return;
        }
        field1715 = null;
        field1718 = null;
        field1723 = null;
        field1716 = null;
        field1721 = null;
        field1725 = null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)Z")
    public final boolean method654(int arg0) {
        if (arg0 <= 2) {
            method652(50);
        }
        field1706++;
        return this.field1724 != null;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    public final void method655(int arg0) {
        field1714++;
        if (this.field1724 == null) {
            return;
        }
        this.field1724.field1711 = this.field1711;
        this.field1711.field1724 = this.field1724;
        this.field1711 = null;
        this.field1724 = null;
        if (arg0 != 63) {
            method651(-100, 98, 40, -49);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIBII)V")
    public static final void method656(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1720++;
        if (arg2 != -31) {
            field1709 = -61;
        }
        class241 var5 = class14.method97(8, arg1, -76);
        var5.method1694((byte) -90);
        var5.field4279 = arg0;
        var5.field4301 = arg4;
        var5.field4290 = arg3;
    }
}
