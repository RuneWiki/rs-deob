import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class405 {

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    private int field6024;

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "[[I")
    private int[][] field6028;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
    private int field6025;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public static int field6021 = 0;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "Lfh;")
    public static class170 field6031;

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)I")
    public final int method2541(int arg0, byte arg1) {
        if (arg1 <= 82) {
            this.method2544(50, (byte) 107);
        }
        if (this.field6028 != null) {
            arg0 = (int) ((long) this.field6025 * (long) arg0 / (long) this.field6024);
        }
        field6019++;
        return arg0;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I[B)[B")
    public final byte[] method2542(int arg0, byte[] arg1) {
        field6023++;
        if (arg0 != 6440) {
            this.method2542(-3, (byte[]) null);
        }
        if (this.field6028 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field6025 / (long) this.field6024) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field6028[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field6025 + var6;
                int var14 = var13 / this.field6024;
                var5 += var14;
                var6 = var13 - this.field6024 * var14;
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
        return arg1;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lfh;I)V")
    public static final void method2543(class170 arg0, int arg1) {
        if (class426.field6267 == arg0.field2528) {
            class6.field71[arg0.field2490] = true;
        }
        if (arg1 < 123) {
            field6029 = 112;
        }
        field6026++;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(IB)I")
    public final int method2544(int arg0, byte arg1) {
        if (this.field6028 != null) {
            arg0 = ((int) ((long) this.field6025 * (long) arg0 / (long) this.field6024)) + 6;
        }
        field6020++;
        return arg1 >= -3 ? -128 : arg0;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
    public static void method2545(int arg0) {
        int var1 = 113 % ((-arg0 - 82) / 44);
        field6031 = null;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V")
    public static final void method2546(int arg0) {
        if (class136.field1816 != null) {
            class136.field1816.method1617((byte) -37);
            class136.field1816 = null;
            class80.field1056 = null;
        }
        field6022++;
        if (arg0 >= -100) {
            field6031 = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(II)V")
    public class405(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class47.method264((byte) -110, arg0, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field6024 = var5;
            this.field6028 = new int[var5][14];
            this.field6025 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field6028[var6];
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

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIII)I")
    public static final int method2547(int arg0, int arg1, int arg2, int arg3) {
        field6027++;
        if (arg1 == arg3) {
            return arg1;
        }
        int var4 = arg2 - arg0;
        int var5 = (arg1 & 0x7F) * var4 + (arg3 & 0x7F) * arg0 >> 7;
        int var6 = (arg1 & 0x380) * var4 + (arg3 & 0x380) * arg0 >> 7;
        int var7 = (arg1 & 0xFC00) * var4 + (arg3 & 0xFC00) * arg0 >> 7;
        return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
    }

    static {
        new class151("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field6029 = 1407;
        field6031 = null;
        field6032 = 0;
    }
}
