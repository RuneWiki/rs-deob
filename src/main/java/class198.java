import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class198 extends class223 {

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    private final int field3287;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    private final int field3291;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    private final int field3298;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    private final int field3293;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field3292 = -1;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field3295 = 0;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "[I")
    public static int[] field3296 = new int[128];

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "Z")
    public static boolean field3304 = false;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "[I")
    public static int[] field3288;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V", line = 9)
    public static void method1389(byte arg0) {
        if (arg0 < 11) {
            field3295 = -110;
        }
        field3288 = null;
        field3296 = null;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(IIIIII)V", line = 21)
    public class198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3287 = arg0;
        this.field3291 = arg1;
        this.field3298 = arg2;
        this.field3293 = arg3;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([BII)I", line = 37)
    public static final int method1390(byte[] arg0, int arg1, int arg2) {
        field3301++;
        if (arg2 != 0) {
            field3304 = true;
        }
        return class8.method51(arg0, arg2 + 255, 0, arg1);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(III)V", line = 55)
    public final void method1391(int arg0, int arg1, int arg2) {
        if (arg0 <= 83) {
            field3295 = 123;
        }
        field3302++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZII)V", line = 66)
    public final void method1392(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field3292 = -11;
        }
        field3299++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIZ)V", line = 80)
    public static final void method1393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3300++;
        class188.field3059 = 0;
        for (int var7 = -1; var7 < class253.field4233 + class139.field2248; var7++) {
            class306 var8;
            if (var7 == -1) {
                var8 = class230.field3820;
            } else if (var7 < class139.field2248) {
                var8 = class114.field1931[class166.field2708[var7]];
            } else {
                var8 = class187.field3035[class162.field2620[var7 - class139.field2248]];
            }
            if (var8 != null && var8.method1459(0)) {
                if (var8 instanceof class217) {
                    class313 var9 = ((class217) var8).field3559;
                    if (var9.field5262 != null) {
                        var9 = var9.method2118(0);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class139.field2248) {
                    class313 var15 = ((class217) var8).field3559;
                    if (var15.field5262 != null) {
                        var15 = var15.method2118(0);
                    }
                    if (var15.field5309 >= 0 && var15.field5309 < class145.field2355.length) {
                        int var16;
                        if (var15.field5329 == -1) {
                            var16 = var8.method2061(!arg6) + 15;
                        } else {
                            var16 = var15.field5329 + 15;
                        }
                        class307.method2074(arg0, var8, 600, arg2 >> 1, var16, arg4 >> 1, arg5);
                        if (class40.field652 > -1) {
                            class145.field2355[var15.field5309].method653(arg3 + class40.field652 - 12, class191.field3105 + arg1 + -30);
                        }
                    }
                    class240[] var17 = class162.field2606;
                    for (int var18 = 0; var18 < var17.length; var18++) {
                        class240 var19 = var17[var18];
                        if (var19 != null && var19.field3977 == 1 && class162.field2620[var7 - class139.field2248] == var19.field3979 && (class319.field5393 % 20) < 10) {
                            int var20;
                            if (var15.field5329 == -1) {
                                var20 = var8.method2061(!arg6) + 15;
                            } else {
                                var20 = var15.field5329 + 15;
                            }
                            class307.method2074(arg0, var8, 600, arg2 >> 1, var20, arg4 >> 1, arg5);
                            if (class40.field652 > -1) {
                                class300.field4872[var19.field3969].method653(arg3 - (12 - class40.field652), class191.field3105 + -28 + arg1);
                            }
                        }
                    }
                } else {
                    int var10 = 30;
                    class209 var11 = (class209) var8;
                    if (var11.field3458 != -1 || var11.field3475 != -1) {
                        class307.method2074(arg0, var8, 600, arg2 >> 1, var8.method2061(!arg6) + 15, arg4 >> 1, arg5);
                        if (class40.field652 > -1) {
                            if (var11.field3458 != -1) {
                                class250.field4161[var11.field3458].method653(class40.field652 + arg3 - 12, class191.field3105 + arg1 + -var10);
                                var10 += 25;
                            }
                            if (var11.field3475 != -1) {
                                class145.field2355[var11.field3475].method653(class40.field652 + arg3 - 12, arg1 - var10 + class191.field3105);
                                var10 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class240[] var12 = class162.field2606;
                        for (int var13 = 0; var13 < var12.length; var13++) {
                            class240 var14 = var12[var13];
                            if (var14 != null && var14.field3977 == 10 && class166.field2708[var7] == var14.field3979) {
                                class307.method2074(arg0, var8, 600, arg2 >> 1, var8.method2061(true) + 15, arg4 >> 1, arg5);
                                if (class40.field652 > -1) {
                                    class300.field4872[var14.field3969].method653(class40.field652 + arg3 - 12, class191.field3105 + arg1 + -var10);
                                }
                            }
                        }
                    }
                }
                if (var8.field5134 != null && (var7 >= class139.field2248 || class25.field322 == 0 || class25.field322 == 3 || class25.field322 == 1 && class269.method1869((byte) 3, ((class209) var8).field3463))) {
                    class307.method2074(arg0, var8, 600, arg2 >> 1, var8.method2061(!arg6), arg4 >> 1, arg5);
                    if (class40.field652 > -1 && class188.field3059 < class269.field4529) {
                        class269.field4531[class188.field3059] = class213.field3517.method258(var8.field5134) / 2;
                        class269.field4506[class188.field3059] = class213.field3517.field504;
                        class269.field4515[class188.field3059] = class40.field652;
                        class269.field4499[class188.field3059] = class191.field3105;
                        class269.field4501[class188.field3059] = var8.field5150;
                        class269.field4528[class188.field3059] = var8.field5113;
                        class269.field4497[class188.field3059] = var8.field5132;
                        class269.field4524[class188.field3059] = var8.field5134;
                        class188.field3059++;
                    }
                }
                if (class319.field5393 < var8.field5099) {
                    class293 var21 = class37.field602[0];
                    class293 var22 = class37.field602[1];
                    int var26;
                    if (var8 instanceof class217) {
                        class217 var23 = (class217) var8;
                        class293[] var24 = (class293[]) ((class293[]) client.field5418.method1413((long) var23.field3559.field5295, true));
                        if (var24 == null) {
                            var24 = class71.method559(var23.field3559.field5295, 0, 0, class209.field3442);
                            if (var24 != null) {
                                client.field5418.method1419((long) var23.field3559.field5295, 5216, var24);
                            }
                        }
                        class313 var25 = var23.field3559;
                        if (var24 != null && var24.length == 2) {
                            var22 = var24[1];
                            var21 = var24[0];
                        }
                        if (var25.field5329 == -1) {
                            var26 = var8.method2061(true);
                        } else {
                            var26 = var25.field5329;
                        }
                    } else {
                        var26 = var8.method2061(true);
                    }
                    class307.method2074(arg0, var8, 600, arg2 >> 1, var26 + var21.field4786 + 10, arg4 >> 1, arg5);
                    if (class40.field652 > -1) {
                        int var27 = arg3 + class40.field652 - (var21.field4785 >> 1);
                        int var28 = arg1 + class191.field3105 - 3;
                        var21.method653(var27, var28);
                        int var29 = var8.field5152 * var21.field4785 / 255;
                        int var30 = var21.field4786;
                        if (class99.field1675) {
                            class212.method1491(var27, var28, var27 + var29, var28 + var30);
                        } else {
                            class210.method1471(var27, var28, var27 + var29, var28 + var30);
                        }
                        var22.method653(var27, var28);
                        if (class99.field1675) {
                            class212.method1502(arg3, arg1, arg3 + arg2, arg1 - -arg4);
                        } else {
                            class210.method1472(arg3, arg1, arg3 + arg2, arg1 + arg4);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (class319.field5393 < var8.field5120[var31]) {
                        int var32;
                        if ((var8 instanceof class217)) {
                            class217 var33 = (class217) var8;
                            class313 var34 = var33.field3559;
                            if (var34.field5329 == -1) {
                                var32 = var8.method2061(true) / 2;
                            } else {
                                var32 = var34.field5329 / 2;
                            }
                        } else {
                            var32 = var8.method2061(true) / 2;
                        }
                        class307.method2074(arg0, var8, 600, arg2 >> 1, var32, arg4 >> 1, arg5);
                        if (class40.field652 > -1) {
                            if (var31 == 1) {
                                class191.field3105 -= 20;
                            }
                            if (var31 == 2) {
                                class40.field652 -= 15;
                                class191.field3105 -= 10;
                            }
                            if (var31 == 3) {
                                class191.field3105 -= 10;
                                class40.field652 += 15;
                            }
                            class74.field1250[var8.field5124[var31]].method653(class40.field652 + arg3 - 12, class191.field3105 + arg1 + -12);
                            class325.field5552.method261(class50.method354(0, var8.field5149[var31]), class40.field652 + arg3 - 1, arg1 - (-class191.field3105 + -3), 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg6) {
            method1390((byte[]) null, -54, -66);
        }
        for (int var35 = 0; var35 < class188.field3059; var35++) {
            int var36 = class269.field4515[var35];
            int var37 = class269.field4499[var35];
            int var38 = class269.field4531[var35];
            boolean var39 = true;
            int var40 = class269.field4506[var35];
            while (var39) {
                var39 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if ((class269.field4499[var41] - class269.field4506[var41]) < (var37 + 2) && (var37 - var40) < (class269.field4499[var41] + 2) && (var36 - var38) < (class269.field4531[var41] + class269.field4515[var41]) && var36 + var38 > class269.field4515[var41] + -class269.field4531[var41] && var37 > class269.field4499[var41] - class269.field4506[var41]) {
                        var37 = class269.field4499[var41] - class269.field4506[var41];
                        var39 = true;
                    }
                }
            }
            class40.field652 = class269.field4515[var35];
            class191.field3105 = class269.field4499[var35] = var37;
            class229 var42 = class269.field4524[var35];
            if (class68.field1098 == 0) {
                int var43 = 16776960;
                if (class269.field4501[var35] < 6) {
                    var43 = class170.field2803[class269.field4501[var35]];
                }
                if (class269.field4501[var35] == 6) {
                    var43 = class188.field3055 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class269.field4501[var35] == 7) {
                    var43 = class188.field3055 % 20 >= 10 ? 65535 : 255;
                }
                if (class269.field4501[var35] == 8) {
                    var43 = (class188.field3055 % 20) < 10 ? 45056 : 8454016;
                }
                if (class269.field4501[var35] == 9) {
                    int var44 = 150 - class269.field4497[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 - ((var44 - 50) * 327680);
                    } else if (var44 < 150) {
                        var43 = (var44 - 100) * 5 + 65280;
                    }
                }
                if (class269.field4501[var35] == 10) {
                    int var45 = 150 - class269.field4497[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16384000 + 16711935 - (var45 * 327680);
                    } else if (var45 < 150) {
                        var43 = (var45 - 100) * 327680 + 255 - (var45 + -100) * 5;
                    }
                }
                if (class269.field4501[var35] == 11) {
                    int var46 = 150 - class269.field4497[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - var46 * 327685;
                    } else if (var46 < 100) {
                        var43 = var46 * 327685 + 65280 - 16384250;
                    } else if (var46 < 150) {
                        var43 = 16777215 - ((var46 - 100) * 327680);
                    }
                }
                if (class269.field4528[var35] == 0) {
                    class213.field3517.method261(var42, arg3 + class40.field652, class191.field3105 + arg1, var43, 0);
                }
                if (class269.field4528[var35] == 1) {
                    class213.field3517.method263(var42, class40.field652 + arg3, class191.field3105 + arg1, var43, 0, class188.field3055);
                }
                if (class269.field4528[var35] == 2) {
                    class213.field3517.method255(var42, class40.field652 + arg3, class191.field3105 + arg1, var43, 0, class188.field3055);
                }
                if (class269.field4528[var35] == 3) {
                    class213.field3517.method262(var42, class40.field652 + arg3, class191.field3105 + arg1, var43, 0, class188.field3055, 150 - class269.field4497[var35]);
                }
                if (class269.field4528[var35] == 4) {
                    int var47 = (150 - class269.field4497[var35]) * (class213.field3517.method258(var42) + 100) / 150;
                    if (class99.field1675) {
                        class212.method1491(arg3 + class40.field652 - 50, arg1, arg3 + class40.field652 + 50, arg1 + arg4);
                    } else {
                        class210.method1471(class40.field652 + arg3 - 50, arg1, arg3 + class40.field652 + 50, arg1 + arg4);
                    }
                    class213.field3517.method260(var42, arg3 + class40.field652 + 50 - var47, class191.field3105 + arg1, var43, 0);
                    if (class99.field1675) {
                        class212.method1502(arg3, arg1, arg2 + arg3, arg1 + arg4);
                    } else {
                        class210.method1472(arg3, arg1, arg2 + arg3, arg1 + arg4);
                    }
                }
                if (class269.field4528[var35] == 5) {
                    int var48 = 150 - class269.field4497[var35];
                    if (class99.field1675) {
                        class212.method1491(arg3, class191.field3105 + arg1 - class213.field3517.field504 - 1, arg2 + arg3, arg1 + class191.field3105 + 5);
                    } else {
                        class210.method1471(arg3, arg1 + class191.field3105 + (-class213.field3517.field504 - 1), arg2 + arg3, class191.field3105 + arg1 + 5);
                    }
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class213.field3517.method261(var42, class40.field652 + arg3, arg1 - -var49 + class191.field3105, var43, 0);
                    if (class99.field1675) {
                        class212.method1502(arg3, arg1, arg2 + arg3, arg1 + arg4);
                    } else {
                        class210.method1472(arg3, arg1, arg2 + arg3, arg1 - -arg4);
                    }
                }
            } else {
                class213.field3517.method261(var42, class40.field652 + arg3, class191.field3105 + arg1, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lri;I)V", line = 566)
    public static final void method1394(class301 arg0, int arg1) {
        field3294++;
        class301 var2 = class282.method1942((byte) -121, arg0);
        if (arg1 != 327680) {
            field3292 = 7;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class266.field4484;
            var3 = class273.field4567;
        } else {
            var3 = var2.field4923;
            var4 = var2.field4882;
        }
        class208.method1447(78, var4, arg0, false, var3);
        class260.method1803(var4, arg1 - 327796, arg0, var3);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)V", line = 593)
    public static final void method1395(int arg0, int arg1) {
        class252.method1770(true);
        field3289++;
        class126.method928(true);
        int var2 = class208.method1452(arg0, 73).field1186;
        if (var2 == 0) {
            return;
        }
        int var3 = class166.field2711[arg0];
        if (var2 == 9) {
            class152.field2474 = var3;
        }
        if (var2 == 5) {
            class256.field4270 = var3;
        }
        if (var2 == 6) {
            class68.field1098 = var3;
        }
        if (arg1 != 13357) {
            method1395(-127, 69);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V", line = 627)
    public final void method1396(int arg0, int arg1, int arg2) {
        field3290++;
        int var4 = this.field3287 * arg2 >> 12;
        if (arg1 > -66) {
            method1394((class301) null, -18);
        }
        int var5 = this.field3291 * arg0 >> 12;
        int var6 = this.field3298 * arg2 >> 12;
        int var7 = this.field3293 * arg0 >> 12;
        class272.method1887(var7, var4, var6, var5, this.field3665, (byte) 120);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([IIII[J)V", line = 652)
    public static final void method1397(int[] arg0, int arg1, int arg2, int arg3, long[] arg4) {
        if (arg2 != 32028) {
            field3288 = (int[]) null;
        }
        if (arg1 < arg3) {
            int var5 = (arg1 + arg3) / 2;
            long var6 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var6;
            int var8 = arg0[var5];
            int var9 = arg1;
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            for (int var10 = arg1; var10 < arg3; var10++) {
                if (arg4[var10] < (long) (var10 & 0x1) + var6) {
                    long var11 = arg4[var10];
                    arg4[var10] = arg4[var9];
                    arg4[var9] = var11;
                    int var13 = arg0[var10];
                    arg0[var10] = arg0[var9];
                    arg0[var9++] = var13;
                }
            }
            arg4[arg3] = arg4[var9];
            arg4[var9] = var6;
            arg0[arg3] = arg0[var9];
            arg0[var9] = var8;
            method1397(arg0, arg1, 32028, var9 - 1, arg4);
            method1397(arg0, var9 + 1, 32028, arg3, arg4);
        }
        field3303++;
    }
}
