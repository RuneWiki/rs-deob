import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class225 {

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public int field3170;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "Z")
    public boolean field3186;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "Z")
    public boolean field3187;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "[S")
    public short[] field3169;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public int field3167;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    private int field3180;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "[I")
    public static int[] field3166 = new int[32];

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3174 = "";

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "[Lwo;")
    public static class696[] field3178;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    private int field3177;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    private int field3181;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    private int field3183;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    private int field3185;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "Lbi;")
    public static class449 field3176;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "Lpv;")
    public class65 field3173;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "Lkca;")
    public static class76 field3188;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3166[var1] = var0 - 1;
            var0 += var0;
        }
        field3178 = new class696[14];
        field3182 = 0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 10)
    public static void method1412(int arg0) {
        field3174 = null;
        field3178 = null;
        field3176 = null;
        field3188 = null;
        int var1 = -39 / ((arg0 + 64) / 47);
        field3166 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIII)V", line = 30)
    public final void method1413(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3177 = arg0;
        this.field3183 = arg2;
        if (arg1 == -3170) {
            this.field3181 = arg4;
            this.field3185 = arg3;
            field3172++;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Loa;IIIIII)V", line = 44)
    private final void method1414(class651 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3184++;
        this.field3173 = arg0.method427(arg2, arg5, arg6, arg4, arg1, (float) arg3);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 52)
    private final void method1415(byte arg0) {
        field3171++;
        int var2 = this.field3167;
        if (var2 == 2) {
            this.field3185 = 0;
            this.field3183 = 1;
            this.field3177 = 2048;
            this.field3181 = 2048;
        } else if (var2 == 3) {
            this.field3177 = 4096;
            this.field3185 = 0;
            this.field3183 = 1;
            this.field3181 = 2048;
        } else if (var2 == 4) {
            this.field3181 = 2048;
            this.field3183 = 4;
            this.field3185 = 0;
            this.field3177 = 2048;
        } else if (var2 == 5) {
            this.field3181 = 2048;
            this.field3183 = 4;
            this.field3177 = 8192;
            this.field3185 = 0;
        } else if (var2 == 12) {
            this.field3183 = 2;
            this.field3185 = 0;
            this.field3181 = 2048;
            this.field3177 = 2048;
        } else if (var2 == 13) {
            this.field3177 = 8192;
            this.field3181 = 2048;
            this.field3185 = 0;
            this.field3183 = 2;
        } else if (var2 == 10) {
            this.field3177 = 2048;
            this.field3185 = 1536;
            this.field3181 = 512;
            this.field3183 = 3;
        } else if (var2 == 11) {
            this.field3181 = 512;
            this.field3177 = 4096;
            this.field3183 = 3;
            this.field3185 = 1536;
        } else if (var2 == 6) {
            this.field3177 = 2048;
            this.field3185 = 1280;
            this.field3183 = 3;
            this.field3181 = 768;
        } else if (var2 == 7) {
            this.field3181 = 768;
            this.field3183 = 3;
            this.field3185 = 1280;
            this.field3177 = 4096;
        } else if (var2 == 8) {
            this.field3177 = 2048;
            this.field3181 = 1024;
            this.field3185 = 1024;
            this.field3183 = 3;
        } else if (var2 == 9) {
            this.field3183 = 3;
            this.field3181 = 1024;
            this.field3177 = 4096;
            this.field3185 = 1024;
        } else if (var2 == 14) {
            this.field3181 = 768;
            this.field3183 = 1;
            this.field3185 = 1280;
            this.field3177 = 2048;
        } else if (var2 == 15) {
            this.field3183 = 1;
            this.field3185 = 1536;
            this.field3177 = 4096;
            this.field3181 = 512;
        } else if (var2 == 16) {
            this.field3183 = 1;
            this.field3185 = 1792;
            this.field3177 = 8192;
            this.field3181 = 256;
        } else {
            this.field3185 = 0;
            this.field3177 = 2048;
            this.field3183 = 0;
            this.field3181 = 2048;
        }
        if (arg0 != 80) {
            this.method1417(-28, false, -72);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)Lfda;", line = 252)
    public static final class296 method1416(int arg0) {
        field3175++;
        try {
            int var1 = -101 % ((arg0 - 35) / 46);
            return new class196();
        } catch (Throwable var3) {
            try {
                return (class296) Class.forName("og").getDeclaredConstructor().newInstance();
            } catch (Throwable var2) {
                return new class203();
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZI)V", line = 309)
    public final void method1417(int arg0, boolean arg1, int arg2) {
        if (arg2 != -979402837) {
            this.method1415((byte) -45);
        }
        field3179++;
        int var6;
        if (arg1) {
            var6 = 2048;
        } else {
            int var4 = this.field3177 * arg0 / 50 + this.field3180 & 0x7FF;
            int var5 = this.field3183;
            if (var5 == 1) {
                var6 = (class126.field2116[var4 << 3] >> 4) + 1024;
            } else if (var5 == 3) {
                var6 = class116.field1986[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        this.field3173.method525((float) (this.field3185 + (this.field3181 * var6 >> 11)) / 2048.0F, (byte) -10);
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V", line = 391)
    protected class225() {
        if (class116.field1986 == null) {
            class548.method3044(125);
        }
        this.method1415((byte) 80);
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Loa;Leh;I)V", line = 401)
    public class225(class651 arg0, class335 arg1, int arg2) {
        if (class116.field1986 == null) {
            class548.method3044(122);
        }
        this.field3170 = arg1.method2034(255);
        this.field3186 = (this.field3170 & 0x10) != 0;
        this.field3187 = (this.field3170 & 0x8) != 0;
        this.field3170 &= 0x7;
        int var4 = arg1.method2001((byte) -83) << arg2;
        int var5 = arg1.method2001((byte) -83) << arg2;
        int var6 = arg1.method2001((byte) -83) << arg2;
        int var7 = arg1.method2034(255);
        int var8 = var7 * 2 + 1;
        this.field3169 = new short[var8];
        for (int var9 = 0; var9 < this.field3169.length; var9++) {
            short var13 = (short) arg1.method2001((byte) -83);
            int var14 = var13 >>> 8;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var15 > var8 - var14) {
                var15 = var8 - var14;
            }
            this.field3169[var9] = (short) class220.method1393(var15, var14 << 8);
        }
        int var10 = (var7 << class348.field4782) + class16.field256;
        int var11 = class444.field6084 == null ? class446.field6101[class120.method937(arg1.method2001((byte) -83), 26708) & 0xFFFF] : class444.field6084[arg1.method2001((byte) -83)];
        int var12 = arg1.method2034(255);
        this.field3167 = var12 & 0x1F;
        this.field3180 = var12 & 0xE0 << 3;
        if (this.field3167 != 31) {
            this.method1415((byte) 80);
        }
        this.method1414(arg0, var11, var4, 1, var10, var6, var5);
    }
}
