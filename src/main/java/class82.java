import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class82 {

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    private int field1495 = 32;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "J")
    private long field1496 = class104.method785(-1);

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    private int field1501 = 0;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    private int field1502 = 0;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "[Lui;")
    private class113[] field1504 = new class113[8];

    @OriginalMember(owner = "client!f", name = "N", descriptor = "[Lui;")
    private class113[] field1507 = new class113[8];

    @OriginalMember(owner = "client!f", name = "J", descriptor = "J")
    private long field1503 = 0L;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "J")
    private long field1508 = 0L;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    private int field1510 = 0;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "Z")
    private boolean field1506 = true;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    private int field1511 = 0;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Lij;")
    public static class50 field1468 = class78.method578(122, "<col=00ffff>");

    @OriginalMember(owner = "client!f", name = "e", descriptor = "[I")
    public static int[] field1472 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!f", name = "w", descriptor = "Lij;")
    private static class50 field1490 = class78.method578(123, "cyan:");

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Lij;")
    public static class50 field1471 = field1490;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field1469 = 0;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "Lij;")
    public static class50 field1494 = class78.method578(126, "sl_flags");

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Lij;")
    public static class50 field1477 = field1490;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "Lij;")
    public static class50 field1486 = class78.method578(125, "<col=40ff00>");

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public int field1505;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public int field1509;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "Lui;")
    private class113 field1487;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Lwi;")
    public static class21 field1476;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "Lda;")
    public static class22 field1484;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "[I")
    public int[] field1488;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZLui;)V")
    private final void method593(int arg0, boolean arg1, class113 arg2) {
        if (arg1) {
            return;
        }
        field1485++;
        int var4 = arg0 >> 5;
        class113 var5 = this.field1507[var4];
        if (var5 == null) {
            this.field1504[var4] = arg2;
        } else {
            var5.field1991 = arg2;
        }
        this.field1507[var4] = arg2;
        arg2.field1988 = arg0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public final synchronized void method594(int arg0) {
        field1473++;
        if (this.field1488 == null) {
            return;
        }
        long var2 = class104.method785(-1);
        try {
            if (arg0 >= -101) {
                return;
            }
            if (this.field1503 != 0L) {
                if (var2 < this.field1503) {
                    return;
                }
                this.method22(this.field1505);
                this.field1506 = true;
                this.field1503 = 0L;
            }
            int var4 = this.method25();
            int var5 = this.field1509 + this.field1500;
            if ((this.field1511 - var4) > this.field1510) {
                this.field1510 = this.field1511 - var4;
            }
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field1505 < var5 + 256) {
                this.field1505 += 1024;
                if (this.field1505 > 16384) {
                    this.field1505 = 16384;
                }
                var4 = 0;
                this.method28();
                this.method22(this.field1505);
                this.field1506 = true;
                if ((var5 + 256) > this.field1505) {
                    var5 = this.field1505 - 256;
                    this.field1500 = var5 - this.field1509;
                }
            }
            while (var5 > var4) {
                this.method600(this.field1488, 256);
                this.method27();
                var4 += 256;
            }
            if (this.field1508 < var2) {
                if (this.field1506) {
                    this.field1506 = false;
                } else if (this.field1510 == 0 && this.field1501 == 0) {
                    this.method28();
                    this.field1503 = var2 + 2000L;
                    return;
                } else {
                    this.field1500 = Math.min(this.field1501, this.field1510);
                    this.field1501 = this.field1510;
                }
                this.field1510 = 0;
                this.field1508 = var2 + 2000L;
            }
            this.field1511 = var4;
        } catch (Exception var7) {
            this.method28();
            this.field1503 = var2 + 2000L;
        }
        try {
            if (var2 > this.field1496 + 500000L) {
                var2 = this.field1496;
            }
            while (var2 > this.field1496 + 5000L) {
                this.method601(0, 256);
                this.field1496 += (long) (256000 / class160.field2755);
            }
        } catch (Exception var6) {
            this.field1496 = var2;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()I")
    public int method25() throws Exception {
        field1491++;
        return this.field1505;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)Lea;")
    public static final class67 method595(byte arg0) {
        field1489++;
        class67 var1 = new class67(class89.field1707, class116.field2024, class20.field421[0], class2.field27[0], class46.field836[0], class164.field2805[0], class31.field628[0], class114.field1996);
        if (arg0 != 1) {
            method602((byte) -115);
        }
        class261.method1759(true);
        return var1;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method23(Component arg0) throws Exception {
        field1498++;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
    public final void method596(byte arg0) {
        int var2 = 62 % ((-arg0 - 51) / 48);
        field1475++;
        this.field1506 = true;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public final synchronized void method597(int arg0) {
        field1499++;
        if (class260.field4521 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class260.field4521.field3187[var3] == this) {
                    class260.field4521.field3187[var3] = null;
                }
                if (class260.field4521.field3187[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class260.field4521.field3192 = true;
                while (class260.field4521.field3193) {
                    class162.method1137(104, 50L);
                }
                class260.field4521 = null;
            }
        }
        int var4 = 29 / ((67 - arg0) / 55);
        this.method28();
        this.field1488 = null;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()V")
    public void method24() throws Exception {
        field1493++;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public static final void method598(int arg0) {
        class51.method415();
        int var1 = -72 % ((arg0 - 73) / 45);
        for (int var2 = 0; var2 < 4; var2++) {
            class45.field826[var2].method338(-22418);
        }
        field1474++;
        System.gc();
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
    public void method22(int arg0) throws Exception {
        field1470++;
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
    public final synchronized void method599(int arg0) {
        if (arg0 > -76) {
            field1472 = null;
        }
        this.field1506 = true;
        field1492++;
        try {
            this.method24();
        } catch (Exception var2) {
            this.method28();
            this.field1503 = class104.method785(-1) + 2000L;
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()V")
    public void method27() throws Exception {
        field1483++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([II)V")
    private final void method600(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class106.field1920) {
            var3 = arg1 << 1;
        }
        class105.method793(arg0, 0, var3);
        this.field1502 -= arg1;
        if (this.field1487 != null && this.field1502 <= 0) {
            this.field1502 += class160.field2755 >> 4;
            class46.method346(this.field1487, 97);
            this.method593(this.field1487.method213(), false, this.field1487);
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
                        class113 var10 = null;
                        class113 var11 = this.field1504[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class212 var12 = var11.field1989;
                                if (var12 == null || var12.field3519 <= var8) {
                                    var11.field1990 = true;
                                    int var13 = var11.method71();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3519 += var13;
                                    }
                                    if (var4 >= this.field1495) {
                                        break label107;
                                    }
                                    class113 var14 = var11.method75();
                                    if (var14 != null) {
                                        int var15 = var11.field1988;
                                        while (var14 != null) {
                                            this.method593(var15 * var14.method213() >> 8, false, var14);
                                            var14 = var11.method82();
                                        }
                                    }
                                    class113 var16 = var11.field1991;
                                    var11.field1991 = null;
                                    if (var10 == null) {
                                        this.field1504[var7] = var16;
                                    } else {
                                        var10.field1991 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1507[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1991;
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
                class113 var18 = this.field1504[var17];
                this.field1504[var17] = this.field1507[var17] = null;
                while (var18 != null) {
                    class113 var19 = var18.field1991;
                    var18.field1991 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1502 < 0) {
            this.field1502 = 0;
        }
        if (this.field1487 != null) {
            this.field1487.method72(arg0, 0, arg1);
        }
        this.field1496 = class104.method785(-1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
    private final void method601(int arg0, int arg1) {
        this.field1502 -= arg1;
        field1478++;
        if (this.field1502 < arg0) {
            this.field1502 = 0;
        }
        if (this.field1487 != null) {
            this.field1487.method81(arg1);
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V")
    public static void method602(byte arg0) {
        field1484 = null;
        field1468 = null;
        field1486 = null;
        if (arg0 > -38) {
            field1477 = null;
        }
        field1471 = null;
        field1472 = null;
        field1490 = null;
        field1494 = null;
        field1477 = null;
        field1476 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lui;B)V")
    public final synchronized void method603(class113 arg0, byte arg1) {
        this.field1487 = arg0;
        field1480++;
        if (arg1 != 47) {
            method602((byte) -4);
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()V")
    public void method28() {
        field1497++;
    }
}
