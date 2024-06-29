import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class92 implements Runnable {

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field2434 = -1;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Lke;")
    public static class65 field2424 = class1.method17("Bitte starten Sie eine Mitgliedschaft", -114);

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lke;")
    private static class65 field2433 = class1.method17("Enter name of player to delete from list", -117);

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Lke;")
    public static class65 field2437 = field2433;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lqd;")
    public static class100 field2427 = new class100(64);

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Lke;")
    public static class65 field2440 = class1.method17("Das ist eine Mitglieder)2Welt(Q", -111);

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Lke;")
    public static class65 field2438 = class1.method17("(X100(U(Y", -115);

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field2439 = 0;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Luc;")
    public static class119 field2436;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Ljd;")
    public static class58 field2425;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lpa;")
    public static class90 field2435;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "[Lkb;")
    public static class61[] field2430;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Z", line = 9)
    public static final boolean method799(int arg0, int arg1) {
        field2429++;
        if (arg0 != -18266) {
            field2438 = null;
        }
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 28)
    public static final void method800(byte arg0) {
        try {
            Graphics var1 = class10.field210.getGraphics();
            class58.field1590.method790(4, 4, var1, arg0 - 15);
        } catch (Exception var2) {
            class10.field210.repaint();
        }
        field2432++;
        if (arg0 != 120) {
            field2440 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "run", descriptor = "()V", line = 54)
    public final void run() {
        field2431++;
        try {
            while (true) {
                class53 var1 = class51.field1292;
                class81 var2;
                synchronized (class51.field1292) {
                    var2 = (class81) class51.field1292.method421(1);
                }
                if (var2 == null) {
                    class58.method498(100L, 10);
                    Object var3 = class46.field1218;
                    synchronized (class46.field1218) {
                        if (class39.field1045 <= 1) {
                            class39.field1045 = 0;
                            class46.field1218.notifyAll();
                            return;
                        }
                        class39.field1045--;
                    }
                } else {
                    if (var2.field2153 == 0) {
                        var2.field2151.method578(var2.field2164.length, var2.field2164, (int) var2.field349, 114);
                        class53 var4 = class51.field1292;
                        synchronized (class51.field1292) {
                            var2.method133(2);
                        }
                    } else if (var2.field2153 == 1) {
                        var2.field2164 = var2.field2151.method576((int) var2.field349, -127);
                        class53 var5 = class51.field1292;
                        synchronized (class51.field1292) {
                            class121.field2973.method425(var2, 16);
                        }
                    }
                    Object var6 = class46.field1218;
                    synchronized (class46.field1218) {
                        if (class39.field1045 <= 1) {
                            class39.field1045 = 0;
                            class46.field1218.notifyAll();
                            return;
                        }
                        class39.field1045 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class129.method1015(-92, var17, null);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIIIIZI)V", line = 146)
    public static final void method801(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field2428++;
        if (arg9 || (!class28.method232(arg3, true) || (arg10 > arg7 || arg6 < arg0 || arg5 <= arg7 || arg2 <= arg6))) {
            return;
        }
        class27[] var11 = class88.field2361[arg3];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class27 var13 = var11[var12];
            if (var13 != null && var13.field720 == arg8) {
                int var14 = var13.field722 + arg10;
                int var15 = arg0 + var13.field675 - arg1;
                if (var13.field671 == 8 && arg7 >= var14 && var15 <= arg6 && var13.field734 + var14 > arg7 && var15 + var13.field708 > arg6) {
                    class89.field2378 = var12;
                }
                if ((var13.field695 >= 0 || var13.field698 != 0) && arg7 >= var14 && var15 <= arg6 && arg7 < var13.field734 + var14 && var15 + var13.field708 > arg6) {
                    if (var13.field695 < 0) {
                        class87.field2304 = var12;
                    } else {
                        class87.field2304 = var13.field695;
                    }
                }
                if (var13.field671 != 0) {
                    if (var13.field669 == 1 && arg7 >= var14 && arg6 >= var15 && var13.field734 + var14 > arg7 && var15 + var13.field708 > arg6) {
                        boolean var16 = false;
                        if (var13.field705 != 0) {
                            var16 = class60.method504(var13, (byte) 96);
                        }
                        if (!var16) {
                            class97.method812(0, var13.field719, -121, class100.field2591, 48, 0, (arg3 << 16) + var12);
                            class64.field1658++;
                        }
                    }
                    if (var13.field669 == 2 && class101.field2635 == 0 && arg7 >= var14 && var15 <= arg6 && var13.field734 + var14 > arg7 && var15 + var13.field708 > arg6) {
                        class97.method812(0, var13.field711, -121, class21.method172(-53, new class65[] { class48.field1261, var13.field704 }), 19, 0, (arg3 << 16) + var12);
                        class32.field839++;
                    }
                    if (var13.field669 == 3 && arg7 >= var14 && arg6 >= var15 && arg7 < var13.field734 + var14 && arg6 < var15 + var13.field708) {
                        class43.field1130++;
                        byte var17;
                        if (arg4 == 3) {
                            var17 = 12;
                        } else {
                            var17 = 15;
                        }
                        class97.method812(0, class50.field1270, -124, class100.field2591, var17, 0, (arg3 << 16) + var12);
                    }
                    if (var13.field669 == 4 && var14 <= arg7 && var15 <= arg6 && arg7 < var13.field734 + var14 && arg6 < var15 + var13.field708) {
                        class97.method812(0, var13.field719, -121, class100.field2591, 24, 0, (arg3 << 16) + var12);
                        class39.field1029++;
                    }
                    if (var13.field669 == 5 && var14 <= arg7 && arg6 >= var15 && arg7 < var14 + var13.field734 && var13.field708 + var15 > arg6) {
                        class97.method812(0, var13.field719, -128, class100.field2591, 55, 0, (arg3 << 16) + var12);
                        class128.field3086++;
                    }
                    if (var13.field669 == 6 && !class13.field278 && arg7 >= var14 && var15 <= arg6 && var13.field734 + var14 > arg7 && var15 + var13.field708 > arg6) {
                        class22.field528++;
                        class97.method812(0, var13.field719, -124, class100.field2591, 3, 0, (arg3 << 16) + var12);
                    }
                    if (var13.field671 == 2) {
                        int var18 = 0;
                        for (int var19 = 0; var19 < var13.field708; var19++) {
                            for (int var20 = 0; var20 < var13.field734; var20++) {
                                int var21 = (var13.field702 + 32) * var20 + var14;
                                int var22 = var15 + (var13.field694 + 32) * var19;
                                if (var18 < 20) {
                                    var22 += var13.field714[var18];
                                    var21 += var13.field696[var18];
                                }
                                if (arg7 >= var21 && var22 <= arg6 && var21 + 32 > arg7 && arg6 < var22 + 32) {
                                    class115.field2883 = var18;
                                    class126.field3060 = (arg3 << 16) + var12;
                                    if (var13.field676[var18] > 0) {
                                        class57 var23 = class81.method715(false, var13.field676[var18] - 1);
                                        if (client.field382 == 1 && var13.field692) {
                                            if ((arg3 << 16) + var12 != class111.field2736 || class72.field1896 != var18) {
                                                class97.method812(var18, class88.field2351, -124, class21.method172(-107, new class65[] { class101.field2634, class114.field2873, var23.field1482 }), 23, var23.field1486, (arg3 << 16) + var12);
                                                class102.field2658++;
                                            }
                                        } else if (class101.field2635 != 1 || !var13.field692) {
                                            class65[] var24 = var23.field1478;
                                            class44.field1162++;
                                            if (class33.field849) {
                                                var24 = class13.method75(5, var24);
                                            }
                                            if (var13.field692) {
                                                for (int var25 = 4; var25 >= 3; var25--) {
                                                    if (var24 != null && var24[var25] != null) {
                                                        byte var26;
                                                        if (var25 == 3) {
                                                            var26 = 25;
                                                        } else {
                                                            var26 = 27;
                                                        }
                                                        class21.field509++;
                                                        class97.method812(var18, var24[var25], -120, class21.method172(-117, new class65[] { class58.field1586, var23.field1482 }), var26, var23.field1486, (arg3 << 16) + var12);
                                                    } else if (var25 == 4) {
                                                        class104.field2681++;
                                                        class97.method812(var18, class19.field420, -126, class21.method172(-128, new class65[] { class58.field1586, var23.field1482 }), 27, var23.field1486, (arg3 << 16) + var12);
                                                    }
                                                }
                                            }
                                            if (var13.field688) {
                                                class65.field1699++;
                                                class97.method812(var18, class88.field2351, -121, class21.method172(-80, new class65[] { class58.field1586, var23.field1482 }), 53, var23.field1486, (arg3 << 16) + var12);
                                            }
                                            if (var13.field692 && var24 != null) {
                                                for (int var27 = 2; var27 >= 0; var27--) {
                                                    if (var24[var27] != null) {
                                                        class21.field507++;
                                                        byte var28 = 0;
                                                        if (var27 == 0) {
                                                            var28 = 29;
                                                        }
                                                        if (var27 == 1) {
                                                            var28 = 49;
                                                        }
                                                        if (var27 == 2) {
                                                            var28 = 21;
                                                        }
                                                        class97.method812(var18, var24[var27], -120, class21.method172(-118, new class65[] { class58.field1586, var23.field1482 }), var28, var23.field1486, (arg3 << 16) + var12);
                                                    }
                                                }
                                            }
                                            class65[] var29 = var13.field667;
                                            if (class33.field849) {
                                                var29 = class13.method75(5, var29);
                                            }
                                            if (var29 != null) {
                                                for (int var30 = 4; var30 >= 0; var30--) {
                                                    if (var29[var30] != null) {
                                                        class113.field2826++;
                                                        byte var31 = 0;
                                                        if (var30 == 0) {
                                                            var31 = 36;
                                                        }
                                                        if (var30 == 1) {
                                                            var31 = 38;
                                                        }
                                                        if (var30 == 2) {
                                                            var31 = 6;
                                                        }
                                                        if (var30 == 3) {
                                                            var31 = 46;
                                                        }
                                                        if (var30 == 4) {
                                                            var31 = 8;
                                                        }
                                                        class97.method812(var18, var29[var30], -121, class21.method172(-55, new class65[] { class58.field1586, var23.field1482 }), var31, var23.field1486, (arg3 << 16) + var12);
                                                    }
                                                }
                                            }
                                            class97.method812(var18, class128.field3088, -121, class21.method172(-81, new class65[] { class58.field1586, var23.field1482 }), 1001, var23.field1486, (arg3 << 16) + var12);
                                        } else if ((class46.field1213 & 0x10) == 16) {
                                            class97.method812(var18, class28.field749, -121, class21.method172(-68, new class65[] { class51.field1286, class114.field2873, var23.field1482 }), 22, var23.field1486, (arg3 << 16) + var12);
                                            class27.field690++;
                                        }
                                    }
                                }
                                var18++;
                            }
                        }
                    }
                } else if (!var13.field655 || class58.method487(-3, var12, arg4) || class6.field121) {
                    method801(var15, var13.field710, var13.field708 + var15, arg3, arg4, var13.field734 + var14, arg6, arg7, var12, false, var14);
                    if (var13.field673 > var13.field708) {
                        class57.method466(4, var15, arg7, var13.field708, arg4, arg6, var13, var13.field673, var13.field734 + var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLec;)Z", line = 485)
    public static final boolean method802(byte arg0, class27 arg1) {
        field2423++;
        if (arg1.field730 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0 != 42) {
            field2425 = null;
        }
        while (var2 < arg1.field730.length) {
            int var3 = class81.method708((byte) -122, arg1, var2);
            int var4 = arg1.field682[var2];
            if (arg1.field730[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field730[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field730[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V", line = 540)
    public static void method803(byte arg0) {
        field2435 = null;
        field2438 = null;
        if (arg0 != 92) {
            return;
        }
        field2433 = null;
        field2430 = null;
        field2425 = null;
        field2440 = null;
        field2427 = null;
        field2424 = null;
        field2436 = null;
        field2437 = null;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V", line = 576)
    public static final void method804(byte arg0) {
        field2426++;
        short var1 = 256;
        for (int var2 = 10; var2 < 117; var2++) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                class83.field2182[(var1 - 2 << 7) + var2] = 255;
            }
        }
        for (int var3 = 0; var3 < 100; var3++) {
            int var15 = (int) (Math.random() * 128.0D) + 128;
            int var16 = (int) (Math.random() * 124.0D) + 2;
            int var17 = (var15 << 7) + var16;
            class83.field2182[var17] = 192;
        }
        for (int var4 = 1; var4 < var1 - 1; var4++) {
            for (int var13 = 1; var13 < 127; var13++) {
                int var14 = var13 + (var4 << 7);
                class128.field3100[var14] = (class83.field2182[var14 - 1] + class83.field2182[var14 + 1] + class83.field2182[var14 + -128] + class83.field2182[var14 + 128]) / 4;
            }
        }
        class76.field2033 += 128;
        if (class74.field1980.length < class76.field2033) {
            int var5 = (int) (Math.random() * 12.0D);
            class76.field2033 -= class74.field1980.length;
            class101.method844(class31.field825[var5], -118);
        }
        for (int var6 = 1; var6 < var1 - 1; var6++) {
            for (int var10 = 1; var10 < 127; var10++) {
                int var11 = (var6 << 7) + var10;
                int var12 = class128.field3100[var11 + 128] - class74.field1980[class76.field2033 + var11 & class74.field1980.length + -1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                class83.field2182[var11] = var12;
            }
        }
        int var7 = 60 / ((18 - arg0) / 34);
        for (int var8 = 0; var8 < var1 - 1; var8++) {
            class86.field2294[var8] = class86.field2294[var8 + 1];
        }
        class86.field2294[var1 - 1] = (int) (Math.sin((double) class76.field2028 / 14.0D) * 16.0D + Math.sin((double) class76.field2028 / 15.0D) * 14.0D + Math.sin((double) class76.field2028 / 16.0D) * 12.0D);
        if (class87.field2318 > 0) {
            class87.field2318 -= 4;
        }
        if (class112.field2774 > 0) {
            class112.field2774 -= 4;
        }
        if (class87.field2318 != 0 || class112.field2774 != 0) {
            return;
        }
        int var9 = (int) (Math.random() * 2000.0D);
        if (var9 == 1) {
            class112.field2774 = 1024;
        }
        if (var9 == 0) {
            class87.field2318 = 1024;
            return;
        }
    }
}
