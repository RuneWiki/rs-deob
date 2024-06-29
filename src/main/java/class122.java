import java.awt.Canvas;
import java.awt.Container;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class122 {

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Z")
    public static boolean field1929 = false;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field1932 = 0;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field1937 = -1;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public int field1923;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public int field1935;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public int field1941;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "J")
    public long field1933;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "Lfg;")
    public static class13 field1939;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lie;")
    public class34 field1930;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Loc;")
    public static class63 field1921;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1926;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "[I")
    public static int[] field1938;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZZ)V")
    public static final void method835(boolean arg0, boolean arg1) {
        field1931++;
        if (!arg0 && class8.field182 != arg1) {
            class8.field182 = arg1;
            class117.method802((byte) 66);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)V")
    public static final void method836(int arg0, byte arg1) {
        class153.field2445.method1880(arg1 - 187, arg0);
        if (arg1 == 90) {
            field1920++;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(IB)Z")
    public static final boolean method837(int arg0, byte arg1) {
        field1942++;
        byte var2 = 0;
        byte var3 = 0;
        if (class40.field614 == null) {
            if (class208.field3321 == null) {
                class40.field614 = new class67(512, 512);
            } else {
                class40.field614 = (class67) class208.field3321;
            }
            int[] var4 = class40.field614.field1082;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var2 + 1; var7 < 104 - var2 - 1; var7++) {
                int var23 = (var2 + 103 - var7) * 512 * 4 + 24628;
                for (int var24 = var3 + 1; var24 < 104 - var3 - 1; var24++) {
                    if ((class214.field3386[arg0][var24][var7] & 0x18) == 0) {
                        class211.method1454(var4, var23, 512, arg0, var24, var7);
                    }
                    if (arg0 < 3 && (class214.field3386[arg0 + 1][var24][var7] & 0x8) != 0) {
                        class211.method1454(var4, var23, 512, arg0 + 1, var24, var7);
                    }
                    var23 += 4;
                }
            }
            class97.field1523 = 0;
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var9 = 0; var9 < 104; var9++) {
                    long var10 = class275.method1874(arg0, var3 + var8, var2 + var9);
                    if (var10 == 0L) {
                        var10 = class195.method1361(arg0, var8 + var3, var2 + var9);
                    }
                    if (var10 == 0L) {
                        var10 = class180.method1266(arg0, var8 + var3, var2 + var9);
                    }
                    if (var10 == 0L) {
                        var10 = class183.method1293(arg0, var3 + var8, var2 + var9);
                    }
                    if (var10 != 0L) {
                        class172 var12 = class49.method319((int) (var10 >>> 32) & Integer.MAX_VALUE, 0);
                        if (!var12.field2871 || class213.field3383) {
                            int var13 = var12.field2866;
                            if (var12.field2846 != null) {
                                for (int var14 = 0; var14 < var12.field2846.length; var14++) {
                                    if (var12.field2846[var14] != -1) {
                                        class172 var15 = class49.method319(var12.field2846[var14], 0);
                                        if (var15.field2866 >= 0) {
                                            var13 = var15.field2866;
                                        }
                                    }
                                }
                            }
                            if (var13 >= 0) {
                                boolean var16 = false;
                                class125 var17 = class223.method1550((byte) 86, var13);
                                if (var17 != null && var17.field1979) {
                                    var16 = true;
                                }
                                int var18 = var2 + var9;
                                int var19 = var3 + var8;
                                if (var16) {
                                    int[][] var20 = class310.field5021[arg0].field811;
                                    for (int var21 = 0; var21 < 10; var21++) {
                                        int var22 = (int) (Math.random() * 4.0D);
                                        if (var22 == 0 && var19 > 0 && (var8 - 3) < var19 && (var20[var19 - 1][var18] & 0x2C0108) == 0) {
                                            var19--;
                                        }
                                        if (var22 == 1 && var19 < 103 && var19 < (var8 + 3) && (var20[var19 + 1][var18] & 0x2C0180) == 0) {
                                            var19++;
                                        }
                                        if (var22 == 2 && var18 > 0 && var9 - 3 < var18 && (var20[var19][var18 - 1] & 0x2C0102) == 0) {
                                            var18--;
                                        }
                                        if (var22 == 3 && var18 < 103 && (var9 + 3) > var18 && (var20[var19][var18 + 1] & 0x2C0120) == 0) {
                                            var18++;
                                        }
                                    }
                                }
                                class229.field3596[class97.field1523] = var12.field2843;
                                class291.field4766[class97.field1523] = var19 - var3;
                                class240.field3756[class97.field1523] = var18 - var2;
                                class97.field1523++;
                            }
                        }
                    }
                }
            }
        }
        int var25 = ((((int) (Math.random() * 20.0D)) + 238) - 10 << 16) + ((((int) (Math.random() * 20.0D)) + 238) - 10 << 8) + (int) (Math.random() * 20.0D) + 228;
        int var26 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        class40.field614.method457();
        for (int var27 = 1; var27 < 103; var27++) {
            for (int var28 = 1; var28 < 103; var28++) {
                if ((class214.field3386[arg0][var3 + var28][var27 + var2] & 0x18) == 0 && !class18.method145(var25, var28, 100, var2, var26, var3, var27, arg0)) {
                    class296.field4829.method1034((byte) -82);
                    return false;
                }
                if (arg0 < 3 && (class214.field3386[arg0 + 1][var3 + var28][var2 + var27] & 0x8) != 0 && !class18.method145(var25, var28, -73, var2, var26, var3, var27, arg0 + 1)) {
                    class296.field4829.method1034((byte) -120);
                    return false;
                }
            }
        }
        class208.field3321 = class40.field614;
        class296.field4829.method1034((byte) -118);
        if (arg1 <= 27) {
            return false;
        } else {
            class40.field614 = null;
            return true;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
    public static final void method838(int arg0, int arg1) {
        class192.field3135.method1873(-7401);
        field1925++;
        if (arg1 != 0) {
            field1940 = 116;
        }
        class192.field3135 = new class275(arg0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIII)V")
    public static final void method839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg5; var6 <= arg3; var6++) {
            class309.method2096(arg4, arg2, (byte) -117, class232.field3629[var6], arg1);
        }
        if (arg0 != 4) {
            method843((byte) 8, (class164) null);
        }
        field1936++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static final void method840(int arg0) {
        field1922++;
        if (class112.field1719 == 0) {
            return;
        }
        try {
            if (++class72.field1150 > 2000) {
                if (class18.field322 != null) {
                    class18.field322.method416(64);
                    class18.field322 = null;
                }
                if (class31.field530 >= 1) {
                    class24.field444 = -5;
                    class112.field1719 = 0;
                    return;
                }
                class112.field1719 = 1;
                if (class290.field4739 == class221.field3480) {
                    class221.field3480 = class274.field4460;
                } else {
                    class221.field3480 = class290.field4739;
                }
                class31.field530++;
                class72.field1150 = 0;
            }
            if (class112.field1719 == 1) {
                class202.field3275 = class44.field659.method471(22874, class4.field103, class221.field3480);
                class112.field1719 = 2;
            }
            if (arg0 != -21498) {
                field1938 = null;
            }
            if (class112.field1719 == 2) {
                if (class202.field3275.field4929 == 2) {
                    throw new IOException();
                }
                if (class202.field3275.field4929 != 1) {
                    return;
                }
                class18.field322 = new class63((Socket) class202.field3275.field4930, class44.field659);
                class202.field3275 = null;
                class18.field322.method410(0, class311.field5027.field4441, class311.field5027.field4458, (byte) 120);
                if (field1939 != null) {
                    field1939.method113(0);
                }
                if (class80.field1296 != null) {
                    class80.field1296.method113(arg0 ^ 0xFFFFAC06);
                }
                int var1 = class18.field322.method415(115);
                if (field1939 != null) {
                    field1939.method113(0);
                }
                if (class80.field1296 != null) {
                    class80.field1296.method113(0);
                }
                if (var1 != 21) {
                    class112.field1719 = 0;
                    class24.field444 = var1;
                    class18.field322.method416(64);
                    class18.field322 = null;
                    return;
                }
                class112.field1719 = 3;
            }
            if (class112.field1719 == 3) {
                if (class18.field322.method419((byte) -110) < 1) {
                    return;
                }
                class80.field1288 = new String[class18.field322.method415(41)];
                class112.field1719 = 4;
            }
            if (class112.field1719 == 4 && class18.field322.method419((byte) -107) >= (class80.field1288.length * 8)) {
                class229.field3584.field4458 = 0;
                class18.field322.method413(class80.field1288.length * 8, class229.field3584.field4441, arg0 + 21458, 0);
                for (int var2 = 0; var2 < class80.field1288.length; var2++) {
                    class80.field1288[var2] = class177.method1247(-16702, class229.field3584.method1834(3));
                }
                class24.field444 = 21;
                class112.field1719 = 0;
                class18.field322.method416(64);
                class18.field322 = null;
            }
        } catch (IOException var3) {
            if (class18.field322 != null) {
                class18.field322.method416(64);
                class18.field322 = null;
            }
            if (class31.field530 < 1) {
                class31.field530++;
                if (class290.field4739 == class221.field3480) {
                    class221.field3480 = class274.field4460;
                } else {
                    class221.field3480 = class290.field4739;
                }
                class72.field1150 = 0;
                class112.field1719 = 1;
            } else {
                class24.field444 = -4;
                class112.field1719 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method841(int arg0, String arg1) {
        if (arg0 == 5262) {
            field1943++;
            return class233.method1608((byte) -73, arg1, true, 10);
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static final void method842(byte arg0) {
        if (arg0 < 13) {
            method841(-6, (String) null);
        }
        field1934++;
        Container var1;
        if (class200.field3207 != null) {
            var1 = class200.field3207;
        } else if (class53.field776 == null) {
            var1 = class44.field659.field1105;
        } else {
            var1 = class53.field776;
        }
        class74.field1185 = var1.getSize().width;
        class132.field2124 = var1.getSize().height;
        if (class53.field776 == var1) {
            Insets var2 = class53.field776.getInsets();
            class132.field2124 -= var2.top + var2.bottom;
            class74.field1185 -= var2.right + var2.left;
        }
        if (class28.method215(15174) < 2) {
            class60.field869 = 0;
            class108.field1681 = (class74.field1185 - 765) / 2;
            class154.field2463 = 765;
            class195.field3161 = 503;
        } else {
            class60.field869 = 0;
            class108.field1681 = 0;
            class154.field2463 = class74.field1185;
            class195.field3161 = class132.field2124;
        }
        field1926.setSize(class154.field2463, class195.field3161);
        if (class53.field776 == var1) {
            Insets var3 = class53.field776.getInsets();
            field1926.setLocation(class108.field1681 + var3.left, var3.top - -class60.field869);
        } else {
            field1926.setLocation(class108.field1681, class60.field869);
        }
        if (class68.field1089 != -1) {
            class291.method2011(true, -30310);
        }
        class286.method1945((byte) -51);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLgi;)V")
    public static final void method843(byte arg0, class164 arg1) {
        field1924++;
        class61.field889 = arg1;
        if (arg0 != 111) {
            field1939 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public static void method844(byte arg0) {
        field1938 = null;
        if (arg0 != -6) {
            field1926 = null;
        }
        field1921 = null;
        field1926 = null;
        field1939 = null;
    }
}
