import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class189 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    private int field3441;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "[[I")
    private int[][] field3444;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    private int field3443;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Lsg;")
    public static class30 field3447 = class167.method1221((byte) 33, "Lade)3)3)3");

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field3450 = 2301979;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "[I")
    public static int[] field3449 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "[I")
    public static int[] field3446;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method1372(byte arg0) {
        int var1 = -15 % (-arg0 / 53);
        field3446 = null;
        field3447 = null;
        field3449 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([BB)[B")
    public final byte[] method1373(byte[] arg0, byte arg1) {
        if (this.field3444 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field3441 / (long) this.field3443) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field3444[var5];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3441 + var5;
                int var14 = var13 / this.field3443;
                var5 = var13 - this.field3443 * var14;
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
        if (arg1 != -107) {
            field3446 = null;
        }
        field3448++;
        return arg0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)I")
    public final int method1374(byte arg0, int arg1) {
        field3440++;
        if (arg0 <= 20) {
            field3442 = 112;
        }
        if (this.field3444 != null) {
            arg1 = (int) ((long) this.field3441 * (long) arg1 / (long) this.field3443);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLsg;)V")
    public static final void method1375(byte arg0, class30 arg1) {
        field3445++;
        if (class244.field4366 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg1.method297((byte) -78);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class244.field4366.length && class244.field4366[var2].field4215 != var3) {
            var2++;
        }
        int var5 = -25 % ((arg0 + 3) / 49);
        if (class244.field4366.length > var2 && class244.field4366[var2] != null) {
            class117.field2303++;
            class196.field3553.method1267(124, -9);
            class196.field3553.method72(-1033389592, class244.field4366[var2].field4215);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()V")
    public static final void method1376() {
        for (int var0 = 0; var0 < class221.field3984; var0++) {
            class35 var1 = class276.field4812[var0];
            class104.method838(var1);
            class276.field4812[var0] = null;
        }
        class221.field3984 = 0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)I")
    public final int method1377(int arg0, byte arg1) {
        if (this.field3444 != null) {
            arg0 = (int) ((long) this.field3441 * (long) arg0 / (long) this.field3443) + 6;
        }
        field3451++;
        return arg1 == 26 ? arg0 : 91;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(II)V")
    public class189(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class229.method1629(arg1, -15, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field3441 = var5;
            this.field3444 = new int[var4][14];
            this.field3443 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field3444[var6];
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
                while (var10 < var13) {
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
