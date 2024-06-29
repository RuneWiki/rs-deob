import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class18 {

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    private int field393;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    private int field389;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "[[I")
    private int[][] field387;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Lij;")
    private static class50 field391 = class78.method578(122, "wishes to trade with you)3");

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Lij;")
    public static class50 field385 = field391;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field390 = 0;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Lij;")
    public static class50 field396 = null;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "[J")
    public static long[] field394 = new long[100];

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field397 = 0;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)I")
    public final int method135(int arg0, byte arg1) {
        if (arg1 != -62) {
            return -55;
        }
        field395++;
        if (this.field387 != null) {
            arg0 = (int) ((long) this.field389 * (long) arg0 / (long) this.field393) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([BI)[B")
    public final byte[] method136(byte[] arg0, int arg1) {
        if (this.field387 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field389 / (long) this.field393) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field387[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field389 + var6;
                int var14 = var13 / this.field393;
                var6 = var13 - this.field393 * var14;
                var4 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        int var15 = 91 % ((arg1 + 85) / 33);
        field386++;
        return arg0;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(II)V")
    public class18(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class224.method1534(0, arg0, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field393 = var5;
            this.field389 = var4;
            this.field387 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field387[var6];
                double var8 = (double) var4 / (double) var5;
                double var10 = (double) var6 / (double) var5 + 6.0D;
                int var12 = (int) Math.floor(var10 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var10 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var12) {
                    double var14 = ((double) var12 - var10) * 3.141592653589793D;
                    double var16 = var8;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var8 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var10) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILij;IILij;Lij;)V")
    public static final void method137(int arg0, class50 arg1, int arg2, int arg3, class50 arg4, class50 arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class238.field4041[var6] = class238.field4041[var6 - 1];
            class39.field720[var6] = class39.field720[var6 - 1];
            class177.field2958[var6] = class177.field2958[var6 - 1];
            class188.field3105[var6] = class188.field3105[var6 - 1];
            class182.field2994[var6] = class182.field2994[var6 - 1];
        }
        if (arg3 != -1) {
            method137(59, (class50) null, -112, 43, (class50) null, (class50) null);
        }
        class39.field720[0] = arg1;
        class177.field2958[0] = arg4;
        class160.field2744 = class217.field3649;
        field388++;
        class188.field3114++;
        class188.field3105[0] = arg5;
        class238.field4041[0] = arg2;
        class182.field2994[0] = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)I")
    public final int method138(int arg0, boolean arg1) {
        if (this.field387 != null) {
            arg0 = (int) ((long) this.field389 * (long) arg0 / (long) this.field393);
        }
        if (arg1) {
            method139(37);
        }
        field392++;
        return arg0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static void method139(int arg0) {
        field391 = null;
        field385 = null;
        if (arg0 > -116) {
            method137(-29, (class50) null, -1, 95, (class50) null, (class50) null);
        }
        field396 = null;
        field394 = null;
    }
}
