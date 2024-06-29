import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class61 extends class124 {

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "Lrd;")
    public static class117 field1698 = class95.method812("@cr1@", (byte) 8);

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "I")
    public static int field1703 = 1;

    @OriginalMember(owner = "client!ie", name = "nb", descriptor = "Lrd;")
    public static class117 field1712 = class95.method812("null", (byte) 8);

    @OriginalMember(owner = "client!ie", name = "ub", descriptor = "[J")
    public static long[] field1719 = new long[100];

    @OriginalMember(owner = "client!ie", name = "tb", descriptor = "[I")
    public static int[] field1718 = new int[256];

    @OriginalMember(owner = "client!ie", name = "Bb", descriptor = "Lrd;")
    public static class117 field1726 = class95.method812("mapmarker", (byte) 8);

    @OriginalMember(owner = "client!ie", name = "xb", descriptor = "Lrd;")
    public static class117 field1722 = class95.method812("backleft2", (byte) 8);

    @OriginalMember(owner = "client!ie", name = "Db", descriptor = "Lrd;")
    public static class117 field1728 = class95.method812("Spiel)2Engine wird gestartet)3)3)3", (byte) 8);

    @OriginalMember(owner = "client!ie", name = "Cb", descriptor = "Lrd;")
    public static class117 field1727 = class95.method812("Diese Betatest)2Welt ist nur f-Ur eingeladene", (byte) 8);

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!ie", name = "gb", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!ie", name = "ib", descriptor = "I")
    public int field1707;

    @OriginalMember(owner = "client!ie", name = "lb", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!ie", name = "mb", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!ie", name = "ob", descriptor = "I")
    public int field1713;

    @OriginalMember(owner = "client!ie", name = "pb", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!ie", name = "qb", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!ie", name = "rb", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ie", name = "sb", descriptor = "I")
    public int field1717;

    @OriginalMember(owner = "client!ie", name = "vb", descriptor = "I")
    public int field1720;

    @OriginalMember(owner = "client!ie", name = "zb", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!ie", name = "Ab", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "Lpe;")
    public static class106 field1702;

    @OriginalMember(owner = "client!ie", name = "hb", descriptor = "Lbe;")
    public static class13 field1706;

    @OriginalMember(owner = "client!ie", name = "jb", descriptor = "Lwa;")
    public static class144 field1708;

    @OriginalMember(owner = "client!ie", name = "yb", descriptor = "Lce;")
    public static class20 field1723;

    @OriginalMember(owner = "client!ie", name = "Eb", descriptor = "Ll;")
    public static class76 field1729;

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "[I")
    public int[] field1699;

    @OriginalMember(owner = "client!ie", name = "fb", descriptor = "[I")
    public static int[] field1704;

    @OriginalMember(owner = "client!ie", name = "wb", descriptor = "[I")
    public int[] field1721;

    @OriginalMember(owner = "client!ie", name = "kb", descriptor = "[Lrd;")
    public class117[] field1709;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqd;")
    public static final class111 method614(Throwable arg0, String arg1) {
        field1697++;
        class111 var2;
        if (arg0 instanceof class111) {
            var2 = (class111) arg0;
            var2.field2789 = var2.field2789 + ' ' + arg1;
        } else {
            var2 = new class111(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILge;Lrd;Lrd;)[Ll;")
    public static final class76[] method615(int arg0, class47 arg1, class117 arg2, class117 arg3) {
        int var4 = arg1.method509(arg2, 0);
        int var5 = arg1.method523(var4, arg3, -1);
        field1724++;
        return arg0 >= -20 ? null : class37.method451(arg1, var5, -1, var4);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIILp;)V")
    public static final void method616(int arg0, int arg1, int arg2, class101 arg3) {
        if (arg3.field703 == arg0 && arg0 != -1) {
            int var4 = class33.method387(arg0, 7455).field1279;
            if (var4 == 1) {
                arg3.field727 = 0;
                arg3.field684 = 0;
                arg3.field712 = arg1;
                arg3.field723 = 0;
            }
            if (var4 == 2) {
                arg3.field723 = 0;
            }
        } else if (arg0 == -1 || arg3.field703 == -1 || class33.method387(arg0, 7455).field1300 >= class33.method387(arg3.field703, 7455).field1300) {
            arg3.field694 = arg3.field737;
            arg3.field723 = 0;
            arg3.field684 = 0;
            arg3.field727 = 0;
            arg3.field703 = arg0;
            arg3.field712 = arg1;
        }
        field1716++;
        if (arg2 > -123) {
            field1719 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)Z")
    public static final boolean method617(int arg0, int arg1) {
        if (arg1 > -46) {
            return false;
        } else {
            field1714++;
            return (arg0 >> 21 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)I")
    public static final int method618(byte arg0) {
        field1725++;
        int var1 = -40 % (-arg0 / 52);
        return class46.field1307++;
    }

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)V")
    public static void method619(int arg0) {
        field1708 = null;
        if (arg0 < 68) {
            method619(54);
        }
        field1726 = null;
        field1702 = null;
        field1727 = null;
        field1698 = null;
        field1706 = null;
        field1718 = null;
        field1729 = null;
        field1728 = null;
        field1722 = null;
        field1712 = null;
        field1719 = null;
        field1723 = null;
        field1704 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZII)Lrd;")
    public static final class117 method620(int arg0, boolean arg1, int arg2, int arg3) {
        field1715++;
        if (arg3 < 1 || arg3 > 36) {
            arg3 = 10;
        }
        int var4 = 1;
        for (int var5 = arg0 / arg3; var5 != 0; var5 /= arg3) {
            var4++;
        }
        int var6 = var4;
        if (arg0 < 0 || arg1) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 != -17485) {
            return null;
        }
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg0 % arg3;
            arg0 /= arg3;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class117 var9 = new class117();
        var9.field2851 = var7;
        var9.field2858 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZLwa;)Z")
    public static final boolean method621(boolean arg0, class144 arg1) {
        if (arg0) {
            method617(66, 24);
        }
        field1705++;
        if (class73.field2037) {
            if (class97.method827((byte) 94, arg1) != 0) {
                return false;
            }
            if (arg1.field3533 == 0) {
                return false;
            }
        }
        return arg1.field3539;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)I")
    public static final int method622(boolean arg0, int arg1) {
        field1700++;
        if (arg0) {
            return -125;
        }
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)V")
    public static final void method623(boolean arg0) {
        field1711++;
        if (class94.field2364 == 0) {
            return;
        }
        class19 var1 = class54.field1533;
        int var2 = 0;
        if (class35.field1025 != 0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            if (class128.field3107[var3] != null) {
                int var4 = class119.field2919[var3];
                class117 var5 = class43.field1236[var3];
                byte var6 = 0;
                if (var5 != null && var5.method946((byte) 83, field1698)) {
                    var6 = 1;
                    var5 = var5.method949(5, 0);
                }
                if (var5 != null && var5.method946((byte) 83, class39.field1134)) {
                    var6 = 2;
                    var5 = var5.method949(5, 0);
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || class42.field1202 == 0 || class42.field1202 == 1 && class59.method609((byte) -104, var5))) {
                    int var7 = 329 - var2 * 13;
                    var2++;
                    byte var8 = 4;
                    var1.method215(class37.field1086, var8, var7, 0);
                    var1.method215(class37.field1086, var8, var7 - 1, 65535);
                    int var9 = var8 + var1.method209(class37.field1086);
                    int var10 = var9 + var1.method201(32);
                    if (var6 == 1) {
                        class6.field137[0].method929(var10, var7 - 12);
                        var10 += 14;
                    }
                    if (var6 == 2) {
                        class6.field137[1].method929(var10, var7 - 12);
                        var10 += 14;
                    }
                    var1.method215(class18.method193(new class117[] { var5, class120.field2937, class128.field3107[var3] }, 85), var10, var7, 0);
                    var1.method215(class18.method193(new class117[] { var5, class120.field2937, class128.field3107[var3] }, 75), var10, var7 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 5 && class42.field1202 < 2) {
                    int var11 = 329 - var2 * 13;
                    var2++;
                    var1.method215(class128.field3107[var3], 4, var11, 0);
                    var1.method215(class128.field3107[var3], 4, var11 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 6 && class42.field1202 < 2) {
                    int var12 = 329 - var2 * 13;
                    var2++;
                    var1.method215(class18.method193(new class117[] { class18.field446, class45.field1261, var5, class120.field2937, class128.field3107[var3] }, 118), 4, var12, 0);
                    var1.method215(class18.method193(new class117[] { class18.field446, class45.field1261, var5, class120.field2937, class128.field3107[var3] }, 29), 4, var12 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
            }
        }
        if (arg0) {
            field1722 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1718[var0] = var1;
        }
    }
}
