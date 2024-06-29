import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class36 extends class88 {

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field496 = 0;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "Lhj;")
    public static class69 field505 = class181.method1318("Bitte entfernen Sie ", (byte) -108);

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "J")
    public static long field498 = 0L;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "Lsd;")
    public static class42 field508;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "Ljava/lang/String;")
    public static String field507;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "[I")
    public static int[] field497;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIZIII)V")
    public static final void method192(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field503++;
        long var6 = class188.method1367(arg0, arg5, arg4);
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x36EF29) >> 20;
            int var9 = ((int) var6 & 0x7FFD8) >> 14;
            int var10 = arg3;
            if (var6 > 0L) {
                var10 = arg1;
            }
            int[] var11 = class15.field201;
            int var12 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            int var13 = arg5 * 4 + ((103 - arg4) * 512 * 4) + 24624;
            class12 var14 = class145.method1102(var12, 0);
            if (var14.field168 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var13] = var10;
                        var11[var13 + 512] = var10;
                        var11[var13 + 1024] = var10;
                        var11[var13 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var13] = var10;
                        var11[var13 + 1] = var10;
                        var11[var13 + 2] = var10;
                        var11[var13 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var13 + 3] = var10;
                        var11[var13 + 3 + 512] = var10;
                        var11[var13 + 1024 + 3] = var10;
                        var11[var13 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var13 + 1536] = var10;
                        var11[var13 + 1537] = var10;
                        var11[var13 + 1536 + 2] = var10;
                        var11[var13 + 1539] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var13] = var10;
                    } else if (var8 == 1) {
                        var11[var13 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var13 + 1539] = var10;
                    } else if (var8 == 3) {
                        var11[var13 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var13] = var10;
                        var11[var13 + 512] = var10;
                        var11[var13 + 1024] = var10;
                        var11[var13 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var13] = var10;
                        var11[var13 + 1] = var10;
                        var11[var13 + 2] = var10;
                        var11[var13 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var13 + 3] = var10;
                        var11[var13 + 515] = var10;
                        var11[var13 + 3 + 1024] = var10;
                        var11[var13 + 3 + 1536] = var10;
                    } else if (var8 == 2) {
                        var11[var13 + 1536] = var10;
                        var11[var13 + 1 + 1536] = var10;
                        var11[var13 + 1536 + 2] = var10;
                        var11[var13 + 1536 + 3] = var10;
                    }
                }
            } else {
                class121 var15 = null;
                if (!var14.field111) {
                    var15 = class132.field2457[var14.field168];
                } else if (var8 == 0) {
                    var15 = class132.field2457[var14.field168];
                } else if (var8 == 1) {
                    var15 = class235.field4286[var14.field168];
                } else if (var8 == 2) {
                    var15 = class126.field2312[var14.field168];
                } else if (var8 == 3) {
                    var15 = class272.field4821[var14.field168];
                }
                if (var15 != null) {
                    int var16 = (var14.field127 * 4 - var15.field699) / 2;
                    int var17 = (var14.field153 * 4 - var15.field691) / 2;
                    var15.method270(arg5 * 4 + var17 + 48, (-var14.field127 + 104 + -arg4) * 4 + var16 + 48);
                }
            }
        }
        long var18 = class119.method865(arg0, arg5, arg4);
        if (arg2) {
            method192(-29, 78, false, 110, -96, -12);
        }
        if (var18 != 0L) {
            int var20 = (int) var18 >> 14 & 0x1F;
            int var21 = ((int) var18 & 0x3A2C5C) >> 20;
            int var22 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            class12 var23 = class145.method1102(var22, 0);
            if (var23.field168 != -1) {
                class121 var24 = null;
                if (!var23.field111) {
                    var24 = class132.field2457[var23.field168];
                } else if (var21 == 0) {
                    var24 = class132.field2457[var23.field168];
                } else if (var21 == 1) {
                    var24 = class235.field4286[var23.field168];
                } else if (var21 == 2) {
                    var24 = class126.field2312[var23.field168];
                } else if (var21 == 3) {
                    var24 = class272.field4821[var23.field168];
                }
                if (var24 != null) {
                    int var25 = (var23.field153 * 4 - var24.field691) / 2;
                    int var26 = (var23.field127 * 4 - var24.field699) / 2;
                    var24.method270(arg5 * 4 + var25 + 48, (-var23.field127 + -arg4 + 104) * 4 + (48 - -var26));
                }
            } else if (var20 == 9) {
                int[] var27 = class15.field201;
                int var28 = 15658734;
                int var29 = (103 - arg4) * 512 * 4 + arg5 * 4 + 24624;
                if (var18 > 0L) {
                    var28 = 15597568;
                }
                if (var21 == 0 || var21 == 2) {
                    var27[var29 + 1536] = var28;
                    var27[var29 + 1024 + 1] = var28;
                    var27[var29 + 512 + 2] = var28;
                    var27[var29 + 3] = var28;
                } else {
                    var27[var29] = var28;
                    var27[var29 + 513] = var28;
                    var27[var29 + 1024 + 2] = var28;
                    var27[var29 + 1536 + 3] = var28;
                }
            }
        }
        long var30 = class73.method509(arg0, arg5, arg4);
        if (var30 == 0L) {
            return;
        }
        int var32 = (int) var30 >> 20 & 0x3;
        int var33 = Integer.MAX_VALUE & (int) (var30 >>> 32);
        class12 var34 = class145.method1102(var33, 0);
        if (var34.field168 == -1) {
            return;
        }
        class121 var35 = null;
        if (!var34.field111) {
            var35 = class132.field2457[var34.field168];
        } else if (var32 == 0) {
            var35 = class132.field2457[var34.field168];
        } else if (var32 == 1) {
            var35 = class235.field4286[var34.field168];
        } else if (var32 == 2) {
            var35 = class126.field2312[var34.field168];
        } else if (var32 == 3) {
            var35 = class272.field4821[var34.field168];
        }
        if (var35 != null) {
            int var36 = (var34.field153 * 4 - var35.field691) / 2;
            int var37 = (var34.field127 * 4 - var35.field699) / 2;
            var35.method270((arg5 * 4) + var36 + 48, (104 - var34.field127 + -arg4) * 4 + var37 + 48);
            return;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BIIII)V")
    public static final void method193(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class175 var5 = (class175) class59.field1067.method1724(255); var5 != null; var5 = (class175) class59.field1067.method1726(108)) {
            class48.method271(arg3, arg1, arg4, 27571, arg2, var5);
        }
        int var6 = 60 % ((22 - arg0) / 63);
        for (class175 var7 = (class175) class94.field1751.method1724(255); var7 != null; var7 = (class175) class94.field1751.method1726(100)) {
            byte var11 = 1;
            if (var7.field3191.field3996 == var7.field3191.field3982) {
                var11 = 0;
            } else if (var7.field3191.field3996 == var7.field3191.field3988) {
                var11 = 2;
            }
            if (var7.field3202 != var11) {
                int var12 = class227.method1623(-126, var7.field3191);
                if (var7.field3207 != var12) {
                    if (var7.field3197 != null) {
                        class54.field959.method1788(var7.field3197);
                        var7.field3197 = null;
                    }
                    var7.field3207 = var12;
                }
                var7.field3202 = var11;
            }
            var7.field3206 = var7.field3191.field3985;
            var7.field3195 = var7.field3191.field3985 + var7.field3191.method813(15963) * 64;
            var7.field3182 = var7.field3191.field4005;
            var7.field3205 = var7.field3191.field4005 + var7.field3191.method813(15963) * 64;
            class48.method271(arg3, arg1, arg4, 27571, arg2, var7);
        }
        field494++;
        for (class175 var8 = (class175) class208.field3780.method768((byte) 99); var8 != null; var8 = (class175) class208.field3780.method760(-15725)) {
            byte var9 = 1;
            if (var8.field3181.field3996 == var8.field3181.field3982) {
                var9 = 0;
            } else if (var8.field3181.field3996 == var8.field3181.field3988) {
                var9 = 2;
            }
            if (var8.field3202 != var9) {
                int var10 = class189.method1375(false, var8.field3181);
                if (var8.field3207 != var10) {
                    if (var8.field3197 != null) {
                        class54.field959.method1788(var8.field3197);
                        var8.field3197 = null;
                    }
                    var8.field3207 = var10;
                }
                var8.field3202 = var9;
            }
            var8.field3206 = var8.field3181.field3985;
            var8.field3195 = var8.field3181.field3985 + (var8.field3181.method813(15963) * 64);
            var8.field3182 = var8.field3181.field4005;
            var8.field3205 = var8.field3181.field4005 + var8.field3181.method813(15963) * 64;
            class48.method271(arg3, arg1, arg4, 27571, arg2, var8);
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public static void method194(int arg0) {
        field505 = null;
        if (arg0 != 2) {
            method193((byte) 88, -120, -108, 1, -17);
        }
        field508 = null;
        field507 = null;
        field497 = null;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
    public static final void method195(int arg0) {
        class75.field1469.method1709((byte) -87);
        class11.field96.method1709((byte) -54);
        field504++;
        class76.field1490.method1709((byte) -78);
        if (arg0 != 5) {
            method197(63, (class50) null, 33, -58);
        }
        class258.field4631.method1709((byte) -105);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lbb;ILbb;)V")
    public static final void method196(class88 arg0, int arg1, class88 arg2) {
        if (arg1 != 1) {
            method192(53, 87, true, 13, 114, -48);
        }
        if (arg0.field1676 != null) {
            arg0.method632(-8296);
        }
        arg0.field1677 = arg2;
        arg0.field1676 = arg2.field1676;
        field499++;
        arg0.field1676.field1677 = arg0;
        arg0.field1677.field1676 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILtk;II)V")
    public static final void method197(int arg0, class50 arg1, int arg2, int arg3) {
        field493++;
        if (arg1.field863 == 1) {
            class69.method492(102, arg1.field773, 0L, class209.field3816, arg1.field850, 0, (short) 5);
            class252.field4551++;
        }
        if (arg1.field863 == 2 && !class65.field1254) {
            class69 var4 = class261.method1795(-15933, arg1);
            if (var4 != null) {
                class272.field4820++;
                class69.method492(98, arg1.field773, 0L, class9.method42(-86, new class69[] { class34.field474, arg1.field809 }), var4, -1, (short) 33);
            }
        }
        if (arg1.field863 == 3) {
            class69.method492(122, arg1.field773, 0L, class209.field3816, class239.field4386, 0, (short) 40);
            class255.field4595++;
        }
        if (arg1.field863 == 4) {
            class69.method492(119, arg1.field773, 0L, class209.field3816, arg1.field850, 0, (short) 9);
            class115.field2196++;
        }
        if (arg1.field863 == 5) {
            class69.method492(118, arg1.field773, 0L, class209.field3816, arg1.field850, 0, (short) 59);
            class197.field3583++;
        }
        if (arg1.field863 == 6 && class193.field3516 == null) {
            class221.field3966++;
            class69.method492(118, arg1.field773, 0L, class209.field3816, arg1.field850, -1, (short) 7);
        }
        if (arg1.field884 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg1.field739; var6++) {
                for (int var7 = 0; var7 < arg1.field873; var7++) {
                    int var8 = (arg1.field837 + 32) * var7;
                    int var9 = (arg1.field872 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg1.field764[var5];
                        var8 += arg1.field745[var5];
                    }
                    if (var8 <= arg2 && var9 <= arg3 && (var8 + 32) > arg2 && (var9 + 32) > arg3) {
                        class193.field3523 = var5;
                        class108.field2075 = arg1;
                        if (arg1.field851[var5] > 0) {
                            class205 var10 = class83.method585(arg1.field851[var5] - 1, -1);
                            if (class144.field2680 == 1 && class97.method714(92, client.method1141(arg1))) {
                                if (class266.field4734 != arg1.field773 || class165.field3045 != var5) {
                                    class69.method492(90, arg1.field773, (long) var10.field3695, class9.method42(73, new class69[] { class223.field4072, class157.field2922, var10.field3741 }), class228.field4165, var5, (short) 2);
                                    class179.field3258++;
                                }
                            } else if (!class65.field1254 || !class97.method714(121, client.method1141(arg1))) {
                                class155.field2900++;
                                class69[] var11 = var10.field3718;
                                if (class147.field2735) {
                                    var11 = class170.method1248(var11, (byte) 121);
                                }
                                if (class97.method714(96, client.method1141(arg1))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class189.field3429++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 21;
                                            } else {
                                                var13 = 37;
                                            }
                                            class69.method492(126, arg1.field773, (long) var10.field3695, class9.method42(93, new class69[] { class46.field664, var10.field3741 }), var11[var12], var5, var13);
                                        } else if (var12 == 4) {
                                            class266.field4727++;
                                            class69.method492(114, arg1.field773, (long) var10.field3695, class9.method42(-77, new class69[] { class46.field664, var10.field3741 }), class99.field1877, var5, (short) 37);
                                        }
                                    }
                                }
                                if (class172.method1262((byte) -45, client.method1141(arg1))) {
                                    class165.field3037++;
                                    class69.method492(110, arg1.field773, (long) var10.field3695, class9.method42(99, new class69[] { class46.field664, var10.field3741 }), class228.field4165, var5, (short) 44);
                                }
                                if (class97.method714(110, client.method1141(arg1)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class263.field4681++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 43;
                                            }
                                            if (var14 == 1) {
                                                var15 = 45;
                                            }
                                            if (var14 == 2) {
                                                var15 = 39;
                                            }
                                            class69.method492(117, arg1.field773, (long) var10.field3695, class9.method42(-81, new class69[] { class46.field664, var10.field3741 }), var11[var14], var5, var15);
                                        }
                                    }
                                }
                                class69[] var16 = arg1.field844;
                                if (class147.field2735) {
                                    var16 = class170.method1248(var16, (byte) 78);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class69.field1310++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 57;
                                            }
                                            if (var17 == 1) {
                                                var18 = 47;
                                            }
                                            if (var17 == 2) {
                                                var18 = 22;
                                            }
                                            if (var17 == 3) {
                                                var18 = 34;
                                            }
                                            if (var17 == 4) {
                                                var18 = 18;
                                            }
                                            class69.method492(115, arg1.field773, (long) var10.field3695, class9.method42(-78, new class69[] { class46.field664, var10.field3741 }), var16[var17], var5, var18);
                                        }
                                    }
                                }
                                class69.method492(104, arg1.field773, (long) var10.field3695, class9.method42(-81, new class69[] { class46.field664, var10.field3741 }), class73.field1406, var5, (short) 1003);
                            } else if ((class149.field2769 & 0x10) == 16) {
                                class69.method492(114, arg1.field773, (long) var10.field3695, class9.method42(-110, new class69[] { class66.field1279, class157.field2922, var10.field3741 }), class200.field3624, var5, (short) 23);
                                class163.field3012++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg1.field763) {
            if (!class65.field1254) {
                for (int var19 = 9; var19 >= 5; var19--) {
                    class69 var23 = class227.method1621(false, arg1, var19);
                    if (var23 != null) {
                        class69.method492(115, arg1.field773, (long) (var19 + 1), arg1.field853, var23, arg1.field735, (short) 1002);
                        class130.field2424++;
                    }
                }
                class69 var20 = class261.method1795(-15933, arg1);
                if (var20 != null) {
                    class69.method492(107, arg1.field773, 0L, arg1.field853, var20, arg1.field735, (short) 33);
                    class272.field4820++;
                }
                for (int var21 = 4; var21 >= 0; var21--) {
                    class69 var22 = class227.method1621(false, arg1, var21);
                    if (var22 != null) {
                        class130.field2424++;
                        class69.method492(116, arg1.field773, (long) (var21 + 1), arg1.field853, var22, arg1.field735, (short) 12);
                    }
                }
                if (class152.method1153(client.method1141(arg1), (byte) -36)) {
                    class221.field3966++;
                    class69.method492(112, arg1.field773, 0L, class209.field3816, class215.field3888, arg1.field735, (short) 7);
                }
            } else if (class159.method1195(client.method1141(arg1), true) && (class149.field2769 & 0x20) == 32) {
                class69.method492(111, arg1.field773, 0L, class9.method42(66, new class69[] { class66.field1279, class233.field4264, arg1.field853 }), class200.field3624, arg1.field735, (short) 29);
                class62.field1121++;
            }
        }
        int var24 = 71 % ((-arg0 - 32) / 37);
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(II)V")
    public class36(int arg0, int arg1) {
        this.field502 = arg0;
        this.field495 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)V")
    public static final void method198(boolean arg0) {
        class204.method1478(class26.field370, false);
        field500++;
        class33.field470++;
        if (class262.field4669 && class72.field1395) {
            int var1 = class205.field3681;
            if (arg0) {
                int var2 = class72.field1398;
                int var3 = var1 - class115.field2202;
                int var4 = var2 - class144.field2681;
                if (var4 < class217.field3920) {
                    var4 = class217.field3920;
                }
                if (var3 < class63.field1231) {
                    var3 = class63.field1231;
                }
                if ((class26.field370.field798 + var3) > (class63.field1231 + class61.field1118.field798)) {
                    var3 = class61.field1118.field798 + class63.field1231 - class26.field370.field798;
                }
                int var5 = var3 - class168.field3089;
                int var6 = var3 + class61.field1118.field829 - class63.field1231;
                int var7 = class26.field370.field887;
                if ((class26.field370.field727 + var4) > (class217.field3920 + class61.field1118.field727)) {
                    var4 = class217.field3920 + class61.field1118.field727 - class26.field370.field727;
                }
                int var8 = var4 + class61.field1118.field792 - class217.field3920;
                int var9 = var4 - class65.field1259;
                if (class33.field470 > class26.field370.field859 && (var7 < var5 || var5 < -var7 || var7 < var9 || -var7 > var9)) {
                    class166.field3068 = true;
                }
                if (class26.field370.field807 != null && class166.field3068) {
                    class58 var10 = new class58();
                    var10.field1050 = class26.field370.field807;
                    var10.field1048 = class26.field370;
                    var10.field1053 = var6;
                    var10.field1044 = var8;
                    class179.method1304((byte) -116, var10);
                }
                if (class206.field3763 == 0) {
                    if (class166.field3068) {
                        if (class26.field370.field741 != null) {
                            class58 var11 = new class58();
                            var11.field1051 = class166.field3077;
                            var11.field1053 = var6;
                            var11.field1048 = class26.field370;
                            var11.field1044 = var8;
                            var11.field1050 = class26.field370.field741;
                            class179.method1304((byte) -97, var11);
                        }
                        if (class166.field3077 != null && client.method1138(class26.field370) != null) {
                            class48.field692.method301(29, -104);
                            class48.field692.method948(class26.field370.field773, 119);
                            class233.field4250++;
                            class48.field692.method919(class166.field3077.field735, -3);
                            class48.field692.method919(class26.field370.field735, -3);
                            class48.field692.method938(-31075, class166.field3077.field773);
                        }
                    } else if ((class33.field461 == 1 || class97.method716(-1003, class177.field3218 - 1)) && class177.field3218 > 2) {
                        class47.method265((byte) -36);
                    } else if (class177.field3218 > 0) {
                        class69.method493(-1);
                    }
                    class26.field370 = null;
                }
            }
        } else if (class33.field470 > 1) {
            class26.field370 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIILsf;II)Lsf;")
    public static final class92 method199(int arg0, int arg1, int arg2, int arg3, class92 arg4, int arg5, int arg6) {
        field506++;
        long var7 = (long) arg6;
        class92 var9 = (class92) class59.field1072.method1714(var7, (byte) -128);
        if (arg1 != 47) {
            field507 = null;
        }
        if (var9 == null) {
            class74 var10 = class74.method523(class120.field2268, arg6, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method526(64, 768, -50, -10, -50);
            class59.field1072.method1705((byte) 124, var9, var7);
        }
        int var11 = arg4.method670();
        int var12 = arg4.method660();
        int var13 = arg4.method657();
        int var14 = arg4.method665();
        class92 var15 = var9.method654(true, true);
        if (arg2 != 0) {
            var15.method667(arg2);
        }
        class238 var16 = (class238) var15;
        if (class156.method1179(arg5 + var11, arg0 - -var13, arg1 + 56, class52.field927) != arg3 || arg3 != class156.method1179(arg5 + var12, arg0 - -var14, arg1 + 31, class52.field927)) {
            for (int var17 = 0; var17 < var16.field4316; var17++) {
                var16.field4323[var17] += class156.method1179(var16.field4344[var17] + arg5, var16.field4324[var17] + arg0, arg1 - 15, class52.field927) - arg3;
            }
            var16.field4328 = false;
        }
        return var15;
    }
}
