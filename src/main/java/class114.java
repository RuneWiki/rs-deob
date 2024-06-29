import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class114 {

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    private int field2433;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    private int field2432;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "[[I")
    private int[][] field2430;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Lec;")
    public static class28 field2428 = class28.method210(-46, "Yesterday");

    @OriginalMember(owner = "client!td", name = "k", descriptor = "Lec;")
    public static class28 field2436 = class28.method210(-46, "::errortest");

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Lec;")
    private static class28 field2438 = class28.method210(-46, "Take");

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field2435 = 0;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "Z")
    public static boolean field2439 = false;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Lec;")
    public static class28 field2437 = field2438;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lh;")
    public static class42 field2426 = new class42();

    @OriginalMember(owner = "client!td", name = "p", descriptor = "Lec;")
    public static class28 field2441 = class28.method210(-46, "Unknown");

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Lec;")
    public static class28 field2440 = class28.method210(-46, "Importing music )2 ");

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field2444 = 0;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "[Lea;")
    public static class26[] field2443;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)I")
    public final int method823(int arg0, int arg1) {
        if (arg1 <= 122) {
            return -96;
        }
        field2427++;
        if (this.field2430 != null) {
            arg0 = this.field2433 * arg0 / this.field2432 + 7;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)I")
    public final int method824(int arg0, int arg1) {
        if (this.field2430 != null) {
            arg1 = this.field2433 * arg1 / this.field2432;
        }
        field2434++;
        if (arg0 != -128) {
            this.method825(null, 117);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([BI)[B")
    public final byte[] method825(byte[] arg0, int arg1) {
        field2429++;
        if (this.field2430 != null) {
            int var3 = arg0.length * this.field2433 / this.field2432 + 14;
            int var4 = 0;
            int var5 = 0;
            int[] var6 = new int[var3];
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field2430[var5];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2433 + var5;
                int var14 = var13 / this.field2432;
                var4 += var14;
                var5 = var13 - this.field2432 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        if (arg1 != 0) {
            this.method824(33, -123);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static void method826(byte arg0) {
        field2443 = null;
        field2428 = null;
        field2436 = null;
        field2437 = null;
        field2438 = null;
        if (arg0 != -49) {
            field2438 = null;
        }
        field2426 = null;
        field2440 = null;
        field2441 = null;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(II)V")
    public class114(int arg0, int arg1) {
        int var3 = class118.method850(arg1, arg0, true);
        int var4 = arg0 / var3;
        int var5 = arg1 / var3;
        this.field2433 = var5;
        this.field2432 = var4;
        if (var4 != var5) {
            this.field2430 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2430[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var11 = (double) var5 / (double) var4;
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var11;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
