import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class219 {

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lvi;")
    private class560 field2836 = new class560(64);

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "Lvi;")
    public class560 field2848 = new class560(50);

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "Lgl;")
    public class520 field2850 = new class520(250);

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "Lfc;")
    private class103 field2851 = new class103();

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "Ltn;")
    private class197 field2853;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public int field2847;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Z")
    private boolean field2845;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Lpq;")
    public class159 field2840;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lpq;")
    private class159 field2831;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public int field2832;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field2852;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field2854;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    public int field2855;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILoa;IIIILph;)Lxa;", line = 4)
    public final class424 method1346(int arg0, int arg1, class689 arg2, int arg3, int arg4, int arg5, int arg6, class351 arg7) {
        this.field2851.field1261 = arg7 != null;
        this.field2851.field1258 = arg1;
        int var9 = -94 / ((25 - arg5) / 39);
        this.field2851.field1262 = arg0;
        this.field2851.field1253 = arg4;
        this.field2851.field1259 = arg6;
        this.field2851.field1257 = arg2.field9733;
        field2849++;
        this.field2851.field1251 = arg3;
        return (class424) this.field2850.method2971(100, this.field2851);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)V", line = 26)
    public final void method1347(byte arg0, int arg1) {
        field2838++;
        this.field2855 = arg1;
        class560 var3 = this.field2848;
        synchronized (this.field2848) {
            if (arg0 >= -15) {
                this.method1352((byte) 78);
            }
            this.field2848.method3142(false);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZB)V", line = 40)
    public final void method1348(boolean arg0, byte arg1) {
        field2839++;
        if (this.field2845 != arg0) {
            this.field2845 = arg0;
            if (arg1 > 59) {
                this.method1352((byte) -77);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Lfs;", line = 57)
    public final class660 method1349(int arg0, int arg1) {
        field2837++;
        class560 var3 = this.field2836;
        class660 var4;
        synchronized (this.field2836) {
            var4 = (class660) this.field2836.method3134((long) arg1, -124);
        }
        if (var4 != null) {
            return var4;
        }
        class159 var5 = this.field2831;
        byte[] var6;
        synchronized (this.field2831) {
            var6 = this.field2831.method1087(class33.method200(arg1, 0), class546.method3073(255, arg1), 1);
        }
        class660 var7 = new class660();
        var7.field9372 = this;
        var7.field9339 = arg1;
        var7.field9360 = new String[] { null, null, class243.field3171.method1491(this.field2847, (byte) 126), null, null };
        var7.field9350 = new String[] { null, null, null, null, class243.field3172.method1491(this.field2847, (byte) 126) };
        if (var6 != null) {
            var7.method3663(true, new class138(var6));
        }
        var7.method3665(108);
        if (var7.field9375 != arg0) {
            var7.method3651(-78, this.method1349(-1, var7.field9375), this.method1349(-1, var7.field9349));
        }
        if (var7.field9306 != -1) {
            var7.method3667(this.method1349(arg0, var7.field9304), this.method1349(-1, var7.field9306), (byte) 126);
        }
        if (!this.field2845 && var7.field9377) {
            var7.field9309 = class243.field3169.method1491(this.field2847, (byte) 125);
            var7.field9316 = null;
            var7.field9338 = false;
            var7.field9350 = this.field2854;
            var7.field9360 = this.field2852;
            var7.field9337 = 0;
            if (var7.field9347 != null) {
                boolean var8 = false;
                for (class28 var9 = var7.field9347.method2499(-15); var9 != null; var9 = var7.field9347.method2503(0)) {
                    class579 var10 = this.field2853.method1256((int) var9.field272, -3934);
                    if (var10.field7994) {
                        var9.method175(30604);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field9347 = null;
                }
            }
        }
        class560 var11 = this.field2836;
        synchronized (this.field2836) {
            this.field2836.method3130((long) arg1, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V", line = 135)
    public final void method1350(int arg0, int arg1) {
        class560 var3 = this.field2836;
        synchronized (this.field2836) {
            if (arg0 != 256) {
                return;
            }
            this.field2836.method3129(arg1, 14583);
        }
        field2841++;
        class560 var4 = this.field2848;
        synchronized (this.field2848) {
            this.field2848.method3129(arg1, arg0 ^ 0x39F7);
        }
        class520 var5 = this.field2850;
        synchronized (this.field2850) {
            this.field2850.method2975(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 155)
    public final void method1351(int arg0) {
        class520 var2 = this.field2850;
        synchronized (this.field2850) {
            if (arg0 != 0) {
                this.method1349(13, 17);
            }
            this.field2850.method2970(-1);
        }
        field2844++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 168)
    public final void method1352(byte arg0) {
        class560 var2 = this.field2836;
        synchronized (this.field2836) {
            if (arg0 > -64) {
                this.field2840 = null;
            }
            this.field2836.method3142(false);
        }
        field2835++;
        class560 var3 = this.field2848;
        synchronized (this.field2848) {
            this.field2848.method3142(false);
        }
        class520 var4 = this.field2850;
        synchronized (this.field2850) {
            this.field2850.method2970(-1);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([Ljava/lang/Object;[IIII)V", line = 188)
    public static final void method1353(Object[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field2834++;
        int var5 = -10 / ((arg2 - 12) / 61);
        if (arg4 >= arg3) {
            return;
        }
        int var6 = (arg3 + arg4) / 2;
        int var7 = arg4;
        int var8 = arg1[var6];
        arg1[var6] = arg1[arg3];
        arg1[arg3] = var8;
        Object var9 = arg0[var6];
        arg0[var6] = arg0[arg3];
        arg0[arg3] = var9;
        int var10 = var8 == Integer.MAX_VALUE ? 0 : 1;
        for (int var11 = arg4; var11 < arg3; var11++) {
            if (arg1[var11] < (var11 & var10) + var8) {
                int var12 = arg1[var11];
                arg1[var11] = arg1[var7];
                arg1[var7] = var12;
                Object var13 = arg0[var11];
                arg0[var11] = arg0[var7];
                arg0[var7++] = var13;
            }
        }
        arg1[arg3] = arg1[var7];
        arg1[var7] = var8;
        arg0[arg3] = arg0[var7];
        arg0[var7] = var9;
        method1353(arg0, arg1, -118, var7 - 1, arg4);
        method1353(arg0, arg1, -56, arg3, var7 + 1);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V", line = 244)
    public final void method1354(byte arg0) {
        class560 var2 = this.field2836;
        synchronized (this.field2836) {
            this.field2836.method3144(true);
        }
        field2843++;
        class560 var3 = this.field2848;
        synchronized (this.field2848) {
            if (arg0 != -42) {
                return;
            }
            this.field2848.method3144(true);
        }
        class520 var4 = this.field2850;
        synchronized (this.field2850) {
            this.field2850.method2973(true);
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Luea;IZLtn;Lpq;Lpq;)V", line = 368)
    public class219(class484 arg0, int arg1, boolean arg2, class197 arg3, class159 arg4, class159 arg5) {
        this.field2853 = arg3;
        this.field2847 = arg1;
        this.field2845 = arg2;
        this.field2840 = arg5;
        this.field2831 = arg4;
        if (this.field2831 == null) {
            this.field2832 = 0;
        } else {
            int var7 = this.field2831.method1074((byte) 89) - 1;
            this.field2832 = this.field2831.method1076(var7, 0) + var7 * 256;
        }
        this.field2852 = new String[] { null, null, class243.field3171.method1491(this.field2847, (byte) 125), null, null };
        this.field2854 = new String[] { null, null, null, null, class243.field3172.method1491(this.field2847, (byte) 125) };
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V", line = 273)
    public final void method1355(byte arg0) {
        if (arg0 != -12) {
            return;
        }
        class560 var2 = this.field2848;
        synchronized (this.field2848) {
            this.field2848.method3142(false);
        }
        field2833++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lta;Lph;Loa;Loa;IZIZZIII)Lxa;", line = 291)
    public final class424 method1356(class301 arg0, class351 arg1, class689 arg2, class689 arg3, int arg4, boolean arg5, int arg6, boolean arg7, boolean arg8, int arg9, int arg10, int arg11) {
        field2842++;
        class424 var13 = this.method1346(arg4, arg10, arg2, arg6, arg9, -18, arg11, arg1);
        if (arg7) {
            this.field2851 = null;
        }
        if (var13 != null) {
            return var13;
        }
        class660 var14 = this.method1349(-1, arg4);
        if (arg10 > 1 && var14.field9335 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field9320[var16] <= arg10 && var14.field9320[var16] != 0) {
                    var15 = var14.field9335[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method1349(-1, var15);
            }
        }
        int[] var17 = var14.method3670(arg2, arg1, arg8, arg9, arg11, arg0, arg6, arg10, 20269, arg3);
        if (var17 == null) {
            return null;
        }
        class424 var18;
        if (arg5) {
            var18 = arg3.method1894(var17, 0, 36, 36, 32);
        } else {
            var18 = arg2.method1894(var17, 0, 36, 36, 32);
        }
        if (!arg5) {
            class103 var19 = new class103();
            var19.field1259 = arg11;
            var19.field1257 = arg2.field9733;
            var19.field1251 = arg6;
            var19.field1253 = arg9;
            var19.field1262 = arg4;
            var19.field1261 = arg1 != null;
            var19.field1258 = arg10;
            this.field2850.method2972(var18, -17079, var19);
        }
        return var18;
    }
}
