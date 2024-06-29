import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class233 extends class44 {

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field3361 = 0;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field3362 = null;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Lbc;")
    public static class282 field3359;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "[I")
    public static int[] field3367;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIII)I")
    public static final int method1516(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > 243) {
            arg3 >>= 0x4;
        } else if (arg0 > 217) {
            arg3 >>= 0x3;
        } else if (arg0 > 192) {
            arg3 >>= 0x2;
        } else if (arg0 > 179) {
            arg3 >>= 0x1;
        }
        if (arg2 != -27242) {
            method1516(92, 5, -78, 80);
        }
        field3363++;
        return (arg0 >> 1) + (arg1 >> 2 << 10) + (arg3 >> 5 << 7);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    public static final void method1517(byte arg0) {
        field3360++;
        if (class117.field1637 != null) {
            class117.field1637.method1199(-126);
            class117.field1637 = null;
        }
        class112.method699(-28533);
        class261.method1669();
        for (int var1 = 0; var1 < 4; var1++) {
            class127.field1825[var1].method891(28734);
        }
        class222.method1444((byte) -125, false);
        System.gc();
        class71.method435(false, 2);
        class19.field240 = false;
        class34.field400 = -1;
        class289.method1937(true, 0);
        class88.field1196 = 0;
        class181.field2575 = 0;
        class110.field1473 = 0;
        class166.field2383 = 0;
        class180.field2556 = false;
        int var2 = -69 % ((arg0 + 3) / 41);
        for (int var3 = 0; var3 < class243.field3528.length; var3++) {
            class243.field3528[var3] = null;
        }
        class294.field4642 = 0;
        class238.field3432 = 0;
        for (int var4 = 0; var4 < 2048; var4++) {
            class253.field3656[var4] = null;
            class167.field2404[var4] = null;
        }
        for (int var5 = 0; var5 < 32768; var5++) {
            class20.field244[var5] = null;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 104; var7++) {
                for (int var8 = 0; var8 < 104; var8++) {
                    class80.field943[var6][var7][var8] = null;
                }
            }
        }
        class232.method1514(0);
        class7.field97 = 0;
        class168.method1105(2171);
        class35.method219((byte) -118, true);
        try {
            class208.method1328(-24232, class115.field1592.field664, "loggedout");
        } catch (Throwable var9) {
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
    public static void method1518(int arg0) {
        field3367 = null;
        field3359 = null;
        field3362 = null;
        if (arg0 >= -34) {
            field3359 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZLjava/lang/String;IIJZIILjava/lang/String;IZ)V")
    public static final void method1519(boolean arg0, String arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6, int arg7, String arg8, int arg9, boolean arg10) {
        int[] var12 = new int[4];
        field3358++;
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class216 var14 = new class216(128);
        var14.method1373(10, -13985);
        var14.method1387((arg5 ? 4 : 0) | (arg10 ? 2 : 0) | (arg0 ? 1 : 0), 4);
        var14.method1379(-85, arg4);
        var14.method1410(var12[0], (byte) 122);
        var14.method1353(arg8, (byte) -115);
        var14.method1410(var12[1], (byte) -127);
        var14.method1387(class133.field1939, arg7 - 18137);
        var14.method1373(arg2, -13985);
        var14.method1373(arg9, -13985);
        if (arg7 != 18141) {
            field3365 = -45;
        }
        var14.method1410(var12[2], (byte) -126);
        var14.method1387(arg3, 4);
        var14.method1387(arg6, 4);
        var14.method1410(var12[3], (byte) -126);
        var14.method1394(class289.field4491, 15, class217.field3080);
        class216 var15 = new class216(350);
        var15.method1353(arg1, (byte) -115);
        int var16 = 8 - class109.method681(arg1, arg7 - 20936) % 8;
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1373((int) (Math.random() * 255.0D), -13985);
        }
        var15.method1399(var12, arg7 - 18068);
        class94.field1259.field3021 = 0;
        class94.field1259.method1373(22, -13985);
        class94.field1259.method1387(var14.field3021 + var15.field3021 + 2, arg7 + -18137);
        class94.field1259.method1387(541, 4);
        class94.field1259.method1405(var14.field3021, (byte) -89, 0, var14.field3030);
        class94.field1259.method1405(var15.field3021, (byte) -100, 0, var15.field3030);
        class143.field2050 = -3;
        class84.field1169 = 0;
        class224.field3164 = 0;
        class252.field3653 = 1;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Lfg;")
    public static final class71 method1520(int arg0, int arg1) {
        field3366++;
        if (arg1 != 64) {
            method1516(-73, -69, 3, -51);
        }
        return (class71) class28.field342.method1895((long) arg0, -125);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLlc;)V")
    public static final void method1521(byte arg0, class290 arg1) {
        if (arg0 > -13) {
            field3359 = null;
        }
        class285 var2 = arg1.method1949(-1);
        arg1.field4579 = var2.field4376;
        field3364++;
        if (arg1.field4603 == 0) {
            arg1.field4523 = 0;
            return;
        }
        if (arg1.field4592 != -1 && arg1.field4518 == 0) {
            class274 var3 = class27.method165(arg1.field4592, (byte) 85);
            if (arg1.field4554 > 0 && var3.field4078 == 0) {
                arg1.field4523++;
                return;
            }
            if (arg1.field4554 <= 0 && var3.field4083 == 0) {
                arg1.field4523++;
                return;
            }
        }
        if (arg1.field4590 != -1 && arg1.field4507 <= class198.field2819) {
            class101 var4 = class189.method1246(arg1.field4590, (byte) -30);
            if (var4.field1381 && var4.field1382 != -1) {
                class274 var5 = class27.method165(var4.field1382, (byte) 83);
                if (arg1.field4554 > 0 && var5.field4078 == 0) {
                    arg1.field4523++;
                    return;
                }
                if (arg1.field4554 <= 0 && var5.field4083 == 0) {
                    arg1.field4523++;
                    return;
                }
            }
        }
        int var6 = arg1.field4563;
        int var7 = arg1.field4553;
        int var8 = arg1.field4597[arg1.field4603 - 1] * 128 + arg1.method1556(3888) * 64;
        int var9 = arg1.field4585[arg1.field4603 - 1] * 128 + (arg1.method1556(3888) * 64);
        if ((var8 - var6) > 256 || (var8 - var6) < -256 || var9 - var7 > 256 || (var9 - var7) < -256) {
            arg1.field4563 = var8;
            arg1.field4553 = var9;
            return;
        }
        if (var6 < var8) {
            if (var7 < var9) {
                arg1.field4534 = 1280;
            } else if (var9 < var7) {
                arg1.field4534 = 1792;
            } else {
                arg1.field4534 = 1536;
            }
        } else if (var6 > var8) {
            if (var9 > var7) {
                arg1.field4534 = 768;
            } else if (var7 > var9) {
                arg1.field4534 = 256;
            } else {
                arg1.field4534 = 512;
            }
        } else if (var9 > var7) {
            arg1.field4534 = 1024;
        } else if (var9 < var7) {
            arg1.field4534 = 0;
        }
        int var10 = arg1.field4534 - arg1.field4512 & 0x7FF;
        int var11 = var2.field4397;
        int var12 = 4;
        boolean var13 = true;
        byte var14 = 1;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        if (var10 >= -256 && var10 <= 256) {
            var11 = var2.field4402;
        } else if (var10 >= 256 && var10 < 768) {
            var11 = var2.field4406;
        } else if (var10 >= -768 && var10 <= -256) {
            var11 = var2.field4381;
        }
        if (var11 == -1) {
            var11 = var2.field4402;
        }
        arg1.field4579 = var11;
        if (arg1 instanceof class54) {
            var13 = ((class54) arg1).field636.field3895;
        }
        if (var13) {
            if (arg1.field4534 != arg1.field4512 && arg1.field4575 == -1 && arg1.field4505 != 0) {
                var12 = 2;
            }
            if (arg1.field4603 > 2) {
                var12 = 6;
            }
            if (arg1.field4603 > 3) {
                var12 = 8;
            }
            if (arg1.field4523 > 0 && arg1.field4603 > 1) {
                arg1.field4523--;
                var12 = 8;
            }
        } else {
            if (arg1.field4603 > 1) {
                var12 = 6;
            }
            if (arg1.field4603 > 2) {
                var12 = 8;
            }
            if (arg1.field4523 > 0 && arg1.field4603 > 1) {
                var12 = 8;
                arg1.field4523--;
            }
        }
        if (arg1.field4547[arg1.field4603 - 1] == 2) {
            var14 = 2;
            var12 <<= 0x1;
        } else if (arg1.field4547[arg1.field4603 - 1] == 0) {
            var12 >>= 0x1;
            var14 = 0;
        }
        if (var12 < 8 || var2.field4403 == -1) {
            if (var2.field4385 != -1 && var14 == 0) {
                if (arg1.field4579 == var2.field4397 && var2.field4396 != -1) {
                    arg1.field4579 = var2.field4396;
                } else if (arg1.field4579 == var2.field4381 && var2.field4394 != -1) {
                    arg1.field4579 = var2.field4394;
                } else if (arg1.field4579 == var2.field4406 && var2.field4388 != -1) {
                    arg1.field4579 = var2.field4388;
                } else {
                    arg1.field4579 = var2.field4385;
                }
            }
        } else if (arg1.field4579 == var2.field4397 && var2.field4410 != -1) {
            arg1.field4579 = var2.field4410;
        } else if (arg1.field4579 == var2.field4381 && var2.field4378 != -1) {
            arg1.field4579 = var2.field4378;
        } else if (arg1.field4579 == var2.field4406 && var2.field4384 != -1) {
            arg1.field4579 = var2.field4384;
        } else {
            arg1.field4579 = var2.field4403;
        }
        if (var2.field4383 != -1) {
            int var15 = var12 << 7;
            if (arg1.field4603 == 1) {
                int var16 = arg1.field4521 * arg1.field4521;
                int var17 = (var8 >= arg1.field4563 ? var8 - arg1.field4563 : -var8 + arg1.field4563) << 7;
                int var18 = (arg1.field4553 <= var9 ? var9 - arg1.field4553 : -var9 + arg1.field4553) << 7;
                int var19 = var18 < var17 ? var17 : var18;
                int var20 = var19 * 2 * var2.field4383;
                if (var20 < var16) {
                    arg1.field4521 /= 2;
                } else if (var19 < var16 / 2) {
                    arg1.field4521 -= var2.field4383;
                    if (arg1.field4521 < 0) {
                        arg1.field4521 = 0;
                    }
                } else if (var15 > arg1.field4521) {
                    arg1.field4521 += var2.field4383;
                    if (var15 < arg1.field4521) {
                        arg1.field4521 = var15;
                    }
                }
            } else if (arg1.field4521 < var15) {
                arg1.field4521 += var2.field4383;
                if (var15 < arg1.field4521) {
                    arg1.field4521 = var15;
                }
            } else if (arg1.field4521 > 0) {
                arg1.field4521 -= var2.field4383;
                if (arg1.field4521 < 0) {
                    arg1.field4521 = 0;
                }
            }
            var12 = arg1.field4521 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var9 > var7) {
            arg1.field4553 += var12;
            if (var9 < arg1.field4553) {
                arg1.field4553 = var9;
            }
        } else if (var7 > var9) {
            arg1.field4553 -= var12;
            if (arg1.field4553 < var9) {
                arg1.field4553 = var9;
            }
        }
        if (var6 < var8) {
            arg1.field4563 += var12;
            if (var8 < arg1.field4563) {
                arg1.field4563 = var8;
            }
        } else if (var8 < var6) {
            arg1.field4563 -= var12;
            if (arg1.field4563 < var8) {
                arg1.field4563 = var8;
            }
        }
        if (arg1.field4563 != var8 || arg1.field4553 != var9) {
            return;
        }
        arg1.field4603--;
        if (arg1.field4554 > 0) {
            arg1.field4554--;
            return;
        }
    }
}
