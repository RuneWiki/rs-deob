import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class260 {

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "[I")
    public static int[] field3995 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "[I")
    public static int[] field3990 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "Luf;")
    public static class176 field4000;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Lag;")
    public static class188 field3988;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
    public static final void method1722(int arg0, int arg1) {
        class197.field3094 = -1;
        class197.field3094 = -1;
        field4002++;
        if (arg1 == 37) {
            class62.field1003 = 3.0F;
        } else if (arg1 == 50) {
            class62.field1003 = 4.0F;
        } else if (arg1 == 75) {
            class62.field1003 = 6.0F;
        } else if (arg1 == 100) {
            class62.field1003 = 8.0F;
        } else if (arg1 == 200) {
            class62.field1003 = 16.0F;
        }
        if (arg0 != 50) {
            method1722(88, 15);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V")
    public static final void method1723(boolean arg0) {
        if (!arg0) {
            method1725((byte) -12);
        }
        class245.field3802.method1782(112);
        class13.field228.method1782(-85);
        field3994++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ICLjava/lang/StringBuffer;I)Ljava/lang/StringBuffer;")
    public static final StringBuffer method1724(int arg0, char arg1, StringBuffer arg2, int arg3) {
        field3992++;
        int var4 = arg2.length();
        arg2.setLength(arg3);
        if (arg0 != 0) {
            method1722(-82, -58);
        }
        for (int var5 = var4; var5 < arg3; var5++) {
            arg2.setCharAt(var5, arg1);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static void method1725(byte arg0) {
        field4000 = null;
        field3990 = null;
        field3995 = null;
        if (arg0 != 101) {
            field3995 = null;
        }
        field3988 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[[[Lwd;IZBI)Z")
    public static final boolean method1726(int arg0, class23[][][] arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        field3999++;
        byte var6 = arg3 ? 1 : (byte) (class17.field278 & 0xFF);
        if (class140.field2150[class274.field4318][arg5][arg2] == var6) {
            return false;
        } else if ((class191.field3041[class274.field4318][arg5][arg2] & 0x4) == 0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            class172.field2561[var8] = arg5;
            int var31 = var8 + 1;
            class238.field3680[var8] = arg2;
            class140.field2150[class274.field4318][arg5][arg2] = var6;
            while (var7 != var31) {
                int var9 = class172.field2561[var7] >> 16 & 0xFF;
                int var10 = class172.field2561[var7] & 0xFFFF;
                int var11 = class238.field3680[var7] & 0xFFFF;
                int var12 = class172.field2561[var7] >> 24 & 0xFF;
                int var13 = (class238.field3680[var7] & 0xFF2939) >> 16;
                var7 = var7 + 1 & 0xFFF;
                boolean var14 = false;
                boolean var15 = false;
                if ((class191.field3041[class274.field4318][var10][var11] & 0x4) == 0) {
                    var15 = true;
                }
                label229: for (int var16 = class274.field4318 + 1; var16 <= 3; var16++) {
                    if ((class191.field3041[var16][var10][var11] & 0x8) == 0) {
                        if (var15 && arg1[var16][var10][var11] != null) {
                            if (arg1[var16][var10][var11].field344 != null) {
                                int var19 = class167.method1107(var9, 1);
                                if (arg1[var16][var10][var11].field344.field3571 == var19 || arg1[var16][var10][var11].field344.field3572 == var19) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var20 = class167.method1107(var12, 1);
                                    if (arg1[var16][var10][var11].field344.field3571 == var20 || arg1[var16][var10][var11].field344.field3572 == var20) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var21 = class167.method1107(var13, 1);
                                    if (arg1[var16][var10][var11].field344.field3571 == var21 || arg1[var16][var10][var11].field344.field3572 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var16][var10][var11].field358 != null) {
                                for (int var22 = 0; var22 < arg1[var16][var10][var11].field360; var22++) {
                                    int var23 = (int) (arg1[var16][var10][var11].field358[var22].field2569 >> 14 & 0x3FL);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg1[var16][var10][var11].field358[var22].field2569 >> 20 & 0x3L);
                                    int var25 = var23 | var24 << 6;
                                    if (var9 == var25 || var12 != 0 && var12 == var25 || var13 != 0 && var13 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        class23 var26 = arg1[var16][var10][var11];
                        if (var26 != null && var26.field360 > 0) {
                            for (int var27 = 0; var27 < var26.field360; var27++) {
                                class172 var28 = var26.field358[var27];
                                if (var28.field2565 != var28.field2558 || var28.field2563 != var28.field2560) {
                                    for (int var29 = var28.field2558; var29 <= var28.field2565; var29++) {
                                        for (int var30 = var28.field2560; var30 <= var28.field2563; var30++) {
                                            class140.field2150[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var14 = true;
                        class140.field2150[var16][var10][var11] = var6;
                    }
                }
                if (var14) {
                    if (class68.field1079[class274.field4318 + 1][var10][var11] > class23.field335[arg0]) {
                        class23.field335[arg0] = class68.field1079[class274.field4318 + 1][var10][var11];
                    }
                    int var17 = var11 << 7;
                    int var18 = var10 << 7;
                    if (class126.field1986[arg0] > var18) {
                        class126.field1986[arg0] = var18;
                    } else if (class163.field2487[arg0] < var18) {
                        class163.field2487[arg0] = var18;
                    }
                    if (class121.field1862[arg0] > var17) {
                        class121.field1862[arg0] = var17;
                    } else if (var17 > class259.field3958[arg0]) {
                        class259.field3958[arg0] = var17;
                    }
                }
                if (!var15) {
                    if (var10 >= 1 && class140.field2150[class274.field4318][var10 - 1][var11] != var6) {
                        class172.field2561[var31] = class115.method840(class115.method840(var10 - 1, 1179648), -754974720);
                        class238.field3680[var31] = class115.method840(var11, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class140.field2150[class274.field4318][var10 - 1][var11] = var6;
                    }
                    var11++;
                    if (var11 < 104) {
                        if (var10 - 1 >= 0 && class140.field2150[class274.field4318][var10 - 1][var11] != var6 && (class191.field3041[class274.field4318][var10][var11] & 0x4) == 0 && (class191.field3041[class274.field4318][var10 - 1][var11 - 1] & 0x4) == 0) {
                            class172.field2561[var31] = class115.method840(1375731712, class115.method840(var10 - 1, 1179648));
                            class238.field3680[var31] = class115.method840(1245184, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class140.field2150[class274.field4318][var10 - 1][var11] = var6;
                        }
                        if (class140.field2150[class274.field4318][var10][var11] != var6) {
                            class172.field2561[var31] = class115.method840(class115.method840(var10, 5373952), 318767104);
                            class238.field3680[var31] = class115.method840(5439488, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class140.field2150[class274.field4318][var10][var11] = var6;
                        }
                        if (var10 + 1 < 104 && class140.field2150[class274.field4318][var10 + 1][var11] != var6 && (class191.field3041[class274.field4318][var10][var11] & 0x4) == 0 && (class191.field3041[class274.field4318][var10 + 1][var11 - 1] & 0x4) == 0) {
                            class172.field2561[var31] = class115.method840(class115.method840(5373952, var10 + 1), -1845493760);
                            class238.field3680[var31] = class115.method840(5439488, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class140.field2150[class274.field4318][var10 + 1][var11] = var6;
                        }
                    }
                    var11--;
                    if (var10 + 1 < 104 && class140.field2150[class274.field4318][var10 + 1][var11] != var6) {
                        class172.field2561[var31] = class115.method840(1392508928, class115.method840(var10 + 1, 9568256));
                        class238.field3680[var31] = class115.method840(var11, 9633792);
                        var31 = var31 + 1 & 0xFFF;
                        class140.field2150[class274.field4318][var10 + 1][var11] = var6;
                    }
                    var11--;
                    if (var11 >= 0) {
                        if (var10 - 1 >= 0 && class140.field2150[class274.field4318][var10 - 1][var11] != var6 && (class191.field3041[class274.field4318][var10][var11] & 0x4) == 0 && (class191.field3041[class274.field4318][var10 - 1][var11 + 1] & 0x4) == 0) {
                            class172.field2561[var31] = class115.method840(301989888, class115.method840(var10 - 1, 13762560));
                            class238.field3680[var31] = class115.method840(13828096, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class140.field2150[class274.field4318][var10 - 1][var11] = var6;
                        }
                        if (class140.field2150[class274.field4318][var10][var11] != var6) {
                            class172.field2561[var31] = class115.method840(class115.method840(var10, 13762560), -1828716544);
                            class238.field3680[var31] = class115.method840(var11, 13828096);
                            class140.field2150[class274.field4318][var10][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var10 + 1) < 104 && class140.field2150[class274.field4318][var10 + 1][var11] != var6 && (class191.field3041[class274.field4318][var10][var11] & 0x4) == 0 && (class191.field3041[class274.field4318][var10 + 1][var11 + 1] & 0x4) == 0) {
                            class172.field2561[var31] = class115.method840(-771751936, class115.method840(var10 + 1, 9568256));
                            class238.field3680[var31] = class115.method840(var11, 9633792);
                            class140.field2150[class274.field4318][var10 + 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (arg4 != 119) {
                field3990 = null;
            }
            if (class23.field335[arg0] != -1000000) {
                class23.field335[arg0] += 10;
                class126.field1986[arg0] -= 50;
                class163.field2487[arg0] += 50;
                class259.field3958[arg0] += 50;
                class121.field1862[arg0] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ICLjava/lang/String;)I")
    public static final int method1727(int arg0, char arg1, String arg2) {
        field4001++;
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = arg0; var5 < var4; var5++) {
            if (arg2.charAt(var5) == arg1) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZII)V")
    public static final void method1728(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method1729(false);
        }
        field3997++;
        class295 var3 = class250.method1673(-119, 13, arg2);
        var3.method1980(1022716908);
        var3.field4632 = arg1;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(Z)V")
    public static final void method1729(boolean arg0) {
        for (int var1 = -1; var1 < class5.field78; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class166.field2510[var1];
            }
            class28 var6 = class41.field675[var5];
            if (var6 != null && var6.field4197 > 0) {
                var6.field4197--;
                if (var6.field4197 == 0) {
                    var6.field4131 = null;
                }
            }
        }
        int var2 = 0;
        if (!arg0) {
            method1726(59, (class23[][][]) null, -5, true, (byte) 55, 125);
        }
        while (var2 < class62.field1006) {
            int var3 = class198.field3113[var2];
            class32 var4 = class72.field1144[var3];
            if (var4 != null && var4.field4197 > 0) {
                var4.field4197--;
                if (var4.field4197 == 0) {
                    var4.field4131 = null;
                }
            }
            var2++;
        }
        field3996++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1730(byte arg0, String arg1) {
        int var2 = class235.method1575(arg1, (byte) 124);
        field3998++;
        if (arg0 == -44) {
            return var2 == -1 ? "" : class290.method1953(arg0 ^ 0xFFFFFFD4, class293.field4615.field4538[var2], " ", "<br>");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZI)V")
    public static final void method1731(boolean arg0, int arg1) {
        class87.field1422 = (class297) class77.field1304.method1414(true, (long) arg1);
        field3989++;
        if (arg0) {
            method1726(79, (class23[][][]) null, -46, false, (byte) -8, -14);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)Llh;")
    public static final class295 method1732(int arg0) {
        field3991++;
        class295 var1 = (class295) class85.field1404.method681(2);
        if (var1 != null) {
            var1.method693(113);
            var1.method1964(12213);
            return var1;
        }
        if (arg0 != 0) {
            field3995 = null;
        }
        class295 var2;
        do {
            var2 = (class295) class220.field3451.method681(2);
            if (var2 == null) {
                return null;
            }
            if (var2.method1977(125) > class269.method1823(-67)) {
                return null;
            }
            var2.method693(127);
            var2.method1964(12213);
        } while ((var2.field4603 & Long.MIN_VALUE) == 0L);
        return var2;
    }
}
