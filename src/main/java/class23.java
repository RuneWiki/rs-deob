import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class23 {

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "[[I")
    private int[][] field287;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "[S")
    public static short[] field291 = new short[500];

    @OriginalMember(owner = "client!na", name = "d", descriptor = "[I")
    public static int[] field284 = new int[500];

    @OriginalMember(owner = "client!na", name = "o", descriptor = "Ljava/lang/String;")
    public static String field295 = "M";

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field293 = 0;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Ljj;")
    public static class134 field285;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lc;")
    public static class276 field283;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static void method153(int arg0) {
        if (arg0 != 0) {
            method154(-55, -93, -114);
        }
        field291 = null;
        field285 = null;
        field284 = null;
        field295 = null;
        field283 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V")
    public static final void method154(int arg0, int arg1, int arg2) {
        if (arg0 > -49) {
            field285 = null;
        }
        class283 var3 = class46.method360(13, -96, arg1);
        field288++;
        var3.method1893(0);
        var3.field4528 = arg2;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZIB)V")
    public static final void method155(int arg0, boolean arg1, int arg2, byte arg3) {
        field290++;
        if (arg3 <= 77) {
            field284 = null;
        }
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class278.field4456 = arg1;
        class77.field1045 = arg2;
        class29.field343 = arg0;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(II)V")
    public class23(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class242.method1592(arg0, (byte) 70, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field292 = var5;
            this.field286 = var4;
            this.field287 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field287[var6];
                double var8 = (double) var4 / (double) var5;
                double var10 = (double) var6 / (double) var5 + 6.0D;
                int var12 = (int) Math.floor(var10 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var10 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var12 < var13) {
                    double var14 = ((double) var12 - var10) * 3.141592653589793D;
                    double var16 = var8;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var8 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var10) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I")
    public final int method156(int arg0, int arg1) {
        field282++;
        if (arg0 != 22056) {
            method157(44);
        }
        if (this.field287 != null) {
            arg1 = (int) ((long) this.field286 * (long) arg1 / (long) this.field292) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static final void method157(int arg0) {
        if (arg0 != -5) {
            return;
        }
        field281++;
        class133.method913();
        for (int var1 = 0; var1 < 4; var1++) {
            class61.field839[var1].method1876(false);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([BB)[B")
    public final byte[] method158(byte[] arg0, byte arg1) {
        field289++;
        if (arg1 <= 99) {
            method155(-107, false, 97, (byte) -45);
        }
        if (this.field287 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field286 / (long) this.field292) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var10 = this.field287[var5];
                byte var11 = arg0[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var10[var12] * var11;
                }
                int var13 = this.field286 + var5;
                int var14 = var13 / this.field292;
                var6 += var14;
                var5 = var13 - this.field292 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)I")
    public final int method159(int arg0, int arg1) {
        if (this.field287 != null) {
            arg0 = (int) ((long) this.field286 * (long) arg0 / (long) this.field292);
        }
        field296++;
        if (arg1 != 14) {
            this.method158((byte[]) null, (byte) -110);
        }
        return arg0;
    }
}
