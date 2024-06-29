import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class90 extends class55 {

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    private int field1529 = 0;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Lvl;")
    private class164 field1512 = new class164(16);

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    private int field1534 = 0;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "Lci;")
    private class327 field1539 = new class327();

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "J")
    private long field1543 = 0L;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "Lja;")
    private class302 field1525;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    private int field1527;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "Z")
    private boolean field1535;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "Lci;")
    private class327 field1536;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "Lja;")
    private class302 field1528;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "Lea;")
    private class12 field1510;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "Lio;")
    private class353 field1523;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "Z")
    private boolean field1541;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Lcc;")
    private class84 field1516;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field1542 = 0;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "Lji;")
    public static class315 field1514 = new class315(5000);

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "Z")
    public static boolean field1544 = false;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "Lha;")
    private class221 field1522;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "Lth;")
    public static class57 field1546;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "Z")
    private boolean field1540;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "[B")
    private byte[] field1519;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "[I")
    public static int[] field1517;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "[[Lua;")
    public static class299[][] field1545;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I", line = 5)
    public final int method707(int arg0) {
        field1531++;
        if (arg0 != 2535) {
            this.method437((byte) 72);
        }
        if (this.method437((byte) -115) == null) {
            return this.field1516 == null ? 0 : this.field1516.method675((byte) 110);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)I", line = 26)
    public final int method708(int arg0) {
        field1507++;
        if (arg0 >= -30) {
            this.method438(-119, 12);
        }
        return this.field1529;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V", line = 40)
    public final void method709(byte arg0) {
        field1506++;
        if (this.field1536 == null || this.method437((byte) -115) == null) {
            return;
        }
        if (arg0 != 77) {
            field1544 = false;
        }
        for (class45 var2 = this.field1539.method2300((byte) 110); var2 != null; var2 = this.field1539.method2306(-23)) {
            int var3 = (int) var2.field698;
            if (var3 < 0 || this.field1522.field3589 <= var3 || this.field1522.field3605[var3] == 0) {
                var2.method330(15);
            } else {
                if (this.field1519[var3] == 0) {
                    this.method717(var3, 23289, 1);
                }
                if (this.field1519[var3] == -1) {
                    this.method717(var3, 23289, 2);
                }
                if (this.field1519[var3] == 1) {
                    var2.method330(arg0 - 62);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)Lha;", line = 85)
    public final class221 method437(byte arg0) {
        field1520++;
        if (this.field1522 != null) {
            return this.field1522;
        }
        if (this.field1516 == null) {
            if (this.field1510.method63(arg0 + 20959)) {
                return null;
            }
            this.field1516 = this.field1510.method66(true, (byte) -119, 255, this.field1527, (byte) 0);
        }
        if (this.field1516.field1434) {
            return null;
        }
        byte[] var2 = this.field1516.method676((byte) -126);
        if (this.field1516 instanceof class234) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1522 = new class221(var2, this.field1513);
                if (this.field1522.field3593 != this.field1533) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field1522 = null;
                if (this.field1510.method63(20844)) {
                    this.field1516 = null;
                } else {
                    this.field1516 = this.field1510.method66(true, (byte) -119, 255, this.field1527, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1522 = new class221(var2, this.field1513);
            } catch (RuntimeException var6) {
                this.field1510.method69(true);
                this.field1522 = null;
                if (this.field1510.method63(20844)) {
                    this.field1516 = null;
                } else {
                    this.field1516 = this.field1510.method66(true, (byte) -101, 255, this.field1527, (byte) 0);
                }
                return null;
            }
            if (this.field1528 != null) {
                this.field1523.method2498(this.field1528, var2, -60, this.field1527);
            }
        }
        this.field1516 = null;
        if (this.field1525 != null) {
            this.field1519 = new byte[this.field1522.field3589];
            this.field1529 = 0;
        }
        if (arg0 != -115) {
            this.method717(111, -32, 69);
        }
        return this.field1522;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)I", line = 197)
    public final int method710(int arg0) {
        field1521++;
        if (arg0 >= -125) {
            this.method716((byte) 44);
        }
        if (this.field1522 == null) {
            return 0;
        } else if (this.field1535) {
            class45 var2 = this.field1536.method2300((byte) 111);
            return var2 == null ? 0 : (int) var2.field698;
        } else {
            return this.field1522.field3598;
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)Z", line = 222)
    public static final boolean method711(int arg0) {
        field1526++;
        if (arg0 != -20904) {
            field1546 = (class57) null;
        }
        return class152.field2417 == 0 ? class36.field535.method1677((byte) 46) : true;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIII)I", line = 236)
    public static final int method712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < 93) {
            return 105;
        }
        if ((arg4 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg2;
            arg2 = var7;
        }
        int var8 = arg0 & 0x3;
        field1518++;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return 1 - (arg5 + arg6 - 7);
        } else if (var8 == 2) {
            return 7 + 1 - arg3 - arg2;
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I", line = 271)
    public final int method433(int arg0, int arg1) {
        field1508++;
        if (arg0 == 4931) {
            class84 var3 = (class84) this.field1512.method1268(arg0 ^ 0xFFFFECF3, (long) arg1);
            return var3 == null ? 0 : var3.method675((byte) 108);
        } else {
            return -43;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)[B", line = 288)
    public final byte[] method438(int arg0, int arg1) {
        field1515++;
        class84 var3 = this.method717(arg1, 23289, 0);
        if (var3 == null) {
            return null;
        }
        if (arg0 != 671) {
            this.method437((byte) 54);
        }
        byte[] var4 = var3.method676((byte) -84);
        var3.method330(15);
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V", line = 315)
    public static void method713(boolean arg0) {
        field1545 = (class299[][]) null;
        field1514 = null;
        field1517 = null;
        if (arg0) {
            field1546 = (class57) null;
        }
        field1546 = null;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V", line = 328)
    public final void method714(byte arg0) {
        field1505++;
        if (this.field1536 != null) {
            if (this.method437((byte) -115) == null) {
                return;
            }
            if (this.field1535) {
                boolean var2 = true;
                for (class45 var3 = this.field1536.method2300((byte) 106); var3 != null; var3 = this.field1536.method2306(-23)) {
                    int var4 = (int) var3.field698;
                    if (this.field1519[var4] == 0) {
                        this.method717(var4, 23289, 1);
                    }
                    if (this.field1519[var4] == 0) {
                        var2 = false;
                    } else {
                        var3.method330(15);
                    }
                }
                while (this.field1534 < this.field1522.field3605.length) {
                    if (this.field1522.field3605[this.field1534] == 0) {
                        this.field1534++;
                    } else {
                        if (this.field1523.field5610 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field1519[this.field1534] == 0) {
                            this.method717(this.field1534, 23289, 1);
                        }
                        if (this.field1519[this.field1534] == 0) {
                            var2 = false;
                            class45 var5 = new class45();
                            var5.field698 = (long) this.field1534;
                            this.field1536.method2302((byte) -114, var5);
                        }
                        this.field1534++;
                    }
                }
                if (var2) {
                    this.field1534 = 0;
                    this.field1535 = false;
                }
            } else if (this.field1540) {
                boolean var6 = true;
                for (class45 var7 = this.field1536.method2300((byte) 104); var7 != null; var7 = this.field1536.method2306(-23)) {
                    int var8 = (int) var7.field698;
                    if (this.field1519[var8] != 1) {
                        this.method717(var8, 23289, 2);
                    }
                    if (this.field1519[var8] == 1) {
                        var7.method330(15);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field1534 < this.field1522.field3605.length) {
                    if (this.field1522.field3605[this.field1534] == 0) {
                        this.field1534++;
                    } else {
                        if (this.field1510.method59(0)) {
                            var6 = false;
                            break;
                        }
                        if (this.field1519[this.field1534] != 1) {
                            this.method717(this.field1534, 23289, 2);
                        }
                        if (this.field1519[this.field1534] != 1) {
                            var6 = false;
                            class45 var9 = new class45();
                            var9.field698 = (long) this.field1534;
                            this.field1536.method2302((byte) -88, var9);
                        }
                        this.field1534++;
                    }
                }
                if (var6) {
                    this.field1534 = 0;
                    this.field1540 = false;
                }
            } else {
                this.field1536 = null;
            }
        }
        if (this.field1541 && class47.method371(-108) >= this.field1543) {
            for (class84 var10 = (class84) this.field1512.method1265(37); var10 != null; var10 = (class84) this.field1512.method1277((byte) -120)) {
                if (!var10.field1434) {
                    if (var10.field1428) {
                        if (!var10.field1425) {
                            throw new RuntimeException();
                        }
                        var10.method330(15);
                    } else {
                        var10.field1428 = true;
                    }
                }
            }
            this.field1543 = class47.method371(-113) + 1000L;
        }
        if (arg0 != 79) {
            this.method710(-2);
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(II)V", line = 504)
    public static final void method715(int arg0, int arg1) {
        field1532++;
        class208 var2 = class4.field38;
        synchronized (class4.field38) {
            class125.field2129 = arg0;
            if (arg1 != 12712) {
                field1542 = 100;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(B)I", line = 517)
    public final int method716(byte arg0) {
        field1509++;
        if (this.field1522 == null) {
            return 0;
        } else {
            int var2 = -85 % ((arg0 + 59) / 47);
            return this.field1522.field3598;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)Lcc;", line = 534)
    private final class84 method717(int arg0, int arg1, int arg2) {
        field1538++;
        if (arg1 != 23289) {
            this.method707(44);
        }
        class84 var4 = (class84) this.field1512.method1268(arg1 - 23383, (long) arg0);
        if (var4 != null && arg2 == 0 && !var4.field1425 && var4.field1434) {
            var4.method330(15);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field1525 == null || this.field1519[arg0] == -1) {
                    if (this.field1510.method63(arg1 ^ 0xB95)) {
                        return null;
                    }
                    var4 = this.field1510.method66(true, (byte) -125, this.field1527, arg0, (byte) 2);
                } else {
                    var4 = this.field1523.method2492(arg0, arg1 - 23286, this.field1525);
                }
            } else if (arg2 == 1) {
                if (this.field1525 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field1523.method2499(arg0, -118, this.field1525);
            } else if (arg2 == 2) {
                if (this.field1525 == null) {
                    throw new RuntimeException();
                }
                if (this.field1519[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field1510.method59(arg1 ^ 0x5AF9)) {
                    return null;
                }
                var4 = this.field1510.method66(false, (byte) -119, this.field1527, arg0, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field1512.method1273(1, (long) arg0, var4);
        }
        if (var4.field1434) {
            return null;
        }
        byte[] var5 = var4.method676((byte) -115);
        if (!var4 instanceof class234) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class209.field3294.reset();
                class209.field3294.update(var5, 0, var5.length - 2);
                int var6 = (int) class209.field3294.getValue();
                if (this.field1522.field3601[arg0] != var6) {
                    throw new RuntimeException();
                }
                this.field1510.field131 = 0;
                this.field1510.field133 = 0;
            } catch (RuntimeException var14) {
                this.field1510.method69(true);
                var4.method330(arg1 - 23274);
                if (var4.field1425 && !this.field1510.method63(20844)) {
                    class198 var8 = this.field1510.method66(true, (byte) -121, this.field1527, arg0, (byte) 2);
                    this.field1512.method1273(arg1 - 23288, (long) arg0, var8);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field1522.field3590[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field1522.field3590[arg0];
            if (this.field1525 != null) {
                this.field1523.method2498(this.field1525, var5, -44, arg0);
                if (this.field1519[arg0] != 1) {
                    this.field1529++;
                    this.field1519[arg0] = 1;
                }
            }
            if (!var4.field1425) {
                var4.method330(15);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class209.field3294.reset();
            class209.field3294.update(var5, 0, var5.length - 2);
            int var9 = (int) class209.field3294.getValue();
            if (this.field1522.field3601[arg0] != var9) {
                throw new RuntimeException();
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field1522.field3590[arg0] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field1519[arg0] != 1) {
                if (this.field1519[arg0] != 0) {
                }
                this.field1529++;
                this.field1519[arg0] = 1;
            }
            if (!var4.field1425) {
                var4.method330(arg1 - 23274);
            }
            return var4;
        } catch (Exception var13) {
            this.field1519[arg0] = -1;
            var4.method330(arg1 - 23274);
            if (var4.field1425 && !this.field1510.method63(arg1 - 2445)) {
                class198 var12 = this.field1510.method66(true, (byte) -101, this.field1527, arg0, (byte) 2);
                this.field1512.method1273(1, (long) arg0, var12);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V", line = 750)
    public final void method436(int arg0, int arg1) {
        field1511++;
        if (this.field1525 == null) {
            return;
        }
        for (class45 var3 = this.field1539.method2300((byte) 111); var3 != null; var3 = this.field1539.method2306(arg0 ^ 0xFFFFB0F5)) {
            if (((long) arg1) == var3.field698) {
                return;
            }
        }
        class45 var4 = new class45();
        if (arg0 == 20252) {
            var4.field698 = (long) arg1;
            this.field1539.method2302((byte) -127, var4);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII)I", line = 779)
    public static final int method718(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 2) {
            field1544 = false;
        }
        field1530++;
        if ((class178.field2856[arg3][arg2][arg0] & 0x8) == 0) {
            return arg3 <= 0 || (class178.field2856[1][arg2][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(B)V", line = 797)
    public final void method719(byte arg0) {
        field1537++;
        if (this.field1525 == null) {
            return;
        }
        this.field1540 = true;
        int var2 = 19 % ((arg0 + 33) / 46);
        if (this.field1536 == null) {
            this.field1536 = new class327();
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(ILja;Lja;Lea;Lio;IIZ)V", line = 854)
    public class90(int arg0, class302 arg1, class302 arg2, class12 arg3, class353 arg4, int arg5, int arg6, boolean arg7) {
        this.field1525 = arg1;
        this.field1527 = arg0;
        if (this.field1525 == null) {
            this.field1535 = false;
        } else {
            this.field1535 = true;
            this.field1536 = new class327();
        }
        this.field1528 = arg2;
        this.field1510 = arg3;
        this.field1513 = arg5;
        this.field1533 = arg6;
        this.field1523 = arg4;
        this.field1541 = arg7;
        if (this.field1528 != null) {
            this.field1516 = this.field1523.method2492(this.field1527, 3, this.field1528);
        }
    }
}
