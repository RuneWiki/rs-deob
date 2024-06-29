import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class132 extends class46 {

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "Ljava/lang/String;")
    public static String field2082 = "wave:";

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "[J")
    public static long[] field2086 = new long[32];

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public int field2062;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public int field2063;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public int field2066;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public int field2067;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public int field2068;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    public int field2069;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public int field2071;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public int field2072;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
    public int field2073;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
    public int field2075;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "I")
    public int field2076;

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!rk", name = "G", descriptor = "I")
    public int field2079;

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
    public int field2081;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
    public int field2084;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
    public int field2088;

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
    public int field2089;

    @OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
    public int field2092;

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "Ll;")
    public static class133 field2090;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "Lfk;")
    public class156 field2064;

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "Ltb;")
    public static class220 field2083;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "Lcm;")
    public class291 field2074;

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "Lak;")
    public class330 field2091;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "Ljf;")
    public class340 field2087;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V", line = 12)
    public final void method942(byte arg0) {
        this.field2074 = null;
        field2065++;
        this.field2091 = null;
        if (arg0 >= 61) {
            this.field2064 = null;
            this.field2087 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V", line = 32)
    public static void method943(byte arg0) {
        field2086 = null;
        field2090 = null;
        field2083 = null;
        field2082 = null;
        int var1 = 94 % ((arg0 - 55) / 41);
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)V", line = 45)
    public static final void method944(byte arg0) {
        field2080++;
        class272.method1873(384, 5);
        class131.method940((byte) -70, 5);
        class134.method983(5, 0);
        class187.method1337(5, true);
        class73.method545(5, 127);
        class275.method1886(5, arg0 + 103);
        class34.method287(5, true);
        class304.method2073(5, -1);
        class174.method1251(5, (byte) 53);
        class134.method986(1930950248, 5);
        class129.method934(5, 104);
        class158.method1077(74, 5);
        class174.method1250(7, 5);
        class81.method584(2048, 5);
        if (arg0 != -8) {
            return;
        }
        class130.method937((byte) -116, 5);
        class125.method903(-39, 5);
        class298.method2020(-11288, 5);
        class216.method1529(11212, 50);
        class225.method1590(arg0 ^ 0x6463B410, 5);
        class282.method1930((byte) -110, 5);
        class278.field4288.method2175(5, -1401253017);
        class338.field5280.method2175(5, -1401253017);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)Lbh;", line = 81)
    public static final class200 method945(int arg0, byte arg1) {
        field2078++;
        if (arg1 >= -101) {
            method945(62, (byte) 3);
        }
        class200 var2 = (class200) class227.field3596.method2179(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class35.field546.method980(3, arg0, 5);
        class200 var4 = new class200();
        if (var3 != null) {
            var4.method1425((byte) -123, new class166(var3));
        }
        class227.field3596.method2173(var4, true, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 115)
    public static final void method946(int arg0, Component arg1) {
        arg1.removeKeyListener(class141.field2180);
        arg1.removeFocusListener(class141.field2180);
        if (arg0 != 65280) {
            field2083 = (class220) null;
        }
        field2070++;
        class279.field4303 = -1;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIB)I", line = 133)
    public static final int method947(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2085++;
        if (class325.field5056) {
            arg1 = 1000000;
            class325.field5056 = false;
        }
        class51 var5 = class98.field1568[arg3][arg2];
        int var6 = var5.field839;
        float var7 = var5.field837;
        int var8 = 100 % ((-arg4 - 30) / 62);
        float var9 = var5.field835;
        float var10 = ((float) arg0 * 0.1F + 0.7F) * var5.field832;
        int var11 = var5.field838;
        int var12 = var5.field821;
        if (!class152.field2291) {
            var12 = 0;
        }
        class319 var13 = var5.field819;
        float var14 = var5.field823;
        float var15 = var5.field824;
        float var16 = var5.field822;
        if (class123.field1865 != var6 || class121.field1842 != var10 || class344.field5345 != var9 || class153.field2298 != var7 || class46.field762 != var11 || class203.field3049 != var12 || class217.field3310 != var13 || class321.field5018 != var15 || class202.field3038 != var16 || class53.field897 != var14) {
            class169.field2563 = class237.field3777;
            class162.field2434 = class213.field3252;
            class224.field3567 = class177.field2677;
            class118.field1814 = class11.field175;
            class120.field1834 = class242.field3875;
            class213.field3253 = class217.field3302;
            class48.field782 = class48.field790;
            class99.field1571 = class282.field4349;
            class143.field2226 = class288.field4485;
            class95.field1524 = class176.field2665;
            if (class73.field1202 == null || class73.field1202 == class48.field782) {
                class73.field1202 = new class319();
            }
            class202.field3038 = var16;
            class203.field3049 = var12;
            class46.field762 = var11;
            class121.field1842 = var10;
            class321.field5018 = var15;
            class166.field2537 = 0;
            class123.field1865 = var6;
            class53.field897 = var14;
            class344.field5345 = var9;
            class217.field3310 = var13;
            class153.field2298 = var7;
        }
        if (class166.field2537 < 65536) {
            class166.field2537 += arg1 * 250;
            if (class166.field2537 < 65536) {
                int var17 = 65536 - class166.field2537 >> 8;
                int var18 = class166.field2537 >> 8;
                class282.field4349 = class99.field1571 * var17 + class203.field3049 * var18 >> 8;
                class177.field2677 = ((class224.field3567 & 0xFF00FF) * var17 + (class123.field1865 & 0xFF00FF) * var18 & 0xFF00FF00) + ((class224.field3567 & 0xFF00) * var17 + (class123.field1865 & 0xFF00) * var18 & 0xFF0000) >> 8;
                class217.field3302 = ((class46.field762 & 0xFF00FF) * var18 + (class213.field3253 & 0xFF00FF) * var17 & 0xFF00FF00) + ((class46.field762 & 0xFF00) * var18 + (class213.field3253 & 0xFF00) * var17 & 0xFF0000) >> 8;
                float var19 = (float) (65536 - class166.field2537) / 65536.0F;
                float var20 = (float) class166.field2537 / 65536.0F;
                class237.field3777 = class202.field3038 * var20 + class169.field2563 * var19;
                class213.field3252 = class344.field5345 * var20 + class162.field2434 * var19;
                class288.field4485 = class53.field897 * var20 + class143.field2226 * var19;
                class11.field175 = class153.field2298 * var20 + class118.field1814 * var19;
                class176.field2665 = class95.field1524 * var19 + class321.field5018 * var20;
                class242.field3875 = class121.field1842 * var20 + class120.field1834 * var19;
                if (class48.field782 != class217.field3310) {
                    if (class48.field782 == null || class217.field3310 == null) {
                        class48.field790 = null;
                    } else {
                        class48.field790 = class73.field1202.method2164(class48.field782, class217.field3310, (float) class166.field2537 / 65536.0F);
                    }
                }
            } else {
                class282.field4349 = class203.field3049;
                class288.field4485 = class53.field897;
                class177.field2677 = class123.field1865;
                class237.field3777 = class202.field3038;
                class166.field2537 = 65536;
                class217.field3302 = class46.field762;
                class176.field2665 = class321.field5018;
                class48.field782 = null;
                class213.field3252 = class344.field5345;
                class48.field790 = class217.field3310;
                class242.field3875 = class121.field1842;
                class11.field175 = class153.field2298;
            }
        }
        return class217.field3302;
    }
}
