import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class216 {

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "[I")
    private int[] field3288;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "[I")
    private int[] field3283;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3299 = new String[] { method1891(method1890("RLI_&")), method1891(method1890("G\u0017\u000b\u001d")), method1891(method1890("Z\u0003IM2G\u000b\u0013Os")), method1891(method1890("Z\u0003I7s")), method1891(method1890("Z\u0003I0s")), method1891(method1890("Z\u0003I4s")), method1891(method1890("Z\u0003I2s")), method1891(method1890("Z\u0003I6s")), method1891(method1890("Z\u0003I5s")), method1891(method1890("Z\u0003I3s")) };

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Z")
    public static boolean field3282 = false;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Lwia;")
    public static class790 field3293 = new class790(13, 8);

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Z")
    public static boolean field3297 = false;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "[Lib;")
    public static class163[] field3295 = new class163[2048];

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Lel;")
    public static class573 field3298 = new class573(5, 4);

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    private int field3284;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    private int field3289;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    private int field3290;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    private int field3294;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "Liga;")
    public static class481 field3287;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILffa;[IIZI)Lgda;", line = 4)
    public static final class61 method1883(int arg0, int arg1, int arg2, class197 arg3, int[] arg4, int arg5, boolean arg6, int arg7) {
        try {
            field3285++;
            if (arg2 != 9901) {
                field3295 = null;
            }
            if (arg3.field2956 || class40.method269(arg5, 88) && class40.method269(arg1, 87)) {
                return new class61(arg3, 3553, arg5, arg1, arg6, arg4, arg0, arg7);
            } else if (arg3.field2964) {
                return new class61(arg3, 34037, arg5, arg1, arg6, arg4, arg0, arg7);
            } else {
                return new class61(arg3, arg5, arg1, class12.method83((byte) -1, arg5), class12.method83((byte) -1, arg1), arg4);
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field3299[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field3299[1] : field3299[0]) + ',' + (arg4 == null ? field3299[1] : field3299[0]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)I", line = 31)
    public final int method1884(int arg0) {
        try {
            if (this.field3284 == 0) {
                this.method1885((byte) -14);
                this.field3284 = 256;
            }
            if (arg0 != 1178) {
                method1883(-108, 107, -84, null, null, -29, true, 108);
            }
            field3280++;
            return this.field3288[this.field3284 - 1];
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3299[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 52)
    private final void method1885(byte arg0) {
        try {
            field3286++;
            if (arg0 != -14) {
                this.method1886(108);
            }
            this.field3290 += ++this.field3294;
            for (int var2 = 0; var2 < 256; var2++) {
                int var3 = this.field3283[var2];
                if ((var2 & 0x2) == 0) {
                    if ((var2 & 0x1) == 0) {
                        this.field3289 ^= this.field3289 << 13;
                    } else {
                        this.field3289 ^= this.field3289 >>> 6;
                    }
                } else if ((var2 & 0x1) == 0) {
                    this.field3289 ^= this.field3289 << 2;
                } else {
                    this.field3289 ^= this.field3289 >>> 16;
                }
                this.field3289 += this.field3283[var2 + 128 & 0xFF];
                int var4;
                this.field3283[var2] = var4 = this.field3290 + this.field3289 + this.field3283[class291.method2359(1020, var3) >> 2];
                this.field3288[var2] = this.field3290 = this.field3283[class291.method2359(261370, var4) >> 8 >> 2] + var3;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3299[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)I", line = 96)
    public final int method1886(int arg0) {
        try {
            if (arg0 >= -60) {
                return -98;
            }
            field3292++;
            if (this.field3284 == 0) {
                this.method1885((byte) -14);
                this.field3284 = 256;
            }
            return this.field3288[--this.field3284];
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3299[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V", line = 115)
    public static void method1887(boolean arg0) {
        try {
            field3295 = null;
            field3298 = null;
            field3287 = null;
            field3293 = null;
            if (arg0) {
                field3282 = true;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3299[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I", line = 131)
    public static final int method1888(int arg0, int arg1, int arg2) {
        try {
            if (arg0 != 1321233154) {
                method1887(true);
            }
            field3281++;
            int var3 = arg2 * 57 + arg1;
            int var4 = var3 ^ var3 << 13;
            int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
            return (var5 & 0x7FBF9EE) >> 19;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3299[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V", line = 154)
    private final void method1889(byte arg0) {
        try {
            field3291++;
            int var2 = -1640531527;
            int var3 = -1640531527;
            int var4 = -1640531527;
            int var5 = -1640531527;
            int var6 = -1640531527;
            int var7 = -1640531527;
            int var8 = -1640531527;
            int var9 = -1640531527;
            if (arg0 != -51) {
                this.method1885((byte) -123);
            }
            for (int var10 = 0; var10 < 4; var10++) {
                int var11 = var9 ^ var8 << 11;
                int var12 = var6 + var11;
                int var13 = var7 + var8;
                int var14 = var13 ^ var7 >>> 2;
                int var15 = var7 + var12;
                int var16 = var5 + var14;
                int var17 = var15 ^ var12 << 8;
                int var18 = var4 + var17;
                int var19 = var12 + var16;
                var6 = var19 ^ var16 >>> 16;
                int var20 = var16 + var18;
                int var21 = var3 + var6;
                var5 = var20 ^ var18 << 10;
                int var22 = var18 + var21;
                int var23 = var2 + var5;
                var4 = var22 ^ var21 >>> 4;
                int var24 = var4 + var11;
                int var25 = var21 + var23;
                var3 = var25 ^ var23 << 8;
                var8 = var3 + var14;
                int var26 = var23 + var24;
                var2 = var26 ^ var24 >>> 9;
                var7 = var2 + var17;
                var9 = var8 + var24;
            }
            for (int var27 = 0; var27 < 256; var27 += 8) {
                int var28 = this.field3288[var27 + 7] + var2;
                int var29 = this.field3288[var27 + 5] + var4;
                int var30 = this.field3288[var27 + 6] + var3;
                int var31 = this.field3288[var27 + 1] + var8;
                int var32 = this.field3288[var27] + var9;
                int var33 = this.field3288[var27 + 4] + var5;
                int var34 = this.field3288[var27 + 3] + var6;
                int var35 = this.field3288[var27 + 2] + var7;
                int var36 = var32 ^ var31 << 11;
                int var37 = var34 + var36;
                int var38 = var31 + var35;
                int var39 = var38 ^ var35 >>> 2;
                int var40 = var35 + var37;
                int var41 = var33 + var39;
                int var42 = var40 ^ var37 << 8;
                int var43 = var37 + var41;
                int var44 = var29 + var42;
                var6 = var43 ^ var41 >>> 16;
                int var45 = var6 + var30;
                int var46 = var41 + var44;
                var5 = var46 ^ var44 << 10;
                int var47 = var5 + var28;
                int var48 = var44 + var45;
                var4 = var48 ^ var45 >>> 4;
                int var49 = var4 + var36;
                int var50 = var45 + var47;
                var3 = var50 ^ var47 << 8;
                int var51 = var47 + var49;
                var8 = var3 + var39;
                var2 = var51 ^ var49 >>> 9;
                var7 = var2 + var42;
                var9 = var8 + var49;
                this.field3283[var27] = var9;
                this.field3283[var27 + 1] = var8;
                this.field3283[var27 + 2] = var7;
                this.field3283[var27 + 3] = var6;
                this.field3283[var27 + 4] = var5;
                this.field3283[var27 + 5] = var4;
                this.field3283[var27 + 6] = var3;
                this.field3283[var27 + 7] = var2;
            }
            for (int var52 = 0; var52 < 256; var52 += 8) {
                int var53 = this.field3283[var52] + var9;
                int var54 = this.field3283[var52 + 3] + var6;
                int var55 = this.field3283[var52 + 1] + var8;
                int var56 = this.field3283[var52 + 5] + var4;
                int var57 = this.field3283[var52 + 6] + var3;
                int var58 = this.field3283[var52 + 2] + var7;
                int var59 = this.field3283[var52 + 7] + var2;
                int var60 = this.field3283[var52 + 4] + var5;
                int var61 = var53 ^ var55 << 11;
                int var62 = var55 + var58;
                int var63 = var54 + var61;
                int var64 = var62 ^ var58 >>> 2;
                int var65 = var60 + var64;
                int var66 = var58 + var63;
                int var67 = var66 ^ var63 << 8;
                int var68 = var56 + var67;
                int var69 = var63 + var65;
                var6 = var69 ^ var65 >>> 16;
                int var70 = var6 + var57;
                int var71 = var65 + var68;
                var5 = var71 ^ var68 << 10;
                int var72 = var5 + var59;
                int var73 = var68 + var70;
                var4 = var73 ^ var70 >>> 4;
                int var74 = var70 + var72;
                int var75 = var4 + var61;
                var3 = var74 ^ var72 << 8;
                int var76 = var72 + var75;
                var8 = var3 + var64;
                var2 = var76 ^ var75 >>> 9;
                var9 = var8 + var75;
                var7 = var2 + var67;
                this.field3283[var52] = var9;
                this.field3283[var52 + 1] = var8;
                this.field3283[var52 + 2] = var7;
                this.field3283[var52 + 3] = var6;
                this.field3283[var52 + 4] = var5;
                this.field3283[var52 + 5] = var4;
                this.field3283[var52 + 6] = var3;
                this.field3283[var52 + 7] = var2;
            }
            this.method1885((byte) -14);
            this.field3284 = 256;
        } catch (RuntimeException var78) {
            throw class759.method5498(var78, field3299[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V", line = 300)
    private class216() {
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "([I)V", line = 304)
    public class216(int[] arg0) {
        try {
            this.field3288 = new int[256];
            this.field3283 = new int[256];
            for (int var2 = 0; var2 < arg0.length; var2++) {
                this.field3288[var2] = arg0[var2];
            }
            this.method1889((byte) -51);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3299[2] + (arg0 == null ? field3299[1] : field3299[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1890(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1891(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 41;
                    break;
                case 1:
                    var10005 = 98;
                    break;
                case 2:
                    var10005 = 103;
                    break;
                case 3:
                    var10005 = 113;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
