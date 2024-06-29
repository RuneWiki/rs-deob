import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class96 {

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "Lti;")
    private class222 field1596 = new class222();

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "Lti;")
    private class222 field1597 = new class222();

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "Lti;")
    private class222 field1598 = new class222();

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "Lti;")
    private class222 field1599 = new class222();

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "Lpe;")
    private class101 field1602 = new class101(4);

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "B")
    private byte field1605 = 0;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public volatile int field1606 = 0;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public volatile int field1607 = 0;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "Lpe;")
    private class101 field1604 = new class101(8);

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field1581 = -1;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "S")
    public static short field1592 = 1;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    private int field1603;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "J")
    private long field1601;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "Loh;")
    private class16 field1600;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "Lbj;")
    private class55 field1608;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I", line = 11)
    private final int method684(int arg0) {
        if (arg0 >= -9) {
            return 24;
        } else {
            field1576++;
            return this.field1598.method1614(0) + this.field1599.method1614(0);
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)Z", line = 23)
    public final boolean method685(int arg0) {
        if (arg0 != 15989) {
            this.field1596 = (class222) null;
        }
        field1589++;
        return this.method684(arg0 ^ 0xFFFFC1AB) >= 20;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V", line = 41)
    public final void method686(int arg0) {
        if (arg0 != 0) {
            this.field1606 = 4;
        }
        field1588++;
        if (this.field1600 != null) {
            this.field1600.method134((byte) -14);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)Z", line = 58)
    public final boolean method687(byte arg0) {
        field1578++;
        if (arg0 <= 41) {
            method693((byte) -100, (class64) null, (class64) null, (class64) null, (class64) null);
        }
        return this.method690(-23) >= 20;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V", line = 69)
    public static final void method688(int arg0) {
        class9.field137 = 0;
        class75.field1160 = 0;
        field1579++;
        class252.method1778(true);
        class11.method102((byte) -97);
        class206.method1505(-63);
        class126.method947(false);
        for (int var1 = 0; var1 < class9.field137; var1++) {
            int var2 = class197.field3126[var1];
            if (class205.field3252 != class82.field1228[var2].field1462) {
                if (class82.field1228[var2].field483 > 0) {
                    class41.method331((byte) -96, class82.field1228[var2]);
                }
                class82.field1228[var2] = null;
            }
        }
        if (class45.field779 != class267.field4132.field1667) {
            throw new RuntimeException("gpp1 pos:" + class267.field4132.field1667 + " psize:" + class45.field779);
        }
        for (int var3 = 0; var3 < class65.field1058; var3++) {
            if (class82.field1228[class149.field2398[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class65.field1058);
            }
        }
        if (arg0 != 4) {
            method688(-121);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLoh;Z)V", line = 122)
    public final void method689(byte arg0, class16 arg1, boolean arg2) {
        if (this.field1600 != null) {
            try {
                this.field1600.method131(-11918);
            } catch (Exception var11) {
            }
            this.field1600 = null;
        }
        this.field1600 = arg1;
        this.method694((byte) -124);
        if (arg0 <= 11) {
            this.field1603 = -91;
        }
        this.method691(arg2, (byte) 61);
        this.field1608 = null;
        field1582++;
        this.field1604.field1667 = 0;
        while (true) {
            class55 var5 = (class55) this.field1597.method1609(-1709);
            if (var5 == null) {
                while (true) {
                    class55 var6 = (class55) this.field1599.method1609(-1709);
                    if (var6 == null) {
                        if (this.field1605 != 0) {
                            try {
                                this.field1602.field1667 = 0;
                                this.field1602.method772((byte) -118, 4);
                                this.field1602.method772((byte) -74, this.field1605);
                                this.field1602.method728(0, 1234856744);
                                this.field1600.method136(4, this.field1602.field1661, (byte) -4, 0);
                            } catch (IOException var10) {
                                try {
                                    this.field1600.method131(-11918);
                                } catch (Exception var9) {
                                }
                                this.field1607 = -2;
                                this.field1606++;
                                this.field1600 = null;
                            }
                        }
                        this.field1603 = 0;
                        this.field1601 = class154.method1172((byte) 119);
                        return;
                    }
                    this.field1598.method1616(1, var6);
                }
            }
            this.field1596.method1616(1, var5);
        }
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)I", line = 193)
    public final int method690(int arg0) {
        field1587++;
        int var2 = -56 % ((70 - arg0) / 51);
        return this.field1596.method1614(0) + this.field1597.method1614(0);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZB)V", line = 204)
    public final void method691(boolean arg0, byte arg1) {
        field1593++;
        if (this.field1600 == null) {
            return;
        }
        try {
            this.field1602.field1667 = 0;
            this.field1602.method772((byte) -95, arg0 ? 2 : 3);
            this.field1602.method732(0, 103);
            this.field1600.method136(4, this.field1602.field1661, (byte) -4, 0);
        } catch (IOException var6) {
            try {
                this.field1600.method131(-11918);
            } catch (Exception var5) {
            }
            this.field1606++;
            this.field1607 = -2;
            this.field1600 = null;
        }
        if (arg1 != 61) {
            field1577 = 46;
        }
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)Z", line = 231)
    public final boolean method692(int arg0) {
        if (this.field1600 != null) {
            long var2 = class154.method1172((byte) 122);
            int var4 = (int) (var2 - this.field1601);
            this.field1601 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1603 += var4;
            if (this.field1603 > 30000) {
                try {
                    this.field1600.method131(-11918);
                } catch (Exception var30) {
                }
                this.field1600 = null;
            }
        }
        field1580++;
        if (this.field1600 == null) {
            return this.method690(arg0 - 68) == 0 && this.method684(arg0 - 71) == 0;
        }
        try {
            this.field1600.method130((byte) 81);
            for (class55 var6 = (class55) this.field1596.method1612(false); var6 != null; var6 = (class55) this.field1596.method1615(false)) {
                this.field1602.field1667 = 0;
                this.field1602.method772((byte) -125, 1);
                this.field1602.method732((int) var6.field1191, arg0 ^ 0x78);
                this.field1600.method136(4, this.field1602.field1661, (byte) -4, 0);
                this.field1597.method1616(1, var6);
            }
            for (class55 var7 = (class55) this.field1598.method1612(false); var7 != null; var7 = (class55) this.field1598.method1615(false)) {
                this.field1602.field1667 = 0;
                this.field1602.method772((byte) -81, 0);
                this.field1602.method732((int) var7.field1191, 119);
                this.field1600.method136(4, this.field1602.field1661, (byte) -4, 0);
                this.field1599.method1616(1, var7);
            }
            if (arg0 != 4) {
                return true;
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field1600.method137((byte) 67);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field1603 = 0;
                byte var10 = 0;
                if (this.field1608 == null) {
                    var10 = 8;
                } else if (this.field1608.field867 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field1604.field1667;
                    if (var9 < var11) {
                        var11 = var9;
                    }
                    this.field1600.method139(this.field1604.field1661, -3, var11, this.field1604.field1667);
                    if (this.field1605 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field1604.field1661[this.field1604.field1667 + var12] = (byte) class29.method193(this.field1604.field1661[this.field1604.field1667 + var12], this.field1605);
                        }
                    }
                    this.field1604.field1667 += var11;
                    if (this.field1604.field1667 >= var10) {
                        if (this.field1608 == null) {
                            this.field1604.field1667 = 0;
                            int var13 = this.field1604.method741(122);
                            int var14 = this.field1604.method731(false);
                            int var15 = this.field1604.method741(110);
                            int var16 = var15 & 0x7F;
                            int var17 = this.field1604.method775(-120);
                            boolean var18 = (var15 & 0x80) != 0;
                            Object var19 = null;
                            long var20 = (long) ((var13 << 16) + var14);
                            class55 var22;
                            if (var18) {
                                for (var22 = (class55) this.field1599.method1612(false); var22 != null && var22.field1191 != var20; var22 = (class55) this.field1599.method1615(false)) {
                                }
                            } else {
                                for (var22 = (class55) this.field1597.method1612(false); var22 != null && var22.field1191 != var20; var22 = (class55) this.field1597.method1615(false)) {
                                }
                            }
                            if (var22 == null) {
                                throw new IOException();
                            }
                            this.field1608 = var22;
                            int var23 = var16 == 0 ? 5 : 9;
                            this.field1608.field874 = new class101(this.field1608.field868 + var23 + var17);
                            this.field1608.field874.method772((byte) -128, var16);
                            this.field1608.field874.method784(-102, var17);
                            this.field1608.field867 = 8;
                            this.field1604.field1667 = 0;
                        } else if (this.field1608.field867 != 0) {
                            throw new IOException();
                        } else if (this.field1604.field1661[0] == -1) {
                            this.field1604.field1667 = 0;
                            this.field1608.field867 = 1;
                        } else {
                            this.field1608 = null;
                        }
                    }
                } else {
                    int var24 = this.field1608.field874.field1661.length - this.field1608.field868;
                    int var25 = 512 - this.field1608.field867;
                    if ((var24 - this.field1608.field874.field1667) < var25) {
                        var25 = var24 - this.field1608.field874.field1667;
                    }
                    if (var25 > var9) {
                        var25 = var9;
                    }
                    this.field1600.method139(this.field1608.field874.field1661, -3, var25, this.field1608.field874.field1667);
                    if (this.field1605 != 0) {
                        for (int var26 = 0; var26 < var25; var26++) {
                            this.field1608.field874.field1661[this.field1608.field874.field1667 + var26] = (byte) class29.method193(this.field1608.field874.field1661[this.field1608.field874.field1667 + var26], this.field1605);
                        }
                    }
                    this.field1608.field874.field1667 += var25;
                    this.field1608.field867 += var25;
                    if (this.field1608.field874.field1667 == var24) {
                        this.field1608.method571(7);
                        this.field1608.field4940 = false;
                        this.field1608 = null;
                    } else if (this.field1608.field867 == 512) {
                        this.field1608.field867 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field1600.method131(arg0 - 11922);
            } catch (Exception var29) {
            }
            this.field1600 = null;
            this.field1607 = -2;
            this.field1606++;
            return this.method690(0) == 0 && this.method684(-126) == 0;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLja;Lja;Lja;Lja;)V", line = 510)
    public static final void method693(byte arg0, class64 arg1, class64 arg2, class64 arg3, class64 arg4) {
        class132.field2117 = arg4;
        class282.field4355 = arg1;
        class152.field2453 = arg3;
        class160.field2524 = arg2;
        field1594++;
        class207.field3269 = new class292[class160.field2524.method466((byte) 23)][];
        class12.field238 = new boolean[class160.field2524.method466((byte) 23)];
        if (arg0 != 7) {
            method688(76);
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V", line = 530)
    private final void method694(byte arg0) {
        field1595++;
        if (this.field1600 == null || arg0 > -8) {
            return;
        }
        try {
            this.field1602.field1667 = 0;
            this.field1602.method772((byte) -61, 6);
            this.field1602.method732(3, 124);
            this.field1600.method136(4, this.field1602.field1661, (byte) -4, 0);
        } catch (IOException var5) {
            try {
                this.field1600.method131(-11918);
            } catch (Exception var4) {
            }
            this.field1600 = null;
            this.field1607 = -2;
            this.field1606++;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 557)
    public static final void method695(String arg0, int arg1, int arg2) {
        class231.field3674++;
        field1583++;
        class269.field4191.method246(false, 53);
        if (arg2 == -22594) {
            class269.field4191.method748((byte) 125, class36.method281(39, arg0));
            class269.field4191.method735((byte) 66, arg1);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIBZI)Lbj;", line = 573)
    public final class55 method696(int arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        long var6 = (long) ((arg4 << 16) + arg1);
        if (arg0 != 745955184) {
            this.method684(-15);
        }
        class55 var8 = new class55();
        var8.field1191 = var6;
        var8.field868 = arg2;
        field1584++;
        var8.field4935 = arg3;
        if (arg3) {
            if (this.method690(125) >= 20) {
                throw new RuntimeException();
            }
            this.field1596.method1616(1, var8);
        } else if (this.method684(-84) < 20) {
            this.field1598.method1616(1, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V", line = 614)
    public final void method697(byte arg0) {
        if (arg0 != 35) {
            this.method697((byte) -42);
        }
        field1591++;
        if (this.field1600 == null) {
            return;
        }
        try {
            this.field1602.field1667 = 0;
            this.field1602.method772((byte) -102, 7);
            this.field1602.method732(0, 112);
            this.field1600.method136(4, this.field1602.field1661, (byte) -4, 0);
        } catch (IOException var5) {
            try {
                this.field1600.method131(-11918);
            } catch (Exception var4) {
            }
            this.field1600 = null;
            this.field1607 = -2;
            this.field1606++;
        }
    }

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)V", line = 647)
    public final void method698(int arg0) {
        try {
            this.field1600.method131(-11918);
        } catch (Exception var4) {
        }
        this.field1600 = null;
        int var3 = 36 / ((27 - arg0) / 58);
        this.field1606++;
        this.field1605 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        field1585++;
        this.field1607 = -1;
    }

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "(I)V", line = 663)
    public final void method699(int arg0) {
        if (arg0 != 0) {
            field1592 = -116;
        }
        if (this.field1600 != null) {
            this.field1600.method131(arg0 ^ 0xFFFFD172);
        }
        field1590++;
    }
}
