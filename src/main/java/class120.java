import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class120 extends class6 implements class392 {

    @OriginalMember(owner = "client!rv", name = "wb", descriptor = "Z")
    private boolean field1759;

    @OriginalMember(owner = "client!rv", name = "vb", descriptor = "Z")
    private boolean field1758;

    @OriginalMember(owner = "client!rv", name = "qb", descriptor = "B")
    private byte field1753;

    @OriginalMember(owner = "client!rv", name = "Q", descriptor = "S")
    private short field1727;

    @OriginalMember(owner = "client!rv", name = "R", descriptor = "Z")
    private boolean field1728;

    @OriginalMember(owner = "client!rv", name = "sb", descriptor = "Z")
    private boolean field1755;

    @OriginalMember(owner = "client!rv", name = "jb", descriptor = "Lr;")
    private class195 field1746;

    @OriginalMember(owner = "client!rv", name = "gb", descriptor = "Lka;")
    private class500 field1743;

    @OriginalMember(owner = "client!rv", name = "ob", descriptor = "Lnaa;")
    public static class78 field1751 = new class78();

    @OriginalMember(owner = "client!rv", name = "rb", descriptor = "Ljv;")
    public static class87 field1754 = new class87(128);

    @OriginalMember(owner = "client!rv", name = "ub", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1757 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!rv", name = "S", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!rv", name = "T", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!rv", name = "U", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!rv", name = "V", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!rv", name = "W", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!rv", name = "X", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!rv", name = "Y", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!rv", name = "Z", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!rv", name = "ab", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!rv", name = "bb", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!rv", name = "cb", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!rv", name = "db", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!rv", name = "eb", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!rv", name = "fb", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!rv", name = "hb", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!rv", name = "kb", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!rv", name = "lb", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!rv", name = "mb", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!rv", name = "nb", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!rv", name = "pb", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!rv", name = "tb", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!rv", name = "ib", descriptor = "Lel;")
    private class574 field1745;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZLha;I)Lhi;")
    private final class218 method989(int arg0, boolean arg1, class65 arg2, int arg3) {
        ++field1732;
        class589 var5 = class350.field5132.method3732((byte) 40, 65535 & this.field1727);
        if (arg3 != -1) {
            field1757 = null;
        }
        class296 var6;
        class296 var7;
        if (this.field1728) {
            var6 = class412.field5933[0];
            var7 = class538.field7317[super.field2244];
        } else {
            if (super.field2244 < 3) {
                var6 = class412.field5933[super.field2244 - -1];
            } else {
                var6 = null;
            }
            var7 = class412.field5933[super.field2244];
        }
        return var5.method3279(super.field2246, var6, this.field1753, var7, (class596) null, 22, arg0, arg1, super.field2257, (byte) 53, super.field2259, arg2);
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(Lha;I)V")
    public final void method20(class65 arg0, int arg1) {
        ++field1729;
        Object var3 = null;
        if (arg1 != -4947) {
            this.field1746 = null;
        }
        class195 var5;
        if (this.field1746 == null && this.field1755) {
            class218 var4 = this.method989(262144, true, arg0, arg1 ^ 4946);
            var5 = var4 != null ? var4.field2908 : null;
        } else {
            var5 = this.field1746;
            this.field1746 = null;
        }
        if (var5 != null) {
            class167.method1203(var5, super.field2244, super.field2257, super.field2259, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "(I)V")
    public static void method990(int arg0) {
        field1754 = null;
        field1751 = null;
        field1757 = null;
        if (arg0 != 131072) {
            method991(84);
        }
    }

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "(I)V")
    public static final void method991(int arg0) {
        ++field1744;
        class571.field7608 = 0;
        if (arg0 == 16741381) {
            for (int var1 = 0; ~var1 > -2049; ++var1) {
                class81.field1149[var1] = null;
                class697.field9785[var1] = 1;
                class94.field1342[var1] = null;
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "(I)Z")
    public final boolean method21(int arg0) {
        if (arg0 != 0) {
            this.field1727 = 125;
        }
        ++field1740;
        return this.field1743 != null ? this.field1743.method326() : false;
    }

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)Z")
    public final boolean method30(int arg0) {
        ++field1747;
        if (arg0 < 59) {
            this.field1743 = null;
        }
        return this.field1755;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lha;B)Lel;")
    public final class574 method27(class65 arg0, byte arg1) {
        if (arg1 != -126) {
            field1754 = null;
        }
        if (this.field1745 == null) {
            this.field1745 = class321.method2038(-23545, this.method992((byte) 90, arg0, 0), super.field2259, super.field2257, super.field2246);
        }
        ++field1737;
        return this.field1745;
    }

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "(I)I")
    public final int method28(int arg0) {
        if (arg0 != -13878) {
            this.field1727 = -86;
        }
        ++field1752;
        return this.field1743 != null ? this.field1743.method339() : 0;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lha;Lwea;ZIIII)V")
    public final void method60(class65 arg0, class167 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 > -16) {
            this.field1758 = true;
        }
        if (arg1 instanceof class120) {
            class120 var8 = (class120) arg1;
            if (this.field1743 != null && var8.field1743 != null) {
                this.field1743.method297(var8.field1743, arg4, arg5, arg6, arg2);
            }
        }
        ++field1731;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)I")
    public final int method18(int arg0) {
        ++field1742;
        if (arg0 != -10908) {
            this.method60((class65) null, (class167) null, true, 88, -40, 111, 4);
        }
        return 22;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILha;)Ldfa;")
    public final class176 method22(int arg0, class65 arg1) {
        ++field1738;
        if (this.field1743 == null) {
            return null;
        } else {
            class303 var3 = arg1.method450();
            var3.method981(super.field2257, super.field2246, super.field2259);
            class176 var4 = class567.method3167(this.field1758, 0, 1);
            if (!class200.field2658) {
                this.field1743.method292(var3, var4.field2345[0], 0);
            } else {
                this.field1743.method300(var3, var4.field2345[0], class330.field4773, 0);
            }
            if (arg0 != -10) {
                this.method22(-54, (class65) null);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lha;Lpu;IIIIIZIZ)V")
    public class120(class65 arg0, class589 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field7868);
        this.field1759 = arg9;
        super.field2257 = arg4;
        super.field2259 = arg6;
        this.field1758 = ~arg1.field7933 != -1 && !arg7;
        this.field1753 = (byte) arg8;
        this.field1727 = (short) arg1.field7856;
        this.field1728 = arg7;
        this.field1755 = arg0.method484() && arg1.field7942 && !this.field1728 && ~class712.field9959.field1319.method2854(21) != -1;
        int var11 = 2048;
        if (this.field1759) {
            var11 |= 65536;
        }
        class218 var12 = this.method989(var11, this.field1755, arg0, -1);
        if (var12 != null) {
            this.field1746 = var12.field2908;
            this.field1743 = var12.field2909;
            if (this.field1759) {
                this.field1743 = this.field1743.method298((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "(I)I")
    public final int method31(int arg0) {
        ++field1730;
        if (arg0 != -23356) {
            field1757 = null;
        }
        return this.field1727 & 65535;
    }

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "(I)Z")
    public final boolean method19(int arg0) {
        if (arg0 >= -87) {
            this.method66(-101);
        }
        ++field1749;
        if (this.field1743 != null) {
            return !this.field1743.method317();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "(I)Z")
    public final boolean method59(int arg0) {
        ++field1733;
        if (arg0 != -1) {
            this.method66(-124);
        }
        return this.field1759;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method33(int arg0, int arg1, int arg2, class65 arg3) {
        ++field1748;
        if (arg0 != 4161) {
            field1757 = null;
        }
        class500 var5 = this.method992((byte) 90, arg3, 131072);
        if (var5 != null) {
            class303 var6 = arg3.method450();
            var6.method981(super.field2257, super.field2246, super.field2259);
            return !class200.field2658 ? var5.method291(arg2, arg1, var6, false, 0) : var5.method311(arg2, arg1, var6, false, 0, class330.field4773);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "(I)V")
    public final void method66(int arg0) {
        ++field1741;
        this.field1759 = false;
        if (this.field1743 != null) {
            this.field1743.method295(-65537 & this.field1743.method325());
        }
        if (arg0 != -13514) {
            this.method31(67);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lha;I)V")
    public final void method34(class65 arg0, int arg1) {
        ++field1735;
        Object var3 = null;
        class195 var5;
        if (this.field1746 == null && this.field1755) {
            class218 var4 = this.method989(262144, true, arg0, -1);
            var5 = var4 == null ? null : var4.field2908;
        } else {
            var5 = this.field1746;
            this.field1746 = null;
        }
        if (var5 != null) {
            class786.method4347(var5, super.field2244, super.field2257, super.field2259, (boolean[]) null);
        }
        if (arg1 != -4351) {
            field1751 = null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "(I)I")
    public final int method24(int arg0) {
        if (arg0 != 748449288) {
            this.method60((class65) null, (class167) null, false, 52, 2, 97, -72);
        }
        ++field1756;
        return this.field1743 != null ? this.field1743.method335() : 0;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLha;I)Lka;")
    private final class500 method992(byte arg0, class65 arg1, int arg2) {
        ++field1734;
        if (this.field1743 != null && arg1.method517(this.field1743.method325(), arg2) == 0) {
            return this.field1743;
        } else {
            class218 var4 = this.method989(arg2, false, arg1, -1);
            if (arg0 != 90) {
                this.field1753 = 24;
            }
            return var4 == null ? null : var4.field2909;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLha;)V")
    public final void method32(byte arg0, class65 arg1) {
        if (arg0 < 69) {
            this.field1728 = false;
        }
        ++field1739;
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)V")
    public final void method25(int arg0) {
        ++field1750;
        if (this.field1743 != null) {
            this.field1743.method337();
        }
        if (arg0 != 14667) {
            field1754 = null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)I")
    public final int method17(int arg0) {
        ++field1736;
        if (arg0 != -2132) {
            this.field1758 = true;
        }
        return this.field1753;
    }
}
