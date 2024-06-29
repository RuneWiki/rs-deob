import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class169 {

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Lki;")
    public static class498 field2502 = new class498(50, 3);

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field2509 = 0;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field2508 = 0;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "B")
    public byte field2495;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "F")
    public static float field2506;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public int field2503;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Lt;")
    public static class471 field2507;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Ljava/lang/String;")
    public String field2497;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Ljava/lang/String;")
    public String field2499;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Ljava/lang/String;")
    public String field2500;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "Ljava/lang/String;")
    public String field2504;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2498;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "[[B")
    public static byte[][] field2510;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 3)
    public static final void method1169(byte arg0) {
        if (arg0 < 37) {
            method1169((byte) -17);
        }
        class483.method2867((byte) -126);
        field2501++;
        class43.method262(22050, (byte) -91, 2, class426.field6401.field1006);
        class35.field368 = class307.method1931(0, class364.field5570, class483.field7077, -458, 22050);
        class35.field368.method2416(3, class287.field4116);
        class374.field5695 = class307.method1931(1, class364.field5570, class483.field7077, -458, 2048);
        class374.field5695.method2416(3, class366.field5591);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z", line = 19)
    public static final boolean method1170(int arg0, int arg1) {
        field2505++;
        if (arg0 == 11 || arg0 == 59 || arg0 == 48 || arg0 == 23 || arg0 == 47) {
            return true;
        } else if (arg0 == 21 || arg0 == 1011) {
            return true;
        } else {
            return arg1 > -110;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V", line = 52)
    public static final void method1171(int arg0, int arg1) {
        class377 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class35 var4 = class307.field4415[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class484.field7096; var5++) {
                    for (int var6 = 0; var6 < class361.field5554; var6++) {
                        var2 = var4.method197(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class192.field2815;
                            int var8 = var5 << class192.field2815;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class35 var10 = class307.field4415[var9];
                                if (var10 != null) {
                                    int var11 = var4.method201(var6, var5) - var10.method201(var6, var5);
                                    int var12 = var4.method201(var6 + 1, var5) - var10.method201(var6 + 1, var5);
                                    int var13 = var4.method201(var6 + 1, var5 + 1) - var10.method201(var6 + 1, var5 + 1);
                                    int var14 = var4.method201(var6, var5 + 1) - var10.method201(var6, var5 + 1);
                                    var10.method208(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lme;I)V", line = 118)
    public static final void method1172(class129 arg0, int arg1) {
        arg0.field1962 = false;
        field2496++;
        if (arg0.field1931 != -1) {
            class329 var2 = class84.field1295.method1182(arg0.field1931, 8);
            if (var2 == null || var2.field4670 == null) {
                arg0.field1931 = -1;
                arg0.field1963 = false;
            } else {
                label397: {
                    arg0.field1987++;
                    if (arg0.field1905 < var2.field4670.length && var2.field4665[arg0.field1905] < arg0.field1987) {
                        arg0.field1972++;
                        arg0.field1905++;
                        arg0.field1987 = 1;
                        class480.method2856(arg0.field1769, arg0.field1763, (byte) 33, arg0.field1768, class500.field7365 == arg0, var2, arg0.field1905);
                    }
                    if (var2.field4670.length <= arg0.field1905) {
                        arg0.field1905 = 0;
                        arg0.field1987 = 0;
                        if (arg0.field1963) {
                            arg0.field1931 = arg0.method845(0).method484(arg1);
                            if (arg0.field1931 == -1) {
                                arg0.field1963 = false;
                                break label397;
                            }
                            var2 = class84.field1295.method1182(arg0.field1931, 8);
                        }
                        class480.method2856(arg0.field1769, arg0.field1763, (byte) 118, arg0.field1768, class500.field7365 == arg0, var2, arg0.field1905);
                    }
                    arg0.field1972 = arg0.field1905 + 1;
                    if (var2.field4670.length <= arg0.field1972) {
                        arg0.field1972 = 0;
                    }
                }
            }
        }
        if (arg0.field1906 != -1 && class317.field4559 >= arg0.field1908) {
            class104 var3 = class512.field7494.method2732(44, arg0.field1906);
            int var4 = var3.field1505;
            if (var4 == -1) {
                arg0.field1906 = -1;
            } else {
                label399: {
                    class329 var5 = class84.field1295.method1182(var4, 8);
                    if (var3.field1499) {
                        if (var5.field4677 == 3) {
                            if (arg0.field1999 > 0 && arg0.field1965 <= class317.field4559 && class317.field4559 > arg0.field1982) {
                                arg0.field1906 = -1;
                                break label399;
                            }
                        } else if (var5.field4677 == 1 && arg0.field1999 > 0 && class317.field4559 >= arg0.field1965 && arg0.field1982 < class317.field4559) {
                            arg0.field1908 = class317.field4559 + 1;
                            break label399;
                        }
                    }
                    if (var5 == null || var5.field4670 == null) {
                        arg0.field1906 = -1;
                    } else {
                        if (arg0.field1937 < 0) {
                            arg0.field1937 = 0;
                            class480.method2856(arg0.field1769, arg0.field1763, (byte) 33, arg0.field1768, class500.field7365 == arg0, var5, 0);
                        }
                        arg0.field1973++;
                        if (arg0.field1937 < var5.field4670.length && var5.field4665[arg0.field1937] < arg0.field1973) {
                            arg0.field1973 = 1;
                            arg0.field1937++;
                            class480.method2856(arg0.field1769, arg0.field1763, (byte) 124, arg0.field1768, class500.field7365 == arg0, var5, arg0.field1937);
                        }
                        if (arg0.field1937 >= var5.field4670.length) {
                            if (var3.field1499) {
                                arg0.field1981++;
                                arg0.field1937 -= var5.field4658;
                                if (var5.field4660 <= arg0.field1981) {
                                    arg0.field1906 = -1;
                                } else if (arg0.field1937 >= 0 && arg0.field1937 < var5.field4670.length) {
                                    class480.method2856(arg0.field1769, arg0.field1763, (byte) 48, arg0.field1768, class500.field7365 == arg0, var5, arg0.field1937);
                                } else {
                                    arg0.field1906 = -1;
                                }
                            } else {
                                arg0.field1906 = -1;
                            }
                        }
                        arg0.field1924 = arg0.field1937 + 1;
                        if (arg0.field1924 >= var5.field4670.length) {
                            if (var3.field1499) {
                                arg0.field1924 -= var5.field4658;
                                if (var5.field4660 <= (arg0.field1981 + 1)) {
                                    arg0.field1924 = -1;
                                } else if (arg0.field1924 < 0 || var5.field4670.length <= arg0.field1924) {
                                    arg0.field1924 = -1;
                                }
                            } else {
                                arg0.field1924 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field1912 != -1 && class317.field4559 >= arg0.field1938) {
            class104 var6 = class512.field7494.method2732(111, arg0.field1912);
            int var7 = var6.field1505;
            if (var7 == -1) {
                arg0.field1912 = -1;
            } else {
                label402: {
                    class329 var8 = class84.field1295.method1182(var7, arg1 ^ 0xFFFFFFF7);
                    if (var6.field1499) {
                        if (var8.field4677 == 3) {
                            if (arg0.field1999 > 0 && class317.field4559 >= arg0.field1965 && arg0.field1982 < class317.field4559) {
                                arg0.field1912 = -1;
                                break label402;
                            }
                        } else if (var8.field4677 == 1 && arg0.field1999 > 0 && class317.field4559 >= arg0.field1965 && arg0.field1982 < class317.field4559) {
                            arg0.field1938 = class317.field4559 + 1;
                            break label402;
                        }
                    }
                    if (var8 == null || var8.field4670 == null) {
                        arg0.field1912 = -1;
                    } else {
                        if (arg0.field1975 < 0) {
                            arg0.field1975 = 0;
                            class480.method2856(arg0.field1769, arg0.field1763, (byte) 89, arg0.field1768, class500.field7365 == arg0, var8, 0);
                        }
                        arg0.field1929++;
                        if (var8.field4670.length > arg0.field1975 && var8.field4665[arg0.field1975] < arg0.field1929) {
                            arg0.field1929 = 1;
                            arg0.field1975++;
                            class480.method2856(arg0.field1769, arg0.field1763, (byte) 94, arg0.field1768, class500.field7365 == arg0, var8, arg0.field1975);
                        }
                        if (var8.field4670.length <= arg0.field1975) {
                            if (var6.field1499) {
                                arg0.field1975 -= var8.field4658;
                                arg0.field1947++;
                                if (arg0.field1947 >= var8.field4660) {
                                    arg0.field1912 = -1;
                                } else if (arg0.field1975 >= 0 && var8.field4670.length > arg0.field1975) {
                                    class480.method2856(arg0.field1769, arg0.field1763, (byte) 52, arg0.field1768, class500.field7365 == arg0, var8, arg0.field1975);
                                } else {
                                    arg0.field1912 = -1;
                                }
                            } else {
                                arg0.field1912 = -1;
                            }
                        }
                        arg0.field1977 = arg0.field1975 + 1;
                        if (var8.field4670.length <= arg0.field1977) {
                            if (var6.field1499) {
                                arg0.field1977 -= var8.field4658;
                                if (var8.field4660 <= (arg0.field1947 + 1)) {
                                    arg0.field1977 = -1;
                                } else if (arg0.field1977 < 0 || arg0.field1977 >= var8.field4670.length) {
                                    arg0.field1977 = -1;
                                }
                            } else {
                                arg0.field1977 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field1950 != -1 && arg0.field1936 <= 1) {
            class329 var9 = class84.field1295.method1182(arg0.field1950, 8);
            if (var9.field4677 == 3) {
                if (arg0.field1999 > 0 && class317.field4559 >= arg0.field1965 && arg0.field1982 < class317.field4559) {
                    arg0.field1950 = -1;
                }
            } else if (var9.field4677 == 1 && arg0.field1999 > 0 && arg0.field1965 <= class317.field4559 && class317.field4559 > arg0.field1982) {
                arg0.field1936 = 2;
            }
        }
        if (arg0.field1950 != -1 && arg0.field1936 == 0) {
            class329 var10 = class84.field1295.method1182(arg0.field1950, arg1 ^ 0xFFFFFFF7);
            if (var10 == null || var10.field4670 == null) {
                arg0.field1950 = -1;
            } else {
                arg0.field1935++;
                if (arg0.field1940 < var10.field4670.length && var10.field4665[arg0.field1940] < arg0.field1935) {
                    arg0.field1935 = 1;
                    arg0.field1940++;
                    class480.method2856(arg0.field1769, arg0.field1763, (byte) 68, arg0.field1768, class500.field7365 == arg0, var10, arg0.field1940);
                }
                if (arg0.field1940 >= var10.field4670.length) {
                    arg0.field1952++;
                    arg0.field1940 -= var10.field4658;
                    if (var10.field4660 <= arg0.field1952) {
                        arg0.field1950 = -1;
                    } else if (arg0.field1940 >= 0 && arg0.field1940 < var10.field4670.length) {
                        class480.method2856(arg0.field1769, arg0.field1763, (byte) 112, arg0.field1768, class500.field7365 == arg0, var10, arg0.field1940);
                    } else {
                        arg0.field1950 = -1;
                    }
                }
                arg0.field1915 = arg0.field1940 + 1;
                if (var10.field4670.length <= arg0.field1915) {
                    arg0.field1915 -= var10.field4658;
                    if (arg0.field1952 + 1 >= var10.field4660) {
                        arg0.field1915 = -1;
                    } else if (arg0.field1915 < 0 || arg0.field1915 >= var10.field4670.length) {
                        arg0.field1915 = -1;
                    }
                }
                arg0.field1962 = var10.field4659;
            }
        }
        if (arg1 > ~arg0.field1936) {
            arg0.field1936--;
        }
        for (int var11 = 0; var11 < arg0.field1968.length; var11++) {
            class315 var12 = arg0.field1968[var11];
            if (var12 != null) {
                if (var12.field4495 > 0) {
                    var12.field4495--;
                } else {
                    class329 var13 = class84.field1295.method1182(var12.field4488, 8);
                    if (var13 == null || var13.field4670 == null) {
                        arg0.field1968[var11] = null;
                    } else {
                        var12.field4500++;
                        if (var13.field4670.length > var12.field4498 && var12.field4500 > var13.field4665[var12.field4498]) {
                            var12.field4498++;
                            var12.field4500 = 1;
                            class480.method2856(arg0.field1769, arg0.field1763, (byte) 103, arg0.field1768, class500.field7365 == arg0, var13, var12.field4498);
                        }
                        if (var13.field4670.length <= var12.field4498) {
                            var12.field4498 -= var13.field4658;
                            var12.field4494++;
                            if (var12.field4494 >= var13.field4660) {
                                arg0.field1968[var11] = null;
                            } else if (var12.field4498 >= 0 && var12.field4498 < var13.field4670.length) {
                                class480.method2856(arg0.field1769, arg0.field1763, (byte) 25, arg0.field1768, class500.field7365 == arg0, var13, var12.field4498);
                            } else {
                                arg0.field1968[var11] = null;
                            }
                        }
                        var12.field4492 = var12.field4498 + 1;
                        if (var12.field4492 >= var13.field4670.length) {
                            var12.field4492 -= var13.field4658;
                            if ((var12.field4494 + 1) >= var13.field4660) {
                                var12.field4492 = -1;
                            } else if (var12.field4492 < 0 || var12.field4492 >= var13.field4670.length) {
                                var12.field4492 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 538)
    public static void method1173(int arg0) {
        field2502 = null;
        if (arg0 != -1) {
            method1172(null, 124);
        }
        field2510 = null;
        field2507 = null;
        field2498 = null;
    }
}
