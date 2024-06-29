import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class123 {

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    private int field2184;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[[I")
    private int[][] field2178;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    private int field2185;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Ljd;")
    public static class85 field2183 = class221.method1499(" zuerst von Ihrer Ignorieren)2Liste(Q", (byte) -111);

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2177 = 0;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[B)[B")
    public final byte[] method842(int arg0, byte[] arg1) {
        if (arg0 > -46) {
            return null;
        }
        field2179++;
        if (this.field2178 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2185 / (long) this.field2184) + 14;
            int var4 = 0;
            int var5 = 0;
            int[] var6 = new int[var3];
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field2178[var5];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2185 + var5;
                int var14 = var13 / this.field2184;
                var5 = var13 - this.field2184 * var14;
                var4 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)I")
    public static final int method843(int arg0, byte arg1) {
        if (arg0 != 26) {
            return 21;
        }
        field2176++;
        if (arg1 >= 65 && arg1 <= 90) {
            return arg1 - 65;
        } else if (arg1 >= 97 && arg1 <= 122) {
            return arg1 + 26 - 97;
        } else if (arg1 >= 48 && arg1 <= 57) {
            return arg1 + 4;
        } else if (arg1 == 43) {
            return 62;
        } else if (arg1 == 42) {
            return 62;
        } else if (arg1 == 47) {
            return 63;
        } else if (arg1 == 45) {
            return 63;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method844(int arg0) {
        if (arg0 != -48) {
            method844(-62);
        }
        field2183 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)I")
    public final int method845(byte arg0, int arg1) {
        if (this.field2178 != null) {
            arg1 = (int) ((long) this.field2185 * (long) arg1 / (long) this.field2184);
        }
        field2181++;
        return arg0 == 127 ? arg1 : 82;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(IB)I")
    public final int method846(int arg0, byte arg1) {
        field2187++;
        if (arg1 == -128) {
            if (this.field2178 != null) {
                arg0 = (int) ((long) this.field2185 * (long) arg0 / (long) this.field2184) + 6;
            }
            return arg0;
        } else {
            return 111;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(II)V")
    public class123(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class176.method1189((byte) -117, arg1, arg0);
            int var4 = arg0 / var3;
            this.field2184 = var4;
            int var5 = arg1 / var3;
            this.field2178 = new int[var4][14];
            this.field2185 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2178[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                double var12 = (double) var5 / (double) var4;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var11 > var10) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
