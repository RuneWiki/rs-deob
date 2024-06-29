import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class36 extends class162 {

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "[I")
    public static int[] field457 = new int[128];

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "Lfd;")
    public static class130 field450 = new class130(16);

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "Ljava/lang/String;")
    public static String field468 = "flash1:";

    @OriginalMember(owner = "client!vk", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field473 = "Loading title screen - ";

    @OriginalMember(owner = "client!vk", name = "X", descriptor = "I")
    public static int field471 = 0;

    @OriginalMember(owner = "client!vk", name = "Y", descriptor = "[I")
    public static int[] field472 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!vk", name = "V", descriptor = "Ljava/lang/String;")
    public static String field469 = "";

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!vk", name = "E", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
    public int field458;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
    public int field461;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!vk", name = "W", descriptor = "Ljm;")
    public static class113 field470;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "Ljava/lang/String;")
    public String field459;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "(I)V")
    public static final void method217(int arg0) {
        ++field462;
        if (class4.field34 != arg0 && class4.field34 != 5) {
            try {
                if (~(++class149.field2329) < -2001) {
                    if (class103.field1551 != null) {
                        class103.field1551.method1277(false);
                        class103.field1551 = null;
                    }
                    if (~class151.field2355 <= -2) {
                        class4.field34 = 0;
                        class198.field3133 = -5;
                        return;
                    }
                    class149.field2329 = 0;
                    ++class151.field2355;
                    if (~class246.field3931 == ~class148.field2323) {
                        class148.field2323 = class37.field486;
                    } else {
                        class148.field2323 = class246.field3931;
                    }
                    class4.field34 = 1;
                }
                if (class4.field34 == 1) {
                    class63.field947 = class259.field4254.method1776(class148.field2323, class57.field773, (byte) -112);
                    class4.field34 = 2;
                }
                if (class4.field34 == 2) {
                    if (class63.field947.field725 == 2) {
                        throw new IOException();
                    }
                    if (~class63.field947.field725 != -2) {
                        return;
                    }
                    class103.field1551 = new class189((Socket) class63.field947.field723, class259.field4254);
                    class63.field947 = null;
                    long var1 = class313.field5039 = class294.method2051(arg0 + -113, class217.field3453);
                    class276.field4572.field3272 = 0;
                    int var3 = (int) (31L & var1 >> 16);
                    class276.field4572.method1446((byte) 63, 14);
                    class276.field4572.method1446((byte) 92, var3);
                    class103.field1551.method1275(0, true, 2, class276.field4572.field3234);
                    if (class199.field3155 != null) {
                        class199.field3155.method1152((byte) -17);
                    }
                    if (class60.field921 != null) {
                        class60.field921.method1152((byte) -17);
                    }
                    int var4 = class103.field1551.method1276(arg0 + 80);
                    if (class199.field3155 != null) {
                        class199.field3155.method1152((byte) -17);
                    }
                    if (class60.field921 != null) {
                        class60.field921.method1152((byte) -17);
                    }
                    if (var4 != 0) {
                        class4.field34 = 0;
                        class198.field3133 = var4;
                        class103.field1551.method1277(false);
                        class103.field1551 = null;
                        return;
                    }
                    class4.field34 = 3;
                }
                if (~class4.field34 == -4) {
                    if (class103.field1551.method1283((byte) -100) < 8) {
                        return;
                    }
                    int[] var5 = new int[4];
                    class103.field1551.method1280(true, 8, 0, class192.field3042.field3234);
                    class192.field3042.field3272 = 0;
                    class209.field3360 = class192.field3042.method1430(false);
                    var5[3] = (int) class209.field3360;
                    var5[0] = (int) (Math.random() * 9.9999999E7D);
                    var5[1] = (int) (Math.random() * 9.9999999E7D);
                    class276.field4572.field3272 = 0;
                    var5[2] = (int) (class209.field3360 >> 32);
                    class276.field4572.method1446((byte) 90, 10);
                    class276.field4572.method1425(var5[0], (byte) -115);
                    class276.field4572.method1425(var5[1], (byte) -123);
                    class276.field4572.method1425(var5[2], (byte) -99);
                    class276.field4572.method1425(var5[3], (byte) -126);
                    class276.field4572.method1413(-349748560, class294.method2051(-93, class217.field3453));
                    class276.field4572.method1409(field469, (byte) 77);
                    class276.field4572.method1441((byte) -62, class60.field912, class105.field1572);
                    class292.field4817.field3272 = 0;
                    if (class115.field1733 == 40) {
                        class292.field4817.method1446((byte) 76, 18);
                    } else {
                        class292.field4817.method1446((byte) 43, 16);
                    }
                    class292.field4817.method1412(163 + class276.field4572.field3272 + class187.method1270((byte) -56, class275.field4552), false);
                    class292.field4817.method1425(553, (byte) -98);
                    class292.field4817.method1446((byte) 58, class11.field146);
                    class292.field4817.method1446((byte) 102, class176.field2748 ? 1 : 0);
                    class292.field4817.method1446((byte) 120, 0);
                    class292.field4817.method1446((byte) 36, class115.method725((byte) 107));
                    class292.field4817.method1412(class169.field2644, false);
                    class292.field4817.method1412(class79.field1254, false);
                    class292.field4817.method1446((byte) 124, class230.field3687);
                    class217.method1514(0, class292.field4817);
                    class292.field4817.method1409(class275.field4552, (byte) 77);
                    class292.field4817.method1425(class115.field1742, (byte) -101);
                    class292.field4817.method1425(class284.method2005(true), (byte) -112);
                    class217.field3462 = true;
                    class292.field4817.method1412(class45.field613, false);
                    class292.field4817.method1425(class31.field397.method1893(false), (byte) -124);
                    class292.field4817.method1425(class265.field4361.method1893(false), (byte) -122);
                    class292.field4817.method1425(class121.field1859.method1893(false), (byte) -125);
                    class292.field4817.method1425(class190.field2931.method1893(false), (byte) -126);
                    class292.field4817.method1425(class9.field119.method1893(false), (byte) -125);
                    class292.field4817.method1425(class145.field2296.method1893(false), (byte) -97);
                    class292.field4817.method1425(class274.field4518.method1893(false), (byte) -123);
                    class292.field4817.method1425(class120.field1846.method1893(false), (byte) -124);
                    class292.field4817.method1425(class3.field22.method1893(false), (byte) -122);
                    class292.field4817.method1425(class141.field2192.method1893(false), (byte) -102);
                    class292.field4817.method1425(class173.field2691.method1893(false), (byte) -116);
                    class292.field4817.method1425(class66.field977.method1893(false), (byte) -105);
                    class292.field4817.method1425(class119.field1835.method1893(false), (byte) -108);
                    class292.field4817.method1425(class209.field3358.method1893(false), (byte) -118);
                    class292.field4817.method1425(class196.field3122.method1893(false), (byte) -126);
                    class292.field4817.method1425(class266.field4385.method1893(false), (byte) -115);
                    class292.field4817.method1425(class186.field2883.method1893(false), (byte) -97);
                    class292.field4817.method1425(class79.field1252.method1893(false), (byte) -119);
                    class292.field4817.method1425(class56.field760.method1893(false), (byte) -127);
                    class292.field4817.method1425(class18.field252.method1893(false), (byte) -120);
                    class292.field4817.method1425(class98.field1477.method1893(false), (byte) -103);
                    class292.field4817.method1425(class18.field247.method1893(false), (byte) -107);
                    class292.field4817.method1425(class92.field1398.method1893(false), (byte) -102);
                    class292.field4817.method1425(class157.field2499.method1893(false), (byte) -111);
                    class292.field4817.method1425(class193.field3048.method1893(false), (byte) -106);
                    class292.field4817.method1425(class245.field3898.method1893(false), (byte) -118);
                    class292.field4817.method1425(class283.field4738.method1893(false), (byte) -127);
                    class292.field4817.method1425(class212.field3390.method1893(false), (byte) -104);
                    class292.field4817.method1425(class4.field29.method1893(false), (byte) -98);
                    class292.field4817.method1453(class276.field4572.field3234, 0, class276.field4572.field3272, (byte) -12);
                    class103.field1551.method1275(0, true, class292.field4817.field3272, class292.field4817.field3234);
                    class276.field4572.method1397(var5, -125);
                    for (int var6 = 0; ~var6 > -5; ++var6) {
                        var5[var6] += 50;
                    }
                    class192.field3042.method1397(var5, 117);
                    class4.field34 = 4;
                }
                if (~class4.field34 == -5) {
                    if (~class103.field1551.method1283((byte) -49) > -2) {
                        return;
                    }
                    int var7 = class103.field1551.method1276(34);
                    if (var7 == 21) {
                        class4.field34 = 7;
                    } else if (~var7 != -30) {
                        if (~var7 == -2) {
                            class4.field34 = 5;
                            class198.field3133 = var7;
                            return;
                        }
                        if (~var7 != -3) {
                            if (var7 != 15) {
                                if (var7 == 23 && ~class151.field2355 > -2) {
                                    class4.field34 = 1;
                                    ++class151.field2355;
                                    class149.field2329 = 0;
                                    class103.field1551.method1277(false);
                                    class103.field1551 = null;
                                    return;
                                }
                                class4.field34 = 0;
                                class198.field3133 = var7;
                                class103.field1551.method1277(false);
                                class103.field1551 = null;
                                return;
                            }
                            class4.field34 = 0;
                            class198.field3133 = var7;
                            return;
                        }
                        class4.field34 = 8;
                    } else {
                        class4.field34 = 10;
                    }
                }
                if (~class4.field34 == -7) {
                    class276.field4572.field3272 = 0;
                    class276.field4572.method1391(0, 17);
                    class103.field1551.method1275(0, true, class276.field4572.field3272, class276.field4572.field3234);
                    class4.field34 = 4;
                } else if (class4.field34 == 7) {
                    if (~class103.field1551.method1283((byte) -47) <= -2) {
                        class183.field2847 = (class103.field1551.method1276(86) - -3) * 60;
                        class4.field34 = 0;
                        class198.field3133 = 21;
                        class103.field1551.method1277(false);
                        class103.field1551 = null;
                    }
                } else if (class4.field34 == 10) {
                    if (~class103.field1551.method1283((byte) -110) <= -2) {
                        class80.field1265 = class103.field1551.method1276(116);
                        class198.field3133 = 29;
                        class4.field34 = 0;
                        class103.field1551.method1277(false);
                        class103.field1551 = null;
                    }
                } else {
                    if (class4.field34 == 8) {
                        if (~class103.field1551.method1283((byte) -71) > -15) {
                            return;
                        }
                        class103.field1551.method1280(true, 14, 0, class192.field3042.field3234);
                        class192.field3042.field3272 = 0;
                        class37.field484 = class192.field3042.method1420((byte) 0);
                        class241.field3806 = class192.field3042.method1420((byte) 0);
                        class45.field625 = class192.field3042.method1420((byte) 0) == 1;
                        class302.field4951 = ~class192.field3042.method1420((byte) 0) == -2;
                        class307.field4992 = ~class192.field3042.method1420((byte) 0) == -2;
                        class124.field1894 = ~class192.field3042.method1420((byte) 0) == -2;
                        class56.field747 = class192.field3042.method1420((byte) 0) == 1;
                        class31.field396 = class192.field3042.method1419(68);
                        class63.field950 = class192.field3042.method1420((byte) 0) == 1;
                        class141.field2180 = ~class192.field3042.method1420((byte) 0) == -2;
                        class278.method1935(-59, class141.field2180);
                        class314.method2124(22148, class141.field2180);
                        class229.method1616((byte) -55, class141.field2180);
                        if (!class176.field2748) {
                            if ((!class45.field625 || class307.field4992) && !class63.field950) {
                                try {
                                    class291.method2038("unzap", 20042, class259.field4254.field4211);
                                } catch (Throwable var9) {
                                }
                            } else {
                                try {
                                    class291.method2038("zap", arg0 + 20042, class259.field4254.field4211);
                                } catch (Throwable var10) {
                                }
                            }
                        }
                        try {
                            class291.method2038("loggedin", 20042, class259.field4254.field4211);
                        } catch (Throwable var8) {
                        }
                        class223.field3548 = class192.field3042.method1392((byte) -125);
                        class20.field272 = class192.field3042.method1419(102);
                        class4.field34 = 9;
                    }
                    if (class4.field34 == 9) {
                        if (~class103.field1551.method1283((byte) -61) <= ~class20.field272) {
                            class192.field3042.field3272 = 0;
                            class103.field1551.method1280(true, class20.field272, 0, class192.field3042.field3234);
                            class198.field3133 = 2;
                            class4.field34 = 0;
                            class58.method360(17292);
                            class113.field1711 = -1;
                            class104.method675((byte) 125, false);
                            class223.field3548 = -1;
                        }
                    }
                }
            } catch (IOException var11) {
                if (class103.field1551 != null) {
                    class103.field1551.method1277(false);
                    class103.field1551 = null;
                }
                if (~class151.field2355 > -2) {
                    class4.field34 = 1;
                    if (class246.field3931 != class148.field2323) {
                        class148.field2323 = class246.field3931;
                    } else {
                        class148.field2323 = class37.field486;
                    }
                    ++class151.field2355;
                    class149.field2329 = 0;
                } else {
                    class4.field34 = 0;
                    class198.field3133 = -4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "(I)V")
    public static void method218(int arg0) {
        field469 = null;
        if (arg0 > 75) {
            field472 = null;
            field457 = null;
            field468 = null;
            field473 = null;
            field470 = null;
            field450 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "(I)V")
    public final void method219(int arg0) {
        ++field460;
        if (arg0 < -7) {
            super.field2552 |= Long.MIN_VALUE;
            if (this.method224((byte) 88) == 0L) {
                class281.field4643.method1190(8217, this);
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "(I)V")
    public final void method220(int arg0) {
        super.field2552 = 500L + class267.method1841((byte) 112) | super.field2552 & Long.MIN_VALUE;
        ++field453;
        class297.field4887.method1190(8217, this);
        if (arg0 < 117) {
            field472 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lkk;Z)V")
    public static final void method221(class254 arg0, boolean arg1) {
        ++field455;
        int var2 = arg0.field4060;
        if (~var2 == -325) {
            if (class104.field1564 == -1) {
                class104.field1564 = arg0.field4188;
                class152.field2375 = arg0.field4129;
            }
            if (class119.field1828.field2478) {
                arg0.field4188 = class104.field1564;
            } else {
                arg0.field4188 = class152.field2375;
            }
        } else if (~var2 == -326) {
            if (class104.field1564 == -1) {
                class152.field2375 = arg0.field4129;
                class104.field1564 = arg0.field4188;
            }
            if (class119.field1828.field2478) {
                arg0.field4188 = class152.field2375;
            } else {
                arg0.field4188 = class104.field1564;
            }
        } else if (var2 == 327) {
            arg0.field4139 = 150;
            arg0.field4154 = 2047 & (int) (Math.sin((double) class4.field32 / 40.0D) * 256.0D);
            arg0.field4073 = -1;
            arg0.field4054 = 5;
        } else if (arg1) {
            if (~var2 == -329) {
                if (class309.field5006.field3329 == null) {
                    arg0.field4073 = 0;
                    arg0.field4064 = 0;
                } else {
                    arg0.field4139 = 150;
                    arg0.field4154 = (int) (Math.sin((double) class4.field32 / 40.0D) * 256.0D) & 2047;
                    arg0.field4054 = 5;
                    arg0.field4073 = 2047;
                    arg0.field4064 = class171.method1127(class309.field5006.field3329, 90);
                    arg0.field4033 = class309.field5006.field808;
                    arg0.field4117 = class309.field5006.field838;
                    arg0.field4121 = class309.field5006.field857;
                    arg0.field4165 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method222(int arg0, String arg1) {
        ++field452;
        int var2 = 0;
        int var3 = arg1.length();
        for (int var4 = 0; var4 < var3; ++var4) {
            var2 = class87.method573(arg1.charAt(var4), 160) + (var2 << 5) - var2;
        }
        if (arg0 >= -113) {
            field457 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "(I)I")
    public final int method223(int arg0) {
        if (arg0 != 5698) {
            return -30;
        } else {
            ++field451;
            return (int) super.field2102;
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)J")
    public final long method224(byte arg0) {
        if (arg0 <= 83) {
            return 96L;
        } else {
            ++field466;
            return super.field2552 & Long.MAX_VALUE;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)V")
    public static final void method225(int arg0, int arg1) {
        if (arg1 < -99) {
            class109.field1671.method147(arg0, (byte) -116);
            ++field454;
            class219.field3502.method147(arg0, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(II)V")
    public class36(int arg0, int arg1) {
        super.field2102 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "(I)I")
    public final int method226(int arg0) {
        ++field464;
        if (arg0 != 8) {
            method222(73, (String) null);
        }
        return (int) (super.field2102 >>> 32 & 255L);
    }
}
