import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class242 {

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
    public int field3219 = -1;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "Z")
    public static boolean field3210 = false;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    private int field3202;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "J")
    private long field3211;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "J")
    private long field3216;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "Lq;")
    public static class151 field3215;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "Z")
    public boolean field3207;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "[I")
    public int[] field3206;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "[I")
    private int[] field3218;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lr;Lqi;ILgs;Lwfa;IILhq;IILuaa;Lar;)Lda;", line = 6)
    public final class395 method1480(class98 arg0, class621 arg1, int arg2, class387 arg3, class153 arg4, int arg5, int arg6, class47 arg7, int arg8, int arg9, class404 arg10, class524 arg11) {
        field3204++;
        if (this.field3219 != -1) {
            return arg4.method1089(this.field3219, false).method444(arg2, arg10, arg7, arg9, 28524, arg6, arg8, arg0, arg11);
        }
        int var13 = arg9;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg7.field732[arg2];
            var13 = arg9 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            class128 var24 = arg11.method2967(-1, var23);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method913(109, var25);
                var14 |= var24.method916(var25, (byte) -103);
                var17 |= var24.method914((byte) -126, var25);
                var16 |= arg7.field726;
            }
            if ((arg7.field722 || class59.field959) && arg8 != -1 && arg7.field732.length > arg8) {
                int var26 = arg7.field732[arg8];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class128 var29 = var23 == var27 ? var24 : arg11.method2967(-1, var27);
                if (var29 != null) {
                    var15 |= var29.method913(104, var28);
                    var14 |= var29.method916(var28, (byte) -103);
                    var17 |= var29.method914((byte) -125, var28);
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
        class692 var30 = class495.field7010;
        class395 var31;
        synchronized (class495.field7010) {
            var31 = (class395) class495.field7010.method3901(this.field3211, -61);
        }
        if (var31 == null || arg0.method706(var31.method1027(), var13) != 0) {
            if (var31 != null) {
                var13 = arg0.method661(var13, var31.method1027());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field3218[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg1.method3574(var35 & 0x3FFFFFFF, (byte) 85).method2401((byte) 112)) {
                        var33 = true;
                    }
                } else if (!arg3.method2382(var35 & 0x3FFFFFFF, (byte) 28).method2413(this.field3207, false)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class677[] var36 = new class677[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field3218[var38];
                if ((var39 & 0x40000000) != 0) {
                    class677 var41 = arg3.method2382(var39 & 0x3FFFFFFF, (byte) 28).method2414(this.field3207, -4431);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class677 var40 = arg1.method3574(var39 & 0x3FFFFFFF, (byte) -63).method2400((byte) 122);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            class677 var42 = new class677(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg0.method651(var42, var43, class701.field9962, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class383.field5749.length; var45++) {
                    if (class383.field5749[var45][var44].length > this.field3206[var44]) {
                        var31.method1052(class685.field9675[var45][var44], class383.field5749[var45][var44][this.field3206[var44]]);
                    }
                }
            }
            var31.method1017(var13);
            class692 var46 = class495.field7010;
            synchronized (class495.field7010) {
                class495.field7010.method3894(var31, (byte) 60, this.field3211);
            }
        }
        if (arg7 == null) {
            return var31;
        } else {
            var31.method1038((byte) 4, var13, true);
            int var48 = 107 % ((51 - arg5) / 49);
            return arg7.method283(arg2, 256, var31, arg9, arg8, arg6);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIILqi;)V", line = 206)
    public final void method1481(int arg0, int arg1, int arg2, class621 arg3) {
        field3205++;
        int var5 = class194.field2599[arg0];
        if (arg1 == -19579 && arg3.method3574(arg2, (byte) 85) != null) {
            this.field3218[var5] = class151.method1076(arg2, Integer.MIN_VALUE);
            this.method1490(0);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 223)
    public static final void method1482(int arg0) {
        class565.field8255 = arg0;
        for (int var1 = 0; var1 < class91.field1390; var1++) {
            for (int var2 = 0; var2 < class575.field8372; var2++) {
                if (class603.field8695[arg0][var1][var2] == null) {
                    class603.field8695[arg0][var1][var2] = new class44(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZI)V", line = 249)
    public final void method1483(boolean arg0, int arg1) {
        if (arg1 < 85) {
            this.method1485(false, 77, -113);
        }
        this.field3207 = arg0;
        field3213++;
        this.method1490(0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBLgs;I)V", line = 264)
    public final void method1484(int arg0, byte arg1, class387 arg2, int arg3) {
        field3214++;
        if (arg3 == -1) {
            this.field3218[arg0] = 0;
        } else if (arg2.method2382(arg3, (byte) 28) == null) {
            return;
        } else {
            this.field3218[arg0] = class151.method1076(arg3, 1073741824);
            this.method1490(arg1 ^ 0x4E);
        }
        if (arg1 != 78) {
            this.method1483(true, -87);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZII)V", line = 285)
    public final void method1485(boolean arg0, int arg1, int arg2) {
        field3217++;
        this.field3206[arg2] = arg1;
        if (arg0) {
            this.method1490(-57);
        }
        this.method1490(0);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIILmba;Lqi;ZILar;ILr;IIILuaa;[Ltf;Lhq;[IILhq;Lwfa;Lgs;)Lda;", line = 301)
    public final class395 method1486(int arg0, int arg1, int arg2, class70 arg3, class621 arg4, boolean arg5, int arg6, class524 arg7, int arg8, class98 arg9, int arg10, int arg11, int arg12, class404 arg13, class220[] arg14, class47 arg15, int[] arg16, int arg17, class47 arg18, class153 arg19, class387 arg20) {
        field3208++;
        if (this.field3219 != -1) {
            return arg19.method1089(this.field3219, false).method442(true, arg7, arg17, arg1, arg6, arg3, arg12, arg13, arg11, arg8, arg9, arg10, arg16, arg18, arg14, arg15, arg0);
        }
        int var22 = arg1;
        long var23 = this.field3211;
        int[] var25 = this.field3218;
        if (arg15 != null && (arg15.field734 >= 0 || arg15.field753 >= 0)) {
            var25 = new int[12];
            for (int var26 = 0; var26 < 12; var26++) {
                var25[var26] = this.field3218[var26];
            }
            if (arg15.field734 >= 0) {
                if (arg15.field734 == 65535) {
                    var23 ^= 0xFFFFFFFF00000000L;
                    var25[5] = 0;
                } else {
                    var25[5] = class151.method1076(arg15.field734, 1073741824);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg15.field753 >= 0) {
                if (arg15.field753 == 65535) {
                    var23 ^= 0xFFFFFFFFL;
                    var25[3] = 0;
                } else {
                    var25[3] = class151.method1076(1073741824, arg15.field753);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var27 = false;
        boolean var28 = false;
        boolean var29 = false;
        boolean var30 = arg15 != null || arg18 != null;
        int var31 = arg14 == null ? 0 : arg14.length;
        for (int var32 = 0; var32 < var31; var32++) {
            class263.field3410[var32] = null;
            if (arg14[var32] != null) {
                class47 var33 = arg7.method2971(-58, arg14[var32].field2926);
                if (var33.field732 != null) {
                    var30 = true;
                    class273.field3565[var32] = var33;
                    int var34 = arg14[var32].field2920;
                    int var35 = arg14[var32].field2918;
                    int var36 = var33.field732[var34];
                    class263.field3410[var32] = arg7.method2967(-1, var36 >>> 16);
                    int var37 = var36 & 0xFFFF;
                    class338.field4908[var32] = var37;
                    if (class263.field3410[var32] != null) {
                        var28 |= class263.field3410[var32].method913(111, var37);
                        var27 |= class263.field3410[var32].method916(var37, (byte) -103);
                        var29 |= class263.field3410[var32].method914((byte) -127, var37);
                    }
                    if ((var33.field722 || class59.field959) && var35 != -1 && var33.field732.length > var35) {
                        class476.field6819[var32] = var33.field729[var34];
                        class643.field9229[var32] = arg14[var32].field2924;
                        int var38 = var33.field732[var35];
                        class539.field7910[var32] = arg7.method2967(-1, var38 >>> 16);
                        int var39 = var38 & 0xFFFF;
                        class453.field6527[var32] = var39;
                        if (class539.field7910[var32] != null) {
                            var28 |= class539.field7910[var32].method913(120, var39);
                            var27 |= class539.field7910[var32].method916(var39, (byte) -103);
                            var29 |= class539.field7910[var32].method914((byte) -126, var39);
                        }
                    } else {
                        class476.field6819[var32] = 0;
                        class643.field9229[var32] = 0;
                        class539.field7910[var32] = null;
                        class453.field6527[var32] = -1;
                    }
                }
            }
        }
        int var40 = -1;
        int var41 = -1;
        int var42 = 0;
        class128 var43 = null;
        class128 var44 = null;
        int var45 = -1;
        int var46 = -1;
        int var47 = 0;
        class128 var48 = null;
        class128 var49 = null;
        if (var30) {
            if (arg15 != null) {
                int var50 = arg15.field732[arg12];
                int var51 = var50 >>> 16;
                var40 = var50 & 0xFFFF;
                var43 = arg7.method2967(-1, var51);
                if (var43 != null) {
                    var28 |= var43.method913(93, var40);
                    var27 |= var43.method916(var40, (byte) -103);
                    var29 |= var43.method914((byte) -125, var40);
                }
                if ((arg15.field722 || class59.field959) && arg8 != -1 && arg8 < arg15.field732.length) {
                    var42 = arg15.field729[arg12];
                    int var52 = arg15.field732[arg8];
                    int var53 = var52 >>> 16;
                    var41 = var52 & 0xFFFF;
                    var44 = var51 == var53 ? var43 : arg7.method2967(-1, var53);
                    if (var44 != null) {
                        var28 |= var44.method913(92, var41);
                        var27 |= var44.method916(var41, (byte) -103);
                        var29 |= var44.method914((byte) -125, var41);
                    }
                }
            }
            var22 = arg1 | 0x20;
            if (arg18 != null) {
                int var54 = arg18.field732[arg11];
                int var55 = var54 >>> 16;
                var45 = var54 & 0xFFFF;
                var48 = arg7.method2967(-1, var55);
                if (var48 != null) {
                    var28 |= var48.method913(117, var45);
                    var27 |= var48.method916(var45, (byte) -103);
                    var29 |= var48.method914((byte) -125, var45);
                }
                if ((arg18.field722 || class59.field959) && arg10 != -1 && arg10 < arg18.field732.length) {
                    int var56 = arg18.field732[arg10];
                    var47 = arg18.field729[arg11];
                    int var57 = var56 >>> 16;
                    var46 = var56 & 0xFFFF;
                    var49 = var55 == var57 ? var48 : arg7.method2967(-1, var57);
                    if (var49 != null) {
                        var28 |= var49.method913(115, var46);
                        var27 |= var49.method916(var46, (byte) -103);
                        var29 |= var49.method914((byte) -125, var46);
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
        class692 var58 = class449.field6502;
        class395 var59;
        synchronized (class449.field6502) {
            var59 = (class395) class449.field6502.method3901(var23, -56);
        }
        class589 var60 = null;
        if (this.field3202 != -1) {
            var60 = arg3.method408(this.field3202, false);
        }
        if (var59 == null || arg9.method706(var59.method1027(), var22) != 0) {
            if (var59 != null) {
                var22 = arg9.method661(var22, var59.method1027());
            }
            boolean var62 = false;
            for (int var63 = 0; var63 < 12; var63++) {
                int var64 = var25[var63];
                if ((var64 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var64) != 0 && !arg4.method3574(var64 & 0x3FFFFFFF, (byte) -79).method2398(115)) {
                        var62 = true;
                    }
                } else if (!arg20.method2382(var64 & 0x3FFFFFFF, (byte) 28).method2411(this.field3207, 0)) {
                    var62 = true;
                }
            }
            if (var62) {
                if (this.field3216 != -1L) {
                    class692 var65 = class449.field6502;
                    synchronized (class449.field6502) {
                        var59 = (class395) class449.field6502.method3901(this.field3216, -72);
                    }
                }
                if (var59 == null || arg9.method706(var59.method1027(), var22) != 0) {
                    return null;
                }
            } else {
                class677[] var66 = new class677[12];
                for (int var67 = 0; var67 < 12; var67++) {
                    int var68 = var25[var67];
                    if ((var68 & 0x40000000) != 0) {
                        class677 var69 = arg20.method2382(var68 & 0x3FFFFFFF, (byte) 28).method2407((byte) 93, this.field3207);
                        if (var69 != null) {
                            var66[var67] = var69;
                        }
                    } else if ((Integer.MIN_VALUE & var68) != 0) {
                        class677 var70 = arg4.method3574(var68 & 0x3FFFFFFF, (byte) 72).method2395((byte) -125);
                        if (var70 != null) {
                            var66[var67] = var70;
                        }
                    }
                }
                if (var60 != null && var60.field8534 != null) {
                    for (int var71 = 0; var71 < var60.field8534.length; var71++) {
                        if (var66[var71] != null) {
                            int var72 = 0;
                            int var73 = 0;
                            int var74 = 0;
                            int var75 = 0;
                            int var76 = 0;
                            int var77 = 0;
                            if (var60.field8534[var71] != null) {
                                var73 = var60.field8534[var71][1];
                                var72 = var60.field8534[var71][0];
                                var77 = var60.field8534[var71][5] << 3;
                                var74 = var60.field8534[var71][2];
                                var75 = var60.field8534[var71][3] << 3;
                                var76 = var60.field8534[var71][4] << 3;
                            }
                            if (var75 != 0 || var76 != 0 || var77 != 0) {
                                var66[var71].method3800(var76, var77, (byte) -12, var75);
                            }
                            if (var72 != 0 || var73 != 0 || var74 != 0) {
                                var66[var71].method3799(var72, var74, var73, 124);
                            }
                        }
                    }
                }
                class677 var78 = new class677(var66, var66.length);
                int var79 = var22 | 0x4000;
                var59 = arg9.method651(var78, var79, class701.field9962, 64, 850);
                for (int var80 = 0; var80 < 5; var80++) {
                    for (int var81 = 0; var81 < class383.field5749.length; var81++) {
                        if (this.field3206[var80] < class383.field5749[var81][var80].length) {
                            var59.method1052(class685.field9675[var81][var80], class383.field5749[var81][var80][this.field3206[var80]]);
                        }
                    }
                }
                if (arg5) {
                    var59.method1017(var22);
                    class692 var82 = class449.field6502;
                    synchronized (class449.field6502) {
                        class449.field6502.method3894(var59, (byte) 60, var23);
                    }
                    this.field3216 = var23;
                }
            }
        }
        class395 var83 = var59.method1038((byte) 4, var22, true);
        if (arg2 >= -87) {
            this.field3216 = -67L;
        }
        boolean var84 = false;
        if (arg16 != null) {
            for (int var85 = 0; var85 < 12; var85++) {
                if (arg16[var85] != -1) {
                    var84 = true;
                }
            }
        }
        if (!var30 && !var84) {
            return var83;
        }
        class151[] var86 = null;
        if (var60 != null) {
            var86 = var60.method3364(false, arg9);
        }
        if (var84 && var86 != null) {
            for (int var87 = 0; var87 < 12; var87++) {
                if (var86[var87] != null) {
                    var83.method1043(var86[var87], 0x1 << var87, true);
                }
            }
        }
        int var88 = 0;
        int var89 = 1;
        while (var88 < var31) {
            if (class263.field3410[var88] != null) {
                var83.method2458(false, class643.field9229[var88] - 1, class476.field6819[var88], class338.field4908[var88], var89, class453.field6527[var88], 0, null, -128, class263.field3410[var88], class539.field7910[var88]);
            }
            var89 <<= 0x1;
            var88++;
        }
        if (var84) {
            for (int var90 = 0; var90 < 12; var90++) {
                if (arg16[var90] != -1) {
                    int var91 = arg16[var90] - arg6;
                    int var92 = var91 & 0x3FFF;
                    class151 var93 = arg9.method717();
                    var93.method889(var92);
                    var83.method1043(var93, 0x1 << var90, false);
                }
            }
        }
        if (var84 && var86 != null) {
            for (int var94 = 0; var94 < 12; var94++) {
                if (var86[var94] != null) {
                    var83.method1043(var86[var94], 0x1 << var94, false);
                }
            }
        }
        if (var43 != null && var48 != null) {
            var83.method2460(true, var43, var47, var48, arg17 - 1, arg0 + -1, var49, false, var44, var46, var42, var45, var40, arg15.field735, var41);
        } else if (var43 != null) {
            var83.method2456(var42, var40, 0, var44, var43, arg0 - 1, var41, 0, false);
        } else if (var48 != null) {
            var83.method2456(var47, var45, 0, var49, var48, arg17 - 1, var46, 0, false);
        }
        for (int var95 = 0; var95 < var31; var95++) {
            class263.field3410[var95] = null;
            class539.field7910[var95] = null;
            class273.field3565[var95] = null;
        }
        return var83;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lr;IIIILar;IIILhq;Lqi;I)Lda;", line = 853)
    public final class395 method1487(class98 arg0, int arg1, int arg2, int arg3, int arg4, class524 arg5, int arg6, int arg7, int arg8, class47 arg9, class621 arg10, int arg11) {
        field3209++;
        int var13 = arg2;
        if (arg9 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg9.field732[arg4];
            var13 = arg2 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            class128 var24 = arg5.method2967(-1, var23);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method913(99, var25);
                var14 |= var24.method916(var25, (byte) -103);
                var17 |= var24.method914((byte) -125, var25);
                var16 |= arg9.field726;
            }
            if ((arg9.field722 || class59.field959) && arg1 != -1 && arg9.field732.length > arg1) {
                int var26 = arg9.field732[arg1];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class128 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg5.method2967(-1, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method913(110, var28);
                    var14 |= var29.method916(var28, (byte) -103);
                    var17 |= var29.method914((byte) -127, var28);
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
        long var30 = (long) arg7 | (long) arg6 << 32 | (long) (arg8 << 16);
        if (arg11 < 120) {
            this.method1489(-100, null, null, false, -79, (byte) -70);
        }
        class692 var32 = class495.field7010;
        class395 var33;
        synchronized (class495.field7010) {
            var33 = (class395) class495.field7010.method3901(var30, -50);
        }
        if (var33 == null || arg0.method706(var33.method1027(), var13) != 0) {
            if (var33 != null) {
                var13 = arg0.method661(var13, var33.method1027());
            }
            class677[] var35 = new class677[3];
            int var36 = 0;
            if (!arg10.method3574(arg7, (byte) -89).method2401((byte) 112) || !arg10.method3574(arg8, (byte) 112).method2401((byte) 112) || !arg10.method3574(arg6, (byte) 110).method2401((byte) 112)) {
                return null;
            }
            class677 var37 = arg10.method3574(arg7, (byte) -120).method2400((byte) 64);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class677 var38 = arg10.method3574(arg8, (byte) 73).method2400((byte) 26);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class677 var39 = arg10.method3574(arg6, (byte) -63).method2400((byte) 105);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class677 var41 = new class677(var35, var36);
            var33 = arg0.method651(var41, var40, class701.field9962, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class383.field5749.length; var43++) {
                    if (class383.field5749[var43][var42].length > this.field3206[var42]) {
                        var33.method1052(class685.field9675[var43][var42], class383.field5749[var43][var42][this.field3206[var42]]);
                    }
                }
            }
            var33.method1017(var13);
            class692 var44 = class495.field7010;
            synchronized (class495.field7010) {
                class495.field7010.method3894(var33, (byte) 60, var30);
            }
        }
        if (arg9 == null) {
            return var33;
        } else {
            class395 var45 = var33.method1038((byte) 4, var13, true);
            return arg9.method283(arg4, 256, var45, arg2, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 1012)
    public static void method1488(byte arg0) {
        field3215 = null;
        int var1 = -11 / ((40 - arg0) / 37);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I[I[IZIB)V", line = 1023)
    public final void method1489(int arg0, int[] arg1, int[] arg2, boolean arg3, int arg4, byte arg5) {
        this.field3218 = arg1;
        this.field3207 = arg3;
        field3203++;
        if (this.field3202 != arg4) {
            this.field3202 = arg4;
        }
        this.field3219 = arg0;
        if (arg5 > -112) {
            this.field3207 = true;
        }
        this.field3206 = arg2;
        this.method1490(0);
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V", line = 1046)
    private final void method1490(int arg0) {
        field3212++;
        this.field3211 = -1L;
        long[] var2 = class187.field2528;
        this.field3211 = var2[(int) (((long) (this.field3202 >> 8) ^ this.field3211) & 0xFFL)] ^ this.field3211 >>> 8;
        this.field3211 = var2[(int) ((this.field3211 ^ (long) this.field3202) & 0xFFL)] ^ this.field3211 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field3211 = this.field3211 >>> 8 ^ var2[(int) (((long) (this.field3218[var3] >> 24) ^ this.field3211) & 0xFFL)];
            this.field3211 = this.field3211 >>> 8 ^ var2[(int) ((this.field3211 ^ (long) (this.field3218[var3] >> 16)) & 0xFFL)];
            this.field3211 = var2[(int) ((this.field3211 ^ (long) (this.field3218[var3] >> 8)) & 0xFFL)] ^ this.field3211 >>> 8;
            this.field3211 = this.field3211 >>> 8 ^ var2[(int) (((long) this.field3218[var3] ^ this.field3211) & 0xFFL)];
        }
        for (int var4 = arg0; var4 < 5; var4++) {
            this.field3211 = var2[(int) (((long) this.field3206[var4] ^ this.field3211) & 0xFFL)] ^ this.field3211 >>> 8;
        }
        this.field3211 = this.field3211 >>> 8 ^ var2[(int) ((this.field3211 ^ (long) (this.field3207 ? 1 : 0)) & 0xFFL)];
    }
}
