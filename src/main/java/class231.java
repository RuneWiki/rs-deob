import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class231 {

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    private int field3865 = -1;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    private int field3868 = 0;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Lij;")
    private static class50 field3871 = class78.method578(122, "Location");

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "Lij;")
    public static class50 field3881 = class78.method578(121, "mem=");

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "Lij;")
    public static class50 field3882 = field3871;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "Lij;")
    public static class50 field3886 = class78.method578(122, " )2>");

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field3883 = -1;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    public static int field3888 = 0;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "J")
    public static long field3878 = 0L;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public int field3867;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public int field3874;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public int field3880;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public int field3885;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Lda;")
    public static class22 field3866;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Ljd;")
    public static class85 field3863;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILwd;I)V")
    public final void method1571(int arg0, class217 arg1, int arg2) {
        field3879++;
        int var4 = 63 % ((arg0 + 61) / 34);
        while (true) {
            int var5 = arg1.method1487(255);
            if (var5 == 0) {
                return;
            }
            this.method1574(255, arg2, var5, arg1);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static final void method1572(byte arg0) {
        for (class60 var1 = (class60) class183.field3011.method689(1001); var1 != null; var1 = (class60) class183.field3011.method688(-102)) {
            if (var1.field1111) {
                var1.method466(true);
            }
        }
        field3870++;
        int var2 = 16 % ((51 - arg0) / 38);
        for (class60 var3 = (class60) class217.field3637.method689(1001); var3 != null; var3 = (class60) class217.field3637.method688(-64)) {
            if (var3.field1111) {
                var3.method466(true);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V")
    public static final void method1573(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 > -70) {
            method1572((byte) 15);
        }
        if (arg2 >= arg0) {
            class155.method1090(class177.field2963[arg1], arg0, arg4, 160, arg2);
        } else {
            class155.method1090(class177.field2963[arg1], arg2, arg4, 160, arg0);
        }
        field3884++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIILwd;)V")
    private final void method1574(int arg0, int arg1, int arg2, class217 arg3) {
        if (arg0 != 255) {
            return;
        }
        if (arg2 == 1) {
            this.field3868 = arg3.method1447(arg0 ^ 0xFFFFFF72);
            this.method1580(arg0 ^ 0xFFFFFDA2, this.field3868);
        } else if (arg2 == 2) {
            this.field3865 = arg3.method1441(80);
            if (this.field3865 == 65535) {
                this.field3865 = -1;
            }
        } else if (arg2 == 3) {
            arg3.method1441(80);
        }
        field3877++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public static void method1575(boolean arg0) {
        field3871 = null;
        field3886 = null;
        if (!arg0) {
            field3882 = null;
            field3881 = null;
            field3863 = null;
            field3866 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method1576(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field3887++;
        int var7 = 0;
        class27.method249((byte) -55, arg0);
        int var8 = arg0 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = -arg0;
        int var10 = arg0;
        int var11 = 66 % ((-arg5 - 82) / 37);
        int var12 = var8;
        int var13 = -var8;
        if (arg4 >= class100.field1855 && arg4 <= class97.field1816) {
            int[] var14 = class177.field2963[arg4];
            int var15 = class2.method10(class177.field2953, (byte) 97, arg6 - arg0, class224.field3773);
            int var16 = class2.method10(class177.field2953, (byte) 97, arg0 + arg6, class224.field3773);
            int var17 = class2.method10(class177.field2953, (byte) 97, arg6 - var8, class224.field3773);
            int var18 = class2.method10(class177.field2953, (byte) 97, arg6 + var8, class224.field3773);
            class155.method1090(var14, var15, arg2, 160, var17);
            class155.method1090(var14, var17, arg3, 160, var18);
            class155.method1090(var14, var18, arg2, 160, var16);
        }
        int var19 = -1;
        int var20 = -1;
        while (var10 > var7) {
            var19 += 2;
            var20 += 2;
            var13 += var19;
            var9 += var20;
            if (var13 >= 0 && var12 >= 1) {
                var12--;
                var13 -= var12 << 1;
                class100.field1833[var12] = var7;
            }
            var7++;
            if (var9 >= 0) {
                var10--;
                int var21 = arg4 - var10;
                int var22 = arg4 + var10;
                var9 -= var10 << 1;
                if (class100.field1855 <= var22 && class97.field1816 >= var21) {
                    if (var8 <= var10) {
                        int var23 = class2.method10(class177.field2953, (byte) 97, arg6 + var7, class224.field3773);
                        int var24 = class2.method10(class177.field2953, (byte) 97, arg6 - var7, class224.field3773);
                        if (var22 <= class97.field1816) {
                            class155.method1090(class177.field2963[var22], var24, arg2, 160, var23);
                        }
                        if (class100.field1855 <= var21) {
                            class155.method1090(class177.field2963[var21], var24, arg2, 160, var23);
                        }
                    } else {
                        int var25 = class100.field1833[var10];
                        int var26 = class2.method10(class177.field2953, (byte) 97, arg6 + var7, class224.field3773);
                        int var27 = class2.method10(class177.field2953, (byte) 97, arg6 - var7, class224.field3773);
                        int var28 = class2.method10(class177.field2953, (byte) 97, arg6 + var25, class224.field3773);
                        int var29 = class2.method10(class177.field2953, (byte) 97, arg6 - var25, class224.field3773);
                        if (var22 <= class97.field1816) {
                            int[] var30 = class177.field2963[var22];
                            class155.method1090(var30, var27, arg2, 160, var29);
                            class155.method1090(var30, var29, arg3, 160, var28);
                            class155.method1090(var30, var28, arg2, 160, var26);
                        }
                        if (class100.field1855 <= var21) {
                            int[] var31 = class177.field2963[var21];
                            class155.method1090(var31, var27, arg2, 160, var29);
                            class155.method1090(var31, var29, arg3, 160, var28);
                            class155.method1090(var31, var28, arg2, 160, var26);
                        }
                    }
                }
            }
            int var32 = arg4 - var7;
            int var33 = arg4 + var7;
            if (var33 >= class100.field1855 && var32 <= class97.field1816) {
                int var34 = arg6 + var10;
                int var35 = arg6 - var10;
                if (var34 >= class177.field2953 && var35 <= class224.field3773) {
                    int var36 = class2.method10(class177.field2953, (byte) 97, var34, class224.field3773);
                    int var37 = class2.method10(class177.field2953, (byte) 97, var35, class224.field3773);
                    if (var8 > var7) {
                        int var38 = var7 > var12 ? class100.field1833[var7] : var12;
                        int var39 = class2.method10(class177.field2953, (byte) 97, arg6 + var38, class224.field3773);
                        int var40 = class2.method10(class177.field2953, (byte) 97, arg6 - var38, class224.field3773);
                        if (var33 <= class97.field1816) {
                            int[] var41 = class177.field2963[var33];
                            class155.method1090(var41, var37, arg2, 160, var40);
                            class155.method1090(var41, var40, arg3, 160, var39);
                            class155.method1090(var41, var39, arg2, 160, var36);
                        }
                        if (var32 >= class100.field1855) {
                            int[] var42 = class177.field2963[var32];
                            class155.method1090(var42, var37, arg2, 160, var40);
                            class155.method1090(var42, var40, arg3, 160, var39);
                            class155.method1090(var42, var39, arg2, 160, var36);
                        }
                    } else {
                        if (var33 <= class97.field1816) {
                            class155.method1090(class177.field2963[var33], var37, arg2, 160, var36);
                        }
                        if (var32 >= class100.field1855) {
                            class155.method1090(class177.field2963[var32], var37, arg2, 160, var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V")
    public static final void method1577(byte arg0) {
        field3873++;
        class48.field871 = class233.field3911;
        class207.method1393(0, false);
        class15.method110(23);
        class117.method847(class48.field871, (byte) -76);
        class239.field4067 = new class187();
        class239.field4067.field3990 = 3000;
        class239.field4067.field4027 = 3000;
        if (arg0 != 3) {
            field3881 = null;
        }
        class199.method1332(class24.field530, -32769);
        class120.method868(125, 10);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lwd;B)Ldf;")
    public static final class42 method1578(class217 arg0, byte arg1) {
        if (arg1 != -86) {
            method1572((byte) -14);
        }
        field3876++;
        return new class42(arg0.method1438(-122), arg0.method1438(79), arg0.method1438(64), arg0.method1438(-110), arg0.method1438(53), arg0.method1438(-127), arg0.method1438(-115), arg0.method1438(arg1 - 22), arg0.method1447(arg1 + 202), arg0.method1487(255));
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIBIII)V")
    public static final void method1579(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field3869++;
        class203 var10 = null;
        for (class203 var11 = (class203) class227.field3824.method689(1001); var11 != null; var11 = (class203) class227.field3824.method688(-127)) {
            if (var11.field3376 == arg3 && var11.field3366 == arg4 && var11.field3373 == arg8 && var11.field3367 == arg2) {
                var10 = var11;
                break;
            }
        }
        int var12 = -37 / ((arg6 - 88) / 38);
        if (var10 == null) {
            var10 = new class203();
            var10.field3366 = arg4;
            var10.field3373 = arg8;
            var10.field3367 = arg2;
            var10.field3376 = arg3;
            class154.method1084(var10, 2);
            class227.field3824.method684(var10, (byte) 109);
        }
        var10.field3385 = arg9;
        var10.field3384 = arg5;
        var10.field3369 = arg0;
        var10.field3382 = arg1;
        var10.field3371 = arg7;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V")
    private final void method1580(int arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        field3872++;
        if (arg0 != -675) {
            return;
        }
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = var3;
        double var9 = var3;
        if (var3 > var5) {
            var7 = var5;
        }
        if (var3 < var5) {
            var9 = var5;
        }
        double var11 = 0.0D;
        double var13 = (double) (arg1 & 0xFF) / 256.0D;
        double var15 = 0.0D;
        if (var13 > var9) {
            var9 = var13;
        }
        if (var13 < var7) {
            var7 = var13;
        }
        double var17 = (var7 + var9) / 2.0D;
        this.field3874 = (int) (var17 * 256.0D);
        if (this.field3874 < 0) {
            this.field3874 = 0;
        } else if (this.field3874 > 255) {
            this.field3874 = 255;
        }
        if (var7 != var9) {
            if (var3 == var9) {
                var11 = (var5 - var13) / (var9 - var7);
            } else if (var5 == var9) {
                var11 = (var13 - var3) / (var9 - var7) + 2.0D;
            } else if (var9 == var13) {
                var11 = (var3 - var5) / (var9 - var7) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var9 - var7) / (var7 + var9);
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var7) / (2.0D - var9 - var7);
            }
        }
        this.field3867 = (int) (var15 * 256.0D);
        if (this.field3867 < 0) {
            this.field3867 = 0;
        } else if (this.field3867 > 255) {
            this.field3867 = 255;
        }
        double var19 = var11 / 6.0D;
        if ((var17 > 0.5D)) {
            this.field3885 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3885 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3885 < 1) {
            this.field3885 = 1;
        }
        this.field3880 = (int) ((double) this.field3885 * var19);
    }
}
