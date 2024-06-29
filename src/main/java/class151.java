import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class151 {

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "Z")
    public static boolean field2400 = false;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "Lmg;")
    private class116 field2407;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "Lkh;")
    private class172 field2398;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "Lml;")
    public static class17 field2397;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2402;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V", line = 10)
    public static final void method1162(int arg0, int arg1, int arg2) {
        class81 var3 = class54.method426(arg0, arg1);
        field2401++;
        int var4 = var3.field1390;
        int var5 = var3.field1397;
        int var6 = var3.field1391;
        int var7 = class181.field2895[var5 - var4];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var4;
        class245.method1875((byte) -124, ~var8 & class273.field4527[var6] | var8 & arg2 << var4, var6);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILna;)V", line = 43)
    public static final void method1163(int arg0, class145 arg1) {
        class18 var2 = null;
        field2405++;
        class166.field2649 = 3;
        class73.method614(false, true);
        class198.field3165 = true;
        class137.field2274 = 0;
        client.field717 = true;
        class193.field3083 = true;
        class243.field4004 = true;
        class272.field4520 = 127;
        class3.field36 = true;
        class160.field2561 = true;
        int var3 = -74 / ((54 - arg0) / 54);
        class267.field4482 = 0;
        class45.field704 = 127;
        class340.field5436 = 0;
        class235.field3899 = 255;
        class44.field690 = true;
        class248.field4052 = true;
        class231.field3837 = 0;
        class241.field3979 = true;
        class75.field1272 = true;
        class292.field4726 = true;
        class131.field2214 = 2;
        if (class10.field81 >= 96) {
            class158.method1224(2);
        } else {
            class158.method1224(0);
        }
        class237.field3923 = 0;
        class127.field2147 = 0;
        class257.field4304 = false;
        class267.field4462 = 0;
        class14.field152 = true;
        class238.field3932 = false;
        class336.field5314 = false;
        try {
            class192 var4 = arg1.method1134(115, "runescape");
            while (var4.field3064 == 0) {
                class283.method2076((byte) -122, 1L);
            }
            if (var4.field3064 == 1) {
                var2 = (class18) var4.field3066;
                byte[] var5 = new byte[(int) var2.method100(false)];
                int var7;
                for (int var6 = 0; var6 < var5.length; var6 += var7) {
                    var7 = var2.method103(-1, var5, var6, var5.length - var6);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class243.method1849(22, new class227(var5));
            }
        } catch (Exception var11) {
        }
        try {
            if (var2 != null) {
                var2.method101(false);
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V", line = 126)
    public static void method1164(byte arg0) {
        field2397 = null;
        field2402 = null;
        if (arg0 != -94) {
            method1169(-105, -45);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lmg;B)V", line = 138)
    public final void method1165(class116 arg0, byte arg1) {
        if (arg1 <= -42) {
            field2403++;
            this.field2407 = arg0;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)Lkh;", line = 154)
    public final class172 method1166(int arg0) {
        field2399++;
        class172 var2 = this.field2407.field1947.field2746;
        if (arg0 != 11533) {
            field2404 = 57;
        }
        if (this.field2407.field1947 == var2) {
            this.field2398 = null;
            return null;
        } else {
            this.field2398 = var2.field2746;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)Lkh;", line = 174)
    public final class172 method1167(int arg0) {
        if (arg0 != 0) {
            return (class172) null;
        }
        field2395++;
        class172 var2 = this.field2398;
        if (this.field2407.field1947 == var2) {
            this.field2398 = null;
            return null;
        } else {
            this.field2398 = var2.field2746;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[[IBIII)I", line = 194)
    public static final int method1168(int arg0, int[][] arg1, byte arg2, int arg3, int arg4, int arg5) {
        field2406++;
        int var6 = -63 / ((7 - arg2) / 35);
        int var7 = (128 - arg3) * arg1[arg5][arg0] + arg1[arg5 + 1][arg0] * arg3 >> 7;
        int var8 = (128 - arg3) * arg1[arg5][arg0 + 1] + (arg1[arg5 + 1][arg0 + 1] * arg3) >> 7;
        return (128 - arg4) * var7 + (arg4 * var8) >> 7;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)V", line = 216)
    public static final void method1169(int arg0, int arg1) {
        field2396++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class252.field4258[arg0];
        int var3 = class230.field3819[arg0];
        long var4 = class13.field144[arg0];
        int var6 = class51.field810[arg0];
        int var7 = (int) class13.field144[arg0];
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 40) {
            class288 var8 = class165.field2621[var7];
            if (var8 != null) {
                class221.field3607 = class333.field5278;
                class169.field2692 = 0;
                class223.field3709 = 2;
                class178.field2853++;
                class162.field2571 = class229.field3812;
                class36.field520.method2228(158, 16547);
                class36.field520.method1719(var7, arg1 + 132);
                class36.field520.method1767(false, class240.field3972[82] ? 1 : 0);
                class160.method1245(var3, var2, var8.method1634(-1), 0, var8.method1634(-1), 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
            }
        }
        if (var6 == 11) {
            class36.field520.method2228(112, 16547);
            class77.field1337++;
            class36.field520.method1729(class17.field202, 206);
            class36.field520.method1741(var3, 872537352);
            class36.field520.method1719(class71.field1237, 128);
            class36.field520.method1749((byte) -20, class77.field1345);
            class36.field520.method1729(var2, 206);
            class36.field520.method1761(51, var7);
            class163.field2585 = 0;
            class252.field4257 = class13.method74(-16, var3);
            class291.field4702 = var2;
        }
        if (var6 == 22) {
            class329.field5224++;
            class36.field520.method2228(107, 16547);
            class36.field520.method1771(arg1 - 70, var3);
            class36.field520.method1761(arg1 - 92, var7);
            class36.field520.method1731(-114, var2);
            class163.field2585 = 0;
            class252.field4257 = class13.method74(-65, var3);
            class291.field4702 = var2;
        }
        if (var6 == 59) {
            class223.field3709 = 2;
            class127.field2151++;
            class169.field2692 = 0;
            class221.field3607 = class333.field5278;
            class162.field2571 = class229.field3812;
            class36.field520.method2228(83, arg1 + 16551);
            class36.field520.method1761(-100, class93.field1562 + var2);
            class36.field520.method1731(-115, var7);
            class36.field520.method1721(122, class240.field3972[82] ? 1 : 0);
            class36.field520.method1761(-36, var3 + class275.field4546);
            class160.method1245(var3, var2, 0, 0, 0, 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
        }
        if (var6 == 48) {
            if (var7 == 0) {
                class214.method1618(class186.field2991, var2, var3);
            } else if (var7 == 1) {
                if (class162.field2572 > 0 && class240.field3972[82] && class240.field3972[81]) {
                    class322.method2271(105, class186.field2991, class275.field4546 + var3, class93.field1562 + var2);
                } else {
                    class281.method2070(67, var2, var3, 1);
                    class36.field520.method1712(class131.field2219, arg1 ^ 0x4D);
                    class36.field520.method1712(class196.field3135, arg1 - 116);
                    class36.field520.method1729((int) class261.field4396, 206);
                    class36.field520.method1712(57, arg1 ^ 0x51);
                    if (class112.field1827 == 4) {
                        class36.field520.method1712(0, -75);
                        class36.field520.method1712(0, -55);
                    } else {
                        class36.field520.method1712(class79.field1372, -57);
                        class36.field520.method1712(class4.field41, arg1 - 60);
                    }
                    class36.field520.method1712(89, arg1 - 81);
                    class36.field520.method1729(class6.field55.field3577, 206);
                    class36.field520.method1729(class6.field55.field3511, 206);
                    class36.field520.method1712(class39.field577, -97);
                    class36.field520.method1712(63, -103);
                    class160.method1245(var3, var2, 0, 0, 0, 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
                }
            }
        }
        if (var6 == 13) {
            class169.field2692 = 0;
            class221.field3607 = class333.field5278;
            class78.field1361++;
            class223.field3709 = 2;
            class162.field2571 = class229.field3812;
            class36.field520.method2228(43, 16547);
            class36.field520.method1729(class275.field4546 + var3, 206);
            class36.field520.method1731(-111, Integer.MAX_VALUE & (int) (var4 >>> 32));
            class36.field520.method1767(false, class240.field3972[82] ? 1 : 0);
            class36.field520.method1761(51, class93.field1562 + var2);
            class327.method2305(true, var3, var4, var2);
        }
        if (var6 == 7) {
            class288 var9 = class165.field2621[var7];
            if (var9 != null) {
                class162.field2571 = class229.field3812;
                class230.field3823++;
                class169.field2692 = 0;
                class221.field3607 = class333.field5278;
                class223.field3709 = 2;
                class36.field520.method2228(139, arg1 ^ 0xFFFFBF5F);
                class36.field520.method1721(-49, class240.field3972[82] ? 1 : 0);
                class36.field520.method1761(78, var7);
                class160.method1245(var3, var2, var9.method1634(-1), 0, var9.method1634(-1), arg1 + 19328, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
            }
        }
        if (~var6 == arg1) {
            class258 var10 = class56.field924[var7];
            if (var10 != null) {
                class169.field2692 = 0;
                class221.field3607 = class333.field5278;
                class162.field2571 = class229.field3812;
                class223.field3709 = 2;
                class36.field520.method2228(126, 16547);
                class36.field520.method1712(class240.field3972[82] ? 1 : 0, -96);
                class36.field520.method1729(var7, 206);
                client.field711++;
                class160.method1245(var3, var2, var10.method1634(arg1 + 3), 0, var10.method1634(-1), 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
            }
        }
        if (var6 == 60) {
            class36.field520.method2228(41, 16547);
            class135.field2263++;
            class36.field520.method1719(var2, 128);
            class36.field520.method1757(var3, -115);
            class36.field520.method1761(68, var7);
            class163.field2585 = 0;
            class252.field4257 = class13.method74(-73, var3);
            class291.field4702 = var2;
        }
        if (var6 == 30) {
            class221.field3607 = class333.field5278;
            class169.field2692 = 0;
            class236.field3910++;
            class223.field3709 = 2;
            class162.field2571 = class229.field3812;
            class36.field520.method2228(254, 16547);
            class36.field520.method1721(arg1 + 81, class240.field3972[82] ? 1 : 0);
            class36.field520.method1761(-68, class209.field3297);
            class36.field520.method1757(class275.field4549, -103);
            class36.field520.method1719(var7, 128);
            class36.field520.method1729(class275.field4546 + var3, arg1 ^ 0xFFFFFF32);
            class36.field520.method1729(class93.field1562 + var2, 206);
            class160.method1245(var3, var2, 0, 0, 0, 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
        }
        if (var6 == 1009) {
            class223.field3709 = 2;
            class162.field2571 = class229.field3812;
            class270.field4495++;
            class169.field2692 = 0;
            class221.field3607 = class333.field5278;
            class36.field520.method2228(223, arg1 + 16551);
            class36.field520.method1719(var7, arg1 ^ 0xFFFFFF7C);
        }
        if (var6 == 1001) {
            class250 var11 = class13.method74(arg1 - 48, var3);
            if (var11 == null || var11.field4177[var2] < 100000) {
                class270.field4495++;
                class36.field520.method2228(223, 16547);
                class36.field520.method1719(var7, 128);
            } else {
                class182.method1431(var11.field4177[var2] + " x " + class6.method22(var7, 16430).field871, (byte) -11);
            }
            class163.field2585 = 0;
            class252.field4257 = class13.method74(-58, var3);
            class291.field4702 = var2;
        }
        if (var6 == 4) {
            class317.field5060++;
            class36.field520.method2228(102, 16547);
            class36.field520.method1749((byte) -20, var3);
            class36.field520.method1719(var2, 128);
            class36.field520.method1761(-97, var7);
            class163.field2585 = 0;
            class252.field4257 = class13.method74(-35, var3);
            class291.field4702 = var2;
        }
        if (var6 == 31 && class187.field3005 == null) {
            class79.method651(var2, var3, 27);
            class187.field3005 = class25.method165(var2, var3, 24836);
            class205.method1568(class187.field3005, (byte) 118);
        }
        if (var6 == 1005) {
            class223.field3709 = 2;
            class178.field2848++;
            class162.field2571 = class229.field3812;
            class169.field2692 = 0;
            class221.field3607 = class333.field5278;
            class36.field520.method2228(32, 16547);
            class36.field520.method1728(class240.field3972[82] ? 1 : 0, (byte) 26);
            class36.field520.method1729(class275.field4546 + var3, 206);
            class36.field520.method1729(Integer.MAX_VALUE & (int) (var4 >>> 32), 206);
            class36.field520.method1761(arg1 ^ 0xFFFFFFC2, class93.field1562 + var2);
            class327.method2305(true, var3, var4, var2);
        }
        if (var6 == 46) {
            class258 var12 = class56.field924[var7];
            if (var12 != null) {
                class223.field3709 = 2;
                class169.field2692 = 0;
                class162.field2571 = class229.field3812;
                class221.field3607 = class333.field5278;
                class36.field520.method2228(141, 16547);
                class163.field2588++;
                class36.field520.method1712(class240.field3972[82] ? 1 : 0, -110);
                class36.field520.method1719(class17.field202, 128);
                class36.field520.method1771(127, class77.field1345);
                class36.field520.method1731(arg1 - 82, class71.field1237);
                class36.field520.method1729(var7, arg1 ^ 0xFFFFFF32);
                class160.method1245(var3, var2, var12.method1634(arg1 + 3), 0, var12.method1634(-1), 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
            }
        }
        if (var6 == 34) {
            class169.field2692 = 0;
            class221.field3607 = class333.field5278;
            class162.field2571 = class229.field3812;
            class74.field1264++;
            class223.field3709 = 2;
            class36.field520.method2228(192, 16547);
            class36.field520.method1729(class93.field1562 + var2, 206);
            class36.field520.method1719(class275.field4546 + var3, 128);
            class36.field520.method1767(false, class240.field3972[82] ? 1 : 0);
            class36.field520.method1761(104, var7);
            class160.method1245(var3, var2, 0, 0, 0, 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
        }
        if (var6 == 42) {
            class36.field520.method2228(219, 16547);
            class93.field1566++;
            class36.field520.method1731(-88, var7);
            class36.field520.method1731(arg1 - 89, var2);
            class36.field520.method1771(arg1 ^ 0xFFFFFF82, var3);
            class163.field2585 = 0;
            class252.field4257 = class13.method74(-50, var3);
            class291.field4702 = var2;
        }
        if (var6 == 29) {
            class288 var13 = class165.field2621[var7];
            if (var13 != null) {
                class221.field3607 = class333.field5278;
                class169.field2692 = 0;
                class162.field2571 = class229.field3812;
                class44.field688++;
                class223.field3709 = 2;
                class36.field520.method2228(79, 16547);
                class36.field520.method1719(class71.field1237, 128);
                class36.field520.method1761(-76, var7);
                class36.field520.method1712(class240.field3972[82] ? 1 : 0, arg1 - 57);
                class36.field520.method1729(class17.field202, arg1 ^ 0xFFFFFF32);
                class36.field520.method1757(class77.field1345, -116);
                class160.method1245(var3, var2, var13.method1634(-1), 0, var13.method1634(-1), 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
            }
        }
        if (var6 == 36) {
            class329.field5227++;
            class162.field2571 = class229.field3812;
            class221.field3607 = class333.field5278;
            class169.field2692 = 0;
            class223.field3709 = 2;
            class36.field520.method2228(137, 16547);
            class36.field520.method1712(class240.field3972[82] ? 1 : 0, arg1 - 93);
            class36.field520.method1729((int) (var4 >>> 32) & Integer.MAX_VALUE, 206);
            class36.field520.method1729(var2 + class93.field1562, 206);
            class36.field520.method1719(class275.field4546 + var3, 128);
            class327.method2305(true, var3, var4, var2);
        }
        if (var6 == 26) {
            class258 var14 = class56.field924[var7];
            if (var14 != null) {
                class322.field5121++;
                class169.field2692 = 0;
                class223.field3709 = 2;
                class221.field3607 = class333.field5278;
                class162.field2571 = class229.field3812;
                class36.field520.method2228(100, 16547);
                class36.field520.method1728(class240.field3972[82] ? 1 : 0, (byte) 46);
                class36.field520.method1719(var7, 128);
                class160.method1245(var3, var2, var14.method1634(-1), 0, var14.method1634(-1), 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
            }
        }
        if (var6 == 8) {
            class258 var15 = class56.field924[var7];
            if (var15 != null) {
                class189.field3034++;
                class162.field2571 = class229.field3812;
                class169.field2692 = 0;
                class223.field3709 = 2;
                class221.field3607 = class333.field5278;
                class36.field520.method2228(111, 16547);
                class36.field520.method1728(class240.field3972[82] ? 1 : 0, (byte) 58);
                class36.field520.method1729(var7, 206);
                class160.method1245(var3, var2, var15.method1634(arg1 ^ 0x3), 0, var15.method1634(-1), 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
            }
        }
        if (var6 == 28) {
            class288 var16 = class165.field2621[var7];
            if (var16 != null) {
                class221.field3607 = class333.field5278;
                class162.field2571 = class229.field3812;
                class169.field2692 = 0;
                class223.field3709 = 2;
                class36.field520.method2228(183, 16547);
                class36.field520.method1712(class240.field3972[82] ? 1 : 0, -63);
                class320.field5098++;
                class36.field520.method1761(80, var7);
                class160.method1245(var3, var2, var16.method1634(arg1 ^ 0x3), 0, var16.method1634(-1), 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
            }
        }
        if (var6 == 45) {
            class162.field2571 = class229.field3812;
            class169.field2692 = 0;
            class221.field3607 = class333.field5278;
            class118.field1987++;
            class223.field3709 = 2;
            class36.field520.method2228(105, 16547);
            class36.field520.method1719(class275.field4546 + var3, arg1 ^ 0xFFFFFF7C);
            class36.field520.method1731(-118, (int) (var4 >>> 32) & Integer.MAX_VALUE);
            class36.field520.method1712(class240.field3972[82] ? 1 : 0, arg1 - 124);
            class36.field520.method1761(-51, class93.field1562 + var2);
            class36.field520.method1719(class209.field3297, 128);
            class36.field520.method1749((byte) -20, class275.field4549);
            class327.method2305(true, var3, var4, var2);
        }
        if (var6 == 6) {
            class250 var17 = class13.method74(-78, var3);
            boolean var18 = true;
            if (var17.field4134 > 0) {
                var18 = class311.method2206(var17, 16);
            }
            if (var18) {
                class92.field1559++;
                class36.field520.method2228(177, 16547);
                class36.field520.method1757(var3, arg1 - 120);
            }
        }
        if (var6 == 5) {
            class221.field3607 = class333.field5278;
            class169.field2692 = 0;
            class355.field5631++;
            class223.field3709 = 2;
            class162.field2571 = class229.field3812;
            class36.field520.method2228(251, 16547);
            class36.field520.method1712(class240.field3972[82] ? 1 : 0, -65);
            class36.field520.method1719(class17.field202, 128);
            class36.field520.method1729(class275.field4546 + var3, 206);
            class36.field520.method1771(-19, class77.field1345);
            class36.field520.method1729(class71.field1237, arg1 ^ 0xFFFFFF32);
            class36.field520.method1761(-61, Integer.MAX_VALUE & (int) (var4 >>> 32));
            class36.field520.method1761(60, class93.field1562 + var2);
            class327.method2305(true, var3, var4, var2);
        }
        if (var6 == 23) {
            class169.field2692 = 0;
            class223.field3709 = 2;
            class162.field2571 = class229.field3812;
            class221.field3607 = class333.field5278;
            class36.field520.method2228(25, 16547);
            class149.field2383++;
            class36.field520.method1731(-108, class17.field202);
            class36.field520.method1729(var7, arg1 ^ 0xFFFFFF32);
            class36.field520.method1729(var2 + class93.field1562, 206);
            class36.field520.method1712(class240.field3972[82] ? 1 : 0, -125);
            class36.field520.method1729(var3 + class275.field4546, 206);
            class36.field520.method1749((byte) -20, class77.field1345);
            class36.field520.method1761(-75, class71.field1237);
            class160.method1245(var3, var2, 0, 0, 0, arg1 + 19328, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
        }
        if (var6 == 51) {
            class258 var19 = class56.field924[var7];
            if (var19 != null) {
                class162.field2571 = class229.field3812;
                class221.field3607 = class333.field5278;
                class31.field446++;
                class223.field3709 = 2;
                class169.field2692 = 0;
                class36.field520.method2228(5, 16547);
                class36.field520.method1728(class240.field3972[82] ? 1 : 0, (byte) -85);
                class36.field520.method1729(var7, 206);
                class160.method1245(var3, var2, var19.method1634(-1), 0, var19.method1634(-1), 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
            }
        }
        if (var6 == 44) {
            if (var7 == 0) {
                class298.field4787 = 1;
                class214.method1618(class186.field2991, var2, var3);
            } else if (class162.field2572 > 0 && class240.field3972[82] && class240.field3972[81]) {
                class322.method2271(105, class186.field2991, class275.field4546 + var3, class93.field1562 + var2);
            } else {
                class36.field520.method2228(125, 16547);
                class36.field520.method1731(-103, class93.field1562 + var2);
                class36.field520.method1729(class275.field4546 + var3, arg1 ^ 0xFFFFFF32);
                class66.field1169++;
            }
        }
        if (var6 == 25) {
            class178.field2850++;
            class36.field520.method2228(145, 16547);
            class36.field520.method1731(-95, var2);
            class36.field520.method1761(arg1 ^ 0x56, var7);
            class36.field520.method1741(var3, arg1 + 872537356);
            class163.field2585 = 0;
            class252.field4257 = class13.method74(-92, var3);
            class291.field4702 = var2;
        }
        if (var6 == 19) {
            class258 var20 = class56.field924[var7];
            if (var20 != null) {
                class162.field2571 = class229.field3812;
                class221.field3607 = class333.field5278;
                class169.field2692 = 0;
                class223.field3709 = 2;
                class345.field5510++;
                class36.field520.method2228(135, 16547);
                class36.field520.method1712(class240.field3972[82] ? 1 : 0, -109);
                class36.field520.method1731(-107, var7);
                class160.method1245(var3, var2, var20.method1634(-1), 0, var20.method1634(-1), 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
            }
        }
        if (var6 == 50) {
            class223.field3709 = 2;
            class221.field3607 = class333.field5278;
            class162.field2571 = class229.field3812;
            class354.field5615++;
            class169.field2692 = 0;
            class36.field520.method2228(244, 16547);
            class36.field520.method1719(class93.field1562 + var2, 128);
            class36.field520.method1767(false, class240.field3972[82] ? 1 : 0);
            class36.field520.method1731(-117, class275.field4546 + var3);
            class36.field520.method1719(var7, 128);
            class160.method1245(var3, var2, 0, 0, 0, 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
        }
        if (var6 == 2) {
            class288 var21 = class165.field2621[var7];
            if (var21 != null) {
                class78.field1357++;
                class223.field3709 = 2;
                class162.field2571 = class229.field3812;
                class169.field2692 = 0;
                class221.field3607 = class333.field5278;
                class36.field520.method2228(208, 16547);
                class36.field520.method1721(arg1 + 120, class240.field3972[82] ? 1 : 0);
                class36.field520.method1719(var7, 128);
                class160.method1245(var3, var2, var21.method1634(-1), 0, var21.method1634(-1), 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
            }
        }
        if (var6 == 49) {
            if (var7 == 0) {
                class3.field20 = 1;
                class214.method1618(class186.field2991, var2, var3);
            } else if (var7 == 1) {
                class23.field280++;
                class36.field520.method2228(216, 16547);
                class36.field520.method1761(-67, class209.field3297);
                class36.field520.method1719(class93.field1562 + var2, 128);
                class36.field520.method1757(class275.field4549, -126);
                class36.field520.method1731(-87, class275.field4546 + var3);
            }
        }
        if (var6 == 15) {
            class258 var22 = class56.field924[var7];
            if (var22 != null) {
                class182.field2940++;
                class162.field2571 = class229.field3812;
                class221.field3607 = class333.field5278;
                class169.field2692 = 0;
                class223.field3709 = 2;
                class36.field520.method2228(12, arg1 ^ 0xFFFFBF5F);
                class36.field520.method1731(-91, var7);
                class36.field520.method1728(class240.field3972[82] ? 1 : 0, (byte) -96);
                class160.method1245(var3, var2, var22.method1634(arg1 ^ 0x3), 0, var22.method1634(-1), 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
            }
        }
        if (var6 == 24) {
            class250 var23 = class25.method165(var2, var3, 24836);
            if (var23 != null) {
                class57.method473((byte) 118);
                class105 var24 = client.method336(var23);
                class216.method1628(var23.field4242, var2, var24.method812(true), arg1 ^ 0xFFFFFF81, var24.field1705, var3, var23.field4136);
                class16.field186 = 0;
                class324.field5160 = class55.method432(var23, (byte) -101);
                if (class324.field5160 == null) {
                    class324.field5160 = "Null";
                }
                if (var23.field4205) {
                    class178.field2851 = var23.field4074 + "<col=ffffff>";
                } else {
                    class178.field2851 = "<col=00ff00>" + var23.field4094 + "<col=ffffff>";
                }
            }
            return;
        }
        if (var6 == 57) {
            class221.field3596++;
            class36.field520.method2228(119, arg1 ^ 0xFFFFBF5F);
            class36.field520.method1741(var3, 872537352);
            class36.field520.method1731(-96, var7);
            class36.field520.method1729(var2, arg1 ^ 0xFFFFFF32);
            class163.field2585 = 0;
            class252.field4257 = class13.method74(-54, var3);
            class291.field4702 = var2;
        }
        if (var6 == 12) {
            class258 var25 = class56.field924[var7];
            if (var25 != null) {
                class169.field2692 = 0;
                class221.field3607 = class333.field5278;
                class223.field3709 = 2;
                class335.field5302++;
                class162.field2571 = class229.field3812;
                class36.field520.method2228(249, arg1 ^ 0xFFFFBF5F);
                class36.field520.method1719(class209.field3297, 128);
                class36.field520.method1749((byte) -20, class275.field4549);
                class36.field520.method1731(-128, var7);
                class36.field520.method1728(class240.field3972[82] ? 1 : 0, (byte) 115);
                class160.method1245(var3, var2, var25.method1634(-1), 0, var25.method1634(-1), 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
            }
        }
        if (var6 == 21) {
            class36.field520.method2228(242, arg1 + 16551);
            class36.field520.method1757(var3, -115);
            class36.field520.method1731(-87, var2);
            class319.field5083++;
            class36.field520.method1731(-85, var7);
            class163.field2585 = 0;
            class252.field4257 = class13.method74(-65, var3);
            class291.field4702 = var2;
        }
        if (var6 == 17) {
            class352.field5585++;
            class36.field520.method2228(173, 16547);
            class36.field520.method1729(var7, 206);
            class36.field520.method1741(var3, 872537352);
            class36.field520.method1719(var2, 128);
            class163.field2585 = 0;
            class252.field4257 = class13.method74(-78, var3);
            class291.field4702 = var2;
        }
        if (var6 == 1) {
            class258 var26 = class56.field924[var7];
            if (var26 != null) {
                class169.field2692 = 0;
                class124.field2121++;
                class223.field3709 = 2;
                class162.field2571 = class229.field3812;
                class221.field3607 = class333.field5278;
                class36.field520.method2228(101, 16547);
                class36.field520.method1721(92, class240.field3972[82] ? 1 : 0);
                class36.field520.method1761(arg1 ^ 0x38, var7);
                class160.method1245(var3, var2, var26.method1634(-1), 0, var26.method1634(-1), 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
            }
        }
        if (var6 == 38) {
            class233.field3859++;
            class36.field520.method2228(94, 16547);
            class36.field520.method1771(127, var3);
            class36.field520.method1761(106, var2);
            class36.field520.method1731(arg1 ^ 0x56, var7);
            class163.field2585 = 0;
            class252.field4257 = class13.method74(arg1 ^ 0x4B, var3);
            class291.field4702 = var2;
        }
        if (var6 == 9) {
            class87.method697(true);
        }
        if (var6 == 39) {
            class258 var27 = class56.field924[var7];
            if (var27 != null) {
                class221.field3607 = class333.field5278;
                class140.field2304++;
                class162.field2571 = class229.field3812;
                class223.field3709 = 2;
                class169.field2692 = 0;
                class36.field520.method2228(136, 16547);
                class36.field520.method1767(false, class240.field3972[82] ? 1 : 0);
                class36.field520.method1731(-96, var7);
                class160.method1245(var3, var2, var27.method1634(-1), 0, var27.method1634(-1), 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
            }
        }
        if (var6 == 10) {
            class221.field3607 = class333.field5278;
            class169.field2692 = 0;
            class320.field5097++;
            class223.field3709 = 2;
            class162.field2571 = class229.field3812;
            class36.field520.method2228(138, arg1 ^ 0xFFFFBF5F);
            class36.field520.method1767(false, class240.field3972[82] ? 1 : 0);
            class36.field520.method1719(class275.field4546 + var3, 128);
            class36.field520.method1719(class93.field1562 + var2, 128);
            class36.field520.method1731(-101, var7);
            class160.method1245(var3, var2, 0, 0, 0, 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
        }
        if (var6 == 18) {
            class288 var28 = class165.field2621[var7];
            if (var28 != null) {
                class162.field2571 = class229.field3812;
                class221.field3607 = class333.field5278;
                class169.field2692 = 0;
                class177.field2836++;
                class223.field3709 = 2;
                class36.field520.method2228(253, 16547);
                class36.field520.method1749((byte) -20, class275.field4549);
                class36.field520.method1721(arg1 + 117, class240.field3972[82] ? 1 : 0);
                class36.field520.method1731(arg1 - 102, var7);
                class36.field520.method1731(-99, class209.field3297);
                class160.method1245(var3, var2, var28.method1634(-1), 0, var28.method1634(-1), 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
            }
        }
        if (var6 == 47) {
            class36.field520.method2228(177, arg1 + 16551);
            class36.field520.method1757(var3, -100);
            class92.field1559++;
            class250 var29 = class13.method74(arg1 ^ 0x16, var3);
            if (var29.field4111 != null && var29.field4111[0][0] == 5) {
                int var30 = var29.field4111[0][1];
                if (class66.field1178[var30] != var29.field4219[0]) {
                    class66.field1178[var30] = var29.field4219[0];
                    class190.method1495(var30, (byte) 19);
                }
            }
        }
        if (var6 == 35) {
            class221.field3607 = class333.field5278;
            class223.field3709 = 2;
            class162.field2571 = class229.field3812;
            class169.field2692 = 0;
            class272.field4509++;
            class36.field520.method2228(63, arg1 + 16551);
            class36.field520.method1729((int) (var4 >>> 32) & Integer.MAX_VALUE, 206);
            class36.field520.method1761(-56, class275.field4546 + var3);
            class36.field520.method1728(class240.field3972[82] ? 1 : 0, (byte) 119);
            class36.field520.method1731(-128, class93.field1562 + var2);
            class327.method2305(true, var3, var4, var2);
        }
        if (var6 == 37) {
            class223.field3709 = 2;
            class323.field5148++;
            class169.field2692 = 0;
            class162.field2571 = class229.field3812;
            class221.field3607 = class333.field5278;
            class36.field520.method2228(227, arg1 ^ 0xFFFFBF5F);
            class36.field520.method1728(class240.field3972[82] ? 1 : 0, (byte) 82);
            class36.field520.method1731(arg1 - 87, (int) (var4 >>> 32) & Integer.MAX_VALUE);
            class36.field520.method1761(-51, var2 + class93.field1562);
            class36.field520.method1761(65, class275.field4546 + var3);
            class327.method2305(true, var3, var4, var2);
        }
        if (var6 == 1008) {
            class223.field3709 = 2;
            class162.field2571 = class229.field3812;
            class169.field2692 = 0;
            class221.field3607 = class333.field5278;
            class288 var31 = class165.field2621[var7];
            if (var31 != null) {
                class121 var32 = var31.field4692;
                if (var32.field2066 != null) {
                    var32 = var32.method958((byte) -115);
                }
                if (var32 != null) {
                    class90.field1524++;
                    class36.field520.method2228(59, 16547);
                    class36.field520.method1719(var32.field2083, 128);
                }
            }
        }
        if (var6 == 16) {
            class36.field520.method2228(89, 16547);
            class11.field92++;
            class36.field520.method1741(var3, 872537352);
            class36.field520.method1719(var2, 128);
            class36.field520.method1749((byte) -20, class275.field4549);
            class36.field520.method1729(class209.field3297, 206);
        }
        if (var6 == 43 || var6 == 1010) {
            class208.method1579(var7, class200.field3193[arg0], (byte) -69, var3, var2);
        }
        if (var6 == 58) {
            class169.field2692 = 0;
            class135.field2262++;
            class162.field2571 = class229.field3812;
            class223.field3709 = 2;
            class221.field3607 = class333.field5278;
            class36.field520.method2228(204, arg1 + 16551);
            class36.field520.method1731(-115, var7);
            class36.field520.method1731(arg1 - 87, class93.field1562 + var2);
            class36.field520.method1719(class275.field4546 + var3, arg1 ^ 0xFFFFFF7C);
            class36.field520.method1712(class240.field3972[82] ? 1 : 0, -66);
            class160.method1245(var3, var2, 0, 0, 0, 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
        }
        if (var6 == 1004) {
            class44.field692++;
            class169.field2692 = 0;
            class223.field3709 = 2;
            class162.field2571 = class229.field3812;
            class221.field3607 = class333.field5278;
            class36.field520.method2228(46, 16547);
            class36.field520.method1719(var7, 128);
        }
        if (var6 == 1002 || var6 == 1006 || var6 == 1007 || var6 == 1012 || var6 == 1011) {
            class61.method509(var7, true, var2, var6);
        }
        if (var6 == 32) {
            class288 var33 = class165.field2621[var7];
            if (var33 != null) {
                class221.field3607 = class333.field5278;
                class162.field2571 = class229.field3812;
                class322.field5133++;
                class223.field3709 = 2;
                class169.field2692 = 0;
                class36.field520.method2228(45, 16547);
                class36.field520.method1767(false, class240.field3972[82] ? 1 : 0);
                class36.field520.method1729(var7, arg1 ^ 0xFFFFFF32);
                class160.method1245(var3, var2, var33.method1634(-1), 0, var33.method1634(-1), 19324, true, class6.field55.field3553[0], 0, class6.field55.field3519[0], 0);
            }
        }
        if (var6 == 33) {
            class57.method473((byte) 51);
            class250 var36 = class13.method74(-36, var3);
            class71.field1237 = var7;
            class16.field186 = 1;
            class77.field1345 = var3;
            class17.field202 = var2;
            class205.method1568(var36, (byte) 124);
            class233.field3881 = "<col=ff9040>" + class6.method22(var7, arg1 + 16434).field871 + "<col=ffffff>";
            if (class233.field3881 == null) {
                class233.field3881 = "null";
            }
            return;
        }
        if (var6 == 20) {
            class260.field4379++;
            class36.field520.method2228(179, arg1 ^ 0xFFFFBF5F);
            class36.field520.method1749((byte) -20, var3);
            class36.field520.method1719(var7, 128);
            class36.field520.method1757(class275.field4549, arg1 ^ 0x6D);
            class36.field520.method1761(arg1 - 31, class209.field3297);
            class36.field520.method1761(-103, var2);
            class163.field2585 = 0;
            class252.field4257 = class13.method74(-41, var3);
            class291.field4702 = var2;
        }
        if (var6 == 14) {
            class36.field520.method2228(177, 16547);
            class92.field1559++;
            class36.field520.method1757(var3, -127);
            class250 var34 = class13.method74(-113, var3);
            if (var34.field4111 != null && var34.field4111[0][0] == 5) {
                int var35 = var34.field4111[0][1];
                class66.field1178[var35] = 1 - class66.field1178[var35];
                class190.method1495(var35, (byte) 19);
            }
        }
        if (var6 == 41) {
            class36.field520.method2228(121, 16547);
            class338.field5388++;
            class36.field520.method1719(var7, 128);
            class36.field520.method1731(-89, var2);
            class36.field520.method1771(-95, var3);
            class163.field2585 = 0;
            class252.field4257 = class13.method74(arg1 ^ 0x68, var3);
            class291.field4702 = var2;
        }
        if (class16.field186 != 0) {
            class16.field186 = 0;
            class205.method1568(class13.method74(-14, class77.field1345), (byte) 124);
        }
        if (class227.field3789) {
            class57.method473((byte) 103);
        }
        if (class252.field4257 != null && class163.field2585 == 0) {
            class205.method1568(class252.field4257, (byte) 121);
        }
    }
}
