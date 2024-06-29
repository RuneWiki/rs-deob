import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class139 extends class101 {

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "Z")
    public boolean field2020 = false;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "Z")
    public boolean field2023 = true;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field2027 = new Hashtable();

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public int field2019;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public int field2021;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public int field2024;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
    public int field2026;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    public int field2028;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    public int field2029;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public int field2033;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
    public int field2034;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "Lhj;")
    public class596 field2025;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lbba;I)V")
    public static final void method1072(class124 arg0, int arg1) {
        if (arg0.field1794 != -1) {
            class489 var2 = class6.field65.method1034(arg0.field1794, 0);
            if (var2 == null || var2.field6775 == null) {
                arg0.field1826 = false;
                arg0.field1794 = -1;
            } else {
                label280: {
                    arg0.field1835++;
                    if (var2.field6775.length > arg0.field1808 && var2.field6773[arg0.field1808] < arg0.field1835) {
                        arg0.field1840++;
                        arg0.field1808++;
                        arg0.field1835 = 1;
                        if (!arg0.field1823) {
                            class586.method3259(arg0, arg1 + 1, var2, arg0.field1808);
                        }
                    }
                    if (arg0.field1808 >= var2.field6775.length) {
                        arg0.field1808 = 0;
                        arg0.field1835 = 0;
                        if (arg0.field1826) {
                            arg0.field1794 = arg0.method1014((byte) -34).method1388((byte) -83);
                            if (arg0.field1794 == -1) {
                                arg0.field1826 = false;
                                break label280;
                            }
                            var2 = class6.field65.method1034(arg0.field1794, 0);
                        }
                        if (!arg0.field1823) {
                            class586.method3259(arg0, 0, var2, arg0.field1808);
                        }
                    }
                    arg0.field1840 = arg0.field1808 + 1;
                    if (var2.field6775 == null) {
                        arg0.field1794 = -1;
                        arg0.field1826 = false;
                    } else if (var2.field6775.length <= arg0.field1840) {
                        arg0.field1840 = 0;
                    }
                }
            }
        }
        field2030++;
        for (int var3 = 0; var3 < arg0.field1833.length; var3++) {
            if (arg0.field1833[var3].field1898 != -1 && arg0.field1833[var3].field1905 <= class100.field1401) {
                class608 var9 = class784.field10798.method3973((byte) 106, arg0.field1833[var3].field1898);
                int var10 = var9.field8277;
                if (var10 == -1) {
                    arg0.field1833[var3].field1898 = -1;
                } else {
                    class489 var11 = class6.field65.method1034(var10, 0);
                    if (var9.field8278) {
                        if (var11.field6768 == 3) {
                            if (arg0.field1888 > 0 && arg0.field1836 <= class100.field1401 && class100.field1401 > arg0.field1803) {
                                arg0.field1833[var3].field1898 = -1;
                                continue;
                            }
                        } else if (var11.field6768 == 1 && arg0.field1888 > 0 && arg0.field1836 <= class100.field1401 && arg0.field1803 < class100.field1401) {
                            arg0.field1833[var3].field1905 = class100.field1401 + 1;
                            continue;
                        }
                    }
                    if (var11 == null || var11.field6775 == null) {
                        arg0.field1833[var3].field1898 = -1;
                    } else {
                        if (arg0.field1833[var3].field1907 < 0) {
                            arg0.field1833[var3].field1907 = 0;
                            if (!arg0.field1823) {
                                class586.method3259(arg0, 0, var11, 0);
                            }
                        }
                        arg0.field1833[var3].field1904++;
                        if (arg0.field1833[var3].field1907 < var11.field6775.length && arg0.field1833[var3].field1904 > var11.field6773[arg0.field1833[var3].field1907]) {
                            arg0.field1833[var3].field1904 = 1;
                            arg0.field1833[var3].field1907++;
                            if (!arg0.field1823) {
                                class586.method3259(arg0, 0, var11, arg0.field1833[var3].field1907);
                            }
                        }
                        if (var11.field6775.length <= arg0.field1833[var3].field1907) {
                            if (var9.field8278) {
                                arg0.field1833[var3].field1907 -= var11.field6789;
                                arg0.field1833[var3].field1900++;
                                if (var11.field6785 <= arg0.field1833[var3].field1900) {
                                    arg0.field1833[var3].field1898 = -1;
                                } else if (arg0.field1833[var3].field1907 < 0 || var11.field6775.length <= arg0.field1833[var3].field1907) {
                                    arg0.field1833[var3].field1898 = -1;
                                } else if (!arg0.field1823) {
                                    class586.method3259(arg0, 0, var11, arg0.field1833[var3].field1907);
                                }
                            } else {
                                arg0.field1833[var3].field1898 = -1;
                            }
                        }
                        arg0.field1833[var3].field1896 = arg0.field1833[var3].field1907 + 1;
                        if (var11.field6775.length <= arg0.field1833[var3].field1896) {
                            if (var9.field8278) {
                                arg0.field1833[var3].field1896 -= var11.field6789;
                                if ((arg0.field1833[var3].field1900 + 1) >= var11.field6785) {
                                    arg0.field1833[var3].field1896 = -1;
                                } else if (arg0.field1833[var3].field1896 < 0 || arg0.field1833[var3].field1896 >= var11.field6775.length) {
                                    arg0.field1833[var3].field1896 = -1;
                                }
                            } else {
                                arg0.field1833[var3].field1896 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field1827 != -1 && arg0.field1829 <= 1) {
            class489 var4 = class6.field65.method1034(arg0.field1827, 0);
            if (var4.field6768 == 3) {
                if (arg0.field1888 > 0 && class100.field1401 >= arg0.field1836 && arg0.field1803 < class100.field1401) {
                    arg0.field1799 = null;
                    arg0.field1827 = -1;
                }
            } else if (var4.field6768 == 1 && arg0.field1888 > 0 && arg0.field1836 <= class100.field1401 && class100.field1401 > arg0.field1803) {
                arg0.field1829 = 2;
            }
        }
        if (arg0.field1827 != -1 && arg0.field1829 == 0) {
            class489 var5 = class6.field65.method1034(arg0.field1827, 0);
            if (var5 == null || var5.field6775 == null) {
                arg0.field1799 = null;
                arg0.field1827 = -1;
            } else {
                arg0.field1806++;
                if (arg0.field1795 < var5.field6775.length && arg0.field1806 > var5.field6773[arg0.field1795]) {
                    arg0.field1795++;
                    arg0.field1806 = 1;
                    if (!arg0.field1823) {
                        class586.method3259(arg0, ~arg1, var5, arg0.field1795);
                    }
                }
                if (arg0.field1795 >= var5.field6775.length) {
                    arg0.field1817++;
                    arg0.field1795 -= var5.field6789;
                    if (arg0.field1817 >= var5.field6785) {
                        arg0.field1799 = null;
                        arg0.field1827 = -1;
                    } else if (arg0.field1795 < 0 || arg0.field1795 >= var5.field6775.length) {
                        arg0.field1827 = -1;
                        arg0.field1799 = null;
                    } else if (!arg0.field1823) {
                        class586.method3259(arg0, arg1 + 1, var5, arg0.field1795);
                    }
                }
                arg0.field1870 = arg0.field1795 + 1;
                if (arg0.field1870 >= var5.field6775.length) {
                    arg0.field1870 -= var5.field6789;
                    if (var5.field6785 <= (arg0.field1817 + 1)) {
                        arg0.field1870 = -1;
                    } else if (arg0.field1870 < 0 || arg0.field1870 >= var5.field6775.length) {
                        arg0.field1870 = -1;
                    }
                }
            }
        }
        if (arg1 > ~arg0.field1829) {
            arg0.field1829--;
        }
        for (int var6 = 0; var6 < arg0.field1859.length; var6++) {
            class545 var7 = arg0.field1859[var6];
            if (var7 != null) {
                if (var7.field7390 > 0) {
                    var7.field7390--;
                } else {
                    class489 var8 = class6.field65.method1034(var7.field7394, 0);
                    if (var8 == null || var8.field6775 == null) {
                        arg0.field1859[var6] = null;
                    } else {
                        var7.field7391++;
                        if (var7.field7385 < var8.field6775.length && var7.field7391 > var8.field6773[var7.field7385]) {
                            var7.field7385++;
                            var7.field7391 = 1;
                            if (!arg0.field1823) {
                                class586.method3259(arg0, ~arg1, var8, var7.field7385);
                            }
                        }
                        if (var8.field6775.length <= var7.field7385) {
                            var7.field7385 -= var8.field6789;
                            var7.field7386++;
                            if (var8.field6785 <= var7.field7386) {
                                arg0.field1859[var6] = null;
                            } else if (var7.field7385 < 0 || var7.field7385 >= var8.field6775.length) {
                                arg0.field1859[var6] = null;
                            } else if (!arg0.field1823) {
                                class586.method3259(arg0, 0, var8, var7.field7385);
                            }
                        }
                        var7.field7388 = var7.field7385 + 1;
                        if (var7.field7388 >= var8.field6775.length) {
                            var7.field7388 -= var8.field6789;
                            if (var8.field6785 <= var7.field7386 + 1) {
                                var7.field7388 = -1;
                            } else if (var7.field7388 < 0 || var8.field6775.length <= var7.field7388) {
                                var7.field7388 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static final void method1073(int arg0) {
        field2031++;
        if (class69.field968 == -1) {
            return;
        }
        int var1 = class304.field4371.method778(0);
        int var2 = class304.field4371.method777((byte) 93);
        class504 var3 = (class504) class289.field4242.method2551((byte) -108);
        if (var3 != null) {
            var1 = var3.method1038(8);
            var2 = var3.method1036(5);
        }
        int var4 = 0;
        int var5 = 0;
        if (class130.field1934) {
            var4 = class550.method3117(99);
            var5 = class621.method3410(-2);
        }
        if (arg0 != -1) {
            method1073(-11);
        }
        class481.method2803(var4, var2, var5, class593.field8019 + var4, (byte) 107, var1, var4, var1 + var4, class69.field968, class140.field2048 + var5, var5, var2 + var5);
        if (class474.field6605 != null) {
            class191.method1317(var1 + var4, false, var2 + var5);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)J")
    public static final long method1074(int arg0, int arg1) {
        field2022++;
        return arg1 >= 0 ? 53L : (long) (arg0 + 11745) * 86400000L;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public static void method1075(int arg0) {
        if (arg0 != -1) {
            method1072(null, -23);
        }
        field2027 = null;
    }
}
