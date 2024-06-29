import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class61 {

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field899 = 0;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "[I")
    public static int[] field898 = new int[14];

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "Ljava/lang/String;")
    public static String field896 = "cyan:";

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "J")
    public static long field900 = 0L;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "Ljava/lang/String;")
    public static String field895;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIIII)V", line = 4)
    public static final void method501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field905++;
        if (arg6 > -63) {
            field895 = (String) null;
        }
        int var9 = arg0 - arg8;
        int var10 = arg1 - arg7;
        int var11 = (arg4 - arg5 << 16) / var9;
        int var12 = (arg3 - arg2 << 16) / var10;
        class214.method1560(0, arg2, arg5, -1378993982, 0, arg1, arg7, var11, arg8, var12, arg0);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V", line = 25)
    public static final void method502(boolean arg0) {
        field902++;
        if (class175.field2864 != null || class56.field777 != null) {
            return;
        }
        if (!arg0) {
            field895 = (String) null;
        }
        int var1 = class193.field3076;
        if (!class238.field3729) {
            if (var1 == 1 && class78.field1046 > 0) {
                short var2 = class282.field4365[class78.field1046 - 1];
                if (var2 == 58 || var2 == 51 || var2 == 46 || var2 == 3 || var2 == 26 || var2 == 28 || var2 == 20 || var2 == 24 || var2 == 1 || var2 == 43 || var2 == 17 || var2 == 1002) {
                    int var3 = class58.field839[class78.field1046 - 1];
                    int var4 = class248.field3904[class78.field1046 - 1];
                    class136 var5 = class14.method140(var4, 1036508464);
                    class127 var6 = client.method953(var5);
                    if (var6.method924((byte) -73) || var6.method930(115)) {
                        class27.field406 = false;
                        class98.field1289 = 0;
                        if (class175.field2864 != null) {
                            class167.method1250(class175.field2864, 412);
                        }
                        class175.field2864 = class14.method140(var4, 1036508464);
                        class158.field2451 = class205.field3256;
                        class224.field3549 = var3;
                        class92.field1226 = class271.field4207;
                        class167.method1250(class175.field2864, 412);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class274.field4235 == 1 && class78.field1046 > 2 || class325.method2285(class78.field1046 - 1, false))) {
                var1 = 2;
            }
            if (var1 == 2 && class78.field1046 > 0 || class163.field2645 == 1) {
                class283.method2008(true);
            }
            if (var1 == 1 && class78.field1046 > 0 || class163.field2645 == 2) {
                class113.method797(true);
            }
            return;
        }
        if (var1 != 1) {
            int var7 = class82.field1129;
            int var8 = class25.field381;
            if ((class295.field4575 - 10) > var8 || (class295.field4575 + class138.field2197 + 10) < var8 || var7 < class281.field4343 - 10 || var7 > (class281.field4343 + class95.field1264 + 10)) {
                class238.field3729 = false;
                class319.method2240(class138.field2197, class295.field4575, true, class95.field1264, class281.field4343);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var9 = class295.field4575;
        int var10 = class281.field4343;
        int var11 = class138.field2197;
        int var12 = class205.field3256;
        int var13 = class271.field4207;
        int var14 = -1;
        for (int var15 = 0; var15 < class78.field1046; var15++) {
            if (class334.field5196) {
                int var16 = (class78.field1046 - var15 - 1) * 15 + var10 + 33;
                if (var9 < var12 && var12 < (var9 + var11) && var16 - 13 < var13 && (var16 + 3) > var13) {
                    var14 = var15;
                }
            } else {
                int var17 = (class78.field1046 - var15 - 1) * 15 + var10 + 31;
                if (var9 < var12 && var12 < var9 + var11 && (var17 - 13) < var13 && var13 < (var17 + 3)) {
                    var14 = var15;
                }
            }
        }
        if (var14 != -1) {
            class244.method1748(var14, -11035);
        }
        class238.field3729 = false;
        class319.method2240(class138.field2197, class295.field4575, arg0, class95.field1264, class281.field4343);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IJ)V", line = 165)
    public static final void method503(int arg0, long arg1) {
        if (class166.field2715 == 1 || class166.field2715 == 5) {
            class301.method2084((byte) 89, arg1);
        } else if (class166.field2715 == 2) {
            class139.method1032(arg0 + 120);
        } else {
            class160.method1190(60);
        }
        field901++;
        if (!class238.field3729) {
            class32.field472[0] = class282.field4357;
            class135.field1974[0] = class337.field5258;
            class282.field4365[0] = 1007;
            if (class163.field2645 != 0) {
                class215.field3387 = class337.field5281;
                class57.field812 = class57.field808;
            } else if (class193.field3076 == 0) {
                class215.field3387 = class25.field381;
                class57.field812 = class82.field1129;
            } else {
                class57.field812 = class271.field4207;
                class215.field3387 = class205.field3256;
            }
            class342.field5324[0] = "";
            class78.field1046 = 1;
        }
        if (arg0 != 81) {
            field899 = 57;
        }
        if (class147.field2321 != -1) {
            class211.method1538(true, class147.field2321);
        }
        for (int var3 = 0; var3 < class310.field4829; var3++) {
            if (class231.field3607[var3]) {
                class97.field1277[var3] = true;
            }
            class124.field1771[var3] = class231.field3607[var3];
            class231.field3607[var3] = false;
        }
        if (class109.field1458) {
            class230.field3601 = true;
        }
        class18.field287 = null;
        class43.field586 = class229.field3595;
        class224.field3559 = null;
        class220.field3476 = -1;
        class139.field2213 = -1;
        if (class147.field2321 != -1) {
            class310.field4829 = 0;
            class315.method2200((byte) 0);
        }
        if (class109.field1458) {
            class122.method898();
        } else {
            class280.method1980();
        }
        class254.method1847((byte) 125);
        if (class238.field3729) {
            if (class334.field5196) {
                class27.method250(256);
            } else {
                class245.method1761((byte) -110);
            }
        } else if (class224.field3559 != null) {
            class47.method363(class124.field1786, class196.field3132, class224.field3559, (byte) 12);
        } else if (class139.field2213 != -1) {
            class47.method363(class139.field2213, class220.field3476, (class136) null, (byte) 12);
        }
        int var4 = class238.field3729 ? -1 : class200.method1482((byte) 19);
        if (var4 == -1) {
            var4 = class220.field3491;
        }
        class272.method1916((byte) -26, var4);
        if (class286.field4417 == 1) {
            class286.field4417 = 2;
        }
        if (class253.field3969 == 1) {
            class253.field3969 = 2;
        }
        if (class193.field3081 == 3) {
            for (int var5 = 0; var5 < class310.field4829; var5++) {
                if (class124.field1771[var5]) {
                    if (class109.field1458) {
                        class122.method893(class170.field2798[var5], class322.field5083[var5], class170.field2794[var5], class164.field2660[var5], 16711935, 128);
                    } else {
                        class280.method1970(class170.field2798[var5], class322.field5083[var5], class170.field2794[var5], class164.field2660[var5], 16711935, 128);
                    }
                } else if (class97.field1277[var5]) {
                    if (class109.field1458) {
                        class122.method893(class170.field2798[var5], class322.field5083[var5], class170.field2794[var5], class164.field2660[var5], 16711680, 128);
                    } else {
                        class280.method1970(class170.field2798[var5], class322.field5083[var5], class170.field2794[var5], class164.field2660[var5], 16711680, 128);
                    }
                }
            }
        }
        class20.method207(class146.field2310.field4731, class146.field2310.field4698, class153.field2373, (byte) 76, class154.field2392);
        class153.field2373 = 0;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 324)
    public static void method504(int arg0) {
        field898 = null;
        field896 = null;
        if (arg0 != -10) {
            field899 = -28;
        }
        field895 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V", line = 347)
    public static final void method505(int arg0, int arg1) {
        class124 var2 = class83.field1138[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class124 var4 = class83.field1138[var3][arg0][arg1] = class83.field1138[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1777--;
                for (int var5 = 0; var5 < var4.field1798; var5++) {
                    class263 var6 = var4.field1783[var5];
                    if ((var6.field4122 >> 29 & 0x3L) == 2L && var6.field4124 == arg0 && var6.field4127 == arg1) {
                        var6.field4132--;
                    }
                }
            }
        }
        if (class83.field1138[0][arg0][arg1] == null) {
            class83.field1138[0][arg0][arg1] = new class124(0, arg0, arg1);
        }
        class83.field1138[0][arg0][arg1].field1782 = var2;
        class83.field1138[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lvl;IIIIZZIII)V", line = 389)
    public static final void method506(class6 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field897++;
        if (arg1 > -107) {
            method505(115, -89);
        }
        byte var10 = 0;
        byte var11 = 0;
        if (arg2 == 1) {
            var10 = 1;
        } else if (arg2 == 2) {
            var11 = 1;
            var10 = 1;
        } else if (arg2 == 3) {
            var11 = 1;
        }
        if (arg3 < 0 || arg3 >= 104 || arg4 < 0 || arg4 >= 104) {
            while (true) {
                int var14 = arg0.method58(-288140008);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg0.method58(-288140008);
                    break;
                }
                if (var14 <= 49) {
                    arg0.method58(-288140008);
                }
            }
            return;
        }
        if (!arg5 && !arg6) {
            class134.field1969[arg8][arg3][arg4] = 0;
        }
        while (true) {
            int var12 = arg0.method58(-288140008);
            if (var12 == 0) {
                if (arg5) {
                    class172.field2843[0][arg3 + var11][arg4 + var10] = class18.field294[0][arg3 + var11][arg4 + var10];
                } else if (arg8 == 0) {
                    class172.field2843[0][arg3 + var11][arg4 + var10] = -class45.method356(arg7 + 556238, false, arg9 + 932731) * 8;
                } else {
                    class172.field2843[arg8][arg3 + var11][arg4 + var10] = class172.field2843[arg8 - 1][arg3 + var11][arg4 + var10] - 240;
                }
                break;
            }
            if (var12 == 1) {
                int var13 = arg0.method58(-288140008);
                if (arg5) {
                    class172.field2843[0][arg3 + var11][arg4 + var10] = var13 * 8 + class18.field294[0][arg3 + var11][arg4 + var10];
                } else {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg8 == 0) {
                        class172.field2843[0][arg3 + var11][arg4 + var10] = -var13 * 8;
                    } else {
                        class172.field2843[arg8][arg3 + var11][arg4 + var10] = class172.field2843[arg8 - 1][arg3 + var11][arg4 + var10] - (var13 * 8);
                    }
                }
                break;
            }
            if (var12 > 49) {
                if (var12 > 81) {
                    if (!arg6) {
                        class66.field943[arg8][arg3][arg4] = (byte) (var12 - 81);
                    }
                } else if (!arg5 && !arg6) {
                    class134.field1969[arg8][arg3][arg4] = (byte) (var12 - 49);
                }
            } else if (arg6) {
                arg0.method58(-288140008);
            } else {
                class314.field4919[arg8][arg3][arg4] = arg0.method83((byte) -115);
                class70.field974[arg8][arg3][arg4] = (byte) ((var12 - 2) / 4);
                class263.field4114[arg8][arg3][arg4] = (byte) class333.method2319(3, var12 + arg2 - 2);
            }
        }
    }
}
