import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class534 {

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public int field7456 = -1;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    private int field7462;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "J")
    private long field7446;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "J")
    private long field7452;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "Lvv;")
    public static class640 field7449;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "Z")
    public boolean field7451;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "[I")
    public int[] field7450;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "[I")
    private int[] field7464;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "[[B")
    public static byte[][] field7454;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "[[I")
    private int[][] field7459;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
    private final void method2966(byte arg0) {
        field7463++;
        long[] var2 = class81.field1100;
        this.field7452 = -1L;
        this.field7452 = this.field7452 >>> 8 ^ var2[(int) (((long) (this.field7462 >> 8) ^ this.field7452) & 0xFFL)];
        this.field7452 = this.field7452 >>> 8 ^ var2[(int) ((this.field7452 ^ (long) this.field7462) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field7452 = var2[(int) ((this.field7452 ^ (long) (this.field7464[var3] >> 24)) & 0xFFL)] ^ this.field7452 >>> 8;
            this.field7452 = var2[(int) ((this.field7452 ^ (long) (this.field7464[var3] >> 16)) & 0xFFL)] ^ this.field7452 >>> 8;
            this.field7452 = var2[(int) (((long) (this.field7464[var3] >> 8) ^ this.field7452) & 0xFFL)] ^ this.field7452 >>> 8;
            this.field7452 = var2[(int) ((this.field7452 ^ (long) this.field7464[var3]) & 0xFFL)] ^ this.field7452 >>> 8;
        }
        int var4 = 78 / ((42 - arg0) / 63);
        for (int var5 = 0; var5 < 5; var5++) {
            this.field7452 = var2[(int) (((long) this.field7450[var5] ^ this.field7452) & 0xFFL)] ^ this.field7452 >>> 8;
        }
        this.field7452 = var2[(int) (((long) (this.field7451 ? 1 : 0) ^ this.field7452) & 0xFFL)] ^ this.field7452 >>> 8;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;ZZZLgaa;)V")
    public static final void method2967(String arg0, boolean arg1, boolean arg2, boolean arg3, class279 arg4) {
        field7458++;
        if (arg3) {
            return;
        }
        if (!arg2) {
            class57.method309(arg4, 112, 3, arg0);
            return;
        }
        if (class279.field3649.startsWith("win") && class279.field3639 != 3) {
            String var5 = null;
            if (arg4.field3644 != null) {
                var5 = arg4.field3644.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class441 var6 = class57.method309(arg4, 112, 0, arg0);
                class224.field2863 = arg4;
                class565.field7920 = arg0;
                class391.field5427 = var6;
                return;
            }
        }
        if (class279.field3649.startsWith("mac")) {
            String var7 = null;
            if (arg4.field3644 != null) {
                var7 = arg4.field3644.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg1) {
                class57.method309(arg4, 101, 1, arg0);
                return;
            }
        }
        class57.method309(arg4, 94, 2, arg0);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)V")
    public final void method2968(int arg0, int arg1, int arg2) {
        field7448++;
        if (arg0 == 2018913102) {
            this.field7450[arg1] = arg2;
            this.method2966((byte) 115);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILau;I)V")
    public final void method2969(int arg0, int arg1, class478 arg2, int arg3) {
        field7457++;
        if (arg0 != 0) {
            this.field7459 = null;
        }
        int var5 = class422.field5735[arg1];
        if (this.field7464[var5] != 0 && arg2.method2712(arg3, (byte) -126) != null) {
            this.field7464[var5] = class292.method1790(Integer.MIN_VALUE, arg3);
            this.method2966((byte) 127);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2970(String arg0, byte arg1) {
        class392.method2365(arg0, (byte) 118, 0, "", 0, "");
        if (arg1 < -17) {
            field7461++;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)V")
    public final void method2971(boolean arg0, int arg1) {
        field7453++;
        if (arg1 > -122) {
            this.method2971(true, 27);
        }
        this.field7451 = arg0;
        this.method2966((byte) 116);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILqb;IILqa;ILau;Ltv;Lqp;Lna;Lok;B)Lr;")
    public final class521 method2972(int arg0, class627 arg1, int arg2, int arg3, class167 arg4, int arg5, class478 arg6, class361 arg7, class586 arg8, class320 arg9, class97 arg10, byte arg11) {
        field7460++;
        if (this.field7456 != -1) {
            return arg1.method3623(this.field7456, (byte) 75).method3618(-65536, arg4, arg3, arg7, arg2, arg5, arg9, arg0, arg10);
        }
        int var13 = arg3;
        if (arg9 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg3 | 0x20;
            int var21 = arg9.field4431[arg0];
            Object var22 = null;
            int var23 = var21 >>> 16;
            class556 var24 = arg10.method536(var23, (byte) -46);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method3113(var25, 25971);
                var14 |= var24.method3114(var25, 0);
                var17 |= var24.method3116(-28624, var25);
                var16 |= arg9.field4422;
            }
            if ((arg9.field4410 || class551.field7667) && arg5 != -1 && arg9.field4431.length > arg5) {
                int var26 = arg9.field4431[arg5];
                int var27 = var26 >>> 16;
                class556 var28 = var23 == var27 ? var24 : arg10.method536(var27, (byte) -46);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method3113(var29, 25971);
                    var14 |= var28.method3114(var29, 0);
                    var17 |= var28.method3116(-28624, var29);
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
        int var30 = 106 % ((arg11 - 66) / 33);
        class58 var31 = class358.field5001;
        class521 var32;
        synchronized (class358.field5001) {
            var32 = (class521) class358.field5001.method323(this.field7452, -19814);
        }
        if (var32 == null || arg4.method921(var32.method1601(), var13) != 0) {
            if (var32 != null) {
                var13 = arg4.method938(var13, var32.method1601());
            }
            boolean var34 = false;
            for (int var35 = 0; var35 < 12; var35++) {
                int var36 = this.field7464[var35];
                if ((var36 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var36) != 0 && !arg6.method2712(var36 & 0x3FFFFFFF, (byte) 122).method3697((byte) 83)) {
                        var34 = true;
                    }
                } else if (!arg8.method3391(0, var36 & 0x3FFFFFFF).method2642(this.field7451, (byte) -127)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class528[] var37 = new class528[12];
            int var38 = 0;
            for (int var39 = 0; var39 < 12; var39++) {
                int var40 = this.field7464[var39];
                if ((var40 & 0x40000000) != 0) {
                    class528 var41 = arg8.method3391(0, var40 & 0x3FFFFFFF).method2653(-18496, this.field7451);
                    if (var41 != null) {
                        var37[var38++] = var41;
                    }
                } else if ((Integer.MIN_VALUE & var40) != 0) {
                    class528 var42 = arg6.method2712(var40 & 0x3FFFFFFF, (byte) -117).method3701((byte) 93);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                }
            }
            int var43 = var13 | 0x4000;
            class528 var44 = new class528(var37, var38);
            var32 = arg4.method197(var44, var43, class287.field3758, 64, 768);
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field7450[var45] < class384.field5358[var45].length) {
                    var32.method1587(class18.field203[var45], class384.field5358[var45][this.field7450[var45]]);
                }
                if (class227.field2910[var45].length > this.field7450[var45]) {
                    var32.method1587(class20.field290[var45], class227.field2910[var45][this.field7450[var45]]);
                }
            }
            var32.method1583(var13);
            class58 var46 = class358.field5001;
            synchronized (class358.field5001) {
                class358.field5001.method316(this.field7452, (byte) -128, var32);
            }
        }
        if (arg9 == null) {
            return var32;
        } else {
            var32.method1607((byte) 4, var13, true);
            return arg9.method1996(arg5, arg2, var32, arg3, -2086254192, arg0);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lok;ILna;IIBIILqa;IILau;)Lr;")
    public final class521 method2973(class97 arg0, int arg1, class320 arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, class167 arg8, int arg9, int arg10, class478 arg11) {
        field7447++;
        int var13 = arg3;
        if (arg2 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg3 | 0x20;
            Object var21 = null;
            int var22 = arg2.field4431[arg10];
            int var23 = var22 >>> 16;
            class556 var24 = arg0.method536(var23, (byte) -46);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method3113(var25, 25971);
                var14 |= var24.method3114(var25, 0);
                var17 |= var24.method3116(-28624, var25);
                var16 |= arg2.field4422;
            }
            if ((arg2.field4410 || class551.field7667) && arg9 != -1 && arg2.field4431.length > arg9) {
                int var26 = arg2.field4431[arg9];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class556 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg0.method536(var28 >>> 16, (byte) -46);
                }
                if (var29 != null) {
                    var15 |= var29.method3113(var28, 25971);
                    var14 |= var29.method3114(var28, 0);
                    var17 |= var29.method3116(-28624, var28);
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
        long var30 = (long) (arg4 << 16) | (long) arg7 << 32 | (long) arg1;
        if (arg5 < 117) {
            this.method2968(9, 120, 31);
        }
        class58 var32 = class358.field5001;
        class521 var33;
        synchronized (class358.field5001) {
            var33 = (class521) class358.field5001.method323(var30, -19814);
        }
        if (var33 == null || arg8.method921(var33.method1601(), var13) != 0) {
            if (var33 != null) {
                var13 = arg8.method938(var13, var33.method1601());
            }
            class528[] var35 = new class528[3];
            int var36 = 0;
            if (!arg11.method2712(arg1, (byte) 122).method3697((byte) 108) || !arg11.method2712(arg4, (byte) -126).method3697((byte) 82) || !arg11.method2712(arg7, (byte) -67).method3697((byte) 76)) {
                return null;
            }
            class528 var37 = arg11.method2712(arg1, (byte) 120).method3701((byte) 49);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class528 var38 = arg11.method2712(arg4, (byte) 120).method3701((byte) 52);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class528 var39 = arg11.method2712(arg7, (byte) -72).method3701((byte) 48);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class528 var41 = new class528(var35, var36);
            var33 = arg8.method197(var41, var40, class287.field3758, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (this.field7450[var42] < class384.field5358[var42].length) {
                    var33.method1587(class18.field203[var42], class384.field5358[var42][this.field7450[var42]]);
                }
                if (class227.field2910[var42].length > this.field7450[var42]) {
                    var33.method1587(class20.field290[var42], class227.field2910[var42][this.field7450[var42]]);
                }
            }
            var33.method1583(var13);
            class58 var43 = class358.field5001;
            synchronized (class358.field5001) {
                class358.field5001.method316(var30, (byte) -116, var33);
            }
        }
        if (arg2 == null) {
            return var33;
        } else {
            class521 var44 = var33.method1607((byte) 4, var13, true);
            return arg2.method1996(arg9, arg6, var44, arg3, -2086254192, arg10);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
    public static void method2974(int arg0) {
        if (arg0 > -41) {
            field7454 = null;
        }
        field7454 = null;
        field7449 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lqa;IILtv;ILau;Lna;Lp;Lna;[Lkj;Lqp;Lok;IIILqb;IIZ)Lr;")
    public final class521 method2975(class167 arg0, int arg1, int arg2, class361 arg3, int arg4, class478 arg5, class320 arg6, class233 arg7, class320 arg8, class257[] arg9, class586 arg10, class97 arg11, int arg12, int arg13, int arg14, class627 arg15, int arg16, int arg17, boolean arg18) {
        field7455++;
        if (this.field7456 != -1) {
            return arg15.method3623(this.field7456, (byte) -115).method3608(arg9, arg4, arg11, arg3, arg0, arg14, arg6, arg8, arg1, true, arg17, arg16, arg13, arg7, arg2);
        }
        int var20 = arg16;
        long var21 = this.field7452;
        int[] var23 = this.field7464;
        if (arg6 != null && (arg6.field4420 >= 0 || arg6.field4409 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field7464[var24];
            }
            if (arg6.field4420 >= 0) {
                if (arg6.field4420 == 65535) {
                    var23[5] = 0;
                    var21 ^= 0xFFFFFFFF00000000L;
                } else {
                    var23[5] = class292.method1790(1073741824, arg6.field4420);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg6.field4409 >= 0) {
                if (arg6.field4409 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class292.method1790(arg6.field4409, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg6 != null || arg8 != null;
        int var29 = arg9 == null ? 0 : arg9.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class164.field2085[var30] = null;
            if (arg9[var30] != null) {
                class320 var31 = arg11.method535(arg9[var30].field3194, true);
                if (var31.field4431 != null) {
                    class168.field2126[var30] = var31;
                    var28 = true;
                    int var32 = arg9[var30].field3187;
                    int var33 = arg9[var30].field3188;
                    int var34 = var31.field4431[var32];
                    class164.field2085[var30] = arg11.method536(var34 >>> 16, (byte) -46);
                    int var35 = var34 & 0xFFFF;
                    class55.field737[var30] = var35;
                    if (class164.field2085[var30] != null) {
                        var26 |= class164.field2085[var30].method3113(var35, 25971);
                        var25 |= class164.field2085[var30].method3114(var35, 0);
                        var27 |= class164.field2085[var30].method3116(-28624, var35);
                    }
                    if ((var31.field4410 || class551.field7667) && var33 != -1 && var33 < var31.field4431.length) {
                        class384.field5359[var30] = var31.field4432[var32];
                        class497.field6929[var30] = arg9[var30].field3186;
                        int var36 = var31.field4431[var33];
                        class492.field6874[var30] = arg11.method536(var36 >>> 16, (byte) -46);
                        int var37 = var36 & 0xFFFF;
                        class606.field8722[var30] = var37;
                        if (class492.field6874[var30] != null) {
                            var26 |= class492.field6874[var30].method3113(var37, 25971);
                            var25 |= class492.field6874[var30].method3114(var37, 0);
                            var27 |= class492.field6874[var30].method3116(-28624, var37);
                        }
                    } else {
                        class384.field5359[var30] = 0;
                        class497.field6929[var30] = 0;
                        class492.field6874[var30] = null;
                        class606.field8722[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        if (arg12 <= 87) {
            method2976(-83);
        }
        int var39 = -1;
        int var40 = 0;
        class556 var41 = null;
        class556 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class556 var46 = null;
        class556 var47 = null;
        if (var28) {
            var20 = arg16 | 0x20;
            if (arg6 != null) {
                int var48 = arg6.field4431[arg14];
                int var49 = var48 >>> 16;
                var41 = arg11.method536(var49, (byte) -46);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method3113(var38, 25971);
                    var25 |= var41.method3114(var38, 0);
                    var27 |= var41.method3116(-28624, var38);
                }
                if ((arg6.field4410 || class551.field7667) && arg17 != -1 && arg17 < arg6.field4431.length) {
                    int var50 = arg6.field4431[arg17];
                    var40 = arg6.field4432[arg14];
                    int var51 = var50 >>> 16;
                    var42 = var49 == var51 ? var41 : arg11.method536(var51, (byte) -46);
                    var39 = var50 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method3113(var39, 25971);
                        var25 |= var42.method3114(var39, 0);
                        var27 |= var42.method3116(-28624, var39);
                    }
                }
            }
            if (arg8 != null) {
                int var52 = arg8.field4431[arg4];
                int var53 = var52 >>> 16;
                var46 = arg11.method536(var53, (byte) -46);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method3113(var43, 25971);
                    var25 |= var46.method3114(var43, 0);
                    var27 |= var46.method3116(-28624, var43);
                }
                if ((arg8.field4410 || class551.field7667) && arg2 != -1 && arg8.field4431.length > arg2) {
                    int var54 = arg8.field4431[arg2];
                    var45 = arg8.field4432[arg4];
                    int var55 = var54 >>> 16;
                    var44 = var54 & 0xFFFF;
                    var47 = var53 == var55 ? var46 : arg11.method536(var55, (byte) -46);
                    if (var47 != null) {
                        var26 |= var47.method3113(var44, 25971);
                        var25 |= var47.method3114(var44, 0);
                        var27 |= var47.method3116(-28624, var44);
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
        class58 var56 = class60.field834;
        class521 var57;
        synchronized (class60.field834) {
            var57 = (class521) class60.field834.method323(var21, -19814);
        }
        class362 var58 = null;
        if (this.field7462 != -1) {
            var58 = arg7.method1473(this.field7462, -66);
        }
        if (var57 == null || arg0.method921(var57.method1601(), var20) != 0 || var58 != null && var58.field5061 != null && this.field7459 == null) {
            if (var57 != null) {
                var20 = arg0.method938(var20, var57.method1601());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var62) != 0 && !arg5.method2712(var62 & 0x3FFFFFFF, (byte) -113).method3695(true)) {
                        var60 = true;
                    }
                } else if (!arg10.method3391(0, var62 & 0x3FFFFFFF).method2650(this.field7451, (byte) 55)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field7446 != -1L) {
                    class58 var63 = class60.field834;
                    synchronized (class60.field834) {
                        var57 = (class521) class60.field834.method323(this.field7446, -19814);
                    }
                }
                if (var57 == null || arg0.method921(var57.method1601(), var20) != 0 || var58 != null && var58.field5061 != null && this.field7459 == null) {
                    return null;
                }
            } else {
                class528[] var64 = new class528[12];
                for (int var65 = 0; var65 < 12; var65++) {
                    int var66 = var23[var65];
                    if ((var66 & 0x40000000) != 0) {
                        class528 var67 = arg10.method3391(0, var66 & 0x3FFFFFFF).method2643(false, this.field7451);
                        if (var67 != null) {
                            var64[var65] = var67;
                        }
                    } else if ((var66 & Integer.MIN_VALUE) != 0) {
                        class528 var68 = arg5.method2712(var66 & 0x3FFFFFFF, (byte) -64).method3703(0);
                        if (var68 != null) {
                            var64[var65] = var68;
                        }
                    }
                }
                if (var58 != null && var58.field5061 != null) {
                    for (int var69 = 0; var69 < var58.field5061.length; var69++) {
                        if (var58.field5061[var69] != null && var64[var69] != null) {
                            int var70 = var58.field5061[var69][0];
                            int var71 = var58.field5061[var69][1];
                            int var72 = var58.field5061[var69][2];
                            int var73 = var58.field5061[var69][3] << 3;
                            int var74 = var58.field5061[var69][4] << 3;
                            int var75 = var58.field5061[var69][5] << 3;
                            if (this.field7459 == null) {
                                this.field7459 = new int[var58.field5061.length][];
                            }
                            if (this.field7459[var69] == null) {
                                int[] var76 = this.field7459[var69] = new int[15];
                                if (var73 == 0 && var74 == 0 && var75 == 0) {
                                    var76[13] = -var71;
                                    var76[0] = var76[4] = var76[8] = 32768;
                                    var76[12] = -var70;
                                    var76[14] = -var72;
                                } else {
                                    int var77 = class310.field3965[var73];
                                    int var78 = class310.field3966[var73];
                                    int var79 = class310.field3965[var74];
                                    int var80 = class310.field3966[var74];
                                    int var81 = class310.field3965[var75];
                                    int var82 = class310.field3966[var75];
                                    int var83 = var78 * var81 + 8192 >> 14;
                                    int var84 = var78 * var82 + 8192 >> 14;
                                    var76[0] = var79 * var81 + var80 * var84 + 8192 >> 14;
                                    var76[5] = -var78;
                                    var76[8] = var77 * var79 + 8192 >> 14;
                                    var76[4] = var77 * var81 + 8192 >> 14;
                                    var76[1] = -var82 * var79 - (-(var80 * var83) - 8192) >> 14;
                                    var76[7] = -var80 * -var82 + var79 * var83 + 8192 >> 14;
                                    var76[2] = var77 * var80 + 8192 >> 14;
                                    var76[3] = var77 * var82 + 8192 >> 14;
                                    var76[6] = -var80 * var81 - (-(var79 * var84) - 8192) >> 14;
                                    var76[14] = var76[2] * -var70 + 8192 - (-(var76[5] * -var71) - var76[8] * -var72) >> 14;
                                    var76[13] = var76[1] * -var70 + var76[7] * -var72 + var76[4] * -var71 + 8192 >> 14;
                                    var76[12] = var76[3] * -var71 + var76[0] * -var70 + var76[6] * -var72 + 8192 >> 14;
                                }
                                var76[10] = var71;
                                var76[9] = var70;
                                var76[11] = var72;
                            }
                            if (var73 != 0 || var74 != 0 || var75 != 0) {
                                var64[var69].method2939(var74, var75, 0, var73);
                            }
                            if (var70 != 0 || var71 != 0 || var72 != 0) {
                                var64[var69].method2935(var70, var72, -19994, var71);
                            }
                        }
                    }
                }
                class528 var85 = new class528(var64, var64.length);
                int var86 = var20 | 0x4000;
                var57 = arg0.method197(var85, var86, class287.field3758, 64, 850);
                for (int var87 = 0; var87 < 5; var87++) {
                    if (this.field7450[var87] < class384.field5358[var87].length) {
                        var57.method1587(class18.field203[var87], class384.field5358[var87][this.field7450[var87]]);
                    }
                    if (this.field7450[var87] < class227.field2910[var87].length) {
                        var57.method1587(class20.field290[var87], class227.field2910[var87][this.field7450[var87]]);
                    }
                }
                if (arg18) {
                    var57.method1583(var20);
                    class58 var88 = class60.field834;
                    synchronized (class60.field834) {
                        class60.field834.method316(var21, (byte) -109, var57);
                    }
                    this.field7446 = var21;
                }
            }
        }
        class521 var89 = var57.method1607((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var90 < var29) {
            if (class164.field2085[var90] != null) {
                var89.method2911(class55.field737[var90], class606.field8722[var90], class164.field2085[var90], class497.field6929[var90] - 1, 0, false, var91, 0, this.field7459 == null ? null : this.field7459[var90], class384.field5359[var90], class492.field6874[var90]);
            }
            var90++;
            var91 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var89.method2905(var41, var39, (byte) 106, arg13 - 1, var44, arg6.field4425, arg1 - 1, var43, var42, var45, var40, var38, var46, var47, false);
        } else if (var41 != null) {
            var89.method2910(var41, var40, arg1 - 1, var42, var39, 0, 2, var38, false);
        } else if (var46 != null) {
            var89.method2910(var46, var45, arg13 - 1, var47, var44, 0, 2, var43, false);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class164.field2085[var92] = null;
            class492.field6874[var92] = null;
            class168.field2126[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
    public static final void method2976(int arg0) {
        field7465++;
        class50.field673 = 0;
        class57.field760.method3178(-8299);
        class57.field760.method3181(class507.field7063, true);
        if (arg0 != 1073741824) {
            field7449 = null;
        }
        class50.field673++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z[IIII[I)V")
    public final void method2977(boolean arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (this.field7462 != arg2) {
            this.field7462 = arg2;
            this.field7459 = null;
        }
        this.field7464 = arg5;
        this.field7456 = arg4;
        if (arg3 != 5) {
            this.field7462 = -80;
        }
        field7445++;
        this.field7451 = arg0;
        this.field7450 = arg1;
        this.method2966((byte) -42);
    }
}
