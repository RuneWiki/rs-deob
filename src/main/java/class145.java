import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class145 extends class225 {

    @OriginalMember(owner = "client!ep", name = "B", descriptor = "I")
    public static int field1982 = -1;

    @OriginalMember(owner = "client!ep", name = "L", descriptor = "I")
    public static int field1992 = 2;

    @OriginalMember(owner = "client!ep", name = "H", descriptor = "I")
    public static int field1988 = 0;

    @OriginalMember(owner = "client!ep", name = "Q", descriptor = "Ltj;")
    public static class429 field1997 = null;

    @OriginalMember(owner = "client!ep", name = "w", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!ep", name = "D", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!ep", name = "E", descriptor = "I")
    public int field1985;

    @OriginalMember(owner = "client!ep", name = "F", descriptor = "I")
    public int field1986;

    @OriginalMember(owner = "client!ep", name = "G", descriptor = "I")
    public int field1987;

    @OriginalMember(owner = "client!ep", name = "J", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!ep", name = "K", descriptor = "I")
    public int field1991;

    @OriginalMember(owner = "client!ep", name = "N", descriptor = "I")
    public int field1994;

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "Ljava/lang/String;")
    public String field1981;

    @OriginalMember(owner = "client!ep", name = "O", descriptor = "[I")
    public int[] field1995;

    @OriginalMember(owner = "client!ep", name = "P", descriptor = "[I")
    public int[] field1996;

    @OriginalMember(owner = "client!ep", name = "I", descriptor = "[Lvk;")
    public class56[] field1989;

    @OriginalMember(owner = "client!ep", name = "M", descriptor = "[Ljava/lang/String;")
    public String[] field1993;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZZZII)V", line = 5)
    public static final void method923(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        class118.method765(0, arg1, class16.field226.length - 1, arg3, arg0, 26577, arg4);
        field1983++;
        if (arg2) {
            method924(115);
        }
        class407.field6046 = 0;
        class372.field5412 = null;
    }

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "(I)V", line = 23)
    public static final void method924(int arg0) {
        class232.method1391(-26, 25);
        field1978++;
        if (arg0 != 1024) {
            field1997 = null;
        }
        class286.method1963((byte) 102);
        System.gc();
    }

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)V", line = 46)
    public static final void method925(int arg0) {
        field1977++;
        if (class385.field5588 != null) {
            class385.field5588.method2617(1);
            class304.field4461 = null;
            class385.field5588 = null;
        }
        if (arg0 != 2) {
            method924(-32);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZLn;I)V", line = 76)
    public static final void method926(int arg0, boolean arg1, class25 arg2, int arg3) {
        if ((arg0 & 0x8) != 0) {
            int var4 = class156.field2120.method1327((byte) -64);
            int var5 = class156.field2120.method1371(-88);
            arg2.method2038((byte) -114, var5, var4, class28.field418);
            arg2.field4315 = class28.field418 + 300;
            arg2.field4266 = class156.field2120.method1355(29550);
        }
        field1990++;
        if ((arg0 & 0x100) != 0) {
            int var6 = class156.field2120.method1371(-70);
            int[] var7 = new int[var6];
            int[] var8 = new int[var6];
            int[] var9 = new int[var6];
            for (int var10 = 0; var10 < var6; var10++) {
                int var11 = class156.field2120.method1356((byte) -74);
                if (var11 == 65535) {
                    var11 = -1;
                }
                var7[var10] = var11;
                var8[var10] = class156.field2120.method1371(-100);
                var9[var10] = class156.field2120.method1361(-9711);
            }
            class183.method1116(arg2, var9, var7, var8, -1);
        }
        if ((arg0 & 0x400) != 0) {
            int var12 = class156.field2120.method1356((byte) -34);
            arg2.field4279 = class156.field2120.method1348(-95);
            arg2.field4289 = class156.field2120.method1355(29550);
            arg2.field4344 = (var12 & 0x8000) != 0;
            arg2.field4336 = var12 & 0x7FFF;
            arg2.field4312 = class28.field418 + arg2.field4336 + arg2.field4279;
        }
        if ((arg0 & 0x800) != 0) {
            int var13 = class156.field2120.method1327((byte) -64);
            int var14 = class156.field2120.method1348(-109);
            arg2.method2038((byte) -102, var14, var13, class28.field418);
        }
        if ((arg0 & 0x1) != 0) {
            int var15 = class156.field2120.method1374(0);
            byte[] var16 = new byte[var15];
            class228 var17 = new class228(var16);
            class156.field2120.method1358(0, 128, var16, var15);
            class403.field5995[arg3] = var17;
            arg2.method167((byte) -67, var17);
        }
        if ((arg0 & 0x200) != 0) {
            arg2.field4306 = class156.field2120.method1355(29550);
            arg2.field4284 = class156.field2120.method1374(0);
            arg2.field4325 = class156.field2120.method1374(0);
            arg2.field4268 = class156.field2120.method1374(0);
            arg2.field4345 = class156.field2120.method1340(-128) + class28.field418;
            arg2.field4322 = class156.field2120.method1356((byte) -66) + class28.field418;
            arg2.field4295 = class156.field2120.method1374(0);
            arg2.field4365 = 0;
            arg2.field4369 = 1;
        }
        if ((arg0 & 0x40) != 0) {
            arg2.field4330 = class156.field2120.method1340(-128);
            if (arg2.field4330 == 65535) {
                arg2.field4330 = -1;
            }
        }
        if ((arg0 & 0x4) != 0) {
            arg2.field4309 = class156.field2120.method1329(991328496);
            if (arg2.field4309.charAt(0) == '~') {
                arg2.field4309 = arg2.field4309.substring(1);
                class171.method1057(2, 0, arg2.method164(97, false), arg2.field4309, arg2.method175(17881, true), -117);
            } else if (class227.field2988 == arg2) {
                class171.method1057(2, 0, arg2.method164(85, false), arg2.field4309, arg2.method175(17881, true), -30);
            }
            arg2.field4296 = 0;
            arg2.field4310 = 150;
            arg2.field4323 = 0;
        }
        if ((arg0 & 0x80) != 0) {
            int var18 = class156.field2120.method1361(-9711);
            int var19 = class156.field2120.method1374(0);
            int var20 = class156.field2120.method1374(0);
            int var21 = class156.field2120.field3029;
            boolean var22 = (var18 & 0x8000) != 0;
            if (arg2.field340 != null && arg2.field341 != null) {
                boolean var23 = false;
                if (var19 <= 1) {
                    if (!var22 && (class375.field5459 && !class69.field898 || class234.field3122)) {
                        var23 = true;
                    } else if (class48.method344((byte) -122, arg2.field340)) {
                        var23 = true;
                    }
                }
                if (!var23 && class307.field4523 == 0) {
                    class201.field2699.field3029 = 0;
                    class156.field2120.method1353(class201.field2699.field3040, (byte) 84, var20, 0);
                    class201.field2699.field3029 = 0;
                    int var24 = -1;
                    String var25;
                    if (var22) {
                        var18 &= 0x7FFF;
                        class41 var26 = class185.method1123(-2, class201.field2699);
                        var24 = var26.field574;
                        var25 = var26.field569.method2457(class201.field2699, (byte) -43);
                    } else {
                        var25 = class430.method2725(class368.method2393(true, class250.method1517(class201.field2699, (byte) 87)), (byte) -59);
                    }
                    arg2.field4309 = var25.trim();
                    arg2.field4310 = 150;
                    arg2.field4296 = var18 >> 8;
                    arg2.field4323 = var18 & 0xFF;
                    int var27;
                    if (var19 == 1 || var19 == 2) {
                        var27 = var22 ? 17 : 1;
                    } else {
                        var27 = var22 ? 17 : 2;
                    }
                    if (var19 == 2) {
                        class366.method2387((String) null, var27, 0, var25, var24, 0, "<img=1>" + arg2.method164(121, false), "<img=1>" + arg2.method175(17881, true));
                    } else if (var19 == 1) {
                        class366.method2387((String) null, var27, 0, var25, var24, 0, "<img=0>" + arg2.method164(103, false), "<img=0>" + arg2.method175(17881, true));
                    } else {
                        class366.method2387((String) null, var27, 0, var25, var24, 0, arg2.method164(122, false), arg2.method175(17881, true));
                    }
                }
            }
            class156.field2120.field3029 = var20 + var21;
        }
        if (!arg1) {
            method924(-36);
        }
        if ((arg0 & 0x10) != 0) {
            int var28 = class156.field2120.method1340(-128);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var29 = class156.field2120.method1348(-121);
            class295.method2017(arg2, var28, 32768, var29);
        }
        if ((arg0 & 0x1000) != 0) {
            int var30 = class156.field2120.method1343(255);
            if (var30 == 65535) {
                var30 = -1;
            }
            int var31 = class156.field2120.method1344((byte) 44);
            boolean var32 = true;
            if (var30 != -1 && arg2.field4326 != -1) {
                if (arg2.field4326 == var30) {
                    class300 var33 = class426.method2706((byte) 11, var30);
                    if (var33.field4389 && var33.field4406 != -1) {
                        class12 var34 = class33.method221((byte) 102, var33.field4406);
                        int var35 = var34.field193;
                        if (var35 == 0) {
                            var32 = false;
                        } else if (var35 == 1) {
                            var32 = true;
                        } else if (var35 == 2) {
                            var32 = false;
                            arg2.field4270 = 0;
                        }
                    }
                } else {
                    class300 var36 = class426.method2706((byte) 11, var30);
                    class300 var37 = class426.method2706((byte) 11, arg2.field4326);
                    if (var36.field4406 != -1 && var37.field4406 != -1) {
                        class12 var38 = class33.method221((byte) 102, var36.field4406);
                        class12 var39 = class33.method221((byte) 102, var37.field4406);
                        if (var39.field190 > var38.field190) {
                            var32 = false;
                        }
                    }
                }
            }
            if (var32) {
                arg2.field4280 = 1;
                arg2.field4326 = var30;
                arg2.field4341 = var31 >> 16;
                arg2.field4348 = (var31 & 0xFFFF) + class28.field418;
                arg2.field4273 = 0;
                arg2.field4304 = 0;
                if (arg2.field4348 > class28.field418) {
                    arg2.field4304 = -1;
                }
                if (arg2.field4326 != -1 && class28.field418 == arg2.field4348) {
                    int var40 = class426.method2706((byte) 11, arg2.field4326).field4406;
                    if (var40 != -1) {
                        class12 var41 = class33.method221((byte) 102, var40);
                        if (var41 != null && var41.field182 != null) {
                            class298.method2049(arg2.field734, class227.field2988 == arg2, arg2.field740, 9757, 0, var41);
                        }
                    }
                }
            }
        }
        if ((arg0 & 0x20) != 0) {
            arg2.field4275 = class156.field2120.method1356((byte) -78);
            arg2.field4320 = class156.field2120.method1361(-9711);
        }
    }

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "(I)V", line = 410)
    public static final void method927(int arg0) {
        field1984++;
        for (int var1 = arg0; var1 < 100; var1++) {
            class270.field3927[var1] = true;
        }
    }

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "(I)V", line = 432)
    public static void method928(int arg0) {
        int var1 = -74 % ((arg0 + 19) / 32);
        field1997 = null;
    }
}
