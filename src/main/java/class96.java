import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class96 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    private int field1510 = 0;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    private int field1519 = -1;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Lgw;")
    private class118 field1516 = new class118();

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "Z")
    public boolean field1528 = false;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    private int field1518;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    private int field1509;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "[[[I")
    private int[][][] field1513;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "[Lcl;")
    private class179[] field1512;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lbd;")
    public static class44 field1515 = new class44("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "[[I")
    public static int[][] field1521 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field1520 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Lbd;")
    public static class44 field1522 = new class44("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "Lci;")
    public static class320 field1527;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "Lgj;")
    public static class457 field1526;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 4)
    public static final void method729(byte arg0) {
        if (class359.method2227(class37.field799, (byte) -40) || class275.method1773(class37.field799, 60)) {
            client.method1388(5000, 125, class315.field4688 >> 10, class397.field5649 >> 10);
        } else {
            int var1 = class364.field5293.field343[0] >> 3;
            int var2 = class364.field5293.field344[0] >> 3;
            if (var1 >= 0 && class69.field1139 >> 3 > var1 && var2 >= 0 && class255.field3763 >> 3 > var2) {
                client.method1388(5000, 87, var1, var2);
            } else {
                client.method1388(0, 24, class69.field1139 >> 4, class255.field3763 >> 4);
            }
        }
        field1523++;
        if (arg0 < -60) {
            class414.method2472(117);
            class133.method973(true);
            class528.method3135(53);
            class167.method1194(31);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V", line = 35)
    public final void method730(byte arg0) {
        int var2 = 0;
        if (arg0 != 40) {
            method731(-106);
        }
        while (var2 < this.field1509) {
            this.field1513[var2][0] = null;
            this.field1513[var2][1] = null;
            this.field1513[var2][2] = null;
            this.field1513[var2] = null;
            var2++;
        }
        field1517++;
        this.field1512 = null;
        this.field1513 = null;
        this.field1516.method861(-1);
        this.field1516 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 62)
    public static void method731(int arg0) {
        field1526 = null;
        if (arg0 != 31551) {
            field1520 = null;
        }
        field1515 = null;
        field1520 = null;
        field1522 = null;
        field1521 = null;
        field1527 = null;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(III)V", line = 402)
    public class96(int arg0, int arg1, int arg2) {
        this.field1518 = arg1;
        this.field1509 = arg0;
        this.field1513 = new int[this.field1509][3][arg2];
        this.field1512 = new class179[this.field1518];
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 84)
    public static final void method732(int arg0) {
        field1511++;
        if (class220.field3371.method1050(31659, class74.field1211) != 2) {
            return;
        }
        byte var1 = (byte) (class110.field1635 - 4 & 0xFF);
        int var2 = class110.field1635 % class69.field1139;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class255.field3763; var16++) {
                class386.field5507[var3][var2][var16] = var1;
            }
        }
        if (class123.field1944 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class485.field7032[var4] = -1000000;
            class319.field4733[var4] = 1000000;
            class408.field5785[var4] = 0;
            class477.field6944[var4] = 1000000;
            class7.field51[var4] = 0;
        }
        if (class294.field4381 == 1) {
            if ((class234.field3497[class123.field1944][class364.field5293.field6961 >> 7][class364.field5293.field6965 >> 7] & 0x4) != 0) {
                class438.method2577(0, class461.field6675, (byte) -121, false, class364.field5293.field6965 >> 7, class364.field5293.field6961 >> 7);
            }
            if (class254.field3756 < 2560) {
                int var6 = class315.field4688 >> 7;
                int var7 = class397.field5649 >> 7;
                int var8 = class364.field5293.field6961 >> 7;
                int var9 = class364.field5293.field6965 >> 7;
                int var10;
                if (var8 > var6) {
                    var10 = var8 - var6;
                } else {
                    var10 = var6 - var8;
                }
                int var11;
                if (var7 < var9) {
                    var11 = var9 - var7;
                } else {
                    var11 = var7 - var9;
                }
                if (var10 == 0 && var11 == 0 || var10 <= -class69.field1139 || class69.field1139 <= var10 || var11 <= -class255.field3763 || class255.field3763 <= var11) {
                    class266.method1710((byte) 81, null, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class82.field1315 + "," + class501.field7240);
                    return;
                }
                if (var11 >= var10) {
                    int var12 = var10 * 65536 / var11;
                    int var13 = 32768;
                    while (var7 != var9) {
                        if (var7 < var9) {
                            var7++;
                        } else if (var9 < var7) {
                            var7--;
                        }
                        if ((class234.field3497[class123.field1944][var6][var7] & 0x4) != 0) {
                            class438.method2577(1, class461.field6675, (byte) 125, false, var7, var6);
                            break;
                        }
                        var13 += var12;
                        if (var13 >= 65536) {
                            if (var8 > var6) {
                                var6++;
                            } else if (var6 > var8) {
                                var6--;
                            }
                            var13 -= 65536;
                            if ((class234.field3497[class123.field1944][var6][var7] & 0x4) != 0) {
                                class438.method2577(1, class461.field6675, (byte) -10, false, var7, var6);
                                break;
                            }
                        }
                    }
                } else {
                    int var14 = var11 * 65536 / var10;
                    int var15 = 32768;
                    while (var6 != var8) {
                        if (var8 > var6) {
                            var6++;
                        } else if (var8 < var6) {
                            var6--;
                        }
                        if ((class234.field3497[class123.field1944][var6][var7] & 0x4) != 0) {
                            class438.method2577(1, class461.field6675, (byte) -114, false, var7, var6);
                            break;
                        }
                        var15 += var14;
                        if (var15 >= 65536) {
                            if (var9 > var7) {
                                var7++;
                            } else if (var7 > var9) {
                                var7--;
                            }
                            var15 -= 65536;
                            if ((class234.field3497[class123.field1944][var6][var7] & 0x4) != 0) {
                                class438.method2577(1, class461.field6675, (byte) 80, false, var7, var6);
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            int var5 = class224.method1515(class315.field4688, class397.field5649, class123.field1944, -631749433);
            if ((var5 - class62.field1086) < 800 && (class234.field3497[class123.field1944][class315.field4688 >> 7][class397.field5649 >> 7] & 0x4) != 0) {
                class438.method2577(1, class461.field6675, (byte) 74, false, class397.field5649 >> 7, class315.field4688 >> 7);
            }
        }
        if (arg0 != -19490) {
            method729((byte) 116);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)[[I", line = 275)
    public final int[][] method733(int arg0, int arg1) {
        field1514++;
        if (arg1 != -16963) {
            this.method733(-36, -90);
        }
        if (this.field1518 == this.field1509) {
            this.field1528 = this.field1512[arg0] == null;
            this.field1512[arg0] = class271.field4079;
            return this.field1513[arg0];
        } else if (this.field1509 == 1) {
            this.field1528 = this.field1519 != arg0;
            this.field1519 = arg0;
            return this.field1513[0];
        } else {
            class179 var3 = this.field1512[arg0];
            if (var3 == null) {
                this.field1528 = true;
                if (this.field1509 > this.field1510) {
                    var3 = new class179(arg0, this.field1510);
                    this.field1510++;
                } else {
                    class179 var4 = (class179) this.field1516.method856(126);
                    var3 = new class179(arg0, var4.field2656);
                    this.field1512[var4.field2654] = null;
                    var4.method421(22071);
                }
                this.field1512[arg0] = var3;
            } else {
                this.field1528 = false;
            }
            this.field1516.method853(-12691, var3);
            return this.field1513[var3.field2656];
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)[[[I", line = 355)
    public final int[][][] method734(int arg0) {
        field1525++;
        if (arg0 < 49) {
            return null;
        } else if (this.field1518 == this.field1509) {
            for (int var2 = 0; var2 < this.field1509; var2++) {
                this.field1512[var2] = class271.field4079;
            }
            return this.field1513;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }
}
