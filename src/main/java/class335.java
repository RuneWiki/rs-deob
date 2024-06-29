import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class335 {

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
    private int field4910 = -1;

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "Z")
    private boolean field4914 = true;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "[Lpg;")
    private class287[] field4903;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
    private int field4908;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
    private int field4911;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    private int field4898;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    private int field4902;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "[Lpg;")
    private class287[] field4899;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "Lpg;")
    private class287 field4905;

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "Ltm;")
    public static class334 field4913 = new class334(95, 10);

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "Lln;")
    public static class472 field4916 = new class472(13, 0, 1, 0);

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
    public static int field4917 = 765;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    private int field4901;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
    private int field4909;

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "Lit;")
    private class34 field4912;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "[Lov;")
    public static class668[] field4904;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V", line = 7)
    public final void method2146(int arg0) {
        if (arg0 < 106) {
            method2148((byte) 59);
        }
        field4915++;
        if (this.field4903 != null) {
            for (int var2 = 0; var2 < this.field4903.length; var2++) {
                this.field4903[var2].method1875();
            }
        }
        this.field4912 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIII)I", line = 33)
    public static final int method2147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg6;
            arg6 = var7;
        }
        field4906++;
        int var8 = arg5 & 0x3;
        if (arg2 == var8) {
            return arg3;
        } else if (var8 == 1) {
            return 7 + 1 - arg4 - arg0;
        } else if (var8 == 2) {
            return 1 + 7 - arg6 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V", line = 67)
    public static void method2148(byte arg0) {
        field4916 = null;
        if (arg0 > -104) {
            method2148((byte) 118);
        }
        field4904 = null;
        field4913 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILha;I)Z", line = 83)
    public final boolean method2149(int arg0, class544 arg1, int arg2) {
        if (this.field4910 != arg0) {
            this.field4910 = arg0;
            int var4 = class602.method3455(arg0, false);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field4901 != var4) {
                this.field4912 = null;
                this.field4901 = var4;
            }
            if (this.field4903 != null) {
                this.field4909 = 0;
                int[] var5 = new int[this.field4903.length];
                for (int var6 = 0; var6 < this.field4903.length; var6++) {
                    class287 var7 = this.field4903[var6];
                    if (var7.method1880(this.field4911, this.field4908, this.field4902, this.field4910)) {
                        var5[this.field4909] = var7.field4415;
                        this.field4899[this.field4909++] = var7;
                    }
                }
                class47.method477(0, var5, -4991, this.field4909 - 1, this.field4899);
            }
            this.field4914 = true;
        }
        field4900++;
        if (arg2 != 512) {
            this.field4899 = null;
        }
        boolean var8 = false;
        if (this.field4914) {
            this.field4914 = false;
            for (int var9 = this.field4909 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field4899[var9].method1878(arg1, this.field4905);
                var8 |= var10;
                this.field4914 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(I[Lpg;IIII)V", line = 249)
    public class335(int arg0, class287[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4903 = arg1;
        this.field4908 = arg4;
        this.field4911 = arg3;
        this.field4898 = arg0;
        this.field4902 = arg5;
        if (arg1 == null) {
            this.field4899 = null;
            this.field4905 = null;
        } else {
            this.field4899 = new class287[arg1.length];
            this.field4905 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIILha;IIII)V", line = 169)
    public final void method2150(int arg0, int arg1, int arg2, int arg3, int arg4, class544 arg5, int arg6, int arg7, int arg8, int arg9) {
        field4907++;
        int var11 = arg8 + arg9 & 0x3FFF;
        if (this.field4898 == -1 || this.field4901 == 0) {
            arg5.method410(arg2, arg1, arg4, arg6, arg3, 0);
        } else {
            class569 var12 = class99.field1467.method1774(arg0 + 13012, this.field4898);
            if (this.field4912 == null && class99.field1467.method1772(-5919, this.field4898)) {
                int[] var13 = var12.field8072 == 2 ? class99.field1467.method1776(false, 0.7F, this.field4901, (byte) 45, this.field4901, this.field4898) : class99.field1467.method1771(0.7F, this.field4901, this.field4898, this.field4901, (byte) 70, false);
                this.field4912 = arg5.method3185(0, var13, false, this.field4901, this.field4901, this.field4901);
            }
            if (var12.field8072 == 2) {
                arg5.method410(arg2, arg1, arg4, arg6, arg3, 0);
            }
            if (this.field4912 != null) {
                int var14 = var12.field8072 == 2 ? 1 : 0;
                int var15 = arg6 * arg7 / -4096;
                int var16;
                for (var16 = (arg4 - arg6) / 2 + (arg6 * var11 / 4096); var16 > arg6; var16 -= arg6) {
                }
                while (var16 < 0) {
                    var16 += arg6;
                }
                while (var15 > arg6) {
                    var15 -= arg6;
                }
                while (var15 < 0) {
                    var15 += arg6;
                }
                for (int var17 = var16 - arg6; var17 < arg4; var17 += arg6) {
                    for (int var18 = var15 - arg6; var18 < arg6; var18 += arg6) {
                        this.field4912.method191(arg2 + var17, arg1 + var18, arg6, arg6, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field4909 - 1; var19 >= 0; var19--) {
            this.field4899[var19].method1874(arg5, arg2, arg1, arg4, arg6, arg7, var11);
        }
        if (arg0 != -12886) {
            method2148((byte) -115);
        }
    }
}
