import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class144 {

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    private int field2418 = 0;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "[Lkh;")
    public class154[] field2417;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Loh;")
    public static class258 field2410 = class153.method1046("scape main", 105);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "Loh;")
    public static class258 field2402 = class153.method1046("http:)4)4", 93);

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "[I")
    public static int[] field2421 = new int[32];

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field2407 = 0;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "[I")
    public static int[] field2422;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "[Lck;")
    public static class98[] field2426;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "F")
    public static float field2420;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "J")
    private long field2415;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "Lkh;")
    private class154 field2404;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "Lkh;")
    private class154 field2425;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "Lgb;")
    public static class213 field2423;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "[I")
    public static int[] field2427;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "[[[I")
    public static int[][][] field2424;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V", line = 5)
    public static void method980(byte arg0) {
        field2402 = null;
        field2427 = null;
        field2422 = null;
        if (arg0 != -51) {
            return;
        }
        field2423 = null;
        field2426 = null;
        field2421 = null;
        field2424 = (int[][][]) null;
        field2410 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 22)
    public final void method981(int arg0) {
        field2413++;
        if (arg0 != 32) {
            this.method987(106);
        }
        for (int var2 = 0; var2 < this.field2403; var2++) {
            class154 var3 = this.field2417[var2];
            while (true) {
                class154 var4 = var3.field2636;
                if (var3 == var4) {
                    break;
                }
                var4.method1054((byte) 83);
            }
        }
        this.field2404 = null;
        this.field2425 = null;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)Lkh;", line = 58)
    public final class154 method982(byte arg0) {
        field2406++;
        if (this.field2404 == null) {
            return null;
        }
        if (arg0 <= 96) {
            field2422 = (int[]) null;
        }
        class154 var2 = this.field2417[(int) (this.field2415 & (long) (this.field2403 - 1))];
        while (this.field2404 != var2) {
            if (this.field2404.field2642 == this.field2415) {
                class154 var3 = this.field2404;
                this.field2404 = this.field2404.field2636;
                return var3;
            }
            this.field2404 = this.field2404.field2636;
        }
        this.field2404 = null;
        return null;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)Lkh;", line = 89)
    public final class154 method983(int arg0) {
        if (arg0 != -1) {
            field2402 = (class258) null;
        }
        field2411++;
        if (this.field2418 > 0 && this.field2417[this.field2418 - 1] != this.field2425) {
            class154 var2 = this.field2425;
            this.field2425 = var2.field2636;
            return var2;
        }
        class154 var3;
        do {
            if (this.field2418 >= this.field2403) {
                return null;
            }
            var3 = this.field2417[this.field2418++].field2636;
        } while (this.field2417[this.field2418 - 1] == var3);
        this.field2425 = var3.field2636;
        return var3;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLkh;J)V", line = 127)
    public final void method984(byte arg0, class154 arg1, long arg2) {
        if (arg1.field2635 != null) {
            arg1.method1054((byte) 99);
        }
        class154 var5 = this.field2417[(int) (arg2 & (long) (this.field2403 - 1))];
        arg1.field2636 = var5;
        field2405++;
        arg1.field2635 = var5.field2635;
        arg1.field2635.field2636 = arg1;
        arg1.field2642 = arg2;
        arg1.field2636.field2635 = arg1;
        int var6 = 72 / ((arg0 + 33) / 49);
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)Lkh;", line = 148)
    public final class154 method985(int arg0) {
        field2412++;
        if (arg0 <= 112) {
            field2427 = (int[]) null;
        }
        this.field2418 = 0;
        return this.method983(-1);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(JI)Lkh;", line = 166)
    public final class154 method986(long arg0, int arg1) {
        field2416++;
        this.field2415 = arg0;
        class154 var4 = this.field2417[(int) ((long) (this.field2403 - 1) & arg0)];
        for (this.field2404 = var4.field2636; this.field2404 != var4; this.field2404 = this.field2404.field2636) {
            if (this.field2404.field2642 == arg0) {
                class154 var5 = this.field2404;
                this.field2404 = this.field2404.field2636;
                return var5;
            }
        }
        this.field2404 = null;
        if (arg1 != 0) {
            this.method987(101);
        }
        return null;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)I", line = 199)
    public final int method987(int arg0) {
        field2414++;
        if (arg0 > -91) {
            field2409 = -7;
        }
        return this.field2403;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)I", line = 214)
    public final int method988(byte arg0) {
        field2408++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2403; var3++) {
            class154 var4 = this.field2417[var3];
            class154 var5 = var4.field2636;
            while (var4 != var5) {
                var5 = var5.field2636;
                var2++;
            }
        }
        if (arg0 != 33) {
            this.field2404 = (class154) null;
        }
        return var2;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2421[var1] = var0 - 1;
            var0 += var0;
        }
        field2422 = new int[5];
        field2426 = new class98[0];
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(I)V", line = 258)
    public class144(int arg0) {
        this.field2403 = arg0;
        this.field2417 = new class154[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class154 var3 = this.field2417[var2] = new class154();
            var3.field2635 = var3;
            var3.field2636 = var3;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([Lkh;I)I", line = 290)
    public final int method989(class154[] arg0, int arg1) {
        field2419++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2403; var4++) {
            class154 var5 = this.field2417[var4];
            for (class154 var6 = var5.field2636; var6 != var5; var6 = var6.field2636) {
                arg0[var3++] = var6;
            }
        }
        if (arg1 > -53) {
            this.field2404 = (class154) null;
        }
        return var3;
    }
}
