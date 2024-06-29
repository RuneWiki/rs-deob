import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class336 {

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    private int field5211;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "[[I")
    private int[][] field5205;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    private int field5210;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "[I")
    public static int[] field5208 = new int[1000];

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field5214 = 0;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Lkn;")
    public static class210 field5213 = new class210(5000);

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "[I")
    public static int[] field5218 = new int[50];

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "[Lug;")
    public static class321[] field5217;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)I", line = 5)
    public final int method2311(byte arg0, int arg1) {
        field5204++;
        if (this.field5205 != null) {
            arg1 = ((int) ((long) this.field5210 * (long) arg1 / (long) this.field5211)) + 6;
        }
        if (arg0 != 116) {
            this.method2314(-11, -28);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z[B)[B", line = 21)
    public final byte[] method2312(boolean arg0, byte[] arg1) {
        field5212++;
        if (this.field5205 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field5210 / (long) this.field5211) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var8 = arg1[var7];
                int[] var9 = this.field5205[var6];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var5 + var10] += var9[var10] * var8;
                }
                int var11 = this.field5210 + var6;
                int var12 = var11 / this.field5211;
                var5 += var12;
                var6 = var11 - this.field5211 * var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 <= 127) {
                    arg1[var13] = (byte) var14;
                } else {
                    arg1[var13] = 127;
                }
            }
        }
        if (arg0) {
            field5217 = (class321[]) null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 91)
    public static final String method2313(byte arg0, long arg1) {
        field5207++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            if (arg0 != -110) {
                field5213 = (class210) null;
            }
            while (var3 != 0L) {
                var3 /= 37L;
                var5++;
            }
            StringBuffer var6 = new StringBuffer(var5);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class149.field2261[(int) (var7 - arg1 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)I", line = 130)
    public final int method2314(int arg0, int arg1) {
        field5216++;
        if (this.field5205 != null) {
            arg0 = (int) ((long) this.field5210 * (long) arg0 / (long) this.field5211);
        }
        if (arg1 != 7) {
            field5217 = (class321[]) null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)Ltd;", line = 145)
    public static final class255 method2315(boolean arg0) {
        if (arg0) {
            field5206++;
            class233.field3720 = 0;
            return class266.method1890((byte) 82);
        } else {
            return (class255) null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 162)
    public static void method2316(int arg0) {
        field5213 = null;
        if (arg0 == 658) {
            field5208 = null;
            field5218 = null;
            field5217 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(II)V", line = 174)
    public class336(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class214.method1566(-20219, arg0, arg1);
            int var4 = arg0 / var3;
            this.field5211 = var4;
            int var5 = arg1 / var3;
            this.field5205 = new int[var4][14];
            this.field5210 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field5205[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                double var11 = (double) var5 / (double) var4;
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                while (var10 < var13) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var11;
                    if (-1.0E-4D > var14 || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)Lmk;", line = 240)
    public static final class305 method2317(int arg0, int arg1) {
        if (arg1 >= -94) {
            method2316(94);
        }
        class305 var2 = (class305) class77.field1161.method768((long) arg0, false);
        field5215++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class89.field1361.method250(true, 26, arg0);
        class305 var4 = new class305();
        if (var3 != null) {
            var4.method2135(false, new class192(var3));
        }
        class77.field1161.method770(var4, 0, (long) arg0);
        return var4;
    }
}
