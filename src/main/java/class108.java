import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class108 extends class397 {

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    private int field1457 = 0;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "Lqi;")
    private class406 field1473 = new class406(16);

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    private int field1485 = 0;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "Lam;")
    private class455 field1489 = new class455();

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "J")
    private long field1491 = 0L;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lwk;")
    private class97 field1462;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    private int field1472;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "Z")
    private boolean field1484;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "Lam;")
    private class455 field1487;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "Lkv;")
    private class180 field1482;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "Lwk;")
    private class97 field1469;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "Z")
    private boolean field1490;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "Lwd;")
    private class183 field1478;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    private int field1474;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "Lse;")
    private class172 field1477;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "Leh;")
    public static class246 field1475 = new class246(23, 2);

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Lvv;")
    private class217 field1463;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "Z")
    private boolean field1488;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "[B")
    private byte[] field1460;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V")
    public final void method733(int arg0, byte arg1) {
        if (arg1 != 50) {
            this.field1491 = -59L;
        }
        field1470++;
        if (this.field1462 == null) {
            return;
        }
        for (class498 var3 = this.field1489.method2655(15152); var3 != null; var3 = this.field1489.method2660((byte) 67)) {
            if ((long) arg0 == var3.field7060) {
                return;
            }
        }
        class498 var4 = new class498();
        var4.field7060 = arg0;
        this.field1489.method2657(8492, var4);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public final void method734(byte arg0) {
        field1467++;
        if (this.field1462 == null) {
            return;
        }
        this.field1488 = true;
        if (arg0 != 53) {
            this.method736(-61, true);
        }
        if (this.field1487 == null) {
            this.field1487 = new class455();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)I")
    public final int method735(boolean arg0) {
        field1481++;
        if (arg0) {
            this.method741(-46);
        }
        if (this.field1463 == null) {
            return 0;
        } else if (this.field1484) {
            class498 var2 = this.field1487.method2655(15152);
            return var2 == null ? 0 : (int) var2.field7060;
        } else {
            return this.field1463.field3145;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)[B")
    public final byte[] method736(int arg0, boolean arg1) {
        field1465++;
        class172 var3 = this.method748(0, arg0, false);
        if (var3 == null) {
            return null;
        } else if (arg1) {
            byte[] var4 = var3.method1073(-67);
            var3.method2891(44);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZZB)V")
    public static final void method737(boolean arg0, boolean arg1, byte arg2) {
        if (arg1) {
            class422.field5950++;
            class291.method1806((byte) 62);
        }
        field1471++;
        if (arg0) {
            class267.field3899++;
            class234.method1434((byte) -122);
        }
        int var3 = -34 % ((-arg2 - 14) / 44);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBII)V")
    public static final void method738(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1483++;
        for (int var5 = 0; var5 < class449.field6257; var5++) {
            Rectangle var6 = class95.field1226[var5];
            if ((var6.x + var6.width) > arg1 && arg1 + arg4 > var6.x && var6.y + var6.height > arg0 && arg0 + arg3 > var6.y) {
                class306.field4450[var5] = true;
            }
        }
        if (arg2 < 17) {
            field1475 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)I")
    public final int method739(int arg0) {
        if (arg0 != 100) {
            this.field1469 = null;
        }
        field1468++;
        return this.field1457;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
    public final void method740(byte arg0) {
        field1459++;
        if (this.field1487 == null || this.method743(65535) == null) {
            return;
        }
        for (class498 var2 = this.field1489.method2655(15152); var2 != null; var2 = this.field1489.method2660((byte) 67)) {
            int var3 = (int) var2.field7060;
            if (var3 < 0 || this.field1463.field3133 <= var3 || this.field1463.field3142[var3] == 0) {
                var2.method2891(-128);
            } else {
                if (this.field1460[var3] == 0) {
                    this.method748(1, var3, false);
                }
                if (this.field1460[var3] == -1) {
                    this.method748(2, var3, false);
                }
                if (this.field1460[var3] == 1) {
                    var2.method2891(-124);
                }
            }
        }
        if (arg0 != 39) {
            this.field1462 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)I")
    public final int method741(int arg0) {
        field1464++;
        if (arg0 <= 6) {
            return -25;
        } else if (this.method743(65535) == null) {
            return this.field1477 == null ? 0 : this.field1477.method1078(100);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILwm;)V")
    public static final void method742(int arg0, class403 arg1) {
        if (arg0 < 35) {
            field1475 = null;
        }
        for (int var2 = 0; var2 < class204.field2901; var2++) {
            int var3 = arg1.method2325(true);
            int var4 = arg1.method2338(0);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class429.field6045[var3] != null) {
                class429.field6045[var3].field3417 = var4;
            }
        }
        field1476++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)Lvv;")
    public final class217 method743(int arg0) {
        field1480++;
        if (this.field1463 != null) {
            return this.field1463;
        }
        if (arg0 != 65535) {
            this.method741(24);
        }
        if (this.field1477 == null) {
            if (this.field1478.method1152(20)) {
                return null;
            }
            this.field1477 = this.field1478.method1149((byte) 0, this.field1472, (byte) 127, true, 255);
        }
        if (this.field1477.field2496) {
            return null;
        }
        byte[] var2 = this.field1477.method1073(-47);
        if (this.field1477 instanceof class294) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1463 = new class217(var2, this.field1461);
                if (this.field1463.field3136 != this.field1474) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field1463 = null;
                if (this.field1478.method1152(arg0 - 65515)) {
                    this.field1477 = null;
                } else {
                    this.field1477 = this.field1478.method1149((byte) 0, this.field1472, (byte) 127, true, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1463 = new class217(var2, this.field1461);
            } catch (RuntimeException var4) {
                this.field1478.method1160(0);
                this.field1463 = null;
                if (this.field1478.method1152(20)) {
                    this.field1477 = null;
                } else {
                    this.field1477 = this.field1478.method1149((byte) 0, this.field1472, (byte) 127, true, 255);
                }
                return null;
            }
            if (this.field1469 != null) {
                this.field1482.method1121(this.field1469, this.field1472, var2, arg0 ^ 0xFFFD);
            }
        }
        if (this.field1462 != null) {
            this.field1460 = new byte[this.field1463.field3133];
            this.field1457 = 0;
        }
        this.field1477 = null;
        return this.field1463;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(IB)I")
    public final int method744(int arg0, byte arg1) {
        field1479++;
        if (arg1 >= -88) {
            return 1;
        } else {
            class172 var3 = (class172) this.field1473.method2405((long) arg0, -78);
            return var3 == null ? 0 : var3.method1078(100);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
    public final void method745(boolean arg0) {
        field1456++;
        if (arg0) {
            return;
        }
        if (this.field1487 != null) {
            if (this.method743(65535) == null) {
                return;
            }
            if (this.field1484) {
                boolean var6 = true;
                for (class498 var7 = this.field1487.method2655(15152); var7 != null; var7 = this.field1487.method2660((byte) 67)) {
                    int var9 = (int) var7.field7060;
                    if (this.field1460[var9] == 0) {
                        this.method748(1, var9, arg0);
                    }
                    if (this.field1460[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method2891(17);
                    }
                }
                while (this.field1463.field3142.length > this.field1485) {
                    if (this.field1463.field3142[this.field1485] == 0) {
                        this.field1485++;
                    } else {
                        if (this.field1482.field2586 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field1460[this.field1485] == 0) {
                            this.method748(1, this.field1485, arg0);
                        }
                        if (this.field1460[this.field1485] == 0) {
                            class498 var8 = new class498();
                            var8.field7060 = this.field1485;
                            this.field1487.method2657(8492, var8);
                            var6 = false;
                        }
                        this.field1485++;
                    }
                }
                if (var6) {
                    this.field1485 = 0;
                    this.field1484 = false;
                }
            } else if (this.field1488) {
                boolean var2 = true;
                for (class498 var3 = this.field1487.method2655(15152); var3 != null; var3 = this.field1487.method2660((byte) 67)) {
                    int var5 = (int) var3.field7060;
                    if (this.field1460[var5] != 1) {
                        this.method748(2, var5, false);
                    }
                    if (this.field1460[var5] == 1) {
                        var3.method2891(-128);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field1485 < this.field1463.field3142.length) {
                    if (this.field1463.field3142[this.field1485] == 0) {
                        this.field1485++;
                    } else {
                        if (this.field1478.method1153((byte) -17)) {
                            var2 = false;
                            break;
                        }
                        if (this.field1460[this.field1485] != 1) {
                            this.method748(2, this.field1485, false);
                        }
                        if (this.field1460[this.field1485] != 1) {
                            class498 var4 = new class498();
                            var4.field7060 = this.field1485;
                            var2 = false;
                            this.field1487.method2657(8492, var4);
                        }
                        this.field1485++;
                    }
                }
                if (var2) {
                    this.field1485 = 0;
                    this.field1488 = false;
                }
            } else {
                this.field1487 = null;
            }
        }
        if (!this.field1490 || class465.method2699((byte) 14) < this.field1491) {
            return;
        }
        for (class172 var10 = (class172) this.field1473.method2414((byte) -128); var10 != null; var10 = (class172) this.field1473.method2410((byte) 118)) {
            if (!var10.field2496) {
                if (var10.field2493) {
                    if (!var10.field2494) {
                        throw new RuntimeException();
                    }
                    var10.method2891(-124);
                } else {
                    var10.field2493 = true;
                }
            }
        }
        this.field1491 = class465.method2699((byte) 14) + 1000L;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)I")
    public final int method746(int arg0) {
        field1458++;
        if (this.field1463 == null) {
            return 0;
        } else {
            int var2 = -6 % ((-arg0 - 57) / 52);
            return this.field1463.field3145;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V")
    public static void method747(byte arg0) {
        field1475 = null;
        int var1 = -26 % ((arg0 + 25) / 63);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZ)Lse;")
    private final class172 method748(int arg0, int arg1, boolean arg2) {
        field1466++;
        class172 var4 = (class172) this.field1473.method2405((long) arg1, -88);
        if (var4 != null && arg0 == 0 && !var4.field2494 && var4.field2496) {
            var4.method2891(-124);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field1462 == null || this.field1460[arg1] == -1) {
                    if (this.field1478.method1152(20)) {
                        return null;
                    }
                    var4 = this.field1478.method1149((byte) 2, arg1, (byte) 127, true, this.field1472);
                } else {
                    var4 = this.field1482.method1118(-11165, this.field1462, arg1);
                }
            } else if (arg0 == 1) {
                if (this.field1462 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field1482.method1122(this.field1462, !arg2, arg1);
            } else if (arg0 == 2) {
                if (this.field1462 == null) {
                    throw new RuntimeException();
                }
                if (this.field1460[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field1478.method1153((byte) -46)) {
                    return null;
                }
                var4 = this.field1478.method1149((byte) 2, arg1, (byte) 127, false, this.field1472);
            } else {
                throw new RuntimeException();
            }
            this.field1473.method2413((long) arg1, var4, -1);
        }
        if (var4.field2496) {
            return null;
        }
        byte[] var5 = var4.method1073(-90);
        if (arg2) {
            this.method736(-38, true);
        }
        if (!var4 instanceof class294) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class14.field184.reset();
                class14.field184.update(var5, 0, var5.length - 2);
                int var9 = (int) class14.field184.getValue();
                if (this.field1463.field3143[arg1] != var9) {
                    throw new RuntimeException();
                }
                this.field1478.field2640 = 0;
                this.field1478.field2638 = 0;
            } catch (RuntimeException var12) {
                this.field1478.method1160(0);
                var4.method2891(75);
                if (var4.field2494 && !this.field1478.method1152(20)) {
                    class207 var10 = this.field1478.method1149((byte) 2, arg1, (byte) 127, true, this.field1472);
                    this.field1473.method2413((long) arg1, var10, -1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field1463.field3146[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field1463.field3146[arg1];
            if (this.field1462 != null) {
                this.field1482.method1121(this.field1462, arg1, var5, 2);
                if (this.field1460[arg1] != 1) {
                    this.field1457++;
                    this.field1460[arg1] = 1;
                }
            }
            if (!var4.field2494) {
                var4.method2891(39);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class14.field184.reset();
            class14.field184.update(var5, 0, var5.length - 2);
            int var6 = (int) class14.field184.getValue();
            if (this.field1463.field3143[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field1463.field3146[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field1460[arg1] != 1) {
                this.field1457++;
                this.field1460[arg1] = 1;
            }
            if (!var4.field2494) {
                var4.method2891(-122);
            }
            return var4;
        } catch (Exception var11) {
            this.field1460[arg1] = -1;
            var4.method2891(92);
            if (var4.field2494 && !this.field1478.method1152(20)) {
                class207 var8 = this.field1478.method1149((byte) 2, arg1, (byte) 127, true, this.field1472);
                this.field1473.method2413((long) arg1, var8, -1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(ILwk;Lwk;Lwd;Lkv;IIZ)V")
    public class108(int arg0, class97 arg1, class97 arg2, class183 arg3, class180 arg4, int arg5, int arg6, boolean arg7) {
        this.field1462 = arg1;
        this.field1472 = arg0;
        if (this.field1462 == null) {
            this.field1484 = false;
        } else {
            this.field1484 = true;
            this.field1487 = new class455();
        }
        this.field1482 = arg4;
        this.field1469 = arg2;
        this.field1490 = arg7;
        this.field1478 = arg3;
        this.field1474 = arg6;
        this.field1461 = arg5;
        if (this.field1469 != null) {
            this.field1477 = this.field1482.method1118(-11165, this.field1469, this.field1472);
        }
    }

    static {
        new class530(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
    }
}
