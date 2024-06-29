import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class480 {

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    private int field6480;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    private int field6481;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "[[I")
    private int[][] field6485;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "F")
    public static float field6474;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "[I")
    public static int[] field6484;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIB)V", line = 3)
    public static final void method2747(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg3 >= arg1) {
            class679.method3826(class298.field4105[arg2], arg3, 11, arg1, arg0);
        } else {
            class679.method3826(class298.field4105[arg2], arg1, 11, arg3, arg0);
        }
        field6475++;
        if (arg4 < 0) {
            field6474 = 0.63905627F;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZZ)V", line = 25)
    public static final void method2748(int arg0, boolean arg1, boolean arg2) {
        field6473++;
        class539 var3 = class210.method1479(arg1, -104, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field7320.length; var4++) {
            var3.field7320[var4] = -1;
            var3.field7323[var4] = 0;
        }
        if (arg2) {
            field6474 = 0.005853887F;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([SZ)[S", line = 57)
    public final short[] method2749(short[] arg0, boolean arg1) {
        if (arg1) {
            field6474 = 1.0350184F;
        }
        if (this.field6485 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field6480 / (long) this.field6481) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                short var10 = arg0[var7];
                int[] var11 = this.field6485[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field6480 + var6;
                int var14 = var13 / this.field6481;
                var6 = var13 - this.field6481 * var14;
                var5 += var14;
            }
            arg0 = new short[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 8192 >> 14;
                if (var9 < -32768) {
                    arg0[var8] = -32768;
                } else if (var9 > 32767) {
                    arg0[var8] = 32767;
                } else {
                    arg0[var8] = (short) var9;
                }
            }
        }
        field6483++;
        return arg0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V", line = 125)
    public static void method2750(boolean arg0) {
        field6484 = null;
        if (!arg0) {
            method2750(false);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)I", line = 135)
    public final int method2751(int arg0, byte arg1) {
        field6478++;
        if (this.field6485 != null) {
            arg0 = (int) ((long) this.field6480 * (long) arg0 / (long) this.field6481) + 6;
        }
        if (arg1 < 30) {
            this.method2754(-44, null);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)I", line = 150)
    public final int method2752(int arg0, int arg1) {
        field6476++;
        if (this.field6485 != null) {
            arg1 = (int) ((long) this.field6480 * (long) arg1 / (long) this.field6481);
        }
        if (arg0 != 14) {
            field6484 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLv;)Ljava/lang/String;", line = 166)
    public static final String method2753(byte arg0, class606 arg1) {
        field6482++;
        return arg0 >= -9 ? null : arg1.field8462 + " <col=ffffff>>";
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[B)[B", line = 178)
    public final byte[] method2754(int arg0, byte[] arg1) {
        int var3 = -4 % ((-arg0 - 62) / 47);
        if (this.field6485 != null) {
            int var4 = (int) ((long) arg1.length * (long) this.field6480 / (long) this.field6481) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.length; var8++) {
                byte var11 = arg1[var8];
                int[] var12 = this.field6485[var7];
                for (int var13 = 0; var13 < 14; var13++) {
                    var5[var6 + var13] += var12[var13] * var11;
                }
                int var14 = this.field6480 + var7;
                int var15 = var14 / this.field6481;
                var6 += var15;
                var7 = var14 - this.field6481 * var15;
            }
            arg1 = new byte[var4];
            for (int var9 = 0; var9 < var4; var9++) {
                int var10 = var5[var9] + 32768 >> 16;
                if (var10 < -128) {
                    arg1[var9] = -128;
                } else if (var10 > 127) {
                    arg1[var9] = 127;
                } else {
                    arg1[var9] = (byte) var10;
                }
            }
        }
        field6477++;
        return arg1;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(II)V", line = 248)
    public class480(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class421.method2471(arg0, arg1, (byte) 121);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field6480 = var5;
            this.field6481 = var4;
            this.field6485 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field6485[var6];
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
