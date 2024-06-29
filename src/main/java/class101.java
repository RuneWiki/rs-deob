import java.awt.FontMetrics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class101 {

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "Lja;")
    private class61 field1584 = new class61();

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "Lja;")
    private class61 field1596 = new class61();

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "Lja;")
    private class61 field1599 = new class61();

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "Lja;")
    private class61 field1600 = new class61();

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "Lfj;")
    private class274 field1601 = new class274(4);

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "B")
    private byte field1606 = 0;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
    public volatile int field1607 = 0;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public volatile int field1605 = 0;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "Lfj;")
    private class274 field1608 = new class274(8);

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "Z")
    public static boolean field1586 = true;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "Z")
    public static boolean field1579 = false;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    private int field1602;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "J")
    private long field1604;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "Lqj;")
    private class155 field1609;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "Lgi;")
    public static class164 field1580;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "Loc;")
    private class63 field1603;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1592;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "[S")
    public static short[] field1594;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "[[I")
    public static int[][] field1582;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
    public final void method710(byte arg0) {
        field1585++;
        try {
            this.field1603.method416(64);
        } catch (Exception var2) {
        }
        this.field1603 = null;
        this.field1605 = -1;
        if (arg0 == 70) {
            this.field1606 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
            this.field1607++;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V")
    public final void method711(byte arg0) {
        if (arg0 != -38) {
            field1592 = null;
        }
        field1597++;
        if (this.field1603 == null) {
            return;
        }
        try {
            this.field1601.field4458 = 0;
            this.field1601.method1865(7, 28);
            this.field1601.method1862(0, false);
            this.field1603.method410(0, this.field1601.field4441, 4, (byte) 110);
        } catch (IOException var3) {
            try {
                this.field1603.method416(64);
            } catch (Exception var2) {
            }
            this.field1605 = -2;
            this.field1607++;
            this.field1603 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)V")
    public static final void method712(int arg0, boolean arg1) {
        field1587++;
        if (arg0 != 15921) {
            method712(13, true);
        }
        byte[][] var2 = class158.field2563;
        byte var3 = 4;
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var11 = null;
            byte[] var12 = var2[var5];
            int var13 = class122.field1938[var5] >> 8;
            int var14 = var13 * 64 - class75.field1211;
            int var15 = class122.field1938[var5] & 0xFF;
            int var16 = var15 * 64 - class145.field2327;
            if (var12 != null) {
                class243.method1653(false);
                var11 = class313.method2108(3, var14, class310.field5021, var12, class75.field1211, arg1, var16, class145.field2327);
            }
            if (!arg1 && (class296.field4824 / 8) == var13 && class311.field5030 / 8 == var15) {
                if (var11 == null) {
                    class145.field2326 = -1;
                } else {
                    class145.field2326 = var11[0];
                    class63.field1028 = var11[2];
                    class122.field1927 = var11[3];
                    class68.field1088 = var11[1];
                    class58.field840 = var11[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class122.field1938[var6] & 0xFF) * 64 - class145.field2327;
            int var8 = (class122.field1938[var6] >> 8) * 64 - class75.field1211;
            byte[] var9 = var2[var6];
            if (var9 == null && class311.field5030 < 800) {
                class243.method1653(false);
                for (int var10 = 0; var10 < var3; var10++) {
                    class230.method1593((byte) 99, var7, var8, 64, 64, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZZ)V")
    public final void method713(boolean arg0, boolean arg1) {
        field1581++;
        if (this.field1603 == null) {
            return;
        }
        try {
            this.field1601.field4458 = 0;
            if (arg1) {
                field1580 = null;
            }
            this.field1601.method1865(arg0 ? 2 : 3, 123);
            this.field1601.method1862(0, arg1);
            this.field1603.method410(0, this.field1601.field4441, 4, (byte) 109);
        } catch (IOException var4) {
            try {
                this.field1603.method416(64);
            } catch (Exception var3) {
            }
            this.field1607++;
            this.field1605 = -2;
            this.field1603 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)I")
    private final int method714(int arg0) {
        if (arg0 <= 61) {
            return 12;
        } else {
            field1589++;
            return this.field1599.method393(46) + this.field1600.method393(46);
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)Z")
    public final boolean method715(byte arg0) {
        if (arg0 == -47) {
            field1593++;
            return this.method718(30456) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(B)Z")
    public final boolean method716(byte arg0) {
        field1598++;
        if (arg0 <= 111) {
            return true;
        } else {
            return this.method714(116) >= 20;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)Z")
    public final boolean method717(int arg0) {
        field1577++;
        if (this.field1603 != null) {
            long var2 = class264.method1778(6573);
            int var4 = (int) (var2 - this.field1604);
            this.field1604 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1602 += var4;
            if (this.field1602 > 30000) {
                try {
                    this.field1603.method416(64);
                } catch (Exception var28) {
                }
                this.field1603 = null;
            }
        }
        if (this.field1603 == null) {
            return this.method718(30456) == 0 && this.method714(125) == 0;
        }
        try {
            this.field1603.method420(0);
            for (class155 var5 = (class155) this.field1584.method391((byte) 62); var5 != null; var5 = (class155) this.field1584.method394((byte) 65)) {
                this.field1601.field4458 = 0;
                this.field1601.method1865(1, 90);
                this.field1601.method1862((int) var5.field4135, false);
                this.field1603.method410(0, this.field1601.field4441, 4, (byte) 110);
                this.field1596.method388(var5, false);
            }
            class155 var6 = (class155) this.field1599.method391((byte) -111);
            int var7 = 21 % ((arg0 + 55) / 52);
            while (var6 != null) {
                this.field1601.field4458 = 0;
                this.field1601.method1865(0, -114);
                this.field1601.method1862((int) var6.field4135, false);
                this.field1603.method410(0, this.field1601.field4441, 4, (byte) 127);
                this.field1600.method388(var6, false);
                var6 = (class155) this.field1599.method394((byte) 66);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field1603.method419((byte) -109);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                byte var10 = 0;
                if (this.field1609 == null) {
                    var10 = 8;
                } else if (this.field1609.field2469 == 0) {
                    var10 = 1;
                }
                this.field1602 = 0;
                if (var10 <= 0) {
                    int var11 = this.field1609.field2473.field4441.length - this.field1609.field2466;
                    int var12 = 512 - this.field1609.field2469;
                    if (var12 > var11 - this.field1609.field2473.field4458) {
                        var12 = var11 - this.field1609.field2473.field4458;
                    }
                    if (var9 < var12) {
                        var12 = var9;
                    }
                    this.field1603.method413(var12, this.field1609.field2473.field4441, -48, this.field1609.field2473.field4458);
                    if (this.field1606 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field1609.field2473.field4441[this.field1609.field2473.field4458 + var13] = (byte) class81.method582(this.field1609.field2473.field4441[this.field1609.field2473.field4458 + var13], this.field1606);
                        }
                    }
                    this.field1609.field2473.field4458 += var12;
                    this.field1609.field2469 += var12;
                    if (this.field1609.field2473.field4458 == var11) {
                        this.field1609.method1708((byte) 90);
                        this.field1609.field2461 = false;
                        this.field1609 = null;
                    } else if (this.field1609.field2469 == 512) {
                        this.field1609.field2469 = 0;
                    }
                } else {
                    int var14 = var10 - this.field1608.field4458;
                    if (var14 > var9) {
                        var14 = var9;
                    }
                    this.field1603.method413(var14, this.field1608.field4441, -54, this.field1608.field4458);
                    if (this.field1606 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field1608.field4441[this.field1608.field4458 + var15] = (byte) class81.method582(this.field1608.field4441[this.field1608.field4458 + var15], this.field1606);
                        }
                    }
                    this.field1608.field4458 += var14;
                    if (this.field1608.field4458 >= var10) {
                        if (this.field1609 == null) {
                            this.field1608.field4458 = 0;
                            int var16 = this.field1608.method1849(255);
                            int var17 = this.field1608.method1837(252);
                            int var18 = this.field1608.method1849(255);
                            int var19 = this.field1608.method1833((byte) -104);
                            int var20 = var18 & 0x7F;
                            long var21 = (long) ((var16 << 16) + var17);
                            boolean var23 = (var18 & 0x80) != 0;
                            Object var24 = null;
                            class155 var25;
                            if (var23) {
                                for (var25 = (class155) this.field1600.method391((byte) -91); var25 != null && var25.field4135 != var21; var25 = (class155) this.field1600.method394((byte) 97)) {
                                }
                            } else {
                                for (var25 = (class155) this.field1596.method391((byte) 100); var25 != null && var25.field4135 != var21; var25 = (class155) this.field1596.method394((byte) 105)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            this.field1609 = var25;
                            int var26 = var20 == 0 ? 5 : 9;
                            this.field1609.field2473 = new class274(var19 + var26 + this.field1609.field2466);
                            this.field1609.field2473.method1865(var20, 83);
                            this.field1609.field2473.method1831(var19, 119690440);
                            this.field1608.field4458 = 0;
                            this.field1609.field2469 = 8;
                        } else if (this.field1609.field2469 != 0) {
                            throw new IOException();
                        } else if (this.field1608.field4441[0] == -1) {
                            this.field1608.field4458 = 0;
                            this.field1609.field2469 = 1;
                        } else {
                            this.field1609 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var29) {
            try {
                this.field1603.method416(64);
            } catch (Exception var27) {
            }
            this.field1607++;
            this.field1605 = -2;
            this.field1603 = null;
            return this.method718(30456) == 0 && this.method714(95) == 0;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)I")
    public final int method718(int arg0) {
        if (arg0 != 30456) {
            field1583 = -13;
        }
        field1575++;
        return this.field1584.method393(46) + this.field1596.method393(46);
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(B)V")
    public static void method719(byte arg0) {
        field1582 = null;
        field1594 = null;
        field1580 = null;
        field1592 = null;
        if (arg0 != -105) {
            field1583 = -21;
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V")
    private final void method720(int arg0) {
        field1591++;
        if (this.field1603 == null) {
            return;
        }
        try {
            this.field1601.field4458 = 0;
            int var2 = -125 % ((arg0 - 65) / 51);
            this.field1601.method1865(6, -101);
            this.field1601.method1862(3, false);
            this.field1603.method410(0, this.field1601.field4441, 4, (byte) 69);
        } catch (IOException var4) {
            try {
                this.field1603.method416(64);
            } catch (Exception var3) {
            }
            this.field1605 = -2;
            this.field1607++;
            this.field1603 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)V")
    public final void method721(int arg0) {
        if (this.field1603 != null) {
            this.field1603.method416(arg0 ^ 0xFFFFC1D9);
        }
        field1576++;
        if (arg0 != -15975) {
            this.field1603 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method722(int arg0, byte[] arg1) {
        field1578++;
        if (arg0 < 65) {
            return null;
        }
        class274 var2 = new class274(arg1);
        int var3 = var2.method1849(255);
        int var4 = var2.method1833((byte) -104);
        if (var4 < 0 || class281.field4577 != 0 && class281.field4577 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1810(var4, 0, 74, var7);
            return var7;
        } else {
            int var5 = var2.method1833((byte) -104);
            if (var5 < 0 || !(class281.field4577 == 0 || class281.field4577 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class187.method1318(var6, var5, arg1, var4, 9);
            } else {
                class43.field634.method708((byte) 95, var6, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILoc;Z)V")
    public final void method723(int arg0, class63 arg1, boolean arg2) {
        if (this.field1603 != null) {
            try {
                this.field1603.method416(64);
            } catch (Exception var8) {
            }
            this.field1603 = null;
        }
        field1590++;
        this.field1603 = arg1;
        this.method720(123);
        this.method713(arg2, false);
        this.field1609 = null;
        this.field1608.field4458 = arg0;
        while (true) {
            class155 var4 = (class155) this.field1596.method396(0);
            if (var4 == null) {
                while (true) {
                    class155 var5 = (class155) this.field1600.method396(0);
                    if (var5 == null) {
                        if (this.field1606 != 0) {
                            try {
                                this.field1601.field4458 = 0;
                                this.field1601.method1865(4, arg0 ^ 0x44);
                                this.field1601.method1865(this.field1606, 82);
                                this.field1601.method1824(0, arg0 + 28357);
                                this.field1603.method410(0, this.field1601.field4441, 4, (byte) 125);
                            } catch (IOException var7) {
                                try {
                                    this.field1603.method416(64);
                                } catch (Exception var6) {
                                }
                                this.field1607++;
                                this.field1605 = -2;
                                this.field1603 = null;
                            }
                        }
                        this.field1602 = 0;
                        this.field1604 = class264.method1778(6573);
                        return;
                    }
                    this.field1599.method388(var5, false);
                }
            }
            this.field1584.method388(var4, false);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZIBZI)Lqj;")
    public final class155 method724(boolean arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        field1588++;
        long var6 = (long) ((arg4 << 16) + arg1);
        if (arg3) {
            this.method714(-2);
        }
        class155 var8 = new class155();
        var8.field4135 = var6;
        var8.field2466 = arg2;
        var8.field2462 = arg0;
        if (arg0) {
            if (this.method718(30456) >= 20) {
                throw new RuntimeException();
            }
            this.field1584.method388(var8, false);
        } else if (this.method714(65) < 20) {
            this.field1599.method388(var8, false);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "(B)V")
    public final void method725(byte arg0) {
        if (this.field1603 != null) {
            this.field1603.method411(22716);
        }
        field1595++;
        if (arg0 > -88) {
            this.method724(false, 8, (byte) 91, false, 85);
        }
    }
}
