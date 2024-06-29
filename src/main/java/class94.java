import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class94 extends class470 {

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    private int field1573 = 0;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "Lbu;")
    private class407 field1576 = new class407(16);

    @OriginalMember(owner = "client!hs", name = "G", descriptor = "I")
    private int field1595 = 0;

    @OriginalMember(owner = "client!hs", name = "I", descriptor = "Lpu;")
    private class411 field1597 = new class411();

    @OriginalMember(owner = "client!hs", name = "K", descriptor = "J")
    private long field1599 = 0L;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "Lpd;")
    private class436 field1565;

    @OriginalMember(owner = "client!hs", name = "H", descriptor = "Z")
    private boolean field1596;

    @OriginalMember(owner = "client!hs", name = "J", descriptor = "Lpu;")
    private class411 field1598;

    @OriginalMember(owner = "client!hs", name = "L", descriptor = "Z")
    private boolean field1600;

    @OriginalMember(owner = "client!hs", name = "y", descriptor = "Lpd;")
    private class436 field1587;

    @OriginalMember(owner = "client!hs", name = "E", descriptor = "Llq;")
    private class226 field1593;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
    private int field1577;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    private int field1568;

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "Ldk;")
    private class477 field1586;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "Ldn;")
    private class415 field1575;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "Lnk;")
    public static class326 field1574 = new class326(31, 5);

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!hs", name = "A", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!hs", name = "B", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!hs", name = "C", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "Lma;")
    private class449 field1572;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "Lmj;")
    public static class70 field1585;

    @OriginalMember(owner = "client!hs", name = "F", descriptor = "Z")
    private boolean field1594;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "[B")
    private byte[] field1566;

    @OriginalMember(owner = "client!hs", name = "D", descriptor = "[[I")
    public static int[][] field1592;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BII)Ldn;")
    private final class415 method650(byte arg0, int arg1, int arg2) {
        field1590++;
        class415 var4 = (class415) this.field1576.method2516((long) arg1, -1);
        if (arg0 != 0) {
            return null;
        }
        if (var4 != null && arg2 == 0 && !var4.field6302 && var4.field6303) {
            var4.method1821((byte) 91);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field1565 == null || this.field1566[arg1] == -1) {
                    if (this.field1593.method1562(20)) {
                        return null;
                    }
                    var4 = this.field1593.method1555(arg1, true, 556956784, this.field1569, (byte) 2);
                } else {
                    var4 = this.field1586.method2818(arg1, (byte) -115, this.field1565);
                }
            } else if (arg2 == 1) {
                if (this.field1565 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field1586.method2817(arg1, (byte) 110, this.field1565);
            } else if (arg2 == 2) {
                if (this.field1565 == null) {
                    throw new RuntimeException();
                }
                if (this.field1566[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field1593.method1563(arg0)) {
                    return null;
                }
                var4 = this.field1593.method1555(arg1, false, arg0 + 556956784, this.field1569, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field1576.method2517(var4, (long) arg1, (byte) 82);
        }
        if (var4.field6303) {
            return null;
        }
        byte[] var5 = var4.method88((byte) 32);
        if (!var4 instanceof class18) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class462.field6876.reset();
                class462.field6876.update(var5, 0, var5.length - 2);
                int var6 = (int) class462.field6876.getValue();
                if (this.field1572.field6690[arg1] != var6) {
                    throw new RuntimeException();
                }
                this.field1593.field3916 = 0;
                this.field1593.field3915 = 0;
            } catch (RuntimeException var12) {
                this.field1593.method1565(1);
                var4.method1821((byte) -117);
                if (var4.field6302 && !this.field1593.method1562(20)) {
                    class171 var7 = this.field1593.method1555(arg1, true, 556956784, this.field1569, (byte) 2);
                    this.field1576.method2517(var7, (long) arg1, (byte) 86);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field1572.field6685[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field1572.field6685[arg1];
            if (this.field1565 != null) {
                this.field1586.method2813((byte) 69, arg1, var5, this.field1565);
                if (this.field1566[arg1] != 1) {
                    this.field1573++;
                    this.field1566[arg1] = 1;
                }
            }
            if (!var4.field6302) {
                var4.method1821((byte) -126);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class462.field6876.reset();
            class462.field6876.update(var5, 0, var5.length - 2);
            int var8 = (int) class462.field6876.getValue();
            if (this.field1572.field6690[arg1] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field1572.field6685[arg1] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field1566[arg1] != 1) {
                this.field1573++;
                this.field1566[arg1] = 1;
            }
            if (!var4.field6302) {
                var4.method1821((byte) -104);
            }
            return var4;
        } catch (Exception var11) {
            this.field1566[arg1] = -1;
            var4.method1821((byte) -89);
            if (var4.field6302 && !this.field1593.method1562(arg0 + 20)) {
                class171 var10 = this.field1593.method1555(arg1, true, 556956784, this.field1569, (byte) 2);
                this.field1576.method2517(var10, (long) arg1, (byte) -112);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IB)V")
    public final void method651(int arg0, byte arg1) {
        field1579++;
        if (this.field1565 == null) {
            return;
        }
        for (class276 var3 = this.field1597.method2538(-3); var3 != null; var3 = this.field1597.method2535((byte) -105)) {
            if (((long) arg0) == var3.field4542) {
                return;
            }
        }
        class276 var4 = new class276();
        var4.field4542 = arg0;
        int var5 = -104 / ((arg1 - 12) / 60);
        this.field1597.method2541(0, var4);
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
    public final void method652(int arg0) {
        if (arg0 != -3) {
            this.field1568 = -70;
        }
        field1584++;
        if (this.field1598 != null) {
            if (this.method657(-102) == null) {
                return;
            }
            if (this.field1596) {
                boolean var2 = true;
                for (class276 var3 = this.field1598.method2538(-3); var3 != null; var3 = this.field1598.method2535((byte) -61)) {
                    int var5 = (int) var3.field4542;
                    if (this.field1566[var5] == 0) {
                        this.method650((byte) 0, var5, 1);
                    }
                    if (this.field1566[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1821((byte) -96);
                    }
                }
                while (this.field1572.field6693.length > this.field1595) {
                    if (this.field1572.field6693[this.field1595] == 0) {
                        this.field1595++;
                    } else {
                        if (this.field1586.field7058 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field1566[this.field1595] == 0) {
                            this.method650((byte) 0, this.field1595, 1);
                        }
                        if (this.field1566[this.field1595] == 0) {
                            class276 var4 = new class276();
                            var4.field4542 = this.field1595;
                            var2 = false;
                            this.field1598.method2541(0, var4);
                        }
                        this.field1595++;
                    }
                }
                if (var2) {
                    this.field1596 = false;
                    this.field1595 = 0;
                }
            } else if (this.field1594) {
                boolean var6 = true;
                for (class276 var7 = this.field1598.method2538(arg0); var7 != null; var7 = this.field1598.method2535((byte) -66)) {
                    int var9 = (int) var7.field4542;
                    if (this.field1566[var9] != 1) {
                        this.method650((byte) 0, var9, 2);
                    }
                    if (this.field1566[var9] == 1) {
                        var7.method1821((byte) 17);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field1572.field6693.length > this.field1595) {
                    if (this.field1572.field6693[this.field1595] == 0) {
                        this.field1595++;
                    } else {
                        if (this.field1593.method1563(arg0 ^ 0xFFFFFFFD)) {
                            var6 = false;
                            break;
                        }
                        if (this.field1566[this.field1595] != 1) {
                            this.method650((byte) 0, this.field1595, 2);
                        }
                        if (this.field1566[this.field1595] != 1) {
                            class276 var8 = new class276();
                            var8.field4542 = this.field1595;
                            this.field1598.method2541(arg0 + 3, var8);
                            var6 = false;
                        }
                        this.field1595++;
                    }
                }
                if (var6) {
                    this.field1594 = false;
                    this.field1595 = 0;
                }
            } else {
                this.field1598 = null;
            }
        }
        if (!this.field1600 || class19.method91((byte) 110) < this.field1599) {
            return;
        }
        for (class415 var10 = (class415) this.field1576.method2518(arg0 ^ 0x77); var10 != null; var10 = (class415) this.field1576.method2524(0)) {
            if (!var10.field6303) {
                if (var10.field6304) {
                    if (!var10.field6302) {
                        throw new RuntimeException();
                    }
                    var10.method1821((byte) 110);
                } else {
                    var10.field6304 = true;
                }
            }
        }
        this.field1599 = class19.method91((byte) 101) + 1000L;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V")
    public static void method653(boolean arg0) {
        if (!arg0) {
            method653(true);
        }
        field1585 = null;
        field1574 = null;
        field1592 = null;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(Z)I")
    public final int method654(boolean arg0) {
        field1570++;
        if (!arg0) {
            this.field1600 = true;
        }
        if (this.method657(-85) == null) {
            return this.field1575 == null ? 0 : this.field1575.method90(0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)I")
    public final int method655(int arg0) {
        field1588++;
        if (arg0 <= 3) {
            this.field1569 = -60;
        }
        return this.field1573;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BI)I")
    public final int method656(byte arg0, int arg1) {
        field1582++;
        class415 var3 = (class415) this.field1576.method2516((long) arg1, -1);
        if (arg0 == -86) {
            return var3 == null ? 0 : var3.method90(0);
        } else {
            return 124;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)Lma;")
    public final class449 method657(int arg0) {
        field1571++;
        if (this.field1572 != null) {
            return this.field1572;
        }
        if (this.field1575 == null) {
            if (this.field1593.method1562(20)) {
                return null;
            }
            this.field1575 = this.field1593.method1555(this.field1569, true, 556956784, 255, (byte) 0);
        }
        if (this.field1575.field6303) {
            return null;
        }
        byte[] var2 = this.field1575.method88((byte) 32);
        if (this.field1575 instanceof class18) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1572 = new class449(var2, this.field1577);
                if (this.field1572.field6687 != this.field1568) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field1572 = null;
                if (this.field1593.method1562(20)) {
                    this.field1575 = null;
                } else {
                    this.field1575 = this.field1593.method1555(this.field1569, true, 556956784, 255, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1572 = new class449(var2, this.field1577);
            } catch (RuntimeException var4) {
                this.field1593.method1565(1);
                this.field1572 = null;
                if (this.field1593.method1562(20)) {
                    this.field1575 = null;
                } else {
                    this.field1575 = this.field1593.method1555(this.field1569, true, 556956784, 255, (byte) 0);
                }
                return null;
            }
            if (this.field1587 != null) {
                this.field1586.method2813((byte) 69, this.field1569, var2, this.field1587);
            }
        }
        if (this.field1565 != null) {
            this.field1566 = new byte[this.field1572.field6698];
            this.field1573 = 0;
        }
        this.field1575 = null;
        if (arg0 > -14) {
            field1592 = null;
        }
        return this.field1572;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZIIII[[[Lut;)Z")
    public static final boolean method658(boolean arg0, int arg1, int arg2, int arg3, int arg4, class465[][][] arg5) {
        field1578++;
        byte var6 = arg0 ? 1 : (byte) (class536.field7878 & 0xFF);
        if (class53.field858[class93.field1556][arg1][arg3] == var6) {
            return false;
        } else if ((class192.field2982[class93.field1556][arg1][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class517.field7644[var7] = arg1;
            int var8 = 0;
            int var35 = var7 + 1;
            class496.field7271[var7] = arg3;
            if (arg2 != -14903) {
                field1585 = null;
            }
            class53.field858[class93.field1556][arg1][arg3] = var6;
            while (var35 != var8) {
                int var9 = class517.field7644[var8] & 0xFFFF;
                int var10 = class517.field7644[var8] >> 16 & 0xFF;
                int var11 = class517.field7644[var8] >> 24 & 0xFF;
                int var12 = class496.field7271[var8] & 0xFFFF;
                int var13 = class496.field7271[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class192.field2982[class93.field1556][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class93.field1556 + 1; var16 <= 3; var16++) {
                    if ((class192.field2982[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg5[var16][var9][var12] != null) {
                            if (arg5[var16][var9][var12].field6907 != null) {
                                int var20 = class305.method1949(var10, 15767);
                                if (arg5[var16][var9][var12].field6907.field3787 == var20 || arg5[var16][var9][var12].field6901 != null && arg5[var16][var9][var12].field6901.field3787 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class305.method1949(var11, 15767);
                                    if (arg5[var16][var9][var12].field6907.field3787 == var21 || arg5[var16][var9][var12].field6901 != null && arg5[var16][var9][var12].field6901.field3787 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class305.method1949(var13, 15767);
                                    if (arg5[var16][var9][var12].field6907.field3787 == var22 || arg5[var16][var9][var12].field6901 != null && arg5[var16][var9][var12].field6901.field3787 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class465 var23 = arg5[var16][var9][var12];
                            if (var23.field6898 != null) {
                                for (class1 var24 = var23.field6898; var24 != null; var24 = var24.field2) {
                                    class290 var25 = var24.field9;
                                    if (var25 instanceof class518) {
                                        class518 var26 = (class518) var25;
                                        int var27 = var26.method29(arg2 + 15014);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method38(5638);
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class465 var30 = arg5[var16][var9][var12];
                        if (var30 != null && var30.field6898 != null) {
                            for (class1 var31 = var30.field6898; var31 != null; var31 = var31.field2) {
                                class290 var32 = var31.field9;
                                if (var32.field4722 != var32.field4718 || var32.field4717 != var32.field4713) {
                                    for (int var33 = var32.field4718; var33 <= var32.field4722; var33++) {
                                        for (int var34 = var32.field4717; var34 <= var32.field4713; var34++) {
                                            class53.field858[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class53.field858[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class360.field5592[class93.field1556 + 1].method1516(var9, var12);
                    if (var17 > class361.field5615[arg4]) {
                        class361.field5615[arg4] = var17;
                    }
                    int var18 = var9 << 7;
                    if (class213.field3390[arg4] > var18) {
                        class213.field3390[arg4] = var18;
                    } else if (class155.field2512[arg4] < var18) {
                        class155.field2512[arg4] = var18;
                    }
                    int var19 = var12 << 7;
                    if (class359.field5591[arg4] > var19) {
                        class359.field5591[arg4] = var19;
                    } else if (var19 > class460.field6821[arg4]) {
                        class460.field6821[arg4] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class53.field858[class93.field1556][var9 - 1][var12] != var6) {
                        class517.field7644[var35] = class338.method2141(-754974720, class338.method2141(var9 - 1, 1179648));
                        class496.field7271[var35] = class338.method2141(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class53.field858[class93.field1556][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (class277.field4548 > var12) {
                        if ((var9 - 1) >= 0 && class53.field858[class93.field1556][var9 - 1][var12] != var6 && (class192.field2982[class93.field1556][var9][var12] & 0x4) == 0 && (class192.field2982[class93.field1556][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class517.field7644[var35] = class338.method2141(1375731712, class338.method2141(1179648, var9 - 1));
                            class496.field7271[var35] = class338.method2141(1245184, var12);
                            class53.field858[class93.field1556][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class53.field858[class93.field1556][var9][var12] != var6) {
                            class517.field7644[var35] = class338.method2141(class338.method2141(5373952, var9), 318767104);
                            class496.field7271[var35] = class338.method2141(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class53.field858[class93.field1556][var9][var12] = var6;
                        }
                        if (var9 + 1 < class217.field3775 && class53.field858[class93.field1556][var9 + 1][var12] != var6 && (class192.field2982[class93.field1556][var9][var12] & 0x4) == 0 && (class192.field2982[class93.field1556][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class517.field7644[var35] = class338.method2141(-1845493760, class338.method2141(var9 + 1, 5373952));
                            class496.field7271[var35] = class338.method2141(5439488, var12);
                            class53.field858[class93.field1556][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (var9 + 1 < class217.field3775 && class53.field858[class93.field1556][var9 + 1][var12] != var6) {
                        class517.field7644[var35] = class338.method2141(class338.method2141(9568256, var9 + 1), 1392508928);
                        class496.field7271[var35] = class338.method2141(9633792, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class53.field858[class93.field1556][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class53.field858[class93.field1556][var9 - 1][var12] != var6 && (class192.field2982[class93.field1556][var9][var12] & 0x4) == 0 && (class192.field2982[class93.field1556][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class517.field7644[var35] = class338.method2141(class338.method2141(13762560, var9 - 1), 301989888);
                            class496.field7271[var35] = class338.method2141(13828096, var12);
                            class53.field858[class93.field1556][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class53.field858[class93.field1556][var9][var12] != var6) {
                            class517.field7644[var35] = class338.method2141(-1828716544, class338.method2141(13762560, var9));
                            class496.field7271[var35] = class338.method2141(var12, 13828096);
                            class53.field858[class93.field1556][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class217.field3775 && class53.field858[class93.field1556][var9 + 1][var12] != var6 && (class192.field2982[class93.field1556][var9][var12] & 0x4) == 0 && (class192.field2982[class93.field1556][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class517.field7644[var35] = class338.method2141(-771751936, class338.method2141(var9 + 1, 9568256));
                            class496.field7271[var35] = class338.method2141(9633792, var12);
                            class53.field858[class93.field1556][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class361.field5615[arg4] != -1000000) {
                class361.field5615[arg4] += 10;
                class213.field3390[arg4] -= 50;
                class155.field2512[arg4] += 50;
                class460.field6821[arg4] += 50;
                class359.field5591[arg4] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
    public final void method659(byte arg0) {
        field1591++;
        if (arg0 != -128) {
            this.field1568 = -128;
        }
        if (this.field1598 == null || this.method657(-127) == null) {
            return;
        }
        for (class276 var2 = this.field1597.method2538(arg0 ^ 0x7D); var2 != null; var2 = this.field1597.method2535((byte) -111)) {
            int var3 = (int) var2.field4542;
            if (var3 < 0 || var3 >= this.field1572.field6698 || this.field1572.field6693[var3] == 0) {
                var2.method1821((byte) 104);
            } else {
                if (this.field1566[var3] == 0) {
                    this.method650((byte) 0, var3, 1);
                }
                if (this.field1566[var3] == -1) {
                    this.method650((byte) 0, var3, 2);
                }
                if (this.field1566[var3] == 1) {
                    var2.method1821((byte) 97);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)V")
    public final void method660(int arg0) {
        field1564++;
        if (arg0 != -754974720) {
            this.method654(false);
        }
        if (this.field1565 != null) {
            this.field1594 = true;
            if (this.field1598 == null) {
                this.field1598 = new class411();
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)V")
    public static final void method661(int arg0, int arg1, int arg2) {
        class465 var3 = class66.field977[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field6904 != null) {
            var3.field6904 = null;
        }
        if (var3.field6908 != null) {
            var3.field6908 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "(I)I")
    public final int method662(int arg0) {
        field1583++;
        if (this.field1572 == null) {
            return 0;
        } else if (this.field1596) {
            if (arg0 != -28134) {
                this.method656((byte) 81, -80);
            }
            class276 var2 = this.field1598.method2538(-3);
            return var2 == null ? 0 : (int) var2.field4542;
        } else {
            return this.field1572.field6697;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(BI)[B")
    public final byte[] method663(byte arg0, int arg1) {
        field1567++;
        class415 var3 = this.method650((byte) 0, arg1, 0);
        if (var3 == null) {
            return null;
        }
        if (arg0 > -26) {
            this.field1577 = 120;
        }
        byte[] var4 = var3.method88((byte) 32);
        var3.method1821((byte) 18);
        return var4;
    }

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "(I)I")
    public final int method664(int arg0) {
        field1581++;
        if (arg0 != 4) {
            this.method655(-47);
        }
        return this.field1572 == null ? 0 : this.field1572.field6697;
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(ILpd;Lpd;Llq;Ldk;IIZ)V")
    public class94(int arg0, class436 arg1, class436 arg2, class226 arg3, class477 arg4, int arg5, int arg6, boolean arg7) {
        this.field1569 = arg0;
        this.field1565 = arg1;
        if (this.field1565 == null) {
            this.field1596 = false;
        } else {
            this.field1596 = true;
            this.field1598 = new class411();
        }
        this.field1600 = arg7;
        this.field1587 = arg2;
        this.field1593 = arg3;
        this.field1577 = arg5;
        this.field1568 = arg6;
        this.field1586 = arg4;
        if (this.field1587 != null) {
            this.field1575 = this.field1586.method2818(this.field1569, (byte) -83, this.field1587);
        }
    }
}
