import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class157 {

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    private int field2971 = 0;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public int field2964;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "[Lcb;")
    public class236[] field2966;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "[Lsg;")
    public static class30[] field2956 = new class30[8];

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field2951 = -1;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "J")
    public static long field2953 = 0L;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "Lsg;")
    public static class30 field2974 = class167.method1221((byte) 33, ":clan:");

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "J")
    private long field2970;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Lcb;")
    private class236 field2960;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "Lcb;")
    private class236 field2973;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Ldl;")
    public static class31 field2967;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BJLcb;)V")
    public final void method1164(byte arg0, long arg1, class236 arg2) {
        if (arg2.field4218 != null) {
            arg2.method1681(false);
        }
        field2957++;
        class236 var5 = this.field2966[(int) ((long) (this.field2964 - 1) & arg1)];
        arg2.field4211 = var5;
        arg2.field4218 = var5.field4218;
        arg2.field4215 = arg1;
        int var6 = 74 / ((arg0 - 12) / 35);
        arg2.field4218.field4211 = arg2;
        arg2.field4211.field4218 = arg2;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
    public static final void method1165(boolean arg0) {
        if (class81.field1737 != null) {
            class260 var1 = class81.field1737;
            synchronized (class81.field1737) {
                class81.field1737 = null;
            }
        }
        if (arg0) {
            method1175();
        }
        field2958++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILsh;III)V")
    public static final void method1166(int arg0, class241 arg1, int arg2, int arg3, int arg4) {
        field2963++;
        if (class52.field1165 >= 400) {
            return;
        }
        if (arg1.field4295 != null) {
            arg1 = arg1.method1700((byte) 59);
        }
        if (arg1 == null || !arg1.field4291) {
            return;
        }
        class30 var5 = arg1.field4268;
        if (arg0 != 3) {
            field2974 = null;
        }
        if (arg1.field4299 != 0) {
            var5 = class160.method1188(new class30[] { var5, class236.method1679(class247.field4394.field2341, arg1.field4299, arg0 + 69), class104.field2088, class109.field2194, class73.method675(-84, arg1.field4299), class239.field4250 }, 0);
        }
        if (class132.field2607 == 1) {
            class130.field2561++;
            class31.method311(arg4, (long) arg2, class160.method1188(new class30[] { class173.field3234, class148.field2828, var5 }, 0), class163.field3031, (short) 35, -501, arg3);
        } else if (!class175.field3258) {
            class153.field2909++;
            class30[] var6 = arg1.field4276;
            if (class179.field3318) {
                var6 = class263.method1816((byte) 7, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class138.field2705 != 0 || !var6[var7].method285(class100.field2038, arg0 - 3))) {
                        class220.field3965++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 43;
                        }
                        if (var7 == 1) {
                            var8 = 12;
                        }
                        if (var7 == 2) {
                            var8 = 4;
                        }
                        if (var7 == 3) {
                            var8 = 22;
                        }
                        if (var7 == 4) {
                            var8 = 41;
                        }
                        class31.method311(arg4, (long) arg2, class160.method1188(new class30[] { class209.field3764, var5 }, 0), var6[var7], var8, -501, arg3);
                    }
                }
            }
            if (class138.field2705 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method285(class100.field2038, 0)) {
                        class253.field4461++;
                        short var10 = 0;
                        if (var9 == 0) {
                            var10 = 43;
                        }
                        if (var9 == 1) {
                            var10 = 12;
                        }
                        if (var9 == 2) {
                            var10 = 4;
                        }
                        if (var9 == 3) {
                            var10 = 22;
                        }
                        if (var9 == 4) {
                            var10 = 41;
                        }
                        short var11 = 0;
                        if (arg1.field4299 > class247.field4394.field2341) {
                            var11 = 2000;
                        }
                        if (var10 != 0) {
                            var10 += var11;
                        }
                        class31.method311(arg4, (long) arg2, class160.method1188(new class30[] { class209.field3764, var5 }, 0), var6[var9], var10, arg0 - 504, arg3);
                    }
                }
            }
            class31.method311(arg4, (long) arg2, class160.method1188(new class30[] { class209.field3764, var5 }, 0), class179.field3319, (short) 1006, -501, arg3);
        } else if ((class195.field3514 & 0x2) == 2) {
            class13.field241++;
            class31.method311(arg4, (long) arg2, class160.method1188(new class30[] { class246.field4384, class148.field2828, var5 }, 0), class93.field1867, (short) 37, arg0 - 504, arg3);
            return;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIII)V")
    public static final void method1167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2969++;
        if (arg2 >= -80) {
            method1170(55, 101, 38, 13, 96, 17, -49);
        }
        long var6 = class176.method1291(arg0, arg4, arg5);
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x34D36D) >> 20;
            int var9 = (int) var6 >> 14 & 0x1F;
            int var10 = arg3;
            int[] var11 = class188.field3437;
            int var12 = arg4 * 4 + (103 - arg5) * 512 * 4 + 24624;
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            if (var6 > 0L) {
                var10 = arg1;
            }
            class40 var14 = class195.method1415(-104, var13);
            if (var14.field992 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1 + 1536] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1536 + 3] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 2 + 1536] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    }
                }
            } else {
                class192 var15 = null;
                if (!var14.field966) {
                    var15 = class276.field4818[var14.field992];
                } else if (var8 == 0) {
                    var15 = class276.field4818[var14.field992];
                } else if (var8 == 1) {
                    var15 = class193.field3484[var14.field992];
                } else if (var8 == 2) {
                    var15 = class20.field373[var14.field992];
                } else if (var8 == 3) {
                    var15 = class23.field427[var14.field992];
                }
                if (var15 != null) {
                    int var16 = (var14.field937 * 4 - var15.field4679) / 2;
                    int var17 = (var14.field955 * 4 - var15.field4673) / 2;
                    var15.method1387((arg4 * 4) + var16 + 48, (-var14.field955 + 104 - arg5) * 4 + 48 + var17);
                }
            }
        }
        long var18 = class30.method259(arg0, arg4, arg5);
        if (var18 != 0L) {
            int var20 = ((int) var18 & 0x7C69E) >> 14;
            int var21 = ((int) var18 & 0x388972) >> 20;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class40 var23 = class195.method1415(106, var22);
            if (var23.field992 != -1) {
                class192 var24 = null;
                if (!var23.field966) {
                    var24 = class276.field4818[var23.field992];
                } else if (var21 == 0) {
                    var24 = class276.field4818[var23.field992];
                } else if (var21 == 1) {
                    var24 = class193.field3484[var23.field992];
                } else if (var21 == 2) {
                    var24 = class20.field373[var23.field992];
                } else if (var21 == 3) {
                    var24 = class23.field427[var23.field992];
                }
                if (var24 != null) {
                    int var25 = (var23.field955 * 4 - var24.field4673) / 2;
                    int var26 = (var23.field937 * 4 - var24.field4679) / 2;
                    var24.method1387((arg4 * 4) + var26 + 48, (-var23.field955 + 104 + -arg5) * 4 + var25 + 48);
                }
            } else if (var20 == 9) {
                int[] var27 = class188.field3437;
                int var28 = 15658734;
                if (var18 > 0L) {
                    var28 = 15597568;
                }
                int var29 = (103 - arg5) * 512 * 4 + arg4 * 4 + 24624;
                if (var21 == 0 || var21 == 2) {
                    var27[var29 + 1536] = var28;
                    var27[var29 + 1 + 1024] = var28;
                    var27[var29 + 512 + 2] = var28;
                    var27[var29 + 3] = var28;
                } else {
                    var27[var29] = var28;
                    var27[var29 + 1 + 512] = var28;
                    var27[var29 + 1024 + 2] = var28;
                    var27[var29 + 3 + 1536] = var28;
                }
            }
        }
        long var30 = class275.method1868(arg0, arg4, arg5);
        if (var30 == 0L) {
            return;
        }
        int var32 = ((int) var30 & 0x3542D0) >> 20;
        int var33 = Integer.MAX_VALUE & (int) (var30 >>> 32);
        class40 var34 = class195.method1415(39, var33);
        if (var34.field992 == -1) {
            return;
        }
        class192 var35 = null;
        if (!var34.field966) {
            var35 = class276.field4818[var34.field992];
        } else if (var32 == 0) {
            var35 = class276.field4818[var34.field992];
        } else if (var32 == 1) {
            var35 = class193.field3484[var34.field992];
        } else if (var32 == 2) {
            var35 = class20.field373[var34.field992];
        } else if (var32 == 3) {
            var35 = class23.field427[var34.field992];
        }
        if (var35 != null) {
            int var36 = (var34.field937 * 4 - var35.field4679) / 2;
            int var37 = (var34.field955 * 4 - var35.field4673) / 2;
            var35.method1387(arg4 * 4 + var36 + 48, (104 - arg5 + -var34.field955) * 4 + 48 + var37);
            return;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IJ)Lcb;")
    public final class236 method1168(int arg0, long arg1) {
        field2972++;
        this.field2970 = arg1;
        class236 var4 = this.field2966[(int) ((long) (this.field2964 - 1) & arg1)];
        for (this.field2960 = var4.field4211; this.field2960 != var4; this.field2960 = this.field2960.field4211) {
            if (this.field2960.field4215 == arg1) {
                class236 var5 = this.field2960;
                this.field2960 = this.field2960.field4211;
                return var5;
            }
        }
        if (arg0 == -3) {
            this.field2960 = null;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)I")
    public final int method1169(int arg0) {
        field2952++;
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field2964; var3++) {
            class236 var4 = this.field2966[var3];
            for (class236 var5 = var4.field4211; var5 != var4; var5 = var5.field4211) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class22 var7 = new class22();
        var7.field417 = arg1 / 128;
        var7.field420 = arg2 / 128;
        var7.field410 = arg3 / 128;
        var7.field411 = arg4 / 128;
        var7.field414 = arg0;
        var7.field407 = arg1;
        var7.field408 = arg2;
        var7.field406 = arg3;
        var7.field399 = arg4;
        var7.field405 = arg5;
        var7.field400 = arg6;
        class107.field2141[class160.field3015++] = var7;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)I")
    public final int method1171(int arg0) {
        field2965++;
        if (arg0 != 4) {
            this.field2973 = null;
        }
        return this.field2964;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)V")
    public static void method1172(boolean arg0) {
        field2967 = null;
        field2956 = null;
        if (arg0) {
            field2974 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)Lcb;")
    public final class236 method1173(int arg0) {
        field2959++;
        if (this.field2960 == null) {
            return null;
        }
        if (arg0 != -15659) {
            this.method1164((byte) 38, -55L, (class236) null);
        }
        class236 var2 = this.field2966[(int) (this.field2970 & (long) (this.field2964 - 1))];
        while (this.field2960 != var2) {
            if (this.field2960.field4215 == this.field2970) {
                class236 var3 = this.field2960;
                this.field2960 = this.field2960.field4211;
                return var3;
            }
            this.field2960 = this.field2960.field4211;
        }
        this.field2960 = null;
        return null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public final void method1174(byte arg0) {
        if (arg0 != 33) {
            this.field2966 = null;
        }
        for (int var2 = 0; var2 < this.field2964; var2++) {
            class236 var3 = this.field2966[var2];
            while (true) {
                class236 var4 = var3.field4211;
                if (var3 == var4) {
                    break;
                }
                var4.method1681(false);
            }
        }
        this.field2973 = null;
        this.field2960 = null;
        field2962++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public static final void method1175() {
        class126.field2462 = 0;
        label191: for (int var0 = 0; var0 < class160.field3015; var0++) {
            class22 var1 = class107.field2141[var0];
            if (class269.field4735 != null) {
                for (int var2 = 0; var2 < class269.field4735.length; var2++) {
                    if (class269.field4735[var2] != -1000000 && (var1.field405 <= class269.field4735[var2] || var1.field400 <= class269.field4735[var2]) && (var1.field407 <= class254.field4476[var2] || var1.field408 <= class254.field4476[var2]) && (var1.field407 >= class182.field3352[var2] || var1.field408 >= class182.field3352[var2]) && (var1.field406 <= class117.field2311[var2] || var1.field399 <= class117.field2311[var2]) && (var1.field406 >= class232.field4139[var2] || var1.field399 >= class232.field4139[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field414 == 1) {
                int var3 = var1.field417 + class76.field1674 - class57.field1258;
                if (var3 >= 0 && var3 <= class76.field1674 + class76.field1674) {
                    int var4 = var1.field410 + class76.field1674 - class15.field320;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field411 + class76.field1674 - class15.field320;
                    if (var5 > class76.field1674 + class76.field1674) {
                        var5 = class76.field1674 + class76.field1674;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class155.field2948[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class254.field4478 - var1.field407;
                        if (var7 > 32) {
                            var1.field412 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field412 = 2;
                            var7 = -var7;
                        }
                        var1.field402 = (var1.field406 - class108.field2177 << 8) / var7;
                        var1.field403 = (var1.field399 - class108.field2177 << 8) / var7;
                        var1.field401 = (var1.field405 - class21.field382 << 8) / var7;
                        var1.field422 = (var1.field400 - class21.field382 << 8) / var7;
                        class163.field3038[class126.field2462++] = var1;
                    }
                }
            } else if (var1.field414 == 2) {
                int var8 = var1.field410 + class76.field1674 - class15.field320;
                if (var8 >= 0 && var8 <= class76.field1674 + class76.field1674) {
                    int var9 = var1.field417 + class76.field1674 - class57.field1258;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field420 + class76.field1674 - class57.field1258;
                    if (var10 > class76.field1674 + class76.field1674) {
                        var10 = class76.field1674 + class76.field1674;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class155.field2948[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class108.field2177 - var1.field406;
                        if (var12 > 32) {
                            var1.field412 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field412 = 4;
                            var12 = -var12;
                        }
                        var1.field413 = (var1.field407 - class254.field4478 << 8) / var12;
                        var1.field404 = (var1.field408 - class254.field4478 << 8) / var12;
                        var1.field401 = (var1.field405 - class21.field382 << 8) / var12;
                        var1.field422 = (var1.field400 - class21.field382 << 8) / var12;
                        class163.field3038[class126.field2462++] = var1;
                    }
                }
            } else if (var1.field414 == 4) {
                int var13 = var1.field405 - class21.field382;
                if (var13 > 128) {
                    int var14 = var1.field410 + class76.field1674 - class15.field320;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field411 + class76.field1674 - class15.field320;
                    if (var15 > class76.field1674 + class76.field1674) {
                        var15 = class76.field1674 + class76.field1674;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field417 + class76.field1674 - class57.field1258;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field420 + class76.field1674 - class57.field1258;
                        if (var17 > class76.field1674 + class76.field1674) {
                            var17 = class76.field1674 + class76.field1674;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class155.field2948[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field412 = 5;
                            var1.field413 = (var1.field407 - class254.field4478 << 8) / var13;
                            var1.field404 = (var1.field408 - class254.field4478 << 8) / var13;
                            var1.field402 = (var1.field406 - class108.field2177 << 8) / var13;
                            var1.field403 = (var1.field399 - class108.field2177 << 8) / var13;
                            class163.field3038[class126.field2462++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V")
    public class157(int arg0) {
        this.field2964 = arg0;
        this.field2966 = new class236[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class236 var3 = this.field2966[var2] = new class236();
            var3.field4218 = var3;
            var3.field4211 = var3;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)Lcb;")
    public final class236 method1176(byte arg0) {
        field2955++;
        if (arg0 != 22) {
            this.method1176((byte) -12);
        }
        if (this.field2971 > 0 && this.field2966[this.field2971 - 1] != this.field2973) {
            class236 var2 = this.field2973;
            this.field2973 = var2.field4211;
            return var2;
        }
        while (this.field2964 > this.field2971) {
            class236 var3 = this.field2966[this.field2971++].field4211;
            if (this.field2966[this.field2971 - 1] != var3) {
                this.field2973 = var3.field4211;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILsg;)V")
    public static final void method1177(int arg0, class30 arg1) {
        class201.method1427((byte) -117);
        class55.method527((byte) -86, arg1);
        field2961++;
        if (arg0 != 2) {
            field2953 = 39L;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)Lcb;")
    public final class236 method1178(boolean arg0) {
        field2968++;
        if (!arg0) {
            field2953 = 36L;
        }
        this.field2971 = 0;
        return this.method1176((byte) 22);
    }
}
