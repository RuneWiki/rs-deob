import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class115 {

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "Lei;")
    private class172 field1954 = new class172();

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "Ltb;")
    private class69 field1961 = new class69();

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    private int field1963;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    private int field1962;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "Lnc;")
    private class85 field1959;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "[I")
    public static int[] field1953 = new int[2500];

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "Lve;")
    public static class189 field1957 = new class189(64);

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "Lid;")
    public static class149 field1967 = class60.method382("Verbindung mit Update)2Server)3)3)3", (byte) 74);

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "[S")
    public static short[] field1964 = new short[] { 33, 8, 51, 9, 31, 40, 34, 17 };

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "Lid;")
    public static class149 field1966 = class60.method382("clignotant2:", (byte) 3);

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field1970 = 0;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "Lid;")
    private static class149 field1972 = class60.method382("slide:", (byte) 65);

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "Lid;")
    public static class149 field1965 = field1972;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "Lid;")
    public static class149 field1971 = field1972;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method797(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1956++;
        class165.field3076 = 0;
        for (int var7 = -1; var7 < class253.field4432 + class182.field3281; var7++) {
            class131 var23;
            if (var7 == -1) {
                var23 = class77.field1449;
            } else if (var7 >= class253.field4432) {
                var23 = class38.field572[class110.field1906[var7 - class253.field4432]];
            } else {
                var23 = class107.field1851[class251.field4407[var7]];
            }
            if (var23 != null && var23.method117((byte) 62)) {
                if (var23 instanceof class20) {
                    class59 var24 = ((class20) var23).field296;
                    if (var24.field1046 != null) {
                        var24 = var24.method374(-1);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (var7 >= class253.field4432) {
                    class59 var25 = ((class20) var23).field296;
                    if (var25.field1046 != null) {
                        var25 = var25.method374(arg6 ^ 0xFFFFFFEB);
                    }
                    if (var25.field1012 >= 0 && class78.field1464.length > var25.field1012) {
                        int var26;
                        if (var25.field1051 == -1) {
                            var26 = var23.method920((byte) 125) + 15;
                        } else {
                            var26 = var25.field1051 + 15;
                        }
                        class191.method1302(arg5 >> 1, (byte) 45, arg4 >> 1, arg3, arg1, var26, var23);
                        if (class245.field4308 > -1) {
                            class78.field1464[var25.field1012].method263(arg2 + class245.field4308 - 12, class181.field3266 + arg0 + -30);
                        }
                    }
                    class180[] var27 = class189.field3396;
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        class180 var29 = var27[var28];
                        if (var29 != null && var29.field3248 == 1 && class110.field1906[var7 - class253.field4432] == var29.field3239 && class118.field2022 % 20 < 10) {
                            int var30;
                            if (var25.field1051 == -1) {
                                var30 = var23.method920((byte) 116) + 15;
                            } else {
                                var30 = var25.field1051 + 15;
                            }
                            class191.method1302(arg5 >> 1, (byte) 45, arg4 >> 1, arg3, arg1, var30, var23);
                            if (class245.field4308 > -1) {
                                class257.field4487[var29.field3253].method263(class245.field4308 + arg2 - 12, class181.field3266 + arg0 + -28);
                            }
                        }
                    }
                } else {
                    int var31 = 30;
                    class127 var32 = (class127) var23;
                    if (var32.field2220 != -1 || var32.field2237 != -1) {
                        class191.method1302(arg5 >> 1, (byte) 45, arg4 >> 1, arg3, arg1, var23.method920((byte) 127) + 15, var23);
                        if (class245.field4308 > -1) {
                            if (var32.field2220 != -1) {
                                class99.field1751[var32.field2220].method263(class245.field4308 + arg2 - 12, class181.field3266 - var31 + arg0);
                                var31 += 25;
                            }
                            if (var32.field2237 != -1) {
                                class78.field1464[var32.field2237].method263(arg2 + class245.field4308 - 12, arg0 - -class181.field3266 + -var31);
                                var31 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class180[] var33 = class189.field3396;
                        for (int var34 = 0; var34 < var33.length; var34++) {
                            class180 var35 = var33[var34];
                            if (var35 != null && var35.field3248 == 10 && class251.field4407[var7] == var35.field3239) {
                                class191.method1302(arg5 >> 1, (byte) 45, arg4 >> 1, arg3, arg1, var23.method920((byte) 115) + 15, var23);
                                if (class245.field4308 > -1) {
                                    class257.field4487[var35.field3253].method263(class245.field4308 + arg2 - 12, class181.field3266 + arg0 + -var31);
                                }
                            }
                        }
                    }
                }
                if (var23.field2337 != null && (var7 >= class253.field4432 || class198.field3591 == 0 || class198.field3591 == 3 || class198.field3591 == 1 && class139.method966(true, ((class127) var23).field2243))) {
                    class191.method1302(arg5 >> 1, (byte) 45, arg4 >> 1, arg3, arg1, var23.method920((byte) 104), var23);
                    if (class245.field4308 > -1 && class171.field3161 > class165.field3076) {
                        class171.field3165[class165.field3076] = class173.field3180.method1161(var23.field2337) / 2;
                        class171.field3164[class165.field3076] = class173.field3180.field2932;
                        class171.field3162[class165.field3076] = class245.field4308;
                        class171.field3160[class165.field3076] = class181.field3266;
                        class171.field3166[class165.field3076] = var23.field2360;
                        class171.field3168[class165.field3076] = var23.field2368;
                        class171.field3163[class165.field3076] = var23.field2387;
                        class171.field3167[class165.field3076] = var23.field2337;
                        class165.field3076++;
                    }
                }
                if (class118.field2022 < var23.field2309) {
                    class190 var36 = class192.field3448[0];
                    class190 var37 = class192.field3448[1];
                    int var41;
                    if (var23 instanceof class20) {
                        class20 var38 = (class20) var23;
                        class190[] var39 = (class190[]) class271.field4879.method1293((long) var38.field296.field1068, false);
                        if (var39 == null) {
                            var39 = class54.method347(var38.field296.field1068, class270.field4864, 2048, 0);
                            if (var39 != null) {
                                class271.field4879.method1295((long) var38.field296.field1068, var39, (byte) -71);
                            }
                        }
                        class59 var40 = var38.field296;
                        if (var39 != null && var39.length == 2) {
                            var37 = var39[1];
                            var36 = var39[0];
                        }
                        if (var40.field1051 == -1) {
                            var41 = var23.method920((byte) 100);
                        } else {
                            var41 = var40.field1051;
                        }
                    } else {
                        var41 = var23.method920((byte) 126);
                    }
                    class191.method1302(arg5 >> 1, (byte) 45, arg4 >> 1, arg3, arg1, var41 + var36.field3398 + 10, var23);
                    if (class245.field4308 > -1) {
                        int var42 = arg0 + class181.field3266 - 3;
                        int var43 = class245.field4308 + arg2 - (var36.field3399 >> 1);
                        var36.method263(var43, var42);
                        int var44 = var36.field3398;
                        int var45 = var23.field2375 * var36.field3399 / 255;
                        class72.method449(var43, var42, var43 + var45, var42 + var44);
                        var37.method263(var43, var42);
                        class72.method461(arg2, arg0, arg2 + arg4, arg0 + arg5);
                    }
                }
                for (int var46 = 0; var46 < 4; var46++) {
                    if (var23.field2311[var46] > class118.field2022) {
                        int var49;
                        if (var23 instanceof class20) {
                            class20 var47 = (class20) var23;
                            class59 var48 = var47.field296;
                            if (var48.field1051 == -1) {
                                var49 = var23.method920((byte) 100) / 2;
                            } else {
                                var49 = var48.field1051 / 2;
                            }
                        } else {
                            var49 = var23.method920((byte) 104) / 2;
                        }
                        class191.method1302(arg5 >> 1, (byte) 45, arg4 >> 1, arg3, arg1, var49, var23);
                        if (class245.field4308 > -1) {
                            if (var46 == 1) {
                                class181.field3266 -= 20;
                            }
                            if (var46 == 2) {
                                class245.field4308 -= 15;
                                class181.field3266 -= 10;
                            }
                            if (var46 == 3) {
                                class245.field4308 += 15;
                                class181.field3266 -= 10;
                            }
                            class244.field4278[var23.field2377[var46]].method263(arg2 - (12 - class245.field4308), arg0 + -12 - -class181.field3266);
                            class188.field3364.method1156(class211.method1434(var23.field2388[var46], true), class245.field4308 + arg2 - 1, arg0 - (-class181.field3266 - 3), 16777215, 0);
                        }
                    }
                }
            }
        }
        int var8 = 0;
        if (arg6 != 20) {
            return;
        }
        while (class165.field3076 > var8) {
            int var9 = class171.field3162[var8];
            int var10 = class171.field3160[var8];
            int var11 = class171.field3165[var8];
            int var12 = class171.field3164[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if (class171.field3160[var22] - class171.field3164[var22] < var10 + 2 && (var10 - var12) < (class171.field3160[var22] + 2) && var9 - var11 < class171.field3165[var22] + class171.field3162[var22] && (class171.field3162[var22] - class171.field3165[var22]) < (var9 + var11) && class171.field3160[var22] - class171.field3164[var22] < var10) {
                        var10 = class171.field3160[var22] - class171.field3164[var22];
                        var13 = true;
                    }
                }
            }
            class245.field4308 = class171.field3162[var8];
            class181.field3266 = class171.field3160[var8] = var10;
            class149 var14 = class171.field3167[var8];
            if (class165.field3075 == 0) {
                int var15 = 16776960;
                if (class171.field3166[var8] < 6) {
                    var15 = class32.field484[class171.field3166[var8]];
                }
                if (class171.field3166[var8] == 6) {
                    var15 = (class86.field1567 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class171.field3166[var8] == 7) {
                    var15 = class86.field1567 % 20 < 10 ? 255 : 65535;
                }
                if (class171.field3166[var8] == 8) {
                    var15 = class86.field1567 % 20 < 10 ? 45056 : 8454016;
                }
                if (class171.field3166[var8] == 9) {
                    int var16 = 150 - class171.field3163[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16776960 - (var16 - 50) * 327680;
                    } else if (var16 < 150) {
                        var15 = (var16 * 5) + 65280 - 500;
                    }
                }
                if (class171.field3166[var8] == 10) {
                    int var17 = 150 - class171.field3163[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 - ((var17 - 50) * 327680);
                    } else if (var17 < 150) {
                        var15 = 255 - (32768000 - (var17 * 327680)) - (var17 + -100) * 5;
                    }
                }
                if (class171.field3166[var8] == 11) {
                    int var18 = 150 - class171.field3163[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - var18 * 327685;
                    } else if (var18 < 100) {
                        var15 = (var18 - 50) * 327685 + 65280;
                    } else if (var18 < 150) {
                        var15 = 16777215 + 32768000 - var18 * 327680;
                    }
                }
                if (class171.field3168[var8] == 0) {
                    class173.field3180.method1156(var14, class245.field4308 + arg2, arg0 - -class181.field3266, var15, 0);
                }
                if (class171.field3168[var8] == 1) {
                    class173.field3180.method1160(var14, arg2 + class245.field4308, class181.field3266 + arg0, var15, 0, class86.field1567);
                }
                if (class171.field3168[var8] == 2) {
                    class173.field3180.method1155(var14, class245.field4308 + arg2, class181.field3266 + arg0, var15, 0, class86.field1567);
                }
                if (class171.field3168[var8] == 3) {
                    class173.field3180.method1158(var14, class245.field4308 + arg2, class181.field3266 + arg0, var15, 0, class86.field1567, 150 - class171.field3163[var8]);
                }
                if (class171.field3168[var8] == 4) {
                    int var19 = (150 - class171.field3163[var8]) * (class173.field3180.method1161(var14) + 100) / 150;
                    class72.method449(arg2 + class245.field4308 - 50, arg0, class245.field4308 + arg2 + 50, arg0 + arg5);
                    class173.field3180.method1168(var14, class245.field4308 + arg2 - (-50 - -var19), class181.field3266 + arg0, var15, 0);
                    class72.method461(arg2, arg0, arg2 + arg4, arg0 - -arg5);
                }
                if (class171.field3168[var8] == 5) {
                    int var20 = 150 - class171.field3163[var8];
                    class72.method449(arg2, arg0 + class181.field3266 - class173.field3180.field2932 - 1, arg2 + arg4, arg0 + class181.field3266 + 5);
                    int var21 = 0;
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class173.field3180.method1156(var14, class245.field4308 + arg2, arg0 + var21 + class181.field3266, var15, 0);
                    class72.method461(arg2, arg0, arg2 + arg4, arg0 + arg5);
                }
            } else {
                class173.field3180.method1156(var14, arg2 + class245.field4308, class181.field3266 + arg0, 16776960, 0);
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
    public static void method798(boolean arg0) {
        if (arg0) {
            return;
        }
        field1966 = null;
        field1965 = null;
        field1953 = null;
        field1971 = null;
        field1967 = null;
        field1964 = null;
        field1972 = null;
        field1957 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Ljf;")
    public final class64 method799(byte arg0) {
        int var2 = -33 % ((-arg0 - 22) / 38);
        field1951++;
        return this.field1959.method630(11);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IJ)Lei;")
    public final class172 method800(int arg0, long arg1) {
        field1952++;
        class172 var4 = (class172) this.field1959.method639((byte) -73, arg1);
        if (arg0 != 261775) {
            this.method800(-117, 85L);
        }
        if (var4 != null) {
            this.field1961.method433(var4, -225);
        }
        return var4;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)Ljf;")
    public final class64 method801(int arg0) {
        if (arg0 == 3) {
            field1958++;
            return this.field1959.method633((byte) 24);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(JILei;)V")
    public final void method802(long arg0, int arg1, class172 arg2) {
        field1960++;
        if (this.field1963 == arg1) {
            class172 var5 = this.field1961.method427((byte) -123);
            var5.method401((byte) -118);
            var5.method1230(arg1 + 24120);
            if (this.field1954 == var5) {
                class172 var6 = this.field1961.method427((byte) 12);
                var6.method401((byte) -118);
                var6.method1230(24120);
            }
        } else {
            this.field1963--;
        }
        this.field1959.method638((byte) -89, arg2, arg0);
        this.field1961.method433(arg2, arg1 - 225);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)I")
    public static final int method803(int arg0, byte arg1) {
        field1955++;
        int var2 = -87 / ((-arg1 - 76) / 42);
        return (arg0 & 0x3FE8F) >> 11;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public final void method804(int arg0) {
        this.field1961.method435((byte) -109);
        field1950++;
        this.field1959.method628(true);
        if (arg0 != 20) {
            field1972 = null;
        }
        this.field1954 = new class172();
        this.field1963 = this.field1962;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I)V")
    public class115(int arg0) {
        this.field1963 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field1962 = arg0;
        this.field1959 = new class85(var2);
    }
}
