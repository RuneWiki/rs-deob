import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class519 {

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
    public int field7249;

    @OriginalMember(owner = "client!vs", name = "w", descriptor = "Z")
    public boolean field7253;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "Z")
    public boolean field7231;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "[S")
    public short[] field7242;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    public int field7241;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    private int field7239;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "Lju;")
    public static class102 field7237 = new class102(56, 15);

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "[I")
    public static int[] field7245 = new int[13];

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "Lmha;")
    public static class701 field7243 = new class701(8, 0, 4, 1);

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    private int field7234;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    private int field7240;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
    private int field7247;

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
    private int field7248;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!vs", name = "x", descriptor = "J")
    public static long field7254;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "Lkb;")
    public class757 field7244;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "[Lcw;")
    public static class21[] field7238;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IBIII)V", line = 16)
    public final void method3080(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        this.field7240 = arg3;
        field7246++;
        int var6 = -40 % ((arg1 + 13) / 39);
        this.field7247 = arg2;
        this.field7234 = arg0;
        this.field7248 = arg4;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZII)V", line = 30)
    public final void method3081(boolean arg0, int arg1, int arg2) {
        field7232++;
        if (arg1 != 28268) {
            this.field7241 = 45;
        }
        int var4;
        if (arg0) {
            var4 = 2048;
        } else {
            int var5 = this.field7248 * arg2 / 50 + this.field7239 & 0x7FF;
            int var6 = this.field7247;
            if (var6 == 1) {
                var4 = (class231.field3217[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class757.field10508[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field7244.method2616(0, (float) ((this.field7234 * var4 >> 11) + this.field7240) / 2048.0F);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "([[BLtp;B)V", line = 109)
    public static final void method3082(byte[][] arg0, class295 arg1, byte arg2) {
        int var3 = -59 % ((60 - arg2) / 55);
        field7233++;
        int var4 = class682.field9590.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = arg0[var5];
            if (var6 != null) {
                int var7 = (class592.field8537[var5] >> 8) * 64 - class179.field2535;
                int var8 = (class592.field8537[var5] & 0xFF) * 64 - class510.field7109;
                class350.method1993(26779);
                arg1.method1726(9186, class464.field6351, class96.field1401, var7, var6, var8);
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lha;IIIIII)V", line = 146)
    private final void method3083(class545 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 < 72) {
            this.field7244 = null;
        }
        field7251++;
        this.field7244 = arg0.method2225(arg2, arg3, arg5, arg4, arg1, 1.0F);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)I", line = 161)
    public static final int method3084(int arg0) {
        if (arg0 == 14007) {
            field7236++;
            return class132.field1784++;
        } else {
            return -114;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V", line = 175)
    public static void method3085(byte arg0) {
        field7243 = null;
        field7238 = null;
        if (arg0 == -28) {
            field7245 = null;
            field7237 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V", line = 190)
    private final void method3086(int arg0) {
        if (arg0 <= 66) {
            this.field7241 = 67;
        }
        int var2 = this.field7241;
        if (var2 == 2) {
            this.field7247 = 1;
            this.field7248 = 2048;
            this.field7234 = 2048;
            this.field7240 = 0;
        } else if (var2 == 3) {
            this.field7248 = 4096;
            this.field7240 = 0;
            this.field7247 = 1;
            this.field7234 = 2048;
        } else if (var2 == 4) {
            this.field7234 = 2048;
            this.field7248 = 2048;
            this.field7247 = 4;
            this.field7240 = 0;
        } else if (var2 == 5) {
            this.field7247 = 4;
            this.field7248 = 8192;
            this.field7240 = 0;
            this.field7234 = 2048;
        } else if (var2 == 12) {
            this.field7247 = 2;
            this.field7234 = 2048;
            this.field7248 = 2048;
            this.field7240 = 0;
        } else if (var2 == 13) {
            this.field7247 = 2;
            this.field7240 = 0;
            this.field7234 = 2048;
            this.field7248 = 8192;
        } else if (var2 == 10) {
            this.field7247 = 3;
            this.field7234 = 512;
            this.field7248 = 2048;
            this.field7240 = 1536;
        } else if (var2 == 11) {
            this.field7240 = 1536;
            this.field7247 = 3;
            this.field7248 = 4096;
            this.field7234 = 512;
        } else if (var2 == 6) {
            this.field7240 = 1280;
            this.field7247 = 3;
            this.field7248 = 2048;
            this.field7234 = 768;
        } else if (var2 == 7) {
            this.field7234 = 768;
            this.field7247 = 3;
            this.field7248 = 4096;
            this.field7240 = 1280;
        } else if (var2 == 8) {
            this.field7234 = 1024;
            this.field7240 = 1024;
            this.field7247 = 3;
            this.field7248 = 2048;
        } else if (var2 == 9) {
            this.field7234 = 1024;
            this.field7247 = 3;
            this.field7240 = 1024;
            this.field7248 = 4096;
        } else if (var2 == 14) {
            this.field7234 = 768;
            this.field7248 = 2048;
            this.field7240 = 1280;
            this.field7247 = 1;
        } else if (var2 == 15) {
            this.field7248 = 4096;
            this.field7247 = 1;
            this.field7240 = 1536;
            this.field7234 = 512;
        } else if (var2 == 16) {
            this.field7240 = 1792;
            this.field7234 = 256;
            this.field7247 = 1;
            this.field7248 = 8192;
        } else {
            this.field7248 = 2048;
            this.field7240 = 0;
            this.field7234 = 2048;
            this.field7247 = 0;
        }
        field7250++;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I[SI)[S", line = 397)
    public static final short[] method3087(int arg0, short[] arg1, int arg2) {
        field7252++;
        short[] var3 = new short[arg2];
        class34.method241(arg1, 0, var3, arg0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V", line = 411)
    protected class519() {
        if (class757.field10508 == null) {
            class321.method1877(2048);
        }
        this.method3086(112);
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lha;Lvj;I)V", line = 422)
    public class519(class545 arg0, class26 arg1, int arg2) {
        if (class757.field10508 == null) {
            class321.method1877(2048);
        }
        this.field7249 = arg1.method194((byte) 119);
        this.field7253 = (this.field7249 & 0x8) != 0;
        this.field7231 = (this.field7249 & 0x10) != 0;
        this.field7249 &= 0x7;
        int var4 = arg1.method193(2) << arg2;
        int var5 = arg1.method193(2) << arg2;
        int var6 = arg1.method193(2) << arg2;
        int var7 = arg1.method194((byte) 119);
        int var8 = var7 * 2 + 1;
        this.field7242 = new short[var8];
        for (int var9 = 0; var9 < this.field7242.length; var9++) {
            short var13 = (short) arg1.method193(2);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            if (var15 > (var8 - var14)) {
                var15 = var8 - var14;
            }
            this.field7242[var9] = (short) class747.method4153(var15, var14 << 8);
        }
        int var10 = (var7 << class509.field7106) + class457.field6297;
        int var11 = class673.field9471 == null ? class278.field3718[class704.method3958((byte) 114, arg1.method193(2)) & 0xFFFF] : class673.field9471[arg1.method193(2)];
        int var12 = arg1.method194((byte) 119);
        this.field7241 = var12 & 0x1F;
        this.field7239 = (var12 & 0xE0) << 3;
        if (this.field7241 != 31) {
            this.method3086(83);
        }
        this.method3083(arg0, var11, var4, var6, var10, var5, 113);
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)V", line = 482)
    public static final void method3088(int arg0) {
        field7235++;
        class721 var1 = null;
        try {
            if (arg0 != 0) {
                field7237 = null;
            }
            class436 var2 = class379.field5339.method3596((byte) 108, "2", true);
            while (var2.field5975 == 0) {
                class740.method4124(1L, 84);
            }
            if (var2.field5975 == 1) {
                var1 = (class721) var2.field5973;
                byte[] var3 = new byte[(int) var1.method4049(118)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method4046(var3, var4, -1, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class108.method730(new class26(var3), -30824);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method4048(1);
            }
        } catch (Exception var6) {
        }
    }
}
