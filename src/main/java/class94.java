import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class94 extends class60 {

    @OriginalMember(owner = "client!i", name = "K", descriptor = "J")
    public long field1640;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    public static int field1632 = 0;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "[I")
    public static int[] field1629 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!i", name = "A", descriptor = "I")
    public static int field1631 = 0;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "Lub;")
    public static class227 field1635 = class257.method1749(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 17263);

    @OriginalMember(owner = "client!i", name = "C", descriptor = "Luh;")
    public static class198 field1633 = new class198();

    @OriginalMember(owner = "client!i", name = "v", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "Lnh;")
    public static class57 field1639;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "Lf;")
    public static class82 field1627;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "[S")
    public static short[] field1637;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V")
    public static final void method577(byte arg0) {
        field1628++;
        if (class128.field2259 == 0 || class128.field2259 == 5) {
            return;
        }
        try {
            if ((++class69.field1222) > 2000) {
                if (class9.field172 != null) {
                    class9.field172.method97(0);
                    class9.field172 = null;
                }
                if (class197.field3384 >= 1) {
                    class128.field2259 = 0;
                    class37.field623 = -5;
                    return;
                }
                class197.field3384++;
                class128.field2259 = 1;
                if (class9.field168 == class177.field2945) {
                    class9.field168 = class104.field1822;
                } else {
                    class9.field168 = class177.field2945;
                }
                class69.field1222 = 0;
            }
            if (class128.field2259 == 1) {
                class221.field3751 = class61.field1123.method1602(class9.field168, false, class123.field2218);
                class128.field2259 = 2;
            }
            if (class128.field2259 == 2) {
                if (class221.field3751.field1302 == 2) {
                    throw new IOException();
                }
                if (class221.field3751.field1302 != 1) {
                    return;
                }
                class9.field172 = new class20((Socket) class221.field3751.field1299, class61.field1123);
                class221.field3751 = null;
                long var1 = class151.field2632 = class91.field1546.method1485(122);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class176.field2935.field3879 = 0;
                class176.field2935.method1443(14, 0);
                class176.field2935.method1443(var3, 0);
                class9.field172.method94(2, (byte) -24, class176.field2935.field3901, 0);
                if (class77.field1360 != null) {
                    class77.field1360.method1323((byte) -119);
                }
                if (class124.field2229 != null) {
                    class124.field2229.method1323((byte) -125);
                }
                int var4 = class9.field172.method98((byte) 82);
                if (class77.field1360 != null) {
                    class77.field1360.method1323((byte) -74);
                }
                if (class124.field2229 != null) {
                    class124.field2229.method1323((byte) -114);
                }
                if (var4 != 0) {
                    class37.field623 = var4;
                    class128.field2259 = 0;
                    class9.field172.method97(0);
                    class9.field172 = null;
                    return;
                }
                class128.field2259 = 3;
            }
            if (class128.field2259 == 3) {
                if (class9.field172.method93(0) < 8) {
                    return;
                }
                class9.field172.method99(8, 0, class32.field512.field3901, 126);
                class32.field512.field3879 = 0;
                int[] var5 = new int[4];
                class193.field3275 = class32.field512.method1469((byte) 41);
                var5[2] = (int) (class193.field3275 >> 32);
                var5[3] = (int) class193.field3275;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class176.field2935.field3879 = 0;
                class176.field2935.method1443(10, 0);
                class176.field2935.method1427(var5[0], (byte) -2);
                class176.field2935.method1427(var5[1], (byte) 52);
                class176.field2935.method1427(var5[2], (byte) -125);
                class176.field2935.method1427(var5[3], (byte) -100);
                class176.field2935.method1457(class91.field1546.method1485(122), 59);
                class176.field2935.method1452(class91.field1564, (byte) -63);
                class176.field2935.method1430(class165.field2767, class98.field1718, -111);
                class175.field2912.field3879 = 0;
                if (class184.field3139 == 40) {
                    class175.field2912.method1443(18, 0);
                } else {
                    class175.field2912.method1443(16, 0);
                }
                class175.field2912.method1451(class176.field2935.field3879 + class167.method1028(class9.field167, 31) + 149, (byte) -111);
                class175.field2912.method1427(504, (byte) 80);
                class175.field2912.method1443(0, 0);
                class175.field2912.method1451(class49.field867, (byte) -127);
                class175.field2912.method1451(class208.field3538, (byte) -115);
                class186.method1184(class175.field2912, 32767);
                class175.field2912.method1452(class9.field167, (byte) -63);
                class175.field2912.method1427(class64.field1172, (byte) -111);
                class175.field2912.method1427(class116.method732((byte) -120), (byte) 30);
                class7.field152 = true;
                class175.field2912.method1427(class31.field495.field2376, (byte) -102);
                class175.field2912.method1427(class33.field547.field2376, (byte) 56);
                class175.field2912.method1427(class7.field154.field2376, (byte) 7);
                class175.field2912.method1427(class188.field3198.field2376, (byte) -7);
                class175.field2912.method1427(class95.field1648.field2376, (byte) 122);
                class175.field2912.method1427(class232.field4042.field2376, (byte) -101);
                class175.field2912.method1427(class14.field270.field2376, (byte) -124);
                class175.field2912.method1427(class252.field4358.field2376, (byte) 84);
                class175.field2912.method1427(field1639.field2376, (byte) -120);
                class175.field2912.method1427(class87.field1510.field2376, (byte) -119);
                class175.field2912.method1427(class207.field3510.field2376, (byte) -103);
                class175.field2912.method1427(class149.field2602.field2376, (byte) 0);
                class175.field2912.method1427(class128.field2254.field2376, (byte) 79);
                class175.field2912.method1427(class13.field247.field2376, (byte) 24);
                class175.field2912.method1427(class226.field3862.field2376, (byte) 56);
                class175.field2912.method1427(class13.field252.field2376, (byte) 73);
                class175.field2912.method1427(class143.field2455.field2376, (byte) 61);
                class175.field2912.method1427(class171.field2855.field2376, (byte) -111);
                class175.field2912.method1427(class97.field1705.field2376, (byte) 19);
                class175.field2912.method1427(class194.field3304.field2376, (byte) 65);
                class175.field2912.method1427(class184.field3137.field2376, (byte) 63);
                class175.field2912.method1427(class199.field3412.field2376, (byte) 94);
                class175.field2912.method1427(class86.field1495.field2376, (byte) 26);
                class175.field2912.method1427(class69.field1217.field2376, (byte) -121);
                class175.field2912.method1427(class83.field1459.field2376, (byte) -112);
                class175.field2912.method1427(class81.field1401.field2376, (byte) 12);
                class175.field2912.method1427(class38.field639.field2376, (byte) -4);
                class175.field2912.method1460(class176.field2935.field3879, 0, true, class176.field2935.field3901);
                class9.field172.method94(class175.field2912.field3879, (byte) -24, class175.field2912.field3901, 0);
                class176.field2935.method657((byte) 4, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class32.field512.method657((byte) 4, var5);
                class128.field2259 = 4;
            }
            if (arg0 > -99) {
                field1629 = null;
            }
            if (class128.field2259 == 4) {
                if (class9.field172.method93(0) < 1) {
                    return;
                }
                int var7 = class9.field172.method98((byte) 82);
                if (var7 == 21) {
                    class128.field2259 = 7;
                } else if (var7 == 1) {
                    class37.field623 = var7;
                    class128.field2259 = 5;
                    return;
                } else if (var7 == 2) {
                    class128.field2259 = 8;
                } else if (var7 == 15) {
                    class37.field623 = var7;
                    class128.field2259 = 0;
                    return;
                } else if (var7 == 23 && class197.field3384 < 1) {
                    class69.field1222 = 0;
                    class197.field3384++;
                    class128.field2259 = 1;
                    class9.field172.method97(0);
                    class9.field172 = null;
                    return;
                } else {
                    class37.field623 = var7;
                    class128.field2259 = 0;
                    class9.field172.method97(0);
                    class9.field172 = null;
                    return;
                }
            }
            if (class128.field2259 == 6) {
                class176.field2935.field3879 = 0;
                class176.field2935.method664((byte) -106, 17);
                class9.field172.method94(class176.field2935.field3879, (byte) -24, class176.field2935.field3901, 0);
                class128.field2259 = 4;
            } else if (class128.field2259 != 7) {
                if (class128.field2259 == 8) {
                    if (class9.field172.method93(0) < 11) {
                        return;
                    }
                    class9.field172.method99(11, 0, class32.field512.field3901, -21);
                    class32.field512.field3879 = 0;
                    class78.field1365 = class32.field512.method1471(255);
                    class192.field3272 = class32.field512.method1471(255);
                    class252.field4363 = class32.field512.method1471(255);
                    if (class252.field4363 == 1) {
                        try {
                            class167.field2784.method1499(74, class61.field1123.field4153);
                        } catch (Throwable var9) {
                        }
                    } else {
                        try {
                            class182.field3116.method1499(-38, class61.field1123.field4153);
                        } catch (Throwable var8) {
                        }
                    }
                    class49.field858 = class32.field512.method1471(255);
                    class195.field3317 = class32.field512.method1471(255) == 1;
                    class254.field4473 = class32.field512.method1447(0);
                    class100.field1759 = class32.field512.method1471(255);
                    class134.field2318 = class32.field512.method663(101);
                    class179.field3073 = class32.field512.method1447(0);
                    class128.field2259 = 9;
                }
                if (class128.field2259 == 9 && class9.field172.method93(0) >= class179.field3073) {
                    class32.field512.field3879 = 0;
                    class9.field172.method99(class179.field3073, 0, class32.field512.field3901, 111);
                    class128.field2259 = 0;
                    class37.field623 = 2;
                    class227.method1507(-112);
                    class241.field4189 = -1;
                    class89.method533(47, false);
                    class134.field2318 = -1;
                }
            } else if (class9.field172.method93(0) >= 1) {
                class88.field1519 = class9.field172.method98((byte) 82) * 60 + 180;
                class37.field623 = 21;
                class128.field2259 = 0;
                class9.field172.method97(0);
                class9.field172 = null;
            }
        } catch (IOException var10) {
            if (class9.field172 != null) {
                class9.field172.method97(0);
                class9.field172 = null;
            }
            if (class197.field3384 >= 1) {
                class128.field2259 = 0;
                class37.field623 = -4;
            } else {
                class69.field1222 = 0;
                class197.field3384++;
                class128.field2259 = 1;
                if (class9.field168 == class177.field2945) {
                    class9.field168 = class104.field1822;
                } else {
                    class9.field168 = class177.field2945;
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([Lub;II[SB)V")
    public static final void method578(class227[] arg0, int arg1, int arg2, short[] arg3, byte arg4) {
        field1634++;
        if (arg1 > arg2) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg2;
            class227 var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            short var8 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var8;
            for (int var9 = arg2; var9 < arg1; var9++) {
                if (var7 == null || arg0[var9] != null && (var9 & 0x1) > arg0[var9].method1491(var7, 5177)) {
                    class227 var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var8;
            method578(arg0, var6 - 1, arg2, arg3, (byte) 115);
            method578(arg0, arg1, var6 + 1, arg3, (byte) 123);
        }
        if (arg4 <= 101) {
            method578((class227[]) null, -26, -28, (short[]) null, (byte) -22);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIII)V")
    public static final void method579(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= arg0) {
            for (int var5 = arg1; var5 < arg0; var5++) {
                class59.field1094[var5][arg4] = arg3;
            }
        } else {
            for (int var6 = arg0; var6 < arg1; var6++) {
                class59.field1094[var6][arg4] = arg3;
            }
        }
        field1630++;
        if (arg2 != -10260) {
            field1633 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIZ)Lnf;")
    public static final class213 method580(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg4 != 2) {
            field1639 = null;
        }
        field1638++;
        int var7 = arg1 + (arg5 ? 65536 : 0) + (arg2 << 17) + (arg3 << 19);
        long var8 = (long) arg0 * 3147483667L + (long) var7 * 3849834839L;
        class213 var10 = (class213) class31.field498.method1735(var8, (byte) -69);
        if (var10 != null) {
            return var10;
        }
        class62.field1140 = false;
        class213 var11 = client.method502(arg5, -29366, arg1, arg3, arg0, false, false, arg2);
        if (var11 != null && !class62.field1140) {
            class31.field498.method1730(var11, var8, (byte) -113);
        }
        return var11;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public static void method581(int arg0) {
        field1633 = null;
        field1639 = null;
        field1629 = null;
        field1627 = null;
        field1637 = null;
        field1635 = null;
        if (arg0 != 19753) {
            field1635 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public static final void method582(int arg0, int arg1) {
        class254.field4457.method1727(true, arg1);
        class27.field438.method1727(true, arg1);
        class97.field1704.method1727(true, arg1);
        if (arg0 != 0) {
            method583(false, -37);
        }
        class13.field249.method1727(true, arg1);
        field1636++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZI)Z")
    public static final boolean method583(boolean arg0, int arg1) {
        if (!arg0) {
            method582(-43, 58);
        }
        field1626++;
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class94() {
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(J)V")
    public class94(long arg0) {
        this.field1640 = arg0;
    }
}
