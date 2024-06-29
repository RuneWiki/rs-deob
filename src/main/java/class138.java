import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class138 {

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "Z")
    private boolean field2198 = false;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    private int field2187 = -1;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    private int field2210 = -1;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "Z")
    private boolean field2196 = false;

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "I")
    private int field2222 = -32768;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public int field2203;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    private int field2201;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    private int field2199;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "B")
    private byte field2189;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "B")
    private byte field2204;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public int field2192;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "Z")
    private boolean field2213;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field2186 = 1407;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "Lpi;")
    public static class342 field2207 = new class342("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
    public static int field2223 = 20;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    private int field2193;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    private int field2194;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    private int field2205;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
    private int field2208;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "Lc;")
    private class121 field2190;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "Lkf;")
    private class165 field2191;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "Lbu;")
    public static class17 field2214;

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "Lqj;")
    public static class351 field2221;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "Lj;")
    private class377 field2212;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "Lwk;")
    public class94 field2200;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "[Z")
    private boolean[] field2219;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V", line = 10)
    private final void method1027(int arg0, int arg1) {
        field2185++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class79 var5 = class319.field4807.method2874(this.field2215, -17045);
            class79 var6 = var5;
            if (var5.field1370 != null) {
                var5 = var5.method631(6574, class335.field5059);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1312 != null) {
                if (this.field2191 != null && var5.method621((byte) 51, this.field2191.field2545)) {
                    return;
                }
                var3 = var5.method636(-23589);
                if (this.field2210 != var5.field1318) {
                    var4 = var5.field1366;
                }
            } else if (var5.field1348 == -1) {
                if (var6 != null && var6.field1312 != null) {
                    if (this.field2191 != null && var6.method621((byte) 100, this.field2191.field2545)) {
                        return;
                    }
                    var3 = var6.method636(-23589);
                    if (this.field2210 != var6.field1318) {
                        var4 = var6.field1366;
                    }
                } else if (var6 != null && var6.field1348 != -1 && this.field2210 != var6.field1318) {
                    var4 = var6.field1366;
                    var3 = var6.field1348;
                }
            } else if (this.field2210 != var5.field1318) {
                var4 = var5.field1366;
                var3 = var5.field1348;
            }
        }
        if (var3 == -1) {
            this.field2191 = null;
        } else if (arg0 > 103) {
            this.field2190 = null;
            if (this.field2191 == null || this.field2191.field2545 != var3) {
                this.field2191 = class431.field6419.method1137(-111, var3);
            } else if (this.field2191.field2553 == 0) {
                return;
            }
            if (this.field2191.field2539 == null) {
                this.field2191 = null;
            } else {
                if (var4) {
                    this.field2193 = (int) ((double) this.field2191.field2539.length * Math.random());
                    this.field2194 = (int) ((double) this.field2191.field2564[this.field2193] * Math.random()) + 1;
                } else {
                    this.field2193 = 0;
                    this.field2194 = 1;
                }
                this.field2205 = this.field2193 + 1;
                if (this.field2205 < 0 || this.field2205 >= this.field2191.field2539.length) {
                    this.field2205 = -1;
                }
                this.field2208 = class531.field7821 - this.field2194;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lqa;B)V", line = 137)
    public final void method1028(class162 arg0, byte arg1) {
        if (this.field2212 != null) {
            class13.method88(this.field2212, this.field2189, this.field2199, this.field2201, this.field2219);
            this.field2219 = null;
            this.field2212 = null;
        }
        if (arg1 > -5) {
            this.field2210 = 39;
        }
        field2211++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 160)
    public static void method1029(int arg0) {
        field2221 = null;
        field2214 = null;
        field2207 = null;
        if (arg0 != 1) {
            method1038(98, null, 96, 87, null, null);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IBLqa;IIZLc;I)V", line = 173)
    public final void method1030(int arg0, byte arg1, class162 arg2, int arg3, int arg4, boolean arg5, class121 arg6, int arg7) {
        field2202++;
        if (arg1 <= 85) {
            this.field2198 = false;
        }
        class26[] var9 = arg6.method893();
        class501[] var10 = arg6.method903();
        if ((this.field2200 == null || this.field2200.field1590) && (var9 != null || var10 != null)) {
            class79 var11 = class319.field4807.method2874(this.field2215, -17045);
            if (var11.field1370 != null) {
                var11 = var11.method631(6574, class335.field5059);
            }
            if (var11 != null) {
                this.field2200 = new class94(class531.field7821);
            }
        }
        if (this.field2200 == null) {
            return;
        }
        if (arg5) {
            this.field2200.method721(arg2, (long) class531.field7821, var9, var10, false);
        } else {
            this.field2200.method723((long) class531.field7821);
        }
        this.field2200.method718(this.field2204, arg3, arg4, arg7, arg0);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V", line = 215)
    public final void method1031(int arg0, int arg1) {
        field2195++;
        if (arg1 == -4) {
            this.field2196 = true;
            this.method1027(104, arg0);
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lqa;Lgm;IIIIIIZI)V", line = 874)
    public class138(class162 arg0, class79 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field2203 = arg2;
        this.field2201 = arg7;
        this.field2215 = arg1.field1318;
        this.field2199 = arg6;
        this.field2189 = (byte) arg5;
        this.field2204 = (byte) arg4;
        this.field2192 = arg3;
        this.field2198 = arg8;
        this.field2213 = arg0.method226() && arg1.field1385 && !this.field2198;
        if (arg9 != -1) {
            this.field2196 = true;
        }
        this.method1027(109, arg9);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Lqa;B)V", line = 235)
    public final void method1032(class162 arg0, byte arg1) {
        field2206++;
        int var3 = -73 % ((arg1 + 67) / 39);
        this.method1033(-4, 262144, true, arg0, this.field2201, true, this.field2199);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIZLqa;IZI)Lc;", line = 250)
    public final class121 method1033(int arg0, int arg1, boolean arg2, class162 arg3, int arg4, boolean arg5, int arg6) {
        field2220++;
        class79 var8 = class319.field4807.method2874(this.field2215, -17045);
        if (var8.field1370 != null) {
            var8 = var8.method631(6574, class335.field5059);
        }
        if (var8 == null) {
            this.method1028(arg3, (byte) -7);
            this.field2187 = this.field2193;
            this.field2210 = -1;
            return null;
        }
        if (!this.field2196 && this.field2210 != var8.field1318) {
            this.field2190 = null;
            this.method1027(110, -1);
        }
        this.method1035((byte) 105, arg6, arg4);
        boolean var9 = arg2 & this.field2213 & class443.field6623.method338(arg0, class169.field2624) != 0;
        boolean var10 = var9 & (this.field2210 != var8.field1318 || (this.field2193 != this.field2187 || this.field2191 != null && (this.field2191.field2543 || class21.field428) && this.field2205 != this.field2193) && class443.field6623.method338(-4, class169.field2624) >= 2);
        if (arg5 && !var10) {
            this.field2210 = var8.field1318;
            this.field2187 = this.field2193;
            return null;
        }
        if (var10) {
            class13.method88(this.field2212, this.field2189, this.field2199, this.field2201, this.field2219);
        }
        class35 var11 = class88.field1546[this.field2189];
        class35 var12;
        if (this.field2198) {
            var12 = class43.field829[0];
        } else {
            var12 = this.field2189 >= 3 ? null : class88.field1546[this.field2189 + 1];
        }
        class121 var13 = null;
        if (this.field2191 != null) {
            if (var10) {
                arg1 |= 0x40000;
            }
            var13 = var8.method634(this.field2203 == 11 ? this.field2192 + 4 : this.field2192, this.field2203 == 11 ? 10 : this.field2203, this.field2191, arg3, -53, this.field2199, this.field2193, var11, var12, this.field2201, var11.method371(this.field2199, this.field2201), arg1, this.field2205, this.field2194);
            if (var13 == null) {
                this.field2212 = null;
                this.field2219 = null;
                this.field2222 = 0;
            } else {
                if (var10) {
                    if (this.field2219 == null) {
                        this.field2219 = new boolean[4];
                    }
                    this.field2212 = var13.method936(this.field2212);
                    class254.method1633(this.field2212, this.field2189, arg6, arg4, this.field2219);
                }
                this.field2222 = var13.method930();
            }
            this.field2190 = null;
        } else if (this.field2190 != null && arg1 == (this.field2190.method889() & arg1) && this.field2210 == var8.field1318) {
            var13 = this.field2190;
        } else {
            if (this.field2190 != null) {
                arg1 |= this.field2190.method889();
            }
            class95 var14 = var8.method625(this.field2199, this.field2201, this.field2203 == 11 ? this.field2192 + 4 : this.field2192, var12, arg1, var10, arg3, var11, this.field2203 == 11 ? 10 : this.field2203, var11.method371(this.field2199, this.field2201), -1);
            if (var14 == null) {
                this.field2222 = 0;
                this.field2190 = null;
                this.field2212 = null;
                this.field2219 = null;
            } else {
                var13 = var14.field1606;
                this.field2190 = var14.field1606;
                if (var10) {
                    this.field2219 = null;
                    this.field2212 = var14.field1602;
                    class254.method1633(this.field2212, this.field2189, arg6, arg4, null);
                }
                this.field2222 = var13.method930();
            }
        }
        this.field2187 = this.field2193;
        this.field2199 = arg6;
        this.field2210 = var8.field1318;
        this.field2201 = arg4;
        return var13;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)Z", line = 377)
    public final boolean method1034(int arg0) {
        if (arg0 != 15361) {
            this.field2193 = 71;
        }
        field2197++;
        return this.field2213;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BII)V", line = 389)
    private final void method1035(byte arg0, int arg1, int arg2) {
        if (arg0 != 105) {
            this.field2198 = false;
        }
        field2216++;
        label92: while (true) {
            if (this.field2191 == null) {
                if (this.field2196) {
                    return;
                }
                this.method1027(118, -1);
                if (this.field2191 == null) {
                    return;
                }
            }
            int var4 = class531.field7821 - this.field2208;
            if (var4 > 100 && this.field2191.field2549 > 0) {
                int var5 = this.field2191.field2539.length - this.field2191.field2549;
                while (this.field2193 < var5 && var4 > this.field2191.field2564[this.field2193]) {
                    var4 -= this.field2191.field2564[this.field2193];
                    this.field2193++;
                }
                if (var5 <= this.field2193) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field2191.field2539.length; var7++) {
                        var6 += this.field2191.field2564[var7];
                    }
                    var4 %= var6;
                }
                this.field2205 = this.field2193 + 1;
                if (this.field2205 >= this.field2191.field2539.length) {
                    this.field2205 -= this.field2191.field2549;
                    if (this.field2205 < 0 || this.field2191.field2539.length <= this.field2205) {
                        this.field2205 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field2191.field2564[this.field2193] >= var4) {
                            this.field2208 = class531.field7821 - var4;
                            this.field2194 = var4;
                            return;
                        }
                        class441.method2642((byte) 69, this.field2193, this.field2191, arg2, false, arg1, this.field2204);
                        var4 -= this.field2191.field2564[this.field2193];
                        this.field2193++;
                        if (this.field2193 >= this.field2191.field2539.length) {
                            this.field2193 -= this.field2191.field2549;
                            if (this.field2193 < 0 || this.field2191.field2539.length <= this.field2193) {
                                this.field2191 = null;
                                continue label92;
                            }
                        }
                        this.field2205 = this.field2193 + 1;
                    } while (this.field2191.field2539.length > this.field2205);
                    this.field2205 -= this.field2191.field2549;
                } while (this.field2205 >= 0 && this.field2205 < this.field2191.field2539.length);
                this.field2205 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIII)V", line = 493)
    public static final void method1036(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2188++;
        class251.method1618(50, arg6);
        int var7 = 0;
        int var8 = arg6 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        if (arg4 != 0) {
            method1036(85, 68, 109, 95, 117, 47, -57);
        }
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class21.field430[arg2];
        int var16 = arg3 - var8;
        int var17 = arg3 + var8;
        class179.method1269(var15, arg1, arg3 - arg6, var16, 26985);
        class179.method1269(var15, arg0, var16, var17, 26985);
        class179.method1269(var15, arg1, var17, arg3 + arg6, 26985);
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class288.field4106[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class21.field430[arg2 + var9];
                    int[] var19 = class21.field430[arg2 - var9];
                    int var20 = class288.field4106[var9];
                    int var21 = arg3 + var7;
                    int var22 = arg3 - var7;
                    int var23 = arg3 + var20;
                    int var24 = arg3 - var20;
                    class179.method1269(var18, arg1, var22, var24, arg4 ^ 0x6969);
                    class179.method1269(var18, arg0, var24, var23, 26985);
                    class179.method1269(var18, arg1, var23, var21, 26985);
                    class179.method1269(var19, arg1, var22, var24, arg4 ^ 0x6969);
                    class179.method1269(var19, arg0, var24, var23, 26985);
                    class179.method1269(var19, arg1, var23, var21, arg4 ^ 0x6969);
                } else {
                    int[] var25 = class21.field430[arg2 + var9];
                    int[] var26 = class21.field430[arg2 - var9];
                    int var27 = arg3 + var7;
                    int var28 = arg3 - var7;
                    class179.method1269(var25, arg1, var28, var27, 26985);
                    class179.method1269(var26, arg1, var28, var27, arg4 + 26985);
                }
            }
            int[] var29 = class21.field430[arg2 + var7];
            int[] var30 = class21.field430[arg2 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var7 >= var8) {
                class179.method1269(var29, arg1, var32, var31, 26985);
                class179.method1269(var30, arg1, var32, var31, 26985);
            } else {
                int var33 = var11 < var7 ? class288.field4106[var7] : var11;
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class179.method1269(var29, arg1, var32, var35, arg4 ^ 0x6969);
                class179.method1269(var29, arg0, var35, var34, 26985);
                class179.method1269(var29, arg1, var34, var31, arg4 ^ 0x6969);
                class179.method1269(var30, arg1, var32, var35, 26985);
                class179.method1269(var30, arg0, var35, var34, 26985);
                class179.method1269(var30, arg1, var34, var31, 26985);
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)I", line = 630)
    public final int method1037(byte arg0) {
        field2217++;
        if (arg0 != 10) {
            method1029(32);
        }
        return this.field2222;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjq;IILgj;Lqa;)Z", line = 647)
    public static final boolean method1038(int arg0, class353 arg1, int arg2, int arg3, class447 arg4, class162 arg5) {
        field2218++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg4.field6680 != null) {
            var7 = class509.field7505 + ((arg1.field5402 + arg4.field6689 - class509.field7512) * (class509.field7509 - class509.field7505) / (class509.field7517 - class509.field7512));
            var8 = class509.field7515 - ((arg1.field5396 + arg4.field6692 - class509.field7514) * (class509.field7515 - class509.field7511) / (class509.field7518 - class509.field7514));
            var9 = class509.field7515 - ((class509.field7515 - class509.field7511) * (arg1.field5396 + arg4.field6714 - class509.field7514) / (class509.field7518 - class509.field7514));
            var6 = (arg1.field5402 + arg4.field6681 - class509.field7512) * (class509.field7509 - class509.field7505) / (class509.field7517 - class509.field7512) + class509.field7505;
        }
        class529 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg4.field6679 != -1) {
            if (arg1.field5399 && arg4.field6687 != -1) {
                var10 = arg4.method2667(arg5, true, -70);
            } else {
                var10 = arg4.method2667(arg5, false, -115);
            }
            if (var10 != null) {
                var11 = arg1.field5398 - (var10.method100() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg1.field5398 + (var10.method100() + 1 >> 1);
                var13 = arg1.field5395 - (var10.method104() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                if (var8 > var13) {
                    var8 = var13;
                }
                var14 = arg1.field5395 + (var10.method104() + 1 >> 1);
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        int var15 = 29 % ((36 - arg0) / 38);
        class351 var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg4.field6674 != null) {
            var16 = class330.method2121(-14146, arg4.field6677);
            if (var16 != null) {
                var17 = class389.field5853.method2134(class41.field737, null, arg4.field6674, 0, null);
                int var24 = arg1.field5395;
                if (var10 == null) {
                    var18 = var24 - var17 * var16.method2232() / 2;
                } else {
                    var18 = var24 - ((var10.method104() >> 1) + (var17 * var16.method2236()));
                }
                for (int var25 = 0; var25 < var17; var25++) {
                    String var26 = class41.field737[var25];
                    if (var25 < (var17 - 1)) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var16.method2234(var26);
                    if (var27 > var19) {
                        var19 = var27;
                    }
                }
                var20 = arg1.field5398 + arg2 - var19 / 2;
                if (var20 < var6) {
                    var6 = var20;
                }
                var21 = var19 / 2 + arg1.field5398 + arg2;
                if (var21 > var7) {
                    var7 = var21;
                }
                var22 = var18 + arg3;
                var23 = arg3 + var16.method2236() * var17 + var18;
                if (var8 > var22) {
                    var8 = var22;
                }
                if (var9 < var23) {
                    var9 = var23;
                }
            }
        }
        if (class509.field7505 > var7 || var6 > class509.field7509 || class509.field7511 > var9 || var8 > class509.field7515) {
            return true;
        }
        if (arg4.field6680 != null) {
            int[] var28 = new int[arg4.field6680.length];
            for (int var29 = 0; var29 < (var28.length / 2); var29++) {
                int var31 = arg4.field6680[var29 * 2] + arg1.field5402;
                int var32 = arg4.field6680[var29 * 2 + 1] + arg1.field5396;
                var28[var29 * 2] = (var31 - class509.field7512) * (class509.field7509 - class509.field7505) / (class509.field7517 - class509.field7512) + class509.field7505;
                var28[var29 * 2 + 1] = class509.field7515 - (var32 - class509.field7514) * (class509.field7515 - class509.field7511) / (class509.field7518 - class509.field7514);
            }
            class235.method1546(arg5, var28, arg4.field6717);
            for (int var30 = 0; var30 < var28.length / 2 - 1; var30++) {
                arg5.method1201(var28[var30 * 2], var28[var30 * 2 + 1], arg4.field6684, var28[var30 * 2 + 2 + 1], true, var28[(var30 + 1) * 2]);
            }
            arg5.method1201(var28[var28.length - 2], var28[var28.length - 1], arg4.field6684, var28[1], true, var28[0]);
        }
        if (var10 != null) {
            if (class443.field6619 > 0 && (class115.field1909 != -1 && class115.field1909 == arg1.field5397 || class528.field7794 != -1 && class528.field7794 == arg4.field6670)) {
                int var33;
                if (class475.field7104 > 50) {
                    var33 = 200 - (class475.field7104 * 2);
                } else {
                    var33 = class475.field7104 * 2;
                }
                int var34 = var33 << 24 | 0xFFFF00;
                arg5.method1195(53, arg1.field5398, var34, arg1.field5395, var10.method96() / 2 + 7);
                arg5.method1195(39, arg1.field5398, var34, arg1.field5395, var10.method96() / 2 + 5);
                arg5.method1195(-106, arg1.field5398, var34, arg1.field5395, var10.method96() / 2 + 3);
                arg5.method1195(64, arg1.field5398, var34, arg1.field5395, var10.method96() / 2 + 1);
                arg5.method1195(76, arg1.field5398, var34, arg1.field5395, var10.method96() / 2);
            }
            var10.method3137(arg1.field5398 - (var10.method100() >> 1), arg1.field5395 - (var10.method104() >> 1));
        }
        if (arg4.field6674 != null && var16 != null) {
            class430.method2575(arg1, arg5, var18, var16, arg4, var17, var19, (byte) -92);
        }
        if (arg4.field6679 != -1 || arg4.field6674 != null) {
            class514 var35 = new class514(arg1);
            var35.field7552 = var21;
            var35.field7560 = var11;
            var35.field7550 = var23;
            var35.field7561 = var22;
            var35.field7557 = var20;
            var35.field7555 = var13;
            var35.field7554 = var12;
            var35.field7551 = var14;
            class329.field4971.method2417(-119, var35);
        }
        return false;
    }

    @OriginalMember(owner = "client!ik", name = "finalize", descriptor = "()V", line = 862)
    protected final void finalize() {
        field2209++;
        if (this.field2200 != null) {
            this.field2200.method720();
        }
    }
}
