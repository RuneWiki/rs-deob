import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class228 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "[[I")
    private int[][] field3551;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    private int field3558;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    private int field3553;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "J")
    public static volatile long field3554 = 0L;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I")
    public final int method1557(int arg0, int arg1) {
        field3555++;
        if (this.field3551 != null) {
            arg1 = (int) ((long) this.field3553 * (long) arg1 / (long) this.field3558);
        }
        return arg0 > -122 ? 67 : arg1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)I")
    public final int method1558(int arg0, byte arg1) {
        if (arg1 > -27) {
            this.method1558(-56, (byte) 108);
        }
        field3557++;
        if (this.field3551 != null) {
            arg0 = (int) ((long) this.field3553 * (long) arg0 / (long) this.field3558) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(II)V")
    public class228(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class27.method192(arg0, (byte) 103, arg1);
            int var4 = arg0 / var3;
            this.field3551 = new int[var4][14];
            int var5 = arg1 / var3;
            this.field3558 = var4;
            this.field3553 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field3551[var6];
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

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[B)[B")
    public final byte[] method1559(int arg0, byte[] arg1) {
        field3552++;
        if (this.field3551 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3553 / (long) this.field3558) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field3551[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3553 + var6;
                int var14 = var13 / this.field3558;
                var5 += var14;
                var6 = var13 - this.field3558 * var14;
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
        if (arg0 < 99) {
            this.method1559(84, (byte[]) null);
        }
        return arg1;
    }
}
