import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class75 {

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "[[I")
    private int[][] field1831;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    private int field1824;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    private int field1828;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "[[I")
    public static int[][] field1821 = new int[104][104];

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "[I")
    public static int[] field1823 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Lea;")
    public static class38 field1825 = class9.method46((byte) 102, "(U4");

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Lea;")
    public static class38 field1830 = class9.method46((byte) 109, " )2>");

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)I")
    public final int method593(int arg0, byte arg1) {
        if (this.field1831 != null) {
            arg0 = (int) ((long) this.field1824 * (long) arg0 / (long) this.field1828) + 6;
        }
        if (arg1 == -17) {
            field1829++;
            return arg0;
        } else {
            return 83;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I")
    public final int method594(int arg0, int arg1) {
        field1826++;
        if (this.field1831 != null) {
            arg0 = (int) ((long) this.field1824 * (long) arg0 / (long) this.field1828);
        }
        int var3 = 88 % ((arg1 - 18) / 42);
        return arg0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[B)[B")
    public final byte[] method595(int arg0, byte[] arg1) {
        field1822++;
        if (this.field1831 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field1824 / (long) this.field1828) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var10 = this.field1831[var5];
                byte var11 = arg1[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var10[var12] * var11;
                }
                int var13 = this.field1824 + var5;
                int var14 = var13 / this.field1828;
                var6 += var14;
                var5 = var13 - this.field1828 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        if (arg0 >= -117) {
            this.field1824 = 43;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method596(byte arg0) {
        field1825 = null;
        int var1 = -48 % ((arg0 + 58) / 43);
        field1821 = null;
        field1830 = null;
        field1823 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lea;ILea;Ldd;)Lfa;")
    public static final class47 method597(class38 arg0, int arg1, class38 arg2, class32 arg3) {
        field1827++;
        int var4 = arg3.method207((byte) 32, arg2);
        int var5 = arg3.method212(arg0, -97, var4);
        if (arg1 != -1094018352) {
            field1830 = null;
        }
        return class120.method918(var5, var4, 120, arg3);
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(II)V")
    public class75(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class165.method1176((byte) 114, arg1, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field1831 = new int[var4][14];
            this.field1824 = var5;
            this.field1828 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field1831[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var7 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                double var12 = (double) var5 / (double) var4;
                while (var11 > var10) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var7) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
