import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class87 {

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    private int field1721;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "[[I")
    private int[][] field1728;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    private int field1719;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Lsd;")
    public static class166 field1720 = class135.method935("m-Ochte sich mit Ihnen duellieren)3", 0);

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "[I")
    public static int[] field1722 = new int[32];

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Lsd;")
    public static class166 field1727 = class135.method935(" weitere Optionen", 0);

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Ld;")
    public static class29 field1724;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)I")
    public final int method691(byte arg0, int arg1) {
        field1723++;
        if (arg0 == -21) {
            if (this.field1728 != null) {
                arg1 = (int) ((long) this.field1721 * (long) arg1 / (long) this.field1719) + 6;
            }
            return arg1;
        } else {
            return 117;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)I")
    public final int method692(int arg0, int arg1) {
        field1730++;
        if (arg0 > -61) {
            field1727 = null;
        }
        if (this.field1728 != null) {
            arg1 = (int) ((long) this.field1721 * (long) arg1 / (long) this.field1719);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method693(int arg0) {
        field1727 = null;
        field1722 = null;
        if (arg0 <= 110) {
            method693(-35);
        }
        field1724 = null;
        field1720 = null;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(II)V")
    public class87(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class204.method1343(arg1, arg0, 0);
            int var4 = arg1 / var3;
            this.field1721 = var4;
            int var5 = arg0 / var3;
            this.field1728 = new int[var5][14];
            this.field1719 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1728[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                double var12 = (double) var4 / (double) var5;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var10 < var11) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([BB)[B")
    public final byte[] method694(byte[] arg0, byte arg1) {
        if (this.field1728 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1721 / (long) this.field1719) + 14;
            int var4 = 0;
            int var5 = 0;
            int[] var6 = new int[var3];
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field1728[var5];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1721 + var5;
                int var14 = var13 / this.field1719;
                var4 += var14;
                var5 = var13 - this.field1719 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        field1725++;
        int var15 = 9 / ((arg1 + 5) / 50);
        return arg0;
    }
}
