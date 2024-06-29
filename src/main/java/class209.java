import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class209 {

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    private int field3331 = 0;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    private int field3320;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "[Lql;")
    private class297[] field3316;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "[[S")
    public static short[][] field3317 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "[I")
    public static int[] field3330 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
    public static int[] field3313 = new int[2];

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Ltj;")
    public static class73 field3312 = new class73(64);

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "F")
    public static float field3333;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "J")
    private long field3321;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "Lrj;")
    public static class237 field3327;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "Lql;")
    private class297 field3328;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "Lql;")
    private class297 field3332;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "Z")
    public static boolean field3329;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZJ)Lql;", line = 10)
    public final class297 method1372(boolean arg0, long arg1) {
        if (arg0) {
            return (class297) null;
        }
        field3314++;
        this.field3321 = arg1;
        class297 var4 = this.field3316[(int) (arg1 & (long) (this.field3320 - 1))];
        for (this.field3328 = var4.field5005; this.field3328 != var4; this.field3328 = this.field3328.field5005) {
            if (this.field3328.field5004 == arg1) {
                class297 var5 = this.field3328;
                this.field3328 = this.field3328.field5005;
                return var5;
            }
        }
        this.field3328 = null;
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Lql;", line = 57)
    public final class297 method1373(int arg0) {
        field3322++;
        if (this.field3328 == null) {
            return null;
        }
        class297 var2 = this.field3316[(int) (this.field3321 & (long) (this.field3320 - 1))];
        while (this.field3328 != var2) {
            if (this.field3328.field5004 == this.field3321) {
                class297 var3 = this.field3328;
                this.field3328 = this.field3328.field5005;
                return var3;
            }
            this.field3328 = this.field3328.field5005;
        }
        if (arg0 != -1) {
            this.method1380((byte) 12);
        }
        this.field3328 = null;
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([Lql;I)I", line = 89)
    public final int method1374(class297[] arg0, int arg1) {
        field3324++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3320; var4++) {
            class297 var5 = this.field3316[var4];
            for (class297 var6 = var5.field5005; var6 != var5; var6 = var6.field5005) {
                arg0[var3++] = var6;
            }
        }
        int var7 = 63 % ((-arg1 - 20) / 43);
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)I", line = 124)
    public final int method1375(int arg0) {
        int var2 = 0;
        if (arg0 != 12900) {
            return 65;
        }
        for (int var3 = 0; var3 < this.field3320; var3++) {
            class297 var4 = this.field3316[var3];
            for (class297 var5 = var4.field5005; var5 != var4; var5 = var5.field5005) {
                var2++;
            }
        }
        field3310++;
        return var2;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(JILql;)V", line = 168)
    public final void method1376(long arg0, int arg1, class297 arg2) {
        if (arg2.field4998 != null) {
            arg2.method1997(-27381);
        }
        field3326++;
        class297 var5 = this.field3316[(int) ((long) (this.field3320 + arg1) & arg0)];
        arg2.field5004 = arg0;
        arg2.field4998 = var5.field4998;
        arg2.field5005 = var5;
        arg2.field4998.field5005 = arg2;
        arg2.field5005.field4998 = arg2;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 186)
    public static final void method1377(byte arg0) {
        if (arg0 != -66) {
            method1378(113);
        }
        field3325++;
        class61.field961 = true;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V", line = 197)
    public static void method1378(int arg0) {
        field3313 = null;
        field3317 = (short[][]) null;
        field3330 = null;
        field3312 = null;
        field3327 = null;
        if (arg0 > -125) {
            field3327 = (class237) null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)Lql;", line = 213)
    public final class297 method1379(boolean arg0) {
        this.field3331 = 0;
        if (arg0) {
            field3318++;
            return this.method1380((byte) 66);
        } else {
            return (class297) null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)Lql;", line = 232)
    public final class297 method1380(byte arg0) {
        field3319++;
        if (this.field3331 > 0 && this.field3316[this.field3331 - 1] != this.field3332) {
            class297 var2 = this.field3332;
            this.field3332 = var2.field5005;
            return var2;
        }
        class297 var3;
        do {
            if (this.field3320 <= this.field3331) {
                if (arg0 != 66) {
                    return (class297) null;
                }
                return null;
            }
            var3 = this.field3316[this.field3331++].field5005;
        } while (this.field3316[this.field3331 - 1] == var3);
        this.field3332 = var3.field5005;
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(I)V", line = 268)
    public class209(int arg0) {
        this.field3320 = arg0;
        this.field3316 = new class297[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class297 var3 = this.field3316[var2] = new class297();
            var3.field5005 = var3;
            var3.field4998 = var3;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)I", line = 290)
    public final int method1381(byte arg0) {
        field3311++;
        if (arg0 != 32) {
            field3329 = false;
        }
        return this.field3320;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V", line = 311)
    public final void method1382(byte arg0) {
        int var2 = 92 / ((-arg0 - 40) / 36);
        for (int var3 = 0; var3 < this.field3320; var3++) {
            class297 var4 = this.field3316[var3];
            while (true) {
                class297 var5 = var4.field5005;
                if (var4 == var5) {
                    break;
                }
                var5.method1997(-27381);
            }
        }
        field3315++;
        this.field3332 = null;
        this.field3328 = null;
    }
}
