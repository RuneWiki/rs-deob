import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class264 {

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    private int field3862;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "[[I")
    private int[][] field3861;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    private int field3863;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "Lng;")
    public static class226 field3860 = new class226(8);

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "Z")
    public static boolean field3869 = true;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3868;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IB)I", line = 3)
    public final int method1753(int arg0, byte arg1) {
        if (arg1 <= 36) {
            method1759((byte) -122);
        }
        field3859++;
        if (this.field3861 != null) {
            arg0 = (int) ((long) this.field3862 * (long) arg0 / (long) this.field3863) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I[B)[B", line = 18)
    public final byte[] method1754(int arg0, byte[] arg1) {
        if (this.field3861 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3862 / (long) this.field3863) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field3861[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3862 + var6;
                int var14 = var13 / this.field3863;
                var5 += var14;
                var6 = var13 - this.field3863 * var14;
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
        if (arg0 != -31851) {
            field3869 = true;
        }
        field3870++;
        return arg1;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)I", line = 86)
    public final int method1755(int arg0, int arg1) {
        field3864++;
        if (this.field3861 != null) {
            arg0 = (int) ((long) this.field3862 * (long) arg0 / (long) this.field3863);
        }
        return arg1 == 127 ? arg0 : 73;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 103)
    public static void method1756(int arg0) {
        field3868 = null;
        if (arg0 != -3672) {
            field3860 = null;
        }
        field3860 = null;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)Luq;", line = 114)
    public static final class111 method1757(int arg0) {
        field3866++;
        int var1 = -54 % ((arg0 - 12) / 36);
        return class460.field6800;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(II)V", line = 132)
    public class264(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class354.method2214(arg0, (byte) -110, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field3862 = var5;
            this.field3861 = new int[var4][14];
            this.field3863 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field3861[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var10 < var11) {
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

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V", line = 197)
    public static final void method1758(int arg0) {
        field3867++;
        if (arg0 == 20841) {
            class523.field7744 = -1;
            class149.field2205 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)[Lpp;", line = 211)
    public static final class267[] method1759(byte arg0) {
        field3865++;
        if (arg0 <= 5) {
            field3860 = null;
        }
        if (class329.field4681 == null) {
            class267[] var1 = class443.method2668(class483.field7077, false);
            class267[] var2 = new class267[var1.length];
            int var3 = 0;
            label66: for (int var4 = 0; var4 < var1.length; var4++) {
                class267 var8 = var1[var4];
                if ((var8.field3904 <= 0 || var8.field3904 >= 24) && var8.field3900 >= 800 && var8.field3898 >= 600 && (class34.field363 >= 96 || class170.field2529 != 0 || var8.field3900 <= 1024 && var8.field3898 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class267 var10 = var2[var9];
                        if (var8.field3900 == var10.field3900 && var8.field3898 == var10.field3898) {
                            if (var10.field3904 < var8.field3904) {
                                var2[var9] = var8;
                            }
                            continue label66;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class329.field4681 = new class267[var3];
            class520.method3075(var2, 0, class329.field4681, 0, var3);
            int[] var5 = new int[class329.field4681.length];
            for (int var6 = 0; var6 < class329.field4681.length; var6++) {
                class267 var7 = class329.field4681[var6];
                var5[var6] = var7.field3900 * var7.field3898;
            }
            class204.method1381((byte) 125, class329.field4681, var5);
        }
        return class329.field4681;
    }
}
