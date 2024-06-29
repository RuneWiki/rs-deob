import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class202 {

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    private int field3467;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "[[I")
    private int[][] field3474;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    private int field3469;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lpj;")
    public static class237 field3465 = class33.method353("W-=hlen Sie eine Option", 25);

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "[I")
    public static int[] field3471 = new int[2000];

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Luc;")
    public static class38 field3475;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "[Lcd;")
    public static class27[] field3470;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Lch;")
    public static final class270 method1368(int arg0, int arg1, int arg2) {
        field3464++;
        if (arg0 != -15) {
            field3470 = null;
        }
        class270 var3 = (class270) class78.field1471.method568((long) arg2 | (long) arg1 << 32, -1);
        if (var3 == null) {
            var3 = new class270(arg1, arg2);
            class78.field1471.method562(var3, var3.field1530, (byte) 56);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B[B)[B")
    public final byte[] method1369(byte arg0, byte[] arg1) {
        if (this.field3474 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3467 / (long) this.field3469) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field3474[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3467 + var6;
                int var14 = var13 / this.field3469;
                var6 = var13 - this.field3469 * var14;
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
        field3473++;
        int var15 = 69 % ((arg0 - 28) / 63);
        return arg1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static void method1370(byte arg0) {
        if (arg0 >= -56) {
            method1370((byte) -81);
        }
        field3475 = null;
        field3465 = null;
        field3470 = null;
        field3471 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I")
    public final int method1371(int arg0, int arg1) {
        field3476++;
        if (arg0 != 6) {
            method1370((byte) 127);
        }
        if (this.field3474 != null) {
            arg1 = (int) ((long) this.field3467 * (long) arg1 / (long) this.field3469) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)I")
    public final int method1372(int arg0, byte arg1) {
        int var3 = -84 % ((-arg1 - 37) / 47);
        if (this.field3474 != null) {
            arg0 = (int) ((long) this.field3467 * (long) arg0 / (long) this.field3469);
        }
        field3463++;
        return arg0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static final void method1373(int arg0) {
        field3468++;
        if (arg0 <= 12) {
            field3471 = null;
        }
        class57.field1172++;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V")
    public class202(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class253.method1711(arg1, arg0, -98);
            int var4 = arg1 / var3;
            this.field3467 = var4;
            int var5 = arg0 / var3;
            this.field3474 = new int[var5][14];
            this.field3469 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3474[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var11 = (double) var4 / (double) var5;
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var10 < var13) {
                    double var14 = var11;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var11 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
