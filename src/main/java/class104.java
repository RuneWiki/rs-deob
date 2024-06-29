import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class104 extends class198 {

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
    private int field1565 = 0;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    private int field1567 = 4096;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    public static int field1564 = -1;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "Z")
    public static boolean field1560 = true;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "Lkb;")
    public static class54 field1569;

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    public class104() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBIIIIIII)V")
    public static final void method671(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class210 var10 = null;
        class210 var11 = (class210) class147.field2309.method1959(205);
        ++field1563;
        while (var11 != null) {
            if (~var11.field3374 == ~arg4 && ~var11.field3378 == ~arg6 && var11.field3368 == arg0 && ~var11.field3377 == ~arg8) {
                var10 = var11;
                break;
            }
            var11 = (class210) class147.field2309.method1956(arg2 ^ 17);
        }
        if (var10 == null) {
            var10 = new class210();
            var10.field3377 = arg8;
            var10.field3368 = arg0;
            var10.field3374 = arg4;
            var10.field3378 = arg6;
            class307.method2101((byte) 109, var10);
            class147.field2309.method1952(var10, arg2 ^ 12);
        }
        var10.field3370 = arg7;
        var10.field3381 = arg3;
        var10.field3372 = arg9;
        if (arg2 != 64) {
            method675((byte) 36, false);
        }
        var10.field3365 = arg1;
        var10.field3380 = arg5;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        ++field1559;
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (super.field3134.field69) {
            int[] var4 = this.method1367((byte) -79, 0, arg1);
            for (int var5 = 0; var5 < class42.field590; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field1565 <= var6 && this.field1567 >= var6 ? 4096 : 0;
            }
        }
        if (!arg0) {
            field1564 = 3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method672(String arg0, byte arg1) {
        ++field1562;
        return arg1 != 19 ? -3 : class107.method694(arg0, true, 48, 10);
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    public static void method673(int arg0) {
        field1569 = null;
        if (arg0 != -6654) {
            method673(-108);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)I")
    public static final int method674(int arg0, int arg1, int arg2) {
        if (arg2 != -32206) {
            field1560 = true;
        }
        class120 var3 = (class120) class42.field550.method872((byte) -83, (long) arg0);
        ++field1566;
        if (var3 == null) {
            return 0;
        } else {
            return arg1 >= 0 && var3.field1840.length > arg1 ? var3.field1840[arg1] : 0;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BZ)V")
    public static final void method675(byte arg0, boolean arg1) {
        class34.field414 = arg1;
        if (!class34.field414) {
            int var2 = class192.field3042.method1405(-121);
            int var3 = class192.field3042.method1455((byte) -99);
            int var4 = class192.field3042.method1455((byte) -99);
            int var5 = class192.field3042.method1410(true);
            int var6 = (-class192.field3042.field3272 + class20.field272) / 16;
            class287.field4779 = new int[var6][4];
            for (int var7 = 0; var6 > var7; ++var7) {
                for (int var15 = 0; ~var15 > -5; ++var15) {
                    class287.field4779[var7][var15] = class192.field3042.method1424(31523);
                }
            }
            boolean var8 = class82.method555(class192.field3042.method1398((byte) 110), 87);
            int var9 = class192.field3042.method1419(106);
            class18.field245 = new int[var6];
            class173.field2688 = new int[var6];
            class298.field4908 = null;
            class225.field3574 = new byte[var6][];
            class242.field3841 = new byte[var6][];
            class214.field3426 = new int[var6];
            class127.field1966 = new int[var6];
            class7.field56 = null;
            class53.field718 = new int[var6];
            int var10 = 0;
            boolean var11 = false;
            if ((~(var9 / 8) == -49 || var9 / 8 == 49) && ~(var5 / 8) == -49) {
                var11 = true;
            }
            if (var9 / 8 == 48 && ~(var5 / 8) == -149) {
                var11 = true;
            }
            for (int var12 = (var9 + -6) / 8; (var9 + 6) / 8 >= var12; ++var12) {
                for (int var13 = (var5 + -6) / 8; ~var13 >= ~((var5 + 6) / 8); ++var13) {
                    int var14 = (var12 << 8) + var13;
                    if (!var11 || var13 != 49 && ~var13 != -150 && var13 != 147 && ~var12 != -51 && (var12 != 49 || ~var13 != -48)) {
                        class53.field718[var10] = var14;
                        class173.field2688[var10] = class145.field2296.method1895("m" + var12 + "_" + var13, false);
                        class18.field245[var10] = class145.field2296.method1895("l" + var12 + "_" + var13, false);
                        class214.field3426[var10] = class145.field2296.method1895("um" + var12 + "_" + var13, false);
                        class127.field1966[var10] = class145.field2296.method1895("ul" + var12 + "_" + var13, false);
                    } else {
                        class53.field718[var10] = var14;
                        class173.field2688[var10] = -1;
                        class18.field245[var10] = -1;
                        class214.field3426[var10] = -1;
                        class127.field1966[var10] = -1;
                    }
                    ++var10;
                }
            }
            class216.method1511(var3, var2, var4, (byte) -92, var9, var5, var8, false);
        } else {
            int var16 = class192.field3042.method1455((byte) -99);
            int var17 = class192.field3042.method1410(true);
            int var18 = class192.field3042.method1420((byte) 0);
            class192.field3042.method1390((byte) -6);
            for (int var19 = 0; ~var19 > -5; ++var19) {
                for (int var38 = 0; ~var38 > -14; ++var38) {
                    for (int var39 = 0; var39 < 13; ++var39) {
                        int var40 = class192.field3042.method1394((byte) 127, 1);
                        if (var40 == 1) {
                            class193.field3049[var19][var38][var39] = class192.field3042.method1394((byte) 88, 26);
                        } else {
                            class193.field3049[var19][var38][var39] = -1;
                        }
                    }
                }
            }
            class192.field3042.method1389(8);
            int var20 = (class20.field272 - class192.field3042.field3272) / 16;
            class287.field4779 = new int[var20][4];
            for (int var21 = 0; var21 < var20; ++var21) {
                for (int var37 = 0; ~var37 > -5; ++var37) {
                    class287.field4779[var21][var37] = class192.field3042.method1440(20404);
                }
            }
            boolean var22 = class82.method555(class192.field3042.method1420((byte) 0), 123);
            int var23 = class192.field3042.method1410(true);
            int var24 = class192.field3042.method1455((byte) -99);
            class127.field1966 = new int[var20];
            class225.field3574 = new byte[var20][];
            class18.field245 = new int[var20];
            class298.field4908 = null;
            class173.field2688 = new int[var20];
            class242.field3841 = new byte[var20][];
            class214.field3426 = new int[var20];
            class53.field718 = new int[var20];
            class7.field56 = null;
            int var25 = 0;
            for (int var26 = 0; ~var26 > -5; ++var26) {
                for (int var28 = 0; var28 < 13; ++var28) {
                    for (int var29 = 0; var29 < 13; ++var29) {
                        int var30 = class193.field3049[var26][var28][var29];
                        if (~var30 != 0) {
                            int var31 = 1023 & var30 >> 14;
                            int var32 = 2047 & var30 >> 3;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; ~var34 > ~var25; ++var34) {
                                if (~class53.field718[var34] == ~var33) {
                                    var33 = -1;
                                    break;
                                }
                            }
                            if (var33 != -1) {
                                class53.field718[var25] = var33;
                                int var35 = (65505 & var33) >> 8;
                                int var36 = 255 & var33;
                                class173.field2688[var25] = class145.field2296.method1895("m" + var35 + "_" + var36, false);
                                class18.field245[var25] = class145.field2296.method1895("l" + var35 + "_" + var36, false);
                                class214.field3426[var25] = class145.field2296.method1895("um" + var35 + "_" + var36, false);
                                class127.field1966[var25] = class145.field2296.method1895("ul" + var35 + "_" + var36, false);
                                ++var25;
                            }
                        }
                    }
                }
            }
            class216.method1511(var16, var18, var24, (byte) 91, var17, var23, var22, false);
        }
        ++field1561;
        int var27 = -126 % ((49 - arg0) / 59);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field1567 = arg1.method1419(101);
            }
        } else {
            this.field1565 = arg1.method1419(70);
        }
        ++field1568;
        int var5 = 19 % ((60 - arg0) / 61);
    }
}
