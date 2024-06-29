import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class13 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "[[I")
    private int[][] field351;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lhe;")
    public static class54 field348 = class6.method58("Benutzen", false);

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Lhe;")
    public static class54 field346 = class6.method58("<)4col>", false);

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Lhe;")
    private static class54 field353 = class6.method58("Unexpected server response", false);

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lhe;")
    public static class54 field349 = class6.method58(" weitere Optionen", false);

    @OriginalMember(owner = "client!be", name = "q", descriptor = "[[B")
    public static byte[][] field360 = new byte[250][];

    @OriginalMember(owner = "client!be", name = "m", descriptor = "Lhe;")
    public static class54 field356 = field353;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field350 = 0;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Lhe;")
    public static class54 field362 = class6.method58("da dieser Computer gegen unsere ", false);

    @OriginalMember(owner = "client!be", name = "t", descriptor = "[Lfe;")
    public static class41[] field363 = new class41[4];

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Lse;")
    public static class130 field358 = new class130();

    @OriginalMember(owner = "client!be", name = "u", descriptor = "[B")
    public static byte[] field364 = new byte[520];

    @OriginalMember(owner = "client!be", name = "v", descriptor = "Lsf;")
    public static class131 field365 = new class131(64);

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field367 = 0;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Lbe;")
    public static class13 field357;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "[Lqb;")
    public static class113[] field359;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "[Lce;")
    public static class20[] field368;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([BI)[B")
    public final byte[] method94(byte[] arg0, int arg1) {
        if (arg1 != 0) {
            this.method94(null, -66);
        }
        if (this.field351 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field344 / (long) this.field361) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var10 = this.field351[var5];
                byte var11 = arg0[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var10[var12] * var11;
                }
                int var13 = this.field344 + var5;
                int var14 = var13 / this.field361;
                var5 = var13 - this.field361 * var14;
                var6 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        field345++;
        return arg0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I")
    public final int method95(int arg0, int arg1) {
        if (this.field351 != null) {
            arg1 = (int) ((long) this.field344 * (long) arg1 / (long) this.field361);
        }
        if (arg0 != -1006) {
            this.method97(85, 75);
        }
        field347++;
        return arg1;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static void method96(byte arg0) {
        field346 = null;
        field348 = null;
        int var1 = -60 % ((-arg0 - 64) / 47);
        field357 = null;
        field365 = null;
        field363 = null;
        field360 = null;
        field358 = null;
        field362 = null;
        field349 = null;
        field364 = null;
        field353 = null;
        field359 = null;
        field368 = null;
        field356 = null;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)I")
    public final int method97(int arg0, int arg1) {
        field352++;
        if (arg0 != 31942) {
            field349 = null;
        }
        if (this.field351 != null) {
            arg1 = (int) ((long) this.field344 * (long) arg1 / (long) this.field361) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(II)V")
    public class13(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class26.method202(arg1, -113, arg0);
            int var4 = arg1 / var3;
            this.field344 = var4;
            int var5 = arg0 / var3;
            this.field351 = new int[var5][14];
            this.field361 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field351[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
