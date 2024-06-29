import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class266 implements Runnable {

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Lhc;")
    private class151 field4009 = new class151();

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "Z")
    private boolean field4018 = false;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public int field4016 = 0;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field4014;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "S")
    public static short field4006 = 320;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field4012 = -1;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field4005 = 0;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "[Lbi;")
    public static class70[] field4015;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIB)V")
    public static final void method1765(int arg0, int arg1, byte arg2) {
        class270 var3 = class190.method1213(25702, arg0, 7);
        if (arg2 != -36) {
            method1773((byte) -74, -121L);
        }
        var3.method1808((byte) 62);
        var3.field4226 = arg1;
        field4004++;
    }

    @OriginalMember(owner = "client!qi", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field4018) {
            class151 var1 = this.field4009;
            class203 var2;
            synchronized (this.field4009) {
                var2 = (class203) this.field4009.method1023((byte) 54);
                if (var2 == null) {
                    try {
                        this.field4009.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field4016--;
            }
            try {
                if (var2.field2951 == 2) {
                    var2.field2948.method935(true, var2.field2950.length, var2.field2950, (int) var2.field1376);
                } else if (var2.field2951 == 3) {
                    var2.field2950 = var2.field2948.method936((int) var2.field1376, -683361208);
                }
            } catch (Exception var7) {
                class37.method259(-92, (String) null, var7);
            }
            var2.field1339 = false;
        }
        field4010++;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1766(int arg0, String arg1) {
        field4020++;
        String var2 = class74.method496(4096, class109.method712((byte) 118, arg1));
        if (var2 == null) {
            var2 = "";
        }
        return arg0 == 12093 ? var2 : null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static void method1767(byte arg0) {
        field4015 = null;
        if (arg0 > -81) {
            method1775(true, -7, -69, 43, -61, 79, 18, 104, 59, -79, 94, -80, -2);
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
    public final void method1768(byte arg0) {
        this.field4018 = true;
        field4008++;
        if (arg0 != 88) {
            this.field4018 = false;
        }
        class151 var2 = this.field4009;
        synchronized (this.field4009) {
            this.field4009.notifyAll();
        }
        try {
            this.field4014.join();
        } catch (InterruptedException var3) {
        }
        this.field4014 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILac;I)Lol;")
    public final class203 method1769(int arg0, class141 arg1, int arg2) {
        field4011++;
        class203 var4 = new class203();
        if (arg2 != 31485) {
            return null;
        }
        var4.field2948 = arg1;
        var4.field1376 = (long) arg0;
        var4.field1346 = false;
        var4.field2951 = 3;
        this.method1774(var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)I")
    public static final int method1770(int arg0, int arg1, int arg2) {
        field4017++;
        int var3 = arg1 + (arg0 * 57);
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        if (arg2 < 65) {
            field4006 = -14;
        }
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([BILac;B)Lol;")
    public final class203 method1771(byte[] arg0, int arg1, class141 arg2, byte arg3) {
        field4007++;
        if (arg3 != 67) {
            this.field4016 = -84;
        }
        class203 var5 = new class203();
        var5.field1346 = false;
        var5.field1376 = (long) arg1;
        var5.field2948 = arg2;
        var5.field2951 = 2;
        var5.field2950 = arg0;
        this.method1774(var5, false);
        return var5;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BLac;I)Lol;")
    public final class203 method1772(byte arg0, class141 arg1, int arg2) {
        field4002++;
        if (arg0 != -49) {
            return null;
        }
        class203 var4 = new class203();
        var4.field2951 = 1;
        class151 var5 = this.field4009;
        synchronized (this.field4009) {
            class203 var6 = (class203) this.field4009.method1026((byte) 127);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg2) == var6.field1376 && var6.field2948 == arg1 && var6.field2951 == 2) {
                    var4.field1339 = false;
                    var4.field2950 = var6.field2950;
                    return var4;
                }
                var6 = (class203) this.field4009.method1022(-9709);
            }
        }
        var4.field2950 = arg1.method936(arg2, -683361208);
        var4.field1339 = false;
        var4.field1346 = true;
        return var4;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BJ)V")
    public static final void method1773(byte arg0, long arg1) {
        field4013++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class247.field3707; var3++) {
            if (class81.field1253[var3] == arg1) {
                class179.field2563++;
                class247.field3707--;
                for (int var4 = var3; var4 < class247.field3707; var4++) {
                    class81.field1253[var4] = class81.field1253[var4 + 1];
                    class62.field1003[var4] = class62.field1003[var4 + 1];
                }
                class113.field1611 = class213.field3063;
                class95.field1451.method522(95, 28727);
                class95.field1451.method765(arg0 ^ 0x1FBBCC94, arg1);
                break;
            }
        }
        if (arg0 != 52) {
            method1767((byte) 16);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lol;Z)V")
    private final void method1774(class203 arg0, boolean arg1) {
        field4019++;
        class151 var3 = this.field4009;
        synchronized (this.field4009) {
            if (arg1) {
                this.run();
            }
            this.field4009.method1028(arg1, arg0);
            this.field4016++;
            this.field4009.notifyAll();
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZIIIIIIIIIIII)Z")
    public static final boolean method1775(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field4003++;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class263.field3962[var13][var40] = 0;
                class188.field2670[var13][var40] = 99999999;
            }
        }
        class263.field3962[arg4][arg11] = 99;
        if (arg1 != 25117) {
            return false;
        }
        class188.field2670[arg4][arg11] = 0;
        int var14 = arg4;
        byte var15 = 0;
        int var16 = arg11;
        boolean var17 = false;
        int var18 = 0;
        class51.field755[var15] = arg4;
        int var41 = var15 + 1;
        class1.field19[var15] = arg11;
        int[][] var19 = class246.field3681[class163.field2364].field1319;
        label372: while (var41 != var18) {
            var14 = class51.field755[var18];
            var16 = class1.field19[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg2 == var14 && arg6 == var16) {
                var17 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class246.field3681[class163.field2364].method574(arg8, arg2, arg5, arg6, 19661088, arg9 - 1, var14, var16)) {
                    var17 = true;
                    break;
                }
                if (arg9 < 10 && class246.field3681[class163.field2364].method586(var14, arg5, arg8, arg6, var16, arg9 - 1, 7956, arg2)) {
                    var17 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg10 != 0 && class246.field3681[class163.field2364].method591(var16, arg2, arg1 ^ 0x621D, var14, arg3, arg6, arg10, arg7, arg5)) {
                var17 = true;
                break;
            }
            int var31 = class188.field2670[var14][var16] + 1;
            if (var14 > 0 && class263.field3962[var14 - 1][var16] == 0 && (var19[var14 - 1][var16] & 0x12C010E) == 0 && (var19[var14 - 1][arg5 + var16 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if (var32 >= arg5 - 1) {
                        class51.field755[var41] = var14 - 1;
                        class1.field19[var41] = var16;
                        var41 = var41 + 1 & 0xFFF;
                        class263.field3962[var14 - 1][var16] = 2;
                        class188.field2670[var14 - 1][var16] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var16 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class263.field3962[var14 + 1][var16] == 0 && (var19[var14 + arg5][var16] & 0x12C0183) == 0 && (var19[arg5 + var14][arg5 + var16 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if (var33 >= arg5 - 1) {
                        class51.field755[var41] = var14 + 1;
                        class1.field19[var41] = var16;
                        class263.field3962[var14 + 1][var16] = 8;
                        var41 = var41 + 1 & 0xFFF;
                        class188.field2670[var14 + 1][var16] = var31;
                        break;
                    }
                    if ((var19[arg5 + var14][var16 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var16 > 0 && class263.field3962[var14][var16 - 1] == 0 && (var19[var14][var16 - 1] & 0x12C010E) == 0 && (var19[var14 + arg5 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if (var34 >= arg5 - 1) {
                        class51.field755[var41] = var14;
                        class1.field19[var41] = var16 - 1;
                        class263.field3962[var14][var16 - 1] = 1;
                        class188.field2670[var14][var16 - 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 + var34][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var16 < 102 && class263.field3962[var14][var16 + 1] == 0 && (var19[var14][arg5 + var16] & 0x12C0138) == 0 && (var19[arg5 + var14 - 1][arg5 + var16] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if (var35 >= arg5 - 1) {
                        class51.field755[var41] = var14;
                        class1.field19[var41] = var16 + 1;
                        class263.field3962[var14][var16 + 1] = 4;
                        var41 = var41 + 1 & 0xFFF;
                        class188.field2670[var14][var16 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var35][arg5 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var16 > 0 && class263.field3962[var14 - 1][var16 - 1] == 0 && (var19[var14 - 1][var16 + arg5 - 1 - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var16 - 1] & 0x12C010E) == 0 && (var19[arg5 + var14 - 1 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if (var36 >= (arg5 - 1)) {
                        class51.field755[var41] = var14 - 1;
                        class1.field19[var41] = var16 - 1;
                        class263.field3962[var14 - 1][var16 - 1] = 3;
                        class188.field2670[var14 - 1][var16 - 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 - 1][var16 - (1 - var36)] & 0x12C013E) != 0 || (var19[var14 + var36 - 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var16 > 0 && class263.field3962[var14 + 1][var16 - 1] == 0 && (var19[var14 + 1][var16 - 1] & 0x12C010E) == 0 && (var19[arg5 + var14][var16 - 1] & 0x12C0183) == 0 && (var19[arg5 + var14][var16 + arg5 - 2] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (var37 >= (arg5 - 1)) {
                        class51.field755[var41] = var14 + 1;
                        class1.field19[var41] = var16 - 1;
                        class263.field3962[var14 + 1][var16 - 1] = 9;
                        class188.field2670[var14 + 1][var16 - 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 + arg5][var16 + var37 - 1] & 0x12C01E3) != 0 || (var19[var14 + var37 + 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var16 < 102 && class263.field3962[var14 - 1][var16 + 1] == 0 && (var19[var14 - 1][var16 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][arg5 + var16] & 0x12C0138) == 0 && (var19[var14][var16 + arg5] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (var38 >= arg5 - 1) {
                        class51.field755[var41] = var14 - 1;
                        class1.field19[var41] = var16 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class263.field3962[var14 - 1][var16 + 1] = 6;
                        class188.field2670[var14 - 1][var16 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var16 - (-var38 - 1)] & 0x12C013E) != 0 || (var19[var38 + var14 - 1][arg5 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var16 < 102 && class263.field3962[var14 + 1][var16 + 1] == 0 && (var19[var14 + 1][arg5 + var16] & 0x12C0138) == 0 && (var19[var14 + arg5][arg5 + var16] & 0x12C01E0) == 0 && (var19[arg5 + var14][var16 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < (arg5 - 1); var39++) {
                    if ((var19[var14 + var39 + 1][arg5 + var16] & 0x12C01F8) != 0 || (var19[arg5 + var14][var16 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label372;
                    }
                }
                class51.field755[var41] = var14 + 1;
                class1.field19[var41] = var16 + 1;
                class263.field3962[var14 + 1][var16 + 1] = 12;
                var41 = var41 + 1 & 0xFFF;
                class188.field2670[var14 + 1][var16 + 1] = var31;
            }
        }
        class231.field3455 = 0;
        if (!var17) {
            if (!arg0) {
                return false;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = arg2 - var21; var23 <= (arg2 + var21); var23++) {
                for (int var24 = arg6 - var21; var24 <= (arg6 + var21); var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class188.field2670[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg2 > var23) {
                            var25 = arg2 - var23;
                        } else if ((arg2 + arg3 - 1) < var23) {
                            var25 = var23 + 1 - arg2 - arg3;
                        }
                        int var26 = 0;
                        if (arg6 > var24) {
                            var26 = arg6 - var24;
                        } else if (var24 > (arg10 + arg6 - 1)) {
                            var26 = -arg6 - arg10 - (-1 - var24);
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && var22 > class188.field2670[var23][var24]) {
                            var20 = var27;
                            var14 = var23;
                            var16 = var24;
                            var22 = class188.field2670[var23][var24];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg4 == var14 && arg11 == var16) {
                return false;
            }
            class231.field3455 = 1;
        }
        byte var28 = 0;
        class51.field755[var28] = var14;
        int var42 = var28 + 1;
        class1.field19[var28] = var16;
        int var29;
        int var30 = var29 = class263.field3962[var14][var16];
        while (arg4 != var14 || arg11 != var16) {
            if (var29 != var30) {
                var29 = var30;
                class51.field755[var42] = var14;
                class1.field19[var42++] = var16;
            }
            if ((var30 & 0x1) != 0) {
                var16++;
            } else if ((var30 & 0x4) != 0) {
                var16--;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            var30 = class263.field3962[var14][var16];
        }
        if (var42 > 0) {
            class194.method1242(arg12, arg1 - 25092, var42);
            return true;
        } else if (arg12 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    public class266() {
        class239 var1 = class163.field2378.method553(this, false, 5);
        while (var1.field3588 == 0) {
            class98.method660(10L, -121);
        }
        if (var1.field3588 == 2) {
            throw new RuntimeException();
        }
        this.field4014 = (Thread) var1.field3585;
    }
}
