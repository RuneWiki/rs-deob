import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class440 extends class443 {

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
    public static int field6371 = 0;

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!jr", name = "x", descriptor = "I")
    public int field6374;

    @OriginalMember(owner = "client!jr", name = "y", descriptor = "I")
    public int field6375;

    @OriginalMember(owner = "client!jr", name = "B", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!jr", name = "C", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!jr", name = "D", descriptor = "I")
    public int field6379;

    @OriginalMember(owner = "client!jr", name = "F", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!jr", name = "H", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!jr", name = "J", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!jr", name = "K", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!jr", name = "M", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!jr", name = "z", descriptor = "Ljava/lang/String;")
    public String field6376;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)V", line = 9)
    public final void method2749(int arg0) {
        super.field6404 = class98.method768((byte) -94) + 500L | Long.MIN_VALUE & super.field6404;
        ++field6378;
        class122.field1581.method1154(this, 0);
        if (arg0 != 13828096) {
            this.field6379 = 100;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lde;IIILjava/awt/Component;)Lea;", line = 22)
    public static final class395 method2750(class364 arg0, int arg1, int arg2, int arg3, Component arg4) {
        ++field6373;
        if (~class388.field5673 == -1) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && ~arg1 > -3) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            if (arg3 != 29054) {
                field6377 = -53;
            }
            try {
                class395 var5 = (class395) Class.forName("rf").newInstance();
                var5.field5769 = arg2;
                var5.field5749 = new int[(class25.field449 ? 2 : 1) * 256];
                var5.method10(arg4);
                var5.field5775 = (-1024 & arg2) + 1024;
                if (var5.field5775 > 16384) {
                    var5.field5775 = 16384;
                }
                var5.method8(var5.field5775);
                if (class429.field6234 > 0 && class356.field5273 == null) {
                    class356.field5273 = new class320();
                    class356.field5273.field4756 = arg0;
                    arg0.method2397(class356.field5273, false, class429.field6234);
                }
                if (class356.field5273 != null) {
                    if (class356.field5273.field4752[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class356.field5273.field4752[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class150 var6 = new class150(arg0, arg1);
                    var6.field5769 = arg2;
                    var6.field5749 = new int[(class25.field449 ? 2 : 1) * 256];
                    var6.method10(arg4);
                    var6.field5775 = 16384;
                    var6.method8(var6.field5775);
                    if (class429.field6234 > 0 && class356.field5273 == null) {
                        class356.field5273 = new class320();
                        class356.field5273.field4756 = arg0;
                        arg0.method2397(class356.field5273, false, class429.field6234);
                    }
                    if (class356.field5273 != null) {
                        if (class356.field5273.field4752[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class356.field5273.field4752[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class395();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)I", line = 109)
    public final int method2751(int arg0) {
        ++field6383;
        if (arg0 <= 117) {
            this.method2754(false);
        }
        return (int) super.field6091;
    }

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)V", line = 121)
    public static final void method2752(int arg0) {
        if (arg0 >= -50) {
            method2752(16);
        }
        class227.field3126.method1574(-32166);
        ++field6381;
        for (class138 var1 = (class138) class186.field2547.method1575(0); var1 != null; var1 = (class138) class186.field2547.method1573((byte) -128)) {
            if (var1.field1777 < 1000) {
                var1.method2632(true);
                class227.field3126.method1560(-109, var1);
            }
        }
        class227.field3126.method1570(class186.field2547, 1);
        if (class346.field5156 == null) {
            if (class171.field2342 == null) {
                if (~class192.field2680 >= -1) {
                    int var2 = class219.field3054;
                    if (!class165.field2244) {
                        if (~var2 == -2 && class402.field5874 > 0) {
                            int var3 = ((class138) class186.field2547.field3397.field6090).field1777;
                            if (var3 == 1 || var3 == 41 || var3 == 60 || var3 == 5 || ~var3 == -14 || ~var3 == -9 || ~var3 == -5 || var3 == 47 || var3 == 15 || var3 == 30 || ~var3 == -4 || ~var3 == -1003) {
                                class138 var4 = (class138) class186.field2547.field3397.field6090;
                                class248 var5 = class27.method224(65535, var4.field1781);
                                class226 var6 = client.method402(var5);
                                if (var6.method1464(45)) {
                                    class245.field3455 = 0;
                                    class274.field4026 = false;
                                    if (class346.field5156 != null) {
                                        class92.method744(20491, class346.field5156);
                                    }
                                    class346.field5156 = class27.method224(65535, var4.field1781);
                                    class295.field4457 = var4.field1782;
                                    class308.field4574 = class278.field4085;
                                    class280.field4127 = class402.field5871;
                                    class92.method744(20491, class346.field5156);
                                    return;
                                }
                            }
                        }
                        if (var2 <= 0 && ~class160.field2082 < -1) {
                            var2 = class160.field2082;
                        }
                        class160.field2082 = 0;
                        if (~var2 == -2 && (~class301.field4541 == -2 && ~class402.field5874 < -3 || class204.method1350((byte) 5))) {
                            var2 = 2;
                        }
                        if (~var2 == -3 && class402.field5874 > 0) {
                            class211.method1385(-122);
                        }
                        if (var2 == 1 && ~class402.field5874 < -1) {
                            class134.method957(-83);
                            return;
                        }
                    } else {
                        if (~var2 != -2) {
                            int var7 = class277.field4060;
                            int var8 = class217.field3032;
                            if (~var7 > ~(class184.field2469 - 10) || ~(class389.field5694 + class184.field2469 - -10) > ~var7 || var8 < class341.field5066 - 10 || ~(class341.field5066 - (-class145.field1858 - 10)) > ~var8) {
                                class165.field2244 = false;
                                class435.method2723(class145.field1858, (byte) -105, class389.field5694, class341.field5066, class184.field2469);
                            }
                        }
                        if (~var2 != -2) {
                            return;
                        }
                        int var9 = class184.field2469;
                        int var10 = class341.field5066;
                        int var11 = class389.field5694;
                        int var12 = class278.field4085;
                        int var13 = class402.field5871;
                        int var14 = -1;
                        for (int var15 = 0; ~var15 > ~class402.field5874; ++var15) {
                            if (class167.field2266) {
                                int var19 = (class402.field5874 + -1 + -var15) * 16 + var10 - -33;
                                if (var12 > var9 && ~(var9 - -var11) < ~var12 && ~var13 < ~(var19 - 13) && ~var13 > ~(var19 + 3)) {
                                    var14 = var15;
                                }
                            } else {
                                int var20 = var10 - -31 - -((class402.field5874 + -1 + -var15) * 16);
                                if (~var9 > ~var12 && ~(var9 + var11) < ~var12 && var20 + -13 < var13 && var20 + 3 > var13) {
                                    var14 = var15;
                                }
                            }
                        }
                        if (~var14 != 0) {
                            int var16 = 0;
                            class348 var17 = new class348(class186.field2547);
                            for (class138 var18 = (class138) var17.method2306(-101); var18 != null; var18 = (class138) var17.method2305(-68)) {
                                if (var14 == var16) {
                                    class60.method536(var18, (byte) -83);
                                }
                                ++var16;
                            }
                        }
                        class165.field2244 = false;
                        class435.method2723(class145.field1858, (byte) 125, class389.field5694, class341.field5066, class184.field2469);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(Z)I", line = 300)
    public final int method2753(boolean arg0) {
        if (!arg0) {
            field6371 = -82;
        }
        ++field6384;
        return (int) (255L & super.field6091 >>> 32);
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(II)V", line = 314)
    public class440(int arg0, int arg1) {
        super.field6091 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(Z)J", line = 323)
    public final long method2754(boolean arg0) {
        ++field6380;
        if (arg0) {
            this.method2749(111);
        }
        return super.field6404 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZIII[[[Ldh;)Z", line = 335)
    public static final boolean method2755(int arg0, boolean arg1, int arg2, int arg3, int arg4, class77[][][] arg5) {
        ++field6372;
        byte var6 = !arg1 ? (byte) (255 & class394.field5731) : 1;
        if (~class158.field1996[class268.field3973][arg4][arg2] == ~var6) {
            return false;
        } else if ((4 & class406.field5912[class268.field3973][arg4][arg2]) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class78.field1098[var7] = arg4;
            int var8 = 0;
            int var35 = var7 + 1;
            class17.field275[var7] = arg2;
            class158.field1996[class268.field3973][arg4][arg2] = var6;
            if (arg0 != -30875) {
                field6371 = -5;
            }
            while (var35 != var8) {
                int var9 = 65535 & class78.field1098[var8];
                int var10 = (16713413 & class78.field1098[var8]) >> 16;
                int var11 = class78.field1098[var8] >> 24 & 255;
                int var12 = 65535 & class17.field275[var8];
                int var13 = (16725143 & class17.field275[var8]) >> 16;
                var8 = 4095 & var8 + 1;
                boolean var14 = false;
                if ((class406.field5912[class268.field3973][var9][var12] & 4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label235: for (int var16 = class268.field3973 - -1; ~var16 >= -4; ++var16) {
                    if ((class406.field5912[var16][var9][var12] & 8) == 0) {
                        if (var14 && arg5[var16][var9][var12] != null) {
                            if (arg5[var16][var9][var12].field1067 != null) {
                                int var20 = class438.method2743(21235, var10);
                                if (arg5[var16][var9][var12].field1067.field5858 == var20 || arg5[var16][var9][var12].field1087 != null && ~arg5[var16][var9][var12].field1087.field5858 == ~var20) {
                                    continue;
                                }
                                if (~var11 != -1) {
                                    int var21 = class438.method2743(21235, var11);
                                    if (~arg5[var16][var9][var12].field1067.field5858 == ~var21 || arg5[var16][var9][var12].field1087 != null && ~arg5[var16][var9][var12].field1087.field5858 == ~var21) {
                                        continue;
                                    }
                                }
                                if (~var13 != -1) {
                                    int var22 = class438.method2743(21235, var13);
                                    if (~arg5[var16][var9][var12].field1067.field5858 == ~var22 || arg5[var16][var9][var12].field1087 != null && ~arg5[var16][var9][var12].field1087.field5858 == ~var22) {
                                        continue;
                                    }
                                }
                            }
                            class77 var23 = arg5[var16][var9][var12];
                            if (var23.field1064 != null) {
                                for (class356 var24 = var23.field1064; var24 != null; var24 = var24.field5275) {
                                    class407 var25 = var24.field5274;
                                    if (var25 instanceof class56) {
                                        class56 var26 = (class56) var25;
                                        int var27 = var26.method122((byte) -123);
                                        int var28 = var26.method121(arg0 + 58899);
                                        if (~var27 == -22) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || ~var11 != -1 && ~var11 == ~var29 || var13 != 0 && ~var13 == ~var29) {
                                            continue label235;
                                        }
                                    }
                                }
                            }
                        }
                        class77 var30 = arg5[var16][var9][var12];
                        if (var30 != null && var30.field1064 != null) {
                            for (class356 var31 = var30.field1064; var31 != null; var31 = var31.field5275) {
                                class407 var32 = var31.field5274;
                                if (~var32.field5924 != ~var32.field5917 || ~var32.field5920 != ~var32.field5918) {
                                    for (int var33 = var32.field5917; var33 <= var32.field5924; ++var33) {
                                        for (int var34 = var32.field5918; ~var34 >= ~var32.field5920; ++var34) {
                                            class158.field1996[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class158.field1996[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class266.field3950[class268.field3973 - -1].method722(var9, var12);
                    if (~class231.field3184[arg3] > ~var17) {
                        class231.field3184[arg3] = var17;
                    }
                    int var18 = var9 << 7;
                    int var19 = var12 << 7;
                    if (var18 < class110.field1437[arg3]) {
                        class110.field1437[arg3] = var18;
                    } else if (~class399.field5850[arg3] > ~var18) {
                        class399.field5850[arg3] = var18;
                    }
                    if (~class143.field1818[arg3] >= ~var19) {
                        if (~var19 < ~class406.field5915[arg3]) {
                            class406.field5915[arg3] = var19;
                        }
                    } else {
                        class143.field1818[arg3] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && ~class158.field1996[class268.field3973][var9 + -1][var12] != ~var6) {
                        class78.field1098[var35] = class258.method1708(-754974720, class258.method1708(1179648, var9 - 1));
                        class17.field275[var35] = class258.method1708(1245184, var12);
                        var35 = var35 + 1 & 4095;
                        class158.field1996[class268.field3973][var9 - 1][var12] = var6;
                    }
                    ++var12;
                    if (~var12 > ~class143.field1815) {
                        if (var9 + -1 >= 0 && class158.field1996[class268.field3973][var9 + -1][var12] != var6 && ~(class406.field5912[class268.field3973][var9][var12] & 4) == -1 && ~(4 & class406.field5912[class268.field3973][var9 + -1][var12 + -1]) == -1) {
                            class78.field1098[var35] = class258.method1708(class258.method1708(1179648, var9 + -1), 1375731712);
                            class17.field275[var35] = class258.method1708(var12, 1245184);
                            var35 = var35 + 1 & 4095;
                            class158.field1996[class268.field3973][var9 - 1][var12] = var6;
                        }
                        if (~class158.field1996[class268.field3973][var9][var12] != ~var6) {
                            class78.field1098[var35] = class258.method1708(318767104, class258.method1708(var9, 5373952));
                            class17.field275[var35] = class258.method1708(5439488, var12);
                            class158.field1996[class268.field3973][var9][var12] = var6;
                            var35 = 4095 & var35 + 1;
                        }
                        if (~(var9 + 1) > ~class351.field5217 && ~class158.field1996[class268.field3973][var9 + 1][var12] != ~var6 && ~(class406.field5912[class268.field3973][var9][var12] & 4) == -1 && ~(class406.field5912[class268.field3973][var9 + 1][var12 + -1] & 4) == -1) {
                            class78.field1098[var35] = class258.method1708(-1845493760, class258.method1708(5373952, var9 + 1));
                            class17.field275[var35] = class258.method1708(var12, 5439488);
                            var35 = 4095 & var35 + 1;
                            class158.field1996[class268.field3973][var9 + 1][var12] = var6;
                        }
                    }
                    --var12;
                    if (~class351.field5217 < ~(var9 + 1) && ~class158.field1996[class268.field3973][var9 + 1][var12] != ~var6) {
                        class78.field1098[var35] = class258.method1708(class258.method1708(9568256, var9 + 1), 1392508928);
                        class17.field275[var35] = class258.method1708(9633792, var12);
                        var35 = 4095 & var35 - -1;
                        class158.field1996[class268.field3973][var9 + 1][var12] = var6;
                    }
                    --var12;
                    if (var12 >= 0) {
                        if (~(var9 + -1) <= -1 && class158.field1996[class268.field3973][var9 - 1][var12] != var6 && ~(4 & class406.field5912[class268.field3973][var9][var12]) == -1 && ~(class406.field5912[class268.field3973][var9 - 1][var12 - -1] & 4) == -1) {
                            class78.field1098[var35] = class258.method1708(301989888, class258.method1708(var9 + -1, 13762560));
                            class17.field275[var35] = class258.method1708(var12, 13828096);
                            var35 = var35 + 1 & 4095;
                            class158.field1996[class268.field3973][var9 + -1][var12] = var6;
                        }
                        if (class158.field1996[class268.field3973][var9][var12] != var6) {
                            class78.field1098[var35] = class258.method1708(-1828716544, class258.method1708(13762560, var9));
                            class17.field275[var35] = class258.method1708(13828096, var12);
                            var35 = var35 + 1 & 4095;
                            class158.field1996[class268.field3973][var9][var12] = var6;
                        }
                        if (~(var9 - -1) > ~class351.field5217 && ~class158.field1996[class268.field3973][var9 + 1][var12] != ~var6 && ~(4 & class406.field5912[class268.field3973][var9][var12]) == -1 && (class406.field5912[class268.field3973][var9 + 1][var12 - -1] & 4) == 0) {
                            class78.field1098[var35] = class258.method1708(-771751936, class258.method1708(9568256, var9 + 1));
                            class17.field275[var35] = class258.method1708(9633792, var12);
                            var35 = 4095 & var35 + 1;
                            class158.field1996[class268.field3973][var9 - -1][var12] = var6;
                        }
                    }
                }
            }
            if (~class231.field3184[arg3] != 999999) {
                class231.field3184[arg3] += 10;
                class110.field1437[arg3] -= 50;
                class399.field5850[arg3] += 50;
                class406.field5915[arg3] += 50;
                class143.field1818[arg3] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)V", line = 655)
    public final void method2756(int arg0) {
        ++field6382;
        if (arg0 != -1369656528) {
            this.field6376 = null;
        }
        super.field6404 |= Long.MIN_VALUE;
        if (this.method2754(false) == 0L) {
            class203.field2801.method1154(this, 0);
        }
    }
}
