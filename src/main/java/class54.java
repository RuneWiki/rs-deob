import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class54 {

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1193 = 0;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "[B")
    public static byte[] field1190 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field1196 = 0;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "Loa;")
    private static class98 field1200 = class38.method349(255, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Loa;")
    public static class98 field1202 = class38.method349(255, ")1j");

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1188 = 0;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field1203 = 0;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field1199 = 0;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Loa;")
    public static class98 field1194 = field1200;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Ltb;")
    public static class130 field1191;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILtd;)Z")
    public static final boolean method438(int arg0, class132 arg1) {
        field1195++;
        if (arg1.field3133 == null) {
            return false;
        }
        if (arg0 <= 7) {
            method446(null, (byte) -32);
        }
        for (int var2 = 0; var2 < arg1.field3133.length; var2++) {
            int var3 = class108.method898(-56, arg1, var2);
            int var4 = arg1.field3201[var2];
            if (arg1.field3133[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field3133[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field3133[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method439(int arg0) {
        field1202 = null;
        field1194 = null;
        if (arg0 != 496) {
            field1188 = 9;
        }
        field1191 = null;
        field1200 = null;
        field1190 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public abstract void method440(byte arg0);

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public abstract void method441(int arg0);

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
    public static final void method442(int arg0) {
        if (class139.field3394 != null) {
            class139.field3394.method283(-30232);
            class139.field3394 = null;
        }
        class62.method505((byte) 36);
        class138.field3373.method258();
        if (arg0 != -25477) {
            return;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class137.field3323[var1].method1198((byte) 35);
        }
        System.gc();
        field1201++;
        class25.method274(2, (byte) 124);
        class8.field193 = false;
        class83.field1917 = -1;
        class73.method588((byte) -89);
        class96.method768((byte) 98, 10);
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    public static final void method443(int arg0) {
        field1189++;
        if (class36.field879 != 0) {
            return;
        }
        class80.field1780 = 1;
        class32.field781[0] = class24.field590;
        class11.field227[0] = 1001;
        if (class77.field1694 != -1) {
            class64.field1374 = -1;
            class36.field889 = -1;
            class65.method529((byte) -124, 0, class77.field1694, 503, 0, class123.field2749, 0, class42.field990, 765);
            class94.field2152 = class64.field1374;
            class62.field1320 = class36.field889;
            return;
        }
        class56.method455((byte) 126);
        class36.field889 = -1;
        if (arg0 < 59) {
            return;
        }
        class64.field1374 = -1;
        boolean var1 = false;
        if (class42.field990 > 4 && class123.field2749 > 4 && class42.field990 < 516 && class123.field2749 < 338) {
            if (class71.field1460 == -1) {
                class113.method915(3);
            } else {
                class65.method529((byte) -92, 4, class71.field1460, 338, 0, class123.field2749, 4, class42.field990, 516);
            }
        }
        class94.field2152 = class64.field1374;
        class64.field1374 = -1;
        class62.field1320 = class36.field889;
        class36.field889 = -1;
        if (class42.field990 > 553 && class123.field2749 > 205 && class42.field990 < 743 && class123.field2749 < 466) {
            if (class132.field3111 != -1) {
                class65.method529((byte) -93, 205, class132.field3111, 466, 1, class123.field2749, 553, class42.field990, 743);
            } else if (class52.field1163[class31.field709] != -1) {
                class65.method529((byte) -100, 205, class52.field1163[class31.field709], 466, 1, class123.field2749, 553, class42.field990, 743);
            }
        }
        if (class36.field889 != class15.field308) {
            class137.field3332 = true;
            class15.field308 = class36.field889;
        }
        if (class64.field1374 != class123.field2739) {
            class123.field2739 = class64.field1374;
            class137.field3332 = true;
        }
        class36.field889 = -1;
        class64.field1374 = -1;
        if (class42.field990 > 17 && class123.field2749 > 357 && class42.field990 < 496 && class123.field2749 < 453) {
            if (class71.field1462 != -1) {
                class65.method529((byte) -124, 357, class71.field1462, 453, 2, class123.field2749, 17, class42.field990, 496);
            } else if (class83.field1923 != -1) {
                class65.method529((byte) -97, 357, class83.field1923, 453, 3, class123.field2749, 17, class42.field990, 496);
            } else if (class123.field2749 < 434 && class42.field990 < 426) {
                class137.method1110(class123.field2749 - 357, (byte) 101, class42.field990 - 17);
            }
        }
        if ((class71.field1462 != -1 || class83.field1923 != -1) && class96.field2201 != class36.field889) {
            class96.field2201 = class36.field889;
            class15.field306 = true;
        }
        if ((class71.field1462 != -1 || class83.field1923 != -1) && class64.field1374 != class64.field1366) {
            class64.field1366 = class64.field1374;
            class15.field306 = true;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class80.field1780 - 1; var2++) {
                if (class11.field227[var2] < 1000 && class11.field227[var2 + 1] > 1000) {
                    var1 = false;
                    class98 var3 = class32.field781[var2];
                    class32.field781[var2] = class32.field781[var2 + 1];
                    class32.field781[var2 + 1] = var3;
                    int var4 = class11.field227[var2];
                    class11.field227[var2] = class11.field227[var2 + 1];
                    class11.field227[var2 + 1] = var4;
                    int var5 = class139.field3406[var2];
                    class139.field3406[var2] = class139.field3406[var2 + 1];
                    class139.field3406[var2 + 1] = var5;
                    int var6 = class113.field2534[var2];
                    class113.field2534[var2] = class113.field2534[var2 + 1];
                    class113.field2534[var2 + 1] = var6;
                    int var7 = class25.field608[var2];
                    class25.field608[var2] = class25.field608[var2 + 1];
                    class25.field608[var2 + 1] = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)I")
    public abstract int method444(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BJ)V")
    public static final void method445(byte arg0, long arg1) {
        field1198++;
        if (arg1 == 0L) {
            return;
        }
        if (class77.field1697 >= 100) {
            class90.method736(0, class87.field1991, true, class145.field3503);
            return;
        }
        class98 var3 = class19.method183(-30, arg1).method785(10);
        for (int var4 = 0; var4 < class77.field1697; var4++) {
            if (class102.field2345[var4] == arg1) {
                class90.method736(0, class102.method840(new class98[] { var3, class112.field2512 }, 10), true, class145.field3503);
                return;
            }
        }
        int var5 = -65 / ((60 - arg0) / 40);
        for (int var6 = 0; var6 < class49.field1112; var6++) {
            if (class4.field67[var6] == arg1) {
                class90.method736(0, class102.method840(new class98[] { class131.field3067, var3, class87.field1986 }, 10), true, class145.field3503);
                return;
            }
        }
        if (var3.method801((byte) -112, class73.field1536.field1212)) {
            return;
        }
        class102.field2345[class77.field1697++] = arg1;
        class137.field3332 = true;
        class132.field3116.method177(6624, 211);
        class32.field752++;
        class132.field3116.method92(true, arg1);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([BB)[B")
    public static final byte[] method446(byte[] arg0, byte arg1) {
        if (arg1 != 22) {
            field1188 = 81;
        }
        field1187++;
        class8 var2 = new class8(arg0);
        int var3 = var2.method62((byte) 76);
        int var4 = var2.method70(false);
        if (var4 < 0 || class126.field2798 != 0 && var4 > class126.field2798) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method97(122, 0, var5, var4);
            return var5;
        } else {
            int var6 = var2.method70(false);
            if (var6 < 0 || class126.field2798 != 0 && var6 > class126.field2798) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class43.method369(var7, var6, arg0, var4, 9);
            } else {
                class79.field1728.method456(var2, var7, arg1 ^ 0xFFFFC83B);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ltb;Ltb;ILlf;Ltb;)Z")
    public static final boolean method447(class130 arg0, class130 arg1, int arg2, class82 arg3, class130 arg4) {
        class83.field1916 = arg0;
        field1197++;
        class56.field1252 = arg3;
        class94.field2139 = arg1;
        if (arg2 != -31700) {
            field1191 = null;
        }
        class52.field1155 = arg4;
        return true;
    }
}
