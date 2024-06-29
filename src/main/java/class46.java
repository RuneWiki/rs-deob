import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class46 extends class262 {

    @OriginalMember(owner = "client!t", name = "q", descriptor = "[J")
    private long[] field765 = new long[10];

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    private int field778 = 1;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    private int field774 = 0;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    private int field761 = 256;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "J")
    private long field775 = class121.method888((byte) -119);

    @OriginalMember(owner = "client!t", name = "o", descriptor = "Lda;")
    public static class275 field763 = class255.method1672(117, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!t", name = "I", descriptor = "[S")
    public static short[] field783 = new short[256];

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    private int field781;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "J")
    public static long field769;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "Lqg;")
    public static class16 field772;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Ljk;")
    public static class58 field762;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "[Lkb;")
    public static class259[] field768;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)I")
    public static final int method269(int arg0, int arg1) {
        field776++;
        if (arg0 != 127) {
            method274(true, -93);
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public final void method270(int arg0) {
        int var2 = 0;
        if (arg0 != 2) {
            method277((class105) null, 59);
        }
        while (var2 < 10) {
            this.field765[var2] = 0L;
            var2++;
        }
        field771++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lij;I)V")
    public static final void method271(class85 arg0, int arg1) {
        if (arg1 != 20686) {
            return;
        }
        field764++;
        while (true) {
            while (arg0.field1392 < arg0.field1381.length) {
                int var2 = 0;
                int var3 = 0;
                boolean var4 = false;
                if (arg0.method564((byte) 54) == 1) {
                    var4 = true;
                    var2 = arg0.method564((byte) 96);
                    var3 = arg0.method564((byte) 80);
                }
                int var5 = arg0.method564((byte) 50);
                int var6 = arg0.method564((byte) 53);
                int var7 = class5.field67 + class106.field1841 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class18.field255;
                if (var8 >= 0 && (var7 - 63) >= 0 && var8 + 63 < class255.field4497 && class5.field67 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var4 || var11 >= (var2 * 8) && (var2 * 8 + 8) > var11 && var12 >= var3 * 8 && var12 < var3 * 8 + 8) {
                                byte var13 = arg0.method581(8);
                                if (var13 != 0) {
                                    if (class83.field1341[var9][var10] == null) {
                                        class83.field1341[var9][var10] = new byte[4096];
                                    }
                                    class83.field1341[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method581(8);
                                    if (class157.field2768[var9][var10] == null) {
                                        class157.field2768[var9][var10] = new byte[4096];
                                    }
                                    class157.field2768[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var4 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method581(8);
                        if (var16 != 0) {
                            arg0.field1392++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIII)V")
    public static final void method272(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field767++;
        int var5 = arg0;
        int var6 = -arg1;
        int var7 = arg1;
        int var8 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg1 + arg3);
        int var9 = -1;
        int var10 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg3 - arg1);
        class36.method216(class19.field280[arg4], var10, arg2, -126, var8);
        while (var5 < var7) {
            var9 += 2;
            var6 += var9;
            if (var6 > 0) {
                var7--;
                var6 -= var7 << 1;
                int var11 = arg4 - var7;
                int var12 = arg4 + var7;
                if (var12 >= class149.field2603 && class141.field2493 >= var11) {
                    int var13 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg3 + var5);
                    int var14 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg3 - var5);
                    if (class141.field2493 >= var12) {
                        class36.method216(class19.field280[var12], var14, arg2, -124, var13);
                    }
                    if (class149.field2603 <= var11) {
                        class36.method216(class19.field280[var11], var14, arg2, -114, var13);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (var16 >= class149.field2603 && class141.field2493 >= var15) {
                int var17 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg3 + var7);
                int var18 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg3 - var7);
                if (class141.field2493 >= var16) {
                    class36.method216(class19.field280[var16], var18, arg2, arg0 ^ 0xFFFFFF89, var17);
                }
                if (class149.field2603 <= var15) {
                    class36.method216(class19.field280[var15], var18, arg2, -128, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZ)Z")
    public static final boolean method273(int arg0, boolean arg1) {
        field777++;
        if (arg1) {
            method279(-47, 17, 27, 61);
        }
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)V")
    public static final void method274(boolean arg0, int arg1) {
        field779++;
        if (class4.field59 == arg0) {
            return;
        }
        class4.field59 = arg0;
        if (arg1 < 55) {
            method271((class85) null, -112);
        }
        class13.method59(2048);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIZIIZILcg;I)V")
    public static final void method275(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, boolean arg7, int arg8, class118 arg9, int arg10) {
        field773++;
        if (arg4 && !class262.method1714(arg10 ^ 0xE07C7D1) && (class72.field1168[0][arg3][arg6] & 0x2) == 0) {
            if ((class72.field1168[arg2][arg3][arg6] & 0x10) != 0) {
                return;
            }
            if (class159.method1113(arg6, arg3, arg2, true) != class122.field2185) {
                return;
            }
        }
        if (class240.field4223 > arg2) {
            class240.field4223 = arg2;
        }
        class34 var11 = class146.method1040(107, arg1);
        int var12;
        int var13;
        if (arg8 == 1 || arg8 == 3) {
            var13 = var11.field526;
            var12 = var11.field559;
        } else {
            var12 = var11.field526;
            var13 = var11.field559;
        }
        int var14;
        int var15;
        if (arg3 + var13 <= 104) {
            var14 = (var13 + 1 >> 1) + arg3;
            var15 = arg3 + (var13 >> 1);
        } else {
            var15 = arg3;
            var14 = arg3 + 1;
        }
        int var16 = (arg3 << 7) + (var13 << 6);
        int var17;
        int var18;
        if ((arg6 + var12) > 104) {
            var17 = arg6 + 1;
            var18 = arg6;
        } else {
            var18 = (var12 >> 1) + arg6;
            var17 = (var12 + 1 >> 1) + arg6;
        }
        int var19 = (arg6 << 7) + (var12 << 6);
        int[][] var20 = class92.field1575[arg0];
        long var21 = (long) (arg5 << 14 | arg3 | arg6 << 7 | arg8 << 20 | 0x40000000);
        int var23 = var20[var14][var17] + var20[var15][var17] + var20[var15][var18] + var20[var14][var18] >> 2;
        if (var11.field517 == 0 || arg7) {
            var21 |= Long.MIN_VALUE;
        }
        if (var11.field502 == 1) {
            var21 |= 0x400000L;
        }
        if (var11.field550) {
            var21 |= 0x80000000L;
        }
        long var24 = var21 | (long) arg1 << 32;
        int[][] var26 = null;
        if (arg7) {
            var26 = class273.field4725[0];
        } else if (arg0 < 3) {
            var26 = class92.field1575[arg0 + 1];
        }
        if (var11.method201(-116)) {
            class234.method1525(var11, (class165) null, arg8, arg6, arg3, (class109) null, arg2, (byte) -53);
        }
        boolean var27 = var11.field542 & !arg7;
        if (arg5 == 22) {
            if (class77.field1284 || var11.field517 != 0 || var11.field551 == 1 || var11.field521) {
                class234 var29;
                if (var11.field514 == -1 && var11.field528 == null) {
                    class159 var28 = var11.method193(var20, var26, (class20) null, 22, var23, var16, var19, arg4, arg8, var27, -50);
                    var29 = var28.field2788;
                } else {
                    var29 = new class207(arg1, 22, arg8, arg0, arg3, arg6, var11.field514, var11.field503, (class234) null);
                }
                class226.method1464(arg2, arg3, arg6, var23, var29, var24, var11.field546);
                if (var11.field551 == 1 && arg9 != null) {
                    arg9.method871(arg3, (byte) -26, arg6);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class234 var69;
            if (var11.field514 == -1 && var11.field528 == null) {
                class159 var68 = var11.method193(var20, var26, (class20) null, 10, var23, var16, var19, arg4, arg5 == 11 ? arg8 + 4 : arg8, var27, arg10 + 235390880);
                var69 = var68.field2788;
            } else {
                var69 = new class207(arg1, 10, arg5 == 11 ? arg8 + 4 : arg8, arg0, arg3, arg6, var11.field514, var11.field503, (class234) null);
            }
            if (var69 != null) {
                boolean var70 = class255.method1674(arg2, arg3, arg6, var23, var13, var12, var69, 0, var24);
                if (var11.field495 && var70 && arg4) {
                    int var71 = 15;
                    if (var69 instanceof class176) {
                        var71 = ((class176) var69).method941() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (class213.field3640[arg2][arg3 + var72][arg6 + var73] < var71) {
                                class213.field3640[arg2][arg3 + var72][arg6 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field551 != 0 && arg9 != null) {
                arg9.method860(var12, arg6, var11.field553, arg3, (byte) 115, var13);
            }
        } else {
            if (arg10 != -235390930) {
                field762 = null;
            }
            if (arg5 >= 12) {
                class234 var31;
                if (var11.field514 == -1 && var11.field528 == null) {
                    class159 var30 = var11.method193(var20, var26, (class20) null, arg5, var23, var16, var19, arg4, arg8, var27, -50);
                    var31 = var30.field2788;
                } else {
                    var31 = new class207(arg1, arg5, arg8, arg0, arg3, arg6, var11.field514, var11.field503, (class234) null);
                }
                class255.method1674(arg2, arg3, arg6, var23, 1, 1, var31, 0, var24);
                if (arg4 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg2 > 0) {
                    class238.field4151[arg2][arg3][arg6] = class246.method1612(class238.field4151[arg2][arg3][arg6], 4);
                }
                if (var11.field551 != 0 && arg9 != null) {
                    arg9.method860(var12, arg6, var11.field553, arg3, (byte) 101, var13);
                }
            } else if (arg5 == 0) {
                class234 var33;
                if (var11.field514 == -1 && var11.field528 == null) {
                    class159 var32 = var11.method193(var20, var26, (class20) null, 0, var23, var16, var19, arg4, arg8, var27, -50);
                    var33 = var32.field2788;
                } else {
                    var33 = new class207(arg1, 0, arg8, arg0, arg3, arg6, var11.field514, var11.field503, (class234) null);
                }
                class38.method223(arg2, arg3, arg6, var23, var33, (class234) null, class150.field2620[arg8], 0, var24);
                if (arg4) {
                    if (arg8 == 0) {
                        if (var11.field495) {
                            class213.field3640[arg2][arg3][arg6] = 50;
                            class213.field3640[arg2][arg3][arg6 + 1] = 50;
                        }
                        if (var11.field510) {
                            class238.field4151[arg2][arg3][arg6] = class246.method1612(class238.field4151[arg2][arg3][arg6], 1);
                        }
                    } else if (arg8 == 1) {
                        if (var11.field495) {
                            class213.field3640[arg2][arg3][arg6 + 1] = 50;
                            class213.field3640[arg2][arg3 + 1][arg6 + 1] = 50;
                        }
                        if (var11.field510) {
                            class238.field4151[arg2][arg3][arg6 + 1] = class246.method1612(class238.field4151[arg2][arg3][arg6 + 1], 2);
                        }
                    } else if (arg8 == 2) {
                        if (var11.field495) {
                            class213.field3640[arg2][arg3 + 1][arg6] = 50;
                            class213.field3640[arg2][arg3 + 1][arg6 + 1] = 50;
                        }
                        if (var11.field510) {
                            class238.field4151[arg2][arg3 + 1][arg6] = class246.method1612(class238.field4151[arg2][arg3 + 1][arg6], 1);
                        }
                    } else if (arg8 == 3) {
                        if (var11.field495) {
                            class213.field3640[arg2][arg3][arg6] = 50;
                            class213.field3640[arg2][arg3 + 1][arg6] = 50;
                        }
                        if (var11.field510) {
                            class238.field4151[arg2][arg3][arg6] = class246.method1612(class238.field4151[arg2][arg3][arg6], 2);
                        }
                    }
                }
                if (var11.field551 != 0 && arg9 != null) {
                    arg9.method862(var11.field553, true, arg8, arg5, arg3, arg6);
                }
                if (var11.field543 != 16) {
                    class226.method1461(arg2, arg3, arg6, var11.field543);
                }
            } else if (arg5 == 1) {
                class234 var35;
                if (var11.field514 == -1 && var11.field528 == null) {
                    class159 var34 = var11.method193(var20, var26, (class20) null, 1, var23, var16, var19, arg4, arg8, var27, -50);
                    var35 = var34.field2788;
                } else {
                    var35 = new class207(arg1, 1, arg8, arg0, arg3, arg6, var11.field514, var11.field503, (class234) null);
                }
                class38.method223(arg2, arg3, arg6, var23, var35, (class234) null, class29.field437[arg8], 0, var24);
                if (var11.field495 && arg4) {
                    if (arg8 == 0) {
                        class213.field3640[arg2][arg3][arg6 + 1] = 50;
                    } else if (arg8 == 1) {
                        class213.field3640[arg2][arg3 + 1][arg6 + 1] = 50;
                    } else if (arg8 == 2) {
                        class213.field3640[arg2][arg3 + 1][arg6] = 50;
                    } else if (arg8 == 3) {
                        class213.field3640[arg2][arg3][arg6] = 50;
                    }
                }
                if (var11.field551 != 0 && arg9 != null) {
                    arg9.method862(var11.field553, true, arg8, arg5, arg3, arg6);
                }
            } else if (arg5 == 2) {
                int var36 = arg8 + 1 & 0x3;
                class234 var38;
                class234 var40;
                if (var11.field514 == -1 && var11.field528 == null) {
                    class159 var37 = var11.method193(var20, var26, (class20) null, 2, var23, var16, var19, arg4, arg8 + 4, var27, -50);
                    var38 = var37.field2788;
                    class159 var39 = var11.method193(var20, var26, (class20) null, 2, var23, var16, var19, arg4, var36, var27, -50);
                    var40 = var39.field2788;
                } else {
                    var38 = new class207(arg1, 2, arg8 + 4, arg0, arg3, arg6, var11.field514, var11.field503, (class234) null);
                    var40 = new class207(arg1, 2, var36, arg0, arg3, arg6, var11.field514, var11.field503, (class234) null);
                }
                class38.method223(arg2, arg3, arg6, var23, var38, var40, class150.field2620[arg8], class150.field2620[var36], var24);
                if (var11.field510 && arg4) {
                    if (arg8 == 0) {
                        class238.field4151[arg2][arg3][arg6] = class246.method1612(class238.field4151[arg2][arg3][arg6], 1);
                        class238.field4151[arg2][arg3][arg6 + 1] = class246.method1612(class238.field4151[arg2][arg3][arg6 + 1], 2);
                    } else if (arg8 == 1) {
                        class238.field4151[arg2][arg3][arg6 + 1] = class246.method1612(class238.field4151[arg2][arg3][arg6 + 1], 2);
                        class238.field4151[arg2][arg3 + 1][arg6] = class246.method1612(class238.field4151[arg2][arg3 + 1][arg6], 1);
                    } else if (arg8 == 2) {
                        class238.field4151[arg2][arg3 + 1][arg6] = class246.method1612(class238.field4151[arg2][arg3 + 1][arg6], 1);
                        class238.field4151[arg2][arg3][arg6] = class246.method1612(class238.field4151[arg2][arg3][arg6], 2);
                    } else if (arg8 == 3) {
                        class238.field4151[arg2][arg3][arg6] = class246.method1612(class238.field4151[arg2][arg3][arg6], 2);
                        class238.field4151[arg2][arg3][arg6] = class246.method1612(class238.field4151[arg2][arg3][arg6], 1);
                    }
                }
                if (var11.field551 != 0 && arg9 != null) {
                    arg9.method862(var11.field553, true, arg8, arg5, arg3, arg6);
                }
                if (var11.field543 != 16) {
                    class226.method1461(arg2, arg3, arg6, var11.field543);
                }
            } else if (arg5 == 3) {
                class234 var42;
                if (var11.field514 == -1 && var11.field528 == null) {
                    class159 var41 = var11.method193(var20, var26, (class20) null, 3, var23, var16, var19, arg4, arg8, var27, -50);
                    var42 = var41.field2788;
                } else {
                    var42 = new class207(arg1, 3, arg8, arg0, arg3, arg6, var11.field514, var11.field503, (class234) null);
                }
                class38.method223(arg2, arg3, arg6, var23, var42, (class234) null, class29.field437[arg8], 0, var24);
                if (var11.field495 && arg4) {
                    if (arg8 == 0) {
                        class213.field3640[arg2][arg3][arg6 + 1] = 50;
                    } else if (arg8 == 1) {
                        class213.field3640[arg2][arg3 + 1][arg6 + 1] = 50;
                    } else if (arg8 == 2) {
                        class213.field3640[arg2][arg3 + 1][arg6] = 50;
                    } else if (arg8 == 3) {
                        class213.field3640[arg2][arg3][arg6] = 50;
                    }
                }
                if (var11.field551 != 0 && arg9 != null) {
                    arg9.method862(var11.field553, true, arg8, arg5, arg3, arg6);
                }
            } else if (arg5 == 9) {
                class234 var44;
                if (var11.field514 == -1 && var11.field528 == null) {
                    class159 var43 = var11.method193(var20, var26, (class20) null, arg5, var23, var16, var19, arg4, arg8, var27, -50);
                    var44 = var43.field2788;
                } else {
                    var44 = new class207(arg1, arg5, arg8, arg0, arg3, arg6, var11.field514, var11.field503, (class234) null);
                }
                class255.method1674(arg2, arg3, arg6, var23, 1, 1, var44, 0, var24);
                if (var11.field551 != 0 && arg9 != null) {
                    arg9.method860(var12, arg6, var11.field553, arg3, (byte) 94, var13);
                }
                if (var11.field543 != 16) {
                    class226.method1461(arg2, arg3, arg6, var11.field543);
                }
            } else if (arg5 == 4) {
                class234 var46;
                if (var11.field514 == -1 && var11.field528 == null) {
                    class159 var45 = var11.method193(var20, var26, (class20) null, 4, var23, var16, var19, arg4, arg8, var27, arg10 ^ 0xE07C7E0);
                    var46 = var45.field2788;
                } else {
                    var46 = new class207(arg1, 4, arg8, arg0, arg3, arg6, var11.field514, var11.field503, (class234) null);
                }
                class104.method748(arg2, arg3, arg6, var23, var46, (class234) null, class150.field2620[arg8], 0, 0, 0, var24);
            } else if (arg5 == 5) {
                long var47 = class181.method1216(arg2, arg3, arg6);
                int var49 = 16;
                if (var47 != 0L) {
                    var49 = class146.method1040(44, (int) (var47 >>> 32) & Integer.MAX_VALUE).field543;
                }
                class234 var51;
                if (var11.field514 == -1 && var11.field528 == null) {
                    class159 var50 = var11.method193(var20, var26, (class20) null, 4, var23, var16, var19, arg4, arg8, var27, -50);
                    var51 = var50.field2788;
                } else {
                    var51 = new class207(arg1, 4, arg8, arg0, arg3, arg6, var11.field514, var11.field503, (class234) null);
                }
                class104.method748(arg2, arg3, arg6, var23, var51, (class234) null, class150.field2620[arg8], 0, class237.field4121[arg8] * var49, class72.field1177[arg8] * var49, var24);
            } else if (arg5 == 6) {
                long var52 = class181.method1216(arg2, arg3, arg6);
                int var54 = 8;
                if (var52 != 0L) {
                    var54 = class146.method1040(100, Integer.MAX_VALUE & (int) (var52 >>> 32)).field543 / 2;
                }
                class234 var56;
                if (var11.field514 == -1 && var11.field528 == null) {
                    class159 var55 = var11.method193(var20, var26, (class20) null, 4, var23, var16, var19, arg4, arg8 + 4, var27, -50);
                    var56 = var55.field2788;
                } else {
                    var56 = new class207(arg1, 4, arg8 + 4, arg0, arg3, arg6, var11.field514, var11.field503, (class234) null);
                }
                class104.method748(arg2, arg3, arg6, var23, var56, (class234) null, 256, arg8, class77.field1276[arg8] * var54, class277.field4834[arg8] * var54, var24);
            } else if (arg5 == 7) {
                int var57 = arg8 + 2 & 0x3;
                class234 var59;
                if (var11.field514 == -1 && var11.field528 == null) {
                    class159 var58 = var11.method193(var20, var26, (class20) null, 4, var23, var16, var19, arg4, var57 + 4, var27, arg10 ^ 0xE07C7E0);
                    var59 = var58.field2788;
                } else {
                    var59 = new class207(arg1, 4, var57 + 4, arg0, arg3, arg6, var11.field514, var11.field503, (class234) null);
                }
                class104.method748(arg2, arg3, arg6, var23, var59, (class234) null, 256, var57, 0, 0, var24);
            } else if (arg5 == 8) {
                int var60 = 8;
                long var61 = class181.method1216(arg2, arg3, arg6);
                if (var61 != 0L) {
                    var60 = class146.method1040(90, (int) (var61 >>> 32) & Integer.MAX_VALUE).field543 / 2;
                }
                int var63 = arg8 + 2 & 0x3;
                class234 var65;
                class234 var67;
                if (var11.field514 == -1 && var11.field528 == null) {
                    class159 var64 = var11.method193(var20, var26, (class20) null, 4, var23, var16, var19, arg4, arg8 + 4, var27, arg10 ^ 0xE07C7E0);
                    var65 = var64.field2788;
                    class159 var66 = var11.method193(var20, var26, (class20) null, 4, var23, var16, var19, arg4, var63 + 4, var27, arg10 + 235390880);
                    var67 = var66.field2788;
                } else {
                    var65 = new class207(arg1, 4, arg8 + 4, arg0, arg3, arg6, var11.field514, var11.field503, (class234) null);
                    var67 = new class207(arg1, 4, var63 + 4, arg0, arg3, arg6, var11.field514, var11.field503, (class234) null);
                }
                class104.method748(arg2, arg3, arg6, var23, var65, var67, 256, arg8, class77.field1276[arg8] * var60, class277.field4834[arg8] * var60, var24);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)I")
    public final int method276(int arg0, int arg1, int arg2) {
        field780++;
        int var4 = this.field761;
        this.field761 = 300;
        int var5 = this.field778;
        this.field778 = 1;
        this.field775 = class121.method888((byte) -119);
        if (this.field765[this.field781] == 0L) {
            this.field778 = var5;
            this.field761 = var4;
        } else if (this.field765[this.field781] < this.field775) {
            this.field761 = (int) ((long) (arg2 * 2560) / (this.field775 - this.field765[this.field781]));
        }
        if (this.field761 < 25) {
            this.field761 = 25;
        }
        if (this.field761 > 256) {
            this.field761 = 256;
            this.field778 = (int) ((long) arg2 - ((this.field775 - this.field765[this.field781]) / 10L));
        }
        if (this.field778 > arg2) {
            this.field778 = arg2;
        }
        this.field765[this.field781] = this.field775;
        this.field781 = (this.field781 + 1) % 10;
        if (this.field778 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field765[var6] != 0L) {
                    this.field765[var6] += (long) this.field778;
                }
            }
        }
        int var7 = arg1;
        if (arg0 > this.field778) {
            this.field778 = arg0;
        }
        class250.method1640((long) this.field778, 115);
        while (this.field774 < 256) {
            this.field774 += this.field761;
            var7++;
        }
        this.field774 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lma;I)V")
    public static final void method277(class105 arg0, int arg1) {
        class95.field1619 = class267.method1757((byte) -107, 0, class269.field4659, arg0);
        field770++;
        class16.field244 = new class20[class95.field1619.length];
        class221.field3754 = new class20[class95.field1619.length];
        class66.field1082 = new class20[class95.field1619.length];
        for (int var2 = 0; var2 < class95.field1619.length; var2++) {
            class95.field1619[var2].method100();
            class16.field244[var2] = class95.field1619[var2].method103();
            class95.field1619[var2].method100();
            class221.field3754[var2] = class95.field1619[var2].method103();
            class95.field1619[var2].method100();
            class66.field1082[var2] = class95.field1619[var2].method103();
            class95.field1619[var2].method100();
        }
        field768 = class229.method1484(0, arg0, (byte) -92, class229.field3928);
        class235.field4105 = class142.method1023(-17933, 0, class155.field2696, arg0);
        class35.field585 = class142.method1023(-17933, 0, class180.field3090, arg0);
        class235.field4103 = class142.method1023(arg1 ^ 0xFFFFCE13, 0, class258.field4519, arg0);
        class238.field4156 = class142.method1023(-17933, 0, class250.field4417, arg0);
        class165.field2872 = class49.method313(arg0, 0, true, class276.field4820);
        class52.field874 = class49.method313(arg0, 0, true, class235.field4093);
        class67.field1095 = class83.method543(true, arg0, 0, class116.field2067);
        class237.field4126 = class49.method313(arg0, 0, true, class87.field1462);
        class234.field4091 = class49.method313(arg0, 0, true, class108.field1881);
        class195.field3340 = class16.method86(0, class225.field3807, true, arg0);
        class209.field3539 = class16.method86(0, class153.field2680, true, arg0);
        class5.field73.method122(class209.field3539, (int[]) null);
        class99.field1666.method122(class209.field3539, (int[]) null);
        class93.field1599.method122(class209.field3539, (int[]) null);
        class259 var3 = class45.method267(arg0, 0, (byte) -85, class56.field948);
        var3.method1693();
        class44.field749 = var3;
        class259[] var4 = class229.method1484(0, arg0, (byte) -120, class129.field2276);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1693();
        }
        class251.field4457 = var4;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 41.0D) - 20;
        for (int var10 = 0; var10 < field768.length; var10++) {
            field768[var10].method1687(var6 + var9, var7 + var9, var8 + var9);
        }
        class95.field1619[0].method106(var6 + var9, var7 + var9, var8 + var9);
        if (arg1 != 30688) {
            field766 = -126;
        }
        class149.field2602 = field768;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
    public static void method278(int arg0) {
        field768 = null;
        field762 = null;
        field763 = null;
        field783 = null;
        if (arg0 != -257) {
            field762 = null;
        }
        field772 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)V")
    public static final void method279(int arg0, int arg1, int arg2, int arg3) {
        class275 var4 = class197.method1291(new class275[] { class49.field821, class250.method1644(arg2, (byte) -115), class12.field184, class250.method1644(arg0 >> 6, (byte) -115), class12.field184, class250.method1644(arg3 >> 6, (byte) -115), class12.field184, class250.method1644(arg0 & 0x3F, (byte) -115), class12.field184, class250.method1644(arg3 & 0x3F, (byte) -115) }, -30025);
        if (arg1 == 1519635526) {
            var4.method1834(true);
            field782++;
            class125.method903(var4, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBI)V")
    public static final void method280(int arg0, byte arg1, int arg2) {
        int var3 = -90 / ((arg1 - 45) / 58);
        for (int var4 = 0; var4 < field766; var4++) {
            class93 var5 = class181.method1215(-18712, var4);
            if (var5 != null) {
                int var6 = var5.field1584;
                if (var6 >= 0 && !class223.field3771.method73(var6, 0)) {
                    var6 = -1;
                }
                int var7;
                if (var5.field1589 >= 0) {
                    int var11 = var5.field1589;
                    int var12 = (var11 & 0x7F) + arg0;
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 127) {
                        var12 = 127;
                    }
                    int var13 = (arg2 + var11 & 0xFC00) + (var11 & 0x380) + var12;
                    var7 = class223.field3777[class153.method1083(96, (byte) -124, var13)];
                } else if (var6 >= 0) {
                    var7 = class223.field3777[class153.method1083(96, (byte) -50, class223.field3771.method74(var6, 65535))];
                } else if (var5.field1588 == -1) {
                    var7 = -1;
                } else {
                    int var8 = var5.field1588;
                    int var9 = (var8 & 0x7F) + arg0;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > 127) {
                        var9 = 127;
                    }
                    int var10 = (arg2 + var8 & 0xFC00) + (var8 & 0x380) + var9;
                    var7 = class223.field3777[class153.method1083(96, (byte) -23, var10)];
                }
                class114.field2027[var4 + 1] = var7;
            }
        }
        field784++;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
    public class46() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field765[var1] = this.field775;
        }
    }
}
