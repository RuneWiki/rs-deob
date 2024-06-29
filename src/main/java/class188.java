import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class188 extends class92 {

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "Ldq;")
    private class416 field2702;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    private int field2685;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "[[I")
    public int[][] field2679;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "[[I")
    private int[][] field2683;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    private int field2701;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    private int field2687;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "[[B")
    private byte[][] field2686;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "[[B")
    private byte[][] field2682;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    private int field2680;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    private int field2681;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    private int field2689;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    private int field2690;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    private int field2691;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    private int field2692;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    private int field2693;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    private int field2694;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    private int field2695;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    private int field2696;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    private int field2697;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    private int field2700;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "[[Lm;")
    private class104[][] field2698;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "[[Lnp;")
    private class286[][] field2699;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "[[Lnr;")
    private class35[][] field2688;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "[[Lpb;")
    private class395[][] field2684;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(II)I", line = 4)
    private static final int method1347(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILo;)Lo;", line = 34)
    public final class21 method351(int arg0, int arg1, class21 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I", line = 40)
    public final int method359(int arg0, int arg1) {
        return this.field2679[arg0][arg1];
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lo;IIIIZ)Z", line = 44)
    public final boolean method361(class21 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIII[[Z)V", line = 48)
    public final void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class214 var9 = this.field2702.method2618(Thread.currentThread());
        class251 var10 = var9.field3023;
        var10.field3733 = 0;
        var10.field3730 = false;
        if (this.field2698 != null) {
            this.method1351(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field3052, var9.field3061);
        } else {
            if (this.field2688 != null) {
                this.method1352(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field3052, var9.field3061);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)I", line = 64)
    public final int method360(int arg0, int arg1) {
        int var3 = arg0 >> this.field2687;
        int var4 = arg1 >> this.field2687;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field1187 - 1 && var4 <= super.field1183 - 1) {
            int var5 = arg0 & this.field2701 - 1;
            int var6 = arg1 & this.field2701 - 1;
            int var7 = (this.field2701 - var5) * this.field2679[var3][var4] + this.field2679[var3 + 1][var4] * var5 >> this.field2687;
            int var8 = (this.field2701 - var5) * this.field2679[var3][var4 + 1] + this.field2679[var3 + 1][var4 + 1] * var5 >> this.field2687;
            return (this.field2701 - var6) * var7 + var6 * var8 >> this.field2687;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ldq;IIII[[I[[II)V", line = 84)
    public class188(class416 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field2702 = arg0;
        this.field2685 = arg2;
        this.field2679 = arg5;
        this.field2683 = arg6;
        this.field2701 = arg7;
        this.field2687 = 0;
        while (arg7 > 1) {
            ++this.field2687;
            arg7 >>= 1;
        }
        this.field2686 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field2702.field5963 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = this.field2679[var11 + 1][var10] - this.field2679[var11 - 1][var10];
                int var14 = this.field2679[var11][var10 + 1] - this.field2679[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field2702.field5962 * var18 + this.field2702.field5977 * var16 + this.field2702.field5946 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field2686[var11][var10] = (byte) var20;
            }
        }
        this.field2682 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V", line = 144)
    public final void method362(int arg0, int arg1, int arg2) {
        if (this.field2682[arg0][arg1] < arg2) {
            this.field2682[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V", line = 150)
    public final void method350(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        if (this.field2698 == null) {
            this.field2698 = new class104[super.field1187][super.field1183];
            this.field2699 = new class286[super.field1187][super.field1183];
        } else if (this.field2688 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var13 = 0; var13 < arg5.length; ++var13) {
                if (arg5[var13] == -1) {
                    arg5[var13] = 0;
                } else {
                    arg5[var13] = class106.field1365[class148.method1095(arg5[var13], (byte) -120) & 65535] << 8 | 255;
                }
            }
            if (arg6 != null) {
                for (int var14 = 0; var14 < arg6.length; ++var14) {
                    if (arg6[var14] == -1) {
                        arg6[var14] = 0;
                    } else {
                        arg6[var14] = class106.field1365[class148.method1095(arg6[var14], (byte) -124) & 65535] << 8 | 255;
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
                    } else if (arg2[var20] == this.field2701 && arg4[var20] == 0) {
                        if (var17 != -1 && arg5[var17] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var17 = var20;
                    } else if (arg2[var20] == this.field2701 && arg4[var20] == this.field2701) {
                        if (var18 != -1 && arg5[var18] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var18 = var20;
                    } else if (arg2[var20] == 0 && arg4[var20] == this.field2701) {
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
                            if (arg2[var22] != arg2[0] && arg2[0] + this.field2701 != arg2[var22] && arg2[0] - this.field2701 != arg2[var22]) {
                                var15 = false;
                                break;
                            }
                            if (arg4[var22] != arg4[0] && arg4[0] + this.field2701 != arg4[var22] && arg4[0] - this.field2701 != arg4[var22]) {
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
                class104 var23 = new class104();
                int var24 = arg5[0];
                int var25 = arg7[0];
                if (arg6 != null) {
                    var23.field1341 = arg6[0] >> 8;
                    if (var24 == 0) {
                        var23.field1335 = (byte) (var23.field1335 | 2);
                    }
                } else if (var24 == 0) {
                    return;
                }
                if (this.field2679[arg0 + 1][arg1] == this.field2679[arg0][arg1] && this.field2679[arg0 + 1][arg1 + 1] == this.field2679[arg0][arg1] && this.field2679[arg0][arg1 + 1] == this.field2679[arg0][arg1]) {
                    var23.field1335 = (byte) (var23.field1335 | 1);
                }
                if (var25 != -1 && (var23.field1335 & 2) == 0 && !this.field2702.field5948.method1475(var25, 17673).field4184) {
                    var23.field1337 = this.field2686[arg0][arg1] - this.field2682[arg0][arg1];
                    var23.field1336 = this.field2686[arg0 + 1][arg1] - this.field2682[arg0 + 1][arg1];
                    var23.field1339 = this.field2686[arg0 + 1][arg1 + 1] - this.field2682[arg0 + 1][arg1 + 1];
                    var23.field1338 = this.field2686[arg0][arg1 + 1] - this.field2682[arg0][arg1 + 1];
                    var23.field1340 = (short) var25;
                } else {
                    int var26;
                    if (this.field2683 != null && arg10 != 0) {
                        var26 = this.field2683[arg0][arg1] * 255 / arg10;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 255) {
                            var26 = 255;
                        }
                    } else {
                        var26 = 0;
                    }
                    var23.field1337 = class34.method187(arg9, 16711680, method1347(arg5[var16] >> 8, this.field2686[arg0][arg1] - this.field2682[arg0][arg1]), var26);
                    if (var23.field1341 != 0) {
                        var23.field1337 |= 255 - (this.field2686[arg0][arg1] - this.field2682[arg0][arg1]) << 25;
                    }
                    int var27;
                    if (this.field2683 != null && arg10 != 0) {
                        var27 = this.field2683[arg0 + 1][arg1] * 255 / arg10;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 > 255) {
                            var27 = 255;
                        }
                    } else {
                        var27 = 0;
                    }
                    var23.field1336 = class34.method187(arg9, 16711680, method1347(arg5[var17] >> 8, this.field2686[arg0 + 1][arg1] - this.field2682[arg0 + 1][arg1]), var27);
                    if (var23.field1341 != 0) {
                        var23.field1336 |= 255 - (this.field2686[arg0 + 1][arg1] - this.field2682[arg0 + 1][arg1]) << 25;
                    }
                    int var28;
                    if (this.field2683 != null && arg10 != 0) {
                        var28 = this.field2683[arg0 + 1][arg1 + 1] * 255 / arg10;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var23.field1339 = class34.method187(arg9, 16711680, method1347(arg5[var18] >> 8, this.field2686[arg0 + 1][arg1 + 1] - this.field2682[arg0 + 1][arg1 + 1]), var28);
                    if (var23.field1341 != 0) {
                        var23.field1339 |= 255 - (this.field2686[arg0 + 1][arg1 + 1] - this.field2682[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var29;
                    if (this.field2683 != null && arg10 != 0) {
                        var29 = this.field2683[arg0][arg1 + 1] * 255 / arg10;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var23.field1338 = class34.method187(arg9, 16711680, method1347(arg5[var19] >> 8, this.field2686[arg0][arg1 + 1] - this.field2682[arg0][arg1 + 1]), var29);
                    if (var23.field1341 != 0) {
                        var23.field1338 |= 255 - (this.field2686[arg0][arg1 + 1] - this.field2682[arg0][arg1 + 1]) << 25;
                    }
                    var23.field1340 = -1;
                }
                this.field2698[arg0][arg1] = var23;
            } else {
                class286 var30 = new class286();
                var30.field4158 = (short) arg2.length;
                var30.field4154 = (short) (arg2.length / 3);
                var30.field4162 = new short[var30.field4158];
                var30.field4160 = new short[var30.field4158];
                var30.field4161 = new short[var30.field4158];
                var30.field4157 = new int[var30.field4158];
                if (this.field2683 != null) {
                    var30.field4156 = new short[var30.field4158];
                }
                for (int var31 = 0; var31 < var30.field4158; ++var31) {
                    int var46 = arg2[var31];
                    int var47 = arg4[var31];
                    boolean var48 = false;
                    int var49;
                    if (var46 == 0 && var47 == 0) {
                        var49 = this.field2686[arg0][arg1] - this.field2682[arg0][arg1];
                    } else if (var46 == 0 && this.field2701 == var47) {
                        var49 = this.field2686[arg0][arg1 + 1] - this.field2682[arg0][arg1 + 1];
                    } else if (this.field2701 == var46 && this.field2701 == var47) {
                        var49 = this.field2686[arg0 + 1][arg1 + 1] - this.field2682[arg0 + 1][arg1 + 1];
                    } else if (this.field2701 == var46 && var47 == 0) {
                        var49 = this.field2686[arg0 + 1][arg1] - this.field2682[arg0 + 1][arg1];
                    } else {
                        int var50 = (this.field2686[arg0 + 1][arg1] - this.field2682[arg0 + 1][arg1]) * var46 + (this.field2686[arg0][arg1] - this.field2682[arg0][arg1]) * (this.field2701 - var46);
                        int var51 = (this.field2686[arg0 + 1][arg1 + 1] - this.field2682[arg0 + 1][arg1 + 1]) * var46 + (this.field2686[arg0][arg1 + 1] - this.field2682[arg0][arg1 + 1]) * (this.field2701 - var46);
                        var49 = (this.field2701 - var47) * var50 + var47 * var51 >> this.field2687 * 2;
                    }
                    short var52 = (short) ((arg0 << this.field2687) + var46);
                    short var53 = (short) ((arg1 << this.field2687) + var47);
                    var30.field4162[var31] = var52;
                    var30.field4161[var31] = var53;
                    var30.field4160[var31] = (short) (this.method360(var52, var53) + (arg3 != null ? arg3[var31] : 0));
                    if (var49 < 0) {
                        var49 = 0;
                    }
                    if (arg7[var31] != -1 && !this.field2702.field5948.method1475(arg7[var31], 17673).field4184) {
                        var30.field4157[var31] = var49;
                    } else if (arg5[var31] == 0) {
                        if (arg6 != null) {
                            var30.field4157[var31] = var49 << 25;
                        } else {
                            var30.field4157[var31] = 0;
                        }
                    } else {
                        int var54 = 0;
                        if (this.field2683 != null) {
                            boolean var55 = false;
                            int var56;
                            if (var46 == 0 && var47 == 0) {
                                var56 = this.field2683[arg0][arg1];
                            } else if (var46 == 0 && this.field2701 == var47) {
                                var56 = this.field2683[arg0][arg1 + 1];
                            } else if (this.field2701 == var46 && this.field2701 == var47) {
                                var56 = this.field2683[arg0 + 1][arg1 + 1];
                            } else if (this.field2701 == var46 && var47 == 0) {
                                var56 = this.field2683[arg0 + 1][arg1];
                            } else {
                                int var57 = (this.field2701 - var46) * this.field2683[arg0][arg1] + this.field2683[arg0 + 1][arg1] * var46;
                                int var58 = (this.field2701 - var46) * this.field2683[arg0][arg1 + 1] + this.field2683[arg0 + 1][arg1 + 1] * var46;
                                var56 = (this.field2701 - var47) * var57 + var47 * var58 >> this.field2687 * 2;
                            }
                            var30.field4156[var31] = (short) var56;
                            if (arg10 != 0) {
                                var54 = var56 * 255 / arg10;
                                if (var54 < 0) {
                                    var54 = 0;
                                } else if (var54 > 255) {
                                    var54 = 255;
                                }
                            }
                        }
                        var30.field4157[var31] = class34.method187(arg9, 16711680, method1347(arg5[var31] >> 8, var49), var54);
                        if (arg6 != null) {
                            var30.field4157[var31] |= var49 << 25;
                        }
                    }
                }
                boolean var32 = false;
                for (int var33 = 0; var33 < var30.field4154; ++var33) {
                    if (arg7[var33 * 3] != -1 && !this.field2702.field5948.method1475(arg7[var33 * 3], 17673).field4184) {
                        var32 = true;
                    }
                }
                if (arg6 != null) {
                    var30.field4163 = new int[var30.field4154];
                }
                if (var32) {
                    var30.field4159 = new short[var30.field4154];
                    var30.field4155 = new short[var30.field4154];
                }
                for (int var34 = 0; var34 < var30.field4154; ++var34) {
                    int var35 = var34 * 3;
                    if (arg6 != null && arg6[var35] != 0) {
                        var30.field4163[var34] = arg6[var35] >> 8;
                    }
                    if (var32) {
                        int var36 = var35 + 1;
                        int var37 = var36 + 1;
                        boolean var38 = false;
                        boolean var39 = true;
                        int var40 = arg7[var35];
                        if (var40 != -1 && !this.field2702.field5948.method1475(var40, 17673).field4184) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var41 = arg7[var36];
                        if (var41 != -1 && !this.field2702.field5948.method1475(var41, 17673).field4184) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var42 = arg7[var37];
                        if (var42 != -1 && !this.field2702.field5948.method1475(var42, 17673).field4184) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        if (var39) {
                            var30.field4159[var34] = (short) var42;
                            var30.field4155[var34] = (short) arg8[var35];
                        } else {
                            if (var38) {
                                int var43 = arg7[var35];
                                if (var43 != -1 && !this.field2702.field5948.method1475(var43, 17673).field4184) {
                                    var30.field4157[var35] = class106.field1365[class148.method1095(this.field2702.field5948.method1475(var43, 17673).field4175 & 65535, (byte) -123) & 65535];
                                }
                                int var44 = arg7[var36];
                                if (var44 != -1 && !this.field2702.field5948.method1475(var44, 17673).field4184) {
                                    var30.field4157[var36] = class106.field1365[class148.method1095(this.field2702.field5948.method1475(var44, 17673).field4175 & 65535, (byte) -126) & 65535];
                                }
                                int var45 = arg7[var37];
                                if (var45 != -1 && !this.field2702.field5948.method1475(var45, 17673).field4184) {
                                    var30.field4157[var37] = class106.field1365[class148.method1095(this.field2702.field5948.method1475(var45, 17673).field4175 & 65535, (byte) -125) & 65535];
                                }
                            }
                            var30.field4159[var34] = -1;
                        }
                    }
                }
                this.field2699[arg0][arg1] = var30;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lpc;[I)V", line = 663)
    public final void method353(class402 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V", line = 666)
    public final void method349(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        if (this.field2688 == null) {
            this.field2688 = new class35[super.field1187][super.field1183];
            this.field2684 = new class395[super.field1187][super.field1183];
        } else if (this.field2698 != null) {
            throw new IllegalStateException();
        }
        boolean var16 = false;
        if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
            var16 = true;
            for (int var17 = 1; var17 < 2; ++var17) {
                int var18 = arg2[arg5[var17]];
                int var19 = arg4[arg5[var17]];
                if (var18 != 0 && this.field2701 != var18 || var19 != 0 && this.field2701 != var19) {
                    var16 = false;
                    break;
                }
            }
        }
        if (!var16) {
            class395 var20 = new class395();
            short var21 = (short) arg2.length;
            short var22 = (short) arg8.length;
            var20.field5556 = var21;
            var20.field5563 = new short[var21];
            var20.field5560 = new int[var21];
            var20.field5565 = new int[var21];
            var20.field5557 = new int[var21];
            for (int var23 = 0; var23 < var21; ++var23) {
                int var28 = arg2[var23];
                int var29 = arg4[var23];
                if (var28 == 0 && var29 == 0) {
                    var20.field5563[var23] = (short) (this.field2686[arg0][arg1] - this.field2682[arg0][arg1]);
                } else if (var28 == 0 && this.field2701 == var29) {
                    var20.field5563[var23] = (short) (this.field2686[arg0][arg1 + 1] - this.field2682[arg0][arg1 + 1]);
                } else if (this.field2701 == var28 && this.field2701 == var29) {
                    var20.field5563[var23] = (short) (this.field2686[arg0 + 1][arg1 + 1] - this.field2682[arg0 + 1][arg1 + 1]);
                } else if (this.field2701 == var28 && var29 == 0) {
                    var20.field5563[var23] = (short) (this.field2686[arg0 + 1][arg1] - this.field2682[arg0 + 1][arg1]);
                } else {
                    int var30 = (this.field2686[arg0 + 1][arg1] - this.field2682[arg0 + 1][arg1]) * var28 + (this.field2686[arg0][arg1] - this.field2682[arg0][arg1]) * (this.field2701 - var28);
                    int var31 = (this.field2686[arg0 + 1][arg1 + 1] - this.field2682[arg0 + 1][arg1 + 1]) * var28 + (this.field2686[arg0][arg1 + 1] - this.field2682[arg0][arg1 + 1]) * (this.field2701 - var28);
                    var20.field5563[var23] = (short) ((this.field2701 - var29) * var30 + var29 * var31 >> this.field2687 * 2);
                }
                int var32 = (arg0 << this.field2687) + var28;
                int var33 = (arg1 << this.field2687) + var29;
                var20.field5560[var23] = var32;
                var20.field5557[var23] = var33;
                var20.field5565[var23] = this.method360(var32, var33) + (arg3 != null ? arg3[var23] : 0);
                if (var20.field5563[var23] < 2) {
                    var20.field5563[var23] = 2;
                }
            }
            boolean var24 = false;
            int var25 = 0;
            for (int var26 = 0; var26 < var22; ++var26) {
                if (arg8[var26] >= 0 || arg9 != null && arg9[var26] >= 0) {
                    ++var25;
                }
                if (arg10[var26] != -1 && !this.field2702.field5948.method1475(arg10[var26], 17673).field4184) {
                    var24 = true;
                }
            }
            var20.field5555 = new int[var25];
            if (arg9 != null) {
                var20.field5567 = new int[var25];
            }
            var20.field5561 = new short[var25];
            var20.field5566 = new short[var25];
            var20.field5562 = new short[var25];
            if (var24) {
                var20.field5559 = new short[var25];
                var20.field5564 = new short[var25];
            }
            for (int var27 = 0; var27 < var22; ++var27) {
                if (arg8[var27] >= 0 || arg9 != null && arg9[var27] >= 0) {
                    if (arg8[var27] >= 0) {
                        var20.field5555[var20.field5558] = class148.method1095(arg8[var27], (byte) -124);
                    } else {
                        var20.field5555[var20.field5558] = -1;
                    }
                    if (arg9 != null) {
                        if (arg9[var27] != -1) {
                            var20.field5567[var20.field5558] = class148.method1095(arg9[var27], (byte) -120);
                        } else {
                            var20.field5567[var20.field5558] = -1;
                        }
                    }
                    var20.field5561[var20.field5558] = (short) arg5[var27];
                    var20.field5566[var20.field5558] = (short) arg6[var27];
                    var20.field5562[var20.field5558] = (short) arg7[var27];
                    if (var24) {
                        if (arg10[var27] != -1 && !this.field2702.field5948.method1475(arg10[var27], 17673).field4184) {
                            var20.field5559[var20.field5558] = (short) arg10[var27];
                            var20.field5564[var20.field5558] = (short) arg11[var27];
                        } else {
                            var20.field5559[var20.field5558] = -1;
                        }
                    }
                    ++var20.field5558;
                }
            }
            this.field2684[arg0][arg1] = var20;
        } else {
            if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
                class35 var34 = new class35();
                int var35 = arg8[0];
                int var36 = arg10[0];
                if (arg9 != null) {
                    var34.field443 = class261.method1805(class148.method1095(arg9[0], (byte) -111), -1, this.field2686[arg0][arg1] - this.field2682[arg0][arg1]);
                    if (var35 == -1) {
                        var34.field442 = (byte) (var34.field442 | 2);
                    }
                }
                if (this.field2679[arg0 + 1][arg1] == this.field2679[arg0][arg1] && this.field2679[arg0 + 1][arg1 + 1] == this.field2679[arg0][arg1] && this.field2679[arg0][arg1 + 1] == this.field2679[arg0][arg1]) {
                    var34.field442 = (byte) (var34.field442 | 1);
                }
                if (var36 != -1 && (var34.field442 & 2) == 0 && !this.field2702.field5948.method1475(var36, 17673).field4184) {
                    var34.field447 = (short) (this.field2686[arg0][arg1] - this.field2682[arg0][arg1]);
                    var34.field445 = (short) (this.field2686[arg0 + 1][arg1] - this.field2682[arg0 + 1][arg1]);
                    var34.field444 = (short) (this.field2686[arg0 + 1][arg1 + 1] - this.field2682[arg0 + 1][arg1 + 1]);
                    var34.field446 = (short) (this.field2686[arg0][arg1 + 1] - this.field2682[arg0][arg1 + 1]);
                    var34.field448 = (short) var36;
                } else {
                    short var37 = class148.method1095(var35, (byte) -127);
                    var34.field447 = (short) class261.method1805(var37, -1, this.field2686[arg0][arg1] - this.field2682[arg0][arg1]);
                    var34.field445 = (short) class261.method1805(var37, -1, this.field2686[arg0 + 1][arg1] - this.field2682[arg0 + 1][arg1]);
                    var34.field444 = (short) class261.method1805(var37, -1, this.field2686[arg0 + 1][arg1 + 1] - this.field2682[arg0 + 1][arg1 + 1]);
                    var34.field446 = (short) class261.method1805(var37, -1, this.field2686[arg0][arg1 + 1] - this.field2682[arg0][arg1 + 1]);
                    var34.field448 = -1;
                }
                this.field2688[arg0][arg1] = var34;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)V", line = 901)
    public final void method363(int arg0, int arg1) {
        class214 var3 = this.field2702.method2618(Thread.currentThread());
        var3.field3023.field3733 = 0;
        if (this.field2698 != null) {
            this.method1349(arg0, arg1, this.field2702.field5986, var3.field3023, var3.field3052, var3.field3061, var3.field3046);
        } else {
            if (this.field2688 != null) {
                this.method1348(arg0, arg1, var3.field3023, var3.field3052, var3.field3061, var3.field3046);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lo;IIIIZ)V", line = 911)
    public final void method357(class21 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lo;IIIIZ)V", line = 914)
    public final void method352(class21 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILrp;[I[I[I)V", line = 920)
    private final void method1348(int arg0, int arg1, class251 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class35 var7 = this.field2688[arg0][arg1];
        if (var7 != null) {
            if ((var7.field442 & 2) == 0) {
                int var8 = this.field2701 * arg0;
                int var9 = this.field2701 + var8;
                int var10 = this.field2701 * arg1;
                int var11 = this.field2701 + var10;
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
                if ((var7.field442 & 1) != 0) {
                    int var12 = this.field2679[arg0][arg1];
                    int var13 = this.field2697 * var12;
                    var14 = (this.field2695 * var10 + this.field2681 * var8 + var13 >> 15) + this.field2680;
                    if (var14 <= this.field2702.field5981) {
                        return;
                    }
                    var15 = (this.field2695 * var10 + this.field2681 * var9 + var13 >> 15) + this.field2680;
                    if (var15 <= this.field2702.field5981) {
                        return;
                    }
                    int var16 = (this.field2695 * var11 + this.field2681 * var9 + var13 >> 15) + this.field2680;
                    if (var16 <= this.field2702.field5981) {
                        return;
                    }
                    var17 = (this.field2695 * var11 + this.field2681 * var8 + var13 >> 15) + this.field2680;
                    if (var17 <= this.field2702.field5981) {
                        return;
                    }
                    int var18 = this.field2696 * var12;
                    int var19 = this.field2700 * var12;
                    var20 = (this.field2691 * var10 + this.field2693 * var8 + var18 >> 15) + this.field2689;
                    var21 = this.field2702.field5991 * var20 / var14 + arg2.field3735;
                    var22 = (this.field2692 * var10 + this.field2690 * var8 + var19 >> 15) + this.field2694;
                    var23 = this.field2702.field5979 * var22 / var14 + arg2.field3725;
                    var24 = (this.field2691 * var10 + this.field2693 * var9 + var18 >> 15) + this.field2689;
                    var25 = this.field2702.field5991 * var24 / var15 + arg2.field3735;
                    var26 = (this.field2692 * var10 + this.field2690 * var9 + var19 >> 15) + this.field2694;
                    var27 = this.field2702.field5979 * var26 / var15 + arg2.field3725;
                    int var28 = (this.field2691 * var11 + this.field2693 * var9 + var18 >> 15) + this.field2689;
                    var29 = this.field2702.field5991 * var28 / var16 + arg2.field3735;
                    int var30 = (this.field2692 * var11 + this.field2690 * var9 + var19 >> 15) + this.field2694;
                    var31 = this.field2702.field5979 * var30 / var16 + arg2.field3725;
                    var32 = (this.field2691 * var11 + this.field2693 * var8 + var18 >> 15) + this.field2689;
                    var33 = this.field2702.field5991 * var32 / var17 + arg2.field3735;
                    var34 = (this.field2692 * var11 + this.field2690 * var8 + var19 >> 15) + this.field2694;
                    var35 = this.field2702.field5979 * var34 / var17 + arg2.field3725;
                } else {
                    int var36 = this.field2679[arg0][arg1];
                    int var37 = this.field2679[arg0 + 1][arg1];
                    int var38 = this.field2679[arg0 + 1][arg1 + 1];
                    int var39 = this.field2679[arg0][arg1 + 1];
                    var14 = (this.field2695 * var10 + this.field2697 * var36 + this.field2681 * var8 >> 15) + this.field2680;
                    if (var14 <= this.field2702.field5981) {
                        return;
                    }
                    var15 = (this.field2695 * var10 + this.field2697 * var37 + this.field2681 * var9 >> 15) + this.field2680;
                    if (var15 <= this.field2702.field5981) {
                        return;
                    }
                    int var40 = (this.field2695 * var11 + this.field2697 * var38 + this.field2681 * var9 >> 15) + this.field2680;
                    if (var40 <= this.field2702.field5981) {
                        return;
                    }
                    var17 = (this.field2695 * var11 + this.field2697 * var39 + this.field2681 * var8 >> 15) + this.field2680;
                    if (var17 <= this.field2702.field5981) {
                        return;
                    }
                    var20 = (this.field2691 * var10 + this.field2696 * var36 + this.field2693 * var8 >> 15) + this.field2689;
                    var21 = this.field2702.field5991 * var20 / var14 + arg2.field3735;
                    var22 = (this.field2692 * var10 + this.field2700 * var36 + this.field2690 * var8 >> 15) + this.field2694;
                    var23 = this.field2702.field5979 * var22 / var14 + arg2.field3725;
                    var24 = (this.field2691 * var10 + this.field2696 * var37 + this.field2693 * var9 >> 15) + this.field2689;
                    var25 = this.field2702.field5991 * var24 / var15 + arg2.field3735;
                    var26 = (this.field2692 * var10 + this.field2700 * var37 + this.field2690 * var9 >> 15) + this.field2694;
                    var27 = this.field2702.field5979 * var26 / var15 + arg2.field3725;
                    int var41 = (this.field2691 * var11 + this.field2696 * var38 + this.field2693 * var9 >> 15) + this.field2689;
                    var29 = this.field2702.field5991 * var41 / var40 + arg2.field3735;
                    int var42 = (this.field2692 * var11 + this.field2700 * var38 + this.field2690 * var9 >> 15) + this.field2694;
                    var31 = this.field2702.field5979 * var42 / var40 + arg2.field3725;
                    var32 = (this.field2691 * var11 + this.field2696 * var39 + this.field2693 * var8 >> 15) + this.field2689;
                    var33 = this.field2702.field5991 * var32 / var17 + arg2.field3735;
                    var34 = (this.field2692 * var11 + this.field2700 * var39 + this.field2690 * var8 >> 15) + this.field2694;
                    var35 = this.field2702.field5979 * var34 / var17 + arg2.field3725;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field3730 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field3734 || var33 > arg2.field3734 || var25 > arg2.field3734;
                    if (var7.field448 >= 0) {
                        if (this.method1350(this.field2702.field5948.method1475(var7.field448, 17673).field4165)) {
                            arg2.field3733 = 100;
                        }
                        arg2.method1742(var31, var35, var27, var29, var33, var25, var7.field444 & 65535, var7.field446 & 65535, var7.field445 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field448);
                        arg2.field3733 = 0;
                    } else {
                        arg2.method1743(var31, var35, var27, var29, var33, var25, var7.field444 & 65535, var7.field446 & 65535, var7.field445 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field3730 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field3734 || var25 > arg2.field3734 || var33 > arg2.field3734;
                    if (var7.field448 >= 0) {
                        if (this.method1350(this.field2702.field5948.method1475(var7.field448, 17673).field4165)) {
                            arg2.field3733 = 100;
                        }
                        arg2.method1742(var23, var27, var35, var21, var25, var33, var7.field447 & 65535, var7.field445 & 65535, var7.field446 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field448);
                        arg2.field3733 = 0;
                        return;
                    }
                    arg2.method1743(var23, var27, var35, var21, var25, var33, var7.field447 & 65535, var7.field445 & 65535, var7.field446 & 65535);
                }
            }
        } else {
            class395 var43 = this.field2684[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field5556; ++var44) {
                    int var84 = var43.field5560[var44];
                    int var85 = var43.field5565[var44];
                    int var86 = var43.field5557[var44];
                    int var87 = (this.field2695 * var86 + this.field2697 * var85 + this.field2681 * var84 >> 15) + this.field2680;
                    if (var87 <= this.field2702.field5981) {
                        return;
                    }
                    int var88 = (this.field2691 * var86 + this.field2696 * var85 + this.field2693 * var84 >> 15) + this.field2689;
                    int var89 = (this.field2692 * var86 + this.field2700 * var85 + this.field2690 * var84 >> 15) + this.field2694;
                    arg3[var44] = this.field2702.field5991 * var88 / var87 + arg2.field3735;
                    arg4[var44] = this.field2702.field5979 * var89 / var87 + arg2.field3725;
                }
                if (var43.field5559 != null) {
                    int var45 = this.field2679[arg0][arg1];
                    int var46 = this.field2679[arg0 + 1][arg1];
                    int var47 = this.field2679[arg0][arg1 + 1];
                    int var48 = this.field2701 * arg0;
                    int var49 = this.field2701 + var48;
                    int var50 = this.field2701 * arg1;
                    int var51 = this.field2701 + var50;
                    int var52 = (this.field2691 * var50 + this.field2696 * var45 + this.field2693 * var48 >> 15) + this.field2689;
                    int var53 = (this.field2692 * var50 + this.field2700 * var45 + this.field2690 * var48 >> 15) + this.field2694;
                    int var54 = (this.field2695 * var50 + this.field2697 * var45 + this.field2681 * var48 >> 15) + this.field2680;
                    int var55 = (this.field2691 * var50 + this.field2696 * var46 + this.field2693 * var49 >> 15) + this.field2689;
                    int var56 = (this.field2692 * var50 + this.field2700 * var46 + this.field2690 * var49 >> 15) + this.field2694;
                    int var57 = (this.field2695 * var50 + this.field2697 * var46 + this.field2681 * var49 >> 15) + this.field2680;
                    int var58 = (this.field2691 * var51 + this.field2696 * var47 + this.field2693 * var48 >> 15) + this.field2689;
                    int var59 = (this.field2692 * var51 + this.field2700 * var47 + this.field2690 * var48 >> 15) + this.field2694;
                    int var60 = (this.field2695 * var51 + this.field2697 * var47 + this.field2681 * var48 >> 15) + this.field2680;
                    for (int var61 = 0; var61 < var43.field5558; ++var61) {
                        short var62 = var43.field5561[var61];
                        short var63 = var43.field5566[var61];
                        short var64 = var43.field5562[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field3730 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field3734 || var66 > arg2.field3734 || var67 > arg2.field3734;
                            short var71 = var43.field5559[var61];
                            if (var71 != -1) {
                                if (this.method1350(this.field2702.field5948.method1475(var71, 17673).field4165)) {
                                    arg2.field3733 = 100;
                                }
                                arg2.method1742(var68, var69, var70, var65, var66, var67, var43.field5563[var62], var43.field5563[var63], var43.field5563[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field3733 = 0;
                            } else {
                                int var72 = var43.field5555[var61];
                                if (var72 != -1) {
                                    arg2.method1743(var68, var69, var70, var65, var66, var67, class261.method1805(var72, -1, var43.field5563[var62]), class261.method1805(var72, -1, var43.field5563[var63]), class261.method1805(var72, -1, var43.field5563[var64]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field5558; ++var73) {
                    short var74 = var43.field5561[var73];
                    short var75 = var43.field5566[var73];
                    short var76 = var43.field5562[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field5555[var73];
                        if (var83 != -1) {
                            arg2.field3730 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field3734 || var78 > arg2.field3734 || var79 > arg2.field3734;
                            arg2.method1743(var80, var81, var82, var77, var78, var79, class261.method1805(var83, -1, var43.field5563[var74]), class261.method1805(var83, -1, var43.field5563[var75]), class261.method1805(var83, -1, var43.field5563[var76]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "()V", line = 1236)
    public final void method355() {
        this.field2686 = null;
        this.field2682 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIZLrp;[I[I[I)V", line = 1242)
    private final void method1349(int arg0, int arg1, boolean arg2, class251 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class104 var8 = this.field2698[arg0][arg1];
        if (var8 != null) {
            if ((var8.field1335 & 2) == 0) {
                int var9 = this.field2701 * arg0;
                int var10 = this.field2701 + var9;
                int var11 = this.field2701 * arg1;
                int var12 = this.field2701 + var11;
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
                if ((var8.field1335 & 1) != 0 && !arg2) {
                    int var17 = this.field2679[arg0][arg1];
                    int var18 = this.field2697 * var17;
                    var19 = (this.field2695 * var11 + this.field2681 * var9 + var18 >> 15) + this.field2680;
                    if (var19 <= this.field2702.field5981) {
                        return;
                    }
                    var20 = (this.field2695 * var11 + this.field2681 * var10 + var18 >> 15) + this.field2680;
                    if (var20 <= this.field2702.field5981) {
                        return;
                    }
                    var21 = (this.field2695 * var12 + this.field2681 * var10 + var18 >> 15) + this.field2680;
                    if (var21 <= this.field2702.field5981) {
                        return;
                    }
                    var22 = (this.field2695 * var12 + this.field2681 * var9 + var18 >> 15) + this.field2680;
                    if (var22 <= this.field2702.field5981) {
                        return;
                    }
                    if (this.field2702.field5955) {
                        int var23 = var19 - this.field2702.field5960;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field2702.field5960;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field2702.field5960;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field2702.field5960;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field2696 * var17;
                    int var28 = this.field2700 * var17;
                    var29 = (this.field2691 * var11 + this.field2693 * var9 + var27 >> 15) + this.field2689;
                    var30 = this.field2702.field5991 * var29 / var19 + arg3.field3735;
                    var31 = (this.field2692 * var11 + this.field2690 * var9 + var28 >> 15) + this.field2694;
                    var32 = this.field2702.field5979 * var31 / var19 + arg3.field3725;
                    var33 = (this.field2691 * var11 + this.field2693 * var10 + var27 >> 15) + this.field2689;
                    var34 = this.field2702.field5991 * var33 / var20 + arg3.field3735;
                    var35 = (this.field2692 * var11 + this.field2690 * var10 + var28 >> 15) + this.field2694;
                    var36 = this.field2702.field5979 * var35 / var20 + arg3.field3725;
                    var37 = (this.field2691 * var12 + this.field2693 * var10 + var27 >> 15) + this.field2689;
                    var38 = this.field2702.field5991 * var37 / var21 + arg3.field3735;
                    var39 = (this.field2692 * var12 + this.field2690 * var10 + var28 >> 15) + this.field2694;
                    var40 = this.field2702.field5979 * var39 / var21 + arg3.field3725;
                    var41 = (this.field2691 * var12 + this.field2693 * var9 + var27 >> 15) + this.field2689;
                    var42 = this.field2702.field5991 * var41 / var22 + arg3.field3735;
                    var43 = (this.field2692 * var12 + this.field2690 * var9 + var28 >> 15) + this.field2694;
                    var44 = this.field2702.field5979 * var43 / var22 + arg3.field3725;
                } else {
                    int var45 = this.field2679[arg0][arg1];
                    int var46 = this.field2679[arg0 + 1][arg1];
                    int var47 = this.field2679[arg0 + 1][arg1 + 1];
                    int var48 = this.field2679[arg0][arg1 + 1];
                    var19 = (this.field2695 * var11 + this.field2697 * var45 + this.field2681 * var9 >> 15) + this.field2680;
                    if (var19 <= this.field2702.field5981) {
                        return;
                    }
                    var20 = (this.field2695 * var11 + this.field2697 * var46 + this.field2681 * var10 >> 15) + this.field2680;
                    if (var20 <= this.field2702.field5981) {
                        return;
                    }
                    var21 = (this.field2695 * var12 + this.field2697 * var47 + this.field2681 * var10 >> 15) + this.field2680;
                    if (var21 <= this.field2702.field5981) {
                        return;
                    }
                    var22 = (this.field2695 * var12 + this.field2697 * var48 + this.field2681 * var9 >> 15) + this.field2680;
                    if (var22 <= this.field2702.field5981) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field2702.field5960;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = this.field2683[arg0][arg1] * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field2702.field5960;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = this.field2683[arg0 + 1][arg1] * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field2702.field5960;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = this.field2683[arg0 + 1][arg1 + 1] * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field2702.field5960;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = this.field2683[arg0][arg1 + 1] * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field2702.field5955) {
                        int var57 = var19 - this.field2702.field5960;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field2702.field5960;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field2702.field5960;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field2702.field5960;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field2691 * var11 + this.field2696 * var45 + this.field2693 * var9 >> 15) + this.field2689;
                    var30 = this.field2702.field5991 * var29 / var19 + arg3.field3735;
                    var31 = (this.field2692 * var11 + this.field2700 * var45 + this.field2690 * var9 >> 15) + this.field2694;
                    var32 = this.field2702.field5979 * var31 / var19 + arg3.field3725;
                    var33 = (this.field2691 * var11 + this.field2696 * var46 + this.field2693 * var10 >> 15) + this.field2689;
                    var34 = this.field2702.field5991 * var33 / var20 + arg3.field3735;
                    var35 = (this.field2692 * var11 + this.field2700 * var46 + this.field2690 * var10 >> 15) + this.field2694;
                    var36 = this.field2702.field5979 * var35 / var20 + arg3.field3725;
                    var37 = (this.field2691 * var12 + this.field2696 * var47 + this.field2693 * var10 >> 15) + this.field2689;
                    var38 = this.field2702.field5991 * var37 / var21 + arg3.field3735;
                    var39 = (this.field2692 * var12 + this.field2700 * var47 + this.field2690 * var10 >> 15) + this.field2694;
                    var40 = this.field2702.field5979 * var39 / var21 + arg3.field3725;
                    var41 = (this.field2691 * var12 + this.field2696 * var48 + this.field2693 * var9 >> 15) + this.field2689;
                    var42 = this.field2702.field5991 * var41 / var22 + arg3.field3735;
                    var43 = (this.field2692 * var12 + this.field2700 * var48 + this.field2690 * var9 >> 15) + this.field2694;
                    var44 = this.field2702.field5979 * var43 / var22 + arg3.field3725;
                }
                boolean var61 = var8.field1340 != -1 && this.method1350(this.field2702.field5948.method1475(var8.field1340, 17673).field4165);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field3730 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field3734 || var42 > arg3.field3734 || var34 > arg3.field3734;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field3733 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field1340 >= 0) {
                                arg3.method1740(var40, var44, var36, var38, var42, var34, this.field2702.field5950, var15, var16, var14, var8.field1339, var8.field1338, var8.field1336, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field1340);
                            } else {
                                arg3.method1746(var40, var44, var36, var38, var42, var34, class23.method127(var8.field1339, var15 << 24 | this.field2702.field5950, (byte) 83), class23.method127(var8.field1338, var16 << 24 | this.field2702.field5950, (byte) 83), class23.method127(var8.field1336, var14 << 24 | this.field2702.field5950, (byte) 83));
                            }
                        } else if (var8.field1340 >= 0) {
                            arg3.method1742(var40, var44, var36, var38, var42, var34, var8.field1339, var8.field1338, var8.field1336, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field1340);
                        } else {
                            arg3.method1746(var40, var44, var36, var38, var42, var34, var8.field1339, var8.field1338, var8.field1336);
                        }
                        arg3.field3733 = 0;
                    } else {
                        arg3.method1748(var40, var44, var36, var38, var42, var34, this.field2702.field5950);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field3730 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field3734 || var34 > arg3.field3734 || var42 > arg3.field3734;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field3733 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field1340 >= 0) {
                                arg3.method1740(var32, var36, var44, var30, var34, var42, this.field2702.field5950, var13, var14, var16, var8.field1337, var8.field1336, var8.field1338, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field1340);
                            } else {
                                arg3.method1746(var32, var36, var44, var30, var34, var42, class23.method127(var8.field1337, var13 << 24 | this.field2702.field5950, (byte) 83), class23.method127(var8.field1336, var14 << 24 | this.field2702.field5950, (byte) 83), class23.method127(var8.field1338, var16 << 24 | this.field2702.field5950, (byte) 83));
                            }
                        } else if (var8.field1340 >= 0) {
                            arg3.method1742(var32, var36, var44, var30, var34, var42, var8.field1337, var8.field1336, var8.field1338, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field1340);
                        } else {
                            arg3.method1746(var32, var36, var44, var30, var34, var42, var8.field1337, var8.field1336, var8.field1338);
                        }
                        arg3.field3733 = 0;
                        return;
                    }
                    arg3.method1748(var32, var36, var44, var30, var34, var42, this.field2702.field5950);
                }
            }
        } else {
            class286 var64 = this.field2699[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field4158; ++var65) {
                    short var105 = var64.field4162[var65];
                    int var106 = var64.field4160[var65];
                    short var107 = var64.field4161[var65];
                    int var108 = (this.field2695 * var107 + this.field2697 * var106 + this.field2681 * var105 >> 15) + this.field2680;
                    if (var108 <= this.field2702.field5981) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field2702.field5960;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field4156[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field2702.field5955) {
                        int var111 = var108 - this.field2702.field5960;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field2691 * var107 + this.field2696 * var106 + this.field2693 * var105 >> 15) + this.field2689;
                    int var113 = (this.field2692 * var107 + this.field2700 * var106 + this.field2690 * var105 >> 15) + this.field2694;
                    arg4[var65] = this.field2702.field5991 * var112 / var108 + arg3.field3735;
                    arg5[var65] = this.field2702.field5979 * var113 / var108 + arg3.field3725;
                }
                if (var64.field4159 != null) {
                    int var66 = this.field2679[arg0][arg1];
                    int var67 = this.field2679[arg0 + 1][arg1];
                    int var68 = this.field2679[arg0][arg1 + 1];
                    int var69 = this.field2701 * arg0;
                    int var70 = this.field2701 + var69;
                    int var71 = this.field2701 * arg1;
                    int var72 = this.field2701 + var71;
                    int var73 = (this.field2691 * var71 + this.field2696 * var66 + this.field2693 * var69 >> 15) + this.field2689;
                    int var74 = (this.field2692 * var71 + this.field2700 * var66 + this.field2690 * var69 >> 15) + this.field2694;
                    int var75 = (this.field2695 * var71 + this.field2697 * var66 + this.field2681 * var69 >> 15) + this.field2680;
                    int var76 = (this.field2691 * var71 + this.field2696 * var67 + this.field2693 * var70 >> 15) + this.field2689;
                    int var77 = (this.field2692 * var71 + this.field2700 * var67 + this.field2690 * var70 >> 15) + this.field2694;
                    int var78 = (this.field2695 * var71 + this.field2697 * var67 + this.field2681 * var70 >> 15) + this.field2680;
                    int var79 = (this.field2691 * var72 + this.field2696 * var68 + this.field2693 * var69 >> 15) + this.field2689;
                    int var80 = (this.field2692 * var72 + this.field2700 * var68 + this.field2690 * var69 >> 15) + this.field2694;
                    int var81 = (this.field2695 * var72 + this.field2697 * var68 + this.field2681 * var69 >> 15) + this.field2680;
                    for (int var82 = 0; var82 < var64.field4154; ++var82) {
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
                            arg3.field3730 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field3734 || var87 > arg3.field3734 || var88 > arg3.field3734;
                            short var93 = var64.field4159[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method1350(this.field2702.field5948.method1475(var93, 17673).field4165)) {
                                    arg3.field3733 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method1740(var89, var90, var91, var86, var87, var88, this.field2702.field5950, arg6[var83], arg6[var84], arg6[var85], var64.field4157[var83], var64.field4157[var84], var64.field4157[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field4157[var83] & 16777215) != 0) {
                                        arg3.method1746(var89, var90, var91, var86, var87, var88, class23.method127(var64.field4157[var83], arg6[var83] << 24 | this.field2702.field5950, (byte) 83), class23.method127(var64.field4157[var84], arg6[var84] << 24 | this.field2702.field5950, (byte) 83), class23.method127(var64.field4157[var85], arg6[var85] << 24 | this.field2702.field5950, (byte) 83));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method1742(var89, var90, var91, var86, var87, var88, var64.field4157[var83], var64.field4157[var84], var64.field4157[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field4157[var83] & 16777215) != 0) {
                                    arg3.method1746(var89, var90, var91, var86, var87, var88, var64.field4157[var83], var64.field4157[var84], var64.field4157[var85]);
                                }
                                arg3.field3733 = 0;
                            } else {
                                arg3.method1748(var89, var90, var91, var86, var87, var88, this.field2702.field5950);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field4154; ++var94) {
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
                        arg3.field3730 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field3734 || var99 > arg3.field3734 || var100 > arg3.field3734;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field4157[var95] & 16777215) != 0) {
                                    arg3.method1746(var101, var102, var103, var98, var99, var100, class34.method187(this.field2702.field5950, 16711680, var64.field4157[var95], arg6[var95]), class34.method187(this.field2702.field5950, 16711680, var64.field4157[var96], arg6[var96]), class34.method187(this.field2702.field5950, 16711680, var64.field4157[var97], arg6[var97]));
                                }
                            } else if ((var64.field4157[var95] & 16777215) != 0) {
                                arg3.method1746(var101, var102, var103, var98, var99, var100, var64.field4157[var95], var64.field4157[var96], var64.field4157[var97]);
                            }
                        } else {
                            arg3.method1748(var101, var102, var103, var98, var99, var100, this.field2702.field5950);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Z", line = 1808)
    private final boolean method1350(int arg0) {
        if ((this.field2685 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIII[[ZLrp;[I[I)V", line = 1822)
    private final void method1351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class251 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field3731 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field2698[var16][var17] != null) {
                        class104 var18 = this.field2698[var16][var17];
                        if (var18.field1340 != -1 && (var18.field1335 & 2) == 0 && var18.field1341 == 0) {
                            int var19 = this.field2702.method2627(var18.field1340);
                            arg8.method1743(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class261.method1805(var19, -1, var18.field1339), class261.method1805(var19, -1, var18.field1338), class261.method1805(var19, -1, var18.field1336));
                            arg8.method1743(var15, var15, var15 - var13, var14, var13 + var14, var14, class261.method1805(var19, -1, var18.field1337), class261.method1805(var19, -1, var18.field1336), class261.method1805(var19, -1, var18.field1338));
                        } else if (var18.field1341 == 0) {
                            arg8.method1746(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field1339, var18.field1338, var18.field1336);
                            arg8.method1746(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field1337, var18.field1336, var18.field1338);
                        } else {
                            int var20 = var18.field1341;
                            arg8.method1746(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class23.method127(var20, var18.field1339 & -16777216, (byte) 83), class23.method127(var20, var18.field1338 & -16777216, (byte) 83), class23.method127(var20, var18.field1336 & -16777216, (byte) 83));
                            arg8.method1746(var15, var15, var15 - var13, var14, var13 + var14, var14, class23.method127(var20, var18.field1337 & -16777216, (byte) 83), class23.method127(var20, var18.field1336 & -16777216, (byte) 83), class23.method127(var20, var18.field1338 & -16777216, (byte) 83));
                        }
                    } else if (this.field2699[var16][var17] != null) {
                        class286 var21 = this.field2699[var16][var17];
                        for (int var22 = 0; var22 < var21.field4158; ++var22) {
                            arg9[var22] = (var21.field4162[var22] - this.field2701 * var16) * var13 / this.field2701 + var14;
                            arg10[var22] = var15 - (var21.field4161[var22] - this.field2701 * var17) * var13 / this.field2701;
                        }
                        for (int var23 = 0; var23 < var21.field4154; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field4163 == null || var21.field4163[var23] == 0 || var21.field4159 != null && (var21.field4159 == null || var21.field4159[var23] != -1)) {
                                if (var21.field4159 != null && var21.field4159[var23] != -1) {
                                    int var34 = this.field2702.method2627(var21.field4159[var23]);
                                    arg8.method1743(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method1746(var30, var31, var32, var27, var28, var29, var21.field4157[var24], var21.field4157[var25], var21.field4157[var26]);
                                }
                            } else {
                                int var33 = var21.field4163[var23];
                                arg8.method1746(var30, var31, var32, var27, var28, var29, class23.method127(var33, -16777216 - (var21.field4157[var24] & -16777216), (byte) 83), class23.method127(var33, -16777216 - (var21.field4157[var25] & -16777216), (byte) 83), class23.method127(var33, -16777216 - (var21.field4157[var26] & -16777216), (byte) 83));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field3731 = true;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(IIIIIII[[ZLrp;[I[I)V", line = 1952)
    private final void method1352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class251 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field3731 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field2688[var16][var17] != null) {
                        class35 var18 = this.field2688[var16][var17];
                        if (var18.field448 != -1 && (var18.field442 & 2) == 0 && var18.field443 == -1) {
                            int var19 = this.field2702.method2627(var18.field448);
                            arg8.method1743(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class261.method1805(var19, -1, var18.field444 & 65535), class261.method1805(var19, -1, var18.field446 & 65535), class261.method1805(var19, -1, var18.field445 & 65535));
                            arg8.method1743(var15, var15, var15 - var13, var14, var13 + var14, var14, class261.method1805(var19, -1, var18.field447 & 65535), class261.method1805(var19, -1, var18.field445 & 65535), class261.method1805(var19, -1, var18.field446 & 65535));
                        } else if (var18.field443 == -1) {
                            arg8.method1743(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field444 & 65535, var18.field446 & 65535, var18.field445 & 65535);
                            arg8.method1743(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field447 & 65535, var18.field445 & 65535, var18.field446 & 65535);
                        } else {
                            int var20 = var18.field443;
                            arg8.method1743(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method1743(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field2684[var16][var17] != null) {
                        class395 var21 = this.field2684[var16][var17];
                        for (int var22 = 0; var22 < var21.field5556; ++var22) {
                            arg9[var22] = (var21.field5560[var22] - this.field2701 * var16) * var13 / this.field2701 + var14;
                            arg10[var22] = var15 - (var21.field5557[var22] - this.field2701 * var17) * var13 / this.field2701;
                        }
                        for (int var23 = 0; var23 < var21.field5558; ++var23) {
                            short var24 = var21.field5561[var23];
                            short var25 = var21.field5566[var23];
                            short var26 = var21.field5562[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field5567 != null && var21.field5567[var23] != -1) {
                                int var33 = var21.field5567[var23];
                                arg8.method1743(var30, var31, var32, var27, var28, var29, class261.method1805(var33, -1, var21.field5563[var24]), class261.method1805(var33, -1, var21.field5563[var25]), class261.method1805(var33, -1, var21.field5563[var26]));
                            } else if (var21.field5559 != null && var21.field5559[var23] != -1) {
                                int var34 = this.field2702.method2627(var21.field5559[var23]);
                                arg8.method1743(var30, var31, var32, var27, var28, var29, class261.method1805(var34, -1, var21.field5563[var24]), class261.method1805(var34, -1, var21.field5563[var25]), class261.method1805(var34, -1, var21.field5563[var26]));
                            } else {
                                int var35 = var21.field5555[var23];
                                arg8.method1743(var30, var31, var32, var27, var28, var29, class261.method1805(var35, -1, var21.field5563[var24]), class261.method1805(var35, -1, var21.field5563[var25]), class261.method1805(var35, -1, var21.field5563[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field3731 = true;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III[[ZZ)V", line = 2083)
    public final void method358(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class326 var6 = this.field2702.field5973;
        this.field2693 = var6.field4734;
        this.field2696 = var6.field4736;
        this.field2691 = var6.field4726;
        this.field2689 = var6.field4733;
        this.field2690 = var6.field4727;
        this.field2700 = var6.field4728;
        this.field2692 = var6.field4735;
        this.field2694 = var6.field4737;
        this.field2681 = var6.field4729;
        this.field2697 = var6.field4730;
        this.field2695 = var6.field4732;
        this.field2680 = var6.field4731;
    }
}
