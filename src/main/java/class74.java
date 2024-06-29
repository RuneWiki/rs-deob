import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class74 {

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    private int field1777;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "[[I")
    private int[][] field1780;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    private int field1774;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
    public static int[] field1776 = new int[32];

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "Lid;")
    private static class60 field1785;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Lid;")
    private static class60 field1786;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "Lid;")
    public static class60 field1790;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Lid;")
    public static class60 field1791;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lid;")
    public static class60 field1783;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "Lid;")
    public static class60 field1793;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "[I")
    public static int[] field1792;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "Lid;")
    public static class60 field1789;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "Lid;")
    public static class60 field1794;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method564(byte arg0) {
        field1791 = null;
        field1789 = null;
        field1790 = null;
        field1783 = null;
        if (arg0 <= 73) {
            field1792 = null;
        }
        field1786 = null;
        field1792 = null;
        field1793 = null;
        field1794 = null;
        field1776 = null;
        field1785 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)I")
    public final int method565(int arg0, int arg1) {
        field1779++;
        if (this.field1780 != null) {
            arg0 = (int) ((long) this.field1774 * (long) arg0 / (long) this.field1777) + 6;
        }
        if (arg1 != 3850) {
            method564((byte) -58);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)I")
    public final int method566(int arg0, int arg1) {
        if (this.field1780 != null) {
            arg0 = (int) ((long) this.field1774 * (long) arg0 / (long) this.field1777);
        }
        field1778++;
        if (arg1 != -8752) {
            field1794 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[B)[B")
    public final byte[] method567(int arg0, byte[] arg1) {
        field1775++;
        if (this.field1780 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field1774 / (long) this.field1777) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var10 = this.field1780[var6];
                byte var11 = arg1[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var10[var12] * var11;
                }
                int var13 = this.field1774 + var6;
                int var14 = var13 / this.field1777;
                var5 += var14;
                var6 = var13 - this.field1777 * var14;
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
        if (arg0 != 32) {
            this.field1774 = -61;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(II)V")
    public class74(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class82.method690(arg0, arg1, true);
            int var4 = arg0 / var3;
            this.field1777 = var4;
            int var5 = arg1 / var3;
            this.field1780 = new int[var4][14];
            this.field1774 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field1780[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                double var10 = (double) var5 / (double) var4;
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

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1776[var1] = var0 - 1;
            var0 += var0;
        }
        field1785 = class11.method72("K", (byte) 10);
        field1788 = 0;
        field1784 = 127;
        field1786 = class11.method72("Could not complete login)3", (byte) -28);
        field1790 = field1786;
        field1791 = field1785;
        field1783 = field1785;
        field1793 = class11.method72("logo", (byte) -99);
        field1792 = new int[1000];
        field1789 = class11.method72("::", (byte) 104);
        field1794 = class11.method72("Mem:", (byte) 117);
    }
}
