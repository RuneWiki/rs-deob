import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class177 {

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "I")
    public int field2343;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "Z")
    public boolean field2332;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "Z")
    public boolean field2340;

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "[S")
    public short[] field2345;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    private int field2330;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
    public int field2335;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "Z")
    public static boolean field2329 = false;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field2331 = 0;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "Lhd;")
    public static class523 field2338 = null;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    private int field2328;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    private int field2336;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
    private int field2339;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
    private int field2342;

    @OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!kv", name = "t", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "Lku;")
    public class256 field2337;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "Lbe;")
    public static class29 field2334;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V", line = 14)
    public static void method1132(byte arg0) {
        field2334 = null;
        if (arg0 <= -79) {
            field2338 = null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZI)V", line = 36)
    public final void method1133(int arg0, boolean arg1, int arg2) {
        if (arg2 >= -43) {
            return;
        }
        field2333++;
        int var4;
        if (arg1) {
            var4 = 2048;
        } else {
            int var5 = this.field2342 * arg0 / 50 + this.field2330 & 0x7FF;
            int var6 = this.field2336;
            if (var6 == 1) {
                var4 = (class36.field443[var5 << 3] >> 5) + 1024;
            } else if (var6 == 3) {
                var4 = class525.field7763[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 >= 1024 ? 2048 - var5 : var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field2337.method1541((float) (this.field2339 + (this.field2328 * var4 >> 11)) / 2048.0F, -106);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIII)V", line = 112)
    public final void method1134(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2336 = arg2;
        field2347++;
        this.field2328 = arg0;
        this.field2339 = arg1;
        if (arg4 != 256) {
            this.field2340 = true;
        }
        this.field2342 = arg3;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V", line = 129)
    private final void method1135(boolean arg0) {
        int var2 = this.field2335;
        if (var2 == 2) {
            this.field2336 = 1;
            this.field2342 = 2048;
            this.field2339 = 0;
            this.field2328 = 2048;
        } else if (var2 == 3) {
            this.field2328 = 2048;
            this.field2342 = 4096;
            this.field2336 = 1;
            this.field2339 = 0;
        } else if (var2 == 4) {
            this.field2328 = 2048;
            this.field2342 = 2048;
            this.field2336 = 4;
            this.field2339 = 0;
        } else if (var2 == 5) {
            this.field2342 = 8192;
            this.field2339 = 0;
            this.field2336 = 4;
            this.field2328 = 2048;
        } else if (var2 == 12) {
            this.field2328 = 2048;
            this.field2336 = 2;
            this.field2339 = 0;
            this.field2342 = 2048;
        } else if (var2 == 13) {
            this.field2342 = 8192;
            this.field2339 = 0;
            this.field2336 = 2;
            this.field2328 = 2048;
        } else if (var2 == 10) {
            this.field2342 = 2048;
            this.field2339 = 1536;
            this.field2328 = 512;
            this.field2336 = 3;
        } else if (var2 == 11) {
            this.field2342 = 4096;
            this.field2339 = 1536;
            this.field2336 = 3;
            this.field2328 = 512;
        } else if (var2 == 6) {
            this.field2328 = 768;
            this.field2336 = 3;
            this.field2342 = 2048;
            this.field2339 = 1280;
        } else if (var2 == 7) {
            this.field2328 = 768;
            this.field2339 = 1280;
            this.field2336 = 3;
            this.field2342 = 4096;
        } else if (var2 == 8) {
            this.field2339 = 1024;
            this.field2336 = 3;
            this.field2342 = 2048;
            this.field2328 = 1024;
        } else if (var2 == 9) {
            this.field2339 = 1024;
            this.field2328 = 1024;
            this.field2342 = 4096;
            this.field2336 = 3;
        } else if (var2 == 14) {
            this.field2328 = 768;
            this.field2336 = 1;
            this.field2342 = 2048;
            this.field2339 = 1280;
        } else if (var2 == 15) {
            this.field2339 = 1536;
            this.field2328 = 512;
            this.field2342 = 4096;
            this.field2336 = 1;
        } else if (var2 == 16) {
            this.field2336 = 1;
            this.field2339 = 1792;
            this.field2342 = 8192;
            this.field2328 = 256;
        } else {
            this.field2328 = 2048;
            this.field2339 = 0;
            this.field2336 = 0;
            this.field2342 = 2048;
        }
        field2341++;
        if (arg0) {
            this.method1134(-102, -69, 98, -54, -97);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIBILya;I)V", line = 332)
    private final void method1136(int arg0, int arg1, int arg2, byte arg3, int arg4, class38 arg5, int arg6) {
        if (arg3 == 29) {
            this.field2337 = arg5.method295(arg6, arg0, arg4, arg1, arg2, 1.0F);
            field2344++;
        }
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "()V", line = 348)
    protected class177() {
        if (class525.field7763 == null) {
            class98.method738(-24837);
        }
        this.method1135(false);
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lya;Lfh;I)V", line = 359)
    public class177(class38 arg0, class463 arg1, int arg2) {
        if (class525.field7763 == null) {
            class98.method738(-24837);
        }
        this.field2343 = arg1.method2737(false);
        this.field2332 = (this.field2343 & 0x8) != 0;
        this.field2340 = (this.field2343 & 0x10) != 0;
        this.field2343 &= 0x7;
        int var4 = arg1.method2758((byte) 76) << arg2;
        int var5 = arg1.method2758((byte) 83) << arg2;
        int var6 = arg1.method2758((byte) 94) << arg2;
        int var7 = arg1.method2737(false);
        int var8 = var7 * 2 + 1;
        this.field2345 = new short[var8];
        for (int var9 = 0; var9 < this.field2345.length; var9++) {
            short var13 = (short) arg1.method2758((byte) 89);
            int var14 = var13 >>> 8;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var15 > var8 - var14) {
                var15 = var8 - var14;
            }
            this.field2345[var9] = (short) class215.method1323(var15, var14 << 8);
        }
        int var10 = (var7 << class94.field1144) + class59.field772;
        int var11 = class441.field6318 == null ? class527.field7777[class261.method1564(arg1.method2758((byte) 123), 98) & 0xFFFF] : class441.field6318[arg1.method2758((byte) 91)];
        int var12 = arg1.method2737(false);
        this.field2330 = var12 & 0xE0 << 3;
        this.field2335 = var12 & 0x1F;
        if (this.field2335 != 31) {
            this.method1135(false);
        }
        this.method1136(var6, var10, var11, (byte) 29, var5, arg0, var4);
    }
}
