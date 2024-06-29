import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class191 {

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Z")
    public boolean field2405 = false;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public int field2408 = 1190717;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public int field2409 = 8;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public int field2404 = -1;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public int field2413 = -1;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Z")
    public boolean field2411 = true;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Z")
    public boolean field2415 = true;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public int field2412 = -1;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public int field2414 = 16;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public int field2417 = 0;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public int field2419 = 128;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "S")
    public static short field2410 = 1;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "J")
    public static long field2403 = 0L;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "[I")
    public static int[] field2418 = new int[13];

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Lvm;")
    public static class322 field2407;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lok;")
    public static class60 field2402;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 9)
    public static void method1022(int arg0) {
        field2418 = null;
        field2402 = null;
        if (arg0 == -8) {
            field2407 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V", line = 21)
    public final void method1023(boolean arg0, int arg1) {
        if (!arg0) {
            this.field2417 = 37;
        }
        field2416++;
        this.field2409 = this.field2409 << 8 | arg1;
        if (this.field2404 == -1) {
            this.field2404 = this.field2412;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILtq;I)V", line = 46)
    public final void method1024(int arg0, class250 arg1, int arg2) {
        int var4 = -40 / ((arg2 - 17) / 56);
        while (true) {
            int var5 = arg1.method1350(31351);
            if (var5 == 0) {
                field2401++;
                return;
            }
            this.method1027(arg0, var5, -64, arg1);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lt;IIIII)V", line = 65)
    public static final void method1025(class319 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2399++;
        if (arg0.field4256 == -1 && arg0.field4260 == null) {
            return;
        }
        int var6 = 0;
        if (arg0.field4245 < arg3) {
            var6 += arg3 - arg0.field4245;
        } else if (arg0.field4261 > arg3) {
            var6 += arg0.field4261 - arg3;
        }
        int var7 = class295.field4002 * arg0.field4244 >> 8;
        if (arg4 > arg0.field4252) {
            var6 += arg4 - arg0.field4252;
        } else if (arg0.field4249 > arg4) {
            var6 += arg0.field4249 - arg4;
        }
        if (arg0.field4254 == 0 || arg0.field4254 < (var6 - 64) || class295.field4002 == 0 || arg0.field4242 != arg2) {
            if (arg0.field4246 != null) {
                class374.field5265.method2213(arg0.field4246);
                arg0.field4246 = null;
            }
            if (arg0.field4265 != null) {
                class374.field5265.method2213(arg0.field4265);
                arg0.field4265 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg0.field4254 - var6) * var7 / arg0.field4254;
        if (arg0.field4246 != null) {
            arg0.field4246.method1959(var8);
        } else if (arg0.field4256 >= 0) {
            class93 var9 = class93.method511(class321.field4297, arg0.field4256, 0);
            if (var9 != null) {
                class52 var10 = var9.method509().method250(class53.field541);
                class336 var11 = class336.method1938(var10, 100, var8);
                var11.method1943(-1);
                class374.field5265.method2210(var11);
                arg0.field4246 = var11;
            }
        }
        if (arg5 != -10072) {
            field2410 = 63;
        }
        if (arg0.field4265 != null) {
            arg0.field4265.method1959(var8);
            if (!arg0.field4265.method1970(-2)) {
                arg0.field4265 = null;
            }
        } else if (arg0.field4260 != null && (arg0.field4250 -= arg1) <= 0) {
            int var12 = (int) ((double) arg0.field4260.length * Math.random());
            class93 var13 = class93.method511(class321.field4297, arg0.field4260[var12], 0);
            if (var13 != null) {
                class52 var14 = var13.method509().method250(class53.field541);
                class336 var15 = class336.method1938(var14, 100, var8);
                var15.method1943(0);
                class374.field5265.method2210(var15);
                arg0.field4265 = var15;
                arg0.field4250 = (int) (Math.random() * (double) (arg0.field4255 - arg0.field4248)) + arg0.field4248;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lam;ILam;)I", line = 214)
    public static final int method1026(class286 arg0, int arg1, class286 arg2) {
        field2406++;
        int var3 = 0;
        if (arg1 != -2) {
            return 109;
        }
        if (arg2.method1673(-29, class229.field3155)) {
            var3++;
        }
        if (arg2.method1673(-120, class333.field4428)) {
            var3++;
        }
        if (arg2.method1673(18, class222.field2978)) {
            var3++;
        }
        if (arg0.method1673(-109, class229.field3155)) {
            var3++;
        }
        if (arg0.method1673(arg1 + 58, class333.field4428)) {
            var3++;
        }
        if (arg0.method1673(-18, class222.field2978)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIILtq;)V", line = 269)
    private final void method1027(int arg0, int arg1, int arg2, class250 arg3) {
        if (arg2 != -64) {
            return;
        }
        field2400++;
        if (arg1 == 1) {
            this.field2417 = class228.method1244(arg3.method1372(-2), (byte) 90);
        } else if (arg1 == 2) {
            this.field2412 = arg3.method1350(31351);
        } else if (arg1 == 3) {
            this.field2412 = arg3.method1374(-2);
            if (this.field2412 == 65535) {
                this.field2412 = -1;
                return;
            }
        } else if (arg1 == 5) {
            this.field2415 = false;
        } else if (arg1 == 7) {
            this.field2413 = class228.method1244(arg3.method1372(-2), (byte) -96);
            return;
        } else if (arg1 == 8) {
            class36.field348 = arg0;
            return;
        } else if (arg1 == 9) {
            this.field2419 = arg3.method1374(arg2 + 62);
            return;
        } else if (arg1 == 10) {
            this.field2411 = false;
            return;
        } else if (arg1 == 11) {
            this.field2409 = arg3.method1350(31351);
            return;
        } else if (arg1 == 12) {
            this.field2405 = true;
            return;
        } else if (arg1 == 13) {
            this.field2408 = arg3.method1372(-2);
            return;
        } else {
            if (arg1 == 14) {
                this.field2414 = arg3.method1350(arg2 + 31415);
            } else if (arg1 == 15) {
                this.field2404 = arg3.method1374(arg2 + 62);
                if (this.field2404 == 65535) {
                    this.field2404 = -1;
                    return;
                }
            }
            return;
        }
    }
}
