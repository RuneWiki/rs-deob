import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class103 extends class28 {

    @OriginalMember(owner = "client!of", name = "gb", descriptor = "I")
    public int field2392 = -1;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "I")
    public int field2382 = -1;

    @OriginalMember(owner = "client!of", name = "fb", descriptor = "Z")
    public boolean field2391 = true;

    @OriginalMember(owner = "client!of", name = "rb", descriptor = "I")
    public int field2403 = 0;

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "Lja;")
    public static class62 field2384 = class30.method243(43, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!of", name = "jb", descriptor = "[[I")
    public static int[][] field2395 = new int[104][104];

    @OriginalMember(owner = "client!of", name = "ab", descriptor = "Lja;")
    public static class62 field2386 = class30.method243(43, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!of", name = "mb", descriptor = "I")
    public static int field2398 = 0;

    @OriginalMember(owner = "client!of", name = "kb", descriptor = "Lja;")
    public static class62 field2396 = class30.method243(43, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!of", name = "ib", descriptor = "Lja;")
    public static class62 field2394 = class30.method243(43, "leuchten3:");

    @OriginalMember(owner = "client!of", name = "tb", descriptor = "I")
    public static int field2405 = 0;

    @OriginalMember(owner = "client!of", name = "ub", descriptor = "Z")
    public static volatile boolean field2406 = false;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!of", name = "Z", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!of", name = "bb", descriptor = "I")
    public int field2387;

    @OriginalMember(owner = "client!of", name = "cb", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!of", name = "db", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!of", name = "eb", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!of", name = "hb", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!of", name = "lb", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!of", name = "nb", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!of", name = "ob", descriptor = "I")
    public int field2400;

    @OriginalMember(owner = "client!of", name = "pb", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!of", name = "qb", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!of", name = "sb", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(B)V")
    public final void method824(byte arg0) {
        field2390++;
        if (arg0 != -50) {
            return;
        }
        if (this.field2392 != -1) {
            this.method827((byte) -127, this.field2392);
            this.field2387 = this.field2383;
            this.field2393 = this.field2400;
            this.field2401 = this.field2397;
        }
        this.method827((byte) -121, this.field2403);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BIILs;)V")
    private final void method825(byte arg0, int arg1, int arg2, class128 arg3) {
        if (arg2 == 1) {
            this.field2403 = arg3.method1026((byte) 56);
        } else if (arg2 == 2) {
            this.field2382 = arg3.method1025(255);
        } else if (arg2 == 5) {
            this.field2391 = false;
        } else if (arg2 == 7) {
            this.field2392 = arg3.method1026((byte) 41);
        }
        if (arg0 == 19) {
            field2404++;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLs;I)V")
    public final void method826(byte arg0, class128 arg1, int arg2) {
        field2402++;
        while (true) {
            int var4 = arg1.method1025(255);
            if (var4 == 0) {
                if (arg0 == 9) {
                    return;
                } else {
                    this.field2391 = true;
                    return;
                }
            }
            this.method825((byte) 19, arg2, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)V")
    private final void method827(byte arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = var3;
        field2389++;
        double var9 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (var9 < var3) {
            var7 = var9;
        }
        double var11 = var3;
        if (var9 > var3) {
            var11 = var9;
        }
        if (var11 < var5) {
            var11 = var5;
        }
        if (var7 > var5) {
            var7 = var5;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var7 + var11) / 2.0D;
        if (var7 != var11) {
            if (var3 == var11) {
                var13 = (var9 - var5) / (var11 - var7);
            } else if (var9 == var11) {
                var13 = (var5 - var3) / (-var7 + var11) + 2.0D;
            } else if (var5 == var11) {
                var13 = (var3 - var9) / (var11 - var7) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var7) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var7) / (2.0D - var11 - var7);
            }
        }
        double var19 = var13 / 6.0D;
        this.field2400 = (int) (var19 * 256.0D);
        this.field2383 = (int) (var15 * 256.0D);
        if (this.field2383 < 0) {
            this.field2383 = 0;
        } else if (this.field2383 > 255) {
            this.field2383 = 255;
        }
        this.field2397 = (int) (var17 * 256.0D);
        if (this.field2397 < 0) {
            this.field2397 = 0;
        } else if (this.field2397 > 255) {
            this.field2397 = 255;
        }
        if (arg0 >= -118) {
            this.method825((byte) -6, -105, -21, null);
        }
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(I)V")
    public static void method828(int arg0) {
        field2384 = null;
        field2396 = null;
        if (arg0 == -256) {
            field2386 = null;
            field2395 = null;
            field2394 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)I")
    public static final int method829(boolean arg0) {
        field2381++;
        if (!arg0) {
            field2396 = null;
        }
        int var1 = class111.method908(128, class81.field1959, class140.field3248, class155.field3598);
        return var1 - class115.field2649 >= 800 || (class155.field3581[class155.field3598][class81.field1959 >> 7][class140.field3248 >> 7] & 0x4) == 0 ? 3 : class155.field3598;
    }

    @OriginalMember(owner = "client!of", name = "f", descriptor = "(B)V")
    public static final void method830(byte arg0) {
        field2399++;
        if (arg0 != 50) {
            return;
        }
        int var1 = class70.field1789.method681(class140.field3252);
        for (int var2 = 0; var2 < class128.field2889; var2++) {
            int var6 = class70.field1789.method681(class97.method756(-124, var2));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        class119.field2709 = true;
        class148.field3484 = class128.field2889 * 15 + 22;
        class57.field1410 = var1;
        int var3 = class128.field2889 * 15 + 21;
        int var4 = class29.field713 - var1 / 2;
        if (var4 + var1 > 765) {
            var4 = 765 - var1;
        }
        int var5 = class4.field56;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        class79.field1914 = var5;
        class84.field2021 = var4;
    }
}
