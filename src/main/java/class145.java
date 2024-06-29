import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class145 {

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Z")
    public boolean field2412 = true;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public int field2416 = -1;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    private int field2419 = 0;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    private int field2413 = 128;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public int field2442 = 1;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "Z")
    public boolean field2435 = false;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public int field2429 = -1;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "Z")
    public boolean field2449 = false;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public int field2446 = 2;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    private int field2420 = 0;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public int field2432 = 0;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    private int field2445 = -1;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Z")
    public boolean field2418 = false;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public int field2414 = 0;

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "Z")
    private boolean field2459 = false;

    @OriginalMember(owner = "client!mg", name = "Z", descriptor = "I")
    public int field2461 = -1;

    @OriginalMember(owner = "client!mg", name = "eb", descriptor = "I")
    private int field2466 = 0;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public int field2431 = 0;

    @OriginalMember(owner = "client!mg", name = "ab", descriptor = "I")
    private int field2462 = 128;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    public int field2444 = 1;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "Z")
    public boolean field2457 = true;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    public int field2450 = 0;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    private int field2441 = -1;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "I")
    private int field2443 = 0;

    @OriginalMember(owner = "client!mg", name = "bb", descriptor = "I")
    public int field2463 = -1;

    @OriginalMember(owner = "client!mg", name = "fb", descriptor = "Z")
    public boolean field2467 = false;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public int field2417 = -1;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "Lve;")
    public class255 field2425 = class287.field4947;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    private int field2433 = 0;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "Z")
    public boolean field2440 = false;

    @OriginalMember(owner = "client!mg", name = "ib", descriptor = "[Lve;")
    public class255[] field2470 = new class255[5];

    @OriginalMember(owner = "client!mg", name = "cb", descriptor = "I")
    public int field2464 = -1;

    @OriginalMember(owner = "client!mg", name = "ob", descriptor = "Z")
    public boolean field2476 = false;

    @OriginalMember(owner = "client!mg", name = "sb", descriptor = "Z")
    public boolean field2480 = true;

    @OriginalMember(owner = "client!mg", name = "rb", descriptor = "I")
    public int field2479 = 16;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "B")
    private byte field2422 = 0;

    @OriginalMember(owner = "client!mg", name = "tb", descriptor = "Z")
    public boolean field2481 = false;

    @OriginalMember(owner = "client!mg", name = "vb", descriptor = "Z")
    public boolean field2483 = false;

    @OriginalMember(owner = "client!mg", name = "kb", descriptor = "Z")
    public boolean field2472 = true;

    @OriginalMember(owner = "client!mg", name = "jb", descriptor = "S")
    private short field2471 = -1;

    @OriginalMember(owner = "client!mg", name = "xb", descriptor = "Z")
    private boolean field2485 = false;

    @OriginalMember(owner = "client!mg", name = "Y", descriptor = "I")
    private int field2460 = 128;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field2427 = 0;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
    public static int field2456 = 10;

    @OriginalMember(owner = "client!mg", name = "nb", descriptor = "I")
    public static int field2475 = 0;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "Lwl;")
    public static class81 field2421 = new class81(5);

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "I")
    public int field2458;

    @OriginalMember(owner = "client!mg", name = "gb", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!mg", name = "hb", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!mg", name = "lb", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!mg", name = "mb", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!mg", name = "pb", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!mg", name = "qb", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!mg", name = "ub", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!mg", name = "wb", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!mg", name = "db", descriptor = "Lff;")
    private class47 field2465;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "[B")
    private byte[] field2430;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "[I")
    public int[] field2411;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "[I")
    private int[] field2436;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "[I")
    public int[] field2454;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "[I")
    private int[] field2455;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "[Luf;")
    public static class21[] field2426;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "[S")
    private short[] field2434;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "[S")
    private short[] field2438;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "[S")
    private short[] field2452;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "[S")
    private short[] field2453;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 5)
    public final void method1073(int arg0) {
        if (this.field2463 == -1) {
            this.field2463 = 0;
            if (this.field2436 != null && (this.field2455 == null || this.field2455[0] == 10)) {
                this.field2463 = 1;
            }
            for (int var2 = 0; var2 < 5; var2++) {
                if (this.field2470[var2] != null) {
                    this.field2463 = 1;
                    break;
                }
            }
        }
        if (arg0 < 33) {
            this.field2419 = -31;
        }
        field2484++;
        if (this.field2417 == -1) {
            this.field2417 = this.field2446 == 0 ? 0 : 1;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILve;)Lve;", line = 46)
    public final class255 method1074(int arg0, int arg1, class255 arg2) {
        int var4 = 41 / ((arg1 - 51) / 53);
        field2424++;
        if (this.field2465 == null) {
            return arg2;
        } else {
            class50 var5 = (class50) this.field2465.method280((long) arg0, 29153);
            return var5 == null ? arg2 : var5.field751;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)Z", line = 63)
    public final boolean method1075(boolean arg0) {
        field2437++;
        if (!arg0) {
            this.field2459 = false;
        }
        if (this.field2454 == null) {
            return this.field2461 != -1 || this.field2411 != null;
        }
        for (int var2 = 0; var2 < this.field2454.length; var2++) {
            if (this.field2454[var2] != -1) {
                class145 var3 = class289.method2046(-12453, this.field2454[var2]);
                if (var3.field2461 != -1 || var3.field2411 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IJ)V", line = 96)
    public static final void method1076(int arg0, long arg1) {
        field2448++;
        if (arg1 == 0L) {
            return;
        }
        if (class29.field453 >= arg0) {
            class260.method1807(1, class49.field728, class47.field722, 0);
            return;
        }
        class255 var3 = class147.method1091(arg1, -128).method1787(true);
        for (int var4 = 0; var4 < class29.field453; var4++) {
            if (class114.field1933[var4] == arg1) {
                class260.method1807(1, class49.field728, class3.method14(new class255[] { var3, class125.field2072 }, (byte) -120), 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class33.field529; var5++) {
            if (class209.field3570[var5] == arg1) {
                class260.method1807(1, class49.field728, class3.method14(new class255[] { class213.field3624, var3, class24.field377 }, (byte) -123), 0);
                return;
            }
        }
        if (var3.method1752(true, class276.field4742.field4068)) {
            class260.method1807(1, class49.field728, class141.field2339, 0);
            return;
        }
        class114.field1933[class29.field453] = arg1;
        class184.field2969[class29.field453++] = class147.method1091(arg1, -128);
        class79.field1283++;
        class251.field4224 = class251.field4240;
        class255.field4318.method1523(22260, 31);
        class255.field4318.method449(arg0 ^ 0xFF0064, arg1);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[[III[[IIZIZILdm;)Ltb;", line = 156)
    public final class209 method1077(int arg0, int[][] arg1, int arg2, int arg3, int[][] arg4, int arg5, boolean arg6, int arg7, boolean arg8, int arg9, class273 arg10) {
        if (arg7 > -43) {
            this.method1073(80);
        }
        field2451++;
        if (class281.field4827) {
            long var12;
            if (this.field2455 == null) {
                var12 = (long) ((this.field2458 << 10) + arg3);
            } else {
                var12 = (long) ((arg0 << 3) + (this.field2458 << 10) + arg3);
            }
            class209 var14 = (class209) class25.field383.method558(var12, true);
            class193 var15;
            class273 var16;
            if (var14 == null) {
                var15 = this.method1084(arg3, false, 10596, arg0);
                if (var15 == null) {
                    class141.field2338.field3573 = null;
                    class141.field2338.field3572 = null;
                    return class141.field2338;
                }
                if (arg0 == 10 && arg3 > 3) {
                    var15.method1349(256);
                }
                if (arg8) {
                    var16 = var15.method1368(arg10);
                } else {
                    var16 = null;
                }
                class209 var17 = new class209();
                var17.field3572 = var16;
                var17.field3573 = var15;
                class25.field383.method555(var17, var12, 0);
            } else {
                var15 = (class193) var14.field3573;
                var16 = var14.field3572;
            }
            boolean var18 = this.field2459 & arg6;
            class193 var19 = var15.method1378(this.field2422 != 3, this.field2422 == 0, true, true, true, true, !var18, true, true, true, true);
            if (this.field2422 != 0) {
                var19.method1342(this.field2422, this.field2471, var15, arg4, arg1, arg5, arg2, arg9);
            }
            var19.method1382(this.field2463 == 0, true, true, true, this.field2463 == 0, true, false);
            class141.field2338.field3573 = var19;
            class141.field2338.field3572 = var16;
            var19.field3151 = var18;
            return class141.field2338;
        }
        long var20;
        if (this.field2455 == null) {
            var20 = (long) ((this.field2458 << 10) + arg3);
        } else {
            var20 = (long) ((arg0 << 3) + (this.field2458 << 10) + arg3);
        }
        boolean var22;
        if (arg6 && this.field2459) {
            var22 = true;
            var20 |= Long.MIN_VALUE;
        } else {
            var22 = false;
        }
        class177 var23 = (class177) class25.field383.method558(var20, true);
        if (var23 == null) {
            class200 var24 = this.method1088(2, arg3, arg0);
            if (var24 == null) {
                class141.field2338.field3573 = null;
                return class141.field2338;
            }
            var24.method1452();
            if (arg0 == 10 && arg3 > 3) {
                var24.method1442(256);
            }
            if (var22) {
                var24.field3434 = (short) (this.field2443 + 64);
                var24.field3450 = (short) (this.field2419 * 5 + 768);
                var23 = var24;
                var24.method1454();
            } else {
                var23 = new class267(var24, this.field2443 + 64, this.field2419 * 5 + 768, -50, -10, -50);
            }
            class25.field383.method555(var23, var20, 0);
        }
        if (var22) {
            var23 = ((class200) var23).method1443();
        }
        if (this.field2422 != 0) {
            if (var23 instanceof class267) {
                var23 = ((class267) var23).method1863(this.field2422, this.field2471, arg4, arg1, arg5, arg2, arg9, true);
            } else if (var23 instanceof class200) {
                var23 = ((class200) var23).method1435(this.field2422, this.field2471, arg4, arg1, arg5, arg2, arg9, true, false);
            }
        }
        class141.field2338.field3573 = var23;
        return class141.field2338;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)Z", line = 319)
    public final boolean method1078(byte arg0) {
        if (arg0 <= 95) {
            return true;
        }
        field2447++;
        if (this.field2436 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2436.length; var3++) {
            var2 &= class59.field895.method625(this.field2436[var3] & 0xFFFF, 0, 0);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V", line = 360)
    public static final void method1079(int arg0) {
        field2423++;
        if (class114.field1948 == 0) {
            return;
        }
        try {
            if (++class287.field4922 > 1500) {
                if (client.field4041 != null) {
                    client.field4041.method1650((byte) 1);
                    client.field4041 = null;
                }
                if (class17.field248 >= 1) {
                    class284.field4886 = -5;
                    class114.field1948 = 0;
                    return;
                }
                class114.field1948 = 1;
                if (class24.field367 == class185.field2976) {
                    class185.field2976 = class18.field285;
                } else {
                    class185.field2976 = class24.field367;
                }
                class17.field248++;
                class287.field4922 = 0;
            }
            if (class114.field1948 == 1) {
                class63.field957 = class221.field3728.method237(0, class185.field2976, class68.field1024);
                class114.field1948 = 2;
            }
            if (class114.field1948 == arg0) {
                if (class63.field957.field2833 == 2) {
                    throw new IOException();
                }
                if (class63.field957.field2833 != 1) {
                    return;
                }
                client.field4041 = new class239((Socket) class63.field957.field2832, class221.field3728);
                class63.field957 = null;
                client.field4041.method1653(0, class255.field4318.field1066, (byte) -34, class255.field4318.field1068);
                if (class195.field3208 != null) {
                    class195.field3208.method1030((byte) -108);
                }
                if (class250.field4219 != null) {
                    class250.field4219.method1030((byte) -81);
                }
                int var1 = client.field4041.method1655(28982);
                if (class195.field3208 != null) {
                    class195.field3208.method1030((byte) -67);
                }
                if (class250.field4219 != null) {
                    class250.field4219.method1030((byte) -66);
                }
                if (var1 != 101) {
                    class114.field1948 = 0;
                    class284.field4886 = var1;
                    client.field4041.method1650((byte) 31);
                    client.field4041 = null;
                    return;
                }
                class114.field1948 = 3;
            }
            if (class114.field1948 == 3) {
                if (client.field4041.method1652(-13301) >= 2) {
                    int var2 = client.field4041.method1655(28982) << 8 | client.field4041.method1655(arg0 ^ 0x7134);
                    class90.method674(-127, var2);
                    if (class25.field386 == -1) {
                        class25.field386 = class60.field919;
                    }
                    class114.field1948 = 0;
                    client.field4041.method1650((byte) 110);
                    client.field4041 = null;
                    class261.method1817((byte) 30);
                    return;
                }
                return;
            }
        } catch (IOException var4) {
            if (client.field4041 != null) {
                client.field4041.method1650((byte) 89);
                client.field4041 = null;
            }
            if (class17.field248 >= 1) {
                class284.field4886 = -4;
                class114.field1948 = 0;
            } else {
                class17.field248++;
                class114.field1948 = 1;
                class287.field4922 = 0;
                if (class24.field367 == class185.field2976) {
                    class185.field2976 = class18.field285;
                } else {
                    class185.field2976 = class24.field367;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIII)V", line = 499)
    public static final void method1080(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2468++;
        if (arg3 != 9778) {
            method1080(109, -120, 74, 99, -39, -7, -91);
        }
        class136.method1022(120, arg1);
        int var7 = 0;
        int var8 = arg1;
        int var9 = arg1 - arg6;
        int var10 = -arg1;
        int var11 = -1;
        if (var9 < 0) {
            var9 = 0;
        }
        int var12 = var9;
        int[] var13 = class250.field4213[arg2];
        int var14 = -1;
        int var15 = -var9;
        int var16 = arg4 + var9;
        int var17 = arg4 - var9;
        class30.method170(var17, var13, arg4 - arg1, arg5, -30310);
        class30.method170(var16, var13, var17, arg0, -30310);
        class30.method170(arg4 + arg1, var13, var16, arg5, -30310);
        while (var8 > var7) {
            var11 += 2;
            var14 += 2;
            var10 += var14;
            var15 += var11;
            if (var15 >= 0 && var12 >= 1) {
                class20.field336[var12] = var7;
                var12--;
                var15 -= var12 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var8--;
                if (var8 < var9) {
                    int[] var18 = class250.field4213[arg2 + var8];
                    int[] var19 = class250.field4213[arg2 - var8];
                    int var20 = class20.field336[var8];
                    int var21 = arg4 + var7;
                    int var22 = arg4 - var7;
                    int var23 = arg4 + var20;
                    int var24 = arg4 - var20;
                    class30.method170(var24, var18, var22, arg5, arg3 - 40088);
                    class30.method170(var23, var18, var24, arg0, -30310);
                    class30.method170(var21, var18, var23, arg5, -30310);
                    class30.method170(var24, var19, var22, arg5, arg3 - 40088);
                    class30.method170(var23, var19, var24, arg0, -30310);
                    class30.method170(var21, var19, var23, arg5, -30310);
                } else {
                    int[] var25 = class250.field4213[arg2 + var8];
                    int[] var26 = class250.field4213[arg2 - var8];
                    int var27 = arg4 - var7;
                    int var28 = arg4 + var7;
                    class30.method170(var28, var25, var27, arg5, -30310);
                    class30.method170(var28, var26, var27, arg5, arg3 - 40088);
                }
                var10 -= var8 << 1;
            }
            int var29 = arg4 + var8;
            int[] var30 = class250.field4213[arg2 + var7];
            int[] var31 = class250.field4213[arg2 - var7];
            int var32 = arg4 - var8;
            if (var9 > var7) {
                int var33 = var7 <= var12 ? var12 : class20.field336[var7];
                int var34 = arg4 + var33;
                int var35 = arg4 - var33;
                class30.method170(var35, var30, var32, arg5, -30310);
                class30.method170(var34, var30, var35, arg0, -30310);
                class30.method170(var29, var30, var34, arg5, arg3 - 40088);
                class30.method170(var35, var31, var32, arg5, -30310);
                class30.method170(var34, var31, var35, arg0, arg3 ^ 0xFFFFAFA8);
                class30.method170(var29, var31, var34, arg5, -30310);
            } else {
                class30.method170(var29, var30, var32, arg5, -30310);
                class30.method170(var29, var31, var32, arg5, arg3 ^ 0xFFFFAFA8);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lpb;I)V", line = 639)
    public final void method1081(class70 arg0, int arg1) {
        field2415++;
        while (true) {
            int var3 = arg0.method481(0);
            if (var3 == 0) {
                if (arg1 != 0) {
                    this.method1085((byte) 4, (class70) null, 16);
                }
                return;
            }
            this.method1085((byte) -66, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z[[IIIIIILn;IILdm;[[I)Ltb;", line = 678)
    public final class209 method1082(boolean arg0, int[][] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class271 arg7, int arg8, int arg9, class273 arg10, int[][] arg11) {
        field2428++;
        if (arg5 != -19805) {
            this.method1074(22, 34, (class255) null);
        }
        if (!class281.field4827) {
            long var19;
            if (this.field2455 == null) {
                var19 = (long) ((this.field2458 << 10) + arg2);
            } else {
                var19 = (long) ((this.field2458 << 10) + arg2 + (arg6 << 3));
            }
            class267 var21 = (class267) class217.field3682.method558(var19, true);
            if (var21 == null) {
                class200 var22 = this.method1088(2, arg2, arg6);
                if (var22 == null) {
                    return null;
                }
                var21 = new class267(var22, this.field2443 + 64, this.field2419 * 5 + 768, -50, -10, -50);
                class217.field3682.method555(var21, var19, 0);
            }
            boolean var23 = false;
            if (arg7 != null) {
                var21 = (class267) arg7.method1894(var21, arg4, arg2, -30715);
                var23 = true;
            }
            if (arg6 == 10 && arg2 > 3) {
                if (!var23) {
                    var21 = (class267) var21.method1373(true, true);
                    var23 = true;
                }
                var21.method1349(256);
            }
            if (this.field2422 != 0) {
                if (!var23) {
                    boolean var24 = true;
                    var21 = (class267) var21.method1373(true, true);
                }
                var21 = var21.method1863(this.field2422, this.field2471, arg1, arg11, arg9, arg8, arg3, false);
            }
            class141.field2338.field3573 = var21;
            return class141.field2338;
        }
        long var13;
        if (this.field2455 == null) {
            var13 = (long) ((this.field2458 << 10) + arg2);
        } else {
            var13 = (long) ((this.field2458 << 10) + (arg6 << 3) + arg2);
        }
        class193 var15 = (class193) class217.field3682.method558(var13, true);
        if (var15 == null) {
            var15 = this.method1084(arg2, true, arg5 ^ 0xFFFF9BC7, arg6);
            if (var15 == null) {
                return null;
            }
            var15.method1361();
            var15.method1382(false, false, false, true, false, false, true);
            class217.field3682.method555(var15, var13, 0);
        }
        class193 var16 = var15;
        boolean var17 = false;
        if (arg7 != null) {
            var17 = true;
            var16 = (class193) arg7.method1894(var15, arg4, arg2, arg5 ^ 0x3AA6);
        }
        if (arg6 == 10 && arg2 > 3) {
            if (!var17) {
                var16 = (class193) var16.method1373(true, true);
                var17 = true;
            }
            var16.method1349(256);
        }
        if (arg0) {
            class141.field2338.field3572 = var16.method1368(arg10);
        } else {
            class141.field2338.field3572 = null;
        }
        if (this.field2422 != 0) {
            if (!var17) {
                var16 = (class193) var16.method1373(true, true);
                boolean var18 = true;
            }
            var16.method1342(this.field2422, this.field2471, var15, arg1, arg11, arg9, arg8, arg3);
        }
        class141.field2338.field3573 = var16;
        return class141.field2338;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)V", line = 812)
    public static final void method1083(boolean arg0) {
        class255.field4318.method1523(22260, 218);
        class255.field4318.method462(class93.field1604, (byte) -61);
        field2469++;
        class41.field638++;
        if (!arg0) {
            field2426 = (class21[]) null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZII)Lbg;", line = 854)
    private final class193 method1084(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg2 != 10596) {
            this.field2422 = -7;
        }
        field2477++;
        Object var5 = null;
        int var6 = this.field2419 * 5 + 768;
        int var7 = this.field2443 + 64;
        class193 var11;
        if (this.field2455 == null) {
            if (arg3 != 10) {
                return null;
            }
            if (this.field2436 == null) {
                return null;
            }
            int var13 = this.field2436.length;
            if (var13 == 0) {
                return null;
            }
            long var14 = 0L;
            for (int var16 = 0; var16 < var13; var16++) {
                var14 = var14 * 67783L + (long) this.field2436[var16];
            }
            if (arg1) {
                var14 = ~var14;
            }
            var11 = (class193) class95.field1638.method558(var14, true);
            if (var11 == null) {
                class200 var17 = null;
                for (int var18 = 0; var18 < var13; var18++) {
                    var17 = class200.method1431(class59.field895, this.field2436[var18] & 0xFFFF, 0);
                    if (var17 == null) {
                        return null;
                    }
                    if (var13 > 1) {
                        class137.field2295[var18] = var17;
                    }
                }
                if (var13 > 1) {
                    var17 = new class200(class137.field2295, var13);
                }
                var11 = new class193(var17, var7, var6, arg1);
                class95.field1638.method555(var11, var14, 0);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2455.length; var9++) {
                if (this.field2455[var9] == arg3) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2436[var8];
            if (arg1) {
                var10 += 65536;
            }
            var11 = (class193) class95.field1638.method558((long) var10, true);
            if (var11 == null) {
                class200 var12 = class200.method1431(class59.field895, var10 & 0xFFFF, 0);
                if (var12 == null) {
                    return null;
                }
                var11 = new class193(var12, var7, var6, arg1);
                class95.field1638.method555(var11, (long) var10, arg2 ^ 0x2964);
            }
        }
        boolean var19 = this.field2485;
        if (arg3 == 2 && arg0 > 3) {
            var19 = !var19;
        }
        boolean var20 = arg0 == 0 && this.field2460 == 128 && this.field2413 == 128 && this.field2420 == 0 && this.field2433 == 0 && !var19;
        boolean var21 = this.field2462 == 128 && this.field2466 == 0;
        class193 var22 = var11.method1378(var20, var21, this.field2434 == null, true, var11.method1337() == var7, arg0 == 0 && !var19, true, var6 == var11.method1359(), true, !var19, this.field2452 == null);
        if (var19) {
            var22.method1346();
        }
        if (arg3 == 4 && arg0 > 3) {
            var22.method1340(256);
            var22.method1353(45, 0, -45);
        }
        int var23 = arg0 & 0x3;
        if (var23 == 1) {
            var22.method1347();
        } else if (var23 == 2) {
            var22.method1348();
        } else if (var23 == 3) {
            var22.method1331();
        }
        if (this.field2434 != null) {
            for (int var24 = 0; var24 < this.field2434.length; var24++) {
                var22.method1377(this.field2434[var24], this.field2438[var24]);
            }
        }
        if (this.field2452 != null) {
            for (int var25 = 0; var25 < this.field2452.length; var25++) {
                var22.method1367(this.field2452[var25], this.field2453[var25]);
            }
        }
        if (this.field2460 != 128 || this.field2462 != 128 || this.field2413 != 128) {
            var22.method1352(this.field2460, this.field2462, this.field2413);
        }
        if (this.field2420 != 0 || this.field2466 != 0 || this.field2433 != 0) {
            var22.method1353(this.field2420, this.field2466, this.field2433);
        }
        if (var22.method1337() != var7) {
            var22.method1372(var7);
        }
        if (var22.method1359() != var6) {
            var22.method1384(var6);
        }
        return var22;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLpb;I)V", line = 1059)
    private final void method1085(byte arg0, class70 arg1, int arg2) {
        if (arg2 == 1) {
            int var23 = arg1.method481(0);
            if (var23 > 0) {
                if (this.field2436 == null || class154.field2628) {
                    this.field2436 = new int[var23];
                    this.field2455 = new int[var23];
                    for (int var24 = 0; var24 < var23; var24++) {
                        this.field2436[var24] = arg1.method423(255);
                        this.field2455[var24] = arg1.method481(class127.method943(arg0, -66));
                    }
                } else {
                    arg1.field1068 += var23 * 3;
                }
            }
        } else if (arg2 == 2) {
            this.field2425 = arg1.method479(-1);
        } else if (arg2 == 5) {
            int var4 = arg1.method481(0);
            if (var4 > 0) {
                if (this.field2436 == null || class154.field2628) {
                    this.field2436 = new int[var4];
                    this.field2455 = null;
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field2436[var5] = arg1.method423(255);
                    }
                } else {
                    arg1.field1068 += var4 * 2;
                }
            }
        } else if (arg2 == 14) {
            this.field2442 = arg1.method481(0);
        } else if (arg2 == 15) {
            this.field2444 = arg1.method481(0);
        } else if (arg2 == 17) {
            this.field2446 = 0;
            this.field2472 = false;
        } else if (arg2 == 18) {
            this.field2472 = false;
        } else if (arg2 == 19) {
            this.field2463 = arg1.method481(0);
        } else if (arg2 == 21) {
            this.field2422 = 1;
        } else if (arg2 == 22) {
            this.field2459 = true;
        } else if (arg2 == 23) {
            this.field2440 = true;
        } else if (arg2 == 24) {
            this.field2416 = arg1.method423(arg0 ^ 0xFFFFFF41);
            if (this.field2416 == 65535) {
                this.field2416 = -1;
            }
        } else if (arg2 == 27) {
            this.field2446 = 1;
        } else if (arg2 == 28) {
            this.field2479 = arg1.method481(0);
        } else if (arg2 == 29) {
            this.field2443 = arg1.method466((byte) -98);
        } else if (arg2 == 39) {
            this.field2419 = arg1.method466((byte) -75) * 5;
        } else if (arg2 >= 30 && arg2 < 35) {
            this.field2470[arg2 - 30] = arg1.method479(-1);
            if (this.field2470[arg2 - 30].method1779(arg0 ^ 0x3D, class87.field1400)) {
                this.field2470[arg2 - 30] = null;
            }
        } else if (arg2 == 40) {
            int var6 = arg1.method481(0);
            this.field2438 = new short[var6];
            this.field2434 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2434[var7] = (short) arg1.method423(255);
                this.field2438[var7] = (short) arg1.method423(255);
            }
        } else if (arg2 == 41) {
            int var21 = arg1.method481(0);
            this.field2452 = new short[var21];
            this.field2453 = new short[var21];
            for (int var22 = 0; var22 < var21; var22++) {
                this.field2452[var22] = (short) arg1.method423(class127.method943(arg0, -191));
                this.field2453[var22] = (short) arg1.method423(255);
            }
        } else if (arg2 == 42) {
            int var8 = arg1.method481(arg0 + 66);
            this.field2430 = new byte[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2430[var9] = arg1.method466((byte) -61);
            }
        } else if (arg2 == 60) {
            this.field2464 = arg1.method423(255);
        } else if (arg2 == 62) {
            this.field2485 = true;
        } else if (arg2 == 64) {
            this.field2412 = false;
        } else if (arg2 == 65) {
            this.field2460 = arg1.method423(255);
        } else if (arg2 == 66) {
            this.field2462 = arg1.method423(255);
        } else if (arg2 == 67) {
            this.field2413 = arg1.method423(arg0 + 321);
        } else if (arg2 == 68) {
            this.field2429 = arg1.method423(255);
        } else if (arg2 == 69) {
            this.field2414 = arg1.method481(arg0 ^ 0xFFFFFFBE);
        } else if (arg2 == 70) {
            this.field2420 = arg1.method454((byte) 84);
        } else if (arg2 == 71) {
            this.field2466 = arg1.method454((byte) 84);
        } else if (arg2 == 72) {
            this.field2433 = arg1.method454((byte) 84);
        } else if (arg2 == 73) {
            this.field2449 = true;
        } else if (arg2 == 74) {
            this.field2418 = true;
        } else if (arg2 == 75) {
            this.field2417 = arg1.method481(0);
        } else if (arg2 == 77 || arg2 == 92) {
            this.field2441 = arg1.method423(255);
            if (this.field2441 == 65535) {
                this.field2441 = -1;
            }
            int var18 = -1;
            this.field2445 = arg1.method423(255);
            if (this.field2445 == 65535) {
                this.field2445 = -1;
            }
            if (arg2 == 92) {
                var18 = arg1.method423(255);
                if (var18 == 65535) {
                    var18 = -1;
                }
            }
            int var19 = arg1.method481(0);
            this.field2454 = new int[var19 + 2];
            for (int var20 = 0; var20 <= var19; var20++) {
                this.field2454[var20] = arg1.method423(255);
                if (this.field2454[var20] == 65535) {
                    this.field2454[var20] = -1;
                }
            }
            this.field2454[var19 + 1] = var18;
        } else if (arg2 == 78) {
            this.field2461 = arg1.method423(arg0 ^ 0xFFFFFF41);
            this.field2432 = arg1.method481(0);
        } else if (arg2 == 79) {
            this.field2450 = arg1.method423(255);
            this.field2431 = arg1.method423(255);
            this.field2432 = arg1.method481(0);
            int var10 = arg1.method481(arg0 ^ 0xFFFFFFBE);
            this.field2411 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2411[var11] = arg1.method423(255);
            }
        } else if (arg2 == 81) {
            this.field2422 = 2;
            this.field2471 = (short) (arg1.method481(0) * 256);
        } else if (arg2 == 82) {
            this.field2481 = true;
        } else if (arg2 == 88) {
            this.field2480 = false;
        } else if (arg2 == 89) {
            this.field2457 = false;
        } else if (arg2 == 90) {
            this.field2483 = true;
        } else if (arg2 == 91) {
            this.field2435 = true;
        } else if (arg2 == 93) {
            this.field2422 = 3;
            this.field2471 = (short) arg1.method423(255);
        } else if (arg2 == 94) {
            this.field2422 = 4;
        } else if (arg2 == 95) {
            this.field2422 = 5;
        } else if (arg2 == 96) {
            this.field2476 = true;
        } else if (arg2 == 97) {
            this.field2467 = true;
        } else if (arg2 == 249) {
            int var12 = arg1.method481(0);
            if (this.field2465 == null) {
                int var13 = class287.method2033(var12, -1410546649);
                this.field2465 = new class47(var13);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                boolean var15 = arg1.method481(arg0 ^ 0xFFFFFFBE) == 1;
                int var16 = arg1.method465(true);
                class208 var17;
                if (var15) {
                    var17 = new class50(arg1.method479(-1));
                } else {
                    var17 = new class172(arg1.method469(119));
                }
                this.field2465.method284(true, (long) var16, var17);
            }
        }
        field2473++;
        if (arg0 != -66) {
            this.method1085((byte) -103, (class70) null, -40);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)I", line = 1467)
    public final int method1086(int arg0, int arg1, int arg2) {
        field2439++;
        if (arg1 != -1) {
            this.method1082(true, (int[][]) ((int[][]) null), 10, 74, -62, -28, -106, (class271) null, 111, -96, (class273) null, (int[][]) ((int[][]) null));
        }
        if (this.field2465 == null) {
            return arg0;
        } else {
            class172 var4 = (class172) this.field2465.method280((long) arg2, arg1 ^ 0xFFFF8E1E);
            return var4 == null ? arg0 : var4.field2849;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V", line = 1507)
    public static void method1087(byte arg0) {
        field2426 = null;
        field2421 = null;
        int var1 = -42 % ((arg0 + 58) / 37);
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(III)Llb;", line = 1550)
    private final class200 method1088(int arg0, int arg1, int arg2) {
        field2478++;
        class200 var4 = null;
        if (arg0 != 2) {
            this.field2422 = 11;
        }
        boolean var5 = this.field2485;
        if (arg2 == 2 && arg1 > 3) {
            var5 = !var5;
        }
        if (this.field2455 == null) {
            if (arg2 != 10) {
                return null;
            }
            if (this.field2436 == null) {
                return null;
            }
            int var9 = this.field2436.length;
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = this.field2436[var10];
                if (var5) {
                    var11 += 65536;
                }
                var4 = (class200) class95.field1638.method558((long) var11, true);
                if (var4 == null) {
                    var4 = class200.method1431(class59.field895, var11 & 0xFFFF, 0);
                    if (var4 == null) {
                        return null;
                    }
                    if (var5) {
                        var4.method1439();
                    }
                    class95.field1638.method555(var4, (long) var11, 0);
                }
                if (var9 > 1) {
                    class137.field2295[var10] = var4;
                }
            }
            if (var9 > 1) {
                var4 = new class200(class137.field2295, var9);
            }
        } else {
            int var6 = -1;
            for (int var7 = 0; var7 < this.field2455.length; var7++) {
                if (this.field2455[var7] == arg2) {
                    var6 = var7;
                    break;
                }
            }
            if (var6 == -1) {
                return null;
            }
            int var8 = this.field2436[var6];
            if (var5) {
                var8 += 65536;
            }
            var4 = (class200) class95.field1638.method558((long) var8, true);
            if (var4 == null) {
                var4 = class200.method1431(class59.field895, var8 & 0xFFFF, 0);
                if (var4 == null) {
                    return null;
                }
                if (var5) {
                    var4.method1439();
                }
                class95.field1638.method555(var4, (long) var8, 0);
            }
        }
        boolean var12;
        if (this.field2420 == 0 && this.field2466 == 0 && this.field2433 == 0) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2460 == 128 && this.field2462 == 128 && this.field2413 == 128) {
            var13 = false;
        } else {
            var13 = true;
        }
        class200 var14 = new class200(var4, arg1 == 0 && !var13 && !var12, this.field2434 == null, this.field2452 == null, true);
        if (arg2 == 4 && arg1 > 3) {
            var14.method1442(256);
            var14.method1433(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1456();
        } else if (var15 == 2) {
            var14.method1457();
        } else if (var15 == 3) {
            var14.method1459();
        }
        if (this.field2434 != null) {
            for (int var16 = 0; var16 < this.field2434.length; var16++) {
                if (this.field2430 == null || var16 >= this.field2430.length) {
                    var14.method1438(this.field2434[var16], this.field2438[var16]);
                } else {
                    var14.method1438(this.field2434[var16], class177.field2900[this.field2430[var16] & 0xFF]);
                }
            }
        }
        if (this.field2452 != null) {
            for (int var17 = 0; var17 < this.field2452.length; var17++) {
                var14.method1448(this.field2452[var17], this.field2453[var17]);
            }
        }
        if (var13) {
            var14.method1441(this.field2460, this.field2462, this.field2413);
        }
        if (var12) {
            var14.method1433(this.field2420, this.field2466, this.field2433);
        }
        return var14;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)Lmg;", line = 1738)
    public final class145 method1089(int arg0) {
        if (arg0 >= -78) {
            this.method1088(3, 60, 122);
        }
        field2482++;
        int var2 = -1;
        if (this.field2441 != -1) {
            var2 = class282.method1995((byte) -51, this.field2441);
        } else if (this.field2445 != -1) {
            var2 = class76.field1246[this.field2445];
        }
        if (var2 < 0 || var2 >= this.field2454.length - 1 || this.field2454[var2] == -1) {
            int var3 = this.field2454[this.field2454.length - 1];
            return var3 == -1 ? null : class289.method2046(-12453, var3);
        } else {
            return class289.method2046(-12453, this.field2454[var2]);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)Z", line = 1785)
    public final boolean method1090(int arg0, int arg1) {
        field2474++;
        int var3 = 45 / ((arg1 - 66) / 53);
        if (this.field2455 != null) {
            for (int var6 = 0; var6 < this.field2455.length; var6++) {
                if (this.field2455[var6] == arg0) {
                    return class59.field895.method625(this.field2436[var6] & 0xFFFF, 0, 0);
                }
            }
            return true;
        } else if (this.field2436 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var4 = true;
            for (int var5 = 0; var5 < this.field2436.length; var5++) {
                var4 &= class59.field895.method625(this.field2436[var5] & 0xFFFF, 0, 0);
            }
            return var4;
        } else {
            return true;
        }
    }
}
