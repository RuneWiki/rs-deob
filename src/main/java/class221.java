import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class221 {

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    private int field3830;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    private int field3833;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "[[I")
    private int[][] field3835;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field3834 = 0;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lqh;")
    public static class189 field3832 = new class189(100);

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Ldf;")
    public static class51 field3839 = class46.method233("(U0a )2 via: ", 100);

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Ldf;")
    public static class51 field3840 = class46.method233(":clanreq:", 100);

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Ldf;")
    public static class51 field3842 = class46.method233("hint_mapmarkers", 100);

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Z")
    public static boolean field3843 = false;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "Ldf;")
    public static class51 field3841 = class46.method233(")2", 100);

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "S")
    public static short field3844 = 256;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lwc;")
    public static class213 field3829;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "[I")
    public static int[] field3837;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
    public static void method1515(boolean arg0) {
        field3841 = null;
        if (!arg0) {
            return;
        }
        field3829 = null;
        field3839 = null;
        field3837 = null;
        field3832 = null;
        field3840 = null;
        field3842 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1516(byte[] arg0, int arg1) {
        field3831++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        if (arg1 == 13087) {
            class256.method1746(arg0, 0, var3, 0, var2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B[B)[B")
    public final byte[] method1517(byte arg0, byte[] arg1) {
        if (arg0 <= 58) {
            this.method1517((byte) -22, (byte[]) null);
        }
        if (this.field3835 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3830 / (long) this.field3833) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field3835[var5];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3830 + var5;
                int var14 = var13 / this.field3833;
                var6 += var14;
                var5 = var13 - this.field3833 * var14;
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
        field3838++;
        return arg1;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)I")
    public final int method1518(int arg0, int arg1) {
        if (this.field3835 != null) {
            arg0 = (int) ((long) this.field3830 * (long) arg0 / (long) this.field3833) + 6;
        }
        field3828++;
        if (arg1 != -32768) {
            this.method1518(121, 85);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)I")
    public final int method1519(int arg0, int arg1) {
        field3836++;
        if (this.field3835 != null) {
            arg1 = (int) ((long) this.field3830 * (long) arg1 / (long) this.field3833);
        }
        if (arg0 < 84) {
            field3840 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(II)V")
    public class221(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class233.method1615(arg1, 106, arg0);
            int var4 = arg1 / var3;
            this.field3830 = var4;
            int var5 = arg0 / var3;
            this.field3833 = var5;
            this.field3835 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var6 / (double) var5 + 6.0D;
                int[] var9 = this.field3835[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var7 + 7.0D);
                double var12 = (double) var4 / (double) var5;
                if (var11 > 14) {
                    var11 = 14;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                while (var11 > var10) {
                    double var14 = ((double) var10 - var7) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
