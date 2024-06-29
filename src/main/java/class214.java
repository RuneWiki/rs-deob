import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class214 extends class115 {

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "Lub;")
    public static class227 field3610 = class257.method1749("mapscene", 17263);

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field3612 = 0;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "Lub;")
    public static class227 field3620 = class257.method1749("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 17263);

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "[J")
    public static long[] field3616 = new long[32];

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "B")
    public byte field3617;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public int field3618;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "Lnj;")
    public static class226 field3619;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "Lnh;")
    public class57 field3609;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "[I")
    public static int[] field3613;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static final void method1358(int arg0) {
        if (arg0 > -2) {
            method1358(104);
        }
        field3614++;
        for (int var1 = 0; var1 < class147.field2572; var1++) {
            int var2 = class131.field2293[var1];
            class195 var3 = class220.field3715[var2];
            int var4 = class32.field512.method1471(255);
            if ((var4 & 0x1) != 0) {
                var3.field108 = class32.field512.method1472(0);
                if (var3.field108 == 65535) {
                    var3.field108 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var5 = class32.field512.method1439(-128);
                int var6 = class32.field512.method1456(-9944);
                var3.method15((byte) 51, class253.field4393, var6, var5);
            }
            if ((var4 & 0x2) != 0) {
                int var7 = class32.field512.method1471(255);
                int var8 = class32.field512.method1426(false);
                var3.method15((byte) 46, class253.field4393, var8, var7);
                var3.field104 = class253.field4393 + 300;
                var3.field77 = class32.field512.method1471(255);
            }
            if ((var4 & 0x10) != 0) {
                int var9 = class32.field512.method1447(0);
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = class32.field512.method1426(false);
                class33.method174(var9, var3, 0, var10);
            }
            if ((var4 & 0x20) != 0) {
                if (var3.field3315.method930((byte) 87)) {
                    class188.method1197(false, var3);
                }
                var3.field3315 = class59.method362(-32544, class32.field512.method1472(0));
                var3.field63 = var3.field3315.field2523;
                var3.field64 = var3.field3315.field2547;
                var3.field45 = var3.field3315.field2542;
                var3.field81 = var3.field3315.field2531;
                var3.field100 = var3.field3315.field2557;
                var3.field61 = var3.field3315.field2567;
                var3.field55 = var3.field3315.field2561;
                var3.field105 = var3.field3315.field2577;
                var3.field67 = var3.field3315.field2540;
                if (var3.field3315.method930((byte) 81)) {
                    class187.method1188(var3, var3.field78[0], 3319, (class225) null, var3.field49[0], 0, class64.field1171, (class45) null);
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field54 = class32.field512.method1482(-128);
                var3.field87 = class32.field512.method1482(-128);
            }
            if ((var4 & 0x40) != 0) {
                var3.field88 = class32.field512.method1480(-118);
                var3.field71 = 100;
            }
            if ((var4 & 0x80) != 0) {
                var3.field69 = class32.field512.method1482(-128);
                int var11 = class32.field512.method1441(-115);
                var3.field110 = 0;
                var3.field46 = var11 >> 16;
                var3.field97 = (var11 & 0xFFFF) + class253.field4393;
                if (var3.field69 == 65535) {
                    var3.field69 = -1;
                }
                var3.field109 = 0;
                if (class253.field4393 < var3.field97) {
                    var3.field109 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BIIII)V")
    public static final void method1359(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 - arg1 >= class125.field2234 && class19.field331 >= (arg1 + arg2) && (arg4 - arg1) >= class161.field2718 && class46.field817 >= arg1 + arg4) {
            class88.method524((byte) 83, arg3, arg1, arg4, arg2);
        } else {
            class43.method231(arg1, arg4, arg3, arg2, 2);
        }
        if (arg0 == 71) {
            field3611++;
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    public static final void method1360(int arg0) {
        field3615++;
        if (arg0 > -121) {
            method1361(25, 16, (byte) 48, 92, 97, 99);
        }
        class257.field4502.method1728(true);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBIII)V")
    public static final void method1361(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field3608++;
        long var6 = class184.method1174(arg5, arg4, arg3);
        if (var6 != 0L) {
            int var8 = (int) var6 >> 20 & 0x3;
            int var9 = ((int) var6 & 0x7FA20) >> 14;
            int var10 = arg0;
            if (var6 > 0L) {
                var10 = arg1;
            }
            int var11 = (52736 - (arg3 * 512)) * 4 + arg4 * 4 + 24624;
            int[] var12 = class111.field2069;
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class45 var14 = class220.method1389(var13, (byte) 100);
            if (var14.field801 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var12[var11] = var10;
                        var12[var11 + 512] = var10;
                        var12[var11 + 1024] = var10;
                        var12[var11 + 1536] = var10;
                    } else if (var8 == 1) {
                        var12[var11] = var10;
                        var12[var11 + 1] = var10;
                        var12[var11 + 2] = var10;
                        var12[var11 + 3] = var10;
                    } else if (var8 == 2) {
                        var12[var11 + 3] = var10;
                        var12[var11 + 3 + 512] = var10;
                        var12[var11 + 3 + 1024] = var10;
                        var12[var11 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var12[var11 + 1536] = var10;
                        var12[var11 + 1 + 1536] = var10;
                        var12[var11 + 2 + 1536] = var10;
                        var12[var11 + 3 + 1536] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var12[var11] = var10;
                    } else if (var8 == 1) {
                        var12[var11 + 3] = var10;
                    } else if (var8 == 2) {
                        var12[var11 + 1536 + 3] = var10;
                    } else if (var8 == 3) {
                        var12[var11 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var12[var11] = var10;
                        var12[var11 + 512] = var10;
                        var12[var11 + 1024] = var10;
                        var12[var11 + 1536] = var10;
                    } else if (var8 == 0) {
                        var12[var11] = var10;
                        var12[var11 + 1] = var10;
                        var12[var11 + 2] = var10;
                        var12[var11 + 3] = var10;
                    } else if (var8 == 1) {
                        var12[var11 + 3] = var10;
                        var12[var11 + 515] = var10;
                        var12[var11 + 3 + 1024] = var10;
                        var12[var11 + 1536 + 3] = var10;
                    } else if (var8 == 2) {
                        var12[var11 + 1536] = var10;
                        var12[var11 + 1537] = var10;
                        var12[var11 + 1538] = var10;
                        var12[var11 + 1539] = var10;
                    }
                }
            } else {
                class209 var15 = class168.field2807[var14.field801];
                if (var15 != null) {
                    int var16 = (var14.field810 * 4 - var15.field822) / 2;
                    int var17 = (var14.field790 * 4 - var15.field820) / 2;
                    var15.method258(arg4 * 4 + var16 + 48, (-arg3 - var14.field790 + 104) * 4 + 48 + var17);
                }
            }
        }
        long var18 = class40.method214(arg5, arg4, arg3);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = ((int) var18 & 0x7EF83) >> 14;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class45 var23 = class220.method1389(var22, (byte) 54);
            if (var23.field801 != -1) {
                class209 var27 = class168.field2807[var23.field801];
                if (var27 != null) {
                    int var28 = (var23.field810 * 4 - var27.field822) / 2;
                    int var29 = (var23.field790 * 4 - var27.field820) / 2;
                    var27.method258(arg4 * 4 + var28 + 48, (-var23.field790 + 104 + -arg3) * 4 + 48 + var29);
                }
            } else if (var21 == 9) {
                int var24 = 15658734;
                if (var18 > 0L) {
                    var24 = 15597568;
                }
                int[] var25 = class111.field2069;
                int var26 = (103 - arg3) * 512 * 4 + arg4 * 4 + 24624;
                if (var20 == 0 || var20 == 2) {
                    var25[var26 + 1536] = var24;
                    var25[var26 + 1024 + 1] = var24;
                    var25[var26 + 512 + 2] = var24;
                    var25[var26 + 3] = var24;
                } else {
                    var25[var26] = var24;
                    var25[var26 + 513] = var24;
                    var25[var26 + 1024 + 2] = var24;
                    var25[var26 + 1536 + 3] = var24;
                }
            }
        }
        if (arg2 <= 118) {
            field3613 = null;
        }
        long var30 = class49.method290(arg5, arg4, arg3);
        if (var30 == 0L) {
            return;
        }
        int var32 = Integer.MAX_VALUE & (int) (var30 >>> 32);
        class45 var33 = class220.method1389(var32, (byte) 90);
        if (var33.field801 == -1) {
            return;
        }
        class209 var34 = class168.field2807[var33.field801];
        if (var34 != null) {
            int var35 = (var33.field810 * 4 - var34.field822) / 2;
            int var36 = (var33.field790 * 4 - var34.field820) / 2;
            var34.method258(arg4 * 4 + var35 + 48, (-arg3 + 104 - var33.field790) * 4 + 48 + var36);
            return;
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
    public static void method1362(int arg0) {
        field3613 = null;
        if (arg0 != 15773) {
            method1360(-73);
        }
        field3619 = null;
        field3620 = null;
        field3616 = null;
        field3610 = null;
    }
}
