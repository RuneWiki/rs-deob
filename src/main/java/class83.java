import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class83 {

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    private int field1623 = 32;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "J")
    private long field1626 = class80.method600(-62);

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "J")
    private long field1632 = 0L;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "[Lr;")
    private class127[] field1637 = new class127[8];

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
    private int field1635 = 0;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
    private int field1636 = 0;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "Z")
    private boolean field1640 = true;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "[Lr;")
    private class127[] field1639 = new class127[8];

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
    private int field1634 = 0;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
    private int field1631 = 0;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "J")
    private long field1641 = 0L;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Lia;")
    public static class257 field1613 = class28.method234(92, " <col=ffff00>");

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Lia;")
    public static class257 field1616 = class28.method234(86, "logo");

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "[I")
    public static int[] field1628 = new int[32];

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Z")
    public static boolean field1620 = false;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    public int field1630;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "Lr;")
    private class127 field1629;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Lme;")
    public static class44 field1608;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "[I")
    public int[] field1610;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public void method621(int arg0) throws Exception {
        field1619++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZLr;)V")
    public final synchronized void method622(boolean arg0, class127 arg1) {
        field1618++;
        if (arg0) {
            this.field1634 = 69;
        }
        this.field1629 = arg1;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
    public void method623() {
        field1609++;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
    public final synchronized void method624(int arg0) {
        field1611++;
        if (class248.field4292 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class248.field4292.field1657[var3] == this) {
                    class248.field4292.field1657[var3] = null;
                }
                if (class248.field4292.field1657[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class248.field4292.field1667 = true;
                while (class248.field4292.field1656) {
                    class33.method283(-86, 50L);
                }
                class248.field4292 = null;
            }
        }
        this.method623();
        if (arg0 < 85) {
            this.field1639 = null;
        }
        this.field1610 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method625(Component arg0) throws Exception {
        field1614++;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V")
    public static void method626(int arg0) {
        field1613 = null;
        field1616 = null;
        field1608 = null;
        field1628 = null;
        if (arg0 != -22972) {
            field1613 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "()V")
    public void method627() throws Exception {
        field1617++;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
    public final void method628(int arg0) {
        field1622++;
        if (arg0 > 118) {
            this.field1640 = true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "()V")
    public void method629() throws Exception {
        field1627++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)Lug;")
    public static final class39 method630(int arg0, int arg1, int arg2) {
        class177 var3 = class75.field1463[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class39 var4 = var3.field3019;
            var3.field3019 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V")
    public final synchronized void method631(int arg0) {
        this.field1640 = true;
        field1615++;
        if (arg0 != 16128) {
            return;
        }
        try {
            this.method629();
        } catch (Exception var2) {
            this.method623();
            this.field1641 = class80.method600(-58) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "()I")
    public int method632() throws Exception {
        field1625++;
        return this.field1633;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([II)V")
    private final void method633(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class102.field1899) {
            var3 = arg1 << 1;
        }
        class86.method646(arg0, 0, var3);
        this.field1634 -= arg1;
        if (this.field1629 != null && this.field1634 <= 0) {
            this.field1634 += class134.field2399 >> 4;
            class169.method1163(this.field1629, (byte) -119);
            this.method636(this.field1629, this.field1629.method75(), (byte) 112);
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
                        class127 var10 = null;
                        class127 var11 = this.field1637[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class223 var12 = var11.field2270;
                                if (var12 == null || var12.field3760 <= var8) {
                                    var11.field2267 = true;
                                    int var13 = var11.method37();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3760 += var13;
                                    }
                                    if (var4 >= this.field1623) {
                                        break label107;
                                    }
                                    class127 var14 = var11.method27();
                                    if (var14 != null) {
                                        int var15 = var11.field2268;
                                        while (var14 != null) {
                                            this.method636(var14, var15 * var14.method75() >> 8, (byte) -80);
                                            var14 = var11.method24();
                                        }
                                    }
                                    class127 var16 = var11.field2269;
                                    var11.field2269 = null;
                                    if (var10 == null) {
                                        this.field1637[var7] = var16;
                                    } else {
                                        var10.field2269 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1639[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2269;
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
                class127 var18 = this.field1637[var17];
                this.field1637[var17] = this.field1639[var17] = null;
                while (var18 != null) {
                    class127 var19 = var18.field2269;
                    var18.field2269 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1634 < 0) {
            this.field1634 = 0;
        }
        if (this.field1629 != null) {
            this.field1629.method12(arg0, 0, arg1);
        }
        this.field1626 = class80.method600(-127);
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)V")
    public final synchronized void method634(int arg0) {
        field1621++;
        if (this.field1610 == null) {
            return;
        }
        long var2 = class80.method600(-124);
        try {
            if (arg0 >= -83) {
                this.field1633 = -7;
            }
            if (this.field1641 != 0L) {
                if (var2 < this.field1641) {
                    return;
                }
                this.method621(this.field1633);
                this.field1640 = true;
                this.field1641 = 0L;
            }
            int var4 = this.method632();
            int var5 = this.field1630 + this.field1638;
            if ((this.field1636 - var4) > this.field1635) {
                this.field1635 = this.field1636 - var4;
            }
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field1633 < (var5 + 256)) {
                this.field1633 += 1024;
                var4 = 0;
                if (this.field1633 > 16384) {
                    this.field1633 = 16384;
                }
                this.method623();
                this.method621(this.field1633);
                this.field1640 = true;
                if ((var5 + 256) > this.field1633) {
                    var5 = this.field1633 - 256;
                    this.field1638 = var5 - this.field1630;
                }
            }
            while (var4 < var5) {
                var4 += 256;
                this.method633(this.field1610, 256);
                this.method627();
            }
            if (var2 > this.field1632) {
                if (this.field1640) {
                    this.field1640 = false;
                } else if (this.field1635 == 0 && this.field1631 == 0) {
                    this.method623();
                    this.field1641 = var2 + 2000L;
                    return;
                } else {
                    this.field1638 = Math.min(this.field1631, this.field1635);
                    this.field1631 = this.field1635;
                }
                this.field1635 = 0;
                this.field1632 = var2 + 2000L;
            }
            this.field1636 = var4;
        } catch (Exception var7) {
            this.method623();
            this.field1641 = var2 + 2000L;
        }
        try {
            if (this.field1626 + 500000L < var2) {
                var2 = this.field1626;
            }
            while ((this.field1626 + 5000L) < var2) {
                this.method635((byte) 127, 256);
                this.field1626 += (long) (256000 / class134.field2399);
            }
        } catch (Exception var6) {
            this.field1626 = var2;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)V")
    private final void method635(byte arg0, int arg1) {
        if (arg0 != 127) {
            field1613 = null;
        }
        field1612++;
        this.field1634 -= arg1;
        if (this.field1634 < 0) {
            this.field1634 = 0;
        }
        if (this.field1629 != null) {
            this.field1629.method40(arg1);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lr;IB)V")
    private final void method636(class127 arg0, int arg1, byte arg2) {
        field1624++;
        int var4 = arg1 >> 5;
        class127 var5 = this.field1639[var4];
        if (var5 == null) {
            this.field1637[var4] = arg0;
        } else {
            var5.field2269 = arg0;
        }
        this.field1639[var4] = arg0;
        int var6 = -120 / ((17 - arg2) / 43);
        arg0.field2268 = arg1;
    }
}
