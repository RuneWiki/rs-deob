import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class93 extends class313 {

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
    private int field1464 = -1;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field1458 = 0;

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "[I")
    public static int[] field1467 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "[I")
    public int[] field1465;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)V", line = 11)
    public static void method803(byte arg0) {
        int var1 = -17 % ((arg0 - 2) / 33);
        field1467 = null;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 19)
    public class93() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(II)Lph;", line = 30)
    public static final class89 method804(int arg0, int arg1) {
        field1462++;
        int var2 = -121 / ((2 - arg1) / 36);
        class89 var3 = (class89) class8.field107.method2400((long) arg0, 99);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = class256.field4131.method441(false, 0, arg0 & 0x7FFF);
        } else {
            var4 = class144.field2622.method441(false, 0, arg0);
        }
        class89 var5 = new class89();
        if (var4 != null) {
            var5.method777(0, new class336(var4));
        }
        if (arg0 >= 32768) {
            var5.method786(32768);
        }
        class8.field107.method2396(0, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIII)V", line = 68)
    public static final void method805(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 90 / ((arg0 + 13) / 37);
        field1455++;
        class354.field5596 = 0;
        for (int var8 = -1; var8 < (class291.field4664 + class191.field3200); var8++) {
            class116 var9;
            if (var8 == -1) {
                var9 = class218.field3632;
            } else if (class291.field4664 <= var8) {
                var9 = class320.field5071[class33.field468[var8 - class291.field4664]];
            } else {
                var9 = class135.field2359[class119.field2064[var8]];
            }
            if (var9 != null && var9.method981((byte) -90)) {
                if (var9 instanceof class278) {
                    class12 var10 = ((class278) var9).field4413;
                    if (var10.field179 != null) {
                        var10 = var10.method122(-105);
                    }
                    if (var10 == null) {
                        continue;
                    }
                }
                if (class291.field4664 <= var8) {
                    class12 var11 = ((class278) var9).field4413;
                    if (var11.field179 != null) {
                        var11 = var11.method122(26);
                    }
                    if (var11.field155 >= 0 && class44.field696.length > var11.field155) {
                        int var12;
                        if (var11.field159 == -1) {
                            var12 = var9.method988(96) + 15;
                        } else {
                            var12 = var11.field159 + 15;
                        }
                        class40.method340(var9, arg6 >> 1, arg3, arg4 >> 1, 126, var12, arg2);
                        if (class286.field4558 > -1) {
                            class44.field696[var11.field155].method1248(class286.field4558 + arg5 - 12, arg1 + -30 + class171.field2968);
                        }
                    }
                    class156[] var13 = class311.field4922;
                    for (int var14 = 0; var14 < var13.length; var14++) {
                        class156 var15 = var13[var14];
                        if (var15 != null && var15.field2764 == 1 && class33.field468[var8 - class291.field4664] == var15.field2765 && class181.field3045 % 20 < 10) {
                            int var16;
                            if (var11.field159 == -1) {
                                var16 = var9.method988(116) + 15;
                            } else {
                                var16 = var11.field159 + 15;
                            }
                            class40.method340(var9, arg6 >> 1, arg3, arg4 >> 1, 127, var16, arg2);
                            if (class286.field4558 > -1) {
                                class4.field63[var15.field2761].method1248(arg5 + class286.field4558 - 12, class171.field2968 + -28 + arg1);
                            }
                        }
                    }
                } else {
                    int var17 = 30;
                    class205 var18 = (class205) var9;
                    if (var18.field3486 != -1 || var18.field3508 != -1) {
                        class40.method340(var9, arg6 >> 1, arg3, arg4 >> 1, 127, var9.method988(115) + 15, arg2);
                        if (class286.field4558 > -1) {
                            if (var18.field3486 != -1) {
                                class288.field4593[var18.field3486].method1248(arg5 + class286.field4558 - 12, arg1 - -class171.field2968 + -var17);
                                var17 += 25;
                            }
                            if (var18.field3508 != -1) {
                                class44.field696[var18.field3508].method1248(class286.field4558 + arg5 - 12, class171.field2968 + arg1 - var17);
                                var17 += 25;
                            }
                        }
                    }
                    if (var8 >= 0) {
                        class156[] var19 = class311.field4922;
                        for (int var20 = 0; var20 < var19.length; var20++) {
                            class156 var21 = var19[var20];
                            if (var21 != null && var21.field2764 == 10 && class119.field2064[var8] == var21.field2765) {
                                class40.method340(var9, arg6 >> 1, arg3, arg4 >> 1, 126, var9.method988(123) + 15, arg2);
                                if (class286.field4558 > -1) {
                                    class4.field63[var21.field2761].method1248(arg5 + class286.field4558 - 12, -var17 + arg1 + class171.field2968);
                                }
                            }
                        }
                    }
                }
                if (var9.field1986 != null && (var8 >= class291.field4664 || class240.field3917 == 0 || class240.field3917 == 3 || class240.field3917 == 1 && class90.method789(((class205) var9).field3491, (byte) 6))) {
                    class40.method340(var9, arg6 >> 1, arg3, arg4 >> 1, 126, var9.method988(95), arg2);
                    if (class286.field4558 > -1 && class354.field5596 < class224.field3733) {
                        class224.field3743[class354.field5596] = class177.field3014.method2223(var9.field1986) / 2;
                        class224.field3738[class354.field5596] = class177.field3014.field5127;
                        class224.field3750[class354.field5596] = class286.field4558;
                        class224.field3732[class354.field5596] = class171.field2968;
                        class224.field3755[class354.field5596] = var9.field1996;
                        class224.field3753[class354.field5596] = var9.field1930;
                        class224.field3741[class354.field5596] = var9.field1937;
                        class224.field3751[class354.field5596] = var9.field1986;
                        class354.field5596++;
                    }
                }
                if (class181.field3045 < var9.field1981) {
                    class171 var22 = class106.field1761[0];
                    class171 var23 = class106.field1761[1];
                    int var24;
                    if ((var9 instanceof class278)) {
                        class278 var25 = (class278) var9;
                        class171[] var26 = (class171[]) ((class171[]) class127.field2208.method467(true, (long) var25.field4413.field136));
                        if (var26 == null) {
                            var26 = class125.method1043(class321.field5091, 0, var25.field4413.field136, 86);
                            if (var26 != null) {
                                class127.field2208.method465(var26, (long) var25.field4413.field136, (byte) 65);
                            }
                        }
                        class12 var27 = var25.field4413;
                        if (var26 != null && var26.length == 2) {
                            var23 = var26[1];
                            var22 = var26[0];
                        }
                        if (var27.field159 == -1) {
                            var24 = var9.method988(86);
                        } else {
                            var24 = var27.field159;
                        }
                    } else {
                        var24 = var9.method988(101);
                    }
                    class40.method340(var9, arg6 >> 1, arg3, arg4 >> 1, 126, var24 + var22.field2965 + 10, arg2);
                    if (class286.field4558 > -1) {
                        int var28 = arg5 + class286.field4558 - (var22.field2967 >> 1);
                        int var29 = class171.field2968 + arg1 - 3;
                        var22.method1248(var28, var29);
                        int var30 = var9.field1977 * var22.field2967 / 255;
                        int var31 = var22.field2965;
                        if (class43.field680) {
                            class169.method1331(var28, var29, var28 + var30, var29 + var31);
                        } else {
                            class47.method414(var28, var29, var28 + var30, var29 + var31);
                        }
                        var23.method1248(var28, var29);
                        if (class43.field680) {
                            class169.method1330(arg5, arg1, arg5 + arg6, arg1 + arg4);
                        } else {
                            class47.method420(arg5, arg1, arg5 + arg6, arg1 - -arg4);
                        }
                    }
                }
                for (int var32 = 0; var32 < 4; var32++) {
                    if (class181.field3045 < var9.field2007[var32]) {
                        int var35;
                        if (var9 instanceof class278) {
                            class278 var33 = (class278) var9;
                            class12 var34 = var33.field4413;
                            if (var34.field159 == -1) {
                                var35 = var9.method988(73) / 2;
                            } else {
                                var35 = var34.field159 / 2;
                            }
                        } else {
                            var35 = var9.method988(123) / 2;
                        }
                        class40.method340(var9, arg6 >> 1, arg3, arg4 >> 1, 127, var35, arg2);
                        if (class286.field4558 > -1) {
                            if (var32 == 1) {
                                class171.field2968 -= 20;
                            }
                            if (var32 == 2) {
                                class286.field4558 -= 15;
                                class171.field2968 -= 10;
                            }
                            if (var32 == 3) {
                                class171.field2968 -= 10;
                                class286.field4558 += 15;
                            }
                            class81.field1321[var9.field1978[var32]].method1248(arg5 + class286.field4558 - 12, class171.field2968 + arg1 + -12);
                            class99.field1605.method2237(Integer.toString(var9.field1987[var32]), class286.field4558 + arg5 - 1, arg1 - -3 + class171.field2968, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var36 = 0; var36 < class354.field5596; var36++) {
            int var37 = class224.field3732[var36];
            int var38 = class224.field3750[var36];
            int var39 = class224.field3743[var36];
            boolean var40 = true;
            int var41 = class224.field3738[var36];
            while (var40) {
                var40 = false;
                for (int var42 = 0; var42 < var36; var42++) {
                    if (class224.field3732[var42] - class224.field3738[var42] < var37 + 2 && var37 - var41 < class224.field3732[var42] + 2 && class224.field3750[var42] + class224.field3743[var42] > var38 - var39 && (var38 + var39) > (class224.field3750[var42] - class224.field3743[var42]) && var37 > class224.field3732[var42] - class224.field3738[var42]) {
                        var37 = class224.field3732[var42] - class224.field3738[var42];
                        var40 = true;
                    }
                }
            }
            class286.field4558 = class224.field3750[var36];
            class171.field2968 = class224.field3732[var36] = var37;
            String var43 = class224.field3751[var36];
            if (class104.field1738 == 0) {
                int var44 = 16776960;
                if (class224.field3755[var36] < 6) {
                    var44 = class316.field5017[class224.field3755[var36]];
                }
                if (class224.field3755[var36] == 6) {
                    var44 = class178.field3022 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class224.field3755[var36] == 7) {
                    var44 = class178.field3022 % 20 < 10 ? 255 : 65535;
                }
                if (class224.field3755[var36] == 8) {
                    var44 = class178.field3022 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class224.field3755[var36] == 9) {
                    int var45 = 150 - class224.field3741[var36];
                    if (var45 < 50) {
                        var44 = var45 * 1280 + 16711680;
                    } else if (var45 < 100) {
                        var44 = 16776960 - ((var45 - 50) * 327680);
                    } else if (var45 < 150) {
                        var44 = (var45 - 100) * 5 + 65280;
                    }
                }
                if (class224.field3755[var36] == 10) {
                    int var46 = 150 - class224.field3741[var36];
                    if (var46 < 50) {
                        var44 = (var46 * 5) + 16711680;
                    } else if (var46 < 100) {
                        var44 = 16384000 + 16711935 - (var46 * 327680);
                    } else if (var46 < 150) {
                        var44 = (var46 - 100) * 327680 + 255 - (var46 - 100) * 5;
                    }
                }
                if (class224.field3755[var36] == 11) {
                    int var47 = 150 - class224.field3741[var36];
                    if (var47 < 50) {
                        var44 = 16777215 - (var47 * 327685);
                    } else if (var47 < 100) {
                        var44 = var47 * 327685 - 16318970;
                    } else if (var47 < 150) {
                        var44 = 49545215 - (var47 * 327680);
                    }
                }
                if (class224.field3753[var36] == 0) {
                    class177.field3014.method2237(var43, class286.field4558 + arg5, class171.field2968 + arg1, var44, 0);
                }
                if (class224.field3753[var36] == 1) {
                    class177.field3014.method2245(var43, arg5 + class286.field4558, arg1 - -class171.field2968, var44, 0, class178.field3022);
                }
                if (class224.field3753[var36] == 2) {
                    class177.field3014.method2244(var43, class286.field4558 + arg5, class171.field2968 + arg1, var44, 0, class178.field3022);
                }
                if (class224.field3753[var36] == 3) {
                    class177.field3014.method2224(var43, class286.field4558 + arg5, arg1 - -class171.field2968, var44, 0, class178.field3022, 150 - class224.field3741[var36]);
                }
                if (class224.field3753[var36] == 4) {
                    int var48 = (150 - class224.field3741[var36]) * (class177.field3014.method2223(var43) + 100) / 150;
                    if (class43.field680) {
                        class169.method1331(arg5 + class286.field4558 - 50, arg1, arg5 + class286.field4558 + 50, arg1 + arg4);
                    } else {
                        class47.method414(class286.field4558 + arg5 - 50, arg1, class286.field4558 + arg5 + 50, arg1 - -arg4);
                    }
                    class177.field3014.method2240(var43, arg5 + class286.field4558 + 50 - var48, class171.field2968 + arg1, var44, 0);
                    if (class43.field680) {
                        class169.method1330(arg5, arg1, arg5 + arg6, arg1 + arg4);
                    } else {
                        class47.method420(arg5, arg1, arg5 + arg6, arg1 + arg4);
                    }
                }
                if (class224.field3753[var36] == 5) {
                    int var49 = 150 - class224.field3741[var36];
                    if (class43.field680) {
                        class169.method1331(arg5, arg1 + class171.field2968 - class177.field3014.field5127 - 1, arg5 + arg6, arg1 + class171.field2968 + 5);
                    } else {
                        class47.method414(arg5, arg1 + class171.field2968 - class177.field3014.field5127 - 1, arg5 - -arg6, arg1 + class171.field2968 + 5);
                    }
                    int var50 = 0;
                    if (var49 < 25) {
                        var50 = var49 - 25;
                    } else if (var49 > 125) {
                        var50 = var49 - 125;
                    }
                    class177.field3014.method2237(var43, class286.field4558 + arg5, arg1 + var50 - -class171.field2968, var44, 0);
                    if (class43.field680) {
                        class169.method1330(arg5, arg1, arg5 + arg6, arg1 + arg4);
                    } else {
                        class47.method420(arg5, arg1, arg5 + arg6, arg1 + arg4);
                    }
                }
            } else {
                class177.field3014.method2237(var43, class286.field4558 + arg5, arg1 - -class171.field2968, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V", line = 538)
    public final void method806(int arg0) {
        super.method806(arg0);
        this.field1465 = null;
        field1461++;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)I", line = 551)
    public final int method807(byte arg0) {
        if (arg0 != -84) {
            this.method185(106, -20, (class336) null);
        }
        field1457++;
        return this.field1464;
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)Z", line = 562)
    public final boolean method808(int arg0) {
        field1466++;
        if (this.field1465 != null) {
            return true;
        } else if (this.field1464 < arg0) {
            return false;
        } else {
            class309 var2 = class38.field568 < 0 ? class248.method1741((byte) 116, this.field1464, class7.field89) : class349.method2441(class7.field89, class38.field568, false, this.field1464);
            var2.method2139();
            this.field1463 = var2.field2967;
            this.field1465 = var2.field4907;
            this.field1459 = var2.field2965;
            return true;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILpi;)V", line = 586)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg0 == 0) {
            this.field1464 = arg2.method2339((byte) -46);
        }
        field1460++;
        if (arg1 != -17848) {
            field1467 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[[I", line = 600)
    public int[][] method299(int arg0, int arg1) {
        field1456++;
        int[][] var3 = this.field4958.method2404(arg0, (byte) 123);
        if (this.field4958.field5463 && this.method808(arg1 ^ 0x2)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field1463 * (class77.field1247 == this.field1459 ? arg0 : this.field1459 * arg0 / class77.field1247);
            if (class133.field2269 == this.field1463) {
                for (int var8 = 0; var8 < class133.field2269; var8++) {
                    int var9 = this.field1465[var7++];
                    var6[var8] = class36.method319(var9, 255) << 4;
                    var5[var8] = class36.method319(var9 >> 4, 4080);
                    var4[var8] = class36.method319(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class133.field2269; var10++) {
                    int var11 = this.field1463 * var10 / class133.field2269;
                    int var12 = this.field1465[var7 + var11];
                    var6[var10] = class36.method319(var12 << 4, 4080);
                    var5[var10] = class36.method319(65280, var12) >> 4;
                    var4[var10] = class36.method319(4080, var12 >> 12);
                }
            }
        }
        if (arg1 != 2) {
            this.field1465 = (int[]) null;
        }
        return var3;
    }
}
