import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class38 {

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    private int field872;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "[[I")
    private int[][] field865;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    private int field871;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Lvf;")
    public static class265 field864 = class87.method582(-46, "::rebuild");

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Lvf;")
    public static class265 field876 = class87.method582(-46, "(U0a )2 in: ");

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Lvf;")
    public static class265 field877 = class87.method582(-46, "Shift)2click disabled)3");

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Loe;")
    public static class108 field867;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "Lfl;")
    public static class192 field878;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field879;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "[I")
    public static int[] field870;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIBI)I")
    public static final int method312(int arg0, int arg1, byte arg2, int arg3) {
        field866++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else {
            if (arg2 <= 70) {
                field879 = null;
            }
            return var4 == 2 ? 7 - arg3 : 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BZI)Lvf;")
    public static final class265 method313(byte arg0, boolean arg1, int arg2) {
        field873++;
        return arg0 == -126 ? class167.method1107(arg2, arg1, 10, (byte) 22) : null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([BZ)[B")
    public final byte[] method314(byte[] arg0, boolean arg1) {
        field863++;
        if (arg1) {
            field864 = null;
        }
        if (this.field865 != null) {
            int var3 = 0;
            int var4 = 0;
            int var5 = (int) ((long) arg0.length * (long) this.field872 / (long) this.field871) + 14;
            int[] var6 = new int[var5];
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field865[var4];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var3 + var12] += var11[var12] * var10;
                }
                int var13 = this.field872 + var4;
                int var14 = var13 / this.field871;
                var3 += var14;
                var4 = var13 - this.field871 * var14;
            }
            arg0 = new byte[var5];
            for (int var8 = 0; var8 < var5; var8++) {
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
        return arg0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)I")
    public final int method315(int arg0, int arg1) {
        if (this.field865 != null) {
            arg1 = (int) ((long) this.field872 * (long) arg1 / (long) this.field871);
        }
        field875++;
        if (arg0 < 20) {
            this.method317(-82, 13);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLfl;)V")
    public static final void method316(byte arg0, class192 arg1) {
        if (arg0 != -125) {
            method318(false);
        }
        class142.field2644 = arg1;
        class183.field3279 = class142.field2644.method1331(16, (byte) 104);
        field869++;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)I")
    public final int method317(int arg0, int arg1) {
        if (this.field865 != null) {
            arg0 = (int) ((long) this.field872 * (long) arg0 / (long) this.field871) + 6;
        }
        field868++;
        if (arg1 != 8586) {
            method318(false);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
    public static void method318(boolean arg0) {
        field864 = null;
        field867 = null;
        field879 = null;
        field876 = null;
        field877 = null;
        if (!arg0) {
            field876 = null;
        }
        field870 = null;
        field878 = null;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(II)V")
    public class38(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class80.method557((byte) 102, arg1, arg0);
            int var4 = arg1 / var3;
            this.field872 = var4;
            int var5 = arg0 / var3;
            this.field865 = new int[var5][14];
            this.field871 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field865[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                double var10 = (double) var4 / (double) var5;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                if (var12 < 0) {
                    var12 = 0;
                }
                while (var13 > var12) {
                    double var14 = var10;
                    double var16 = ((double) var12 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var10 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }
}
