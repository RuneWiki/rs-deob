import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "[[I")
    private int[][] field106;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Laf;")
    public static class7 field108 = class48.method406(40, " )2>");

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field105 = 500;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Laf;")
    public static class7 field104 = class48.method406(40, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Laf;")
    public static class7 field110 = class48.method406(40, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Laf;")
    private static class7 field103 = class48.method406(40, "wishes to trade with you)3");

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Laf;")
    public static class7 field111 = field103;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "Laf;")
    public static class7 field116 = class48.method406(40, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "[I")
    public static int[] field113 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Lof;")
    public static class103 field118;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "[Lqc;")
    public static class114[] field107;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method52(int arg0) {
        field118 = null;
        field116 = null;
        field110 = null;
        if (arg0 != -5375) {
            return;
        }
        field108 = null;
        field103 = null;
        field111 = null;
        field104 = null;
        field107 = null;
        field113 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIII)V")
    public static final void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field115++;
        int var7 = 2048 - arg3 & 0x7FF;
        int var8 = 0;
        int var9 = 2048 - arg6 & 0x7FF;
        int var10 = 0;
        int var11 = arg4;
        if (var7 != 0) {
            int var12 = class134.field3164[var7];
            int var13 = class134.field3160[var7];
            int var14 = var10 * var13 - arg4 * var12 >> 16;
            var11 = var10 * var12 + arg4 * var13 >> 16;
            var10 = var14;
        }
        if (arg2 != var9) {
            int var15 = class134.field3164[var9];
            int var16 = class134.field3160[var9];
            int var17 = var8 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var8 * var15 >> 16;
            var8 = var17;
        }
        class127.field3056 = arg3;
        class103.field2506 = arg1 - var10;
        class75.field1753 = arg0 - var8;
        class86.field2014 = arg6;
        class143.field3392 = arg5 - var11;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I")
    public final int method54(int arg0, int arg1) {
        if (arg1 != 7) {
            return -50;
        }
        if (this.field106 != null) {
            arg0 = (int) ((long) this.field120 * (long) arg0 / (long) this.field102) + 6;
        }
        field117++;
        return arg0;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    public static final void method55(int arg0) {
        class120.field2837 = 0;
        field114++;
        class98.field2325 = 0;
        class155.method1211(false);
        class91.method736((byte) -111);
        class2.method14(true);
        for (int var1 = arg0; var1 < class120.field2837; var1++) {
            int var3 = class84.field1982[var1];
            if (class155.field3611 != class121.field2843[var3].field476) {
                class121.field2843[var3].field3323 = null;
                class121.field2843[var3] = null;
            }
        }
        if (class87.field2026 != class91.field2100.field2903) {
            throw new RuntimeException("gnp1 pos:" + class91.field2100.field2903 + " psize:" + class87.field2026);
        }
        for (int var2 = 0; var2 < class106.field2615; var2++) {
            if (class121.field2843[class155.field3600[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class106.field2615);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)I")
    public final int method56(int arg0, byte arg1) {
        if (this.field106 != null) {
            arg0 = (int) ((long) this.field120 * (long) arg0 / (long) this.field102);
        }
        field112++;
        if (arg1 >= -32) {
            method55(-88);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z[B)[B")
    public final byte[] method57(boolean arg0, byte[] arg1) {
        if (!arg0) {
            field103 = null;
        }
        if (this.field106 != null) {
            int var3 = 0;
            int var4 = (int) ((long) arg1.length * (long) this.field120 / (long) this.field102) + 14;
            int var5 = 0;
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field106[var5];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var3 + var12] += var11[var12] * var10;
                }
                int var13 = this.field120 + var5;
                int var14 = var13 / this.field102;
                var3 += var14;
                var5 = var13 - this.field102 * var14;
            }
            arg1 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        field109++;
        return arg1;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(II)V")
    public class6(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class42.method378(arg0, arg1, 0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field106 = new int[var4][14];
            this.field102 = var4;
            this.field120 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field106[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                double var12 = (double) var5 / (double) var4;
                if (var11 > 14) {
                    var11 = 14;
                }
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
