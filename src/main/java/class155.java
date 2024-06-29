import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public abstract class class155 extends class136 {

    @OriginalMember(owner = "client!gw", name = "H", descriptor = "I")
    public int field2353 = -1;

    @OriginalMember(owner = "client!gw", name = "E", descriptor = "Lfv;")
    public class107 field2350;

    @OriginalMember(owner = "client!gw", name = "z", descriptor = "I")
    private int field2345;

    @OriginalMember(owner = "client!gw", name = "G", descriptor = "[[I")
    public int[][] field2352;

    @OriginalMember(owner = "client!gw", name = "w", descriptor = "[[B")
    private byte[][] field2342;

    @OriginalMember(owner = "client!gw", name = "F", descriptor = "[[B")
    private byte[][] field2351;

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "I")
    public int field2333;

    @OriginalMember(owner = "client!gw", name = "o", descriptor = "I")
    public int field2334;

    @OriginalMember(owner = "client!gw", name = "p", descriptor = "I")
    public int field2335;

    @OriginalMember(owner = "client!gw", name = "t", descriptor = "I")
    public int field2339;

    @OriginalMember(owner = "client!gw", name = "u", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!gw", name = "v", descriptor = "I")
    public int field2341;

    @OriginalMember(owner = "client!gw", name = "x", descriptor = "I")
    public int field2343;

    @OriginalMember(owner = "client!gw", name = "y", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!gw", name = "A", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!gw", name = "B", descriptor = "I")
    public int field2347;

    @OriginalMember(owner = "client!gw", name = "C", descriptor = "I")
    public int field2348;

    @OriginalMember(owner = "client!gw", name = "D", descriptor = "I")
    public int field2349;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "[[Lvca;")
    public class254[][] field2332;

    @OriginalMember(owner = "client!gw", name = "q", descriptor = "[[Ltl;")
    public class567[][] field2336;

    @OriginalMember(owner = "client!gw", name = "r", descriptor = "[[Log;")
    public class593[][] field2337;

    @OriginalMember(owner = "client!gw", name = "s", descriptor = "[[Lfh;")
    public class596[][] field2338;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public final boolean method276(class271 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(IILw;)Lw;")
    public final class271 method281(int arg0, int arg1, class271 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(III[[ZZ)V")
    public void method271(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class193 var6 = this.field2350.field1439;
        this.field2353 = -1;
        this.field2346 = var6.field2851;
        this.field2344 = var6.field2853;
        this.field2347 = var6.field2854;
        this.field2339 = var6.field2847;
        this.field2349 = var6.field2845;
        this.field2333 = var6.field2848;
        this.field2334 = var6.field2850;
        this.field2335 = var6.field2846;
        this.field2348 = var6.field2856;
        this.field2341 = var6.field2852;
        this.field2343 = var6.field2849;
        this.field2340 = var6.field2855;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lld;[I)V")
    public final void method282(class154 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!gw", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public final void method278(class271 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(II)I")
    private static final int method1086(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!gw", name = "ba", descriptor = "()V")
    public final void method270() {
        this.field2342 = null;
        this.field2351 = null;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
    public abstract void method280(int arg0, int arg1);

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!gw", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public final void method277(class271 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)Z")
    public final boolean method1087(int arg0) {
        if ((this.field2345 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!gw", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method266(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field2336 == null) {
            this.field2336 = new class567[super.field1918][super.field1916];
            this.field2337 = new class593[super.field1918][super.field1916];
        } else if (this.field2338 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class145.field2153[class99.method766(32217, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class145.field2153[class99.method766(32217, arg7[var16]) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field1919 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field1919 && arg4[var22] == super.field1919) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field1919) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field1919 != arg2[var24] && arg2[0] - super.field1919 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field1919 != arg4[var24] && arg4[0] - super.field1919 != arg4[var24]) {
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
                class567 var25 = new class567();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field7635 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field7643 = (byte) (var25.field7643 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field2352[arg0 + 1][arg1] == this.field2352[arg0][arg1] && this.field2352[arg0 + 1][arg1 + 1] == this.field2352[arg0][arg1] && this.field2352[arg0][arg1 + 1] == this.field2352[arg0][arg1]) {
                    var25.field7643 = (byte) (var25.field7643 | 1);
                }
                if (var27 != -1 && (var25.field7643 & 2) == 0 && !this.field2350.field9050.method588(-26679, var27).field3821) {
                    var25.field7637 = this.field2342[arg0][arg1] - this.field2351[arg0][arg1];
                    var25.field7641 = this.field2342[arg0 + 1][arg1] - this.field2351[arg0 + 1][arg1];
                    var25.field7638 = this.field2342[arg0 + 1][arg1 + 1] - this.field2351[arg0 + 1][arg1 + 1];
                    var25.field7636 = this.field2342[arg0][arg1 + 1] - this.field2351[arg0][arg1 + 1];
                    var25.field7633 = (short) var27;
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
                    var25.field7637 = class653.method3634(method1086(arg6[var18] >> 8, this.field2342[arg0][arg1] - this.field2351[arg0][arg1]), 90, arg10, var28);
                    if (var25.field7635 != 0) {
                        var25.field7637 |= 255 - (this.field2342[arg0][arg1] - this.field2351[arg0][arg1]) << 25;
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
                    var25.field7641 = class653.method3634(method1086(arg6[var19] >> 8, this.field2342[arg0 + 1][arg1] - this.field2351[arg0 + 1][arg1]), 81, arg10, var29);
                    if (var25.field7635 != 0) {
                        var25.field7641 |= 255 - (this.field2342[arg0 + 1][arg1] - this.field2351[arg0 + 1][arg1]) << 25;
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
                    var25.field7638 = class653.method3634(method1086(arg6[var20] >> 8, this.field2342[arg0 + 1][arg1 + 1] - this.field2351[arg0 + 1][arg1 + 1]), 44, arg10, var30);
                    if (var25.field7635 != 0) {
                        var25.field7638 |= 255 - (this.field2342[arg0 + 1][arg1 + 1] - this.field2351[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field7636 = class653.method3634(method1086(arg6[var21] >> 8, this.field2342[arg0][arg1 + 1] - this.field2351[arg0][arg1 + 1]), 66, arg10, var31);
                    if (var25.field7635 != 0) {
                        var25.field7636 |= 255 - (this.field2342[arg0][arg1 + 1] - this.field2351[arg0][arg1 + 1]) << 25;
                    }
                    var25.field7633 = -1;
                }
                if (arg5 != null) {
                    var25.field7640 = (short) arg5[var20];
                    var25.field7639 = (short) arg5[var21];
                    var25.field7634 = (short) arg5[var19];
                    var25.field7642 = (short) arg5[var18];
                }
                this.field2336[arg0][arg1] = var25;
            } else {
                class593 var32 = new class593();
                var32.field8250 = (short) arg2.length;
                var32.field8254 = (short) (arg2.length / 3);
                var32.field8252 = new short[var32.field8250];
                var32.field8257 = new short[var32.field8250];
                var32.field8256 = new short[var32.field8250];
                var32.field8258 = new int[var32.field8250];
                if (arg5 != null) {
                    var32.field8259 = new short[var32.field8250];
                }
                for (int var33 = 0; var33 < var32.field8250; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field2342[arg0][arg1] - this.field2351[arg0][arg1];
                    } else if (var48 == 0 && super.field1919 == var49) {
                        var51 = this.field2342[arg0][arg1 + 1] - this.field2351[arg0][arg1 + 1];
                    } else if (super.field1919 == var48 && super.field1919 == var49) {
                        var51 = this.field2342[arg0 + 1][arg1 + 1] - this.field2351[arg0 + 1][arg1 + 1];
                    } else if (super.field1919 == var48 && var49 == 0) {
                        var51 = this.field2342[arg0 + 1][arg1] - this.field2351[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field2342[arg0 + 1][arg1] - this.field2351[arg0 + 1][arg1]) * var48 + (this.field2342[arg0][arg1] - this.field2351[arg0][arg1]) * (super.field1919 - var48);
                        int var53 = (this.field2342[arg0 + 1][arg1 + 1] - this.field2351[arg0 + 1][arg1 + 1]) * var48 + (this.field2342[arg0][arg1 + 1] - this.field2351[arg0][arg1 + 1]) * (super.field1919 - var48);
                        var51 = (super.field1919 - var49) * var52 + var49 * var53 >> super.field1921 * 2;
                    }
                    int var54 = (arg0 << super.field1921) + var48;
                    int var55 = (arg1 << super.field1921) + var49;
                    var32.field8252[var33] = (short) var48;
                    var32.field8256[var33] = (short) var49;
                    var32.field8257[var33] = (short) (this.method267(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field2350.field9050.method588(-26679, arg8[var33]).field3821) {
                        var32.field8258[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field8258[var33] = var51 << 25;
                        } else {
                            var32.field8258[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field8259[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field8258[var33] = class653.method3634(method1086(arg6[var33] >> 8, var51), 55, arg10, var56);
                        if (arg7 != null) {
                            var32.field8258[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field8254; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field2350.field9050.method588(-26679, arg8[var35 * 3]).field3821) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field8251 = new int[var32.field8254];
                }
                if (var34) {
                    var32.field8255 = new short[var32.field8254];
                    var32.field8253 = new short[var32.field8254];
                }
                for (int var36 = 0; var36 < var32.field8254; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field8251[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field2350.field9050.method588(-26679, var42).field3821) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field2350.field9050.method588(-26679, var43).field3821) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field2350.field9050.method588(-26679, var44).field3821) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field8255[var36] = (short) var44;
                            var32.field8253[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field2350.field9050.method588(-26679, var45).field3821) {
                                    var32.field8258[var37] = class145.field2153[class99.method766(32217, this.field2350.field9050.method588(-26679, var45).field3817 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field2350.field9050.method588(-26679, var46).field3821) {
                                    var32.field8258[var38] = class145.field2153[class99.method766(32217, this.field2350.field9050.method588(-26679, var46).field3817 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field2350.field9050.method588(-26679, var47).field3821) {
                                    var32.field8258[var39] = class145.field2153[class99.method766(32217, this.field2350.field9050.method588(-26679, var47).field3817 & 65535) & 65535];
                                }
                            }
                            var32.field8255[var36] = -1;
                        }
                    }
                }
                this.field2337[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "EA", descriptor = "(III)V")
    public final void method272(int arg0, int arg1, int arg2) {
        if (this.field2351[arg0][arg1] < arg2) {
            this.field2351[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!gw", name = "JA", descriptor = "(II)I")
    public final int method273(int arg0, int arg1) {
        return this.field2352[arg0][arg1];
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lfv;IIII[[I[[II)V")
    public class155(class107 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field2350 = arg0;
        this.field2345 = arg2;
        this.field2352 = arg5;
        this.field2342 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field2350.field1460 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field2350.field1441 * var18 + this.field2350.field1458 * var17 + this.field2350.field1449 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field2342[var11][var10] = (byte) var20;
            }
        }
        this.field2351 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!gw", name = "sa", descriptor = "(II)I")
    public final int method267(int arg0, int arg1) {
        int var3 = arg0 >> super.field1921;
        int var4 = arg1 >> super.field1921;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field1918 - 1 && var4 <= super.field1916 - 1) {
            int var5 = arg0 & super.field1919 - 1;
            int var6 = arg1 & super.field1919 - 1;
            int var7 = (super.field1919 - var5) * this.field2352[var3][var4] + this.field2352[var3 + 1][var4] * var5 >> super.field1921;
            int var8 = (super.field1919 - var5) * this.field2352[var3][var4 + 1] + this.field2352[var3 + 1][var4 + 1] * var5 >> super.field1921;
            return (super.field1919 - var6) * var7 + var6 * var8 >> super.field1921;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method275(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field2338 == null) {
            this.field2338 = new class596[super.field1918][super.field1916];
            this.field2332 = new class254[super.field1918][super.field1916];
        } else if (this.field2336 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field1919 != var20 || var21 != 0 && super.field1919 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class254 var22 = new class254();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field3579 = var23;
            var22.field3582 = new short[var23];
            var22.field3578 = new short[var23];
            var22.field3589 = new short[var23];
            var22.field3586 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field3582[var25] = (short) (this.field2342[arg0][arg1] - this.field2351[arg0][arg1]);
                } else if (var30 == 0 && super.field1919 == var31) {
                    var22.field3582[var25] = (short) (this.field2342[arg0][arg1 + 1] - this.field2351[arg0][arg1 + 1]);
                } else if (super.field1919 == var30 && super.field1919 == var31) {
                    var22.field3582[var25] = (short) (this.field2342[arg0 + 1][arg1 + 1] - this.field2351[arg0 + 1][arg1 + 1]);
                } else if (super.field1919 == var30 && var31 == 0) {
                    var22.field3582[var25] = (short) (this.field2342[arg0 + 1][arg1] - this.field2351[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field2342[arg0 + 1][arg1] - this.field2351[arg0 + 1][arg1]) * var30 + (this.field2342[arg0][arg1] - this.field2351[arg0][arg1]) * (super.field1919 - var30);
                    int var33 = (this.field2342[arg0 + 1][arg1 + 1] - this.field2351[arg0 + 1][arg1 + 1]) * var30 + (this.field2342[arg0][arg1 + 1] - this.field2351[arg0][arg1 + 1]) * (super.field1919 - var30);
                    var22.field3582[var25] = (short) ((super.field1919 - var31) * var32 + var31 * var33 >> super.field1921 * 2);
                }
                int var34 = (arg0 << super.field1921) + var30;
                int var35 = (arg1 << super.field1921) + var31;
                var22.field3578[var25] = (short) var30;
                var22.field3586[var25] = (short) var31;
                var22.field3589[var25] = (short) (this.method267(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field3582[var25] < 2) {
                    var22.field3582[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field2350.field9050.method588(-26679, arg11[var28]).field3821) {
                    var26 = true;
                }
            }
            var22.field3581 = new int[var27];
            if (arg10 != null) {
                var22.field3588 = new int[var27];
            }
            var22.field3584 = new short[var27];
            var22.field3585 = new short[var27];
            var22.field3580 = new short[var27];
            if (var26) {
                var22.field3583 = new short[var27];
                var22.field3577 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field3581[var22.field3587] = class99.method766(32217, arg9[var29]);
                    } else {
                        var22.field3581[var22.field3587] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field3588[var22.field3587] = class99.method766(32217, arg10[var29]);
                        } else {
                            var22.field3588[var22.field3587] = -1;
                        }
                    }
                    var22.field3584[var22.field3587] = (short) arg6[var29];
                    var22.field3585[var22.field3587] = (short) arg7[var29];
                    var22.field3580[var22.field3587] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field2350.field9050.method588(-26679, arg11[var29]).field3821) {
                            var22.field3583[var22.field3587] = (short) arg11[var29];
                            var22.field3577[var22.field3587] = (short) arg12[var29];
                        } else {
                            var22.field3583[var22.field3587] = -1;
                        }
                    }
                    ++var22.field3587;
                }
            }
            this.field2332[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class596 var36 = new class596();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field8281 = class643.method3580(this.field2342[arg0][arg1] - this.field2351[arg0][arg1], class99.method766(32217, arg10[0]), 0);
                    if (var37 == -1) {
                        var36.field8280 = (byte) (var36.field8280 | 2);
                    }
                }
                if (this.field2352[arg0 + 1][arg1] == this.field2352[arg0][arg1] && this.field2352[arg0 + 1][arg1 + 1] == this.field2352[arg0][arg1] && this.field2352[arg0][arg1 + 1] == this.field2352[arg0][arg1]) {
                    var36.field8280 = (byte) (var36.field8280 | 1);
                }
                if (var38 != -1 && (var36.field8280 & 2) == 0 && !this.field2350.field9050.method588(-26679, var38).field3821) {
                    var36.field8279 = (short) (this.field2342[arg0][arg1] - this.field2351[arg0][arg1]);
                    var36.field8275 = (short) (this.field2342[arg0 + 1][arg1] - this.field2351[arg0 + 1][arg1]);
                    var36.field8276 = (short) (this.field2342[arg0 + 1][arg1 + 1] - this.field2351[arg0 + 1][arg1 + 1]);
                    var36.field8277 = (short) (this.field2342[arg0][arg1 + 1] - this.field2351[arg0][arg1 + 1]);
                    var36.field8278 = (short) var38;
                } else {
                    short var39 = class99.method766(32217, var37);
                    var36.field8279 = (short) class643.method3580(this.field2342[arg0][arg1] - this.field2351[arg0][arg1], var39, 0);
                    var36.field8275 = (short) class643.method3580(this.field2342[arg0 + 1][arg1] - this.field2351[arg0 + 1][arg1], var39, 0);
                    var36.field8276 = (short) class643.method3580(this.field2342[arg0 + 1][arg1 + 1] - this.field2351[arg0 + 1][arg1 + 1], var39, 0);
                    var36.field8277 = (short) class643.method3580(this.field2342[arg0][arg1 + 1] - this.field2351[arg0][arg1 + 1], var39, 0);
                    var36.field8278 = -1;
                }
                this.field2338[arg0][arg1] = var36;
            }
        }
    }
}
