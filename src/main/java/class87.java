import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class87 {

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    private int field1705;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "[[I")
    private int[][] field1704;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    private int field1711;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "Lli;")
    private static class185 field1700 = class245.method1649("red:", -113);

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Lli;")
    public static class185 field1701 = field1700;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Lli;")
    public static class185 field1706 = field1700;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "Z")
    public static boolean field1702 = false;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "Lli;")
    public static class185 field1710 = class245.method1649(" )2> ", 122);

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "[Lie;")
    public static class71[] field1712 = new class71[32768];

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Lbg;")
    public static class171 field1707 = new class171(0, 0);

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "Ldl;")
    public static class31 field1715 = new class31(8);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "[[B")
    public static byte[][] field1713;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IB)I")
    public final int method566(int arg0, byte arg1) {
        if (this.field1704 != null) {
            arg0 = (int) ((long) this.field1711 * (long) arg0 / (long) this.field1705) + 6;
        }
        field1703++;
        return arg1 > -127 ? 7 : arg0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[Lli;)Lli;")
    public static final class185 method567(int arg0, class185[] arg1) {
        if (arg0 != -11039) {
            field1701 = null;
        }
        field1714++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return client.method1506(arg1, 0, arg1.length, -127);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lli;Lli;Lli;II)V")
    public static final void method568(class185 arg0, class185 arg1, class185 arg2, int arg3, int arg4) {
        class7.method77(arg1, arg4, -1, -14486, arg2, arg0);
        field1708++;
        if (arg3 > -56) {
            method571(11);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([BI)[B")
    public final byte[] method569(byte[] arg0, int arg1) {
        if (arg1 != -32768) {
            return null;
        }
        if (this.field1704 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1711 / (long) this.field1705) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var10 = this.field1704[var5];
                byte var11 = arg0[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var10[var12] * var11;
                }
                int var13 = this.field1711 + var5;
                int var14 = var13 / this.field1705;
                var5 = var13 - this.field1705 * var14;
                var6 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        field1709++;
        return arg0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)I")
    public final int method570(int arg0, int arg1) {
        if (this.field1704 != null) {
            arg0 = (int) ((long) this.field1711 * (long) arg0 / (long) this.field1705);
        }
        field1699++;
        if (arg1 != -32768) {
            method571(110);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static void method571(int arg0) {
        field1707 = null;
        field1712 = null;
        field1715 = null;
        field1710 = null;
        field1701 = null;
        field1713 = null;
        field1706 = null;
        int var1 = -7 % ((arg0 - 7) / 40);
        field1700 = null;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(II)V")
    public class87(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class216.method1515(arg1, arg0, 0);
            int var4 = arg0 / var3;
            this.field1705 = var4;
            this.field1704 = new int[var4][14];
            int var5 = arg1 / var3;
            this.field1711 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field1704[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                double var11 = (double) var5 / (double) var4;
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                while (var13 > var10) {
                    double var14 = var11;
                    double var16 = ((double) var10 - var7) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var11 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
