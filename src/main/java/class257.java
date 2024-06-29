import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class257 {

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Lna;")
    private class31 field4540 = new class31();

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "Lna;")
    private class31 field4546 = new class31();

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "Lna;")
    private class31 field4552 = new class31();

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "Lna;")
    private class31 field4555 = new class31();

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "Llj;")
    private class25 field4556 = new class25(4);

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public volatile int field4561 = 0;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "B")
    private byte field4562 = 0;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public volatile int field4563 = 0;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "Llj;")
    private class25 field4560 = new class25(8);

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Lp;")
    public static class280 field4535 = class18.method140((byte) -121, "Veuillez commencer par supprimer ");

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field4543 = 0;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Lp;")
    public static class280 field4539 = class18.method140((byte) -126, "Ausw-=hlen");

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Lp;")
    public static class280 field4533 = class18.method140((byte) -128, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "Lp;")
    public static class280 field4542 = class18.method140((byte) -128, "(U (X");

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    private int field4558;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "J")
    private long field4559;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "Lre;")
    private class219 field4564;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "Lal;")
    private class227 field4557;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "[S")
    public static short[] field4544;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public final void method1731(int arg0) {
        if (this.field4557 != null) {
            this.field4557.method1532(61);
        }
        field4554++;
        int var2 = 31 % ((arg0 + 20) / 62);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZB)V")
    public final void method1732(boolean arg0, byte arg1) {
        field4549++;
        if (this.field4557 == null) {
            return;
        }
        if (arg1 <= 40) {
            this.method1739((byte) -20);
        }
        try {
            this.field4556.field481 = 0;
            this.field4556.method227(-20435, arg0 ? 2 : 3);
            this.field4556.method234(-25832, 0);
            this.field4557.method1526(4, 39, 0, this.field4556.field475);
        } catch (IOException var4) {
            try {
                this.field4557.method1532(59);
            } catch (Exception var3) {
            }
            this.field4557 = null;
            this.field4561++;
            this.field4563 = -2;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public final void method1733(int arg0) {
        field4538++;
        if (this.field4557 == null) {
            return;
        }
        try {
            this.field4556.field481 = 0;
            if (arg0 != -2) {
                this.field4555 = null;
            }
            this.field4556.method227(-20435, 7);
            this.field4556.method234(-25832, 0);
            this.field4557.method1526(4, arg0, 0, this.field4556.field475);
        } catch (IOException var3) {
            try {
                this.field4557.method1532(35);
            } catch (Exception var2) {
            }
            this.field4557 = null;
            this.field4563 = -2;
            this.field4561++;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)Z")
    public final boolean method1734(int arg0) {
        field4545++;
        if (this.field4557 != null) {
            long var2 = class77.method569((byte) -113);
            int var4 = (int) (var2 - this.field4559);
            this.field4559 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4558 += var4;
            if (this.field4558 > 30000) {
                try {
                    this.field4557.method1532(36);
                } catch (Exception var27) {
                }
                this.field4557 = null;
            }
        }
        if (arg0 != -13970) {
            this.method1746((byte) -7);
        }
        if (this.field4557 == null) {
            return this.method1744((byte) -77) == 0 && this.method1737(true) == 0;
        }
        try {
            this.field4557.method1524(92);
            for (class219 var5 = (class219) this.field4540.method274((byte) -105); var5 != null; var5 = (class219) this.field4540.method272(true)) {
                this.field4556.field481 = 0;
                this.field4556.method227(arg0 - 6465, 1);
                this.field4556.method234(-25832, (int) var5.field865);
                this.field4557.method1526(4, -127, 0, this.field4556.field475);
                this.field4546.method273(0, var5);
            }
            for (class219 var6 = (class219) this.field4552.method274((byte) -120); var6 != null; var6 = (class219) this.field4552.method272(true)) {
                this.field4556.field481 = 0;
                this.field4556.method227(arg0 - 6465, 0);
                this.field4556.method234(-25832, (int) var6.field865);
                this.field4557.method1526(4, -98, 0, this.field4556.field475);
                this.field4555.method273(0, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field4557.method1525(5000);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field4558 = 0;
                byte var9 = 0;
                if (this.field4564 == null) {
                    var9 = 8;
                } else if (this.field4564.field3751 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field4560.field481;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field4557.method1528(this.field4560.field481, var10, (byte) 87, this.field4560.field475);
                    if (this.field4562 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field4560.field475[this.field4560.field481 + var11] = (byte) class234.method1572(this.field4560.field475[this.field4560.field481 + var11], this.field4562);
                        }
                    }
                    this.field4560.field481 += var10;
                    if (var9 <= this.field4560.field481) {
                        if (this.field4564 == null) {
                            this.field4560.field481 = 0;
                            int var12 = this.field4560.method189((byte) -103);
                            int var13 = this.field4560.method193((byte) 77);
                            int var14 = this.field4560.method189((byte) -103);
                            int var15 = var14 & 0x7F;
                            boolean var16 = (var14 & 0x80) != 0;
                            Object var17 = null;
                            long var18 = (long) ((var12 << 16) + var13);
                            int var20 = this.field4560.method199((byte) -85);
                            class219 var21;
                            if (var16) {
                                for (var21 = (class219) this.field4555.method274((byte) -127); var21 != null && var21.field865 != var18; var21 = (class219) this.field4555.method272(true)) {
                                }
                            } else {
                                for (var21 = (class219) this.field4546.method274((byte) 27); var21 != null && var21.field865 != var18; var21 = (class219) this.field4546.method272(true)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field4564 = var21;
                            int var22 = var15 == 0 ? 5 : 9;
                            this.field4564.field3742 = new class25(var20 + var22 + this.field4564.field3743);
                            this.field4564.field3742.method227(arg0 - 6465, var15);
                            this.field4564.field3742.method231(11510, var20);
                            this.field4564.field3751 = 8;
                            this.field4560.field481 = 0;
                        } else if (this.field4564.field3751 != 0) {
                            throw new IOException();
                        } else if (this.field4560.field475[0] == -1) {
                            this.field4564.field3751 = 1;
                            this.field4560.field481 = 0;
                        } else {
                            this.field4564 = null;
                        }
                    }
                } else {
                    int var23 = 512 - this.field4564.field3751;
                    int var24 = this.field4564.field3742.field475.length - this.field4564.field3743;
                    if (var23 > (var24 - this.field4564.field3742.field481)) {
                        var23 = var24 - this.field4564.field3742.field481;
                    }
                    if (var8 < var23) {
                        var23 = var8;
                    }
                    this.field4557.method1528(this.field4564.field3742.field481, var23, (byte) 97, this.field4564.field3742.field475);
                    if (this.field4562 != 0) {
                        for (int var25 = 0; var25 < var23; var25++) {
                            this.field4564.field3742.field475[this.field4564.field3742.field481 + var25] = (byte) class234.method1572(this.field4564.field3742.field475[this.field4564.field3742.field481 + var25], this.field4562);
                        }
                    }
                    this.field4564.field3751 += var23;
                    this.field4564.field3742.field481 += var23;
                    if (this.field4564.field3742.field481 == var24) {
                        this.field4564.method392(1);
                        this.field4564.field721 = false;
                        this.field4564 = null;
                    } else if (this.field4564.field3751 == 512) {
                        this.field4564.field3751 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field4557.method1532(arg0 ^ 0xFFFFC90B);
            } catch (Exception var26) {
            }
            this.field4557 = null;
            this.field4561++;
            this.field4563 = -2;
            return this.method1744((byte) -86) == 0 && this.method1737(true) == 0;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)Z")
    public final boolean method1735(boolean arg0) {
        if (arg0) {
            this.field4559 = -99L;
        }
        field4537++;
        return this.method1744((byte) 82) >= 20;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZLal;B)V")
    public final void method1736(boolean arg0, class227 arg1, byte arg2) {
        field4530++;
        if (this.field4557 != null) {
            try {
                this.field4557.method1532(45);
            } catch (Exception var8) {
            }
            this.field4557 = null;
        }
        this.field4557 = arg1;
        this.method1742(true);
        this.method1732(arg0, (byte) 69);
        this.field4560.field481 = 0;
        this.field4564 = null;
        while (true) {
            class219 var4 = (class219) this.field4546.method267(-128);
            if (var4 == null) {
                while (true) {
                    class219 var5 = (class219) this.field4555.method267(-121);
                    if (var5 == null) {
                        if (this.field4562 != 0) {
                            try {
                                this.field4556.field481 = 0;
                                this.field4556.method227(-20435, 4);
                                this.field4556.method227(-20435, this.field4562);
                                this.field4556.method214(-3, 0);
                                this.field4557.method1526(4, -6, 0, this.field4556.field475);
                            } catch (IOException var7) {
                                try {
                                    this.field4557.method1532(100);
                                } catch (Exception var6) {
                                }
                                this.field4563 = -2;
                                this.field4561++;
                                this.field4557 = null;
                            }
                        }
                        this.field4558 = 0;
                        if (arg2 <= 71) {
                            this.method1734(-96);
                        }
                        this.field4559 = class77.method569((byte) -123);
                        return;
                    }
                    this.field4552.method273(0, var5);
                }
            }
            this.field4540.method273(0, var4);
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)I")
    private final int method1737(boolean arg0) {
        field4531++;
        return arg0 ? this.field4552.method271(-27134) + this.field4555.method271(-27134) : -96;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
    public final void method1738(int arg0) {
        if (this.field4557 != null) {
            this.field4557.method1531(114);
        }
        if (arg0 <= 32) {
            this.method1737(true);
        }
        field4551++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)Z")
    public final boolean method1739(byte arg0) {
        field4536++;
        if (arg0 <= 34) {
            this.field4558 = -98;
        }
        return this.method1737(true) >= 20;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBI)Lnf;")
    public static final class157 method1740(int arg0, byte arg1, int arg2) {
        class157 var3 = (class157) class24.field434.method150((long) arg0 | (long) arg2 << 32, 93);
        field4548++;
        if (var3 == null) {
            var3 = new class157(arg2, arg0);
            class24.field434.method148(-1, var3, var3.field2827);
        }
        int var4 = -58 % ((arg1 - 8) / 59);
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V")
    public static void method1741(byte arg0) {
        field4539 = null;
        field4542 = null;
        field4544 = null;
        field4535 = null;
        int var1 = 35 % ((-arg0 - 82) / 32);
        field4533 = null;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(Z)V")
    private final void method1742(boolean arg0) {
        field4547++;
        if (this.field4557 == null) {
            return;
        }
        try {
            if (!arg0) {
                field4533 = null;
            }
            this.field4556.field481 = 0;
            this.field4556.method227(-20435, 6);
            this.field4556.method234(-25832, 3);
            this.field4557.method1526(4, 40, 0, this.field4556.field475);
        } catch (IOException var3) {
            try {
                this.field4557.method1532(83);
            } catch (Exception var2) {
            }
            this.field4561++;
            this.field4557 = null;
            this.field4563 = -2;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([Lua;BI)V")
    public static final void method1743(class113[] arg0, byte arg1, int arg2) {
        if (arg1 >= -32) {
            method1741((byte) 109);
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class113 var4 = arg0[var3];
            if (var4 != null && var4.field1998 == arg2 && (!var4.field2008 || !client.method1101(var4))) {
                if (var4.field1879 == 0) {
                    if (!var4.field2008 && client.method1101(var4) && class185.field3251 != var4) {
                        continue;
                    }
                    method1743(arg0, (byte) -55, var4.field1964);
                    if (var4.field1865 != null) {
                        method1743(var4.field1865, (byte) -83, var4.field1964);
                    }
                    class144 var5 = (class144) class261.field4614.method150((long) var4.field1964, -110);
                    if (var5 != null) {
                        class89.method638(var5.field2517, 32588);
                    }
                }
                if (var4.field1879 == 6) {
                    if (var4.field2007 != -1 || var4.field1972 != -1) {
                        boolean var6 = class259.method1752((byte) -117, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field1972;
                        } else {
                            var7 = var4.field2007;
                        }
                        if (var7 != -1) {
                            class78 var8 = class207.method1401((byte) -22, var7);
                            if (var8 != null) {
                                var4.field1912 += class165.field2889;
                                while (var8.field1268[var4.field1884] < var4.field1912) {
                                    var4.field1912 -= var8.field1268[var4.field1884];
                                    var4.field1884++;
                                    if (var4.field1884 >= var8.field1275.length) {
                                        var4.field1884 -= var8.field1285;
                                        if (var4.field1884 < 0 || var4.field1884 >= var8.field1275.length) {
                                            var4.field1884 = 0;
                                        }
                                    }
                                    class242.method1642((byte) 53, var4);
                                }
                            }
                        }
                    }
                    if (var4.field1910 != 0 && !var4.field2008) {
                        int var9 = var4.field1910 >> 16;
                        int var10 = var4.field1910 << 16 >> 16;
                        int var11 = class165.field2889 * var10;
                        var4.field1918 = var4.field1918 + var11 & 0x7FF;
                        int var12 = class165.field2889 * var9;
                        var4.field1885 = var4.field1885 + var12 & 0x7FF;
                        class242.method1642((byte) 62, var4);
                    }
                }
            }
        }
        field4534++;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)I")
    public final int method1744(byte arg0) {
        int var2 = 28 / ((arg0 - 23) / 42);
        field4532++;
        return this.field4540.method271(-27134) + this.field4546.method271(-27134);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZBII)Lre;")
    public final class219 method1745(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field4550++;
        long var6 = (long) ((arg3 << 16) + arg0);
        class219 var8 = new class219();
        int var9 = -103 / ((41 - arg4) / 62);
        var8.field3743 = arg2;
        var8.field865 = var6;
        var8.field719 = arg1;
        if (arg1) {
            if (this.method1744((byte) -66) >= 20) {
                throw new RuntimeException();
            }
            this.field4540.method273(0, var8);
        } else if (this.method1737(true) < 20) {
            this.field4552.method273(0, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)V")
    public final void method1746(byte arg0) {
        try {
            this.field4557.method1532(89);
        } catch (Exception var2) {
        }
        field4553++;
        this.field4562 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field4563 = -1;
        this.field4561++;
        if (arg0 > -57) {
            this.method1734(81);
        }
        this.field4557 = null;
    }
}
