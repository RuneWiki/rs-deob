import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class15 {

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field216 = 0;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "Lfa;")
    public static class273 field215;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static void method97(int arg0) {
        if (arg0 >= -120) {
            field215 = null;
        }
        field215 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lpd;B)V")
    public static final void method98(class58 arg0, byte arg1) {
        arg0.field863 = false;
        if (arg0.field857 != -1) {
            class200 var2 = class196.method1359(arg0.field857, (byte) 21);
            if (var2 == null || var2.field3167 == null) {
                arg0.field857 = -1;
            } else {
                arg0.field825++;
                if (arg0.field808 < var2.field3167.length && arg0.field825 > var2.field3168[arg0.field808]) {
                    arg0.field838++;
                    arg0.field825 = 1;
                    arg0.field808++;
                    class49.method303(false, class309.field5006 == arg0, arg0.field836, arg0.field808, var2, arg0.field850);
                }
                if (arg0.field808 >= var2.field3167.length) {
                    arg0.field808 = 0;
                    arg0.field825 = 0;
                    class49.method303(false, class309.field5006 == arg0, arg0.field836, arg0.field808, var2, arg0.field850);
                }
                arg0.field838 = arg0.field808 + 1;
                if (arg0.field838 >= var2.field3167.length) {
                    arg0.field838 = 0;
                }
            }
        }
        field219++;
        if (arg0.field870 != -1 && class4.field32 >= arg0.field827) {
            class119 var3 = class278.method1939(arg0.field870, (byte) -121);
            int var4 = var3.field1810;
            if (var4 == -1) {
                arg0.field870 = -1;
            } else {
                label295: {
                    class200 var5 = class196.method1359(var4, (byte) 21);
                    if (var3.field1833) {
                        if (var5.field3178 == 3) {
                            if (arg0.field856 > 0 && arg0.field812 <= class4.field32 && arg0.field845 < class4.field32) {
                                arg0.field870 = -1;
                                break label295;
                            }
                        } else if (var5.field3178 == 1 && arg0.field856 > 0 && arg0.field812 <= class4.field32 && class4.field32 > arg0.field845) {
                            arg0.field827 = class4.field32 + 1;
                            break label295;
                        }
                    }
                    if (var5 == null || var5.field3167 == null) {
                        arg0.field870 = -1;
                    } else {
                        if (arg0.field829 < 0) {
                            arg0.field829 = 0;
                            class49.method303(false, class309.field5006 == arg0, arg0.field836, 0, var5, arg0.field850);
                        }
                        arg0.field830++;
                        if (arg0.field829 < var5.field3167.length && var5.field3168[arg0.field829] < arg0.field830) {
                            arg0.field830 = 1;
                            arg0.field829++;
                            class49.method303(false, class309.field5006 == arg0, arg0.field836, arg0.field829, var5, arg0.field850);
                        }
                        if (var5.field3167.length <= arg0.field829) {
                            if (var3.field1833) {
                                arg0.field829 -= var5.field3191;
                                arg0.field826++;
                                if (arg0.field826 >= var5.field3185) {
                                    arg0.field870 = -1;
                                } else if (arg0.field829 >= 0 && var5.field3167.length > arg0.field829) {
                                    class49.method303(false, class309.field5006 == arg0, arg0.field836, arg0.field829, var5, arg0.field850);
                                } else {
                                    arg0.field870 = -1;
                                }
                            } else {
                                arg0.field870 = -1;
                            }
                        }
                        arg0.field799 = arg0.field829 + 1;
                        if (var5.field3167.length <= arg0.field799) {
                            if (var3.field1833) {
                                arg0.field799 -= var5.field3191;
                                if (arg0.field826 + 1 >= var5.field3185) {
                                    arg0.field799 = -1;
                                } else if (arg0.field799 < 0 || var5.field3167.length <= arg0.field799) {
                                    arg0.field799 = -1;
                                }
                            } else {
                                arg0.field799 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field853 != -1 && arg0.field883 <= 1) {
            class200 var6 = class196.method1359(arg0.field853, (byte) 21);
            if (var6.field3178 == 3) {
                if (arg0.field856 > 0 && class4.field32 >= arg0.field812 && class4.field32 > arg0.field845) {
                    arg0.field853 = -1;
                }
            } else if (var6.field3178 == 1 && arg0.field856 > 0 && arg0.field812 <= class4.field32 && class4.field32 > arg0.field845) {
                arg0.field883 = 2;
            }
        }
        if (arg1 <= 36) {
            method98((class58) null, (byte) -78);
        }
        if (arg0.field853 != -1 && arg0.field883 == 0) {
            class200 var7 = class196.method1359(arg0.field853, (byte) 21);
            if (var7 == null || var7.field3167 == null) {
                arg0.field853 = -1;
            } else {
                arg0.field873++;
                if (var7.field3167.length > arg0.field813 && var7.field3168[arg0.field813] < arg0.field873) {
                    arg0.field873 = 1;
                    arg0.field813++;
                    class49.method303(false, class309.field5006 == arg0, arg0.field836, arg0.field813, var7, arg0.field850);
                }
                if (arg0.field813 >= var7.field3167.length) {
                    arg0.field813 -= var7.field3191;
                    arg0.field889++;
                    if (var7.field3185 <= arg0.field889) {
                        arg0.field853 = -1;
                    } else if (arg0.field813 >= 0 && arg0.field813 < var7.field3167.length) {
                        class49.method303(false, class309.field5006 == arg0, arg0.field836, arg0.field813, var7, arg0.field850);
                    } else {
                        arg0.field853 = -1;
                    }
                }
                arg0.field867 = arg0.field813 + 1;
                if (var7.field3167.length <= arg0.field867) {
                    arg0.field867 -= var7.field3191;
                    if ((arg0.field889 + 1) >= var7.field3185) {
                        arg0.field867 = -1;
                    } else if (arg0.field867 < 0 || var7.field3167.length <= arg0.field867) {
                        arg0.field867 = -1;
                    }
                }
                arg0.field863 = var7.field3170;
            }
        }
        if (arg0.field883 > 0) {
            arg0.field883--;
        }
        for (int var8 = 0; var8 < arg0.field851.length; var8++) {
            class219 var9 = arg0.field851[var8];
            if (var9 != null) {
                if (var9.field3490 > 0) {
                    var9.field3490--;
                } else {
                    class200 var10 = class196.method1359(var9.field3493, (byte) 21);
                    if (var10 == null || var10.field3167 == null) {
                        arg0.field851[var8] = null;
                    } else {
                        var9.field3498++;
                        if (var9.field3495 < var10.field3167.length && var10.field3168[var9.field3495] < var9.field3498) {
                            var9.field3495++;
                            var9.field3498 = 1;
                            class49.method303(false, class309.field5006 == arg0, arg0.field836, var9.field3495, var10, arg0.field850);
                        }
                        if (var9.field3495 >= var10.field3167.length) {
                            var9.field3495 -= var10.field3191;
                            var9.field3497++;
                            if (var9.field3497 >= var10.field3185) {
                                arg0.field851[var8] = null;
                            } else if (var9.field3495 >= 0 && var10.field3167.length > var9.field3495) {
                                class49.method303(false, class309.field5006 == arg0, arg0.field836, var9.field3495, var10, arg0.field850);
                            } else {
                                arg0.field851[var8] = null;
                            }
                        }
                        var9.field3492 = var9.field3495 + 1;
                        if (var9.field3492 >= var10.field3167.length) {
                            var9.field3492 -= var10.field3191;
                            if (var10.field3185 <= (var9.field3497 + 1)) {
                                var9.field3492 = -1;
                            } else if (var9.field3492 < 0 || var9.field3492 >= var10.field3167.length) {
                                var9.field3492 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLfa;)V")
    public static final void method99(byte arg0, class273 arg1) {
        field218++;
        class207.field3308 = arg1.method1895("runes", false);
        int var2 = -40 / ((70 - arg0) / 54);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
    public static final void method100(int arg0) {
        for (int var1 = -1; var1 < class249.field3964; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class53.field713[var1];
            }
            class208 var3 = class300.field4925[var2];
            if (var3 != null) {
                class3.method10(var3, 22301, var3.method362(25892));
            }
        }
        if (arg0 > -6) {
            field215 = null;
        }
        field221++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILwi;IIII)V")
    public static final void method101(int arg0, int arg1, class142 arg2, int arg3, int arg4, int arg5, int arg6) {
        long var7 = 0L;
        field217++;
        if (arg3 == 0) {
            var7 = class194.method1344(arg1, arg5, arg6);
        } else if (arg3 == 1) {
            var7 = class76.method498(arg1, arg5, arg6);
        } else if (arg3 == 2) {
            var7 = class186.method1268(arg1, arg5, arg6);
        } else if (arg3 == 3) {
            var7 = class9.method48(arg1, arg5, arg6);
        }
        if (arg4 < 49) {
            return;
        }
        boolean var9 = true;
        int var10 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        boolean var11 = false;
        boolean var12 = false;
        class74 var13 = class216.method1510(0, var10);
        int var14 = (int) var7 >> 20 & 0x3;
        if (var13.method475(0)) {
            class313.method2121(var13, 8, arg6, arg1, arg5);
        }
        int var15 = ((int) var7 & 0x7FDA4) >> 14;
        if (var7 == 0L) {
            return;
        }
        if (arg3 == 0) {
            class306.method2095(arg1, arg5, arg6);
            if (var13.field1125 != 0) {
                arg2.method949(var13.field1092, (byte) -104, var14, var15, arg5, !var13.field1097, arg6);
            }
        } else if (arg3 == 1) {
            class94.method607(arg1, arg5, arg6);
        } else if (arg3 == 2) {
            class121.method788(arg1, arg5, arg6);
            if (var13.field1125 != 0 && (arg5 + var13.field1169) < 104 && var13.field1169 + arg6 < 104 && (var13.field1151 + arg5) < 104 && (arg6 + var13.field1151) < 104) {
                arg2.method959(var13.field1169, (byte) -46, var14, arg6, arg5, var13.field1092, var13.field1151, !var13.field1097);
            }
        } else if (arg3 == 3) {
            class47.method293(arg1, arg5, arg6);
            if (var13.field1125 == 1) {
                arg2.method946((byte) 110, arg5, arg6);
            }
        }
        if (var13.field1149 != null) {
            class74 var20 = var13.method488(-93);
            return;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public static final void method102(byte arg0) {
        if (arg0 <= 106) {
            method101(89, -4, (class142) null, -34, -117, 80, 92);
        }
        field220++;
        class192.field3045.method144(0);
        class175.field2733.method144(0);
    }
}
