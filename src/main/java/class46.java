import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class46 {

    @OriginalMember(owner = "client!r", name = "h", descriptor = "[I")
    public static int[] field750 = new int[99];

    @OriginalMember(owner = "client!r", name = "g", descriptor = "Z")
    public static boolean field749 = false;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "Ltl;")
    private static class59 field752;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "Ltl;")
    public static class59 field753;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Lgb;")
    public static class212 field755;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Lme;")
    public static class295 field756;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method322(boolean arg0) {
        field743++;
        if (class90.field1408 == 0 || class90.field1408 == 5) {
            return;
        }
        try {
            if ((++class21.field285) > 2000) {
                if (class21.field284 != null) {
                    class21.field284.method1257(1185568552);
                    class21.field284 = null;
                }
                if (class101.field1646 >= 1) {
                    class276.field4753 = -5;
                    class90.field1408 = 0;
                    return;
                }
                if (class299.field5109 == class131.field2170) {
                    class131.field2170 = class146.field2391;
                } else {
                    class131.field2170 = class299.field5109;
                }
                class90.field1408 = 1;
                class101.field1646++;
                class21.field285 = 0;
            }
            if (class90.field1408 == 1) {
                class179.field2936 = class308.field5222.method1293(class124.field2056, (byte) 96, class131.field2170);
                class90.field1408 = 2;
            }
            if (class90.field1408 == 2) {
                if (class179.field2936.field4256 == 2) {
                    throw new IOException();
                }
                if (class179.field2936.field4256 != 1) {
                    return;
                }
                class21.field284 = new class171((Socket) class179.field2936.field4255, class308.field5222);
                class179.field2936 = null;
                long var1 = class65.field999 = class275.field4744.method488((byte) 94);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class234.field3888.field2787 = 0;
                class234.field3888.method1219(14, !arg0);
                class234.field3888.method1219(var3, true);
                class21.field284.method1267(class234.field3888.field2758, 2, 0, (byte) 56);
                if (class227.field3652 != null) {
                    class227.field3652.method558(53);
                }
                if (class237.field3934 != null) {
                    class237.field3934.method558(-81);
                }
                int var4 = class21.field284.method1258(-85);
                if (class227.field3652 != null) {
                    class227.field3652.method558(-88);
                }
                if (class237.field3934 != null) {
                    class237.field3934.method558(60);
                }
                if (var4 != 0) {
                    class276.field4753 = var4;
                    class90.field1408 = 0;
                    class21.field284.method1257(1185568552);
                    class21.field284 = null;
                    return;
                }
                class90.field1408 = 3;
            }
            if (class90.field1408 == 3) {
                if (class21.field284.method1256(51) < 8) {
                    return;
                }
                class21.field284.method1268(false, class18.field236.field2758, 8, 0);
                int[] var5 = new int[4];
                class18.field236.field2787 = 0;
                class198.field3277 = class18.field236.method1218(-1904132320);
                class234.field3888.field2787 = 0;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class198.field3277;
                var5[2] = (int) (class198.field3277 >> 32);
                class234.field3888.method1219(10, true);
                class234.field3888.method1213(-1, var5[0]);
                class234.field3888.method1213(-1, var5[1]);
                class234.field3888.method1213(-1, var5[2]);
                class234.field3888.method1213(-1, var5[3]);
                class234.field3888.method1206(class275.field4744.method488((byte) -107), arg0);
                class234.field3888.method1236((byte) 48, class275.field4734);
                class234.field3888.method1216(class185.field3105, class221.field3579, -106);
                class31.field423.field2787 = 0;
                if (class238.field3978 == 40) {
                    class31.field423.method1219(18, !arg0);
                } else {
                    class31.field423.method1219(16, true);
                }
                class31.field423.method1237(true, class234.field3888.field2787 + (class169.method1190(21735, class308.field5233) + 154));
                class31.field423.method1213(-1, 519);
                class31.field423.method1219(class170.field2730, true);
                class31.field423.method1219(class13.field182 ? 1 : 0, true);
                class31.field423.method1219(1, true);
                class31.field423.method1219(class284.method1988((byte) 62), true);
                class31.field423.method1237(!arg0, class152.field2498);
                class31.field423.method1237(!arg0, class53.field792);
                class17.method108(-23057, class31.field423);
                class31.field423.method1236((byte) 48, class308.field5233);
                class31.field423.method1213(-1, class124.field2055);
                class31.field423.method1213(-1, class84.method627(92));
                class7.field85 = true;
                class31.field423.method1237(true, class101.field1653);
                class31.field423.method1213(-1, class245.field4099.method2053(1));
                class31.field423.method1213(-1, class254.field4221.method2053(1));
                class31.field423.method1213(-1, class218.field3549.method2053(1));
                class31.field423.method1213(-1, class162.field2642.method2053(1));
                class31.field423.method1213(-1, class11.field145.method2053(1));
                class31.field423.method1213(-1, class269.field4664.method2053(1));
                class31.field423.method1213(-1, class98.field1573.method2053(1));
                class31.field423.method1213(-1, class72.field1135.method2053(1));
                class31.field423.method1213(-1, class34.field502.method2053(1));
                class31.field423.method1213(-1, class275.field4745.method2053(1));
                class31.field423.method1213(-1, class155.field2535.method2053(1));
                class31.field423.method1213(-1, class149.field2448.method2053(1));
                class31.field423.method1213(-1, class234.field3897.method2053(1));
                class31.field423.method1213(-1, class171.field2824.method2053(1));
                class31.field423.method1213(-1, field756.method2053(1));
                class31.field423.method1213(-1, class60.field948.method2053(1));
                class31.field423.method1213(-1, class180.field3003.method2053(1));
                class31.field423.method1213(-1, class77.field1223.method2053(1));
                class31.field423.method1213(-1, class248.field4137.method2053(1));
                class31.field423.method1213(-1, class8.field108.method2053(1));
                class31.field423.method1213(-1, class254.field4223.method2053(1));
                class31.field423.method1213(-1, class102.field1686.method2053(1));
                class31.field423.method1213(-1, class260.field4347.method2053(1));
                class31.field423.method1213(-1, class45.field740.method2053(1));
                class31.field423.method1213(-1, class260.field4343.method2053(1));
                class31.field423.method1213(-1, class82.field1287.method2053(1));
                class31.field423.method1213(-1, class41.field611.method2053(1));
                class31.field423.method1203(0, (byte) -91, class234.field3888.field2787, class234.field3888.field2758);
                class21.field284.method1267(class31.field423.field2758, class31.field423.field2787, 0, (byte) 56);
                class234.field3888.method1763(var5, -28247);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class18.field236.method1763(var5, -28247);
                class90.field1408 = 4;
            }
            if (class90.field1408 == 4) {
                if (class21.field284.method1256(82) < 1) {
                    return;
                }
                int var7 = class21.field284.method1258(-114);
                if (var7 == 21) {
                    class90.field1408 = 7;
                } else if (var7 == 29) {
                    class90.field1408 = 10;
                } else if (var7 == 1) {
                    class90.field1408 = 5;
                    class276.field4753 = var7;
                    return;
                } else if (var7 == 2) {
                    class90.field1408 = 8;
                } else if (var7 == 15) {
                    class90.field1408 = 0;
                    class276.field4753 = var7;
                    return;
                } else if (var7 == 23 && class101.field1646 < 1) {
                    class21.field285 = 0;
                    class90.field1408 = 1;
                    class101.field1646++;
                    class21.field284.method1257(1185568552);
                    class21.field284 = null;
                    return;
                } else {
                    class276.field4753 = var7;
                    class90.field1408 = 0;
                    class21.field284.method1257(1185568552);
                    class21.field284 = null;
                    return;
                }
            }
            if (class90.field1408 == 6) {
                class234.field3888.field2787 = 0;
                class234.field3888.method1768(true, 17);
                class21.field284.method1267(class234.field3888.field2758, class234.field3888.field2787, 0, (byte) 56);
                class90.field1408 = 4;
                return;
            }
            if (class90.field1408 == 7) {
                if (class21.field284.method1256(68) >= 1) {
                    class189.field3161 = class21.field284.method1258(-98) * 60 + 180;
                    class90.field1408 = 0;
                    class276.field4753 = 21;
                    class21.field284.method1257(1185568552);
                    class21.field284 = null;
                    return;
                }
                return;
            }
            if (class90.field1408 == 10) {
                if (class21.field284.method1256(48) < 1) {
                    return;
                }
                class94.field1462 = class21.field284.method1258(-121);
                class276.field4753 = 29;
                class90.field1408 = 0;
                class21.field284.method1257(1185568552);
                class21.field284 = null;
                return;
            }
            if (class90.field1408 == 8) {
                if (class21.field284.method1256(56) < 12) {
                    return;
                }
                class21.field284.method1268(false, class18.field236.field2758, 12, 0);
                class18.field236.field2787 = 0;
                class280.field4793 = class18.field236.method1221(95);
                class262.field4375 = class18.field236.method1221(98);
                class27.field356 = class18.field236.method1221(90);
                class143.field2365 = class18.field236.method1221(102);
                class255.field4238 = class18.field236.method1221(83) == 1;
                class155.field2537 = class18.field236.method1214(-18254);
                class45.field737 = class18.field236.method1221(73) == 1;
                class26.field351 = class18.field236.method1221(99) == 1;
                class149.method1079(class26.field351, (byte) -128);
                class199.method1432(false, class26.field351);
                if (!class13.field182) {
                    if (class27.field356 == 1 || class45.field737) {
                        try {
                            class75.field1181.method461(class308.field5222.field2870, -8660);
                        } catch (Throwable var11) {
                        }
                    } else {
                        try {
                            class313.field5310.method461(class308.field5222.field2870, -8660);
                        } catch (Throwable var12) {
                        }
                    }
                }
                class151.field2485 = class18.field236.method1769(-122);
                class146.field2387 = class18.field236.method1214(-18254);
                class90.field1408 = 9;
            }
            if (arg0) {
                return;
            }
            if (class90.field1408 == 9) {
                if (class21.field284.method1256(99) < class146.field2387) {
                    return;
                }
                class18.field236.field2787 = 0;
                class21.field284.method1268(arg0, class18.field236.field2758, class146.field2387, 0);
                class90.field1408 = 0;
                class276.field4753 = 2;
                class289.method2010(0);
                class187.field3127 = -1;
                class73.method584((byte) -82, false);
                class151.field2485 = -1;
                return;
            }
        } catch (IOException var13) {
            if (class21.field284 != null) {
                class21.field284.method1257(1185568552);
                class21.field284 = null;
            }
            if (class101.field1646 < 1) {
                class101.field1646++;
                if (class299.field5109 == class131.field2170) {
                    class131.field2170 = class146.field2391;
                } else {
                    class131.field2170 = class299.field5109;
                }
                class21.field285 = 0;
                class90.field1408 = 1;
            } else {
                class90.field1408 = 0;
                class276.field4753 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lch;Z)V", line = 390)
    public static final void method323(class102 arg0, boolean arg1) {
        class308 var2 = (class308) class206.field3365.method685(arg0.field1663.method488((byte) -55), 128);
        if (!arg1) {
            method323((class102) null, false);
        }
        if (var2 != null) {
            if (var2.field5205 != null) {
                class222.field3596.method369(var2.field5205);
                var2.field5205 = null;
            }
            var2.method2000(119);
        }
        field744++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lim;Ljava/lang/Object;I)V", line = 417)
    public static final void method324(class175 arg0, Object arg1, int arg2) {
        field748++;
        if (arg0.field2863 == null) {
            return;
        }
        int var3 = 0;
        if (arg2 != 2111924944) {
            return;
        }
        while (var3 < 50 && arg0.field2863.peekEvent() != null) {
            class183.method1360(false, 1L);
            var3++;
        }
        if (arg1 != null) {
            arg0.field2863.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V", line = 444)
    public static final void method325(int arg0, int arg1) {
        class119.field1942 = -1;
        field747++;
        class120.field2005 = arg0;
        class69.field1065 = -1;
        class64.method528(123);
        if (arg1 < 97) {
            field756 = (class295) null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BIIZBB[[F[[FLkj;III[[FI[[II)V", line = 465)
    public static final void method326(byte arg0, int arg1, int arg2, boolean arg3, byte arg4, byte arg5, float[][] arg6, float[][] arg7, class32 arg8, int arg9, int arg10, int arg11, float[][] arg12, int arg13, int[][] arg14, int arg15) {
        if (arg0 >= -19) {
            return;
        }
        field745++;
        int var16 = (arg11 << 8) + 255;
        int var17 = (arg10 << 8) + 255;
        int var18 = (arg9 << 8) + 255;
        int[] var19 = class94.field1450[arg5];
        int[] var20 = null;
        int[] var21 = new int[var19.length >> 1];
        int var22 = (arg1 << 8) + 255;
        for (int var23 = 0; var23 < var21.length; var23++) {
            var21[var23] = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, false, arg6, var16, 0.0F, var19[var23 + var23], arg15, arg4, var19[var23 + var23 + 1], arg8, var17, (byte) -47, arg12, arg7);
        }
        if (arg3) {
            if (arg5 == 1) {
                var20 = new int[6];
                int var42 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 64, arg15, arg4, 128, arg8, var17, (byte) -113, arg12, arg7);
                int var43 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 128, arg15, arg4, 64, arg8, var17, (byte) 112, arg12, arg7);
                var20[2] = var21[2];
                var20[1] = var42;
                var20[0] = var43;
                var20[3] = var42;
                var20[4] = var21[0];
                var20[5] = var21[2];
            } else if (arg5 == 2) {
                int var40 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 128, arg15, arg4, 128, arg8, var17, (byte) -44, arg12, arg7);
                int var41 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 64, arg15, arg4, 0, arg8, var17, (byte) 108, arg12, arg7);
                var20 = new int[] { var21[0], var41, var40, var40, var21[1], var21[0] };
            } else if (arg5 == 3) {
                var20 = new int[6];
                int var25 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 0, arg15, arg4, 128, arg8, var17, (byte) 127, arg12, arg7);
                int var26 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 64, arg15, arg4, 0, arg8, var17, (byte) -22, arg12, arg7);
                var20[4] = var26;
                var20[0] = var21[2];
                var20[1] = var21[1];
                var20[2] = var25;
                var20[5] = var21[2];
                var20[3] = var25;
            } else if (arg5 == 4) {
                var20 = new int[3];
                int var39 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 0, arg15, arg4, 128, arg8, var17, (byte) 106, arg12, arg7);
                var20[1] = var39;
                var20[0] = var21[3];
                var20[2] = var21[0];
            } else if (arg5 == 5) {
                var20 = new int[3];
                int var27 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 128, arg15, arg4, 128, arg8, var17, (byte) -15, arg12, arg7);
                var20[1] = var27;
                var20[0] = var21[2];
                var20[2] = var21[3];
            } else if (arg5 == 6) {
                var20 = new int[6];
                int var37 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 128, arg15, arg4, 0, arg8, var17, (byte) 127, arg12, arg7);
                int var38 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 128, arg15, arg4, 128, arg8, var17, (byte) -91, arg12, arg7);
                var20[1] = var37;
                var20[0] = var21[3];
                var20[3] = var38;
                var20[5] = var21[3];
                var20[4] = var21[0];
                var20[2] = var38;
            } else if (arg5 == 7) {
                var20 = new int[6];
                int var35 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 0, arg15, arg4, 128, arg8, var17, (byte) 104, arg12, arg7);
                int var36 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 128, arg15, arg4, 0, arg8, var17, (byte) -55, arg12, arg7);
                var20[0] = var21[1];
                var20[2] = var35;
                var20[4] = var21[2];
                var20[3] = var35;
                var20[1] = var36;
                var20[5] = var21[1];
            } else if (arg5 == 8) {
                int var28 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 0, arg15, arg4, 0, arg8, var17, (byte) -64, arg12, arg7);
                var20 = new int[] { var21[3], var28, var21[4] };
            } else if (arg5 == 9) {
                var20 = new int[15];
                int var29 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 128, arg15, arg4, 64, arg8, var17, (byte) -26, arg12, arg7);
                int var30 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 96, arg15, arg4, 32, arg8, var17, (byte) -35, arg12, arg7);
                int var31 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 64, arg15, arg4, 0, arg8, var17, (byte) -79, arg12, arg7);
                var20[2] = var21[4];
                var20[10] = var21[2];
                var20[8] = var21[2];
                var20[4] = var21[4];
                var20[14] = var31;
                var20[1] = var29;
                var20[0] = var30;
                var20[9] = var30;
                var20[3] = var30;
                var20[13] = var21[1];
                var20[7] = var21[3];
                var20[5] = var21[3];
                var20[12] = var30;
                var20[6] = var30;
                var20[11] = var21[1];
            } else if (arg5 == 10) {
                var20 = new int[9];
                int var34 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 0, arg15, arg4, 128, arg8, var17, (byte) -40, arg12, arg7);
                var20[4] = var34;
                var20[0] = var21[2];
                var20[6] = var21[4];
                var20[8] = var21[0];
                var20[7] = var34;
                var20[1] = var34;
                var20[5] = var21[4];
                var20[2] = var21[3];
                var20[3] = var21[3];
            } else if (arg5 == 11) {
                int var32 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 0, arg15, arg4, 64, arg8, var17, (byte) 120, arg12, arg7);
                var20 = new int[12];
                int var33 = class314.method2162(var22, (int[][]) null, arg13, arg14, var18, true, arg6, var16, 0.0F, 128, arg15, arg4, 64, arg8, var17, (byte) 121, arg12, arg7);
                var20[1] = var32;
                var20[10] = var21[1];
                var20[0] = var21[3];
                var20[8] = var32;
                var20[3] = var21[3];
                var20[5] = var32;
                var20[11] = var33;
                var20[7] = var33;
                var20[2] = var21[0];
                var20[6] = var21[2];
                var20[4] = var21[2];
                var20[9] = var21[2];
            }
        }
        arg8.method215(arg2, arg15, arg13, var21, var20, false);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field750[var1] = var0 / 4;
        }
        field754 = -1;
        field752 = class85.method639("Cancel", 9588);
        field753 = field752;
        field755 = new class212(500);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 755)
    public static void method327(byte arg0) {
        field755 = null;
        field752 = null;
        if (arg0 < 80) {
            field752 = (class59) null;
        }
        field753 = null;
        field756 = null;
        field750 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([SI[Ltl;II)V", line = 791)
    public static final void method328(short[] arg0, int arg1, class59[] arg2, int arg3, int arg4) {
        if (arg1 < arg4) {
            int var5 = arg1;
            int var6 = (arg1 + arg4) / 2;
            class59 var7 = arg2[var6];
            arg2[var6] = arg2[arg4];
            arg2[arg4] = var7;
            short var8 = arg0[var6];
            arg0[var6] = arg0[arg4];
            arg0[arg4] = var8;
            for (int var9 = arg1; var9 < arg4; var9++) {
                if (var7 == null || arg2[var9] != null && arg2[var9].method493(-1, var7) < (var9 & 0x1)) {
                    class59 var10 = arg2[var9];
                    arg2[var9] = arg2[var5];
                    arg2[var5] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5++] = var11;
                }
            }
            arg2[arg4] = arg2[var5];
            arg2[var5] = var7;
            arg0[arg4] = arg0[var5];
            arg0[var5] = var8;
            method328(arg0, arg1, arg2, -340990552, var5 - 1);
            method328(arg0, var5 + 1, arg2, arg3, arg4);
        }
        field751++;
        if (arg3 != -340990552) {
            field752 = (class59) null;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I", line = 848)
    public static final int method329(int arg0, int arg1) {
        if (arg0 != 127) {
            field752 = (class59) null;
        }
        field746++;
        return arg1 >> 11 & 0x7F;
    }
}
