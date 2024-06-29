import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class52 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    private int field1097;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "[[I")
    private int[][] field1099;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    private int field1105;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)V")
    public static final void method309(int arg0, boolean arg1) {
        field1102++;
        if (arg0 == -1 || !class188.method1210(-18040, arg0)) {
            return;
        }
        class1[] var2 = class60.field1256[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class1 var4 = var2[var3];
            if (var4.field45 != null) {
                class156 var5 = new class156();
                var5.field3103 = var4;
                var5.field3108 = var4.field45;
                class151.method970(2000000, var5, 4);
            }
        }
        if (!arg1) {
            field1101 = -46;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)I")
    public final int method310(int arg0, int arg1) {
        field1098++;
        if (this.field1099 != null) {
            arg1 = (int) ((long) this.field1105 * (long) arg1 / (long) this.field1097) + 6;
        }
        return arg0 == 1 ? arg1 : 22;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)I")
    public final int method311(int arg0, int arg1) {
        if (arg1 != 0) {
            return 46;
        }
        if (this.field1099 != null) {
            arg0 = (int) ((long) this.field1105 * (long) arg0 / (long) this.field1097);
        }
        field1104++;
        return arg0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([BI)[B")
    public final byte[] method312(byte[] arg0, int arg1) {
        field1103++;
        int var3 = -89 % ((arg1 + 48) / 40);
        if (this.field1099 != null) {
            int var4 = (int) ((long) arg0.length * (long) this.field1105 / (long) this.field1097) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.length; var8++) {
                byte var11 = arg0[var8];
                int[] var12 = this.field1099[var7];
                for (int var13 = 0; var13 < 14; var13++) {
                    var5[var6 + var13] += var12[var13] * var11;
                }
                int var14 = this.field1105 + var7;
                int var15 = var14 / this.field1097;
                var6 += var15;
                var7 = var14 - this.field1097 * var15;
            }
            arg0 = new byte[var4];
            for (int var9 = 0; var9 < var4; var9++) {
                int var10 = var5[var9] + 32768 >> 16;
                if (var10 < -128) {
                    arg0[var9] = -128;
                } else if (var10 > 127) {
                    arg0[var9] = 127;
                } else {
                    arg0[var9] = (byte) var10;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(II)V")
    public class52(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class100.method694(1, arg0, arg1);
            int var4 = arg0 / var3;
            this.field1097 = var4;
            int var5 = arg1 / var3;
            this.field1099 = new int[var4][14];
            this.field1105 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field1099[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var7 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                double var12 = (double) var5 / (double) var4;
                while (var10 < var11) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var7) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
