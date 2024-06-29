import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class157 {

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    private int field2806;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "[[I")
    private int[][] field2810;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    private int field2812;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Leb;")
    private static class230 field2799 = class68.method589(0, "yellow:");

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field2811 = 0;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Leb;")
    public static class230 field2801 = field2799;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Leb;")
    public static class230 field2814 = field2799;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Leb;")
    public static class230 field2808 = class68.method589(0, "Titelbild ge-Offnet)3");

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Leh;")
    public static class80 field2802;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Z")
    public static boolean field2804;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "[[[B")
    public static byte[][][] field2813;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)Leb;")
    public static final class230 method1193(int arg0, boolean arg1) {
        field2807++;
        if (arg0 < 999999999) {
            return class37.method340(arg0, (byte) -26);
        } else {
            if (!arg1) {
                field2802 = null;
            }
            return class82.field1484;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method1194(int arg0) {
        field2801 = null;
        if (arg0 != 127) {
            field2808 = null;
        }
        field2799 = null;
        field2813 = null;
        field2802 = null;
        field2808 = null;
        field2814 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
    public final int method1195(int arg0, int arg1) {
        field2797++;
        if (this.field2810 != null) {
            arg0 = (int) ((long) this.field2812 * (long) arg0 / (long) this.field2806);
        }
        if (arg1 != 6) {
            this.method1197(72, (byte[]) null);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILfk;)V")
    public static final void method1196(int arg0, class14 arg1) {
        byte[] var2 = new byte[24];
        field2805++;
        if (class53.field922 != null) {
            try {
                int var3 = 0;
                class53.field922.method69(0L, -1);
                class53.field922.method71((byte) 111, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method159(var2, arg0, false, 24);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[B)[B")
    public final byte[] method1197(int arg0, byte[] arg1) {
        if (arg0 != 14) {
            method1196(119, (class14) null);
        }
        field2798++;
        if (this.field2810 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2812 / (long) this.field2806) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field2810[var5];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2812 + var5;
                int var14 = var13 / this.field2806;
                var5 = var13 - this.field2806 * var14;
                var6 += var14;
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
        return arg1;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(II)V")
    public class157(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class104.method876(arg1, arg0, (byte) 120);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field2806 = var5;
            this.field2810 = new int[var5][14];
            this.field2812 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field2810[var6];
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
                while (var11 > var10) {
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

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(IZ)I")
    public final int method1198(int arg0, boolean arg1) {
        if (this.field2810 != null) {
            arg0 = ((int) ((long) this.field2812 * (long) arg0 / (long) this.field2806)) + 6;
        }
        field2803++;
        if (arg1) {
            this.method1195(122, -85);
        }
        return arg0;
    }
}
