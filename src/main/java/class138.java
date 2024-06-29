import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class138 {

    @OriginalMember(owner = "client!je", name = "j", descriptor = "Z")
    private boolean field2442 = false;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public int field2448 = 2;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public int field2438 = 5;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public int field2436 = -1;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public int field2452 = -1;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public int field2453 = -1;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public int field2435 = -1;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Z")
    public boolean field2434 = false;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public int field2455 = 99;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    public int field2458 = -1;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field2443 = 0;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field2440 = 0;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field2447 = 2;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "Lgj;")
    public static class226 field2457 = new class226(4);

    @OriginalMember(owner = "client!je", name = "E", descriptor = "Lsb;")
    public static class98 field2463 = class47.method368("(R", 0);

    @OriginalMember(owner = "client!je", name = "C", descriptor = "[[[B")
    public static byte[][][] field2461 = new byte[4][104][104];

    @OriginalMember(owner = "client!je", name = "D", descriptor = "[I")
    public static int[] field2462 = new int[4096];

    @OriginalMember(owner = "client!je", name = "F", descriptor = "J")
    public static long field2464 = 0L;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "[I")
    public int[] field2439;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "[I")
    private int[] field2444;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "[I")
    private int[] field2450;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "[I")
    public int[] field2454;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[[I")
    public int[][] field2433;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lwh;")
    public static final class45 method1036(int arg0, int arg1) {
        class45 var2 = (class45) class53.field849.method1564((long) arg1, 0);
        field2456++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -28994) {
            field2447 = -85;
        }
        byte[] var3 = class115.field2065.method571(1, arg1, 120);
        class45 var4 = new class45();
        if (var3 != null) {
            var4.method358(arg1, (byte) -62, new class216(var3));
        }
        class53.field849.method1563((long) arg1, 21771, var4);
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    public static void method1037(boolean arg0) {
        field2462 = null;
        field2461 = null;
        field2463 = null;
        if (!arg0) {
            method1036(80, -120);
        }
        field2457 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Llj;BI)V")
    private final void method1038(class216 arg0, byte arg1, int arg2) {
        if (arg1 != -23) {
            this.method1040(-121, -96, (class17) null);
        }
        field2449++;
        if (arg2 == 1) {
            int var4 = arg0.method1487(24);
            this.field2439 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2439[var5] = arg0.method1487(class184.method1267(arg1, -57));
            }
            this.field2454 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2454[var6] = arg0.method1487(77);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2454[var7] += arg0.method1487(122) << 16;
            }
        } else if (arg2 == 2) {
            this.field2458 = arg0.method1487(42);
        } else if (arg2 == 3) {
            int var8 = arg0.method1446(5350);
            this.field2444 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2444[var9] = arg0.method1446(5350);
            }
            this.field2444[var8] = 9999999;
        } else if (arg2 == 4) {
            this.field2434 = true;
        } else if (arg2 == 5) {
            this.field2438 = arg0.method1446(arg1 + 5373);
        } else if (arg2 == 6) {
            this.field2436 = arg0.method1487(72);
        } else if (arg2 == 7) {
            this.field2453 = arg0.method1487(79);
        } else if (arg2 == 8) {
            this.field2455 = arg0.method1446(arg1 + 5373);
        } else if (arg2 == 9) {
            this.field2452 = arg0.method1446(5350);
        } else if (arg2 == 10) {
            this.field2435 = arg0.method1446(arg1 + 5373);
        } else if (arg2 == 11) {
            this.field2448 = arg0.method1446(5350);
        } else if (arg2 == 12) {
            int var14 = arg0.method1446(5350);
            this.field2450 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field2450[var15] = arg0.method1487(124);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field2450[var16] += arg0.method1487(17) << 16;
            }
        } else if (arg2 == 13) {
            int var10 = arg0.method1487(94);
            this.field2433 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg0.method1446(5350);
                if (var12 > 0) {
                    this.field2433[var11] = new int[var12];
                    this.field2433[var11][0] = arg0.method1448(class184.method1267(arg1, -26403));
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field2433[var11][var13] = arg0.method1487(32);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field2442 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BIZI)V")
    public static final void method1039(byte arg0, int arg1, boolean arg2, int arg3) {
        field2437++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class253.field4432 = arg1;
        class61.field1028 = arg2;
        class196.field3382 = arg3;
        if (arg0 >= -26) {
            field2440 = -49;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILna;)Lna;")
    public final class17 method1040(int arg0, int arg1, class17 arg2) {
        int var4 = this.field2454[arg1];
        class166 var5 = class197.method1348(var4 >> 16, 1000);
        if (arg0 <= 84) {
            this.field2444 = null;
        }
        int var6 = var4 & 0xFFFF;
        field2460++;
        if (var5 == null) {
            return arg2.method155(true, true);
        } else {
            class17 var7 = arg2.method155(!var5.method1188(-121, var6), !this.field2442);
            var7.method166(var5, var6, this.field2442);
            return var7;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lna;II)Lna;")
    public final class17 method1041(class17 arg0, int arg1, int arg2) {
        int var4 = this.field2454[arg1];
        class166 var5 = class197.method1348(var4 >> 16, 1000);
        field2451++;
        int var6 = var4 & 0xFFFF;
        if (arg2 > -36) {
            this.field2433 = null;
        }
        if (var5 == null) {
            return arg0.method148(true, true);
        } else {
            class17 var7 = arg0.method148(!var5.method1188(-61, var6), !this.field2442);
            var7.method166(var5, var6, this.field2442);
            return var7;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class86.field1512[arg0][var8][var14] == -class1.field11) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class78.field1393[arg0][arg1][arg3] + arg5;
            if (!class16.method143(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class16.method143(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class16.method143(var9, var11, var13)) {
                return false;
            } else if (class16.method143(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class229.method1578(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class16.method143(var6 + 1, class78.field1393[arg0][arg1][arg3] + arg5, var7 + 1) && class16.method143(var6 + 128 - 1, class78.field1393[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class16.method143(var6 + 128 - 1, class78.field1393[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class16.method143(var6 + 1, class78.field1393[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILna;ILje;)Lna;")
    public final class17 method1043(int arg0, int arg1, class17 arg2, int arg3, class138 arg4) {
        field2446++;
        int var6 = this.field2454[arg0];
        class166 var7 = class197.method1348(var6 >> 16, 1000);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method1040(109, arg1, arg2);
        }
        int var9 = arg4.field2454[arg1];
        class166 var10 = class197.method1348(var9 >> 16, 1000);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class17 var12 = arg2.method155(!var7.method1188(-96, var8), !this.field2442);
            var12.method166(var7, var8, this.field2442);
            return var12;
        }
        class17 var13 = arg2.method155(!var7.method1188(-86, var8) & !var10.method1188(116, var11), !arg4.field2442 & !this.field2442);
        if (arg3 < 44) {
            this.field2442 = false;
        }
        var13.method161(var7, var8, var10, var11, this.field2444, this.field2442 | arg4.field2442);
        return var13;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lna;III)Lna;")
    public final class17 method1044(class17 arg0, int arg1, int arg2, int arg3) {
        field2459++;
        int var5 = this.field2454[arg1];
        class166 var6 = class197.method1348(var5 >> 16, 1000);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method155(true, true);
        }
        int var8 = arg3 & 0x3;
        if (arg2 != 8000) {
            method1036(75, -58);
        }
        class17 var9 = arg0.method155(!var6.method1188(-82, var7), !this.field2442);
        if (var8 == 1) {
            var9.method167();
        } else if (var8 == 2) {
            var9.method151();
        } else if (var8 == 3) {
            var9.method157();
        }
        var9.method166(var6, var7, this.field2442);
        if (var8 == 1) {
            var9.method157();
        } else if (var8 == 2) {
            var9.method151();
        } else if (var8 == 3) {
            var9.method167();
        }
        return var9;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(IILna;)Lna;")
    public final class17 method1045(int arg0, int arg1, class17 arg2) {
        int var4 = this.field2454[arg0];
        field2445++;
        class166 var5 = class197.method1348(var4 >> 16, 1000);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method155(true, true);
        }
        class166 var7 = null;
        int var8 = 0;
        if (arg1 > -34) {
            return null;
        }
        if (this.field2450 != null && this.field2450.length > arg0) {
            int var9 = this.field2450[arg0];
            var7 = class197.method1348(var9 >> 16, 1000);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class17 var11 = arg2.method155(!var5.method1188(-118, var6), !this.field2442);
            var11.method166(var5, var6, this.field2442);
            return var11;
        } else {
            class17 var10 = arg2.method155(!var5.method1188(-108, var6) & !var7.method1188(-90, var8), !this.field2442);
            var10.method166(var5, var6, this.field2442);
            var10.method166(var7, var8, this.field2442);
            return var10;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V")
    public final void method1046(boolean arg0) {
        if (arg0) {
            this.field2442 = true;
        }
        if (this.field2452 == -1) {
            if (this.field2444 == null) {
                this.field2452 = 0;
            } else {
                this.field2452 = 2;
            }
        }
        if (this.field2435 == -1) {
            if (this.field2444 == null) {
                this.field2435 = 0;
            } else {
                this.field2435 = 2;
            }
        }
        field2465++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Llj;I)V")
    public final void method1047(class216 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1446(5350);
            if (var3 == 0) {
                field2441++;
                if (arg1 != 18541) {
                    field2447 = 2;
                    return;
                }
                return;
            }
            this.method1038(arg0, (byte) -23, var3);
        }
    }
}
