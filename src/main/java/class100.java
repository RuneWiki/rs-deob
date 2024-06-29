import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class100 {

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Z")
    public static boolean field2433 = false;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "Loc;")
    private static class99 field2432 = class48.method402((byte) -104, "Free world");

    @OriginalMember(owner = "client!o", name = "n", descriptor = "Loc;")
    public static class99 field2431 = class48.method402((byte) -104, "M");

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Loc;")
    public static class99 field2425 = field2432;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "Loc;")
    public static class99 field2436 = class48.method402((byte) -104, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Z")
    public static boolean field2427 = false;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "[I")
    public static int[] field2434 = new int[99];

    @OriginalMember(owner = "client!o", name = "v", descriptor = "Loc;")
    public static class99 field2439;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Loc;")
    public static class99 field2440;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "Loc;")
    public static class99 field2442;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public int field2419;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public int field2423;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public int field2424;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public int field2429;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public int field2437;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lme;")
    public class88 field2420;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I")
    public static final int method856(int arg0, int arg1) {
        if (arg0 != 30957) {
            field2431 = null;
        }
        class18 var2 = class82.method707(12854, arg1);
        int var3 = var2.field477;
        int var4 = var2.field468;
        int var5 = var2.field478;
        int var6 = class73.field1852[var4 - var5];
        field2418++;
        return class94.field2283[var3] >> var5 & var6;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLpc;)V")
    public static final void method857(boolean arg0, class105 arg1) {
        class148.field3659 = arg1;
        if (arg0) {
            field2426++;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static final void method858(byte arg0) {
        field2430++;
        if (arg0 > -93) {
            return;
        }
        Object var1 = class83.field2072;
        synchronized (class83.field2072) {
            if (class60.field1605 != 0) {
                class60.field1605 = 1;
                try {
                    class83.field2072.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILdc;)V")
    public static final void method859(int arg0, class24 arg1) {
        field2422++;
        for (int var2 = 0; var2 < class52.field1236.length; var2++) {
            class52.field1236[var2] = 0;
        }
        if (arg0 != -713) {
            field2440 = null;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class52.field1236[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = var14 + (var12 << 7);
                    class52.field1254[var15] = (class52.field1236[var15 + 128] + class52.field1236[var15 + 1] + class52.field1236[var15 - 1] + class52.field1236[var15 + -128]) / 4;
                }
            }
            int[] var13 = class52.field1236;
            class52.field1236 = class52.field1254;
            class52.field1254 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field563; var7++) {
            for (int var8 = 0; var8 < arg1.field569; var8++) {
                if (arg1.field566[var6++] != 0) {
                    int var9 = var8 + arg1.field564 + 16;
                    int var10 = var7 + arg1.field567 + 16;
                    int var11 = (var10 << 7) + var9;
                    class52.field1236[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static final void method860(int arg0) {
        try {
            Graphics var1 = class5.field99.getGraphics();
            if (arg0 != 550) {
                field2433 = true;
            }
            class59.field1591.method109(550, 4, arg0 ^ 0x226, var1);
        } catch (Exception var2) {
            class5.field99.repaint();
        }
        field2428++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
    public static final void method861(boolean arg0) {
        field2421++;
        if (class118.field2915 != 0) {
            return;
        }
        class141.field3486[0] = 1004;
        class144.field3601 = 1;
        class145.field3619[0] = class95.field2304;
        if (class119.field2923 != -1) {
            class27.field671 = -1;
            class55.field1426 = -1;
            class70.method610(0, 0, 503, class119.field2923, 0, class148.field3656, true, 765, class80.field1969);
            class58.field1513 = class55.field1426;
            class101.field2457 = class27.field671;
            return;
        }
        class82.method708((byte) -95);
        class55.field1426 = -1;
        class27.field671 = -1;
        if (class148.field3656 > 4 && class80.field1969 > 4 && class148.field3656 < 516 && class80.field1969 < 338) {
            if (class23.field555 == -1) {
                class34.method285(66);
            } else {
                class70.method610(0, 4, 338, class23.field555, 4, class148.field3656, true, 516, class80.field1969);
            }
        }
        boolean var1 = arg0;
        class101.field2457 = class27.field671;
        class27.field671 = -1;
        class58.field1513 = class55.field1426;
        class55.field1426 = -1;
        if (class148.field3656 > 553 && class80.field1969 > 205 && class148.field3656 < 743 && class80.field1969 < 466) {
            if (class27.field679 != -1) {
                class70.method610(1, 205, 466, class27.field679, 553, class148.field3656, true, 743, class80.field1969);
            } else if (class134.field3301[class57.field1473] != -1) {
                class70.method610(1, 205, 466, class134.field3301[class57.field1473], 553, class148.field3656, true, 743, class80.field1969);
            }
        }
        if (class27.field671 != class18.field469) {
            class18.field469 = class27.field671;
            class52.field1243 = true;
        }
        if (class55.field1426 != class46.field1108) {
            class52.field1243 = true;
            class46.field1108 = class55.field1426;
        }
        class27.field671 = -1;
        class55.field1426 = -1;
        if (class148.field3656 > 17 && class80.field1969 > 357 && class148.field3656 < 496 && class80.field1969 < 453) {
            if (class87.field2162 != -1) {
                class70.method610(2, 357, 453, class87.field2162, 17, class148.field3656, !arg0, 496, class80.field1969);
            } else if (class127.field3110 != -1) {
                class70.method610(3, 357, 453, class127.field3110, 17, class148.field3656, true, 496, class80.field1969);
            } else if (class80.field1969 < 434 && class148.field3656 < 426) {
                class108.method921(class80.field1969 - 357, (byte) -60, class148.field3656 - 17);
            }
        }
        if ((class87.field2162 != -1 || class127.field3110 != -1) && class27.field671 != class102.field2487) {
            class102.field2487 = class27.field671;
            class113.field2832 = true;
        }
        if ((class87.field2162 != -1 || class127.field3110 != -1) && class61.field1644 != class55.field1426) {
            class113.field2832 = true;
            class61.field1644 = class55.field1426;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class144.field3601 - 1; var2++) {
                if (class141.field3486[var2] < 1000 && class141.field3486[var2 + 1] > 1000) {
                    class99 var3 = class145.field3619[var2];
                    class145.field3619[var2] = class145.field3619[var2 + 1];
                    var1 = false;
                    class145.field3619[var2 + 1] = var3;
                    int var4 = class141.field3486[var2];
                    class141.field3486[var2] = class141.field3486[var2 + 1];
                    class141.field3486[var2 + 1] = var4;
                    int var5 = class73.field1854[var2];
                    class73.field1854[var2] = class73.field1854[var2 + 1];
                    class73.field1854[var2 + 1] = var5;
                    int var6 = class37.field942[var2];
                    class37.field942[var2] = class37.field942[var2 + 1];
                    class37.field942[var2 + 1] = var6;
                    int var7 = class67.field1710[var2];
                    class67.field1710[var2] = class67.field1710[var2 + 1];
                    class67.field1710[var2 + 1] = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V")
    public static void method862(boolean arg0) {
        field2425 = null;
        field2442 = null;
        field2434 = null;
        if (!arg0) {
            return;
        }
        field2440 = null;
        field2431 = null;
        field2439 = null;
        field2432 = null;
        field2436 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field2434[var1] = var0 / 4;
        }
        field2439 = class48.method402((byte) -104, "Standort");
        field2438 = 1;
        field2443 = 1;
        field2441 = 127;
        field2440 = class48.method402((byte) -104, "Konfig geladen)3");
        field2442 = class48.method402((byte) -104, "Verbindung mit");
    }
}
