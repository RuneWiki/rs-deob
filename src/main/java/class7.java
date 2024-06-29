import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class7 {

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Lpj;")
    public static class79 field110 = new class79(128);

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "[Ljava/awt/Color;")
    public static Color[] field117 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public int field108;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public int field109;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public int field113;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public int field114;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public int field116;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field118;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Ljava/lang/String;")
    public static String field115;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method53(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V", line = 5)
    public static void method51(byte arg0) {
        int var1 = -89 % ((arg0 - 12) / 56);
        field115 = null;
        field117 = null;
        field110 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILaa;)Z", line = 26)
    public static final boolean method52(int arg0, int arg1, class281 arg2) {
        field111++;
        int var3 = (class432.field6220 - 104) / 2;
        int var4 = (class267.field3646 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var51 = var4; var51 < (var4 + 104); var51++) {
                for (int var52 = arg1; var52 <= 3; var52++) {
                    if (class76.method542(arg1, var6, var52, (byte) -125, var51)) {
                        int var53 = var52;
                        if (class199.method1326(var51, var6, (byte) 74)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class190.method1259(var53, var51, var6, (byte) 105);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        if (arg0 != -3) {
            method52(-118, -56, (class281) null);
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class12.field154 = arg2.method1773(var7, 0, 512, 512, 512);
        class113.method747(true);
        int var9 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 + -10 << 16) + 238 - 10 | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class254.field3487][class254.field3487];
        for (int var13 = var3; var13 < var3 + 104; var13 += class254.field3487) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class254.field3487) {
                arg2.method1735(0, 0, class254.field3487 * 4, class254.field3487 * 4);
                arg2.method1794(-16777216);
                for (int var37 = arg1; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class254.field3487; var44++) {
                        for (int var50 = 0; var50 < class254.field3487; var50++) {
                            var12[var44][var50] = class76.method542(arg1, var13 + var44, var37, (byte) -117, var36 + var50);
                        }
                    }
                    class156.field2213[var37].method271(0, 0, 1024, var13, var36, class254.field3487 + var13, class254.field3487 + var36, var12);
                    if (!class166.field2369) {
                        for (int var45 = -4; var45 < class254.field3487; var45++) {
                            for (int var46 = -4; var46 < class254.field3487; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var47 >= var3 && var4 <= var48 && class76.method542(arg1, var47, var37, (byte) 13, var48)) {
                                    int var49 = var37;
                                    if (class199.method1326(var48, var47, (byte) 74)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class145.method1001(var9, var49, var10, (class254.field3487 - var46) * 4 - 4, var45 * 4, var48, (byte) -123, arg2, var47);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class166.field2369) {
                    class4 var38 = class24.field326[arg1];
                    for (int var39 = 0; var39 < class254.field3487; var39++) {
                        for (int var40 = 0; var40 < class254.field3487; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field53[var41 - var38.field62][var42 - var38.field55];
                            if ((var43 & 0x40240000) != 0) {
                                arg2.method1762((class254.field3487 - var40) * 4 - 4, 4, var39 * 4, -1713569622, 4, -1);
                            } else if ((var43 & 0x800000) != 0) {
                                arg2.method1739(-1713569622, arg0 ^ -4, (class254.field3487 - var40) * 4 - 4, var39 * 4, 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg2.method1820(1, var39 * 4 + 3, 4, (class254.field3487 - var40) * 4 - 4, -1713569622);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg2.method1739(-1713569622, 1, (class254.field3487 - var40) * 4 - 1, var39 * 4, 4);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg2.method1820(arg0 ^ 0xFFFFFFFC, var39 * 4, 4, (class254.field3487 - var40) * 4 - 4, -1713569622);
                            }
                        }
                    }
                }
                arg2.method1785(0, 0, class254.field3487 * 4, class254.field3487 * 4, var11, 2);
                class12.field154.method808((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + 464 + -(class254.field3487 * 4), class254.field3487 * 4, class254.field3487 * 4, 0, 0);
            }
        }
        arg2.method1812();
        arg2.method1794(-16777215);
        class210.method1362(17612);
        class321.field4411 = 0;
        class62.field977.method1315(124);
        if (!class166.field2369) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg1; var21 <= arg1 + 1 && var21 <= 3; var21++) {
                        if (class76.method542(arg1, var14, var21, (byte) 52, var20)) {
                            class161 var22 = (class161) class207.method1350(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class161) class32.method245(var21, var14, var20, field118 == null ? (field118 = method53("tr")) : field118);
                            }
                            if (var22 == null) {
                                var22 = (class161) class57.method381(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class161) class3.method13(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class369 var23 = class310.method1961(var22.method126(-13482), (byte) 35);
                                if (!var23.field5169 || class293.field4055) {
                                    int var24 = var23.field5225;
                                    if (var23.field5202 != null) {
                                        for (int var25 = 0; var25 < var23.field5202.length; var25++) {
                                            if (var23.field5202[var25] != -1) {
                                                class369 var26 = class310.method1961(var23.field5202[var25], (byte) 35);
                                                if (var26.field5225 >= 0) {
                                                    var24 = var26.field5225;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class46 var28 = class368.method2358(var24, 36);
                                            if (var28 != null && var28.field696) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class24.field326[var21].field53;
                                            int var32 = class24.field326[var21].field62;
                                            int var33 = class24.field326[var21].field55;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && var29 > (var14 - 3) && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < var3 + 104 - 1 && var14 + 3 > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && (var20 - 3) < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < var4 + 104 - 1 && var30 < var20 + 3 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class132.field1833[class321.field4411] = var23.field5204;
                                        class408.field5934[class321.field4411] = var29;
                                        class109.field1608[class321.field4411] = var30;
                                        class321.field4411++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class73.field1137 != null) {
                class287.field3989.field4113 = 1;
                class143.method975(0, 1024, 64);
                for (int var15 = 0; var15 < class73.field1137.field3449; var15++) {
                    int var16 = class73.field1137.field3443[var15];
                    if ((var16 >> 28) == class265.field3617) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class449.field6509;
                        int var18 = (var16 & 0x3FFF) - class354.field4981;
                        if (var17 >= 0 && class432.field6220 > var17 && var18 >= 0 && var18 < class267.field3646) {
                            class62.field977.method1301(50, new class23(var15));
                        } else {
                            class46 var19 = class368.method2358(class73.field1137.field3444[var15], 36);
                            if (var19.field698 != null && (var19.field697 + var17) >= 0 && class432.field6220 > var17 + var19.field719 && var19.field688 + var18 >= 0 && class267.field3646 > var18 + var19.field702) {
                                class62.field977.method1301(50, new class23(var15));
                            }
                        }
                    }
                }
                class143.method975(0, 128, 64);
                class287.field3989.field4113 = 2;
                class287.field3989.method1907(arg0 - 37);
            }
        }
        return true;
    }
}
