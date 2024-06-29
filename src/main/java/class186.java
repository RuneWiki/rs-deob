import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class186 {

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Ldc;")
    private class5 field2645 = new class5(64);

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lhe;")
    private class239 field2638;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lpj;")
    public static class94 field2640 = new class94(0);

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Lts;")
    public static class356 field2642 = null;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Liu;")
    public static class390 field2647;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field2646;

    static {
        new class194("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field2647 = new class390(33, 10);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 6)
    public final void method1166(byte arg0) {
        if (arg0 > -61) {
            return;
        }
        class5 var2 = this.field2645;
        synchronized (this.field2645) {
            this.field2645.method35((byte) -1);
        }
        field2644++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 19)
    public final void method1167(int arg0) {
        class5 var2 = this.field2645;
        synchronized (this.field2645) {
            if (arg0 != -76) {
                return;
            }
            this.field2645.method38((byte) -9);
        }
        field2646++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)Ldm;", line = 43)
    public final class36 method1168(int arg0, int arg1) {
        field2637++;
        class5 var3 = this.field2645;
        class36 var4;
        synchronized (this.field2645) {
            var4 = (class36) this.field2645.method40(arg0 ^ arg0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2638.method1470(4, arg1, 16);
        class36 var6 = new class36();
        if (var5 != null) {
            var6.method292(new class156(var5), 0);
        }
        class5 var7 = this.field2645;
        synchronized (this.field2645) {
            this.field2645.method36(-20960, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V", line = 72)
    public static final void method1169(int arg0) {
        field2639++;
        if (class70.field1029 > 0) {
            class70.field1029--;
        }
        if (class291.field4160 > 1) {
            class291.field4160--;
            class28.field470 = class490.field7491;
        }
        if (class450.field6555) {
            class450.field6555 = false;
            class388.method2338((byte) -86);
            return;
        }
        if (!class174.field2387) {
            class190.method1200(98);
        }
        for (int var1 = 0; var1 < 100 && class331.method1995(-59); var1++) {
        }
        if (class323.field4729 != 30) {
            return;
        }
        class359.method2179(-45, class356.field5202.method2782((byte) 41), class79.field1108);
        if (class98.field1327 == null) {
            if (class109.method653(false) >= class308.field4491) {
                class98.field1327 = class111.field1452.method259(57, class406.field5955);
            }
        } else if (class98.field1327.field4867 != -1) {
            class386.method2321(true, class298.field4340);
            class79.field1108.method961(class98.field1327.field4867, 1608339368);
            class98.field1327 = null;
            class308.field4491 = class109.method653(false) + 30000L;
        }
        class270 var2 = (class270) class265.field3759.method2096(-21400);
        if (var2 != null || (class109.method653(false) - 2000L) > class429.field6312) {
            boolean var3 = false;
            int var4 = class79.field1108.field2018;
            for (class270 var5 = (class270) class54.field842.method2096(-21400); var5 != null && class79.field1108.field2018 - var4 < 240; var5 = (class270) class54.field842.method2084((byte) 19)) {
                var5.method536(false);
                int var6 = var5.method1019((byte) -78);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method1018(arg0 - 60361);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method1019((byte) -122) == -1 && var5.method1018(-30361) == -1) {
                    var7 = -1;
                    var8 = true;
                    var6 = -1;
                }
                if (class195.field2765 != var7 || class238.field3336 != var6) {
                    if (!var3) {
                        class386.method2321(true, class220.field3099);
                        class93.field1259++;
                        class79.field1108.method947(-54, 0);
                        var3 = true;
                        var4 = class79.field1108.field2018;
                    }
                    int var9 = var7 - class195.field2765;
                    class195.field2765 = var7;
                    int var10 = var6 - class238.field3336;
                    class238.field3336 = var6;
                    int var11 = (int) ((var5.method1014((byte) -99) - class429.field6312) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var10 += 32;
                        var9 += 32;
                        class79.field1108.method961((var9 << 6) + (var11 << 12) + var10, arg0 + 1608309368);
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        var9 += 128;
                        class79.field1108.method947(arg0 - 30128, var11 + 128);
                        var10 += 128;
                        class79.field1108.method961((var9 << 8) + var10, 1608339368);
                    } else if (var11 < 32) {
                        class79.field1108.method947(-87, var11 + 192);
                        if (var8) {
                            class79.field1108.method969(19869, Integer.MIN_VALUE);
                        } else {
                            class79.field1108.method969(19869, var6 << 16 | var7);
                        }
                    } else {
                        class79.field1108.method961(var11 + 57344, arg0 ^ 0x5FDD3A98);
                        if (var8) {
                            class79.field1108.method969(19869, Integer.MIN_VALUE);
                        } else {
                            class79.field1108.method969(19869, var7 | var6 << 16);
                        }
                    }
                    class429.field6312 = var5.method1014((byte) -99);
                }
            }
            if (var3) {
                class79.field1108.method966((byte) -118, class79.field1108.field2018 - var4);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method1014((byte) -99) - class409.field5992) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class409.field5992 = var2.method1014((byte) -99);
            int var14 = var2.method1019((byte) -73);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method1018(-30361);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method1015(0) == 2) {
                var16 = 1;
            }
            class386.method2321(true, class54.field843);
            int var17 = (int) var12;
            class343.field4985++;
            class79.field1108.method992(-91, var15 | var14 << 16);
            class79.field1108.method961(var16 << 15 | var17, 1608339368);
        }
        if (class406.field5954 > 0) {
            int var18 = 0;
            for (int var19 = 0; var19 < class406.field5954; var19++) {
                if (class227.field3200[var19].method571(29767)) {
                    var18++;
                }
            }
            if (var18 > 0) {
                class386.method2321(true, class338.field4921);
                class202.field2802++;
                if (var18 > 75) {
                    var18 = 75;
                }
                class79.field1108.method947(-106, var18 * 3);
                for (int var20 = 0; var20 < class406.field5954; var20++) {
                    class93 var21 = class227.field3200[var20];
                    if (var21.method571(arg0 ^ 0x177)) {
                        long var22 = (var21.method573(true) - class131.field1678) / 50L;
                        class131.field1678 = var21.method573(true);
                        if (var22 > 65535L) {
                            var22 = 65535L;
                        }
                        class79.field1108.method947(-64, var21.method574(250));
                        class79.field1108.method961((int) var22, 1608339368);
                    }
                }
            }
        }
        if (class445.field6484 > 0) {
            class445.field6484--;
        }
        if (class477.field6873 && class445.field6484 <= 0) {
            class445.field6484 = 20;
            class111.field1454++;
            class477.field6873 = false;
            class386.method2321(true, class135.field1724);
            class79.field1108.method972((int) class506.field7722 >> 3, -128);
            class79.field1108.method972((int) class473.field6841 >> 3, -128);
        }
        if (class145.field1886 && !class185.field2629) {
            class185.field2629 = true;
            class350.field5078++;
            class386.method2321(true, class459.field6683);
            class79.field1108.method947(arg0 - 30083, 1);
        }
        if (!class145.field1886 && class185.field2629) {
            class185.field2629 = false;
            class350.field5078++;
            class386.method2321(true, class459.field6683);
            class79.field1108.method947(-96, 0);
        }
        if (!class17.field241) {
            class451.field6567++;
            class386.method2321(true, class9.field146);
            class79.field1108.method947(arg0 ^ 0xFFFF8AB6, 0);
            int var24 = class79.field1108.field2018;
            class156 var25 = class118.field1533.method2962(25311);
            class79.field1108.method948(var25.field2041, 0, 2, var25.field2018);
            class79.field1108.method966((byte) -77, class79.field1108.field2018 - var24);
            class17.field241 = true;
        }
        if (class358.field5312 != null) {
            if (class306.field4454 == 2) {
                class450.method2621(arg0 ^ 0x476B);
            } else if (class306.field4454 == 3) {
                class378.method2288((byte) 74);
            }
        }
        if (class94.field1266) {
            class94.field1266 = false;
        } else {
            class107.field1432 /= 2.0F;
        }
        if (class435.field6375) {
            class435.field6375 = false;
        } else {
            class242.field3485 /= 2.0F;
        }
        class221.method1358(false);
        if (class323.field4729 != 30) {
            return;
        }
        class128.method714((byte) -34);
        class289.method1749(false);
        class210.method1298(-4560);
        class66.method462(-2474);
        class116.field1499++;
        if (class116.field1499 > 750) {
            class388.method2338((byte) -86);
            return;
        }
        class75.method498(-73);
        class368.method2243(arg0 ^ arg0);
        class482.method2805(110);
        for (int var26 = class453.field6591.method101(28, true); var26 != -1; var26 = class453.field6591.method101(arg0 ^ 0xFFFF8A9F, false)) {
            class190.method1198(var26, (byte) -123);
            class359.field5331[class500.method3013(class219.field3073++, 31)] = var26;
        }
        for (class338 var27 = class443.method2591(125); var27 != null; var27 = class443.method2591(arg0 ^ 0x7560)) {
            int var28 = var27.method2054(false);
            int var29 = var27.method2053((byte) -97);
            if (var28 == 1) {
                class115.field1486[var29] = var27.field4930;
                class438.field6406 |= class420.field6208[var29];
                class258.field3686[class500.method3013(31, class239.field3352++)] = var29;
            } else if (var28 == 2) {
                class7.field129[var29] = var27.field4923;
                class492.field7518[class500.method3013(class267.field3771++, 31)] = var29;
            } else if (var28 == 3) {
                class356 var30 = class4.method25(var29, false);
                if (!var27.field4923.equals(var30.field5246)) {
                    var30.field5246 = var27.field4923;
                    class170.method1068(arg0 - 30045, var30);
                }
            } else if (var28 == 4) {
                class356 var48 = class4.method25(var29, false);
                int var49 = var27.field4930;
                int var50 = var27.field4924;
                int var51 = var27.field4926;
                if (var48.field5141 != var49 || var48.field5191 != var50 || var48.field5218 != var51) {
                    var48.field5218 = var51;
                    var48.field5191 = var50;
                    var48.field5141 = var49;
                    class170.method1068(-88, var48);
                }
            } else if (var28 == 5) {
                class356 var47 = class4.method25(var29, false);
                if (var27.field4930 != var47.field5212 || var27.field4930 == -1) {
                    var47.field5221 = 0;
                    var47.field5224 = 0;
                    var47.field5212 = var27.field4930;
                    var47.field5217 = 1;
                    class170.method1068(-50, var47);
                }
            } else if (var28 == 6) {
                int var31 = var27.field4930;
                int var32 = var31 >> 10 & 0x1F;
                int var33 = var31 >> 5 & 0x1F;
                int var34 = var31 & 0x1F;
                int var35 = (var34 << 3) + ((var32 << 19) + (var33 << 11));
                class356 var36 = class4.method25(var29, false);
                if (var36.field5193 != var35) {
                    var36.field5193 = var35;
                    class170.method1068(arg0 - 30106, var36);
                }
            } else if (var28 == 7) {
                class356 var37 = class4.method25(var29, false);
                boolean var38 = var27.field4930 == 1;
                if (var37.field5159 != var38) {
                    var37.field5159 = var38;
                    class170.method1068(-62, var37);
                }
            } else if (var28 == 8) {
                class356 var39 = class4.method25(var29, false);
                if (var27.field4930 != var39.field5139 || var27.field4924 != var39.field5225 || var27.field4926 != var39.field5240) {
                    var39.field5240 = var27.field4926;
                    var39.field5139 = var27.field4930;
                    var39.field5225 = var27.field4924;
                    if (var39.field5174 != -1) {
                        if (var39.field5211 > 0) {
                            var39.field5240 = var39.field5240 * 32 / var39.field5211;
                        } else if (var39.field5162 > 0) {
                            var39.field5240 = var39.field5240 * 32 / var39.field5162;
                        }
                    }
                    class170.method1068(-66, var39);
                }
            } else if (var28 == 9) {
                class356 var40 = class4.method25(var29, false);
                if (var27.field4930 != var40.field5174 || var27.field4924 != var40.field5222) {
                    var40.field5174 = var27.field4930;
                    var40.field5222 = var27.field4924;
                    class170.method1068(-102, var40);
                }
            } else if (var28 == 10) {
                class356 var41 = class4.method25(var29, false);
                if (var27.field4930 != var41.field5285 || var27.field4924 != var41.field5273 || var27.field4926 != var41.field5146) {
                    var41.field5285 = var27.field4930;
                    var41.field5146 = var27.field4926;
                    var41.field5273 = var27.field4924;
                    class170.method1068(-50, var41);
                }
            } else if (var28 == 11) {
                class356 var46 = class4.method25(var29, false);
                var46.field5179 = var46.field5201 = var27.field4924;
                var46.field5161 = 0;
                var46.field5209 = var46.field5251 = var27.field4930;
                var46.field5282 = 0;
                class170.method1068(arg0 - 30071, var46);
            } else if (var28 == 12) {
                class356 var42 = class4.method25(var29, false);
                int var43 = var27.field4930;
                if (var42 != null && var42.field5170 == 0) {
                    if ((var42.field5235 - var42.field5169) < var43) {
                        var43 = var42.field5235 - var42.field5169;
                    }
                    if (var43 < 0) {
                        var43 = 0;
                    }
                    if (var42.field5144 != var43) {
                        var42.field5144 = var43;
                        class170.method1068(-51, var42);
                    }
                }
            } else if (var28 == 14) {
                class356 var45 = class4.method25(var29, false);
                var45.field5205 = var27.field4930;
            } else if (var28 == 15) {
                class495.field7547 = var27.field4930;
                class358.field5314 = true;
                class2.field33 = var27.field4924;
            } else if (var28 == 16) {
                class356 var44 = class4.method25(var29, false);
                var44.field5156 = var27.field4930;
            }
        }
        class91.field1245++;
        if (class295.field4313 != 0) {
            class166.field2177 += 20;
            if (class166.field2177 >= 400) {
                class295.field4313 = 0;
            }
        }
        if (class36.field564 != null) {
            class300.field4350++;
            if (class300.field4350 >= 15) {
                class170.method1068(-110, class36.field564);
                class36.field564 = null;
            }
        }
        class104.field1403 = null;
        class26.field431 = null;
        class212.field3006 = false;
        class318.field4664 = false;
        class324.method1944(null, -1, 30000, -1);
        class65.method458(null, -1, -1, -128);
        if (!class288.field4128) {
            class450.field6553 = -1;
        }
        class478.method2793((byte) 124);
        class490.field7491++;
        if (class165.field2159) {
            class386.method2321(true, class99.field1354);
            class148.field1923++;
            class79.field1108.method992(-111, class211.field2996 | class409.field6003 << 14 | class444.field6478 << 28);
            class165.field2159 = false;
        }
        while (true) {
            class99 var52;
            class356 var53;
            class356 var54;
            do {
                var52 = (class99) class497.field7569.method2093(-10805);
                if (var52 == null) {
                    while (true) {
                        class99 var55;
                        class356 var56;
                        class356 var57;
                        do {
                            var55 = (class99) class358.field5308.method2093(arg0 - 40805);
                            if (var55 == null) {
                                while (true) {
                                    class99 var58;
                                    class356 var59;
                                    class356 var60;
                                    do {
                                        var58 = (class99) class300.field4355.method2093(-10805);
                                        if (var58 == null) {
                                            if (class26.field431 == null) {
                                                class184.field2605 = 0;
                                            }
                                            if (class164.field2146 != null) {
                                                class7.method64((byte) 110);
                                            }
                                            if (class118.field1535 > 0 && class489.field7484.method1877(-58, 82) && class489.field7484.method1877(124, 81) && class193.field2735 != 0) {
                                                int var61 = class415.field6145.field2956 - class193.field2735;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class508.method3060(class223.field3158 + class415.field6145.field4282[0], class415.field6145.field4279[0] + class455.field6637, (byte) -73, var61);
                                            }
                                            class366.method2240((byte) 83);
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class484.field7017[var62]++;
                                            }
                                            if (class438.field6406 && (class109.method653(false) - 60000L) > class193.field2734) {
                                                class450.method2624(7479);
                                            }
                                            class13.field201++;
                                            if (class13.field201 > 500) {
                                                class13.field201 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x1) == 1) {
                                                    class305.field4424 += class148.field1922;
                                                }
                                                if ((var63 & 0x4) == 4) {
                                                    class413.field6113 += class351.field5098;
                                                }
                                                if ((var63 & 0x2) == 2) {
                                                    class407.field5976 += class414.field6140;
                                                }
                                            }
                                            if (class305.field4424 < -50) {
                                                class148.field1922 = 2;
                                            }
                                            if (class407.field5976 < -55) {
                                                class414.field6140 = 2;
                                            }
                                            if (class305.field4424 > 50) {
                                                class148.field1922 = -2;
                                            }
                                            if (class407.field5976 > 55) {
                                                class414.field6140 = -2;
                                            }
                                            if (class413.field6113 < -40) {
                                                class351.field5098 = 1;
                                            }
                                            class364.field5479++;
                                            if (class413.field6113 > 40) {
                                                class351.field5098 = -1;
                                            }
                                            if (class364.field5479 > 500) {
                                                class364.field5479 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x1) == 1) {
                                                    class280.field4003 += class369.field5542;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class498.field7587 += class291.field4159;
                                                }
                                            }
                                            if (class280.field4003 < -60) {
                                                class369.field5542 = 2;
                                            }
                                            if (class280.field4003 > 60) {
                                                class369.field5542 = -2;
                                            }
                                            if (class498.field7587 < -20) {
                                                class291.field4159 = 1;
                                            }
                                            class34.field552++;
                                            if (class498.field7587 > 10) {
                                                class291.field4159 = -1;
                                            }
                                            if (class34.field552 > 50) {
                                                class386.method2321(true, class229.field3212);
                                                class181.field2588++;
                                            }
                                            if (class483.field7002) {
                                                class336.method2030((byte) -101);
                                                class483.field7002 = false;
                                            }
                                            try {
                                                if (class22.field294 != null && class79.field1108.field2018 > 0) {
                                                    class472.field6826 += class79.field1108.field2018;
                                                    class22.field294.method2121(class79.field1108.field2018, class79.field1108.field2041, false, 0);
                                                    class79.field1108.field2018 = 0;
                                                    class34.field552 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var65) {
                                                class388.method2338((byte) -86);
                                                return;
                                            }
                                        }
                                        var59 = var58.field1343;
                                        if (var59.field5184 < 0) {
                                            break;
                                        }
                                        var60 = class4.method25(var59.field5160, false);
                                    } while (var60 == null || var60.field5151 == null || var59.field5184 >= var60.field5151.length || var60.field5151[var59.field5184] != var59);
                                    class396.method2358(var58);
                                }
                            }
                            var56 = var55.field1343;
                            if (var56.field5184 < 0) {
                                break;
                            }
                            var57 = class4.method25(var56.field5160, false);
                        } while (var57 == null || var57.field5151 == null || var57.field5151.length <= var56.field5184 || var57.field5151[var56.field5184] != var56);
                        class396.method2358(var55);
                    }
                }
                var53 = var52.field1343;
                if (var53.field5184 < 0) {
                    break;
                }
                var54 = class4.method25(var53.field5160, false);
            } while (var54 == null || var54.field5151 == null || var53.field5184 >= var54.field5151.length || var54.field5151[var53.field5184] != var53);
            class396.method2358(var52);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)V", line = 923)
    public final void method1170(byte arg0, int arg1) {
        if (arg0 > -2) {
            field2647 = null;
        }
        field2641++;
        class5 var3 = this.field2645;
        synchronized (this.field2645) {
            this.field2645.method39(false, arg1);
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V", line = 940)
    public static void method1171(int arg0) {
        field2642 = null;
        field2647 = null;
        field2640 = null;
        if (arg0 > -97) {
            field2640 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lci;ILhe;)V", line = 964)
    public class186(class298 arg0, int arg1, class239 arg2) {
        this.field2638 = arg2;
        if (this.field2638 == null) {
            this.field2643 = 0;
        } else {
            this.field2643 = this.field2638.method1473(4309, 16);
        }
    }
}
