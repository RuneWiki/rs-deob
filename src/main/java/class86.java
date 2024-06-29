import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class86 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "Lha;")
    public static class46 field1631 = class271.method1828("Lade Schrifts-=tze )2 ", -46);

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "[Z")
    public static boolean[] field1637 = new boolean[8];

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field1635 = 1;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Lha;")
    public static class46 field1636 = class271.method1828("www", -46);

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "[Lha;")
    public static class46[] field1632 = new class46[1000];

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Lha;")
    public static class46 field1643 = class271.method1828("Zugewiesener Speicher)3", -46);

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "Lha;")
    public static class46 field1640 = class271.method1828("Angreifen", -46);

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "Lha;")
    public static class46 field1645 = class271.method1828("http:)4)4", -46);

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Lha;")
    public static class46 field1646 = class271.method1828("underlay", -46);

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "[Lc;")
    public static class267[] field1639;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZZII)Lhh;")
    public static final class263 method670(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        field1633++;
        int var6 = (arg1 << 19) + (arg3 ? 65536 : 0) + arg0 + (arg4 << 17);
        long var8 = (long) arg5 * 3147483667L + ((long) var6 * 3849834839L);
        class263 var10 = (class263) class2.field19.method86(7961, var8);
        if (var10 != null) {
            return var10;
        }
        class62.field1046 = false;
        class263 var11 = class277.method1865(arg1, arg3, arg0, arg5, -3, false, false, arg4);
        if (var11 != null && !class62.field1046) {
            class2.field19.method80(var11, var8, (byte) 67);
        }
        if (!arg2) {
            field1643 = null;
        }
        return var11;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII)V")
    public static final void method671(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class171.method1224(32625, arg6);
        if (arg4 > -96) {
            method676((byte) 0, false);
        }
        int var7 = 0;
        field1644++;
        int var8 = -arg6;
        int var9 = arg6 - arg5;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg6;
        int var11 = var9;
        int var12 = -var9;
        int var13 = -1;
        int var14 = -1;
        if (arg2 >= class4.field70 && arg2 <= class70.field1205) {
            int[] var15 = class6.field100[arg2];
            int var16 = class15.method77(arg1 - arg6, class135.field2445, class73.field1309, -53);
            int var17 = class15.method77(arg1 + arg6, class135.field2445, class73.field1309, -113);
            int var18 = class15.method77(arg1 - var9, class135.field2445, class73.field1309, -54);
            int var19 = class15.method77(arg1 + var9, class135.field2445, class73.field1309, -40);
            class24.method170((byte) 33, var16, var15, var18, arg3);
            class24.method170((byte) 33, var18, var15, var19, arg0);
            class24.method170((byte) 33, var19, var15, var17, arg3);
        }
        while (var10 > var7) {
            var14 += 2;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class96.field1796[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            var13 += 2;
            var8 += var13;
            if (var8 >= 0) {
                var10--;
                var8 -= var10 << 1;
                int var20 = arg2 - var10;
                int var21 = arg2 + var10;
                if (class4.field70 <= var21 && var20 <= class70.field1205) {
                    if (var9 <= var10) {
                        int var22 = class15.method77(arg1 + var7, class135.field2445, class73.field1309, -84);
                        int var23 = class15.method77(arg1 - var7, class135.field2445, class73.field1309, -94);
                        if (class70.field1205 >= var21) {
                            class24.method170((byte) 33, var23, class6.field100[var21], var22, arg3);
                        }
                        if (var20 >= class4.field70) {
                            class24.method170((byte) 33, var23, class6.field100[var20], var22, arg3);
                        }
                    } else {
                        int var24 = class96.field1796[var10];
                        int var25 = class15.method77(arg1 + var7, class135.field2445, class73.field1309, -73);
                        int var26 = class15.method77(arg1 - var7, class135.field2445, class73.field1309, -88);
                        int var27 = class15.method77(arg1 + var24, class135.field2445, class73.field1309, -37);
                        int var28 = class15.method77(arg1 - var24, class135.field2445, class73.field1309, -112);
                        if (class70.field1205 >= var21) {
                            int[] var29 = class6.field100[var21];
                            class24.method170((byte) 33, var26, var29, var28, arg3);
                            class24.method170((byte) 33, var28, var29, var27, arg0);
                            class24.method170((byte) 33, var27, var29, var25, arg3);
                        }
                        if (var20 >= class4.field70) {
                            int[] var30 = class6.field100[var20];
                            class24.method170((byte) 33, var26, var30, var28, arg3);
                            class24.method170((byte) 33, var28, var30, var27, arg0);
                            class24.method170((byte) 33, var27, var30, var25, arg3);
                        }
                    }
                }
            }
            int var31 = arg2 - var7;
            int var32 = arg2 + var7;
            if (class4.field70 <= var32 && var31 <= class70.field1205) {
                int var33 = arg1 + var10;
                int var34 = arg1 - var10;
                if (class135.field2445 <= var33 && class73.field1309 >= var34) {
                    int var35 = class15.method77(var33, class135.field2445, class73.field1309, -85);
                    int var36 = class15.method77(var34, class135.field2445, class73.field1309, -51);
                    if (var7 >= var9) {
                        if (class70.field1205 >= var32) {
                            class24.method170((byte) 33, var36, class6.field100[var32], var35, arg3);
                        }
                        if (class4.field70 <= var31) {
                            class24.method170((byte) 33, var36, class6.field100[var31], var35, arg3);
                        }
                    } else {
                        int var37 = var7 <= var11 ? var11 : class96.field1796[var7];
                        int var38 = class15.method77(arg1 + var37, class135.field2445, class73.field1309, -37);
                        int var39 = class15.method77(arg1 - var37, class135.field2445, class73.field1309, -59);
                        if (class70.field1205 >= var32) {
                            int[] var40 = class6.field100[var32];
                            class24.method170((byte) 33, var36, var40, var39, arg3);
                            class24.method170((byte) 33, var39, var40, var38, arg0);
                            class24.method170((byte) 33, var38, var40, var35, arg3);
                        }
                        if (var31 >= class4.field70) {
                            int[] var41 = class6.field100[var31];
                            class24.method170((byte) 33, var36, var41, var39, arg3);
                            class24.method170((byte) 33, var39, var41, var38, arg0);
                            class24.method170((byte) 33, var38, var41, var35, arg3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method672(int arg0) {
        field1636 = null;
        field1640 = null;
        field1646 = null;
        field1632 = null;
        field1643 = null;
        field1637 = null;
        field1639 = null;
        if (arg0 != -1) {
            field1643 = null;
        }
        field1645 = null;
        field1631 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "()V")
    public static final void method673() {
        if (class198.field3543 != null) {
            for (int var0 = 0; var0 < class198.field3543.length; var0++) {
                for (int var1 = 0; var1 < class173.field3076; var1++) {
                    for (int var2 = 0; var2 < class128.field2359; var2++) {
                        class198.field3543[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class212.field3772 != null) {
            for (int var3 = 0; var3 < class212.field3772.length; var3++) {
                for (int var4 = 0; var4 < class173.field3076; var4++) {
                    for (int var5 = 0; var5 < class128.field2359; var5++) {
                        class212.field3772[var3][var4][var5] = null;
                    }
                }
            }
        }
        class54.field924 = 0;
        if (class138.field2480 != null) {
            for (int var6 = 0; var6 < class54.field924; var6++) {
                class138.field2480[var6] = null;
            }
        }
        if (class254.field4459 != null) {
            for (int var7 = 0; var7 < class134.field2421; var7++) {
                class254.field4459[var7] = null;
            }
            class134.field2421 = 0;
        }
        if (class198.field3544 != null) {
            for (int var8 = 0; var8 < class198.field3544.length; var8++) {
                class198.field3544[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLhi;)Z")
    public static final boolean method674(byte arg0, class24 arg1) {
        if (arg0 >= -12) {
            field1637 = null;
        }
        field1641++;
        if (arg1.field407 == 205) {
            class147.field2655 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public static final void method675(int arg0) {
        if (arg0 != 0) {
            field1646 = null;
        }
        class111.field2100.method84(arg0 - 32377);
        class188.field3356.method84(-32377);
        class174.field3140.method84(-32377);
        client.field4679.method84(-32377);
        field1634++;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BZ)V")
    public static final void method676(byte arg0, boolean arg1) {
        field1638++;
        for (int var2 = 0; var2 < class51.field888; var2++) {
            class26 var3 = class2.field29[class33.field612[var2]];
            long var4 = (long) class33.field612[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method190(0) && var3.field511.field1484 == arg1 && var3.field511.method619(true)) {
                int var6 = var3.field2585 >> 7;
                int var7 = var3.field2546 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.method642(127) == 1 && (var3.field2585 & 0x7F) == 64 && (var3.field2546 & 0x7F) == 64) {
                        if (class66.field1125[var6][var7] == class252.field4443) {
                            continue;
                        }
                        class66.field1125[var6][var7] = class252.field4443;
                    }
                    if (!var3.field511.field1464) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field2572 = class206.method1461(var3.field2546, class135.field2450, var3.field2585, 4);
                    class24.method166(class135.field2450, var3.field2585, var3.field2546, var3.field2572, var3.method642(76) * 64 + 60 - 64, var3, var3.field2535, var4, var3.field2520);
                }
            }
        }
        if (arg0 > -52) {
            method677((class46) null, (class46) null, -47, 124);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lha;Lha;II)V")
    public static final void method677(class46 arg0, class46 arg1, int arg2, int arg3) {
        class85.field1623 = arg1;
        class270.field4718 = arg3;
        class85.field1624 = arg0;
        field1642++;
        if (class85.field1624.method340((byte) 120, class85.field1613) || class85.field1623.method340((byte) 125, class85.field1613)) {
            class40.field698 = 3;
        } else if (class97.field1808 == -1) {
            class40.field698 = -3;
            class210.field3759 = arg2;
            class115.field2171 = 1;
            class75 var4 = new class75(128);
            var4.method570(10, 15619);
            var4.method546((byte) 101, (int) (Math.random() * 99999.0D));
            var4.method546((byte) 116, 518);
            var4.method578((byte) -108, class85.field1624.method349((byte) 59));
            var4.method581(true, (int) (Math.random() * 9.9999999E7D));
            var4.method584(class85.field1623, arg2 ^ 0x4B93);
            var4.method581(true, (int) (Math.random() * 9.9999999E7D));
            var4.method564((byte) -113, class56.field940, class70.field1211);
            class58.field967.field1380 = 0;
            class58.field967.method570(160, 15619);
            class58.field967.method570(var4.field1380, 15619);
            class58.field967.method555(var4.field1380, arg2 ^ 0x2E661B48, var4.field1368, 0);
        } else {
            class87.method681(false);
        }
    }
}
