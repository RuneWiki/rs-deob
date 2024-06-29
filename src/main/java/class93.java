import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public abstract class class93 {

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "[Lfb;")
    public static class33[] field2034 = new class33[4];

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "[I")
    public static int[] field2031 = new int[5];

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Z")
    public static boolean field2038 = false;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lo;")
    public static class84 field2030 = class15.method124(":chalreq:", 255);

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "[[B")
    public static byte[][] field2044 = new byte[50][];

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "Lo;")
    public static class84 field2046 = class15.method124("@yel@World", 255);

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Lo;")
    public static class84 field2042 = class15.method124("chatback", 255);

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field2040 = 0;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field2035 = 0;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Lo;")
    public static class84 field2036 = class15.method124("q8_full", 255);

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "[I")
    public static int[] field2047 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field2048 = 0;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Ljava/awt/Image;")
    public static Image field2045;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIBIIIIIIII)V", line = 30)
    public static final void method719(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2043++;
        if (!class128.method998(arg3, -20142) || (arg1 > arg7 || arg0 < arg10 || arg7 >= arg4 || arg8 <= arg0)) {
            return;
        }
        if (arg2 > -82) {
            field2036 = null;
        }
        class75[] var11 = class60.field1254[arg3];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class75 var13 = var11[var12];
            if (var13 != null && var13.field1625 == arg9) {
                int var14 = var13.field1579 + arg1;
                int var15 = var13.field1589 + arg10 - arg5;
                if (var13.field1627 == 8 && var14 <= arg7 && var15 <= arg0 && arg7 < var13.field1613 + var14 && var13.field1623 + var15 > arg0) {
                    class103.field2177 = var12;
                }
                if ((var13.field1598 >= 0 || var13.field1632 != 0) && var14 <= arg7 && arg0 >= var15 && arg7 < var14 + var13.field1613 && var13.field1623 + var15 > arg0) {
                    if (var13.field1598 >= 0) {
                        class45.field965 = var13.field1598;
                    } else {
                        class45.field965 = var12;
                    }
                }
                if (var13.field1627 != 0) {
                    if (var13.field1569 == 1 && var14 <= arg7 && var15 <= arg0 && arg7 < var13.field1613 + var14 && arg0 < var13.field1623 + var15) {
                        boolean var16 = false;
                        if (var13.field1624 != 0) {
                            var16 = class39.method343(var13, (byte) -69);
                        }
                        if (!var16) {
                            class26.method196(var13.field1595, 54, (arg3 << 16) + var12, 0, false, 0);
                            class30.field581++;
                        }
                    }
                    if (var13.field1569 == 2 && class30.field601 == 0 && arg7 >= var14 && var15 <= arg0 && var13.field1613 + var14 > arg7 && var13.field1623 + var15 > arg0) {
                        class84 var17 = var13.field1622;
                        if (var17.method670(class128.field2819, (byte) 95) != -1) {
                            var17 = var17.method650(var17.method670(class128.field2819, (byte) 95), -32, 0);
                        }
                        class26.method196(class97.method746(0, new class84[] { var17, class45.field969, var13.field1575 }), 21, (arg3 << 16) + var12, 0, false, 0);
                        class19.field364++;
                    }
                    if (var13.field1569 == 3 && arg7 >= var14 && arg0 >= var15 && var13.field1613 + var14 > arg7 && var13.field1623 + var15 > arg0) {
                        client.field329++;
                        byte var18;
                        if (arg6 == 3) {
                            var18 = 35;
                        } else {
                            var18 = 32;
                        }
                        class26.method196(class84.field1904, var18, (arg3 << 16) + var12, 0, false, 0);
                    }
                    if (var13.field1569 == 4 && arg7 >= var14 && var15 <= arg0 && arg7 < var13.field1613 + var14 && var13.field1623 + var15 > arg0) {
                        class26.method196(var13.field1595, 40, (arg3 << 16) + var12, 0, false, 0);
                        class113.field2445++;
                    }
                    if (var13.field1569 == 5 && arg7 >= var14 && arg0 >= var15 && var14 + var13.field1613 > arg7 && var13.field1623 + var15 > arg0) {
                        class26.method196(var13.field1595, 49, (arg3 << 16) + var12, 0, false, 0);
                        class109.field2355++;
                    }
                    if (var13.field1569 == 6 && !class25.field438 && var14 <= arg7 && var15 <= arg0 && arg7 < var13.field1613 + var14 && arg0 < var13.field1623 + var15) {
                        class26.method196(var13.field1595, 18, (arg3 << 16) + var12, 0, false, 0);
                        class37.field725++;
                    }
                    if (var13.field1627 == 2) {
                        int var19 = 0;
                        for (int var20 = 0; var20 < var13.field1623; var20++) {
                            for (int var21 = 0; var21 < var13.field1613; var21++) {
                                int var22 = var15 + (var13.field1574 + 32) * var20;
                                int var23 = (var13.field1561 + 32) * var21 + var14;
                                if (var19 < 20) {
                                    var23 += var13.field1581[var19];
                                    var22 += var13.field1606[var19];
                                }
                                if (var23 <= arg7 && var22 <= arg0 && var23 + 32 > arg7 && arg0 < var22 + 32) {
                                    class21.field391 = var19;
                                    class80.field1721 = (arg3 << 16) + var12;
                                    if (var13.field1614[var19] > 0) {
                                        class44 var24 = class126.method970(114, var13.field1614[var19] - 1);
                                        if (field2048 == 1 && var13.field1601) {
                                            if ((arg3 << 16) + var12 != class126.field2791 || class36.field712 != var19) {
                                                class26.method196(class97.method746(0, new class84[] { class33.field643, class106.field2255, class105.field2219, var24.field921 }), 19, (arg3 << 16) + var12, var19, false, var24.field924);
                                                class25.field425++;
                                            }
                                        } else if (class30.field601 != 1 || !var13.field1601) {
                                            class84[] var25 = var24.field889;
                                            class105.field2229++;
                                            if (class42.field866) {
                                                var25 = class106.method790((byte) 112, var25);
                                            }
                                            if (var13.field1601) {
                                                for (int var26 = 4; var26 >= 3; var26--) {
                                                    if (var25 != null && var25[var26] != null) {
                                                        class35.field697++;
                                                        byte var27;
                                                        if (var26 == 3) {
                                                            var27 = 53;
                                                        } else {
                                                            var27 = 23;
                                                        }
                                                        class26.method196(class97.method746(0, new class84[] { var25[var26], class104.field2196, var24.field921 }), var27, (arg3 << 16) + var12, var19, false, var24.field924);
                                                    } else if (var26 == 4) {
                                                        class26.method196(class97.method746(0, new class84[] { class28.field544, var24.field921 }), 23, (arg3 << 16) + var12, var19, false, var24.field924);
                                                        class6.field103++;
                                                    }
                                                }
                                            }
                                            if (var13.field1630) {
                                                class39.field792++;
                                                class26.method196(class97.method746(0, new class84[] { class73.field1529, var24.field921 }), 1, (arg3 << 16) + var12, var19, false, var24.field924);
                                            }
                                            if (var13.field1601 && var25 != null) {
                                                for (int var28 = 2; var28 >= 0; var28--) {
                                                    if (var25[var28] != null) {
                                                        class71.field1497++;
                                                        byte var29 = 0;
                                                        if (var28 == 0) {
                                                            var29 = 4;
                                                        }
                                                        if (var28 == 1) {
                                                            var29 = 27;
                                                        }
                                                        if (var28 == 2) {
                                                            var29 = 46;
                                                        }
                                                        class26.method196(class97.method746(0, new class84[] { var25[var28], class104.field2196, var24.field921 }), var29, (arg3 << 16) + var12, var19, false, var24.field924);
                                                    }
                                                }
                                            }
                                            class84[] var30 = var13.field1594;
                                            if (class42.field866) {
                                                var30 = class106.method790((byte) 112, var30);
                                            }
                                            if (var30 != null) {
                                                for (int var31 = 4; var31 >= 0; var31--) {
                                                    if (var30[var31] != null) {
                                                        byte var32 = 0;
                                                        if (var31 == 0) {
                                                            var32 = 52;
                                                        }
                                                        if (var31 == 1) {
                                                            var32 = 55;
                                                        }
                                                        class115.field2494++;
                                                        if (var31 == 2) {
                                                            var32 = 47;
                                                        }
                                                        if (var31 == 3) {
                                                            var32 = 39;
                                                        }
                                                        if (var31 == 4) {
                                                            var32 = 26;
                                                        }
                                                        class26.method196(class97.method746(0, new class84[] { var30[var31], class104.field2196, var24.field921 }), var32, (arg3 << 16) + var12, var19, false, var24.field924);
                                                    }
                                                }
                                            }
                                            class26.method196(class97.method746(0, new class84[] { class14.field255, var24.field921 }), 1002, (arg3 << 16) + var12, var19, false, var24.field924);
                                        } else if ((class105.field2220 & 0x10) == 16) {
                                            class26.method196(class97.method746(0, new class84[] { class101.field2141, class104.field2196, var24.field921 }), 28, (arg3 << 16) + var12, var19, false, var24.field924);
                                            class106.field2250++;
                                        }
                                    }
                                }
                                var19++;
                            }
                        }
                    }
                } else if (!var13.field1562 || class39.method350(arg6, var12, (byte) -119) || class84.field1892) {
                    method719(arg0, var14, (byte) -84, arg3, var13.field1613 + var14, var13.field1588, arg6, arg7, var13.field1623 + var15, var12, var15);
                    if (var13.field1623 < var13.field1609) {
                        class63.method494(114, var13, var14 + var13.field1613, var13.field1609, var13.field1623, arg6, arg0, arg7, var15);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V", line = 377)
    public static final void method720(boolean arg0) {
        field2039++;
        if (class1.field23 && class39.field801 != class1.field11) {
            class100.method755(class65.field1445, class1.field11, (byte) 123, class107.field2271.field1436[0], class107.field2271.field1374[0], class58.field1204);
            return;
        }
        if (class27.field533 != class1.field11) {
            class27.field533 = class1.field11;
            class24.method180((byte) 99, class1.field11);
        }
        if (!arg0) {
            method722(23);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 410)
    public static void method721(int arg0) {
        field2045 = null;
        field2042 = null;
        int var1 = 108 / ((arg0 - 71) / 48);
        field2044 = null;
        field2034 = null;
        field2046 = null;
        field2036 = null;
        field2031 = null;
        field2047 = null;
        field2030 = null;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 441)
    public static final void method722(int arg0) {
        Object var1 = class118.field2597;
        synchronized (class118.field2597) {
            if (class85.field1935 != 0) {
                class85.field1935 = 1;
                try {
                    class118.field2597.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field2037++;
        if (arg0 != -27632) {
            field2031 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)I")
    public abstract int method183(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    public abstract void method187(boolean arg0);

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
    public abstract void method186(int arg0);
}
