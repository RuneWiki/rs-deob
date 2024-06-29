import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class104 {

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    private int field2473;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    private int field2466;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "[[I")
    private int[][] field2471;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field2464 = 0;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Ltd;")
    public static class136 field2465 = class145.method1172("", 45);

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Ltd;")
    public static class136 field2469 = class145.method1172("Mitglieder)2Welt", 45);

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Ltd;")
    public static class136 field2475 = class145.method1172("null", 45);

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Lh;")
    public static class49 field2476 = null;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)I")
    public final int method835(byte arg0, int arg1) {
        field2468++;
        if (this.field2471 != null) {
            arg1 = (int) ((long) this.field2473 * (long) arg1 / (long) this.field2466) + 6;
        }
        if (arg0 != -103) {
            method838(null, null, null, -14);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method836(byte arg0) {
        field2465 = null;
        int var1 = 24 / ((-arg0 - 16) / 44);
        field2469 = null;
        field2475 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I[B)[B")
    public final byte[] method837(int arg0, byte[] arg1) {
        if (arg0 != 0) {
            return null;
        }
        if (this.field2471 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2473 / (long) this.field2466) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var10 = this.field2471[var6];
                byte var11 = arg1[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var4 + var12] += var10[var12] * var11;
                }
                int var13 = this.field2473 + var6;
                int var14 = var13 / this.field2466;
                var4 += var14;
                var6 = var13 - this.field2466 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        field2472++;
        return arg1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ltd;Lmd;Ltd;I)Lbb;")
    public static final class10 method838(class136 arg0, class87 arg1, class136 arg2, int arg3) {
        field2474++;
        if (arg3 > -56) {
            field2475 = null;
        }
        int var4 = arg1.method645(arg0, true);
        int var5 = arg1.method656(var4, arg2, -86);
        return class44.method356(var4, var5, 255, arg1);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(II)V")
    public class104(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class55.method438((byte) -100, arg1, arg0);
            int var4 = arg1 / var3;
            this.field2473 = var4;
            int var5 = arg0 / var3;
            this.field2466 = var5;
            this.field2471 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var6 / (double) var5 + 6.0D;
                int[] var9 = this.field2471[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var7 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var7) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)I")
    public final int method839(int arg0, byte arg1) {
        field2470++;
        if (arg1 != -61) {
            this.method839(18, (byte) -39);
        }
        if (this.field2471 != null) {
            arg0 = (int) ((long) this.field2473 * (long) arg0 / (long) this.field2466);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(III)I")
    public static final int method840(int arg0, int arg1, int arg2) {
        long var3 = (long) ((arg1 << 16) + arg0);
        field2467++;
        if (arg2 != 65536) {
            field2464 = -24;
        }
        return class1.field1 != null && class1.field1.field2090 == var3 ? class79.field1815.field2995 * 99 / (class79.field1815.field2960.length - class1.field1.field1773) + 1 : 0;
    }
}
