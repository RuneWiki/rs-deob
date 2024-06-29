import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class28 {

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "[[I")
    private int[][] field440;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "Z")
    public static boolean field439 = false;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field443 = 0;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public static int field448 = 2;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "Lrg;")
    public static class383 field451 = null;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
    public static int field453 = 0;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "[Llf;")
    public static class130[] field444;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "[[[I")
    public static int[][][] field445;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
    public static final void method219(int arg0, int arg1) {
        field454++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class164.method1090(true);
        } else if (arg1 == 2) {
            class233.method1471(-35);
        } else if (arg1 == 3) {
            class25.method183(-111);
        } else {
            throw new RuntimeException();
        }
        if (arg0 != 32768) {
            method219(115, -106);
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(II)I")
    public static int method220(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "([BI)[B")
    public final byte[] method221(byte[] arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        }
        if (this.field440 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field441 / (long) this.field447) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field440[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field441 + var6;
                int var14 = var13 / this.field447;
                var6 = var13 - this.field447 * var14;
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
        field452++;
        return arg0;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZ)I")
    public final int method222(int arg0, boolean arg1) {
        if (!arg1) {
            field439 = true;
        }
        field446++;
        if (this.field440 != null) {
            arg0 = (int) ((long) this.field441 * (long) arg0 / (long) this.field447);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V")
    public static void method223(boolean arg0) {
        if (arg0) {
            field445 = null;
        }
        field444 = null;
        field451 = null;
        field445 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method224(int arg0, String arg1) {
        int var2 = 123 % ((arg0 + 88) / 35);
        field450++;
        return class132.method898(-32, 10, arg1, true);
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(II)V")
    public class28(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class48.method334(arg1, -16, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field447 = var4;
            this.field440 = new int[var4][14];
            this.field441 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field440[var6];
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

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IB)I")
    public final int method225(int arg0, byte arg1) {
        field449++;
        if (arg1 < 36) {
            return -95;
        } else {
            if (this.field440 != null) {
                arg0 = (int) ((long) this.field441 * (long) arg0 / (long) this.field447) + 6;
            }
            return arg0;
        }
    }
}
