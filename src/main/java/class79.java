import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class79 {

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    private int field1556 = 32;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "J")
    private long field1539 = class97.method599(5);

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "J")
    private long field1565 = 0L;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    private int field1559 = 0;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "J")
    private long field1557 = 0L;

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "I")
    private int field1566 = 0;

    @OriginalMember(owner = "client!hi", name = "H", descriptor = "[Lpg;")
    private class156[] field1567 = new class156[8];

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "I")
    private int field1568 = 0;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
    private int field1560 = 0;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "[Lpg;")
    private class156[] field1561 = new class156[8];

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "Z")
    private boolean field1562 = true;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field1547 = 0;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Lrd;")
    public static class173 field1544 = class133.method843("<img=0>", -124);

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "Lrd;")
    public static class173 field1550 = class133.method843("Der Anmelde)2Server ist offline)3", 18);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
    public int field1563;

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "I")
    private int field1564;

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "I")
    public int field1571;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "Lpg;")
    private class156 field1554;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "[I")
    public int[] field1542;

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "[[[I")
    public static int[][][] field1570;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/awt/Color;Lrd;I)V")
    public static final void method478(int arg0, Color arg1, class173 arg2, int arg3) {
        field1552++;
        try {
            Graphics var4 = class165.field3183.getGraphics();
            if (class84.field1669 == null) {
                class84.field1669 = new Font("Helvetica", 1, 13);
                class60.field1182 = class165.field3183.getFontMetrics(class84.field1669);
            }
            if (class202.field3912) {
                class202.field3912 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class204.field4001, class97.field1771);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class125.field2352 == null) {
                    class125.field2352 = class165.field3183.createImage(304, 34);
                }
                Graphics var5 = class125.field2352.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(arg0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var5.setFont(class84.field1669);
                var5.setColor(Color.white);
                arg2.method1143(22, 83, (304 - arg2.method1134(class60.field1182, (byte) 118)) / 2, var5);
                var4.drawImage(class125.field2352, class204.field4001 / 2 - 152, class97.field1771 / 2 - 18, null);
            } catch (Exception var8) {
                int var6 = class204.field4001 / 2 - 152;
                int var7 = class97.field1771 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(var6 + arg3 * 3 + 2, var7 + 2, 300 - arg3 * 3, 30);
                var4.setFont(class84.field1669);
                var4.setColor(Color.white);
                arg2.method1143(var7 + 22, 28, (304 - arg2.method1134(class60.field1182, (byte) -118)) / 2 + var6, var4);
            }
        } catch (Exception var9) {
            class165.field3183.repaint();
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method479(Component arg0) throws Exception {
        field1558++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILpg;B)V")
    private final void method480(int arg0, class156 arg1, byte arg2) {
        int var4 = arg0 >> 5;
        class156 var5 = this.field1567[var4];
        if (var5 == null) {
            this.field1561[var4] = arg1;
        } else {
            var5.field2934 = arg1;
        }
        this.field1567[var4] = arg1;
        if (arg2 > -77) {
            this.field1568 = 79;
        }
        arg1.field2936 = arg0;
        field1548++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public final synchronized void method481(byte arg0) {
        if (class195.field3788 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class195.field3788.field4004[var3] == this) {
                    class195.field3788.field4004[var3] = null;
                }
                if (class195.field3788.field4004[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class195.field3788.field4002 = true;
                while (class195.field3788.field3990) {
                    class151.method996(12121, 50L);
                }
                class195.field3788 = null;
            }
        }
        this.method488();
        if (arg0 != -76) {
            this.method485(true);
        }
        this.field1542 = null;
        field1540++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()V")
    public void method482() throws Exception {
        field1555++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILpg;)V")
    public final synchronized void method483(int arg0, class156 arg1) {
        if (arg0 >= -21) {
            this.field1542 = null;
        }
        this.field1554 = arg1;
        field1545++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V")
    private final void method484(int arg0, int arg1) {
        this.field1560 -= arg1;
        if (this.field1560 < 0) {
            this.field1560 = 0;
        }
        if (this.field1554 != null) {
            this.field1554.method91(arg1);
        }
        if (arg0 >= -126) {
            method486(81, 50);
        }
        field1534++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
    public final synchronized void method485(boolean arg0) {
        field1538++;
        if (this.field1542 == null) {
            return;
        }
        long var2 = class97.method599(5);
        try {
            if (this.field1565 != 0L) {
                if (var2 < this.field1565) {
                    return;
                }
                this.method493(this.field1571);
                this.field1565 = 0L;
                this.field1562 = true;
            }
            if (!arg0) {
                method492(-126, -83, -65);
            }
            int var4 = this.method490();
            if (this.field1559 - var4 > this.field1566) {
                this.field1566 = this.field1559 - var4;
            }
            int var5 = this.field1563 + this.field1564;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field1571) {
                var4 = 0;
                this.field1571 += 1024;
                if (this.field1571 > 16384) {
                    this.field1571 = 16384;
                }
                this.method488();
                this.method493(this.field1571);
                if (this.field1571 < var5 + 256) {
                    var5 = this.field1571 - 256;
                    this.field1564 = var5 - this.field1563;
                }
                this.field1562 = true;
            }
            while (var5 > var4) {
                var4 += 256;
                this.method491(this.field1542, 256);
                this.method482();
            }
            if (var2 > this.field1557) {
                if (this.field1562) {
                    this.field1562 = false;
                } else if (this.field1566 == 0 && this.field1568 == 0) {
                    this.method488();
                    this.field1565 = var2 + 2000L;
                    return;
                } else {
                    this.field1564 = Math.min(this.field1568, this.field1566);
                    this.field1568 = this.field1566;
                }
                this.field1557 = var2 + 2000L;
                this.field1566 = 0;
            }
            this.field1559 = var4;
        } catch (Exception var7) {
            this.method488();
            this.field1565 = var2 + 2000L;
        }
        try {
            if (this.field1539 + 500000L < var2) {
                var2 = this.field1539;
            }
            while (var2 > this.field1539 + 5000L) {
                this.method484(-128, 256);
                this.field1539 += 256000 / class52.field1072;
            }
        } catch (Exception var6) {
            this.field1539 = var2;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)I")
    public static final int method486(int arg0, int arg1) {
        field1546++;
        if (arg1 != 16384) {
            field1537 = -41;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V")
    public static void method487(byte arg0) {
        int var1 = -113 / ((91 - arg0) / 33);
        field1550 = null;
        field1544 = null;
        field1570 = null;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "()V")
    public void method488() {
        field1536++;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(B)V")
    public final void method489(byte arg0) {
        if (arg0 == 3) {
            this.field1562 = true;
            field1551++;
        }
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "()I")
    public int method490() throws Exception {
        field1543++;
        return this.field1571;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([II)V")
    private final void method491(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class125.field2344) {
            var3 = arg1 << 1;
        }
        class85.method556(arg0, 0, var3);
        this.field1560 -= arg1;
        if (this.field1554 != null && this.field1560 <= 0) {
            this.field1560 += class52.field1072 >> 4;
            class204.method1355(0, this.field1554);
            this.method480(this.field1554.method962(), this.field1554, (byte) -122);
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
                        class156 var10 = null;
                        class156 var11 = this.field1561[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class185 var12 = var11.field2937;
                                if (var12 == null || var12.field3611 <= var8) {
                                    var11.field2935 = true;
                                    int var13 = var11.method115();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3611 += var13;
                                    }
                                    if (var4 >= this.field1556) {
                                        break label107;
                                    }
                                    class156 var14 = var11.method101();
                                    if (var14 != null) {
                                        int var15 = var11.field2936;
                                        while (var14 != null) {
                                            this.method480(var15 * var14.method962() >> 8, var14, (byte) -116);
                                            var14 = var11.method116();
                                        }
                                    }
                                    class156 var16 = var11.field2934;
                                    var11.field2934 = null;
                                    if (var10 == null) {
                                        this.field1561[var7] = var16;
                                    } else {
                                        var10.field2934 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1567[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2934;
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
                class156 var18 = this.field1561[var17];
                this.field1561[var17] = this.field1567[var17] = null;
                while (var18 != null) {
                    class156 var19 = var18.field2934;
                    var18.field2934 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1560 < 0) {
            this.field1560 = 0;
        }
        if (this.field1554 != null) {
            this.field1554.method108(arg0, 0, arg1);
        }
        this.field1539 = class97.method599(5);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)Z")
    public static final boolean method492(int arg0, int arg1, int arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        field1553++;
        class4 var3 = class182.method1237(true, arg2);
        if (arg1 != 2489) {
            field1550 = null;
        }
        return var3.method23(arg0, (byte) 24);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public void method493(int arg0) throws Exception {
        field1535++;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
    public final synchronized void method494(int arg0) {
        this.field1562 = true;
        try {
            this.method496();
        } catch (Exception var2) {
            this.method488();
            this.field1565 = class97.method599(5) + 2000L;
        }
        field1569++;
        if (arg0 != 2000) {
            this.field1559 = 104;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)I")
    public static final int method495(byte arg0, int arg1) {
        int var2 = 78 % ((arg0 - 8) / 55);
        field1549++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "()V")
    public void method496() throws Exception {
        field1541++;
    }
}
