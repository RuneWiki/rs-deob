import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class79 extends class63 {

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    private int field1479 = 0;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "Lta;")
    private class255 field1478 = new class255(16);

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    private int field1486 = 0;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "Lsg;")
    private class162 field1482 = new class162();

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "J")
    private long field1488 = 0L;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "Lje;")
    private class182 field1460;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "Z")
    private boolean field1485;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "Lsg;")
    private class162 field1483;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "Z")
    private boolean field1487;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "Lje;")
    private class182 field1465;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "Lel;")
    private class201 field1468;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Lqf;")
    private class244 field1450;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "Lqj;")
    private class146 field1473;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Z")
    public static boolean field1456 = false;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Lcc;")
    public static class209 field1453 = class95.method669(116, "Chargement en cours)3 Veuillez patienter)3");

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
    public static int field1471 = 0;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "Lbe;")
    private class28 field1451;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "Lsj;")
    public static class49 field1472;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "Z")
    private boolean field1484;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "[B")
    private byte[] field1458;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "[I")
    public static int[] field1464;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
    public final void method550(int arg0) {
        if (arg0 != 27551) {
            this.method552(false);
        }
        field1463++;
        if (this.field1460 != null) {
            this.field1484 = true;
            if (this.field1483 == null) {
                this.field1483 = new class162();
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)V")
    public final void method474(int arg0, int arg1) {
        field1470++;
        if (this.field1460 == null) {
            return;
        }
        for (class34 var3 = this.field1482.method1119(20896); var3 != null; var3 = this.field1482.method1120(94)) {
            if (((long) arg1) == var3.field596) {
                return;
            }
        }
        class34 var4 = new class34();
        if (arg0 <= -10) {
            var4.field596 = (long) arg1;
            this.field1482.method1123(var4, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)I")
    public final int method551(boolean arg0) {
        if (!arg0) {
            this.method550(-119);
        }
        field1474++;
        return this.field1479;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)V")
    public final void method552(boolean arg0) {
        if (!arg0) {
            this.field1473 = null;
        }
        field1459++;
        if (this.field1483 == null || this.method473((byte) -11) == null) {
            return;
        }
        for (class34 var2 = this.field1482.method1119(20896); var2 != null; var2 = this.field1482.method1120(91)) {
            int var3 = (int) var2.field596;
            if (var3 < 0 || this.field1451.field502 <= var3 || this.field1451.field514[var3] == 0) {
                var2.method269(-214950896);
            } else {
                if (this.field1458[var3] == 0) {
                    this.method553(var3, -2, 1);
                }
                if (this.field1458[var3] == -1) {
                    this.method553(var3, -2, 2);
                }
                if (this.field1458[var3] == 1) {
                    var2.method269(-214950896);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZI)[B")
    public final byte[] method471(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        }
        field1461++;
        class146 var3 = this.method553(arg1, -2, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method12(false);
            var3.method269(-214950896);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)I")
    public final int method467(int arg0, boolean arg1) {
        field1454++;
        class146 var3 = (class146) this.field1478.method1755((long) arg0, (byte) -66);
        if (arg1) {
            return 73;
        } else if (var3 == null) {
            return 0;
        } else {
            return var3.method11(100);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)Lqj;")
    private final class146 method553(int arg0, int arg1, int arg2) {
        field1477++;
        if (arg1 != -2) {
            return null;
        }
        class146 var4 = (class146) this.field1478.method1755((long) arg0, (byte) -111);
        if (var4 != null && arg2 == 0 && !var4.field2682 && var4.field2685) {
            var4.method269(arg1 ^ 0xCCFE3EE);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field1460 == null || this.field1458[arg0] == -1) {
                    if (this.field1468.method1381((byte) 109)) {
                        return null;
                    }
                    var4 = this.field1468.method1377(arg0, this.field1475, true, 91, (byte) 2);
                } else {
                    var4 = this.field1450.method1703(this.field1460, ~arg1, arg0);
                }
            } else if (arg2 == 1) {
                if (this.field1460 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field1450.method1701(arg0, this.field1460, (byte) 118);
            } else if (arg2 == 2) {
                if (this.field1460 == null) {
                    throw new RuntimeException();
                }
                if (this.field1458[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field1468.method1388((byte) 26)) {
                    return null;
                }
                var4 = this.field1468.method1377(arg0, this.field1475, false, 20, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field1478.method1762(var4, (long) arg0, (byte) 73);
        }
        if (var4.field2685) {
            return null;
        }
        byte[] var5 = var4.method12(false);
        if (!var4 instanceof class207) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class227.field4145.reset();
                class227.field4145.update(var5, 0, var5.length - 2);
                int var6 = (int) class227.field4145.getValue();
                if (this.field1451.field509[arg0] != var6) {
                    throw new RuntimeException();
                }
                this.field1468.field3631 = 0;
                this.field1468.field3633 = 0;
            } catch (RuntimeException var12) {
                this.field1468.method1389(96);
                var4.method269(-214950896);
                if (var4.field2682 && !this.field1468.method1381((byte) -50)) {
                    class3 var7 = this.field1468.method1377(arg0, this.field1475, true, 41, (byte) 2);
                    this.field1478.method1762(var7, (long) arg0, (byte) 73);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field1451.field497[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field1451.field497[arg0];
            if (this.field1460 != null) {
                this.field1450.method1697(var5, arg0, false, this.field1460);
                if (this.field1458[arg0] != 1) {
                    this.field1479++;
                    this.field1458[arg0] = 1;
                }
            }
            if (!var4.field2682) {
                var4.method269(-214950896);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class227.field4145.reset();
            class227.field4145.update(var5, 0, var5.length - 2);
            int var8 = (int) class227.field4145.getValue();
            if (this.field1451.field509[arg0] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field1451.field497[arg0] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field1458[arg0] != 1) {
                this.field1479++;
                this.field1458[arg0] = 1;
            }
            if (!var4.field2682) {
                var4.method269(-214950896);
            }
            return var4;
        } catch (Exception var11) {
            this.field1458[arg0] = -1;
            var4.method269(-214950896);
            if (var4.field2682 && !this.field1468.method1381((byte) -68)) {
                class3 var10 = this.field1468.method1377(arg0, this.field1475, true, 108, (byte) 2);
                this.field1478.method1762(var10, (long) arg0, (byte) 73);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)Lcc;")
    public static final class209 method554(int arg0, int arg1) {
        if (arg0 != -30159) {
            field1467 = -14;
        }
        field1466++;
        class209 var2 = new class209();
        var2.field3811 = 0;
        var2.field3786 = new byte[arg1];
        return var2;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
    public final void method555(byte arg0) {
        if (arg0 != 45) {
            method557(-46);
        }
        field1452++;
        if (this.field1483 != null) {
            if (this.method473((byte) -11) == null) {
                return;
            }
            if (this.field1485) {
                boolean var6 = true;
                for (class34 var7 = this.field1483.method1119(20896); var7 != null; var7 = this.field1483.method1120(46)) {
                    int var9 = (int) var7.field596;
                    if (this.field1458[var9] == 0) {
                        this.method553(var9, -2, 1);
                    }
                    if (this.field1458[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method269(-214950896);
                    }
                }
                while (this.field1451.field514.length > this.field1486) {
                    if (this.field1451.field514[this.field1486] == 0) {
                        this.field1486++;
                    } else {
                        if (this.field1450.field4435 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field1458[this.field1486] == 0) {
                            this.method553(this.field1486, -2, 1);
                        }
                        if (this.field1458[this.field1486] == 0) {
                            var6 = false;
                            class34 var8 = new class34();
                            var8.field596 = (long) this.field1486;
                            this.field1483.method1123(var8, (byte) -128);
                        }
                        this.field1486++;
                    }
                }
                if (var6) {
                    this.field1486 = 0;
                    this.field1485 = false;
                }
            } else if (this.field1484) {
                boolean var2 = true;
                for (class34 var3 = this.field1483.method1119(20896); var3 != null; var3 = this.field1483.method1120(98)) {
                    int var5 = (int) var3.field596;
                    if (this.field1458[var5] != 1) {
                        this.method553(var5, -2, 2);
                    }
                    if (this.field1458[var5] == 1) {
                        var3.method269(-214950896);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field1486 < this.field1451.field514.length) {
                    if (this.field1451.field514[this.field1486] == 0) {
                        this.field1486++;
                    } else {
                        if (this.field1468.method1388((byte) 26)) {
                            var2 = false;
                            break;
                        }
                        if (this.field1458[this.field1486] != 1) {
                            this.method553(this.field1486, arg0 ^ 0xFFFFFFD3, 2);
                        }
                        if (this.field1458[this.field1486] != 1) {
                            class34 var4 = new class34();
                            var4.field596 = (long) this.field1486;
                            var2 = false;
                            this.field1483.method1123(var4, (byte) -128);
                        }
                        this.field1486++;
                    }
                }
                if (var2) {
                    this.field1486 = 0;
                    this.field1484 = false;
                }
            } else {
                this.field1483 = null;
            }
        }
        if (!this.field1487 || class180.method1236(arg0 + 53) < this.field1488) {
            return;
        }
        for (class146 var10 = (class146) this.field1478.method1759((byte) 43); var10 != null; var10 = (class146) this.field1478.method1767((byte) 41)) {
            if (!var10.field2685) {
                if (var10.field2693) {
                    if (!var10.field2682) {
                        throw new RuntimeException();
                    }
                    var10.method269(-214950896);
                } else {
                    var10.field2693 = true;
                }
            }
        }
        this.field1488 = class180.method1236(-56) + 1000L;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(II)Lcc;")
    public static final class209 method556(int arg0, int arg1) {
        field1455++;
        class209 var2 = class66.method485(arg0, (byte) 57);
        for (int var3 = var2.method1486(5) - 3; var3 > 0; var3 -= 3) {
            var2 = class229.method1604(new class209[] { var2.method1466(127, var3, 0), class197.field3530, var2.method1461(-86, var3) }, (byte) 58);
        }
        int var4 = -2 / ((arg1 - 66) / 49);
        if (var2.method1486(5) > 9) {
            return class229.method1604(new class209[] { class87.field1740, var2.method1466(127, var2.method1486(5) - 8, 0), class76.field1426, class198.field3553, var2, class230.field4172 }, (byte) 49);
        } else if (var2.method1486(5) > 6) {
            return class229.method1604(new class209[] { class146.field2688, var2.method1466(121, var2.method1486(5) - 4, 0), class176.field3221, class198.field3553, var2, class230.field4172 }, (byte) 84);
        } else {
            return class229.method1604(new class209[] { class210.field3817, var2, class13.field249 }, (byte) 54);
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V")
    public static void method557(int arg0) {
        field1464 = null;
        field1472 = null;
        if (arg0 != 255) {
            method556(98, -110);
        }
        field1453 = null;
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)I")
    public final int method558(int arg0) {
        if (arg0 != -13104) {
            this.method474(60, -104);
        }
        field1448++;
        if (this.field1451 == null) {
            return 0;
        } else if (this.field1485) {
            class34 var2 = this.field1483.method1119(20896);
            return var2 == null ? 0 : (int) var2.field596;
        } else {
            return this.field1451.field498;
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)I")
    public final int method559(byte arg0) {
        if (arg0 <= 23) {
            field1453 = null;
        }
        field1462++;
        return this.field1451 == null ? 0 : this.field1451.field498;
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)I")
    public final int method560(int arg0) {
        if (arg0 != 0) {
            this.method553(3, -49, 77);
        }
        field1449++;
        if (this.method473((byte) -11) == null) {
            return this.field1473 == null ? 0 : this.field1473.method11(100);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)Lbe;")
    public final class28 method473(byte arg0) {
        field1476++;
        if (this.field1451 != null) {
            return this.field1451;
        }
        if (this.field1473 == null) {
            if (this.field1468.method1381((byte) 92)) {
                return null;
            }
            this.field1473 = this.field1468.method1377(this.field1475, 255, true, 98, (byte) 0);
        }
        if (this.field1473.field2685) {
            return null;
        } else if (arg0 == -11) {
            byte[] var2 = this.field1473.method12(false);
            if (this.field1473 instanceof class207) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field1451 = new class28(var2, this.field1457);
                    if (this.field1451.field506 != this.field1481) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field1451 = null;
                    if (this.field1468.method1381((byte) -58)) {
                        this.field1473 = null;
                    } else {
                        this.field1473 = this.field1468.method1377(this.field1475, 255, true, 32, (byte) 0);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field1451 = new class28(var2, this.field1457);
                } catch (RuntimeException var4) {
                    this.field1468.method1389(117);
                    this.field1451 = null;
                    if (this.field1468.method1381((byte) 125)) {
                        this.field1473 = null;
                    } else {
                        this.field1473 = this.field1468.method1377(this.field1475, 255, true, arg0 + 136, (byte) 0);
                    }
                    return null;
                }
                if (this.field1465 != null) {
                    this.field1450.method1697(var2, this.field1475, false, this.field1465);
                }
            }
            if (this.field1460 != null) {
                this.field1479 = 0;
                this.field1458 = new byte[this.field1451.field502];
            }
            this.field1473 = null;
            return this.field1451;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)V")
    public static final void method561(int arg0, byte arg1) {
        field1480++;
        if (arg1 != 69) {
            field1464 = null;
        }
        class195 var2 = class178.method1229(arg0, 6, 17);
        var2.method1340(true);
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(ILje;Lje;Lel;Lqf;IIZ)V")
    public class79(int arg0, class182 arg1, class182 arg2, class201 arg3, class244 arg4, int arg5, int arg6, boolean arg7) {
        this.field1475 = arg0;
        this.field1460 = arg1;
        if (this.field1460 == null) {
            this.field1485 = false;
        } else {
            this.field1485 = true;
            this.field1483 = new class162();
        }
        this.field1457 = arg5;
        this.field1487 = arg7;
        this.field1465 = arg2;
        this.field1481 = arg6;
        this.field1468 = arg3;
        this.field1450 = arg4;
        if (this.field1465 != null) {
            this.field1473 = this.field1450.method1703(this.field1465, 1, this.field1475);
        }
    }
}
