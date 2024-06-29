import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class396 {

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "[[I")
    private int[][] field5056;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    private int field5055;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    private int field5059;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "[I")
    public static int[] field5054 = new int[6];

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public static int field5053 = 1339;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "[I")
    public static int[] field5061 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)I", line = 3)
    public final int method2226(int arg0, byte arg1) {
        if (this.field5056 != null) {
            arg0 = (int) ((long) this.field5059 * (long) arg0 / (long) this.field5055) + 6;
        }
        field5052++;
        if (arg1 != 57) {
            this.field5056 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I[B)[B", line = 20)
    public final byte[] method2227(int arg0, byte[] arg1) {
        field5058++;
        if (this.field5056 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field5059 / (long) this.field5055) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field5056[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field5059 + var6;
                int var14 = var13 / this.field5055;
                var5 += var14;
                var6 = var13 - this.field5055 * var14;
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
        return arg0 == 21096 ? arg1 : null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V", line = 90)
    public static void method2228(byte arg0) {
        field5061 = null;
        if (arg0 > -31) {
            method2231(null, (byte) 125);
        }
        field5054 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z[S)[S", line = 107)
    public final short[] method2229(boolean arg0, short[] arg1) {
        if (this.field5056 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field5059 / (long) this.field5055) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                short var10 = arg1[var7];
                int[] var11 = this.field5056[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field5059 + var6;
                int var14 = var13 / this.field5055;
                var6 = var13 - this.field5055 * var14;
                var5 += var14;
            }
            arg1 = new short[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 8192 >> 14;
                if (var9 < -32768) {
                    arg1[var8] = -32768;
                } else if (var9 > 32767) {
                    arg1[var8] = 32767;
                } else {
                    arg1[var8] = (short) var9;
                }
            }
        }
        if (arg0) {
            field5057++;
            return arg1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(IB)I", line = 176)
    public final int method2230(int arg0, byte arg1) {
        if (this.field5056 != null) {
            arg0 = (int) ((long) this.field5059 * (long) arg0 / (long) this.field5055);
        }
        if (arg1 < 13) {
            return -84;
        } else {
            field5060++;
            return arg0;
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(II)V", line = 193)
    public class396(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class20.method133(arg0, -1, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field5056 = new int[var5][14];
            this.field5055 = var5;
            this.field5059 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field5056[var6];
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

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 258)
    public static final boolean method2231(String arg0, byte arg1) {
        if (arg1 <= 70) {
            return true;
        } else {
            field5051++;
            return class629.method3538(arg0, true, 10, false);
        }
    }
}
