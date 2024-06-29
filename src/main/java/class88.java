import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class88 extends class200 {

    @OriginalMember(owner = "client!i", name = "K", descriptor = "I")
    public static int field1671 = 0;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "Ll;")
    public static class120 field1675 = new class120(4096);

    @OriginalMember(owner = "client!i", name = "T", descriptor = "I")
    public static int field1680 = 0;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    public static int field1683 = 99;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "Ldj;")
    public static class44 field1682 = class89.method650(255, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!i", name = "U", descriptor = "Ldj;")
    private static class44 field1681 = class89.method650(255, "button near the top of that page)3");

    @OriginalMember(owner = "client!i", name = "S", descriptor = "Ldj;")
    public static class44 field1679 = field1681;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "Lwd;")
    public class234 field1674;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "[I")
    public static int[] field1684;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method645(Component arg0, byte arg1) {
        arg0.removeKeyListener(class17.field309);
        if (arg1 != 79) {
            method647((byte) 24);
        }
        arg0.removeFocusListener(class17.field309);
        class111.field2006 = -1;
        field1685++;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)V")
    public static final void method646(boolean arg0) {
        if (arg0) {
            class135.field2412 = new class190();
            field1673++;
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V")
    public static final void method647(byte arg0) {
        field1677++;
        int[] var1 = new int[class170.field2950];
        int var2 = 0;
        for (int var3 = 0; var3 < class170.field2950; var3++) {
            class214 var6 = class192.method1227(-31700, var3);
            if (var6.field3830 >= 0 || var6.field3854 >= 0) {
                var1[var2++] = var3;
            }
        }
        class237.field4388 = new int[var2];
        int var4 = -120 / ((arg0 + 69) / 49);
        for (int var5 = 0; var5 < var2; var5++) {
            class237.field4388[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method648(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1672++;
        class106.field1938 = 0;
        if (arg6) {
            field1683 = 78;
        }
        for (int var7 = -1; var7 < class90.field1702 + class158.field2755; var7++) {
            class124 var23;
            if (var7 == -1) {
                var23 = class96.field1774;
            } else if (class90.field1702 <= var7) {
                var23 = class170.field2960[class158.field2751[var7 - class90.field1702]];
            } else {
                var23 = class122.field2168[class45.field858[var7]];
            }
            if (var23 != null && var23.method171(2047)) {
                if (var23 instanceof class121) {
                    class202 var24 = ((class121) var23).field2156;
                    if (var24.field3589 != null) {
                        var24 = var24.method1306(0);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (class90.field1702 <= var7) {
                    class202 var25 = ((class121) var23).field2156;
                    if (var25.field3589 != null) {
                        var25 = var25.method1306(0);
                    }
                    if (var25.field3605 >= 0 && var25.field3605 < class133.field2386.length) {
                        class154.method997(arg5 >> 1, var23, var23.method858(-83) + 15, (byte) -94, arg1, arg3 >> 1, arg4);
                        if (class119.field2124 > -1) {
                            class133.field2386[var25.field3605].method1010(class119.field2124 + arg0 - 12, arg2 - -class83.field1626 + -30);
                        }
                    }
                    class97[] var26 = class61.field1132;
                    for (int var27 = 0; var27 < var26.length; var27++) {
                        class97 var28 = var26[var27];
                        if (var28 != null && var28.field1795 == 1 && class158.field2751[var7 - class90.field1702] == var28.field1797 && class46.field868 % 20 < 10) {
                            class154.method997(arg5 >> 1, var23, var23.method858(-46) + 15, (byte) -94, arg1, arg3 >> 1, arg4);
                            if (class119.field2124 > -1) {
                                class154.field2676[var28.field1787].method1010(class119.field2124 + arg0 - 12, arg2 + -28 - -class83.field1626);
                            }
                        }
                    }
                } else {
                    int var29 = 30;
                    class24 var30 = (class24) var23;
                    if (var30.field416 != -1 || var30.field420 != -1) {
                        class154.method997(arg5 >> 1, var23, var23.method858(-92) + 15, (byte) -94, arg1, arg3 >> 1, arg4);
                        if (class119.field2124 > -1) {
                            if (var30.field416 != -1) {
                                class211.field3796[var30.field416].method1010(arg0 + class119.field2124 - 12, arg2 - (-class83.field1626 + var29));
                                var29 += 25;
                            }
                            if (var30.field420 != -1) {
                                class133.field2386[var30.field420].method1010(arg0 + class119.field2124 - 12, -var29 + arg2 + class83.field1626);
                                var29 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var31 = 0;
                        class97[] var32 = class61.field1132;
                        while (var31 < var32.length) {
                            class97 var33 = var32[var31];
                            if (var33 != null && var33.field1795 == 10 && class45.field858[var7] == var33.field1797) {
                                class154.method997(arg5 >> 1, var23, var23.method858(-84) + 15, (byte) -94, arg1, arg3 >> 1, arg4);
                                if (class119.field2124 > -1) {
                                    class154.field2676[var33.field1787].method1010(arg0 + class119.field2124 - 12, arg2 - -class83.field1626 + -var29);
                                }
                            }
                            var31++;
                        }
                    }
                }
                if (var23.field2262 != null && (class90.field1702 <= var7 || class108.field1975 == 0 || class108.field1975 == 3 || class108.field1975 == 1 && class146.method956(((class24) var23).field395, 0))) {
                    class154.method997(arg5 >> 1, var23, var23.method858(-61), (byte) -94, arg1, arg3 >> 1, arg4);
                    if (class119.field2124 > -1 && class106.field1938 < class216.field3935) {
                        class216.field3927[class106.field1938] = class150.field2620.method424(var23.field2262) / 2;
                        class216.field3934[class106.field1938] = class150.field2620.field1035;
                        class216.field3941[class106.field1938] = class119.field2124;
                        class216.field3933[class106.field1938] = class83.field1626;
                        class216.field3924[class106.field1938] = var23.field2230;
                        class216.field3939[class106.field1938] = var23.field2227;
                        class216.field3929[class106.field1938] = var23.field2238;
                        class216.field3937[class106.field1938] = var23.field2262;
                        class106.field1938++;
                    }
                }
                if (var23.field2225 > class46.field868) {
                    class154.method997(arg5 >> 1, var23, var23.method858(-26) + 15, (byte) -94, arg1, arg3 >> 1, arg4);
                    if (class119.field2124 > -1) {
                        class99.method688(class119.field2124 + arg0 - 15, arg2 + -3 - -class83.field1626, var23.field2204, 5, 65280);
                        class99.method688(class119.field2124 + arg0 + var23.field2204 - 15, class83.field1626 + arg2 + -3, 30 - var23.field2204, 5, 16711680);
                    }
                }
                for (int var34 = 0; var34 < 4; var34++) {
                    if (var23.field2239[var34] > class46.field868) {
                        class154.method997(arg5 >> 1, var23, var23.method858(-98) / 2, (byte) -94, arg1, arg3 >> 1, arg4);
                        if (class119.field2124 > -1) {
                            if (var34 == 1) {
                                class83.field1626 -= 20;
                            }
                            if (var34 == 2) {
                                class119.field2124 -= 15;
                                class83.field1626 -= 10;
                            }
                            if (var34 == 3) {
                                class119.field2124 += 15;
                                class83.field1626 -= 10;
                            }
                            class53.field955[var23.field2245[var34]].method1010(class119.field2124 + arg0 - 12, arg2 - -class83.field1626 + -12);
                            class21.field357.method401(class199.method1287(var23.field2236[var34], -1), class119.field2124 + arg0 - 1, arg2 - -class83.field1626 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class106.field1938; var8++) {
            int var9 = class216.field3941[var8];
            int var10 = class216.field3934[var8];
            boolean var11 = true;
            int var12 = class216.field3933[var8];
            int var13 = class216.field3927[var8];
            while (var11) {
                var11 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if (class216.field3933[var22] - class216.field3934[var22] < var12 + 2 && class216.field3933[var22] + 2 > -var10 + var12 && var9 - var13 < class216.field3941[var22] + class216.field3927[var22] && var9 + var13 > class216.field3941[var22] + -class216.field3927[var22] && class216.field3933[var22] - class216.field3934[var22] < var12) {
                        var12 = class216.field3933[var22] - class216.field3934[var22];
                        var11 = true;
                    }
                }
            }
            class119.field2124 = class216.field3941[var8];
            class83.field1626 = class216.field3933[var8] = var12;
            class44 var14 = class216.field3937[var8];
            if (class10.field204 == 0) {
                int var15 = 16776960;
                if (class216.field3924[var8] < 6) {
                    var15 = class197.field3489[class216.field3924[var8]];
                }
                if (class216.field3924[var8] == 6) {
                    var15 = class42.field785 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class216.field3924[var8] == 7) {
                    var15 = class42.field785 % 20 >= 10 ? 65535 : 255;
                }
                if (class216.field3924[var8] == 8) {
                    var15 = class42.field785 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class216.field3924[var8] == 9) {
                    int var16 = 150 - class216.field3929[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16776960 + 16384000 - var16 * 327680;
                    } else if (var16 < 150) {
                        var15 = var16 * 5 + 65280 - 500;
                    }
                }
                if (class216.field3924[var8] == 10) {
                    int var17 = 150 - class216.field3929[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 33095935 - var17 * 327680;
                    } else if (var17 < 150) {
                        var15 = var17 * 327680 + 255 - (var17 - 100) * 5 - 32768000;
                    }
                }
                if (class216.field3924[var8] == 11) {
                    int var18 = 150 - class216.field3929[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - var18 * 327685;
                    } else if (var18 < 100) {
                        var15 = (var18 - 50) * 327685 + 65280;
                    } else if (var18 < 150) {
                        var15 = 32768000 + 16777215 - var18 * 327680;
                    }
                }
                if (class216.field3939[var8] == 0) {
                    class150.field2620.method401(var14, class119.field2124 + arg0, arg2 - -class83.field1626, var15, 0);
                }
                if (class216.field3939[var8] == 1) {
                    class150.field2620.method425(var14, class119.field2124 + arg0, arg2 - -class83.field1626, var15, 0, class42.field785);
                }
                if (class216.field3939[var8] == 2) {
                    class150.field2620.method413(var14, class119.field2124 + arg0, class83.field1626 + arg2, var15, 0, class42.field785);
                }
                if (class216.field3939[var8] == 3) {
                    class150.field2620.method422(var14, class119.field2124 + arg0, class83.field1626 + arg2, var15, 0, class42.field785, 150 - class216.field3929[var8]);
                }
                if (class216.field3939[var8] == 4) {
                    int var19 = (150 - class216.field3929[var8]) * (class150.field2620.method424(var14) + 100) / 150;
                    class99.method698(arg0 + class119.field2124 - 50, arg2, arg0 + class119.field2124 + 50, arg2 + arg5);
                    class150.field2620.method428(var14, class119.field2124 + arg0 + 50 - var19, class83.field1626 + arg2, var15, 0);
                    class99.method707(arg0, arg2, arg0 + arg3, arg2 + arg5);
                }
                if (class216.field3939[var8] == 5) {
                    int var20 = 150 - class216.field3929[var8];
                    class99.method698(arg0, class83.field1626 + arg2 - class150.field2620.field1035 - 1, arg0 + arg3, arg2 + class83.field1626 + 5);
                    int var21 = 0;
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class150.field2620.method401(var14, arg0 + class119.field2124, arg2 - -var21 + class83.field1626, var15, 0);
                    class99.method707(arg0, arg2, arg0 + arg3, arg2 + arg5);
                }
            } else {
                class150.field2620.method401(var14, class119.field2124 + arg0, class83.field1626 + arg2, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(B)V")
    public static void method649(byte arg0) {
        field1682 = null;
        field1675 = null;
        field1679 = null;
        field1684 = null;
        field1681 = null;
        if (arg0 > -114) {
            field1684 = null;
        }
    }
}
