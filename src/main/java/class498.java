import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class498 {

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public int field6918 = -1;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "Lvj;")
    public static class373 field6919 = new class373(12, -2);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    private int field6917;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "J")
    private long field6910;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "J")
    private long field6916;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Z")
    public boolean field6922;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "[I")
    private int[] field6913;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "[I")
    public int[] field6924;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "[[I")
    private int[][] field6911;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILjh;Lfba;ILqa;ILlk;Llq;Lwg;Lwaa;B)Lr;")
    public final class157 method2873(int arg0, int arg1, class138 arg2, class24 arg3, int arg4, class206 arg5, int arg6, class502 arg7, class471 arg8, class360 arg9, class600 arg10, byte arg11) {
        field6921++;
        if (this.field6918 != -1) {
            return arg3.method150(true, this.field6918).method431(-28188, arg5, arg4, arg6, arg0, arg7, arg1, arg10, arg2);
        }
        int var13 = arg6;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg7.field6944[arg1];
            var13 = arg6 | 0x20;
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class183 var25 = arg2.method766(var23, 100);
            if (var25 != null) {
                var15 |= var25.method1004((byte) -6, var24);
                var14 |= var25.method1006(134217727, var24);
                var17 |= var25.method1002(var24, arg11 - 1);
                var16 |= arg7.field6943;
            }
            if ((arg7.field6954 || class166.field2034) && arg4 != -1 && arg7.field6944.length > arg4) {
                int var26 = arg7.field6944[arg4];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class183 var29 = var23 == var27 ? var25 : arg2.method766(var27, 100);
                if (var29 != null) {
                    var15 |= var29.method1004((byte) -6, var28);
                    var14 |= var29.method1006(134217727, var28);
                    var17 |= var29.method1002(var28, 3);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        class641 var30 = class325.field4116;
        class157 var31;
        synchronized (class325.field4116) {
            var31 = (class157) class325.field4116.method3682(0, this.field6910);
        }
        if (var31 == null || arg5.method1128(var31.method77(), var13) != 0) {
            if (var31 != null) {
                var13 = arg5.method1145(var13, var31.method77());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field6913[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg8.method2745((byte) 127, var35 & 0x3FFFFFFF).method3283(arg11 ^ 0x34)) {
                        var33 = true;
                    }
                } else if (!arg9.method2026((byte) -81, var35 & 0x3FFFFFFF).method3495(this.field6922, (byte) 115)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class152[] var36 = new class152[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field6913[var38];
                if ((var39 & 0x40000000) != 0) {
                    class152 var40 = arg9.method2026((byte) -76, var39 & 0x3FFFFFFF).method3500(this.field6922, true);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class152 var41 = arg8.method2745((byte) 127, var39 & 0x3FFFFFFF).method3287(true);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            class152 var42 = new class152(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg5.method277(var42, var43, class70.field676, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (class80.field963[var44].length > this.field6924[var44]) {
                    var31.method70(class578.field8430[var44], class80.field963[var44][this.field6924[var44]]);
                }
                if (this.field6924[var44] < class379.field5035[var44].length) {
                    var31.method70(class369.field4865[var44], class379.field5035[var44][this.field6924[var44]]);
                }
            }
            var31.method72(var13);
            class641 var45 = class325.field4116;
            synchronized (class325.field4116) {
                class325.field4116.method3684(var31, 0, this.field6910);
            }
        }
        if (arg7 == null) {
            return var31;
        } else {
            var31.method64(arg11, var13, true);
            return arg7.method2898(arg11 + 62, arg4, var31, arg6, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILlq;II)V")
    public final void method2874(int arg0, class471 arg1, int arg2, int arg3) {
        field6923++;
        int var5 = class476.field6689[arg0];
        if (this.field6913[var5] == 0 || arg1.method2745((byte) 124, arg2) == null) {
            return;
        }
        this.field6913[var5] = class42.method223(arg2, Integer.MIN_VALUE);
        this.method2878(255);
        if (arg3 != 1242619568) {
            this.method2880(38, 118, -107);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method2875(byte arg0) {
        field6919 = null;
        if (arg0 != 45) {
            method2875((byte) -10);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z[III[II)V")
    public final void method2876(boolean arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5) {
        this.field6913 = arg4;
        this.field6924 = arg1;
        this.field6922 = arg0;
        if (this.field6917 != arg2) {
            this.field6917 = arg2;
            this.field6911 = null;
        }
        field6920++;
        this.field6918 = arg5;
        this.method2878(255);
        if (arg3 != -1) {
            this.method2877(false, 42);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)V")
    public final void method2877(boolean arg0, int arg1) {
        field6912++;
        if (arg1 > 81) {
            this.field6922 = arg0;
            this.method2878(255);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    private final void method2878(int arg0) {
        field6925++;
        this.field6910 = -1L;
        long[] var2 = class242.field3025;
        this.field6910 = var2[(int) ((this.field6910 ^ (long) (this.field6917 >> 8)) & 0xFFL)] ^ this.field6910 >>> 8;
        this.field6910 = var2[(int) (((long) this.field6917 ^ this.field6910) & 0xFFL)] ^ this.field6910 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field6910 = var2[(int) (((long) (this.field6913[var3] >> 24) ^ this.field6910) & 0xFFL)] ^ this.field6910 >>> 8;
            this.field6910 = var2[(int) ((this.field6910 ^ (long) (this.field6913[var3] >> 16)) & 0xFFL)] ^ this.field6910 >>> 8;
            this.field6910 = this.field6910 >>> 8 ^ var2[(int) ((this.field6910 ^ (long) (this.field6913[var3] >> 8)) & 0xFFL)];
            this.field6910 = var2[(int) ((this.field6910 ^ (long) this.field6913[var3]) & 0xFFL)] ^ this.field6910 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field6910 = this.field6910 >>> 8 ^ var2[(int) ((this.field6910 ^ (long) this.field6924[var4]) & 0xFFL)];
        }
        this.field6910 = var2[(int) ((long) arg0 & (this.field6910 ^ (long) (this.field6922 ? 1 : 0)))] ^ this.field6910 >>> 8;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIILqa;IIBLlk;Llq;Ljh;)Lr;")
    public final class157 method2879(int arg0, int arg1, int arg2, int arg3, int arg4, class206 arg5, int arg6, int arg7, byte arg8, class502 arg9, class471 arg10, class138 arg11) {
        field6909++;
        int var13 = arg6;
        if (arg9 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg6 | 0x20;
            int var22 = arg9.field6944[arg2];
            int var23 = var22 >>> 16;
            class183 var24 = arg11.method766(var23, 100);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method1004((byte) -6, var25);
                var14 |= var24.method1006(134217727, var25);
                var17 |= var24.method1002(var25, 3);
                var16 |= arg9.field6943;
            }
            if ((arg9.field6954 || class166.field2034) && arg4 != -1 && arg9.field6944.length > arg4) {
                int var26 = arg9.field6944[arg4];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class183 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg11.method766(var28 >>> 16, 100);
                }
                if (var29 != null) {
                    var15 |= var29.method1004((byte) -6, var28);
                    var14 |= var29.method1006(134217727, var28);
                    var17 |= var29.method1002(var28, 3);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) (arg7 << 16) | (long) arg1 << 32 | (long) arg3;
        class641 var32 = class325.field4116;
        class157 var33;
        synchronized (class325.field4116) {
            var33 = (class157) class325.field4116.method3682(0, var30);
        }
        if (var33 == null || arg5.method1128(var33.method77(), var13) != 0) {
            if (var33 != null) {
                var13 = arg5.method1145(var13, var33.method77());
            }
            class152[] var35 = new class152[3];
            int var36 = 0;
            if (!arg10.method2745((byte) 124, arg3).method3283(106) || !arg10.method2745((byte) 125, arg7).method3283(108) || !arg10.method2745((byte) 126, arg1).method3283(111)) {
                return null;
            }
            class152 var37 = arg10.method2745((byte) 124, arg3).method3287(true);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class152 var38 = arg10.method2745((byte) 123, arg7).method3287(true);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class152 var39 = arg10.method2745((byte) 123, arg1).method3287(true);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class152 var40 = new class152(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg5.method277(var40, var41, class70.field676, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (this.field6924[var42] < class80.field963[var42].length) {
                    var33.method70(class578.field8430[var42], class80.field963[var42][this.field6924[var42]]);
                }
                if (class379.field5035[var42].length > this.field6924[var42]) {
                    var33.method70(class369.field4865[var42], class379.field5035[var42][this.field6924[var42]]);
                }
            }
            var33.method72(var13);
            class641 var43 = class325.field4116;
            synchronized (class325.field4116) {
                class325.field4116.method3684(var33, 0, var30);
            }
        }
        if (arg9 == null) {
            return var33;
        } else {
            class157 var44 = var33.method64((byte) 4, var13, true);
            int var45 = -30 % ((-arg8 - 25) / 35);
            return arg9.method2898(6, arg4, var44, arg6, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
    public final void method2880(int arg0, int arg1, int arg2) {
        if (arg0 != -181) {
            this.field6910 = 39L;
        }
        field6914++;
        this.field6924[arg1] = arg2;
        this.method2878(255);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZLhe;I)V")
    public static final void method2881(int arg0, boolean arg1, class310 arg2, int arg3) {
        field6915++;
        class69.field666[arg0][arg3] = arg2;
        if (arg1) {
            field6919 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILfba;IBLjh;ILlk;Lkn;ILwg;Lqa;Llq;ZILwaa;IILlk;[Ltw;)Lr;")
    public final class157 method2882(int arg0, class24 arg1, int arg2, byte arg3, class138 arg4, int arg5, class502 arg6, class629 arg7, int arg8, class360 arg9, class206 arg10, class471 arg11, boolean arg12, int arg13, class600 arg14, int arg15, int arg16, class502 arg17, class172[] arg18) {
        field6926++;
        if (this.field6918 != -1) {
            return arg1.method150(true, this.field6918).method424(arg2, arg5, arg0, (byte) 126, arg4, arg13, arg17, arg10, arg8, arg14, arg18, arg16, arg6, arg7, arg15);
        }
        int var20 = arg13;
        long var21 = this.field6910;
        int[] var23 = this.field6913;
        if (arg17 != null && (arg17.field6950 >= 0 || arg17.field6960 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field6913[var24];
            }
            if (arg17.field6950 >= 0) {
                if (arg17.field6950 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class42.method223(arg17.field6950, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg17.field6960 >= 0) {
                if (arg17.field6960 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class42.method223(arg17.field6960, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg17 != null || arg6 != null;
        int var29 = arg18 == null ? 0 : arg18.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class91.field1126[var30] = null;
            if (arg18[var30] != null) {
                class502 var31 = arg4.method770(arg18[var30].field2088, arg3 - 230);
                if (var31.field6944 != null) {
                    class292.field3784[var30] = var31;
                    var28 = true;
                    int var32 = arg18[var30].field2093;
                    int var33 = arg18[var30].field2094;
                    int var34 = var31.field6944[var32];
                    class91.field1126[var30] = arg4.method766(var34 >>> 16, 100);
                    int var35 = var34 & 0xFFFF;
                    class232.field2867[var30] = var35;
                    if (class91.field1126[var30] != null) {
                        var26 |= class91.field1126[var30].method1004((byte) -6, var35);
                        var25 |= class91.field1126[var30].method1006(134217727, var35);
                        var27 |= class91.field1126[var30].method1002(var35, 3);
                    }
                    if ((var31.field6954 || class166.field2034) && var33 != -1 && var33 < var31.field6944.length) {
                        class75.field879[var30] = var31.field6952[var32];
                        class365.field4795[var30] = arg18[var30].field2091;
                        int var36 = var31.field6944[var33];
                        class450.field6235[var30] = arg4.method766(var36 >>> 16, 100);
                        int var37 = var36 & 0xFFFF;
                        class189.field2273[var30] = var37;
                        if (class450.field6235[var30] != null) {
                            var26 |= class450.field6235[var30].method1004((byte) -6, var37);
                            var25 |= class450.field6235[var30].method1006(134217727, var37);
                            var27 |= class450.field6235[var30].method1002(var37, 3);
                        }
                    } else {
                        class75.field879[var30] = 0;
                        class365.field4795[var30] = 0;
                        class450.field6235[var30] = null;
                        class189.field2273[var30] = -1;
                    }
                }
            }
        }
        if (arg3 != 126) {
            return null;
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class183 var41 = null;
        class183 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class183 var46 = null;
        class183 var47 = null;
        if (var28) {
            if (arg17 != null) {
                int var48 = arg17.field6944[arg2];
                int var49 = var48 >>> 16;
                var38 = var48 & 0xFFFF;
                var41 = arg4.method766(var49, 100);
                if (var41 != null) {
                    var26 |= var41.method1004((byte) -6, var38);
                    var25 |= var41.method1006(134217727, var38);
                    var27 |= var41.method1002(var38, 3);
                }
                if ((arg17.field6954 || class166.field2034) && arg15 != -1 && arg17.field6944.length > arg15) {
                    int var50 = arg17.field6944[arg15];
                    var40 = arg17.field6952[arg2];
                    int var51 = var50 >>> 16;
                    var42 = var49 == var51 ? var41 : arg4.method766(var51, 100);
                    var39 = var50 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method1004((byte) -6, var39);
                        var25 |= var42.method1006(134217727, var39);
                        var27 |= var42.method1002(var39, 3);
                    }
                }
            }
            var20 = arg13 | 0x20;
            if (arg6 != null) {
                int var52 = arg6.field6944[arg8];
                int var53 = var52 >>> 16;
                var46 = arg4.method766(var53, 100);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method1004((byte) -6, var43);
                    var25 |= var46.method1006(134217727, var43);
                    var27 |= var46.method1002(var43, arg3 - 123);
                }
                if ((arg6.field6954 || class166.field2034) && arg5 != -1 && arg6.field6944.length > arg5) {
                    int var54 = arg6.field6944[arg5];
                    var45 = arg6.field6952[arg8];
                    int var55 = var54 >>> 16;
                    var47 = var53 == var55 ? var46 : arg4.method766(var55, 100);
                    var44 = var54 & 0xFFFF;
                    if (var47 != null) {
                        var26 |= var47.method1004((byte) -6, var44);
                        var25 |= var47.method1006(134217727, var44);
                        var27 |= var47.method1002(var44, 3);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var27) {
                var20 |= 0x400;
            }
        }
        class641 var56 = class342.field4407;
        class157 var57;
        synchronized (class342.field4407) {
            var57 = (class157) class342.field4407.method3682(0, var21);
        }
        class352 var58 = null;
        if (this.field6917 != -1) {
            var58 = arg7.method3605(this.field6917, 0);
        }
        if (var57 == null || arg10.method1128(var57.method77(), var20) != 0 || var58 != null && var58.field4583 != null && this.field6911 == null) {
            if (var57 != null) {
                var20 = arg10.method1145(var20, var57.method77());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((var62 & Integer.MIN_VALUE) != 0 && !arg11.method2745((byte) 127, var62 & 0x3FFFFFFF).method3284(-1417126941)) {
                        var60 = true;
                    }
                } else if (!arg9.method2026((byte) -126, var62 & 0x3FFFFFFF).method3498(this.field6922, 19292)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field6916 != -1L) {
                    class641 var63 = class342.field4407;
                    synchronized (class342.field4407) {
                        var57 = (class157) class342.field4407.method3682(0, this.field6916);
                    }
                }
                if (var57 == null || arg10.method1128(var57.method77(), var20) != 0 || var58 != null && var58.field4583 != null && this.field6911 == null) {
                    return null;
                }
            } else {
                class152[] var64 = new class152[12];
                for (int var65 = 0; var65 < 12; var65++) {
                    int var66 = var23[var65];
                    if ((var66 & 0x40000000) != 0) {
                        class152 var67 = arg9.method2026((byte) -66, var66 & 0x3FFFFFFF).method3501(this.field6922, arg3 ^ 0xFFFFFFFE);
                        if (var67 != null) {
                            var64[var65] = var67;
                        }
                    } else if ((Integer.MIN_VALUE & var66) != 0) {
                        class152 var68 = arg11.method2745((byte) 125, var66 & 0x3FFFFFFF).method3281(-98);
                        if (var68 != null) {
                            var64[var65] = var68;
                        }
                    }
                }
                if (var58 != null && var58.field4583 != null) {
                    for (int var69 = 0; var69 < var58.field4583.length; var69++) {
                        if (var58.field4583[var69] != null && var64[var69] != null) {
                            int var70 = var58.field4583[var69][0];
                            int var71 = var58.field4583[var69][1];
                            int var72 = var58.field4583[var69][2];
                            int var73 = var58.field4583[var69][3] << 3;
                            int var74 = var58.field4583[var69][4] << 3;
                            int var75 = var58.field4583[var69][5] << 3;
                            if (this.field6911 == null) {
                                this.field6911 = new int[var58.field4583.length][];
                            }
                            if (this.field6911[var69] == null) {
                                int[] var76 = this.field6911[var69] = new int[15];
                                if (var73 == 0 && var74 == 0 && var75 == 0) {
                                    var76[12] = -var70;
                                    var76[13] = -var71;
                                    var76[0] = var76[4] = var76[8] = 32768;
                                    var76[14] = -var72;
                                } else {
                                    int var77 = class442.field6101[var73];
                                    int var78 = class442.field6100[var73];
                                    int var79 = class442.field6101[var74];
                                    int var80 = class442.field6100[var74];
                                    int var81 = class442.field6101[var75];
                                    int var82 = class442.field6100[var75];
                                    int var83 = var78 * var81 + 16384 >> 15;
                                    int var84 = var78 * var82 + 16384 >> 15;
                                    var76[2] = var77 * var80 + 16384 >> 15;
                                    var76[6] = -var80 * var81 - (-(var79 * var84) - 16384) >> 15;
                                    var76[5] = -var78;
                                    var76[3] = var77 * var82 + 16384 >> 15;
                                    var76[1] = -var82 * var79 + (var80 * var83) + 16384 >> 15;
                                    var76[7] = -var80 * -var82 - (-(var79 * var83) - 16384) >> 15;
                                    var76[4] = var77 * var81 + 16384 >> 15;
                                    var76[8] = var77 * var79 + 16384 >> 15;
                                    var76[0] = var79 * var81 + var80 * var84 + 16384 >> 15;
                                    var76[13] = var76[7] * -var72 + var76[4] * -var71 + var76[1] * -var70 + 16384 >> 15;
                                    var76[14] = var76[5] * -var71 + var76[2] * -var70 + var76[8] * -var72 + 16384 >> 15;
                                    var76[12] = var76[3] * -var71 + var76[6] * -var72 + var76[0] * -var70 + 16384 >> 15;
                                }
                                var76[9] = var70;
                                var76[11] = var72;
                                var76[10] = var71;
                            }
                            if (var73 != 0 || var74 != 0 || var75 != 0) {
                                var64[var69].method838(var74, (byte) 117, var75, var73);
                            }
                            if (var70 != 0 || var71 != 0 || var72 != 0) {
                                var64[var69].method828(var72, var70, arg3 - 187, var71);
                            }
                        }
                    }
                }
                class152 var85 = new class152(var64, var64.length);
                int var86 = var20 | 0x4000;
                var57 = arg10.method277(var85, var86, class70.field676, 64, 850);
                for (int var87 = 0; var87 < 5; var87++) {
                    if (class80.field963[var87].length > this.field6924[var87]) {
                        var57.method70(class578.field8430[var87], class80.field963[var87][this.field6924[var87]]);
                    }
                    if (this.field6924[var87] < class379.field5035[var87].length) {
                        var57.method70(class369.field4865[var87], class379.field5035[var87][this.field6924[var87]]);
                    }
                }
                if (arg12) {
                    var57.method72(var20);
                    class641 var88 = class342.field4407;
                    synchronized (class342.field4407) {
                        class342.field4407.method3684(var57, 0, var21);
                    }
                    this.field6916 = var21;
                }
            }
        }
        class157 var89 = var57.method64((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var29 > var90) {
            if (class91.field1126[var90] != null) {
                var89.method861(-10766, class75.field879[var90], 0, var91, class232.field2867[var90], class91.field1126[var90], class450.field6235[var90], false, class189.field2273[var90], class365.field4795[var90] - 1, this.field6911 == null ? null : this.field6911[var90]);
            }
            var90++;
            var91 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var89.method865(var42, arg16 - 1, arg0 - 1, 85, var40, var38, var39, var44, arg17.field6958, false, var43, var47, var46, var41, var45);
        } else if (var41 != null) {
            var89.method863(var42, arg3 ^ 0x7E, var38, 0, false, var39, var41, arg16 - 1, var40);
        } else if (var46 != null) {
            var89.method863(var47, 0, var43, 0, false, var44, var46, arg0 - 1, var45);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class91.field1126[var92] = null;
            class450.field6235[var92] = null;
            class292.field3784[var92] = null;
        }
        return var89;
    }
}
