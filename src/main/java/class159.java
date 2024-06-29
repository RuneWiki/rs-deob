import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class159 {

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "Lmb;")
    private class156 field2709 = new class156();

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "Lmb;")
    private class156 field2727 = new class156();

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    private int field2730 = 0;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "Lmb;")
    private class156 field2731 = new class156();

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "Lmb;")
    private class156 field2732 = new class156();

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    private int field2737 = 0;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "Lik;")
    private class247 field2735 = new class247(4);

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "B")
    private byte field2738 = 0;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public volatile int field2740 = 0;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public volatile int field2739 = 0;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "Lik;")
    private class247 field2741 = new class247(8);

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "[I")
    public static int[] field2715 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "Ljd;")
    private static class85 field2723 = class221.method1499(" from your friend list first)3", (byte) 126);

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "Ljd;")
    public static class85 field2722 = field2723;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
    private int field2734;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "J")
    private long field2736;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "Lna;")
    private class31 field2733;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "Laj;")
    public static class45 field2725;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "Luh;")
    private class98 field2742;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "[Lc;")
    public static class103[] field2707;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZZ)V")
    public final void method1035(boolean arg0, boolean arg1) {
        field2712++;
        if (this.field2733 == null) {
            return;
        }
        try {
            if (!arg1) {
                this.field2735.field4224 = 0;
                this.field2735.method1714(arg0 ? 2 : 3, -714043120);
                this.field2735.method1684(0, 105);
                this.field2733.method214(this.field2735.field4238, 4, 0, (byte) 15);
            }
        } catch (IOException var4) {
            try {
                this.field2733.method218(121);
            } catch (Exception var3) {
            }
            this.field2733 = null;
            this.field2739++;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    private final void method1036(int arg0) {
        field2714++;
        if (this.field2733 == null) {
            return;
        }
        try {
            this.field2735.field4224 = 0;
            this.field2735.method1714(6, -714043120);
            this.field2735.method1684(2, 119);
            this.field2733.method214(this.field2735.field4238, 4, 0, (byte) 15);
            if (arg0 >= -89) {
                this.field2738 = -88;
            }
        } catch (IOException var3) {
            try {
                this.field2733.method218(125);
            } catch (Exception var2) {
            }
            this.field2733 = null;
            this.field2739++;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)Z")
    public final boolean method1037(int arg0) {
        field2716++;
        if (arg0 != -29093) {
            this.method1037(47);
        }
        return this.field2730 >= 20;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZILna;)V")
    public final void method1038(boolean arg0, int arg1, class31 arg2) {
        if (this.field2733 != null) {
            try {
                this.field2733.method218(124);
            } catch (Exception var9) {
            }
            this.field2733 = null;
        }
        field2719++;
        this.field2733 = arg2;
        this.method1036(-106);
        this.method1035(arg0, false);
        this.field2741.field4224 = 0;
        this.field2742 = null;
        while (true) {
            class98 var4 = (class98) this.field2727.method1021(70);
            if (var4 == null) {
                while (true) {
                    class98 var5 = (class98) this.field2732.method1021(57);
                    if (var5 == null) {
                        if (this.field2738 != 0) {
                            try {
                                this.field2735.field4224 = 0;
                                this.field2735.method1714(4, -714043120);
                                this.field2735.method1714(this.field2738, -714043120);
                                this.field2735.method1703(0, -91);
                                this.field2733.method214(this.field2735.field4238, 4, 0, (byte) 15);
                            } catch (IOException var8) {
                                try {
                                    this.field2733.method218(122);
                                } catch (Exception var7) {
                                }
                                this.field2733 = null;
                                this.field2739++;
                            }
                        }
                        this.field2734 = 0;
                        int var6 = 16 / ((-arg1 - 18) / 34);
                        this.field2736 = class28.method200(-127);
                        return;
                    }
                    this.field2731.method1025(29642, var5);
                }
            }
            this.field2709.method1025(29642, var4);
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(ZZ)I")
    public static final int method1039(boolean arg0, boolean arg1) {
        field2729++;
        long var2 = class28.method200(-59);
        if (arg1) {
            return -78;
        }
        for (class168 var4 = arg0 ? (class168) class48.field857.method1392((byte) -120) : (class168) class48.field857.method1399(-121); var4 != null; var4 = (class168) class48.field857.method1399(-125)) {
            if ((var4.field2889 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field2889 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field4377;
                    class256.field4563[var5] = class260.field4599[var5];
                    var4.method1753(137);
                    return var5;
                }
                var4.method1753(137);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static final void method1040(byte arg0) {
        field2718++;
        if (arg0 > -33) {
            return;
        }
        int var1 = class79.field1459.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class79.field1459[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class7.field80; var4++) {
                    if (class94.field1719[var2] == class221.field3883[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class221.field3883[class7.field80] = class94.field1719[var2];
                    var3 = class7.field80++;
                }
                int var5 = 0;
                class247 var6 = new class247(class79.field1459[var2]);
                while (var6.field4224 < class79.field1459[var2].length && var5 < 511) {
                    int var7 = var6.method1694((byte) -100);
                    int var8 = var7 >> 14;
                    int var9 = var3 | var5++ << 6;
                    int var10 = var7 >> 7 & 0x3F;
                    int var11 = var7 & 0x3F;
                    int var12 = (class94.field1719[var2] >> 8) * 64 + var10 - class244.field4172;
                    int var13 = (class94.field1719[var2] & 0xFF) * 64 + var11 - class213.field3742;
                    class263 var14 = class55.method370(true, var6.method1694((byte) -100));
                    if (class194.field3320[var9] == null && (var14.field4662 & 0x1) > 0 && class82.field1498 == var8 && var12 >= 0 && var12 + var14.field4700 < 104 && var13 >= 0 && var14.field4700 + var13 < 104) {
                        class194.field3320[var9] = new class17();
                        class17 var15 = class194.field3320[var9];
                        class137.field2380[class44.field775++] = var9;
                        var15.field247 = var14;
                        var15.field1009 = class151.field2555;
                        var15.method389(var15.field247.field4700, (byte) -82);
                        var15.field1024 = var15.field247.field4661;
                        var15.field1049 = var15.field247.field4681;
                        var15.field1033 = var15.field247.field4651;
                        var15.field1041 = var15.field247.field4711;
                        var15.field1014 = var15.field247.field4666;
                        if (var15.field1033 == 0) {
                            var15.field1036 = 0;
                        }
                        var15.field1013 = var15.field247.field4676;
                        var15.field1011 = var15.field247.field4678;
                        var15.field1006 = var15.field247.field4712;
                        var15.method386(var15.method311((byte) 127), var13, true, (byte) 127, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)I")
    public final int method1041(byte arg0) {
        field2711++;
        if (arg0 > -18) {
            field2707 = null;
        }
        return this.field2730;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
    public static void method1042(int arg0) {
        field2725 = null;
        field2722 = null;
        field2707 = null;
        field2715 = null;
        if (arg0 != 0) {
            method1042(31);
        }
        field2723 = null;
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)Z")
    public final boolean method1043(int arg0) {
        field2710++;
        long var2 = class28.method200(-12);
        int var4 = (int) (var2 - this.field2736);
        if (var4 > 200) {
            var4 = 200;
        }
        this.field2736 = var2;
        this.field2734 += var4;
        if (this.field2730 == 0 && this.field2737 == 0) {
            if (this.field2733 == null) {
                return true;
            }
            if (this.field2734 > 30000) {
                try {
                    this.field2733.method218(121);
                } catch (Exception var26) {
                }
                this.field2733 = null;
                return true;
            }
        } else if (this.field2733 == null) {
            return false;
        }
        boolean var5 = false;
        try {
            for (class98 var6 = (class98) this.field2709.method1028(arg0 ^ 0x56); var6 != null; var6 = (class98) this.field2709.method1030(123)) {
                this.field2735.field4224 = 0;
                this.field2735.method1714(1, arg0 - 714043120);
                this.field2735.method1684((int) var6.field3509, arg0 ^ 0x6A);
                this.field2733.method214(this.field2735.field4238, 4, 0, (byte) 15);
                this.field2727.method1025(29642, var6);
            }
            for (class98 var7 = (class98) this.field2731.method1028(123); var7 != null; var7 = (class98) this.field2731.method1030(126)) {
                this.field2735.field4224 = 0;
                this.field2735.method1714(0, arg0 ^ 0xD5709110);
                this.field2735.method1684((int) var7.field3509, 127);
                this.field2733.method214(this.field2735.field4238, 4, 0, (byte) 15);
                this.field2732.method1025(29642, var7);
            }
            for (int var8 = arg0; var8 < 100; var8++) {
                int var9 = this.field2733.method212((byte) 91);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field2734 = 0;
                byte var10 = 0;
                if (this.field2742 == null) {
                    var10 = 8;
                } else if (this.field2742.field1765 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field2741.field4224;
                    if (var11 > var9) {
                        var11 = var9;
                    }
                    this.field2733.method216(this.field2741.field4238, var11, this.field2741.field4224, 0);
                    if (this.field2738 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field2741.field4238[this.field2741.field4224 + var12] = (byte) class197.method1346(this.field2741.field4238[this.field2741.field4224 + var12], this.field2738);
                        }
                    }
                    this.field2741.field4224 += var11;
                    if (var10 <= this.field2741.field4224) {
                        if (this.field2742 == null) {
                            this.field2741.field4224 = 0;
                            if (this.field2741.method1720((byte) -3) == -72057594037927937L) {
                                var5 = true;
                                this.field2741.field4224 = 0;
                            } else {
                                this.field2741.field4224 = 0;
                                int var13 = this.field2741.method1711((byte) -67);
                                int var14 = this.field2741.method1694((byte) -100);
                                int var15 = this.field2741.method1711((byte) -67);
                                int var16 = this.field2741.method1712(arg0 ^ 0x18D5);
                                long var17 = (long) ((var13 << 16) + var14);
                                Object var19 = null;
                                class98 var20 = (class98) this.field2727.method1028(123);
                                label138: while (true) {
                                    if (var20 == null) {
                                        var20 = (class98) this.field2732.method1028(49);
                                        while (true) {
                                            if (var20 == null || var20.field3509 == var17) {
                                                break label138;
                                            }
                                            var20 = (class98) this.field2732.method1030(127);
                                        }
                                    }
                                    if (var20.field3509 == var17) {
                                        break;
                                    }
                                    var20 = (class98) this.field2727.method1030(124);
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                this.field2742 = var20;
                                int var21 = var15 == 0 ? 5 : 9;
                                this.field2742.field1773 = new class247(this.field2742.field1776 + var21 + var16);
                                this.field2742.field1773.method1714(var15, -714043120);
                                this.field2742.field1773.method1715(var16, (byte) -13);
                                this.field2741.field4224 = 0;
                                this.field2742.field1765 = 8;
                            }
                        } else if (this.field2742.field1765 != 0) {
                            throw new IOException();
                        } else if (this.field2741.field4238[0] == -1) {
                            this.field2741.field4224 = 0;
                            this.field2742.field1765 = 1;
                        } else {
                            this.field2742 = null;
                        }
                    }
                } else {
                    int var22 = 512 - this.field2742.field1765;
                    int var23 = this.field2742.field1773.field4238.length - this.field2742.field1776;
                    if (var22 > (var23 - this.field2742.field1773.field4224)) {
                        var22 = var23 - this.field2742.field1773.field4224;
                    }
                    if (var22 > var9) {
                        var22 = var9;
                    }
                    this.field2733.method216(this.field2742.field1773.field4238, var22, this.field2742.field1773.field4224, 0);
                    if (this.field2738 != 0) {
                        for (int var24 = 0; var24 < var22; var24++) {
                            this.field2742.field1773.field4238[this.field2742.field1773.field4224 + var24] = (byte) class197.method1346(this.field2742.field1773.field4238[this.field2742.field1773.field4224 + var24], this.field2738);
                        }
                    }
                    this.field2742.field1765 += var22;
                    this.field2742.field1773.field4224 += var22;
                    if (this.field2742.field1773.field4224 == var23) {
                        this.field2742.method1380(true);
                        if (this.field2742.field3772) {
                            this.field2730--;
                        } else {
                            this.field2737--;
                        }
                        this.field2742.field3776 = false;
                        this.field2742 = null;
                    } else if (this.field2742.field1765 == 512) {
                        this.field2742.field1765 = 0;
                    }
                }
            }
            if (var5) {
                this.field2735.field4224 = 0;
                this.field2735.method1714(5, arg0 ^ 0xD5709110);
                this.field2733.method214(this.field2735.field4238, 4, 0, (byte) 15);
            }
            return true;
        } catch (IOException var27) {
            try {
                this.field2733.method218(124);
            } catch (Exception var25) {
            }
            this.field2739++;
            this.field2733 = null;
            return false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V")
    public final void method1044(int arg0) {
        field2724++;
        if (this.field2733 != null) {
            this.field2733.method218(127);
        }
        if (arg0 > -121) {
            method1040((byte) -34);
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)V")
    public final void method1045(byte arg0) {
        this.field2738 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field2740++;
        if (arg0 != 108) {
            this.field2739 = 30;
        }
        field2721++;
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)Z")
    public final boolean method1046(int arg0) {
        int var2 = -61 % ((arg0 - 6) / 36);
        field2708++;
        return this.field2737 >= 20;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIZBI)Luh;")
    public final class98 method1047(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        if (arg4 != 3571) {
            this.field2731 = null;
        }
        field2726++;
        long var6 = (long) ((arg1 << 16) + arg0);
        class98 var8 = new class98();
        var8.field3509 = var6;
        var8.field1776 = arg3;
        var8.field3772 = arg2;
        if (arg2) {
            if (this.field2730 >= 20) {
                throw new RuntimeException();
            }
            this.field2709.method1025(29642, var8);
            this.field2730++;
        } else if (this.field2737 < 20) {
            this.field2731.method1025(arg4 + 26071, var8);
            this.field2737++;
        } else {
            throw new RuntimeException();
        }
        return var8;
    }
}
