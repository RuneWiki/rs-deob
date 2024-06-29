import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class89 {

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    private int field1528 = 32;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "J")
    private long field1516 = class130.method935(false);

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "[La;")
    private class172[] field1530 = new class172[8];

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "J")
    private long field1538 = 0L;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "[La;")
    private class172[] field1535 = new class172[8];

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "J")
    private long field1533 = 0L;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
    private int field1539 = 0;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    private int field1532 = 0;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    private int field1536 = 0;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    private int field1540 = 0;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "Z")
    private boolean field1541 = true;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lph;")
    public static class229 field1510 = class266.method1858("leuchten3:", 0);

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lph;")
    public static class229 field1526 = class266.method1858("(U0a )2 via: ", 0);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public int field1531;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public int field1537;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "La;")
    private class172 field1529;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lsi;")
    public static class66 field1508;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "Lsi;")
    public static class66 field1527;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "[I")
    public int[] field1521;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "[Lph;")
    public static class229[] field1511;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()V", line = 7)
    public void method376() throws Exception {
        field1514++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 14)
    public final void method662(byte arg0) {
        if (arg0 != 93) {
            this.field1541 = false;
        }
        this.field1541 = true;
        field1525++;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()V", line = 28)
    public void method374() throws Exception {
        field1507++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(La;I)V", line = 44)
    public final synchronized void method663(class172 arg0, int arg1) {
        this.field1529 = arg0;
        if (arg1 != 28579) {
            this.method665(110);
        }
        field1524++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 58)
    public void method377(int arg0) throws Exception {
        field1515++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lgi;I)V", line = 66)
    public static final void method664(class306 arg0, int arg1) {
        if (arg1 != -9643) {
            return;
        }
        field1509++;
        int var2 = arg0.field5109 - class319.field5393;
        int var3 = arg0.field5105 * 128 + arg0.method1457(0) * 64;
        int var4 = arg0.field5165 * 128 + arg0.method1457(0) * 64;
        arg0.field5168 += (var4 - arg0.field5168) / var2;
        arg0.field5145 = 0;
        arg0.field5147 += (var3 - arg0.field5147) / var2;
        if (arg0.field5127 == 0) {
            arg0.field5163 = 1024;
        }
        if (arg0.field5127 == 1) {
            arg0.field5163 = 1536;
        }
        if (arg0.field5127 == 2) {
            arg0.field5163 = 0;
        }
        if (arg0.field5127 == 3) {
            arg0.field5163 = 512;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "()I", line = 100)
    public int method373() throws Exception {
        field1523++;
        return this.field1531;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "()V", line = 118)
    public void method378() {
        field1519++;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V", line = 125)
    public final synchronized void method665(int arg0) {
        if (arg0 != -16933) {
            return;
        }
        field1520++;
        if (class26.field344 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class26.field344.field1092[var3] == this) {
                    class26.field344.field1092[var3] = null;
                }
                if (class26.field344.field1092[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class26.field344.field1099 = true;
                while (class26.field344.field1089) {
                    class288.method1976((byte) 67, 50L);
                }
                class26.field344 = null;
            }
        }
        this.method378();
        this.field1521 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 169)
    public void method375(Component arg0) throws Exception {
        field1522++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V", line = 176)
    public final synchronized void method666(boolean arg0) {
        field1513++;
        this.field1541 = true;
        try {
            this.method376();
            if (arg0) {
                this.field1536 = 98;
            }
        } catch (Exception var3) {
            this.method378();
            this.field1538 = class130.method935(arg0) + 2000L;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([II)V", line = 203)
    private final void method667(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class222.field3657) {
            var3 = arg1 << 1;
        }
        class42.method314(arg0, 0, var3);
        this.field1532 -= arg1;
        if (this.field1529 != null && this.field1532 <= 0) {
            this.field1532 += class255.field4264 >> 4;
            class148.method1081(this.field1529, (byte) -125);
            this.method669(this.field1529, (byte) 84, this.field1529.method1059());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
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
                        class172 var10 = null;
                        class172 var11 = this.field1530[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class127 var12 = var11.field2821;
                                if (var12 == null || var12.field2109 <= var8) {
                                    var11.field2820 = true;
                                    int var13 = var11.method451();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2109 += var13;
                                    }
                                    if (var4 >= this.field1528) {
                                        break label105;
                                    }
                                    class172 var14 = var11.method463();
                                    if (var14 != null) {
                                        int var15 = var11.field2822;
                                        while (var14 != null) {
                                            this.method669(var14, (byte) 67, var15 * var14.method1059() >> 8);
                                            var14 = var11.method459();
                                        }
                                    }
                                    class172 var16 = var11.field2823;
                                    var11.field2823 = null;
                                    if (var10 == null) {
                                        this.field1530[var7] = var16;
                                    } else {
                                        var10.field2823 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1535[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2823;
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
                class172 var18 = this.field1530[var17];
                this.field1530[var17] = this.field1535[var17] = null;
                while (var18 != null) {
                    class172 var19 = var18.field2823;
                    var18.field2823 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1532 < 0) {
            this.field1532 = 0;
        }
        if (this.field1529 != null) {
            this.field1529.method474(arg0, 0, arg1);
        }
        this.field1516 = class130.method935(false);
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V", line = 365)
    public final synchronized void method668(int arg0) {
        if (arg0 != 0) {
            this.method671(93, 37);
        }
        field1512++;
        if (this.field1521 == null) {
            return;
        }
        long var2 = class130.method935(false);
        try {
            if (this.field1538 != 0L) {
                if (var2 < this.field1538) {
                    return;
                }
                this.method377(this.field1531);
                this.field1541 = true;
                this.field1538 = 0L;
            }
            int var4 = this.method373();
            int var5 = this.field1537 + this.field1534;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field1540 - var4 > this.field1539) {
                this.field1539 = this.field1540 - var4;
            }
            if (this.field1531 < var5 + 256) {
                var4 = 0;
                this.field1531 += 1024;
                if (this.field1531 > 16384) {
                    this.field1531 = 16384;
                }
                this.method378();
                this.method377(this.field1531);
                if (this.field1531 < (var5 + 256)) {
                    var5 = this.field1531 - 256;
                    this.field1534 = var5 - this.field1537;
                }
                this.field1541 = true;
            }
            while (var5 > var4) {
                var4 += 256;
                this.method667(this.field1521, 256);
                this.method374();
            }
            if (this.field1533 < var2) {
                if (this.field1541) {
                    this.field1541 = false;
                } else if (this.field1539 == 0 && this.field1536 == 0) {
                    this.method378();
                    this.field1538 = var2 + 2000L;
                    return;
                } else {
                    this.field1534 = Math.min(this.field1536, this.field1539);
                    this.field1536 = this.field1539;
                }
                this.field1539 = 0;
                this.field1533 = var2 + 2000L;
            }
            this.field1540 = var4;
        } catch (Exception var9) {
            this.method378();
            this.field1538 = var2 + 2000L;
        }
        try {
            if (var2 > (this.field1516 + 500000L)) {
                var2 = this.field1516;
            }
            while (var2 > (this.field1516 + 5000L)) {
                this.method671(256, 0);
                this.field1516 += (long) (256000 / class255.field4264);
            }
        } catch (Exception var8) {
            this.field1516 = var2;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(La;BI)V", line = 480)
    private final void method669(class172 arg0, byte arg1, int arg2) {
        if (arg1 <= 60) {
            this.method669((class172) null, (byte) 78, 11);
        }
        field1517++;
        int var4 = arg2 >> 5;
        class172 var5 = this.field1535[var4];
        if (var5 == null) {
            this.field1530[var4] = arg0;
        } else {
            var5.field2823 = arg0;
        }
        this.field1535[var4] = arg0;
        arg0.field2822 = arg2;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V", line = 502)
    public static void method670(int arg0) {
        field1527 = null;
        field1508 = null;
        if (arg0 != 25021) {
            method664((class306) null, -28);
        }
        field1511 = null;
        field1526 = null;
        field1510 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V", line = 549)
    private final void method671(int arg0, int arg1) {
        this.field1532 -= arg0;
        if (this.field1532 < arg1) {
            this.field1532 = 0;
        }
        field1518++;
        if (this.field1529 != null) {
            this.field1529.method439(arg0);
        }
    }
}
