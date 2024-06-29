import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class203 {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field3460 = -1;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Leg;")
    public static class37 field3461 = class174.method1167("<col=ff9040>", 81);

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "[S")
    public static short[] field3466 = new short[256];

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "[I")
    public static int[] field3463 = new int[2048];

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Leg;")
    public static class37 field3470 = class174.method1167("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", -64);

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Leg;")
    public static class37 field3469 = class174.method1167("headicons_pk", -86);

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "Z")
    public static boolean field3474 = false;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "Leg;")
    public static class37 field3477 = class174.method1167(":clan:", 91);

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field3476 = 0;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "Leg;")
    private static class37 field3479 = class174.method1167("flash3:", 63);

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Leg;")
    public static class37 field3464 = field3479;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Leg;")
    public static class37 field3465 = field3479;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public int field3468;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public int field3471;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public int field3475;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lva;B)V")
    public final void method1413(class187 arg0, byte arg1) {
        field3467++;
        while (true) {
            int var3 = arg0.method1268(255);
            if (var3 == 0) {
                int var4 = 126 % ((arg1 - 65) / 53);
                return;
            }
            this.method1414(3, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILva;)V")
    private final void method1414(int arg0, int arg1, class187 arg2) {
        field3478++;
        if (arg0 == 3 && arg1 == 1) {
            this.field3468 = arg2.method1244(false);
            this.field3475 = arg2.method1268(255);
            this.field3471 = arg2.method1268(255);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static void method1415(byte arg0) {
        field3479 = null;
        field3461 = null;
        field3477 = null;
        field3466 = null;
        field3463 = null;
        field3469 = null;
        field3465 = null;
        field3470 = null;
        if (arg0 != 1) {
            method1416((byte) -41, -90);
        }
        field3464 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)Lr;")
    public static final class63 method1416(byte arg0, int arg1) {
        field3462++;
        if (arg0 != -82) {
            method1417(-23, true, -51, 11, -24, -59);
        }
        class63 var2 = (class63) class98.field1523.method1411(arg0 + 36, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class63 var3 = class72.method489(arg1, false, -128, class85.field1331, class45.field708);
        if (var3 != null) {
            class98.field1523.method1404((long) arg1, false, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZIIII)V")
    public static final void method1417(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field3473++;
        class8.field137++;
        if (arg4 != 4) {
            return;
        }
        if (!arg1) {
            class85.method564((byte) 22, true);
            class67.method469(true, false);
            class85.method564((byte) -102, false);
        }
        class67.method469(false, false);
        if (!arg1) {
            class9.method50(false);
        }
        class241.method1668(arg4 ^ 0x44F);
        class193.field3300 = arg2;
        class193.field3294 = arg0;
        if (class273.field4794 == 1) {
            int var6 = class25.field355 + class166.field2760 & 0x7FF;
            int var7 = class10.field166;
            if (var7 < (class69.field1096 / 256)) {
                var7 = class69.field1096 / 256;
            }
            if (class69.field1102[4] && class286.field5051[4] + 128 > var7) {
                var7 = class286.field5051[4] + 128;
            }
            class42.method278(class72.field1134, var7, arg5, var6, var7 * 3 + 600, (byte) -121, class262.method1768(class237.field4140, class82.field1285.field1799, class82.field1285.field1793, (byte) -104) - 50, class265.field4658);
        }
        int var8 = class213.field3683;
        int var9 = class159.field2655;
        int var10 = class137.field2338;
        int var11 = class200.field3403;
        int var12 = class117.field1990;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class69.field1102[var13]) {
                int var19 = (int) ((double) (-class241.field4308[var13]) + Math.random() * (double) (class241.field4308[var13] * 2 + 1) + Math.sin((double) class225.field3873[var13] / 100.0D * (double) class115.field1964[var13]) * (double) class286.field5051[var13]);
                if (var13 == 0) {
                    class213.field3683 += var19;
                }
                if (var13 == 4) {
                    class159.field2655 += var19;
                    if (class159.field2655 < 128) {
                        class159.field2655 = 128;
                    }
                    if (class159.field2655 > 383) {
                        class159.field2655 = 383;
                    }
                }
                if (var13 == 1) {
                    class137.field2338 += var19;
                }
                if (var13 == 3) {
                    class117.field1990 = class117.field1990 + var19 & 0x7FF;
                }
                if (var13 == 2) {
                    class200.field3403 += var19;
                }
            }
        }
        class174.method1166(-23391);
        class122.method869(arg0, arg2, arg0 + arg3, arg2 + arg5);
        class76.method512();
        if (class152.field2556 || class24.field353 < arg0 || class24.field353 >= (arg0 + arg3) || class274.field4805 < arg2 || class274.field4805 >= arg2 + arg5) {
            class126.field2125 = 0;
            class223.field3823 = false;
        } else {
            class223.field3823 = true;
            class126.field2125 = 0;
            int var14 = class86.field1368;
            int var15 = class240.field4271;
            int var16 = class81.field1269;
            class40.field643 = (class24.field353 - arg0) * (var16 - var14) / arg3 + var14;
            int var17 = class202.field3455;
            class61.field1008 = (class274.field4805 - arg2) * (var17 - var15) / arg5 + var15;
        }
        class126.method898((byte) 83);
        byte var18 = class232.method1597(arg4 ^ 0x5A) == 2 ? (byte) class8.field137 : 1;
        class122.method873(arg0, arg2, arg3, arg5, 0);
        class31.method183(class213.field3683, class137.field2338, class200.field3403, class159.field2655, class117.field1990, class62.field1014, class169.field2821, class268.field4694, class137.field2342, class167.field2797, class214.field3711, class237.field4140 + 1, var18, class82.field1285.field1799 >> 7, class82.field1285.field1793 >> 7);
        class126.method898((byte) 83);
        class84.method561();
        class160.method1088(arg2, arg0, 256, arg3, 256, false, arg5);
        class199.method1384(256, 256, arg3, arg5, arg2, arg0, -121);
        ((class107) class76.field1196).method716((byte) -127, class259.field4588);
        class291.method1952(arg2, arg3, arg0, true, arg5);
        class137.field2338 = var10;
        class213.field3683 = var8;
        class117.field1990 = var12;
        class200.field3403 = var11;
        class159.field2655 = var9;
        if (class124.field2080 && class151.field2532.method816(false) == 0) {
            class124.field2080 = false;
        }
        if (class124.field2080) {
            class122.method873(arg0, arg2, arg3, arg5, 0);
            class115.method824((byte) 82, class228.field3926, false);
        }
        if (!arg1 && !class124.field2080 && !class152.field2556 && arg0 <= class24.field353 && class24.field353 < arg0 + arg3 && class274.field4805 >= arg2 && class274.field4805 < (arg2 + arg5)) {
            class244.method1682(arg0, class274.field4805, arg2, arg5, class24.field353, arg3, arg4 - 59);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
    public static final void method1418(int arg0, int arg1) {
        if (arg0 < 31) {
            method1416((byte) -37, 38);
        }
        class89.field1422.method1402((byte) -30, arg1);
        field3459++;
    }
}
