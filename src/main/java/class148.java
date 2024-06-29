import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class148 {

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
    private int field3457;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    private int field3442;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "[[I")
    private int[][] field3433;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Lv;")
    public static class146 field3430 = class159.method1226((byte) -37, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field3432 = 0;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Lv;")
    public static class146 field3438 = class159.method1226((byte) -37, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Lv;")
    public static class146 field3429 = class159.method1226((byte) -37, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Lv;")
    public static class146 field3439 = class159.method1226((byte) -37, " x ");

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "[[[Lvf;")
    public static class152[][][] field3434 = new class152[4][104][104];

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "[J")
    public static long[] field3449 = new long[32];

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Lv;")
    public static class146 field3431 = class159.method1226((byte) -37, "Benutzen");

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Lv;")
    public static class146 field3444 = class159.method1226((byte) -37, "gleiten:");

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "[I")
    public static int[] field3454 = new int[2000];

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static volatile int field3446 = 0;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "Lv;")
    private static class146 field3455 = class159.method1226((byte) -37, "World");

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Lv;")
    private static class146 field3451 = class159.method1226((byte) -37, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field3447 = 0;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "Lv;")
    public static class146 field3450 = field3455;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "Lv;")
    public static class146 field3460 = field3451;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "Lv;")
    private static class146 field3459 = class159.method1226((byte) -37, "OFF");

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "Lv;")
    public static class146 field3448 = class159.method1226((byte) -37, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Lv;")
    public static class146 field3436 = field3455;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Lv;")
    public static class146 field3441 = field3459;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Lv;")
    public static class146 field3440 = class159.method1226((byte) -37, "<)4col> x");

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Lvf;")
    public static class152 field3437 = new class152();

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "[[I")
    public static int[][] field3435;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)I")
    public final int method1124(byte arg0, int arg1) {
        if (arg0 > -22) {
            field3440 = null;
        }
        if (this.field3433 != null) {
            arg1 = (int) ((long) this.field3457 * (long) arg1 / (long) this.field3442) + 6;
        }
        field3452++;
        return arg1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)I")
    public final int method1125(int arg0, boolean arg1) {
        if (this.field3433 != null) {
            arg0 = (int) ((long) this.field3457 * (long) arg0 / (long) this.field3442);
        }
        field3443++;
        return arg1 ? arg0 : -6;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[B)[B")
    public final byte[] method1126(int arg0, byte[] arg1) {
        field3427++;
        if (this.field3433 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3457 / (long) this.field3442) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field3433[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3457 + var6;
                int var14 = var13 / this.field3442;
                var6 = var13 - this.field3442 * var14;
                var5 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        int var15 = 24 / ((arg0 + 21) / 32);
        return arg1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method1127(int arg0) {
        if (arg0 <= 44) {
            return;
        }
        field3449 = null;
        field3431 = null;
        field3434 = null;
        field3430 = null;
        field3450 = null;
        field3460 = null;
        field3438 = null;
        field3436 = null;
        field3437 = null;
        field3448 = null;
        field3451 = null;
        field3455 = null;
        field3429 = null;
        field3459 = null;
        field3439 = null;
        field3454 = null;
        field3440 = null;
        field3441 = null;
        field3444 = null;
        field3435 = null;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public static final void method1128(int arg0) {
        if (arg0 >= -74) {
            method1127(92);
        }
        field3445++;
        try {
            if (class58.field1300 == 1) {
                int var1 = class35.field760.method558(99);
                if (var1 > 0 && class35.field760.method540(94)) {
                    int var2 = var1 - class67.field1526;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class35.field760.method536(var2, 83);
                } else {
                    class35.field760.method561(-17);
                    class35.field760.method552((byte) 41);
                    class82.field1985 = null;
                    class122.field2822 = null;
                    if (class33.field693 == null) {
                        class58.field1300 = 0;
                    } else {
                        class58.field1300 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class35.field760.method561(-17);
            class58.field1300 = 0;
            class122.field2822 = null;
            class33.field693 = null;
            class82.field1985 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(II)V")
    public class148(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class33.method221(arg1, (byte) -83, arg0);
            int var4 = arg1 / var3;
            this.field3457 = var4;
            int var5 = arg0 / var3;
            this.field3442 = var5;
            this.field3433 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3433[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                double var10 = (double) var4 / (double) var5;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                if (var12 < 0) {
                    var12 = 0;
                }
                while (var12 < var13) {
                    double var14 = var10;
                    double var16 = ((double) var12 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var10 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }
}
