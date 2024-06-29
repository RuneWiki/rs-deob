import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class93 {

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    private int field1139;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    private int field1142;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "[[I")
    private int[][] field1146;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Lnf;")
    public static class493 field1141;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "[I")
    public static int[] field1140;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I")
    public final int method559(int arg0, int arg1) {
        if (arg0 != 4864) {
            return 108;
        }
        field1136++;
        if (this.field1146 != null) {
            arg1 = (int) ((long) this.field1142 * (long) arg1 / (long) this.field1139);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
    public static final void method560(boolean arg0) {
        if (class382.field5052 != null) {
            class382.field5052.method1253(1);
        }
        field1143++;
        if (class441.field6089 != null) {
            class441.field6089.method1253(1);
        }
        if (!arg0) {
            method560(false);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)V")
    public static final void method561(int arg0, int arg1) {
        field1137++;
        class636.field9143 = arg0;
        if (arg1 >= -50) {
            method563(true);
        }
        class539.field7888.method3687(1402);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z[B)[B")
    public final byte[] method562(boolean arg0, byte[] arg1) {
        if (!arg0) {
            return null;
        }
        field1145++;
        if (this.field1146 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field1142 / (long) this.field1139) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field1146[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1142 + var6;
                int var14 = var13 / this.field1139;
                var6 = var13 - this.field1139 * var14;
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
        return arg1;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(Z)V")
    public static void method563(boolean arg0) {
        field1140 = null;
        if (!arg0) {
            field1141 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)Lrs;")
    public static final class557 method564(int arg0, int arg1, int arg2) {
        if (arg1 != -14073) {
            return null;
        }
        field1144++;
        class557 var3 = (class557) class343.field4422.method2645((long) arg0 << 32 | (long) arg2, (byte) -89);
        if (var3 == null) {
            var3 = new class557(arg0, arg2);
            class343.field4422.method2640(1, var3.field7967, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(II)I")
    public final int method565(int arg0, int arg1) {
        field1138++;
        if (this.field1146 != null) {
            arg1 = (int) ((long) this.field1142 * (long) arg1 / (long) this.field1139) + 6;
        }
        if (arg0 != 6) {
            this.field1146 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)Z")
    public static final boolean method566(int arg0, int arg1, int arg2) {
        field1135++;
        if (arg2 == -7) {
            return class418.method2377(arg1, arg0, arg2 - 19744) || class13.method101(arg0, (byte) 127, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(II)V")
    public class93(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class549.method3218(arg0, arg1, (byte) 27);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field1139 = var5;
            this.field1142 = var4;
            this.field1146 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1146[var6];
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
}
