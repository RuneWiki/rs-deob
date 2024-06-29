import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class145 extends class404 {

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    private int field2355 = 0;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    private int field2348 = 4096;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "[I")
    public static int[] field2356 = new int[256];

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "Lrp;")
    public static class288 field2351 = new class288(4);

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V", line = 3)
    public class145() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V", line = 6)
    public static void method950(byte arg0) {
        if (arg0 != -99) {
            field2351 = null;
        }
        field2351 = null;
        field2356 = null;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)Lkm;", line = 18)
    public static final class227 method951(int arg0, int arg1) {
        ++field2350;
        class215[] var2 = class377.field5499;
        synchronized (class377.field5499) {
            if (arg1 != 0) {
                return null;
            } else {
                class227 var4;
                if (~class377.field5499.length < ~arg0 && !class377.field5499[arg0].method1324((byte) 100)) {
                    var4 = (class227) class377.field5499[arg0].method1325(29209);
                    var4.method1297((byte) -127);
                    int var10002 = class220.field3391[arg0]--;
                } else {
                    var4 = new class227();
                    var4.field3476 = new class346[arg0];
                    for (int var5 = 0; ~var5 > ~arg0; ++var5) {
                        var4.field3476[var5] = new class346();
                    }
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(II)I", line = 54)
    public static final int method952(int arg0, int arg1) {
        ++field2353;
        if (arg1 != -25552) {
            method950((byte) 122);
        }
        return arg0 & 1023;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILha;I)V", line = 67)
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (arg0 != 0) {
            method951(-36, 30);
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field2348 = arg1.method254((byte) -39);
            }
        } else {
            this.field2355 = arg1.method254((byte) -111);
        }
        ++field2357;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)[I", line = 104)
    public final int[] method90(int arg0, int arg1) {
        if (arg0 >= -47) {
            return null;
        } else {
            ++field2352;
            int[] var3 = super.field5870.method372(arg1, (byte) 29);
            if (super.field5870.field810) {
                int[] var4 = this.method2394(0, (byte) 64, arg1);
                for (int var5 = 0; ~class431.field6348 < ~var5; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = ~var6 <= ~this.field2355 && ~var6 >= ~this.field2348 ? 4096 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIII)V", line = 143)
    public static final void method953(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class461.method2755(false, arg4);
        ++field2358;
        if (arg0 < -74) {
            int var7 = 0;
            int var8 = -arg2 + arg4;
            if (var8 < 0) {
                var8 = 0;
            }
            int var9 = arg4;
            int var10 = -arg4;
            int var11 = var8;
            int var12 = -var8;
            int var13 = -1;
            if (~class248.field3808 >= ~arg3 && class478.field7310 >= arg3) {
                int[] var14 = class69.field1212[arg3];
                int var15 = class167.method1056(class320.field4818, (byte) -126, class355.field5296, arg6 - arg4);
                int var16 = class167.method1056(class320.field4818, (byte) -125, class355.field5296, arg4 + arg6);
                int var17 = class167.method1056(class320.field4818, (byte) -128, class355.field5296, -var8 + arg6);
                int var18 = class167.method1056(class320.field4818, (byte) -124, class355.field5296, arg6 + var8);
                class78.method566(var14, var17, arg1, -7, var15);
                class78.method566(var14, var18, arg5, -7, var17);
                class78.method566(var14, var16, arg1, -7, var18);
            }
            int var19 = -1;
            while (var7 < var9) {
                var19 += 2;
                var13 += 2;
                var12 += var19;
                var10 += var13;
                if (~var12 <= -1 && ~var11 <= -2) {
                    --var11;
                    class276.field4181[var11] = var7;
                    var12 -= var11 << 1;
                }
                ++var7;
                if (~var10 <= -1) {
                    --var9;
                    var10 -= var9 << 1;
                    int var20 = -var9 + arg3;
                    int var21 = arg3 + var9;
                    if (~class248.field3808 >= ~var21 && class478.field7310 >= var20) {
                        if (~var9 > ~var8) {
                            int var22 = class276.field4181[var9];
                            int var23 = class167.method1056(class320.field4818, (byte) -126, class355.field5296, arg6 + var7);
                            int var24 = class167.method1056(class320.field4818, (byte) -122, class355.field5296, -var7 + arg6);
                            int var25 = class167.method1056(class320.field4818, (byte) -124, class355.field5296, arg6 + var22);
                            int var26 = class167.method1056(class320.field4818, (byte) -128, class355.field5296, -var22 + arg6);
                            if (class478.field7310 >= var21) {
                                int[] var27 = class69.field1212[var21];
                                class78.method566(var27, var26, arg1, -7, var24);
                                class78.method566(var27, var25, arg5, -7, var26);
                                class78.method566(var27, var23, arg1, -7, var25);
                            }
                            if (class248.field3808 <= var20) {
                                int[] var28 = class69.field1212[var20];
                                class78.method566(var28, var26, arg1, -7, var24);
                                class78.method566(var28, var25, arg5, -7, var26);
                                class78.method566(var28, var23, arg1, -7, var25);
                            }
                        } else {
                            int var29 = class167.method1056(class320.field4818, (byte) -126, class355.field5296, arg6 + var7);
                            int var30 = class167.method1056(class320.field4818, (byte) -128, class355.field5296, arg6 - var7);
                            if (~var21 >= ~class478.field7310) {
                                class78.method566(class69.field1212[var21], var29, arg1, -7, var30);
                            }
                            if (~var20 <= ~class248.field3808) {
                                class78.method566(class69.field1212[var20], var29, arg1, -7, var30);
                            }
                        }
                    }
                }
                int var31 = arg3 - var7;
                int var32 = arg3 + var7;
                if (var32 >= class248.field3808 && class478.field7310 >= var31) {
                    int var33 = arg6 + var9;
                    int var34 = -var9 + arg6;
                    if (var33 >= class355.field5296 && class320.field4818 >= var34) {
                        int var35 = class167.method1056(class320.field4818, (byte) -126, class355.field5296, var33);
                        int var36 = class167.method1056(class320.field4818, (byte) -123, class355.field5296, var34);
                        if (var8 > var7) {
                            int var37 = ~var11 > ~var7 ? class276.field4181[var7] : var11;
                            int var38 = class167.method1056(class320.field4818, (byte) -128, class355.field5296, arg6 - -var37);
                            int var39 = class167.method1056(class320.field4818, (byte) -128, class355.field5296, -var37 + arg6);
                            if (class478.field7310 >= var32) {
                                int[] var40 = class69.field1212[var32];
                                class78.method566(var40, var39, arg1, -7, var36);
                                class78.method566(var40, var38, arg5, -7, var39);
                                class78.method566(var40, var35, arg1, -7, var38);
                            }
                            if (~var31 <= ~class248.field3808) {
                                int[] var41 = class69.field1212[var31];
                                class78.method566(var41, var39, arg1, -7, var36);
                                class78.method566(var41, var38, arg5, -7, var39);
                                class78.method566(var41, var35, arg1, -7, var38);
                            }
                        } else {
                            if (~class478.field7310 <= ~var32) {
                                class78.method566(class69.field1212[var32], var35, arg1, -7, var36);
                            }
                            if (~class248.field3808 >= ~var31) {
                                class78.method566(class69.field1212[var31], var35, arg1, -7, var36);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "(I)V", line = 337)
    public static final void method954(int arg0) {
        ++field2354;
        class399.field5816.method1463(8609);
        class359.field5323.method1426(2);
        class56.field933.method946((byte) 111);
        class128.field2070.method919(102);
        class433.field6358.method2691(0);
        class288.field4362.method3027(-126);
        class429.field6302.method107(101);
        class201.field3192.method1252(-77);
        class117.field1962.method1376((byte) 118);
        class368.field5407.method1050((byte) 105);
        class511.field7740.method1408(-118);
        class164.field2542.method1027(3);
        class22.field281.method1841(110);
        class156.field2465.method1699(true);
        class76.field1364.method1268(68);
        class466.field7155.method2557(-3612);
        class507.field7670.method2565(true);
        class193.field3050.method1501(64);
        class466.field7153.method760(-32355);
        class318.field4791.method1658(4);
        class24.method129(30156);
        class382.method2290(-2);
        class108.method784(-91);
        if (class77.field1378 != class230.field3507) {
            for (int var1 = 0; var1 < class38.field517.length; ++var1) {
                class38.field517[var1] = null;
            }
            class408.field5925 = 0;
        }
        class348.method2122((byte) 126);
        class391.method2331(true);
        class368.method2234(true);
        class230.method1384(true);
        class17.method92(1401);
        class94.field1695.method1761(-114);
        class345.field5116.method1945();
        class167.field2590.method1665(0);
        class22.method113(false);
        class469.field7195.method2732((byte) 27);
        class376.field5487.method2732((byte) -120);
        class207.field3242.method2732((byte) 24);
        class85.field1435.method2732((byte) -109);
        class131.field2087.method2732((byte) 83);
        class73.field1310.method2732((byte) -125);
        class471.field7207.method2732((byte) -101);
        class274.field4160.method2732((byte) -115);
        class472.field7225.method2732((byte) -104);
        class383.field5572.method2732((byte) 78);
        class119.field1975.method2732((byte) 84);
        class395.field5765.method2732((byte) -111);
        class375.field5474.method2732((byte) 71);
        class123.field2027.method2732((byte) -111);
        class226.field3466.method2732((byte) -109);
        class173.field2694.method2732((byte) -120);
        if (arg0 > 115) {
            class504.field7613.method2732((byte) 79);
            class237.field3590.method2732((byte) 122);
            class409.field5934.method2732((byte) -114);
            class478.field7307.method2732((byte) -98);
            class315.field4751.method2732((byte) -125);
            class245.field3680.method2732((byte) -106);
            class60.field1021.method2732((byte) 110);
            class232.field3524.method2732((byte) 29);
            class161.field2531.method2732((byte) 0);
            class406.field5894.method2732((byte) -119);
            class436.field6425.method2732((byte) -126);
            class483.field7377.method2732((byte) 119);
            class183.field2914.method2732((byte) 102);
            class296.field4496.method2732((byte) -127);
            field2351.method1761(-112);
            class255.field3889.method1761(-121);
            class129.field2073.method1761(-122);
            class500.field7587.method1761(-108);
        }
    }
}
