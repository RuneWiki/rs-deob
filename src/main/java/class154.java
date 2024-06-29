import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class154 {

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    private int field2259;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "[[I")
    private int[][] field2253;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    private int field2254;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field2251 = 64;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "S")
    public static short field2258 = 205;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Lve;")
    public static class233 field2255;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([BB)[B")
    public final byte[] method1040(byte[] arg0, byte arg1) {
        if (this.field2253 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field2254 / (long) this.field2259) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field2253[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2254 + var6;
                int var14 = var13 / this.field2259;
                var5 += var14;
                var6 = var13 - this.field2259 * var14;
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
        field2260++;
        if (arg1 >= -9) {
            this.method1043(51, -58);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)I")
    public final int method1041(int arg0, int arg1) {
        field2249++;
        if (arg0 == -12966) {
            if (this.field2253 != null) {
                arg1 = (int) ((long) this.field2254 * (long) arg1 / (long) this.field2259);
            }
            return arg1;
        } else {
            return 106;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static final void method1042(int arg0) {
        if (arg0 == 64) {
            class242.field3640.method260(arg0 - 64);
            field2250++;
            class181.field2595.method260(0);
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)I")
    public final int method1043(int arg0, int arg1) {
        field2257++;
        if (arg1 == 6) {
            if (this.field2253 != null) {
                arg0 = (int) ((long) this.field2254 * (long) arg0 / (long) this.field2259) + 6;
            }
            return arg0;
        } else {
            return -123;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
    public static final String method1044(String[] arg0, int arg1, int arg2, int arg3) {
        field2256++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg0[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            if (arg1 != -1358) {
                method1044((String[]) null, 102, 76, -102);
            }
            int var5 = arg2 + arg3;
            int var6 = 0;
            for (int var7 = arg2; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg2; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public static void method1045(byte arg0) {
        if (arg0 > -38) {
            method1044((String[]) null, -70, 49, 27);
        }
        field2255 = null;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(II)V")
    public class154(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class268.method1794(-28024, arg0, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field2259 = var5;
            this.field2253 = new int[var5][14];
            this.field2254 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field2253[var6];
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
                while (var13 > var10) {
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
