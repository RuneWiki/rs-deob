import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class263 {

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "[I")
    public static int[] field3589 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field3595 = 0;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3596 = "Loaded sprites";

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field3599 = 0;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Z", line = 5)
    public static final boolean method1469(int arg0) {
        field3591++;
        if (arg0 != 20362) {
            field3589 = null;
        }
        return class165.field2103;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIII)V", line = 16)
    public static final void method1470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3588++;
        if (arg0 != 1) {
            return;
        }
        if (arg3 == arg4) {
            class334.method1904(arg4, arg5, arg1, (byte) 64, arg2);
        } else if (arg1 - arg4 >= class322.field4306 && (arg1 + arg4) <= class310.field4183 && class335.field4462 <= arg2 - arg3 && (arg2 + arg3) <= class6.field42) {
            class42.method198(arg1, arg5, arg4, arg2, -127, arg3);
        } else {
            class429.method2653(arg5, arg2, 0, arg3, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILfd;I)V", line = 39)
    public static final void method1471(int arg0, int arg1, class194 arg2, int arg3) {
        class182.field2311 = arg2;
        class183.field2334 = arg0;
        if (arg1 == 25570) {
            class323.field4314 = arg3;
            field3590++;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V", line = 52)
    public static void method1472(boolean arg0) {
        field3596 = null;
        if (arg0) {
            method1473(73, 46, 38, -10, (byte) 16, -105);
        }
        field3589 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIBI)V", line = 85)
    public static final void method1473(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != 68) {
            field3596 = null;
        }
        field3594++;
        if (arg0 > class6.field42 || arg3 < class335.field4462) {
            return;
        }
        boolean var6;
        if (arg1 < class322.field4306) {
            arg1 = class322.field4306;
            var6 = false;
        } else if (class310.field4183 >= arg1) {
            var6 = true;
        } else {
            arg1 = class310.field4183;
            var6 = false;
        }
        boolean var7;
        if (arg2 < class322.field4306) {
            var7 = false;
            arg2 = class322.field4306;
        } else if (class310.field4183 < arg2) {
            arg2 = class310.field4183;
            var7 = false;
        } else {
            var7 = true;
        }
        if (arg0 >= class335.field4462) {
            class296.method1740(arg1, class153.field1932[arg0++], (byte) 81, arg5, arg2);
        } else {
            arg0 = class335.field4462;
        }
        if (arg3 > class6.field42) {
            arg3 = class6.field42;
        } else {
            class296.method1740(arg1, class153.field1932[arg3--], (byte) 81, arg5, arg2);
        }
        if (var6 && var7) {
            for (int var8 = arg0; var8 <= arg3; var8++) {
                int[] var9 = class153.field1932[var8];
                var9[arg1] = var9[arg2] = arg5;
            }
            return;
        }
        if (var6) {
            for (int var10 = arg0; var10 <= arg3; var10++) {
                class153.field1932[var10][arg1] = arg5;
            }
            return;
        }
        if (var7) {
            for (int var11 = arg0; var11 <= arg3; var11++) {
                class153.field1932[var11][arg2] = arg5;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V", line = 197)
    public static final void method1474(int arg0) {
        field3597++;
        if (field3595 == 0 || field3595 == 5) {
            return;
        }
        try {
            if ((++class140.field1794) > 2000) {
                if (class264.field3605 != null) {
                    class264.field3605.method1538((byte) 5);
                    class264.field3605 = null;
                }
                if (class47.field470 >= 1) {
                    field3595 = 0;
                    class297.field4046 = -5;
                    return;
                }
                class47.field470++;
                class140.field1794 = 0;
                if (class379.field5353 == class359.field5077) {
                    class379.field5353 = class73.field813;
                } else {
                    class379.field5353 = class359.field5077;
                }
                field3595 = 1;
            }
            if (field3595 == arg0) {
                class77.field875 = class159.field2055.method2783(class379.field5353, 0, class420.field6136);
                field3595 = 2;
            }
            if (field3595 == 2) {
                if (class77.field875.field4123 == 2) {
                    throw new IOException();
                }
                if (class77.field875.field4123 != 1) {
                    return;
                }
                class264.field3605 = new class278((Socket) class77.field875.field4126, class159.field2055);
                class77.field875 = null;
                long var1 = class439.field6425 = class317.method1829(-92, class264.field3600);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class281.field3857.field3389 = 0;
                class281.field3857.method1386(-222840624, 14);
                class281.field3857.method1386(-222840624, var3);
                class264.field3605.method1537(class281.field3857.field3406, false, 2, 0);
                if (class281.field3855 != null) {
                    class281.field3855.method2153(arg0 ^ 0xFFFFFF82);
                }
                if (class414.field5973 != null) {
                    class414.field5973.method2153(-97);
                }
                int var4 = class264.field3605.method1540(1824);
                if (class281.field3855 != null) {
                    class281.field3855.method2153(-84);
                }
                if (class414.field5973 != null) {
                    class414.field5973.method2153(-57);
                }
                if (var4 != 0) {
                    field3595 = 0;
                    class297.field4046 = var4;
                    class264.field3605.method1538((byte) 5);
                    class264.field3605 = null;
                    return;
                }
                field3595 = 3;
            }
            if (field3595 == 3) {
                if (class264.field3605.method1539(-32565) < 8) {
                    return;
                }
                class264.field3605.method1529(class448.field6514.field3406, 8, arg0 ^ 0xFFFFB953, 0);
                class448.field6514.field3389 = 0;
                class109.field1337 = class448.field6514.method1379(-948919160);
                int[] var5 = new int[4];
                class281.field3857.field3389 = 0;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class109.field1337;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class109.field1337 >> 32);
                class281.field3857.method1386(-222840624, 10);
                class281.field3857.method1357(var5[0], 1826838072);
                class281.field3857.method1357(var5[1], 1826838072);
                class281.field3857.method1357(var5[2], 1826838072);
                class281.field3857.method1357(var5[3], arg0 ^ 0x6CE35639);
                class281.field3857.method1355(class317.method1829(122, class264.field3600), (byte) -77);
                class281.field3857.method1343(class230.field3173, 22608);
                class281.field3857.method1339(arg0 ^ 0xFFFFFFB3, class77.field876, class267.field3644);
                class41.field430.field3389 = 0;
                if (class129.field1664 == 40) {
                    class41.field430.method1386(-222840624, 18);
                } else {
                    class41.field430.method1386(-222840624, 16);
                }
                class41.field430.method1346(119, class281.field3857.field3389 + class75.method426(28555, class435.field6351) + 161);
                class41.field430.method1357(559, arg0 ^ 0x6CE35639);
                class41.field430.method1386(-222840624, class30.field291);
                class41.field430.method1386(arg0 ^ 0xF2B7B8D1, class219.method1184((byte) -72));
                class41.field430.method1346(121, class333.field4423);
                class41.field430.method1346(126, class337.field4496);
                class41.field430.method1386(arg0 - 222840625, class424.field6226);
                class360.method2201(class41.field430, arg0 ^ 0xFFFFFFC2);
                class41.field430.method1343(class435.field6351, 22608);
                class41.field430.method1357(class156.field1980, 1826838072);
                class41.field430.method1357(class8.method39(true), arg0 ^ 0x6CE35639);
                class114.field1416 = true;
                class41.field430.method1346(arg0 ^ 0x7C, class243.field3305);
                class41.field430.method1357(class232.field3209.method1694(0), 1826838072);
                class41.field430.method1357(class30.field292.method1694(0), 1826838072);
                class41.field430.method1357(class262.field3582.method1694(0), 1826838072);
                class41.field430.method1357(class388.field5540.method1694(arg0 ^ 0x1), 1826838072);
                class41.field430.method1357(class321.field4297.method1694(0), 1826838072);
                class41.field430.method1357(class371.field5195.method1694(0), arg0 + 1826838071);
                class41.field430.method1357(class283.field3875.method1694(arg0 - 1), 1826838072);
                class41.field430.method1357(class382.field5449.method1694(0), 1826838072);
                class41.field430.method1357(class72.field797.method1694(arg0 ^ 0x1), 1826838072);
                class41.field430.method1357(class275.field3712.method1694(0), arg0 + 1826838071);
                class41.field430.method1357(class132.field1701.method1694(arg0 ^ 0x1), 1826838072);
                class41.field430.method1357(class125.field1599.method1694(0), arg0 + 1826838071);
                class41.field430.method1357(class211.field2868.method1694(0), 1826838072);
                class41.field430.method1357(class199.field2662.method1694(0), arg0 ^ 0x6CE35639);
                class41.field430.method1357(class119.field1490.method1694(0), arg0 ^ 0x6CE35639);
                class41.field430.method1357(class72.field794.method1694(0), 1826838072);
                class41.field430.method1357(class243.field3318.method1694(0), arg0 ^ 0x6CE35639);
                class41.field430.method1357(class366.field5120.method1694(arg0 ^ 0x1), 1826838072);
                class41.field430.method1357(class183.field2331.method1694(0), 1826838072);
                class41.field430.method1357(class211.field2866.method1694(0), 1826838072);
                class41.field430.method1357(class63.field646.method1694(0), 1826838072);
                class41.field430.method1357(class267.field3641.method1694(arg0 ^ 0x1), arg0 + 1826838071);
                class41.field430.method1357(class222.field2974.method1694(arg0 ^ 0x1), 1826838072);
                class41.field430.method1357(class183.field2329.method1694(0), 1826838072);
                class41.field430.method1357(class341.field4565.method1694(arg0 ^ 0x1), 1826838072);
                class41.field430.method1357(class270.field3660.method1694(arg0 - 1), 1826838072);
                class41.field430.method1357(class312.field4202.method1694(0), arg0 ^ 0x6CE35639);
                class41.field430.method1357(class108.field1330.method1694(0), arg0 + 1826838071);
                class41.field430.method1357(class127.field1649.method1694(0), arg0 ^ 0x6CE35639);
                class41.field430.method1368(class281.field3857.field3389, -2008, 0, class281.field3857.field3406);
                class264.field3605.method1537(class41.field430.field3406, false, class41.field430.field3389, 0);
                class281.field3857.method294(var5, (byte) 100);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class448.field6514.method294(var5, (byte) 100);
                field3595 = 4;
            }
            if (field3595 == 4) {
                if (class264.field3605.method1539(-32565) < 1) {
                    return;
                }
                int var7 = class264.field3605.method1540(1824);
                if (var7 == 21) {
                    field3595 = 7;
                } else if (var7 == 29) {
                    field3595 = 10;
                } else if (var7 == 1) {
                    field3595 = 5;
                    class297.field4046 = var7;
                    return;
                } else if (var7 == 2) {
                    field3595 = 8;
                } else if (var7 == 15) {
                    class297.field4046 = var7;
                    field3595 = 0;
                    return;
                } else if (var7 == 23 && class47.field470 < 1) {
                    field3595 = 1;
                    class140.field1794 = 0;
                    class47.field470++;
                    class264.field3605.method1538((byte) 5);
                    class264.field3605 = null;
                    return;
                } else {
                    class297.field4046 = var7;
                    field3595 = 0;
                    class264.field3605.method1538((byte) 5);
                    class264.field3605 = null;
                    return;
                }
            }
            if (field3595 == 6) {
                class281.field3857.field3389 = 0;
                class281.field3857.method295(20579, 17);
                class264.field3605.method1537(class281.field3857.field3406, false, class281.field3857.field3389, 0);
                field3595 = 4;
            } else if (field3595 == 7) {
                if (class264.field3605.method1539(arg0 ^ 0xFFFF80CA) >= 1) {
                    class395.field5686 = (class264.field3605.method1540(1824) + 3) * 60;
                    field3595 = 0;
                    class297.field4046 = 21;
                    class264.field3605.method1538((byte) 5);
                    class264.field3605 = null;
                }
            } else if (field3595 != 10) {
                if (field3595 == 8) {
                    if (class264.field3605.method1539(-32565) < 14) {
                        return;
                    }
                    class264.field3605.method1529(class448.field6514.field3406, 14, -18094, 0);
                    class448.field6514.field3389 = 0;
                    class110.field1357 = class448.field6514.method1350(31351);
                    class177.field2215 = class448.field6514.method1350(31351);
                    class142.field1814 = class448.field6514.method1350(31351) == 1;
                    class342.field4576 = class448.field6514.method1350(31351) == 1;
                    class352.field4931 = class448.field6514.method1350(31351) == 1;
                    class374.field5268 = class448.field6514.method1350(31351) == 1;
                    class435.field6362 = class448.field6514.method1350(31351) == 1;
                    class324.field4325 = class448.field6514.method1374(-2);
                    class244.field3326 = class448.field6514.method1350(31351) == 1;
                    class21.field210 = class448.field6514.method1350(31351) == 1;
                    class274.method1509((byte) 49, class21.field210);
                    class127.method689(class21.field210, (byte) -59);
                    class132.method715(-128, class21.field210);
                    if ((!class142.field1814 || class352.field4931) && !class244.field3326) {
                        try {
                            class245.method1313(class159.field2055.field6532, (byte) -22, "unzap");
                        } catch (Throwable var9) {
                        }
                    } else {
                        try {
                            class245.method1313(class159.field2055.field6532, (byte) -122, "zap");
                        } catch (Throwable var10) {
                        }
                    }
                    if (class429.field6292 == 0) {
                        try {
                            class245.method1313(class159.field2055.field6532, (byte) -128, "loggedin");
                        } catch (Throwable var8) {
                        }
                    }
                    class7.field68 = class448.field6514.method296(-23095);
                    class161.field2065 = class448.field6514.method1374(-2);
                    field3595 = 9;
                }
                if (field3595 == 9 && class264.field3605.method1539(arg0 - 32566) >= class161.field2065) {
                    class448.field6514.field3389 = 0;
                    class264.field3605.method1529(class448.field6514.field3406, class161.field2065, -18094, 0);
                    field3595 = 0;
                    class297.field4046 = 2;
                    class371.method2238((byte) -36);
                    class296.field4016 = -1;
                    class85.method468(false, 128);
                    class7.field68 = -1;
                }
            } else if (class264.field3605.method1539(-32565) >= 1) {
                class396.field5695 = class264.field3605.method1540(1824);
                class297.field4046 = 29;
                field3595 = 0;
                class264.field3605.method1538((byte) 5);
                class264.field3605 = null;
            }
        } catch (IOException var11) {
            if (class264.field3605 != null) {
                class264.field3605.method1538((byte) 5);
                class264.field3605 = null;
            }
            if (class47.field470 < 1) {
                field3595 = 1;
                class140.field1794 = 0;
                if (class379.field5353 == class359.field5077) {
                    class379.field5353 = class73.field813;
                } else {
                    class379.field5353 = class359.field5077;
                }
                class47.field470++;
            } else {
                field3595 = 0;
                class297.field4046 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)V", line = 577)
    public static final void method1475(boolean arg0, int arg1) {
        field3593++;
        class114 var2 = class180.field2253;
        synchronized (class180.field2253) {
            class180.field2253.method614(-121, arg1);
            if (arg0) {
                method1471(-49, -8, (class194) null, -82);
            }
        }
        class114 var3 = class83.field912;
        synchronized (class83.field912) {
            class83.field912.method614(-126, arg1);
        }
        class114 var4 = class272.field3672;
        synchronized (class272.field3672) {
            class272.field3672.method614(-120, arg1);
        }
    }
}
