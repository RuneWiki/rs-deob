import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class207 {

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public int field2424 = -1;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public int field2429 = 0;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "Z")
    public boolean field2433 = false;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public int field2425 = 5;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "Z")
    public boolean field2434 = false;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "I")
    public int field2440 = -1;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
    public int field2435 = 99;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "Z")
    public boolean field2426 = false;

    @OriginalMember(owner = "client!cu", name = "y", descriptor = "Z")
    public boolean field2448 = false;

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "I")
    public int field2443 = -1;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "I")
    public int field2442 = -1;

    @OriginalMember(owner = "client!cu", name = "D", descriptor = "I")
    public int field2453 = -1;

    @OriginalMember(owner = "client!cu", name = "B", descriptor = "I")
    public int field2451 = 2;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public static int field2428 = 0;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "Lca;")
    public static class285 field2432 = new class285();

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "I")
    public int field2437;

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!cu", name = "w", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!cu", name = "x", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!cu", name = "A", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!cu", name = "C", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!cu", name = "E", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "Lsa;")
    public class193 field2445;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "[I")
    public int[] field2436;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "[I")
    private int[] field2438;

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "[I")
    public int[] field2441;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "[Z")
    public boolean[] field2430;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "[[I")
    public int[][] field2439;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V", line = 3)
    public static void method1208(byte arg0) {
        field2432 = null;
        if (arg0 != -97) {
            field2452 = -126;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZII)I", line = 19)
    public final int method1209(int arg0, boolean arg1, int arg2, int arg3) {
        field2449++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field2441[arg3];
        class81 var8 = null;
        int var9 = 20 % ((arg2 - 87) / 36);
        class81 var10 = this.field2445.method1137(126, var7 >> 16);
        int var11 = var7 & 0xFFFF;
        if (var10 == null) {
            return var5;
        }
        if ((this.field2434 || class493.field6139) && arg0 != -1 && arg0 < this.field2441.length) {
            int var12 = this.field2441[arg0];
            var8 = this.field2445.method1137(125, var12 >> 16);
            var6 = var12 & 0xFFFF;
        }
        if (this.field2433) {
            var5 |= 0x200;
        }
        if (var10.method619(113, var11)) {
            var5 |= 0x80;
        }
        if (var10.method623(-37, var11)) {
            var5 |= 0x100;
        }
        if (var10.method624(1, var11)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method619(87, var6)) {
                var5 |= 0x80;
            }
            if (var8.method623(-81, var6)) {
                var5 |= 0x100;
            }
            if (var8.method624(1, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field2438 != null && arg1) {
            if (this.field2438.length > arg3) {
                int var13 = this.field2438[arg3];
                if (var13 != 65535) {
                    class81 var14 = this.field2445.method1137(127, var13 >> 16);
                    int var15 = var13 & 0xFFFF;
                    if (var14 != null) {
                        if (var14.method619(88, var15)) {
                            var5 |= 0x80;
                        }
                        if (var14.method623(115, var15)) {
                            var5 |= 0x100;
                        }
                        if (var14.method624(1, var15)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field2434 || class493.field6139) && arg0 != -1 && arg0 < this.field2438.length) {
                int var16 = this.field2438[arg0];
                if (var16 != 65535) {
                    class81 var17 = this.field2445.method1137(126, var16 >> 16);
                    int var18 = var16 & 0xFFFF;
                    if (var17 != null) {
                        if (var17.method619(106, var18)) {
                            var5 |= 0x80;
                        }
                        if (var17.method623(68, var18)) {
                            var5 |= 0x100;
                        }
                        if (var17.method624(1, var18)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILji;)V", line = 143)
    public final void method1210(int arg0, class572 arg1) {
        field2450++;
        if (arg0 <= 107) {
            method1213(30, -67, 70, 98, -84, -41);
        }
        while (true) {
            int var3 = arg1.method3097((byte) 12);
            if (var3 == 0) {
                return;
            }
            this.method1215(var3, (byte) -49, arg1);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)I", line = 167)
    public static final int method1211(int arg0) {
        field2431++;
        if (class90.field1174 == null) {
            if (arg0 != 3) {
                field2432 = null;
            }
            return class241.field3117 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIBILba;B)Lba;", line = 190)
    public final class359 method1212(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class359 arg6, byte arg7) {
        field2447++;
        int var9 = this.field2436[arg1];
        int var10 = this.field2441[arg1];
        class81 var11 = this.field2445.method1137(127, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg6.method951(arg7, arg5, true);
        }
        class81 var13 = null;
        if ((this.field2434 || class493.field6139) && arg0 != -1 && arg0 < this.field2441.length) {
            int var14 = this.field2441[arg0];
            var13 = this.field2445.method1137(127, var14 >> 16);
            arg0 = var14 & 0xFFFF;
        }
        if (this.field2433) {
            arg5 |= 0x200;
        }
        if (var11.method619(91, var12)) {
            arg5 |= 0x80;
        }
        if (var11.method623(94, var12)) {
            arg5 |= 0x100;
        }
        if (var11.method624(1, var12)) {
            arg5 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method619(98, arg0)) {
                arg5 |= 0x80;
            }
            if (var13.method623(107, arg0)) {
                arg5 |= 0x100;
            }
            if (var13.method624(1, arg0)) {
                arg5 |= 0x400;
            }
        }
        int var15 = arg5 | 0x20;
        if (arg4 >= -18) {
            this.field2442 = 7;
        }
        class359 var16 = arg6.method951(arg7, var15, true);
        var16.method2065(var11, this.field2433, arg0, var9, var12, var13, arg3 - 1, arg2, -101);
        return var16;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIII)V", line = 263)
    public static final void method1213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2427++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg5 * arg5;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg0 - arg1) * var15;
        class390.method2223(arg4 - arg5, arg2, class30.field364[arg3], (byte) -122, arg4 + arg5);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var6++;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var6++;
                var19 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var18 -= var15;
            var20 -= var15;
            var7--;
            int var21 = arg3 - var7;
            int var22 = arg3 + var7;
            int var23 = arg4 + var6;
            int var24 = arg4 - var6;
            class390.method2223(var24, arg2, class30.field364[var21], (byte) -121, var23);
            class390.method2223(var24, arg2, class30.field364[var22], (byte) -115, var23);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZILba;II)Lba;", line = 358)
    public final class359 method1214(int arg0, boolean arg1, int arg2, class359 arg3, int arg4, int arg5) {
        field2446++;
        int var7 = this.field2436[arg2];
        int var8 = this.field2441[arg2];
        class81 var9 = this.field2445.method1137(127, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method951((byte) 1, arg0, true);
        }
        class81 var11 = null;
        if ((this.field2434 || class493.field6139) && arg5 != -1 && this.field2441.length > arg5) {
            int var12 = this.field2441[arg5];
            var11 = this.field2445.method1137(125, var12 >> 16);
            arg5 = var12 & 0xFFFF;
        }
        class81 var13 = null;
        class81 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field2438 != null) {
            if (arg2 < this.field2438.length) {
                var15 = this.field2438[arg2];
                if (var15 != 65535) {
                    var13 = this.field2445.method1137(125, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field2434 || class493.field6139) && arg5 != -1 && arg5 < this.field2438.length) {
                var16 = this.field2438[arg5];
                if (var16 != 65535) {
                    var14 = this.field2445.method1137(125, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field2433) {
            arg0 |= 0x200;
        }
        if (var9.method619(115, var10)) {
            arg0 |= 0x80;
        }
        if (var9.method623(-69, var10)) {
            arg0 |= 0x100;
        }
        if (var9.method624(1, var10)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method619(61, var15)) {
                arg0 |= 0x80;
            }
            if (var13.method623(-87, var15)) {
                arg0 |= 0x100;
            }
            if (var13.method624(1, var15)) {
                arg0 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method619(96, arg5)) {
                arg0 |= 0x80;
            }
            if (var11.method623(-113, arg5)) {
                arg0 |= 0x100;
            }
            if (var11.method624(1, arg5)) {
                arg0 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method619(124, var16)) {
                arg0 |= 0x80;
            }
            if (var14.method623(-121, var16)) {
                arg0 |= 0x100;
            }
            if (var14.method624(1, var16)) {
                arg0 |= 0x400;
            }
        }
        int var17 = arg0 | 0x20;
        class359 var18 = arg3.method951((byte) 1, var17, arg1);
        var18.method2065(var9, this.field2433, arg5, var7, var10, var11, arg4 - 1, 0, -104);
        if (var13 != null) {
            var18.method2065(var13, this.field2433, var16, var7, var15, var14, arg4 - 1, 0, -123);
        }
        return var18;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IBLji;)V", line = 499)
    private final void method1215(int arg0, byte arg1, class572 arg2) {
        field2444++;
        if (arg0 == 1) {
            int var13 = arg2.method3031(-1);
            this.field2436 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2436[var14] = arg2.method3031(-1);
            }
            this.field2441 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field2441[var15] = arg2.method3031(-1);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field2441[var16] = (arg2.method3031(-1) << 16) + this.field2441[var16];
            }
        } else if (arg0 == 2) {
            this.field2453 = arg2.method3031(-1);
        } else if (arg0 == 3) {
            this.field2430 = new boolean[256];
            int var11 = arg2.method3097((byte) 12);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2430[arg2.method3097((byte) 12)] = true;
            }
        } else if (arg0 == 5) {
            this.field2425 = arg2.method3097((byte) 12);
        } else if (arg0 == 6) {
            this.field2442 = arg2.method3031(-1);
        } else if (arg0 == 7) {
            this.field2440 = arg2.method3031(-1);
        } else if (arg0 == 8) {
            this.field2435 = arg2.method3097((byte) 12);
        } else if (arg0 == 9) {
            this.field2424 = arg2.method3097((byte) 12);
        } else if (arg0 == 10) {
            this.field2443 = arg2.method3097((byte) 12);
        } else if (arg0 == 11) {
            this.field2451 = arg2.method3097((byte) 12);
        } else if (arg0 == 12) {
            int var4 = arg2.method3097((byte) 12);
            this.field2438 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2438[var5] = arg2.method3031(-1);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2438[var6] = (arg2.method3031(-1) << 16) + this.field2438[var6];
            }
        } else if (arg0 == 13) {
            int var7 = arg2.method3031(-1);
            this.field2439 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg2.method3097((byte) 12);
                if (var9 > 0) {
                    this.field2439[var8] = new int[var9];
                    this.field2439[var8][0] = arg2.method3059(1);
                    for (int var10 = 1; var10 < var9; var10++) {
                        this.field2439[var8][var10] = arg2.method3031(-1);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field2433 = true;
        } else if (arg0 == 15) {
            this.field2434 = true;
        } else if (arg0 == 16) {
            this.field2426 = true;
        } else if (arg0 == 17) {
            this.field2429 = arg2.method3097((byte) 12);
        } else if (arg0 == 18) {
            this.field2448 = true;
        }
        if (arg1 > -18) {
            method1208((byte) 13);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)V", line = 670)
    public final void method1216(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2454++;
        if (this.field2443 == -1) {
            if (this.field2430 == null) {
                this.field2443 = 0;
            } else {
                this.field2443 = 2;
            }
        }
        if (this.field2424 != -1) {
            return;
        }
        if (this.field2430 == null) {
            this.field2424 = 0;
        } else {
            this.field2424 = 2;
        }
    }
}
