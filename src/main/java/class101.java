import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class101 extends class108 {

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "Lgd;")
    public static class40 field2400 = class14.method90(false, " )2> @yel@");

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "Lba;")
    public static class7 field2401 = new class7(64);

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "Lgd;")
    public static class40 field2410 = class14.method90(false, "System)2Update in: ");

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "I")
    public static int field2409 = 0;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "Lgd;")
    public static class40 field2413 = class14.method90(false, "Einloggen");

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "Lgd;")
    public static class40 field2411 = class14.method90(false, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "I")
    public static int field2414 = -1;

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "Lgd;")
    private static class40 field2408 = class14.method90(false, "Enter name of player to delete from list");

    @OriginalMember(owner = "client!qe", name = "lb", descriptor = "Lgd;")
    public static class40 field2418 = class14.method90(false, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!qe", name = "jb", descriptor = "Lgd;")
    public static class40 field2416 = class14.method90(false, "Ihre Nachricht an: ");

    @OriginalMember(owner = "client!qe", name = "kb", descriptor = "Lgd;")
    public static class40 field2417 = class14.method90(false, "blinken3:");

    @OriginalMember(owner = "client!qe", name = "ib", descriptor = "Lgd;")
    public static class40 field2415 = field2408;

    @OriginalMember(owner = "client!qe", name = "mb", descriptor = "Lgd;")
    public static class40 field2419 = class14.method90(false, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public int field2385;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "I")
    public int field2392;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    public int field2395;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public int field2398;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public int field2399;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
    public int field2404;

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "I")
    public int field2405;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "Lrb;")
    public static class103 field2412;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "Lcb;")
    public class14 field2387;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "Lj;")
    public class57 field2388;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "Lj;")
    public class57 field2391;

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "Loc;")
    public static class86 field2406;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "[I")
    public int[] field2384;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 6)
    public static final void method706(byte arg0) {
        field2390++;
        int var1 = 101 % ((16 - arg0) / 47);
        if (class114.field2744 == null) {
            return;
        }
        if (class21.field491 >= 0) {
            if (class11.field291 > 0) {
                class5.field156 += class103.field2474;
                class114.field2744.method75(class21.field491, -25, class5.field156);
                class11.field291--;
                if (class11.field291 == 0) {
                    class114.field2744.method80((byte) 99);
                    class11.field291 = 20;
                    class21.field491 = -1;
                }
            }
        } else if (class11.field291 > 0) {
            class11.field291--;
            if (class11.field291 == 0) {
                if (class50.field1280 == null) {
                    class114.field2744.method76((byte) -86, 256);
                } else {
                    class114.field2744.method76((byte) -86, class112.field2688);
                    class21.field491 = class112.field2688;
                    class114.field2744.method77(class112.field2688, class50.field1280, class30.field693, -28);
                    class50.field1280 = null;
                }
                class5.field156 = 0;
            }
        }
        class114.field2744.method74((byte) 70);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V", line = 65)
    public static final void method707(byte arg0) {
        if (arg0 != -92) {
            field2412 = null;
        }
        client.field459.method40((byte) -101);
        class8.field216.method40((byte) -101);
        field2402++;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V", line = 97)
    public static void method708(int arg0) {
        field2400 = null;
        field2406 = null;
        field2410 = null;
        field2415 = null;
        field2417 = null;
        field2401 = null;
        if (arg0 != -20132) {
            method706((byte) -26);
        }
        field2408 = null;
        field2419 = null;
        field2413 = null;
        field2418 = null;
        field2412 = null;
        field2416 = null;
        field2411 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I", line = 119)
    public static int method709(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V", line = 139)
    public final void method710(byte arg0) {
        field2393++;
        int var2 = this.field2398;
        if (arg0 <= 86) {
            method706((byte) -98);
        }
        class14 var3 = this.field2387.method88(4);
        if (var3 == null) {
            this.field2389 = 0;
            this.field2399 = 0;
            this.field2384 = null;
            this.field2398 = -1;
            this.field2385 = 0;
        } else {
            this.field2384 = var3.field350;
            this.field2399 = var3.field399 * 128;
            this.field2398 = var3.field356;
            this.field2385 = var3.field366;
            this.field2389 = var3.field357;
        }
        if (this.field2398 != var2 && this.field2391 != null) {
            class14.field362.method174(this.field2391);
            this.field2391 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V", line = 194)
    public static final void method711(int arg0) {
        for (int var1 = arg0; var1 < class44.field1114; var1++) {
            int var2 = class104.field2519[var1];
            class96 var3 = class90.field2044[var2];
            int var4 = class100.field2376.method798((byte) -86);
            if ((var4 & 0x2) != 0) {
                var4 += class100.field2376.method798((byte) -50) << 8;
            }
            class108.method831(115, var2, var4, var3);
        }
        field2397++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)V", line = 219)
    public static final void method712(byte arg0, int arg1) {
        field2396++;
        if (arg1 == -1 && class94.field2178 == 0) {
            class94.method637(-3570);
        } else if (arg1 != -1 && class137.field3362 != arg1 && class16.field418 != 0 && class94.field2178 == 0) {
            class94.method636(10, class50.field1282, -1, arg1, 0, false, class16.field418, 0);
        }
        if (arg0 > -68) {
            field2400 = null;
        }
        class137.field3362 = arg1;
    }
}
