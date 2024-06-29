import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class118 extends class112 {

    @OriginalMember(owner = "client!ol", name = "Xb", descriptor = "Lok;")
    public static class41 field1723 = class137.method956("M", 45);

    @OriginalMember(owner = "client!ol", name = "hc", descriptor = "Lok;")
    public static class41 field1733 = class137.method956("::rect_debug", 45);

    @OriginalMember(owner = "client!ol", name = "ic", descriptor = "I")
    public static int field1734 = 0;

    @OriginalMember(owner = "client!ol", name = "mc", descriptor = "Lok;")
    public static class41 field1738 = class137.method956("loc", 45);

    @OriginalMember(owner = "client!ol", name = "bc", descriptor = "[I")
    public static int[] field1727 = new int[500];

    @OriginalMember(owner = "client!ol", name = "dc", descriptor = "[I")
    public static int[] field1729 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ol", name = "lc", descriptor = "[I")
    public static int[] field1737 = new int[2048];

    @OriginalMember(owner = "client!ol", name = "Zb", descriptor = "Loc;")
    public static class249 field1725 = class193.method1382(1238347303);

    @OriginalMember(owner = "client!ol", name = "oc", descriptor = "I")
    public static int field1740 = 0;

    @OriginalMember(owner = "client!ol", name = "pc", descriptor = "I")
    public static int field1741 = 0;

    @OriginalMember(owner = "client!ol", name = "Sb", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!ol", name = "Tb", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!ol", name = "Ub", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!ol", name = "Vb", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!ol", name = "Wb", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ol", name = "cc", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!ol", name = "ec", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!ol", name = "fc", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!ol", name = "gc", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!ol", name = "jc", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ol", name = "kc", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!ol", name = "nc", descriptor = "I")
    private int field1739;

    @OriginalMember(owner = "client!ol", name = "Yb", descriptor = "Lke;")
    public static class218 field1724;

    @OriginalMember(owner = "client!ol", name = "ac", descriptor = "Lcl;")
    private class30 field1726;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([IZ)V", line = 5)
    public final void method838(int[] arg0, boolean arg1) {
        if (arg1) {
            field1727 = (int[]) null;
        }
        field1736++;
        this.field1726 = new class30(arg0);
    }

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "(I)V", line = 16)
    public final void method839(int arg0) {
        field1735++;
        if (arg0 != 11892) {
            this.field1726 = (class30) null;
        }
        this.field1739 = this.field1640 * 8;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[BII)V", line = 32)
    public final void method840(int arg0, byte[] arg1, int arg2, int arg3) {
        field1722++;
        for (int var5 = 0; var5 < arg0; var5++) {
            arg1[arg2 + var5] = (byte) (this.field1607[this.field1640++] - this.field1726.method189((byte) -25));
        }
        if (arg3 != 1) {
            field1740 = 98;
        }
    }

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "(B)V", line = 50)
    public final void method841(byte arg0) {
        this.field1640 = (this.field1739 + 7) / 8;
        field1721++;
        if (arg0 <= 19) {
            this.method846(16);
        }
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(Z)V", line = 67)
    public static void method842(boolean arg0) {
        field1737 = null;
        field1727 = null;
        if (arg0) {
            return;
        }
        field1724 = null;
        field1738 = null;
        field1723 = null;
        field1733 = null;
        field1725 = null;
        field1729 = null;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(IZ)Li;", line = 86)
    public static final class120 method843(int arg0, boolean arg1) {
        if (arg1) {
            field1727 = (int[]) null;
        }
        field1719++;
        if (arg0 == 0) {
            return new class32();
        } else if (arg0 == 1) {
            return new class265();
        } else if (arg0 == 2) {
            return new class13();
        } else if (arg0 == 3) {
            return new class208();
        } else if (arg0 == 4) {
            return new class316();
        } else if (arg0 == 5) {
            return new class236();
        } else if (arg0 == 6) {
            return new class213();
        } else if (arg0 == 7) {
            return new class186();
        } else if (arg0 == 8) {
            return new class136();
        } else if (arg0 == 9) {
            return new class101();
        } else if (arg0 == 10) {
            return new class116();
        } else if (arg0 == 11) {
            return new class76();
        } else if (arg0 == 12) {
            return new class113();
        } else if (arg0 == 13) {
            return new class217();
        } else if (arg0 == 14) {
            return new class210();
        } else if (arg0 == 15) {
            return new class191();
        } else if (arg0 == 16) {
            return new class122();
        } else if (arg0 == 17) {
            return new class110();
        } else if (arg0 == 18) {
            return new class304();
        } else if (arg0 == 19) {
            return new class52();
        } else if (arg0 == 20) {
            return new class290();
        } else if (arg0 == 21) {
            return new class158();
        } else if (arg0 == 22) {
            return new class144();
        } else if (arg0 == 23) {
            return new class74();
        } else if (arg0 == 24) {
            return new class5();
        } else if (arg0 == 25) {
            return new class26();
        } else if (arg0 == 26) {
            return new class301();
        } else if (arg0 == 27) {
            return new class315();
        } else if (arg0 == 28) {
            return new class300();
        } else if (arg0 == 29) {
            return new class276();
        } else if (arg0 == 30) {
            return new class202();
        } else if (arg0 == 31) {
            return new class14();
        } else if (arg0 == 32) {
            return new class194();
        } else if (arg0 == 33) {
            return new class45();
        } else if (arg0 == 34) {
            return new class201();
        } else if (arg0 == 35) {
            return new class278();
        } else if (arg0 == 36) {
            return new class80();
        } else if (arg0 == 37) {
            return new class23();
        } else if (arg0 == 38) {
            return new class8();
        } else if (arg0 == 39) {
            return new class62();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "(II)V", line = 419)
    public final void method844(int arg0, int arg1) {
        this.field1607[this.field1640++] = (byte) (arg1 + this.field1726.method189((byte) -127));
        field1718++;
        if (arg0 != -4) {
            this.method844(-99, -74);
        }
    }

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "(B)V", line = 445)
    public static final void method845(byte arg0) {
        field1720++;
        if (!class128.field1901 || arg0 != 104) {
            return;
        }
        class302 var1 = class79.method567(-128, class3.field44, class75.field1119);
        if (var1 != null && var1.field5037 != null) {
            class73 var2 = new class73();
            var2.field1083 = var1.field5037;
            var2.field1079 = var1;
            class161.method1141(var2, true);
        }
        class128.field1901 = false;
        class18.method91(28515, var1);
    }

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "(I)I", line = 473)
    public final int method846(int arg0) {
        field1731++;
        if (arg0 != 500) {
            field1724 = (class218) null;
        }
        return this.field1607[this.field1640++] - this.field1726.method189((byte) 123) & 0xFF;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIII)V", line = 493)
    public static final void method847(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class149 var5 = (class149) class236.field3796.method1495(-312); var5 != null; var5 = (class149) class236.field3796.method1501(-99)) {
            class223.method1598(arg4, arg0, (byte) -52, arg1, arg3, var5);
        }
        field1730++;
        for (class149 var6 = (class149) class140.field2149.method1495(-312); var6 != null; var6 = (class149) class140.field2149.method1501(-115)) {
            byte var7 = 1;
            if (var6.field2316.field4333 == var6.field2316.field4321) {
                var7 = 0;
            } else if (var6.field2316.field4333 == var6.field2316.field4310) {
                var7 = 2;
            }
            if (var6.field2319 != var7) {
                int var8 = class174.method1245(var6.field2316, (byte) 38);
                if (var6.field2327 != var8) {
                    if (var6.field2305 != null) {
                        class225.field3596.method1421(var6.field2305);
                        var6.field2305 = null;
                    }
                    var6.field2327 = var8;
                }
                var6.field2319 = var7;
            }
            var6.field2328 = var6.field2316.field4280;
            var6.field2307 = var6.field2316.field4280 + var6.field2316.method1753((byte) -15) * 64;
            var6.field2312 = var6.field2316.field4311;
            var6.field2318 = var6.field2316.field4311 + var6.field2316.method1753((byte) -15) * 64;
            class223.method1598(arg4, arg0, (byte) -52, arg1, arg3, var6);
        }
        for (class149 var9 = (class149) class283.field4599.method609(arg2 ^ 0xFFFFFF9D); var9 != null; var9 = (class149) class283.field4599.method616(arg2 ^ 0xFFFFFF8A)) {
            byte var10 = 1;
            if (var9.field2313.field4333 == var9.field2313.field4321) {
                var10 = 0;
            } else if (var9.field2313.field4333 == var9.field2313.field4310) {
                var10 = 2;
            }
            if (var9.field2319 != var10) {
                int var11 = class281.method1983((byte) -15, var9.field2313);
                if (var9.field2327 != var11) {
                    if (var9.field2305 != null) {
                        class225.field3596.method1421(var9.field2305);
                        var9.field2305 = null;
                    }
                    var9.field2327 = var11;
                }
                var9.field2319 = var10;
            }
            var9.field2328 = var9.field2313.field4280;
            var9.field2307 = var9.field2313.field4280 + (var9.field2313.method1753((byte) -15) * 64);
            var9.field2312 = var9.field2313.field4311;
            var9.field2318 = var9.field2313.field4311 + var9.field2313.method1753((byte) -15) * 64;
            class223.method1598(arg4, arg0, (byte) -52, arg1, arg3, var9);
        }
        if (arg2 != -10) {
            field1723 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(I)V", line = 592)
    public class118(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "(II)I", line = 608)
    public final int method848(int arg0, int arg1) {
        field1732++;
        return arg1 >= -14 ? -118 : arg0 * 8 - this.field1739;
    }

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "(II)I", line = 619)
    public final int method849(int arg0, int arg1) {
        field1728++;
        if (arg1 != 38) {
            method843(86, true);
        }
        int var3 = 8 - (this.field1739 & 0x7);
        int var4 = this.field1739 >> 3;
        this.field1739 += arg0;
        int var5 = 0;
        while (arg0 > var3) {
            var5 += (class210.field3375[var3] & this.field1607[var4++]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var6;
        if (arg0 == var3) {
            var6 = (class210.field3375[var3] & this.field1607[var4]) + var5;
        } else {
            var6 = (this.field1607[var4] >> var3 - arg0 & class210.field3375[arg0]) + var5;
        }
        return var6;
    }
}
