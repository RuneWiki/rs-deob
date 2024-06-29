import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class231 {

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3501 = new String[] { method1984(method1983("Wz;P\u001f")), method1984(method1983("Wz;V\u001f")), method1984(method1983("O!;:J")), method1984(method1983("Zzyx")), method1984(method1983("Wz;Q\u001f")), method1984(method1983("Wz;U\u001f")) };

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "Lel;")
    public static class573 field3497 = new class573(51, 6);

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "Lwu;")
    public static class391 field3499;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BIIILec;)V", line = 5)
    public static final void method1978(byte arg0, int arg1, int arg2, int arg3, class247 arg4) {
        try {
            field3498++;
            class144 var5 = arg4.method2099(110);
            int var6 = arg4.field3845 - arg4.field3839.field3110 & 0x3FFF;
            if (arg0 == arg3) {
                if (var6 != 0 || arg4.field3792 > 25) {
                    if (arg2 < 0 && var5.field1771 != -1) {
                        arg4.field3796 = var5.field1771;
                        arg4.field3849 = false;
                    } else if (arg2 <= 0 || var5.field1775 == -1) {
                        arg4.field3796 = var5.field1770;
                    } else {
                        arg4.field3796 = var5.field1775;
                    }
                    arg4.field3849 = false;
                } else if (!arg4.field3849 || !var5.method1221(arg4.field3796, true)) {
                    arg4.field3796 = var5.method1220(arg0);
                    arg4.field3849 = arg4.field3796 != -1;
                }
            } else if (arg4.field3842 != -1 && (var6 >= 10240 || var6 <= 2048)) {
                int var7 = class184.field2552[arg1] - arg4.field3839.field3110 & 0x3FFF;
                if (arg3 == 2 && var5.field1729 != -1) {
                    if (var7 > 2048 && var7 <= 6144 && var5.field1763 != -1) {
                        arg4.field3796 = var5.field1763;
                    } else if (var7 >= 10240 && var7 < 14336 && var5.field1748 != -1) {
                        arg4.field3796 = var5.field1748;
                    } else if (var7 <= 6144 || var7 >= 10240 || var5.field1742 == -1) {
                        arg4.field3796 = var5.field1729;
                    } else {
                        arg4.field3796 = var5.field1742;
                    }
                } else if (arg3 == 0 && var5.field1725 != -1) {
                    if (var7 > 2048 && var7 <= 6144 && var5.field1745 != -1) {
                        arg4.field3796 = var5.field1745;
                    } else if (var7 >= 10240 && var7 < 14336 && var5.field1735 != -1) {
                        arg4.field3796 = var5.field1735;
                    } else if (var7 <= 6144 || var7 >= 10240 || var5.field1773 == -1) {
                        arg4.field3796 = var5.field1725;
                    } else {
                        arg4.field3796 = var5.field1773;
                    }
                } else if (var7 > 2048 && var7 <= 6144 && var5.field1750 != -1) {
                    arg4.field3796 = var5.field1750;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field1762 != -1) {
                    arg4.field3796 = var5.field1762;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field1768 == -1) {
                    arg4.field3796 = var5.field1770;
                } else {
                    arg4.field3796 = var5.field1768;
                }
                arg4.field3849 = false;
            } else if (var6 == 0 && arg4.field3792 <= 25) {
                if (arg3 == 2 && var5.field1729 != -1) {
                    arg4.field3796 = var5.field1729;
                } else if (arg3 == 0 && var5.field1725 != -1) {
                    arg4.field3796 = var5.field1725;
                } else {
                    arg4.field3796 = var5.field1770;
                }
                arg4.field3849 = false;
            } else {
                arg4.field3849 = false;
                if (arg3 == 2 && var5.field1729 != -1) {
                    if (arg2 < 0 && var5.field1743 != -1) {
                        arg4.field3796 = var5.field1743;
                    } else if (arg2 <= 0 || var5.field1760 == -1) {
                        arg4.field3796 = var5.field1729;
                    } else {
                        arg4.field3796 = var5.field1760;
                    }
                } else if (arg3 == 0 && var5.field1725 != -1) {
                    if (arg2 < 0 && var5.field1747 != -1) {
                        arg4.field3796 = var5.field1747;
                    } else if (arg2 <= 0 || var5.field1757 == -1) {
                        arg4.field3796 = var5.field1725;
                    } else {
                        arg4.field3796 = var5.field1757;
                    }
                } else if (arg2 < 0 && var5.field1746 != -1) {
                    arg4.field3796 = var5.field1746;
                } else if (arg2 <= 0 || var5.field1754 == -1) {
                    arg4.field3796 = var5.field1770;
                } else {
                    arg4.field3796 = var5.field1754;
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field3501[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field3501[3] : field3501[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IBI)Z", line = 169)
    public static final boolean method1979(int arg0, byte arg1, int arg2) {
        try {
            if (arg1 > -116) {
                return true;
            } else {
                field3500++;
                return (arg0 & 0x8000) != 0;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3501[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)Z", line = 181)
    public static final boolean method1980(int arg0, int arg1, int arg2) {
        try {
            field3496++;
            if (arg2 >= 0 && arg1 >= 0 && arg2 < class184.field2545[1].length && class184.field2545[1][arg2].length > arg1) {
                return (class184.field2545[arg0][arg2][arg1] & 0x2) != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3501[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z[[[BIBIIZ)V", line = 201)
    public static final void method1981(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class416.field6133 = 0;
        class116.field1384 = 0;
        class178.field2481++;
        if ((arg5 & 0x2) == 0) {
            for (class420 var8 = class106.field1228[var7]; var8 != null; var8 = var8.field6207) {
                if (!class646.method4753(var8, arg0, arg1, arg2, arg3)) {
                    class203.method1808(var8);
                    if (var8.field6208 != -1) {
                        class776.field11278[class416.field6133++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 0x1) == 0) {
            for (class420 var9 = class273.field4136[var7]; var9 != null; var9 = var9.field6207) {
                if (!class646.method4753(var9, arg0, arg1, arg2, arg3)) {
                    class203.method1808(var9);
                    if (var9.field6208 != -1) {
                        class238.field3604[class116.field1384++] = var9;
                    }
                }
            }
            for (class420 var10 = class74.field862[var7]; var10 != null; var10 = var10.field6207) {
                if (!class646.method4753(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method1098(false)) {
                        class203.method1808(var10);
                        if (var10.field6208 != -1) {
                            class238.field3604[class116.field1384++] = var10;
                        }
                    } else {
                        class203.method1808(var10);
                        if (var10.field6208 != -1) {
                            class776.field11278[class416.field6133++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class272.field4124; var11++) {
                    if (!class646.method4753(class400.field5975[var11], arg0, arg1, arg2, arg3)) {
                        class203.method1808(class400.field5975[var11]);
                        if (class400.field5975[var11].field6208 != -1) {
                            if (class400.field5975[var11].method1098(false)) {
                                class238.field3604[class116.field1384++] = class400.field5975[var11];
                            } else {
                                class776.field11278[class416.field6133++] = class400.field5975[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class416.field6133 > 0) {
            class376.method3033(class776.field11278, 0, class416.field6133 - 1);
            for (int var12 = 0; var12 < class416.field6133; var12++) {
                class288.method2342(class776.field11278[var12], true, arg6);
            }
        }
        if (class142.field1713) {
            class606.field8877.method573(0, null);
        }
        if ((arg5 & 0x2) == 0) {
            for (int var13 = class156.field1944; var13 < class501.field7246; var13++) {
                if (var13 < arg2 || arg1 == null) {
                    int var23 = class91.field1038.length;
                    if (class91.field1038.length + class265.field4055 > class132.field1543) {
                        var23 -= class91.field1038.length + class265.field4055 - class132.field1543;
                    }
                    int var24 = class91.field1038[0].length;
                    if (class91.field1038[0].length + class550.field8200 > class216.field3296) {
                        var24 -= class91.field1038[0].length + class550.field8200 - class216.field3296;
                    }
                    boolean[][] var25 = class11.field135;
                    if (class121.field1431) {
                        if (class329.field5187) {
                            var25 = class549.field8190[var13];
                        }
                        for (int var26 = class252.field3905; var26 < var23; var26++) {
                            int var27 = class265.field4055 + var26 - class252.field3905;
                            for (int var28 = class660.field9544; var28 < var24; var28++) {
                                if (class91.field1038[var26][var28] && !class56.method418(class550.field8200 + var28 - class660.field9544, var13, 119, var27)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class329.field5187) {
                        if (arg4 >= 0) {
                            class555.field8261[var13].method1515(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class555.field8261[var13].method1513(0, 0, 0, null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class630.field9216; var29++) {
                            class180.field2498[var29].method2143(-112, new class232(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class555.field8261[var13].method1515(class247.field3811, class5.field52, class396.field5921, class11.field135, true, arg4, arg5);
                    } else {
                        class555.field8261[var13].method1513(class247.field3811, class5.field52, class396.field5921, class11.field135, true, arg5);
                    }
                } else {
                    int var14 = class91.field1038.length;
                    if (class91.field1038.length + class265.field4055 > class132.field1543) {
                        var14 -= class91.field1038.length + class265.field4055 - class132.field1543;
                    }
                    int var15 = class91.field1038[0].length;
                    if (class91.field1038[0].length + class550.field8200 > class216.field3296) {
                        var15 -= class91.field1038[0].length + class550.field8200 - class216.field3296;
                    }
                    boolean[][] var16 = class11.field135;
                    if (class121.field1431) {
                        if (class329.field5187) {
                            var16 = class549.field8190[var13];
                        }
                        for (int var17 = class252.field3905; var17 < var14; var17++) {
                            int var18 = class265.field4055 + var17 - class252.field3905;
                            for (int var19 = class660.field9544; var19 < var15; var19++) {
                                var16[var17][var19] = false;
                                if (class91.field1038[var17][var19]) {
                                    int var20 = class550.field8200 + var19 - class660.field9544;
                                    for (int var21 = var13; var21 >= 0; var21--) {
                                        if (class734.field10683[var21][var18][var20] != null && class734.field10683[var21][var18][var20].field1083 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class56.method418(var20, var13, 115, var18)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class329.field5187) {
                        if (arg4 >= 0) {
                            class555.field8261[var13].method1515(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class555.field8261[var13].method1513(0, 0, 0, null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class630.field9216; var22++) {
                            class180.field2498[var22].method2143(-47, new class232(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class555.field8261[var13].method1515(class247.field3811, class5.field52, class396.field5921, class11.field135, false, arg4, arg5);
                    } else {
                        class555.field8261[var13].method1513(class247.field3811, class5.field52, class396.field5921, class11.field135, false, arg5);
                    }
                }
            }
        }
        if (class116.field1384 > 0) {
            class275.method2270(class238.field3604, 0, class116.field1384 - 1);
            for (int var30 = 0; var30 < class116.field1384; var30++) {
                class288.method2342(class238.field3604[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V", line = 503)
    public static void method1982(int arg0) {
        try {
            if (arg0 >= -33) {
                field3499 = null;
            }
            field3499 = null;
            field3497 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3501[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1983(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x37);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1984(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 52;
                    break;
                case 1:
                    var10005 = 15;
                    break;
                case 2:
                    var10005 = 21;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 55;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
