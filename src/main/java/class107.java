import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class107 {

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    private int field1689;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "[[I")
    private int[][] field1687;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    private int field1683;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "Lna;")
    private static class26 field1686 = class69.method505("Connecting to update server", (byte) -118);

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "Lna;")
    public static class26 field1691 = class69.method505("_labels", (byte) -121);

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Lna;")
    public static class26 field1680 = field1686;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "Lna;")
    public static class26 field1690 = class69.method505("Chargement des fichiers config )2 ", (byte) -117);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "Ldd;")
    public static class248 field1688;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([BB)[B", line = 19)
    public final byte[] method759(byte[] arg0, byte arg1) {
        int var3 = 53 % ((arg1 + 39) / 50);
        field1684++;
        if (this.field1687 != null) {
            int var4 = (int) ((long) arg0.length * (long) this.field1689 / (long) this.field1683) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.length; var8++) {
                int[] var9 = this.field1687[var7];
                byte var10 = arg0[var8];
                for (int var11 = 0; var11 < 14; var11++) {
                    var5[var6 + var11] += var9[var11] * var10;
                }
                int var12 = this.field1689 + var7;
                int var13 = var12 / this.field1683;
                var6 += var13;
                var7 = var12 - this.field1683 * var13;
            }
            arg0 = new byte[var4];
            for (int var14 = 0; var14 < var4; var14++) {
                int var15 = var5[var14] + 32768 >> 16;
                if (var15 < -128) {
                    arg0[var14] = -128;
                } else if (var15 <= 127) {
                    arg0[var14] = (byte) var15;
                } else {
                    arg0[var14] = 127;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)J", line = 86)
    public static final long method760(int arg0, int arg1, int arg2) {
        class55 var3 = class36.field585[arg0][arg1][arg2];
        return var3 == null || var3.field890 == null ? 0L : var3.field890.field4408;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 95)
    public static void method761(byte arg0) {
        field1690 = null;
        field1680 = null;
        field1688 = null;
        if (arg0 == -110) {
            field1691 = null;
            field1686 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIILve;)[Lmm;", line = 110)
    public static final class256[] method762(int arg0, int arg1, int arg2, class266 arg3) {
        field1681++;
        if (class196.method1317(arg3, arg0, arg2, -30901)) {
            if (arg1 != 32767) {
                method762(-111, 55, -18, (class266) null);
            }
            return class306.method2144(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)I", line = 136)
    public final int method763(int arg0, byte arg1) {
        if (this.field1687 != null) {
            arg0 = (int) ((long) this.field1689 * (long) arg0 / (long) this.field1683);
        }
        if (arg1 == 90) {
            field1679++;
            return arg0;
        } else {
            return 81;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)I", line = 152)
    public final int method764(boolean arg0, int arg1) {
        if (arg0) {
            return -69;
        }
        field1685++;
        if (this.field1687 != null) {
            arg1 = (int) ((long) this.field1689 * (long) arg1 / (long) this.field1683) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(II)V", line = 179)
    public class107(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class204.method1382(19067, arg1, arg0);
            int var4 = arg1 / var3;
            this.field1689 = var4;
            int var5 = arg0 / var3;
            this.field1687 = new int[var5][14];
            this.field1683 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1687[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                double var10 = (double) var4 / (double) var5;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var12 < var13) {
                    double var14 = ((double) var12 - var8) * 3.141592653589793D;
                    double var16 = var10;
                    if (-1.0E-4D > var14 || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }
}
