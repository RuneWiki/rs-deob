import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class70 extends class23 {

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    public static int field1333 = -1;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public static int field1326 = 0;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "Llc;")
    public static class143 field1334 = class66.method374("Update)2Liste geladen)3", -1);

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
    public static int field1341 = 0;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "Z")
    public static boolean field1340 = false;

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "I")
    public static int field1338 = 0;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)V")
    public static void method403(byte arg0) {
        field1334 = null;
        int var1 = 3 % ((arg0 + 37) / 46);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)V")
    public static final void method404(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1327++;
        class166 var5 = class262.method1746(-106, arg0, 10);
        var5.method1097((byte) -74);
        var5.field2976 = arg3;
        var5.field2979 = arg2;
        var5.field2978 = arg4;
        if (arg1 != 26152) {
            field1326 = -8;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZIBIII)Lvg;")
    public static final class230 method405(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1336++;
        int var6 = (arg1 << 17) + arg3 + (arg0 ? 65536 : 0) + (arg5 << 19);
        long var8 = (long) var6 * 3849834839L + (long) arg4 * 3147483667L;
        class230 var10 = (class230) class24.field411.method826(var8, false);
        if (var10 != null) {
            return var10;
        }
        class196.field3643 = false;
        class230 var11 = class162.method1071(arg3, -4, arg4, arg1, arg0, arg5, false, false);
        if (var11 != null && !class196.field3643) {
            class24.field411.method827(-3, var11, var8);
        }
        if (arg2 != -42) {
            field1333 = -2;
        }
        return var11;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)I")
    public static final int method406(int arg0, int arg1, int arg2) {
        field1328++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (arg0 < 13) {
            return -42;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)V")
    public static final void method407(int arg0) {
        if (arg0 != 25493) {
            return;
        }
        field1335++;
        class178.field3193 = null;
        class36.field620 = null;
        class272.field4858 = null;
        class137.field2405 = null;
        class153.field2771 = null;
        class7.field146 = null;
        class133.field2326 = null;
        class173.field3108 = null;
        class283.field4992 = null;
        class236.field4299 = null;
        class36.field618 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method408(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class58[] var7 = class250.field4510;
        if (arg3 != -12856) {
            method408(-117, -114, -60, 85, -106, -58, 99);
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class58 var9 = var7[var8];
            if (var9 != null && var9.field1112 == 2) {
                class214.method1485(-2101, var9.field1127 * 2, arg2 >> 1, (var9.field1126 - class148.field2733 << 7) + var9.field1129, (-class141.field2466 + var9.field1119 << 7) + var9.field1121, arg5 >> 1, arg0, arg4);
                if (class33.field565 > -1 && class146.field2635 % 20 < 10) {
                    class140.field2442[var9.field1114].method1058(arg1 + class33.field565 - 12, arg6 + -28 + class67.field1272);
                }
            }
        }
        field1329++;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class70() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V")
    public static final void method409(int arg0) {
        field1337++;
        if (class88.field1598 == 0 || class88.field1598 == 5) {
            return;
        }
        try {
            if ((++class35.field616) > 2000) {
                if (class17.field298 != null) {
                    class17.field298.method1682(arg0 - 3);
                    class17.field298 = null;
                }
                if (class116.field2060 >= 1) {
                    class105.field1857 = -5;
                    class88.field1598 = 0;
                    return;
                }
                class35.field616 = 0;
                class88.field1598 = 1;
                if (class92.field1656 == class266.field4778) {
                    class266.field4778 = class209.field3843;
                } else {
                    class266.field4778 = class92.field1656;
                }
                class116.field2060++;
            }
            if (class88.field1598 == 1) {
                class126.field2233 = class4.field62.method461(class229.field4194, class266.field4778, (byte) -46);
                class88.field1598 = 2;
            }
            if (class88.field1598 == 2) {
                if (class126.field2233.field3241 == 2) {
                    throw new IOException();
                }
                if (class126.field2233.field3241 != 1) {
                    return;
                }
                class17.field298 = new class255((Socket) class126.field2233.field3239, class4.field62);
                class126.field2233 = null;
                long var1 = class194.field3594 = class21.field341.method874(arg0 ^ 0x3);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class285.field5010.field3487 = 0;
                class285.field5010.method1276(844519173, 14);
                class285.field5010.method1276(arg0 ^ 0x32565701, var3);
                class17.field298.method1685(class285.field5010.field3465, 2, false, 0);
                if (class185.field3366 != null) {
                    class185.field3366.method1647(0);
                }
                if (class231.field4232 != null) {
                    class231.field4232.method1647(0);
                }
                int var4 = class17.field298.method1679(false);
                if (class185.field3366 != null) {
                    class185.field3366.method1647(0);
                }
                if (class231.field4232 != null) {
                    class231.field4232.method1647(0);
                }
                if (var4 != 0) {
                    class88.field1598 = 0;
                    class105.field1857 = var4;
                    class17.field298.method1682(1);
                    class17.field298 = null;
                    return;
                }
                class88.field1598 = 3;
            }
            if (class88.field1598 == 3) {
                if (class17.field298.method1681((byte) -122) < 8) {
                    return;
                }
                class17.field298.method1684(8, 115, 0, class161.field2902.field3465);
                class161.field2902.field3487 = 0;
                class262.field4674 = class161.field2902.method1267((byte) 102);
                class285.field5010.field3487 = 0;
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class262.field4674 >> 32), (int) class262.field4674 };
                class285.field5010.method1276(844519173, 10);
                class285.field5010.method1280(-113, var5[0]);
                class285.field5010.method1280(-127, var5[1]);
                class285.field5010.method1280(-124, var5[2]);
                class285.field5010.method1280(-114, var5[3]);
                class285.field5010.method1243(class21.field341.method874(7), 72);
                class285.field5010.method1255(class21.field331, (byte) 0);
                class285.field5010.method1242(class51.field1012, 0, class42.field703);
                class24.field415.field3487 = 0;
                if (class147.field2652 == 40) {
                    class24.field415.method1276(844519173, 18);
                } else {
                    class24.field415.method1276(844519173, 16);
                }
                class24.field415.method1278(159 - (-class285.field5010.field3487 - class76.method436(100, class173.field3104)), (byte) 52);
                class24.field415.method1280(-128, 522);
                class24.field415.method1276(844519173, class273.field4866);
                class24.field415.method1276(844519173, class112.field1971 ? 1 : 0);
                class24.field415.method1276(844519173, 0);
                class24.field415.method1276(arg0 + 844519169, class69.method399(105));
                class24.field415.method1278(class10.field222, (byte) 125);
                class24.field415.method1278(class269.field4820, (byte) 66);
                class24.field415.method1276(arg0 ^ 0x32565701, class127.field2244);
                class164.method1080(class24.field415, (byte) -78);
                class24.field415.method1255(class173.field3104, (byte) 0);
                class24.field415.method1280(-122, class188.field3414);
                class24.field415.method1280(-125, class65.method368((byte) -24));
                class49.field949 = true;
                class24.field415.method1278(class104.field1825, (byte) 116);
                class24.field415.method1280(-118, class143.field2566.method57(true));
                class24.field415.method1280(arg0 - 119, class31.field488.method57(true));
                class24.field415.method1280(-128, class134.field2359.method57(true));
                class24.field415.method1280(arg0 - 116, class132.field2321.method57(true));
                class24.field415.method1280(arg0 - 127, class89.field1614.method57(true));
                class24.field415.method1280(-118, class57.field1110.method57(true));
                class24.field415.method1280(-124, class278.field4911.method57(true));
                class24.field415.method1280(arg0 - 128, class109.field1915.method57(true));
                class24.field415.method1280(-114, class140.field2439.method57(true));
                class24.field415.method1280(-115, class266.field4777.method57(true));
                class24.field415.method1280(arg0 ^ 0xFFFFFF81, class109.field1911.method57(true));
                class24.field415.method1280(-114, class14.field254.method57(true));
                class24.field415.method1280(-117, class66.field1244.method57(true));
                class24.field415.method1280(-115, class171.field3063.method57(true));
                class24.field415.method1280(-125, class116.field2036.method57(true));
                class24.field415.method1280(arg0 ^ 0xFFFFFF8D, class66.field1230.method57(true));
                class24.field415.method1280(-112, class50.field1001.method57(true));
                class24.field415.method1280(-127, class234.field4245.method57(true));
                class24.field415.method1280(arg0 - 129, class31.field487.method57(true));
                class24.field415.method1280(arg0 ^ 0xFFFFFF8B, class49.field952.method57(true));
                class24.field415.method1280(arg0 - 122, class32.field538.method57(true));
                class24.field415.method1280(-119, class54.field1047.method57(true));
                class24.field415.method1280(-126, class194.field3609.method57(true));
                class24.field415.method1280(-119, class227.field4099.method57(true));
                class24.field415.method1280(-115, class185.field3364.method57(true));
                class24.field415.method1280(-115, class229.field4192.method57(true));
                class24.field415.method1280(-123, class17.field297.method57(true));
                class24.field415.method1280(-121, class235.field4291.method57(true));
                class24.field415.method1264(class285.field5010.field3465, 0, class285.field5010.field3487, 51314336);
                class17.field298.method1685(class24.field415.field3465, class24.field415.field3487, false, 0);
                class285.field5010.method801(var5, (byte) -118);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class161.field2902.method801(var5, (byte) -97);
                class88.field1598 = 4;
            }
            if (class88.field1598 == arg0) {
                if (class17.field298.method1681((byte) -122) < 1) {
                    return;
                }
                int var7 = class17.field298.method1679(false);
                if (var7 == 21) {
                    class88.field1598 = 7;
                } else if (var7 == 29) {
                    class88.field1598 = 10;
                } else if (var7 == 1) {
                    class105.field1857 = var7;
                    class88.field1598 = 5;
                    return;
                } else if (var7 == 2) {
                    class88.field1598 = 8;
                } else if (var7 == 15) {
                    class105.field1857 = var7;
                    class88.field1598 = 0;
                    return;
                } else if (var7 == 23 && class116.field2060 < 1) {
                    class35.field616 = 0;
                    class88.field1598 = 1;
                    class116.field2060++;
                    class17.field298.method1682(1);
                    class17.field298 = null;
                    return;
                } else {
                    class105.field1857 = var7;
                    class88.field1598 = 0;
                    class17.field298.method1682(1);
                    class17.field298 = null;
                    return;
                }
            }
            if (class88.field1598 == 6) {
                class285.field5010.field3487 = 0;
                class285.field5010.method799(103, 17);
                class17.field298.method1685(class285.field5010.field3465, class285.field5010.field3487, false, 0);
                class88.field1598 = 4;
            } else if (class88.field1598 == 7) {
                if (class17.field298.method1681((byte) -122) >= 1) {
                    class223.field4047 = class17.field298.method1679(false) * 60 + 180;
                    class88.field1598 = 0;
                    class105.field1857 = 21;
                    class17.field298.method1682(arg0 ^ 0x5);
                    class17.field298 = null;
                }
            } else if (class88.field1598 != 10) {
                if (class88.field1598 == 8) {
                    if (class17.field298.method1681((byte) -123) < 14) {
                        return;
                    }
                    class17.field298.method1684(14, -66, 0, class161.field2902.field3465);
                    class161.field2902.field3487 = 0;
                    class162.field2914 = class161.field2902.method1265(122);
                    class42.field709 = class161.field2902.method1265(arg0 + 118);
                    class106.field1875 = class161.field2902.method1265(arg0 ^ 0x75) == 1;
                    class71.field1346 = class161.field2902.method1265(123) == 1;
                    class63.field1195 = class161.field2902.method1265(arg0 ^ 0x7A) == 1;
                    class267.field4789 = class161.field2902.method1265(113) == 1;
                    class192.field3538 = class161.field2902.method1265(arg0 ^ 0x77) == 1;
                    class134.field2352 = class161.field2902.method1275(128);
                    class168.field2998 = class161.field2902.method1265(arg0 ^ 0x70) == 1;
                    class110.field1943 = class161.field2902.method1265(115) == 1;
                    class281.method1846(class110.field1943, 23757);
                    class254.method1678((byte) -84, class110.field1943);
                    if (!class112.field1971) {
                        if ((!class106.field1875 || class63.field1195) && !class168.field2998) {
                            try {
                                class62.field1178.method905(class4.field62.field1469, arg0 - 4);
                            } catch (Throwable var8) {
                            }
                        } else {
                            try {
                                class202.field3677.method905(class4.field62.field1469, 0);
                            } catch (Throwable var9) {
                            }
                        }
                    }
                    class53.field1038 = class161.field2902.method807((byte) 106);
                    class42.field708 = class161.field2902.method1275(128);
                    class88.field1598 = 9;
                }
                if (class88.field1598 == 9 && class17.field298.method1681((byte) -123) >= class42.field708) {
                    class161.field2902.field3487 = 0;
                    class17.field298.method1684(class42.field708, -37, 0, class161.field2902.field3465);
                    class105.field1857 = 2;
                    class88.field1598 = 0;
                    class251.method1667(16);
                    class66.field1233 = -1;
                    class263.method1755(-1, false);
                    class53.field1038 = -1;
                }
            } else if (class17.field298.method1681((byte) -123) >= 1) {
                class27.field454 = class17.field298.method1679(false);
                class105.field1857 = 29;
                class88.field1598 = 0;
                class17.field298.method1682(arg0 - 3);
                class17.field298 = null;
            }
        } catch (IOException var10) {
            if (class17.field298 != null) {
                class17.field298.method1682(1);
                class17.field298 = null;
            }
            if (class116.field2060 < 1) {
                if (class92.field1656 == class266.field4778) {
                    class266.field4778 = class209.field3843;
                } else {
                    class266.field4778 = class92.field1656;
                }
                class116.field2060++;
                class35.field616 = 0;
                class88.field1598 = 1;
            } else {
                class88.field1598 = 0;
                class105.field1857 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        field1331++;
        if (arg0 > -13) {
            method407(-61);
        }
        return class3.field43;
    }
}
