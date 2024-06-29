import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class119 {

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    private int field1601 = 128;

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
    private int field1610 = -1;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    private int field1604 = 128;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    private int field1602 = 0;

    @OriginalMember(owner = "client!cw", name = "o", descriptor = "I")
    private int field1614 = 0;

    @OriginalMember(owner = "client!cw", name = "y", descriptor = "B")
    public byte field1624 = 0;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "Z")
    public boolean field1603 = false;

    @OriginalMember(owner = "client!cw", name = "s", descriptor = "I")
    private int field1618 = 0;

    @OriginalMember(owner = "client!cw", name = "q", descriptor = "I")
    public int field1616 = -1;

    @OriginalMember(owner = "client!cw", name = "n", descriptor = "[I")
    public static int[] field1613 = new int[14];

    @OriginalMember(owner = "client!cw", name = "w", descriptor = "Lff;")
    public static class9 field1622 = new class9(4);

    @OriginalMember(owner = "client!cw", name = "D", descriptor = "I")
    public static int field1629 = 0;

    @OriginalMember(owner = "client!cw", name = "C", descriptor = "Luf;")
    public static class310 field1628 = new class310(96, 10);

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!cw", name = "l", descriptor = "I")
    private int field1611;

    @OriginalMember(owner = "client!cw", name = "r", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!cw", name = "t", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!cw", name = "u", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!cw", name = "v", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!cw", name = "B", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "client!cw", name = "m", descriptor = "Lii;")
    public class387 field1612;

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "Lgl;")
    public static class425 field1625;

    @OriginalMember(owner = "client!cw", name = "p", descriptor = "[I")
    public static int[] field1615;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "[S")
    private short[] field1600;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "[S")
    private short[] field1608;

    @OriginalMember(owner = "client!cw", name = "x", descriptor = "[S")
    private short[] field1623;

    @OriginalMember(owner = "client!cw", name = "A", descriptor = "[S")
    private short[] field1626;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILqa;Lna;BZLna;IIIILbk;II)Lc;")
    public final class121 method751(int arg0, class162 arg1, class35 arg2, byte arg3, boolean arg4, class35 arg5, int arg6, int arg7, int arg8, int arg9, class253 arg10, int arg11, int arg12) {
        field1606++;
        if (arg3 > -81) {
            this.field1626 = null;
        }
        return this.method758(arg12, arg5, arg0, arg7, arg9, -29547, arg6, arg1, arg10, (byte) 2, arg2, arg4, arg11, arg8);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IZLlh;)V")
    private final void method752(int arg0, boolean arg1, class365 arg2) {
        if (arg0 == 1) {
            this.field1611 = arg2.method2062((byte) 14);
        } else if (arg0 == 2) {
            this.field1616 = arg2.method2062((byte) 14);
        } else if (arg0 == 4) {
            this.field1604 = arg2.method2062((byte) 14);
        } else if (arg0 == 5) {
            this.field1601 = arg2.method2062((byte) 14);
        } else if (arg0 == 6) {
            this.field1618 = arg2.method2062((byte) 14);
        } else if (arg0 == 7) {
            this.field1614 = arg2.method2099(255);
        } else if (arg0 == 8) {
            this.field1602 = arg2.method2099(255);
        } else if (arg0 == 9) {
            this.field1624 = 3;
            this.field1610 = 8224;
        } else if (arg0 == 10) {
            this.field1603 = true;
        } else if (arg0 == 11) {
            this.field1624 = 1;
        } else if (arg0 == 12) {
            this.field1624 = 4;
        } else if (arg0 == 13) {
            this.field1624 = 5;
        } else if (arg0 == 14) {
            this.field1624 = 2;
            this.field1610 = arg2.method2099(255) * 256;
        } else if (arg0 == 15) {
            this.field1624 = 3;
            this.field1610 = arg2.method2062((byte) 14);
        } else if (arg0 == 16) {
            this.field1624 = 3;
            this.field1610 = arg2.method2056((byte) -128);
        } else if (arg0 == 40) {
            int var4 = arg2.method2099(255);
            this.field1608 = new short[var4];
            this.field1623 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1623[var5] = (short) arg2.method2062((byte) 14);
                this.field1608[var5] = (short) arg2.method2062((byte) 14);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method2099(255);
            this.field1600 = new short[var6];
            this.field1626 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1600[var7] = (short) arg2.method2062((byte) 14);
                this.field1626[var7] = (short) arg2.method2062((byte) 14);
            }
        }
        field1605++;
        if (arg1) {
            method756(79);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIILbk;IILqa;)Lc;")
    public final class121 method753(int arg0, int arg1, int arg2, class253 arg3, int arg4, int arg5, class162 arg6) {
        field1617++;
        if (arg1 < 115) {
            this.method753(-31, 7, 49, null, 100, 109, null);
        }
        return this.method758(0, null, arg2, arg4, arg0, -29547, arg5, arg6, arg3, (byte) 2, null, false, 0, 0);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILlh;)V")
    public final void method754(int arg0, class365 arg1) {
        while (true) {
            int var3 = arg1.method2099(arg0 ^ 0x2AF9);
            if (var3 == 0) {
                field1609++;
                if (arg0 != 10758) {
                    this.field1626 = null;
                    return;
                }
                return;
            }
            this.method752(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lbk;BILqa;III)Lc;")
    public final class121 method755(class253 arg0, byte arg1, int arg2, class162 arg3, int arg4, int arg5, int arg6) {
        field1607++;
        if (arg1 > -35) {
            this.method752(112, true, null);
        }
        return this.method758(0, null, arg6, arg4, arg5, -29547, arg2, arg3, arg0, (byte) 5, null, false, 0, 0);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
    public static void method756(int arg0) {
        field1615 = null;
        field1625 = null;
        if (arg0 != -9) {
            method756(-83);
        }
        field1622 = null;
        field1628 = null;
        field1613 = null;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIZIII)V")
    public static final void method757(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1621++;
        int var6 = class497.method2935(class54.field753, arg4, class343.field4727, -128);
        if (!arg2) {
            field1615 = null;
        }
        int var7 = class497.method2935(class54.field753, arg1, class343.field4727, -128);
        int var8 = class497.method2935(class175.field2497, arg3, class382.field5379, -127);
        int var9 = class497.method2935(class175.field2497, arg5, class382.field5379, -126);
        for (int var10 = var6; var10 <= var7; var10++) {
            class419.method2511(class225.field3174[var10], var8, arg0, var9, -91);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILna;IIIIILqa;Lbk;BLna;ZII)Lc;")
    private final class121 method758(int arg0, class35 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class162 arg7, class253 arg8, byte arg9, class35 arg10, boolean arg11, int arg12, int arg13) {
        field1619++;
        int var15 = arg6;
        class467 var16 = this.field1616 == -1 || arg3 == -1 ? null : arg8.method1484(0, this.field1616);
        boolean var17 = arg11 & this.field1624 != 0;
        if (var16 != null) {
            var15 = arg6 | var16.method2745(false, 29742, arg2, arg3);
        }
        if (var17) {
            var15 |= this.field1624 == 3 ? 7 : 2;
        }
        if (this.field1601 != 128) {
            var15 |= 0x2;
        }
        if (this.field1604 != 128 || this.field1618 != 0) {
            var15 |= 0x5;
        }
        class9 var18 = this.field1612.field5444;
        class121 var19;
        synchronized (this.field1612.field5444) {
            var19 = (class121) this.field1612.field5444.method56((long) (this.field1627 |= arg7.field2310 << 29), 65);
        }
        if (var19 == null || arg7.method472(var19.method775(), var15) != 0) {
            if (var19 != null) {
                var15 = arg7.method463(var15, var19.method775());
            }
            int var20 = var15;
            if (this.field1623 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field1600 != null) {
                var20 |= 0x8000;
            }
            class94 var21 = class183.method1110(this.field1612.field5434, -5960, this.field1611, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field1251 < 13) {
                var21.method630(117, 0);
            }
            var19 = arg7.method540(var21, var20, this.field1612.field5445, this.field1614 + 64, this.field1602 + 850);
            if (this.field1623 != null) {
                for (int var22 = 0; var22 < this.field1623.length; var22++) {
                    var19.method791(this.field1623[var22], this.field1608[var22]);
                }
            }
            if (this.field1600 != null) {
                for (int var23 = 0; var23 < this.field1600.length; var23++) {
                    var19.method808(this.field1600[var23], this.field1626[var23]);
                }
            }
            var19.method787(var15);
            class9 var24 = this.field1612.field5444;
            synchronized (this.field1612.field5444) {
                this.field1612.field5444.method73((long) (this.field1627 |= arg7.field2310 << 29), var19, 26425);
            }
        }
        class121 var25 = var16 == null ? var19.method761(arg9, var15, true) : var16.method2748(arg9, arg3, var19, var15, arg4, 32, 0, arg2);
        if (this.field1604 != 128 || this.field1601 != 128) {
            var25.method769(this.field1604, this.field1601, this.field1604);
        }
        if (arg5 != -29547) {
            this.method755(null, (byte) -33, -18, null, 23, 64, 25);
        }
        if (this.field1618 != 0) {
            if (this.field1618 == 90) {
                var25.method798(4096);
            }
            if (this.field1618 == 180) {
                var25.method798(8192);
            }
            if (this.field1618 == 270) {
                var25.method798(12288);
            }
        }
        if (var17) {
            var25.method774(this.field1624, this.field1610, arg10, arg1, arg0, arg12, arg13);
        }
        var25.method787(arg6);
        return var25;
    }
}
