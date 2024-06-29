import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class474 {

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    private int field6666;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    private int field6674;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "[[I")
    private int[][] field6676;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "Lio;")
    public static class370 field6664 = new class370();

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "[F")
    public static float[] field6673 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field6677 = new String[200];

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6675 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "Z")
    public static boolean field6665;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZIIIII)V")
    public static final void method2749(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6670++;
        int var9 = arg5 + 1;
        class266.method1742(26844, class182.field2580[arg5], arg1, arg3, arg2);
        int var8 = arg4 - 1;
        class266.method1742(26844, class182.field2580[arg4], arg1, arg3, arg2);
        if (arg0) {
            for (int var6 = var9; var6 <= var8; var6++) {
                int[] var7 = class182.field2580[var6];
                var7[arg2] = var7[arg1] = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public static void method2750(byte arg0) {
        field6673 = null;
        int var1 = 84 / ((arg0 + 46) / 63);
        field6677 = null;
        field6675 = null;
        field6664 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[B)[B")
    public final byte[] method2751(int arg0, byte[] arg1) {
        int var3 = 41 / ((arg0 - 17) / 32);
        if (this.field6676 != null) {
            int var4 = (int) ((long) arg1.length * (long) this.field6674 / (long) this.field6666) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.length; var8++) {
                byte var11 = arg1[var8];
                int[] var12 = this.field6676[var7];
                for (int var13 = 0; var13 < 14; var13++) {
                    var5[var6 + var13] += var12[var13] * var11;
                }
                int var14 = this.field6674 + var7;
                int var15 = var14 / this.field6666;
                var7 = var14 - this.field6666 * var15;
                var6 += var15;
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
        field6663++;
        return arg1;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZJII)Ljava/lang/String;")
    public static final String method2752(int arg0, boolean arg1, long arg2, int arg3, int arg4) {
        field6669++;
        char var6 = ',';
        char var7 = '.';
        if (arg0 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg0 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg2 < 0L) {
            arg2 = -arg2;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 > 0) {
            for (int var10 = 0; var10 < arg3; var10++) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg2 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        if (arg4 != -32768) {
            return null;
        }
        while (true) {
            int var13 = (int) arg2;
            arg2 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg2 * 10)));
            if (arg2 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)I")
    public final int method2753(int arg0, int arg1) {
        if (arg0 != 15408) {
            return 110;
        }
        if (this.field6676 != null) {
            arg1 = ((int) ((long) this.field6674 * (long) arg1 / (long) this.field6666)) + 6;
        }
        field6671++;
        return arg1;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(II)V")
    public class474(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class569.method3234(arg0, 16126, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field6666 = var4;
            this.field6674 = var5;
            this.field6676 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field6676[var6];
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

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLan;)V")
    public static final void method2754(byte arg0, class21 arg1) {
        if (arg0 <= -80) {
            field6667++;
            class110.field1705 = arg1;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)I")
    public final int method2755(byte arg0, int arg1) {
        field6672++;
        if (this.field6676 != null) {
            arg1 = (int) ((long) this.field6674 * (long) arg1 / (long) this.field6666);
        }
        int var3 = 73 / ((arg0 - 61) / 39);
        return arg1;
    }
}
