import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class151 extends class258 {

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "Lqh;")
    private class68 field2418 = null;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    private int field2426 = -1;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
    private int field2433 = -32768;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    private int field2422 = -1;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    private int field2417;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "I")
    private int field2441;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
    private int field2431;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
    private int field2432;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
    private int field2420;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    private int field2419;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "Lm;")
    private class149 field2428;

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "I")
    private int field2439;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
    private int field2430;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
    public static int field2423 = 0;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
    public static int field2427 = -1;

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
    public static int field2440 = 0;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "I")
    public static int field2437 = 0;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "Lba;")
    public static class93 field2438 = new class93(64);

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "I")
    public static int field2445 = -1;

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "Z")
    public static boolean field2444 = true;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZI[B[Lbh;IIIIII)V")
    public static final void method946(int arg0, boolean arg1, int arg2, byte[] arg3, class153[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2435++;
        byte var11;
        if (arg1) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg1) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if (arg6 + var12 > 0 && arg6 + var12 < 103 && arg7 + var13 > 0 && arg7 + var13 < 103) {
                        arg4[arg0].field2462[arg6 + var12][arg7 + var13] = class65.method409(arg4[arg0].field2462[arg6 + var12][arg7 + var13], -16777217);
                    }
                }
            }
        }
        class56 var14 = new class56(arg3);
        if (arg8 != 128) {
            field2440 = -127;
        }
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg5 == var15 && arg2 <= var16 && var16 < arg2 + 8 && var17 >= arg10 && var17 < arg10 + 8) {
                        class123.method754(0, class100.method607(arg9, var17 & 0x7, (byte) -91, var16 & 0x7) + arg6, arg8 ^ 0xFFFFFF32, arg9, 0, var14, arg1, arg0, class134.method809((byte) -96, var16 & 0x7, var17 & 0x7, arg9) + arg7);
                    } else {
                        class123.method754(0, -1, -61, 0, 0, var14, arg1, 0, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)Lpe;")
    private final class258 method947(int arg0) {
        field2424++;
        return arg0 == -4 ? this.method954(114, false) : null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIII)V")
    public final void method948(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2443++;
        if (arg2 == 1) {
            this.method951(((arg4 - arg0 >> 1) + arg0) * 128 + 64, arg2 ^ 0xFFFFFFFE, ((arg1 - arg3 >> 1) + arg3) * 128 + 64);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lkg;")
    public static final class158 method949(Throwable arg0, String arg1) {
        field2434++;
        class158 var2;
        if (arg0 instanceof class158) {
            var2 = (class158) arg0;
            var2.field2545 = var2.field2545 + ' ' + arg1;
        } else {
            var2 = new class158(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
    public static void method950(int arg0) {
        field2438 = null;
        if (arg0 != 1370225222) {
            method953((byte) 94, null);
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(III)V")
    private final void method951(int arg0, int arg1, int arg2) {
        field2421++;
        if (this.field2428 != null) {
            int var4 = class171.field2879 - this.field2439;
            if (var4 > 100 && this.field2428.field2370 > 0) {
                int var5 = this.field2428.field2362.length - this.field2428.field2370;
                while (this.field2430 < var5 && var4 > this.field2428.field2361[this.field2430]) {
                    var4 -= this.field2428.field2361[this.field2430];
                    this.field2430++;
                }
                if (this.field2430 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field2428.field2362.length; var7++) {
                        var6 += this.field2428.field2361[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (var4 <= this.field2428.field2361[this.field2430]) {
                            break label62;
                        }
                        class209.method1447(this.field2430, arg0, false, this.field2428, arg2, -2);
                        var4 -= this.field2428.field2361[this.field2430];
                        this.field2430++;
                    } while (this.field2428.field2362.length > this.field2430);
                    this.field2430 -= this.field2428.field2370;
                } while (this.field2430 >= 0 && this.field2428.field2362.length > this.field2430);
                this.field2428 = null;
            }
            this.field2439 = class171.field2879 - var4;
        }
        if (arg1 != -1) {
            this.field2420 = 31;
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "()I")
    public final int method266() {
        field2416++;
        return this.field2433;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2442++;
        class258 var11 = this.method947(-4);
        if (var11 != null) {
            var11.method269(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2433 = var11.method266();
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)I")
    public static final int method952(int arg0, int arg1) {
        field2429++;
        return arg1 == 0 ? arg0 >>> 8 : -93;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BLp;)Lqc;")
    public static final class251 method953(byte arg0, class56 arg1) {
        int var2 = 110 % ((-arg0 - 5) / 46);
        field2436++;
        return new class251(arg1.method338((byte) 3), arg1.method338((byte) -88), arg1.method338((byte) 18), arg1.method338((byte) 115), arg1.method328(-1974), arg1.method367(1));
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)Lpe;")
    private final class258 method954(int arg0, boolean arg1) {
        field2425++;
        boolean var3 = class42.field480 != class203.field3667;
        class145 var4 = class83.method521(this.field2420, (byte) 90);
        if (var4.field2232 != null) {
            var4 = var4.method899(103);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field2417 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field2263;
            var6 = var4.field2278;
        } else {
            var6 = var4.field2263;
            var7 = var4.field2278;
        }
        int var8 = this.field2419 + (var6 + 1 >> 1);
        int var9 = (var6 >> 1) + this.field2419;
        int var10 = -116 / ((39 - arg0) / 35);
        int var11 = (var7 + 1 >> 1) + this.field2431;
        int var12 = (var7 >> 1) + this.field2431;
        this.method951(var12 * 128, -1, var9 * 128);
        boolean var13 = !var3 && var4.field2252 && (this.field2426 != var4.field2244 || this.field2430 != this.field2422 && class159.field2554 >= 2);
        if (arg1 && !var13) {
            return null;
        }
        int var14 = (this.field2419 << 7) + (var6 << 6);
        int[][] var15 = class42.field480[this.field2432];
        int var16 = var15[var9][var11] + var15[var9][var12] + var15[var8][var11] + var15[var8][var12] >> 2;
        int var17 = (this.field2431 << 7) + (var7 << 6);
        int[][] var18 = null;
        if (var3) {
            var18 = class203.field3667[0];
        } else if (this.field2432 < 3) {
            var18 = class42.field480[this.field2432 + 1];
        }
        class33 var19;
        if (this.field2428 == null) {
            var19 = var4.method903(var14, 14213, var16, this.field2418, this.field2441, var15, this.field2417, var18, var17, false, var13);
        } else {
            var19 = var4.method907(var13, var14, var16, var17, -116519677, this.field2428, this.field2430, var18, this.field2441, this.field2418, this.field2417, var15);
        }
        return var19 == null ? null : var19.field407;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(IIIIIIIZLpe;)V")
    public class151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class258 arg8) {
        this.field2417 = arg2;
        this.field2441 = arg1;
        this.field2431 = arg5;
        this.field2432 = arg3;
        this.field2420 = arg0;
        this.field2419 = arg4;
        if (arg6 != -1) {
            this.field2428 = class116.method704(arg6, -10304);
            this.field2439 = class171.field2879 - 1;
            this.field2430 = 0;
            if (this.field2428.field2366 == 0 && arg8 != null && arg8 instanceof class151) {
                class151 var10 = (class151) arg8;
                if (this.field2428 == var10.field2428) {
                    this.field2439 = var10.field2439;
                    this.field2430 = var10.field2430;
                    return;
                }
            }
            if (arg7 && this.field2428.field2370 != -1) {
                this.field2430 = (int) ((double) this.field2428.field2362.length * Math.random());
                this.field2439 -= (int) ((double) this.field2428.field2361[this.field2430] * Math.random());
                return;
            }
        }
    }
}
