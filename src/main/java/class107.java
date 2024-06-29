import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class107 {

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Z")
    public static boolean field1563 = false;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1564 = "Loaded input handler";

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "[I")
    public static int[] field1562 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Ljava/awt/Image;")
    public static Image field1557;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method713(boolean arg0, String arg1, int arg2) {
        class138.field1995++;
        class150.field2218.method445(64, 7);
        field1560++;
        if (!arg0) {
            field1563 = false;
        }
        class150.field2218.method1161(arg2, 128);
        class150.field2218.method1219(-1501738464, class176.method1256((byte) 127, arg1));
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
    public static final void method714() {
        class283.field4597 = 0;
        label191: for (int var0 = 0; var0 < class24.field303; var0++) {
            class27 var1 = class179.field2824[var0];
            if (class17.field231 != null) {
                for (int var2 = 0; var2 < class17.field231.length; var2++) {
                    if (class17.field231[var2] != -1000000 && (var1.field315 <= class17.field231[var2] || var1.field312 <= class17.field231[var2]) && (var1.field332 <= class96.field1440[var2] || var1.field326 <= class96.field1440[var2]) && (var1.field332 >= class52.field756[var2] || var1.field326 >= class52.field756[var2]) && (var1.field321 <= class245.field3996[var2] || var1.field323 <= class245.field3996[var2]) && (var1.field321 >= class228.field3534[var2] || var1.field323 >= class228.field3534[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field316 == 1) {
                int var3 = var1.field334 + class303.field4815 - class32.field386;
                if (var3 >= 0 && var3 <= class303.field4815 + class303.field4815) {
                    int var4 = var1.field309 + class303.field4815 - class286.field4622;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field310 + class303.field4815 - class286.field4622;
                    if (var5 > class303.field4815 + class303.field4815) {
                        var5 = class303.field4815 + class303.field4815;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class33.field394[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class220.field3458 - var1.field332;
                        if (var7 > 32) {
                            var1.field314 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field314 = 2;
                            var7 = -var7;
                        }
                        var1.field327 = (var1.field321 - class140.field2008 << 8) / var7;
                        var1.field333 = (var1.field323 - class140.field2008 << 8) / var7;
                        var1.field330 = (var1.field315 - class148.field2203 << 8) / var7;
                        var1.field325 = (var1.field312 - class148.field2203 << 8) / var7;
                        class266.field4330[class283.field4597++] = var1;
                    }
                }
            } else if (var1.field316 == 2) {
                int var8 = var1.field309 + class303.field4815 - class286.field4622;
                if (var8 >= 0 && var8 <= class303.field4815 + class303.field4815) {
                    int var9 = var1.field334 + class303.field4815 - class32.field386;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field319 + class303.field4815 - class32.field386;
                    if (var10 > class303.field4815 + class303.field4815) {
                        var10 = class303.field4815 + class303.field4815;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class33.field394[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class140.field2008 - var1.field321;
                        if (var12 > 32) {
                            var1.field314 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field314 = 4;
                            var12 = -var12;
                        }
                        var1.field308 = (var1.field332 - class220.field3458 << 8) / var12;
                        var1.field324 = (var1.field326 - class220.field3458 << 8) / var12;
                        var1.field330 = (var1.field315 - class148.field2203 << 8) / var12;
                        var1.field325 = (var1.field312 - class148.field2203 << 8) / var12;
                        class266.field4330[class283.field4597++] = var1;
                    }
                }
            } else if (var1.field316 == 4) {
                int var13 = var1.field315 - class148.field2203;
                if (var13 > 128) {
                    int var14 = var1.field309 + class303.field4815 - class286.field4622;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field310 + class303.field4815 - class286.field4622;
                    if (var15 > class303.field4815 + class303.field4815) {
                        var15 = class303.field4815 + class303.field4815;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field334 + class303.field4815 - class32.field386;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field319 + class303.field4815 - class32.field386;
                        if (var17 > class303.field4815 + class303.field4815) {
                            var17 = class303.field4815 + class303.field4815;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class33.field394[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field314 = 5;
                            var1.field308 = (var1.field332 - class220.field3458 << 8) / var13;
                            var1.field324 = (var1.field326 - class220.field3458 << 8) / var13;
                            var1.field327 = (var1.field321 - class140.field2008 << 8) / var13;
                            var1.field333 = (var1.field323 - class140.field2008 << 8) / var13;
                            class266.field4330[class283.field4597++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IBLvl;)Lnj;")
    public static final class215 method715(int arg0, byte arg1, class73 arg2) {
        field1555++;
        if (class75.method521(arg0, arg2, (byte) -118)) {
            int var3 = -6 % ((arg1 - 42) / 35);
            return class111.method736(31271);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static final void method716(int arg0) {
        class175.field2763.method443((byte) 110);
        if (arg0 != 32) {
            field1563 = true;
        }
        field1561++;
        int var1 = class175.field2763.method439(127, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class175.field2763.method439(122, 2);
        if (var2 == 0) {
            class212.field3299[class140.field2016++] = 2047;
        } else if (var2 == 1) {
            int var3 = class175.field2763.method439(111, 3);
            class214.field3347.method1733(1, (byte) -122, var3);
            int var4 = class175.field2763.method439(121, 1);
            if (var4 == 1) {
                class212.field3299[class140.field2016++] = 2047;
            }
        } else if (var2 == 2) {
            if (class175.field2763.method439(118, 1) == 1) {
                int var5 = class175.field2763.method439(arg0 ^ 0x57, 3);
                class214.field3347.method1733(2, (byte) -110, var5);
                int var6 = class175.field2763.method439(110, 3);
                class214.field3347.method1733(2, (byte) -52, var6);
            } else {
                int var7 = class175.field2763.method439(125, 3);
                class214.field3347.method1733(0, (byte) -24, var7);
            }
            int var8 = class175.field2763.method439(112, 1);
            if (var8 == 1) {
                class212.field3299[class140.field2016++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class175.field2763.method439(arg0 ^ 0x55, 1);
            if (var9 == 1) {
                class212.field3299[class140.field2016++] = 2047;
            }
            int var10 = class175.field2763.method439(arg0 ^ 0x51, 7);
            int var11 = class175.field2763.method439(103, 1);
            int var12 = class175.field2763.method439(109, 7);
            class148.field2204 = class175.field2763.method439(125, 2);
            class214.field3347.method5(var11 == 1, 360000, var12, var10);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(SZ)Z")
    public static final boolean method717(short arg0, boolean arg1) {
        field1556++;
        if (arg0 == 48 || arg0 == 41 || arg0 == 33 || arg0 == 26 || arg0 == 32 || arg0 == 57 || arg0 == 36 || arg0 == 1) {
            return true;
        } else if (arg0 == 51 || arg0 == 10 || arg0 == 1011 || arg0 == 1009) {
            return true;
        } else if (arg0 == 25 || arg0 == 2 || arg0 == 37 || arg0 == 59 || arg0 == 20) {
            return true;
        } else {
            if (arg1) {
                field1564 = null;
            }
            return arg0 == 19 || arg0 == 60 || arg0 == 24 || arg0 == 6 || arg0 == 50 || arg0 == 16;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public static void method718(int arg0) {
        field1557 = null;
        field1562 = null;
        field1564 = null;
        if (arg0 != -2) {
            method718(11);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZI)V")
    public static final void method719(boolean arg0, int arg1) {
        field1559++;
        int var2 = class99.field1474;
        if (arg0) {
            return;
        }
        int var3 = class56.field817;
        int var4 = class147.field2189;
        int var5 = class21.field279;
        int var6 = class255.field4159;
        int var7 = (int) class215.field3356;
        if ((class106.field1549 / 256) > var7) {
            var7 = class106.field1549 / 256;
        }
        int var8 = (int) class144.field2145 + class177.field2785 & 0x7FF;
        if (class49.field623[4] && class94.field1411[4] + 128 > var7) {
            var7 = class94.field1411[4] + 128;
        }
        class117.method770(var7 * 3 + 600, 8220, var7, arg1, var8, class263.field4271, class99.field1477, class52.method351(-124, class214.field3347.field3920, class214.field3347.field3915, class148.field2204) - 50);
        if (class99.field1474 == var2 && class21.field279 == var5 && class255.field4159 == var6 && class147.field2189 == var4 && class56.field817 == var3) {
            class158.field2370 = 1;
            return;
        }
        class69.field1029 = 10;
        class174.field2727 = 10;
        class211.field3292 = 10;
        int var9 = class56.field817 - var3;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (class21.field279 > var5) {
            var5 += class174.field2727 + ((class21.field279 - var5) * class69.field1029 / 1000);
            if (class21.field279 > var5) {
                class21.field279 = var5;
            }
        }
        if (var2 < class99.field1474) {
            var2 += (class99.field1474 - var2) * class69.field1029 / 1000 + class174.field2727;
            if (class99.field1474 > var2) {
                class99.field1474 = var2;
            }
        }
        if (class99.field1474 < var2) {
            int var10 = var2 - ((var2 - class99.field1474) * class69.field1029 / 1000 + class174.field2727);
            if (var10 > class99.field1474) {
                class99.field1474 = var10;
            }
        }
        class49.field628 = 10;
        if (var5 > class21.field279) {
            int var11 = var5 - ((var5 - class21.field279) * class69.field1029 / 1000 + class174.field2727);
            if (var11 > class21.field279) {
                class21.field279 = var11;
            }
        }
        if (class147.field2189 > var4) {
            var4 += class211.field3292 + ((class147.field2189 - var4) * class49.field628 / 1000);
            if (class147.field2189 > var4) {
                class147.field2189 = var4;
            }
        }
        if (var6 < class255.field4159) {
            var6 += (class255.field4159 - var6) * class69.field1029 / 1000 + class174.field2727;
            if (var6 < class255.field4159) {
                class255.field4159 = var6;
            }
        }
        if (var6 > class255.field4159) {
            int var12 = var6 - ((var6 - class255.field4159) * class69.field1029 / 1000 + class174.field2727);
            if (var12 > class255.field4159) {
                class255.field4159 = var12;
            }
        }
        if (var9 < -1024) {
            var9 += 2048;
        }
        if (var9 > 0) {
            int var13 = class211.field3292 + (class49.field628 * var9 / 1000) + var3;
            var3 = var13 & 0x7FF;
        }
        if (var9 < 0) {
            int var14 = var3 - (-var9 * class49.field628 / 1000 + class211.field3292);
            var3 = var14 & 0x7FF;
        }
        if (var4 > class147.field2189) {
            int var15 = var4 - ((var4 - class147.field2189) * class49.field628 / 1000 + class211.field3292);
            if (class147.field2189 < var15) {
                class147.field2189 = var15;
            }
        }
        int var16 = class56.field817 - var3;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 >= 0 || var9 <= 0 || var16 > 0 && var9 < 0) {
            class56.field817 = var3;
        }
    }
}
