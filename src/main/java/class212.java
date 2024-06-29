import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class212 extends class30 {

    @OriginalMember(owner = "client!we", name = "x", descriptor = "[B")
    public byte[] field3631;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field3628 = 0;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "Lia;")
    public static class257 field3636 = class28.method234(-85, ":clanreq:");

    @OriginalMember(owner = "client!we", name = "A", descriptor = "Lia;")
    public static class257 field3634 = class28.method234(-114, "gleiten:");

    @OriginalMember(owner = "client!we", name = "B", descriptor = "Lia;")
    public static class257 field3635 = class28.method234(114, "T");

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(II)Lia;")
    public static final class257 method1427(int arg0, int arg1) {
        field3630++;
        if (arg0 > arg1) {
            return class233.method1528(new class257[] { class162.field2848, class111.method808(10, arg1), class252.field4332 }, 0);
        } else if (arg1 < 10000000) {
            return class233.method1528(new class257[] { class188.field3248, class111.method808(10, arg1 / 1000), class219.field3712, class252.field4332 }, 0);
        } else {
            return class233.method1528(new class257[] { class169.field2912, class111.method808(10, arg1 / 1000000), class191.field3273, class252.field4332 }, arg0 ^ 0x186A0);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
    public static void method1428(byte arg0) {
        field3634 = null;
        if (arg0 != 23) {
            field3636 = null;
        }
        field3636 = null;
        field3635 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZILba;)V")
    public static final void method1429(boolean arg0, int arg1, class211 arg2) {
        if (class17.field380 != null) {
            try {
                class17.field380.method1421((byte) 100);
            } catch (Exception var8) {
            }
            class17.field380 = null;
        }
        class17.field380 = arg2;
        field3637++;
        class220.method1450(arg0, 4);
        class132.field2358 = null;
        class236.field4047.field2677 = 0;
        class125.field2232 = null;
        class44.field1034 = arg1;
        while (true) {
            class137 var3 = (class137) class185.field3210.method427((byte) 58);
            if (var3 == null) {
                while (true) {
                    class137 var4 = (class137) class158.field2774.method427((byte) 58);
                    if (var4 == null) {
                        if (class145.field2537 != 0) {
                            try {
                                class152 var5 = new class152(4);
                                var5.method1023(13195, 4);
                                var5.method1023(13195, class145.field2537);
                                var5.method1065(0, 1210792072);
                                class17.field380.method1419(4, 0, var5.field2638, -30);
                            } catch (IOException var7) {
                                try {
                                    class17.field380.method1421((byte) 93);
                                } catch (Exception var6) {
                                }
                                class17.field380 = null;
                                class94.field1778++;
                            }
                        }
                        class27.field523 = 0;
                        class121.field2178 = class80.method600(arg1 ^ 0xFFFFFFB0);
                        return;
                    }
                    class85.field1658.method994((byte) -42, var4);
                    class248.field4289.method424(var4, (byte) -40, var4.field573);
                    class115.field2067--;
                    class138.field2459++;
                }
            }
            class203.field3494.method424(var3, (byte) -40, var3.field573);
            class80.field1566++;
            class32.field619--;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I[[[Lea;IZI)V")
    public static final void method1430(int arg0, class177[][][] arg1, int arg2, boolean arg3, int arg4) {
        field3632++;
        byte var5 = (byte) (class15.field328 & 0xFF);
        if (!arg3) {
            method1427(-96, 113);
        }
        if (class199.field3411[class189.field3261][arg2][arg0] == var5) {
            return;
        }
        byte var6 = 0;
        class36.field718[var6] = arg2;
        int var30 = var6 + 1;
        class80.field1565[var6] = arg0;
        int var7 = 0;
        class199.field3411[class189.field3261][arg2][arg0] = var5;
        while (var30 != var7) {
            int var8 = class36.field718[var7] & 0xFFFF;
            int var9 = class36.field718[var7] >> 16 & 0xFF;
            int var10 = class36.field718[var7] >> 24 & 0xFF;
            int var11 = class80.field1565[var7] >> 16 & 0xFF;
            int var12 = class80.field1565[var7] & 0xFFFF;
            var7 = var7 + 1 & 0xFFF;
            boolean var13 = false;
            if ((class233.field4007[class189.field3261][var8][var12] & 0x4) == 0) {
                var13 = true;
            }
            boolean var14 = false;
            label220: for (int var15 = class189.field3261 + 1; var15 <= 3; var15++) {
                if ((class233.field4007[var15][var8][var12] & 0x8) == 0) {
                    if (var13 && arg1[var15][var8][var12] != null) {
                        if (arg1[var15][var8][var12].field3024 != null) {
                            int var18 = class148.method1000((byte) -3, var9);
                            if (arg1[var15][var8][var12].field3024.field171 == var18 || arg1[var15][var8][var12].field3024.field161 == var18) {
                                continue;
                            }
                            if (var10 != 0) {
                                int var19 = class148.method1000((byte) -3, var10);
                                if (arg1[var15][var8][var12].field3024.field171 == var19 || arg1[var15][var8][var12].field3024.field161 == var19) {
                                    continue;
                                }
                            }
                            if (var11 != 0) {
                                int var20 = class148.method1000((byte) -3, var11);
                                if (arg1[var15][var8][var12].field3024.field171 == var20 || arg1[var15][var8][var12].field3024.field161 == var20) {
                                    continue;
                                }
                            }
                        }
                        if (arg1[var15][var8][var12].field3017 != null) {
                            for (int var21 = 0; var21 < arg1[var15][var8][var12].field3012; var21++) {
                                int var22 = (int) (arg1[var15][var8][var12].field3017[var21].field2702 >> 14 & 0x3FL);
                                if (var22 == 21) {
                                    var22 = 19;
                                }
                                int var23 = (int) (arg1[var15][var8][var12].field3017[var21].field2702 >> 20 & 0x3L);
                                int var24 = var23 << 6 | var22;
                                if (var9 == var24 || var10 != 0 && var10 == var24 || var11 != 0 && var11 == var24) {
                                    continue label220;
                                }
                            }
                        }
                    }
                    var14 = true;
                    class177 var25 = arg1[var15][var8][var12];
                    if (var25 != null && var25.field3012 > 0) {
                        for (int var26 = 0; var26 < var25.field3012; var26++) {
                            class154 var27 = var25.field3017[var26];
                            if (var27.field2695 != var27.field2693 || var27.field2700 != var27.field2688) {
                                for (int var28 = var27.field2693; var28 <= var27.field2695; var28++) {
                                    for (int var29 = var27.field2688; var29 <= var27.field2700; var29++) {
                                        class199.field3411[var15][var28][var29] = var5;
                                    }
                                }
                            }
                        }
                    }
                    class199.field3411[var15][var8][var12] = var5;
                }
            }
            if (var14) {
                if (class131.field2341[arg4] < class243.field4208[class189.field3261 + 1][var8][var12]) {
                    class131.field2341[arg4] = class243.field4208[class189.field3261 + 1][var8][var12];
                }
                int var16 = var12 << 7;
                int var17 = var8 << 7;
                if (class92.field1752[arg4] > var17) {
                    class92.field1752[arg4] = var17;
                } else if (var17 > class242.field4193[arg4]) {
                    class242.field4193[arg4] = var17;
                }
                if (class33.field648[arg4] > var16) {
                    class33.field648[arg4] = var16;
                } else if (class42.field846[arg4] < var16) {
                    class42.field846[arg4] = var16;
                }
            }
            if (!var13) {
                if (var8 >= 1 && class199.field3411[class189.field3261][var8 - 1][var12] != var5) {
                    class36.field718[var30] = class198.method1332(class198.method1332(1179648, var8 - 1), -754974720);
                    class80.field1565[var30] = class198.method1332(var12, 1245184);
                    class199.field3411[class189.field3261][var8 - 1][var12] = var5;
                    var30 = var30 + 1 & 0xFFF;
                }
                var12++;
                if (var12 < 104) {
                    if ((var8 - 1) >= 0 && class199.field3411[class189.field3261][var8 - 1][var12] != var5 && (class233.field4007[class189.field3261][var8][var12] & 0x4) == 0 && (class233.field4007[class189.field3261][var8 - 1][var12 - 1] & 0x4) == 0) {
                        class36.field718[var30] = class198.method1332(1375731712, class198.method1332(1179648, var8 - 1));
                        class80.field1565[var30] = class198.method1332(1245184, var12);
                        class199.field3411[class189.field3261][var8 - 1][var12] = var5;
                        var30 = var30 + 1 & 0xFFF;
                    }
                    if (class199.field3411[class189.field3261][var8][var12] != var5) {
                        class36.field718[var30] = class198.method1332(class198.method1332(5373952, var8), 318767104);
                        class80.field1565[var30] = class198.method1332(5439488, var12);
                        class199.field3411[class189.field3261][var8][var12] = var5;
                        var30 = var30 + 1 & 0xFFF;
                    }
                    if ((var8 + 1) < 104 && class199.field3411[class189.field3261][var8 + 1][var12] != var5 && (class233.field4007[class189.field3261][var8][var12] & 0x4) == 0 && (class233.field4007[class189.field3261][var8 + 1][var12 - 1] & 0x4) == 0) {
                        class36.field718[var30] = class198.method1332(-1845493760, class198.method1332(var8 + 1, 5373952));
                        class80.field1565[var30] = class198.method1332(5439488, var12);
                        class199.field3411[class189.field3261][var8 + 1][var12] = var5;
                        var30 = var30 + 1 & 0xFFF;
                    }
                }
                var12--;
                if ((var8 + 1) < 104 && class199.field3411[class189.field3261][var8 + 1][var12] != var5) {
                    class36.field718[var30] = class198.method1332(class198.method1332(var8 + 1, 9568256), 1392508928);
                    class80.field1565[var30] = class198.method1332(var12, 9633792);
                    class199.field3411[class189.field3261][var8 + 1][var12] = var5;
                    var30 = var30 + 1 & 0xFFF;
                }
                var12--;
                if (var12 >= 0) {
                    if (var8 - 1 >= 0 && class199.field3411[class189.field3261][var8 - 1][var12] != var5 && (class233.field4007[class189.field3261][var8][var12] & 0x4) == 0 && (class233.field4007[class189.field3261][var8 - 1][var12 + 1] & 0x4) == 0) {
                        class36.field718[var30] = class198.method1332(301989888, class198.method1332(13762560, var8 - 1));
                        class80.field1565[var30] = class198.method1332(var12, 13828096);
                        var30 = var30 + 1 & 0xFFF;
                        class199.field3411[class189.field3261][var8 - 1][var12] = var5;
                    }
                    if (class199.field3411[class189.field3261][var8][var12] != var5) {
                        class36.field718[var30] = class198.method1332(-1828716544, class198.method1332(var8, 13762560));
                        class80.field1565[var30] = class198.method1332(13828096, var12);
                        var30 = var30 + 1 & 0xFFF;
                        class199.field3411[class189.field3261][var8][var12] = var5;
                    }
                    if (var8 + 1 < 104 && class199.field3411[class189.field3261][var8 + 1][var12] != var5 && (class233.field4007[class189.field3261][var8][var12] & 0x4) == 0 && (class233.field4007[class189.field3261][var8 + 1][var12 + 1] & 0x4) == 0) {
                        class36.field718[var30] = class198.method1332(class198.method1332(var8 + 1, 9568256), -771751936);
                        class80.field1565[var30] = class198.method1332(var12, 9633792);
                        var30 = var30 + 1 & 0xFFF;
                        class199.field3411[class189.field3261][var8 + 1][var12] = var5;
                    }
                }
            }
        }
        if (class131.field2341[arg4] == -1000000) {
            return;
        }
        class131.field2341[arg4] += 10;
        class92.field1752[arg4] -= 50;
        class242.field4193[arg4] += 50;
        class42.field846[arg4] += 50;
        class33.field648[arg4] -= 50;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "([B)V")
    public class212(byte[] arg0) {
        this.field3631 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(II)V")
    public static final void method1431(int arg0, int arg1) {
        class252.field4334 = null;
        field3633++;
        class196.field3316 = -1;
        class244.field4242 = 1;
        class55.field1179 = 0;
        if (arg0 > -72) {
            field3628 = -93;
        }
        class19.field405 = false;
        class89.field1707 = arg1;
        class178.field3086 = -1;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILvb;Ls;I)V")
    public static final void method1432(int arg0, class226 arg1, class229 arg2, int arg3) {
        field3629++;
        class108 var4 = new class108();
        var4.field573 = (long) arg3;
        var4.field2009 = arg1;
        var4.field2010 = 1;
        var4.field2018 = arg2;
        class33 var5 = class34.field659;
        synchronized (class34.field659) {
            class34.field659.method287(var4, 0);
        }
        if (arg0 > -115) {
            field3634 = null;
        }
        class30.method251((byte) 106);
    }
}
