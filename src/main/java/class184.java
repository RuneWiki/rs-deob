import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class184 {

    @OriginalMember(owner = "client!tca", name = "o", descriptor = "I")
    private int field2427 = 0;

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "[Lmg;")
    public class159[] field2416;

    @OriginalMember(owner = "client!tca", name = "m", descriptor = "I")
    public int field2425;

    @OriginalMember(owner = "client!tca", name = "i", descriptor = "I")
    public static int field2421 = 0;

    @OriginalMember(owner = "client!tca", name = "j", descriptor = "I")
    public static int field2422 = 0;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!tca", name = "h", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!tca", name = "l", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!tca", name = "n", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!tca", name = "p", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!tca", name = "r", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "J")
    private long field2415;

    @OriginalMember(owner = "client!tca", name = "k", descriptor = "Lmg;")
    private class159 field2423;

    @OriginalMember(owner = "client!tca", name = "q", descriptor = "Lmg;")
    private class159 field2429;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "([Lmg;I)I", line = 5)
    public final int method1242(class159[] arg0, int arg1) {
        field2414++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2425; var4++) {
            class159 var5 = this.field2416[var4];
            for (class159 var6 = var5.field2139; var6 != var5; var6 = var6.field2139) {
                arg0[var3++] = var6;
            }
        }
        if (arg1 != -1) {
            this.method1245((byte) 78);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)Lmg;", line = 40)
    public final class159 method1243(int arg0) {
        field2418++;
        if (this.field2423 == null) {
            return null;
        }
        class159 var2 = this.field2416[(int) ((long) (this.field2425 - 1) & this.field2415)];
        while (this.field2423 != var2) {
            if (this.field2423.field2146 == this.field2415) {
                class159 var3 = this.field2423;
                this.field2423 = this.field2423.field2139;
                return var3;
            }
            this.field2423 = this.field2423.field2139;
        }
        this.field2423 = null;
        if (arg0 < 74) {
            field2421 = 70;
        }
        return null;
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V", line = 71)
    public final void method1244(int arg0) {
        field2430++;
        for (int var2 = 0; var2 < this.field2425; var2++) {
            class159 var3 = this.field2416[var2];
            while (true) {
                class159 var4 = var3.field2139;
                if (var3 == var4) {
                    break;
                }
                var4.method1102((byte) 105);
            }
        }
        if (arg0 != 30407) {
            this.method1250(true);
        }
        this.field2423 = null;
        this.field2429 = null;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)I", line = 110)
    public final int method1245(byte arg0) {
        int var2 = 39 / ((84 - arg0) / 40);
        field2419++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2425; var4++) {
            class159 var5 = this.field2416[var4];
            class159 var6 = var5.field2139;
            while (var5 != var6) {
                var6 = var6.field2139;
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Z)Lmg;", line = 140)
    public final class159 method1246(boolean arg0) {
        field2428++;
        if (this.field2427 > 0 && this.field2416[this.field2427 - 1] != this.field2429) {
            class159 var2 = this.field2429;
            this.field2429 = var2.field2139;
            return var2;
        }
        while (this.field2427 < this.field2425) {
            class159 var3 = this.field2416[this.field2427++].field2139;
            if (this.field2416[this.field2427 - 1] != var3) {
                this.field2429 = var3.field2139;
                return var3;
            }
        }
        if (!arg0) {
            this.method1247(-97, -16L, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IJLmg;)V", line = 178)
    public final void method1247(int arg0, long arg1, class159 arg2) {
        if (arg2.field2144 != null) {
            arg2.method1102((byte) 80);
        }
        field2413++;
        class159 var5 = this.field2416[(int) (arg1 & (long) (this.field2425 - 1))];
        arg2.field2144 = var5.field2144;
        arg2.field2139 = var5;
        arg2.field2144.field2139 = arg2;
        if (arg0 == 4070) {
            arg2.field2146 = arg1;
            arg2.field2139.field2144 = arg2;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IJ)Lmg;", line = 199)
    public final class159 method1248(int arg0, long arg1) {
        field2426++;
        this.field2415 = arg1;
        class159 var4 = this.field2416[(int) ((long) (this.field2425 - 1) & arg1)];
        if (arg0 < 84) {
            this.method1246(false);
        }
        for (this.field2423 = var4.field2139; this.field2423 != var4; this.field2423 = this.field2423.field2139) {
            if (this.field2423.field2146 == arg1) {
                class159 var5 = this.field2423;
                this.field2423 = this.field2423.field2139;
                return var5;
            }
        }
        this.field2423 = null;
        return null;
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(B)Lmg;", line = 230)
    public final class159 method1249(byte arg0) {
        field2417++;
        this.field2427 = 0;
        if (arg0 > -93) {
            this.method1243(-37);
        }
        return this.method1246(true);
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(Z)I", line = 243)
    public final int method1250(boolean arg0) {
        if (arg0) {
            field2424++;
            return this.field2425;
        } else {
            return -63;
        }
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(I)V", line = 254)
    public class184(int arg0) {
        this.field2416 = new class159[arg0];
        this.field2425 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class159 var3 = this.field2416[var2] = new class159();
            var3.field2139 = var3;
            var3.field2144 = var3;
        }
    }
}
