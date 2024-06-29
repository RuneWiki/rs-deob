import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class204 extends class79 {

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public int field3230;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "Lck;")
    public static class119 field3234 = null;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "Lck;")
    private static class119 field3233 = class298.method1987((byte) 105, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "Lck;")
    public static class119 field3238 = field3233;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field3241 = 0;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "Lvk;")
    public static class67 field3237 = new class67(64);

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "F")
    public static float field3231;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "J")
    public static long field3236;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "[[B")
    public static byte[][] field3240;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V", line = 4)
    public static void method1288(byte arg0) {
        field3240 = (byte[][]) null;
        field3233 = null;
        field3234 = null;
        if (arg0 == 50) {
            field3238 = null;
            field3237 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V", line = 19)
    public static final void method1289(int arg0, int arg1) {
        field3232++;
        if (class214.field3407 == arg1) {
            return;
        }
        if (class214.field3407 == 0) {
            class32.method240(-16802);
        }
        if (arg1 == 20 || arg1 == 40) {
            class288.field4740 = 0;
            class85.field1283 = 0;
            class242.field3891 = -4;
            class75.field1181 = 0;
        }
        boolean var2 = arg1 == 5 || arg1 == 8 || arg1 == 10 || arg1 == 28;
        if (arg1 != 20 && arg1 != 40 && class191.field3018 != null) {
            class191.field3018.method1629(-126);
            class191.field3018 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class128.field1957 = 0;
            class201.field3197 = 1;
            class232.field3745 = 1;
            class20.field286 = 0;
            class96.field1474 = 0;
            class234.method1508((byte) 98);
        }
        if (arg1 == 5) {
            class262.method1688(class1.field21, -60);
        } else {
            class13.method116(1);
        }
        boolean var3 = class214.field3407 == 5 || class214.field3407 == 8 || class214.field3407 == 10 || class214.field3407 == 28;
        if (var3 != var2) {
            if (var2) {
                class250.field4042 = class262.field4223;
                if (class78.field1205 == 0) {
                    class37.method286((byte) -109, 2);
                } else {
                    class236.method1516(2, class11.field193, true, class262.field4223, false, 0, 255);
                }
                class244.method1595(false, true);
            } else {
                class37.method286((byte) -86, 2);
                class244.method1595(true, true);
            }
        }
        int var4 = 90 % ((-arg0 - 63) / 49);
        if (arg1 == 8) {
            arg1 = class99.method664((byte) -37);
        }
        if (arg1 == 25 || arg1 == 28 || arg1 == 40) {
            class264.method1729();
        }
        class214.field3407 = arg1;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[IIIIIZIIII)V", line = 107)
    public static final void method1290(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg9 < class286.field4723) {
            arg4 -= class286.field4723 - arg9;
            arg9 = class286.field4723;
        }
        if (class286.field4724 > arg3) {
            arg5 -= class286.field4724 - arg3;
            arg3 = class286.field4724;
        }
        int var11 = 86 / ((arg2 - 40) / 44);
        field3239++;
        if ((arg4 + arg9) > class286.field4720) {
            arg4 = class286.field4720 - arg9;
        }
        if (arg10 == 9) {
            arg0 = arg0 + 1 & 0x3;
            arg10 = 1;
        }
        if (arg10 == 10) {
            arg0 = arg0 + 3 & 0x3;
            arg10 = 1;
        }
        if (arg10 == 11) {
            arg0 = arg0 + 3 & 0x3;
            arg10 = 8;
        }
        if (class286.field4722 < arg3 + arg5) {
            arg5 = class286.field4722 - arg3;
        }
        int var12 = class286.field4719 - arg4;
        int var13 = class286.field4719 * arg3 + arg9;
        if (arg10 == 1) {
            if (arg0 == 0) {
                for (int var20 = 0; var20 < arg5; var20++) {
                    for (int var21 = 0; var21 < arg4; var21++) {
                        if (var20 >= var21) {
                            arg1[var13] = arg7;
                        } else if (arg6) {
                            arg1[var13] = arg8;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg0 == 1) {
                for (int var14 = arg5 - 1; var14 >= 0; var14--) {
                    for (int var15 = 0; var15 < arg4; var15++) {
                        if (var15 <= var14) {
                            arg1[var13] = arg7;
                        } else if (arg6) {
                            arg1[var13] = arg8;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg0 == 2) {
                for (int var16 = 0; var16 < arg5; var16++) {
                    for (int var17 = 0; var17 < arg4; var17++) {
                        if (var16 <= var17) {
                            arg1[var13] = arg7;
                        } else if (arg6) {
                            arg1[var13] = arg8;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg0 == 3) {
                for (int var18 = arg5 - 1; var18 >= 0; var18--) {
                    for (int var19 = 0; var19 < arg4; var19++) {
                        if (var19 >= var18) {
                            arg1[var13] = arg7;
                        } else if (arg6) {
                            arg1[var13] = arg8;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            }
        } else if (arg10 == 2) {
            if (arg0 == 0) {
                for (int var70 = arg5 - 1; var70 >= 0; var70--) {
                    for (int var71 = 0; var71 < arg4; var71++) {
                        if (var71 <= var70 >> 1) {
                            arg1[var13] = arg7;
                        } else if (arg6) {
                            arg1[var13] = arg8;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg0 == 1) {
                for (int var76 = 0; var76 < arg5; var76++) {
                    for (int var77 = 0; var77 < arg4; var77++) {
                        if (var77 >= var76 << 1) {
                            arg1[var13] = arg7;
                        } else if (arg6) {
                            arg1[var13] = arg8;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg0 == 2) {
                for (int var74 = 0; var74 < arg5; var74++) {
                    for (int var75 = arg4 - 1; var75 >= 0; var75--) {
                        if (var75 <= (var74 >> 1)) {
                            arg1[var13] = arg7;
                        } else if (arg6) {
                            arg1[var13] = arg8;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg0 == 3) {
                for (int var72 = arg5 - 1; var72 >= 0; var72--) {
                    for (int var73 = arg4 - 1; var73 >= 0; var73--) {
                        if ((var72 << 1) <= var73) {
                            arg1[var13] = arg7;
                        } else if (arg6) {
                            arg1[var13] = arg8;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            }
        } else if (arg10 == 3) {
            if (arg0 == 0) {
                for (int var28 = arg5 - 1; var28 >= 0; var28--) {
                    for (int var29 = arg4 - 1; var29 >= 0; var29--) {
                        if ((var28 >> 1) >= var29) {
                            arg1[var13] = arg7;
                        } else if (arg6) {
                            arg1[var13] = arg8;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg0 == 1) {
                for (int var22 = arg5 - 1; var22 >= 0; var22--) {
                    for (int var23 = 0; var23 < arg4; var23++) {
                        if (var22 << 1 <= var23) {
                            arg1[var13] = arg7;
                        } else if (arg6) {
                            arg1[var13] = arg8;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg0 == 2) {
                for (int var26 = 0; var26 < arg5; var26++) {
                    for (int var27 = 0; var27 < arg4; var27++) {
                        if (var26 >> 1 >= var27) {
                            arg1[var13] = arg7;
                        } else if (arg6) {
                            arg1[var13] = arg8;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg0 == 3) {
                for (int var24 = 0; var24 < arg5; var24++) {
                    for (int var25 = arg4 - 1; var25 >= 0; var25--) {
                        if (var24 << 1 <= var25) {
                            arg1[var13] = arg7;
                        } else if (arg6) {
                            arg1[var13] = arg8;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            }
        } else if (arg10 == 4) {
            if (arg0 == 0) {
                for (int var36 = arg5 - 1; var36 >= 0; var36--) {
                    for (int var37 = 0; var37 < arg4; var37++) {
                        if (var37 >= var36 >> 1) {
                            arg1[var13] = arg7;
                        } else if (arg6) {
                            arg1[var13] = arg8;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg0 == 1) {
                for (int var30 = 0; var30 < arg5; var30++) {
                    for (int var31 = 0; var31 < arg4; var31++) {
                        if (var31 <= (var30 << 1)) {
                            arg1[var13] = arg7;
                        } else if (arg6) {
                            arg1[var13] = arg8;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg0 == 2) {
                for (int var34 = 0; var34 < arg5; var34++) {
                    for (int var35 = arg4 - 1; var35 >= 0; var35--) {
                        if ((var34 >> 1) <= var35) {
                            arg1[var13] = arg7;
                        } else if (arg6) {
                            arg1[var13] = arg8;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            } else if (arg0 == 3) {
                for (int var32 = arg5 - 1; var32 >= 0; var32--) {
                    for (int var33 = arg4 - 1; var33 >= 0; var33--) {
                        if (var33 <= (var32 << 1)) {
                            arg1[var13] = arg7;
                        } else if (arg6) {
                            arg1[var13] = arg8;
                        }
                        var13++;
                    }
                    var13 += var12;
                }
            }
        } else if (arg10 != 5) {
            if (arg10 == 6) {
                if (arg0 == 0) {
                    for (int var46 = 0; var46 < arg5; var46++) {
                        for (int var47 = 0; var47 < arg4; var47++) {
                            if (var47 <= arg4 / 2) {
                                arg1[var13] = arg7;
                            } else if (arg6) {
                                arg1[var13] = arg8;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var68 = 0; var68 < arg5; var68++) {
                        for (int var69 = 0; var69 < arg4; var69++) {
                            if (var68 <= (arg5 / 2)) {
                                arg1[var13] = arg7;
                            } else if (arg6) {
                                arg1[var13] = arg8;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var48 = 0; var48 < arg5; var48++) {
                        for (int var49 = 0; var49 < arg4; var49++) {
                            if (arg4 / 2 <= var49) {
                                arg1[var13] = arg7;
                            } else if (arg6) {
                                arg1[var13] = arg8;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var50 = 0; var50 < arg5; var50++) {
                        for (int var51 = 0; var51 < arg4; var51++) {
                            if ((arg5 / 2) <= var50) {
                                arg1[var13] = arg7;
                            } else if (arg6) {
                                arg1[var13] = arg8;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
            }
            if (arg10 == 7) {
                if (arg0 == 0) {
                    for (int var52 = 0; var52 < arg5; var52++) {
                        for (int var53 = 0; var53 < arg4; var53++) {
                            if ((var52 - (arg5 / 2)) >= var53) {
                                arg1[var13] = arg7;
                            } else if (arg6) {
                                arg1[var13] = arg8;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var54 = arg5 - 1; var54 >= 0; var54--) {
                        for (int var55 = 0; var55 < arg4; var55++) {
                            if (var55 <= var54 - (arg5 / 2)) {
                                arg1[var13] = arg7;
                            } else if (arg6) {
                                arg1[var13] = arg8;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var56 = arg5 - 1; var56 >= 0; var56--) {
                        for (int var57 = arg4 - 1; var57 >= 0; var57--) {
                            if (var57 <= var56 - arg5 / 2) {
                                arg1[var13] = arg7;
                            } else if (arg6) {
                                arg1[var13] = arg8;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var66 = 0; var66 < arg5; var66++) {
                        for (int var67 = arg4 - 1; var67 >= 0; var67--) {
                            if (var66 - (arg5 / 2) >= var67) {
                                arg1[var13] = arg7;
                            } else if (arg6) {
                                arg1[var13] = arg8;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
            }
            if (arg10 == 8) {
                if (arg0 == 0) {
                    for (int var58 = 0; var58 < arg5; var58++) {
                        for (int var59 = 0; var59 < arg4; var59++) {
                            if (var59 >= var58 - (arg5 / 2)) {
                                arg1[var13] = arg7;
                            } else if (arg6) {
                                arg1[var13] = arg8;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var64 = arg5 - 1; var64 >= 0; var64--) {
                        for (int var65 = 0; var65 < arg4; var65++) {
                            if (var65 >= var64 - arg5 / 2) {
                                arg1[var13] = arg7;
                            } else if (arg6) {
                                arg1[var13] = arg8;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var62 = arg5 - 1; var62 >= 0; var62--) {
                        for (int var63 = arg4 - 1; var63 >= 0; var63--) {
                            if (var62 - (arg5 / 2) <= var63) {
                                arg1[var13] = arg7;
                            } else if (arg6) {
                                arg1[var13] = arg8;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var60 = 0; var60 < arg5; var60++) {
                        for (int var61 = arg4 - 1; var61 >= 0; var61--) {
                            if ((var60 - (arg5 / 2)) <= var61) {
                                arg1[var13] = arg7;
                            } else if (arg6) {
                                arg1[var13] = arg8;
                            }
                            var13++;
                        }
                        var13 += var12;
                    }
                    return;
                }
            }
        } else if (arg0 == 0) {
            for (int var38 = arg5 - 1; var38 >= 0; var38--) {
                for (int var39 = arg4 - 1; var39 >= 0; var39--) {
                    if ((var38 >> 1) <= var39) {
                        arg1[var13] = arg7;
                    } else if (arg6) {
                        arg1[var13] = arg8;
                    }
                    var13++;
                }
                var13 += var12;
            }
        } else if (arg0 == 1) {
            for (int var44 = arg5 - 1; var44 >= 0; var44--) {
                for (int var45 = 0; var45 < arg4; var45++) {
                    if (var44 << 1 >= var45) {
                        arg1[var13] = arg7;
                    } else if (arg6) {
                        arg1[var13] = arg8;
                    }
                    var13++;
                }
                var13 += var12;
            }
        } else if (arg0 == 2) {
            for (int var40 = 0; var40 < arg5; var40++) {
                for (int var41 = 0; var41 < arg4; var41++) {
                    if (var40 >> 1 <= var41) {
                        arg1[var13] = arg7;
                    } else if (arg6) {
                        arg1[var13] = arg8;
                    }
                    var13++;
                }
                var13 += var12;
            }
        } else if (arg0 == 3) {
            for (int var42 = 0; var42 < arg5; var42++) {
                for (int var43 = arg4 - 1; var43 >= 0; var43--) {
                    if (var43 <= var42 << 1) {
                        arg1[var13] = arg7;
                    } else if (arg6) {
                        arg1[var13] = arg8;
                    }
                    var13++;
                }
                var13 += var12;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V", line = 1274)
    public class204() {
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I)V", line = 1276)
    public class204(int arg0) {
        this.field3230 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)V", line = 1289)
    public static final void method1291(int arg0, int arg1, byte arg2) {
        long var3 = (long) ((arg0 << 16) + arg1);
        field3229++;
        if (arg2 != 40) {
            method1289(-23, 99);
        }
        class117 var5 = (class117) class261.field4177.method1329((byte) 90, var3);
        if (var5 != null) {
            class265.field4328.method590((byte) -23, var5);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBI)I", line = 1311)
    public static final int method1292(int arg0, byte arg1, int arg2) {
        int var3 = -86 % ((arg1 + 33) / 59);
        int var4 = arg2 - 1 & arg0 >> 31;
        field3235++;
        return (arg0 + (arg0 >>> 31)) % arg2 + var4;
    }
}
