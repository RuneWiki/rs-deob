import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class11 extends class71 {

    @OriginalMember(owner = "client!em", name = "R", descriptor = "I")
    private int field368 = -1;

    @OriginalMember(owner = "client!em", name = "N", descriptor = "Lud;")
    public static class279 field365 = class130.method1024("blaugr-Un:", 255);

    @OriginalMember(owner = "client!em", name = "L", descriptor = "I")
    public static int field363 = 0;

    @OriginalMember(owner = "client!em", name = "V", descriptor = "I")
    public static int field372 = -2;

    @OriginalMember(owner = "client!em", name = "S", descriptor = "Ldd;")
    public static class247 field369 = new class247(64);

    @OriginalMember(owner = "client!em", name = "J", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!em", name = "M", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!em", name = "P", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!em", name = "Q", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!em", name = "T", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!em", name = "U", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!em", name = "W", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!em", name = "X", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!em", name = "Y", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!em", name = "Z", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!em", name = "ab", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!em", name = "K", descriptor = "[I")
    public static int[] field362;

    @OriginalMember(owner = "client!em", name = "bb", descriptor = "[I")
    private int[] field378;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZLvh;)V", line = 9)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (arg0 == 0) {
            this.field368 = arg2.method468(28214);
        }
        if (arg1) {
            field373++;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V", line = 21)
    public class11() {
        super(0, false);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([IIIIII)V", line = 25)
    public static final void method78(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class191 var6 = class24.field619[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class304 var7 = var6.field3457;
        if (var7 != null) {
            int var8 = var7.field5401;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class281 var10 = var6.field3447;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field5012;
        int var12 = var10.field5014;
        int var13 = var10.field5019;
        int var14 = var10.field5024;
        int[] var15 = class226.field3973[var11];
        int[] var16 = class224.field3963[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(B)V", line = 119)
    public static void method79(byte arg0) {
        field365 = null;
        field369 = null;
        field362 = null;
        if (arg0 != -96) {
            method83(67, (byte[]) null, -17, -117, -68, true, -24, -10, -27, 77, (class123[]) null);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BLok;Lok;Lue;Lok;)Z", line = 134)
    public static final boolean method80(byte arg0, class149 arg1, class149 arg2, class15 arg3, class149 arg4) {
        class274.field4869 = arg2;
        class216.field3823 = arg1;
        class14.field426 = arg4;
        field366++;
        if (arg0 != 87) {
            field365 = (class279) null;
        }
        class17.field538 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!em", name = "f", descriptor = "(I)Z", line = 150)
    private final boolean method81(int arg0) {
        field375++;
        if (this.field378 != null) {
            return true;
        } else if (this.field368 < 0) {
            return arg0 == 64 ? false : false;
        } else {
            int var2 = class324.field5667;
            int var3 = class215.field3787;
            int var4 = class31.field722.method323(this.field368, 17013) ? 64 : 128;
            this.field378 = class31.field722.method317(false, this.field368);
            this.field367 = var4;
            this.field361 = var4;
            class163.method1281(true, var2, var3);
            return this.field378 != null;
        }
    }

    @OriginalMember(owner = "client!em", name = "g", descriptor = "(I)V", line = 181)
    public static final void method82(int arg0) {
        field376++;
        if (class141.field2557 == 0 || class141.field2557 == 5) {
            return;
        }
        try {
            if (++class207.field3666 > 2000) {
                if (class202.field3603 != null) {
                    class202.field3603.method2024(-1);
                    class202.field3603 = null;
                }
                if (class191.field3445 >= 1) {
                    class141.field2557 = 0;
                    class279.field4943 = -5;
                    return;
                }
                class141.field2557 = 1;
                class191.field3445++;
                if (class311.field5512 == class260.field4621) {
                    class311.field5512 = class86.field1616;
                } else {
                    class311.field5512 = class260.field4621;
                }
                class207.field3666 = 0;
            }
            if (arg0 >= -125) {
                method84(-2, (byte) 23);
            }
            if (class141.field2557 == 1) {
                class181.field3300 = class110.field2022.method2164(0, class274.field4876, class311.field5512);
                class141.field2557 = 2;
            }
            if (class141.field2557 == 2) {
                if (class181.field3300.field3655 == 2) {
                    throw new IOException();
                }
                if (class181.field3300.field3655 != 1) {
                    return;
                }
                class202.field3603 = new class280((Socket) class181.field3300.field3657, class110.field2022);
                class181.field3300 = null;
                long var1 = class139.field2542 = class60.field1264.method2013(124);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class314.field5534.field1142 = 0;
                class314.field5534.method464(14, false);
                class314.field5534.method464(var3, false);
                class202.field3603.method2021(2, class314.field5534.field1168, 0, 3);
                if (class80.field1537 != null) {
                    class80.field1537.method747(2512);
                }
                if (class120.field2163 != null) {
                    class120.field2163.method747(2512);
                }
                int var4 = class202.field3603.method2022((byte) -123);
                if (class80.field1537 != null) {
                    class80.field1537.method747(2512);
                }
                if (class120.field2163 != null) {
                    class120.field2163.method747(2512);
                }
                if (var4 != 0) {
                    class141.field2557 = 0;
                    class279.field4943 = var4;
                    class202.field3603.method2024(-1);
                    class202.field3603 = null;
                    return;
                }
                class141.field2557 = 3;
            }
            if (class141.field2557 == 3) {
                if (class202.field3603.method2023(124) < 8) {
                    return;
                }
                class202.field3603.method2026(62, class287.field5106.field1168, 8, 0);
                int[] var5 = new int[4];
                class287.field5106.field1142 = 0;
                class164.field2948 = class287.field5106.method469((byte) 42);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class314.field5534.field1142 = 0;
                var5[3] = (int) class164.field2948;
                var5[2] = (int) (class164.field2948 >> 32);
                class314.field5534.method464(10, false);
                class314.field5534.method444((byte) 46, var5[0]);
                class314.field5534.method444((byte) 46, var5[1]);
                class314.field5534.method444((byte) 46, var5[2]);
                class314.field5534.method444((byte) 46, var5[3]);
                class314.field5534.method490(class60.field1264.method2013(95), 14886);
                class314.field5534.method481(class60.field1267, (byte) 105);
                class314.field5534.method458(class17.field529, -68, class162.field2924);
                class224.field3958.field1142 = 0;
                if (class53.field1111 == 40) {
                    class224.field3958.method464(18, false);
                } else {
                    class224.field3958.method464(16, false);
                }
                class224.field3958.method505(class314.field5534.field1142 + class20.method193(-68, class159.field2894) + 159, (byte) 7);
                class224.field3958.method444((byte) 46, 529);
                class224.field3958.method464(class162.field2928, false);
                class224.field3958.method464(class199.field3560 ? 1 : 0, false);
                class224.field3958.method464(1, false);
                class224.field3958.method464(class20.method196(3), false);
                class224.field3958.method505(class221.field3899, (byte) 7);
                class224.field3958.method505(class176.field3150, (byte) 7);
                class224.field3958.method464(class232.field4062, false);
                class266.method1908(class224.field3958, (byte) -1);
                class224.field3958.method481(class159.field2894, (byte) 101);
                class224.field3958.method444((byte) 46, class52.field1077);
                class224.field3958.method444((byte) 46, class105.method887((byte) -35));
                class113.field2077 = true;
                class224.field3958.method505(class230.field4021, (byte) 7);
                class224.field3958.method444((byte) 46, class182.field3343.method1175(1077435366));
                class224.field3958.method444((byte) 46, class169.field3060.method1175(1077435366));
                class224.field3958.method444((byte) 46, class121.field2186.method1175(1077435366));
                class224.field3958.method444((byte) 46, class261.field4653.method1175(1077435366));
                class224.field3958.method444((byte) 46, class317.field5574.method1175(1077435366));
                class224.field3958.method444((byte) 46, class295.field5259.method1175(1077435366));
                class224.field3958.method444((byte) 46, class33.field742.method1175(1077435366));
                class224.field3958.method444((byte) 46, class44.field923.method1175(1077435366));
                class224.field3958.method444((byte) 46, class266.field4799.method1175(1077435366));
                class224.field3958.method444((byte) 46, class207.field3669.method1175(1077435366));
                class224.field3958.method444((byte) 46, class42.field887.method1175(1077435366));
                class224.field3958.method444((byte) 46, class78.field1497.method1175(1077435366));
                class224.field3958.method444((byte) 46, class103.field1947.method1175(1077435366));
                class224.field3958.method444((byte) 46, class257.field4572.method1175(1077435366));
                class224.field3958.method444((byte) 46, class13.field401.method1175(1077435366));
                class224.field3958.method444((byte) 46, class249.field4421.method1175(1077435366));
                class224.field3958.method444((byte) 46, class216.field3798.method1175(1077435366));
                class224.field3958.method444((byte) 46, class275.field4883.method1175(1077435366));
                class224.field3958.method444((byte) 46, class211.field3712.method1175(1077435366));
                class224.field3958.method444((byte) 46, class169.field3062.method1175(1077435366));
                class224.field3958.method444((byte) 46, class24.field617.method1175(1077435366));
                class224.field3958.method444((byte) 46, class322.field5631.method1175(1077435366));
                class224.field3958.method444((byte) 46, class183.field3355.method1175(1077435366));
                class224.field3958.method444((byte) 46, class326.field5674.method1175(1077435366));
                class224.field3958.method444((byte) 46, class214.field3765.method1175(1077435366));
                class224.field3958.method444((byte) 46, class253.field4509.method1175(1077435366));
                class224.field3958.method444((byte) 46, class276.field4895.method1175(1077435366));
                class224.field3958.method444((byte) 46, class39.field859.method1175(1077435366));
                class224.field3958.method471(0, class314.field5534.field1142, (byte) -81, class314.field5534.field1168);
                class202.field3603.method2021(class224.field3958.field1142, class224.field3958.field1168, 0, 3);
                class314.field5534.method1627(var5, 1000000);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class287.field5106.method1627(var5, 1000000);
                class141.field2557 = 4;
            }
            if (class141.field2557 == 4) {
                if (class202.field3603.method2023(117) < 1) {
                    return;
                }
                int var7 = class202.field3603.method2022((byte) -119);
                if (var7 == 21) {
                    class141.field2557 = 7;
                } else if (var7 == 29) {
                    class141.field2557 = 10;
                } else if (var7 == 1) {
                    class141.field2557 = 5;
                    class279.field4943 = var7;
                    return;
                } else if (var7 == 2) {
                    class141.field2557 = 8;
                } else if (var7 == 15) {
                    class279.field4943 = var7;
                    class141.field2557 = 0;
                    return;
                } else if (var7 == 23 && class191.field3445 < 1) {
                    class191.field3445++;
                    class141.field2557 = 1;
                    class207.field3666 = 0;
                    class202.field3603.method2024(-1);
                    class202.field3603 = null;
                    return;
                } else {
                    class141.field2557 = 0;
                    class279.field4943 = var7;
                    class202.field3603.method2024(-1);
                    class202.field3603 = null;
                    return;
                }
            }
            if (class141.field2557 == 6) {
                class314.field5534.field1142 = 0;
                class314.field5534.method1634(17, 0);
                class202.field3603.method2021(class314.field5534.field1142, class314.field5534.field1168, 0, 3);
                class141.field2557 = 4;
                return;
            }
            if (class141.field2557 == 7) {
                if (class202.field3603.method2023(119) < 1) {
                    return;
                }
                class7.field150 = class202.field3603.method2022((byte) -121) * 60 + 180;
                class141.field2557 = 0;
                class279.field4943 = 21;
                class202.field3603.method2024(-1);
                class202.field3603 = null;
                return;
            }
            if (class141.field2557 == 10) {
                if (class202.field3603.method2023(98) >= 1) {
                    class286.field5091 = class202.field3603.method2022((byte) -123);
                    class141.field2557 = 0;
                    class279.field4943 = 29;
                    class202.field3603.method2024(-1);
                    class202.field3603 = null;
                    return;
                }
                return;
            }
            if (class141.field2557 == 8) {
                if (class202.field3603.method2023(111) < 14) {
                    return;
                }
                class202.field3603.method2026(-128, class287.field5106.field1168, 14, 0);
                class287.field5106.field1142 = 0;
                class145.field2623 = class287.field5106.method483(-105);
                class18.field551 = class287.field5106.method483(-107);
                class179.field3242 = class287.field5106.method483(-126) == 1;
                class196.field3533 = class287.field5106.method483(-109) == 1;
                class102.field1908 = class287.field5106.method483(-123) == 1;
                class248.field4408 = class287.field5106.method483(-124) == 1;
                class39.field857 = class287.field5106.method483(-119) == 1;
                class79.field1506 = class287.field5106.method468(28214);
                class165.field2982 = class287.field5106.method483(-128) == 1;
                class221.field3894 = class287.field5106.method483(-115) == 1;
                class230.method1656(class221.field3894, true);
                class28.method259(class221.field3894, false);
                if (!class199.field3560) {
                    if ((!class179.field3242 || class102.field1908) && !class165.field2982) {
                        try {
                            class117.field2130.method1983(class110.field2022.field5418, 7308);
                        } catch (Throwable var11) {
                        }
                    } else {
                        try {
                            class52.field1092.method1983(class110.field2022.field5418, 7308);
                        } catch (Throwable var12) {
                        }
                    }
                }
                class143.field2597 = class287.field5106.method1626(22186);
                class264.field4741 = class287.field5106.method468(28214);
                class141.field2557 = 9;
            }
            if (class141.field2557 == 9) {
                if (class202.field3603.method2023(86) < class264.field4741) {
                    return;
                }
                class287.field5106.field1142 = 0;
                class202.field3603.method2026(-126, class287.field5106.field1168, class264.field4741, 0);
                class141.field2557 = 0;
                class279.field4943 = 2;
                class31.method287(false);
                class64.field1312 = -1;
                class60.method540(-26242, false);
                class143.field2597 = -1;
                return;
            }
        } catch (IOException var13) {
            if (class202.field3603 != null) {
                class202.field3603.method2024(-1);
                class202.field3603 = null;
            }
            if (class191.field3445 >= 1) {
                class279.field4943 = -4;
                class141.field2557 = 0;
            } else {
                class141.field2557 = 1;
                class207.field3666 = 0;
                class191.field3445++;
                if (class311.field5512 == class260.field4621) {
                    class311.field5512 = class86.field1616;
                } else {
                    class311.field5512 = class260.field4621;
                }
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I[BIIIZIIII[Llg;)V", line = 562)
    public static final void method83(int arg0, byte[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, class123[] arg10) {
        class53 var11 = new class53(arg1);
        if (arg2 != 6) {
            field365 = (class279) null;
        }
        int var12 = -1;
        field370++;
        while (true) {
            int var13 = var11.method499(1);
            if (var13 == 0) {
                return;
            }
            int var14 = 0;
            var12 += var13;
            while (true) {
                int var15 = var11.method472((byte) 94);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method483(-111);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg4 == var18 && arg3 <= var17 && arg3 + 8 > var17 && var16 >= arg8 && var16 < (arg8 + 8)) {
                    class264 var22 = class252.method1808(var12, (byte) 4);
                    int var23 = class177.method1381(var21, var22.field4766, var22.field4733, var17 & 0x7, (byte) -120, arg9, var16 & 0x7) + arg6;
                    int var24 = arg7 + class309.method2200(var21, var22.field4733, var22.field4766, var16 & 0x7, (byte) 121, arg9, var17 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class123 var25 = null;
                        if (!arg5) {
                            int var26 = arg0;
                            if ((class257.field4573[1][var23][var24] & 0x2) == 2) {
                                var26 = arg0 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg10[var26];
                            }
                        }
                        class20.method191(var25, var23, arg0, arg9 + var21 & 0x3, var20, !arg5, (byte) -104, arg5, arg0, var12, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(IB)V", line = 643)
    public static final void method84(int arg0, byte arg1) {
        if (arg1 >= -96) {
            method82(-78);
        }
        class91.field1718 = arg0;
        class85.method738(-1, 3);
        field377++;
        class85.method738(-1, 4);
    }

    @OriginalMember(owner = "client!em", name = "e", descriptor = "(I)V", line = 662)
    public final void method85(int arg0) {
        field371++;
        super.method85(arg0);
        this.field378 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)[[I", line = 674)
    public final int[][] method86(int arg0, int arg1) {
        field374++;
        int var3 = -120 / ((arg1 + 70) / 54);
        int[][] var4 = this.field1400.method1746((byte) -84, arg0);
        if (this.field1400.field4363 && this.method81(64)) {
            int var5 = (class324.field5667 == this.field367 ? arg0 : this.field367 * arg0 / class324.field5667) * this.field361;
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var4[1];
            if (class215.field3787 == this.field361) {
                for (int var9 = 0; var9 < class215.field3787; var9++) {
                    int var10 = this.field378[var5++];
                    var7[var9] = class52.method442(var10, 255) << 4;
                    var8[var9] = class52.method442(var10 >> 4, 4080);
                    var6[var9] = class52.method442(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; var11 < class215.field3787; var11++) {
                    int var12 = this.field361 * var11 / class215.field3787;
                    int var13 = this.field378[var5 + var12];
                    var7[var11] = class52.method442(255, var13) << 4;
                    var8[var11] = class52.method442(4080, var13 >> 4);
                    var6[var11] = class52.method442(16711680, var13) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(I)I", line = 742)
    public final int method87(int arg0) {
        field364++;
        if (arg0 != -3) {
            this.field367 = -30;
        }
        return this.field368;
    }
}
