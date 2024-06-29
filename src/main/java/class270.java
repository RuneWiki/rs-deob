import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class270 {

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    private int field4710;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    private int field4716;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "[[I")
    private int[][] field4715;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Lha;")
    public static class46 field4705 = class271.method1828(" steht bereits auf Ihrer Ignorieren)2Liste(Q", -46);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Lha;")
    public static class46 field4704 = class271.method1828(")2", -46);

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field4711 = 1;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "[I")
    public static int[] field4706 = new int[500];

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field4718 = -1;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "[Lhh;")
    public static class263[] field4719;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "[[[B")
    public static byte[][][] field4712;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)I")
    public final int method1822(int arg0, byte arg1) {
        if (this.field4715 != null) {
            arg0 = (int) ((long) this.field4716 * (long) arg0 / (long) this.field4710);
        }
        int var3 = 16 / ((46 - arg1) / 49);
        field4717++;
        return arg0;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I")
    public final int method1823(int arg0, int arg1) {
        if (this.field4715 != null) {
            arg0 = (int) ((long) this.field4716 * (long) arg0 / (long) this.field4710) + 6;
        }
        field4709++;
        if (arg1 < 109) {
            this.method1824(-118, (byte[]) null);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[B)[B")
    public final byte[] method1824(int arg0, byte[] arg1) {
        if (this.field4715 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field4716 / (long) this.field4710) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field4715[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field4716 + var6;
                int var14 = var13 / this.field4710;
                var6 = var13 - this.field4710 * var14;
                var5 += var14;
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
        int var15 = -79 / ((11 - arg0) / 63);
        field4714++;
        return arg1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
    public static void method1825(boolean arg0) {
        field4719 = null;
        field4712 = null;
        field4704 = null;
        field4706 = null;
        field4705 = null;
        if (!arg0) {
            method1825(true);
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(II)V")
    public class270(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class74.method535((byte) 68, arg0, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field4710 = var4;
            this.field4716 = var5;
            this.field4715 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field4715[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                if (var10 < 0) {
                    var10 = 0;
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
