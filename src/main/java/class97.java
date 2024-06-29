import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class97 extends class213 {

    @OriginalMember(owner = "client!j", name = "N", descriptor = "[Lti;")
    public class207[] field1801;

    @OriginalMember(owner = "client!j", name = "W", descriptor = "Lvd;")
    public static class222 field1810 = class212.method1357("document)3cookie=(R", 10731);

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "Lvd;")
    public static class222 field1812 = class212.method1357("Nehmen", 10731);

    @OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
    public static int field1818 = -1;

    @OriginalMember(owner = "client!j", name = "U", descriptor = "Lvd;")
    public static class222 field1808 = class212.method1357("<col=00ffff>", 10731);

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "Lvd;")
    public static class222 field1813 = class212.method1357("", 10731);

    @OriginalMember(owner = "client!j", name = "fb", descriptor = "Lvd;")
    public static class222 field1819 = field1813;

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "Lvd;")
    public static class222 field1814 = field1813;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "Lvd;")
    public static class222 field1804 = field1813;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "Lvd;")
    public static class222 field1805 = field1813;

    @OriginalMember(owner = "client!j", name = "cb", descriptor = "Lvd;")
    public static class222 field1816 = field1813;

    @OriginalMember(owner = "client!j", name = "gb", descriptor = "Lvd;")
    private static class222 field1820 = class212.method1357("Loading config )2 ", 10731);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "Lvd;")
    public static class222 field1800 = field1813;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "Lvd;")
    public static class222 field1806 = field1820;

    @OriginalMember(owner = "client!j", name = "hb", descriptor = "Llb;")
    public static class120 field1821 = new class120(0, 0);

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!j", name = "X", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!j", name = "bb", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!j", name = "V", descriptor = "Lve;")
    public static class223 field1809;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "Lab;")
    public static class3 field1807;

    @OriginalMember(owner = "client!j", name = "db", descriptor = "Lab;")
    public static class3 field1817;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V")
    public static final void method608(byte arg0) {
        if (class116.field2209 > 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class116.field2209 > 768) {
                    class114.field2158[var3] = class237.method1544((byte) -122, 1024 - class116.field2209, class58.field1077[var3], class73.field1444[var3]);
                } else if (class116.field2209 <= 256) {
                    class114.field2158[var3] = class237.method1544((byte) -116, 256 - class116.field2209, class73.field1444[var3], class58.field1077[var3]);
                } else {
                    class114.field2158[var3] = class58.field1077[var3];
                }
            }
        } else if (class60.field1117 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (class60.field1117 > 768) {
                    class114.field2158[var1] = class237.method1544((byte) -115, 1024 - class60.field1117, class172.field3237[var1], class73.field1444[var1]);
                } else if (class60.field1117 > 256) {
                    class114.field2158[var1] = class172.field3237[var1];
                } else {
                    class114.field2158[var1] = class237.method1544((byte) -117, 256 - class60.field1117, class73.field1444[var1], class172.field3237[var1]);
                }
            }
        } else {
            for (int var2 = 0; var2 < 256; var2++) {
                class114.field2158[var2] = class73.field1444[var2];
            }
        }
        field1802++;
        short var4 = 256;
        int var5 = 0;
        int var6 = class200.field3652.field448 * 9;
        int var7 = 0;
        int var8 = 1;
        if (arg0 != 78) {
            return;
        }
        while (var4 - 1 > var8) {
            int var21 = (var4 - var8) * class73.field1455[var8] / var4 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var24 = class157.field3016[var5++];
                int var25 = class200.field3652.field445[var6++];
                if (var24 == 0) {
                    class223.field4180.field445[var7++] = var25;
                } else {
                    int var27 = 256 - var24;
                    int var28 = class114.field2158[var24];
                    class223.field4180.field445[var7++] = class139.method876(16711680, var24 * class139.method876(65280, var28) + var27 * class139.method876(65280, var25)) + class139.method876(-16711936, class139.method876(16711935, var25) * var27 + var24 * class139.method876(var28, 16711935)) >> 8;
                }
            }
            for (int var23 = 0; var23 < var21; var23++) {
                class223.field4180.field445[var7++] = class200.field3652.field445[var6++];
            }
            var6 += class200.field3652.field448 - 128;
            var8++;
        }
        int var9 = 0;
        class223.field4180.method172(0, 9);
        int var10 = 0;
        int var11 = class200.field3652.field448 * 9 + 128;
        for (int var12 = 1; var12 < var4 - 1; var12++) {
            int var13 = (var4 - var12) * class73.field1455[var12] / var4 + 22;
            if (var13 < 0) {
                var13 = 0;
            }
            for (int var14 = 0; var14 < var13; var14++) {
                int var10001 = var9++;
                var11--;
                class37.field796.field445[var10001] = class200.field3652.field445[var11];
            }
            for (int var15 = var13; var15 < 128; var15++) {
                int var16 = class157.field3016[var10++];
                var11--;
                int var17 = class200.field3652.field445[var11];
                if (var16 == 0) {
                    class37.field796.field445[var9++] = var17;
                } else {
                    int var19 = 256 - var16;
                    int var20 = class114.field2158[var16];
                    class37.field796.field445[var9++] = class139.method876(class139.method876(var17, 65280) * var19 + class139.method876(var20, 65280) * var16, 16711680) + class139.method876(class139.method876(var20, 16711935) * var16 + var19 * class139.method876(16711935, var17), -16711936) >> 8;
                }
            }
            var11 += class200.field3652.field448 + 128;
            var10 += var13;
        }
        class37.field796.method172(637, 9);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)Z")
    public final boolean method609(int arg0, int arg1) {
        int var3 = 51 % ((-arg1 - 52) / 36);
        field1811++;
        return this.field1801[arg0].field3862;
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V")
    public static final void method610(int arg0) {
        if (arg0 != 11637) {
            return;
        }
        field1815++;
        class192.field3531.method460(382);
        for (int var1 = 0; var1 < 32; var1++) {
            class75.field1477[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class112.field2115[var2] = 0L;
        }
        class159.field3025 = 0;
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
    public static final void method611(int arg0) {
        class116.field2219.method596(false);
        if (arg0 > -4) {
            method612((byte) -109);
        }
        field1803++;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
    public static void method612(byte arg0) {
        field1800 = null;
        field1810 = null;
        field1820 = null;
        field1813 = null;
        field1808 = null;
        field1807 = null;
        field1812 = null;
        field1816 = null;
        field1806 = null;
        field1814 = null;
        field1819 = null;
        field1805 = null;
        field1809 = null;
        field1817 = null;
        field1804 = null;
        int var1 = 127 / ((-arg0 - 83) / 32);
        field1821 = null;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lab;Lab;IZ)V")
    public class97(class3 arg0, class3 arg1, int arg2, boolean arg3) {
        class28 var5 = new class28();
        int var6 = arg0.method38(5, arg2);
        this.field1801 = new class207[var6];
        int[] var7 = arg0.method26(arg2, 0);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method33(-29616, arg2, var7[var8]);
            int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            class229 var11 = null;
            for (class229 var12 = (class229) var5.method236(0); var12 != null; var12 = (class229) var5.method237(true)) {
                if (var12.field4306 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method43(1, var10, 0);
                } else {
                    var13 = arg1.method43(1, 0, var10);
                }
                var11 = new class229(var10, var13);
                var5.method235(var11, true);
            }
            this.field1801[var7[var8]] = new class207(var9, var11);
        }
    }
}
