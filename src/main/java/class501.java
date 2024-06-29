import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class501 {

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "[[I")
    private int[][] field7086;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    private int field7085;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
    private int field7088;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "Liba;")
    public static class211 field7087 = new class211(29, 3);

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "[I")
    public static int[] field7089;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "[[Z")
    public static boolean[][] field7093;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZ)I")
    public final int method2855(int arg0, boolean arg1) {
        if (arg1) {
            field7089 = null;
        }
        if (this.field7086 != null) {
            arg0 = (int) ((long) this.field7088 * (long) arg0 / (long) this.field7085);
        }
        field7083++;
        return arg0;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B[B)[B")
    public final byte[] method2856(byte arg0, byte[] arg1) {
        if (this.field7086 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field7088 / (long) this.field7085) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field7086[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field7088 + var6;
                int var14 = var13 / this.field7085;
                var6 = var13 - this.field7085 * var14;
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
        field7091++;
        return arg0 == -64 ? arg1 : null;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)I")
    public final int method2857(int arg0, int arg1) {
        field7090++;
        if (arg1 != 32767) {
            method2860(-14, 24);
        }
        if (this.field7086 != null) {
            arg0 = (int) ((long) this.field7088 * (long) arg0 / (long) this.field7085) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
    public static void method2858(byte arg0) {
        field7089 = null;
        field7093 = null;
        field7087 = null;
        if (arg0 != -65) {
            field7087 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(BI)Z")
    public static final boolean method2859(byte arg0, int arg1) {
        field7092++;
        if (arg0 < 117) {
            field7093 = null;
        }
        return arg1 == 3 || arg1 == 4;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)V")
    public static final void method2860(int arg0, int arg1) {
        field7084++;
        class489 var2 = class704.method3942(arg1, 16, 0);
        var2.method2799(-111);
        if (arg0 < 34) {
            method2858((byte) -8);
        }
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(II)V")
    public class501(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class138.method977(arg1, -1, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field7086 = new int[var4][14];
            this.field7085 = var4;
            this.field7088 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field7086[var6];
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
}
