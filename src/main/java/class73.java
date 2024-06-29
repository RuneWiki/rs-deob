import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class73 {

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "[[I")
    private int[][] field1252;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "F")
    public static float field1249;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 5)
    public static final void method612(int arg0) {
        if (arg0 <= 70) {
            method614(false, true);
        }
        class39.field574.method2327(1);
        field1251++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIII)V", line = 16)
    public static final void method613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class21.field234 = arg4;
        class113.field1848 = arg3;
        class93.field1569 = arg1;
        if (arg5 != -1236) {
            method614(false, true);
        }
        class247.field4043 = arg2;
        class176.field2832 = arg0;
        field1254++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZZ)V", line = 37)
    public static final void method614(boolean arg0, boolean arg1) {
        class264.field4429 = arg1;
        field1246++;
        if (arg0) {
            field1249 = -0.6746998F;
        }
        class26.field316 = !class215.method1621(25);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)I", line = 52)
    public final int method615(int arg0, boolean arg1) {
        if (arg1) {
            method613(2, -36, -16, -97, -22, -128);
        }
        field1247++;
        if (this.field1252 != null) {
            arg0 = (int) ((long) this.field1245 * (long) arg0 / (long) this.field1253);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[B)[B", line = 67)
    public final byte[] method616(int arg0, byte[] arg1) {
        field1250++;
        if (this.field1252 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field1245 / (long) this.field1253) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var8 = this.field1252[var6];
                byte var9 = arg1[var7];
                for (int var10 = 0; var10 < 14; var10++) {
                    var4[var5 + var10] += var8[var10] * var9;
                }
                int var11 = this.field1245 + var6;
                int var12 = var11 / this.field1253;
                var5 += var12;
                var6 = var11 - this.field1253 * var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var4[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 > 127) {
                    arg1[var13] = 127;
                } else {
                    arg1[var13] = (byte) var14;
                }
            }
        }
        if (arg0 != 32768) {
            field1249 = -1.8490001F;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(II)V", line = 133)
    public class73(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class54.method431(arg0, arg1, (byte) -106);
            int var4 = arg1 / var3;
            this.field1245 = var4;
            int var5 = arg0 / var3;
            this.field1253 = var5;
            this.field1252 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var6 / (double) var5 + 6.0D;
                int[] var9 = this.field1252[var6];
                double var10 = (double) var4 / (double) var5;
                int var12 = (int) Math.floor(var7 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                if (var12 < 0) {
                    var12 = 0;
                }
                while (var12 < var13) {
                    double var14 = ((double) var12 - var7) * 3.141592653589793D;
                    double var16 = var10;
                    if (-1.0E-4D > var14 || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)I", line = 196)
    public final int method617(byte arg0, int arg1) {
        if (this.field1252 != null) {
            arg1 = (int) ((long) this.field1245 * (long) arg1 / (long) this.field1253) + 6;
        }
        field1248++;
        return arg0 <= 31 ? 97 : arg1;
    }
}
