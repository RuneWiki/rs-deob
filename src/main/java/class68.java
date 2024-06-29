import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class68 extends class41 {

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "Lu;")
    public static class135 field1664 = class87.method676((byte) -111, "Icons redrawn");

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field1656 = 0;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "Lu;")
    private static class135 field1668 = class87.method676((byte) -63, "Connecting to friendserver");

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "Lu;")
    public static class135 field1657 = class87.method676((byte) -97, "redstone3");

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "Lu;")
    public static class135 field1662 = field1668;

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "[[[I")
    public static int[][][] field1682 = new int[4][105][105];

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "Lu;")
    public static class135 field1661 = class87.method676((byte) -77, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "I")
    public static int field1681 = 0;

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "Lu;")
    public static class135 field1680 = class87.method676((byte) -41, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "Lu;")
    public static class135 field1685 = class87.method676((byte) -58, "Freund hinzuf-Ugen");

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "Lu;")
    private static class135 field1663 = class87.method676((byte) -43, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "Lu;")
    public static class135 field1686 = class87.method676((byte) -43, "Null");

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "Lu;")
    public static class135 field1678 = field1663;

    @OriginalMember(owner = "client!jf", name = "bb", descriptor = "Lu;")
    public static class135 field1688 = class87.method676((byte) -114, "Classic");

    @OriginalMember(owner = "client!jf", name = "cb", descriptor = "Lu;")
    private static class135 field1689 = class87.method676((byte) -109, "Login server offline)3");

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "Lu;")
    public static class135 field1673 = field1689;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public int field1658;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "I")
    public int field1672;

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "Lpe;")
    public static class109 field1670;

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "Lud;")
    public static class139 field1677;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "Z")
    public static boolean field1667;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "[I")
    public int[] field1660;

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "[I")
    public int[] field1676;

    @OriginalMember(owner = "client!jf", name = "db", descriptor = "[I")
    public int[] field1690;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "[Ljb;")
    public class64[] field1669;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "[Ljb;")
    public class64[] field1671;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "[[B")
    public static byte[][] field1665;

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "[[[B")
    public byte[][][] field1679;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIB)Z")
    public static final boolean method546(int arg0, int arg1, byte arg2) {
        field1674++;
        if (arg1 == 0 && class42.field996 == arg0) {
            return true;
        } else if (arg1 == 1 && class44.field1074 == arg0) {
            return true;
        } else if ((arg1 == 2 || arg1 == 3) && class22.field538 == arg0) {
            return true;
        } else {
            if (arg2 > -105) {
                field1663 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)Lu;")
    public static final class135 method547(int arg0, int arg1) {
        if (arg0 == -1) {
            field1684++;
            return class52.method398(false, arg1, -1001, 10);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(II)I")
    public static final int method548(int arg0, int arg1) {
        int var7 = arg0 - 1;
        field1675++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (arg1 != -21815) {
            field1665 = null;
        }
        return var6 + 1;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
    public static final void method549(int arg0) {
        for (int var1 = 0; var1 < class56.field1382; var1++) {
            int var10002 = class38.field880[var1]--;
            if (class38.field880[var1] >= -10) {
                class61 var4 = class26.field632[var1];
                if (var4 == null) {
                    var4 = class61.method508(class98.field2374, class77.field1806[var1], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class38.field880[var1] += var4.method507();
                    class26.field632[var1] = var4;
                }
                if (class38.field880[var1] < 0) {
                    int var11;
                    if (class1.field19[var1] == 0) {
                        var11 = class39.field892;
                    } else {
                        int var5 = (class1.field19[var1] & 0xFF) * 128;
                        int var6 = class1.field19[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class116.field2789.field173;
                        int var8 = class1.field19[var1] >> 8 & 0xFF;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var9 = var8 * 128 + 64 - class116.field2789.field172;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var10 > var5) {
                            class38.field880[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var11 = (var5 - var10) * class90.field2115 / var5;
                    }
                    if (var11 > 0) {
                        class74 var12 = var4.method510().method597(class60.field1523);
                        class92 var13 = class92.method740(var12, 100, var11);
                        var13.method723(class25.field603[var1] - 1);
                        class65.field1645.method1179(var13);
                    }
                    class38.field880[var1] = -100;
                }
            } else {
                class56.field1382--;
                for (int var3 = var1; var3 < class56.field1382; var3++) {
                    class77.field1806[var3] = class77.field1806[var3 + 1];
                    class26.field632[var3] = class26.field632[var3 + 1];
                    class25.field603[var3] = class25.field603[var3 + 1];
                    class38.field880[var3] = class38.field880[var3 + 1];
                    class1.field19[var3] = class1.field19[var3 + 1];
                }
                var1--;
            }
        }
        int var2 = -31 / ((69 - arg0) / 40);
        if (class69.field1709 && !class136.method1104(-1)) {
            if (class84.field1996 != 0 && class78.field1848 != -1) {
                class4.method16(0, class41.field956, class78.field1848, 113, false, class84.field1996);
            }
            class69.field1709 = false;
        }
        field1683++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BIII)Z")
    public static final boolean method550(byte arg0, int arg1, int arg2, int arg3) {
        field1666++;
        if (arg0 != -9) {
            return false;
        }
        int var4 = arg2 >> 14 & 0x7FFF;
        int var5 = class100.field2418.method998(class136.field3301, arg1, arg3, arg2);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 >> 6 & 0x3;
        int var7 = var5 & 0x1F;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class119 var8 = class2.method9(false, var4);
            int var9 = var8.field2835;
            int var10;
            int var11;
            if (var6 == 0 || var6 == 2) {
                var11 = var8.field2860;
                var10 = var8.field2890;
            } else {
                var10 = var8.field2860;
                var11 = var8.field2890;
            }
            if (var6 != 0) {
                var9 = (var9 << var6 & 0xF) + (var9 >> 4 - var6);
            }
            class56.method432(2, var11, true, 0, arg3, 0, arg1, var9, var10, class116.field2789.field162[0], true, class116.field2789.field192[0]);
        } else {
            class56.method432(2, 0, true, var7 + 1, arg3, var6, arg1, 0, 0, class116.field2789.field162[0], true, class116.field2789.field192[0]);
        }
        class148.field3692 = 2;
        class90.field2116 = class139.field3389;
        class145.field3517 = class20.field470;
        class44.field1069 = 0;
        return true;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILpe;I)V")
    public static final void method551(int arg0, class109 arg1, int arg2) {
        if (arg2 != -32636) {
            method547(105, -2);
        }
        field1659++;
        if (class135.field3285 == null) {
            class145.method1192(0, (byte) 0, 255, null, true, -3694, 255);
            class79.field1886[arg0] = arg1;
        } else {
            class135.field3285.field1485 = arg0 * 8 + 5;
            int var3 = class135.field3285.method498((byte) 124);
            int var4 = class135.field3285.method498((byte) 126);
            arg1.method887(var4, 16422, var3);
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
    public static void method552(byte arg0) {
        field1680 = null;
        field1677 = null;
        field1689 = null;
        field1664 = null;
        field1657 = null;
        field1665 = null;
        field1685 = null;
        field1673 = null;
        field1662 = null;
        if (arg0 > -80) {
            method547(-74, 22);
        }
        field1688 = null;
        field1670 = null;
        field1686 = null;
        field1663 = null;
        field1682 = null;
        field1668 = null;
        field1661 = null;
        field1678 = null;
    }
}
