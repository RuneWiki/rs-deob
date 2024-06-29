import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class46 extends class228 {

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "Loa;")
    public static class99 field778 = class221.method1463(2844, "<img=1>");

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "[[S")
    public static short[][] field781 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class46() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
    public static final void method336(int arg0) {
        ++field779;
        if (~class78.field1386 != -1 && ~class78.field1386 != -6) {
            try {
                if (++class57.field966 > 2000) {
                    if (class133.field2322 != null) {
                        class133.field2322.method54((byte) 126);
                        class133.field2322 = null;
                    }
                    if (class207.field3591 >= 1) {
                        class78.field1386 = 0;
                        class65.field1107 = -5;
                        return;
                    }
                    ++class207.field3591;
                    if (class7.field63 != class165.field2898) {
                        class7.field63 = class165.field2898;
                    } else {
                        class7.field63 = class28.field528;
                    }
                    class78.field1386 = 1;
                    class57.field966 = 0;
                }
                if (~class78.field1386 == -2) {
                    class115.field2038 = class24.field368.method586(class196.field3420, arg0 ^ 20886, class7.field63);
                    class78.field1386 = 2;
                }
                if (~class78.field1386 == -3) {
                    if (class115.field2038.field4844 == 2) {
                        throw new IOException();
                    }
                    if (~class115.field2038.field4844 != -2) {
                        return;
                    }
                    class133.field2322 = new class7((Socket) class115.field2038.field4843, class24.field368);
                    class115.field2038 = null;
                    long var1 = class86.field1486 = class20.field232.method697(-23666);
                    class131.field2277.field4587 = 0;
                    class131.field2277.method1691(14, (byte) 53);
                    int var3 = (int) (31L & var1 >> 16);
                    class131.field2277.method1691(var3, (byte) 53);
                    class133.field2322.method55(class131.field2277.field4619, (byte) -70, 0, 2);
                    if (class226.field3917 != null) {
                        class226.field3917.method1367(arg0 + -20939);
                    }
                    if (class125.field2204 != null) {
                        class125.field2204.method1367(0);
                    }
                    int var4 = class133.field2322.method57(112);
                    if (class226.field3917 != null) {
                        class226.field3917.method1367(0);
                    }
                    if (class125.field2204 != null) {
                        class125.field2204.method1367(0);
                    }
                    if (var4 != 0) {
                        class78.field1386 = 0;
                        class65.field1107 = var4;
                        class133.field2322.method54((byte) 124);
                        class133.field2322 = null;
                        return;
                    }
                    class78.field1386 = 3;
                }
                if (~class78.field1386 == -4) {
                    if (~class133.field2322.method62(-1) > -9) {
                        return;
                    }
                    class133.field2322.method61(arg0 ^ -20889, class129.field2252.field4619, 0, 8);
                    int[] var5 = new int[4];
                    class129.field2252.field4587 = 0;
                    class225.field3911 = class129.field2252.method1695((byte) 69);
                    var5[1] = (int) (Math.random() * 9.9999999E7D);
                    var5[0] = (int) (Math.random() * 9.9999999E7D);
                    var5[2] = (int) (class225.field3911 >> 32);
                    class131.field2277.field4587 = 0;
                    var5[3] = (int) class225.field3911;
                    class131.field2277.method1691(10, (byte) 53);
                    class131.field2277.method1701(var5[0], 4994);
                    class131.field2277.method1701(var5[1], 4994);
                    class131.field2277.method1701(var5[2], 4994);
                    class131.field2277.method1701(var5[3], 4994);
                    class131.field2277.method1699(class20.field232.method697(arg0 + -44605), -102);
                    class131.field2277.method1725(class20.field231, arg0 + -20829);
                    class131.field2277.method1717(class124.field2170, class103.field1738, arg0 ^ 20927);
                    class112.field2020.field4587 = 0;
                    if (~class156.field2808 != -41) {
                        class112.field2020.method1691(16, (byte) 53);
                    } else {
                        class112.field2020.method1691(18, (byte) 53);
                    }
                    class112.field2020.method1745(class131.field2277.field4587 + 159 + class3.method21(class281.field4928, 20987), (byte) 5);
                    class112.field2020.method1701(524, 4994);
                    class112.field2020.method1691(class80.field1401, (byte) 53);
                    class112.field2020.method1691(!class123.field2161 ? 0 : 1, (byte) 53);
                    class112.field2020.method1691(0, (byte) 53);
                    class112.field2020.method1691(class143.method972(arg0 + -20942), (byte) 53);
                    class112.field2020.method1745(class199.field3458, (byte) 5);
                    class112.field2020.method1745(class24.field373, (byte) 5);
                    class112.field2020.method1691(class65.field1102, (byte) 53);
                    class259.method1683(class112.field2020, (byte) -110);
                    class112.field2020.method1725(class281.field4928, 109);
                    class112.field2020.method1701(class64.field1083, 4994);
                    class112.field2020.method1701(class57.method389(arg0 + 1456449592), 4994);
                    class58.field968 = true;
                    class112.field2020.method1745(class145.field2571, (byte) 5);
                    class112.field2020.method1701(class119.field2112.method1248((byte) -65), arg0 + -15945);
                    class112.field2020.method1701(class260.field4535.method1248((byte) -65), 4994);
                    class112.field2020.method1701(class208.field3604.method1248((byte) -65), 4994);
                    class112.field2020.method1701(class138.field2430.method1248((byte) -65), 4994);
                    class112.field2020.method1701(class271.field4788.method1248((byte) -65), 4994);
                    class112.field2020.method1701(class269.field4732.method1248((byte) -65), arg0 ^ 16969);
                    class112.field2020.method1701(class227.field3923.method1248((byte) -65), arg0 ^ 16969);
                    class112.field2020.method1701(class9.field74.method1248((byte) -65), 4994);
                    class112.field2020.method1701(class280.field4908.method1248((byte) -65), arg0 ^ 16969);
                    class112.field2020.method1701(class164.field2878.method1248((byte) -65), arg0 + -15945);
                    class112.field2020.method1701(class236.field4064.method1248((byte) -65), 4994);
                    class112.field2020.method1701(class242.field4199.method1248((byte) -65), 4994);
                    class112.field2020.method1701(class111.field2014.method1248((byte) -65), 4994);
                    class112.field2020.method1701(class276.field4860.method1248((byte) -65), arg0 ^ 16969);
                    class112.field2020.method1701(class118.field2101.method1248((byte) -65), arg0 ^ 16969);
                    class112.field2020.method1701(class255.field4414.method1248((byte) -65), arg0 ^ 16969);
                    class112.field2020.method1701(class21.field246.method1248((byte) -65), 4994);
                    class112.field2020.method1701(class240.field4157.method1248((byte) -65), arg0 ^ 16969);
                    class112.field2020.method1701(class185.field3277.method1248((byte) -65), arg0 ^ 16969);
                    class112.field2020.method1701(class29.field540.method1248((byte) -65), 4994);
                    class112.field2020.method1701(class169.field3019.method1248((byte) -65), 4994);
                    class112.field2020.method1701(class19.field212.method1248((byte) -65), 4994);
                    class112.field2020.method1701(class31.field563.method1248((byte) -65), 4994);
                    class112.field2020.method1701(class139.field2465.method1248((byte) -65), 4994);
                    class112.field2020.method1701(class260.field4547.method1248((byte) -65), 4994);
                    class112.field2020.method1701(class239.field4123.method1248((byte) -65), arg0 ^ 16969);
                    class112.field2020.method1701(class19.field211.method1248((byte) -65), 4994);
                    class112.field2020.method1701(class18.field188.method1248((byte) -65), arg0 ^ 16969);
                    class112.field2020.method1703(8388607, class131.field2277.field4587, class131.field2277.field4619, 0);
                    class133.field2322.method55(class112.field2020.field4619, (byte) -83, 0, class112.field2020.field4587);
                    class131.field2277.method979(-222791167, var5);
                    for (int var6 = 0; ~var6 > -5; ++var6) {
                        var5[var6] += 50;
                    }
                    class129.field2252.method979(arg0 ^ -222811190, var5);
                    class78.field1386 = 4;
                }
                if (class78.field1386 == 4) {
                    if (class133.field2322.method62(-1) < 1) {
                        return;
                    }
                    int var7 = class133.field2322.method57(113);
                    if (var7 != 21) {
                        if (~var7 != -30) {
                            if (var7 == 1) {
                                class65.field1107 = var7;
                                class78.field1386 = 5;
                                return;
                            }
                            if (~var7 != -3) {
                                if (var7 == 15) {
                                    class65.field1107 = var7;
                                    class78.field1386 = 0;
                                    return;
                                }
                                if (var7 == 23 && class207.field3591 < 1) {
                                    ++class207.field3591;
                                    class57.field966 = 0;
                                    class78.field1386 = 1;
                                    class133.field2322.method54((byte) 125);
                                    class133.field2322 = null;
                                    return;
                                }
                                class65.field1107 = var7;
                                class78.field1386 = 0;
                                class133.field2322.method54((byte) -26);
                                class133.field2322 = null;
                                return;
                            }
                            class78.field1386 = 8;
                        } else {
                            class78.field1386 = 10;
                        }
                    } else {
                        class78.field1386 = 7;
                    }
                }
                if (class78.field1386 == 6) {
                    class131.field2277.field4587 = 0;
                    class131.field2277.method966((byte) 49, 17);
                    class133.field2322.method55(class131.field2277.field4619, (byte) -84, 0, class131.field2277.field4587);
                    class78.field1386 = 4;
                } else if (class78.field1386 == 7) {
                    if (class133.field2322.method62(-1) >= 1) {
                        class251.field4338 = (3 + class133.field2322.method57(-64)) * 60;
                        class78.field1386 = 0;
                        class65.field1107 = 21;
                        class133.field2322.method54((byte) -124);
                        class133.field2322 = null;
                    }
                } else if (class78.field1386 == 10) {
                    if (~class133.field2322.method62(arg0 ^ -20940) <= -2) {
                        class251.field4325 = class133.field2322.method57(-106);
                        class65.field1107 = 29;
                        class78.field1386 = 0;
                        class133.field2322.method54((byte) 124);
                        class133.field2322 = null;
                    }
                } else {
                    if (class78.field1386 == 8) {
                        if (class133.field2322.method62(-1) < 14) {
                            return;
                        }
                        class133.field2322.method61(-87, class129.field2252.field4619, 0, 14);
                        class129.field2252.field4587 = 0;
                        class103.field1751 = class129.field2252.method1693((byte) 89);
                        class291.field5115 = class129.field2252.method1693((byte) -103);
                        class74.field1258 = ~class129.field2252.method1693((byte) -114) == -2;
                        class105.field1763 = ~class129.field2252.method1693((byte) -108) == -2;
                        class234.field4034 = class129.field2252.method1693((byte) -81) == 1;
                        class138.field2425 = ~class129.field2252.method1693((byte) -108) == -2;
                        class261.field4597 = class129.field2252.method1693((byte) 102) == 1;
                        class167.field2980 = class129.field2252.method1740((byte) 122);
                        class214.field3717 = class129.field2252.method1693((byte) -91) == 1;
                        class124.field2180 = ~class129.field2252.method1693((byte) 68) == -2;
                        class138.method946(class124.field2180, -5);
                        class174.method1165(true, class124.field2180);
                        if (!class123.field2161) {
                            if ((!class74.field1258 || class234.field4034) && !class214.field3717) {
                                try {
                                    class206.field3568.method687(class24.field368.field1493, -26001);
                                } catch (Throwable var8) {
                                }
                            } else {
                                try {
                                    class42.field719.method687(class24.field368.field1493, -26001);
                                } catch (Throwable var9) {
                                }
                            }
                        }
                        class212.field3669 = class129.field2252.method977(255);
                        class180.field3146 = class129.field2252.method1740((byte) 95);
                        class78.field1386 = 9;
                    }
                    if (class78.field1386 == 9) {
                        if (class133.field2322.method62(-1) >= class180.field3146) {
                            class129.field2252.field4587 = 0;
                            class133.field2322.method61(arg0 + -21025, class129.field2252.field4619, 0, class180.field3146);
                            class65.field1107 = 2;
                            class78.field1386 = 0;
                            class173.method1162(0);
                            class209.field3628 = -1;
                            class218.method1455(113, false);
                            class212.field3669 = -1;
                        }
                    } else if (arg0 != 20939) {
                        field778 = null;
                    }
                }
            } catch (IOException var10) {
                if (class133.field2322 != null) {
                    class133.field2322.method54((byte) 125);
                    class133.field2322 = null;
                }
                if (class207.field3591 < 1) {
                    class57.field966 = 0;
                    class78.field1386 = 1;
                    if (~class7.field63 != ~class165.field2898) {
                        class7.field63 = class165.field2898;
                    } else {
                        class7.field63 = class28.field528;
                    }
                    ++class207.field3591;
                } else {
                    class78.field1386 = 0;
                    class65.field1107 = -4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(Z)V")
    public static void method337(boolean arg0) {
        field778 = null;
        field781 = null;
        if (!arg0) {
            method336(99);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        if (arg1 != -3) {
            method337(true);
        }
        int[] var3 = super.field3952.method1262(arg0, 7492);
        if (super.field3952.field3276) {
            class241.method1569(var3, 0, class234.field4046, class54.field879[arg0]);
        }
        ++field780;
        return var3;
    }
}
