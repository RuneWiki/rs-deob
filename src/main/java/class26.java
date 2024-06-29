import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class26 {

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "J")
    public long field379 = 0L;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "[I")
    public static int[] field393 = new int[2048];

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field397 = -1;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lgf;")
    public class7 field381;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIZI)V", line = 12)
    public static final void method177(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (!arg4) {
            field377 = -60;
        }
        for (int var6 = arg2; var6 <= arg3; var6++) {
            class114.method742(30197, arg5, class97.field1636[var6], arg1, arg0);
        }
        field387++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 51)
    public static void method178(int arg0) {
        field393 = null;
        int var1 = 64 % ((-arg0 - 33) / 62);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)Z", line = 62)
    public static final boolean method179(int arg0, boolean arg1) {
        if (arg1) {
            field385++;
            return (arg0 >> 31 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 77)
    public static final void method180(int arg0) {
        field396++;
        if (class299.field5056 == 0 || class299.field5056 == 5) {
            return;
        }
        try {
            if (arg0 != 2) {
                return;
            }
            if ((++class7.field74) > 2000) {
                if (class263.field4484 != null) {
                    class263.field4484.method1282(true);
                    class263.field4484 = null;
                }
                if (class153.field2520 >= 1) {
                    class255.field4302 = -5;
                    class299.field5056 = 0;
                    return;
                }
                class299.field5056 = 1;
                if (class53.field714 == class13.field138) {
                    class53.field714 = class54.field721;
                } else {
                    class53.field714 = class13.field138;
                }
                class7.field74 = 0;
                class153.field2520++;
            }
            if (class299.field5056 == 1) {
                class145.field2400 = class150.field2460.method1692(class62.field866, class53.field714, 108);
                class299.field5056 = 2;
            }
            if (class299.field5056 == 2) {
                if (class145.field2400.field5293 == 2) {
                    throw new IOException();
                }
                if (class145.field2400.field5293 != 1) {
                    return;
                }
                class263.field4484 = new class199((Socket) class145.field2400.field5296, class150.field2460);
                class145.field2400 = null;
                long var1 = class184.field3174 = class213.field3620.method1929((byte) -24);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class228.field3831.field3905 = 0;
                class228.field3831.method1499(true, 14);
                class228.field3831.method1499(true, var3);
                class263.field4484.method1278(2, class228.field3831.field3879, 0, (byte) -37);
                if (class60.field827 != null) {
                    class60.field827.method1473(arg0 ^ 0x854);
                }
                if (class155.field2561 != null) {
                    class155.field2561.method1473(2134);
                }
                int var4 = class263.field4484.method1280((byte) 63);
                if (class60.field827 != null) {
                    class60.field827.method1473(2134);
                }
                if (class155.field2561 != null) {
                    class155.field2561.method1473(2134);
                }
                if (var4 != 0) {
                    class299.field5056 = 0;
                    class255.field4302 = var4;
                    class263.field4484.method1282(true);
                    class263.field4484 = null;
                    return;
                }
                class299.field5056 = 3;
            }
            if (class299.field5056 == 3) {
                if (class263.field4484.method1284(-1) < 8) {
                    return;
                }
                class263.field4484.method1279(0, class262.field4462.field3879, 8, -96);
                int[] var5 = new int[4];
                class262.field4462.field3905 = 0;
                class228.field3832 = class262.field4462.method1495((byte) 79);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class228.field3831.field3905 = 0;
                var5[2] = (int) (class228.field3832 >> 32);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class228.field3832;
                class228.field3831.method1499(true, 10);
                class228.field3831.method1515(var5[0], 108);
                class228.field3831.method1515(var5[1], 78);
                class228.field3831.method1515(var5[2], arg0 ^ 0x31);
                class228.field3831.method1515(var5[3], arg0 ^ 0x62);
                class228.field3831.method1544((byte) 8, class213.field3620.method1929((byte) -24));
                class228.field3831.method1520(class213.field3626, 89);
                class228.field3831.method1500(class6.field53, class190.field3245, -108);
                class241.field4068.field3905 = 0;
                if (class175.field3019 == 40) {
                    class241.field4068.method1499(true, 18);
                } else {
                    class241.field4068.method1499(true, 16);
                }
                class241.field4068.method1510((byte) 45, class228.field3831.field3905 + class65.method415(-49, class201.field3436) + 153);
                class241.field4068.method1515(511, 124);
                class241.field4068.method1499(true, class27.field403);
                class241.field4068.method1499(true, 1);
                class241.field4068.method1499(true, class262.method1773((byte) 99));
                class241.field4068.method1510((byte) 92, class115.field1945);
                class241.field4068.method1510((byte) 56, class48.field655);
                class280.method1869(class241.field4068, arg0 ^ 0xFFFFFFC2);
                class241.field4068.method1520(class201.field3436, 111);
                class241.field4068.method1515(class303.field5117, 106);
                class241.field4068.method1515(class79.method521(arg0 - 2), 85);
                class202.field3450 = true;
                class241.field4068.method1510((byte) 22, class245.field4173);
                class241.field4068.method1515(class63.field878.field2891, 68);
                class241.field4068.method1515(class259.field4411.field2891, 113);
                class241.field4068.method1515(class74.field1291.field2891, 84);
                class241.field4068.method1515(class282.field4772.field2891, 106);
                class241.field4068.method1515(class103.field1741.field2891, 79);
                class241.field4068.method1515(class61.field849.field2891, 110);
                class241.field4068.method1515(class109.field1843.field2891, arg0 + 50);
                class241.field4068.method1515(class169.field2832.field2891, arg0 ^ 0x61);
                class241.field4068.method1515(class69.field1067.field2891, arg0 + 62);
                class241.field4068.method1515(class115.field1928.field2891, arg0 ^ 0x36);
                class241.field4068.method1515(class155.field2558.field2891, 54);
                class241.field4068.method1515(class210.field3580.field2891, 90);
                class241.field4068.method1515(class227.field3821.field2891, arg0 ^ 0x6D);
                class241.field4068.method1515(class94.field1587.field2891, 106);
                class241.field4068.method1515(class234.field3945.field2891, arg0 ^ 0x37);
                class241.field4068.method1515(class196.field3354.field2891, 89);
                class241.field4068.method1515(class144.field2388.field2891, 120);
                class241.field4068.method1515(class22.field336.field2891, 108);
                class241.field4068.method1515(class262.field4468.field2891, arg0 ^ 0x54);
                class241.field4068.method1515(class12.field111.field2891, 97);
                class241.field4068.method1515(class228.field3842.field2891, 66);
                class241.field4068.method1515(class301.field5094.field2891, arg0 + 109);
                class241.field4068.method1515(class183.field3154.field2891, 54);
                class241.field4068.method1515(class232.field3931.field2891, arg0 ^ 0x41);
                class241.field4068.method1515(class231.field3916.field2891, 54);
                class241.field4068.method1515(class175.field3022.field2891, 112);
                class241.field4068.method1515(class221.field3720.field2891, arg0 ^ 0x64);
                class241.field4068.method1530(0, class228.field3831.field3905, true, class228.field3831.field3879);
                class263.field4484.method1278(class241.field4068.field3905, class241.field4068.field3879, 0, (byte) -37);
                class228.field3831.method626(var5, (byte) 115);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class262.field4462.method626(var5, (byte) 113);
                class299.field5056 = 4;
            }
            if (class299.field5056 == 4) {
                if (class263.field4484.method1284(arg0 ^ 0xFFFFFFFD) < 1) {
                    return;
                }
                int var7 = class263.field4484.method1280((byte) 63);
                if (var7 == 21) {
                    class299.field5056 = 7;
                } else if (var7 == 29) {
                    class299.field5056 = 10;
                } else if (var7 == 1) {
                    class255.field4302 = var7;
                    class299.field5056 = 5;
                    return;
                } else if (var7 == 2) {
                    class299.field5056 = 8;
                } else if (var7 == 15) {
                    class255.field4302 = var7;
                    class299.field5056 = 0;
                    return;
                } else if (var7 == 23 && class153.field2520 < 1) {
                    class7.field74 = 0;
                    class153.field2520++;
                    class299.field5056 = 1;
                    class263.field4484.method1282(true);
                    class263.field4484 = null;
                    return;
                } else {
                    class255.field4302 = var7;
                    class299.field5056 = 0;
                    class263.field4484.method1282(true);
                    class263.field4484 = null;
                    return;
                }
            }
            if (class299.field5056 == 6) {
                class228.field3831.field3905 = 0;
                class228.field3831.method621(17, 8);
                class263.field4484.method1278(class228.field3831.field3905, class228.field3831.field3879, 0, (byte) -37);
                class299.field5056 = 4;
                return;
            }
            if (class299.field5056 == 7) {
                if (class263.field4484.method1284(-1) < 1) {
                    return;
                }
                class290.field4911 = (class263.field4484.method1280((byte) 63) + 3) * 60;
                class255.field4302 = 21;
                class299.field5056 = 0;
                class263.field4484.method1282(true);
                class263.field4484 = null;
                return;
            }
            if (class299.field5056 == 10) {
                if (class263.field4484.method1284(-1) < 1) {
                    return;
                }
                class72.field1260 = class263.field4484.method1280((byte) 63);
                class299.field5056 = 0;
                class255.field4302 = 29;
                class263.field4484.method1282(true);
                class263.field4484 = null;
                return;
            }
            if (class299.field5056 == 8) {
                if (class263.field4484.method1284(-1) < 11) {
                    return;
                }
                class263.field4484.method1279(0, class262.field4462.field3879, 11, arg0 - 125);
                class262.field4462.field3905 = 0;
                class299.field5067 = class262.field4462.method1535((byte) 103);
                class138.field2299 = class262.field4462.method1535((byte) 97);
                class68.field964 = class262.field4462.method1535((byte) 97);
                if (class68.field964 == 1) {
                    try {
                        class217.field3684.method1908(class150.field2460.field4272, (byte) -107);
                    } catch (Throwable var12) {
                    }
                } else {
                    try {
                        class269.field4535.method1908(class150.field2460.field4272, (byte) -107);
                    } catch (Throwable var11) {
                    }
                }
                class222.field3732 = class262.field4462.method1535((byte) 97);
                class33.field494 = class262.field4462.method1535((byte) 113) == 1;
                class213.field3622 = class262.field4462.method1496(true);
                class217.field3682 = class262.field4462.method1535((byte) 75);
                class163.field2688 = class262.field4462.method623(-90);
                class260.field4419 = class262.field4462.method1496(true);
                class299.field5056 = 9;
            }
            if (class299.field5056 == 9) {
                if (class263.field4484.method1284(-1) >= class260.field4419) {
                    class262.field4462.field3905 = 0;
                    class263.field4484.method1279(0, class262.field4462.field3879, class260.field4419, -88);
                    class255.field4302 = 2;
                    class299.field5056 = 0;
                    class259.method1751(arg0 ^ 0x2);
                    class184.field3170 = -1;
                    class63.method407(false, 8);
                    class163.field2688 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var13) {
            if (class263.field4484 != null) {
                class263.field4484.method1282(true);
                class263.field4484 = null;
            }
            if (class153.field2520 >= 1) {
                class255.field4302 = -4;
                class299.field5056 = 0;
            } else {
                if (class53.field714 == class13.field138) {
                    class53.field714 = class54.field721;
                } else {
                    class53.field714 = class13.field138;
                }
                class7.field74 = 0;
                class153.field2520++;
                class299.field5056 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V", line = 440)
    public static final void method181(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class269.field4551 <= arg0 && arg0 <= class166.field2765) {
            int var5 = class44.method263(class247.field4220, arg4, (byte) -103, class217.field3677);
            int var6 = class44.method263(class247.field4220, arg2, (byte) -84, class217.field3677);
            class16.method88(arg3, arg1 ^ 0x4D2F, arg0, var6, var5);
        }
        field389++;
        if (arg1 != -14360) {
            field377 = -48;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lek;Lek;B)V", line = 477)
    public static final void method182(class172 arg0, class172 arg1, byte arg2) {
        if (arg2 <= -55) {
            field391++;
            class46.field623 = arg0;
            class162.field2667 = arg1;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLek;II)Z", line = 490)
    public static final boolean method183(boolean arg0, class172 arg1, int arg2, int arg3) {
        field384++;
        if (!arg0) {
            field393 = (int[]) null;
        }
        byte[] var4 = arg1.method1107(arg2, arg3, 126);
        if (var4 == null) {
            return false;
        } else {
            class190.method1236(var4, -118);
            return true;
        }
    }
}
