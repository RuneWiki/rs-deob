import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class class38 {

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lkh;")
    private static class117 field867 = class224.method1450((byte) 112, "Please enter your username)3");

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lkh;")
    public static class117 field869 = field867;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Lkh;")
    public static class117 field877 = class224.method1450((byte) 9, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "Lkh;")
    public static class117 field878 = null;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "[Lsc;")
    public static class200[] field863 = new class200[500];

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field866 = -1;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "[I")
    public static int[] field879 = new int[128];

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Leh;")
    public static class53 field874;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "[[[I")
    public static int[][][] field873;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)V")
    public static final void method331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var10001 = arg1 + 8402;
        int var9 = arg0 + 1;
        class114.method762(arg5, var10001, arg3, arg2, class167.field3030[arg0]);
        int var11 = arg1 + 8415;
        int var10 = arg4 - 1;
        class114.method762(arg5, var11, arg3, arg2, class167.field3030[arg4]);
        field875++;
        if (arg1 != -8309) {
            field878 = null;
        }
        for (int var6 = var9; var6 <= var10; var6++) {
            int[] var7 = class167.field3030[var6];
            var7[arg5] = var7[arg3] = arg2;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static final void method332(int arg0) {
        field868++;
        class67.field1281.method410((byte) 71);
        if (arg0 < 3) {
            method335((byte) 37);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lkh;II)V")
    public static final void method333(class117 arg0, int arg1, int arg2) {
        field881++;
        class117 var3 = arg0.method776(92).method796((byte) -40);
        boolean var4 = false;
        if (arg1 != 7) {
            method335((byte) -22);
        }
        for (int var5 = 0; var5 < class229.field4121; var5++) {
            class56 var6 = class43.field950[class139.field2539[var5]];
            if (var6 != null && var6.field1141 != null && var6.field1141.method789(var3, arg1 ^ 0xFFFFFF82)) {
                var4 = true;
                class169.method1190(var6.field4266[0], 2, 0, false, 0, (byte) 104, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var6.field4259[0], 1, 0);
                if (arg2 == 1) {
                    class105.field1911.method400(65, arg1 ^ 0xF);
                    class105.field1911.method1017(class139.field2539[var5], false);
                    class74.field1408++;
                } else if (arg2 == 4) {
                    class43.field953++;
                    class105.field1911.method400(214, 8);
                    class105.field1911.method1046(118, class139.field2539[var5]);
                } else if (arg2 == 6) {
                    class218.field3967++;
                    class105.field1911.method400(161, 8);
                    class105.field1911.method1046(115, class139.field2539[var5]);
                } else if (arg2 == 7) {
                    class105.field1911.method400(47, 8);
                    class110.field2071++;
                    class105.field1911.method1005(arg1 ^ 0x6AB1, class139.field2539[var5]);
                }
                break;
            }
        }
        if (!var4) {
            class14.method129(class169.field3042, class36.method316((byte) -34, new class117[] { class31.field738, var3 }), 0, 0);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    public static final void method334(int arg0) {
        field864++;
        for (class159 var1 = (class159) class145.field2606.method314((byte) -26); var1 != null; var1 = (class159) class145.field2606.method320(0)) {
            if (var1.field2896 == -1) {
                var1.field2908 = 0;
                class4.method33((byte) -51, var1);
            } else {
                var1.method123((byte) -126);
            }
        }
        int var2 = 122 / ((arg0 + 1) / 52);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "()Z")
    public boolean method146() {
        field872++;
        return false;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method335(byte arg0) {
        field878 = null;
        field877 = null;
        field863 = null;
        field873 = null;
        field869 = null;
        if (arg0 != 102) {
            method336(10, -111, 18, 98, 18, (byte) -74, -26);
        }
        field879 = null;
        field867 = null;
        field874 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)Ldd;")
    public class38 method136(int arg0, int arg1, int arg2) {
        field876++;
        return this;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method336(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class39.field904 = 0;
        field862++;
        if (arg5 > -43) {
            return;
        }
        for (int var7 = -1; var7 < class229.field4121 + class61.field1229; var7++) {
            class234 var23;
            if (var7 == -1) {
                var23 = class93.field1712;
            } else if (var7 >= class229.field4121) {
                var23 = class1.field18[class21.field565[var7 - class229.field4121]];
            } else {
                var23 = class43.field950[class139.field2539[var7]];
            }
            if (var23 != null && var23.method425(-127)) {
                if (var23 instanceof class207) {
                    class109 var24 = ((class207) var23).field3718;
                    if (var24.field2034 != null) {
                        var24 = var24.method733(false);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (var7 >= class229.field4121) {
                    class109 var25 = ((class207) var23).field3718;
                    if (var25.field2034 != null) {
                        var25 = var25.method733(false);
                    }
                    if (var25.field2026 >= 0 && var25.field2026 < class56.field1166.length) {
                        class120.method845(arg1, var23, arg6, arg2 >> 1, arg4 >> 1, var23.method1511(true) + 15, Integer.MAX_VALUE);
                        if (class56.field1164 > -1) {
                            class56.field1166[var25.field2026].method273(arg3 + class56.field1164 - 12, class114.field2128 + -30 + arg0);
                        }
                    }
                    int var26 = 0;
                    class209[] var27 = class84.field1598;
                    while (var26 < var27.length) {
                        class209 var28 = var27[var26];
                        if (var28 != null && var28.field3760 == 1 && class21.field565[var7 - class229.field4121] == var28.field3745 && class44.field966 % 20 < 10) {
                            class120.method845(arg1, var23, arg6, arg2 >> 1, arg4 >> 1, var23.method1511(true) + 15, Integer.MAX_VALUE);
                            if (class56.field1164 > -1) {
                                class137.field2476[var28.field3750].method273(class56.field1164 + arg3 - 12, arg0 - 28 + class114.field2128);
                            }
                        }
                        var26++;
                    }
                } else {
                    int var29 = 30;
                    class56 var30 = (class56) var23;
                    if (var30.field1134 != -1 || var30.field1136 != -1) {
                        class120.method845(arg1, var23, arg6, arg2 >> 1, arg4 >> 1, var23.method1511(true) + 15, Integer.MAX_VALUE);
                        if (class56.field1164 > -1) {
                            if (var30.field1134 != -1) {
                                class70.field1343[var30.field1134].method273(arg3 + class56.field1164 - 12, class114.field2128 + arg0 - var29);
                                var29 += 25;
                            }
                            if (var30.field1136 != -1) {
                                class56.field1166[var30.field1136].method273(class56.field1164 + arg3 - 12, class114.field2128 + arg0 + -var29);
                                var29 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class209[] var31 = class84.field1598;
                        for (int var32 = 0; var32 < var31.length; var32++) {
                            class209 var33 = var31[var32];
                            if (var33 != null && var33.field3760 == 10 && class139.field2539[var7] == var33.field3745) {
                                class120.method845(arg1, var23, arg6, arg2 >> 1, arg4 >> 1, var23.method1511(true) + 15, Integer.MAX_VALUE);
                                if (class56.field1164 > -1) {
                                    class137.field2476[var33.field3750].method273(arg3 + class56.field1164 - 12, class114.field2128 + arg0 + -var29);
                                }
                            }
                        }
                    }
                }
                if (var23.field4263 != null && (class229.field4121 <= var7 || class133.field2401 == 0 || class133.field2401 == 3 || class133.field2401 == 1 && class25.method220(((class56) var23).field1141, 0))) {
                    class120.method845(arg1, var23, arg6, arg2 >> 1, arg4 >> 1, var23.method1511(true), Integer.MAX_VALUE);
                    if (class56.field1164 > -1 && class184.field3315 > class39.field904) {
                        class184.field3316[class39.field904] = class199.field3603.method928(var23.field4263) / 2;
                        class184.field3318[class39.field904] = class199.field3603.field2526;
                        class184.field3308[class39.field904] = class56.field1164;
                        class184.field3317[class39.field904] = class114.field2128;
                        class184.field3314[class39.field904] = var23.field4236;
                        class184.field3312[class39.field904] = var23.field4212;
                        class184.field3313[class39.field904] = var23.field4217;
                        class184.field3310[class39.field904] = var23.field4263;
                        class39.field904++;
                    }
                }
                if (class44.field966 < var23.field4235) {
                    class120.method845(arg1, var23, arg6, arg2 >> 1, arg4 >> 1, var23.method1511(true) + 15, Integer.MAX_VALUE);
                    if (class56.field1164 > -1) {
                        class83.method579(class56.field1164 + arg3 - 15, class114.field2128 + arg0 + -3, var23.field4215, 5, 65280);
                        class83.method579(class56.field1164 + arg3 + var23.field4215 - 15, class114.field2128 + -3 + arg0, 30 - var23.field4215, 5, 16711680);
                    }
                }
                for (int var34 = 0; var34 < 4; var34++) {
                    if (class44.field966 < var23.field4269[var34]) {
                        class120.method845(arg1, var23, arg6, arg2 >> 1, arg4 >> 1, var23.method1511(true) / 2, Integer.MAX_VALUE);
                        if (class56.field1164 > -1) {
                            if (var34 == 1) {
                                class114.field2128 -= 20;
                            }
                            if (var34 == 2) {
                                class56.field1164 -= 15;
                                class114.field2128 -= 10;
                            }
                            if (var34 == 3) {
                                class114.field2128 -= 10;
                                class56.field1164 += 15;
                            }
                            class56.field1135[var23.field4270[var34]].method273(class56.field1164 + arg3 - 12, class114.field2128 + arg0 + -12);
                            class94.field1718.method935(class42.method358(var23.field4258[var34], (byte) 34), class56.field1164 + arg3 - 1, class114.field2128 + 3 + arg0, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class39.field904; var8++) {
            int var9 = class184.field3308[var8];
            int var10 = class184.field3317[var8];
            boolean var11 = true;
            int var12 = class184.field3318[var8];
            int var13 = class184.field3316[var8];
            while (var11) {
                var11 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if (class184.field3317[var22] - class184.field3318[var22] < var10 - -2 && var10 - var12 < class184.field3317[var22] - -2 && var9 - var13 < class184.field3316[var22] + class184.field3308[var22] && class184.field3308[var22] - class184.field3316[var22] < var9 + var13 && class184.field3317[var22] - class184.field3318[var22] < var10) {
                        var11 = true;
                        var10 = class184.field3317[var22] - class184.field3318[var22];
                    }
                }
            }
            class56.field1164 = class184.field3308[var8];
            class114.field2128 = class184.field3317[var8] = var10;
            class117 var14 = class184.field3310[var8];
            if (class62.field1249 == 0) {
                int var15 = 16776960;
                if (class184.field3314[var8] < 6) {
                    var15 = class222.field4007[class184.field3314[var8]];
                }
                if (class184.field3314[var8] == 6) {
                    var15 = class21.field564 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class184.field3314[var8] == 7) {
                    var15 = class21.field564 % 20 >= 10 ? 65535 : 255;
                }
                if (class184.field3314[var8] == 8) {
                    var15 = class21.field564 % 20 < 10 ? 45056 : 8454016;
                }
                if (class184.field3314[var8] == 9) {
                    int var16 = 150 - class184.field3313[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 33160960 - var16 * 327680;
                    } else if (var16 < 150) {
                        var15 = (var16 - 100) * 5 + 65280;
                    }
                }
                if (class184.field3314[var8] == 10) {
                    int var17 = 150 - class184.field3313[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var15 = var17 * 327680 + 500 + 255 - var17 * 5 - 32768000;
                    }
                }
                if (class184.field3314[var8] == 11) {
                    int var18 = 150 - class184.field3313[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - var18 * 327685;
                    } else if (var18 < 100) {
                        var15 = (var18 - 50) * 327685 + 65280;
                    } else if (var18 < 150) {
                        var15 = 49545215 - var18 * 327680;
                    }
                }
                if (class184.field3312[var8] == 0) {
                    class199.field3603.method935(var14, class56.field1164 + arg3, class114.field2128 + arg0, var15, 0);
                }
                if (class184.field3312[var8] == 1) {
                    class199.field3603.method923(var14, class56.field1164 + arg3, class114.field2128 + arg0, var15, 0, class21.field564);
                }
                if (class184.field3312[var8] == 2) {
                    class199.field3603.method924(var14, class56.field1164 + arg3, class114.field2128 + arg0, var15, 0, class21.field564);
                }
                if (class184.field3312[var8] == 3) {
                    class199.field3603.method934(var14, class56.field1164 + arg3, class114.field2128 + arg0, var15, 0, class21.field564, 150 - class184.field3313[var8]);
                }
                if (class184.field3312[var8] == 4) {
                    int var19 = (150 - class184.field3313[var8]) * (class199.field3603.method928(var14) + 100) / 150;
                    class83.method570(arg3 + class56.field1164 - 50, arg0, class56.field1164 + arg3 + 50, arg0 + arg2);
                    class199.field3603.method938(var14, class56.field1164 + arg3 + 50 - var19, class114.field2128 + arg0, var15, 0);
                    class83.method575(arg3, arg0, arg3 + arg4, arg0 + arg2);
                }
                if (class184.field3312[var8] == 5) {
                    int var20 = 150 - class184.field3313[var8];
                    int var21 = 0;
                    class83.method570(arg3, arg0 + class114.field2128 - class199.field3603.field2526 - 1, arg3 + arg4, class114.field2128 + arg0 + 5);
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class199.field3603.method935(var14, arg3 + class56.field1164, class114.field2128 + arg0 + var21, var15, 0);
                    class83.method575(arg3, arg0, arg3 + arg4, arg0 + arg2);
                }
            } else {
                class199.field3603.method935(var14, class56.field1164 + arg3, class114.field2128 + arg0, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ldd;IIIZ)V")
    public void method152(class38 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field871++;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)V")
    public void method337(int arg0, int arg1, int arg2) {
        field865++;
        if (arg1 > -71) {
            method332(32);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "()I")
    public abstract int method134();

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);
}
