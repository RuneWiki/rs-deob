import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class490 {

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "[[I")
    private int[][] field6991;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
    private int field6988;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    private int field6983;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "Lqca;")
    public static class115 field6982 = new class115(14, 0, 4, 1);

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "Lqaa;")
    public static class27 field6989 = new class27(72, 3);

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "Lqw;")
    public static class76 field6992;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)I")
    public final int method2945(int arg0, int arg1) {
        if (arg0 != -317471986) {
            this.method2949((byte) 5, null);
        }
        field6986++;
        if (this.field6991 != null) {
            arg1 = (int) ((long) this.field6983 * (long) arg1 / (long) this.field6988);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B[S)[S")
    public final short[] method2946(byte arg0, short[] arg1) {
        if (this.field6991 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field6983 / (long) this.field6988) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                short var10 = arg1[var7];
                int[] var11 = this.field6991[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field6983 + var6;
                int var14 = var13 / this.field6988;
                var6 = var13 - this.field6988 * var14;
                var5 += var14;
            }
            arg1 = new short[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 8192 >> 14;
                if (var9 < -32768) {
                    arg1[var8] = -32768;
                } else if (var9 > 32767) {
                    arg1[var8] = 32767;
                } else {
                    arg1[var8] = (short) var9;
                }
            }
        }
        if (arg0 != -51) {
            this.field6983 = -59;
        }
        field6990++;
        return arg1;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(II)I")
    public final int method2947(int arg0, int arg1) {
        field6987++;
        if (arg1 == 1076572976) {
            if (this.field6991 != null) {
                arg0 = (int) ((long) this.field6983 * (long) arg0 / (long) this.field6988) + 6;
            }
            return arg0;
        } else {
            return -83;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Z)V")
    public static void method2948(boolean arg0) {
        field6982 = null;
        field6989 = null;
        field6992 = null;
        if (!arg0) {
            method2948(false);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B[B)[B")
    public final byte[] method2949(byte arg0, byte[] arg1) {
        if (this.field6991 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field6983 / (long) this.field6988) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field6991[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field6983 + var6;
                int var14 = var13 / this.field6988;
                var5 += var14;
                var6 = var13 - this.field6988 * var14;
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
        if (arg0 == 125) {
            field6984++;
            return arg1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqm;")
    public static final class143 method2950(Throwable arg0, String arg1) {
        field6985++;
        class143 var2;
        if ((arg0 instanceof class143)) {
            var2 = (class143) arg0;
            var2.field2192 = var2.field2192 + ' ' + arg1;
        } else {
            var2 = new class143(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(II)V")
    public class490(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class591.method3389((byte) 102, arg0, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field6991 = new int[var4][14];
            this.field6988 = var4;
            this.field6983 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field6991[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var10 < var11) {
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
}
