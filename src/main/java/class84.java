import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class84 {

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lhb;")
    public static class44 field2132 = class102.method810("@whi@ )4 ", -28606);

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Lhb;")
    public static class44 field2138 = class102.method810("Anmelde)2Limit -Uberschritten)3", -28606);

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lhb;")
    private static class44 field2131 = class102.method810("and choose the (Wcreate account(W", -28606);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static volatile int field2130 = 0;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "[I")
    public static int[] field2149 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Lhb;")
    private static class44 field2135 = class102.method810("Add ignore", -28606);

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Lhb;")
    public static class44 field2152 = field2135;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lhb;")
    private static class44 field2134 = class102.method810("red:", -28606);

    @OriginalMember(owner = "client!o", name = "z", descriptor = "Lhb;")
    public static class44 field2155 = class102.method810("Suche nach Updates )2 ", -28606);

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Lhb;")
    public static class44 field2145 = field2134;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field2142 = 1;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "Lhb;")
    public static class44 field2151 = field2131;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field2146 = 0;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "Z")
    public static boolean field2157 = false;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "Lne;")
    public static class83 field2143;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "[I")
    public static int[] field2133;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "[I")
    public static int[] field2148;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "[I")
    public static int[] field2154;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "[Lhc;")
    public static class45[] field2144;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "[[B")
    public static byte[][] field2140;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "[[B")
    public static byte[][] field2147;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 4)
    public static void method684(int arg0) {
        field2134 = null;
        field2155 = null;
        field2135 = null;
        field2147 = null;
        field2138 = null;
        field2148 = null;
        field2149 = null;
        field2151 = null;
        field2132 = null;
        field2131 = null;
        int var1 = 111 % ((-arg0 - 80) / 41);
        field2143 = null;
        field2140 = null;
        field2152 = null;
        field2144 = null;
        field2154 = null;
        field2145 = null;
        field2133 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZBILtd;Ltd;)Lud;", line = 44)
    public static final class121 method685(boolean arg0, byte arg1, int arg2, class116 arg3, class116 arg4) {
        int var5 = 94 / ((arg1 + 60) / 52);
        boolean var6 = true;
        field2141++;
        int[] var7 = arg3.method874(-413, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg3.method879(var7[var8], false, arg2);
            if (var9 == null) {
                var6 = false;
            } else {
                int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
                byte[] var11;
                if (arg0) {
                    var11 = arg4.method879(var10, false, 0);
                } else {
                    var11 = arg4.method879(0, false, var10);
                }
                if (var11 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class121(arg3, arg4, arg2, arg0);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lee;Lee;B)V", line = 97)
    public static final void method686(class30 arg0, class30 arg1, byte arg2) {
        field2139++;
        class71.field1748.method747(17);
        if (class69.field1709 == 0 || class69.field1709 == 5) {
            byte var3 = 20;
            int var4 = 82 - var3;
            arg0.method294(client.field371, 180, 74 - var3, 16777215);
            class112.method862(28, var4, 304, 34, 9179409);
            class112.method862(29, var4 + 1, 302, 32, 0);
            class112.method856(30, var4 + 2, class121.field2950 * 3, 30, 9179409);
            class112.method856(class121.field2950 * 3 + 30, var4 - -2, 300 - class121.field2950 * 3, 30, 0);
            arg0.method294(class89.field2288, 180, 105 - var3, 16777215);
        }
        if (class69.field1709 == 20) {
            class16.field308.method680(0, 0);
            byte var5 = 40;
            arg0.method289(class89.field2284, 180, var5, 16776960, true);
            int var19 = var5 + 15;
            arg0.method289(class89.field2290, 180, var19, 16776960, true);
            int var20 = var19 + 15;
            arg0.method289(class89.field2292, 180, var20, 16776960, true);
            int var21 = var20 + 15;
            int var22 = var21 + 10;
            arg0.method295(class117.method903(new class44[] { class28.field667, class89.field2282 }, false), 90, var22, 16777215, true);
            int var24 = var22 + 15;
            arg0.method295(class117.method903(new class44[] { class42.field957, class89.field2285.method401(-115) }, false), 92, var24, 16777215, true);
            int var25 = var24 + 15;
        }
        if (class69.field1709 == 10) {
            class16.field308.method680(0, 0);
            if (class75.field1915 == 0) {
                byte var6 = 80;
                byte var7 = 120;
                byte var8 = 100;
                arg0.method289(class9.field188, 180, var6, 16776960, true);
                int var23 = var6 + 30;
                field2143.method680(var8 - 73, var7 + -20);
                arg0.method287(class121.field2951, var8 - 73, var7 + -20, 144, 40, 16777215, true, 1, 1, 0);
                short var9 = 260;
                field2143.method680(var9 - 73, var7 - 20);
                arg0.method287(class41.field921, var9 - 73, var7 + -20, 144, 40, 16777215, true, 1, 1, 0);
            } else if (class75.field1915 == 2) {
                byte var10 = 40;
                byte var11 = 100;
                arg0.method289(class89.field2284, 180, var10, 16776960, true);
                short var12 = 150;
                int var26 = var10 + 15;
                arg0.method289(class89.field2290, 180, var26, 16776960, true);
                int var27 = var26 + 15;
                arg0.method289(class89.field2292, 180, var27, 16776960, true);
                int var28 = var27 + 15;
                int var29 = var28 + 10;
                arg0.method295(class117.method903(new class44[] { class28.field667, class89.field2282, class2.field73 % 40 < 20 & class2.field81 == 0 ? class116.field2840 : class89.field2286 }, false), 90, var29, 16777215, true);
                int var30 = var29 + 15;
                arg0.method295(class117.method903(new class44[] { class42.field957, class89.field2285.method401(arg2 ^ 0x37), class2.field81 == 1 & class2.field73 % 40 < 20 ? class116.field2840 : class89.field2286 }, false), 92, var30, 16777215, true);
                int var31 = var30 + 15;
                field2143.method680(var11 - 73, var12 - 20);
                arg0.method289(class111.field2764, var11, var12 + 5, 16777215, true);
                short var13 = 260;
                field2143.method680(var13 - 73, var12 + -20);
                arg0.method289(class66.field1648, var13, var12 + 5, 16777215, true);
            } else if (class75.field1915 == 3) {
                arg0.method289(class19.field405, 180, 40, 16776960, true);
                byte var14 = 65;
                short var15 = 150;
                short var16 = 180;
                arg0.method289(class125.field3023, 180, var14, 16777215, true);
                int var32 = var14 + 15;
                arg0.method289(class1.field3, 180, var32, 16777215, true);
                int var33 = var32 + 15;
                arg0.method289(field2151, 180, var33, 16777215, true);
                int var34 = var33 + 15;
                arg0.method289(class5.field126, 180, var34, 16777215, true);
                int var35 = var34 + 15;
                field2143.method680(var16 - 73, var15 + -20);
                arg0.method289(class66.field1648, var16, var15 + 5, 16777215, true);
            }
        }
        class1.method8(16711680);
        if (arg2 != -75) {
            method687(null, 41, -58, null);
        }
        try {
            Graphics var17 = class22.field483.getGraphics();
            class71.field1748.method143(202, var17, -10166, 171);
            class11.field204.method143(0, var17, -10166, 0);
            class47.field1158.method143(637, var17, -10166, 0);
            if (class104.field2665) {
                class104.field2665 = false;
                class131.field3130.method143(128, var17, -10166, 0);
                class85.field2172.method143(202, var17, -10166, 371);
                class41.field932.method143(0, var17, -10166, 265);
                class44.field1125.method143(562, var17, -10166, 265);
                class47.field1173.method143(128, var17, -10166, 171);
                class53.field1322.method143(562, var17, arg2 - 10091, 171);
            }
        } catch (Exception var18) {
            class22.field483.repaint();
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljb;IILwd;)V", line = 246)
    public static final void method687(class56 arg0, int arg1, int arg2, class131 arg3) {
        field2153++;
        class53 var4 = new class53();
        if (arg2 != -1) {
            method684(33);
        }
        var4.field1312 = arg3.method971(true);
        var4.field1302 = arg3.method994((byte) 36);
        var4.field1319 = new byte[var4.field1312][][];
        var4.field1314 = new int[var4.field1312];
        var4.field1318 = new int[var4.field1312];
        var4.field1305 = new class123[var4.field1312];
        var4.field1317 = new class123[var4.field1312];
        var4.field1316 = new int[var4.field1312];
        for (int var5 = 0; var5 < var4.field1312; var5++) {
            try {
                int var6 = arg3.method971(true);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg3.method976(-124).method393(false));
                    String var18 = new String(arg3.method976(-127).method393(false));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method994((byte) 36);
                    }
                    var4.field1314[var5] = var6;
                    var4.field1316[var5] = var19;
                    var4.field1305[var5] = arg0.method516(class131.method1006((byte) -128, var17), var18, (byte) 120);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg3.method976(-123).method393(false));
                    String var8 = new String(arg3.method976(arg2 ^ 0x7D).method393(false));
                    int var9 = arg3.method971(true);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg3.method976(arg2 - 127).method393(false));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method994((byte) 36);
                            var12[var13] = new byte[var14];
                            arg3.method970(var14, true, 0, var12[var13]);
                        }
                    }
                    var4.field1314[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class131.method1006((byte) -127, var10[var16]);
                    }
                    var4.field1317[var5] = arg0.method517(class131.method1006((byte) -128, var7), var8, var15, (byte) 48);
                    var4.field1319[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1318[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1318[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1318[var5] = -3;
            } catch (Exception var23) {
                var4.field1318[var5] = -4;
            } catch (Throwable var24) {
                var4.field1318[var5] = -5;
            }
        }
        class2.field47.method448(var4, true);
    }
}
