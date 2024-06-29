import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class55 {

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Z")
    public static boolean field701 = false;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "Lka;")
    public static class408 field711 = new class408(64);

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field726 = -1;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "B")
    public byte field705;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "B")
    public byte field707;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "B")
    public byte field710;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "B")
    public byte field715;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "B")
    public byte field716;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "B")
    public byte field721;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "B")
    public byte field722;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "Lfk;")
    public static class23 field720;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "S")
    public short field723;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Z")
    public boolean field699;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "Z")
    public boolean field702;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Z")
    public boolean field708;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "Z")
    public boolean field709;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Z")
    public boolean field712;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "Z")
    public boolean field714;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "Z")
    public boolean field717;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "Z")
    public boolean field719;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "Z")
    public boolean field725;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "[Lma;")
    public static class308[] field724;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public static final void method434(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        field700++;
        class246 var7 = new class246();
        if (arg6 <= 90) {
            return;
        }
        var7.field3464 = arg0;
        var7.field3473 = class246.field3467 + arg5;
        var7.field3463 = arg1;
        var7.field3470 = arg4;
        var7.field3465 = arg3;
        var7.field3474 = arg2;
        class398.field5512.method2483(var7, 0);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZIIIZJLjava/lang/String;ILjava/lang/String;Z)V")
    public static final void method435(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, long arg6, String arg7, int arg8, String arg9, boolean arg10) {
        if (arg8 != -9041) {
            field720 = null;
        }
        field706++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class366 var14 = new class366(128);
        var14.method2280(10, 1537846408);
        var14.method2275(-114, (arg1 ? 4 : 0) | (arg5 ? 1 : 0) | (arg10 ? 2 : 0));
        var14.method2256(arg6, -121);
        var14.method2261(var12[0], -176);
        var14.method2285(arg7, (byte) -97);
        var14.method2261(var12[1], -176);
        var14.method2275(arg8 + 9166, class47.field606);
        var14.method2280(arg4, 1537846408);
        var14.method2280(arg2, 1537846408);
        var14.method2261(var12[2], -176);
        var14.method2275(-116, arg0);
        var14.method2275(arg8 ^ 0xFFFFDCA6, arg3);
        var14.method2261(var12[3], -176);
        var14.method2269(class103.field1419, (byte) -95, class267.field3665);
        class366 var15 = new class366(350);
        var15.method2285(arg9, (byte) -97);
        int var16 = 8 - class82.method662(12189, arg9) % 8;
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method2280((int) (Math.random() * 255.0D), 1537846408);
        }
        var15.method2272(true, var12);
        class88.field1232.field5048 = 0;
        class88.field1232.method2280(22, 1537846408);
        class88.field1232.method2275(arg8 ^ 0xFFFFDCD2, var14.field5048 + var15.field5048 + 2);
        class88.field1232.method2275(120, 565);
        class88.field1232.method2301(var14.field5048, var14.field5076, (byte) 83, 0);
        class88.field1232.method2301(var15.field5048, var15.field5076, (byte) -91, 0);
        class284.field3868 = 1;
        class445.field6240 = 0;
        class123.field1850 = 0;
        class436.field6158 = -3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILof;II)V")
    public static final void method436(int arg0, class423 arg1, int arg2, int arg3) {
        if ((arg2 & 0x4) != 0) {
            arg1.field2590 = class75.field1068.method2297(13352);
            if (arg1.field2590 == 65535) {
                arg1.field2590 = -1;
            }
        }
        field718++;
        if ((arg2 & 0x1000) != 0) {
            int var4 = class75.field1068.method2304(false);
            int var5 = class75.field1068.method2288((byte) 96);
            if (var4 == 65535) {
                var4 = -1;
            }
            boolean var6 = true;
            if (var4 != -1 && arg1.field2636 != -1) {
                if (arg1.field2636 == var4) {
                    class344 var7 = class186.method1296(var4, false);
                    if (var7.field4650 && var7.field4648 != -1) {
                        class83 var8 = class408.method2521((byte) -117, var7.field4648);
                        int var9 = var8.field1166;
                        if (var9 == 0) {
                            var6 = false;
                        } else if (var9 == 1) {
                            var6 = true;
                        } else if (var9 == 2) {
                            arg1.field2578 = 0;
                            var6 = false;
                        }
                    }
                } else {
                    class344 var10 = class186.method1296(var4, false);
                    class344 var11 = class186.method1296(arg1.field2636, false);
                    if (var10.field4648 != -1 && var11.field4648 != -1) {
                        class83 var12 = class408.method2521((byte) 127, var10.field4648);
                        class83 var13 = class408.method2521((byte) 4, var11.field4648);
                        if (var12.field1163 < var13.field1163) {
                            var6 = false;
                        }
                    }
                }
            }
            if (var6) {
                arg1.field2633 = (var5 & 0xFFFF) + class246.field3467;
                arg1.field2599 = 1;
                arg1.field2643 = 0;
                arg1.field2605 = var5 >> 16;
                arg1.field2584 = 0;
                arg1.field2636 = var4;
                if (arg1.field2633 > class246.field3467) {
                    arg1.field2643 = -1;
                }
                if (arg1.field2636 != -1 && class246.field3467 == arg1.field2633) {
                    int var14 = class186.method1296(arg1.field2636, false).field4648;
                    if (var14 != -1) {
                        class83 var15 = class408.method2521((byte) -117, var14);
                        if (var15 != null && var15.field1145 != null) {
                            class431.method2657(var15, -63, arg1.field40, class359.field4970 == arg1, 0, arg1.field44);
                        }
                    }
                }
            }
        }
        if ((arg2 & 0x1) != 0) {
            int var16 = class75.field1068.method2251(-117);
            int var17 = class75.field1068.method2259((byte) -100);
            arg1.method1287(class246.field3467, (byte) -118, var17, var16);
            arg1.field2585 = class246.field3467 + 300;
            arg1.field2610 = class75.field1068.method2259((byte) -100);
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field2623 = class75.field1068.method2259((byte) -100);
            arg1.field2642 = class75.field1068.method2306((byte) 24);
            arg1.field2628 = class75.field1068.method2292(true);
            arg1.field2646 = class75.field1068.method2306((byte) 119);
            arg1.field2627 = class75.field1068.method2297(13352) + class246.field3467;
            arg1.field2612 = class75.field1068.method2304(false) + class246.field3467;
            arg1.field2635 = class75.field1068.method2259((byte) -100);
            arg1.field2654 = 1;
            arg1.field2666 = 0;
        }
        if ((arg2 & 0x40) != 0) {
            int var18 = class75.field1068.method2304(false);
            int var19 = class75.field1068.method2277((byte) 107);
            int var20 = class75.field1068.method2292(true);
            int var21 = class75.field1068.field5048;
            boolean var22 = (var18 & 0x8000) != 0;
            if (arg1.field5869 != null && arg1.field5874 != null) {
                boolean var23 = false;
                if (var19 <= 1) {
                    if (!var22 && !(!class119.field1806 || class189.field2725) || class117.field1790) {
                        var23 = true;
                    } else if (class85.method684((byte) 92, arg1.field5869)) {
                        var23 = true;
                    }
                }
                if (!var23 && class438.field6181 == 0) {
                    class147.field2141.field5048 = 0;
                    class75.field1068.method2300(var20, class147.field2141.field5076, 252, 0);
                    class147.field2141.field5048 = 0;
                    int var24 = -1;
                    String var26;
                    if (var22) {
                        var18 &= 0x7FFF;
                        class353 var25 = class380.method2357(6922, class147.field2141);
                        var24 = var25.field4744;
                        var26 = var25.field4748.method810(class147.field2141, (byte) -43);
                    } else {
                        var26 = class160.method1157(class119.method928(class217.method1442((byte) -79, class147.field2141), false), (byte) -117);
                    }
                    arg1.field2589 = var26.trim();
                    arg1.field2581 = var18 >> 8;
                    arg1.field2631 = var18 & 0xFF;
                    arg1.field2598 = 150;
                    int var27;
                    if (var19 == 1 || var19 == 2) {
                        var27 = var22 ? 17 : 1;
                    } else {
                        var27 = var22 ? 17 : 2;
                    }
                    if (var19 == 2) {
                        class303.method1839("<img=1>" + arg1.method2612(true, (byte) 112), -1, var24, 0, (String) null, var27, var26, "<img=1>" + arg1.method2611(false, 1713894148));
                    } else if (var19 == 1) {
                        class303.method1839("<img=0>" + arg1.method2612(true, (byte) 107), -1, var24, 0, (String) null, var27, var26, "<img=0>" + arg1.method2611(false, 1713894148));
                    } else {
                        class303.method1839(arg1.method2612(true, (byte) 119), -1, var24, 0, (String) null, var27, var26, arg1.method2611(false, 1713894148));
                    }
                }
            }
            class75.field1068.field5048 = var20 + var21;
        }
        if ((arg2 & 0x200) != 0) {
            int var28 = class75.field1068.method2266(255);
            arg1.field2608 = class75.field1068.method2259((byte) -100);
            arg1.field2577 = class75.field1068.method2292(true);
            arg1.field2614 = var28 & 0x7FFF;
            arg1.field2632 = (var28 & 0x8000) != 0;
            arg1.field2630 = class246.field3467 + arg1.field2614 + arg1.field2608;
        }
        int var29 = 117 / ((66 - arg3) / 52);
        if ((arg2 & 0x100) != 0) {
            int var30 = class75.field1068.method2251(-105);
            int var31 = class75.field1068.method2292(true);
            arg1.method1287(class246.field3467, (byte) -90, var31, var30);
        }
        if ((arg2 & 0x80) != 0) {
            int var32 = class75.field1068.method2277((byte) 119);
            byte[] var33 = new byte[var32];
            class366 var34 = new class366(var33);
            class75.field1068.method2249(0, (byte) -43, var32, var33);
            class149.field2170[arg0] = var34;
            arg1.method2615(var34, (byte) 127);
        }
        if ((arg2 & 0x800) != 0) {
            int var35 = class75.field1068.method2292(true);
            int[] var36 = new int[var35];
            int[] var37 = new int[var35];
            int[] var38 = new int[var35];
            for (int var39 = 0; var39 < var35; var39++) {
                int var40 = class75.field1068.method2304(false);
                if (var40 == 65535) {
                    var40 = -1;
                }
                var36[var39] = var40;
                var37[var39] = class75.field1068.method2259((byte) -100);
                var38[var39] = class75.field1068.method2304(false);
            }
            class157.method1142(var37, -9535, arg1, var38, var36);
        }
        if ((arg2 & 0x2) != 0) {
            int var41 = class75.field1068.method2297(13352);
            if (var41 == 65535) {
                var41 = -1;
            }
            int var42 = class75.field1068.method2259((byte) -100);
            class269.method1713(var42, arg1, var41, true);
        }
        if ((arg2 & 0x20) != 0) {
            arg1.field2589 = class75.field1068.method2255(-32226);
            if (arg1.field2589.charAt(0) == '~') {
                arg1.field2589 = arg1.field2589.substring(1);
                class214.method1429(arg1.method2612(true, (byte) 109), 23653, 2, arg1.field2589, arg1.method2611(false, 1713894148), 0);
            } else if (class359.field4970 == arg1) {
                class214.method1429(arg1.method2612(true, (byte) 117), 23653, 2, arg1.field2589, arg1.method2611(false, 1713894148), 0);
            }
            arg1.field2598 = 150;
            arg1.field2581 = 0;
            arg1.field2631 = 0;
        }
        if ((arg2 & 0x8) != 0) {
            arg1.field2613 = class75.field1068.method2297(13352);
            arg1.field2615 = class75.field1068.method2266(255);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lij;Lij;B)V")
    public static final void method437(class316 arg0, class316 arg1, byte arg2) {
        if (arg2 != 57) {
            field720 = null;
        }
        class323.field4391 = arg1;
        field704++;
        class106.field1482 = arg0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIII)I")
    public static final int method438(int arg0, int arg1, int arg2, int arg3) {
        field703++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        }
        if (arg0 != 128) {
            field724 = null;
        }
        if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static void method439(byte arg0) {
        field720 = null;
        field724 = null;
        field711 = null;
        if (arg0 <= 97) {
            field724 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)I")
    public static final int method440(int arg0, int arg1) {
        field713++;
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xF4) >> 6;
        if (~var2 == arg0) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }
}
