import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class26 {

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    private int field554;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "[[I")
    private int[][] field555;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lrd;")
    private static class173 field546 = class133.method843("Select a world", 63);

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "[[B")
    public static byte[][] field553 = new byte[250][];

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Lrd;")
    public static class173 field549 = field546;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Lrd;")
    public static class173 field551 = class133.method843("(Udns", -68);

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Lqf;")
    public static class165 field558 = null;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Lrd;")
    private static class173 field557 = class133.method843("Prepared sound engine", -78);

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field550 = 0;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lrd;")
    public static class173 field543 = field557;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "[Lsa;")
    public static class180[] field547;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)I")
    public final int method199(int arg0, int arg1) {
        if (this.field555 != null) {
            arg0 = (int) ((long) this.field548 * (long) arg0 / (long) this.field554);
        }
        field559++;
        return arg1 <= 66 ? -21 : arg0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)I")
    public final int method200(boolean arg0, int arg1) {
        if (arg0) {
            this.method202(56, null);
        }
        if (this.field555 != null) {
            arg1 = (int) ((long) this.field548 * (long) arg1 / (long) this.field554) + 6;
        }
        field552++;
        return arg1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method201(int arg0) {
        field546 = null;
        field558 = null;
        field549 = null;
        field543 = null;
        field553 = null;
        field547 = null;
        if (arg0 > -82) {
            field558 = null;
        }
        field557 = null;
        field551 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[B)[B")
    public final byte[] method202(int arg0, byte[] arg1) {
        if (arg0 != 1491) {
            return null;
        }
        field560++;
        if (this.field555 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field548 / (long) this.field554) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field555[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field548 + var6;
                int var14 = var13 / this.field554;
                var5 += var14;
                var6 = var13 - this.field554 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(II)V")
    public class26(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class33.method265(arg1, arg0, (byte) -106);
            int var4 = arg1 / var3;
            this.field548 = var4;
            int var5 = arg0 / var3;
            this.field554 = var5;
            this.field555 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field555[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                double var10 = (double) var4 / (double) var5;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var12 < var13) {
                    double var14 = ((double) var12 - var8) * 3.141592653589793D;
                    double var16 = var10;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILqf;)Lqf;")
    public static final class165 method203(int arg0, class165 arg1) {
        if (arg0 != 25485) {
            method201(28);
        }
        field556++;
        int var2 = class223.method1442(class78.method474(arg1, 110), arg0 - 1897095676);
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1 = class103.method639(arg1.field3072, true);
            if (arg1 == null) {
                return null;
            }
        }
        return arg1;
    }
}
