import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class748 {

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
    private int field10422;

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "I")
    private int field10425;

    @OriginalMember(owner = "client!gfa", name = "j", descriptor = "[[I")
    private int[][] field10431;

    @OriginalMember(owner = "client!gfa", name = "h", descriptor = "[I")
    public static int[] field10429 = new int[500];

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "I")
    public static int field10423;

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "I")
    public static int field10426;

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "I")
    public static int field10427;

    @OriginalMember(owner = "client!gfa", name = "g", descriptor = "I")
    public static int field10428;

    @OriginalMember(owner = "client!gfa", name = "i", descriptor = "I")
    public static int field10430;

    @OriginalMember(owner = "client!gfa", name = "k", descriptor = "I")
    public static int field10432;

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "Z")
    public static boolean field10424;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V", line = 4)
    public static void method4154(byte arg0) {
        field10429 = null;
        if (arg0 != 115) {
            method4155(-43, null, -89, (byte) 61, -89);
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ILnv;IBI)Ltea;", line = 19)
    public static final class238 method4155(int arg0, class417 arg1, int arg2, byte arg3, int arg4) {
        field10426++;
        if (arg3 != 29) {
            return null;
        } else if (!arg1.field6061 && (!class560.method3273(arg3 ^ 0xFFFFF26E, arg2) || !class560.method3273(-3469, arg0))) {
            return arg1.field5996 ? new class238(arg1, 34037, arg4, arg2, arg0) : new class238(arg1, arg4, arg2, arg0, class756.method4202(true, arg2), class756.method4202(true, arg0));
        } else {
            return new class238(arg1, 3553, arg4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "([BZ)[B", line = 39)
    public final byte[] method4156(byte[] arg0, boolean arg1) {
        field10427++;
        if (this.field10431 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field10422 / (long) this.field10425) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field10431[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field10422 + var6;
                int var14 = var13 / this.field10425;
                var5 += var14;
                var6 = var13 - this.field10425 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        if (!arg1) {
            field10424 = true;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "([SI)[S", line = 107)
    public final short[] method4157(short[] arg0, int arg1) {
        field10423++;
        if (arg1 != 14) {
            this.field10422 = 109;
        }
        if (this.field10431 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field10422 / (long) this.field10425) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                short var10 = arg0[var7];
                int[] var11 = this.field10431[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field10422 + var6;
                int var14 = var13 / this.field10425;
                var6 = var13 - this.field10425 * var14;
                var5 += var14;
            }
            arg0 = new short[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 8192 >> 14;
                if (var9 < -32768) {
                    arg0[var8] = -32768;
                } else if (var9 <= 32767) {
                    arg0[var8] = (short) var9;
                } else {
                    arg0[var8] = 32767;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZI)I", line = 177)
    public final int method4158(boolean arg0, int arg1) {
        field10432++;
        if (this.field10431 != null) {
            arg1 = ((int) ((long) this.field10422 * (long) arg1 / (long) this.field10425)) + 6;
        }
        if (!arg0) {
            this.method4159(125, (byte) -85);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(II)V", line = 196)
    public class748(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class512.method3024(arg0, 12435, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field10422 = var4;
            this.field10425 = var5;
            this.field10431 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field10431[var6];
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

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IB)I", line = 258)
    public final int method4159(int arg0, byte arg1) {
        int var3 = -94 % ((arg1 + 17) / 32);
        field10428++;
        if (this.field10431 != null) {
            arg0 = (int) ((long) this.field10422 * (long) arg0 / (long) this.field10425);
        }
        return arg0;
    }
}
