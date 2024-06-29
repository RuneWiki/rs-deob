import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class569 {

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
    private int field7429;

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "I")
    private int field7434;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "[[I")
    private int[][] field7431;

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "J")
    public static long field7432 = 0L;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "Lnj;")
    public static class415 field7427 = new class415(38, 4);

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)I")
    public final int method3040(int arg0, int arg1) {
        field7433++;
        if (arg0 == 6) {
            if (this.field7431 != null) {
                arg1 = (int) ((long) this.field7429 * (long) arg1 / (long) this.field7434) + 6;
            }
            return arg1;
        } else {
            return -33;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
    public static final void method3041(int arg0) {
        field7430++;
        if (arg0 != -3815 || !class290.field3749) {
            return;
        }
        while (true) {
            while (class202.field2638.length > class690.field9430) {
                class138 var1 = class202.field2638[class690.field9430];
                if (var1 != null && var1.field1808 == -1) {
                    if (class28.field433 == null) {
                        class28.field433 = class433.field5585.method3303(var1.field1817, (byte) 28);
                    }
                    int var2 = class28.field433.field2672;
                    if (var2 == -1) {
                        return;
                    }
                    var1.field1808 = var2;
                    class690.field9430++;
                    class28.field433 = null;
                } else {
                    class690.field9430++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V")
    public static void method3042(byte arg0) {
        field7427 = null;
        if (arg0 < 73) {
            field7427 = null;
        }
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(II)I")
    public final int method3043(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method3040(37, 105);
        }
        if (this.field7431 != null) {
            arg0 = (int) ((long) this.field7429 * (long) arg0 / (long) this.field7434);
        }
        field7425++;
        return arg0;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "([BI)V")
    public static final void method3044(byte[] arg0, int arg1) {
        if (arg1 != 28058) {
            field7432 = 27L;
        }
        field7426++;
        class418 var2 = new class418(arg0);
        while (true) {
            int var3 = var2.method2396(-117);
            if (var3 == 0) {
                return;
            }
            if (var3 == 2) {
                class317.field4110 = var2.method2393(-30727);
            }
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "([BB)[B")
    public final byte[] method3045(byte[] arg0, byte arg1) {
        field7428++;
        if (this.field7431 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field7429 / (long) this.field7434) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field7431[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field7429 + var6;
                int var14 = var13 / this.field7434;
                var5 += var14;
                var6 = var13 - this.field7434 * var14;
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
        if (arg1 < 49) {
            method3044(null, 111);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(II)V")
    public class569(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class659.method3624(arg0, (byte) 118, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field7429 = var5;
            this.field7434 = var4;
            this.field7431 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field7431[var6];
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
}
