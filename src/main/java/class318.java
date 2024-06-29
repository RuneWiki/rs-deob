import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class318 {

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Z")
    private boolean field4386 = true;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    private int field4393 = -1;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "[Lkv;")
    private class200[] field4381;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    private int field4379;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    private int field4391;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    private int field4383;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    private int field4394;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "[Lkv;")
    private class200[] field4380;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "Lkv;")
    private class200 field4399;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Luv;")
    public static class3 field4388 = new class3(23, 3);

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "Lwg;")
    public static class58 field4398 = new class58(4);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    private int field4395;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    private int field4397;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Lha;")
    private class116 field4384;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBILjc;ILbu;Ldg;I)V")
    public static final void method1980(int arg0, byte arg1, int arg2, class585 arg3, int arg4, class137 arg5, class20 arg6, int arg7) {
        field4392++;
        class72 var8 = new class72();
        var8.field992 = arg4 << 9;
        var8.field980 = arg7 << 9;
        var8.field983 = arg0;
        int var9 = 14 % ((5 - arg1) / 55);
        if (arg5 != null) {
            var8.field978 = arg5;
            int var11 = arg5.field1717;
            int var12 = arg5.field1670;
            if (arg2 == 1 || arg2 == 3) {
                var12 = arg5.field1717;
                var11 = arg5.field1670;
            }
            var8.field988 = arg4 + var12 << 9;
            var8.field975 = arg5.field1681 << 9;
            var8.field1001 = arg7 + var11 << 9;
            var8.field994 = arg5.field1685;
            var8.field998 = arg5.field1703;
            var8.field976 = arg5.field1754;
            var8.field999 = arg5.field1713;
            var8.field982 = arg5.field1684;
            if (arg5.field1719 != null) {
                var8.field987 = true;
                var8.method421(30896);
            }
            if (var8.field982 != null) {
                var8.field979 = (int) (Math.random() * (double) (var8.field998 - var8.field976)) + var8.field976;
            }
            class244.field3084.method3181(var8, true);
            return;
        }
        if (arg3 != null) {
            var8.field986 = arg3;
            class626 var10 = arg3.field8478;
            if (var10.field9085 != null) {
                var8.field987 = true;
                var10 = var10.method3607(false, class257.field3191);
            }
            if (var10 != null) {
                var8.field988 = arg4 + var10.field9094 << 9;
                var8.field1001 = var10.field9094 + arg7 << 9;
                var8.field999 = class375.method2292(118, arg3);
                var8.field975 = var10.field9055 << 9;
                var8.field994 = var10.field9054;
            }
            class453.field6416.method3181(var8, true);
            return;
        }
        if (arg6 == null) {
            return;
        }
        var8.field991 = arg6;
        var8.field1001 = arg6.method104((byte) -92) + arg7 << 9;
        var8.field988 = arg6.method104((byte) -92) + arg4 << 9;
        var8.field999 = class105.method576((byte) 100, arg6);
        var8.field975 = arg6.field265 << 9;
        var8.field994 = arg6.field279;
        class304.field3930.method3475(-121, var8, (long) arg6.field366);
        return;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Z")
    public static final boolean method1981(int arg0, int arg1) {
        field4389++;
        if (arg0 != 15) {
            method1988(-53, -121, 37);
        }
        if (arg1 == 12 || arg1 == 23 || arg1 == 46 || arg1 == 15 || arg1 == 1011) {
            return true;
        } else {
            return arg1 == 22 || arg1 == 1012;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIB)I")
    public static final int method1982(int arg0, int arg1, byte arg2) {
        field4382++;
        int var3 = 1;
        if (arg2 != 28) {
            method1981(-27, 94);
        }
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg1 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)I")
    public static final int method1983(int arg0, int arg1) {
        if (arg1 != -11708) {
            field4388 = null;
        }
        field4396++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public final void method1984(int arg0) {
        field4387++;
        if (this.field4381 != null) {
            for (int var2 = 0; var2 < this.field4381.length; var2++) {
                this.field4381[var2].method1280();
            }
        }
        if (arg0 == 24575) {
            this.field4384 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
    public static void method1985(boolean arg0) {
        field4388 = null;
        field4398 = null;
        if (arg0) {
            method1983(114, -58);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILqa;)Z")
    public final boolean method1986(int arg0, int arg1, class167 arg2) {
        if (this.field4393 != arg1) {
            this.field4393 = arg1;
            int var4 = class103.method565(32085, arg1);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field4397 != var4) {
                this.field4397 = var4;
                this.field4384 = null;
            }
            if (this.field4381 != null) {
                this.field4395 = 0;
                int[] var5 = new int[this.field4381.length];
                for (int var6 = 0; var6 < this.field4381.length; var6++) {
                    class200 var7 = this.field4381[var6];
                    if (var7.method1276(this.field4394, this.field4383, this.field4379, this.field4393)) {
                        var5[this.field4395] = var7.field2616;
                        this.field4380[this.field4395++] = var7;
                    }
                }
                class545.method3015(0, (byte) 81, this.field4395 - 1, var5, this.field4380);
            }
            this.field4386 = true;
        }
        field4385++;
        boolean var8 = false;
        if (this.field4386) {
            this.field4386 = false;
            for (int var9 = this.field4395 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field4380[var9].method1274(arg2, this.field4399);
                this.field4386 |= !var10;
                var8 |= var10;
            }
        }
        if (arg0 != -23607) {
            this.field4386 = false;
        }
        return var8;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILqa;IIIIII)V")
    public final void method1987(int arg0, int arg1, int arg2, class167 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4378++;
        int var11 = arg4 + arg8 & 0x3FFF;
        if (this.field4391 == -1) {
            arg3.method997(arg9, arg5, arg6, arg0, arg7, 0);
        } else {
            class41 var12 = class431.field5871.method2151(true, this.field4391);
            if (this.field4384 == null && class431.field5871.method2144(126, this.field4391)) {
                int[] var13 = var12.field603 ? class431.field5871.method2146(-20243, this.field4397, this.field4391, this.field4397, false, 0.7F) : class431.field5871.method2143(this.field4391, (byte) 15, false, this.field4397, 0.7F, this.field4397);
                this.field4384 = arg3.method976(var13, 0, this.field4397, this.field4397, this.field4397);
            }
            if (var12.field603) {
                arg3.method997(arg9, arg5, arg6, arg0, arg7, 0);
            }
            if (this.field4384 != null) {
                int var14 = var12.field603 ? 1 : 0;
                int var15 = arg0 * arg1 / -4096;
                int var16;
                for (var16 = arg0 * var11 / 4096 + (arg6 - arg0) / 2; var16 > arg0; var16 -= arg0) {
                }
                while (var16 < 0) {
                    var16 += arg0;
                }
                while (arg0 < var15) {
                    var15 -= arg0;
                }
                while (var15 < 0) {
                    var15 += arg0;
                }
                for (int var17 = var16 - arg0; var17 < arg6; var17 += arg0) {
                    for (int var18 = var15 - arg0; var18 < arg0; var18 += arg0) {
                        this.field4384.method625(arg9 + var17, arg5 + var18, arg0, arg0, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field4395 + arg2; var19 >= 0; var19--) {
            this.field4380[var19].method1283(arg3, arg9, arg5, arg6, arg0, arg1, var11);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Z")
    public static final boolean method1988(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field4388 = null;
        }
        field4390++;
        return (arg2 & 0x70000) != 0 | class629.method3642(arg2, -857, arg0) || class611.method3495(arg0, arg2, 4090);
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I[Lkv;IIII)V")
    public class318(int arg0, class200[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4381 = arg1;
        this.field4379 = arg5;
        this.field4391 = arg0;
        this.field4383 = arg4;
        this.field4394 = arg3;
        if (arg1 == null) {
            this.field4380 = null;
            this.field4399 = null;
        } else {
            this.field4380 = new class200[arg1.length];
            this.field4399 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
