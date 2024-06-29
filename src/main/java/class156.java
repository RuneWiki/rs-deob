import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class156 {

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "J")
    public long field2565 = 0L;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field2562 = 0;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "[Z")
    public static boolean[] field2574 = new boolean[5];

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public int field2558;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public int field2559;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public int field2561;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public int field2568;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public int field2570;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public int field2572;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public int field2573;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Lwg;")
    public class178 field2560;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Lwg;")
    public class178 field2569;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Lsi;")
    public static class204 field2567;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Llc;")
    public static class86 field2557;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIII)V")
    public static final void method1154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2564++;
        int var6 = arg3 - arg0;
        int var7 = arg5 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class149.method1059(arg4, -1, arg1, arg0, arg3);
            }
        } else if (var6 == 0) {
            class125.method905((byte) -22, arg1, arg5, arg4, arg0);
        } else if (arg2 == -1347847572) {
            int var8 = (var6 << 12) / var7;
            int var9 = arg0 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (arg1 < class272.field4374) {
                var10 = var9 + (class272.field4374 * var8 >> 12);
                var11 = class272.field4374;
            } else if (class211.field3386 < arg1) {
                var11 = class211.field3386;
                var10 = (class211.field3386 * var8 >> 12) + var9;
            } else {
                var11 = arg1;
                var10 = arg0;
            }
            int var12;
            int var13;
            if (arg5 < class272.field4374) {
                var13 = (class272.field4374 * var8 >> 12) + var9;
                var12 = class272.field4374;
            } else if (arg5 <= class211.field3386) {
                var12 = arg5;
                var13 = arg3;
            } else {
                var13 = (class211.field3386 * var8 >> 12) + var9;
                var12 = class211.field3386;
            }
            if (class207.field3328 > var10) {
                var11 = (class207.field3328 - var9 << 12) / var8;
                var10 = class207.field3328;
            } else if (class228.field3657 < var10) {
                var10 = class228.field3657;
                var11 = (class228.field3657 - var9 << 12) / var8;
            }
            if (var13 < class207.field3328) {
                var13 = class207.field3328;
                var12 = (class207.field3328 - var9 << 12) / var8;
            } else if (class228.field3657 < var13) {
                var12 = (class228.field3657 - var9 << 12) / var8;
                var13 = class228.field3657;
            }
            class168.method1240(var12, arg4, var11, var10, var13, (byte) -56);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILlc;II)Z")
    public static final boolean method1155(int arg0, class86 arg1, int arg2, int arg3) {
        field2575++;
        if (arg2 <= 49) {
            return false;
        }
        byte[] var4 = arg1.method643(arg0, arg3, false);
        if (var4 == null) {
            return false;
        } else {
            class121.method887(var4, -24725);
            return true;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method1156(int arg0) {
        field2567 = null;
        field2557 = null;
        if (arg0 == -20701) {
            field2574 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZIZILce;ILce;)I")
    public static final int method1157(boolean arg0, int arg1, boolean arg2, int arg3, class223 arg4, int arg5, class223 arg6) {
        field2563++;
        int var7 = class153.method1135(arg3 + 12, arg4, arg1, arg6, arg0);
        if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (arg3 == arg5) {
            return 0;
        } else {
            int var8 = class153.method1135(11, arg4, arg5, arg6, arg2);
            return arg2 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)Lak;")
    public static final class140 method1158(int arg0) {
        int var1 = class201.field3220[0] * class19.field214[0];
        byte[] var2 = class152.field2505[0];
        field2571++;
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class101.field1476[class179.method1337(var2[var4], 255)];
        }
        class140 var5 = new class140(class262.field4258, class62.field912, class217.field3457[0], class272.field4377[0], class19.field214[0], class201.field3220[0], var3);
        int var6 = 66 / ((-arg0 - 74) / 47);
        class188.method1398((byte) 99);
        return var5;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lq;I)V")
    public static final void method1159(class128 arg0, int arg1) {
        arg0.field1907 = false;
        if (arg0.field1966 != -1) {
            class141 var2 = class285.method1939(arg0.field1966, 112);
            if (var2 == null || var2.field2252 == null) {
                arg0.field1966 = -1;
            } else {
                arg0.field1951++;
                if (var2.field2252.length > arg0.field1875 && var2.field2263[arg0.field1875] < arg0.field1951) {
                    arg0.field1888++;
                    arg0.field1951 = 1;
                    arg0.field1875++;
                    class263.method1845(arg0.field1875, arg0.field1910, class186.field2993 == arg0, arg0.field1979, (byte) -109, var2);
                }
                if (arg0.field1875 >= var2.field2252.length) {
                    arg0.field1951 = 0;
                    arg0.field1875 = 0;
                    class263.method1845(arg0.field1875, arg0.field1910, class186.field2993 == arg0, arg0.field1979, (byte) -125, var2);
                }
                arg0.field1888 = arg0.field1875 + 1;
                if (var2.field2252.length <= arg0.field1888) {
                    arg0.field1888 = 0;
                }
            }
        }
        if (arg0.field1934 != arg1 && class264.field4290 >= arg0.field1878) {
            class55 var3 = class187.method1387((byte) 55, arg0.field1934);
            int var4 = var3.field794;
            if (var4 == -1) {
                arg0.field1934 = -1;
            } else {
                label293: {
                    class141 var5 = class285.method1939(var4, 112);
                    if (var3.field788) {
                        if (var5.field2260 == 3) {
                            if (arg0.field1920 > 0 && class264.field4290 >= arg0.field1913 && arg0.field1902 < class264.field4290) {
                                arg0.field1934 = -1;
                                break label293;
                            }
                        } else if (var5.field2260 == 1 && arg0.field1920 > 0 && arg0.field1913 <= class264.field4290 && class264.field4290 > arg0.field1902) {
                            arg0.field1878 = class264.field4290 + 1;
                            break label293;
                        }
                    }
                    if (var5 == null || var5.field2252 == null) {
                        arg0.field1934 = -1;
                    } else {
                        if (arg0.field1948 < 0) {
                            arg0.field1948 = 0;
                            class263.method1845(0, arg0.field1910, class186.field2993 == arg0, arg0.field1979, (byte) -115, var5);
                        }
                        arg0.field1891++;
                        if (var5.field2252.length > arg0.field1948 && var5.field2263[arg0.field1948] < arg0.field1891) {
                            arg0.field1948++;
                            arg0.field1891 = 1;
                            class263.method1845(arg0.field1948, arg0.field1910, class186.field2993 == arg0, arg0.field1979, (byte) -32, var5);
                        }
                        if (var5.field2252.length <= arg0.field1948) {
                            if (var3.field788) {
                                arg0.field1905++;
                                arg0.field1948 -= var5.field2269;
                                if (var5.field2274 <= arg0.field1905) {
                                    arg0.field1934 = -1;
                                } else if (arg0.field1948 >= 0 && var5.field2252.length > arg0.field1948) {
                                    class263.method1845(arg0.field1948, arg0.field1910, class186.field2993 == arg0, arg0.field1979, (byte) -82, var5);
                                } else {
                                    arg0.field1934 = -1;
                                }
                            } else {
                                arg0.field1934 = -1;
                            }
                        }
                        arg0.field1923 = arg0.field1948 + 1;
                        if (arg0.field1923 >= var5.field2252.length) {
                            if (var3.field788) {
                                arg0.field1923 -= var5.field2269;
                                if ((arg0.field1905 + 1) >= var5.field2274) {
                                    arg0.field1923 = -1;
                                } else if (arg0.field1923 < 0 || var5.field2252.length <= arg0.field1923) {
                                    arg0.field1923 = -1;
                                }
                            } else {
                                arg0.field1923 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field1932 != -1 && arg0.field1941 <= 1) {
            class141 var6 = class285.method1939(arg0.field1932, 112);
            if (var6.field2260 == 3) {
                if (arg0.field1920 > 0 && arg0.field1913 <= class264.field4290 && arg0.field1902 < class264.field4290) {
                    arg0.field1932 = -1;
                }
            } else if (var6.field2260 == 1 && arg0.field1920 > 0 && class264.field4290 >= arg0.field1913 && arg0.field1902 < class264.field4290) {
                arg0.field1941 = 1;
            }
        }
        if (arg0.field1932 != -1 && arg0.field1941 == 0) {
            class141 var7 = class285.method1939(arg0.field1932, 112);
            if (var7 == null || var7.field2252 == null) {
                arg0.field1932 = -1;
            } else {
                arg0.field1970++;
                if (arg0.field1921 < var7.field2252.length && arg0.field1970 > var7.field2263[arg0.field1921]) {
                    arg0.field1970 = 1;
                    arg0.field1921++;
                    class263.method1845(arg0.field1921, arg0.field1910, class186.field2993 == arg0, arg0.field1979, (byte) -122, var7);
                }
                if (var7.field2252.length <= arg0.field1921) {
                    arg0.field1921 -= var7.field2269;
                    arg0.field1969++;
                    if (var7.field2274 <= arg0.field1969) {
                        arg0.field1932 = -1;
                    } else if (arg0.field1921 >= 0 && arg0.field1921 < var7.field2252.length) {
                        class263.method1845(arg0.field1921, arg0.field1910, class186.field2993 == arg0, arg0.field1979, (byte) -66, var7);
                    } else {
                        arg0.field1932 = -1;
                    }
                }
                arg0.field1937 = arg0.field1921 + 1;
                if (var7.field2252.length <= arg0.field1937) {
                    arg0.field1937 -= var7.field2269;
                    if ((arg0.field1969 + 1) >= var7.field2274) {
                        arg0.field1937 = -1;
                    } else if (arg0.field1937 < 0 || arg0.field1937 >= var7.field2252.length) {
                        arg0.field1937 = -1;
                    }
                }
                arg0.field1907 = var7.field2270;
            }
        }
        if (arg0.field1941 > 0) {
            arg0.field1941--;
        }
        field2566++;
        for (int var8 = 0; var8 < arg0.field1889.length; var8++) {
            class124 var9 = arg0.field1889[var8];
            if (var9 != null) {
                if (var9.field1819 > 0) {
                    var9.field1819--;
                } else {
                    class141 var10 = class285.method1939(var9.field1818, 112);
                    if (var10 == null || var10.field2252 == null) {
                        arg0.field1889[var8] = null;
                    } else {
                        var9.field1809++;
                        if (var10.field2252.length > var9.field1807 && var10.field2263[var9.field1807] < var9.field1809) {
                            var9.field1807++;
                            var9.field1809 = 1;
                            class263.method1845(var9.field1807, arg0.field1910, class186.field2993 == arg0, arg0.field1979, (byte) -104, var10);
                        }
                        if (var9.field1807 >= var10.field2252.length) {
                            var9.field1814++;
                            var9.field1807 -= var10.field2269;
                            if (var9.field1814 >= var10.field2274) {
                                arg0.field1889[var8] = null;
                            } else if (var9.field1807 >= 0 && var10.field2252.length > var9.field1807) {
                                class263.method1845(var9.field1807, arg0.field1910, class186.field2993 == arg0, arg0.field1979, (byte) -89, var10);
                            } else {
                                arg0.field1889[var8] = null;
                            }
                        }
                        var9.field1808 = var9.field1807 + 1;
                        if (var9.field1808 >= var10.field2252.length) {
                            var9.field1808 -= var10.field2269;
                            if (var10.field2274 <= (var9.field1814 + 1)) {
                                var9.field1808 = -1;
                            } else if (var9.field1808 < 0 || var9.field1808 >= var10.field2252.length) {
                                var9.field1808 = -1;
                            }
                        }
                    }
                }
            }
        }
    }
}
