import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class239 extends class626 {

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "S")
    public short field3369;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "[I")
    public static int[] field3370 = new int[250];

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "[[Z")
    public static boolean[][] field3368;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZLvg;)V")
    public static final void method1609(boolean arg0, class52 arg1) {
        field3367++;
        if (arg1.field939 != -1) {
            class718 var2 = class698.field9806.method851(arg1.field939, -2);
            if (var2 == null || var2.field10053 == null) {
                arg1.field886 = false;
                arg1.field939 = -1;
            } else {
                label363: {
                    arg1.field953++;
                    if (arg1.field970 < var2.field10053.length && arg1.field953 > var2.field10048[arg1.field970]) {
                        arg1.field953 = 1;
                        arg1.field923++;
                        arg1.field970++;
                        if (!arg1.field892) {
                            class749.method4165(arg1.field970, (byte) 45, var2, arg1);
                        }
                    }
                    if (arg1.field970 >= var2.field10053.length) {
                        arg1.field953 = 0;
                        arg1.field970 = 0;
                        if (arg1.field886) {
                            arg1.field939 = arg1.method464((byte) -69).method3011(5317);
                            if (arg1.field939 == -1) {
                                arg1.field886 = false;
                                break label363;
                            }
                            var2 = class698.field9806.method851(arg1.field939, -2);
                        }
                        if (!arg1.field892) {
                            class749.method4165(arg1.field970, (byte) 52, var2, arg1);
                        }
                    }
                    arg1.field923 = arg1.field970 + 1;
                    if (var2.field10053 == null) {
                        arg1.field886 = false;
                        arg1.field939 = -1;
                    } else if (arg1.field923 >= var2.field10053.length) {
                        arg1.field923 = 0;
                    }
                }
            }
        }
        if (arg1.field957 != -1 && arg1.field960 <= class605.field8787) {
            class164 var3 = class638.field9104.method3753(97, arg1.field957);
            int var4 = var3.field2427;
            if (var4 == -1) {
                arg1.field957 = -1;
            } else {
                label364: {
                    class718 var5 = class698.field9806.method851(var4, -2);
                    if (var3.field2412) {
                        if (var5.field10051 == 3) {
                            if (arg1.field988 > 0 && arg1.field898 <= class605.field8787 && class605.field8787 > arg1.field962) {
                                arg1.field957 = -1;
                                break label364;
                            }
                        } else if (var5.field10051 == 1 && arg1.field988 > 0 && arg1.field898 <= class605.field8787 && class605.field8787 > arg1.field962) {
                            arg1.field960 = class605.field8787 + 1;
                            break label364;
                        }
                    }
                    if (var5 == null || var5.field10053 == null) {
                        arg1.field957 = -1;
                    } else {
                        if (arg1.field890 < 0) {
                            arg1.field890 = 0;
                            if (!arg1.field892) {
                                class749.method4165(0, (byte) 112, var5, arg1);
                            }
                        }
                        arg1.field906++;
                        if (arg1.field890 < var5.field10053.length && var5.field10048[arg1.field890] < arg1.field906) {
                            arg1.field906 = 1;
                            arg1.field890++;
                            if (!arg1.field892) {
                                class749.method4165(arg1.field890, (byte) 53, var5, arg1);
                            }
                        }
                        if (var5.field10053.length <= arg1.field890) {
                            if (var3.field2412) {
                                arg1.field945++;
                                arg1.field890 -= var5.field10043;
                                if (arg1.field945 >= var5.field10044) {
                                    arg1.field957 = -1;
                                } else if (arg1.field890 < 0 || var5.field10053.length <= arg1.field890) {
                                    arg1.field957 = -1;
                                } else if (!arg1.field892) {
                                    class749.method4165(arg1.field890, (byte) 108, var5, arg1);
                                }
                            } else {
                                arg1.field957 = -1;
                            }
                        }
                        arg1.field940 = arg1.field890 + 1;
                        if (var5.field10053.length <= arg1.field940) {
                            if (var3.field2412) {
                                arg1.field940 -= var5.field10043;
                                if (var5.field10044 <= arg1.field945 + 1) {
                                    arg1.field940 = -1;
                                } else if (arg1.field940 < 0 || var5.field10053.length <= arg1.field940) {
                                    arg1.field940 = -1;
                                }
                            } else {
                                arg1.field940 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field908 != -1 && class605.field8787 >= arg1.field899) {
            class164 var6 = class638.field9104.method3753(-99, arg1.field908);
            int var7 = var6.field2427;
            if (var7 == -1) {
                arg1.field908 = -1;
            } else {
                label367: {
                    class718 var8 = class698.field9806.method851(var7, -2);
                    if (var6.field2412) {
                        if (var8.field10051 == 3) {
                            if (arg1.field988 > 0 && arg1.field898 <= class605.field8787 && arg1.field962 < class605.field8787) {
                                arg1.field908 = -1;
                                break label367;
                            }
                        } else if (var8.field10051 == 1 && arg1.field988 > 0 && arg1.field898 <= class605.field8787 && class605.field8787 > arg1.field962) {
                            arg1.field899 = class605.field8787 + 1;
                            break label367;
                        }
                    }
                    if (var8 == null || var8.field10053 == null) {
                        arg1.field908 = -1;
                    } else {
                        if (arg1.field880 < 0) {
                            arg1.field880 = 0;
                            if (!arg1.field892) {
                                class749.method4165(0, (byte) 123, var8, arg1);
                            }
                        }
                        arg1.field882++;
                        if (var8.field10053.length > arg1.field880 && arg1.field882 > var8.field10048[arg1.field880]) {
                            arg1.field882 = 1;
                            arg1.field880++;
                            if (!arg1.field892) {
                                class749.method4165(arg1.field880, (byte) 95, var8, arg1);
                            }
                        }
                        if (arg1.field880 >= var8.field10053.length) {
                            if (var6.field2412) {
                                arg1.field956++;
                                arg1.field880 -= var8.field10043;
                                if (arg1.field956 >= var8.field10044) {
                                    arg1.field908 = -1;
                                } else if (arg1.field880 < 0 || var8.field10053.length <= arg1.field880) {
                                    arg1.field908 = -1;
                                } else if (!arg1.field892) {
                                    class749.method4165(arg1.field880, (byte) 61, var8, arg1);
                                }
                            } else {
                                arg1.field908 = -1;
                            }
                        }
                        arg1.field910 = arg1.field880 + 1;
                        if (arg1.field910 >= var8.field10053.length) {
                            if (var6.field2412) {
                                arg1.field910 -= var8.field10043;
                                if ((arg1.field956 + 1) >= var8.field10044) {
                                    arg1.field910 = -1;
                                } else if (arg1.field910 < 0 || var8.field10053.length <= arg1.field910) {
                                    arg1.field910 = -1;
                                }
                            } else {
                                arg1.field910 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field944 != -1 && arg1.field911 <= 1) {
            class718 var9 = class698.field9806.method851(arg1.field944, -2);
            if (var9.field10051 == 3) {
                if (arg1.field988 > 0 && class605.field8787 >= arg1.field898 && arg1.field962 < class605.field8787) {
                    arg1.field944 = -1;
                    arg1.field885 = null;
                }
            } else if (var9.field10051 == 1 && arg1.field988 > 0 && arg1.field898 <= class605.field8787 && class605.field8787 > arg1.field962) {
                arg1.field911 = 2;
            }
        }
        if (arg1.field944 != -1 && arg1.field911 == 0) {
            class718 var10 = class698.field9806.method851(arg1.field944, -2);
            if (var10 == null || var10.field10053 == null) {
                arg1.field944 = -1;
                arg1.field885 = null;
            } else {
                arg1.field904++;
                if (var10.field10053.length > arg1.field950 && var10.field10048[arg1.field950] < arg1.field904) {
                    arg1.field904 = 1;
                    arg1.field950++;
                    if (!arg1.field892) {
                        class749.method4165(arg1.field950, (byte) 88, var10, arg1);
                    }
                }
                if (arg1.field950 >= var10.field10053.length) {
                    arg1.field943++;
                    arg1.field950 -= var10.field10043;
                    if (arg1.field943 >= var10.field10044) {
                        arg1.field944 = -1;
                        arg1.field885 = null;
                    } else if (arg1.field950 < 0 || var10.field10053.length <= arg1.field950) {
                        arg1.field944 = -1;
                        arg1.field885 = null;
                    } else if (!arg1.field892) {
                        class749.method4165(arg1.field950, (byte) 91, var10, arg1);
                    }
                }
                arg1.field914 = arg1.field950 + 1;
                if (arg1.field914 >= var10.field10053.length) {
                    arg1.field914 -= var10.field10043;
                    if (var10.field10044 <= (arg1.field943 + 1)) {
                        arg1.field914 = -1;
                    } else if (arg1.field914 < 0 || arg1.field914 >= var10.field10053.length) {
                        arg1.field914 = -1;
                    }
                }
            }
        }
        if (arg1.field911 > 0) {
            arg1.field911--;
        }
        if (!arg0) {
            method1609(false, null);
        }
        for (int var11 = 0; var11 < arg1.field937.length; var11++) {
            class114 var12 = arg1.field937[var11];
            if (var12 != null) {
                if (var12.field1823 > 0) {
                    var12.field1823--;
                } else {
                    class718 var13 = class698.field9806.method851(var12.field1824, -2);
                    if (var13 == null || var13.field10053 == null) {
                        arg1.field937[var11] = null;
                    } else {
                        var12.field1822++;
                        if (var12.field1827 < var13.field10053.length && var12.field1822 > var13.field10048[var12.field1827]) {
                            var12.field1827++;
                            var12.field1822 = 1;
                            if (!arg1.field892) {
                                class749.method4165(var12.field1827, (byte) 41, var13, arg1);
                            }
                        }
                        if (var13.field10053.length <= var12.field1827) {
                            var12.field1825++;
                            var12.field1827 -= var13.field10043;
                            if (var13.field10044 <= var12.field1825) {
                                arg1.field937[var11] = null;
                            } else if (var12.field1827 < 0 || var12.field1827 >= var13.field10053.length) {
                                arg1.field937[var11] = null;
                            } else if (!arg1.field892) {
                                class749.method4165(var12.field1827, (byte) 124, var13, arg1);
                            }
                        }
                        var12.field1831 = var12.field1827 + 1;
                        if (var12.field1831 >= var13.field10053.length) {
                            var12.field1831 -= var13.field10043;
                            if (var13.field10044 <= (var12.field1825 + 1)) {
                                var12.field1831 = -1;
                            } else if (var12.field1831 < 0 || var12.field1831 >= var13.field10053.length) {
                                var12.field1831 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "()V")
    public class239() {
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
    public static void method1610(int arg0) {
        field3370 = null;
        field3368 = null;
        int var1 = -3 % ((arg0 - 75) / 41);
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(S)V")
    public class239(short arg0) {
        this.field3369 = arg0;
    }
}
