import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class278 {

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Leg;")
    private static class37 field4916 = class174.method1167("Starting 3d Library", 63);

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "Leg;")
    public static class37 field4923 = field4916;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Leg;")
    public static class37 field4920 = class174.method1167("Liste des mises -9 jour charg-Be", 120);

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "[I")
    public static int[] field4921 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "Ljl;")
    public static class101 field4922;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIILme;IJZ)Z")
    public static final boolean method1866(int arg0, int arg1, int arg2, int arg3, int arg4, class67 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class281.method1884(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)I")
    public static final int method1867(int arg0, byte arg1) {
        field4914++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg1 > -88) {
            field4922 = null;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public static final void method1868(byte arg0) {
        if (arg0 != -70) {
            field4923 = null;
        }
        if (class207.field3498.toLowerCase().indexOf("microsoft") == -1) {
            class239.field4258[46] = 72;
            class239.field4258[91] = 42;
            class239.field4258[92] = 74;
            class239.field4258[61] = 27;
            class239.field4258[47] = 73;
            if (class207.field3516 == null) {
                class239.field4258[222] = 59;
                class239.field4258[192] = 58;
            } else {
                class239.field4258[520] = 59;
                class239.field4258[222] = 58;
                class239.field4258[192] = 28;
            }
            class239.field4258[44] = 71;
            class239.field4258[45] = 26;
            class239.field4258[59] = 57;
            class239.field4258[93] = 43;
        } else {
            class239.field4258[188] = 71;
            class239.field4258[223] = 28;
            class239.field4258[187] = 27;
            class239.field4258[190] = 72;
            class239.field4258[191] = 73;
            class239.field4258[189] = 26;
            class239.field4258[186] = 57;
            class239.field4258[221] = 43;
            class239.field4258[222] = 59;
            class239.field4258[219] = 42;
            class239.field4258[220] = 74;
            class239.field4258[192] = 58;
        }
        field4918++;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V")
    public static final void method1869(byte arg0) {
        field4925++;
        class125 var1 = class233.field4017;
        synchronized (class233.field4017) {
            class104.field1620 = class35.field497;
            class62.field1019++;
            class26.field363 = class95.field1489;
            class268.field4689 = class264.field4644;
            class32.field465 = class83.field1301;
            class163.field2685 = class59.field959;
            class110.field1837 = class180.field3003;
            class182.field3040 = class286.field5049;
            class83.field1301 = 0;
        }
        if (arg0 != 33) {
            method1871(-114, 47, 101);
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)V")
    public static final void method1870(byte arg0) {
        field4915++;
        class213.field3677.method1409(119);
        class144.field2448.method1409(123);
        if (arg0 != 2) {
            method1873(114);
        }
        class113.field1923.method1409(97);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Lp;")
    public static final class79 method1871(int arg0, int arg1, int arg2) {
        class111 var3 = class286.field5048[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1868;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIBI)V")
    public static final void method1872(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class273.field4778.field3169 = 0;
        class273.field4778.method1292(62, (byte) -64);
        class273.field4778.method1292(arg0, (byte) -64);
        field4924++;
        class273.field4778.method1292(arg4, (byte) -64);
        class273.field4778.method1294(arg1, -26655);
        class273.field4778.method1294(arg2, -26655);
        class79.field1223 = 1;
        class25.field354 = 0;
        class235.field4056 = -3;
        class35.field509 = 0;
        if (arg3 >= -103) {
            method1872(122, -45, -9, (byte) -105, 95);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static final void method1873(int arg0) {
        field4926++;
        if (class246.field4420 == 0 || class246.field4420 == 5) {
            return;
        }
        try {
            if (++class290.field5110 > 2000) {
                if (class187.field3190 != null) {
                    class187.field3190.method419((byte) -66);
                    class187.field3190 = null;
                }
                if (class59.field963 >= 1) {
                    class168.field2808 = -5;
                    class246.field4420 = 0;
                    return;
                }
                class246.field4420 = 1;
                class290.field5110 = 0;
                class59.field963++;
                if (class8.field134 == class26.field375) {
                    class26.field375 = class291.field5130;
                } else {
                    class26.field375 = class8.field134;
                }
            }
            if (class246.field4420 == 1) {
                class163.field2689 = class177.field2957.method1435(class48.field764, 115, class26.field375);
                class246.field4420 = 2;
            }
            if (class246.field4420 == 2) {
                if (class163.field2689.field4488 == 2) {
                    throw new IOException();
                }
                if (class163.field2689.field4488 != 1) {
                    return;
                }
                class187.field3190 = new class59((Socket) class163.field2689.field4483, class177.field2957);
                class163.field2689 = null;
                long var1 = class10.field165 = class179.field2990.method217((byte) -102);
                class273.field4778.field3169 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class273.field4778.method1292(14, (byte) -64);
                class273.field4778.method1292(var3, (byte) -64);
                class187.field3190.method420(class273.field4778.field3175, 0, 2, -13789);
                if (class36.field529 != null) {
                    class36.field529.method933(78);
                }
                if (class61.field1000 != null) {
                    class61.field1000.method933(122);
                }
                int var4 = class187.field3190.method426((byte) 41);
                if (class36.field529 != null) {
                    class36.field529.method933(64);
                }
                if (class61.field1000 != null) {
                    class61.field1000.method933(-118);
                }
                if (var4 != 0) {
                    class168.field2808 = var4;
                    class246.field4420 = 0;
                    class187.field3190.method419((byte) -66);
                    class187.field3190 = null;
                    return;
                }
                class246.field4420 = 3;
            }
            if (class246.field4420 == 3) {
                if (class187.field3190.method430(false) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class187.field3190.method425(8, 3714, class213.field3680.field3175, 0);
                class213.field3680.field3169 = 0;
                class232.field3975 = class213.field3680.method1295(55);
                var5[2] = (int) (class232.field3975 >> 32);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class232.field3975;
                class273.field4778.field3169 = 0;
                class273.field4778.method1292(10, (byte) -64);
                class273.field4778.method1272(27862, var5[0]);
                class273.field4778.method1272(27862, var5[1]);
                class273.field4778.method1272(27862, var5[2]);
                class273.field4778.method1272(27862, var5[3]);
                class273.field4778.method1256(class179.field2990.method217((byte) -102), (byte) 84);
                class273.field4778.method1289(class179.field2991, -103);
                class273.field4778.method1247(class238.field4230, class173.field2906, 917525152);
                class31.field458.field3169 = 0;
                if (class232.field4011 == 40) {
                    class31.field458.method1292(18, (byte) -64);
                } else {
                    class31.field458.method1292(16, (byte) -64);
                }
                class31.field458.method1294(class273.field4778.field3169 + class50.method327(96, class88.field1399) + 159, -26655);
                class31.field458.method1272(27862, 525);
                class31.field458.method1292(class7.field121, (byte) -64);
                class31.field458.method1292(class35.field501 ? 1 : 0, (byte) -64);
                class31.field458.method1292(0, (byte) -64);
                class31.field458.method1292(class130.method921(-113), (byte) -64);
                class31.field458.method1294(class249.field4479, -26655);
                class31.field458.method1294(class199.field3390, -26655);
                class31.field458.method1292(class74.field1162, (byte) -64);
                class119.method846(1, class31.field458);
                class31.field458.method1289(class88.field1399, -66);
                class31.field458.method1272(27862, class40.field641);
                class31.field458.method1272(27862, class75.method502((byte) 122));
                class234.field4042 = true;
                class31.field458.method1294(class203.field3476, -26655);
                class31.field458.method1272(27862, class61.field998.method655(-29577));
                class31.field458.method1272(27862, class99.field1542.method655(-29577));
                class31.field458.method1272(27862, field4922.method655(-29577));
                class31.field458.method1272(27862, class37.field547.method655(-29577));
                class31.field458.method1272(27862, class243.field4366.method655(-29577));
                class31.field458.method1272(27862, class50.field783.method655(-29577));
                class31.field458.method1272(27862, class92.field1449.method655(-29577));
                class31.field458.method1272(27862, class94.field1482.method655(-29577));
                class31.field458.method1272(27862, class124.field2086.method655(-29577));
                class31.field458.method1272(27862, client.field1885.method655(-29577));
                class31.field458.method1272(27862, class124.field2077.method655(-29577));
                class31.field458.method1272(27862, class74.field1169.method655(-29577));
                class31.field458.method1272(27862, class22.field291.method655(-29577));
                class31.field458.method1272(27862, class69.field1094.method655(-29577));
                class31.field458.method1272(27862, class187.field3186.method655(-29577));
                class31.field458.method1272(27862, class92.field1442.method655(-29577));
                class31.field458.method1272(27862, class187.field3201.method655(-29577));
                class31.field458.method1272(27862, class69.field1092.method655(-29577));
                class31.field458.method1272(27862, class100.field1555.method655(-29577));
                class31.field458.method1272(27862, class235.field4049.method655(-29577));
                class31.field458.method1272(27862, class55.field832.method655(-29577));
                class31.field458.method1272(27862, class64.field1042.method655(-29577));
                class31.field458.method1272(27862, class248.field4462.method655(-29577));
                class31.field458.method1272(27862, class215.field3714.method655(-29577));
                class31.field458.method1272(27862, class270.field4736.method655(-29577));
                class31.field458.method1272(27862, class143.field2436.method655(-29577));
                class31.field458.method1272(27862, class2.field21.method655(-29577));
                class31.field458.method1272(27862, class29.field431.method655(-29577));
                class31.field458.method1259(class273.field4778.field3175, -123, 0, class273.field4778.field3169);
                class187.field3190.method420(class31.field458.field3175, 0, class31.field458.field3169, -13789);
                class273.field4778.method1698(-9, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class213.field3680.method1698(-9, var5);
                class246.field4420 = 4;
            }
            if (class246.field4420 == 4) {
                if (class187.field3190.method430(false) < 1) {
                    return;
                }
                int var7 = class187.field3190.method426((byte) 41);
                if (var7 == 21) {
                    class246.field4420 = 7;
                } else if (var7 == 29) {
                    class246.field4420 = 10;
                } else if (var7 == 1) {
                    class168.field2808 = var7;
                    class246.field4420 = 5;
                    return;
                } else if (var7 == 2) {
                    class246.field4420 = 8;
                } else if (var7 == 15) {
                    class168.field2808 = var7;
                    class246.field4420 = 0;
                    return;
                } else if (var7 == 23 && class59.field963 < 1) {
                    class290.field5110 = 0;
                    class59.field963++;
                    class246.field4420 = 1;
                    class187.field3190.method419((byte) -66);
                    class187.field3190 = null;
                    return;
                } else {
                    class246.field4420 = 0;
                    class168.field2808 = var7;
                    class187.field3190.method419((byte) -66);
                    class187.field3190 = null;
                    return;
                }
            }
            if (class246.field4420 == 6) {
                class273.field4778.field3169 = 0;
                class273.field4778.method1697(17, 113);
                class187.field3190.method420(class273.field4778.field3175, 0, class273.field4778.field3169, -13789);
                class246.field4420 = 4;
            } else if (arg0 >= 121) {
                if (class246.field4420 == 7) {
                    if (class187.field3190.method430(false) >= 1) {
                        class239.field4242 = (class187.field3190.method426((byte) 41) + 3) * 60;
                        class246.field4420 = 0;
                        class168.field2808 = 21;
                        class187.field3190.method419((byte) -66);
                        class187.field3190 = null;
                    }
                } else if (class246.field4420 != 10) {
                    if (class246.field4420 == 8) {
                        if (class187.field3190.method430(false) < 14) {
                            return;
                        }
                        class187.field3190.method425(14, 3714, class213.field3680.field3175, 0);
                        class213.field3680.field3169 = 0;
                        class127.field2129 = class213.field3680.method1268(255);
                        class163.field2690 = class213.field3680.method1268(255);
                        class96.field1505 = class213.field3680.method1268(255) == 1;
                        class203.field3474 = class213.field3680.method1268(255) == 1;
                        class67.field1060 = class213.field3680.method1268(255) == 1;
                        class171.field2880 = class213.field3680.method1268(255) == 1;
                        class80.field1247 = class213.field3680.method1268(255) == 1;
                        class116.field1986 = class213.field3680.method1244(false);
                        class125.field2094 = class213.field3680.method1268(255) == 1;
                        class146.field2483 = class213.field3680.method1268(255) == 1;
                        class96.method623((byte) -78, class146.field2483);
                        class66.method457((byte) 119, class146.field2483);
                        if (!class35.field501) {
                            if ((!class96.field1505 || class67.field1060) && !class125.field2094) {
                                try {
                                    class287.field5054.method234(0, class177.field2957.field3504);
                                } catch (Throwable var8) {
                                }
                            } else {
                                try {
                                    class83.field1306.method234(0, class177.field2957.field3504);
                                } catch (Throwable var9) {
                                }
                            }
                        }
                        class215.field3718 = class213.field3680.method1700((byte) -97);
                        class182.field3044 = class213.field3680.method1244(false);
                        class246.field4420 = 9;
                    }
                    if (class246.field4420 == 9 && class187.field3190.method430(false) >= class182.field3044) {
                        class213.field3680.field3169 = 0;
                        class187.field3190.method425(class182.field3044, 3714, class213.field3680.field3175, 0);
                        class246.field4420 = 0;
                        class168.field2808 = 2;
                        class43.method286((byte) -59);
                        class260.field4598 = -1;
                        class133.method947(false, 23);
                        class215.field3718 = -1;
                    }
                } else if (class187.field3190.method430(false) >= 1) {
                    client.field1887 = class187.field3190.method426((byte) 41);
                    class246.field4420 = 0;
                    class168.field2808 = 29;
                    class187.field3190.method419((byte) -66);
                    class187.field3190 = null;
                }
            }
        } catch (IOException var10) {
            if (class187.field3190 != null) {
                class187.field3190.method419((byte) -66);
                class187.field3190 = null;
            }
            if (class59.field963 < 1) {
                class59.field963++;
                class246.field4420 = 1;
                if (class8.field134 == class26.field375) {
                    class26.field375 = class291.field5130;
                } else {
                    class26.field375 = class8.field134;
                }
                class290.field5110 = 0;
            } else {
                class246.field4420 = 0;
                class168.field2808 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public static void method1874(int arg0) {
        field4921 = null;
        if (arg0 != 27) {
            field4923 = null;
        }
        field4920 = null;
        field4922 = null;
        field4923 = null;
        field4916 = null;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
    public static final void method1875(int arg0) {
        class74.field1166.method1403(45);
        field4917++;
        if (arg0 != 28809) {
            method1870((byte) 102);
        }
    }
}
