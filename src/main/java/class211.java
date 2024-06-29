import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class211 {

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field3872 = 0;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field3875 = 128;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field3876 = 0;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()I")
    public abstract int method93();

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "()Z")
    public boolean method444() {
        field3878++;
        return false;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lgl;IIIZ)V")
    public void method432(class211 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3873++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static final void method1490(int arg0) {
        field3874++;
        if (class68.field1239 == 0 || class68.field1239 == 5) {
            return;
        }
        try {
            if ((++class82.field1513) > 2000) {
                if (class92.field1625 != null) {
                    class92.field1625.method947((byte) 41);
                    class92.field1625 = null;
                }
                if (class153.field2689 >= 1) {
                    class68.field1239 = 0;
                    class242.field4371 = -5;
                    return;
                }
                class82.field1513 = 0;
                if (class283.field5082 == class137.field2390) {
                    class137.field2390 = class148.field2608;
                } else {
                    class137.field2390 = class283.field5082;
                }
                class68.field1239 = 1;
                class153.field2689++;
            }
            if (class68.field1239 == 1) {
                class57.field957 = class169.field2967.method1959((byte) -69, class137.field2390, class157.field2787);
                class68.field1239 = 2;
            }
            if (class68.field1239 == 2) {
                if (class57.field957.field290 == 2) {
                    throw new IOException();
                }
                if (class57.field957.field290 != 1) {
                    return;
                }
                class92.field1625 = new class130((Socket) class57.field957.field292, class169.field2967);
                class57.field957 = null;
                long var1 = class167.field2946 = class178.field3146.method679((byte) 75);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class285.field5105.field5027 = 0;
                class285.field5105.method1916(14, 105);
                class285.field5105.method1916(var3, arg0 ^ 0x4223);
                class92.field1625.method945(class285.field5105.field5011, (byte) 127, 0, 2);
                if (class237.field4235 != null) {
                    class237.field4235.method1714((byte) 91);
                }
                if (class11.field155 != null) {
                    class11.field155.method1714((byte) 91);
                }
                int var4 = class92.field1625.method951(arg0 - 16984);
                if (class237.field4235 != null) {
                    class237.field4235.method1714((byte) 91);
                }
                if (class11.field155 != null) {
                    class11.field155.method1714((byte) 91);
                }
                if (var4 != 0) {
                    class68.field1239 = 0;
                    class242.field4371 = var4;
                    class92.field1625.method947((byte) 39);
                    class92.field1625 = null;
                    return;
                }
                class68.field1239 = 3;
            }
            if (class68.field1239 == 3) {
                if (class92.field1625.method950(false) < 8) {
                    return;
                }
                class92.field1625.method946(class250.field4504.field5011, 8, 0, 1);
                int[] var5 = new int[4];
                class250.field4504.field5027 = 0;
                class263.field4685 = class250.field4504.method1873((byte) 6);
                var5[3] = (int) class263.field4685;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class285.field5105.field5027 = 0;
                var5[2] = (int) (class263.field4685 >> 32);
                class285.field5105.method1916(10, 72);
                class285.field5105.method1886(var5[0], 2);
                class285.field5105.method1886(var5[1], arg0 ^ 0x425A);
                class285.field5105.method1886(var5[2], 2);
                class285.field5105.method1886(var5[3], 2);
                class285.field5105.method1882(class178.field3146.method679((byte) 88), (byte) -126);
                class285.field5105.method1898((byte) 123, class178.field3147);
                class285.field5105.method1900(class3.field22, 12073, class155.field2707);
                class145.field2539.field5027 = 0;
                if (class199.field3609 == 40) {
                    class145.field2539.method1916(18, 121);
                } else {
                    class145.field2539.method1916(16, 106);
                }
                class145.field2539.method1908(-90, class285.field5105.field5027 + class80.method555(0, class123.field2197) + 159);
                class145.field2539.method1886(531, 2);
                class145.field2539.method1916(class9.field132, 75);
                class145.field2539.method1916(class128.field2255 ? 1 : 0, 79);
                class145.field2539.method1916(0, 77);
                class145.field2539.method1916(class55.method311(false), arg0 ^ 0x422C);
                class145.field2539.method1908(-118, class150.field2629);
                class145.field2539.method1908(arg0 - 17076, class169.field2968);
                class145.field2539.method1916(class119.field2121, 81);
                class52.method286((byte) 25, class145.field2539);
                class145.field2539.method1898((byte) 124, class123.field2197);
                class145.field2539.method1886(class276.field4943, 2);
                class145.field2539.method1886(class167.method1207(arg0 - 16984), arg0 ^ 0x425A);
                class193.field3525 = true;
                class145.field2539.method1908(-79, class180.field3177);
                class145.field2539.method1886(class246.field4438.method1284((byte) -87), 2);
                class145.field2539.method1886(class131.field2321.method1284((byte) -119), arg0 - 16982);
                class145.field2539.method1886(class226.field4049.method1284((byte) -103), 2);
                class145.field2539.method1886(class229.field4097.method1284((byte) -22), arg0 ^ 0x425A);
                class145.field2539.method1886(class144.field2487.method1284((byte) -95), 2);
                class145.field2539.method1886(class1.field11.method1284((byte) -97), 2);
                class145.field2539.method1886(class189.field3468.method1284((byte) -37), arg0 ^ 0x425A);
                class145.field2539.method1886(class185.field3399.method1284((byte) -69), 2);
                class145.field2539.method1886(class246.field4436.method1284((byte) -116), 2);
                class145.field2539.method1886(class105.field1817.method1284((byte) -104), 2);
                class145.field2539.method1886(class162.field2870.method1284((byte) -16), arg0 - 16982);
                class145.field2539.method1886(class232.field4144.method1284((byte) -69), 2);
                class145.field2539.method1886(class48.field773.method1284((byte) -97), 2);
                class145.field2539.method1886(class136.field2378.method1284((byte) -61), 2);
                class145.field2539.method1886(class284.field5089.method1284((byte) -25), 2);
                class145.field2539.method1886(class73.field1312.method1284((byte) -18), 2);
                class145.field2539.method1886(class199.field3616.method1284((byte) -109), arg0 - 16982);
                class145.field2539.method1886(class18.field236.method1284((byte) -94), 2);
                class145.field2539.method1886(class169.field2969.method1284((byte) -124), 2);
                class145.field2539.method1886(class58.field989.method1284((byte) -88), 2);
                class145.field2539.method1886(class269.field4810.method1284((byte) -114), 2);
                class145.field2539.method1886(class58.field982.method1284((byte) -109), 2);
                class145.field2539.method1886(class229.field4105.method1284((byte) -94), 2);
                class145.field2539.method1886(class148.field2609.method1284((byte) -103), 2);
                class145.field2539.method1886(class102.field1771.method1284((byte) -27), arg0 - 16982);
                class145.field2539.method1886(class214.field3915.method1284((byte) -44), arg0 - 16982);
                class145.field2539.method1886(class218.field3977.method1284((byte) -54), arg0 - 16982);
                class145.field2539.method1886(class272.field4830.method1284((byte) -61), 2);
                class145.field2539.method1870(0, class285.field5105.field5011, class285.field5105.field5027, 41);
                class92.field1625.method945(class145.field2539.field5011, (byte) 127, 0, class145.field2539.field5027);
                class285.field5105.method1564(false, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class250.field4504.method1564(false, var5);
                class68.field1239 = 4;
            }
            if (class68.field1239 == 4) {
                if (class92.field1625.method950(false) < 1) {
                    return;
                }
                int var7 = class92.field1625.method951(0);
                if (var7 == 21) {
                    class68.field1239 = 7;
                } else if (var7 == 29) {
                    class68.field1239 = 10;
                } else if (var7 == 1) {
                    class68.field1239 = 5;
                    class242.field4371 = var7;
                    return;
                } else if (var7 == 2) {
                    class68.field1239 = 8;
                } else if (var7 == 15) {
                    class242.field4371 = var7;
                    class68.field1239 = 0;
                    return;
                } else if (var7 == 23 && class153.field2689 < 1) {
                    class68.field1239 = 1;
                    class82.field1513 = 0;
                    class153.field2689++;
                    class92.field1625.method947((byte) 70);
                    class92.field1625 = null;
                    return;
                } else {
                    class242.field4371 = var7;
                    class68.field1239 = 0;
                    class92.field1625.method947((byte) 107);
                    class92.field1625 = null;
                    return;
                }
            }
            if (class68.field1239 == 6) {
                class285.field5105.field5027 = 0;
                class285.field5105.method1568(17, (byte) 103);
                class92.field1625.method945(class285.field5105.field5011, (byte) 127, 0, class285.field5105.field5027);
                class68.field1239 = 4;
            } else if (class68.field1239 == 7) {
                if (class92.field1625.method950(false) >= 1) {
                    class283.field5081 = class92.field1625.method951(0) * 60 + 180;
                    class242.field4371 = 21;
                    class68.field1239 = 0;
                    class92.field1625.method947((byte) 18);
                    class92.field1625 = null;
                }
            } else if (class68.field1239 != 10) {
                if (class68.field1239 == 8) {
                    if (class92.field1625.method950(false) < 14) {
                        return;
                    }
                    class92.field1625.method946(class250.field4504.field5011, 14, 0, 1);
                    class250.field4504.field5027 = 0;
                    class285.field5109 = class250.field4504.method1907(16832);
                    class97.field1730 = class250.field4504.method1907(arg0 ^ 0x398);
                    class3.field36 = class250.field4504.method1907(16832) == 1;
                    class67.field1224 = class250.field4504.method1907(16832) == 1;
                    class47.field759 = class250.field4504.method1907(16832) == 1;
                    class19.field259 = class250.field4504.method1907(arg0 - 152) == 1;
                    class167.field2950 = class250.field4504.method1907(16832) == 1;
                    class141.field2446 = class250.field4504.method1891(-118);
                    class196.field3593 = class250.field4504.method1907(16832) == 1;
                    class144.field2494 = class250.field4504.method1907(16832) == 1;
                    class125.method918(class144.field2494, arg0 - 16899);
                    class206.method1456(class144.field2494, arg0 ^ 0xF98E7E1E);
                    if (!class128.field2255) {
                        if ((!class3.field36 || class47.field759) && !class196.field3593) {
                            try {
                                class129.field2268.method646(class169.field2967.field5113, 0);
                            } catch (Throwable var8) {
                            }
                        } else {
                            try {
                                class178.field3122.method646(class169.field2967.field5113, 0);
                            } catch (Throwable var9) {
                            }
                        }
                    }
                    class111.field1888 = class250.field4504.method1572(255);
                    class72.field1300 = class250.field4504.method1891(-119);
                    class68.field1239 = 9;
                }
                if (arg0 != 16984) {
                    method1492(47, -93, (class240) null, 14, (byte) 87);
                }
                if (class68.field1239 == 9 && class92.field1625.method950(false) >= class72.field1300) {
                    class250.field4504.field5027 = 0;
                    class92.field1625.method946(class250.field4504.field5011, class72.field1300, 0, arg0 - 16983);
                    class242.field4371 = 2;
                    class68.field1239 = 0;
                    class247.method1680((byte) -41);
                    class212.field3894 = -1;
                    class31.method180(false, -21895);
                    class111.field1888 = -1;
                }
            } else if (class92.field1625.method950(false) >= 1) {
                class250.field4501 = class92.field1625.method951(0);
                class242.field4371 = 29;
                class68.field1239 = 0;
                class92.field1625.method947((byte) 107);
                class92.field1625 = null;
            }
        } catch (IOException var10) {
            if (class92.field1625 != null) {
                class92.field1625.method947((byte) 41);
                class92.field1625 = null;
            }
            if (class153.field2689 >= 1) {
                class242.field4371 = -4;
                class68.field1239 = 0;
            } else {
                class82.field1513 = 0;
                if (class283.field5082 == class137.field2390) {
                    class137.field2390 = class148.field2608;
                } else {
                    class137.field2390 = class283.field5082;
                }
                class153.field2689++;
                class68.field1239 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Lgl;")
    public class211 method437(int arg0, int arg1, int arg2) {
        field3877++;
        return this;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIIIJILod;)V")
    public abstract void method106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class91 arg10);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
    public static final void method1491(int arg0, int arg1) {
        if (arg0 != 29568) {
            method1492(-128, 48, (class240) null, 13, (byte) 47);
        }
        class14.field168 = -1;
        field3871++;
        class154.field2700 = arg1;
        class14.field168 = -1;
        class287.method1967(82);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILfl;IB)V")
    public static final void method1492(int arg0, int arg1, class240 arg2, int arg3, byte arg4) {
        field3879++;
        if (arg4 > -123) {
            return;
        }
        for (class43 var5 = (class43) class70.field1278.method1151(122); var5 != null; var5 = (class43) class70.field1278.method1159(56)) {
            if (var5.field692 == arg3 && (arg0 * 128) == var5.field680 && (arg1 * 128) == var5.field674 && var5.field685.field4318 == arg2.field4318) {
                if (var5.field671 != null) {
                    class35.field543.method1657(var5.field671);
                    var5.field671 = null;
                }
                if (var5.field690 != null) {
                    class35.field543.method1657(var5.field690);
                    var5.field690 = null;
                }
                var5.method1544((byte) -37);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V")
    public abstract void method95(int arg0, int arg1, int arg2, int arg3, int arg4);
}
