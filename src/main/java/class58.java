import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class58 extends class327 {

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "Lpk;")
    private class108 field695;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    private int field705;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "[[I")
    public int[][] field692;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "[[I")
    private int[][] field696;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    private int field697;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    private int field690;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "[[B")
    private byte[][] field691;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "[[B")
    private byte[][] field700;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    private int field682;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    private int field683;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    private int field684;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    private int field685;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    private int field686;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    private int field687;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    private int field688;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    private int field689;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    private int field693;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    private int field699;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "I")
    private int field701;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    private int field702;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "[[Lnn;")
    private class238[][] field698;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "[[Lmh;")
    private class378[][] field703;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "[[Lpb;")
    private class395[][] field704;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "[[Lvf;")
    private class83[][] field694;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)I", line = 3)
    public final int method328(int arg0, int arg1) {
        return this.field692[arg0][arg1];
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILmm;)Lmm;", line = 10)
    public final class152 method329(int arg0, int arg1, class152 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(Lmm;IIIIZ)V", line = 12)
    public final void method330(class152 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lqp;[I)V", line = 19)
    public final void method331(class397 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()V", line = 23)
    public final void method332() {
        this.field691 = null;
        this.field700 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lmm;IIIIZ)Z", line = 29)
    public final boolean method333(class152 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)Z", line = 35)
    private final boolean method334(int arg0) {
        if ((this.field705 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III[[ZZ)V", line = 50)
    public final void method335(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class111 var6 = this.field695.field1335;
        this.field685 = var6.field1362;
        this.field687 = var6.field1359;
        this.field683 = var6.field1363;
        this.field699 = var6.field1361;
        this.field686 = var6.field1356;
        this.field702 = var6.field1357;
        this.field689 = var6.field1364;
        this.field684 = var6.field1353;
        this.field701 = var6.field1354;
        this.field688 = var6.field1358;
        this.field693 = var6.field1360;
        this.field682 = var6.field1355;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V", line = 68)
    public final void method336(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        if (this.field704 == null) {
            this.field704 = new class395[super.field4635][super.field4642];
            this.field694 = new class83[super.field4635][super.field4642];
        } else if (this.field698 != null) {
            throw new IllegalStateException();
        }
        boolean var16 = false;
        if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
            var16 = true;
            for (int var17 = 1; var17 < 2; ++var17) {
                int var18 = arg2[arg5[var17]];
                int var19 = arg4[arg5[var17]];
                if (var18 != 0 && this.field697 != var18 || var19 != 0 && this.field697 != var19) {
                    var16 = false;
                    break;
                }
            }
        }
        if (!var16) {
            class83 var20 = new class83();
            short var21 = (short) arg2.length;
            short var22 = (short) arg8.length;
            var20.field962 = var21;
            var20.field953 = new short[var21];
            var20.field964 = new int[var21];
            var20.field954 = new int[var21];
            var20.field958 = new int[var21];
            for (int var23 = 0; var23 < var21; ++var23) {
                int var28 = arg2[var23];
                int var29 = arg4[var23];
                if (var28 == 0 && var29 == 0) {
                    var20.field953[var23] = (short) (this.field691[arg0][arg1] - this.field700[arg0][arg1]);
                } else if (var28 == 0 && this.field697 == var29) {
                    var20.field953[var23] = (short) (this.field691[arg0][arg1 + 1] - this.field700[arg0][arg1 + 1]);
                } else if (this.field697 == var28 && this.field697 == var29) {
                    var20.field953[var23] = (short) (this.field691[arg0 + 1][arg1 + 1] - this.field700[arg0 + 1][arg1 + 1]);
                } else if (this.field697 == var28 && var29 == 0) {
                    var20.field953[var23] = (short) (this.field691[arg0 + 1][arg1] - this.field700[arg0 + 1][arg1]);
                } else {
                    int var30 = (this.field691[arg0 + 1][arg1] - this.field700[arg0 + 1][arg1]) * var28 + (this.field691[arg0][arg1] - this.field700[arg0][arg1]) * (this.field697 - var28);
                    int var31 = (this.field691[arg0 + 1][arg1 + 1] - this.field700[arg0 + 1][arg1 + 1]) * var28 + (this.field691[arg0][arg1 + 1] - this.field700[arg0][arg1 + 1]) * (this.field697 - var28);
                    var20.field953[var23] = (short) ((this.field697 - var29) * var30 + var29 * var31 >> this.field690 * 2);
                }
                int var32 = (arg0 << this.field690) + var28;
                int var33 = (arg1 << this.field690) + var29;
                var20.field964[var23] = var32;
                var20.field958[var23] = var33;
                var20.field954[var23] = this.method342(var32, var33) + (arg3 != null ? arg3[var23] : 0);
                if (var20.field953[var23] < 2) {
                    var20.field953[var23] = 2;
                }
            }
            boolean var24 = false;
            int var25 = 0;
            for (int var26 = 0; var26 < var22; ++var26) {
                if (arg8[var26] >= 0 || arg9 != null && arg9[var26] >= 0) {
                    ++var25;
                }
                if (arg10[var26] != -1 && !this.field695.field1308.method1329((byte) -50, arg10[var26]).field4766) {
                    var24 = true;
                }
            }
            var20.field955 = new int[var25];
            if (arg9 != null) {
                var20.field961 = new int[var25];
            }
            var20.field965 = new short[var25];
            var20.field960 = new short[var25];
            var20.field957 = new short[var25];
            if (var24) {
                var20.field959 = new short[var25];
                var20.field963 = new short[var25];
            }
            for (int var27 = 0; var27 < var22; ++var27) {
                if (arg8[var27] >= 0 || arg9 != null && arg9[var27] >= 0) {
                    if (arg8[var27] >= 0) {
                        var20.field955[var20.field956] = class261.method1747(arg8[var27], (byte) 86);
                    } else {
                        var20.field955[var20.field956] = -1;
                    }
                    if (arg9 != null) {
                        if (arg9[var27] != -1) {
                            var20.field961[var20.field956] = class261.method1747(arg9[var27], (byte) 94);
                        } else {
                            var20.field961[var20.field956] = -1;
                        }
                    }
                    var20.field965[var20.field956] = (short) arg5[var27];
                    var20.field960[var20.field956] = (short) arg6[var27];
                    var20.field957[var20.field956] = (short) arg7[var27];
                    if (var24) {
                        if (arg10[var27] != -1 && !this.field695.field1308.method1329((byte) -17, arg10[var27]).field4766) {
                            var20.field959[var20.field956] = (short) arg10[var27];
                            var20.field963[var20.field956] = (short) arg11[var27];
                        } else {
                            var20.field959[var20.field956] = -1;
                        }
                    }
                    ++var20.field956;
                }
            }
            this.field694[arg0][arg1] = var20;
        } else {
            if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
                class395 var34 = new class395();
                int var35 = arg8[0];
                int var36 = arg10[0];
                if (arg9 != null) {
                    var34.field5569 = class191.method1296((byte) 68, class261.method1747(arg9[0], (byte) 126), this.field691[arg0][arg1] - this.field700[arg0][arg1]);
                    if (var35 == -1) {
                        var34.field5572 = (byte) (var34.field5572 | 2);
                    }
                }
                if (this.field692[arg0 + 1][arg1] == this.field692[arg0][arg1] && this.field692[arg0 + 1][arg1 + 1] == this.field692[arg0][arg1] && this.field692[arg0][arg1 + 1] == this.field692[arg0][arg1]) {
                    var34.field5572 = (byte) (var34.field5572 | 1);
                }
                if (var36 != -1 && (var34.field5572 & 2) == 0 && !this.field695.field1308.method1329((byte) -73, var36).field4766) {
                    var34.field5571 = (short) (this.field691[arg0][arg1] - this.field700[arg0][arg1]);
                    var34.field5570 = (short) (this.field691[arg0 + 1][arg1] - this.field700[arg0 + 1][arg1]);
                    var34.field5568 = (short) (this.field691[arg0 + 1][arg1 + 1] - this.field700[arg0 + 1][arg1 + 1]);
                    var34.field5567 = (short) (this.field691[arg0][arg1 + 1] - this.field700[arg0][arg1 + 1]);
                    var34.field5573 = (short) var36;
                } else {
                    short var37 = class261.method1747(var35, (byte) 101);
                    var34.field5571 = (short) class191.method1296((byte) -57, var37, this.field691[arg0][arg1] - this.field700[arg0][arg1]);
                    var34.field5570 = (short) class191.method1296((byte) -81, var37, this.field691[arg0 + 1][arg1] - this.field700[arg0 + 1][arg1]);
                    var34.field5568 = (short) class191.method1296((byte) -55, var37, this.field691[arg0 + 1][arg1 + 1] - this.field700[arg0 + 1][arg1 + 1]);
                    var34.field5567 = (short) class191.method1296((byte) -76, var37, this.field691[arg0][arg1 + 1] - this.field700[arg0][arg1 + 1]);
                    var34.field5573 = -1;
                }
                this.field704[arg0][arg1] = var34;
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lpk;IIII[[I[[II)V", line = 297)
    public class58(class108 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field695 = arg0;
        this.field705 = arg2;
        this.field692 = arg5;
        this.field696 = arg6;
        this.field697 = arg7;
        this.field690 = 0;
        while (arg7 > 1) {
            ++this.field690;
            arg7 >>= 1;
        }
        this.field691 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field695.field1291 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = this.field692[var11 + 1][var10] - this.field692[var11 - 1][var10];
                int var14 = this.field692[var11][var10 + 1] - this.field692[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field695.field1293 * var18 + this.field695.field1317 * var16 + this.field695.field1297 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field691[var11][var10] = (byte) var20;
            }
        }
        this.field700 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIII[[ZLmp;[I[I)V", line = 359)
    private final void method337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class454 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field6484 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field704[var16][var17] != null) {
                        class395 var18 = this.field704[var16][var17];
                        if (var18.field5573 != -1 && (var18.field5572 & 2) == 0 && var18.field5569 == -1) {
                            int var19 = this.field695.method616(var18.field5573);
                            arg8.method2809(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class191.method1296((byte) 122, var19, var18.field5568 & 65535), class191.method1296((byte) -127, var19, var18.field5567 & 65535), class191.method1296((byte) 64, var19, var18.field5570 & 65535));
                            arg8.method2809(var15, var15, var15 - var13, var14, var13 + var14, var14, class191.method1296((byte) -65, var19, var18.field5571 & 65535), class191.method1296((byte) -70, var19, var18.field5570 & 65535), class191.method1296((byte) -122, var19, var18.field5567 & 65535));
                        } else if (var18.field5569 == -1) {
                            arg8.method2809(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field5568 & 65535, var18.field5567 & 65535, var18.field5570 & 65535);
                            arg8.method2809(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field5571 & 65535, var18.field5570 & 65535, var18.field5567 & 65535);
                        } else {
                            int var20 = var18.field5569;
                            arg8.method2809(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method2809(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field694[var16][var17] != null) {
                        class83 var21 = this.field694[var16][var17];
                        for (int var22 = 0; var22 < var21.field962; ++var22) {
                            arg9[var22] = (var21.field964[var22] - this.field697 * var16) * var13 / this.field697 + var14;
                            arg10[var22] = var15 - (var21.field958[var22] - this.field697 * var17) * var13 / this.field697;
                        }
                        for (int var23 = 0; var23 < var21.field956; ++var23) {
                            short var24 = var21.field965[var23];
                            short var25 = var21.field960[var23];
                            short var26 = var21.field957[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field961 != null && var21.field961[var23] != -1) {
                                int var33 = var21.field961[var23];
                                arg8.method2809(var30, var31, var32, var27, var28, var29, class191.method1296((byte) -61, var33, var21.field953[var24]), class191.method1296((byte) 86, var33, var21.field953[var25]), class191.method1296((byte) -51, var33, var21.field953[var26]));
                            } else if (var21.field959 != null && var21.field959[var23] != -1) {
                                int var34 = this.field695.method616(var21.field959[var23]);
                                arg8.method2809(var30, var31, var32, var27, var28, var29, class191.method1296((byte) -113, var34, var21.field953[var24]), class191.method1296((byte) 61, var34, var21.field953[var25]), class191.method1296((byte) 93, var34, var21.field953[var26]));
                            } else {
                                int var35 = var21.field955[var23];
                                arg8.method2809(var30, var31, var32, var27, var28, var29, class191.method1296((byte) 92, var35, var21.field953[var24]), class191.method1296((byte) 112, var35, var21.field953[var25]), class191.method1296((byte) -60, var35, var21.field953[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field6484 = true;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(IIIIIII[[ZLmp;[I[I)V", line = 490)
    private final void method338(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class454 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field6484 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field698[var16][var17] != null) {
                        class238 var18 = this.field698[var16][var17];
                        if (var18.field3394 != -1 && (var18.field3392 & 2) == 0 && var18.field3393 == 0) {
                            int var19 = this.field695.method616(var18.field3394);
                            arg8.method2809(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class191.method1296((byte) -113, var19, var18.field3395), class191.method1296((byte) -82, var19, var18.field3391), class191.method1296((byte) -118, var19, var18.field3396));
                            arg8.method2809(var15, var15, var15 - var13, var14, var13 + var14, var14, class191.method1296((byte) -61, var19, var18.field3390), class191.method1296((byte) -89, var19, var18.field3396), class191.method1296((byte) 93, var19, var18.field3391));
                        } else if (var18.field3393 == 0) {
                            arg8.method2806(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field3395, var18.field3391, var18.field3396);
                            arg8.method2806(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field3390, var18.field3396, var18.field3391);
                        } else {
                            int var20 = var18.field3393;
                            arg8.method2806(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class65.method368(var18.field3395 & -16777216, 91, var20), class65.method368(var18.field3391 & -16777216, 93, var20), class65.method368(var18.field3396 & -16777216, 103, var20));
                            arg8.method2806(var15, var15, var15 - var13, var14, var13 + var14, var14, class65.method368(var18.field3390 & -16777216, 119, var20), class65.method368(var18.field3396 & -16777216, 88, var20), class65.method368(var18.field3391 & -16777216, 89, var20));
                        }
                    } else if (this.field703[var16][var17] != null) {
                        class378 var21 = this.field703[var16][var17];
                        for (int var22 = 0; var22 < var21.field5327; ++var22) {
                            arg9[var22] = (var21.field5335[var22] - this.field697 * var16) * var13 / this.field697 + var14;
                            arg10[var22] = var15 - (var21.field5333[var22] - this.field697 * var17) * var13 / this.field697;
                        }
                        for (int var23 = 0; var23 < var21.field5330; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field5326 != null && var21.field5326[var23] != 0 && (var21.field5329 == null || var21.field5329 != null && var21.field5329[var23] == -1)) {
                                int var33 = var21.field5326[var23];
                                arg8.method2806(var30, var31, var32, var27, var28, var29, class65.method368(-16777216 - (var21.field5331[var24] & -16777216), 112, var33), class65.method368(-16777216 - (var21.field5331[var25] & -16777216), 83, var33), class65.method368(-16777216 - (var21.field5331[var26] & -16777216), 119, var33));
                            } else if (var21.field5329 != null && var21.field5329[var23] != -1) {
                                int var34 = this.field695.method616(var21.field5329[var23]);
                                arg8.method2809(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method2806(var30, var31, var32, var27, var28, var29, var21.field5331[var24], var21.field5331[var25], var21.field5331[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field6484 = true;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(Lmm;IIIIZ)V", line = 617)
    public final void method339(class152 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILmp;[I[I[I)V", line = 621)
    private final void method340(int arg0, int arg1, class454 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class395 var7 = this.field704[arg0][arg1];
        if (var7 != null) {
            if ((var7.field5572 & 2) == 0) {
                int var8 = this.field697 * arg0;
                int var9 = this.field697 + var8;
                int var10 = this.field697 * arg1;
                int var11 = this.field697 + var10;
                int var14;
                int var15;
                int var17;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                if ((var7.field5572 & 1) != 0) {
                    int var12 = this.field692[arg0][arg1];
                    int var13 = this.field688 * var12;
                    var14 = (this.field693 * var10 + this.field701 * var8 + var13 >> 15) + this.field682;
                    if (var14 <= this.field695.field1298) {
                        return;
                    }
                    var15 = (this.field693 * var10 + this.field701 * var9 + var13 >> 15) + this.field682;
                    if (var15 <= this.field695.field1298) {
                        return;
                    }
                    int var16 = (this.field693 * var11 + this.field701 * var9 + var13 >> 15) + this.field682;
                    if (var16 <= this.field695.field1298) {
                        return;
                    }
                    var17 = (this.field693 * var11 + this.field701 * var8 + var13 >> 15) + this.field682;
                    if (var17 <= this.field695.field1298) {
                        return;
                    }
                    int var18 = this.field687 * var12;
                    int var19 = this.field702 * var12;
                    var20 = (this.field683 * var10 + this.field685 * var8 + var18 >> 15) + this.field699;
                    var21 = this.field695.field1302 * var20 / var14 + arg2.field6487;
                    var22 = (this.field689 * var10 + this.field686 * var8 + var19 >> 15) + this.field684;
                    var23 = this.field695.field1316 * var22 / var14 + arg2.field6483;
                    var24 = (this.field683 * var10 + this.field685 * var9 + var18 >> 15) + this.field699;
                    var25 = this.field695.field1302 * var24 / var15 + arg2.field6487;
                    var26 = (this.field689 * var10 + this.field686 * var9 + var19 >> 15) + this.field684;
                    var27 = this.field695.field1316 * var26 / var15 + arg2.field6483;
                    int var28 = (this.field683 * var11 + this.field685 * var9 + var18 >> 15) + this.field699;
                    var29 = this.field695.field1302 * var28 / var16 + arg2.field6487;
                    int var30 = (this.field689 * var11 + this.field686 * var9 + var19 >> 15) + this.field684;
                    var31 = this.field695.field1316 * var30 / var16 + arg2.field6483;
                    var32 = (this.field683 * var11 + this.field685 * var8 + var18 >> 15) + this.field699;
                    var33 = this.field695.field1302 * var32 / var17 + arg2.field6487;
                    var34 = (this.field689 * var11 + this.field686 * var8 + var19 >> 15) + this.field684;
                    var35 = this.field695.field1316 * var34 / var17 + arg2.field6483;
                } else {
                    int var36 = this.field692[arg0][arg1];
                    int var37 = this.field692[arg0 + 1][arg1];
                    int var38 = this.field692[arg0 + 1][arg1 + 1];
                    int var39 = this.field692[arg0][arg1 + 1];
                    var14 = (this.field693 * var10 + this.field701 * var8 + this.field688 * var36 >> 15) + this.field682;
                    if (var14 <= this.field695.field1298) {
                        return;
                    }
                    var15 = (this.field693 * var10 + this.field701 * var9 + this.field688 * var37 >> 15) + this.field682;
                    if (var15 <= this.field695.field1298) {
                        return;
                    }
                    int var40 = (this.field693 * var11 + this.field701 * var9 + this.field688 * var38 >> 15) + this.field682;
                    if (var40 <= this.field695.field1298) {
                        return;
                    }
                    var17 = (this.field693 * var11 + this.field701 * var8 + this.field688 * var39 >> 15) + this.field682;
                    if (var17 <= this.field695.field1298) {
                        return;
                    }
                    var20 = (this.field683 * var10 + this.field687 * var36 + this.field685 * var8 >> 15) + this.field699;
                    var21 = this.field695.field1302 * var20 / var14 + arg2.field6487;
                    var22 = (this.field689 * var10 + this.field702 * var36 + this.field686 * var8 >> 15) + this.field684;
                    var23 = this.field695.field1316 * var22 / var14 + arg2.field6483;
                    var24 = (this.field683 * var10 + this.field687 * var37 + this.field685 * var9 >> 15) + this.field699;
                    var25 = this.field695.field1302 * var24 / var15 + arg2.field6487;
                    var26 = (this.field689 * var10 + this.field702 * var37 + this.field686 * var9 >> 15) + this.field684;
                    var27 = this.field695.field1316 * var26 / var15 + arg2.field6483;
                    int var41 = (this.field683 * var11 + this.field687 * var38 + this.field685 * var9 >> 15) + this.field699;
                    var29 = this.field695.field1302 * var41 / var40 + arg2.field6487;
                    int var42 = (this.field689 * var11 + this.field702 * var38 + this.field686 * var9 >> 15) + this.field684;
                    var31 = this.field695.field1316 * var42 / var40 + arg2.field6483;
                    var32 = (this.field683 * var11 + this.field687 * var39 + this.field685 * var8 >> 15) + this.field699;
                    var33 = this.field695.field1302 * var32 / var17 + arg2.field6487;
                    var34 = (this.field689 * var11 + this.field702 * var39 + this.field686 * var8 >> 15) + this.field684;
                    var35 = this.field695.field1316 * var34 / var17 + arg2.field6483;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field6489 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field6480 || var33 > arg2.field6480 || var25 > arg2.field6480;
                    if (var7.field5573 >= 0) {
                        if (this.method334(this.field695.field1308.method1329((byte) -18, var7.field5573).field4770)) {
                            arg2.field6491 = 100;
                        }
                        arg2.method2813(var31, var35, var27, var29, var33, var25, var7.field5568 & 65535, var7.field5567 & 65535, var7.field5570 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5573);
                        arg2.field6491 = 0;
                    } else {
                        arg2.method2809(var31, var35, var27, var29, var33, var25, var7.field5568 & 65535, var7.field5567 & 65535, var7.field5570 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field6489 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field6480 || var25 > arg2.field6480 || var33 > arg2.field6480;
                    if (var7.field5573 >= 0) {
                        if (this.method334(this.field695.field1308.method1329((byte) -92, var7.field5573).field4770)) {
                            arg2.field6491 = 100;
                        }
                        arg2.method2813(var23, var27, var35, var21, var25, var33, var7.field5571 & 65535, var7.field5570 & 65535, var7.field5567 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5573);
                        arg2.field6491 = 0;
                        return;
                    }
                    arg2.method2809(var23, var27, var35, var21, var25, var33, var7.field5571 & 65535, var7.field5570 & 65535, var7.field5567 & 65535);
                }
            }
        } else {
            class83 var43 = this.field694[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field962; ++var44) {
                    int var84 = var43.field964[var44];
                    int var85 = var43.field954[var44];
                    int var86 = var43.field958[var44];
                    int var87 = (this.field693 * var86 + this.field701 * var84 + this.field688 * var85 >> 15) + this.field682;
                    if (var87 <= this.field695.field1298) {
                        return;
                    }
                    int var88 = (this.field683 * var86 + this.field687 * var85 + this.field685 * var84 >> 15) + this.field699;
                    int var89 = (this.field689 * var86 + this.field702 * var85 + this.field686 * var84 >> 15) + this.field684;
                    arg3[var44] = this.field695.field1302 * var88 / var87 + arg2.field6487;
                    arg4[var44] = this.field695.field1316 * var89 / var87 + arg2.field6483;
                }
                if (var43.field959 != null) {
                    int var45 = this.field692[arg0][arg1];
                    int var46 = this.field692[arg0 + 1][arg1];
                    int var47 = this.field692[arg0][arg1 + 1];
                    int var48 = this.field697 * arg0;
                    int var49 = this.field697 + var48;
                    int var50 = this.field697 * arg1;
                    int var51 = this.field697 + var50;
                    int var52 = (this.field683 * var50 + this.field687 * var45 + this.field685 * var48 >> 15) + this.field699;
                    int var53 = (this.field689 * var50 + this.field702 * var45 + this.field686 * var48 >> 15) + this.field684;
                    int var54 = (this.field693 * var50 + this.field701 * var48 + this.field688 * var45 >> 15) + this.field682;
                    int var55 = (this.field683 * var50 + this.field687 * var46 + this.field685 * var49 >> 15) + this.field699;
                    int var56 = (this.field689 * var50 + this.field702 * var46 + this.field686 * var49 >> 15) + this.field684;
                    int var57 = (this.field693 * var50 + this.field701 * var49 + this.field688 * var46 >> 15) + this.field682;
                    int var58 = (this.field683 * var51 + this.field687 * var47 + this.field685 * var48 >> 15) + this.field699;
                    int var59 = (this.field689 * var51 + this.field702 * var47 + this.field686 * var48 >> 15) + this.field684;
                    int var60 = (this.field693 * var51 + this.field701 * var48 + this.field688 * var47 >> 15) + this.field682;
                    for (int var61 = 0; var61 < var43.field956; ++var61) {
                        short var62 = var43.field965[var61];
                        short var63 = var43.field960[var61];
                        short var64 = var43.field957[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field6489 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field6480 || var66 > arg2.field6480 || var67 > arg2.field6480;
                            short var71 = var43.field959[var61];
                            if (var71 != -1) {
                                if (this.method334(this.field695.field1308.method1329((byte) -37, var71).field4770)) {
                                    arg2.field6491 = 100;
                                }
                                arg2.method2813(var68, var69, var70, var65, var66, var67, var43.field953[var62], var43.field953[var63], var43.field953[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field6491 = 0;
                            } else {
                                int var72 = var43.field955[var61];
                                if (var72 != -1) {
                                    arg2.method2809(var68, var69, var70, var65, var66, var67, class191.method1296((byte) -101, var72, var43.field953[var62]), class191.method1296((byte) -123, var72, var43.field953[var63]), class191.method1296((byte) 107, var72, var43.field953[var64]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field956; ++var73) {
                    short var74 = var43.field965[var73];
                    short var75 = var43.field960[var73];
                    short var76 = var43.field957[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field955[var73];
                        if (var83 != -1) {
                            arg2.field6489 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field6480 || var78 > arg2.field6480 || var79 > arg2.field6480;
                            arg2.method2809(var80, var81, var82, var77, var78, var79, class191.method1296((byte) 64, var83, var43.field953[var74]), class191.method1296((byte) -73, var83, var43.field953[var75]), class191.method1296((byte) -105, var83, var43.field953[var76]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)V", line = 938)
    public final void method341(int arg0, int arg1, int arg2) {
        if (this.field700[arg0][arg1] < arg2) {
            this.field700[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(II)I", line = 946)
    public final int method342(int arg0, int arg1) {
        int var3 = arg0 >> this.field690;
        int var4 = arg1 >> this.field690;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field4635 - 1 && var4 <= super.field4642 - 1) {
            int var5 = arg0 & this.field697 - 1;
            int var6 = arg1 & this.field697 - 1;
            int var7 = (this.field697 - var5) * this.field692[var3][var4] + this.field692[var3 + 1][var4] * var5 >> this.field690;
            int var8 = (this.field697 - var5) * this.field692[var3][var4 + 1] + this.field692[var3 + 1][var4 + 1] * var5 >> this.field690;
            return (this.field697 - var6) * var7 + var6 * var8 >> this.field690;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIII[[Z)V", line = 964)
    public final void method343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class71 var9 = this.field695.method661(Thread.currentThread());
        class454 var10 = var9.field814;
        var10.field6491 = 0;
        var10.field6489 = false;
        if (this.field698 != null) {
            this.method338(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field849, var9.field848);
        } else {
            if (this.field704 != null) {
                this.method337(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field849, var9.field848);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIZLmp;[I[I[I)V", line = 979)
    private final void method344(int arg0, int arg1, boolean arg2, class454 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class238 var8 = this.field698[arg0][arg1];
        if (var8 != null) {
            if ((var8.field3392 & 2) == 0) {
                int var9 = this.field697 * arg0;
                int var10 = this.field697 + var9;
                int var11 = this.field697 * arg1;
                int var12 = this.field697 + var11;
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var29;
                int var30;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                if ((var8.field3392 & 1) != 0 && !arg2) {
                    int var17 = this.field692[arg0][arg1];
                    int var18 = this.field688 * var17;
                    var19 = (this.field693 * var11 + this.field701 * var9 + var18 >> 15) + this.field682;
                    if (var19 <= this.field695.field1298) {
                        return;
                    }
                    var20 = (this.field693 * var11 + this.field701 * var10 + var18 >> 15) + this.field682;
                    if (var20 <= this.field695.field1298) {
                        return;
                    }
                    var21 = (this.field693 * var12 + this.field701 * var10 + var18 >> 15) + this.field682;
                    if (var21 <= this.field695.field1298) {
                        return;
                    }
                    var22 = (this.field693 * var12 + this.field701 * var9 + var18 >> 15) + this.field682;
                    if (var22 <= this.field695.field1298) {
                        return;
                    }
                    if (this.field695.field1310) {
                        int var23 = var19 - this.field695.field1296;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field695.field1296;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field695.field1296;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field695.field1296;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field687 * var17;
                    int var28 = this.field702 * var17;
                    var29 = (this.field683 * var11 + this.field685 * var9 + var27 >> 15) + this.field699;
                    var30 = this.field695.field1302 * var29 / var19 + arg3.field6487;
                    var31 = (this.field689 * var11 + this.field686 * var9 + var28 >> 15) + this.field684;
                    var32 = this.field695.field1316 * var31 / var19 + arg3.field6483;
                    var33 = (this.field683 * var11 + this.field685 * var10 + var27 >> 15) + this.field699;
                    var34 = this.field695.field1302 * var33 / var20 + arg3.field6487;
                    var35 = (this.field689 * var11 + this.field686 * var10 + var28 >> 15) + this.field684;
                    var36 = this.field695.field1316 * var35 / var20 + arg3.field6483;
                    var37 = (this.field683 * var12 + this.field685 * var10 + var27 >> 15) + this.field699;
                    var38 = this.field695.field1302 * var37 / var21 + arg3.field6487;
                    var39 = (this.field689 * var12 + this.field686 * var10 + var28 >> 15) + this.field684;
                    var40 = this.field695.field1316 * var39 / var21 + arg3.field6483;
                    var41 = (this.field683 * var12 + this.field685 * var9 + var27 >> 15) + this.field699;
                    var42 = this.field695.field1302 * var41 / var22 + arg3.field6487;
                    var43 = (this.field689 * var12 + this.field686 * var9 + var28 >> 15) + this.field684;
                    var44 = this.field695.field1316 * var43 / var22 + arg3.field6483;
                } else {
                    int var45 = this.field692[arg0][arg1];
                    int var46 = this.field692[arg0 + 1][arg1];
                    int var47 = this.field692[arg0 + 1][arg1 + 1];
                    int var48 = this.field692[arg0][arg1 + 1];
                    var19 = (this.field693 * var11 + this.field701 * var9 + this.field688 * var45 >> 15) + this.field682;
                    if (var19 <= this.field695.field1298) {
                        return;
                    }
                    var20 = (this.field693 * var11 + this.field701 * var10 + this.field688 * var46 >> 15) + this.field682;
                    if (var20 <= this.field695.field1298) {
                        return;
                    }
                    var21 = (this.field693 * var12 + this.field701 * var10 + this.field688 * var47 >> 15) + this.field682;
                    if (var21 <= this.field695.field1298) {
                        return;
                    }
                    var22 = (this.field693 * var12 + this.field701 * var9 + this.field688 * var48 >> 15) + this.field682;
                    if (var22 <= this.field695.field1298) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field695.field1296;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = this.field696[arg0][arg1] * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field695.field1296;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = this.field696[arg0 + 1][arg1] * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field695.field1296;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = this.field696[arg0 + 1][arg1 + 1] * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field695.field1296;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = this.field696[arg0][arg1 + 1] * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field695.field1310) {
                        int var57 = var19 - this.field695.field1296;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field695.field1296;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field695.field1296;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field695.field1296;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field683 * var11 + this.field687 * var45 + this.field685 * var9 >> 15) + this.field699;
                    var30 = this.field695.field1302 * var29 / var19 + arg3.field6487;
                    var31 = (this.field689 * var11 + this.field702 * var45 + this.field686 * var9 >> 15) + this.field684;
                    var32 = this.field695.field1316 * var31 / var19 + arg3.field6483;
                    var33 = (this.field683 * var11 + this.field687 * var46 + this.field685 * var10 >> 15) + this.field699;
                    var34 = this.field695.field1302 * var33 / var20 + arg3.field6487;
                    var35 = (this.field689 * var11 + this.field702 * var46 + this.field686 * var10 >> 15) + this.field684;
                    var36 = this.field695.field1316 * var35 / var20 + arg3.field6483;
                    var37 = (this.field683 * var12 + this.field687 * var47 + this.field685 * var10 >> 15) + this.field699;
                    var38 = this.field695.field1302 * var37 / var21 + arg3.field6487;
                    var39 = (this.field689 * var12 + this.field702 * var47 + this.field686 * var10 >> 15) + this.field684;
                    var40 = this.field695.field1316 * var39 / var21 + arg3.field6483;
                    var41 = (this.field683 * var12 + this.field687 * var48 + this.field685 * var9 >> 15) + this.field699;
                    var42 = this.field695.field1302 * var41 / var22 + arg3.field6487;
                    var43 = (this.field689 * var12 + this.field702 * var48 + this.field686 * var9 >> 15) + this.field684;
                    var44 = this.field695.field1316 * var43 / var22 + arg3.field6483;
                }
                boolean var61 = var8.field3394 != -1 && this.method334(this.field695.field1308.method1329((byte) -78, var8.field3394).field4770);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field6489 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field6480 || var42 > arg3.field6480 || var34 > arg3.field6480;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field6491 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field3394 >= 0) {
                                arg3.method2811(var40, var44, var36, var38, var42, var34, this.field695.field1333, var15, var16, var14, var8.field3395, var8.field3391, var8.field3396, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field3394);
                            } else {
                                arg3.method2806(var40, var44, var36, var38, var42, var34, class65.method368(var15 << 24 | this.field695.field1333, 92, var8.field3395), class65.method368(var16 << 24 | this.field695.field1333, 68, var8.field3391), class65.method368(var14 << 24 | this.field695.field1333, 94, var8.field3396));
                            }
                        } else if (var8.field3394 >= 0) {
                            arg3.method2813(var40, var44, var36, var38, var42, var34, var8.field3395, var8.field3391, var8.field3396, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field3394);
                        } else {
                            arg3.method2806(var40, var44, var36, var38, var42, var34, var8.field3395, var8.field3391, var8.field3396);
                        }
                        arg3.field6491 = 0;
                    } else {
                        arg3.method2808(var40, var44, var36, var38, var42, var34, this.field695.field1333);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field6489 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field6480 || var34 > arg3.field6480 || var42 > arg3.field6480;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field6491 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field3394 >= 0) {
                                arg3.method2811(var32, var36, var44, var30, var34, var42, this.field695.field1333, var13, var14, var16, var8.field3390, var8.field3396, var8.field3391, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field3394);
                            } else {
                                arg3.method2806(var32, var36, var44, var30, var34, var42, class65.method368(var13 << 24 | this.field695.field1333, 109, var8.field3390), class65.method368(var14 << 24 | this.field695.field1333, 113, var8.field3396), class65.method368(var16 << 24 | this.field695.field1333, 87, var8.field3391));
                            }
                        } else if (var8.field3394 >= 0) {
                            arg3.method2813(var32, var36, var44, var30, var34, var42, var8.field3390, var8.field3396, var8.field3391, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field3394);
                        } else {
                            arg3.method2806(var32, var36, var44, var30, var34, var42, var8.field3390, var8.field3396, var8.field3391);
                        }
                        arg3.field6491 = 0;
                        return;
                    }
                    arg3.method2808(var32, var36, var44, var30, var34, var42, this.field695.field1333);
                }
            }
        } else {
            class378 var64 = this.field703[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field5327; ++var65) {
                    short var105 = var64.field5335[var65];
                    int var106 = var64.field5334[var65];
                    short var107 = var64.field5333[var65];
                    int var108 = (this.field693 * var107 + this.field701 * var105 + this.field688 * var106 >> 15) + this.field682;
                    if (var108 <= this.field695.field1298) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field695.field1296;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field5328[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field695.field1310) {
                        int var111 = var108 - this.field695.field1296;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field683 * var107 + this.field687 * var106 + this.field685 * var105 >> 15) + this.field699;
                    int var113 = (this.field689 * var107 + this.field702 * var106 + this.field686 * var105 >> 15) + this.field684;
                    arg4[var65] = this.field695.field1302 * var112 / var108 + arg3.field6487;
                    arg5[var65] = this.field695.field1316 * var113 / var108 + arg3.field6483;
                }
                if (var64.field5329 != null) {
                    int var66 = this.field692[arg0][arg1];
                    int var67 = this.field692[arg0 + 1][arg1];
                    int var68 = this.field692[arg0][arg1 + 1];
                    int var69 = this.field697 * arg0;
                    int var70 = this.field697 + var69;
                    int var71 = this.field697 * arg1;
                    int var72 = this.field697 + var71;
                    int var73 = (this.field683 * var71 + this.field687 * var66 + this.field685 * var69 >> 15) + this.field699;
                    int var74 = (this.field689 * var71 + this.field702 * var66 + this.field686 * var69 >> 15) + this.field684;
                    int var75 = (this.field693 * var71 + this.field701 * var69 + this.field688 * var66 >> 15) + this.field682;
                    int var76 = (this.field683 * var71 + this.field687 * var67 + this.field685 * var70 >> 15) + this.field699;
                    int var77 = (this.field689 * var71 + this.field702 * var67 + this.field686 * var70 >> 15) + this.field684;
                    int var78 = (this.field693 * var71 + this.field701 * var70 + this.field688 * var67 >> 15) + this.field682;
                    int var79 = (this.field683 * var72 + this.field687 * var68 + this.field685 * var69 >> 15) + this.field699;
                    int var80 = (this.field689 * var72 + this.field702 * var68 + this.field686 * var69 >> 15) + this.field684;
                    int var81 = (this.field693 * var72 + this.field701 * var69 + this.field688 * var68 >> 15) + this.field682;
                    for (int var82 = 0; var82 < var64.field5330; ++var82) {
                        int var83 = var82 * 3;
                        int var84 = var83 + 1;
                        int var85 = var84 + 1;
                        int var86 = arg4[var83];
                        int var87 = arg4[var84];
                        int var88 = arg4[var85];
                        int var89 = arg5[var83];
                        int var90 = arg5[var84];
                        int var91 = arg5[var85];
                        int var92 = arg6[var83] + arg6[var84] + arg6[var85];
                        if ((var86 - var87) * (var91 - var90) - (var88 - var87) * (var89 - var90) > 0) {
                            arg3.field6489 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field6480 || var87 > arg3.field6480 || var88 > arg3.field6480;
                            short var93 = var64.field5329[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method334(this.field695.field1308.method1329((byte) -30, var93).field4770)) {
                                    arg3.field6491 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method2811(var89, var90, var91, var86, var87, var88, this.field695.field1333, arg6[var83], arg6[var84], arg6[var85], var64.field5331[var83], var64.field5331[var84], var64.field5331[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field5331[var83] & 16777215) != 0) {
                                        arg3.method2806(var89, var90, var91, var86, var87, var88, class65.method368(arg6[var83] << 24 | this.field695.field1333, 76, var64.field5331[var83]), class65.method368(arg6[var84] << 24 | this.field695.field1333, 106, var64.field5331[var84]), class65.method368(arg6[var85] << 24 | this.field695.field1333, 89, var64.field5331[var85]));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method2813(var89, var90, var91, var86, var87, var88, var64.field5331[var83], var64.field5331[var84], var64.field5331[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field5331[var83] & 16777215) != 0) {
                                    arg3.method2806(var89, var90, var91, var86, var87, var88, var64.field5331[var83], var64.field5331[var84], var64.field5331[var85]);
                                }
                                arg3.field6491 = 0;
                            } else {
                                arg3.method2808(var89, var90, var91, var86, var87, var88, this.field695.field1333);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field5330; ++var94) {
                    int var95 = var94 * 3;
                    int var96 = var95 + 1;
                    int var97 = var96 + 1;
                    int var98 = arg4[var95];
                    int var99 = arg4[var96];
                    int var100 = arg4[var97];
                    int var101 = arg5[var95];
                    int var102 = arg5[var96];
                    int var103 = arg5[var97];
                    int var104 = arg6[var95] + arg6[var96] + arg6[var97];
                    if ((var98 - var99) * (var103 - var102) - (var100 - var99) * (var101 - var102) > 0) {
                        arg3.field6489 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field6480 || var99 > arg3.field6480 || var100 > arg3.field6480;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field5331[var95] & 16777215) != 0) {
                                    arg3.method2806(var101, var102, var103, var98, var99, var100, class334.method2162((byte) 85, arg6[var95], this.field695.field1333, var64.field5331[var95]), class334.method2162((byte) 102, arg6[var96], this.field695.field1333, var64.field5331[var96]), class334.method2162((byte) 8, arg6[var97], this.field695.field1333, var64.field5331[var97]));
                                }
                            } else if ((var64.field5331[var95] & 16777215) != 0) {
                                arg3.method2806(var101, var102, var103, var98, var99, var100, var64.field5331[var95], var64.field5331[var96], var64.field5331[var97]);
                            }
                        } else {
                            arg3.method2808(var101, var102, var103, var98, var99, var100, this.field695.field1333);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(II)I", line = 1546)
    private static final int method345(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V", line = 1579)
    public final void method346(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        if (this.field698 == null) {
            this.field698 = new class238[super.field4635][super.field4642];
            this.field703 = new class378[super.field4635][super.field4642];
        } else if (this.field704 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var13 = 0; var13 < arg5.length; ++var13) {
                if (arg5[var13] == -1) {
                    arg5[var13] = 0;
                } else {
                    arg5[var13] = class113.field1391[class261.method1747(arg5[var13], (byte) 93) & 65535] << 8 | 255;
                }
            }
            if (arg6 != null) {
                for (int var14 = 0; var14 < arg6.length; ++var14) {
                    if (arg6[var14] == -1) {
                        arg6[var14] = 0;
                    } else {
                        arg6[var14] = class113.field1391[class261.method1747(arg6[var14], (byte) 74) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var15 = true;
            int var16 = -1;
            int var17 = -1;
            int var18 = -1;
            int var19 = -1;
            if (arg2.length == 6) {
                for (int var20 = 0; var20 < 6; ++var20) {
                    if (arg2[var20] == 0 && arg4[var20] == 0) {
                        if (var16 != -1 && arg5[var16] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var16 = var20;
                    } else if (arg2[var20] == this.field697 && arg4[var20] == 0) {
                        if (var17 != -1 && arg5[var17] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var17 = var20;
                    } else if (arg2[var20] == this.field697 && arg4[var20] == this.field697) {
                        if (var18 != -1 && arg5[var18] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var18 = var20;
                    } else if (arg2[var20] == 0 && arg4[var20] == this.field697) {
                        if (var19 != -1 && arg5[var19] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var19 = var20;
                    }
                }
                if (var16 == -1 || var17 == -1 || var18 == -1 || var19 == -1) {
                    var15 = false;
                }
                if (var15) {
                    if (arg3 != null) {
                        for (int var21 = 0; var21 < 4; ++var21) {
                            if (arg3[var21] != 0) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                    if (var15) {
                        for (int var22 = 1; var22 < 4; ++var22) {
                            if (arg2[var22] != arg2[0] && arg2[0] + this.field697 != arg2[var22] && arg2[0] - this.field697 != arg2[var22]) {
                                var15 = false;
                                break;
                            }
                            if (arg4[var22] != arg4[0] && arg4[0] + this.field697 != arg4[var22] && arg4[0] - this.field697 != arg4[var22]) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var15 = false;
            }
            if (var15) {
                class238 var23 = new class238();
                int var24 = arg5[0];
                int var25 = arg7[0];
                if (arg6 != null) {
                    var23.field3393 = arg6[0] >> 8;
                    if (var24 == 0) {
                        var23.field3392 = (byte) (var23.field3392 | 2);
                    }
                } else if (var24 == 0) {
                    return;
                }
                if (this.field692[arg0 + 1][arg1] == this.field692[arg0][arg1] && this.field692[arg0 + 1][arg1 + 1] == this.field692[arg0][arg1] && this.field692[arg0][arg1 + 1] == this.field692[arg0][arg1]) {
                    var23.field3392 = (byte) (var23.field3392 | 1);
                }
                if (var25 != -1 && (var23.field3392 & 2) == 0 && !this.field695.field1308.method1329((byte) -91, var25).field4766) {
                    var23.field3390 = this.field691[arg0][arg1] - this.field700[arg0][arg1];
                    var23.field3396 = this.field691[arg0 + 1][arg1] - this.field700[arg0 + 1][arg1];
                    var23.field3395 = this.field691[arg0 + 1][arg1 + 1] - this.field700[arg0 + 1][arg1 + 1];
                    var23.field3391 = this.field691[arg0][arg1 + 1] - this.field700[arg0][arg1 + 1];
                    var23.field3394 = (short) var25;
                } else {
                    int var26;
                    if (this.field696 != null && arg10 != 0) {
                        var26 = this.field696[arg0][arg1] * 255 / arg10;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 255) {
                            var26 = 255;
                        }
                    } else {
                        var26 = 0;
                    }
                    var23.field3390 = class334.method2162((byte) 14, var26, arg9, method345(arg5[var16] >> 8, this.field691[arg0][arg1] - this.field700[arg0][arg1]));
                    if (var23.field3393 != 0) {
                        var23.field3390 |= 255 - (this.field691[arg0][arg1] - this.field700[arg0][arg1]) << 25;
                    }
                    int var27;
                    if (this.field696 != null && arg10 != 0) {
                        var27 = this.field696[arg0 + 1][arg1] * 255 / arg10;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 > 255) {
                            var27 = 255;
                        }
                    } else {
                        var27 = 0;
                    }
                    var23.field3396 = class334.method2162((byte) 69, var27, arg9, method345(arg5[var17] >> 8, this.field691[arg0 + 1][arg1] - this.field700[arg0 + 1][arg1]));
                    if (var23.field3393 != 0) {
                        var23.field3396 |= 255 - (this.field691[arg0 + 1][arg1] - this.field700[arg0 + 1][arg1]) << 25;
                    }
                    int var28;
                    if (this.field696 != null && arg10 != 0) {
                        var28 = this.field696[arg0 + 1][arg1 + 1] * 255 / arg10;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var23.field3395 = class334.method2162((byte) 60, var28, arg9, method345(arg5[var18] >> 8, this.field691[arg0 + 1][arg1 + 1] - this.field700[arg0 + 1][arg1 + 1]));
                    if (var23.field3393 != 0) {
                        var23.field3395 |= 255 - (this.field691[arg0 + 1][arg1 + 1] - this.field700[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var29;
                    if (this.field696 != null && arg10 != 0) {
                        var29 = this.field696[arg0][arg1 + 1] * 255 / arg10;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var23.field3391 = class334.method2162((byte) 12, var29, arg9, method345(arg5[var19] >> 8, this.field691[arg0][arg1 + 1] - this.field700[arg0][arg1 + 1]));
                    if (var23.field3393 != 0) {
                        var23.field3391 |= 255 - (this.field691[arg0][arg1 + 1] - this.field700[arg0][arg1 + 1]) << 25;
                    }
                    var23.field3394 = -1;
                }
                this.field698[arg0][arg1] = var23;
            } else {
                class378 var30 = new class378();
                var30.field5327 = (short) arg2.length;
                var30.field5330 = (short) (arg2.length / 3);
                var30.field5335 = new short[var30.field5327];
                var30.field5334 = new short[var30.field5327];
                var30.field5333 = new short[var30.field5327];
                var30.field5331 = new int[var30.field5327];
                if (this.field696 != null) {
                    var30.field5328 = new short[var30.field5327];
                }
                for (int var31 = 0; var31 < var30.field5327; ++var31) {
                    int var46 = arg2[var31];
                    int var47 = arg4[var31];
                    boolean var48 = false;
                    int var49;
                    if (var46 == 0 && var47 == 0) {
                        var49 = this.field691[arg0][arg1] - this.field700[arg0][arg1];
                    } else if (var46 == 0 && this.field697 == var47) {
                        var49 = this.field691[arg0][arg1 + 1] - this.field700[arg0][arg1 + 1];
                    } else if (this.field697 == var46 && this.field697 == var47) {
                        var49 = this.field691[arg0 + 1][arg1 + 1] - this.field700[arg0 + 1][arg1 + 1];
                    } else if (this.field697 == var46 && var47 == 0) {
                        var49 = this.field691[arg0 + 1][arg1] - this.field700[arg0 + 1][arg1];
                    } else {
                        int var50 = (this.field691[arg0 + 1][arg1] - this.field700[arg0 + 1][arg1]) * var46 + (this.field691[arg0][arg1] - this.field700[arg0][arg1]) * (this.field697 - var46);
                        int var51 = (this.field691[arg0 + 1][arg1 + 1] - this.field700[arg0 + 1][arg1 + 1]) * var46 + (this.field691[arg0][arg1 + 1] - this.field700[arg0][arg1 + 1]) * (this.field697 - var46);
                        var49 = (this.field697 - var47) * var50 + var47 * var51 >> this.field690 * 2;
                    }
                    short var52 = (short) ((arg0 << this.field690) + var46);
                    short var53 = (short) ((arg1 << this.field690) + var47);
                    var30.field5335[var31] = var52;
                    var30.field5333[var31] = var53;
                    var30.field5334[var31] = (short) (this.method342(var52, var53) + (arg3 != null ? arg3[var31] : 0));
                    if (var49 < 0) {
                        var49 = 0;
                    }
                    if (arg7[var31] != -1 && !this.field695.field1308.method1329((byte) -89, arg7[var31]).field4766) {
                        var30.field5331[var31] = var49;
                    } else if (arg5[var31] == 0) {
                        if (arg6 != null) {
                            var30.field5331[var31] = var49 << 25;
                        } else {
                            var30.field5331[var31] = 0;
                        }
                    } else {
                        int var54 = 0;
                        if (this.field696 != null) {
                            boolean var55 = false;
                            int var56;
                            if (var46 == 0 && var47 == 0) {
                                var56 = this.field696[arg0][arg1];
                            } else if (var46 == 0 && this.field697 == var47) {
                                var56 = this.field696[arg0][arg1 + 1];
                            } else if (this.field697 == var46 && this.field697 == var47) {
                                var56 = this.field696[arg0 + 1][arg1 + 1];
                            } else if (this.field697 == var46 && var47 == 0) {
                                var56 = this.field696[arg0 + 1][arg1];
                            } else {
                                int var57 = (this.field697 - var46) * this.field696[arg0][arg1] + this.field696[arg0 + 1][arg1] * var46;
                                int var58 = (this.field697 - var46) * this.field696[arg0][arg1 + 1] + this.field696[arg0 + 1][arg1 + 1] * var46;
                                var56 = (this.field697 - var47) * var57 + var47 * var58 >> this.field690 * 2;
                            }
                            var30.field5328[var31] = (short) var56;
                            if (arg10 != 0) {
                                var54 = var56 * 255 / arg10;
                                if (var54 < 0) {
                                    var54 = 0;
                                } else if (var54 > 255) {
                                    var54 = 255;
                                }
                            }
                        }
                        var30.field5331[var31] = class334.method2162((byte) 14, var54, arg9, method345(arg5[var31] >> 8, var49));
                        if (arg6 != null) {
                            var30.field5331[var31] |= var49 << 25;
                        }
                    }
                }
                boolean var32 = false;
                for (int var33 = 0; var33 < var30.field5330; ++var33) {
                    if (arg7[var33 * 3] != -1 && !this.field695.field1308.method1329((byte) -80, arg7[var33 * 3]).field4766) {
                        var32 = true;
                    }
                }
                if (arg6 != null) {
                    var30.field5326 = new int[var30.field5330];
                }
                if (var32) {
                    var30.field5329 = new short[var30.field5330];
                    var30.field5332 = new short[var30.field5330];
                }
                for (int var34 = 0; var34 < var30.field5330; ++var34) {
                    int var35 = var34 * 3;
                    if (arg6 != null && arg6[var35] != 0) {
                        var30.field5326[var34] = arg6[var35] >> 8;
                    }
                    if (var32) {
                        int var36 = var35 + 1;
                        int var37 = var36 + 1;
                        boolean var38 = false;
                        boolean var39 = true;
                        int var40 = arg7[var35];
                        if (var40 != -1 && !this.field695.field1308.method1329((byte) -83, var40).field4766) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var41 = arg7[var36];
                        if (var41 != -1 && !this.field695.field1308.method1329((byte) -121, var41).field4766) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var42 = arg7[var37];
                        if (var42 != -1 && !this.field695.field1308.method1329((byte) -127, var42).field4766) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        if (var39) {
                            var30.field5329[var34] = (short) var42;
                            var30.field5332[var34] = (short) arg8[var35];
                        } else {
                            if (var38) {
                                int var43 = arg7[var35];
                                if (var43 != -1 && !this.field695.field1308.method1329((byte) -120, var43).field4766) {
                                    var30.field5331[var35] = class113.field1391[class261.method1747(this.field695.field1308.method1329((byte) -18, var43).field4778 & 65535, (byte) 84) & 65535];
                                }
                                int var44 = arg7[var36];
                                if (var44 != -1 && !this.field695.field1308.method1329((byte) -79, var44).field4766) {
                                    var30.field5331[var36] = class113.field1391[class261.method1747(this.field695.field1308.method1329((byte) -20, var44).field4778 & 65535, (byte) 107) & 65535];
                                }
                                int var45 = arg7[var37];
                                if (var45 != -1 && !this.field695.field1308.method1329((byte) -44, var45).field4766) {
                                    var30.field5331[var37] = class113.field1391[class261.method1747(this.field695.field1308.method1329((byte) -24, var45).field4778 & 65535, (byte) 101) & 65535];
                                }
                            }
                            var30.field5329[var34] = -1;
                        }
                    }
                }
                this.field703[arg0][arg1] = var30;
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(II)V", line = 2089)
    public final void method347(int arg0, int arg1) {
        class71 var3 = this.field695.method661(Thread.currentThread());
        var3.field814.field6491 = 0;
        if (this.field698 != null) {
            this.method344(arg0, arg1, this.field695.field1336, var3.field814, var3.field849, var3.field848, var3.field842);
        } else {
            if (this.field704 != null) {
                this.method340(arg0, arg1, var3.field814, var3.field849, var3.field848, var3.field842);
            }
        }
    }
}
