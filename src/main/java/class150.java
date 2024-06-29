import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class150 implements class131 {

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1922 = new String[] { method1282(method1281("~\"J]o$")), method1282(method1281("wn\u0005]W")), method1282(method1281("b5G\u001f")), method1282(method1281("~\"J]h$")), method1282(method1281("~\"J]i$")), method1282(method1281("~\"J]k$")), method1282(method1281("~\"J]n$")) };

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "[[Z")
    public static boolean[][] field1921 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!rba", name = "l", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!rba", name = "j", descriptor = "I")
    public int field1912;

    @OriginalMember(owner = "client!rba", name = "i", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "I")
    public int field1914;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "I")
    public int field1915;

    @OriginalMember(owner = "client!rba", name = "k", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!rba", name = "h", descriptor = "I")
    public int field1918;

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "I")
    public int field1919;

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "I")
    public int field1920;

    @OriginalMember(owner = "client!rba", name = "m", descriptor = "Z")
    public boolean field1909;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILqo;)V")
    public static final void method1278(int arg0, class170 arg1) {
        try {
            field1910++;
            class84 var2 = arg1.field2182;
            if (var2.method835(false) && var2.method844(1, arg0 + 87) && var2.method843((byte) -71)) {
                if (arg1.field2204) {
                    var2.method840(arg1.method1430(arg0 + 27752).method5528((byte) -95), false);
                    arg1.field2204 = var2.method835(false);
                }
                var2.method827(-76);
            }
            for (int var3 = 0; var3 < arg1.field2230.length; var3++) {
                if (arg1.field2230[var3].field6627 != -1) {
                    class84 var4 = arg1.field2230[var3].field6631;
                    if (var4.method826(-1)) {
                        class595 var5 = class11.field153.method3479(arg1.field2230[var3].field6627, arg0 + 102);
                        class437 var6 = var4.method846(arg0 + 12765);
                        if (var5.field8546) {
                            if (var6.field6449 == 3) {
                                if (arg1.field2258 > 0 && class694.field9700 >= arg1.field2237 && class694.field9700 > arg1.field2246) {
                                    var4.method840(-1, false);
                                    arg1.field2230[var3].field6627 = -1;
                                    continue;
                                }
                            } else if (var6.field6449 == 1 && arg1.field2258 > 0 && class694.field9700 >= arg1.field2237 && arg1.field2246 < class694.field9700) {
                                continue;
                            }
                        }
                    }
                    if (var4.method844(1, -118) && var4.method843((byte) -80)) {
                        var4.method840(-1, false);
                        arg1.field2230[var3].field6627 = -1;
                    }
                }
            }
            class84 var7 = arg1.field2228;
            if (var7.method835(false)) {
                label126: {
                    class437 var8 = var7.method846(12763);
                    if (var8.field6449 == 3) {
                        if (arg1.field2258 > 0 && class694.field9700 >= arg1.field2237 && class694.field9700 > arg1.field2246) {
                            arg1.field2194 = null;
                            var7.method840(-1, false);
                            break label126;
                        }
                    } else if (var8.field6449 == 1 && arg1.field2258 > 0 && class694.field9700 >= arg1.field2237 && class694.field9700 > arg1.field2246) {
                        break label126;
                    }
                    if (var7.method844(1, arg0 ^ 0xFFFFFFD3) && var7.method843((byte) -119)) {
                        arg1.field2194 = null;
                        var7.method840(-1, false);
                    }
                }
            }
            if (arg0 == -2) {
                for (int var9 = 0; var9 < arg1.field2248.length; var9++) {
                    class550 var10 = arg1.field2248[var9];
                    if (var10 != null) {
                        if (var10.field8034 > 0) {
                            var10.field8034--;
                        } else if (var10.method844(1, 18) && var10.method843((byte) -70)) {
                            arg1.field2248[var9] = null;
                        }
                    }
                }
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field1922[6] + arg0 + ',' + (arg1 == null ? field1922[2] : field1922[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)J")
    public final long method1149(int arg0) {
        try {
            field1916++;
            long[] var2 = class57.field813;
            long var3 = -1L;
            long var5 = var3 >>> 8 ^ var2[(int) (((long) this.field1915 ^ var3) & 0xFFL)];
            long var7 = var5 >>> 8 ^ var2[(int) (((long) (this.field1918 >> 8) ^ var5) & 0xFFL)];
            long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field1918 ^ var7) & 0xFFL)];
            long var11 = var2[(int) (((long) (this.field1912 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
            long var13 = var2[(int) (((long) (this.field1912 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var15 = var2[(int) ((var13 ^ (long) (this.field1912 >> 8)) & 0xFFL)] ^ var13 >>> 8;
            long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field1912) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field1914) & 0xFFL)];
            long var21 = var2[(int) (((long) (this.field1920 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            long var23 = var2[(int) ((var21 ^ (long) (this.field1920 >> 16)) & 0xFFL)] ^ var21 >>> 8;
            long var25 = var2[(int) (((long) (this.field1920 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
            long var27 = var2[(int) (((long) this.field1920 ^ var25) & 0xFFL)] ^ var25 >>> 8;
            long var29 = var2[(int) (((long) this.field1919 ^ var27) & 0xFFL)] ^ var27 >>> 8;
            long var31 = var2[(int) (((long) (this.field1909 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
            if (arg0 != -28201) {
                this.field1915 = 114;
            }
            return var31;
        } catch (RuntimeException var34) {
            throw class665.method4799(var34, field1922[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(II)V")
    public static final void method1279(int arg0, int arg1) {
        try {
            field1917++;
            if (class586.method4335((byte) 117)) {
                if (class466.field6807 != arg1) {
                    class216.field3166 = "";
                }
                class466.field6807 = arg1;
                class60.field911.method5604(1350);
                class699.method5035(arg0, 31754);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1922[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)V")
    public static void method1280(int arg0) {
        try {
            field1921 = null;
            if (arg0 != -1863171896) {
                field1921 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1922[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILrc;)Z")
    public final boolean method1148(int arg0, class131 arg1) {
        try {
            field1911++;
            if (!(arg1 instanceof class150)) {
                return false;
            } else if (arg0 == 8110) {
                class150 var3 = (class150) arg1;
                if (this.field1915 != var3.field1915) {
                    return false;
                } else if (this.field1918 != var3.field1918) {
                    return false;
                } else if (this.field1912 != var3.field1912) {
                    return false;
                } else if (this.field1914 != var3.field1914) {
                    return false;
                } else if (this.field1920 != var3.field1920) {
                    return false;
                } else if (this.field1919 == var3.field1919) {
                    return var3.field1909 == this.field1909;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1922[3] + arg0 + ',' + (arg1 == null ? field1922[2] : field1922[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1281(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1282(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 12;
                    break;
                case 1:
                    var10005 = 64;
                    break;
                case 2:
                    var10005 = 43;
                    break;
                case 3:
                    var10005 = 115;
                    break;
                default:
                    var10005 = 42;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
