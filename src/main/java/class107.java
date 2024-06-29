import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class107 extends class62 {

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "[I")
    private int[] field2323 = new int[6];

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "I")
    public int field2325 = -1;

    @OriginalMember(owner = "client!sb", name = "nb", descriptor = "[I")
    private int[] field2332 = new int[6];

    @OriginalMember(owner = "client!sb", name = "ob", descriptor = "[I")
    private int[] field2333 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!sb", name = "ub", descriptor = "Z")
    public boolean field2339 = false;

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "[Lhb;")
    public static class44[] field2315 = new class44[4];

    @OriginalMember(owner = "client!sb", name = "mb", descriptor = "Llc;")
    public static class69 field2331 = class69.method470((byte) -97, "Jun");

    @OriginalMember(owner = "client!sb", name = "kb", descriptor = "Llc;")
    public static class69 field2329 = class69.method470((byte) -122, "To ");

    @OriginalMember(owner = "client!sb", name = "jb", descriptor = "Llc;")
    public static class69 field2328 = class69.method470((byte) -107, "Login server offline)3");

    @OriginalMember(owner = "client!sb", name = "tb", descriptor = "I")
    public static int field2338 = 1;

    @OriginalMember(owner = "client!sb", name = "vb", descriptor = "Llc;")
    public static class69 field2340 = class69.method470((byte) -99, "Checking for updates )2 ");

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "[J")
    public static long[] field2314 = new long[32];

    @OriginalMember(owner = "client!sb", name = "hb", descriptor = "Llc;")
    public static class69 field2326 = class69.method470((byte) -117, "button near the top of that page)3");

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!sb", name = "pb", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!sb", name = "qb", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!sb", name = "rb", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!sb", name = "sb", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!sb", name = "lb", descriptor = "Lkc;")
    public static class63 field2330;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "Loa;")
    public static class85 field2317;

    @OriginalMember(owner = "client!sb", name = "ib", descriptor = "[I")
    private int[] field2327;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(Z)V")
    public static void method792(boolean arg0) {
        field2328 = null;
        field2315 = null;
        field2329 = null;
        field2330 = null;
        field2317 = null;
        field2326 = null;
        if (arg0) {
            field2340 = null;
            field2331 = null;
            field2314 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)Lhb;")
    public final class44 method793(byte arg0) {
        field2313++;
        if (arg0 > -34) {
            this.method794(92, 105, null);
        }
        if (this.field2327 == null) {
            return null;
        }
        class44[] var2 = new class44[this.field2327.length];
        for (int var3 = 0; var3 < this.field2327.length; var3++) {
            var2[var3] = class44.method259(class108.field2392, this.field2327[var3], 0);
        }
        class44 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class44(var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field2332[var5] != 0; var5++) {
            var4.method287(this.field2332[var5], this.field2323[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILpd;)V")
    private final void method794(int arg0, int arg1, class94 arg2) {
        field2335++;
        if (arg1 == 1) {
            this.field2325 = arg2.method703((byte) -68);
        } else if (arg1 == 2) {
            int var4 = arg2.method703((byte) -65);
            this.field2327 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2327[var5] = arg2.method665(arg0 - 23585);
            }
        } else if (arg1 == 3) {
            this.field2339 = true;
        } else if (arg1 >= 40 && arg1 < 50) {
            this.field2332[arg1 - 40] = arg2.method665(8666);
        } else if (arg1 >= 50 && arg1 < 60) {
            this.field2323[arg1 - 50] = arg2.method665(arg0 - 23585);
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2333[arg1 - 60] = arg2.method665(8666);
        }
        if (arg0 != 32251) {
            this.field2327 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
    public static int method795(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)Z")
    public final boolean method796(int arg0) {
        field2336++;
        if (this.field2327 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2327.length; var3++) {
            if (!class108.field2392.method402(0, this.field2327[var3], (byte) -96)) {
                var2 = false;
            }
        }
        if (arg0 == -13617) {
            return var2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "(I)Z")
    public final boolean method797(int arg0) {
        field2318++;
        int var2 = -77 % ((45 - arg0) / 51);
        boolean var3 = true;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2333[var4] != -1 && !class108.field2392.method402(0, this.field2333[var4], (byte) -113)) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "(I)Lhb;")
    public final class44 method798(int arg0) {
        class44[] var2 = new class44[5];
        field2316++;
        int var3 = 0;
        int var4 = 0;
        if (arg0 != -2) {
            this.method798(-27);
        }
        while (var4 < 5) {
            if (this.field2333[var4] != -1) {
                var2[var3++] = class44.method259(class108.field2392, this.field2333[var4], 0);
            }
            var4++;
        }
        class44 var5 = new class44(var2, var3);
        for (int var6 = 0; var6 < 6 && this.field2332[var6] != 0; var6++) {
            var5.method287(this.field2332[var6], this.field2323[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILpd;)V")
    public final void method799(int arg0, class94 arg1) {
        if (arg0 != 0) {
            this.method793((byte) 16);
        }
        field2324++;
        while (true) {
            int var3 = arg1.method703((byte) 117);
            if (var3 == 0) {
                return;
            }
            this.method794(32251, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILlc;)V")
    public static final void method800(int arg0, class69 arg1) {
        field2322++;
        if (arg1 == null || arg1.method487((byte) -125) == 0) {
            class115.field2496 = 0;
            return;
        }
        class69 var2 = arg1;
        class69[] var3 = new class69[100];
        int var4 = 0;
        while (true) {
            int var5 = var2.method464(32, 0);
            if (var5 == -1) {
                class69 var7 = var2.method484(false);
                if (var7.method487((byte) -104) > 0) {
                    var3[var4++] = var7.method494(true);
                }
                class115.field2496 = 0;
                if (arg0 != -28608) {
                    return;
                }
                label51: for (int var8 = 0; var8 < class49.field1004; var8++) {
                    class108 var9 = class9.method47(arg0 ^ 0xFFFF9000, var8);
                    if (var9.field2360 == -1 && var9.field2397 != null) {
                        class69 var10 = var9.field2397.method494(true);
                        for (int var11 = 0; var11 < var4; var11++) {
                            if (var10.method473(var3[var11], arg0 ^ 0xFFFF9040) == -1) {
                                continue label51;
                            }
                        }
                        class93.field2037[class115.field2496] = var10;
                        class64.field1355[class115.field2496] = var8;
                        class115.field2496++;
                        if (class93.field2037.length <= class115.field2496) {
                            return;
                        }
                    }
                }
                return;
            }
            class69 var6 = var2.method477(63, var5, 0).method484(false);
            if (var6.method487((byte) -123) > 0) {
                var3[var4++] = var6.method494(true);
            }
            var2 = var2.method486(var5 + 1, (byte) -102);
        }
    }
}
