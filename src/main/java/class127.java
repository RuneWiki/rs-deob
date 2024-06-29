import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class127 extends class17 {

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
    public int field3074;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    private int field3067;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "[[I")
    public int[][] field3062;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "[I")
    public int[] field3066;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "Lmb;")
    public static class84 field3064 = class79.method672(true, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "Lmb;")
    public static class84 field3069 = class79.method672(true, "backleft2");

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "Lmb;")
    public static class84 field3068 = class79.method672(true, "@or1@");

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    public static int field3061 = 0;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "Lmb;")
    public static class84 field3072 = class79.method672(true, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
    public static int field3070 = 0;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "Lmb;")
    public static class84 field3059 = class79.method672(true, "Wordpack geladen)3");

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "Lmb;")
    public static class84 field3065 = class79.method672(true, "Wen m-Ochten Sie hinzuf-Ugen?");

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "Lmc;")
    public static class85 field3073;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBLsd;I)Z")
    public static final boolean method1037(int arg0, byte arg1, class122 arg2, int arg3) {
        if (arg1 > -13) {
            field3070 = 118;
        }
        byte[] var4 = arg2.method986(arg0, arg3, (byte) 67);
        field3071++;
        if (var4 == null) {
            return false;
        } else {
            class102.method852(var4, (byte) 107);
            return true;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)I")
    public static final int method1038(int arg0, int arg1, int arg2) {
        int var3 = class44.method324(arg1 - 1, 0, arg0 - 1) + class44.method324(arg1 - 1, 0, arg0 + 1) + class44.method324(arg1 - -1, arg2 + -128, arg0 + -1) + class44.method324(arg1 - -1, arg2 ^ arg2, arg0 + 1);
        field3063++;
        int var4 = class44.method324(arg1, arg2 ^ 0x80, arg0 - 1) + class44.method324(arg1, 0, arg0 + 1) + class44.method324(arg1 - 1, 0, arg0) + class44.method324(arg1 + 1, 0, arg0);
        int var5 = class44.method324(arg1, arg2 - 128, arg0);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
    public static void method1039(int arg0) {
        field3064 = null;
        field3065 = null;
        if (arg0 != 13533) {
            field3064 = null;
        }
        field3072 = null;
        field3068 = null;
        field3069 = null;
        field3059 = null;
        field3073 = null;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
    public static final void method1040(int arg0) {
        int var1 = class6.field116 * 128 + 64;
        field3060++;
        int var2 = class40.field924 * 128 + 64;
        int var3 = class41.method309((byte) 64, var1, var2, class13.field251) - class46.field996;
        if (var1 > class33.field733) {
            class33.field733 += (var1 - class33.field733) * class77.field1946 / 1000 + class54.field1244;
            if (class33.field733 > var1) {
                class33.field733 = var1;
            }
        }
        if (var2 > class59.field1463) {
            class59.field1463 += (var2 - class59.field1463) * class77.field1946 / 1000 + class54.field1244;
            if (class59.field1463 > var2) {
                class59.field1463 = var2;
            }
        }
        if (class64.field1575 < var3) {
            class64.field1575 += (var3 - class64.field1575) * class77.field1946 / 1000 + class54.field1244;
            if (var3 < class64.field1575) {
                class64.field1575 = var3;
            }
        }
        if (var2 < class59.field1463) {
            class59.field1463 -= (class59.field1463 - var2) * class77.field1946 / 1000 + class54.field1244;
            if (class59.field1463 < var2) {
                class59.field1463 = var2;
            }
        }
        if (class64.field1575 > var3) {
            class64.field1575 -= class54.field1244 + (class64.field1575 - var3) * class77.field1946 / 1000;
            if (var3 > class64.field1575) {
                class64.field1575 = var3;
            }
        }
        if (class33.field733 > var1) {
            class33.field733 -= (class33.field733 - var1) * class77.field1946 / 1000 + class54.field1244;
            if (var1 > class33.field733) {
                class33.field733 = var1;
            }
        }
        int var4 = class126.field3055 * 128 + 64;
        int var5 = class36.field788 * 128 + 64;
        int var6 = class41.method309((byte) 64, var5, var4, class13.field251) - class63.field1570;
        if (arg0 != 1000) {
            field3061 = -45;
        }
        int var7 = var5 - class33.field733;
        int var8 = var4 - class59.field1463;
        int var9 = var6 - class64.field1575;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var8) * -325.949D) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        int var13 = var12 - class71.field1733;
        if (class50.field1072 < var11) {
            class50.field1072 += class84.field2111 + (var11 - class50.field1072) * class109.field2637 / 1000;
            if (var11 < class50.field1072) {
                class50.field1072 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (class50.field1072 > var11) {
            class50.field1072 -= (class50.field1072 - var11) * class109.field2637 / 1000 + class84.field2111;
            if (var11 > class50.field1072) {
                class50.field1072 = var11;
            }
        }
        if (var13 > 0) {
            class71.field1733 += class84.field2111 + class109.field2637 * var13 / 1000;
            class71.field1733 &= 0x7FF;
        }
        if (var13 < 0) {
            class71.field1733 -= -var13 * class109.field2637 / 1000 + class84.field2111;
            class71.field1733 &= 0x7FF;
        }
        int var14 = var12 - class71.field1733;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class71.field1733 = var12;
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(I[B)V")
    public class127(int arg0, byte[] arg1) {
        this.field3074 = arg0;
        class51 var3 = new class51(arg1);
        this.field3067 = var3.method373(25094);
        this.field3062 = new int[this.field3067][];
        this.field3066 = new int[this.field3067];
        for (int var4 = 0; var4 < this.field3067; var4++) {
            this.field3066[var4] = var3.method373(25094);
        }
        for (int var5 = 0; var5 < this.field3067; var5++) {
            this.field3062[var5] = new int[var3.method373(25094)];
        }
        for (int var6 = 0; var6 < this.field3067; var6++) {
            for (int var7 = 0; var7 < this.field3062[var6].length; var7++) {
                this.field3062[var6][var7] = var3.method373(25094);
            }
        }
    }
}
