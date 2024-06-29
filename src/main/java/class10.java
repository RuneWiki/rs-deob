import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class10 {

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "Lod;")
    private class130 field227 = new class130();

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field231 = 0;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "Lgg;")
    public static class63 field235 = class116.method911(43, "(U0a )2 via: ");

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "[J")
    public static long[] field228 = new long[500];

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "Lgg;")
    private static class63 field234 = class116.method911(43, "Please try using a different world)3");

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "Lgg;")
    private static class63 field238 = class116.method911(43, "glow1:");

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "Lgg;")
    public static class63 field236 = field234;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "Lgg;")
    public static class63 field232 = field234;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Lgg;")
    public static class63 field223 = field234;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "Z")
    public static boolean field239 = false;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Lgg;")
    public static class63 field229 = field234;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field243 = 0;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "[I")
    public static int[] field242 = new int[50];

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "Lgg;")
    public static class63 field237 = field234;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "Lgg;")
    public static class63 field245 = field234;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "Lgg;")
    public static class63 field247 = field238;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "Lgg;")
    public static class63 field246 = field238;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "Lmc;")
    public static class111 field225;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)I")
    public static final int method130(int arg0, int arg1, int arg2) {
        field240++;
        int var3 = 0;
        while (arg0 > 0) {
            arg0--;
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
        }
        return arg1 == -1 ? var3 : 63;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V")
    public static final void method131(int arg0, int arg1) {
        class155.method1078((byte) 10);
        class184.method1213(-122);
        int var2 = class168.method1135((byte) 126, arg1).field2967;
        field230++;
        if (var2 == 0) {
            return;
        }
        if (arg0 < 59) {
            field235 = null;
        }
        int var3 = class24.field545[arg1];
        if (var2 == 1) {
            class126.field2785 = var3;
            if (class126.field2785 == 1) {
                class25.method242(0.9F);
            }
            if (class126.field2785 == 2) {
                class25.method242(0.8F);
            }
            if (class126.field2785 == 3) {
                class25.method242(0.7F);
            }
            if (class126.field2785 == 4) {
                class25.method242(0.6F);
            }
            class133.method973((byte) 99);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class90.field2106 != var4) {
                if (class90.field2106 == 0 && class6.field158 != -1) {
                    class60.method560(0, 32599, field225, false, class6.field158, var4);
                    class164.field3377 = false;
                } else if (var4 == 0) {
                    class50.method483((byte) -90);
                    class164.field3377 = false;
                } else {
                    class113.method898(var4, 0);
                }
                class90.field2106 = var4;
            }
        }
        if (var2 == 6) {
            class151.field3170 = var3;
        }
        if (var2 == 9) {
            class203.field4037 = var3;
        }
        if (var2 == 5) {
            class182.field3694 = var3;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class59.field1517 = 127;
            }
            if (var3 == 1) {
                class59.field1517 = 96;
            }
            if (var3 == 2) {
                class59.field1517 = 64;
            }
            if (var3 == 3) {
                class59.field1517 = 32;
            }
            if (var3 == 4) {
                class59.field1517 = 0;
            }
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            class110.field2471 = 127;
        }
        if (var3 == 1) {
            class110.field2471 = 96;
        }
        if (var3 == 2) {
            class110.field2471 = 64;
        }
        if (var3 == 3) {
            class110.field2471 = 32;
        }
        if (var3 == 4) {
            class110.field2471 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII)V")
    public static final void method132(int arg0, int arg1, int arg2, int arg3) {
        field222++;
        if (arg1 != 671674313) {
            method137((byte) 58);
        }
        if (arg0 < 128 || arg3 < 128 || arg0 > 13056 || arg3 > 13056) {
            class138.field2956 = -1;
            class186.field3751 = -1;
            return;
        }
        int var4 = class112.method894(-113, class112.field2528, arg0, arg3) - arg2;
        int var5 = class25.field571[class123.field2719];
        int var6 = arg3 - class21.field491;
        int var7 = arg0 - class35.field828;
        int var8 = var4 - class39.field924;
        int var9 = class25.field576[class123.field2719];
        int var10 = class25.field571[class32.field778];
        int var11 = class25.field576[class32.field778];
        int var12 = var6 * var10 + var7 * var11 >> 16;
        int var13 = var6 * var11 - var7 * var10 >> 16;
        int var15 = var8 * var9 - var5 * var13 >> 16;
        int var16 = var5 * var8 + var9 * var13 >> 16;
        if (var16 < 50) {
            class186.field3751 = -1;
            class138.field2956 = -1;
        } else {
            class138.field2956 = (var12 << 9) / var16 + 256;
            class186.field3751 = (var15 << 9) / var16 + 167;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILod;)V")
    public final void method133(int arg0, class130 arg1) {
        if (arg1.field2841 != null) {
            arg1.method962((byte) 61);
        }
        arg1.field2841 = this.field227.field2841;
        int var3 = -7 % ((-arg0 - 25) / 51);
        arg1.field2839 = this.field227;
        arg1.field2841.field2839 = arg1;
        arg1.field2839.field2841 = arg1;
        field241++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static final void method134(int arg0) {
        if (arg0 > -107) {
            method132(23, -96, -6, 27);
        }
        class35.field819 = 99;
        class177.field3632 = new byte[4][104][104];
        class71.field1790 = new byte[4][105][105];
        class199.field3975 = new int[104];
        field244++;
        class56.field1475 = new int[104];
        class154.field3224 = new int[4][105][105];
        class97.field2314 = new int[104];
        class127.field2808 = new byte[4][104][104];
        class40.field939 = new byte[4][104][104];
        class114.field2559 = new int[104];
        class18.field426 = new byte[4][104][104];
        class100.field2363 = new int[104];
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lod;I)V")
    public final void method135(class130 arg0, int arg1) {
        if (arg1 != 104) {
            return;
        }
        field233++;
        if (arg0.field2841 != null) {
            arg0.method962((byte) 99);
        }
        arg0.field2841 = this.field227;
        arg0.field2839 = this.field227.field2839;
        arg0.field2841.field2839 = arg0;
        arg0.field2839.field2841 = arg0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLff;)I")
    public static final int method136(byte arg0, class54 arg1) {
        class89 var2 = (class89) class167.field3460.method694(-23979, ((long) arg1.field1323 << 32) + (long) arg1.field1408);
        if (arg0 > -88) {
            method137((byte) 3);
        }
        field224++;
        return var2 == null ? arg1.field1337 : var2.field2091;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static void method137(byte arg0) {
        field238 = null;
        field245 = null;
        field235 = null;
        field242 = null;
        field223 = null;
        field228 = null;
        field234 = null;
        field237 = null;
        field229 = null;
        if (arg0 != -31) {
            return;
        }
        field225 = null;
        field246 = null;
        field236 = null;
        field247 = null;
        field232 = null;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class10() {
        this.field227.field2839 = this.field227;
        this.field227.field2841 = this.field227;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)Lod;")
    public final class130 method138(int arg0) {
        field226++;
        class130 var2 = this.field227.field2839;
        if (this.field227 == var2) {
            return null;
        }
        var2.method962((byte) 125);
        if (arg0 != -18062) {
            field225 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)Lod;")
    public final class130 method139(int arg0) {
        field248++;
        if (arg0 != 167) {
            this.method139(73);
        }
        class130 var2 = this.field227.field2839;
        return this.field227 == var2 ? null : var2;
    }
}
