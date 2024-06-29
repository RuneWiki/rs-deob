import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class495 {

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    private int field7226;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    private int field7225;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "[[I")
    private int[][] field7228;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "Lnk;")
    public static class326 field7230 = new class326(15, 8);

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "[I")
    public static int[] field7233 = new int[1000];

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "F")
    public static float field7232;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "Lok;")
    public static class172 field7229;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "[[S")
    public static short[][] field7234;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)I", line = 4)
    public final int method2908(int arg0, boolean arg1) {
        if (arg1) {
            this.method2909(-58, (byte) -71);
        }
        field7224++;
        if (this.field7228 != null) {
            arg0 = (int) ((long) this.field7225 * (long) arg0 / (long) this.field7226);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)I", line = 20)
    public final int method2909(int arg0, byte arg1) {
        if (this.field7228 != null) {
            arg0 = (int) ((long) this.field7225 * (long) arg0 / (long) this.field7226) + 6;
        }
        int var3 = -98 / ((arg1 + 57) / 50);
        field7231++;
        return arg0;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILqm;Lla;Lta;Lec;IILjava/lang/String;IIII)V", line = 34)
    public static final void method2910(int arg0, class331 arg1, class296 arg2, class448 arg3, class68 arg4, int arg5, int arg6, String arg7, int arg8, int arg9, int arg10, int arg11) {
        field7227++;
        int var12;
        if (class190.field2963 == 4) {
            var12 = (int) class88.field1483 & 0x3FFF;
        } else {
            var12 = (int) class88.field1483 + class227.field3959 & 0x3FFF;
        }
        int var13 = Math.max(arg4.field1009 / 2, arg4.field1081 / 2) + 10;
        int var14 = arg5 * arg5 + arg8 * arg8;
        if (var13 * var13 < var14) {
            return;
        }
        int var15 = class46.field757[var12];
        if (arg11 <= 111) {
            return;
        }
        int var16 = class46.field755[var12];
        if (class190.field2963 != 4) {
            var16 = var16 * 256 / (class435.field6507 + 256);
            var15 = var15 * 256 / (class435.field6507 + 256);
        }
        int var17 = arg5 * var15 + arg8 * var16 >> 15;
        int var18 = arg5 * var16 - arg8 * var15 >> 15;
        int var19 = arg1.method2077(arg7, 100, null, -127);
        int var20 = var17 - var19 / 2;
        int var21 = arg1.method2084(null, 0, (byte) 120, 100, arg7);
        if (var20 >= -arg4.field1009 && arg4.field1009 >= var20 && -arg4.field1081 <= var18 && arg4.field1081 >= var18) {
            arg2.method1911(0, false, arg7, var19, 0, arg0 + arg4.field1081 / 2 - (var18 + var21) - arg6, null, arg4.field1009 / 2 + var20 + arg9, arg10, arg3, null, 0, 50, arg0, arg9, 1);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V", line = 82)
    public static void method2911(byte arg0) {
        field7234 = null;
        int var1 = 15 % ((arg0 + 21) / 55);
        field7233 = null;
        field7229 = null;
        field7230 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "([BI)[B", line = 98)
    public final byte[] method2912(byte[] arg0, int arg1) {
        field7223++;
        if (arg1 != 4747) {
            field7233 = null;
        }
        if (this.field7228 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field7225 / (long) this.field7226) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field7228[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field7225 + var6;
                int var14 = var13 / this.field7226;
                var6 = var13 - this.field7226 * var14;
                var5 += var14;
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

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(II)V", line = 169)
    public class495(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class324.method2039(-1, arg0, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field7226 = var5;
            this.field7225 = var4;
            this.field7228 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field7228[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
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
