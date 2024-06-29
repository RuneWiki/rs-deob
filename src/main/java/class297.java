import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class297 implements class214 {

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Lcd;")
    public static class64 field5113 = class44.method335((byte) 71, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Lcd;")
    public static class64 field5110 = class44.method335((byte) 71, "<col=ffffff>(Y");

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lcd;")
    public static class64 field5117 = class44.method335((byte) 71, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "[[I")
    public static int[][] field5111 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Lcd;")
    private static class64 field5124 = class44.method335((byte) 71, "flash3:");

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Lcd;")
    public static class64 field5125 = class44.method335((byte) 71, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Lcd;")
    public static class64 field5126 = class44.method335((byte) 71, "Loaded titlescreen)3");

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Lcd;")
    public static class64 field5119 = field5124;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Lcd;")
    public static class64 field5127 = field5124;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Lqm;")
    public static class222 field5114;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lqm;")
    public static class222 field5120;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lja;")
    public static class60 field5116;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "[Lwh;")
    public static class9[] field5122;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIZ)I", line = 5)
    public static final int method2071(int arg0, int arg1, boolean arg2) {
        field5123++;
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        if (arg2) {
            return -7;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 40)
    public static final void method2072(int arg0) {
        field5121++;
        if (class99.field1792 == 0) {
            return;
        }
        try {
            if (++class261.field4486 > 2000) {
                if (class216.field3626 != null) {
                    class216.field3626.method225(1);
                    class216.field3626 = null;
                }
                if (class269.field4649 >= 1) {
                    class99.field1792 = 0;
                    class138.field2456 = -5;
                    return;
                }
                if (class60.field1174 == class230.field3909) {
                    class230.field3909 = class180.field3089;
                } else {
                    class230.field3909 = class60.field1174;
                }
                class269.field4649++;
                class99.field1792 = 1;
                class261.field4486 = 0;
            }
            if (class99.field1792 == 1) {
                class283.field4873 = class228.field3876.method1948(class230.field3909, class247.field4296, (byte) -16);
                class99.field1792 = 2;
            }
            if (arg0 != -12043) {
                method2072(91);
            }
            if (class99.field1792 == 2) {
                if (class283.field4873.field375 == 2) {
                    throw new IOException();
                }
                if (class283.field4873.field375 != 1) {
                    return;
                }
                class216.field3626 = new class24((Socket) class283.field4873.field377, class228.field3876);
                class283.field4873 = null;
                class216.field3626.method227(class17.field353.field254, 0, 3, class17.field353.field281);
                if (class94.field1747 != null) {
                    class94.field1747.method1055(2000);
                }
                if (class315.field5334 != null) {
                    class315.field5334.method1055(2000);
                }
                int var1 = class216.field3626.method223((byte) 114);
                if (class94.field1747 != null) {
                    class94.field1747.method1055(2000);
                }
                if (class315.field5334 != null) {
                    class315.field5334.method1055(2000);
                }
                if (var1 != 21) {
                    class138.field2456 = var1;
                    class99.field1792 = 0;
                    class216.field3626.method225(1);
                    class216.field3626 = null;
                    return;
                }
                class99.field1792 = 3;
            }
            if (class99.field1792 == 3) {
                if (class216.field3626.method219(0) < 1) {
                    return;
                }
                class135.field2407 = new class64[class216.field3626.method223((byte) 113)];
                class99.field1792 = 4;
            }
            if (class99.field1792 == 4) {
                if (class216.field3626.method219(arg0 ^ 0xFFFFD0F5) < class135.field2407.length * 8) {
                    return;
                }
                class108.field1991.field281 = 0;
                class216.field3626.method221(class108.field1991.field254, 0, 83, class135.field2407.length * 8);
                for (int var2 = 0; var2 < class135.field2407.length; var2++) {
                    class135.field2407[var2] = class99.method734(true, class108.field1991.method146((byte) 113));
                }
                class138.field2456 = 21;
                class99.field1792 = 0;
                class216.field3626.method225(arg0 + 12044);
                class216.field3626 = null;
                return;
            }
        } catch (IOException var4) {
            if (class216.field3626 != null) {
                class216.field3626.method225(1);
                class216.field3626 = null;
            }
            if (class269.field4649 >= 1) {
                class99.field1792 = 0;
                class138.field2456 = -4;
            } else {
                if (class60.field1174 == class230.field3909) {
                    class230.field3909 = class180.field3089;
                } else {
                    class230.field3909 = class60.field1174;
                }
                class99.field1792 = 1;
                class261.field4486 = 0;
                class269.field4649++;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(J[III)Lcd;", line = 197)
    public final class64 method1506(long arg0, int[] arg1, int arg2, int arg3) {
        if (arg2 > -23) {
            field5127 = (class64) null;
        }
        field5115++;
        if (arg3 == 0) {
            class80 var7 = class166.method1186(0, arg1[0]);
            return var7.method629((int) arg0, true);
        } else if (arg3 == 1 || arg3 == 10) {
            class92 var6 = class132.method949((int) arg0, false);
            return var6.field1669;
        } else if (arg3 == 6 || arg3 == 7) {
            return class166.method1186(0, arg1[0]).method629((int) arg0, true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZIZZI)Lqm;", line = 230)
    public static final class222 method2073(boolean arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field5118++;
        if (arg1 != 0) {
            field5125 = (class64) null;
        }
        class30 var5 = null;
        if (class106.field1961 != null) {
            var5 = new class30(arg4, class106.field1961, class312.field5297[arg4], 1000000);
        }
        class158.field2781[arg4] = class258.field4457.method396((byte) -83, arg4, class60.field1183, var5);
        if (arg3) {
            class158.field2781[arg4].method256((byte) 1);
        }
        return new class222(class158.field2781[arg4], arg0, arg2);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII)V", line = 269)
    public static final void method2074(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class276.field4745 < 100) {
            class194.method1367((byte) -20);
        }
        if (class123.field2216) {
            class21.method209(arg0, arg3, arg0 + arg2, arg3 + arg4);
        } else {
            class210.method1470(arg0, arg3, arg0 + arg2, arg3 - -arg4);
        }
        field5112++;
        if (class276.field4745 < 100) {
            byte var15 = 20;
            int var16 = arg0 + (arg2 / 2);
            int var17 = arg3 + (arg4 / 2) - var15 - 18;
            if (class123.field2216) {
                class21.method208(arg0, arg3, arg2, arg4, 0);
                class21.method212(var16 - 152, var17, 304, 34, 9179409);
                class21.method212(var16 - 151, var17 + 1, 302, 32, 0);
                class21.method208(var16 - 150, var17 + 2, class276.field4745 * 3, 30, 9179409);
                class21.method208(class276.field4745 * 3 + var16 - 150, var17 + 2, 300 - (class276.field4745 * 3), 30, 0);
            } else {
                class210.method1469(arg0, arg3, arg2, arg4, 0);
                class210.method1468(var16 - 152, var17, 304, 34, 9179409);
                class210.method1468(var16 - 151, var17 + 1, 302, 32, 0);
                class210.method1469(var16 - 150, var17 - -2, class276.field4745 * 3, 30, 9179409);
                class210.method1469(class276.field4745 * 3 + var16 - 150, var17 + 2, 300 - (class276.field4745 * 3), 30, 0);
            }
            class75.field1419.method1263(class255.field4431, var16, var15 + var17, 16777215, -1);
            return;
        }
        class154.field2729 = (int) ((float) (arg4 * 2) / class298.field5138);
        int var5 = class69.field1335 - (int) ((float) arg2 / class298.field5138);
        class101.field1818 = class274.field4699 - ((int) ((float) arg4 / class298.field5138));
        class288.field4916 = class69.field1335 - ((int) ((float) arg2 / class298.field5138));
        int var6 = class274.field4699 - ((int) ((float) arg4 / class298.field5138));
        class232.field3921 = (int) ((float) (arg2 * 2) / class298.field5138);
        int var7 = (int) ((float) arg4 / class298.field5138) + class274.field4699;
        int var8 = (int) ((float) arg2 / class298.field5138) + class69.field1335;
        if (class123.field2216) {
            if (class273.field4695 == null || class273.field4695.field627 != arg2 || class273.field4695.field629 != arg4) {
                class273.field4695 = null;
                class273.field4695 = new class167(arg2, arg4);
            }
            class210.method1466(class273.field4695.field2274, arg2, arg4);
            class306.method2131(0, var5, arg2, 0, 12800, arg4, var7, var6, var8);
            class298.method2079(0, var7, arg2, 0, arg4, -107, var6, var8, var5);
            class58.method449(0, var5, -4, arg2, var7, var8, arg4, var6, 0);
            class273.field4695.method314(arg0, arg3);
        } else {
            class306.method2131(arg3, var5, arg0 + arg2, arg0, 12800, arg3 + arg4, var7, var6, var8);
            class298.method2079(arg3, var7, arg0 + arg2, arg0, arg3 + arg4, 80, var6, var8, var5);
            class58.method449(arg3, var5, -4, arg0 + arg2, var7, var8, arg3 + arg4, var6, arg0);
        }
        int var9 = 82 % ((-arg1 - 16) / 57);
        if (class200.field3434 > 0) {
            class200.field3434--;
        }
        if (!class247.field4299) {
            return;
        }
        int var10 = arg0 + arg2 - 5;
        int var11 = arg3 - (8 - arg4);
        class278.field4796.method1261(class104.method768(new class64[] { class7.field173, class310.method2149(class104.field1928, (byte) -15) }, false), var10, var11, 16776960, -1);
        int var18 = var11 - 15;
        Runtime var12 = Runtime.getRuntime();
        int var13 = (int) ((var12.totalMemory() - var12.freeMemory()) / 1024L);
        int var14 = 16776960;
        if (var13 > 65536) {
            var14 = 16711680;
        }
        class278.field4796.method1261(class104.method768(new class64[] { class36.field591, class310.method2149(var13, (byte) -114), class44.field716 }, false), var10, var18, var14, -1);
        var11 = var18 - 15;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V", line = 386)
    public static final void method2075(boolean arg0) {
        field5109++;
        while (class108.field1991.method1215(8, class26.field428) >= 11) {
            int var1 = class108.field1991.method1220(-23932, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class284.field4888[var1] == null) {
                var2 = true;
                class284.field4888[var1] = new class41();
                if (class181.field3106[var1] != null) {
                    class284.field4888[var1].method316(21089, class181.field3106[var1]);
                }
            }
            class194.field3307[class163.field2862++] = var1;
            class41 var3 = class284.field4888[var1];
            var3.field1911 = class29.field482;
            int var4 = class83.field1527[class108.field1991.method1220(-23932, 3)];
            if (var2) {
                var3.field1889 = var3.field1863 = var4;
            }
            int var5 = class108.field1991.method1220(-23932, 1);
            if (var5 == 1) {
                class89.field1616[class228.field3878++] = var1;
            }
            int var6 = class108.field1991.method1220(-23932, 5);
            int var7 = class108.field1991.method1220(-23932, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class108.field1991.method1220(-23932, 1);
            var3.method320(class139.field2472.field1898[0] + var6, !arg0, var8 == 1, class139.field2472.field1876[0] + var7);
        }
        if (arg0) {
            field5120 = (class222) null;
        }
        class108.field1991.method1210(true);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 456)
    public static void method2076(byte arg0) {
        field5125 = null;
        field5116 = null;
        field5119 = null;
        field5117 = null;
        field5110 = null;
        field5114 = null;
        field5113 = null;
        field5122 = null;
        field5127 = null;
        field5120 = null;
        field5124 = null;
        field5126 = null;
        field5111 = (int[][]) null;
        if (arg0 != 91) {
            field5110 = (class64) null;
        }
    }
}
