import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class62 {

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    private int field1498 = 32;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "J")
    private long field1508 = class166.method1184((byte) -80);

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    private int field1522 = 0;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "J")
    private long field1521 = 0L;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
    private int field1523 = 0;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "J")
    private long field1524 = 0L;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "[Lbc;")
    private class13[] field1525 = new class13[8];

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
    private int field1520 = 0;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
    private int field1527 = 0;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "Z")
    private boolean field1528 = true;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "[Lbc;")
    private class13[] field1529 = new class13[8];

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Z")
    public static boolean field1504 = false;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public static int field1510 = 0;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field1500 = 0;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "Lea;")
    private static class38 field1511 = class9.method46((byte) 127, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "Lea;")
    public static class38 field1513 = class9.method46((byte) 114, "Lade)3)3)3");

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lea;")
    public static class38 field1491 = field1511;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Lea;")
    public static class38 field1492 = class9.method46((byte) 109, "Passwort: ");

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "I")
    public int field1518;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
    private int field1526;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Ln;")
    public static class116 field1499;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "Lbc;")
    private class13 field1512;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "[I")
    public int[] field1501;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public final synchronized void method437(int arg0) {
        if (class6.field156 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class6.field156.field2570[var3] == this) {
                    class6.field156.field2570[var3] = null;
                }
                if (class6.field156.field2570[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class6.field156.field2571 = true;
                while (class6.field156.field2567) {
                    class132.method969(50L, (byte) 58);
                }
                class6.field156 = null;
            }
        }
        this.method431();
        this.field1501 = null;
        int var4 = -87 % ((-arg0 - 44) / 53);
        field1503++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()V")
    public void method436() throws Exception {
        field1516++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method434(Component arg0) throws Exception {
        field1505++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)V")
    private final void method438(int arg0, boolean arg1) {
        if (arg1) {
            this.method438(122, false);
        }
        field1507++;
        this.field1520 -= arg0;
        if (this.field1520 < 0) {
            this.field1520 = 0;
        }
        if (this.field1512 != null) {
            this.field1512.method75(arg0);
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()V")
    public void method432() throws Exception {
        field1517++;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "()V")
    public void method431() {
        field1515++;
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "()I")
    public int method435() throws Exception {
        field1509++;
        return this.field1518;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public final synchronized void method439(byte arg0) {
        field1495++;
        this.field1528 = true;
        try {
            if (arg0 != 101) {
                this.method439((byte) 6);
            }
            this.method436();
        } catch (Exception var2) {
            this.method431();
            this.field1524 = class166.method1184((byte) -80) + 2000L;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public final void method440(boolean arg0) {
        this.field1528 = true;
        field1506++;
        if (arg0) {
            this.field1525 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILbc;Z)V")
    private final void method441(int arg0, class13 arg1, boolean arg2) {
        field1494++;
        int var4 = arg0 >> 5;
        if (arg2) {
            this.method441(-18, null, true);
        }
        class13 var5 = this.field1529[var4];
        if (var5 == null) {
            this.field1525[var4] = arg1;
        } else {
            var5.field282 = arg1;
        }
        this.field1529[var4] = arg1;
        arg1.field281 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILbc;)V")
    public final synchronized void method442(int arg0, class13 arg1) {
        if (arg0 == 0) {
            this.field1512 = arg1;
            field1497++;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public void method430(int arg0) throws Exception {
        field1502++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([II)V")
    private final void method443(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class83.field1974) {
            var3 = arg1 << 1;
        }
        class131.method965(arg0, 0, var3);
        this.field1520 -= arg1;
        if (this.field1512 != null && this.field1520 <= 0) {
            this.field1520 += class87.field2030 >> 4;
            class21.method130(this.field1512, false);
            this.method441(this.field1512.method76(), this.field1512, false);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class13 var10 = null;
                        class13 var11 = this.field1525[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class189 var12 = var11.field280;
                                if (var12 == null || var12.field3759 <= var8) {
                                    var11.field279 = true;
                                    int var13 = var11.method71();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3759 += var13;
                                    }
                                    if (var4 >= this.field1498) {
                                        break label107;
                                    }
                                    class13 var14 = var11.method77();
                                    if (var14 != null) {
                                        int var15 = var11.field281;
                                        while (var14 != null) {
                                            this.method441(var15 * var14.method76() >> 8, var14, false);
                                            var14 = var11.method73();
                                        }
                                    }
                                    class13 var16 = var11.field282;
                                    var11.field282 = null;
                                    if (var10 == null) {
                                        this.field1525[var7] = var16;
                                    } else {
                                        var10.field282 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1529[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field282;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class13 var18 = this.field1525[var17];
                this.field1525[var17] = this.field1529[var17] = null;
                while (var18 != null) {
                    class13 var19 = var18.field282;
                    var18.field282 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1520 < 0) {
            this.field1520 = 0;
        }
        if (this.field1512 != null) {
            this.field1512.method72(arg0, 0, arg1);
        }
        this.field1508 = class166.method1184((byte) -80);
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public final synchronized void method444(int arg0) {
        field1496++;
        if (this.field1501 == null) {
            return;
        }
        long var2 = class166.method1184((byte) -80);
        try {
            if (this.field1524 != 0L) {
                if (var2 < this.field1524) {
                    return;
                }
                this.method430(this.field1518);
                this.field1524 = 0L;
                this.field1528 = true;
            }
            int var4 = this.method435();
            if (this.field1522 - var4 > this.field1527) {
                this.field1527 = this.field1522 - var4;
            }
            int var5 = this.field1526 + this.field1519;
            if (arg0 < 11) {
                this.method438(-10, true);
            }
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field1518) {
                var4 = 0;
                this.field1518 += 1024;
                if (this.field1518 > 16384) {
                    this.field1518 = 16384;
                }
                this.method431();
                this.method430(this.field1518);
                this.field1528 = true;
                if (var5 + 256 > this.field1518) {
                    var5 = this.field1518 - 256;
                    this.field1526 = var5 - this.field1519;
                }
            }
            while (var5 > var4) {
                this.method443(this.field1501, 256);
                this.method432();
                var4 += 256;
            }
            if (this.field1521 < var2) {
                if (this.field1528) {
                    this.field1528 = false;
                } else if (this.field1527 == 0 && this.field1523 == 0) {
                    this.method431();
                    this.field1524 = var2 + 2000L;
                    return;
                } else {
                    this.field1526 = Math.min(this.field1523, this.field1527);
                    this.field1523 = this.field1527;
                }
                this.field1521 = var2 + 2000L;
                this.field1527 = 0;
            }
            this.field1522 = var4;
        } catch (Exception var7) {
            this.method431();
            this.field1524 = var2 + 2000L;
        }
        try {
            if (this.field1508 + 500000L < var2) {
                var2 = this.field1508;
            }
            while (this.field1508 + 5000L < var2) {
                this.method438(256, false);
                this.field1508 += 256000 / class87.field2030;
            }
        } catch (Exception var6) {
            this.field1508 = var2;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
    public static final void method445(int arg0, int arg1) {
        field1514++;
        class105 var2 = (class105) class19.field410.method183((byte) 34, (long) arg0);
        if (var2 != null) {
            for (int var3 = arg1; var3 < var2.field2348.length; var3++) {
                var2.field2348[var3] = -1;
                var2.field2340[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
    public static void method446(byte arg0) {
        field1511 = null;
        field1492 = null;
        field1513 = null;
        field1499 = null;
        field1491 = null;
        int var1 = 57 / ((-arg0 - 3) / 37);
    }
}
