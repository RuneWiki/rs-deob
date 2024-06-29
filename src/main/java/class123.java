import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class123 extends class55 {

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "Lwk;")
    public class182 field1764;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "Ljava/lang/String;")
    public static String field1766 = " from your friend list first.";

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1769 = "Loaded update list";

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
    public static int field1771 = 0;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "[C")
    public static char[] field1774 = new char[128];

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
    public static int field1776 = -1;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "Lol;")
    public static class111 field1762;

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "Lbc;")
    public static class282 field1768;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "Lbc;")
    public static class282 field1770;

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "[[Lwe;")
    public static class82[][] field1767;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)I")
    public static final int method803(byte arg0, int arg1) {
        field1772++;
        if (arg0 != 5) {
            method805(-19);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(Z)V")
    public static final void method804(boolean arg0) {
        field1775++;
        int var1 = class133.field1929 * 128 + 64;
        int var2 = class293.field4637 * 128 + 64;
        int var3 = class4.method21(var2, class199.field2833, var1, (byte) 26) - class243.field3546;
        if (class121.field1725 >= 100) {
            class204.field2902 = class293.field4637 * 128 + 64;
            class245.field3560 = class133.field1929 * 128 + 64;
            class225.field3172 = class4.method21(class204.field2902, class199.field2833, class245.field3560, (byte) 26) - class243.field3546;
        } else {
            if (class204.field2902 < var2) {
                class204.field2902 += (var2 - class204.field2902) * class121.field1725 / 1000 + class117.field1653;
                if (var2 < class204.field2902) {
                    class204.field2902 = var2;
                }
            }
            if (class204.field2902 > var2) {
                class204.field2902 -= (class204.field2902 - var2) * class121.field1725 / 1000 + class117.field1653;
                if (var2 > class204.field2902) {
                    class204.field2902 = var2;
                }
            }
            if (var3 > class225.field3172) {
                class225.field3172 += (var3 - class225.field3172) * class121.field1725 / 1000 + class117.field1653;
                if (var3 < class225.field3172) {
                    class225.field3172 = var3;
                }
            }
            if (class245.field3560 < var1) {
                class245.field3560 += (var1 - class245.field3560) * class121.field1725 / 1000 + class117.field1653;
                if (class245.field3560 > var1) {
                    class245.field3560 = var1;
                }
            }
            if (var1 < class245.field3560) {
                class245.field3560 -= class117.field1653 + ((class245.field3560 - var1) * class121.field1725 / 1000);
                if (var1 > class245.field3560) {
                    class245.field3560 = var1;
                }
            }
            if (var3 < class225.field3172) {
                class225.field3172 -= (class225.field3172 - var3) * class121.field1725 / 1000 + class117.field1653;
                if (class225.field3172 < var3) {
                    class225.field3172 = var3;
                }
            }
        }
        int var4 = class129.field1858 * 128 + 64;
        int var5 = class26.field302 * 128 + 64;
        int var6 = class4.method21(var5, class199.field2833, var4, (byte) 26) - class55.field646;
        int var7 = var4 - class245.field3560;
        int var8 = var6 - class225.field3172;
        int var9 = var5 - class204.field2902;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var9)) & 0x7FF;
        int var13 = var12 - class138.field2010;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (arg0) {
            return;
        }
        if (var13 > 0) {
            class138.field2010 += class212.field2972 * var13 / 1000 + class150.field2177;
            class138.field2010 &= 0x7FF;
        }
        if (var13 < 0) {
            class138.field2010 -= -var13 * class212.field2972 / 1000 + class150.field2177;
            class138.field2010 &= 0x7FF;
        }
        if (var11 < 128) {
            var11 = 128;
        }
        int var14 = var12 - class138.field2010;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class138.field2010 = var12;
        }
        if (var11 > class280.field4246) {
            class280.field4246 += class150.field2177 + ((var11 - class280.field4246) * class212.field2972 / 1000);
            if (var11 < class280.field4246) {
                class280.field4246 = var11;
            }
        }
        if (class280.field4246 <= var11) {
            return;
        }
        class280.field4246 -= (class280.field4246 - var11) * class212.field2972 / 1000 + class150.field2177;
        if (class280.field4246 < var11) {
            class280.field4246 = var11;
            return;
        }
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "(I)V")
    public static void method805(int arg0) {
        field1766 = null;
        field1768 = null;
        field1769 = null;
        if (arg0 > -94) {
            method803((byte) 32, -66);
        }
        field1770 = null;
        field1774 = null;
        field1767 = null;
        field1762 = null;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lwk;)V")
    public class123(class182 arg0) {
        this.field1764 = arg0;
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(B)V")
    public static final void method806(byte arg0) {
        class286.field4428.method67((byte) 68);
        if (arg0 == -80) {
            class198.field2817.method67((byte) 111);
            class124.field1785.method67((byte) 126);
            field1773++;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lsi;Z)V")
    public static final void method807(class56 arg0, boolean arg1) {
        field1765++;
        class264 var2 = null;
        try {
            class81 var3 = arg0.method343((byte) -34, "runescape");
            while (var3.field960 == 0) {
                class247.method1595(1L, (byte) -83);
            }
            if (!arg1) {
                return;
            }
            if (var3.field960 == 1) {
                var2 = (class264) var3.field958;
                class216 var4 = class217.method1414(1);
                var2.method1687(!arg1, var4.field3021, 0, var4.field3030);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1688(-3327);
            }
        } catch (Exception var5) {
        }
    }
}
