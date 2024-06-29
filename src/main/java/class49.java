import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class49 {

    @OriginalMember(owner = "client!h", name = "i", descriptor = "[Lmb;")
    public static class84[] field1048 = new class84[100];

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Lmb;")
    public static class84 field1044 = class79.method672(true, "Sprites geladen)3");

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Lmb;")
    public static class84 field1042 = class79.method672(true, "Mitteilung");

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static volatile int field1043 = 0;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "[Z")
    public static boolean[] field1040 = new boolean[5];

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Lmb;")
    public static class84 field1057 = class79.method672(true, "chatback");

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field1051 = 127;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "Lmb;")
    public static class84 field1050 = class79.method672(true, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Z")
    public static boolean field1049 = false;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "Lmb;")
    private static class84 field1054 = class79.method672(true, "Report abuse");

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Lmb;")
    public static class84 field1053 = field1054;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Lmb;")
    public static class84 field1059 = class79.method672(true, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "[Lsc;")
    public static class121[] field1056;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static final void method351(int arg0) {
        field1052++;
        if (arg0 < 51) {
            method352(null, -88);
        }
        if (class115.field2745 != 0) {
            return;
        }
        class2.field38[0] = 1003;
        class46.field994[0] = client.field470;
        class20.field429 = 1;
        if (class122.field2948 != -1) {
            class64.field1573 = -1;
            class60.field1491 = -1;
            class39.method298(class60.field1498, class20.field427, 0, 0, 503, 0, 0, class122.field2948, 765);
            class144.field3475 = class60.field1491;
            class36.field798 = class64.field1573;
            return;
        }
        boolean var1 = false;
        class120.method976(-127);
        class64.field1573 = -1;
        class60.field1491 = -1;
        if (class20.field427 > 4 && class60.field1498 > 4 && class20.field427 < 516 && class60.field1498 < 338) {
            if (class79.field1958 == -1) {
                class68.method602(true);
            } else {
                class39.method298(class60.field1498, class20.field427, 4, 0, 338, 0, 4, class79.field1958, 516);
            }
        }
        class36.field798 = class64.field1573;
        class64.field1573 = -1;
        class144.field3475 = class60.field1491;
        class60.field1491 = -1;
        if (class20.field427 > 553 && class60.field1498 > 205 && class20.field427 < 743 && class60.field1498 < 466) {
            if (class89.field2233 != -1) {
                class39.method298(class60.field1498, class20.field427, 205, 1, 466, 0, 553, class89.field2233, 743);
            } else if (class72.field1777[class68.field1654] != -1) {
                class39.method298(class60.field1498, class20.field427, 205, 1, 466, 0, 553, class72.field1777[class68.field1654], 743);
            }
        }
        if (class60.field1491 != class118.field2822) {
            class118.field2822 = class60.field1491;
            class89.field2220 = true;
        }
        if (class64.field1573 != class41.field940) {
            class89.field2220 = true;
            class41.field940 = class64.field1573;
        }
        class60.field1491 = -1;
        class64.field1573 = -1;
        if (class20.field427 > 17 && class60.field1498 > 357 && class20.field427 < 496 && class60.field1498 < 453) {
            if (class83.field2038 != -1) {
                class39.method298(class60.field1498, class20.field427, 357, 2, 453, 0, 17, class83.field2038, 496);
            } else if (class120.field2880 != -1) {
                class39.method298(class60.field1498, class20.field427, 357, 3, 453, 0, 17, class120.field2880, 496);
            } else if (class60.field1498 < 434 && class20.field427 < 426) {
                class5.method29((byte) 2, class20.field427 - 17, class60.field1498 + -357);
            }
        }
        if ((class83.field2038 != -1 || class120.field2880 != -1) && class60.field1491 != class41.field939) {
            class65.field1615 = true;
            class41.field939 = class60.field1491;
        }
        if ((class83.field2038 != -1 || class120.field2880 != -1) && class64.field1573 != class134.field3206) {
            class134.field3206 = class64.field1573;
            class65.field1615 = true;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class20.field429 - 1; var2++) {
                if (class2.field38[var2] < 1000 && class2.field38[var2 + 1] > 1000) {
                    var1 = false;
                    class84 var3 = class46.field994[var2];
                    class46.field994[var2] = class46.field994[var2 + 1];
                    class46.field994[var2 + 1] = var3;
                    int var4 = class2.field38[var2];
                    class2.field38[var2] = class2.field38[var2 + 1];
                    class2.field38[var2 + 1] = var4;
                    int var5 = client.field462[var2];
                    client.field462[var2] = client.field462[var2 + 1];
                    client.field462[var2 + 1] = var5;
                    int var6 = class46.field998[var2];
                    class46.field998[var2] = class46.field998[var2 + 1];
                    class46.field998[var2 + 1] = var6;
                    int var7 = class123.field2972[var2];
                    class123.field2972[var2] = class123.field2972[var2 + 1];
                    class123.field2972[var2 + 1] = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([BI)[B")
    public static final byte[] method352(byte[] arg0, int arg1) {
        if (arg1 != 0) {
            method355(70, -115);
        }
        int var2 = arg0.length;
        field1041++;
        byte[] var3 = new byte[var2];
        class55.method449(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method353(int arg0, int arg1) {
        field1047++;
        if (arg1 == 100 && class123.field2965 > 0) {
            byte[] var2 = class133.field3177[--class123.field2965];
            class133.field3177[class123.field2965] = null;
            return var2;
        }
        if (arg0 > -64) {
            method351(111);
        }
        if (arg1 == 5000 && class46.field1000 > 0) {
            byte[] var3 = class79.field1951[--class46.field1000];
            class79.field1951[class46.field1000] = null;
            return var3;
        } else if (arg1 == 30000 && class145.field3511 > 0) {
            byte[] var4 = class69.field1677[--class145.field3511];
            class69.field1677[class145.field3511] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIB)I")
    public static final int method354(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 & 0x3;
        field1055++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            if (arg3 != -31) {
                field1049 = false;
            }
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)V")
    public static final void method355(int arg0, int arg1) {
        field1046++;
        if (arg0 != 29726) {
            return;
        }
        if (arg1 == -1 && !class76.field1920) {
            class94.method793(112);
        } else if (arg1 != -1 && class90.field2244 != arg1 && class128.field3096 != 0 && !class76.field1920) {
            class74.method641(class27.field655, false, 2, arg1, class128.field3096, 0, arg0 ^ 0xFFFF8BE1);
        }
        class90.field2244 = arg1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIBLve;)V")
    public static final void method356(int arg0, int arg1, int arg2, byte arg3, class141 arg4) {
        field1045++;
        if (class20.field429 >= 400) {
            return;
        }
        if (arg4.field3370 != null) {
            arg4 = arg4.method1144(0);
        }
        if (arg3 != -39) {
            field1042 = null;
        }
        if (arg4 == null || !arg4.field3397) {
            return;
        }
        class84 var5 = arg4.field3374;
        if (arg4.field3366 != 0) {
            var5 = class51.method408(new class84[] { var5, class87.method748(arg4.field3366, -4174, class40.field925.field1517), class76.field1919, class57.field1400, class93.method787(arg3 + 22284, arg4.field3366), class118.field2807 }, 103);
        }
        if (client.field465 == 1) {
            class129.method1051(arg0, 5, class51.method408(new class84[] { class17.field367, class110.field2652, var5 }, 101), 16711680, arg1, arg2, class141.field3398);
            class24.field579++;
        } else if (!class19.field409) {
            class145.field3509++;
            class84[] var6 = arg4.field3388;
            if (class30.field708) {
                var6 = class143.method1174(5, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method731((byte) 97, class33.field741)) {
                        class108.field2604++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 12;
                        }
                        if (var7 == 1) {
                            var8 = 14;
                        }
                        if (var7 == 2) {
                            var8 = 57;
                        }
                        if (var7 == 3) {
                            var8 = 2;
                        }
                        if (var7 == 4) {
                            var8 = 18;
                        }
                        class129.method1051(arg0, var8, class51.method408(new class84[] { class96.field2382, var5 }, arg3 ^ 0xFFFFFFA2), 16711680, arg1, arg2, var6[var7]);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method731((byte) 97, class33.field741)) {
                        class143.field3451++;
                        int var10 = 0;
                        short var11 = 0;
                        if (arg4.field3366 > class40.field925.field1517) {
                            var11 = 2000;
                        }
                        if (var9 == 0) {
                            var10 = var11 + 12;
                        }
                        if (var9 == 1) {
                            var10 = var11 + 14;
                        }
                        if (var9 == 2) {
                            var10 = var11 + 57;
                        }
                        if (var9 == 3) {
                            var10 = var11 + 2;
                        }
                        if (var9 == 4) {
                            var10 = var11 + 18;
                        }
                        class129.method1051(arg0, var10, class51.method408(new class84[] { class96.field2382, var5 }, 118), arg3 + 16711719, arg1, arg2, var6[var9]);
                    }
                }
            }
            class129.method1051(arg0, 1001, class51.method408(new class84[] { class96.field2382, var5 }, 114), 16711680, arg1, arg2, class10.field175);
        } else if ((class122.field2957 & 0x2) == 2) {
            class129.method1051(arg0, 27, class51.method408(new class84[] { class5.field72, class110.field2652, var5 }, -68), arg3 + 16711719, arg1, arg2, class40.field911);
            class17.field380++;
            return;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
    public static void method357(int arg0) {
        field1056 = null;
        field1044 = null;
        field1053 = null;
        int var1 = -26 % ((arg0 + 71) / 49);
        field1042 = null;
        field1050 = null;
        field1048 = null;
        field1059 = null;
        field1040 = null;
        field1054 = null;
        field1057 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)I")
    public static final int method358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg2;
            arg2 = var7;
        }
        if (arg0 != 31318) {
            return 69;
        }
        int var8 = arg1 & 0x3;
        field1058++;
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return arg3;
        } else if (var8 == 2) {
            return 7 + 1 - arg4 - arg5;
        } else {
            return 7 + 1 - arg2 - arg3;
        }
    }
}
