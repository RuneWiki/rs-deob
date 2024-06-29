import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class95 extends class232 {

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    private int field1737 = 0;

    @OriginalMember(owner = "client!fa", name = "eb", descriptor = "I")
    private int field1748 = 0;

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "I")
    private int field1742 = 0;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "Lhi;")
    private static class82 field1736 = method664((byte) -53, "glow1:");

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "Lhi;")
    public static class82 field1733 = field1736;

    @OriginalMember(owner = "client!fa", name = "gb", descriptor = "I")
    public static int field1750 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!fa", name = "jb", descriptor = "Lhi;")
    public static class82 field1753 = field1736;

    @OriginalMember(owner = "client!fa", name = "kb", descriptor = "Lhi;")
    public static class82 field1754 = method664((byte) -48, "headicons_prayer");

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
    public static int field1735 = -2;

    @OriginalMember(owner = "client!fa", name = "hb", descriptor = "I")
    public static int field1751 = 500;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    private int field1734;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
    private int field1739;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!fa", name = "bb", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!fa", name = "cb", descriptor = "I")
    private int field1746;

    @OriginalMember(owner = "client!fa", name = "db", descriptor = "I")
    private int field1747;

    @OriginalMember(owner = "client!fa", name = "fb", descriptor = "I")
    private int field1749;

    @OriginalMember(owner = "client!fa", name = "ib", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!fa", name = "lb", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBLbc;)V", line = 8)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        field1741++;
        if (arg0 == 0) {
            this.field1748 = arg2.method1052(31521);
        } else if (arg0 == 1) {
            this.field1737 = (arg2.method1104(-1) << 12) / 100;
        } else if (arg0 == 2) {
            this.field1742 = (arg2.method1104(-1) << 12) / 100;
        }
        if (arg1 != -19) {
            this.field1734 = 1;
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)V", line = 55)
    public static final void method661(int arg0, int arg1) {
        if (arg1 < 108) {
            method664((byte) 98, (String) null);
        }
        field1744++;
        class139.field2380.method2177(arg0, -121);
    }

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "(I)V", line = 71)
    public static final void method662(int arg0) {
        field1743++;
        if (class47.field781 == null) {
            return;
        }
        if (class245.field4257 < 10) {
            if (!class256.field4411.method1600(false, class47.field781.field1955)) {
                class245.field4257 = class209.field3676.method1572((byte) -86, class47.field781.field1955) / 10;
                return;
            }
            class51.method366(-5);
            class245.field4257 = 10;
        }
        if (class245.field4257 == 10) {
            class166.field2905 = class47.field781.field1957 >> 6 << 6;
            class69.field1065 = 8.0F;
            class119.field2106 = 8.0F;
            class17.field181 = class47.field781.field1948 >> 6 << 6;
            class157.field2719 = (class47.field781.field1947 >> 6 << 6) - (class17.field181 - 64);
            class244.field4242 = (class47.field781.field1942 >> 6 << 6) + 64 - class166.field2905;
            int var1 = (class168.field2932.field1685 >> 7) + class230.field3976 - class166.field2905;
            int var2 = class17.field181 + class157.field2719 - (class168.field2932.field1689 >> 7) - (class226.field3916 - -1);
            int var3 = var2 + (int) (Math.random() * 10.0D) - 5;
            int var4 = var1 + (int) (Math.random() * 10.0D) - 5;
            if (var4 >= 0 && var4 < class244.field4242 && var3 >= 0 && class157.field2719 > var3) {
                class315.field5426 = var3;
                class82.field1445 = var4;
            } else {
                class82.field1445 = class47.field781.field1939 * 64 - class166.field2905;
                class315.field5426 = class157.field2719 - (1 - class17.field181) - class47.field781.field1936 * 64;
            }
            class141.method963(0);
            int var5 = class244.field4242 >> 6;
            int var6 = class230.field3970 >> 1;
            int var7 = class157.field2719 >> 6;
            int var8 = class54.field860 >> 2 << 10;
            class218.field3781 = new byte[var5][var7][];
            class308.field5244 = new int[var5][var7][];
            class53.field848 = new int[class105.field1860 + 1];
            class262.field4474 = new short[var5][var7][];
            class202.field3482 = new byte[var5][var7][];
            class161.field2815 = new int[var5][var7][];
            class314.field5417 = new byte[var5][var7][];
            class283.field4756 = new byte[var5][var7][];
            class44.field767 = new byte[var5][var7][];
            class235.method1670(var6, var8, 19709);
            class245.field4257 = 20;
        } else if (class245.field4257 == 20) {
            class200.method1407(-1, new class153(class256.field4411.method1567(0, class47.field781.field1955, class24.field327)));
            class245.field4257 = 30;
            class111.method768((byte) 121, true);
            class15.method84(true);
        } else if (class245.field4257 == 30) {
            class73.method459(121, new class153(class256.field4411.method1567(0, class47.field781.field1955, class184.field3136)));
            class245.field4257 = 40;
            class15.method84(true);
        } else if (class245.field4257 == 40) {
            class79.method497(new class153(class256.field4411.method1567(0, class47.field781.field1955, class79.field1349)), (byte) 0);
            class245.field4257 = 50;
            class15.method84(true);
        } else if (class245.field4257 == 50) {
            class202.method1422((byte) -14, new class153(class256.field4411.method1567(0, class47.field781.field1955, class306.field5221)));
            class245.field4257 = 60;
            class111.method768((byte) 121, true);
            class15.method84(true);
        } else {
            if (arg0 != 1) {
                method661(79, -73);
            }
            if (class245.field4257 == 60) {
                if (class256.field4411.method1599(class29.method182(-6039, new class82[] { class47.field781.field1955, class308.field5255 }), -1)) {
                    if (!class256.field4411.method1600(false, class29.method182(-6039, new class82[] { class47.field781.field1955, class308.field5255 }))) {
                        return;
                    }
                    class297.field5057 = class230.method1635(class256.field4411, class29.method182(arg0 - 6040, new class82[] { class47.field781.field1955, class308.field5255 }), -106);
                } else {
                    class297.field5057 = new class250(0);
                }
                class245.field4257 = 70;
                class15.method84(true);
            } else if (class245.field4257 == 70) {
                class259.field4434 = new class70(11, true, class122.field2134);
                class245.field4257 = 73;
                class111.method768((byte) 121, true);
                class15.method84(true);
            } else if (class245.field4257 == 73) {
                class208.field3643 = new class70(12, true, class122.field2134);
                class245.field4257 = 76;
                class111.method768((byte) 121, true);
                class15.method84(true);
            } else if (class245.field4257 == 76) {
                class127.field2234 = new class70(14, true, class122.field2134);
                class245.field4257 = 79;
                class111.method768((byte) 121, true);
                class15.method84(true);
            } else if (class245.field4257 == 79) {
                class275.field4624 = new class70(17, true, class122.field2134);
                class245.field4257 = 82;
                class111.method768((byte) 121, true);
                class15.method84(true);
            } else if (class245.field4257 == 82) {
                class224.field3889 = new class70(19, true, class122.field2134);
                class245.field4257 = 85;
                class111.method768((byte) 121, true);
                class15.method84(true);
            } else if (class245.field4257 == 85) {
                class152.field2571 = new class70(22, true, class122.field2134);
                class245.field4257 = 88;
                class111.method768((byte) 121, true);
                class15.method84(true);
            } else if (class245.field4257 == 88) {
                class192.field3249 = new class70(26, true, class122.field2134);
                class245.field4257 = 91;
                class111.method768((byte) 121, true);
                class15.method84(true);
            } else {
                class310.field5305 = new class70(30, true, class122.field2134);
                class245.field4257 = 100;
                class111.method768((byte) 121, true);
                class15.method84(true);
                class130.field2268 = -1;
                class78.field1330 = -1;
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIII)V", line = 277)
    private final void method663(int arg0, int arg1, int arg2, int arg3) {
        field1745++;
        int var5 = arg3 <= arg1 ? arg1 : arg3;
        int var6 = arg1 <= arg3 ? arg1 : arg3;
        int var7 = arg0 < var6 ? arg0 : var6;
        int var8 = var5 < arg0 ? arg0 : var5;
        this.field1738 = (var7 + var8) / 2;
        int var9 = var8 - var7;
        if (this.field1738 > 0 && this.field1738 < 4096) {
            this.field1739 = (var9 << 12) / (this.field1738 <= 2048 ? this.field1738 * 2 : 8192 - (this.field1738 * 2));
        } else {
            this.field1739 = 0;
        }
        int var10 = 78 % ((arg2 + 3) / 37);
        if (var9 <= 0) {
            this.field1747 = 0;
            return;
        }
        int var11 = (var8 - arg3 << 12) / var9;
        int var12 = (var8 - arg0 << 12) / var9;
        int var13 = (var8 - arg1 << 12) / var9;
        if (arg3 == var8) {
            this.field1747 = arg1 == var7 ? var12 + 20480 : -var13 + 4096;
        } else if (arg1 == var8) {
            this.field1747 = arg0 == var7 ? var11 + 4096 : -var12 + 12288;
        } else {
            this.field1747 = arg3 == var7 ? var13 + 12288 : -var11 + 20480;
        }
        this.field1747 /= 6;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLjava/lang/String;)Lhi;", line = 340)
    public static final class82 method664(byte arg0, String arg1) {
        field1755++;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        class82 var4 = new class82();
        if (arg0 > -24) {
            method664((byte) -15, (String) null);
        }
        int var5 = 0;
        var4.field1419 = new byte[var3];
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field1419[var4.field1468++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field1419[var4.field1468++] = (byte) var6;
            }
        }
        var4.method576(true);
        return var4.method536(-14);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(IIII)V", line = 388)
    private final void method665(int arg0, int arg1, int arg2, int arg3) {
        field1752++;
        if (arg3 != -30236) {
            this.method665(-127, -24, 119, 53);
        }
        int var5 = arg0 <= 2048 ? (arg1 + 4096) * arg0 >> 12 : arg0 + arg1 - (arg0 * arg1 >> 12);
        if (var5 <= 0) {
            this.field1734 = this.field1746 = this.field1749 = arg0;
            return;
        }
        int var6 = arg2 * 6;
        int var7 = arg0 + arg0 - var5;
        int var8 = (var5 - var7 << 12) / var5;
        int var9 = var6 >> 12;
        int var11 = var8 * var5 >> 12;
        int var12 = var6 - (var9 << 12);
        int var13 = var11 * var12 >> 12;
        int var14 = var7 + var13;
        int var15 = var5 - var13;
        if (var9 == 0) {
            this.field1749 = var7;
            this.field1746 = var14;
            this.field1734 = var5;
        } else if (var9 == 1) {
            this.field1746 = var5;
            this.field1749 = var7;
            this.field1734 = var15;
        } else if (var9 == 2) {
            this.field1746 = var5;
            this.field1749 = var14;
            this.field1734 = var7;
        } else if (var9 == 3) {
            this.field1734 = var7;
            this.field1749 = var5;
            this.field1746 = var15;
        } else if (var9 == 4) {
            this.field1746 = var7;
            this.field1749 = var5;
            this.field1734 = var14;
        } else if (var9 == 5) {
            this.field1749 = var15;
            this.field1734 = var5;
            this.field1746 = var7;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)[[I", line = 502)
    public final int[][] method146(int arg0, byte arg1) {
        if (arg1 != -82) {
            field1753 = (class82) null;
        }
        field1740++;
        int[][] var3 = this.field3996.method136(0, arg0);
        if (this.field3996.field278) {
            int[][] var4 = this.method1641(0, arg0, (byte) -98);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class54.field858; var11++) {
                this.method663(var9[var11], var7[var11], 65, var5[var11]);
                this.field1738 += this.field1742;
                this.field1739 += this.field1737;
                for (this.field1747 += this.field1748; this.field1747 < 0; this.field1747 += 4096) {
                }
                if (this.field1739 < 0) {
                    this.field1739 = 0;
                }
                if (this.field1739 > 4096) {
                    this.field1739 = 4096;
                }
                if (this.field1738 < 0) {
                    this.field1738 = 0;
                }
                while (this.field1747 > 4096) {
                    this.field1747 -= 4096;
                }
                if (this.field1738 > 4096) {
                    this.field1738 = 4096;
                }
                this.method665(this.field1738, this.field1739, this.field1747, -30236);
                var6[var11] = this.field1734;
                var8[var11] = this.field1746;
                var10[var11] = this.field1749;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "(I)V", line = 574)
    public static void method666(int arg0) {
        field1736 = null;
        field1753 = null;
        field1754 = null;
        field1733 = null;
        if (arg0 != -61) {
            method662(-54);
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V", line = 614)
    public class95() {
        super(1, false);
    }
}
