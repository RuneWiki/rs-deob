import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class35 extends class51 {

    @OriginalMember(owner = "client!de", name = "db", descriptor = "I")
    private int field632 = 16;

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "I")
    private int field630 = 0;

    @OriginalMember(owner = "client!de", name = "nb", descriptor = "I")
    private int field642 = 0;

    @OriginalMember(owner = "client!de", name = "kb", descriptor = "I")
    private int field639 = 4096;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "I")
    private int field629 = 2000;

    @OriginalMember(owner = "client!de", name = "fb", descriptor = "[I")
    public static int[] field634 = new int[2000];

    @OriginalMember(owner = "client!de", name = "jb", descriptor = "Led;")
    public static class43 field638 = class191.method1219("Abbrechen", false);

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
    public static int field631 = 0;

    @OriginalMember(owner = "client!de", name = "ob", descriptor = "I")
    public static int field643 = 0;

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!de", name = "eb", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!de", name = "gb", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!de", name = "hb", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!de", name = "ib", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!de", name = "lb", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!de", name = "mb", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!de", name = "pb", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!de", name = "rb", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!de", name = "qb", descriptor = "Ltg;")
    public static class179 field645;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)V")
    public static final void method197(byte arg0, int arg1) {
        ++field637;
        if (arg0 < -43) {
            if (class174.field3473 != arg1) {
                if (class174.field3473 == 0) {
                    class103.method639((byte) -72);
                }
                if (arg1 == 20 || arg1 == 40) {
                    class12.field180 = 0;
                    class18.field304 = 0;
                    class76.field1535 = 0;
                }
                if (arg1 != 20 && ~arg1 != -41 && class117.field2288 != null) {
                    class117.field2288.method522(-23002);
                    class117.field2288 = null;
                }
                if (~class174.field3473 == -26) {
                    class159.field3224 = 1;
                    class205.field3998 = 0;
                    class131.field2744 = 0;
                    class121.field2413 = 0;
                    class106.field2026 = 1;
                }
                if (arg1 != 5 && arg1 != 10 && arg1 != 20) {
                    class87.method521(28148);
                } else {
                    class173.method1095(class58.field1166, 256, class100.field1911, class157.field3171);
                }
                class174.field3473 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
    public static void method198(int arg0) {
        field645 = null;
        field638 = null;
        int var1 = -20 / ((-60 - arg0) / 52);
        field634 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 == -5) {
                            this.field639 = arg0.method555(-1113627096);
                        }
                    } else {
                        this.field630 = arg0.method555(-1113627096);
                    }
                } else {
                    this.field632 = arg0.method538((byte) -102);
                }
            } else {
                this.field629 = arg0.method555(arg1 + -1113627096);
            }
        } else {
            this.field642 = arg0.method538((byte) -116);
        }
        ++field641;
        if (arg1 != 0) {
            this.field630 = -60;
        }
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
    public final void method64(int arg0) {
        ++field640;
        class159.method999((byte) 13);
        if (arg0 >= -83) {
            this.field639 = -125;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ[BI)Z")
    public static final boolean method199(int arg0, boolean arg1, byte[] arg2, int arg3) {
        class89 var4 = new class89(arg2);
        ++field644;
        boolean var5 = true;
        if (arg1) {
            return false;
        } else {
            int var6 = -1;
            label58: while (true) {
                int var7 = var4.method533((byte) 75);
                if (~var7 == -1) {
                    return var5;
                }
                var6 += var7;
                int var8 = 0;
                boolean var9 = false;
                while (true) {
                    while (!var9) {
                        int var11 = var4.method533((byte) 75);
                        if (~var11 == -1) {
                            continue label58;
                        }
                        var8 += var11 + -1;
                        int var12 = (var8 & 4091) >> 6;
                        int var13 = 63 & var8;
                        int var14 = var4.method538((byte) 115) >> 2;
                        int var15 = arg0 + var12;
                        int var16 = arg3 + var13;
                        if (var15 > 0 && var16 > 0 && ~var15 > -104 && var16 < 103) {
                            class23 var17 = class92.method592(var6, (byte) 103);
                            if (var14 != 22 || !class9.field163 || ~var17.field422 != -1 || ~var17.field406 == -2 || var17.field444) {
                                var9 = true;
                                if (!var17.method114(65535)) {
                                    ++class121.field2413;
                                    var5 = false;
                                }
                            }
                        }
                    }
                    int var10 = var4.method533((byte) 75);
                    if (var10 == 0) {
                        break;
                    }
                    var4.method538((byte) 98);
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(IIIII)V")
    public static final void method200(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 40) {
            field643 = -35;
        }
        if (class148.field3024 == 1) {
            class4.field89[class13.field201 / 100].method788(class52.field1050 + -8, class99.field1901 + -8);
        }
        if (class148.field3024 == 2) {
            class4.field89[class13.field201 / 100 + 4].method788(class52.field1050 + -8, class99.field1901 + -8);
        }
        ++field635;
        class145.method918((byte) 59);
        if (class34.field624) {
            int var5 = arg2 + 512 - 5;
            int var6 = 16776960;
            int var7 = arg4 - -20;
            class23.field451.method949(class167.method1036(new class43[] { class17.field283, class30.method161(class19.field334, 10) }, true), var5, var7, 16776960, -1);
            int var10 = var7 + 15;
            Runtime var8 = Runtime.getRuntime();
            int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
            if (var9 > 32768 && class9.field163) {
                var6 = 16711680;
            }
            if (var9 > 65536 && !class9.field163) {
                var6 = 16711680;
            }
            class23.field451.method949(class167.method1036(new class43[] { class47.field950, class30.method161(var9, arg0 + -30), class38.field728 }, true), var5, var10, var6, -1);
            var7 = var10 + 15;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Led;I)Z")
    public static final boolean method201(class43 arg0, int arg1) {
        ++field646;
        if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; ~class73.field1457 < ~var2; ++var2) {
                if (arg0.method250(63, class185.field3640[var2])) {
                    return true;
                }
            }
            if (arg1 != 7) {
                method199(-86, true, (byte[]) null, 107);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class35() {
        super(0, true);
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V")
    public static final void method202(int arg0) {
        ++field633;
        if (~class18.field298 == -50) {
            int var1 = class38.field723.method538((byte) 85);
            int var2 = (var1 >> 4 & 7) + class93.field1834;
            int var3 = (7 & var1) + class38.field724;
            int var4 = class38.field723.method555(-1113627096);
            int var5 = class38.field723.method555(arg0 + -1113627100);
            int var6 = class38.field723.method555(-1113627096);
            if (~var2 <= -1 && ~var3 <= -1 && ~var2 > -105 && var3 < 104) {
                class118 var7 = class46.field922[class93.field1839][var2][var3];
                if (var7 != null) {
                    for (class207 var8 = (class207) var7.method753(arg0 + -26707); var8 != null; var8 = (class207) var7.method755((byte) 123)) {
                        if (~(var4 & 32767) == ~var8.field4040 && var8.field4046 == var5) {
                            var8.field4046 = var6;
                            break;
                        }
                    }
                    class122.method798(var3, (byte) 15, var2);
                }
            }
        } else if (~class18.field298 == -236) {
            int var9 = class38.field723.method544(true);
            int var10 = class38.field723.method538((byte) -93);
            int var11 = (var10 >> 4 & 7) + class93.field1834;
            int var12 = class38.field724 - -(var10 & 7);
            if (~var11 <= -1 && var12 >= 0 && ~var11 > -105 && var12 < 104) {
                class118 var13 = class46.field922[class93.field1839][var11][var12];
                if (var13 != null) {
                    for (class207 var14 = (class207) var13.method753(-26703); var14 != null; var14 = (class207) var13.method755((byte) 119)) {
                        if ((var9 & 32767) == var14.field4040) {
                            var14.method417(arg0 ^ 10);
                            break;
                        }
                    }
                    if (var13.method753(-26703) == null) {
                        class46.field922[class93.field1839][var11][var12] = null;
                    }
                    class122.method798(var12, (byte) 15, var11);
                }
            }
        } else if (~class18.field298 == -65) {
            int var15 = class38.field723.method543(-6);
            int var16 = var15 >> 2;
            int var17 = var15 & 3;
            int var18 = class50.field1014[var16];
            int var19 = class38.field723.method578(arg0 ^ 4);
            int var20 = ((127 & var19) >> 4) + class93.field1834;
            int var21 = (7 & var19) + class38.field724;
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                class75.method463(var17, class93.field1839, 8, -1, 0, var21, var20, var16, -1, var18);
            }
        } else {
            if (~class18.field298 == -190) {
                int var22 = class38.field723.method538((byte) 92);
                int var23 = (var22 & 7) + class38.field724;
                int var24 = class93.field1834 - -((118 & var22) >> 4);
                int var25 = class38.field723.method555(-1113627096);
                int var26 = class38.field723.method538((byte) 106);
                int var27 = var26 & 7;
                int var28 = 15 & var26 >> 4;
                int var29 = class38.field723.method538((byte) 84);
                if (~var24 <= -1 && ~var23 <= -1 && ~var24 > -105 && var23 < 104) {
                    int var30 = var28 - -1;
                    if (~class67.field1348.field2357[0] <= ~(-var30 + var24) && ~class67.field1348.field2357[0] >= ~(var24 + var30) && ~(var23 - var30) >= ~class67.field1348.field2335[0] && ~(var23 + var30) <= ~class67.field1348.field2335[0] && class116.field2277 != 0 && ~var27 < -1 && ~class36.field650 > -51) {
                        class20.field346[class36.field650] = var25;
                        class156.field3163[class36.field650] = var27;
                        class76.field1503[class36.field650] = var29;
                        class49.field995[class36.field650] = null;
                        class9.field168[class36.field650] = (var24 << 16) - -(var23 << 8) + var28;
                        ++class36.field650;
                    }
                }
            }
            if (class18.field298 == 188) {
                int var31 = class38.field723.method538((byte) 104);
                int var32 = var31 >> 2;
                int var33 = var31 & 3;
                int var34 = class50.field1014[var32];
                int var35 = class38.field723.method543(-6);
                int var36 = class93.field1834 - -((var35 & 118) >> 4);
                int var37 = (var35 & 7) + class38.field724;
                int var38 = class38.field723.method563(-25695);
                if (var36 >= 0 && var37 >= 0 && var36 < 103 && var37 < 103) {
                    if (var34 == 0) {
                        class83 var39 = class137.field2842.method1142(class93.field1839, var36, var37);
                        if (var39 != null) {
                            int var40 = 32767 & var39.field1633 >> 14;
                            if (var32 == 2) {
                                var39.field1629 = new class157(var40, 2, var33 + 4, class93.field1839, var36, var37, var38, false, var39.field1629);
                                var39.field1634 = new class157(var40, 2, 3 & var33 + 1, class93.field1839, var36, var37, var38, false, var39.field1634);
                            } else {
                                var39.field1629 = new class157(var40, var32, var33, class93.field1839, var36, var37, var38, false, var39.field1629);
                            }
                        }
                    }
                    if (var34 == 1) {
                        class158 var41 = class137.field2842.method1147(class93.field1839, var36, var37);
                        if (var41 != null) {
                            int var42 = (var41.field3193 & 536864116) >> 14;
                            if (~var32 != -5 && ~var32 != -6) {
                                if (~var32 == -7) {
                                    var41.field3190 = new class157(var42, 4, var33 + 4, class93.field1839, var36, var37, var38, false, var41.field3190);
                                } else if (~var32 != -8) {
                                    if (~var32 == -9) {
                                        var41.field3190 = new class157(var42, 4, var33 + 4, class93.field1839, var36, var37, var38, false, var41.field3190);
                                        var41.field3195 = new class157(var42, 4, (3 & var33 + 2) - -4, class93.field1839, var36, var37, var38, false, var41.field3195);
                                    }
                                } else {
                                    var41.field3190 = new class157(var42, 4, (var33 + 2 & 3) + 4, class93.field1839, var36, var37, var38, false, var41.field3190);
                                }
                            } else {
                                var41.field3190 = new class157(var42, 4, var33, class93.field1839, var36, var37, var38, false, var41.field3190);
                            }
                        }
                    }
                    if (~var34 == -3) {
                        if (var32 == 11) {
                            var32 = 10;
                        }
                        class6 var43 = class137.field2842.method1133(class93.field1839, var36, var37);
                        if (var43 != null) {
                            var43.field127 = new class157(32767 & var43.field130 >> 14, var32, var33, class93.field1839, var36, var37, var38, false, var43.field127);
                        }
                    }
                    if (var34 == 3) {
                        class191 var44 = class137.field2842.method1159(class93.field1839, var36, var37);
                        if (var44 != null) {
                            var44.field3717 = new class157(var44.field3728 >> 14 & 32767, 22, var33, class93.field1839, var36, var37, var38, false, var44.field3717);
                        }
                    }
                }
            } else if (~class18.field298 == -227) {
                int var45 = class38.field723.method563(-25695);
                int var46 = class38.field723.method538((byte) 77);
                int var47 = ((116 & var46) >> 4) + class93.field1834;
                int var48 = class38.field724 - -(var46 & 7);
                int var49 = class38.field723.method544(true);
                int var50 = class38.field723.method555(-1113627096);
                if (var47 >= 0 && var48 >= 0 && var47 < 104 && ~var48 > -105 && ~class80.field1593 != ~var50) {
                    class207 var51 = new class207();
                    var51.field4040 = var45;
                    var51.field4046 = var49;
                    if (class46.field922[class93.field1839][var47][var48] == null) {
                        class46.field922[class93.field1839][var47][var48] = new class118();
                    }
                    class46.field922[class93.field1839][var47][var48].method756(25541, var51);
                    class122.method798(var48, (byte) 15, var47);
                }
            } else {
                if (class18.field298 == 143) {
                    int var52 = class38.field723.method579(105);
                    byte var53 = class38.field723.method531((byte) -95);
                    int var54 = class38.field723.method560((byte) -69);
                    int var55 = (var54 >> 4 & 7) + class93.field1834;
                    int var56 = (7 & var54) + class38.field724;
                    byte var57 = class38.field723.method577((byte) 30);
                    int var58 = class38.field723.method579(125);
                    byte var59 = class38.field723.method577((byte) 30);
                    byte var60 = class38.field723.method577((byte) 30);
                    int var61 = class38.field723.method563(-25695);
                    int var62 = class38.field723.method578(0);
                    int var63 = 3 & var62;
                    int var64 = var62 >> 2;
                    int var65 = class50.field1014[var64];
                    int var66 = class38.field723.method544(true);
                    class1 var67;
                    if (~class80.field1593 == ~var52) {
                        var67 = class67.field1348;
                    } else {
                        var67 = class12.field183[var52];
                    }
                    if (var67 != null) {
                        class23 var68 = class92.method592(var58, (byte) 96);
                        int var69;
                        int var70;
                        if (~var63 != -2 && ~var63 != -4) {
                            var69 = var68.field423;
                            var70 = var68.field424;
                        } else {
                            var69 = var68.field424;
                            var70 = var68.field423;
                        }
                        int var71 = (var69 >> 1) + var55;
                        int var72 = (var69 + 1 >> 1) + var55;
                        int var73 = (var70 >> 1) + var56;
                        int var74 = (var70 + 1 >> 1) + var56;
                        int[][] var75 = class158.field3203[class93.field1839];
                        int var76 = (var55 << 7) + (var69 << 6);
                        int var77 = var75[var71][var73] - -var75[var72][var74] + var75[var71][var74] + var75[var72][var73] >> 2;
                        int var78 = (var56 << 7) + (var70 << 6);
                        class199 var79 = var68.method109(var76, 94, var63, var77, var75, var78, var64);
                        if (var79 != null) {
                            if (var57 < var60) {
                                byte var80 = var60;
                                var60 = var57;
                                var57 = var80;
                            }
                            class75.method463(0, class93.field1839, 8, -1, var61 + 1, var56, var55, 0, var66 + 1, var65);
                            var67.field3 = client.field559 + var66;
                            var67.field6 = var79;
                            var67.field27 = var55 + var60;
                            var67.field7 = client.field559 + var61;
                            var67.field19 = var55 + var57;
                            var67.field5 = var55 * 128 - -(var69 * 64);
                            if (var53 < var59) {
                                byte var81 = var59;
                                var59 = var53;
                                var53 = var81;
                            }
                            var67.field12 = var53 + var56;
                            var67.field11 = var56 * 128 + var70 * 64;
                            var67.field17 = var77;
                            var67.field22 = var56 + var59;
                        }
                    }
                }
                if (arg0 != 4) {
                    field638 = null;
                }
                if (~class18.field298 == -206) {
                    int var82 = class38.field723.method538((byte) -76);
                    int var83 = class38.field724 - -(7 & var82);
                    int var84 = ((124 & var82) >> 4) + class93.field1834;
                    int var85 = class38.field723.method555(arg0 ^ -1113627092);
                    int var86 = class38.field723.method538((byte) -65);
                    int var87 = class38.field723.method555(arg0 + -1113627100);
                    if (~var84 <= -1 && ~var83 <= -1 && var84 < 104 && var83 < 104) {
                        int var88 = var83 * 128 + 64;
                        int var89 = var84 * 128 + 64;
                        class125 var90 = new class125(var85, class93.field1839, var89, var88, -var86 + class108.method668(var88, var89, -128, class93.field1839), var87, client.field559);
                        class54.field1081.method756(25541, var90);
                    }
                } else if (class18.field298 == 133) {
                    int var91 = class38.field723.method538((byte) -90);
                    int var92 = ((115 & var91) >> 4) + class93.field1834;
                    int var93 = (var91 & 7) + class38.field724;
                    int var94 = class38.field723.method577((byte) 30) + var92;
                    int var95 = class38.field723.method577((byte) 30) + var93;
                    int var96 = class38.field723.method552((byte) -109);
                    int var97 = class38.field723.method555(-1113627096);
                    int var98 = 4 * class38.field723.method538((byte) -74);
                    int var99 = 4 * class38.field723.method538((byte) 122);
                    int var100 = class38.field723.method555(-1113627096);
                    int var101 = class38.field723.method555(-1113627096);
                    int var102 = class38.field723.method538((byte) -39);
                    int var103 = class38.field723.method538((byte) 118);
                    if (var92 >= 0 && ~var93 <= -1 && var92 < 104 && var93 < 104 && var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104 && var97 != 65535) {
                        int var104 = var95 * 128 - -64;
                        int var105 = var93 * 128 + 64;
                        int var106 = var92 * 128 + 64;
                        class127 var107 = new class127(var97, class93.field1839, var106, var105, class108.method668(var105, var106, -127, class93.field1839) + -var98, client.field559 + var100, var101 - -client.field559, var102, var103, var96, var99);
                        int var108 = var94 * 128 + 64;
                        var107.method816(var100 - -client.field559, -var99 + class108.method668(var104, var108, arg0 + -131, class93.field1839), 1, var104, var108);
                        class100.field1915.method756(25541, var107);
                    }
                } else if (class18.field298 == 136) {
                    int var109 = class38.field723.method563(arg0 ^ -25691);
                    int var110 = class38.field723.method555(-1113627096);
                    int var111 = class38.field723.method543(-6);
                    int var112 = ((var111 & 121) >> 4) + class93.field1834;
                    int var113 = class38.field724 - -(7 & var111);
                    if (var112 >= 0 && var113 >= 0 && ~var112 > -105 && var113 < 104) {
                        class207 var114 = new class207();
                        var114.field4046 = var110;
                        var114.field4040 = var109;
                        if (class46.field922[class93.field1839][var112][var113] == null) {
                            class46.field922[class93.field1839][var112][var113] = new class118();
                        }
                        class46.field922[class93.field1839][var112][var113].method756(25541, var114);
                        class122.method798(var113, (byte) 15, var112);
                    }
                } else if (~class18.field298 == -248) {
                    int var115 = class38.field723.method538((byte) 82);
                    int var116 = var115 >> 2;
                    int var117 = var115 & 3;
                    int var118 = class50.field1014[var116];
                    int var119 = class38.field723.method579(98);
                    int var120 = class38.field723.method538((byte) 112);
                    int var121 = (7 & var120 >> 4) + class93.field1834;
                    int var122 = (7 & var120) + class38.field724;
                    if (var121 >= 0 && var122 >= 0 && var121 < 104 && ~var122 > -105) {
                        class75.method463(var117, class93.field1839, 8, var119, 0, var122, var121, var116, -1, var118);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field628;
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            int var4 = this.field639 >> 1;
            int[][] var5 = super.field1025.method42((byte) -128);
            Random var6 = new Random((long) this.field642);
            for (int var7 = 0; ~this.field629 < ~var7; ++var7) {
                int var8 = ~this.field639 < -1 ? this.field630 + -var4 + class153.method970((byte) 122, var6, this.field639) : this.field630;
                int var9 = class153.method970((byte) 80, var6, class122.field2442);
                int var10 = class153.method970((byte) 115, var6, class112.field2144);
                int var11 = 255 & var8 >> 4;
                int var12 = (class122.field2451[var11] * this.field632 >> 12) + var9;
                int var13 = (class49.field981[var11] * this.field632 >> 12) + var10;
                int var14 = var12 - var9;
                int var15 = -var10 + var13;
                if (var14 != 0 || var15 != 0) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var15 < ~var14;
                    if (var16) {
                        int var17 = var12;
                        var12 = var13;
                        var13 = var17;
                        int var18 = var9;
                        var9 = var10;
                        var10 = var18;
                    }
                    if (var12 < var9) {
                        int var19 = var9;
                        var9 = var12;
                        int var20 = var10;
                        var10 = var13;
                        var13 = var20;
                        var12 = var19;
                    }
                    int var21 = var10;
                    int var22 = -var9 + var12;
                    int var23 = -var10 + var13;
                    int var24 = var10 < var13 ? 1 : -1;
                    int var25 = 1024 + -(class153.method970((byte) 59, var6, 4096) >> 2);
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var26 = 2048 / var22;
                    int var27 = -var22 / 2;
                    for (int var28 = var9; ~var28 > ~var12; ++var28) {
                        var27 += var23;
                        int var29 = (-var9 + var28) * var26 + var25 + 1024;
                        int var30 = class108.field2080 & var28;
                        int var31 = var21 & class71.field1407;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var27 > 0) {
                            var21 -= -var24;
                            var27 += -var22;
                        }
                    }
                }
            }
        }
        if (arg0 != 16) {
            field638 = null;
        }
        return var3;
    }
}
