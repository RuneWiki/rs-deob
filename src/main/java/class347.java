import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class347 {

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "[[I")
    public static int[][] field5535 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field5536 = 20;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Ln;")
    public static class309 field5532;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 11)
    public static void method2432(byte arg0) {
        field5532 = null;
        field5535 = (int[][]) null;
        if (arg0 <= 47) {
            field5532 = (class309) null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)Ljava/lang/String;", line = 28)
    public static final String method2433(int arg0, int arg1) {
        field5530++;
        if (arg1 >= 999999999) {
            if (arg0 < 3) {
                field5536 = 110;
            }
            return "*";
        } else {
            return Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lwc;I)V", line = 46)
    public static final void method2434(class116 arg0, int arg1) {
        field5533++;
        arg0.field1984 = false;
        if (arg0.field2000 != -1) {
            class285 var2 = class346.method2428(arg0.field2000, (byte) -24);
            if (var2 == null || var2.field4531 == null) {
                arg0.field2000 = -1;
            } else {
                arg0.field1945++;
                if (arg0.field1974 < var2.field4531.length && arg0.field1945 > var2.field4536[arg0.field1974]) {
                    arg0.field1974++;
                    arg0.field2009++;
                    arg0.field1945 = 1;
                    class20.method199(class218.field3632 == arg0, arg0.field1985, var2, arg0.field2036, arg0.field1974, true);
                }
                if (arg0.field1974 >= var2.field4531.length) {
                    arg0.field1974 = 0;
                    arg0.field1945 = 0;
                    class20.method199(class218.field3632 == arg0, arg0.field1985, var2, arg0.field2036, arg0.field1974, true);
                }
                arg0.field2009 = arg0.field1974 + 1;
                if (arg0.field2009 >= var2.field4531.length) {
                    arg0.field2009 = 0;
                }
            }
        }
        if (arg0.field1980 != -1 && arg0.field2024 <= class181.field3045) {
            class158 var3 = class271.method1851(arg0.field1980, 0);
            int var4 = var3.field2793;
            if (var4 == -1) {
                arg0.field1980 = -1;
            } else {
                label314: {
                    class285 var5 = class346.method2428(var4, (byte) -24);
                    if (var3.field2803) {
                        if (var5.field4541 == 3) {
                            if (arg0.field2013 > 0 && class181.field3045 >= arg0.field1972 && arg0.field1950 < class181.field3045) {
                                arg0.field1980 = -1;
                                break label314;
                            }
                        } else if (var5.field4541 == 1 && arg0.field2013 > 0 && arg0.field1972 <= class181.field3045 && class181.field3045 > arg0.field1950) {
                            arg0.field2024 = class181.field3045 + 1;
                            break label314;
                        }
                    }
                    if (var5 == null || var5.field4531 == null) {
                        arg0.field1980 = -1;
                    } else {
                        if (arg0.field1966 < 0) {
                            arg0.field1966 = 0;
                            class20.method199(class218.field3632 == arg0, arg0.field1985, var5, arg0.field2036, 0, true);
                        }
                        arg0.field1968++;
                        if (arg0.field1966 < var5.field4531.length && arg0.field1968 > var5.field4536[arg0.field1966]) {
                            arg0.field1968 = 1;
                            arg0.field1966++;
                            class20.method199(class218.field3632 == arg0, arg0.field1985, var5, arg0.field2036, arg0.field1966, true);
                        }
                        if (arg0.field1966 >= var5.field4531.length) {
                            if (var3.field2803) {
                                arg0.field2031++;
                                arg0.field1966 -= var5.field4544;
                                if (arg0.field2031 >= var5.field4526) {
                                    arg0.field1980 = -1;
                                } else if (arg0.field1966 >= 0 && var5.field4531.length > arg0.field1966) {
                                    class20.method199(class218.field3632 == arg0, arg0.field1985, var5, arg0.field2036, arg0.field1966, true);
                                } else {
                                    arg0.field1980 = -1;
                                }
                            } else {
                                arg0.field1980 = -1;
                            }
                        }
                        arg0.field1967 = arg0.field1966 + 1;
                        if (arg0.field1967 >= var5.field4531.length) {
                            if (var3.field2803) {
                                arg0.field1967 -= var5.field4544;
                                if (var5.field4526 <= arg0.field2031 + 1) {
                                    arg0.field1967 = -1;
                                } else if (arg0.field1967 < 0 || var5.field4531.length <= arg0.field1967) {
                                    arg0.field1967 = -1;
                                }
                            } else {
                                arg0.field1967 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field1998 != -1 && arg0.field1934 <= 1) {
            class285 var6 = class346.method2428(arg0.field1998, (byte) -24);
            if (var6.field4541 == 3) {
                if (arg0.field2013 > 0 && class181.field3045 >= arg0.field1972 && arg0.field1950 < class181.field3045) {
                    arg0.field1998 = -1;
                }
            } else if (var6.field4541 == 1 && arg0.field2013 > 0 && class181.field3045 >= arg0.field1972 && arg0.field1950 < class181.field3045) {
                arg0.field1934 = 1;
            }
        }
        if (arg1 != 27826) {
            field5535 = (int[][]) ((int[][]) null);
        }
        if (arg0.field1998 != -1 && arg0.field1934 == 0) {
            class285 var7 = class346.method2428(arg0.field1998, (byte) -24);
            if (var7 == null || var7.field4531 == null) {
                arg0.field1998 = -1;
            } else {
                arg0.field2035++;
                if (arg0.field1932 < var7.field4531.length && var7.field4536[arg0.field1932] < arg0.field2035) {
                    arg0.field1932++;
                    arg0.field2035 = 1;
                    class20.method199(class218.field3632 == arg0, arg0.field1985, var7, arg0.field2036, arg0.field1932, true);
                }
                if (var7.field4531.length <= arg0.field1932) {
                    arg0.field1932 -= var7.field4544;
                    arg0.field2002++;
                    if (var7.field4526 <= arg0.field2002) {
                        arg0.field1998 = -1;
                    } else if (arg0.field1932 >= 0 && arg0.field1932 < var7.field4531.length) {
                        class20.method199(class218.field3632 == arg0, arg0.field1985, var7, arg0.field2036, arg0.field1932, true);
                    } else {
                        arg0.field1998 = -1;
                    }
                }
                arg0.field1929 = arg0.field1932 + 1;
                if (arg0.field1929 >= var7.field4531.length) {
                    arg0.field1929 -= var7.field4544;
                    if (arg0.field2002 + 1 >= var7.field4526) {
                        arg0.field1929 = -1;
                    } else if (arg0.field1929 < 0 || var7.field4531.length <= arg0.field1929) {
                        arg0.field1929 = -1;
                    }
                }
                arg0.field1984 = var7.field4530;
            }
        }
        if (arg0.field1934 > 0) {
            arg0.field1934--;
        }
        for (int var8 = 0; var8 < arg0.field2026.length; var8++) {
            class288 var9 = arg0.field2026[var8];
            if (var9 != null) {
                if (var9.field4588 > 0) {
                    var9.field4588--;
                } else {
                    class285 var10 = class346.method2428(var9.field4596, (byte) -24);
                    if (var10 == null || var10.field4531 == null) {
                        arg0.field2026[var8] = null;
                    } else {
                        var9.field4595++;
                        if (var9.field4589 < var10.field4531.length && var9.field4595 > var10.field4536[var9.field4589]) {
                            var9.field4595 = 1;
                            var9.field4589++;
                            class20.method199(class218.field3632 == arg0, arg0.field1985, var10, arg0.field2036, var9.field4589, true);
                        }
                        if (var10.field4531.length <= var9.field4589) {
                            var9.field4601++;
                            var9.field4589 -= var10.field4544;
                            if (var10.field4526 <= var9.field4601) {
                                arg0.field2026[var8] = null;
                            } else if (var9.field4589 >= 0 && var9.field4589 < var10.field4531.length) {
                                class20.method199(class218.field3632 == arg0, arg0.field1985, var10, arg0.field2036, var9.field4589, true);
                            } else {
                                arg0.field2026[var8] = null;
                            }
                        }
                        var9.field4600 = var9.field4589 + 1;
                        if (var10.field4531.length <= var9.field4600) {
                            var9.field4600 -= var10.field4544;
                            if (var10.field4526 <= var9.field4601 + 1) {
                                var9.field4600 = -1;
                            } else if (var9.field4600 < 0 || var9.field4600 >= var10.field4531.length) {
                                var9.field4600 = -1;
                            }
                        }
                    }
                }
            }
        }
    }
}
