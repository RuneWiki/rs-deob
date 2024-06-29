import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class63 extends class4 {

    @OriginalMember(owner = "client!je", name = "ob", descriptor = "I")
    private int field1477 = -1;

    @OriginalMember(owner = "client!je", name = "qb", descriptor = "Z")
    private boolean field1479 = false;

    @OriginalMember(owner = "client!je", name = "Eb", descriptor = "Z")
    private volatile boolean field1493 = false;

    @OriginalMember(owner = "client!je", name = "Cb", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "client!je", name = "wb", descriptor = "Lbf;")
    private class14 field1485;

    @OriginalMember(owner = "client!je", name = "Lb", descriptor = "Lbf;")
    private class14 field1500;

    @OriginalMember(owner = "client!je", name = "lb", descriptor = "Lkc;")
    private static class67 field1474 = class19.method144("Loading title screen )2 ", 68);

    @OriginalMember(owner = "client!je", name = "gb", descriptor = "Lkc;")
    public static class67 field1469 = field1474;

    @OriginalMember(owner = "client!je", name = "yb", descriptor = "I")
    public static int field1487 = -1;

    @OriginalMember(owner = "client!je", name = "tb", descriptor = "Lkc;")
    private static class67 field1482 = class19.method144("Remove", 111);

    @OriginalMember(owner = "client!je", name = "sb", descriptor = "[[I")
    public static int[][] field1481 = new int[104][104];

    @OriginalMember(owner = "client!je", name = "Gb", descriptor = "Lkc;")
    private static class67 field1495 = class19.method144("Ok", 74);

    @OriginalMember(owner = "client!je", name = "xb", descriptor = "Lkc;")
    public static class67 field1486 = class19.method144("title)3jpg", 126);

    @OriginalMember(owner = "client!je", name = "zb", descriptor = "Lkc;")
    public static class67 field1488 = field1495;

    @OriginalMember(owner = "client!je", name = "hb", descriptor = "Lkc;")
    public static class67 field1470 = field1482;

    @OriginalMember(owner = "client!je", name = "Ib", descriptor = "Lkc;")
    public static class67 field1497 = class19.method144("Fps:", 122);

    @OriginalMember(owner = "client!je", name = "ib", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!je", name = "jb", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!je", name = "kb", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!je", name = "mb", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client!je", name = "nb", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!je", name = "pb", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!je", name = "rb", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!je", name = "Ab", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!je", name = "Bb", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!je", name = "Db", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!je", name = "Fb", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!je", name = "Hb", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!je", name = "Jb", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!je", name = "Kb", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!je", name = "Mb", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!je", name = "ub", descriptor = "J")
    public static long field1483;

    @OriginalMember(owner = "client!je", name = "vb", descriptor = "[Z")
    private volatile boolean[] field1484;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([Lkc;I)Lkc;", line = 9)
    public static final class67 method479(class67[] arg0, int arg1) {
        ++field1478;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        } else {
            if (arg1 != 0) {
                field1482 = null;
            }
            return class41.method356(0, 0, arg0.length, arg0);
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V", line = 28)
    private final void method480(byte arg0) {
        this.field1484 = new boolean[super.field81.length];
        ++field1476;
        if (arg0 != 20) {
            field1488 = null;
        }
        for (int var2 = 0; ~var2 > ~this.field1484.length; ++var2) {
            this.field1484[var2] = false;
        }
        if (this.field1500 == null) {
            this.field1493 = true;
        } else {
            this.field1477 = -1;
            for (int var3 = 0; this.field1484.length > var3; ++var3) {
                if (super.field57[var3] > 0) {
                    class71.method581(true, var3, this.field1500, this);
                    this.field1477 = var3;
                }
            }
            if (this.field1477 == -1) {
                this.field1493 = true;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V", line = 77)
    public static void method481(int arg0) {
        field1486 = null;
        field1495 = null;
        field1497 = null;
        if (arg0 == -1) {
            field1474 = null;
            field1482 = null;
            field1481 = null;
            field1469 = null;
            field1470 = null;
            field1488 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([BZIZLbf;)V", line = 95)
    public final void method482(byte[] arg0, boolean arg1, int arg2, boolean arg3, class14 arg4) {
        if (arg1) {
            method489(false);
        }
        ++field1499;
        if (this.field1485 == arg4) {
            if (this.field1493) {
                throw new RuntimeException();
            } else if (arg0 == null) {
                class7.method70(255, (byte) 0, true, this.field1491, true, this, this.field1475);
            } else {
                class126.field2931.reset();
                class126.field2931.update(arg0, 0, arg0.length);
                int var6 = (int) class126.field2931.getValue();
                if (this.field1475 != var6) {
                    class7.method70(255, (byte) 0, !arg1, this.field1491, true, this, this.field1475);
                } else {
                    this.method47(arg0, arg1);
                    this.method480((byte) 20);
                }
            }
        } else {
            if (!arg3 && ~this.field1477 == ~arg2) {
                this.field1493 = true;
            }
            if (arg0 != null && ~arg0.length < -3) {
                class126.field2931.reset();
                class126.field2931.update(arg0, 0, arg0.length + -2);
                int var7 = (int) class126.field2931.getValue();
                int var8 = (65280 & arg0[arg0.length + -2] << 8) + (arg0[arg0.length - 1] & 255);
                if (super.field88[arg2] == var7 && super.field80[arg2] == var8) {
                    this.field1484[arg2] = true;
                    if (arg3) {
                        super.field81[arg2] = arg0;
                    }
                } else {
                    this.field1484[arg2] = false;
                    if (this.field1479 || arg3) {
                        class7.method70(this.field1491, (byte) 2, true, arg2, arg3, this, super.field88[arg2]);
                    }
                }
            } else {
                this.field1484[arg2] = false;
                if (this.field1479 || arg3) {
                    class7.method70(this.field1491, (byte) 2, !arg1, arg2, arg3, this, super.field88[arg2]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)Llc;", line = 196)
    public static final class73 method483(int arg0, boolean arg1) {
        ++field1501;
        class73 var2 = (class73) class11.field239.method373((byte) 124, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class66.field1549.method27(arg0, arg1, 9);
            class73 var4 = new class73();
            var4.field1740 = arg0;
            if (var3 != null) {
                var4.method591((byte) 60, new class140(var3));
            }
            var4.method592(-86);
            class11.field239.method374(0, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)V", line = 220)
    public final void method484(byte arg0, int arg1) {
        this.field1475 = arg1;
        if (this.field1485 == null) {
            class7.method70(255, (byte) 0, true, this.field1491, true, this, this.field1475);
        } else {
            class46.method384(this.field1485, this.field1491, (byte) -77, this);
        }
        ++field1496;
        if (arg0 != 82) {
            this.field1485 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI[BZI)V", line = 244)
    public final void method485(boolean arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        ++field1473;
        if (arg4 != -1) {
            this.field1475 = -122;
        }
        if (arg3) {
            if (this.field1493) {
                throw new RuntimeException();
            } else {
                if (this.field1485 != null) {
                    class112.method847(true, arg2, this.field1491, this.field1485);
                }
                this.method47(arg2, false);
                this.method480((byte) 20);
            }
        } else {
            arg2[arg2.length + -2] = (byte) (super.field80[arg1] >> 8);
            arg2[arg2.length - 1] = (byte) super.field80[arg1];
            if (this.field1500 != null) {
                class112.method847(true, arg2, arg1, this.field1500);
                this.field1484[arg1] = true;
            }
            if (arg0) {
                super.field81[arg1] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lbf;Lbf;IZZZ)V", line = 378)
    public class63(class14 arg0, class14 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1491 = arg2;
        this.field1479 = arg5;
        this.field1485 = arg1;
        this.field1500 = arg0;
        class65.method503(this.field1491, (byte) 4, this);
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)I", line = 301)
    public final int method486(byte arg0) {
        ++field1489;
        int var2 = 0;
        int var3 = 35 % ((arg0 - 18) / 62);
        int var4 = 0;
        for (int var5 = 0; super.field81.length > var5; ++var5) {
            if (~super.field57[var5] < -1) {
                var2 += this.method490(100, var5);
                var4 += 100;
            }
        }
        if (~var4 == -1) {
            return 100;
        } else {
            return var2 * 100 / var4;
        }
    }

    @OriginalMember(owner = "client!je", name = "g", descriptor = "(II)I", line = 337)
    public static int method487(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)I", line = 351)
    public final int method488(int arg0) {
        ++field1492;
        if (this.field1493) {
            return 100;
        } else if (super.field81 != null) {
            return 99;
        } else {
            int var2 = class101.method779((byte) 22, this.field1491, 255);
            if (arg0 != 0) {
                this.method480((byte) -96);
            }
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(ZI)V", line = 396)
    public final void method44(boolean arg0, int arg1) {
        ++field1490;
        if (arg0) {
            this.method486((byte) 110);
        }
        if (this.field1500 != null && this.field1484 != null && this.field1484[arg1]) {
            class46.method384(this.field1500, arg1, (byte) -15, this);
        } else {
            class7.method70(this.field1491, (byte) 2, true, arg1, true, this, super.field88[arg1]);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)Lab;", line = 417)
    public static final class3 method489(boolean arg0) {
        ++field1498;
        if (!arg0) {
            method479((class67[]) null, 2);
        }
        class3 var1 = new class3();
        var1.field35 = class54.field1310[0];
        var1.field33 = class34.field829[0];
        var1.field37 = class80.field1906[0];
        var1.field32 = class12.field266;
        var1.field34 = class46.field1121[0];
        var1.field31 = class55.field1345;
        var1.field30 = class116.field2735;
        var1.field36 = class112.field2596[0];
        class50.method411((byte) 39);
        return var1;
    }

    @OriginalMember(owner = "client!je", name = "h", descriptor = "(II)I", line = 439)
    private final int method490(int arg0, int arg1) {
        ++field1494;
        if (arg0 != 100) {
            field1480 = -86;
        }
        if (super.field81[arg1] != null) {
            return 100;
        } else {
            return this.field1484[arg1] ? 100 : class101.method779((byte) 22, arg1, this.field1491);
        }
    }

    @OriginalMember(owner = "client!je", name = "g", descriptor = "(I)Z", line = 459)
    public static final boolean method491(int arg0) {
        ++field1471;
        if (class71.field1679 == null) {
            return false;
        } else {
            try {
                int var1 = class71.field1679.method752((byte) -115);
                if (~var1 == -1) {
                    return false;
                }
                if (class12.field280 == -1) {
                    --var1;
                    class71.field1679.method749(0, 1, -112, class112.field2558.field3325);
                    class112.field2558.field3347 = 0;
                    class12.field280 = class112.field2558.method708((byte) -73);
                    class133.field3166 = class7.field179[class12.field280];
                }
                if (class133.field3166 == -1) {
                    if (var1 <= 0) {
                        return false;
                    }
                    class71.field1679.method749(0, 1, -99, class112.field2558.field3325);
                    class133.field3166 = 255 & class112.field2558.field3325[0];
                    --var1;
                }
                if (class133.field3166 == -2) {
                    if (~var1 >= -2) {
                        return false;
                    }
                    var1 -= 2;
                    class71.field1679.method749(0, 2, -60, class112.field2558.field3325);
                    class112.field2558.field3347 = 0;
                    class133.field3166 = class112.field2558.method1072(arg0 ^ 88);
                }
                if (~class133.field3166 < ~var1) {
                    return false;
                }
                class112.field2558.field3347 = 0;
                class71.field1679.method749(0, class133.field3166, 107, class112.field2558.field3325);
                class1.field4 = 0;
                class134.field3198 = class20.field412;
                class20.field412 = class42.field1049;
                class42.field1049 = class12.field280;
                if (~class12.field280 == -96) {
                    class106.field2420 = false;
                    for (int var2 = 0; var2 < 5; ++var2) {
                        class119.field2816[var2] = false;
                    }
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 188) {
                    int var3 = class112.field2558.method1072(arg0 + 41);
                    int var4 = class112.field2558.method1107(-21560);
                    class52.method428(0, var3);
                    if (var4 != -1) {
                        class52.method428(0, var4);
                    }
                    if (class96.field2163 != -1) {
                        class88.method686((byte) 2, class96.field2163);
                        class96.field2163 = -1;
                    }
                    if (class114.field2671 != -1) {
                        class88.method686((byte) 2, class114.field2671);
                        class114.field2671 = -1;
                    }
                    if (~field1487 != 0) {
                        class88.method686((byte) 2, field1487);
                        field1487 = -1;
                    }
                    if (class59.field1387 != var3) {
                        class88.method686((byte) 2, class59.field1387);
                        class59.field1387 = var3;
                        class126.method981(35, (byte) -120);
                    } else {
                        class109.method831(-125, class59.field1387);
                    }
                    if (class11.field246 != var3) {
                        class88.method686((byte) 2, class11.field246);
                        class11.field246 = var4;
                    } else {
                        class109.method831(111, class11.field246);
                    }
                    class41.field1008 = 0;
                    class98.field2218 = -1;
                    class7.method68(-12288, class59.field1387);
                    class7.method68(arg0 + -12289, class11.field246);
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 84) {
                    int var5 = class112.field2558.method1107(-21560);
                    int var6 = class112.field2558.method1119(-16894);
                    if (~field1487 != 0) {
                        class88.method686((byte) 2, field1487);
                        class138.field3304 = true;
                        field1487 = -1;
                    }
                    if (~class59.field1387 != 0) {
                        class88.method686((byte) 2, class59.field1387);
                        class59.field1387 = -1;
                        class126.method981(30, (byte) -120);
                    }
                    if (class11.field246 != -1) {
                        class88.method686((byte) 2, class11.field246);
                        class11.field246 = -1;
                    }
                    if (~class96.field2163 == ~var5) {
                        class109.method831(67, class96.field2163);
                    } else {
                        class88.method686((byte) 2, class96.field2163);
                        class96.field2163 = var5;
                    }
                    if (class114.field2671 == var6) {
                        class109.method831(82, class114.field2671);
                    } else {
                        class88.method686((byte) 2, class114.field2671);
                        class114.field2671 = var6;
                    }
                    class96.field2165 = true;
                    class98.field2218 = -1;
                    if (~class41.field1008 != -1) {
                        class138.field3304 = true;
                        class41.field1008 = 0;
                    }
                    class121.field2849 = true;
                    class7.method68(-12288, class96.field2163);
                    class7.method68(-12288, class114.field2671);
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -146) {
                    int var7 = class112.field2558.method1078(126);
                    class33 var8 = class88.method685((byte) -100, var7);
                    var8.field779 = 3;
                    var8.field696 = class69.field1640.field2334.method1033(-1157636529);
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 240) {
                    int var9 = class112.field2558.method1097(false);
                    class67 var10 = class112.field2558.method1110(false);
                    int var11 = class112.field2558.method1105(arg0 + 254);
                    if (~var11 <= -2 && var11 <= 5) {
                        if (var10.method535(class141.field3403, (byte) 84)) {
                            var10 = null;
                        }
                        class58.field1372[var11 + -1] = var10;
                        class82.field1960[var11 + -1] = ~var9 == -1;
                    }
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -22) {
                    class131.field3089 = class112.field2558.method1094(arg0 ^ 11);
                    class96.field2165 = true;
                    class12.field280 = -1;
                    class121.field2849 = true;
                    return true;
                }
                if (class12.field280 == 200) {
                    class140.method1092(-59);
                    class12.field280 = -1;
                    return false;
                }
                if (class12.field280 == 98 || ~class12.field280 == -79 || class12.field280 == 13 || class12.field280 == 234 || class12.field280 == 36 || class12.field280 == 27 || ~class12.field280 == -20 || class12.field280 == 3 || class12.field280 == 114 || ~class12.field280 == -89 || ~class12.field280 == -30) {
                    client.method173(83);
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 213) {
                    int var12 = class112.field2558.method1119(-16894);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    int var13 = class112.field2558.method1073(arg0 + 120);
                    int var14 = class112.field2558.method1073(127);
                    class33 var15 = class88.method685((byte) -120, var14);
                    if (!var15.field722) {
                        if (var12 == -1) {
                            class12.field280 = -1;
                            var15.field779 = 0;
                            return true;
                        }
                        class131 var16 = class55.method440(var12, 21467);
                        var15.field724 = var16.field3071;
                        var15.field742 = var16.field3090;
                        var15.field779 = 4;
                        var15.field696 = var12;
                        var15.field761 = var16.field3109 * 100 / var13;
                    } else {
                        var15.field762 = var13;
                        var15.field783 = var12;
                        class131 var17 = class55.method440(var12, arg0 ^ 21466);
                        var15.field739 = var17.field3096;
                        var15.field742 = var17.field3090;
                        var15.field724 = var17.field3071;
                        var15.field761 = var17.field3109;
                        var15.field812 = var17.field3116;
                        if (var15.field733 > 0) {
                            var15.field761 = var15.field761 * 32 / var15.field733;
                        }
                        var15.field768 = var17.field3114;
                    }
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 189) {
                    class12.field256 = class112.field2558.method1119(-16894) * 30;
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -161) {
                    class54.field1289 = class112.field2558.method1105(255);
                    if (class54.field1289 == 1) {
                        class137.field3269 = class112.field2558.method1072(21);
                    }
                    if (~class54.field1289 <= -3 && class54.field1289 <= 6) {
                        if (~class54.field1289 == -3) {
                            class2.field28 = 64;
                            class31.field674 = 64;
                        }
                        if (class54.field1289 == 3) {
                            class31.field674 = 0;
                            class2.field28 = 64;
                        }
                        if (class54.field1289 == 4) {
                            class31.field674 = 128;
                            class2.field28 = 64;
                        }
                        if (class54.field1289 == 5) {
                            class2.field28 = 0;
                            class31.field674 = 64;
                        }
                        if (class54.field1289 == 6) {
                            class31.field674 = 64;
                            class2.field28 = 128;
                        }
                        class54.field1289 = 2;
                        class81.field1912 = class112.field2558.method1072(62);
                        class14.field296 = class112.field2558.method1072(111);
                        class49.field1179 = class112.field2558.method1105(255);
                    }
                    if (~class54.field1289 == -11) {
                        class126.field2949 = class112.field2558.method1072(27);
                    }
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -73) {
                    class49.method408(arg0 + 113);
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -136) {
                    int var18 = class112.field2558.method1107(-21560);
                    class30.method256(var18, arg0 ^ -113);
                    class88.field2021 = class135.field3243;
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 81) {
                    class20.field410 = class112.field2558.method1105(255);
                    class4.field93 = class112.field2558.method1105(255);
                    class58.field1375 = class112.field2558.method1105(255);
                    class59.field1386 = true;
                    class138.field3304 = true;
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 229) {
                    long var19 = class112.field2558.method1095(-1952572256);
                    int var21 = class112.field2558.method1072(66);
                    int var22 = class112.field2558.method1105(arg0 + 254);
                    class67 var23 = class137.method1065(var19, (byte) 124).method528((byte) -26);
                    for (int var24 = 0; class9.field188 > var24; ++var24) {
                        if (~class31.field650[var24] == ~var19) {
                            if (class46.field1107[var24] != var21) {
                                class46.field1107[var24] = var21;
                                class121.field2849 = true;
                                if (var21 > 0) {
                                    class50.method412(method479(new class67[] { var23, class85.field1995 }, 0), false, 5, class127.field2976);
                                }
                                if (var21 == 0) {
                                    class50.method412(method479(new class67[] { var23, class29.field604 }, 0), false, 5, class127.field2976);
                                }
                            }
                            class128.field2999[var24] = var22;
                            var23 = null;
                            break;
                        }
                    }
                    boolean var25 = false;
                    if (var23 != null && ~class9.field188 > -201) {
                        class31.field650[class9.field188] = var19;
                        class55.field1349[class9.field188] = var23;
                        class46.field1107[class9.field188] = var21;
                        class128.field2999[class9.field188] = var22;
                        class121.field2849 = true;
                        ++class9.field188;
                    }
                    while (!var25) {
                        var25 = true;
                        for (int var26 = 0; var26 < class9.field188 + -1; ++var26) {
                            if (class46.field1107[var26] != class77.field1840 && ~class46.field1107[var26 + 1] == ~class77.field1840 || class46.field1107[var26] == 0 && class46.field1107[var26 + 1] != 0) {
                                var25 = false;
                                int var27 = class46.field1107[var26];
                                class46.field1107[var26] = class46.field1107[var26 - -1];
                                class46.field1107[var26 + 1] = var27;
                                class67 var28 = class55.field1349[var26];
                                class55.field1349[var26] = class55.field1349[var26 + 1];
                                class55.field1349[var26 + 1] = var28;
                                long var29 = class31.field650[var26];
                                class31.field650[var26] = class31.field650[var26 + 1];
                                class31.field650[var26 + 1] = var29;
                                int var31 = class128.field2999[var26];
                                class128.field2999[var26] = class128.field2999[var26 + 1];
                                class128.field2999[var26 + 1] = var31;
                                class121.field2849 = true;
                            }
                        }
                    }
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 228) {
                    class135.method1052(class133.field3166, class112.field2558, (byte) -23, class83.field1966);
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 123) {
                    class67 var32 = class112.field2558.method1110(false);
                    if (var32.method517(arg0 + 126, class10.field225)) {
                        class67 var33 = var32.method529(0, var32.method520(class78.field1842, -10874), 17804);
                        long var34 = var33.method532(arg0 + -122);
                        boolean var36 = false;
                        for (int var37 = 0; class128.field3003 > var37; ++var37) {
                            if (class5.field112[var37] == var34) {
                                var36 = true;
                                break;
                            }
                        }
                        if (!var36 && ~class32.field684 == -1) {
                            class50.method412(client.field473, false, 4, var33);
                        }
                    } else if (!var32.method517(127, class125.field2909)) {
                        if (!var32.method517(127, class127.field2973)) {
                            class50.method412(var32, false, 0, class127.field2976);
                        } else {
                            class67 var38 = var32.method529(0, var32.method520(class78.field1842, arg0 ^ -10873), 17804);
                            long var39 = var38.method532(arg0 ^ -97);
                            boolean var41 = false;
                            for (int var42 = 0; ~class128.field3003 < ~var42; ++var42) {
                                if (~class5.field112[var42] == ~var39) {
                                    var41 = true;
                                    break;
                                }
                            }
                            if (!var41 && ~class32.field684 == -1) {
                                class67 var43 = var32.method529(var32.method520(class78.field1842, -10874) + 1, var32.method539(2618) - 9, 17804);
                                class50.method412(var43, false, 8, var38);
                            }
                        }
                    } else {
                        boolean var44 = false;
                        class67 var45 = var32.method529(0, var32.method520(class78.field1842, -10874), 17804);
                        long var46 = var45.method532(-61);
                        for (int var48 = 0; ~class128.field3003 < ~var48; ++var48) {
                            if (~class5.field112[var48] == ~var46) {
                                var44 = true;
                                break;
                            }
                        }
                        if (!var44 && class32.field684 == 0) {
                            class50.method412(class70.field1668, false, 8, var45);
                        }
                    }
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 150) {
                    class67 var49 = class112.field2558.method1110(false);
                    int var50 = class112.field2558.method1118(4);
                    class33 var51 = class88.method685((byte) -122, var50);
                    var51.field737 = var49;
                    if (var50 >> 16 == class122.field2894[class131.field3089]) {
                        class121.field2849 = true;
                    }
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -104) {
                    int var52 = class112.field2558.method1073(126);
                    class73.field1735 = class83.field1966.method123(arg0 + -1, var52);
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -94) {
                    int var53 = class112.field2558.method1119(arg0 ^ -16893);
                    int var54 = class112.field2558.method1084(97);
                    int var55 = class112.field2558.method1084(83);
                    int var56 = class112.field2558.method1118(4);
                    class33 var57 = class88.method685((byte) -110, var56);
                    var57.field761 = var54;
                    var57.field724 = var53;
                    var57.field742 = var55;
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -215) {
                    int var58 = class112.field2558.method1073(112);
                    int var59 = class112.field2558.method1084(72);
                    int var60 = (32479 & var59) >> 10;
                    int var61 = var59 >> 5 & 31;
                    class33 var62 = class88.method685((byte) -124, var58);
                    class12.field280 = -1;
                    int var63 = 31 & var59;
                    var62.field754 = (var61 << 11) + (var60 << 19) + (var63 << 3);
                    return true;
                }
                if (~class12.field280 == -86) {
                    class121.field2849 = true;
                    int var64 = class112.field2558.method1097(false);
                    int var65 = class112.field2558.method1101((byte) -59);
                    int var66 = class112.field2558.method1094(arg0 ^ 11);
                    class129.field3021[var64] = var65;
                    class91.field2109[var64] = var66;
                    class32.field693[var64] = 1;
                    for (int var67 = 0; ~var67 > -99; ++var67) {
                        if (class32.field678[var67] <= var65) {
                            class32.field693[var64] = var67 + 2;
                        }
                    }
                    class12.field280 = -1;
                    class112.field2568 = class135.field3243;
                    return true;
                }
                if (class12.field280 == 232) {
                    int var68 = class112.field2558.method1118(4);
                    int var69 = class112.field2558.method1072(8);
                    class33 var70 = class88.method685((byte) -110, var68);
                    var70.field696 = var69;
                    var70.field779 = 2;
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -110) {
                    int var71 = class112.field2558.method1084(95);
                    if (~var71 == -65536) {
                        var71 = -1;
                    }
                    int var72 = class112.field2558.method1097(false);
                    if (~class122.field2894[var72] == ~var71) {
                        class109.method831(117, class122.field2894[var72]);
                    } else {
                        class88.method686((byte) 2, class122.field2894[var72]);
                        class122.field2894[var72] = var71;
                    }
                    class121.field2849 = true;
                    class96.field2165 = true;
                    class7.method68(arg0 ^ -12287, class122.field2894[var72]);
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -251) {
                    if (class131.field3089 == 12) {
                        class121.field2849 = true;
                    }
                    class1.field12 = class112.field2558.method1091((byte) -108);
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 247) {
                    class58.field1379 = class112.field2558.method1105(255);
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -144) {
                    if (~field1487 != 0) {
                        class88.method686((byte) 2, field1487);
                        field1487 = -1;
                    }
                    class41.field1008 = 2;
                    class127.field2966 = class127.field2976;
                    class12.field280 = -1;
                    class138.field3304 = true;
                    class21.field434 = false;
                    return true;
                }
                if (class12.field280 == 162) {
                    class121.field2849 = true;
                    int var73 = class112.field2558.method1118(4);
                    int var74 = class112.field2558.method1072(arg0 + 115);
                    class33 var75;
                    if (~var73 <= -1) {
                        var75 = class88.method685((byte) -96, var73);
                    } else {
                        var75 = null;
                    }
                    if (var75 != null) {
                        for (int var76 = 0; ~var76 > ~var75.field778.length; ++var76) {
                            var75.field778[var76] = 0;
                            var75.field738[var76] = 0;
                        }
                    }
                    class78.method628(var74, arg0 + -93);
                    int var77 = class112.field2558.method1072(74);
                    for (int var78 = 0; ~var78 > ~var77; ++var78) {
                        int var79 = class112.field2558.method1119(-16894);
                        int var80 = class112.field2558.method1094(arg0 ^ 11);
                        if (var80 == 255) {
                            var80 = class112.field2558.method1073(112);
                        }
                        if (var75 != null && ~var75.field778.length < ~var78) {
                            var75.field778[var78] = var79;
                            var75.field738[var78] = var80;
                        }
                        class100.method771(-30243, var74, var79 + -1, var80, var78);
                    }
                    class12.field280 = -1;
                    class88.field2021 = class135.field3243;
                    return true;
                }
                if (~class12.field280 == -57) {
                    int var81 = class112.field2558.method1101((byte) -59);
                    int var82 = class112.field2558.method1084(114);
                    class129.field3012[var82] = var81;
                    if (~class5.field109[var82] != ~var81) {
                        class5.field109[var82] = var81;
                        class90.method704(false, var82);
                        if (~class49.field1177 != 0) {
                            class138.field3304 = true;
                        }
                        class121.field2849 = true;
                    }
                    class90.field2076 = class135.field3243;
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == arg0) {
                    int var83 = class112.field2558.method1094(10);
                    int var84 = class112.field2558.method1105(255);
                    int var85 = class112.field2558.method1094(10);
                    class112.field2593 = var83 >> 1;
                    class69.field1640.method415(var85, var84, (var83 & 1) == 1, false);
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -141) {
                    int var86 = class112.field2558.method1105(arg0 ^ 254);
                    int var87 = class112.field2558.method1105(255);
                    int var88 = class112.field2558.method1105(255);
                    int var89 = class112.field2558.method1105(255);
                    class119.field2816[var86] = true;
                    class31.field655[var86] = var87;
                    class84.field1983[var86] = var88;
                    class21.field439[var86] = var89;
                    class82.field1951[var86] = 0;
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 50) {
                    class128.field3003 = class133.field3166 / 8;
                    for (int var90 = 0; ~class128.field3003 < ~var90; ++var90) {
                        class5.field112[var90] = class112.field2558.method1095(-1952572256);
                    }
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -240) {
                    int var91 = class112.field2558.method1101((byte) -59);
                    int var92 = class112.field2558.method1107(arg0 ^ -21559);
                    class33 var93 = class88.method685((byte) -125, var91);
                    class12.field280 = -1;
                    if (var93 != null && ~var93.field729 == -1) {
                        if (var92 > -var93.field704 + var93.field752) {
                            var92 = -var93.field704 + var93.field752;
                        }
                        if (var92 < 0) {
                            var92 = 0;
                        }
                        var93.field806 = var92;
                    }
                    return true;
                }
                if (class12.field280 == 127) {
                    class60.method474(-25619, false);
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 4) {
                    class106.field2420 = true;
                    class132.field3134 = class112.field2558.method1105(255);
                    class98.field2216 = class112.field2558.method1105(arg0 + 254);
                    class66.field1562 = class112.field2558.method1072(30);
                    class11.field248 = class112.field2558.method1105(255);
                    class33.field816 = class112.field2558.method1105(arg0 ^ 254);
                    if (class33.field816 >= 100) {
                        int var94 = class132.field3134 * 128 + 64;
                        int var95 = class98.field2216 * 128 + 64;
                        int var96 = class70.method575(var95, 1, var94, class112.field2593) - class66.field1562;
                        int var97 = -class127.field2980 + var94;
                        int var98 = -class133.field3164 + var96;
                        int var99 = -class74.field1776 + var95;
                        int var100 = (int) Math.sqrt((double) (var97 * var97 - -(var99 * var99)));
                        class116.field2737 = 2047 & (int) (325.949D * Math.atan2((double) var98, (double) var100));
                        class65.field1535 = 2047 & (int) (-325.949D * Math.atan2((double) var97, (double) var99));
                        if (class116.field2737 < 128) {
                            class116.field2737 = 128;
                        }
                        if (class116.field2737 > 383) {
                            class116.field2737 = 383;
                        }
                    }
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -206) {
                    long var101 = class112.field2558.method1095(arg0 + -1952572257);
                    class67 var103 = class25.method195(class112.field2558, false).method543(32);
                    class50.method412(var103, false, 6, class137.method1065(var101, (byte) -81).method528((byte) -26));
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 20) {
                    for (int var104 = 0; class5.field109.length > var104; ++var104) {
                        if (~class5.field109[var104] != ~class129.field3012[var104]) {
                            class5.field109[var104] = class129.field3012[var104];
                            class90.method704(false, var104);
                            class121.field2849 = true;
                        }
                    }
                    class90.field2076 = class135.field3243;
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -105) {
                    class106.field2420 = true;
                    class84.field1975 = class112.field2558.method1105(255);
                    class38.field893 = class112.field2558.method1105(255);
                    class32.field689 = class112.field2558.method1072(58);
                    class81.field1930 = class112.field2558.method1105(arg0 ^ 254);
                    class127.field2979 = class112.field2558.method1105(arg0 + 254);
                    if (class127.field2979 >= 100) {
                        class74.field1776 = class38.field893 * 128 - -64;
                        class127.field2980 = class84.field1975 * 128 + 64;
                        class133.field3164 = class70.method575(class74.field1776, 1, class127.field2980, class112.field2593) - class32.field689;
                    }
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -175) {
                    int var105 = class112.field2558.method1084(42);
                    class52.method428(0, var105);
                    if (~field1487 != 0) {
                        class88.method686((byte) 2, field1487);
                        class138.field3304 = true;
                        field1487 = -1;
                    }
                    if (~class59.field1387 != 0) {
                        class88.method686((byte) 2, class59.field1387);
                        class59.field1387 = -1;
                        class126.method981(30, (byte) -120);
                    }
                    if (class11.field246 != -1) {
                        class88.method686((byte) 2, class11.field246);
                        class11.field246 = -1;
                    }
                    if (class96.field2163 != -1) {
                        class88.method686((byte) 2, class96.field2163);
                        class96.field2163 = -1;
                    }
                    if (class114.field2671 != var105) {
                        class88.method686((byte) 2, class114.field2671);
                        class114.field2671 = var105;
                    } else {
                        class109.method831(-127, class114.field2671);
                    }
                    class96.field2165 = true;
                    class121.field2849 = true;
                    class98.field2218 = -1;
                    if (class41.field1008 != 0) {
                        class41.field1008 = 0;
                        class138.field3304 = true;
                    }
                    class7.method68(-12288, class114.field2671);
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -168) {
                    if (~field1487 != 0) {
                        class88.method686((byte) 2, field1487);
                        field1487 = -1;
                    }
                    class12.field280 = -1;
                    class21.field434 = false;
                    class138.field3304 = true;
                    class127.field2966 = class127.field2976;
                    class41.field1008 = 1;
                    return true;
                }
                if (class12.field280 == 99) {
                    int var106 = class112.field2558.method1073(112);
                    int var107 = class112.field2558.method1101((byte) -59);
                    int var108 = class112.field2558.method1084(40);
                    if (~var108 == -65536) {
                        var108 = -1;
                    }
                    long var109 = ((long) var106 << 32) + (long) var108;
                    class2 var111 = class135.field3245.method462(false, var109);
                    if (var111 != null) {
                        var111.method13(arg0 + 124);
                    }
                    class135.field3245.method469(-1, var109, new class46(var107));
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 61) {
                    if (class114.field2671 != -1) {
                        class88.method686((byte) 2, class114.field2671);
                        class114.field2671 = -1;
                        class121.field2849 = true;
                        class96.field2165 = true;
                    }
                    if (field1487 != -1) {
                        class88.method686((byte) 2, field1487);
                        class138.field3304 = true;
                        field1487 = -1;
                    }
                    if (~class59.field1387 != 0) {
                        class88.method686((byte) 2, class59.field1387);
                        class59.field1387 = -1;
                        class126.method981(30, (byte) -120);
                    }
                    if (~class11.field246 != 0) {
                        class88.method686((byte) 2, class11.field246);
                        class11.field246 = -1;
                    }
                    if (class96.field2163 != -1) {
                        class88.method686((byte) 2, class96.field2163);
                        class96.field2163 = -1;
                    }
                    if (class41.field1008 != 0) {
                        class41.field1008 = 0;
                        class138.field3304 = true;
                    }
                    class12.field280 = -1;
                    class98.field2218 = -1;
                    return true;
                }
                if (class12.field280 == 182) {
                    int var112 = class112.field2558.method1116(255);
                    int var113 = class112.field2558.method1101((byte) -59);
                    class33 var114 = class88.method685((byte) -115, var113);
                    if (var114.field715 != var112 || var112 == -1) {
                        var114.field715 = var112;
                        var114.field747 = 0;
                        var114.field711 = 0;
                    }
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 111) {
                    class121.field2849 = true;
                    int var115 = class112.field2558.method1118(4);
                    int var116 = class112.field2558.method1072(57);
                    class33 var117;
                    if (~var115 <= -1) {
                        var117 = class88.method685((byte) -112, var115);
                    } else {
                        var117 = null;
                    }
                    while (class133.field3166 > class112.field2558.field3347) {
                        int var118 = 0;
                        int var119 = class112.field2558.method1103((byte) -119);
                        int var120 = class112.field2558.method1072(arg0 + 27);
                        if (~var120 != -1) {
                            var118 = class112.field2558.method1105(255);
                            if (var118 == 255) {
                                var118 = class112.field2558.method1118(4);
                            }
                        }
                        if (var117 != null && var119 >= 0 && var117.field778.length > var119) {
                            var117.field778[var119] = var120;
                            var117.field738[var119] = var118;
                        }
                        class100.method771(-30243, var116, var120 + -1, var118, var119);
                    }
                    class12.field280 = -1;
                    class88.field2021 = class135.field3243;
                    return true;
                }
                if (~class12.field280 == -59) {
                    for (int var121 = 0; class44.field1067.length > var121; ++var121) {
                        if (class44.field1067[var121] != null) {
                            class44.field1067[var121].field1216 = -1;
                        }
                    }
                    for (int var122 = 0; ~class9.field189.length < ~var122; ++var122) {
                        if (class9.field189[var122] != null) {
                            class9.field189[var122].field1216 = -1;
                        }
                    }
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -157) {
                    class7.method71(0);
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -223) {
                    class125.field2926 = class112.field2558.method1094(arg0 + 9);
                    class5.field110 = class112.field2558.method1105(arg0 + 254);
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 66) {
                    class128.field3005 = class112.field2558.method1105(arg0 ^ 254);
                    class12.field280 = -1;
                    class121.field2849 = true;
                    return true;
                }
                if (class12.field280 == 55) {
                    int var123 = class112.field2558.method1078(-60);
                    boolean var124 = class112.field2558.method1097(false) == 1;
                    class33 var125 = class88.method685((byte) -103, var123);
                    var125.field743 = var124;
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 52) {
                    long var126 = class112.field2558.method1095(-1952572256);
                    long var128 = (long) class112.field2558.method1072(99);
                    long var130 = (long) class112.field2558.method1114(false);
                    int var132 = class112.field2558.method1105(255);
                    long var133 = (var128 << 32) + var130;
                    boolean var135 = false;
                    for (int var136 = 0; ~var136 > -101; ++var136) {
                        if (~class45.field1104[var136] == ~var133) {
                            var135 = true;
                            break;
                        }
                    }
                    if (var132 <= 1) {
                        for (int var137 = 0; class128.field3003 > var137; ++var137) {
                            if (~class5.field112[var137] == ~var126) {
                                var135 = true;
                                break;
                            }
                        }
                    }
                    if (!var135 && ~class32.field684 == -1) {
                        class45.field1104[class114.field2686] = var133;
                        class114.field2686 = (class114.field2686 + 1) % 100;
                        class67 var138 = class25.method195(class112.field2558, false).method543(32);
                        if (var132 != 2 && ~var132 != -4) {
                            if (var132 != 1) {
                                class50.method412(var138, false, 3, class137.method1065(var126, (byte) -24).method528((byte) -26));
                            } else {
                                class50.method412(var138, false, 7, method479(new class67[] { class115.field2718, class137.method1065(var126, (byte) -95).method528((byte) -26) }, 0));
                            }
                        } else {
                            class50.method412(var138, false, 7, method479(new class67[] { class38.field870, class137.method1065(var126, (byte) -19).method528((byte) -26) }, 0));
                        }
                    }
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -9) {
                    if (~class131.field3089 == -13) {
                        class121.field2849 = true;
                    }
                    class71.field1694 = class112.field2558.method1105(arg0 + 254);
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -238) {
                    class60.method474(-25619, true);
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 40) {
                    int var139 = class112.field2558.method1107(-21560);
                    class52.method428(0, var139);
                    if (class114.field2671 != -1) {
                        class88.method686((byte) 2, class114.field2671);
                        class96.field2165 = true;
                        class114.field2671 = -1;
                        class121.field2849 = true;
                    }
                    if (class59.field1387 != -1) {
                        class88.method686((byte) 2, class59.field1387);
                        class59.field1387 = -1;
                        class126.method981(30, (byte) -120);
                    }
                    if (~class11.field246 != 0) {
                        class88.method686((byte) 2, class11.field246);
                        class11.field246 = -1;
                    }
                    if (class96.field2163 != -1) {
                        class88.method686((byte) 2, class96.field2163);
                        class96.field2163 = -1;
                    }
                    if (field1487 == var139) {
                        class109.method831(125, field1487);
                    } else {
                        class88.method686((byte) 2, field1487);
                        field1487 = var139;
                    }
                    class98.field2218 = -1;
                    class7.method68(-12288, field1487);
                    class12.field280 = -1;
                    class138.field3304 = true;
                    return true;
                }
                if (~class12.field280 == -126) {
                    int var140 = class112.field2558.method1101((byte) -59);
                    class33 var141 = class88.method685((byte) -118, var140);
                    for (int var142 = 0; ~var142 > ~var141.field778.length; ++var142) {
                        var141.field778[var142] = -1;
                        var141.field778[var142] = 0;
                    }
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 107) {
                    class20.field407 = class112.field2558.method1105(255);
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 76) {
                    class125.field2926 = class112.field2558.method1088(arg0 ^ 1809908425);
                    class5.field110 = class112.field2558.method1097(false);
                    while (~class112.field2558.field3347 > ~class133.field3166) {
                        class12.field280 = class112.field2558.method1105(255);
                        client.method173(arg0 + 81);
                    }
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -87) {
                    int var143 = class112.field2558.method1082((byte) -107);
                    if (~var143 <= -1) {
                        class52.method428(0, var143);
                    }
                    if (~class41.field992 != ~var143) {
                        class88.method686((byte) 2, class41.field992);
                        class41.field992 = var143;
                    }
                    class7.method68(arg0 + -12289, class41.field992);
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -24) {
                    int var144 = class112.field2558.method1107(-21560);
                    int var145 = class112.field2558.method1118(arg0 + 3);
                    class33 var146 = class88.method685((byte) -119, var145);
                    var146.field779 = 1;
                    class12.field280 = -1;
                    var146.field696 = var144;
                    return true;
                }
                if (~class12.field280 == -47) {
                    int var147 = class112.field2558.method1107(arg0 ^ -21559);
                    class52.method428(0, var147);
                    if (class114.field2671 != -1) {
                        class88.method686((byte) 2, class114.field2671);
                        class114.field2671 = -1;
                        class121.field2849 = true;
                        class96.field2165 = true;
                    }
                    if (field1487 != -1) {
                        class88.method686((byte) 2, field1487);
                        class138.field3304 = true;
                        field1487 = -1;
                    }
                    if (class59.field1387 != -1) {
                        class88.method686((byte) 2, class59.field1387);
                        class59.field1387 = -1;
                        class126.method981(30, (byte) -120);
                    }
                    if (class11.field246 != -1) {
                        class88.method686((byte) 2, class11.field246);
                        class11.field246 = -1;
                    }
                    if (class96.field2163 == var147) {
                        class109.method831(arg0 + 116, class96.field2163);
                    } else {
                        class88.method686((byte) 2, class96.field2163);
                        class96.field2163 = var147;
                    }
                    class98.field2218 = -1;
                    if (class41.field1008 != 0) {
                        class138.field3304 = true;
                        class41.field1008 = 0;
                    }
                    class7.method68(-12288, class96.field2163);
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -88) {
                    for (int var148 = 0; ~class117.field2767 < ~var148; ++var148) {
                        class116 var149 = class46.method383(16, var148);
                        if (var149 != null && var149.field2752 == 0) {
                            class129.field3012[var148] = 0;
                            class5.field109[var148] = 0;
                        }
                    }
                    class90.field2076 = class135.field3243;
                    class121.field2849 = true;
                    class12.field280 = -1;
                    if (class49.field1177 != -1) {
                        class138.field3304 = true;
                    }
                    return true;
                }
                if (class12.field280 == 163) {
                    int var150 = class112.field2558.method1082((byte) -102);
                    if (~class49.field1177 != ~var150) {
                        class88.method686((byte) 2, class49.field1177);
                        class49.field1177 = var150;
                    }
                    class138.field3304 = true;
                    class7.method68(-12288, class49.field1177);
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -58) {
                    class52.field1271 = class112.field2558.method1107(arg0 ^ -21559);
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 5) {
                    int var151 = class112.field2558.method1084(44);
                    byte var152 = class112.field2558.method1112((byte) 127);
                    class129.field3012[var151] = var152;
                    if (class5.field109[var151] != var152) {
                        class5.field109[var151] = var152;
                        class90.method704(false, var151);
                        if (~class49.field1177 != 0) {
                            class138.field3304 = true;
                        }
                        class121.field2849 = true;
                    }
                    class12.field280 = -1;
                    class90.field2076 = class135.field3243;
                    return true;
                }
                if (class12.field280 == 38) {
                    int var153 = class112.field2558.method1072(arg0 + 66);
                    int var154 = class112.field2558.method1107(-21560);
                    int var155 = class112.field2558.method1078(arg0 ^ 118);
                    class33 var156 = class88.method685((byte) -127, var155);
                    class12.field280 = -1;
                    var156.field727 = (var153 << 16) + var154;
                    return true;
                }
                if (~class12.field280 == -3) {
                    class67 var157 = class112.field2558.method1110(false);
                    Object[] var158 = new Object[1 + var157.method539(2618)];
                    for (int var159 = var157.method539(arg0 + 2617) + -1; ~var159 <= -1; --var159) {
                        if (var157.method515(var159, 255) == 115) {
                            var158[var159 - -1] = class112.field2558.method1110(false);
                        } else {
                            var158[var159 + 1] = new Integer(class112.field2558.method1118(4));
                        }
                    }
                    var158[0] = new Integer(class112.field2558.method1118(4));
                    class112.method853((class33) null, var158, false, 0, 0, 0, (class33) null);
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 191) {
                    int var160 = class112.field2558.method1073(126);
                    int var161 = class112.field2558.method1082((byte) -112);
                    int var162 = class112.field2558.method1116(arg0 ^ 254);
                    class33 var163 = class88.method685((byte) -123, var160);
                    var163.field750 = var163.field726 + var161;
                    var163.field813 = var163.field801 - -var162;
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -173) {
                    int var164 = class112.field2558.method1072(13);
                    int var165 = class112.field2558.method1105(255);
                    int var166 = class112.field2558.method1072(88);
                    class41.method350(var165, var166, (byte) -118, var164);
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 180) {
                    int var167 = class112.field2558.method1084(38);
                    if (var167 == 65535) {
                        var167 = -1;
                    }
                    class78.method624(var167, false);
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 45) {
                    int var168 = class112.field2558.method1084(96);
                    if (var168 == 65535) {
                        var168 = -1;
                    }
                    int var169 = class112.field2558.method1080(127);
                    class64.method497(87, var169, var168);
                    class12.field280 = -1;
                    return true;
                }
                if (~class12.field280 == -43) {
                    class5.field110 = class112.field2558.method1094(10);
                    class125.field2926 = class112.field2558.method1097(false);
                    for (int var170 = class125.field2926; var170 < class125.field2926 + 8; ++var170) {
                        for (int var171 = class5.field110; class5.field110 + 8 > var171; ++var171) {
                            if (class4.field67[class112.field2593][var170][var171] != null) {
                                class4.field67[class112.field2593][var170][var171] = null;
                                class82.method642(var171, 2028745255, var170);
                            }
                        }
                    }
                    for (class54 var172 = (class54) class49.field1174.method83(64); var172 != null; var172 = (class54) class49.field1174.method81(-118)) {
                        if (~class125.field2926 >= ~var172.field1287 && var172.field1287 < class125.field2926 + 8 && ~var172.field1294 <= ~class5.field110 && var172.field1294 < class5.field110 + 8 && class112.field2593 == var172.field1309) {
                            var172.field1286 = 0;
                        }
                    }
                    class12.field280 = -1;
                    return true;
                }
                if (class12.field280 == 208) {
                    class12.field280 = -1;
                    class29.field609 = 0;
                    return true;
                }
                if (~class12.field280 == -216) {
                    class48.field1158 = class112.field2558.method1094(arg0 ^ 11);
                    if (class48.field1158 == class131.field3089) {
                        class121.field2849 = true;
                        if (~class48.field1158 != -4) {
                            class131.field3089 = 3;
                        } else {
                            class131.field3089 = 1;
                        }
                    }
                    class12.field280 = -1;
                    return true;
                }
                class109.method832(arg0 ^ 99, (Throwable) null, "T1 - " + class12.field280 + "," + class20.field412 + "," + class134.field3198 + " - " + class133.field3166);
                class140.method1092(-52);
            } catch (IOException var176) {
                class93.method733((byte) 55);
            } catch (Exception var177) {
                String var174 = "T2 - " + class12.field280 + "," + class20.field412 + "," + class134.field3198 + " - " + class133.field3166 + "," + (class32.field685 - -class69.field1640.field1198[0]) + "," + (class69.field1640.field1263[0] + class30.field640) + " - ";
                for (int var175 = 0; ~class133.field3166 < ~var175 && var175 < 50; ++var175) {
                    var174 = var174 + class112.field2558.field3325[var175] + ",";
                }
                class109.method832(104, var177, var174);
                class140.method1092(-103);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(II)V", line = 2376)
    public final void method41(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method484((byte) 11, 108);
        }
        class38.method312(arg1, this.field1491, false);
        ++field1472;
    }
}
