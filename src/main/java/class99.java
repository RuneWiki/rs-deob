import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class99 {

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Lqf;")
    private static class117 field2381 = class72.method514(117, "Create a free account");

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "Lqf;")
    public static class117 field2385 = class72.method514(119, "<col=ff3000>");

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Lqf;")
    public static class117 field2386 = class72.method514(113, "An:");

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field2393 = 50;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "[I")
    public static int[] field2396 = new int[field2393];

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "[I")
    public static int[] field2388 = new int[field2393];

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "[I")
    public static int[] field2382 = new int[field2393];

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "[I")
    public static int[] field2380 = new int[field2393];

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "[I")
    public static int[] field2374 = new int[field2393];

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "Lqf;")
    private static class117 field2397 = class72.method514(120, "Drop");

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "[I")
    public static int[] field2399 = new int[field2393];

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "[Lqf;")
    public static class117[] field2404 = new class117[field2393];

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "Lqf;")
    public static class117 field2395 = field2397;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "Lqf;")
    private static class117 field2405 = class72.method514(103, " from your ignore list first");

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "[I")
    public static int[] field2407 = new int[5];

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
    public static int field2409 = 0;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "Lqf;")
    public static class117 field2398 = field2405;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "Lqf;")
    public static class117 field2402 = field2381;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "[I")
    public static int[] field2392 = new int[field2393];

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Lra;")
    public static class119 field2373 = new class119(5000);

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "Lqf;")
    public static class117 field2410 = class72.method514(110, "title)3jpg");

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    private int field2400;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "J")
    private long field2371;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "J")
    private long field2390;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lr;")
    public static class118 field2372;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "Z")
    public boolean field2403;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "[I")
    private int[] field2387;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "[I")
    private int[] field2401;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIZ)V")
    public final void method769(boolean arg0, int arg1, boolean arg2) {
        field2391++;
        if (arg1 == 1 && this.field2403 || arg2) {
            return;
        }
        int var4 = this.field2387[class138.field3288[arg1]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class25 var5;
        do {
            if (arg0) {
                var4++;
                if (class35.field742 <= var4) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class35.field742 - 1;
                }
            }
            var5 = client.method164(var4, (byte) -119);
        } while (var5 == null || var5.field479 || arg1 + (this.field2403 ? 7 : 0) != var5.field497);
        this.field2387[class138.field3288[arg1]] = var4 + 256;
        this.method779(256);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLla;)V")
    public final void method770(byte arg0, class77 arg1) {
        field2389++;
        arg1.method571(this.field2403 ? 1 : 0, arg0 - 11098);
        int var3 = 0;
        if (arg0 != -26) {
            return;
        }
        while (var3 < 7) {
            int var5 = this.field2387[class138.field3288[var3]];
            if (var5 == 0) {
                arg1.method571(-1, -11124);
            } else {
                arg1.method571(var5 - 256, -11124);
            }
            var3++;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg1.method571(this.field2401[var4], arg0 - 11098);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZI)V")
    public final void method771(int arg0, boolean arg1, int arg2) {
        field2376++;
        int var4 = this.field2401[arg0];
        if (arg2 != -2273) {
            this.field2390 = 60L;
        }
        if (arg1) {
            var4++;
            if (var4 >= class80.field1822[arg0].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class80.field1822[arg0].length - 1;
            }
        }
        this.field2401[arg0] = var4;
        this.method779(256);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZ)V")
    public final void method772(int arg0, boolean arg1) {
        field2408++;
        if (this.field2403 != arg1) {
            this.method773(arg1, this.field2401, null, arg0, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z[I[IIB)V")
    public final void method773(boolean arg0, int[] arg1, int[] arg2, int arg3, byte arg4) {
        field2394++;
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class35.field742; var7++) {
                    class25 var8 = client.method164(var7, (byte) 37);
                    if (var8 != null && !var8.field479 && (arg0 ? 7 : 0) + var6 == var8.field497) {
                        arg2[class138.field3288[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field2403 = arg0;
        this.field2387 = arg2;
        this.field2400 = arg3;
        this.field2401 = arg1;
        int var9 = -121 % ((arg4 - 63) / 39);
        this.method779(256);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Z")
    public static final boolean method774(int arg0) {
        field2379++;
        if (class125.field2953 == 0) {
            return arg0 == 8 ? class36.field771.method1114(arg0 ^ 0x7F79E9) : false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public static void method775(int arg0) {
        field2396 = null;
        field2392 = null;
        field2380 = null;
        field2386 = null;
        field2385 = null;
        field2410 = null;
        field2395 = null;
        field2372 = null;
        field2373 = null;
        field2397 = null;
        field2404 = null;
        field2382 = null;
        field2381 = null;
        field2374 = null;
        field2388 = null;
        field2402 = null;
        field2407 = null;
        field2405 = null;
        field2398 = null;
        field2399 = null;
        if (arg0 != 512) {
            field2410 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)Ltc;")
    public static final class134 method776(int arg0, int arg1) {
        field2377++;
        class134 var2 = (class134) class153.field3785.method247(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class22.field410.method458(false, arg1, arg0);
        class134 var4 = new class134();
        var4.field3210 = arg1;
        if (var3 != null) {
            var4.method1039(new class77(var3), (byte) -108);
        }
        var4.method1036(true);
        class153.field3785.method248((long) arg1, (byte) -119, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILnf;ILnf;B)Lea;")
    public final class30 method777(int arg0, class96 arg1, int arg2, class96 arg3, byte arg4) {
        if (arg4 != 1) {
            this.method773(false, null, null, -104, (byte) -88);
        }
        field2378++;
        if (this.field2400 != -1) {
            return method776(9, this.field2400).method1035(arg1, arg3, arg4 - 1, arg2, arg0);
        }
        long var6 = this.field2371;
        int[] var8 = this.field2387;
        if (arg1 != null && (arg1.field2340 >= 0 || arg1.field2333 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field2387[var9];
            }
            if (arg1.field2340 >= 0) {
                var6 += arg1.field2340 - this.field2387[5] << 8;
                var8[5] = arg1.field2340;
            }
            if (arg1.field2333 >= 0) {
                var6 += arg1.field2333 - this.field2387[3] << 16;
                var8[3] = arg1.field2333;
            }
        }
        class30 var10 = (class30) class143.field3474.method247(0, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if (var21 >= 256 && var21 < 512 && !client.method164(var21 - 256, (byte) 17).method193(arg4 - 1)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class27.method206(var21 - 512, (byte) 90).method513(false, this.field2403)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2390 != -1L) {
                    var10 = (class30) class143.field3474.method247(0, this.field2390);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                int var13 = 0;
                class142[] var14 = new class142[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class142 var19 = client.method164(var18 - 256, (byte) -120).method189(114);
                        if (var19 != null) {
                            var14[var13++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class142 var20 = class27.method206(var18 - 512, (byte) 90).method520(this.field2403, true);
                        if (var20 != null) {
                            var14[var13++] = var20;
                        }
                    }
                }
                class142 var16 = new class142(var14, var13);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field2401[var17] != 0) {
                        var16.method1133(class80.field1822[var17][0], class80.field1822[var17][this.field2401[var17]]);
                        if (var17 == 1) {
                            var16.method1133(class5.field90[0], class5.field90[this.field2401[var17]]);
                        }
                    }
                }
                var10 = var16.method1129(64, 850, -30, -50, -30);
                class143.field3474.method248(var6, (byte) -102, var10);
                this.field2390 = var6;
            }
        }
        if (arg1 == null && arg3 == null) {
            return var10;
        }
        class30 var22;
        if (arg1 != null && arg3 != null) {
            var22 = arg1.method762(arg3, arg2, var10, 23214, arg0);
        } else if (arg1 == null) {
            var22 = arg3.method756(var10, arg2, (byte) -17);
        } else {
            var22 = arg1.method756(var10, arg0, (byte) -17);
        }
        return var22;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Lue;")
    public final class142 method778(byte arg0) {
        if (arg0 <= 78) {
            this.method779(-89);
        }
        field2375++;
        if (this.field2400 != -1) {
            return method776(9, this.field2400).method1033((byte) 103);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field2387[var3];
            if (var12 >= 256 && var12 < 512 && !client.method164(var12 - 256, (byte) 99).method194((byte) 123)) {
                var2 = true;
            }
            if (var12 >= 512 && !class27.method206(var12 - 512, (byte) 90).method517(this.field2403, -1)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class142[] var4 = new class142[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field2387[var6];
            if (var9 >= 256 && var9 < 512) {
                class142 var10 = client.method164(var9 - 256, (byte) 28).method191((byte) -75);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class142 var11 = class27.method206(var9 - 512, (byte) 90).method507(this.field2403, 115);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class142 var7 = new class142(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field2401[var8] != 0) {
                var7.method1133(class80.field1822[var8][0], class80.field1822[var8][this.field2401[var8]]);
                if (var8 == 1) {
                    var7.method1133(class5.field90[0], class5.field90[this.field2401[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
    private final void method779(int arg0) {
        field2383++;
        long var2 = this.field2371;
        this.field2371 = 0L;
        int var4 = this.field2387[5];
        int var5 = this.field2387[9];
        this.field2387[5] = var5;
        this.field2387[9] = var4;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field2371 <<= 0x4;
            if (this.field2387[var6] >= 256) {
                this.field2371 += this.field2387[var6] - 256;
            }
        }
        if (this.field2387[0] >= 256) {
            this.field2371 += this.field2387[0] - 256 >> 4;
        }
        if (this.field2387[1] >= 256) {
            this.field2371 += this.field2387[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field2371 <<= 0x3;
            this.field2371 += this.field2401[var7];
        }
        this.field2371 <<= 0x1;
        this.field2387[5] = var4;
        this.field2371 += this.field2403 ? 1 : 0;
        this.field2387[9] = var5;
        if (arg0 != 256) {
            field2410 = null;
        }
        if (var2 != 0L && this.field2371 != var2) {
            class143.field3474.method253(false, var2);
        }
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)I")
    public final int method780(int arg0) {
        field2406++;
        if (arg0 == 512) {
            return this.field2400 == -1 ? (this.field2401[4] << 20) + (this.field2387[0] << 15) + this.field2387[1] + (this.field2401[0] << 25) + (this.field2387[8] << 10) + (this.field2387[11] << 5) : method776(9, this.field2400).field3210 + 305419896;
        } else {
            return -83;
        }
    }
}
