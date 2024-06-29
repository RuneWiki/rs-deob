import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class43 {

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "Ltl;")
    public static class59 field647 = class85.method639("T", 9588);

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "Ltl;")
    public static class59 field648 = class85.method639("Angreifen", 9588);

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "Ltl;")
    public static class59 field641 = class85.method639(":tradereq:", 9588);

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Ltl;")
    public static class59 field638 = class85.method639("Speicher wird zugewiesen)3", 9588);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "[Llj;")
    public static class5[] field643;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIIIIB)V", line = 4)
    public static final void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field640++;
        int var8 = -81 % ((-arg7 - 84) / 41);
        int var9 = class262.method1808(arg0, class28.field369, 0, class62.field957);
        int var10 = class262.method1808(arg4, class28.field369, 0, class62.field957);
        int var11 = class262.method1808(arg2, class69.field1061, 0, class153.field2504);
        int var12 = class262.method1808(arg1, class69.field1061, 0, class153.field2504);
        int var13 = class262.method1808(arg0 + arg5, class28.field369, 0, class62.field957);
        int var14 = class262.method1808(arg4 - arg5, class28.field369, 0, class62.field957);
        for (int var15 = var9; var15 < var13; var15++) {
            class174.method1283(7, arg6, class163.field2662[var15], var11, var12);
        }
        for (int var16 = var10; var16 > var14; var16--) {
            class174.method1283(7, arg6, class163.field2662[var16], var11, var12);
        }
        int var17 = class262.method1808(arg2 + arg5, class69.field1061, 0, class153.field2504);
        int var18 = class262.method1808(arg1 - arg5, class69.field1061, 0, class153.field2504);
        for (int var19 = var13; var19 <= var14; var19++) {
            int[] var20 = class163.field2662[var19];
            class174.method1283(7, arg6, var20, var11, var17);
            class174.method1283(7, arg3, var20, var17, var18);
            class174.method1283(7, arg6, var20, var18, var12);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 64)
    public static void method289(byte arg0) {
        field643 = null;
        if (arg0 != -104) {
            method295(27, false, -107, -6, 57, 29, -45, (int[]) null, 29, -26, -3);
        }
        field648 = null;
        field638 = null;
        field647 = null;
        field641 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V", line = 84)
    public static final void method290(int arg0, int arg1, int arg2) {
        if (arg0 <= 13) {
            field648 = (class59) null;
        }
        class186 var3 = class67.method561(32, arg1, 13);
        field644++;
        var3.method1380(3293);
        var3.field3117 = arg2;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 100)
    public static final void method291(int arg0) {
        field649++;
        if (class228.method1568(true) != 2) {
            return;
        }
        byte var1 = (byte) (class178.field2914 - 4 & 0xFF);
        int var2 = class178.field2914 % 104;
        for (int var3 = arg0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class213.field3500[var3][var2][var4] = var1;
            }
        }
        if (class247.field4119 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class60.field938[var5] = -1000000;
            class180.field2959[var5] = 1000000;
            class311.field5276[var5] = 0;
            class232.field3824[var5] = 1000000;
            class103.field1705[var5] = 0;
        }
        if (class266.field4585 != 1) {
            int var16 = class73.method589(class247.field4119, true, class226.field3640, class216.field3528);
            if (var16 - class185.field3109 < 800 && (class308.field5219[class247.field4119][class226.field3640 >> 7][class216.field3528 >> 7] & 0x4) != 0) {
                class93.method682(class226.field3640 >> 7, class216.field3528 >> 7, class120.field2010, (byte) 91, 1, false);
            }
            return;
        }
        if ((class308.field5219[class247.field4119][class286.field4920.field1774 >> 7][class286.field4920.field1769 >> 7] & 0x4) != 0) {
            class93.method682(class286.field4920.field1774 >> 7, class286.field4920.field1769 >> 7, class120.field2010, (byte) 119, 0, false);
        }
        if (class100.field1627 >= 310) {
            return;
        }
        int var6 = class226.field3640 >> 7;
        int var7 = class216.field3528 >> 7;
        int var8 = class286.field4920.field1774 >> 7;
        int var9 = class286.field4920.field1769 >> 7;
        int var10;
        if (var6 >= var8) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        int var11;
        if (var7 >= var9) {
            var11 = var7 - var9;
        } else {
            var11 = var9 - var7;
        }
        if (var10 <= var11) {
            int var14 = var10 * 65536 / var11;
            int var15 = 32768;
            while (var7 != var9) {
                if (var9 > var7) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                if ((class308.field5219[class247.field4119][var6][var7] & 0x4) != 0) {
                    class93.method682(var6, var7, class120.field2010, (byte) 127, 1, false);
                    break;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var6 < var8) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    if ((class308.field5219[class247.field4119][var6][var7] & 0x4) != 0) {
                        class93.method682(var6, var7, class120.field2010, (byte) 92, 1, false);
                        break;
                    }
                }
            }
            return;
        }
        int var12 = var11 * 65536 / var10;
        int var13 = 32768;
        while (var6 != var8) {
            if (var6 < var8) {
                var6++;
            } else if (var8 < var6) {
                var6--;
            }
            if ((class308.field5219[class247.field4119][var6][var7] & 0x4) != 0) {
                class93.method682(var6, var7, class120.field2010, (byte) 80, 1, false);
                break;
            }
            var13 += var12;
            if (var13 >= 65536) {
                var13 -= 65536;
                if (var7 < var9) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class308.field5219[class247.field4119][var6][var7] & 0x4) != 0) {
                    class93.method682(var6, var7, class120.field2010, (byte) 100, 1, false);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILma;IZ)V", line = 295)
    public static final void method292(int arg0, class263 arg1, int arg2, boolean arg3) {
        if (!arg3) {
            method290(5, 38, -21);
        }
        if (arg1.field4490 == 0) {
            arg1.field4495 = arg1.field4506;
        } else if (arg1.field4490 == 1) {
            arg1.field4495 = (arg0 - arg1.field4420) / 2 + arg1.field4506;
        } else if (arg1.field4490 == 2) {
            arg1.field4495 = arg0 - arg1.field4420 - arg1.field4506;
        } else if (arg1.field4490 == 3) {
            arg1.field4495 = arg1.field4506 * arg0 >> 14;
        } else if (arg1.field4490 == 4) {
            arg1.field4495 = (arg1.field4506 * arg0 >> 14) + (arg0 - arg1.field4420) / 2;
        } else {
            arg1.field4495 = arg0 - arg1.field4420 - (arg1.field4506 * arg0 >> 14);
        }
        field639++;
        if (arg1.field4384 == 0) {
            arg1.field4546 = arg1.field4471;
        } else if (arg1.field4384 == 1) {
            arg1.field4546 = (arg2 - arg1.field4467) / 2 + arg1.field4471;
        } else if (arg1.field4384 == 2) {
            arg1.field4546 = arg2 - arg1.field4467 - arg1.field4471;
        } else if (arg1.field4384 == 3) {
            arg1.field4546 = arg1.field4471 * arg2 >> 14;
        } else if (arg1.field4384 == 4) {
            arg1.field4546 = (arg1.field4471 * arg2 >> 14) + (arg2 - arg1.field4467) / 2;
        } else {
            arg1.field4546 = arg2 - arg1.field4467 - (arg1.field4471 * arg2 >> 14);
        }
        if (!class39.field592 || !(client.method278(arg1) != 0 || arg1.field4468 == 0)) {
            return;
        }
        if (arg1.field4495 < 0) {
            arg1.field4495 = 0;
        } else if (arg0 < (arg1.field4495 + arg1.field4420)) {
            arg1.field4495 = arg0 - arg1.field4420;
        }
        if (arg1.field4546 < 0) {
            arg1.field4546 = 0;
        } else if ((arg1.field4546 + arg1.field4467) > arg2) {
            arg1.field4546 = arg2 - arg1.field4467;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZI)I", line = 369)
    public static final int method293(boolean arg0, int arg1) {
        if (!arg0) {
            return 13;
        }
        field637++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "()V", line = 395)
    public static final void method294() {
        if (class64.field990 != null) {
            for (int var0 = 0; var0 < class64.field990.length; var0++) {
                for (int var1 = 0; var1 < class120.field2000; var1++) {
                    for (int var2 = 0; var2 < class78.field1244; var2++) {
                        class64.field990[var0][var1][var2] = null;
                    }
                }
            }
        }
        class213.field3485 = (class32[][]) null;
        if (class212.field3465 != null) {
            for (int var3 = 0; var3 < class212.field3465.length; var3++) {
                for (int var4 = 0; var4 < class120.field2000; var4++) {
                    for (int var5 = 0; var5 < class78.field1244; var5++) {
                        class212.field3465[var3][var4][var5] = null;
                    }
                }
            }
        }
        class221.field3587 = (class32[][]) null;
        class254.field4220 = 0;
        if (class269.field4671 != null) {
            for (int var6 = 0; var6 < class254.field4220; var6++) {
                class269.field4671[var6] = null;
            }
        }
        if (class131.field2171 != null) {
            for (int var7 = 0; var7 < class269.field4672; var7++) {
                class131.field2171[var7] = null;
            }
            class269.field4672 = 0;
        }
        if (class177.field2898 != null) {
            for (int var8 = 0; var8 < class177.field2898.length; var8++) {
                class177.field2898[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZIIIII[IIII)V", line = 500)
    public static final void method295(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        field646++;
        int var11 = arg2;
        if (arg2 >= class272.field4703) {
            return;
        }
        if (arg2 < class272.field4702) {
            var11 = class272.field4702;
        }
        int var12 = arg2 + arg5;
        if (class272.field4702 >= var12) {
            return;
        }
        if (class272.field4703 < var12) {
            var12 = class272.field4703;
        }
        int var13 = arg10;
        if (class272.field4708 <= arg10) {
            return;
        }
        int var14 = arg3 + arg10;
        if (class272.field4705 > arg10) {
            var13 = class272.field4705;
        }
        if (var14 <= class272.field4705) {
            return;
        }
        if (arg4 == 9) {
            arg0 = arg0 + 1 & 0x3;
            arg4 = 1;
        }
        if (arg4 == 10) {
            arg4 = 1;
            arg0 = arg0 + 3 & 0x3;
        }
        if (var14 > class272.field4708) {
            var14 = class272.field4708;
        }
        int var15 = var14 - arg10;
        int var16 = class272.field4704 * var13 + var11;
        if (arg4 == 11) {
            arg0 = arg0 + 3 & 0x3;
            arg4 = 8;
        }
        int var17 = class272.field4704 + var11 - var12;
        int var18 = var12 - arg2;
        int var19 = var13 - arg10;
        int var20 = arg5 - var18;
        int var21 = var11 - arg2;
        int var22 = arg3 - var15;
        int var23 = arg5 - var21;
        int var24 = arg3 - var19;
        if (arg4 == 1) {
            if (arg0 == 0) {
                for (int var31 = var19; var31 < var15; var31++) {
                    for (int var32 = var21; var32 < var18; var32++) {
                        if (var32 <= var31) {
                            arg7[var16] = arg8;
                        } else if (arg1) {
                            arg7[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg0 == 1) {
                for (int var29 = var24 - 1; var29 >= var22; var29--) {
                    for (int var30 = var21; var30 < var18; var30++) {
                        if (var30 <= var29) {
                            arg7[var16] = arg8;
                        } else if (arg1) {
                            arg7[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg0 == 2) {
                for (int var25 = var19; var25 < var15; var25++) {
                    for (int var26 = var21; var26 < var18; var26++) {
                        if (var25 <= var26) {
                            arg7[var16] = arg8;
                        } else if (arg1) {
                            arg7[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg0 == 3) {
                for (int var27 = var24 - 1; var27 >= var22; var27--) {
                    for (int var28 = var21; var28 < var18; var28++) {
                        if (var28 >= var27) {
                            arg7[var16] = arg8;
                        } else if (arg1) {
                            arg7[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg4 == 2) {
            if (arg0 == 0) {
                for (int var87 = var24 - 1; var87 >= var22; var87--) {
                    for (int var88 = var21; var88 < var18; var88++) {
                        if ((var87 >> 1) >= var88) {
                            arg7[var16] = arg8;
                        } else if (arg1) {
                            arg7[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg0 == 1) {
                for (int var81 = var19; var81 < var15; var81++) {
                    for (int var82 = var21; var82 < var18; var82++) {
                        if (var16 >= 0 && arg7.length > var16) {
                            if (var82 >= (var81 << 1)) {
                                arg7[var16] = arg8;
                            } else if (arg1) {
                                arg7[var16] = arg6;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var17;
                }
            } else if (arg0 == 2) {
                for (int var83 = var19; var83 < var15; var83++) {
                    for (int var84 = var23 - 1; var84 >= var20; var84--) {
                        if ((var83 >> 1) >= var84) {
                            arg7[var16] = arg8;
                        } else if (arg1) {
                            arg7[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg0 == 3) {
                for (int var85 = var24 - 1; var85 >= var22; var85--) {
                    for (int var86 = var23 - 1; var86 >= var20; var86--) {
                        if (var86 >= (var85 << 1)) {
                            arg7[var16] = arg8;
                        } else if (arg1) {
                            arg7[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg4 == 3) {
            if (arg0 == 0) {
                for (int var73 = var24 - 1; var73 >= var22; var73--) {
                    for (int var74 = var23 - 1; var74 >= var20; var74--) {
                        if (var73 >> 1 >= var74) {
                            arg7[var16] = arg8;
                        } else if (arg1) {
                            arg7[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg0 == 1) {
                for (int var75 = var24 - 1; var75 >= var22; var75--) {
                    for (int var76 = var21; var76 < var18; var76++) {
                        if (var76 >= var75 << 1) {
                            arg7[var16] = arg8;
                        } else if (arg1) {
                            arg7[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg0 == 2) {
                for (int var77 = var19; var77 < var15; var77++) {
                    for (int var78 = var21; var78 < var18; var78++) {
                        if ((var77 >> 1) >= var78) {
                            arg7[var16] = arg8;
                        } else if (arg1) {
                            arg7[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg0 == 3) {
                for (int var79 = var19; var79 < var15; var79++) {
                    for (int var80 = var23 - 1; var80 >= var20; var80--) {
                        if ((var79 << 1) <= var80) {
                            arg7[var16] = arg8;
                        } else if (arg1) {
                            arg7[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg9 == 1) {
            if (arg4 == 4) {
                if (arg0 == 0) {
                    for (int var71 = var24 - 1; var71 >= var22; var71--) {
                        for (int var72 = var21; var72 < var18; var72++) {
                            if (var72 >= var71 >> 1) {
                                arg7[var16] = arg8;
                            } else if (arg1) {
                                arg7[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                } else if (arg0 == 1) {
                    for (int var65 = var19; var65 < var15; var65++) {
                        for (int var66 = var21; var66 < var18; var66++) {
                            if (var66 <= (var65 << 1)) {
                                arg7[var16] = arg8;
                            } else if (arg1) {
                                arg7[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                } else if (arg0 == 2) {
                    for (int var67 = var19; var67 < var15; var67++) {
                        for (int var68 = var23 - 1; var68 >= var20; var68--) {
                            if ((var67 >> 1) <= var68) {
                                arg7[var16] = arg8;
                            } else if (arg1) {
                                arg7[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                } else if (arg0 == 3) {
                    for (int var69 = var24 - 1; var69 >= var22; var69--) {
                        for (int var70 = var23 - 1; var70 >= var20; var70--) {
                            if (var70 <= (var69 << 1)) {
                                arg7[var16] = arg8;
                            } else if (arg1) {
                                arg7[var16] = arg6;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                }
            } else if (arg4 != 5) {
                if (arg4 == 6) {
                    if (arg0 == 0) {
                        for (int var47 = var19; var47 < var15; var47++) {
                            for (int var48 = var21; var48 < var18; var48++) {
                                if (arg5 / 2 >= var48) {
                                    arg7[var16] = arg8;
                                } else if (arg1) {
                                    arg7[var16] = arg6;
                                }
                                var16++;
                            }
                            var16 += var17;
                        }
                        return;
                    }
                    if (arg0 == 1) {
                        for (int var41 = var19; var41 < var15; var41++) {
                            for (int var42 = var21; var42 < var18; var42++) {
                                if (var41 <= (arg3 / 2)) {
                                    arg7[var16] = arg8;
                                } else if (arg1) {
                                    arg7[var16] = arg6;
                                }
                                var16++;
                            }
                            var16 += var17;
                        }
                        return;
                    }
                    if (arg0 == 2) {
                        for (int var45 = var19; var45 < var15; var45++) {
                            for (int var46 = var21; var46 < var18; var46++) {
                                if (arg5 / 2 <= var46) {
                                    arg7[var16] = arg8;
                                } else if (arg1) {
                                    arg7[var16] = arg6;
                                }
                                var16++;
                            }
                            var16 += var17;
                        }
                        return;
                    }
                    if (arg0 == 3) {
                        for (int var43 = var19; var43 < var15; var43++) {
                            for (int var44 = var21; var44 < var18; var44++) {
                                if (var43 >= (arg3 / 2)) {
                                    arg7[var16] = arg8;
                                } else if (arg1) {
                                    arg7[var16] = arg6;
                                }
                                var16++;
                            }
                            var16 += var17;
                        }
                        return;
                    }
                }
                if (arg4 == 7) {
                    if (arg0 == 0) {
                        for (int var49 = var19; var49 < var15; var49++) {
                            for (int var50 = var21; var50 < var18; var50++) {
                                if (var49 - (arg3 / 2) >= var50) {
                                    arg7[var16] = arg8;
                                } else if (arg1) {
                                    arg7[var16] = arg6;
                                }
                                var16++;
                            }
                            var16 += var17;
                        }
                        return;
                    }
                    if (arg0 == 1) {
                        for (int var51 = var24 - 1; var51 >= var22; var51--) {
                            for (int var52 = var21; var52 < var18; var52++) {
                                if ((var51 - (arg3 / 2)) >= var52) {
                                    arg7[var16] = arg8;
                                } else if (arg1) {
                                    arg7[var16] = arg6;
                                }
                                var16++;
                            }
                            var16 += var17;
                        }
                        return;
                    }
                    if (arg0 == 2) {
                        for (int var63 = var24 - 1; var63 >= var22; var63--) {
                            for (int var64 = var23 - 1; var64 >= var20; var64--) {
                                if (var64 <= (var63 - (arg3 / 2))) {
                                    arg7[var16] = arg8;
                                } else if (arg1) {
                                    arg7[var16] = arg6;
                                }
                                var16++;
                            }
                            var16 += var17;
                        }
                        return;
                    }
                    if (arg0 == 3) {
                        for (int var61 = var19; var61 < var15; var61++) {
                            for (int var62 = var23 - 1; var62 >= var20; var62--) {
                                if (var62 <= (var61 - (arg3 / 2))) {
                                    arg7[var16] = arg8;
                                } else if (arg1) {
                                    arg7[var16] = arg6;
                                }
                                var16++;
                            }
                            var16 += var17;
                        }
                        return;
                    }
                }
                if (arg4 == 8) {
                    if (arg0 == 0) {
                        for (int var59 = var19; var59 < var15; var59++) {
                            for (int var60 = var21; var60 < var18; var60++) {
                                if (var60 >= var59 - (arg3 / 2)) {
                                    arg7[var16] = arg8;
                                } else if (arg1) {
                                    arg7[var16] = arg6;
                                }
                                var16++;
                            }
                            var16 += var17;
                        }
                        return;
                    }
                    if (arg0 == 1) {
                        for (int var57 = var24 - 1; var57 >= var22; var57--) {
                            for (int var58 = var21; var58 < var18; var58++) {
                                if (var58 >= var57 - arg3 / 2) {
                                    arg7[var16] = arg8;
                                } else if (arg1) {
                                    arg7[var16] = arg6;
                                }
                                var16++;
                            }
                            var16 += var17;
                        }
                        return;
                    }
                    if (arg0 == 2) {
                        for (int var53 = var24 - 1; var53 >= var22; var53--) {
                            for (int var54 = var23 - 1; var54 >= var20; var54--) {
                                if (var54 >= (var53 - (arg3 / 2))) {
                                    arg7[var16] = arg8;
                                } else if (arg1) {
                                    arg7[var16] = arg6;
                                }
                                var16++;
                            }
                            var16 += var17;
                        }
                        return;
                    }
                    if (arg0 == 3) {
                        for (int var55 = var19; var55 < var15; var55++) {
                            for (int var56 = var23 - 1; var56 >= var20; var56--) {
                                if (var55 - arg3 / 2 <= var56) {
                                    arg7[var16] = arg8;
                                } else if (arg1) {
                                    arg7[var16] = arg6;
                                }
                                var16++;
                            }
                            var16 += var17;
                        }
                        return;
                    }
                }
            } else if (arg0 == 0) {
                for (int var39 = var24 - 1; var39 >= var22; var39--) {
                    for (int var40 = var23 - 1; var40 >= var20; var40--) {
                        if (var40 >= var39 >> 1) {
                            arg7[var16] = arg8;
                        } else if (arg1) {
                            arg7[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg0 == 1) {
                for (int var37 = var24 - 1; var37 >= var22; var37--) {
                    for (int var38 = var21; var38 < var18; var38++) {
                        if (var38 <= var37 << 1) {
                            arg7[var16] = arg8;
                        } else if (arg1) {
                            arg7[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg0 == 2) {
                for (int var33 = var19; var33 < var15; var33++) {
                    for (int var34 = var21; var34 < var18; var34++) {
                        if (var34 >= var33 >> 1) {
                            arg7[var16] = arg8;
                        } else if (arg1) {
                            arg7[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg0 == 3) {
                for (int var35 = var19; var35 < var15; var35++) {
                    for (int var36 = var23 - 1; var36 >= var20; var36--) {
                        if (var35 << 1 >= var36) {
                            arg7[var16] = arg8;
                        } else if (arg1) {
                            arg7[var16] = arg6;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lme;ZLme;I)V", line = 1688)
    public static final void method296(class295 arg0, boolean arg1, class295 arg2, int arg3) {
        class101.field1637 = arg2;
        field645++;
        class133.field2212 = arg1;
        if (arg3 > -15) {
            method291(15);
        }
        class291.field4981 = arg0;
    }
}
