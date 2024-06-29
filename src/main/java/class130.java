import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class130 extends class123 {

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "Leb;")
    private static class230 field2333 = class68.method589(0, "Started 3d Library");

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
    public static int field2334 = -1;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "Leb;")
    public static class230 field2338 = field2333;

    @OriginalMember(owner = "client!dd", name = "eb", descriptor = "Leb;")
    public static class230 field2340 = class68.method589(0, ":assistreq:");

    @OriginalMember(owner = "client!dd", name = "gb", descriptor = "I")
    public static int field2342 = 0;

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!dd", name = "fb", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!dd", name = "hb", descriptor = "[Lge;")
    public static class69[] field2343;

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class130() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V")
    public static void method1025(int arg0) {
        int var1 = 24 / ((arg0 + 67) / 48);
        field2338 = null;
        field2340 = null;
        field2333 = null;
        field2343 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIZLhh;IIIZI)V")
    public static final void method1026(int arg0, int arg1, int arg2, int arg3, boolean arg4, class116 arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field2339++;
        if (arg4 && !class179.method1302(74) && (class79.field1435[0][arg3][arg0] & 0x2) == 0) {
            if ((class79.field1435[arg10][arg3][arg0] & 0x10) != 0) {
                return;
            }
            if (class16.method210(arg0, arg3, arg10, -1) != class171.field3036) {
                return;
            }
        }
        if (class81.field1464 > arg10) {
            class81.field1464 = arg10;
        }
        class194 var11 = class251.method1776(arg7, 65280);
        int var12 = 12 % ((45 - arg2) / 34);
        int var13;
        int var14;
        if (arg1 == 1 || arg1 == 3) {
            var14 = var11.field3500;
            var13 = var11.field3476;
        } else {
            var13 = var11.field3500;
            var14 = var11.field3476;
        }
        int var15;
        int var16;
        if ((arg3 + var13) > 104) {
            var15 = arg3 + 1;
            var16 = arg3;
        } else {
            var16 = (var13 >> 1) + arg3;
            var15 = (var13 + 1 >> 1) + arg3;
        }
        int[][] var17 = class106.field1912[arg6];
        int var18;
        int var19;
        if ((arg0 + var14) <= 104) {
            var18 = (var14 >> 1) + arg0;
            var19 = (var14 + 1 >> 1) + arg0;
        } else {
            var18 = arg0;
            var19 = arg0 + 1;
        }
        int var20 = var17[var15][var18] + var17[var16][var19] + var17[var15][var19] + var17[var16][var18] >> 2;
        int var21 = (arg0 << 7) + (var14 << 6);
        int var22 = (arg3 << 7) + (var13 << 6);
        long var23 = (long) (arg1 << 20 | arg3 | arg0 << 7 | arg8 << 14 | 0x40000000);
        int[][] var25 = null;
        if (var11.field3429 == 0 || arg9) {
            var23 |= Long.MIN_VALUE;
        }
        if (arg9) {
            var25 = class237.field4098[0];
        } else if (arg6 < 3) {
            var25 = class106.field1912[arg6 + 1];
        }
        if (var11.field3455 == 1) {
            var23 |= 0x400000L;
        }
        if (var11.field3478) {
            var23 |= 0x80000000L;
        }
        long var26 = var23 | (long) arg7 << 32;
        if (var11.method1376((byte) 52)) {
            class115.method919((class109) null, arg0, arg3, arg1, (class260) null, arg10, 128, var11);
        }
        boolean var28 = var11.field3438 & !arg9;
        if (arg8 == 22) {
            if (class123.field2163 || var11.field3429 != 0 || var11.field3461 == 1 || var11.field3492) {
                class70 var30;
                if (var11.field3502 == -1 && var11.field3437 == null) {
                    class248 var29 = var11.method1380(var28, false, arg4, arg1, (class69) null, var25, var20, var17, var21, 22, var22);
                    var30 = var29.field4401;
                } else {
                    var30 = new class159(arg7, 22, arg1, arg6, arg3, arg0, var11.field3502, var11.field3432, (class70) null);
                }
                class127.method991(arg10, arg3, arg0, var20, var30, var26, var11.field3445);
                if (var11.field3461 == 1 && arg5 != null) {
                    arg5.method931(arg0, 108, arg3);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class70 var70;
            if (var11.field3502 == -1 && var11.field3437 == null) {
                class248 var69 = var11.method1380(var28, false, arg4, arg8 == 11 ? arg1 + 4 : arg1, (class69) null, var25, var20, var17, var21, 10, var22);
                var70 = var69.field4401;
            } else {
                var70 = new class159(arg7, 10, arg8 == 11 ? arg1 + 4 : arg1, arg6, arg3, arg0, var11.field3502, var11.field3432, (class70) null);
            }
            if (var70 != null) {
                boolean var71 = class210.method1459(arg10, arg3, arg0, var20, var13, var14, var70, 0, var26);
                if (var11.field3462 && var71 && arg4) {
                    int var72 = 15;
                    if (var70 instanceof class257) {
                        var72 = ((class257) var70).method760() / 4;
                        if (var72 > 30) {
                            var72 = 30;
                        }
                    }
                    for (int var73 = 0; var73 <= var13; var73++) {
                        for (int var74 = 0; var74 <= var14; var74++) {
                            if (var72 > class209.field3650[arg10][arg3 + var73][arg0 + var74]) {
                                class209.field3650[arg10][arg3 + var73][arg0 + var74] = (byte) var72;
                            }
                        }
                    }
                }
            }
            if (var11.field3461 != 0 && arg5 != null) {
                arg5.method922(arg0, arg3, var11.field3435, var14, -7889, var13);
            }
        } else if (arg8 >= 12) {
            class70 var32;
            if (var11.field3502 == -1 && var11.field3437 == null) {
                class248 var31 = var11.method1380(var28, false, arg4, arg1, (class69) null, var25, var20, var17, var21, arg8, var22);
                var32 = var31.field4401;
            } else {
                var32 = new class159(arg7, arg8, arg1, arg6, arg3, arg0, var11.field3502, var11.field3432, (class70) null);
            }
            class210.method1459(arg10, arg3, arg0, var20, 1, 1, var32, 0, var26);
            if (arg4 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg10 > 0) {
                class268.field4763[arg10][arg3][arg0] = class177.method1290(class268.field4763[arg10][arg3][arg0], 4);
            }
            if (var11.field3461 != 0 && arg5 != null) {
                arg5.method922(arg0, arg3, var11.field3435, var14, -7889, var13);
            }
        } else if (arg8 == 0) {
            class70 var34;
            if (var11.field3502 == -1 && var11.field3437 == null) {
                class248 var33 = var11.method1380(var28, false, arg4, arg1, (class69) null, var25, var20, var17, var21, 0, var22);
                var34 = var33.field4401;
            } else {
                var34 = new class159(arg7, 0, arg1, arg6, arg3, arg0, var11.field3502, var11.field3432, (class70) null);
            }
            class88.method720(arg10, arg3, arg0, var20, var34, (class70) null, class65.field1219[arg1], 0, var26);
            if (arg4) {
                if (arg1 == 0) {
                    if (var11.field3462) {
                        class209.field3650[arg10][arg3][arg0] = 50;
                        class209.field3650[arg10][arg3][arg0 + 1] = 50;
                    }
                    if (var11.field3433) {
                        class268.field4763[arg10][arg3][arg0] = class177.method1290(class268.field4763[arg10][arg3][arg0], 1);
                    }
                } else if (arg1 == 1) {
                    if (var11.field3462) {
                        class209.field3650[arg10][arg3][arg0 + 1] = 50;
                        class209.field3650[arg10][arg3 + 1][arg0 + 1] = 50;
                    }
                    if (var11.field3433) {
                        class268.field4763[arg10][arg3][arg0 + 1] = class177.method1290(class268.field4763[arg10][arg3][arg0 + 1], 2);
                    }
                } else if (arg1 == 2) {
                    if (var11.field3462) {
                        class209.field3650[arg10][arg3 + 1][arg0] = 50;
                        class209.field3650[arg10][arg3 + 1][arg0 + 1] = 50;
                    }
                    if (var11.field3433) {
                        class268.field4763[arg10][arg3 + 1][arg0] = class177.method1290(class268.field4763[arg10][arg3 + 1][arg0], 1);
                    }
                } else if (arg1 == 3) {
                    if (var11.field3462) {
                        class209.field3650[arg10][arg3][arg0] = 50;
                        class209.field3650[arg10][arg3 + 1][arg0] = 50;
                    }
                    if (var11.field3433) {
                        class268.field4763[arg10][arg3][arg0] = class177.method1290(class268.field4763[arg10][arg3][arg0], 2);
                    }
                }
            }
            if (var11.field3461 != 0 && arg5 != null) {
                arg5.method932(arg0, var11.field3435, arg3, arg8, (byte) 115, arg1);
            }
            if (var11.field3456 != 16) {
                class57.method475(arg10, arg3, arg0, var11.field3456);
            }
        } else if (arg8 == 1) {
            class70 var36;
            if (var11.field3502 == -1 && var11.field3437 == null) {
                class248 var35 = var11.method1380(var28, false, arg4, arg1, (class69) null, var25, var20, var17, var21, 1, var22);
                var36 = var35.field4401;
            } else {
                var36 = new class159(arg7, 1, arg1, arg6, arg3, arg0, var11.field3502, var11.field3432, (class70) null);
            }
            class88.method720(arg10, arg3, arg0, var20, var36, (class70) null, class197.field3533[arg1], 0, var26);
            if (var11.field3462 && arg4) {
                if (arg1 == 0) {
                    class209.field3650[arg10][arg3][arg0 + 1] = 50;
                } else if (arg1 == 1) {
                    class209.field3650[arg10][arg3 + 1][arg0 + 1] = 50;
                } else if (arg1 == 2) {
                    class209.field3650[arg10][arg3 + 1][arg0] = 50;
                } else if (arg1 == 3) {
                    class209.field3650[arg10][arg3][arg0] = 50;
                }
            }
            if (var11.field3461 != 0 && arg5 != null) {
                arg5.method932(arg0, var11.field3435, arg3, arg8, (byte) 126, arg1);
            }
        } else if (arg8 == 2) {
            int var37 = arg1 + 1 & 0x3;
            class70 var39;
            class70 var41;
            if (var11.field3502 == -1 && var11.field3437 == null) {
                class248 var38 = var11.method1380(var28, false, arg4, arg1 + 4, (class69) null, var25, var20, var17, var21, 2, var22);
                var39 = var38.field4401;
                class248 var40 = var11.method1380(var28, false, arg4, var37, (class69) null, var25, var20, var17, var21, 2, var22);
                var41 = var40.field4401;
            } else {
                var39 = new class159(arg7, 2, arg1 + 4, arg6, arg3, arg0, var11.field3502, var11.field3432, (class70) null);
                var41 = new class159(arg7, 2, var37, arg6, arg3, arg0, var11.field3502, var11.field3432, (class70) null);
            }
            class88.method720(arg10, arg3, arg0, var20, var39, var41, class65.field1219[arg1], class65.field1219[var37], var26);
            if (var11.field3433 && arg4) {
                if (arg1 == 0) {
                    class268.field4763[arg10][arg3][arg0] = class177.method1290(class268.field4763[arg10][arg3][arg0], 1);
                    class268.field4763[arg10][arg3][arg0 + 1] = class177.method1290(class268.field4763[arg10][arg3][arg0 + 1], 2);
                } else if (arg1 == 1) {
                    class268.field4763[arg10][arg3][arg0 + 1] = class177.method1290(class268.field4763[arg10][arg3][arg0 + 1], 2);
                    class268.field4763[arg10][arg3 + 1][arg0] = class177.method1290(class268.field4763[arg10][arg3 + 1][arg0], 1);
                } else if (arg1 == 2) {
                    class268.field4763[arg10][arg3 + 1][arg0] = class177.method1290(class268.field4763[arg10][arg3 + 1][arg0], 1);
                    class268.field4763[arg10][arg3][arg0] = class177.method1290(class268.field4763[arg10][arg3][arg0], 2);
                } else if (arg1 == 3) {
                    class268.field4763[arg10][arg3][arg0] = class177.method1290(class268.field4763[arg10][arg3][arg0], 2);
                    class268.field4763[arg10][arg3][arg0] = class177.method1290(class268.field4763[arg10][arg3][arg0], 1);
                }
            }
            if (var11.field3461 != 0 && arg5 != null) {
                arg5.method932(arg0, var11.field3435, arg3, arg8, (byte) -60, arg1);
            }
            if (var11.field3456 != 16) {
                class57.method475(arg10, arg3, arg0, var11.field3456);
            }
        } else if (arg8 == 3) {
            class70 var43;
            if (var11.field3502 == -1 && var11.field3437 == null) {
                class248 var42 = var11.method1380(var28, false, arg4, arg1, (class69) null, var25, var20, var17, var21, 3, var22);
                var43 = var42.field4401;
            } else {
                var43 = new class159(arg7, 3, arg1, arg6, arg3, arg0, var11.field3502, var11.field3432, (class70) null);
            }
            class88.method720(arg10, arg3, arg0, var20, var43, (class70) null, class197.field3533[arg1], 0, var26);
            if (var11.field3462 && arg4) {
                if (arg1 == 0) {
                    class209.field3650[arg10][arg3][arg0 + 1] = 50;
                } else if (arg1 == 1) {
                    class209.field3650[arg10][arg3 + 1][arg0 + 1] = 50;
                } else if (arg1 == 2) {
                    class209.field3650[arg10][arg3 + 1][arg0] = 50;
                } else if (arg1 == 3) {
                    class209.field3650[arg10][arg3][arg0] = 50;
                }
            }
            if (var11.field3461 != 0 && arg5 != null) {
                arg5.method932(arg0, var11.field3435, arg3, arg8, (byte) -79, arg1);
            }
        } else if (arg8 == 9) {
            class70 var45;
            if (var11.field3502 == -1 && var11.field3437 == null) {
                class248 var44 = var11.method1380(var28, false, arg4, arg1, (class69) null, var25, var20, var17, var21, arg8, var22);
                var45 = var44.field4401;
            } else {
                var45 = new class159(arg7, arg8, arg1, arg6, arg3, arg0, var11.field3502, var11.field3432, (class70) null);
            }
            class210.method1459(arg10, arg3, arg0, var20, 1, 1, var45, 0, var26);
            if (var11.field3461 != 0 && arg5 != null) {
                arg5.method922(arg0, arg3, var11.field3435, var14, -7889, var13);
            }
            if (var11.field3456 != 16) {
                class57.method475(arg10, arg3, arg0, var11.field3456);
            }
        } else if (arg8 == 4) {
            class70 var47;
            if (var11.field3502 == -1 && var11.field3437 == null) {
                class248 var46 = var11.method1380(var28, false, arg4, arg1, (class69) null, var25, var20, var17, var21, 4, var22);
                var47 = var46.field4401;
            } else {
                var47 = new class159(arg7, 4, arg1, arg6, arg3, arg0, var11.field3502, var11.field3432, (class70) null);
            }
            class145.method1108(arg10, arg3, arg0, var20, var47, (class70) null, class65.field1219[arg1], 0, 0, 0, var26);
        } else if (arg8 == 5) {
            int var48 = 16;
            long var49 = class176.method1283(arg10, arg3, arg0);
            if (var49 != 0L) {
                var48 = class251.method1776((int) (var49 >>> 32) & Integer.MAX_VALUE, 65280).field3456;
            }
            class70 var52;
            if (var11.field3502 == -1 && var11.field3437 == null) {
                class248 var51 = var11.method1380(var28, false, arg4, arg1, (class69) null, var25, var20, var17, var21, 4, var22);
                var52 = var51.field4401;
            } else {
                var52 = new class159(arg7, 4, arg1, arg6, arg3, arg0, var11.field3502, var11.field3432, (class70) null);
            }
            class145.method1108(arg10, arg3, arg0, var20, var52, (class70) null, class65.field1219[arg1], 0, class207.field3636[arg1] * var48, class34.field629[arg1] * var48, var26);
        } else if (arg8 == 6) {
            int var53 = 8;
            long var54 = class176.method1283(arg10, arg3, arg0);
            if (var54 != 0L) {
                var53 = class251.method1776((int) (var54 >>> 32) & Integer.MAX_VALUE, 65280).field3456 / 2;
            }
            class70 var57;
            if (var11.field3502 == -1 && var11.field3437 == null) {
                class248 var56 = var11.method1380(var28, false, arg4, arg1 + 4, (class69) null, var25, var20, var17, var21, 4, var22);
                var57 = var56.field4401;
            } else {
                var57 = new class159(arg7, 4, arg1 + 4, arg6, arg3, arg0, var11.field3502, var11.field3432, (class70) null);
            }
            class145.method1108(arg10, arg3, arg0, var20, var57, (class70) null, 256, arg1, class275.field4830[arg1] * var53, class255.field4542[arg1] * var53, var26);
        } else if (arg8 == 7) {
            int var58 = arg1 + 2 & 0x3;
            class70 var60;
            if (var11.field3502 == -1 && var11.field3437 == null) {
                class248 var59 = var11.method1380(var28, false, arg4, var58 + 4, (class69) null, var25, var20, var17, var21, 4, var22);
                var60 = var59.field4401;
            } else {
                var60 = new class159(arg7, 4, var58 + 4, arg6, arg3, arg0, var11.field3502, var11.field3432, (class70) null);
            }
            class145.method1108(arg10, arg3, arg0, var20, var60, (class70) null, 256, var58, 0, 0, var26);
        } else if (arg8 == 8) {
            int var61 = 8;
            long var62 = class176.method1283(arg10, arg3, arg0);
            if (var62 != 0L) {
                var61 = class251.method1776(Integer.MAX_VALUE & (int) (var62 >>> 32), 65280).field3456 / 2;
            }
            int var64 = arg1 + 2 & 0x3;
            class70 var66;
            class70 var68;
            if (var11.field3502 == -1 && var11.field3437 == null) {
                class248 var65 = var11.method1380(var28, false, arg4, arg1 + 4, (class69) null, var25, var20, var17, var21, 4, var22);
                var66 = var65.field4401;
                class248 var67 = var11.method1380(var28, false, arg4, var64 + 4, (class69) null, var25, var20, var17, var21, 4, var22);
                var68 = var67.field4401;
            } else {
                var66 = new class159(arg7, 4, arg1 + 4, arg6, arg3, arg0, var11.field3502, var11.field3432, (class70) null);
                var68 = new class159(arg7, 4, var64 + 4, arg6, arg3, arg0, var11.field3502, var11.field3432, (class70) null);
            }
            class145.method1108(arg10, arg3, arg0, var20, var66, var68, 256, arg1, class275.field4830[arg1] * var61, class255.field4542[arg1] * var61, var26);
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(II)V")
    public static final void method1027(int arg0, int arg1) {
        field2341++;
        class10 var2;
        if (class157.field2802 == null) {
            var2 = new class10(512, 512);
        } else {
            var2 = (class10) class157.field2802;
        }
        int[] var3 = var2.field165;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        int var6 = -110 / ((arg0 + 66) / 36);
        for (int var7 = 1; var7 < 103; var7++) {
            int var25 = (52736 - (var7 * 512)) * 4 + 24628;
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class79.field1435[arg1][var26][var7] & 0x18) == 0) {
                    class66.method577(var3, var25, 512, arg1, var26, var7);
                }
                if (arg1 < 3 && (class79.field1435[arg1 + 1][var26][var7] & 0x8) != 0) {
                    class66.method577(var3, var25, 512, arg1 + 1, var26, var7);
                }
                var25 += 4;
            }
        }
        var2.method101();
        int var8 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (238 - (-((int) (Math.random() * 20.0D)) + 10) << 8) + 238 - 10;
        int var9 = 238 - (10 - ((int) (Math.random() * 20.0D))) << 16;
        for (int var10 = 1; var10 < 103; var10++) {
            for (int var24 = 1; var24 < 103; var24++) {
                if ((class79.field1435[arg1][var24][var10] & 0x18) == 0) {
                    class192.method1361(arg1, var24, var9, var8, 2, var10);
                }
                if (arg1 < 3 && (class79.field1435[arg1 + 1][var24][var10] & 0x8) != 0) {
                    class192.method1361(arg1 + 1, var24, var9, var8, 2, var10);
                }
            }
        }
        class139.field2487 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = class191.method1359(class124.field2174, var11, var12);
                if (var13 != 0L) {
                    class194 var15 = class251.method1776((int) (var13 >>> 32) & Integer.MAX_VALUE, 65280);
                    int var16 = var15.field3447;
                    if (var15.field3437 != null) {
                        for (int var17 = 0; var17 < var15.field3437.length; var17++) {
                            if (var15.field3437[var17] != -1) {
                                class194 var18 = class251.method1776(var15.field3437[var17], 65280);
                                if (var18.field3447 >= 0) {
                                    var16 = var18.field3447;
                                    break;
                                }
                            }
                        }
                    }
                    if (var16 >= 0) {
                        int var19 = var11;
                        int var20 = var12;
                        if (var16 != 22 && var16 != 29 && var16 != 34 && var16 != 36 && var16 != 46 && var16 != 47 && var16 != 48) {
                            int[][] var21 = class112.field2007[class124.field2174].field2085;
                            for (int var22 = 0; var22 < 10; var22++) {
                                int var23 = (int) (Math.random() * 4.0D);
                                if (var23 == 0 && var19 > 0 && var19 > var11 - 3 && (var21[var19 - 1][var20] & 0x12C0108) == 0) {
                                    var19--;
                                }
                                if (var23 == 1 && var19 < 103 && var11 + 3 > var19 && (var21[var19 + 1][var20] & 0x12C0180) == 0) {
                                    var19++;
                                }
                                if (var23 == 2 && var20 > 0 && var20 > (var12 - 3) && (var21[var19][var20 - 1] & 0x12C0102) == 0) {
                                    var20--;
                                }
                                if (var23 == 3 && var20 < 103 && var20 < (var12 + 3) && (var21[var19][var20 + 1] & 0x12C0120) == 0) {
                                    var20++;
                                }
                            }
                        }
                        class33.field617[class139.field2487] = var15.field3480;
                        class183.field3212[class139.field2487] = var19;
                        class60.field1140[class139.field2487] = var20;
                        class139.field2487++;
                    }
                }
            }
        }
        class157.field2802 = var2;
        class251.field4499.method1281(19116);
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(II)Lid;")
    public static final class146 method1028(int arg0, int arg1) {
        field2336++;
        class146 var2 = (class146) class27.field503.method1125((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class205.field3628.method1546(arg1, (byte) -100, arg0);
        class146 var4 = new class146();
        if (var3 != null) {
            var4.method1112(new class14(var3), (byte) 63, arg1);
        }
        class27.field503.method1129((long) arg1, true, var4);
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(IB)V")
    public static final void method1029(int arg0, byte arg1) {
        class159.field2849 = 50;
        if (arg1 < 31) {
            field2343 = null;
        }
        field2335++;
        class96.field1734 = arg0;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        field2337++;
        int var3 = 46 % ((-arg1 - 24) / 57);
        return class214.field3705;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class16.field359[arg0][var8][var14] == -class168.field2968) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class106.field1912[arg0][arg1][arg3] + arg5;
            if (!class177.method1286(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class177.method1286(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class177.method1286(var9, var11, var13)) {
                return false;
            } else if (class177.method1286(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class35.method318(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class177.method1286(var6 + 1, class106.field1912[arg0][arg1][arg3] + arg5, var7 + 1) && class177.method1286(var6 + 128 - 1, class106.field1912[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class177.method1286(var6 + 128 - 1, class106.field1912[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class177.method1286(var6 + 1, class106.field1912[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }
}
