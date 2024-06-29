import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class242 {

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Ljh;")
    private class462 field3626 = new class462();

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    private int field3627;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    private int field3639;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Lvg;")
    private class56 field3636;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "[I")
    public static int[] field3625 = new int[14];

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(JILjava/lang/Object;)V")
    public final void method1623(long arg0, int arg1, Object arg2) {
        if (arg1 == 17621) {
            this.method1625(arg2, 1, arg0, (byte) -110);
            field3623++;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static final void method1624(int arg0) {
        field3631++;
        class345 var1 = (class345) class277.field4347.method295((byte) 27);
        boolean var2 = class374.field5527 != null || class215.field3254 > 0;
        if (var2) {
            class446.field6627 = 1;
        }
        if (class76.field1289 && class259.field4151.method30(-7951, 81) && class540.field7909 > 2) {
            if (var2) {
                class112.field1674 = (class376) class154.field2370.field690.field1936.field1936;
            } else {
                class154.method1122(var1.method1903(11), 0, var1.method1905(true), (class376) class154.field2370.field690.field1936.field1936);
            }
        } else if (var2) {
            class112.field1674 = (class376) class154.field2370.field690.field1936;
        } else {
            class154.method1122(var1.method1903(11), 0, var1.method1905(true), (class376) class154.field2370.field690.field1936);
        }
        if (arg0 != 5989) {
            method1624(-54);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/Object;IJB)V")
    private final void method1625(Object arg0, int arg1, long arg2, byte arg3) {
        field3634++;
        if (arg1 > this.field3639) {
            throw new IllegalStateException("s>cs");
        }
        this.method1632((byte) -15, arg2);
        this.field3627 -= arg1;
        while (this.field3627 < 0) {
            class484 var8 = (class484) this.field3626.method2828(false);
            this.method1635(var8, (byte) -1);
        }
        class516 var6 = new class516(arg0, arg1);
        this.field3636.method357(var6, 1, arg2);
        this.field3626.method2829(-14061, var6);
        var6.field6926 = 0L;
        int var7 = -38 / ((arg3 - 88) / 38);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(FFBFI)F")
    public static final float method1626(float arg0, float arg1, byte arg2, float arg3, int arg4) {
        if (arg2 > -52) {
            field3625 = null;
        }
        field3624++;
        float[] var5 = class272.field4290[arg4];
        return var5[2] * arg0 + var5[0] * arg1 + var5[1] * arg3;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lbc;Lvt;)V")
    public static final void method1627(class512 arg0, class281 arg1) {
        if (!arg1.field4393) {
            return;
        }
        short var2 = arg1.field4392;
        short var3 = arg1.field4387;
        byte var4 = arg1.field4384;
        byte var5 = arg1.field4373;
        int var6 = (var2 << class295.field4543) + class74.field1258;
        int var7 = (var3 << class295.field4543) + class74.field1258;
        class281[][] var8 = class348.field5192[var4];
        float var9;
        if (class407.field6024 == class288.field4475) {
            class319.field4840.method561(class274.field4306[0].method68(var6, var7), class193.method1334(var2, var3), class509.method3029(var2, var3), class184.method1281(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class319.field4840.method606(3000.0F, var9 * 1.5F);
        if (arg1.field4370) {
            if (class503.field7310) {
                if (var4 > 0) {
                    class281 var10 = class348.field5192[var4 - 1][var2][var3];
                    if (var10 != null && var10.field4393) {
                        return;
                    }
                }
                if (var2 <= class144.field2126 && var2 > class83.field1368) {
                    class281 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field4393 && (var11.field4370 || (arg1.field4369 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class144.field2126 && var2 < class324.field4921 - 1) {
                    class281 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field4393 && (var12.field4370 || (arg1.field4369 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class29.field323 && var3 > class7.field84) {
                    class281 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field4393 && (var13.field4370 || (arg1.field4369 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class29.field323 && var3 < class20.field230 - 1) {
                    class281 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field4393 && (var14.field4370 || (arg1.field4369 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class503.field7310 = true;
            }
            arg1.field4370 = false;
            if (arg1.field4372 != null) {
                class281 var15 = arg1.field4372;
                class319.field4840.method606(3000.0F, (201.5F - (float) (var15.field4373 + 1) * 50.0F) * 1.5F);
                if (!class155.method1129(var15.field4373, var2, var3)) {
                    class407.field6024[var15.field4373].method69(var2, var3);
                }
                class501 var16 = var15.field4380;
                if (var16 != null) {
                    if (class256.field4122) {
                        if ((var16.field7281 & arg1.field4383) == 0) {
                            class43.method281(arg0, var4, var2, var3);
                        } else {
                            class256.method1809(arg0, var16.field7281, var5, var2, var3);
                        }
                        class319.field4840.method519(arg0.field7487, arg0.field7484);
                    }
                    var16.method110(0, class319.field4840);
                }
                for (class21 var17 = var15.field4381; var17 != null; var17 = var17.field235) {
                    class76 var18 = var17.field240;
                    if (var18 != null) {
                        if (class256.field4122) {
                            class43.method281(arg0, var4, var2, var3);
                            class319.field4840.method519(arg0.field7487, arg0.field7484);
                        }
                        var18.method110(0, class319.field4840);
                    }
                }
                class319.field4840.method606(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class155.method1129(var5, var2, var3);
            if (var19) {
                class407.field6024[var5].method69(var2, var3);
                class481 var20 = arg1.field4371;
                if (var20 != null && var20.field7056) {
                    if (var20.field7059) {
                        class319.field4840.method606(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class256.field4122) {
                        class43.method281(arg0, var4, var2, var3);
                        class319.field4840.method519(arg0.field7487, arg0.field7484);
                    }
                    class293 var21 = var20.method110(0, class319.field4840);
                    if (var21 != null) {
                        var21.field4527 = var20;
                        var21.field4531 = var4;
                        var21.field4525 = var2;
                        var21.field4526 = var3;
                        class103.field1592.method1082(var21, 32);
                    }
                    if (var20.field7059) {
                        class319.field4840.method606(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class501 var24 = arg1.field4380;
            class202 var25 = arg1.field4376;
            if (var24 != null || var25 != null) {
                if (class144.field2126 == var2) {
                    var22++;
                } else if (class144.field2126 < var2) {
                    var22 += 2;
                }
                if (class29.field323 == var3) {
                    var22 += 3;
                } else if (class29.field323 > var3) {
                    var22 += 6;
                }
                var23 = class434.field6467[var22];
                arg1.field4383 = class413.field6093[var22];
            }
            if (var24 != null) {
                if ((var24.field7281 & class308.field4703[var22]) == 0) {
                    arg1.field4375 = 0;
                } else if (var24.field7281 == 16) {
                    arg1.field4375 = 3;
                    arg1.field4386 = class122.field1847[var22];
                    arg1.field4382 = (byte) (3 - arg1.field4386);
                } else if (var24.field7281 == 32) {
                    arg1.field4375 = 6;
                    arg1.field4386 = class480.field7046[var22];
                    arg1.field4382 = (byte) (6 - arg1.field4386);
                } else if (var24.field7281 == 64) {
                    arg1.field4375 = 12;
                    arg1.field4386 = class324.field4919[var22];
                    arg1.field4382 = (byte) (12 - arg1.field4386);
                } else {
                    arg1.field4375 = 9;
                    arg1.field4386 = class104.field1606[var22];
                    arg1.field4382 = (byte) (9 - arg1.field4386);
                }
                if ((var24.field7281 & var23) != 0 && !class30.method179(var5, var2, var3, var24.field7281)) {
                    if (class256.field4122) {
                        class43.method281(arg0, var4, var2, var3);
                        class319.field4840.method519(arg0.field7487, arg0.field7484);
                    }
                    class293 var26 = var24.method110(0, class319.field4840);
                    if (var26 != null) {
                        var26.field4527 = var24;
                        var26.field4531 = var4;
                        var26.field4525 = var2;
                        var26.field4526 = var3;
                        class103.field1592.method1082(var26, -3);
                    }
                }
                class501 var27 = arg1.field4390;
                if (var27 != null && (var27.field7281 & var23) != 0 && !class30.method179(var5, var2, var3, var27.field7281)) {
                    if (class256.field4122) {
                        class43.method281(arg0, var4, var2, var3);
                        class319.field4840.method519(arg0.field7487, arg0.field7484);
                    }
                    class293 var28 = var27.method110(0, class319.field4840);
                    if (var28 != null) {
                        var28.field4527 = var27;
                        var28.field4531 = var4;
                        var28.field4525 = var2;
                        var28.field4526 = var3;
                        class103.field1592.method1082(var28, 121);
                    }
                }
            }
            if (var25 != null && !class424.method2641(var5, var2, var3, var25.method1421((byte) -128))) {
                class202 var29 = arg1.field4389;
                class319.field4840.method606(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field3121 & var23) != 0) {
                    if (class256.field4122) {
                        class43.method281(arg0, var4, var2, var3);
                        class319.field4840.method519(arg0.field7487, arg0.field7484);
                    }
                    class293 var30 = var25.method110(0, class319.field4840);
                    if (var30 != null) {
                        var30.field4527 = var25;
                        var30.field4531 = var4;
                        var30.field4525 = var2;
                        var30.field4526 = var3;
                        class103.field1592.method1082(var30, 118);
                    }
                } else if (var25.field3121 == 256) {
                    int var31 = var25.field3126 - class523.field7679;
                    int var32 = var25.field3114 - class452.field6726;
                    int var33 = var25.field3132;
                    int var34;
                    if (var33 == 1 || var33 == 2) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    int var35;
                    if (var33 == 2 || var33 == 3) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    if (class256.field4122) {
                        class43.method281(arg0, var4, var2, var3);
                        class319.field4840.method519(arg0.field7487, arg0.field7484);
                    }
                    if (var35 < var34) {
                        class293 var36 = var25.method110(0, class319.field4840);
                        if (var36 != null) {
                            var36.field4527 = var25;
                            var36.field4531 = var4;
                            var36.field4525 = var2;
                            var36.field4526 = var3;
                            class103.field1592.method1082(var36, -124);
                        }
                    } else if (var29 != null) {
                        class293 var37 = var29.method110(0, class319.field4840);
                        if (var37 != null) {
                            var37.field4527 = var29;
                            var37.field4531 = var4;
                            var37.field4525 = var2;
                            var37.field4526 = var3;
                            class103.field1592.method1082(var37, -1);
                        }
                    }
                }
                class319.field4840.method606(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class481 var38 = arg1.field4371;
                if (var38 != null && !var38.field7056) {
                    if (var38.field7059) {
                        class319.field4840.method606(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class256.field4122) {
                        class43.method281(arg0, var4, var2, var3);
                        class319.field4840.method519(arg0.field7487, arg0.field7484);
                    }
                    class293 var39 = var38.method110(0, class319.field4840);
                    if (var39 != null) {
                        var39.field4527 = var38;
                        var39.field4531 = var4;
                        var39.field4525 = var2;
                        var39.field4526 = var3;
                        class103.field1592.method1082(var39, 101);
                    }
                    if (var38.field7059) {
                        class319.field4840.method606(3000.0F, var9 * 1.5F);
                    }
                }
                class90 var40 = arg1.field4388;
                if (var40 != null && !var40.field1446) {
                    if (class256.field4122) {
                        class43.method281(arg0, var4, var2, var3);
                        class319.field4840.method519(arg0.field7487, arg0.field7484);
                    }
                    class293 var41 = var40.method110(0, class319.field4840);
                    if (var41 != null) {
                        var41.field4527 = var40;
                        var41.field4531 = var4;
                        var41.field4525 = var2;
                        var41.field4526 = var3;
                        class103.field1592.method1082(var41, 104);
                    }
                }
            }
            byte var42 = arg1.field4369;
            if (var42 != 0) {
                if (var2 < class144.field2126 && (var42 & 0x4) != 0) {
                    class281 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field4393) {
                        class33.field398.method278(0, var43);
                    }
                }
                if (var3 < class29.field323 && (var42 & 0x2) != 0) {
                    class281 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field4393) {
                        class33.field398.method278(0, var44);
                    }
                }
                if (var2 > class144.field2126 && (var42 & 0x1) != 0) {
                    class281 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field4393) {
                        class33.field398.method278(0, var45);
                    }
                }
                if (var3 > class29.field323 && (var42 & 0x8) != 0) {
                    class281 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field4393) {
                        class33.field398.method278(0, var46);
                    }
                }
            }
        }
        if (arg1.field4375 != 0) {
            boolean var47 = true;
            for (class21 var48 = arg1.field4381; var48 != null; var48 = var48.field235) {
                if (class532.field7772 != var48.field240.field1285 && (var48.field237 & arg1.field4375) == arg1.field4386) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class501 var49 = arg1.field4380;
                if (!class30.method179(var5, var2, var3, var49.field7281)) {
                    if (class256.field4122) {
                        label682: {
                            if (var49.field7281 >= 16) {
                                int var50 = var2 - class144.field2126;
                                int var51 = var3 - class29.field323;
                                if (var49.field7281 == 16) {
                                    int var52 = var50 - class74.field1258;
                                    int var53 = class74.field1258 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class443.field6603) {
                                        class43.method281(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field7281 == 32) {
                                    int var54 = class74.field1258 + var50;
                                    int var55 = class74.field1258 + var51;
                                    if (var55 < -var54 && var2 < class474.field6947 && var3 < class443.field6603) {
                                        class43.method281(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field7281 == 64) {
                                    int var56 = class74.field1258 + var50;
                                    int var57 = var51 - class74.field1258;
                                    if (var57 > var56 && var2 < class474.field6947 && var3 > 0) {
                                        class43.method281(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field7281 == 128) {
                                    int var58 = var50 - class74.field1258;
                                    int var59 = var51 - class74.field1258;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class43.method281(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class43.method281(arg0, var4, var2, var3);
                        }
                        class319.field4840.method519(arg0.field7487, arg0.field7484);
                    }
                    class293 var60 = var49.method110(0, class319.field4840);
                    if (var60 != null) {
                        var60.field4527 = var49;
                        var60.field4531 = var4;
                        var60.field4525 = var2;
                        var60.field4526 = var3;
                        class103.field1592.method1082(var60, -62);
                    }
                }
                arg1.field4375 = 0;
            }
        }
        if (arg1.field4391) {
            try {
                arg1.field4391 = false;
                int var61 = 0;
                label625: for (class21 var62 = arg1.field4381; var62 != null; var62 = var62.field235) {
                    class76 var63 = var62.field240;
                    if (class532.field7772 != var63.field1285) {
                        for (int var64 = var63.field1283; var64 <= var63.field1271; var64++) {
                            for (int var65 = var63.field1277; var65 <= var63.field1272; var65++) {
                                class281 var66 = var8[var64][var65];
                                if (var66.field4370) {
                                    arg1.field4391 = true;
                                    continue label625;
                                }
                                if (var66.field4375 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field1283) {
                                        var67++;
                                    }
                                    if (var64 < var63.field1271) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field1277) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field1272) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field4375) == arg1.field4382) {
                                        arg1.field4391 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class144.field2126 - var63.field1283;
                        int var69 = var63.field1271 - class144.field2126;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class29.field323 - var63.field1277;
                        int var71 = var63.field1272 - class29.field323;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field7489[var61] = var63;
                        arg0.field7490[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class76 var75 = arg0.field7489[var74];
                        if (class532.field7772 != var75.field1285) {
                            int var76 = arg0.field7490[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field1275 - class523.field7679;
                                int var78 = var75.field1279 - class452.field6726;
                                int var79 = arg0.field7489[var73].field1275 - class523.field7679;
                                int var80 = arg0.field7489[var73].field1279 - class452.field6726;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class76 var81 = arg0.field7489[var73];
                    var81.field1285 = class532.field7772;
                    if (!class486.method2940(var5, var81.field1283, var81.field1271, var81.field1277, var81.field1272, var81.method101(false))) {
                        if (class256.field4122) {
                            if (var81.field1273 == 0) {
                                class78.method705(arg0, var4, var81.field1283, var81.field1277, var81.field1271, var81.field1272);
                            } else {
                                class43.method281(arg0, var4, var2, var3);
                                int var82 = var2 - class144.field2126;
                                int var83 = var3 - class29.field323;
                                if (var81.field1273 == 2) {
                                    if (var83 > -var82) {
                                        class416.method2606(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class416.method2606(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class416.method2606(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class416.method2606(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class319.field4840.method519(arg0.field7487, arg0.field7484);
                        }
                        class293 var84 = var81.method110(0, class319.field4840);
                        if (var84 != null) {
                            var84.field4527 = var81;
                            var84.field4531 = var4;
                            var84.field4525 = var81.field1283;
                            var84.field4526 = var81.field1277;
                            class103.field1592.method1082(var84, 126);
                        }
                    }
                    for (int var85 = var81.field1283; var85 <= var81.field1271; var85++) {
                        for (int var86 = var81.field1277; var86 <= var81.field1272; var86++) {
                            class281 var87 = var8[var85][var86];
                            if (var87.field4375 != 0) {
                                class33.field398.method278(0, var87);
                            } else if ((var2 != var85 || var3 != var86) && var87.field4393) {
                                class33.field398.method278(0, var87);
                            }
                        }
                    }
                }
                if (arg1.field4391) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field4391 = false;
            }
        }
        if (arg1.field4385 != null && (byte) (class129.field1921 & 0xFF) == arg1.field4377) {
            class320 var88 = arg1.field4385;
            int var89 = class407.field6024[var4].method56(var2, var3);
            int var90;
            if (var4 < class183.field2802 - 1) {
                var90 = class407.field6024[var4].method56(var2, var3) - class407.field6024[var4 + 1].method56(var2, var3);
            } else {
                var90 = 0x8 << class295.field4543;
            }
            class182.field2788.method961(var6, var89, var7, arg0.field7483);
            int var91 = arg0.field7483[2];
            class182.field2788.method961(var6, var89 - var90, var7, arg0.field7483);
            int var92 = arg0.field7483[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class327.field4945;
            int var96 = class327.field4945 + var94;
            var88.field4849 = var95;
            var88.field4848 = var96;
            var88.field4853 = true;
            class319.field4840.method588(var88);
        }
        if (!arg1.field4393) {
            return;
        }
        if (arg1.field4375 != 0) {
            return;
        }
        if (var2 <= class144.field2126 && var2 > class83.field1368) {
            class281 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field4393) {
                return;
            }
        }
        if (var2 >= class144.field2126 && var2 < class324.field4921 - 1) {
            class281 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field4393) {
                return;
            }
        }
        if (var3 <= class29.field323 && var3 > class7.field84) {
            class281 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field4393) {
                return;
            }
        }
        if (var3 >= class29.field323 && var3 < class20.field230 - 1) {
            class281 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field4393) {
                return;
            }
        }
        arg1.field4393 = false;
        class256.field4118--;
        class90 var101 = arg1.field4388;
        if (var101 != null && var101.field1446) {
            if (class256.field4122) {
                class43.method281(arg0, var4, var2, var3);
                class319.field4840.method519(arg0.field7487, arg0.field7484);
            }
            class293 var102 = var101.method110(0, class319.field4840);
            if (var102 != null) {
                var102.field4527 = var101;
                var102.field4531 = var4;
                var102.field4525 = var2;
                var102.field4526 = var3;
                class103.field1592.method1082(var102, 101);
            }
        }
        if (arg1.field4383 != 0) {
            class202 var103 = arg1.field4376;
            if (var103 != null && !class424.method2641(var5, var2, var3, var103.method1421((byte) -111))) {
                if ((var103.field3121 & arg1.field4383) != 0) {
                    if (class256.field4122) {
                        class43.method281(arg0, var4, var2, var3);
                        class319.field4840.method519(arg0.field7487, arg0.field7484);
                    }
                    class293 var104 = var103.method110(0, class319.field4840);
                    if (var104 != null) {
                        var104.field4527 = var103;
                        var104.field4531 = var4;
                        var104.field4525 = var2;
                        var104.field4526 = var3;
                        class103.field1592.method1082(var104, 116);
                    }
                } else if (var103.field3121 == 256) {
                    int var105 = var103.field3126 - class523.field7679;
                    int var106 = var103.field3114 - class452.field6726;
                    int var107 = var103.field3132;
                    int var108;
                    if (var107 == 1 || var107 == 2) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    int var109;
                    if (var107 == 2 || var107 == 3) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    if (class256.field4122) {
                        class43.method281(arg0, var4, var2, var3);
                        class319.field4840.method519(arg0.field7487, arg0.field7484);
                    }
                    class202 var110 = arg1.field4389;
                    if (var109 > var108) {
                        class293 var111 = var103.method110(0, class319.field4840);
                        if (var111 != null) {
                            var111.field4527 = var103;
                            var111.field4531 = var4;
                            var111.field4525 = var2;
                            var111.field4526 = var3;
                            class103.field1592.method1082(var111, 119);
                        }
                    } else if (var110 != null) {
                        class293 var112 = var110.method110(0, class319.field4840);
                        if (var112 != null) {
                            var112.field4527 = var110;
                            var112.field4531 = var4;
                            var112.field4525 = var2;
                            var112.field4526 = var3;
                            class103.field1592.method1082(var112, 1);
                        }
                    }
                }
            }
            class501 var113 = arg1.field4380;
            class501 var114 = arg1.field4390;
            if (var114 != null && (var114.field7281 & arg1.field4383) != 0 && !class30.method179(var5, var2, var3, var114.field7281)) {
                if (class256.field4122) {
                    class256.method1809(arg0, var114.field7281, var4, var2, var3);
                    class319.field4840.method519(arg0.field7487, arg0.field7484);
                }
                class293 var115 = var114.method110(0, class319.field4840);
                if (var115 != null) {
                    var115.field4527 = var114;
                    var115.field4531 = var4;
                    var115.field4525 = var2;
                    var115.field4526 = var3;
                    class103.field1592.method1082(var115, -128);
                }
            }
            if (var113 != null && (var113.field7281 & arg1.field4383) != 0 && !class30.method179(var5, var2, var3, var113.field7281)) {
                if (class256.field4122) {
                    class256.method1809(arg0, var113.field7281, var4, var2, var3);
                    class319.field4840.method519(arg0.field7487, arg0.field7484);
                }
                class293 var116 = var113.method110(0, class319.field4840);
                if (var116 != null) {
                    var116.field4527 = var113;
                    var116.field4531 = var4;
                    var116.field4525 = var2;
                    var116.field4526 = var3;
                    class103.field1592.method1082(var116, 127);
                }
            }
        }
        if (var4 < class183.field2802 - 1) {
            class281 var117 = class348.field5192[var4 + 1][var2][var3];
            if (var117 != null && var117.field4393) {
                class33.field398.method274(var117, 96);
            }
        }
        if (var2 < class144.field2126) {
            class281 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field4393) {
                class33.field398.method278(0, var118);
            }
        }
        if (var3 < class29.field323) {
            class281 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field4393) {
                class33.field398.method278(0, var119);
            }
        }
        if (var2 > class144.field2126) {
            class281 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field4393) {
                class33.field398.method278(0, var120);
            }
        }
        if (var3 > class29.field323) {
            class281 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field4393) {
                class33.field398.method278(0, var121);
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method1628(boolean arg0) {
        field3629++;
        if (!arg0) {
            this.field3639 = -64;
        }
        class484 var2 = (class484) this.field3636.method365(-119);
        while (var2 != null) {
            Object var3 = var2.method2842((byte) -15);
            if (var3 != null) {
                return var3;
            }
            class484 var4 = var2;
            var2 = (class484) this.field3636.method365(-59);
            var4.method947((byte) 120);
            var4.method2859(-112);
            this.field3627 += var2.field7092;
        }
        return null;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public static void method1629(int arg0) {
        field3625 = null;
        if (arg0 != 0) {
            field3625 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
    public final void method1630(int arg0) {
        if (arg0 >= -8) {
            return;
        }
        for (class484 var2 = (class484) this.field3626.method2825(-1); var2 != null; var2 = (class484) this.field3626.method2827(117)) {
            if (var2.method2843(20716)) {
                var2.method947((byte) 117);
                var2.method2859(-98);
                this.field3627 += var2.field7092;
            }
        }
        field3635++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)V")
    public final void method1631(int arg0, byte arg1) {
        if (arg1 != -19) {
            this.field3639 = 117;
        }
        if (class264.field4214 != null) {
            for (class484 var3 = (class484) this.field3626.method2825(arg1 + 18); var3 != null; var3 = (class484) this.field3626.method2827(90)) {
                if (var3.method2843(20716)) {
                    if (var3.method2842((byte) -15) == null) {
                        var3.method947((byte) 101);
                        var3.method2859(-103);
                        this.field3627++;
                    }
                } else if ((long) arg0 < ++var3.field6926) {
                    class484 var4 = class264.field4214.method1998(false, var3);
                    this.field3636.method357(var4, 1, var3.field1932);
                    class68.method491(var3, 101, var4);
                    var3.method947((byte) 116);
                    var3.method2859(arg1 - 83);
                }
            }
        }
        field3638++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BJ)V")
    private final void method1632(byte arg0, long arg1) {
        field3633++;
        if (arg0 != -15) {
            this.method1631(-122, (byte) -84);
        }
        class484 var4 = (class484) this.field3636.method358((byte) -125, arg1);
        this.method1635(var4, (byte) -1);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)I")
    public final int method1633(byte arg0) {
        int var2 = -48 % ((arg0 - 34) / 58);
        field3620++;
        return this.field3639;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method1634(long arg0, int arg1) {
        field3632++;
        class484 var4 = (class484) this.field3636.method358((byte) 83, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method2842((byte) -15);
        if (var5 == null) {
            var4.method947((byte) 115);
            var4.method2859(-125);
            this.field3627 += var4.field7092;
            return null;
        }
        if (var4.method2843(20716)) {
            class516 var6 = new class516(var5, var4.field7092);
            this.field3636.method357(var6, 1, var4.field1932);
            this.field3626.method2829(arg1 ^ 0xFFFFC953, var6);
            var6.field6926 = 0L;
            var4.method947((byte) 118);
            var4.method2859(-119);
        } else {
            this.field3626.method2829(-14061, var4);
            var4.field6926 = 0L;
        }
        if (arg1 != 64) {
            method1626(1.2756315F, 1.1946084F, (byte) -100, 0.64615697F, -105);
        }
        return var5;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lcv;B)V")
    private final void method1635(class484 arg0, byte arg1) {
        field3630++;
        if (arg0 != null) {
            arg0.method947((byte) 100);
            arg0.method2859(-123);
            this.field3627 += arg0.field7092;
        }
        if (arg1 != -1) {
            this.field3639 = -44;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)I")
    public final int method1636(byte arg0) {
        field3622++;
        int var2 = 0;
        if (arg0 != 89) {
            return -125;
        }
        for (class484 var3 = (class484) this.field3626.method2825(arg0 - 90); var3 != null; var3 = (class484) this.field3626.method2827(104)) {
            if (!var3.method2843(20716)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V")
    public final void method1637(byte arg0) {
        field3621++;
        if (arg0 != 13) {
            this.method1633((byte) 56);
        }
        this.field3626.method2831(0);
        this.field3636.method360(-103);
        this.field3627 = this.field3639;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
    public static final boolean method1638(int arg0, int arg1) {
        if (arg1 != 1) {
            method1626(-0.9093138F, 1.1103121F, (byte) 89, 0.4507335F, -109);
        }
        field3637++;
        return arg0 == 6 || arg0 == 7 || arg0 == 8;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1639(int arg0) {
        field3628++;
        class484 var2 = (class484) this.field3636.method359(true);
        if (arg0 != 0) {
            this.field3626 = null;
        }
        while (var2 != null) {
            Object var3 = var2.method2842((byte) -15);
            if (var3 != null) {
                return var3;
            }
            class484 var4 = var2;
            var2 = (class484) this.field3636.method365(-126);
            var4.method947((byte) 113);
            var4.method2859(arg0 - 117);
            this.field3627 += var2.field7092;
        }
        return null;
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)I")
    public final int method1640(int arg0) {
        if (arg0 == 21327) {
            field3640++;
            return this.field3627;
        } else {
            return -86;
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I)V")
    public class242(int arg0) {
        this.field3627 = arg0;
        this.field3639 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field3636 = new class56(var2);
    }
}
