import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class141 {

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public int field2273 = 128;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "Z")
    public boolean field2285 = true;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    private int field2291 = 0;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public int field2290 = -1;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "Z")
    public static boolean field2275 = false;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2283 = null;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public int field2284;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public int field2286;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public int field2287;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public int field2289;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "Lbk;")
    public static class69 field2280;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "[[[B")
    public static byte[][][] field2282;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V", line = 10)
    public static void method1080(byte arg0) {
        if (arg0 != 108) {
            method1085(67);
        }
        field2280 = null;
        field2282 = (byte[][][]) null;
        field2283 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Laj;IZI)V", line = 22)
    private final void method1081(class1 arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            return;
        }
        if (arg3 == 1) {
            this.field2291 = arg0.method4(true);
            this.method1088(this.field2291, (byte) -121);
        } else if (arg3 == 2) {
            this.field2290 = arg0.method56(19612);
            if (this.field2290 == 65535) {
                this.field2290 = -1;
            }
        } else if (arg3 == 3) {
            this.field2273 = arg0.method56(19612);
        } else if (arg3 == 4) {
            this.field2285 = false;
        }
        field2276++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 60)
    public static final void method1082(int arg0) {
        field2274++;
        int var1 = 0;
        if (arg0 != -14735) {
            field2281 = 125;
        }
        while (var1 < 100) {
            class280.field4378[var1] = true;
            var1++;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIB)V", line = 82)
    public static final void method1083(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -72) {
            field2282 = (byte[][][]) ((byte[][][]) null);
        }
        if (arg2 > arg0) {
            for (int var5 = arg0; var5 < arg2; var5++) {
                class221.field3443[var5][arg3] = arg1;
            }
        } else {
            for (int var6 = arg2; var6 < arg0; var6++) {
                class221.field3443[var6][arg3] = arg1;
            }
        }
        field2288++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)V", line = 121)
    public static final void method1084(byte arg0, int arg1) {
        field2272++;
        class170 var2 = class221.method1613(11, arg1, -8410);
        var2.method1267(-67);
        if (arg0 != -120) {
            method1083(79, -26, 87, 2, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 143)
    public static final void method1085(int arg0) {
        field2279++;
        class16.field331.method2282((byte) -125);
        if (arg0 != 16739175) {
            field2275 = true;
        }
        class274.field4290.method2282((byte) -127);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BZ)V", line = 160)
    public static final void method1086(byte arg0, boolean arg1) {
        if (arg0 <= 35) {
            method1084((byte) -59, -7);
        }
        field2292++;
        int var2 = class14.field307.length;
        byte[][] var3;
        if (class162.field2623 && arg1) {
            var3 = class338.field5222;
        } else {
            var3 = class115.field1862;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class338.field5218[var4] & 0xFF) * 64 - class133.field2118;
                int var7 = (class338.field5218[var4] >> 8) * 64 - class117.field1902;
                class178.method1310(16);
                class41.method375(arg1, var6, var7, class166.field2686, 20, var5);
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Laj;II)V", line = 199)
    public final void method1087(class1 arg0, int arg1, int arg2) {
        if (arg1 != 255) {
            this.field2290 = 123;
        }
        field2278++;
        while (true) {
            int var4 = arg0.method15((byte) 103);
            if (var4 == 0) {
                return;
            }
            this.method1081(arg0, arg2, false, var4);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)V", line = 220)
    private final void method1088(int arg0, byte arg1) {
        double var3 = (double) ((arg0 & 0xFF6B67) >> 16) / 256.0D;
        field2293++;
        double var5 = (double) ((arg0 & 0xFF50) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        if (var5 < var3) {
            var9 = var5;
        }
        if (arg1 != -121) {
            method1086((byte) -58, true);
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var13 = (var9 + var11) / 2.0D;
        double var15 = 0.0D;
        this.field2289 = (int) (var13 * 256.0D);
        double var17 = 0.0D;
        if (var9 != var11) {
            if (var3 == var11) {
                var15 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var15 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var15 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var13 < 0.5D) {
                var17 = (var11 - var9) / (var9 + var11);
            }
            if (var13 >= 0.5D) {
                var17 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        if ((var13 > 0.5D)) {
            this.field2287 = (int) ((1.0D - var13) * var17 * 512.0D);
        } else {
            this.field2287 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field2289 < 0) {
            this.field2289 = 0;
        } else if (this.field2289 > 255) {
            this.field2289 = 255;
        }
        if (this.field2287 < 1) {
            this.field2287 = 1;
        }
        double var19 = var15 / 6.0D;
        this.field2284 = (int) ((double) this.field2287 * var19);
        this.field2286 = (int) (var17 * 256.0D);
        if (this.field2286 < 0) {
            this.field2286 = 0;
        } else if (this.field2286 > 255) {
            this.field2286 = 255;
        }
    }
}
