import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public abstract class class71 extends class542 {

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
    public int field1330 = -1;

    @OriginalMember(owner = "client!pq", name = "C", descriptor = "Lvda;")
    public class309 field1341;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "[[I")
    public int[][] field1322;

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "[[B")
    private byte[][] field1339;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "[[B")
    private byte[][] field1331;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public int field1323;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public int field1325;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
    public int field1332;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
    public int field1333;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "I")
    public int field1336;

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
    public int field1337;

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
    public int field1338;

    @OriginalMember(owner = "client!pq", name = "B", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "[[Lkaa;")
    public class160[][] field1329;

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "[[Luv;")
    public class3[][] field1335;

    @OriginalMember(owner = "client!pq", name = "D", descriptor = "[[Lmk;")
    public class462[][] field1342;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "[[Ltw;")
    public class535[][] field1326;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 4)
    public final void method686(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field1326 == null) {
            this.field1326 = new class535[super.field7541][super.field7539];
            this.field1329 = new class160[super.field7541][super.field7539];
        } else if (this.field1342 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field7544 != var20 || var21 != 0 && super.field7544 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class160 var22 = new class160();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field2383 = var23;
            var22.field2390 = new short[var23];
            var22.field2385 = new short[var23];
            var22.field2386 = new short[var23];
            var22.field2391 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field2390[var25] = (short) (this.field1339[arg0][arg1] - this.field1331[arg0][arg1]);
                } else if (var30 == 0 && super.field7544 == var31) {
                    var22.field2390[var25] = (short) (this.field1339[arg0][arg1 + 1] - this.field1331[arg0][arg1 + 1]);
                } else if (super.field7544 == var30 && super.field7544 == var31) {
                    var22.field2390[var25] = (short) (this.field1339[arg0 + 1][arg1 + 1] - this.field1331[arg0 + 1][arg1 + 1]);
                } else if (super.field7544 == var30 && var31 == 0) {
                    var22.field2390[var25] = (short) (this.field1339[arg0 + 1][arg1] - this.field1331[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field1339[arg0 + 1][arg1] - this.field1331[arg0 + 1][arg1]) * var30 + (this.field1339[arg0][arg1] - this.field1331[arg0][arg1]) * (super.field7544 - var30);
                    int var33 = (this.field1339[arg0 + 1][arg1 + 1] - this.field1331[arg0 + 1][arg1 + 1]) * var30 + (this.field1339[arg0][arg1 + 1] - this.field1331[arg0][arg1 + 1]) * (super.field7544 - var30);
                    var22.field2390[var25] = (short) ((super.field7544 - var31) * var32 + var31 * var33 >> super.field7537 * 2);
                }
                int var34 = (arg0 << super.field7537) + var30;
                int var35 = (arg1 << super.field7537) + var31;
                var22.field2385[var25] = (short) var30;
                var22.field2391[var25] = (short) var31;
                var22.field2386[var25] = (short) (this.method695(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field2390[var25] < 2) {
                    var22.field2390[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field1341.field2443.method2387((byte) 127, arg11[var28]).field8222) {
                    var26 = true;
                }
            }
            var22.field2382 = new int[var27];
            if (arg10 != null) {
                var22.field2388 = new int[var27];
            }
            var22.field2387 = new short[var27];
            var22.field2381 = new short[var27];
            var22.field2389 = new short[var27];
            if (var26) {
                var22.field2380 = new short[var27];
                var22.field2379 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field2382[var22.field2384] = class153.method1089(-1628372184, arg9[var29]);
                    } else {
                        var22.field2382[var22.field2384] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field2388[var22.field2384] = class153.method1089(-1628372184, arg10[var29]);
                        } else {
                            var22.field2388[var22.field2384] = -1;
                        }
                    }
                    var22.field2387[var22.field2384] = (short) arg6[var29];
                    var22.field2381[var22.field2384] = (short) arg7[var29];
                    var22.field2389[var22.field2384] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field1341.field2443.method2387((byte) 127, arg11[var29]).field8222) {
                            var22.field2380[var22.field2384] = (short) arg11[var29];
                            var22.field2379[var22.field2384] = (short) arg12[var29];
                        } else {
                            var22.field2380[var22.field2384] = -1;
                        }
                    }
                    ++var22.field2384;
                }
            }
            this.field1329[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class535 var36 = new class535();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field7463 = class519.method2936((byte) 86, class153.method1089(-1628372184, arg10[0]), this.field1339[arg0][arg1] - this.field1331[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field7466 = (byte) (var36.field7466 | 2);
                    }
                }
                if (this.field1322[arg0 + 1][arg1] == this.field1322[arg0][arg1] && this.field1322[arg0 + 1][arg1 + 1] == this.field1322[arg0][arg1] && this.field1322[arg0][arg1 + 1] == this.field1322[arg0][arg1]) {
                    var36.field7466 = (byte) (var36.field7466 | 1);
                }
                if (var38 != -1 && (var36.field7466 & 2) == 0 && !this.field1341.field2443.method2387((byte) 127, var38).field8222) {
                    var36.field7467 = (short) (this.field1339[arg0][arg1] - this.field1331[arg0][arg1]);
                    var36.field7468 = (short) (this.field1339[arg0 + 1][arg1] - this.field1331[arg0 + 1][arg1]);
                    var36.field7462 = (short) (this.field1339[arg0 + 1][arg1 + 1] - this.field1331[arg0 + 1][arg1 + 1]);
                    var36.field7465 = (short) (this.field1339[arg0][arg1 + 1] - this.field1331[arg0][arg1 + 1]);
                    var36.field7464 = (short) var38;
                } else {
                    short var39 = class153.method1089(-1628372184, var37);
                    var36.field7467 = (short) class519.method2936((byte) 84, var39, this.field1339[arg0][arg1] - this.field1331[arg0][arg1]);
                    var36.field7468 = (short) class519.method2936((byte) 114, var39, this.field1339[arg0 + 1][arg1] - this.field1331[arg0 + 1][arg1]);
                    var36.field7462 = (short) class519.method2936((byte) 86, var39, this.field1339[arg0 + 1][arg1 + 1] - this.field1331[arg0 + 1][arg1 + 1]);
                    var36.field7465 = (short) class519.method2936((byte) 79, var39, this.field1339[arg0][arg1 + 1] - this.field1331[arg0][arg1 + 1]);
                    var36.field7464 = -1;
                }
                this.field1326[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Luca;[I)V", line = 232)
    public final void method687(class637 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(II)I", line = 238)
    private static final int method689(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lk;IIIIZ)Z", line = 268)
    public final boolean method690(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(III[[ZZ)V", line = 272)
    public final void method691(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class199 var6 = this.field1341.field4513;
        this.field1330 = -1;
        this.field1321 = var6.field2826;
        this.field1325 = var6.field2828;
        this.field1336 = var6.field2827;
        this.field1333 = var6.field2830;
        this.field1340 = var6.field2836;
        this.field1334 = var6.field2825;
        this.field1323 = var6.field2829;
        this.field1337 = var6.field2831;
        this.field1324 = var6.field2833;
        this.field1338 = var6.field2835;
        this.field1332 = var6.field2834;
        this.field1327 = var6.field2832;
    }

    @OriginalMember(owner = "client!pq", name = "X", descriptor = "(IILk;)Lk;", line = 289)
    public final class88 method692(int arg0, int arg1, class88 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!pq", name = "ba", descriptor = "(II)I", line = 295)
    public final int method694(int arg0, int arg1) {
        return this.field1322[arg0][arg1];
    }

    @OriginalMember(owner = "client!pq", name = "aa", descriptor = "(II)I", line = 305)
    public final int method695(int arg0, int arg1) {
        int var3 = arg0 >> super.field7537;
        int var4 = arg1 >> super.field7537;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field7541 - 1 && var4 <= super.field7539 - 1) {
            int var5 = arg0 & super.field7544 - 1;
            int var6 = arg1 & super.field7544 - 1;
            int var7 = (super.field7544 - var5) * this.field1322[var3][var4] + this.field1322[var3 + 1][var4] * var5 >> super.field7537;
            int var8 = (super.field7544 - var5) * this.field1322[var3][var4 + 1] + this.field1322[var3 + 1][var4 + 1] * var5 >> super.field7537;
            return (super.field7544 - var6) * var7 + var6 * var8 >> super.field7537;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pq", name = "ya", descriptor = "(Lk;IIIIZ)V", line = 322)
    public final void method696(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "(Lk;IIIIZ)V", line = 326)
    public final void method697(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!pq", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 330)
    public final void method698(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field1342 == null) {
            this.field1342 = new class462[super.field7541][super.field7539];
            this.field1335 = new class3[super.field7541][super.field7539];
        } else if (this.field1326 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class12.field126[class153.method1089(-1628372184, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class12.field126[class153.method1089(-1628372184, arg7[var16]) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var17 = true;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            if (arg2.length == 6) {
                for (int var22 = 0; var22 < 6; ++var22) {
                    if (arg2[var22] == 0 && arg4[var22] == 0) {
                        if (var18 != -1 && arg6[var18] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var18 = var22;
                    } else if (arg2[var22] == super.field7544 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field7544 && arg4[var22] == super.field7544) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field7544) {
                        if (var21 != -1 && arg6[var21] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var21 = var22;
                    }
                }
                if (var18 == -1 || var19 == -1 || var20 == -1 || var21 == -1) {
                    var17 = false;
                }
                if (var17) {
                    if (arg3 != null) {
                        for (int var23 = 0; var23 < 4; ++var23) {
                            if (arg3[var23] != 0) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                    if (var17) {
                        for (int var24 = 1; var24 < 4; ++var24) {
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field7544 != arg2[var24] && arg2[0] - super.field7544 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field7544 != arg4[var24] && arg4[0] - super.field7544 != arg4[var24]) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var17 = false;
            }
            if (var17) {
                class462 var25 = new class462();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field6691 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field6688 = (byte) (var25.field6688 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field1322[arg0 + 1][arg1] == this.field1322[arg0][arg1] && this.field1322[arg0 + 1][arg1 + 1] == this.field1322[arg0][arg1] && this.field1322[arg0][arg1 + 1] == this.field1322[arg0][arg1]) {
                    var25.field6688 = (byte) (var25.field6688 | 1);
                }
                if (var27 != -1 && (var25.field6688 & 2) == 0 && !this.field1341.field2443.method2387((byte) 127, var27).field8222) {
                    var25.field6689 = this.field1339[arg0][arg1] - this.field1331[arg0][arg1];
                    var25.field6690 = this.field1339[arg0 + 1][arg1] - this.field1331[arg0 + 1][arg1];
                    var25.field6692 = this.field1339[arg0 + 1][arg1 + 1] - this.field1331[arg0 + 1][arg1 + 1];
                    var25.field6687 = this.field1339[arg0][arg1 + 1] - this.field1331[arg0][arg1 + 1];
                    var25.field6683 = (short) var27;
                } else {
                    int var28;
                    if (arg5 != null && arg11 != 0) {
                        var28 = arg5[var18] * 255 / arg11;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var25.field6689 = class481.method2772(method689(arg6[var18] >> 8, this.field1339[arg0][arg1] - this.field1331[arg0][arg1]), var28, arg10, -122);
                    if (var25.field6691 != 0) {
                        var25.field6689 |= 255 - (this.field1339[arg0][arg1] - this.field1331[arg0][arg1]) << 25;
                    }
                    int var29;
                    if (arg5 != null && arg11 != 0) {
                        var29 = arg5[var19] * 255 / arg11;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var25.field6690 = class481.method2772(method689(arg6[var19] >> 8, this.field1339[arg0 + 1][arg1] - this.field1331[arg0 + 1][arg1]), var29, arg10, -121);
                    if (var25.field6691 != 0) {
                        var25.field6690 |= 255 - (this.field1339[arg0 + 1][arg1] - this.field1331[arg0 + 1][arg1]) << 25;
                    }
                    int var30;
                    if (arg5 != null && arg11 != 0) {
                        var30 = arg5[var20] * 255 / arg11;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 > 255) {
                            var30 = 255;
                        }
                    } else {
                        var30 = 0;
                    }
                    var25.field6692 = class481.method2772(method689(arg6[var20] >> 8, this.field1339[arg0 + 1][arg1 + 1] - this.field1331[arg0 + 1][arg1 + 1]), var30, arg10, 52);
                    if (var25.field6691 != 0) {
                        var25.field6692 |= 255 - (this.field1339[arg0 + 1][arg1 + 1] - this.field1331[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var31;
                    if (arg5 != null && arg11 != 0) {
                        var31 = arg5[var21] * 255 / arg11;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 > 255) {
                            var31 = 255;
                        }
                    } else {
                        var31 = 0;
                    }
                    var25.field6687 = class481.method2772(method689(arg6[var21] >> 8, this.field1339[arg0][arg1 + 1] - this.field1331[arg0][arg1 + 1]), var31, arg10, -117);
                    if (var25.field6691 != 0) {
                        var25.field6687 |= 255 - (this.field1339[arg0][arg1 + 1] - this.field1331[arg0][arg1 + 1]) << 25;
                    }
                    var25.field6683 = -1;
                }
                if (arg5 != null) {
                    var25.field6693 = (short) arg5[var20];
                    var25.field6684 = (short) arg5[var21];
                    var25.field6685 = (short) arg5[var19];
                    var25.field6686 = (short) arg5[var18];
                }
                this.field1342[arg0][arg1] = var25;
            } else {
                class3 var32 = new class3();
                var32.field26 = (short) arg2.length;
                var32.field24 = (short) (arg2.length / 3);
                var32.field25 = new short[var32.field26];
                var32.field21 = new short[var32.field26];
                var32.field22 = new short[var32.field26];
                var32.field28 = new int[var32.field26];
                if (arg5 != null) {
                    var32.field30 = new short[var32.field26];
                }
                for (int var33 = 0; var33 < var32.field26; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field1339[arg0][arg1] - this.field1331[arg0][arg1];
                    } else if (var48 == 0 && super.field7544 == var49) {
                        var51 = this.field1339[arg0][arg1 + 1] - this.field1331[arg0][arg1 + 1];
                    } else if (super.field7544 == var48 && super.field7544 == var49) {
                        var51 = this.field1339[arg0 + 1][arg1 + 1] - this.field1331[arg0 + 1][arg1 + 1];
                    } else if (super.field7544 == var48 && var49 == 0) {
                        var51 = this.field1339[arg0 + 1][arg1] - this.field1331[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field1339[arg0 + 1][arg1] - this.field1331[arg0 + 1][arg1]) * var48 + (this.field1339[arg0][arg1] - this.field1331[arg0][arg1]) * (super.field7544 - var48);
                        int var53 = (this.field1339[arg0 + 1][arg1 + 1] - this.field1331[arg0 + 1][arg1 + 1]) * var48 + (this.field1339[arg0][arg1 + 1] - this.field1331[arg0][arg1 + 1]) * (super.field7544 - var48);
                        var51 = (super.field7544 - var49) * var52 + var49 * var53 >> super.field7537 * 2;
                    }
                    int var54 = (arg0 << super.field7537) + var48;
                    int var55 = (arg1 << super.field7537) + var49;
                    var32.field25[var33] = (short) var48;
                    var32.field22[var33] = (short) var49;
                    var32.field21[var33] = (short) (this.method695(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field1341.field2443.method2387((byte) 127, arg8[var33]).field8222) {
                        var32.field28[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field28[var33] = var51 << 25;
                        } else {
                            var32.field28[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field30[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field28[var33] = class481.method2772(method689(arg6[var33] >> 8, var51), var56, arg10, 17);
                        if (arg7 != null) {
                            var32.field28[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field24; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field1341.field2443.method2387((byte) 127, arg8[var35 * 3]).field8222) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field27 = new int[var32.field24];
                }
                if (var34) {
                    var32.field29 = new short[var32.field24];
                    var32.field23 = new short[var32.field24];
                }
                for (int var36 = 0; var36 < var32.field24; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field27[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field1341.field2443.method2387((byte) 127, var42).field8222) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field1341.field2443.method2387((byte) 127, var43).field8222) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field1341.field2443.method2387((byte) 127, var44).field8222) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field29[var36] = (short) var44;
                            var32.field23[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field1341.field2443.method2387((byte) 127, var45).field8222) {
                                    var32.field28[var37] = class12.field126[class153.method1089(-1628372184, this.field1341.field2443.method2387((byte) 127, var45).field8209 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field1341.field2443.method2387((byte) 127, var46).field8222) {
                                    var32.field28[var38] = class12.field126[class153.method1089(-1628372184, this.field1341.field2443.method2387((byte) 127, var46).field8209 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field1341.field2443.method2387((byte) 127, var47).field8222) {
                                    var32.field28[var39] = class12.field126[class153.method1089(-1628372184, this.field1341.field2443.method2387((byte) 127, var47).field8209 & 65535) & 65535];
                                }
                            }
                            var32.field29[var36] = -1;
                        }
                    }
                }
                this.field1335[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lvda;IIII[[I[[II)V", line = 861)
    public class71(class309 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field1341 = arg0;
        this.field1328 = arg2;
        this.field1322 = arg5;
        this.field1339 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field1341.field4477 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field1341.field4508 * var18 + this.field1341.field4504 * var16 + this.field1341.field4494 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field1339[var11][var10] = (byte) var20;
            }
        }
        this.field1331 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!pq", name = "Q", descriptor = "(III)V", line = 829)
    public final void method699(int arg0, int arg1, int arg2) {
        if (this.field1331[arg0][arg1] < arg2) {
            this.field1331[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)Z", line = 835)
    public final boolean method700(int arg0) {
        if ((this.field1328 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!pq", name = "N", descriptor = "()V", line = 855)
    public final void method701() {
        this.field1339 = null;
        this.field1331 = null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V")
    public abstract void method693(int arg0, int arg1);
}
