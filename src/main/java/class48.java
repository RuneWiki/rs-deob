import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class48 {

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    private int field779;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "[[I")
    private int[][] field781;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    private int field771;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Ljava/lang/String;")
    public static String field770 = null;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field778 = "red:";

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field773 = 0;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field780 = 0;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Lch;")
    public static class290 field772;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "[I")
    public static int[] field767;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)I")
    public final int method318(int arg0, byte arg1) {
        if (arg1 > -93) {
            return 43;
        }
        field766++;
        if (this.field781 != null) {
            arg0 = (int) ((long) this.field779 * (long) arg0 / (long) this.field771) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method319(int arg0) {
        if (arg0 != 127) {
            method320(-38, 102, -77, -62, -91);
        }
        field778 = null;
        field772 = null;
        field770 = null;
        field767 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII)V")
    public static final void method320(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field775++;
        if (arg4 != -10993) {
            method320(-94, 118, 95, -39, 4);
        }
        class75 var5 = (class75) class166.field2549.method1666((long) arg1, (byte) -116);
        if (var5 == null) {
            var5 = new class75();
            class166.field2549.method1663((long) arg1, var5, arg4 + 10919);
        }
        if (arg0 >= var5.field1214.length) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field1214.length; var8++) {
                var6[var8] = var5.field1214[var8];
                var7[var8] = var5.field1218[var8];
            }
            for (int var9 = var5.field1214.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1214 = var6;
            var5.field1218 = var7;
        }
        var5.field1214[arg0] = arg3;
        var5.field1218[arg0] = arg2;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method321(int arg0, String arg1, String arg2, int arg3) {
        field769++;
        class1.method1(0, arg1, (String) null, arg2, arg0, -1);
        int var4 = -102 / ((arg3 + 52) / 50);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B[B)[B")
    public final byte[] method322(byte arg0, byte[] arg1) {
        if (this.field781 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field779 / (long) this.field771) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var10 = this.field781[var5];
                byte var11 = arg1[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var10[var12] * var11;
                }
                int var13 = this.field779 + var5;
                int var14 = var13 / this.field771;
                var6 += var14;
                var5 = var13 - this.field771 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        field768++;
        return arg0 <= 19 ? null : arg1;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public static final void method323(int arg0) {
        field774++;
        if (arg0 <= -119 && class44.field704 != null) {
            class166 var1 = class44.field704;
            synchronized (class44.field704) {
                class44.field704 = null;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)I")
    public static final int method324(int arg0, int arg1) {
        field776++;
        if (arg1 < 0) {
            return 0;
        }
        class75 var2 = (class75) class166.field2549.method1666((long) arg1, (byte) -123);
        if (var2 == null) {
            return class150.method909(true, arg1).field1907;
        }
        int var3 = 0;
        if (arg0 >= -122) {
            method320(-86, 92, -114, 88, -52);
        }
        for (int var4 = 0; var4 < var2.field1214.length; var4++) {
            if (var2.field1214[var4] == -1) {
                var3++;
            }
        }
        return var3 + class150.method909(true, arg1).field1907 - var2.field1214.length;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZI)I")
    public final int method325(boolean arg0, int arg1) {
        field777++;
        if (this.field781 != null) {
            arg1 = (int) ((long) this.field779 * (long) arg1 / (long) this.field771);
        }
        if (!arg0) {
            field772 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(II)V")
    public class48(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class98.method633((byte) 45, arg0, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field779 = var4;
            this.field781 = new int[var5][14];
            this.field771 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var6 / (double) var5 + 6.0D;
                int[] var9 = this.field781[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var7 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var10 < var11) {
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
}
