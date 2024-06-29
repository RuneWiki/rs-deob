import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class423 extends class362 {

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "J")
    public long field6099;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "Lej;")
    public static class124 field6101 = new class124(32, 4);

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "Lej;")
    public static class124 field6103 = new class124(75, 3);

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public static int field6102;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ij", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field6104;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)Z")
    public static final boolean method2591(byte arg0) {
        field6102++;
        try {
            class286 var1 = new class286();
            byte[] var2 = var1.method1870(9, class167.field2607);
            int var3 = 19 % ((19 - arg0) / 43);
            class533.method3071(var2, -5901);
            return true;
        } catch (Exception var4) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class423() {
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
    public static void method2592(byte arg0) {
        field6103 = null;
        int var1 = -14 % ((arg0 - 72) / 32);
        field6101 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI)I")
    public static final int method2593(boolean arg0, int arg1) {
        field6097++;
        if (arg0) {
            method2594(-36, 35, (byte) -71, -71);
        }
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(J)V")
    public class423(long arg0) {
        this.field6099 = arg0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIBI)Lwm;")
    public static final class564 method2594(int arg0, int arg1, byte arg2, int arg3) {
        field6098++;
        class564 var4 = null;
        if (arg3 == 0) {
            var4 = class227.method1594(class463.field6509, class72.field1320, -100);
            class410.field5965++;
        }
        if (arg3 == 1) {
            var4 = class227.method1594(class173.field2686, class72.field1320, -93);
            class562.field7756++;
        }
        var4.field7778.method1501(class367.field5236 + arg0, (byte) 3);
        var4.field7778.method1543((byte) 78, class117.field1992.method1346(82, -124) ? 1 : 0);
        var4.field7778.method1483(-124, class221.field3177 + arg1);
        class295.field4138 = arg1;
        if (arg2 >= -88) {
            field6101 = null;
        }
        class136.field2279 = arg0;
        class6.field46 = false;
        class105.method957(false);
        return var4;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILha;Z)Z")
    public static final boolean method2595(int arg0, class59 arg1, boolean arg2) {
        field6100++;
        int var3 = (class376.field5325 - 104) / 2;
        int var4 = (class175.field2711 - 104) / 2;
        boolean var5 = arg2;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var57 = var4; var57 < var4 + 104; var57++) {
                for (int var58 = arg0; var58 <= 3; var58++) {
                    if (class273.method1804(var57, false, var6, arg0, var58)) {
                        int var59 = var58;
                        if (class334.method2118(var57, var6, true)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class310.method2021(var59, var6, var57, (byte) 75);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class746.field10334 = arg1.method621(512, var7, (byte) 94, 0, 512, 512);
        class493.method2903(-3);
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) - (-((int) (Math.random() * 20.0D)) + -228) | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D)) + 228 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
        boolean[][] var12 = new boolean[class274.field3854 + 3][class274.field3854 + 1 + 2];
        for (int var13 = var3; var13 < (var3 + 104); var13 += class274.field3854) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class274.field3854) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var39 = var13 - 1;
                    var37 += 4;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = class274.field3854 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = var36 + class274.field3854;
                if (var42 < 104) {
                    var42++;
                    var38 += 4;
                }
                arg1.method303(0, 0, class274.field3854 * 4 + var37, class274.field3854 * 4 + var38);
                arg1.method220(-16777216);
                for (int var43 = arg0; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class274.field3854; var50++) {
                        for (int var56 = 0; var56 <= class274.field3854; var56++) {
                            var12[var50][var56] = class273.method1804(var40 + var56, false, var39 + var50, arg0, var43);
                        }
                    }
                    class465.field6517[var43].method1162(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class278.field3920) {
                        for (int var51 = -4; var51 < class274.field3854; var51++) {
                            for (int var52 = -4; var52 < class274.field3854; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var53 >= var3 && var4 <= var54 && class273.method1804(var54, false, var53, arg0, var43)) {
                                    int var55 = var43;
                                    if (class334.method2118(var54, var53, true)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class432.method2629(var10, (class274.field3854 - var52) * 4 + var38 - 4, false, var55, var54, var53, arg1, var51 * 4 + var37, var9);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class278.field3920) {
                    class570 var44 = class19.field295[arg0];
                    for (int var45 = 0; var45 < class274.field3854; var45++) {
                        for (int var46 = 0; var46 < class274.field3854; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field7832[var47 - var44.field7847][var48 - var44.field7835];
                            if ((var49 & 0x40240000) != 0) {
                                arg1.method624(4, (byte) -125, var45 * 4 + var37, (-var46 + class274.field3854) * 4 + -4 + var38, 4, -1713569622);
                            } else if ((var49 & 0x800000) != 0) {
                                arg1.method617((byte) -113, 4, (class274.field3854 - var46) * 4 + var38 - 4, -1713569622, var45 * 4 + var37);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg1.method620(var37 + (var45 * 4) + 3, -1713569622, 4, (class274.field3854 - var46) * 4 + var38 - 4, true);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg1.method617((byte) -126, 4, (class274.field3854 - var46) * 4 + var38 + 3 - 4, -1713569622, var45 * 4 + var37);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg1.method620(var45 * 4 + var37, -1713569622, 4, (class274.field3854 - var46) * 4 + (var38 - 4), arg2);
                            }
                        }
                    }
                }
                arg1.method217(var37, var38, class274.field3854 * 4, class274.field3854 * 4, var11, 2);
                class746.field10334.method1193((var13 - var3) * 4 + 48, -((var36 - var4) * 4) + 464 + -(class274.field3854 * 4), class274.field3854 * 4, class274.field3854 * 4, var37, var38);
            }
        }
        arg1.method305();
        arg1.method220(-16777215);
        class299.method1955(-86);
        class556.field7684 = 0;
        class121.field2065.method1270(116);
        if (!class278.field3920) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg0; var21 <= arg0 + 1 && var21 <= 3; var21++) {
                        if (class273.method1804(var20, !arg2, var14, arg0, var21)) {
                            class258 var22 = (class258) class12.method112(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class258) class562.method3228(var21, var14, var20, field6104 == null ? (field6104 = method2596("se")) : field6104);
                            }
                            if (var22 == null) {
                                var22 = (class258) class28.method398(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class258) class466.method2743(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class99 var23 = class76.field1366.method1680(0, var22.method589(-99));
                                if (!var23.field1777 || class491.field6806) {
                                    int var24 = var23.field1756;
                                    if (var23.field1780 != null) {
                                        for (int var25 = 0; var25 < var23.field1780.length; var25++) {
                                            if (var23.field1780[var25] != -1) {
                                                class99 var26 = class76.field1366.method1680(0, var23.field1780[var25]);
                                                if (var26.field1756 >= 0) {
                                                    var24 = var26.field1756;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class553 var28 = class72.field1322.method2136(var24, (byte) 126);
                                            if (var28 != null && var28.field7644) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class19.field295[var21].field7832;
                                            int var32 = class19.field295[var21].field7847;
                                            int var33 = class19.field295[var21].field7835;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && var14 - 3 < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && (var3 + 104 - 1) > var29 && var14 + 3 > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > var20 - 3 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < (var4 + 104 - 1) && var20 + 3 > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class245.field3541[class556.field7684] = var23.field1776;
                                        class7.field49[class556.field7684] = var29;
                                        class527.field7291[class556.field7684] = var30;
                                        class556.field7684++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class28.field753 != null) {
                class471.field6600.field1592 = 1;
                class72.field1322.method2131((byte) 116, 64, 1024);
                for (int var15 = 0; var15 < class28.field753.field4884; var15++) {
                    int var16 = class28.field753.field4881[var15];
                    if (var16 >> 28 == class58.field1147.field5926) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class221.field3177;
                        int var18 = (var16 & 0x3FFF) - class367.field5236;
                        if (var17 >= 0 && var17 < class376.field5325 && var18 >= 0 && var18 < class175.field2711) {
                            class121.field2065.method1273(new class113(var15), -20180);
                        } else {
                            class553 var19 = class72.field1322.method2136(class28.field753.field4882[var15], (byte) 120);
                            if (var19.field7636 != null && var19.field7640 + var17 >= 0 && (var19.field7648 + var17) < class376.field5325 && (var19.field7615 + var18) >= 0 && class175.field2711 > var18 + var19.field7652) {
                                class121.field2065.method1273(new class113(var15), -20180);
                            }
                        }
                    }
                }
                class72.field1322.method2131((byte) 13, 64, 128);
                class471.field6600.field1592 = 2;
                class471.field6600.method865((byte) -126);
            }
        }
        return true;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2596(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
