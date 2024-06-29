import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class100 {

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Lad;")
    public static class5 field2415 = class88.method674("Ung-Ultige Session)2ID)3", -105);

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Lbb;")
    public static class9 field2417 = new class9(128);

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "Lad;")
    public static class5 field2421 = class88.method674("Diese Welt ist voll)3", -116);

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Lad;")
    private static class5 field2422 = class88.method674("New User", -79);

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "[I")
    public static int[] field2428 = new int[128];

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "Z")
    public static boolean field2430 = false;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public static int field2427 = 0;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Lad;")
    public static class5 field2424 = class88.method674("backhmid2", -81);

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "Lad;")
    public static class5 field2418 = field2422;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "J")
    public static long field2438 = 0L;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public static int field2437 = 0;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "Lad;")
    private static class5 field2439 = class88.method674("Account locked as we suspect it has been stolen)3", -62);

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "Lad;")
    private static class5 field2432 = class88.method674("Offline", -89);

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "Lad;")
    public static class5 field2434 = field2432;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "Lad;")
    public static class5 field2431 = field2439;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
    public static int field2440 = 50;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "[I")
    public static int[] field2433 = new int[field2440];

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "[I")
    public static int[] field2420 = new int[field2440];

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "[I")
    public static int[] field2435 = new int[field2440];

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "[Lad;")
    public static class5[] field2423 = new class5[field2440];

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "[I")
    public static int[] field2419 = new int[field2440];

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "[I")
    public static int[] field2436 = new int[field2440];

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "[I")
    public static int[] field2425 = new int[field2440];

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "[I")
    public static int[] field2426 = new int[field2440];

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Lrd;")
    public static class106 field2413;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V", line = 6)
    public static final synchronized void method798(int arg0, int arg1) {
        field2409++;
        if (class19.field522 != null) {
            class19.field522.method201(arg0);
        }
        class80.method625(arg0, 1000);
        if (arg1 > -102) {
            field2419 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lv;I)V", line = 20)
    public static final synchronized void method799(class126 arg0, int arg1) {
        class19.field522 = arg0;
        if (arg1 != -12945) {
            method805((byte) 40);
        }
        field2410++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILub;IB)V", line = 31)
    public static final void method800(int arg0, class122 arg1, int arg2, byte arg3) {
        field2412++;
        if (arg1 == null) {
            return;
        }
        int var4 = class133.field3220 + class131.field3177 & 0x7FF;
        int var5 = arg2 * arg2 + arg0 * arg0;
        if (var5 > 6400) {
            return;
        }
        int var6 = -44 % ((9 - arg3) / 35);
        int var7 = class45.field1176[var4];
        int var8 = var7 * 256 / (class102.field2476 + 256);
        int var9 = class45.field1166[var4];
        int var10 = var9 * 256 / (class102.field2476 + 256);
        int var11 = arg0 * var8 + arg2 * var10 >> 16;
        int var12 = arg0 * var10 - arg2 * var8 >> 16;
        if (var5 <= 2500) {
            arg1.method964(var11 + 94 + 4 - arg1.field3016 / 2, -(arg1.field3018 / 2) + 83 + -var12 - 4);
        } else {
            arg1.method960(class95.field2258, var11 + 94 + 4 - arg1.field3016 / 2, -var12 - 4 + -(arg1.field3018 / 2) + 83);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V", line = 76)
    public static final void method801(byte arg0) {
        class105.field2638 = new byte[4][104][104];
        class58.field1411 = new int[105][105];
        field2411++;
        class21.field551 = new int[104];
        class60.field1491 = new int[4][105][105];
        class77.field1815 = new byte[4][104][104];
        class34.field861 = new int[104];
        class105.field2546 = new byte[4][104][104];
        int var1 = 88 % ((18 - arg0) / 52);
        class112.field2796 = new byte[4][104][104];
        class40.field1035 = new int[104];
        client.field497 = new byte[4][105][105];
        class116.field2885 = new int[104];
        class56.field1397 = new int[104];
        class52.field1309 = 99;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()V", line = 98)
    public void method433() {
        field2407++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([II)V", line = 106)
    public static final synchronized void method802(int[] arg0, int arg1) {
        int var2 = 0;
        int var3 = arg1 - 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
        }
        var3 += 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
        }
        if (class19.field522 != null) {
            class19.field522.method195(arg0, 0, var3);
        }
        class80.method625(var3, 1000);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(J)V", line = 131)
    public void method803(long arg0) {
        field2408++;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V", line = 146)
    public static final void method804(byte arg0) {
        field2416++;
        if (class8.field275 == null) {
            return;
        }
        if (class39.field972 < 0) {
            if (class9.field299 > 0) {
                class9.field299--;
                if (class9.field299 == 0) {
                    if (class63.field1525 == null) {
                        class8.field275.method291(256, 2);
                    } else {
                        class8.field275.method291(field2429, 2);
                        class39.field972 = field2429;
                        class8.field275.method290(class63.field1525, field2429, (byte) 38, class47.field1228);
                        class63.field1525 = null;
                    }
                    class135.field3254 = 0;
                }
            }
        } else if (class9.field299 > 0) {
            class135.field3254 += field2427;
            class8.field275.method283(class39.field972, (byte) -114, class135.field3254);
            class9.field299--;
            if (class9.field299 == 0) {
                class8.field275.method284(-28200);
                class9.field299 = 20;
                class39.field972 = -1;
            }
        }
        if (arg0 <= 120) {
            method802(null, 52);
        }
        class8.field275.method288(1);
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V", line = 207)
    public static void method805(byte arg0) {
        field2418 = null;
        field2415 = null;
        if (arg0 > -13) {
            return;
        }
        field2417 = null;
        field2422 = null;
        field2431 = null;
        field2433 = null;
        field2413 = null;
        field2435 = null;
        field2426 = null;
        field2423 = null;
        field2421 = null;
        field2419 = null;
        field2432 = null;
        field2424 = null;
        field2436 = null;
        field2439 = null;
        field2434 = null;
        field2420 = null;
        field2425 = null;
        field2428 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BJ)V", line = 236)
    public static final void method806(byte arg0, long arg1) {
        field2414++;
        if (arg1 == 0L) {
            return;
        }
        if (class32.field769 >= 100) {
            class21.method168(class81.field1915, class135.field3269, false, 0);
            return;
        }
        class5 var3 = class110.method891(arg1, arg0 - 30403).method45((byte) -106);
        for (int var4 = 0; var4 < class32.field769; var4++) {
            if (class14.field400[var4] == arg1) {
                class21.method168(class69.method546(true, new class5[] { var3, class54.field1372 }), class135.field3269, false, 0);
                return;
            }
        }
        int var5 = 0;
        if (arg0 != -120) {
            method804((byte) 88);
        }
        while (field2437 > var5) {
            if (class35.field892[var5] == arg1) {
                class21.method168(class69.method546(true, new class5[] { class112.field2820, var3, class6.field233 }), class135.field3269, false, 0);
                return;
            }
            var5++;
        }
        if (var3.method66((byte) -112, class82.field1932.field2801)) {
            return;
        }
        class35.field881++;
        class14.field400[class32.field769++] = arg1;
        class43.field1086 = true;
        class5.field163.method209(80, 10);
        class5.field163.method340(arg1, -176768048);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V", line = 303)
    public class100(int arg0) {
        class102.field2503 = arg0;
        class106.field2682 = class95.method728(128);
    }
}
