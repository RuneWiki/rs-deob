import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class41 {

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public int field512 = -1;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field513 = 0;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "J")
    private long field514;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "J")
    private long field519;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Luu;")
    public static class237 field502;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Z")
    public boolean field503;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "[I")
    private int[] field511;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "[I")
    public int[] field515;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLpia;IILpga;Lav;IIIIILha;)Lka;")
    public final class284 method222(byte arg0, class57 arg1, int arg2, int arg3, class495 arg4, class416 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class548 arg11) {
        field507++;
        int var13 = arg2;
        if (arg1 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg1.field821[arg9];
            var13 = arg2 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class526 var25 = arg4.method2996(var23, (byte) -125);
            if (var25 != null) {
                var15 |= var25.method3130(var24, -1);
                var14 |= var25.method3126(var24, true);
                var17 |= var25.method3127(var24, -92);
                var16 |= arg1.field823;
            }
            if ((arg1.field808 || class175.field2409) && arg10 != -1 && arg10 < arg1.field821.length) {
                int var26 = arg1.field821[arg10];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class526 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg4.method2996(var28 >>> 16, (byte) -117);
                }
                if (var29 != null) {
                    var15 |= var29.method3130(var28, -1);
                    var14 |= var29.method3126(var28, true);
                    var17 |= var29.method3127(var28, -112);
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
        long var30 = (long) arg7 << 32 | (long) (arg8 << 16) | (long) arg3;
        class690 var32 = class684.field9509;
        class284 var33;
        synchronized (class684.field9509) {
            var33 = (class284) class684.field9509.method3898((byte) -42, var30);
            if (arg0 > -56) {
                this.method228(-98, -76, -3, false, null, null);
            }
        }
        if (var33 == null || arg11.method1484(var33.method1703(), var13) != 0) {
            if (var33 != null) {
                var13 = arg11.method1390(var13, var33.method1703());
            }
            class133[] var35 = new class133[3];
            int var36 = 0;
            if (!arg5.method2585(-110, arg3).method1721((byte) -127) || !arg5.method2585(91, arg8).method1721((byte) 105) || !arg5.method2585(92, arg7).method1721((byte) 127)) {
                return null;
            }
            class133 var37 = arg5.method2585(-66, arg3).method1717(-24585);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class133 var38 = arg5.method2585(83, arg8).method1717(-24585);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class133 var39 = arg5.method2585(49, arg7).method1717(-24585);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class133 var41 = new class133(var35, var36);
            var33 = arg11.method1463(var41, var40, class675.field9369, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class195.field2630.length; var43++) {
                    if (class195.field2630[var43][var42].length > this.field515[var42]) {
                        var33.method1660(class370.field5230[var43][var42], class195.field2630[var43][var42][this.field515[var42]]);
                    }
                }
            }
            var33.method1691(var13);
            class690 var44 = class684.field9509;
            synchronized (class684.field9509) {
                class684.field9509.method3899(81, var33, var30);
            }
        }
        if (arg1 == null) {
            return var33;
        } else {
            class284 var45 = var33.method1659((byte) 4, var13, true);
            return arg1.method408(arg9, arg2, arg6, var45, arg10, 85);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZIII)I")
    public static final int method223(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            return -91;
        }
        field510++;
        if (arg2 > arg3) {
            return arg2;
        } else if (arg3 > arg1) {
            return arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lmm;Lgo;Lav;Lpga;IILaaa;Lpia;Lha;BII)Lka;")
    public final class284 method224(class536 arg0, class221 arg1, class416 arg2, class495 arg3, int arg4, int arg5, class26 arg6, class57 arg7, class548 arg8, byte arg9, int arg10, int arg11) {
        field508++;
        if (this.field512 != -1) {
            return arg6.method146(2, this.field512).method766(arg10, (byte) -52, arg11, arg7, arg8, arg4, arg0, arg5, null, arg3);
        }
        int var13 = arg10;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg10 | 0x20;
            int var21 = arg7.field821[arg4];
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class526 var25 = arg3.method2996(var23, (byte) -117);
            if (var25 != null) {
                var15 |= var25.method3130(var24, -1);
                var14 |= var25.method3126(var24, true);
                var17 |= var25.method3127(var24, -84);
                var16 |= arg7.field823;
            }
            if ((arg7.field808 || class175.field2409) && arg11 != -1 && arg11 < arg7.field821.length) {
                int var26 = arg7.field821[arg11];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class526 var29 = var23 == var27 ? var25 : arg3.method2996(var27, (byte) -114);
                if (var29 != null) {
                    var15 |= var29.method3130(var28, -1);
                    var14 |= var29.method3126(var28, true);
                    var17 |= var29.method3127(var28, -77);
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
        class690 var30 = class684.field9509;
        class284 var31;
        synchronized (class684.field9509) {
            var31 = (class284) class684.field9509.method3898((byte) -42, this.field514);
        }
        if (var31 == null || arg8.method1484(var31.method1703(), var13) != 0) {
            if (var31 != null) {
                var13 = arg8.method1390(var13, var31.method1703());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field511[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg2.method2585(98, var35 & 0x3FFFFFFF).method1721((byte) 84)) {
                        var33 = true;
                    }
                } else if (!arg1.method1313(var35 & 0x3FFFFFFF, true).method3801(this.field503, false)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class133[] var36 = new class133[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field511[var38];
                if ((var39 & 0x40000000) != 0) {
                    class133 var41 = arg1.method1313(var39 & 0x3FFFFFFF, true).method3784(this.field503, (byte) -104);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class133 var40 = arg2.method2585(51, var39 & 0x3FFFFFFF).method1717(-24585);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            class133 var42 = new class133(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg8.method1463(var42, var43, class675.field9369, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class195.field2630.length; var45++) {
                    if (class195.field2630[var45][var44].length > this.field515[var44]) {
                        var31.method1660(class370.field5230[var45][var44], class195.field2630[var45][var44][this.field515[var44]]);
                    }
                }
            }
            var31.method1691(var13);
            class690 var46 = class684.field9509;
            synchronized (class684.field9509) {
                class684.field9509.method3899(47, var31, this.field514);
            }
        }
        if (arg7 == null) {
            return var31;
        }
        var31.method1659((byte) 4, var13, true);
        if (arg9 > -77) {
            field513 = 3;
        }
        return arg7.method408(arg4, arg10, arg5, var31, arg11, 119);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZB)V")
    public final void method225(boolean arg0, byte arg1) {
        if (arg1 < -52) {
            field504++;
            this.field503 = arg0;
            this.method231((byte) 97);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILgo;Z)V")
    public final void method226(int arg0, int arg1, class221 arg2, boolean arg3) {
        if (!arg3) {
            this.method232(50, -119, -24);
        }
        field500++;
        if (arg0 == -1) {
            this.field511[arg1] = 0;
        } else if (arg2.method1313(arg0, true) != null) {
            this.field511[arg1] = class678.method3817(1073741824, arg0);
            this.method231((byte) 99);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lav;IBI)V")
    public final void method227(class416 arg0, int arg1, byte arg2, int arg3) {
        field506++;
        if (arg2 != -3) {
            return;
        }
        int var5 = class453.field6273[arg1];
        if (arg0.method2585(arg2 ^ 0xFFFFFF8B, arg3) != null) {
            this.field511[var5] = class678.method3817(arg3, Integer.MIN_VALUE);
            this.method231((byte) 116);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIZ[I[I)V")
    public final void method228(int arg0, int arg1, int arg2, boolean arg3, int[] arg4, int[] arg5) {
        field518++;
        this.field503 = arg3;
        if (this.field509 != arg1) {
            this.field509 = arg1;
        }
        this.field515 = arg4;
        this.field511 = arg5;
        this.field512 = arg0;
        this.method231((byte) 79);
        if (arg2 <= 13) {
            this.field515 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lpga;Lpia;Lgo;Lha;IBIILav;I[IILpia;IILgaa;Laaa;[Lhd;ILmm;Z)Lka;")
    public final class284 method229(class495 arg0, class57 arg1, class221 arg2, class548 arg3, int arg4, byte arg5, int arg6, int arg7, class416 arg8, int arg9, int[] arg10, int arg11, class57 arg12, int arg13, int arg14, class72 arg15, class26 arg16, class597[] arg17, int arg18, class536 arg19, boolean arg20) {
        field516++;
        if (this.field512 != -1) {
            return arg16.method146(2, this.field512).method767(arg1, arg14, true, arg4, arg17, arg15, arg13, arg11, arg10, arg6, arg7, arg0, arg19, arg3, arg18, arg12, null, arg9);
        }
        int var22 = arg6;
        long var23 = this.field514;
        int[] var25 = this.field511;
        if (arg1 != null && (arg1.field824 >= 0 || arg1.field802 >= 0)) {
            var25 = new int[12];
            for (int var26 = 0; var26 < 12; var26++) {
                var25[var26] = this.field511[var26];
            }
            if (arg1.field824 >= 0) {
                if (arg1.field824 == 65535) {
                    var25[5] = 0;
                    var23 ^= 0xFFFFFFFF00000000L;
                } else {
                    var25[5] = class678.method3817(1073741824, arg1.field824);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg1.field802 >= 0) {
                if (arg1.field802 == 65535) {
                    var23 ^= 0xFFFFFFFFL;
                    var25[3] = 0;
                } else {
                    var25[3] = class678.method3817(1073741824, arg1.field802);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var27 = false;
        if (arg5 != -50) {
            this.field511 = null;
        }
        boolean var28 = false;
        boolean var29 = false;
        boolean var30 = arg1 != null || arg12 != null;
        int var31 = arg17 == null ? 0 : arg17.length;
        for (int var32 = 0; var32 < var31; var32++) {
            class8.field82[var32] = null;
            if (arg17[var32] != null) {
                class57 var33 = arg0.method3001(-12575, arg17[var32].field8105);
                if (var33.field821 != null) {
                    class592.field8035[var32] = var33;
                    var30 = true;
                    int var34 = arg17[var32].field8103;
                    int var35 = arg17[var32].field8100;
                    int var36 = var33.field821[var34];
                    class8.field82[var32] = arg0.method2996(var36 >>> 16, (byte) -125);
                    int var37 = var36 & 0xFFFF;
                    class348.field4953[var32] = var37;
                    if (class8.field82[var32] != null) {
                        var28 |= class8.field82[var32].method3130(var37, arg5 ^ 0x31);
                        var27 |= class8.field82[var32].method3126(var37, true);
                        var29 |= class8.field82[var32].method3127(var37, -95);
                    }
                    if ((var33.field808 || class175.field2409) && var35 != -1 && var33.field821.length > var35) {
                        class125.field1717[var32] = var33.field813[var34];
                        class493.field6916[var32] = arg17[var32].field8101;
                        int var38 = var33.field821[var35];
                        class644.field8642[var32] = arg0.method2996(var38 >>> 16, (byte) -122);
                        int var39 = var38 & 0xFFFF;
                        class747.field10291[var32] = var39;
                        if (class644.field8642[var32] != null) {
                            var28 |= class644.field8642[var32].method3130(var39, -1);
                            var27 |= class644.field8642[var32].method3126(var39, true);
                            var29 |= class644.field8642[var32].method3127(var39, -76);
                        }
                    } else {
                        class125.field1717[var32] = 0;
                        class493.field6916[var32] = 0;
                        class644.field8642[var32] = null;
                        class747.field10291[var32] = -1;
                    }
                }
            }
        }
        int var40 = -1;
        int var41 = -1;
        int var42 = 0;
        class526 var43 = null;
        class526 var44 = null;
        int var45 = -1;
        int var46 = -1;
        int var47 = 0;
        class526 var48 = null;
        class526 var49 = null;
        if (var30) {
            if (arg1 != null) {
                int var50 = arg1.field821[arg7];
                int var51 = var50 >>> 16;
                var43 = arg0.method2996(var51, (byte) -122);
                var40 = var50 & 0xFFFF;
                if (var43 != null) {
                    var28 |= var43.method3130(var40, -1);
                    var27 |= var43.method3126(var40, true);
                    var29 |= var43.method3127(var40, -104);
                }
                if ((arg1.field808 || class175.field2409) && arg9 != -1 && arg9 < arg1.field821.length) {
                    int var52 = arg1.field821[arg9];
                    var42 = arg1.field813[arg7];
                    int var53 = var52 >>> 16;
                    var44 = var51 == var53 ? var43 : arg0.method2996(var53, (byte) -126);
                    var41 = var52 & 0xFFFF;
                    if (var44 != null) {
                        var28 |= var44.method3130(var41, -1);
                        var27 |= var44.method3126(var41, true);
                        var29 |= var44.method3127(var41, -65);
                    }
                }
            }
            var22 = arg6 | 0x20;
            if (arg12 != null) {
                int var54 = arg12.field821[arg13];
                int var55 = var54 >>> 16;
                var48 = arg0.method2996(var55, (byte) -126);
                var45 = var54 & 0xFFFF;
                if (var48 != null) {
                    var28 |= var48.method3130(var45, -1);
                    var27 |= var48.method3126(var45, true);
                    var29 |= var48.method3127(var45, -116);
                }
                if ((arg12.field808 || class175.field2409) && arg11 != -1 && arg11 < arg12.field821.length) {
                    var47 = arg12.field813[arg13];
                    int var56 = arg12.field821[arg11];
                    int var57 = var56 >>> 16;
                    var46 = var56 & 0xFFFF;
                    var49 = var55 == var57 ? var48 : arg0.method2996(var57, (byte) -114);
                    if (var49 != null) {
                        var28 |= var49.method3130(var46, -1);
                        var27 |= var49.method3126(var46, true);
                        var29 |= var49.method3127(var46, -119);
                    }
                }
            }
            if (var28) {
                var22 |= 0x80;
            }
            if (var27) {
                var22 |= 0x100;
            }
            if (var29) {
                var22 |= 0x400;
            }
        }
        class690 var58 = class301.field4258;
        class284 var59;
        synchronized (class301.field4258) {
            var59 = (class284) class301.field4258.method3898((byte) -42, var23);
        }
        class32 var60 = null;
        if (this.field509 != -1) {
            var60 = arg15.method557(this.field509, (byte) 43);
        }
        if (var59 == null || arg3.method1484(var59.method1703(), var22) != 0) {
            if (var59 != null) {
                var22 = arg3.method1390(var22, var59.method1703());
            }
            boolean var62 = false;
            for (int var63 = 0; var63 < 12; var63++) {
                int var64 = var25[var63];
                if ((var64 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var64) != 0 && !arg8.method2585(arg5 - 69, var64 & 0x3FFFFFFF).method1714(-1595576016)) {
                        var62 = true;
                    }
                } else if (!arg2.method1313(var64 & 0x3FFFFFFF, true).method3785(true, this.field503)) {
                    var62 = true;
                }
            }
            if (var62) {
                if (this.field519 != -1L) {
                    class690 var82 = class301.field4258;
                    synchronized (class301.field4258) {
                        var59 = (class284) class301.field4258.method3898((byte) -42, this.field519);
                    }
                }
                if (var59 == null || arg3.method1484(var59.method1703(), var22) != 0) {
                    return null;
                }
            } else {
                class133[] var65 = new class133[12];
                for (int var66 = 0; var66 < 12; var66++) {
                    int var67 = var25[var66];
                    if ((var67 & 0x40000000) != 0) {
                        class133 var69 = arg2.method1313(var67 & 0x3FFFFFFF, true).method3787(this.field503, (byte) 100);
                        if (var69 != null) {
                            var65[var66] = var69;
                        }
                    } else if ((Integer.MIN_VALUE & var67) != 0) {
                        class133 var68 = arg8.method2585(-48, var67 & 0x3FFFFFFF).method1719(arg5 + 50);
                        if (var68 != null) {
                            var65[var66] = var68;
                        }
                    }
                }
                if (var60 != null && var60.field403 != null) {
                    for (int var70 = 0; var70 < var60.field403.length; var70++) {
                        if (var65[var70] != null) {
                            int var71 = 0;
                            int var72 = 0;
                            int var73 = 0;
                            int var74 = 0;
                            int var75 = 0;
                            int var76 = 0;
                            if (var60.field403[var70] != null) {
                                var75 = var60.field403[var70][4] << 3;
                                var73 = var60.field403[var70][2];
                                var74 = var60.field403[var70][3] << 3;
                                var71 = var60.field403[var70][0];
                                var72 = var60.field403[var70][1];
                                var76 = var60.field403[var70][5] << 3;
                            }
                            if (var74 != 0 || var75 != 0 || var76 != 0) {
                                var65[var70].method846((byte) 65, var76, var74, var75);
                            }
                            if (var71 != 0 || var72 != 0 || var73 != 0) {
                                var65[var70].method842(var72, 8137, var71, var73);
                            }
                        }
                    }
                }
                int var77 = var22 | 0x4000;
                class133 var78 = new class133(var65, var65.length);
                var59 = arg3.method1463(var78, var77, class675.field9369, 64, 850);
                for (int var79 = 0; var79 < 5; var79++) {
                    for (int var80 = 0; var80 < class195.field2630.length; var80++) {
                        if (class195.field2630[var80][var79].length > this.field515[var79]) {
                            var59.method1660(class370.field5230[var80][var79], class195.field2630[var80][var79][this.field515[var79]]);
                        }
                    }
                }
                if (arg20) {
                    var59.method1691(var22);
                    class690 var81 = class301.field4258;
                    synchronized (class301.field4258) {
                        class301.field4258.method3899(arg5 ^ 0xFFFFFFF6, var59, var23);
                    }
                    this.field519 = var23;
                }
            }
        }
        class284 var83 = var59.method1659((byte) 4, var22, true);
        boolean var84 = false;
        if (arg10 != null) {
            for (int var85 = 0; var85 < 12; var85++) {
                if (arg10[var85] != -1) {
                    var84 = true;
                }
            }
        }
        if (!var30 && !var84) {
            return var83;
        }
        class744[] var86 = null;
        if (var60 != null) {
            var86 = var60.method179(arg3, 0);
        }
        if (var84 && var86 != null) {
            for (int var87 = 0; var87 < 12; var87++) {
                if (var86[var87] != null) {
                    var83.method1699(var86[var87], 0x1 << var87, true);
                }
            }
        }
        int var88 = 0;
        int var89 = 1;
        while (var88 < var31) {
            if (class8.field82[var88] != null) {
                var83.method1889(var89, class8.field82[var88], class644.field8642[var88], class348.field4953[var88], false, class747.field10291[var88], -16957, class493.field6916[var88] - 1, class125.field1717[var88], null, 0);
            }
            var89 <<= 0x1;
            var88++;
        }
        if (var84) {
            for (int var90 = 0; var90 < 12; var90++) {
                if (arg10[var90] != -1) {
                    int var91 = arg10[var90] - arg4;
                    int var92 = var91 & 0x3FFF;
                    class744 var93 = arg3.method1495();
                    var93.method895(var92);
                    var83.method1699(var93, 0x1 << var90, false);
                }
            }
        }
        if (var84 && var86 != null) {
            for (int var94 = 0; var94 < 12; var94++) {
                if (var86[var94] != null) {
                    var83.method1699(var86[var94], 0x1 << var94, false);
                }
            }
        }
        if (var43 != null && var48 != null) {
            var83.method1893(var48, arg18 - 1, var41, arg14 - 1, var47, var42, var46, var45, var40, var49, var43, false, -14, arg1.field794, var44);
        } else if (var43 != null) {
            var83.method1885(var43, 0, var44, arg5 ^ 0x4C, var40, var42, false, var41, arg18 - 1);
        } else if (var48 != null) {
            var83.method1885(var48, 0, var49, arg5 - 76, var45, var47, false, var46, arg14 - 1);
        }
        for (int var95 = 0; var95 < var31; var95++) {
            class8.field82[var95] = null;
            class644.field8642[var95] = null;
            class592.field8035[var95] = null;
        }
        return var83;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method230(byte arg0) {
        int var1 = -99 % ((31 - arg0) / 62);
        field502 = null;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
    private final void method231(byte arg0) {
        field501++;
        this.field514 = -1L;
        long[] var2 = class264.field3865;
        this.field514 = this.field514 >>> 8 ^ var2[(int) ((this.field514 ^ (long) (this.field509 >> 8)) & 0xFFL)];
        this.field514 = this.field514 >>> 8 ^ var2[(int) ((this.field514 ^ (long) this.field509) & 0xFFL)];
        int var3 = 0;
        if (arg0 <= 72) {
            this.method224(null, null, null, null, 55, -121, null, null, null, (byte) -2, 109, -79);
        }
        while (var3 < 12) {
            this.field514 = var2[(int) (((long) (this.field511[var3] >> 24) ^ this.field514) & 0xFFL)] ^ this.field514 >>> 8;
            this.field514 = this.field514 >>> 8 ^ var2[(int) ((this.field514 ^ (long) (this.field511[var3] >> 16)) & 0xFFL)];
            this.field514 = this.field514 >>> 8 ^ var2[(int) (((long) (this.field511[var3] >> 8) ^ this.field514) & 0xFFL)];
            this.field514 = this.field514 >>> 8 ^ var2[(int) (((long) this.field511[var3] ^ this.field514) & 0xFFL)];
            var3++;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field514 = this.field514 >>> 8 ^ var2[(int) (((long) this.field515[var4] ^ this.field514) & 0xFFL)];
        }
        this.field514 = this.field514 >>> 8 ^ var2[(int) (((long) (this.field503 ? 1 : 0) ^ this.field514) & 0xFFL)];
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
    public final void method232(int arg0, int arg1, int arg2) {
        if (arg0 > 41) {
            this.field515[arg1] = arg2;
            field517++;
            this.method231((byte) 106);
        }
    }
}
