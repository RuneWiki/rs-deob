import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class104 {

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Lu;")
    public static class135 field2509 = class87.method676((byte) -107, "Von:");

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field2508 = 0;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Lu;")
    public static class135 field2502 = class87.method676((byte) -103, "Art");

    @OriginalMember(owner = "client!p", name = "c", descriptor = "J")
    public static volatile long field2503 = 0L;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2507 = -1;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "[I")
    public static int[] field2514 = new int[500];

    @OriginalMember(owner = "client!p", name = "m", descriptor = "[I")
    public static int[] field2513 = new int[2000];

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Lu;")
    public static class135 field2504 = class87.method676((byte) -60, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lpd;")
    public static class108 field2501;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2515;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
    public static final void method848(boolean arg0) {
        for (int var1 = -1; var1 < class14.field329; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class108.field2600[var1];
            }
            class145 var3 = class131.field3166[var2];
            if (var3 != null) {
                class69.method555(true, var3, 1);
            }
        }
        field2511++;
        if (!arg0) {
            field2515 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lsd;IBIIILob;II)V")
    public static final void method849(class127 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class99 arg6, int arg7, int arg8) {
        field2506++;
        if (class100.field2422 && (client.field525[0][arg5][arg3] & 0x2) == 0) {
            if ((client.field525[arg4][arg5][arg3] & 0x10) != 0) {
                return;
            }
            if (class75.method608(arg4, arg5, arg3, 72) != class86.field2045) {
                return;
            }
        }
        if (class128.field3095 > arg4) {
            class128.field3095 = arg4;
        }
        int var9 = class68.field1682[arg4][arg5][arg3];
        int var10 = class68.field1682[arg4][arg5 + 1][arg3 + 1];
        int var11 = class68.field1682[arg4][arg5 + 1][arg3];
        int var12 = class68.field1682[arg4][arg5][arg3 + 1];
        int var13 = var9 + var12 + var11 + var10 >> 2;
        int var14 = (arg3 << 7) + (arg8 << 14) + arg5 + 1073741824;
        class119 var15 = class2.method9(false, arg8);
        if (var15.field2877 == 0) {
            var14 += Integer.MIN_VALUE;
        }
        int var16 = (arg1 << 6) + arg7;
        if (var15.field2850 == 1) {
            var16 += 256;
        }
        if (var15.method943((byte) -103)) {
            class80.method632(arg3, false, arg5, arg1, arg4, var15);
        }
        if (arg7 == 22) {
            if (!class100.field2422 || var15.field2877 != 0 || var15.field2834 == 1 || var15.field2845) {
                class143 var17;
                if (var15.field2874 == -1 && var15.field2825 == null) {
                    var17 = var15.method952(var10, var9, (byte) -51, var11, var12, 22, arg1);
                } else {
                    var17 = new class35(arg8, 22, arg1, var9, var11, var10, var12, var15.field2874, true, null);
                }
                arg0.method1029(arg4, arg5, arg3, var13, var17, var14, var16);
                if (var15.field2834 == 1 && arg6 != null) {
                    arg6.method818(arg3, arg5, (byte) 85);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class143 var37;
            if (var15.field2874 == -1 && var15.field2825 == null) {
                var37 = var15.method952(var10, var9, (byte) -51, var11, var12, 10, arg1);
            } else {
                var37 = new class35(arg8, 10, arg1, var9, var11, var10, var12, var15.field2874, true, null);
            }
            if (var37 != null) {
                int var38 = 0;
                int var39;
                int var40;
                if (arg1 == 1 || arg1 == 3) {
                    var39 = var15.field2890;
                    var40 = var15.field2860;
                } else {
                    var39 = var15.field2860;
                    var40 = var15.field2890;
                }
                if (arg7 == 11) {
                    var38 += 256;
                }
                if (arg0.method1005(arg4, arg5, arg3, var13, var40, var39, var37, var38, var14, var16) && var15.field2882) {
                    int var41 = 15;
                    if (var37 instanceof class91) {
                        var41 = ((class91) var37).method695() / 4;
                        if (var41 > 30) {
                            var41 = 30;
                        }
                    }
                    for (int var42 = 0; var42 <= var40; var42++) {
                        for (int var43 = 0; var43 <= var39; var43++) {
                            if (var41 > class52.field1241[arg4][arg5 + var42][arg3 + var43]) {
                                class52.field1241[arg4][arg5 + var42][arg3 + var43] = (byte) var41;
                            }
                        }
                    }
                }
            }
            if (var15.field2834 != 0 && arg6 != null) {
                arg6.method806(arg1, var15.field2860, arg3, -95, var15.field2890, arg5, var15.field2862);
            }
        } else if (arg7 >= 12) {
            class143 var18;
            if (var15.field2874 == -1 && var15.field2825 == null) {
                var18 = var15.method952(var10, var9, (byte) -51, var11, var12, arg7, arg1);
            } else {
                var18 = new class35(arg8, arg7, arg1, var9, var11, var10, var12, var15.field2874, true, null);
            }
            arg0.method1005(arg4, arg5, arg3, var13, 1, 1, var18, 0, var14, var16);
            if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg4 > 0) {
                class132.field3199[arg4][arg5][arg3] = class44.method346(class132.field3199[arg4][arg5][arg3], 2340);
            }
            if (var15.field2834 != 0 && arg6 != null) {
                arg6.method806(arg1, var15.field2860, arg3, -4, var15.field2890, arg5, var15.field2862);
            }
        } else if (arg7 == 0) {
            class143 var19;
            if (var15.field2874 == -1 && var15.field2825 == null) {
                var19 = var15.method952(var10, var9, (byte) -51, var11, var12, 0, arg1);
            } else {
                var19 = new class35(arg8, 0, arg1, var9, var11, var10, var12, var15.field2874, true, null);
            }
            arg0.method1001(arg4, arg5, arg3, var13, var19, null, class117.field2808[arg1], 0, var14, var16);
            if (arg1 == 0) {
                if (var15.field2882) {
                    class52.field1241[arg4][arg5][arg3] = 50;
                    class52.field1241[arg4][arg5][arg3 + 1] = 50;
                }
                if (var15.field2854) {
                    class132.field3199[arg4][arg5][arg3] = class44.method346(class132.field3199[arg4][arg5][arg3], 585);
                }
            } else if (arg1 == 1) {
                if (var15.field2882) {
                    class52.field1241[arg4][arg5][arg3 + 1] = 50;
                    class52.field1241[arg4][arg5 + 1][arg3 + 1] = 50;
                }
                if (var15.field2854) {
                    class132.field3199[arg4][arg5][arg3 + 1] = class44.method346(class132.field3199[arg4][arg5][arg3 + 1], 1170);
                }
            } else if (arg1 == 2) {
                if (var15.field2882) {
                    class52.field1241[arg4][arg5 + 1][arg3] = 50;
                    class52.field1241[arg4][arg5 + 1][arg3 + 1] = 50;
                }
                if (var15.field2854) {
                    class132.field3199[arg4][arg5 + 1][arg3] = class44.method346(class132.field3199[arg4][arg5 + 1][arg3], 585);
                }
            } else if (arg1 == 3) {
                if (var15.field2882) {
                    class52.field1241[arg4][arg5][arg3] = 50;
                    class52.field1241[arg4][arg5 + 1][arg3] = 50;
                }
                if (var15.field2854) {
                    class132.field3199[arg4][arg5][arg3] = class44.method346(class132.field3199[arg4][arg5][arg3], 1170);
                }
            }
            if (var15.field2834 != 0 && arg6 != null) {
                arg6.method811(true, arg7, var15.field2862, arg5, arg3, arg1);
            }
            if (var15.field2855 != 16) {
                arg0.method1025(arg4, arg5, arg3, var15.field2855);
            }
        } else if (arg7 == 1) {
            class143 var20;
            if (var15.field2874 == -1 && var15.field2825 == null) {
                var20 = var15.method952(var10, var9, (byte) -51, var11, var12, 1, arg1);
            } else {
                var20 = new class35(arg8, 1, arg1, var9, var11, var10, var12, var15.field2874, true, null);
            }
            arg0.method1001(arg4, arg5, arg3, var13, var20, null, class131.field3156[arg1], 0, var14, var16);
            if (var15.field2882) {
                if (arg1 == 0) {
                    class52.field1241[arg4][arg5][arg3 + 1] = 50;
                } else if (arg1 == 1) {
                    class52.field1241[arg4][arg5 + 1][arg3 + 1] = 50;
                } else if (arg1 == 2) {
                    class52.field1241[arg4][arg5 + 1][arg3] = 50;
                } else if (arg1 == 3) {
                    class52.field1241[arg4][arg5][arg3] = 50;
                }
            }
            if (var15.field2834 != 0 && arg6 != null) {
                arg6.method811(true, arg7, var15.field2862, arg5, arg3, arg1);
            }
        } else if (arg7 == 2) {
            int var21 = arg1 + 1 & 0x3;
            class143 var22;
            class143 var23;
            if (var15.field2874 == -1 && var15.field2825 == null) {
                var22 = var15.method952(var10, var9, (byte) -51, var11, var12, 2, arg1 + 4);
                var23 = var15.method952(var10, var9, (byte) -51, var11, var12, 2, var21);
            } else {
                var22 = new class35(arg8, 2, arg1 + 4, var9, var11, var10, var12, var15.field2874, true, null);
                var23 = new class35(arg8, 2, var21, var9, var11, var10, var12, var15.field2874, true, null);
            }
            arg0.method1001(arg4, arg5, arg3, var13, var22, var23, class117.field2808[arg1], class117.field2808[var21], var14, var16);
            if (var15.field2854) {
                if (arg1 == 0) {
                    class132.field3199[arg4][arg5][arg3] = class44.method346(class132.field3199[arg4][arg5][arg3], 585);
                    class132.field3199[arg4][arg5][arg3 + 1] = class44.method346(class132.field3199[arg4][arg5][arg3 + 1], 1170);
                } else if (arg1 == 1) {
                    class132.field3199[arg4][arg5][arg3 + 1] = class44.method346(class132.field3199[arg4][arg5][arg3 + 1], 1170);
                    class132.field3199[arg4][arg5 + 1][arg3] = class44.method346(class132.field3199[arg4][arg5 + 1][arg3], 585);
                } else if (arg1 == 2) {
                    class132.field3199[arg4][arg5 + 1][arg3] = class44.method346(class132.field3199[arg4][arg5 + 1][arg3], 585);
                    class132.field3199[arg4][arg5][arg3] = class44.method346(class132.field3199[arg4][arg5][arg3], 1170);
                } else if (arg1 == 3) {
                    class132.field3199[arg4][arg5][arg3] = class44.method346(class132.field3199[arg4][arg5][arg3], 1170);
                    class132.field3199[arg4][arg5][arg3] = class44.method346(class132.field3199[arg4][arg5][arg3], 585);
                }
            }
            if (var15.field2834 != 0 && arg6 != null) {
                arg6.method811(true, arg7, var15.field2862, arg5, arg3, arg1);
            }
            if (var15.field2855 != 16) {
                arg0.method1025(arg4, arg5, arg3, var15.field2855);
            }
        } else if (arg7 == 3) {
            class143 var24;
            if (var15.field2874 == -1 && var15.field2825 == null) {
                var24 = var15.method952(var10, var9, (byte) -51, var11, var12, 3, arg1);
            } else {
                var24 = new class35(arg8, 3, arg1, var9, var11, var10, var12, var15.field2874, true, null);
            }
            arg0.method1001(arg4, arg5, arg3, var13, var24, null, class131.field3156[arg1], 0, var14, var16);
            if (var15.field2882) {
                if (arg1 == 0) {
                    class52.field1241[arg4][arg5][arg3 + 1] = 50;
                } else if (arg1 == 1) {
                    class52.field1241[arg4][arg5 + 1][arg3 + 1] = 50;
                } else if (arg1 == 2) {
                    class52.field1241[arg4][arg5 + 1][arg3] = 50;
                } else if (arg1 == 3) {
                    class52.field1241[arg4][arg5][arg3] = 50;
                }
            }
            if (var15.field2834 != 0 && arg6 != null) {
                arg6.method811(true, arg7, var15.field2862, arg5, arg3, arg1);
            }
        } else if (arg7 == 9) {
            class143 var25;
            if (var15.field2874 == -1 && var15.field2825 == null) {
                var25 = var15.method952(var10, var9, (byte) -51, var11, var12, arg7, arg1);
            } else {
                var25 = new class35(arg8, arg7, arg1, var9, var11, var10, var12, var15.field2874, true, null);
            }
            arg0.method1005(arg4, arg5, arg3, var13, 1, 1, var25, 0, var14, var16);
            if (var15.field2834 != 0 && arg6 != null) {
                arg6.method806(arg1, var15.field2860, arg3, 126, var15.field2890, arg5, var15.field2862);
            }
        } else {
            if (var15.field2838) {
                if (arg1 == 1) {
                    int var29 = var12;
                    var12 = var10;
                    var10 = var11;
                    var11 = var9;
                    var9 = var29;
                } else if (arg1 == 2) {
                    int var27 = var12;
                    var12 = var11;
                    var11 = var27;
                    int var28 = var10;
                    var10 = var9;
                    var9 = var28;
                } else if (arg1 == 3) {
                    int var26 = var12;
                    var12 = var9;
                    var9 = var11;
                    var11 = var10;
                    var10 = var26;
                }
            }
            if (arg7 == 4) {
                class143 var30;
                if (var15.field2874 == -1 && var15.field2825 == null) {
                    var30 = var15.method952(var10, var9, (byte) -51, var11, var12, 4, 0);
                } else {
                    var30 = new class35(arg8, 4, 0, var9, var11, var10, var12, var15.field2874, true, null);
                }
                arg0.method999(arg4, arg5, arg3, var13, var30, class117.field2808[arg1], arg1 * 512, 0, 0, var14, var16);
            } else {
                if (arg2 >= -64) {
                    field2508 = 112;
                }
                if (arg7 == 5) {
                    int var31 = 16;
                    int var32 = arg0.method1019(arg4, arg5, arg3);
                    if (var32 != 0) {
                        var31 = class2.method9(false, var32 >> 14 & 0x7FFF).field2855;
                    }
                    class143 var33;
                    if (var15.field2874 == -1 && var15.field2825 == null) {
                        var33 = var15.method952(var10, var9, (byte) -51, var11, var12, 4, 0);
                    } else {
                        var33 = new class35(arg8, 4, 0, var9, var11, var10, var12, var15.field2874, true, null);
                    }
                    arg0.method999(arg4, arg5, arg3, var13, var33, class117.field2808[arg1], arg1 * 512, class84.field1994[arg1] * var31, class106.field2562[arg1] * var31, var14, var16);
                } else if (arg7 == 6) {
                    class143 var34;
                    if (var15.field2874 == -1 && var15.field2825 == null) {
                        var34 = var15.method952(var10, var9, (byte) -51, var11, var12, 4, 0);
                    } else {
                        var34 = new class35(arg8, 4, 0, var9, var11, var10, var12, var15.field2874, true, null);
                    }
                    arg0.method999(arg4, arg5, arg3, var13, var34, 256, arg1, 0, 0, var14, var16);
                } else if (arg7 == 7) {
                    class143 var35;
                    if (var15.field2874 == -1 && var15.field2825 == null) {
                        var35 = var15.method952(var10, var9, (byte) -51, var11, var12, 4, 0);
                    } else {
                        var35 = new class35(arg8, 4, 0, var9, var11, var10, var12, var15.field2874, true, null);
                    }
                    arg0.method999(arg4, arg5, arg3, var13, var35, 512, arg1, 0, 0, var14, var16);
                } else if (arg7 == 8) {
                    class143 var36;
                    if (var15.field2874 == -1 && var15.field2825 == null) {
                        var36 = var15.method952(var10, var9, (byte) -51, var11, var12, 4, 0);
                    } else {
                        var36 = new class35(arg8, 4, 0, var9, var11, var10, var12, var15.field2874, true, null);
                    }
                    arg0.method999(arg4, arg5, arg3, var13, var36, 768, arg1, 0, 0, var14, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static void method850(int arg0) {
        field2502 = null;
        field2501 = null;
        field2509 = null;
        field2504 = null;
        int var1 = 27 / ((arg0 + 69) / 52);
        field2513 = null;
        field2514 = null;
        field2515 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static final void method851(byte arg0) {
        field2512++;
        if (arg0 > -57) {
            method849(null, 117, (byte) 38, 12, 67, 3, null, 37, -77);
        }
        for (class58 var1 = (class58) class41.field955.method182((byte) 50); var1 != null; var1 = (class58) class41.field955.method181((byte) 65)) {
            if (var1.field1439 != null) {
                var1.method440(-5);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Lfb;")
    public static final class38 method852(int arg0, int arg1) {
        field2505++;
        class38 var2 = (class38) class3.field86.method239(9325, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class87.field2079.method324(arg0, arg1, 8);
        class38 var4 = new class38();
        if (var3 != null) {
            var4.method289(new class59(var3), false);
        }
        class3.field86.method241(var4, arg0 + arg0, (long) arg1);
        return var4;
    }
}
