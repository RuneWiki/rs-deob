import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class65 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "[S")
    public short[] field1068;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "[Lda;")
    public class275[] field1061;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "[I")
    public int[] field1063;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "[S")
    public short[] field1069;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "[B")
    public byte[] field1072;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "[I")
    public static int[] field1067 = new int[2000];

    @OriginalMember(owner = "client!d", name = "m", descriptor = "S")
    public static short field1071 = 1;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field1074 = 0;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "[Z")
    public static boolean[] field1065 = new boolean[100];

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Lda;")
    public static class275 field1077 = class255.method1672(93, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!d", name = "t", descriptor = "Lda;")
    public static class275 field1078 = class255.method1672(124, "floorshadows");

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Lda;")
    public static class275 field1073 = class255.method1672(104, "Null");

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Lma;")
    public static class105 field1064;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIBIII)V")
    public static final void method438(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1062++;
        if (arg2 != -55) {
            method438(12, 15, (byte) -65, 39, -18, 41);
        }
        long var6 = class181.method1216(arg0, arg4, arg1);
        if (var6 != 0L) {
            int var8 = (int) var6 >> 20 & 0x3;
            int[] var9 = class47.field786;
            int var10 = arg3;
            if (var6 > 0L) {
                var10 = arg5;
            }
            int var11 = (103 - arg1) * 512 * 4 + arg4 * 4 + 24624;
            int var12 = ((int) var6 & 0x7E3CF) >> 14;
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class34 var14 = class146.method1040(69, var13);
            if (var14.field499 == -1) {
                if (var12 == 0 || var12 == 2) {
                    if (var8 == 0) {
                        var9[var11] = var10;
                        var9[var11 + 512] = var10;
                        var9[var11 + 1024] = var10;
                        var9[var11 + 1536] = var10;
                    } else if (var8 == 1) {
                        var9[var11] = var10;
                        var9[var11 + 1] = var10;
                        var9[var11 + 2] = var10;
                        var9[var11 + 3] = var10;
                    } else if (var8 == 2) {
                        var9[var11 + 3] = var10;
                        var9[var11 + 3 + 512] = var10;
                        var9[var11 + 3 + 1024] = var10;
                        var9[var11 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var9[var11 + 1536] = var10;
                        var9[var11 + 1536 + 1] = var10;
                        var9[var11 + 1536 + 2] = var10;
                        var9[var11 + 1539] = var10;
                    }
                }
                if (var12 == 3) {
                    if (var8 == 0) {
                        var9[var11] = var10;
                    } else if (var8 == 1) {
                        var9[var11 + 3] = var10;
                    } else if (var8 == 2) {
                        var9[var11 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var9[var11 + 1536] = var10;
                    }
                }
                if (var12 == 2) {
                    if (var8 == 3) {
                        var9[var11] = var10;
                        var9[var11 + 512] = var10;
                        var9[var11 + 1024] = var10;
                        var9[var11 + 1536] = var10;
                    } else if (var8 == 0) {
                        var9[var11] = var10;
                        var9[var11 + 1] = var10;
                        var9[var11 + 2] = var10;
                        var9[var11 + 3] = var10;
                    } else if (var8 == 1) {
                        var9[var11 + 3] = var10;
                        var9[var11 + 512 + 3] = var10;
                        var9[var11 + 1024 + 3] = var10;
                        var9[var11 + 1536 + 3] = var10;
                    } else if (var8 == 2) {
                        var9[var11 + 1536] = var10;
                        var9[var11 + 1536 + 1] = var10;
                        var9[var11 + 1538] = var10;
                        var9[var11 + 1536 + 3] = var10;
                    }
                }
            } else {
                class20 var15 = null;
                if (!var14.field496) {
                    var15 = class95.field1619[var14.field499];
                } else if (var8 == 0) {
                    var15 = class95.field1619[var14.field499];
                } else if (var8 == 1) {
                    var15 = class16.field244[var14.field499];
                } else if (var8 == 2) {
                    var15 = class221.field3754[var14.field499];
                } else if (var8 == 3) {
                    var15 = class66.field1082[var14.field499];
                }
                if (var15 != null) {
                    int var16 = (var14.field559 * 4 - var15.field210) / 2;
                    int var17 = (var14.field526 * 4 - var15.field209) / 2;
                    var15.method62(arg4 * 4 + var16 + 48, 48 - -((104 - arg1 + -var14.field526) * 4) + var17);
                }
            }
        }
        long var18 = class110.method814(arg0, arg4, arg1);
        if (var18 != 0L) {
            int var20 = ((int) var18 & 0x7C761) >> 14;
            int var21 = (int) var18 >> 20 & 0x3;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class34 var23 = class146.method1040(-99, var22);
            if (var23.field499 != -1) {
                class20 var27 = null;
                if (!var23.field496) {
                    var27 = class95.field1619[var23.field499];
                } else if (var21 == 0) {
                    var27 = class95.field1619[var23.field499];
                } else if (var21 == 1) {
                    var27 = class16.field244[var23.field499];
                } else if (var21 == 2) {
                    var27 = class221.field3754[var23.field499];
                } else if (var21 == 3) {
                    var27 = class66.field1082[var23.field499];
                }
                if (var27 != null) {
                    int var28 = (var23.field559 * 4 - var27.field210) / 2;
                    int var29 = (var23.field526 * 4 - var27.field209) / 2;
                    var27.method62(var28 + (arg4 * 4) + 48, 48 - -((-var23.field526 + 104 + -arg1) * 4) + var29);
                }
            } else if (var20 == 9) {
                int var24 = 15658734;
                int[] var25 = class47.field786;
                if (var18 > 0L) {
                    var24 = 15597568;
                }
                int var26 = (103 - arg1) * 4 * 512 + arg4 * 4 + 24624;
                if (var21 == 0 || var21 == 2) {
                    var25[var26 + 1536] = var24;
                    var25[var26 + 1 + 1024] = var24;
                    var25[var26 + 512 + 2] = var24;
                    var25[var26 + 3] = var24;
                } else {
                    var25[var26] = var24;
                    var25[var26 + 513] = var24;
                    var25[var26 + 1024 + 2] = var24;
                    var25[var26 + 1536 + 3] = var24;
                }
            }
        }
        long var30 = class35.method208(arg0, arg4, arg1);
        if (var30 == 0L) {
            return;
        }
        int var32 = (int) var30 >> 20 & 0x3;
        int var33 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
        class34 var34 = class146.method1040(93, var33);
        if (var34.field499 == -1) {
            return;
        }
        class20 var35 = null;
        if (!var34.field496) {
            var35 = class95.field1619[var34.field499];
        } else if (var32 == 0) {
            var35 = class95.field1619[var34.field499];
        } else if (var32 == 1) {
            var35 = class16.field244[var34.field499];
        } else if (var32 == 2) {
            var35 = class221.field3754[var34.field499];
        } else if (var32 == 3) {
            var35 = class66.field1082[var34.field499];
        }
        if (var35 != null) {
            int var36 = (var34.field559 * 4 - var35.field210) / 2;
            int var37 = (var34.field526 * 4 - var35.field209) / 2;
            var35.method62(arg4 * 4 + (var36 + 48), var37 + 48 - -((104 - arg1 + -var34.field526) * 4));
            return;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)Ljg;")
    public static final class37 method439(int arg0, int arg1, int arg2) {
        class3 var3 = class235.field4101[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field29; var4++) {
            class37 var5 = var3.field48[var4];
            if ((var5.field608 >> 29 & 0x3L) == 2L && var5.field616 == arg1 && var5.field617 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method440(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class200.field3415 = arg3;
        class40.field670 = arg0;
        class240.field4220 = arg4;
        class229.field3920 = arg6;
        field1079++;
        class249.field4402 = arg1;
        if (arg5 && class200.field3415 >= 100) {
            class123.field2204 = class40.field670 * 128 + 64;
            class195.field3335 = class229.field3920 * 128 + 64;
            class83.field1349 = class89.method647(class195.field3335, class159.field2790, class123.field2204, 119) - class249.field4402;
        }
        class159.field2789 = 2;
        if (arg2 < 82) {
            method444(-65, 82, 86, (byte[][][]) null, 59, (byte) -48, -114, -89);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
    public final boolean method441(int arg0, int arg1) {
        field1076++;
        if (arg0 != 19332) {
            field1073 = null;
        }
        return (this.field1072[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method442(int arg0) {
        field1077 = null;
        field1073 = null;
        field1078 = null;
        field1067 = null;
        field1064 = null;
        field1065 = null;
        if (arg0 != -3) {
            method439(69, -51, 91);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)I")
    public final int method443(byte arg0, int arg1) {
        field1066++;
        return arg0 == 37 ? this.field1072[arg1] & 0x3 : 12;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method444(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class162.field2832++;
        class30.field460 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class168.field2917; var12 < class221.field3751; var12++) {
            class3[][] var38 = class235.field4101[var12];
            for (int var39 = class227.field3848; var39 < class199.field3406; var39++) {
                for (int var40 = class143.field2506; var40 < class204.field3461; var40++) {
                    class3 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class149.field2594[var39 + class275.field4759 - class87.field1474][var40 + class275.field4759 - class131.field2347] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field35 = true;
                            var41.field47 = true;
                            if (var41.field29 > 0) {
                                var41.field38 = true;
                            } else {
                                var41.field38 = false;
                            }
                            class30.field460++;
                        } else {
                            var41.field35 = false;
                            var41.field47 = false;
                            var41.field49 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field50 != null) {
                                    class139 var42 = var41.field50;
                                    var42.field2444.method1335(128, var42.field2434, var42.field2436, var42.field2436, var42.field2434);
                                    if (var42.field2446 != null) {
                                        var42.field2446.method1335(128, var42.field2434, var42.field2436, var42.field2436, var42.field2434);
                                    }
                                }
                                if (var41.field41 != null) {
                                    class119 var43 = var41.field41;
                                    var43.field2136.method1335(128, var43.field2127, var43.field2137, var43.field2137, var43.field2127);
                                    if (var43.field2135 != null) {
                                        var43.field2135.method1335(128, var43.field2127, var43.field2137, var43.field2137, var43.field2127);
                                    }
                                }
                                if (var41.field39 != null) {
                                    class214 var44 = var41.field39;
                                    var44.field3648.method1335(128, var44.field3649, var44.field3646, var44.field3646, var44.field3649);
                                }
                                if (var41.field48 != null) {
                                    for (int var45 = 0; var45 < var41.field29; var45++) {
                                        class37 var46 = var41.field48[var45];
                                        var46.field612.method1335(128, var46.field617, var46.field610, var46.field616, var46.field604);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class92.field1575 == class187.field3181;
        for (int var14 = class168.field2917; var14 < class221.field3751; var14++) {
            class3[][] var27 = class235.field4101[var14];
            for (int var28 = -class275.field4759; var28 <= 0; var28++) {
                int var29 = class87.field1474 + var28;
                int var30 = class87.field1474 - var28;
                if (var29 >= class227.field3848 || var30 < class199.field3406) {
                    for (int var31 = -class275.field4759; var31 <= 0; var31++) {
                        int var32 = class131.field2347 + var31;
                        int var33 = class131.field2347 - var31;
                        if (var29 >= class227.field3848) {
                            if (var32 >= class143.field2506) {
                                class3 var34 = var27[var29][var32];
                                if (var34 != null && var34.field35) {
                                    class36.method214(var34, true);
                                }
                            }
                            if (var33 < class204.field3461) {
                                class3 var35 = var27[var29][var33];
                                if (var35 != null && var35.field35) {
                                    class36.method214(var35, true);
                                }
                            }
                        }
                        if (var30 < class199.field3406) {
                            if (var32 >= class143.field2506) {
                                class3 var36 = var27[var30][var32];
                                if (var36 != null && var36.field35) {
                                    class36.method214(var36, true);
                                }
                            }
                            if (var33 < class204.field3461) {
                                class3 var37 = var27[var30][var33];
                                if (var37 != null && var37.field35) {
                                    class36.method214(var37, true);
                                }
                            }
                        }
                        if (class30.field460 == 0) {
                            if (!var13) {
                                class69.field1111 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class168.field2917; var15 < class221.field3751; var15++) {
            class3[][] var16 = class235.field4101[var15];
            for (int var17 = -class275.field4759; var17 <= 0; var17++) {
                int var18 = class87.field1474 + var17;
                int var19 = class87.field1474 - var17;
                if (var18 >= class227.field3848 || var19 < class199.field3406) {
                    for (int var20 = -class275.field4759; var20 <= 0; var20++) {
                        int var21 = class131.field2347 + var20;
                        int var22 = class131.field2347 - var20;
                        if (var18 >= class227.field3848) {
                            if (var21 >= class143.field2506) {
                                class3 var23 = var16[var18][var21];
                                if (var23 != null && var23.field35) {
                                    class36.method214(var23, false);
                                }
                            }
                            if (var22 < class204.field3461) {
                                class3 var24 = var16[var18][var22];
                                if (var24 != null && var24.field35) {
                                    class36.method214(var24, false);
                                }
                            }
                        }
                        if (var19 < class199.field3406) {
                            if (var21 >= class143.field2506) {
                                class3 var25 = var16[var19][var21];
                                if (var25 != null && var25.field35) {
                                    class36.method214(var25, false);
                                }
                            }
                            if (var22 < class204.field3461) {
                                class3 var26 = var16[var19][var22];
                                if (var26 != null && var26.field35) {
                                    class36.method214(var26, false);
                                }
                            }
                        }
                        if (class30.field460 == 0) {
                            if (!var13) {
                                class69.field1111 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class69.field1111 = false;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLij;Ljk;I)V")
    public static final void method445(byte arg0, class85 arg1, class58 arg2, int arg3) {
        field1075++;
        class204 var4 = new class204();
        var4.field3460 = arg1.method564((byte) 49);
        var4.field3471 = arg1.method568(19845);
        var4.field3472 = new int[var4.field3460];
        var4.field3469 = new class266[var4.field3460];
        var4.field3463 = new class266[var4.field3460];
        var4.field3467 = new int[var4.field3460];
        if (arg0 <= 107) {
            method445((byte) -38, (class85) null, (class58) null, -60);
        }
        var4.field3462 = new int[var4.field3460];
        var4.field3473 = new byte[var4.field3460][][];
        for (int var5 = 0; var5 < var4.field3460; var5++) {
            try {
                int var6 = arg1.method564((byte) 91);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg1.method599(-1).method1812((byte) -14));
                    String var8 = new String(arg1.method599(-1).method1812((byte) -14));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg1.method568(19845);
                    }
                    var4.field3467[var5] = var6;
                    var4.field3472[var5] = var9;
                    var4.field3463[var5] = arg2.method374(class36.method217(var7, -31992), (byte) -34, var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg1.method599(-1).method1812((byte) -14));
                    String var11 = new String(arg1.method599(-1).method1812((byte) -14));
                    int var12 = arg1.method564((byte) 111);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg1.method599(-1).method1812((byte) -14));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method568(19845);
                            var15[var16] = new byte[var17];
                            arg1.method597(0, false, var17, var15[var16]);
                        }
                    }
                    var4.field3467[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class36.method217(var13[var19], -31992);
                    }
                    var4.field3469[var5] = arg2.method375(var11, var18, -15129, class36.method217(var10, -31992));
                    var4.field3473[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field3462[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3462[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3462[var5] = -3;
            } catch (Exception var23) {
                var4.field3462[var5] = -4;
            } catch (Throwable var24) {
                var4.field3462[var5] = -5;
            }
        }
        class169.field2942.method547(104, var4);
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I)V")
    public class65(int arg0) {
        this.field1059 = arg0;
        this.field1068 = new short[this.field1059];
        this.field1061 = new class275[this.field1059];
        this.field1063 = new int[this.field1059];
        this.field1069 = new short[this.field1059];
        this.field1072 = new byte[this.field1059];
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public static final void method446(int arg0) {
        field1060++;
        class168.method1153((byte) 108);
        if (arg0 > -90) {
            method440(-50, -8, -97, 125, -82, false, 0);
        }
        System.gc();
        class265.method1746((byte) -52, 25);
    }
}
