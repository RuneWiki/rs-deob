import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class240 {

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "Lwj;")
    public static class270 field3368 = new class270(107, 12);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILco;)V")
    public static final void method1460(int arg0, class77 arg1) {
        arg1.field1051 = false;
        field3365++;
        if (arg1.field1083 != -1) {
            class104 var2 = class222.field3168.method126(-97, arg1.field1083);
            if (var2 == null || var2.field1551 == null) {
                arg1.field1099 = false;
                arg1.field1083 = -1;
            } else {
                label397: {
                    arg1.field1087++;
                    if (var2.field1551.length > arg1.field1098 && arg1.field1087 > var2.field1575[arg1.field1098]) {
                        arg1.field1102++;
                        arg1.field1087 = 1;
                        arg1.field1098++;
                        class441.method2618(arg1.field1732, arg1.field1735, arg1.field1738, class316.field4324 == arg1, var2, arg1.field1098, 122);
                    }
                    if (var2.field1551.length <= arg1.field1098) {
                        arg1.field1098 = 0;
                        arg1.field1087 = 0;
                        if (arg1.field1099) {
                            arg1.field1083 = arg1.method616((byte) -83).method691(arg0 + 126);
                            if (arg1.field1083 == -1) {
                                arg1.field1099 = false;
                                break label397;
                            }
                            var2 = class222.field3168.method126(-107, arg1.field1083);
                        }
                        class441.method2618(arg1.field1732, arg1.field1735, arg1.field1738, class316.field4324 == arg1, var2, arg1.field1098, 90);
                    }
                    arg1.field1102 = arg1.field1098 + 1;
                    if (var2.field1551.length <= arg1.field1102) {
                        arg1.field1102 = 0;
                    }
                }
            }
        }
        if (~arg1.field1049 != arg0 && class441.field6516 >= arg1.field1094) {
            class398 var3 = class27.field357.method1479(arg1.field1049, (byte) -124);
            int var4 = var3.field5824;
            if (var4 == -1) {
                arg1.field1049 = -1;
            } else {
                label399: {
                    class104 var5 = class222.field3168.method126(-101, var4);
                    if (var3.field5820) {
                        if (var5.field1561 == 3) {
                            if (arg1.field1119 > 0 && class441.field6516 >= arg1.field1088 && arg1.field1090 < class441.field6516) {
                                arg1.field1049 = -1;
                                break label399;
                            }
                        } else if (var5.field1561 == 1 && arg1.field1119 > 0 && class441.field6516 >= arg1.field1088 && arg1.field1090 < class441.field6516) {
                            arg1.field1094 = class441.field6516 + 1;
                            break label399;
                        }
                    }
                    if (var5 == null || var5.field1551 == null) {
                        arg1.field1049 = -1;
                    } else {
                        if (arg1.field1065 < 0) {
                            arg1.field1065 = 0;
                            class441.method2618(arg1.field1732, arg1.field1735, arg1.field1738, class316.field4324 == arg1, var5, 0, 90);
                        }
                        arg1.field1081++;
                        if (arg1.field1065 < var5.field1551.length && arg1.field1081 > var5.field1575[arg1.field1065]) {
                            arg1.field1081 = 1;
                            arg1.field1065++;
                            class441.method2618(arg1.field1732, arg1.field1735, arg1.field1738, class316.field4324 == arg1, var5, arg1.field1065, 74);
                        }
                        if (var5.field1551.length <= arg1.field1065) {
                            if (var3.field5820) {
                                arg1.field1065 -= var5.field1567;
                                arg1.field1054++;
                                if (arg1.field1054 >= var5.field1568) {
                                    arg1.field1049 = -1;
                                } else if (arg1.field1065 >= 0 && arg1.field1065 < var5.field1551.length) {
                                    class441.method2618(arg1.field1732, arg1.field1735, arg1.field1738, class316.field4324 == arg1, var5, arg1.field1065, 91);
                                } else {
                                    arg1.field1049 = -1;
                                }
                            } else {
                                arg1.field1049 = -1;
                            }
                        }
                        arg1.field1074 = arg1.field1065 + 1;
                        if (arg1.field1074 >= var5.field1551.length) {
                            if (var3.field5820) {
                                arg1.field1074 -= var5.field1567;
                                if (var5.field1568 <= arg1.field1054 + 1) {
                                    arg1.field1074 = -1;
                                } else if (arg1.field1074 < 0 || var5.field1551.length <= arg1.field1074) {
                                    arg1.field1074 = -1;
                                }
                            } else {
                                arg1.field1074 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field1023 != -1 && class441.field6516 >= arg1.field1045) {
            class398 var6 = class27.field357.method1479(arg1.field1023, (byte) -119);
            int var7 = var6.field5824;
            if (var7 == -1) {
                arg1.field1023 = -1;
            } else {
                label403: {
                    class104 var8 = class222.field3168.method126(-117, var7);
                    if (var6.field5820) {
                        if (var8.field1561 == 3) {
                            if (arg1.field1119 > 0 && arg1.field1088 <= class441.field6516 && arg1.field1090 < class441.field6516) {
                                arg1.field1023 = -1;
                                break label403;
                            }
                        } else if (var8.field1561 == 1 && arg1.field1119 > 0 && arg1.field1088 <= class441.field6516 && class441.field6516 > arg1.field1090) {
                            arg1.field1045 = class441.field6516 + 1;
                            break label403;
                        }
                    }
                    if (var8 == null || var8.field1551 == null) {
                        arg1.field1023 = -1;
                    } else {
                        if (arg1.field1093 < 0) {
                            arg1.field1093 = 0;
                            class441.method2618(arg1.field1732, arg1.field1735, arg1.field1738, class316.field4324 == arg1, var8, 0, 126);
                        }
                        arg1.field1034++;
                        if (var8.field1551.length > arg1.field1093 && var8.field1575[arg1.field1093] < arg1.field1034) {
                            arg1.field1034 = 1;
                            arg1.field1093++;
                            class441.method2618(arg1.field1732, arg1.field1735, arg1.field1738, class316.field4324 == arg1, var8, arg1.field1093, 101);
                        }
                        if (arg1.field1093 >= var8.field1551.length) {
                            if (var6.field5820) {
                                arg1.field1063++;
                                arg1.field1093 -= var8.field1567;
                                if (arg1.field1063 >= var8.field1568) {
                                    arg1.field1023 = -1;
                                } else if (arg1.field1093 >= 0 && arg1.field1093 < var8.field1551.length) {
                                    class441.method2618(arg1.field1732, arg1.field1735, arg1.field1738, class316.field4324 == arg1, var8, arg1.field1093, 101);
                                } else {
                                    arg1.field1023 = -1;
                                }
                            } else {
                                arg1.field1023 = -1;
                            }
                        }
                        arg1.field1067 = arg1.field1093 + 1;
                        if (var8.field1551.length <= arg1.field1067) {
                            if (var6.field5820) {
                                arg1.field1067 -= var8.field1567;
                                if (var8.field1568 <= (arg1.field1063 + 1)) {
                                    arg1.field1067 = -1;
                                } else if (arg1.field1067 < 0 || arg1.field1067 >= var8.field1551.length) {
                                    arg1.field1067 = -1;
                                }
                            } else {
                                arg1.field1067 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field1064 != -1 && arg1.field1037 <= 1) {
            class104 var9 = class222.field3168.method126(-103, arg1.field1064);
            if (var9.field1561 == 3) {
                if (arg1.field1119 > 0 && arg1.field1088 <= class441.field6516 && class441.field6516 > arg1.field1090) {
                    arg1.field1064 = -1;
                }
            } else if (var9.field1561 == 1 && arg1.field1119 > 0 && class441.field6516 >= arg1.field1088 && class441.field6516 > arg1.field1090) {
                arg1.field1037 = 2;
            }
        }
        if (arg1.field1064 != -1 && arg1.field1037 == 0) {
            class104 var10 = class222.field3168.method126(-68, arg1.field1064);
            if (var10 == null || var10.field1551 == null) {
                arg1.field1064 = -1;
            } else {
                arg1.field1084++;
                if (var10.field1551.length > arg1.field1048 && arg1.field1084 > var10.field1575[arg1.field1048]) {
                    arg1.field1048++;
                    arg1.field1084 = 1;
                    class441.method2618(arg1.field1732, arg1.field1735, arg1.field1738, class316.field4324 == arg1, var10, arg1.field1048, 105);
                }
                if (arg1.field1048 >= var10.field1551.length) {
                    arg1.field1089++;
                    arg1.field1048 -= var10.field1567;
                    if (var10.field1568 <= arg1.field1089) {
                        arg1.field1064 = -1;
                    } else if (arg1.field1048 >= 0 && var10.field1551.length > arg1.field1048) {
                        class441.method2618(arg1.field1732, arg1.field1735, arg1.field1738, class316.field4324 == arg1, var10, arg1.field1048, 78);
                    } else {
                        arg1.field1064 = -1;
                    }
                }
                arg1.field1072 = arg1.field1048 + 1;
                if (arg1.field1072 >= var10.field1551.length) {
                    arg1.field1072 -= var10.field1567;
                    if (var10.field1568 <= arg1.field1089 + 1) {
                        arg1.field1072 = -1;
                    } else if (arg1.field1072 < 0 || arg1.field1072 >= var10.field1551.length) {
                        arg1.field1072 = -1;
                    }
                }
                arg1.field1051 = var10.field1550;
            }
        }
        if (arg1.field1037 > 0) {
            arg1.field1037--;
        }
        for (int var11 = 0; var11 < arg1.field1058.length; var11++) {
            class431 var12 = arg1.field1058[var11];
            if (var12 != null) {
                if (var12.field6329 > 0) {
                    var12.field6329--;
                } else {
                    class104 var13 = class222.field3168.method126(arg0 - 108, var12.field6335);
                    if (var13 == null || var13.field1551 == null) {
                        arg1.field1058[var11] = null;
                    } else {
                        var12.field6330++;
                        if (var13.field1551.length > var12.field6331 && var12.field6330 > var13.field1575[var12.field6331]) {
                            var12.field6330 = 1;
                            var12.field6331++;
                            class441.method2618(arg1.field1732, arg1.field1735, arg1.field1738, class316.field4324 == arg1, var13, var12.field6331, arg0 + 96);
                        }
                        if (var12.field6331 >= var13.field1551.length) {
                            var12.field6331 -= var13.field1567;
                            var12.field6333++;
                            if (var13.field1568 <= var12.field6333) {
                                arg1.field1058[var11] = null;
                            } else if (var12.field6331 >= 0 && var12.field6331 < var13.field1551.length) {
                                class441.method2618(arg1.field1732, arg1.field1735, arg1.field1738, class316.field4324 == arg1, var13, var12.field6331, arg0 + 109);
                            } else {
                                arg1.field1058[var11] = null;
                            }
                        }
                        var12.field6337 = var12.field6331 + 1;
                        if (var13.field1551.length <= var12.field6337) {
                            var12.field6337 -= var13.field1567;
                            if (var13.field1568 <= (var12.field6333 + 1)) {
                                var12.field6337 = -1;
                            } else if (var12.field6337 < 0 || var12.field6337 >= var13.field1551.length) {
                                var12.field6337 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIIZIZ)V")
    public static final void method1461(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        if (arg1 != -1) {
            return;
        }
        if (arg3 < arg0) {
            int var7 = (arg3 + arg0) / 2;
            int var8 = arg3;
            class61 var9 = class393.field5757[var7];
            class393.field5757[var7] = class393.field5757[arg0];
            class393.field5757[arg0] = var9;
            for (int var10 = arg3; var10 < arg0; var10++) {
                if (class479.method2819(class393.field5757[var10], (byte) 123, var9, arg6, arg4, arg5, arg2) <= 0) {
                    class61 var11 = class393.field5757[var10];
                    class393.field5757[var10] = class393.field5757[var8];
                    class393.field5757[var8++] = var11;
                }
            }
            class393.field5757[arg0] = class393.field5757[var8];
            class393.field5757[var8] = var9;
            method1461(var8 - 1, arg1, arg2, arg3, arg4, arg5, arg6);
            method1461(arg0, -1, arg2, var8 + 1, arg4, arg5, arg6);
        }
        field3371++;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1462(int arg0, String arg1) {
        field3367++;
        if (arg1.equals("")) {
            return;
        }
        class491.method2878((byte) 92, class40.field495);
        class5.field44++;
        class481.field7027.method2302(-4, class252.method1507(arg1, true));
        class481.field7027.method2349(arg1, true);
        if (arg0 < 36) {
            method1460(-79, null);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
    public static void method1463(byte arg0) {
        if (arg0 != 21) {
            field3370 = 88;
        }
        field3368 = null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)I")
    public static final int method1464(int arg0, int arg1, int arg2) {
        field3369++;
        if (arg2 != -13636) {
            method1463((byte) 37);
        }
        return arg0 == 1 || arg0 == 3 ? class278.field3810[arg1 & 0x3] : class412.field6018[arg1 & 0x3];
    }
}
