import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class68 {

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "[[I")
    private int[][] field1063;

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "I")
    private int field1062;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "Z")
    public static boolean field1061 = false;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "[I")
    public static int[] field1066 = new int[5];

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "Lla;")
    public static class422 field1065;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z[B)[B", line = 4)
    public final byte[] method647(boolean arg0, byte[] arg1) {
        field1068++;
        if (this.field1063 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field1062 / (long) this.field1060) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field1063[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1062 + var6;
                int var14 = var13 / this.field1060;
                var6 = var13 - this.field1060 * var14;
                var5 += var14;
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
        return arg0 ? null : arg1;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)I", line = 73)
    public final int method648(int arg0, int arg1) {
        field1067++;
        if (arg0 != 20965) {
            method650((byte) -32);
        }
        if (this.field1063 != null) {
            arg1 = (int) ((long) this.field1062 * (long) arg1 / (long) this.field1060) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IZ)I", line = 90)
    public final int method649(int arg0, boolean arg1) {
        field1064++;
        if (this.field1063 != null) {
            arg0 = (int) ((long) this.field1062 * (long) arg0 / (long) this.field1060);
        }
        if (arg1) {
            this.field1060 = 82;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(II)V", line = 109)
    public class68(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class548.method3203(arg0, arg1, 1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field1063 = new int[var4][14];
            this.field1062 = var5;
            this.field1060 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field1063[var6];
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

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V", line = 168)
    public static void method650(byte arg0) {
        field1065 = null;
        int var1 = -104 / ((arg0 - 41) / 56);
        field1066 = null;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z[S)[S", line = 178)
    public final short[] method651(boolean arg0, short[] arg1) {
        if (!arg0) {
            this.method647(false, null);
        }
        field1059++;
        if (this.field1063 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field1062 / (long) this.field1060) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                short var10 = arg1[var7];
                int[] var11 = this.field1063[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field1062 + var6;
                int var14 = var13 / this.field1060;
                var6 = var13 - this.field1060 * var14;
                var5 += var14;
            }
            arg1 = new short[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 8192 >> 14;
                if (var9 < -32768) {
                    arg1[var8] = -32768;
                } else if (var9 <= 32767) {
                    arg1[var8] = (short) var9;
                } else {
                    arg1[var8] = 32767;
                }
            }
        }
        return arg1;
    }
}
