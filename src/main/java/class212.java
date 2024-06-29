import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class212 {

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    private int field3583;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "[[I")
    private int[][] field3575;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    private int field3577;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3576 = -1;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "[I")
    public static int[] field3581 = new int[4096];

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Lta;")
    public static class105 field3588;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "[I")
    public static int[] field3585;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)I")
    public final int method1347(int arg0, int arg1) {
        if (this.field3575 != null) {
            arg1 = (int) ((long) this.field3577 * (long) arg1 / (long) this.field3583);
        }
        int var3 = -108 / ((arg0 - 82) / 43);
        field3587++;
        return arg1;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILn;II)[Lgb;")
    public static final class46[] method1348(int arg0, class138 arg1, int arg2, int arg3) {
        field3580++;
        if (class123.method760(arg1, arg0, arg2, -102)) {
            if (arg3 != 7) {
                field3588 = null;
            }
            return class134.method817(-19043);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([BZ)[B")
    public final byte[] method1349(byte[] arg0, boolean arg1) {
        if (arg1) {
            field3576 = 101;
        }
        if (this.field3575 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field3577 / (long) this.field3583) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field3575[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3577 + var6;
                int var14 = var13 / this.field3583;
                var4 += var14;
                var6 = var13 - this.field3583 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        field3582++;
        return arg0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)I")
    public final int method1350(int arg0, byte arg1) {
        if (arg1 >= -78) {
            field3584 = -62;
        }
        field3574++;
        if (this.field3575 != null) {
            arg0 = (int) ((long) this.field3577 * (long) arg0 / (long) this.field3583) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static void method1351(int arg0) {
        field3581 = null;
        field3585 = null;
        field3588 = null;
        int var1 = 50 % ((arg0 + 60) / 43);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZB)V")
    public static final void method1352(boolean arg0, byte arg1) {
        field3579++;
        class238 var2 = (class238) class97.field1701.method1277(116);
        if (arg1 >= -12) {
            method1352(false, (byte) 78);
        }
        while (var2 != null) {
            if (var2.field4129 != null) {
                class94.field1627.method479(var2.field4129);
                var2.field4129 = null;
            }
            if (var2.field4145 != null) {
                class94.field1627.method479(var2.field4145);
                var2.field4145 = null;
            }
            var2.method369(126);
            var2 = (class238) class97.field1701.method1271(250);
        }
        if (!arg0) {
            return;
        }
        for (class238 var3 = (class238) class185.field3140.method1277(127); var3 != null; var3 = (class238) class185.field3140.method1271(250)) {
            if (var3.field4129 != null) {
                class94.field1627.method479(var3.field4129);
                var3.field4129 = null;
            }
            var3.method369(126);
        }
        for (class238 var4 = (class238) class223.field3790.method1299((byte) -91); var4 != null; var4 = (class238) class223.field3790.method1295((byte) 31)) {
            if (var4.field4129 != null) {
                class94.field1627.method479(var4.field4129);
                var4.field4129 = null;
            }
            var4.method369(127);
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(II)V")
    public class212(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class203.method1302(arg1, arg0, (byte) 102);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field3583 = var5;
            this.field3575 = new int[var5][14];
            this.field3577 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3575[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                double var12 = (double) var4 / (double) var5;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3581[var0] = class241.method1606((byte) 114, var0);
        }
    }
}
