import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class108 extends class116 {

    @OriginalMember(owner = "client!kt", name = "B", descriptor = "I")
    private int field1622 = 0;

    @OriginalMember(owner = "client!kt", name = "D", descriptor = "Z")
    public boolean field1624 = false;

    @OriginalMember(owner = "client!kt", name = "L", descriptor = "I")
    private int field1632 = -1;

    @OriginalMember(owner = "client!kt", name = "O", descriptor = "I")
    private int field1635 = 0;

    @OriginalMember(owner = "client!kt", name = "J", descriptor = "I")
    private int field1630 = 0;

    @OriginalMember(owner = "client!kt", name = "K", descriptor = "I")
    private int field1631 = -32768;

    @OriginalMember(owner = "client!kt", name = "F", descriptor = "I")
    private int field1626;

    @OriginalMember(owner = "client!kt", name = "M", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "client!kt", name = "Q", descriptor = "I")
    private int field1637;

    @OriginalMember(owner = "client!kt", name = "I", descriptor = "Lvf;")
    private class104 field1629;

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!kt", name = "A", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!kt", name = "C", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!kt", name = "E", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!kt", name = "G", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!kt", name = "N", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!kt", name = "P", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!kt", name = "R", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!kt", name = "H", descriptor = "Lbq;")
    private class190 field1628;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIILya;)Lt;")
    private final class471 method789(int arg0, int arg1, int arg2, class38 arg3) {
        ++field1627;
        if (arg1 != 0) {
            this.method495(-39);
        }
        class398 var5 = class27.field357.method1479(arg2, (byte) -124);
        class142 var6 = class385.field5608[super.field1738];
        class142 var7 = ~this.field1637 > -4 ? class385.field5608[this.field1637 - -1] : null;
        return this.field1624 ? var5.method2396(arg3, super.field1732, class222.field3168, true, -92, var6, super.field1735, -1, 0, super.field1734, -1, var7, arg0) : var5.method2396(arg3, super.field1732, class222.field3168, true, arg1 + -127, var6, super.field1735, this.field1630, this.field1622, super.field1734, this.field1632, var7, arg0);
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(Z)V")
    public static final void method790(boolean arg0) {
        if (!arg0) {
            method795((byte) -60, (class101) null);
        }
        ++field1638;
        class168.method1108((byte) -120);
        class358.method2144((byte) 80);
    }

    @OriginalMember(owner = "client!kt", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field1613;
        if (this.field1628 != null) {
            this.field1628.method1197();
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lt;BLya;)V")
    private final void method791(class471 arg0, byte arg1, class38 arg2) {
        ++field1619;
        class521[] var4 = arg0.method406();
        class169[] var5 = arg0.method374();
        if ((this.field1628 == null || this.field1628.field2732) && (var4 != null || var5 != null)) {
            this.field1628 = new class190(class441.field6516);
        }
        if (this.field1628 != null) {
            this.field1628.method1188(arg2, (long) class441.field6516, var4, var5, false);
            this.field1628.method1190(super.field1738, super.field1729, super.field1736, super.field1730, super.field1742);
        }
        if (arg1 != 61) {
            this.field1633 = -60;
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(Z)I")
    public final int method792(boolean arg0) {
        ++field1634;
        if (!arg0) {
            this.method484((class38) null, (byte) 42);
        }
        return this.field1631;
    }

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "(I)V")
    public final void method495(int arg0) {
        if (arg0 >= -104) {
            this.field1624 = false;
        }
        ++field1625;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field1635 = arg12;
        this.field1626 = arg0;
        this.field1633 = arg1 + arg2;
        this.field1637 = arg4;
        class398 var14 = class27.field357.method1479(this.field1626, (byte) -125);
        int var15 = var14.field5824;
        if (~var15 == 0) {
            this.field1624 = true;
        } else {
            this.field1629 = class222.field3168.method126(-122, var15);
            this.field1624 = false;
        }
        if (~this.field1633 == ~arg2) {
            class441.method2618(super.field1732, super.field1735, super.field1738, false, this.field1629, this.field1630, 76);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lya;B)Lmf;")
    public final class289 method484(class38 arg0, byte arg1) {
        ++field1614;
        class471 var3 = this.method789(2048 | (this.field1635 != 0 ? 5 : 0), 0, this.field1626, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (this.field1635 != 0) {
                var3.method393(this.field1635 * 2048);
            }
            class122 var4 = arg0.method280();
            var4.method182(super.field1732, super.field1734, super.field1735);
            if (arg1 < 111) {
                return null;
            } else {
                if (this.field1628 == null) {
                    var3.method397(var4, (class387) null, 0);
                } else {
                    class523 var5 = this.field1628.method1193();
                    arg0.method312(var3, var5, var4, (class387) null, 0);
                }
                this.field1631 = var3.method380();
                this.method791(var3, (byte) 61, arg0);
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIILef;BI)Ltq;")
    public static final class442 method793(int arg0, int arg1, int arg2, class338 arg3, byte arg4, int arg5) {
        ++field1618;
        if (arg4 <= 24) {
            return null;
        } else if (!arg3.field4864 && (!class226.method1402(arg2, (byte) -99) || !class226.method1402(arg5, (byte) -119))) {
            return !arg3.field4842 ? new class442(arg3, arg1, arg0, arg2, arg5, class508.method3034(arg2, true), class508.method3034(arg5, true), true) : new class442(arg3, 34037, arg1, arg0, arg2, arg5, true);
        } else {
            return new class442(arg3, 3553, arg1, arg0, arg2, arg5, true);
        }
    }

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "(I)Z")
    public final boolean method492(int arg0) {
        if (arg0 != -1) {
            this.method789(102, -47, 86, (class38) null);
        }
        ++field1620;
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lya;IZLij;III)V")
    public final void method498(class38 arg0, int arg1, boolean arg2, class291 arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -1) {
            this.field1631 = -70;
        }
        ++field1623;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZILya;I)Z")
    public final boolean method500(boolean arg0, int arg1, class38 arg2, int arg3) {
        ++field1617;
        if (!arg0) {
            this.finalize();
        }
        return false;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)V")
    public final void method794(int arg0, int arg1) {
        if (arg1 == 0) {
            ++field1616;
            if (!this.field1624) {
                this.field1622 += arg0;
                while (this.field1622 > this.field1629.field1575[this.field1630]) {
                    this.field1622 -= this.field1629.field1575[this.field1630];
                    ++this.field1630;
                    if (~this.field1629.field1551.length >= ~this.field1630) {
                        this.field1624 = true;
                        break;
                    }
                }
                if (!this.field1624) {
                    class441.method2618(super.field1732, super.field1735, super.field1738, false, this.field1629, this.field1630, 83);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BLmg;)V")
    public static final void method795(byte arg0, class101 arg1) {
        ++field1615;
        if (arg0 < 59) {
            method793(-36, -108, -20, (class338) null, (byte) 80, 74);
        }
        class50.field611 = arg1;
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(ILya;)V")
    public final void method493(int arg0, class38 arg1) {
        if (arg0 >= -114) {
            method793(53, 34, -48, (class338) null, (byte) 19, 106);
        }
        ++field1636;
        class471 var3 = this.method789(0, 0, this.field1626, arg1);
        if (var3 != null) {
            this.method791(var3, (byte) 61, arg1);
        }
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(Z)V")
    public final void method796(boolean arg0) {
        ++field1621;
        if (arg0) {
            this.method498((class38) null, 55, true, (class291) null, 123, -1, -1);
        }
        if (this.field1628 != null) {
            this.field1628.method1197();
        }
    }
}
