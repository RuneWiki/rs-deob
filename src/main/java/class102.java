import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class102 extends class72 {

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "I")
    public int field2395 = -1;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "Z")
    public boolean field2387 = true;

    @OriginalMember(owner = "client!qd", name = "kb", descriptor = "I")
    public int field2403 = -1;

    @OriginalMember(owner = "client!qd", name = "ub", descriptor = "I")
    public int field2413 = 0;

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "Lae;")
    public static class6 field2391 = class64.method474(104, "Hier klicken)1 um fortzufahren)3)3)3");

    @OriginalMember(owner = "client!qd", name = "fb", descriptor = "Lae;")
    public static class6 field2398 = class64.method474(105, "backtop1");

    @OriginalMember(owner = "client!qd", name = "hb", descriptor = "Lae;")
    public static class6 field2400 = class64.method474(112, "");

    @OriginalMember(owner = "client!qd", name = "gb", descriptor = "Lae;")
    public static class6 field2399 = field2400;

    @OriginalMember(owner = "client!qd", name = "mb", descriptor = "Z")
    public static boolean field2405 = false;

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "Lae;")
    public static class6 field2392 = field2400;

    @OriginalMember(owner = "client!qd", name = "qb", descriptor = "Lae;")
    public static class6 field2409 = class64.method474(108, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "Lae;")
    public static class6 field2389 = field2400;

    @OriginalMember(owner = "client!qd", name = "pb", descriptor = "Lae;")
    public static class6 field2408 = class64.method474(104, " hat sich ausgeloggt)3");

    @OriginalMember(owner = "client!qd", name = "rb", descriptor = "I")
    public static int field2410 = -1;

    @OriginalMember(owner = "client!qd", name = "tb", descriptor = "[I")
    public static int[] field2412 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "Lae;")
    private static class6 field2382 = class64.method474(110, "skill)2");

    @OriginalMember(owner = "client!qd", name = "vb", descriptor = "Lae;")
    public static class6 field2414 = field2400;

    @OriginalMember(owner = "client!qd", name = "sb", descriptor = "Lae;")
    public static class6 field2411 = field2382;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "Lae;")
    public static class6 field2388 = class64.method474(125, "p11_full");

    @OriginalMember(owner = "client!qd", name = "xb", descriptor = "Lae;")
    public static class6 field2416 = field2400;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "Lae;")
    public static class6 field2390 = field2400;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    public int field2381;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    public int field2384;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
    public int field2396;

    @OriginalMember(owner = "client!qd", name = "ib", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!qd", name = "jb", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!qd", name = "lb", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!qd", name = "nb", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!qd", name = "wb", descriptor = "I")
    public int field2415;

    @OriginalMember(owner = "client!qd", name = "yb", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!qd", name = "ob", descriptor = "Lva;")
    public static class128 field2407;

    @OriginalMember(owner = "client!qd", name = "eb", descriptor = "Lbb;")
    public static class9 field2397;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILm;BI)V", line = 30)
    private final void method871(int arg0, class77 arg1, byte arg2, int arg3) {
        if (arg3 == 1) {
            this.field2413 = arg1.method629((byte) -62);
        } else if (arg3 == 2) {
            this.field2395 = arg1.method620((byte) -8);
        } else if (arg3 == 5) {
            this.field2387 = false;
        } else if (arg3 == 7) {
            this.field2403 = arg1.method629((byte) -62);
        }
        if (arg2 == 106) {
            field2404++;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)V", line = 71)
    private final void method872(int arg0, int arg1) {
        field2406++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = var3;
        double var9 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (var9 < var3) {
            var7 = var9;
        }
        if (var7 > var5) {
            var7 = var5;
        }
        double var11 = 0.0D;
        double var13 = var3;
        if (var3 < var9) {
            var13 = var9;
        }
        if (var13 < var5) {
            var13 = var5;
        }
        if (arg0 != 19991) {
            return;
        }
        double var15 = 0.0D;
        double var17 = (var7 + var13) / 2.0D;
        this.field2384 = (int) (var17 * 256.0D);
        if (var7 != var13) {
            if (var3 == var13) {
                var11 = (var9 - var5) / (-var7 + var13);
            } else if (var9 == var13) {
                var11 = (var5 - var3) / (-var7 + var13) + 2.0D;
            } else if (var5 == var13) {
                var11 = (var3 - var9) / (-var7 + var13) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var13 - var7) / (var7 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var13 - var7) / (2.0D - var13 - var7);
            }
        }
        double var19 = var11 / 6.0D;
        this.field2394 = (int) (var19 * 256.0D);
        if (this.field2384 < 0) {
            this.field2384 = 0;
        } else if (this.field2384 > 255) {
            this.field2384 = 255;
        }
        this.field2415 = (int) (var15 * 256.0D);
        if (this.field2415 < 0) {
            this.field2415 = 0;
        } else if (this.field2415 > 255) {
            this.field2415 = 255;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V", line = 193)
    public final void method873(byte arg0) {
        field2393++;
        if (this.field2403 != -1) {
            this.method872(19991, this.field2403);
            this.field2381 = this.field2415;
            this.field2396 = this.field2384;
            this.field2383 = this.field2394;
        }
        if (arg0 < -117) {
            this.method872(19991, this.field2413);
        }
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V", line = 212)
    public static void method874(int arg0) {
        field2399 = null;
        field2411 = null;
        field2400 = null;
        field2392 = null;
        field2412 = null;
        field2388 = null;
        field2398 = null;
        field2391 = null;
        field2409 = null;
        field2389 = null;
        field2414 = null;
        field2408 = null;
        field2382 = null;
        field2407 = null;
        int var1 = -98 % ((-arg0 - 65) / 44);
        field2397 = null;
        field2416 = null;
        field2390 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILm;I)V", line = 250)
    public final void method875(int arg0, class77 arg1, int arg2) {
        field2402++;
        if (arg0 != -1) {
            this.field2396 = -84;
        }
        while (true) {
            int var4 = arg1.method620((byte) -8);
            if (var4 == 0) {
                return;
            }
            this.method871(arg2, arg1, (byte) 106, var4);
        }
    }
}
