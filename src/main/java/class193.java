import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class193 {

    @OriginalMember(owner = "client!la", name = "d", descriptor = "F")
    public static float field2888 = 0.0F;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "[Lwj;")
    public static class270[] field2886;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZBI[Ltb;I)V", line = 9)
    public static final void method1372(int arg0, boolean arg1, byte arg2, int arg3, class220[] arg4, int arg5) {
        if (arg2 > -25) {
            method1377((byte) 39, (class220) null, (String) null);
        }
        field2885++;
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class220 var7 = arg4[var6];
            if (var7 != null && var7.field3393 == arg3) {
                class332.method2309(arg1, true, var7, arg0, arg5);
                class292.method1996(arg5, arg0, var7, 120);
                if (var7.field3370 - var7.field3526 < var7.field3367) {
                    var7.field3367 = var7.field3370 - var7.field3526;
                }
                if ((var7.field3465 - var7.field3458) < var7.field3426) {
                    var7.field3426 = var7.field3465 - var7.field3458;
                }
                if (var7.field3426 < 0) {
                    var7.field3426 = 0;
                }
                if (var7.field3367 < 0) {
                    var7.field3367 = 0;
                }
                if (var7.field3468 == 0) {
                    class96.method714(arg1, (byte) 71, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILmd;)V", line = 58)
    public static final void method1373(int arg0, class123 arg1) {
        if (class227.field3618 == arg1.field1856 || arg1.field1912 == -1 || arg1.field1881 != 0 || arg1.field1880 + 1 > class133.method948(arg1.field1912, (byte) 33).field4322[arg1.field1952]) {
            int var2 = class227.field3618 - arg1.field1870;
            int var3 = arg1.field1856 - arg1.field1870;
            int var4 = arg1.field1915 * 128 + arg1.method280(false) * 64;
            int var5 = arg1.field1867 * 128 + arg1.method280(false) * 64;
            int var6 = arg1.field1894 * 128 + arg1.method280(false) * 64;
            int var7 = arg1.field1930 * 128 + (arg1.method280(false) * 64);
            arg1.field1905 = ((var3 - var2) * var4 + var2 * var6) / var3;
            arg1.field1868 = ((var3 - var2) * var5 + var2 * var7) / var3;
        }
        arg1.field1877 = 0;
        if (arg0 <= 100) {
            field2886 = (class270[]) null;
        }
        if (arg1.field1860 == 0) {
            arg1.field1858 = 1024;
        }
        if (arg1.field1860 == 1) {
            arg1.field1858 = 1536;
        }
        field2891++;
        if (arg1.field1860 == 2) {
            arg1.field1858 = 0;
        }
        if (arg1.field1860 == 3) {
            arg1.field1858 = 512;
        }
        arg1.field1939 = arg1.field1858;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BC)Z", line = 105)
    public static final boolean method1374(byte arg0, char arg1) {
        if (arg0 != -111) {
            field2886 = (class270[]) null;
        }
        field2887++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 116)
    public static void method1375(byte arg0) {
        if (arg0 >= -33) {
            field2888 = -1.0402687F;
        }
        field2886 = null;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(ILmd;)V", line = 126)
    public static final void method1376(int arg0, class123 arg1) {
        field2889++;
        if (arg1.field1941 == 0) {
            return;
        }
        class333 var2 = arg1.method888(arg0 - 2047);
        if (arg1.field1853 != -1 && arg1.field1853 < 32768) {
            class313 var3 = class254.field3989[arg1.field1853];
            if (var3 != null) {
                int var4 = arg1.field1905 - var3.field1905;
                int var5 = arg1.field1868 - var3.field1868;
                if (var4 != 0 || var5 != 0) {
                    arg1.field1858 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1853 >= 32768) {
            int var6 = arg1.field1853 - 32768;
            if (class120.field1837 == var6) {
                var6 = 2047;
            }
            class33 var7 = class254.field3992[var6];
            if (var7 != null) {
                int var8 = arg1.field1905 - var7.field1905;
                int var9 = arg1.field1868 - var7.field1868;
                if (var8 != 0 || var9 != 0) {
                    arg1.field1858 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field1917 != 0 || arg1.field1929 != 0) && (arg1.field1918 == 0 || arg1.field1877 > 0)) {
            int var10 = arg1.field1905 - (arg1.field1917 - class213.field3249 - class213.field3249) * 64;
            int var11 = arg1.field1868 - ((arg1.field1929 - class342.field5328 - class342.field5328) * 64);
            if (var10 != 0 || var11 != 0) {
                arg1.field1858 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg1.field1929 = 0;
            arg1.field1917 = 0;
        }
        int var12 = arg0 & arg1.field1858 - arg1.field1939;
        if (var12 == 0) {
            arg1.field1869 = 0;
            arg1.field1897 = 0;
        } else if (var2.field5221 == 0) {
            arg1.field1869++;
            if (var12 > 1024) {
                arg1.field1939 -= arg1.field1941;
                boolean var13 = true;
                if (var12 < arg1.field1941 || var12 > 2048 - arg1.field1941) {
                    arg1.field1939 = arg1.field1858;
                    var13 = false;
                }
                if (arg1.field1869 > 25 || var13) {
                    arg1.field1872 = var2.field5210;
                    if (arg1.field1918 > 0) {
                        if (arg1.field1903[arg1.field1918 - 1] == 2) {
                            if (var2.field5222 != -1) {
                                arg1.field1872 = var2.field5222;
                            } else if (var2.field5180 != -1) {
                                arg1.field1872 = var2.field5180;
                            }
                        } else if (arg1.field1903[arg1.field1918 - 1] == 0) {
                            if (var2.field5183 != -1) {
                                arg1.field1872 = var2.field5183;
                            } else if (var2.field5185 != -1) {
                                arg1.field1872 = var2.field5185;
                            }
                        } else if (var2.field5191 != -1) {
                            arg1.field1872 = var2.field5191;
                        }
                    } else if (var2.field5213 != -1) {
                        arg1.field1872 = var2.field5213;
                    }
                }
            } else {
                boolean var14 = true;
                arg1.field1939 += arg1.field1941;
                if (var12 < arg1.field1941 || 2048 - arg1.field1941 < var12) {
                    arg1.field1939 = arg1.field1858;
                    var14 = false;
                }
                if (arg1.field1869 > 25 || var14) {
                    arg1.field1872 = var2.field5210;
                    if (arg1.field1918 > 0) {
                        if (arg1.field1903[arg1.field1918 - 1] == 2) {
                            if (var2.field5179 != -1) {
                                arg1.field1872 = var2.field5179;
                            } else if (var2.field5180 != -1) {
                                arg1.field1872 = var2.field5180;
                            }
                        } else if (arg1.field1903[arg1.field1918 - 1] == 0) {
                            if (var2.field5220 != -1) {
                                arg1.field1872 = var2.field5220;
                            } else if (var2.field5185 != -1) {
                                arg1.field1872 = var2.field5185;
                            }
                        } else if (var2.field5201 != -1) {
                            arg1.field1872 = var2.field5201;
                        }
                    } else if (var2.field5207 != -1) {
                        arg1.field1872 = var2.field5207;
                    }
                }
            }
            arg1.field1939 &= 0x7FF;
        } else {
            arg1.field1872 = -1;
            int var15 = arg1.field1858 << 5;
            if (arg1.field1886 != var15) {
                arg1.field1886 = var15;
                arg1.field1942 = 0;
                int var16 = var15 - arg1.field1871 & 0xFFFF;
                int var17 = arg1.field1897 * arg1.field1897 / (var2.field5221 * 2);
                if (arg1.field1897 > 0 && var16 >= var17 && (var16 - var17) < 32768) {
                    int var18 = var2.field5182 * var2.field5182 / (var2.field5221 * 2);
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    arg1.field1874 = true;
                    arg1.field1875 = var16 / 2;
                    if (arg1.field1875 > var18) {
                        arg1.field1875 = var16 - var18;
                    }
                } else if (arg1.field1897 < 0 && var17 <= (65536 - var16) && (65536 - var16 - var17) < 32768) {
                    arg1.field1874 = true;
                    arg1.field1875 = (65536 - var16) / 2;
                    int var19 = var2.field5182 * var2.field5182 / (var2.field5221 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var19 < arg1.field1875) {
                        arg1.field1875 = 65536 - var16 - var19;
                    }
                } else {
                    arg1.field1874 = false;
                }
            }
            if (arg1.field1897 == 0) {
                int var20 = arg1.field1886 - arg1.field1871 & 0xFFFF;
                if (var20 >= var2.field5221) {
                    arg1.field1942 = 0;
                    arg1.field1874 = true;
                    int var21 = var2.field5182 * var2.field5182 / (var2.field5221 * 2);
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    if (var20 < 32768) {
                        arg1.field1897 = var2.field5221;
                        arg1.field1875 = var20 / 2;
                        if (arg1.field1875 > var21) {
                            arg1.field1875 = var20 - var21;
                        }
                    } else {
                        arg1.field1875 = (65536 - var20) / 2;
                        if (var21 < arg1.field1875) {
                            arg1.field1875 = 65536 - var20 - var21;
                        }
                        arg1.field1897 = -var2.field5221;
                    }
                } else {
                    arg1.field1871 = arg1.field1886;
                }
            } else if (arg1.field1897 > 0) {
                if (arg1.field1942 >= arg1.field1875) {
                    arg1.field1874 = false;
                }
                if (!arg1.field1874) {
                    arg1.field1897 -= var2.field5221;
                    if (arg1.field1897 < 0) {
                        arg1.field1897 = 0;
                    }
                } else if (arg1.field1897 < var2.field5182) {
                    arg1.field1897 += var2.field5221;
                }
            } else {
                if (arg1.field1942 >= arg1.field1875) {
                    arg1.field1874 = false;
                }
                if (!arg1.field1874) {
                    arg1.field1897 += var2.field5221;
                    if (arg1.field1897 > 0) {
                        arg1.field1897 = 0;
                    }
                } else if ((-var2.field5182) < arg1.field1897) {
                    arg1.field1897 -= var2.field5221;
                }
            }
            arg1.field1871 += arg1.field1897;
            if (arg1.field1897 <= 0) {
                arg1.field1942 -= arg1.field1897;
            } else {
                arg1.field1942 += arg1.field1897;
            }
            arg1.field1871 &= 0xFFFF;
            arg1.field1939 = arg1.field1871 >> 5;
            if (arg1.field1897 >= 0) {
                if (arg1.field1918 > 0) {
                    if (arg1.field1903[arg1.field1918 - 1] == 2) {
                        if (var2.field5179 != -1) {
                            arg1.field1872 = var2.field5179;
                        } else if (var2.field5180 != -1) {
                            arg1.field1872 = var2.field5180;
                        }
                    } else if (arg1.field1903[arg1.field1918 - 1] == 0) {
                        if (var2.field5220 != -1) {
                            arg1.field1872 = var2.field5220;
                        } else if (var2.field5185 != -1) {
                            arg1.field1872 = var2.field5185;
                        }
                    }
                }
                if (arg1.field1872 == -1) {
                    if (var2.field5201 != -1) {
                        arg1.field1872 = var2.field5201;
                    } else if (var2.field5207 != -1) {
                        arg1.field1872 = var2.field5207;
                    }
                }
            } else {
                if (arg1.field1918 > 0) {
                    if (arg1.field1903[arg1.field1918 - 1] == 2) {
                        if (var2.field5222 != -1) {
                            arg1.field1872 = var2.field5222;
                        } else if (var2.field5180 != -1) {
                            arg1.field1872 = var2.field5180;
                        }
                    } else if (arg1.field1903[arg1.field1918 - 1] == 0) {
                        if (var2.field5183 != -1) {
                            arg1.field1872 = var2.field5183;
                        } else if (var2.field5185 != -1) {
                            arg1.field1872 = var2.field5185;
                        }
                    }
                }
                if (arg1.field1872 == -1) {
                    if (var2.field5191 != -1) {
                        arg1.field1872 = var2.field5191;
                    } else if (var2.field5213 != -1) {
                        arg1.field1872 = var2.field5213;
                    }
                }
            }
            if (arg1.field1872 == -1) {
                arg1.field1872 = var2.field5210;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLtb;Ljava/lang/String;)Ljava/lang/String;", line = 569)
    public static final String method1377(byte arg0, class220 arg1, String arg2) {
        if (arg2.indexOf("%") != -1) {
            label54: while (true) {
                int var3 = arg2.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label54;
                                                        }
                                                        String var9 = "";
                                                        if (class176.field2675 != null) {
                                                            if (class176.field2675.field2959 == null) {
                                                                var9 = class338.method2353(class176.field2675.field2960, 22719);
                                                            } else {
                                                                var9 = (String) class176.field2675.field2959;
                                                            }
                                                        }
                                                        arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                    }
                                                }
                                                arg2 = arg2.substring(0, var7) + class292.method1997((byte) -85, class218.method1537(arg1, 4, 20)) + arg2.substring(var7 + 2);
                                            }
                                        }
                                        arg2 = arg2.substring(0, var6) + class292.method1997((byte) -114, class218.method1537(arg1, 3, 20)) + arg2.substring(var6 + 2);
                                    }
                                }
                                arg2 = arg2.substring(0, var5) + class292.method1997((byte) -114, class218.method1537(arg1, 2, 20)) + arg2.substring(var5 + 2);
                            }
                        }
                        arg2 = arg2.substring(0, var4) + class292.method1997((byte) -112, class218.method1537(arg1, 1, 20)) + arg2.substring(var4 + 2);
                    }
                }
                arg2 = arg2.substring(0, var3) + class292.method1997((byte) -105, class218.method1537(arg1, 0, 20)) + arg2.substring(var3 + 2);
            }
        }
        field2890++;
        int var10 = 34 % ((arg0 - 61) / 34);
        return arg2;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLsl;)Lsl;")
    public abstract class39 method19(byte arg0, class39 arg1);
}
