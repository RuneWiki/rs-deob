import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class440 {

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    private int field5996;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "[[I")
    private int[][] field5994;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    private int field5990;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Luv;")
    public static class3 field5992 = new class3(0, 15);

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field5995 = 0;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)I")
    public final int method2557(int arg0, int arg1) {
        if (arg1 != -7) {
            method2559(-101);
        }
        if (this.field5994 != null) {
            arg0 = ((int) ((long) this.field5996 * (long) arg0 / (long) this.field5990)) + 6;
        }
        field5993++;
        return arg0;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)I")
    public final int method2558(int arg0, int arg1) {
        if (this.field5994 != null) {
            arg0 = (int) ((long) this.field5996 * (long) arg0 / (long) this.field5990);
        }
        field5991++;
        if (arg1 != 7033) {
            this.method2560(null, true);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method2559(int arg0) {
        int var1 = 124 % ((arg0 + 34) / 49);
        field5992 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([BZ)[B")
    public final byte[] method2560(byte[] arg0, boolean arg1) {
        field5989++;
        if (this.field5994 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field5996 / (long) this.field5990) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field5994[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field5996 + var6;
                int var14 = var13 / this.field5990;
                var5 += var14;
                var6 = var13 - this.field5990 * var14;
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
        return arg1 ? arg0 : null;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(II)V")
    public class440(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class83.method469((byte) 41, arg0, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field5996 = var5;
            this.field5994 = new int[var4][14];
            this.field5990 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field5994[var6];
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
