import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class220 {

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    private int field3588;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    private int field3591;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "[[I")
    private int[][] field3592;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "Lkd;")
    public static class204 field3593 = new class204(16);

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3595 = "Opened title screen";

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field3599 = 0;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field3600 = 50;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "[I")
    public static int[] field3596 = new int[field3600];

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static volatile int field3601 = 0;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "[I")
    public static int[] field3598 = new int[field3600];

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "[I")
    public static int[] field3604 = new int[field3600];

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "[I")
    public static int[] field3594 = new int[field3600];

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "[I")
    public static int[] field3597 = new int[field3600];

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "[I")
    public static int[] field3602 = new int[field3600];

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field3606 = 0;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "[I")
    public static int[] field3607 = new int[field3600];

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field3608 = new String[field3600];

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field3609 = new String[8];

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)I")
    public static int method1495(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static void method1496(int arg0) {
        field3595 = null;
        field3609 = null;
        if (arg0 >= -3) {
            method1498(-75, -48, 68);
        }
        field3597 = null;
        field3593 = null;
        field3596 = null;
        field3598 = null;
        field3594 = null;
        field3604 = null;
        field3608 = null;
        field3602 = null;
        field3607 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B[B)[B")
    public final byte[] method1497(byte arg0, byte[] arg1) {
        if (this.field3592 != null) {
            int var3 = 0;
            int var4 = 0;
            int var5 = (int) ((long) arg1.length * (long) this.field3591 / (long) this.field3588) + 14;
            int[] var6 = new int[var5];
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field3592[var4];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var3 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3591 + var4;
                int var14 = var13 / this.field3588;
                var3 += var14;
                var4 = var13 - this.field3588 * var14;
            }
            arg1 = new byte[var5];
            for (int var8 = 0; var8 < var5; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        if (arg0 > -102) {
            return null;
        } else {
            field3590++;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
    public static final void method1498(int arg0, int arg1, int arg2) {
        field3603++;
        if (class284.field4480 != arg1 && arg2 != -1) {
            class254.method1727(0, false, class284.field4480, arg2, class203.field3251, arg1 ^ 0x2A99);
            class98.field1601 = true;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)I")
    public final int method1499(byte arg0, int arg1) {
        if (this.field3592 != null) {
            arg1 = ((int) ((long) this.field3591 * (long) arg1 / (long) this.field3588)) + 6;
        }
        field3589++;
        return arg0 == -8 ? arg1 : -121;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)I")
    public final int method1500(int arg0, byte arg1) {
        field3587++;
        if (arg1 != 58) {
            field3602 = null;
        }
        if (this.field3592 != null) {
            arg0 = (int) ((long) this.field3591 * (long) arg0 / (long) this.field3588);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(II)V")
    public class220(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class123.method888((byte) -37, arg0, arg1);
            int var4 = arg0 / var3;
            this.field3588 = var4;
            int var5 = arg1 / var3;
            this.field3591 = var5;
            this.field3592 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field3592[var6];
                double var10 = (double) var5 / (double) var4;
                int var12 = (int) Math.floor(var7 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var12) {
                    double var14 = ((double) var12 - var7) * 3.141592653589793D;
                    double var16 = var10;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }
}
