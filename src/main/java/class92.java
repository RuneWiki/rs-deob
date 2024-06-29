import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class92 extends class228 {

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "[I")
    public static int[] field1812 = new int[200];

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "Z")
    public static boolean field1816 = false;

    @OriginalMember(owner = "client!sf", name = "hb", descriptor = "Llb;")
    public static class127 field1818 = new class127(100);

    @OriginalMember(owner = "client!sf", name = "nb", descriptor = "I")
    public static int field1824 = 0;

    @OriginalMember(owner = "client!sf", name = "ob", descriptor = "Loh;")
    public static class263 field1825 = class253.method1681(-117, "<col=ffff00>");

    @OriginalMember(owner = "client!sf", name = "lb", descriptor = "Loh;")
    public static class263 field1822 = class253.method1681(-127, "");

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!sf", name = "gb", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!sf", name = "ib", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!sf", name = "jb", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!sf", name = "kb", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!sf", name = "mb", descriptor = "[[[B")
    public static byte[][][] field1823;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lue;Lue;I)V")
    public static final void method647(class86 arg0, class86 arg1, int arg2) {
        ++field1814;
        class90.field1780 = arg1;
        class181.field3288 = arg0;
        class122.field2266 = class181.field3288.method587((byte) 115, 3);
        if (arg2 != -16390) {
            field1812 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        ++field1819;
        if (arg1 != 5) {
            this.method174(72, -1);
        }
        int[][] var3 = super.field4509.method1667(arg0, 0);
        if (super.field4509.field4346 && this.method1546((byte) -70)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = arg0 % super.field4009 * super.field4009;
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class49.field1052; ++var8) {
                int var9 = super.field3999[var8 % super.field4003 + var6];
                var7[var8] = class263.method1777(var9 << 4, 4080);
                var5[var8] = class263.method1777(4080, var9 >> 4);
                var4[var8] = class263.method1777(16711680, var9) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B[Lpc;I)V")
    public static final void method648(byte arg0, class21[] arg1, int arg2) {
        ++field1821;
        if (arg0 != 68) {
            field1812 = null;
        }
        for (int var3 = 0; arg1.length > var3; ++var3) {
            class21 var4 = arg1[var3];
            if (var4 != null) {
                if (~var4.field519 == -1) {
                    if (var4.field589 != null) {
                        method648((byte) 68, var4.field589, arg2);
                    }
                    class266 var5 = (class266) class212.field3797.method31(-32665, (long) var4.field537);
                    if (var5 != null) {
                        class96.method670(var5.field4641, -5846, arg2);
                    }
                }
                if (~arg2 == -1 && var4.field561 != null) {
                    class116 var6 = new class116();
                    var6.field2173 = var4.field561;
                    var6.field2166 = var4;
                    class182.method1211(var6, arg0 ^ 33);
                }
                if (arg2 == 1 && var4.field609 != null) {
                    if (var4.field470 >= 0) {
                        class21 var7 = class8.method55(65535, var4.field537);
                        if (var7 == null || var7.field589 == null || var4.field470 >= var7.field589.length || var7.field589[var4.field470] != var4) {
                            continue;
                        }
                    }
                    class116 var8 = new class116();
                    var8.field2166 = var4;
                    var8.field2173 = var4.field609;
                    class182.method1211(var8, 123);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(II)Lgd;")
    public static final class72 method649(int arg0, int arg1) {
        ++field1815;
        class72 var2 = (class72) client.field2750.method828(0, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class207.field3751.method596(arg0 ^ -32407, class178.method1197((byte) -101, arg1), class223.method1522(arg1, false));
            class72 var4 = new class72();
            var4.field1497 = arg1;
            if (var3 != null) {
                var4.method461(new class194(var3), (byte) -98);
            }
            var4.method466(arg0 ^ -32507);
            if (var4.field1507 != -1) {
                var4.method462((byte) -120, method649(arg0, var4.field1478), method649(-32508, var4.field1507));
            }
            if (var4.field1511 != -1) {
                var4.method472(method649(-32508, var4.field1511), 255, method649(arg0, var4.field1477));
            }
            if (!class215.field3820 && var4.field1500) {
                var4.field1499 = false;
                var4.field1502 = null;
                var4.field1475 = 0;
                var4.field1467 = class240.field4196;
                var4.field1442 = null;
            }
            if (arg0 != -32508) {
                field1825 = null;
            }
            client.field2750.method826((long) arg1, 9815, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lef;")
    public static final class207 method650(Throwable arg0, String arg1) {
        ++field1817;
        class207 var2;
        if (!(arg0 instanceof class207)) {
            var2 = new class207(arg0, arg1);
        } else {
            var2 = (class207) arg0;
            var2.field3748 = var2.field3748 + ' ' + arg1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)V")
    public static final void method651(byte arg0) {
        ++field1820;
        if (~class180.field3280 != -1 && ~class180.field3280 != -6) {
            try {
                if (++field1824 > 2000) {
                    if (class166.field3023 != null) {
                        class166.field3023.method809((byte) 106);
                        class166.field3023 = null;
                    }
                    if (class255.field4428 >= 1) {
                        class180.field3280 = 0;
                        class96.field1873 = -5;
                        return;
                    }
                    class180.field3280 = 1;
                    field1824 = 0;
                    ++class255.field4428;
                    if (class182.field3298 == class118.field2201) {
                        class118.field2201 = class245.field4323;
                    } else {
                        class118.field2201 = class182.field3298;
                    }
                }
                if (class180.field3280 == 1) {
                    class111.field2098 = class95.field1867.method1736(-59, class118.field2201, class32.field793);
                    class180.field3280 = 2;
                }
                if (class180.field3280 == 2) {
                    if (~class111.field2098.field4114 == -3) {
                        throw new IOException();
                    }
                    if (~class111.field2098.field4114 != -2) {
                        return;
                    }
                    class166.field3023 = new class125((Socket) class111.field2098.field4117, class95.field1867);
                    class111.field2098 = null;
                    long var1 = class60.field1234 = class20.field461.method1755(1);
                    int var3 = (int) (31L & var1 >> 16);
                    class154.field2792.field3497 = 0;
                    class154.field2792.method1288((byte) -69, 14);
                    class154.field2792.method1288((byte) -127, var3);
                    class166.field3023.method806(0, 2, class154.field2792.field3469, -127);
                    if (class30.field745 != null) {
                        class30.field745.method1575(0);
                    }
                    if (class93.field1843 != null) {
                        class93.field1843.method1575(0);
                    }
                    int var4 = class166.field3023.method800((byte) -126);
                    if (class30.field745 != null) {
                        class30.field745.method1575(0);
                    }
                    if (class93.field1843 != null) {
                        class93.field1843.method1575(arg0 + -40);
                    }
                    if (var4 != 0) {
                        class180.field3280 = 0;
                        class96.field1873 = var4;
                        class166.field3023.method809((byte) 106);
                        class166.field3023 = null;
                        return;
                    }
                    class180.field3280 = 3;
                }
                if (~class180.field3280 == -4) {
                    if (~class166.field3023.method803(-116) > -9) {
                        return;
                    }
                    class166.field3023.method810(0, -1, 8, class189.field3394.field3469);
                    class189.field3394.field3497 = 0;
                    class269.field4741 = class189.field3394.method1274(arg0 ^ -778468344);
                    class154.field2792.field3497 = 0;
                    int[] var5 = new int[] { (int) (9.9999999E7D * Math.random()), (int) (Math.random() * 9.9999999E7D), (int) (class269.field4741 >> 32), (int) class269.field4741 };
                    class154.field2792.method1288((byte) -100, 10);
                    class154.field2792.method1286(-11740, var5[0]);
                    class154.field2792.method1286(-11740, var5[1]);
                    class154.field2792.method1286(-11740, var5[2]);
                    class154.field2792.method1286(-11740, var5[3]);
                    class154.field2792.method1272((byte) 69, class20.field461.method1755(1));
                    class154.field2792.method1312(arg0 + -100, class20.field460);
                    class154.field2792.method1322((byte) -81, class89.field1760, class222.field3931);
                    class127.field2351.field3497 = 0;
                    if (~class271.field4786 == -41) {
                        class127.field2351.method1288((byte) -109, 18);
                    } else {
                        class127.field2351.method1288((byte) -43, 16);
                    }
                    class127.field2351.method1276(class154.field2792.field3497 + (155 - -class169.method1118(-1, class276.field4835)), arg0 + -153);
                    class127.field2351.method1286(arg0 ^ -11764, 521);
                    class127.field2351.method1288((byte) -61, class201.field3636);
                    class127.field2351.method1288((byte) -102, !class191.field3433 ? 0 : 1);
                    class127.field2351.method1288((byte) -60, 0);
                    class127.field2351.method1288((byte) -62, class220.method1506((byte) -88));
                    class127.field2351.method1276(class138.field2558, -96);
                    class127.field2351.method1276(class143.field2616, -51);
                    class127.field2351.method1288((byte) -103, class60.field1239);
                    class150.method985(arg0 ^ -21313, class127.field2351);
                    class127.field2351.method1312(-128, class276.field4835);
                    class127.field2351.method1286(arg0 ^ -11764, class271.field4789);
                    class127.field2351.method1286(-11740, class83.method557(arg0 + 86));
                    class120.field2234 = true;
                    class127.field2351.method1276(class44.field969, arg0 ^ -127);
                    class127.field2351.method1286(-11740, class47.field1025.method584(-1701129456));
                    class127.field2351.method1286(-11740, class173.field3139.method584(-1701129456));
                    class127.field2351.method1286(-11740, class7.field131.method584(-1701129456));
                    class127.field2351.method1286(-11740, class59.field1222.method584(-1701129456));
                    class127.field2351.method1286(arg0 ^ -11764, class17.field389.method584(-1701129456));
                    class127.field2351.method1286(-11740, class190.field3413.method584(-1701129456));
                    class127.field2351.method1286(-11740, class142.field2609.method584(-1701129456));
                    class127.field2351.method1286(-11740, class53.field1128.method584(-1701129456));
                    class127.field2351.method1286(-11740, class204.field3664.method584(-1701129456));
                    class127.field2351.method1286(-11740, class146.field2664.method584(-1701129456));
                    class127.field2351.method1286(arg0 ^ -11764, class185.field3342.method584(-1701129456));
                    class127.field2351.method1286(arg0 + -11780, class118.field2198.method584(-1701129456));
                    class127.field2351.method1286(arg0 + -11780, class182.field3303.method584(-1701129456));
                    class127.field2351.method1286(-11740, class54.field1151.method584(arg0 + -1701129496));
                    class127.field2351.method1286(-11740, class248.field4345.method584(-1701129456));
                    class127.field2351.method1286(arg0 ^ -11764, class17.field396.method584(-1701129456));
                    class127.field2351.method1286(arg0 ^ -11764, class217.field3862.method584(-1701129456));
                    class127.field2351.method1286(-11740, class178.field3268.method584(-1701129456));
                    class127.field2351.method1286(arg0 ^ -11764, class130.field2384.method584(-1701129456));
                    class127.field2351.method1286(-11740, class271.field4787.method584(-1701129456));
                    class127.field2351.method1286(-11740, class19.field437.method584(-1701129456));
                    class127.field2351.method1286(arg0 + -11780, class180.field3281.method584(-1701129456));
                    class127.field2351.method1286(-11740, class2.field24.method584(-1701129456));
                    class127.field2351.method1286(-11740, class196.field3547.method584(-1701129456));
                    class127.field2351.method1286(arg0 ^ -11764, class20.field458.method584(-1701129456));
                    class127.field2351.method1286(-11740, class198.field3581.method584(arg0 ^ -1701129416));
                    class127.field2351.method1286(arg0 ^ -11764, class249.field4356.method584(-1701129456));
                    class127.field2351.method1271(class154.field2792.field3497, 0, class154.field2792.field3469, arg0 ^ 18541);
                    class166.field3023.method806(0, class127.field2351.field3497, class127.field2351.field3469, arg0 ^ -72);
                    class154.field2792.method1515(var5, -1);
                    for (int var6 = 0; ~var6 > -5; ++var6) {
                        var5[var6] += 50;
                    }
                    class189.field3394.method1515(var5, -1);
                    class180.field3280 = 4;
                }
                if (class180.field3280 == 4) {
                    if (class166.field3023.method803(arg0 ^ -118) < 1) {
                        return;
                    }
                    int var7 = class166.field3023.method800((byte) -126);
                    if (~var7 != -22) {
                        if (var7 == 29) {
                            class180.field3280 = 10;
                        } else {
                            if (~var7 == -2) {
                                class96.field1873 = var7;
                                class180.field3280 = 5;
                                return;
                            }
                            if (var7 != 2) {
                                if (var7 != 15) {
                                    if (var7 == 23 && ~class255.field4428 > -2) {
                                        field1824 = 0;
                                        class180.field3280 = 1;
                                        ++class255.field4428;
                                        class166.field3023.method809((byte) 117);
                                        class166.field3023 = null;
                                        return;
                                    }
                                    class180.field3280 = 0;
                                    class96.field1873 = var7;
                                    class166.field3023.method809((byte) 91);
                                    class166.field3023 = null;
                                    return;
                                }
                                class96.field1873 = var7;
                                class180.field3280 = 0;
                                return;
                            }
                            class180.field3280 = 8;
                        }
                    } else {
                        class180.field3280 = 7;
                    }
                }
                if (arg0 != 40) {
                    field1823 = null;
                }
                if (~class180.field3280 == -7) {
                    class154.field2792.field3497 = 0;
                    class154.field2792.method1516(111, 17);
                    class166.field3023.method806(0, class154.field2792.field3497, class154.field2792.field3469, arg0 ^ -76);
                    class180.field3280 = 4;
                } else if (~class180.field3280 == -8) {
                    if (~class166.field3023.method803(-93) <= -2) {
                        class252.field4381 = 180 + class166.field3023.method800((byte) -126) * 60;
                        class180.field3280 = 0;
                        class96.field1873 = 21;
                        class166.field3023.method809((byte) 122);
                        class166.field3023 = null;
                    }
                } else if (class180.field3280 == 10) {
                    if (~class166.field3023.method803(arg0 ^ -74) <= -2) {
                        class63.field1267 = class166.field3023.method800((byte) -126);
                        class96.field1873 = 29;
                        class180.field3280 = 0;
                        class166.field3023.method809((byte) 70);
                        class166.field3023 = null;
                    }
                } else {
                    if (~class180.field3280 == -9) {
                        if (class166.field3023.method803(arg0 + -139) < 14) {
                            return;
                        }
                        class166.field3023.method810(0, -1, 14, class189.field3394.field3469);
                        class189.field3394.field3497 = 0;
                        class4.field82 = class189.field3394.method1301(arg0 + -8357);
                        class5.field90 = class189.field3394.method1301(-8317);
                        class156.field2806 = class189.field3394.method1301(-8317) == 1;
                        class85.field1670 = ~class189.field3394.method1301(-8317) == -2;
                        class52.field1110 = ~class189.field3394.method1301(-8317) == -2;
                        class134.field2451 = ~class189.field3394.method1301(-8317) == -2;
                        class253.field4392 = class189.field3394.method1301(-8317) == 1;
                        class196.field3574 = class189.field3394.method1294((byte) 3);
                        class258.field4479 = class189.field3394.method1301(arg0 + -8357) == 1;
                        class86.field1698 = ~class189.field3394.method1301(arg0 ^ -8277) == -2;
                        class229.method1550(-4183, class86.field1698);
                        class209.method1438(1, class86.field1698);
                        if (!class191.field3433) {
                            if ((!class156.field2806 || class52.field1110) && !class258.field4479) {
                                try {
                                    class49.field1059.method1785(-25092, class95.field1867.field4557);
                                } catch (Throwable var8) {
                                }
                            } else {
                                try {
                                    class96.field1875.method1785(-25092, class95.field1867.field4557);
                                } catch (Throwable var9) {
                                }
                            }
                        }
                        class252.field4386 = class189.field3394.method1519((byte) -105);
                        class36.field826 = class189.field3394.method1294((byte) 3);
                        class180.field3280 = 9;
                    }
                    if (class180.field3280 == 9) {
                        if (class166.field3023.method803(-126) >= class36.field826) {
                            class189.field3394.field3497 = 0;
                            class166.field3023.method810(0, arg0 + -41, class36.field826, class189.field3394.field3469);
                            class96.field1873 = 2;
                            class180.field3280 = 0;
                            class243.method1650(arg0 + -40);
                            class3.field68 = -1;
                            class144.method953(false, (byte) 121);
                            class252.field4386 = -1;
                        }
                    }
                }
            } catch (IOException var10) {
                if (class166.field3023 != null) {
                    class166.field3023.method809((byte) 104);
                    class166.field3023 = null;
                }
                if (~class255.field4428 > -2) {
                    class180.field3280 = 1;
                    if (class182.field3298 == class118.field2201) {
                        class118.field2201 = class245.field4323;
                    } else {
                        class118.field2201 = class182.field3298;
                    }
                    field1824 = 0;
                    ++class255.field4428;
                } else {
                    class180.field3280 = 0;
                    class96.field1873 = -4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(B)V")
    public static void method652(byte arg0) {
        field1822 = null;
        field1825 = null;
        field1812 = null;
        field1818 = null;
        if (arg0 == 9) {
            field1823 = null;
        }
    }
}
