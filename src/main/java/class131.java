import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class131 implements class105 {

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public int field1859;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "I")
    public int field1874;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public int field1870;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
    public int field1877;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public int field1862;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "Ltda;")
    public class666 field1865;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public int field1869;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "Ljk;")
    public class662 field1875;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    public int field1872;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1878 = new String[] { method1246(method1245("1}\u001de=")), method1246(method1245("->\u001d\rh")), method1246(method1245("8e_O")), method1246(method1245("1}\u001dd=")), method1246(method1245("1}\u001da=")), method1246(method1245("1}\u001df=")), method1246(method1245("1}\u001d\u001f|8yG\u001d=")) };

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "[S")
    private static short[] field1860 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "[S")
    private static short[] field1863 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "[S")
    private static short[] field1864 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field1868 = 0;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "[S")
    private static short[] field1867 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "[[S")
    public static short[][] field1876 = new short[][] { field1860, field1867, field1864, field1863 };

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "J")
    public static long field1861;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)Lwh;", line = 4)
    public class155 method989(boolean arg0) {
        try {
            if (arg0) {
                return null;
            } else {
                field1871++;
                return null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1878[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BZIII)Lnc;", line = 24)
    public static final class23 method1242(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        try {
            field1873++;
            class23 var5 = new class23();
            if (arg0 != 9) {
                field1864 = null;
            }
            var5.field219 = arg3;
            var5.field220 = arg4;
            class632.field9082.method738(var5, (long) arg2, arg0 ^ 0xFFFFD117);
            class630.method4586(123, arg3);
            class683 var6 = class200.method1826(true, arg2);
            if (var6 != null) {
                class454.method3525((byte) 27, var6);
            }
            if (class145.field2053 != null) {
                class454.method3525((byte) 27, class145.field2053);
                class145.field2053 = null;
            }
            class295.method2540(arg0 ^ 0xFFFFFF80);
            if (var6 != null) {
                class151.method1371(var6, (byte) -62, !arg1);
            }
            if (!arg1) {
                class598.method4384(arg3);
            }
            if (!arg1 && class317.field5175 != -1) {
                class50.method515(arg0 ^ 0xFA9FAE65, class317.field5175, 1);
            }
            return var5;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field1878[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Loi;I)V", line = 69)
    public static final void method1243(class77 arg0, int arg1) {
        try {
            field1866++;
            if (arg0.field1121 != -1) {
                class210 var2 = class397.field6293.method2058(arg0.field1121, (byte) 16);
                if (var2 == null || var2.field3327 == null) {
                    arg0.field1150 = false;
                    arg0.field1121 = -1;
                } else {
                    label379: {
                        arg0.field1177++;
                        if (var2.field3327.length > arg0.field1143 && var2.field3334[arg0.field1143] < arg0.field1177) {
                            arg0.field1161++;
                            arg0.field1143++;
                            arg0.field1177 = 1;
                            if (!arg0.field1120) {
                                class531.method3967(-102, var2, arg0.field1143, arg0);
                            }
                        }
                        if (arg0.field1143 >= var2.field3327.length) {
                            arg0.field1143 = 0;
                            arg0.field1177 = 0;
                            if (arg0.field1150) {
                                arg0.field1121 = arg0.method802(-111).method5134(-121);
                                if (arg0.field1121 == -1) {
                                    arg0.field1150 = false;
                                    break label379;
                                }
                                var2 = class397.field6293.method2058(arg0.field1121, (byte) -99);
                            }
                            if (!arg0.field1120) {
                                class531.method3967(-74, var2, arg0.field1143, arg0);
                            }
                        }
                        arg0.field1161 = arg0.field1143 + 1;
                        if (var2.field3327 == null) {
                            arg0.field1121 = -1;
                            arg0.field1150 = false;
                        } else if (var2.field3327.length <= arg0.field1161) {
                            arg0.field1161 = 0;
                        }
                    }
                }
            }
            for (int var3 = 0; var3 < arg0.field1192.length; var3++) {
                if (arg0.field1192[var3].field7459 != -1 && arg0.field1192[var3].field7461 <= class431.field6776) {
                    class75 var4 = class779.field11366.method1859((byte) -65, arg0.field1192[var3].field7459);
                    int var5 = var4.field1072;
                    if (var5 == -1) {
                        arg0.field1192[var3].field7459 = -1;
                    } else {
                        class210 var6 = class397.field6293.method2058(var5, (byte) 4);
                        if (var4.field1084) {
                            if (var6.field3328 == 3) {
                                if (arg0.field1208 > 0 && class431.field6776 >= arg0.field1195 && arg0.field1115 < class431.field6776) {
                                    arg0.field1192[var3].field7459 = -1;
                                    continue;
                                }
                            } else if (var6.field3328 == 1 && arg0.field1208 > 0 && class431.field6776 >= arg0.field1195 && class431.field6776 > arg0.field1115) {
                                arg0.field1192[var3].field7461 = class431.field6776 + 1;
                                continue;
                            }
                        }
                        if (var6 == null || var6.field3327 == null) {
                            arg0.field1192[var3].field7459 = -1;
                        } else {
                            if (arg0.field1192[var3].field7457 < 0) {
                                arg0.field1192[var3].field7457 = 0;
                                if (!arg0.field1120) {
                                    class531.method3967(-63, var6, 0, arg0);
                                }
                            }
                            arg0.field1192[var3].field7465++;
                            if (arg0.field1192[var3].field7457 < var6.field3327.length && var6.field3334[arg0.field1192[var3].field7457] < arg0.field1192[var3].field7465) {
                                arg0.field1192[var3].field7465 = 1;
                                arg0.field1192[var3].field7457++;
                                if (!arg0.field1120) {
                                    class531.method3967(-74, var6, arg0.field1192[var3].field7457, arg0);
                                }
                            }
                            if (var6.field3327.length <= arg0.field1192[var3].field7457) {
                                if (var4.field1084) {
                                    arg0.field1192[var3].field7457 -= var6.field3343;
                                    arg0.field1192[var3].field7454++;
                                    if (arg0.field1192[var3].field7454 >= var6.field3313) {
                                        arg0.field1192[var3].field7459 = -1;
                                    } else if (arg0.field1192[var3].field7457 < 0 || var6.field3327.length <= arg0.field1192[var3].field7457) {
                                        arg0.field1192[var3].field7459 = -1;
                                    } else if (!arg0.field1120) {
                                        class531.method3967(-87, var6, arg0.field1192[var3].field7457, arg0);
                                    }
                                } else {
                                    arg0.field1192[var3].field7459 = -1;
                                }
                            }
                            arg0.field1192[var3].field7464 = arg0.field1192[var3].field7457 + 1;
                            if (var6.field3327.length <= arg0.field1192[var3].field7464) {
                                if (var4.field1084) {
                                    arg0.field1192[var3].field7464 -= var6.field3343;
                                    if ((arg0.field1192[var3].field7454 + 1) >= var6.field3313) {
                                        arg0.field1192[var3].field7464 = -1;
                                    } else if (arg0.field1192[var3].field7464 < 0 || var6.field3327.length <= arg0.field1192[var3].field7464) {
                                        arg0.field1192[var3].field7464 = -1;
                                    }
                                } else {
                                    arg0.field1192[var3].field7464 = -1;
                                }
                            }
                        }
                    }
                }
            }
            if (arg0.field1167 != -1 && arg0.field1186 <= 1) {
                class210 var7 = class397.field6293.method2058(arg0.field1167, (byte) 124);
                if (var7.field3328 == 3) {
                    if (arg0.field1208 > 0 && arg0.field1195 <= class431.field6776 && class431.field6776 > arg0.field1115) {
                        arg0.field1167 = -1;
                        arg0.field1194 = null;
                    }
                } else if (var7.field3328 == 1 && arg0.field1208 > 0 && class431.field6776 >= arg0.field1195 && arg0.field1115 < class431.field6776) {
                    arg0.field1186 = 2;
                }
            }
            if (arg0.field1167 != -1 && arg0.field1186 == 0) {
                class210 var8 = class397.field6293.method2058(arg0.field1167, (byte) 120);
                if (var8 == null || var8.field3327 == null) {
                    arg0.field1167 = -1;
                    arg0.field1194 = null;
                } else {
                    arg0.field1164++;
                    if (var8.field3327.length > arg0.field1125 && var8.field3334[arg0.field1125] < arg0.field1164) {
                        arg0.field1125++;
                        arg0.field1164 = 1;
                        if (!arg0.field1120) {
                            class531.method3967(-122, var8, arg0.field1125, arg0);
                        }
                    }
                    if (var8.field3327.length <= arg0.field1125) {
                        arg0.field1131++;
                        arg0.field1125 -= var8.field3343;
                        if (arg0.field1131 >= var8.field3313) {
                            arg0.field1167 = -1;
                            arg0.field1194 = null;
                        } else if (arg0.field1125 < 0 || arg0.field1125 >= var8.field3327.length) {
                            arg0.field1194 = null;
                            arg0.field1167 = -1;
                        } else if (!arg0.field1120) {
                            class531.method3967(-79, var8, arg0.field1125, arg0);
                        }
                    }
                    arg0.field1119 = arg0.field1125 + 1;
                    if (arg0.field1119 >= var8.field3327.length) {
                        arg0.field1119 -= var8.field3343;
                        if ((arg0.field1131 + 1) >= var8.field3313) {
                            arg0.field1119 = -1;
                        } else if (arg0.field1119 < 0 || arg0.field1119 >= var8.field3327.length) {
                            arg0.field1119 = -1;
                        }
                    }
                }
            }
            if (arg0.field1186 > 0) {
                arg0.field1186--;
            }
            if (arg1 < 123) {
                field1860 = null;
            }
            for (int var9 = 0; var9 < arg0.field1176.length; var9++) {
                class494 var10 = arg0.field1176[var9];
                if (var10 != null) {
                    if (var10.field7427 > 0) {
                        var10.field7427--;
                    } else {
                        class210 var11 = class397.field6293.method2058(var10.field7422, (byte) -95);
                        if (var11 == null || var11.field3327 == null) {
                            arg0.field1176[var9] = null;
                        } else {
                            var10.field7424++;
                            if (var10.field7434 < var11.field3327.length && var10.field7424 > var11.field3334[var10.field7434]) {
                                var10.field7424 = 1;
                                var10.field7434++;
                                if (!arg0.field1120) {
                                    class531.method3967(-123, var11, var10.field7434, arg0);
                                }
                            }
                            if (var10.field7434 >= var11.field3327.length) {
                                var10.field7433++;
                                var10.field7434 -= var11.field3343;
                                if (var11.field3313 <= var10.field7433) {
                                    arg0.field1176[var9] = null;
                                } else if (var10.field7434 < 0 || var11.field3327.length <= var10.field7434) {
                                    arg0.field1176[var9] = null;
                                } else if (!arg0.field1120) {
                                    class531.method3967(-52, var11, var10.field7434, arg0);
                                }
                            }
                            var10.field7423 = var10.field7434 + 1;
                            if (var11.field3327.length <= var10.field7423) {
                                var10.field7423 -= var11.field3343;
                                if (var10.field7433 + 1 >= var11.field3313) {
                                    var10.field7423 = -1;
                                } else if (var10.field7423 < 0 || var11.field3327.length <= var10.field7423) {
                                    var10.field7423 = -1;
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field1878[0] + (arg0 == null ? field1878[2] : field1878[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V", line = 450)
    public static void method1244(byte arg0) {
        try {
            field1863 = null;
            field1860 = null;
            if (arg0 < -16) {
                field1864 = null;
                field1876 = null;
                field1867 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1878[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Ljk;Ltda;IIIIIII)V", line = 475)
    public class131(class662 arg0, class666 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            this.field1859 = arg6;
            this.field1874 = arg3;
            this.field1870 = arg8;
            this.field1877 = arg7;
            this.field1862 = arg5;
            this.field1865 = arg1;
            this.field1869 = arg4;
            this.field1875 = arg0;
            this.field1872 = arg2;
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field1878[6] + (arg0 == null ? field1878[2] : field1878[1]) + ',' + (arg1 == null ? field1878[2] : field1878[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1245(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1246(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 86;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
