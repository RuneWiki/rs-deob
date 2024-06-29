import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class55 {

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    private int field859;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    private int field870;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "[[I")
    private int[][] field867;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "Loh;")
    private static class258 field861 = class153.method1046("Ok", 109);

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "Loh;")
    public static class258 field863 = field861;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "Loh;")
    public static class258 field864 = class153.method1046("Nehmen", 112);

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field866 = -1;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Lvj;")
    public static class96 field862 = new class96(128);

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "Loh;")
    private static class258 field871 = class153.method1046("Attack", 109);

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "Loh;")
    public static class258 field872 = field871;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([BB)[B", line = 12)
    public final byte[] method428(byte[] arg0, byte arg1) {
        int var3 = 114 / ((-arg1 - 92) / 32);
        field860++;
        if (this.field867 != null) {
            int var4 = 0;
            int var5 = 0;
            int var6 = (int) ((long) arg0.length * (long) this.field859 / (long) this.field870) + 14;
            int[] var7 = new int[var6];
            for (int var8 = 0; var8 < arg0.length; var8++) {
                byte var9 = arg0[var8];
                int[] var10 = this.field867[var4];
                for (int var11 = 0; var11 < 14; var11++) {
                    var7[var5 + var11] += var10[var11] * var9;
                }
                int var12 = this.field859 + var4;
                int var13 = var12 / this.field870;
                var4 = var12 - this.field870 * var13;
                var5 += var13;
            }
            arg0 = new byte[var6];
            for (int var14 = 0; var14 < var6; var14++) {
                int var15 = var7[var14] + 32768 >> 16;
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

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 87)
    public static void method429(byte arg0) {
        field861 = null;
        field871 = null;
        if (arg0 != -105) {
            field866 = 108;
        }
        field872 = null;
        field864 = null;
        field862 = null;
        field863 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)I", line = 103)
    public final int method430(int arg0, int arg1) {
        field868++;
        if (arg1 == 28971) {
            if (this.field867 != null) {
                arg0 = (int) ((long) this.field859 * (long) arg0 / (long) this.field870);
            }
            return arg0;
        } else {
            return 102;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)I", line = 118)
    public final int method431(int arg0, int arg1) {
        if (this.field867 != null) {
            arg0 = (int) ((long) this.field859 * (long) arg0 / (long) this.field870) + 6;
        }
        field865++;
        if (arg1 != -25846) {
            this.method428((byte[]) null, (byte) -10);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(II)V", line = 152)
    public class55(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class172.method1168(-1, arg1, arg0);
            int var4 = arg1 / var3;
            this.field859 = var4;
            int var5 = arg0 / var3;
            this.field870 = var5;
            this.field867 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field867[var6];
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
}
