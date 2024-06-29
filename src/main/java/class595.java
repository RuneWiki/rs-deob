import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class595 extends class552 implements class624 {

    @OriginalMember(owner = "client!et", name = "hb", descriptor = "Z")
    private boolean field7739;

    @OriginalMember(owner = "client!et", name = "ab", descriptor = "B")
    private byte field7732;

    @OriginalMember(owner = "client!et", name = "cb", descriptor = "Z")
    private boolean field7734;

    @OriginalMember(owner = "client!et", name = "K", descriptor = "S")
    private short field7716;

    @OriginalMember(owner = "client!et", name = "S", descriptor = "Z")
    private boolean field7724;

    @OriginalMember(owner = "client!et", name = "T", descriptor = "Z")
    private boolean field7725;

    @OriginalMember(owner = "client!et", name = "kb", descriptor = "Lr;")
    private class184 field7742;

    @OriginalMember(owner = "client!et", name = "eb", descriptor = "Lka;")
    private class475 field7736;

    @OriginalMember(owner = "client!et", name = "mb", descriptor = "Lhda;")
    public static class752 field7744 = new class752(66, 6);

    @OriginalMember(owner = "client!et", name = "qb", descriptor = "[I")
    public static int[] field7748 = null;

    @OriginalMember(owner = "client!et", name = "rb", descriptor = "I")
    public static int field7749 = 1;

    @OriginalMember(owner = "client!et", name = "I", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!et", name = "J", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!et", name = "L", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!et", name = "M", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!et", name = "N", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!et", name = "O", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!et", name = "P", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!et", name = "Q", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!et", name = "R", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!et", name = "U", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!et", name = "V", descriptor = "I")
    public static int field7727;

    @OriginalMember(owner = "client!et", name = "W", descriptor = "I")
    public static int field7728;

    @OriginalMember(owner = "client!et", name = "X", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!et", name = "Z", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!et", name = "bb", descriptor = "I")
    public static int field7733;

    @OriginalMember(owner = "client!et", name = "db", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!et", name = "fb", descriptor = "I")
    public static int field7737;

    @OriginalMember(owner = "client!et", name = "gb", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!et", name = "ib", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!et", name = "jb", descriptor = "I")
    public static int field7741;

    @OriginalMember(owner = "client!et", name = "lb", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!et", name = "nb", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!et", name = "ob", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!et", name = "pb", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!et", name = "Y", descriptor = "Lck;")
    private class642 field7730;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method1761(int arg0) {
        if (arg0 != -28823) {
            return true;
        } else {
            ++field7720;
            return this.field7725;
        }
    }

    @OriginalMember(owner = "client!et", name = "j", descriptor = "(I)V", line = 15)
    public static void method3230(int arg0) {
        if (arg0 < 28) {
            field7749 = 106;
        }
        field7744 = null;
        field7748 = null;
    }

    @OriginalMember(owner = "client!et", name = "h", descriptor = "(I)I", line = 26)
    public final int method789(int arg0) {
        if (arg0 != -32768) {
            field7748 = null;
        }
        ++field7738;
        return this.field7736 != null ? this.field7736.method180() : 0;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BII)V", line = 38)
    public static final void method3231(byte arg0, int arg1, int arg2) {
        ++field7745;
        if (arg0 < 52) {
            method3233((class152) null, (class376) null, (byte) 53);
        }
        class127 var3 = class760.method4231(arg2, -874792672, 5);
        var3.method1010(614);
        var3.field2099 = arg1;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lha;IIB)Z", line = 52)
    public final boolean method790(class59 arg0, int arg1, int arg2, byte arg3) {
        ++field7737;
        if (arg3 != 103) {
            this.field7739 = true;
        }
        class475 var5 = this.method3234(arg0, (byte) 101, 131072);
        if (var5 != null) {
            class333 var6 = arg0.method451();
            var6.method1727(super.field3505, super.field3510, super.field3502);
            return class540.field7159 ? var5.method203(arg2, arg1, var6, false, 0, class100.field1358) : var5.method158(arg2, arg1, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIZI)V", line = 74)
    public static final void method3232(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field7747;
        if (class200.field3012 != null && (arg5 != 3 || ~class418.field5772 != ~arg3 || class43.field559 != arg2)) {
            class515.method2874(class66.field828, class200.field3012, -2);
            class200.field3012 = null;
        }
        if (arg0 < 32) {
            method3232(-38, 113, 27, 61, false, 86);
        }
        if (~arg5 == -4 && class200.field3012 == null) {
            class200.field3012 = class22.method231(arg3, -1, 0, 0, class66.field828, arg2);
            if (class200.field3012 != null) {
                class418.field5772 = arg3;
                class43.field559 = arg2;
                class2.method15(17458);
            }
        }
        if (arg5 == 3 && class200.field3012 == null) {
            method3232(107, arg1, -1, -1, true, class411.field5711.field3901.method2537(true));
        } else {
            Container var6;
            if (class200.field3012 != null) {
                class201.field3018 = arg3;
                class749.field10428 = arg2;
                var6 = class200.field3012;
            } else if (class218.field3143 != null) {
                Insets var7 = class218.field3143.getInsets();
                int var10001 = -var7.right;
                class201.field3018 = class218.field3143.getSize().width + var10001 + -var7.left;
                class749.field10428 = class218.field3143.getSize().height - var7.top + -var7.bottom;
                var6 = class218.field3143;
            } else {
                if (class514.field6818 != null) {
                    var6 = class514.field6818;
                } else {
                    var6 = class670.field9145;
                }
                class201.field3018 = var6.getSize().width;
                class749.field10428 = var6.getSize().height;
            }
            if (arg5 != 1) {
                class313.method1920(true);
            } else {
                class348.field4882 = (-class69.field844 + class201.field3018) / 2;
                class228.field3251 = class69.field844;
                class199.field2993 = class304.field4321;
                class733.field10148 = 0;
            }
            if (class508.field6778 != class304.field4326) {
                boolean var10000;
                if (~class228.field3251 > -1025 && ~class199.field2993 > -769) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (!arg4) {
                class295.field4217.setSize(class228.field3251, class199.field2993);
                if (!class24.field412) {
                    class341.field4807.method484(class295.field4217, class228.field3251, class199.field2993);
                } else {
                    class615.method3361(false, class295.field4217);
                }
                if (class218.field3143 != var6) {
                    class295.field4217.setLocation(class348.field4882, class733.field10148);
                } else {
                    Insets var8 = class218.field3143.getInsets();
                    class295.field4217.setLocation(class348.field4882 + var8.left, class733.field10148 + var8.top);
                }
            } else {
                class442.method2543((byte) 104);
            }
            if (arg5 < 2) {
                class509.field6784 = false;
            } else {
                class509.field6784 = true;
            }
            if (class443.field6101 != -1) {
                class411.method2400(true, -57);
            }
            if (class209.field3089 != null && class574.method3162((byte) 13, class15.field215)) {
                class407.method2381((byte) -118);
            }
            for (int var9 = 0; var9 < 100; ++var9) {
                class12.field192[var9] = true;
            }
            class690.field9598 = true;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ld;Lwu;B)V", line = 215)
    public static final void method3233(class152 arg0, class376 arg1, byte arg2) {
        class513.field6801 = arg0;
        ++field7723;
        if (arg2 > 11) {
            class170.field2616 = arg1;
        }
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(B)I", line = 228)
    public final int method791(byte arg0) {
        ++field7731;
        if (arg0 <= 81) {
            return 60;
        } else {
            return this.field7736 == null ? 0 : this.field7736.method167();
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lha;Lqfa;IIIIIZIZ)V", line = 239)
    public class595(class59 arg0, class100 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field1310);
        this.field7739 = arg7;
        this.field7732 = (byte) arg8;
        super.field3502 = arg6;
        super.field3505 = arg4;
        this.field7734 = arg9;
        this.field7716 = (short) arg1.field1301;
        this.field7724 = arg1.field1363 != 0 && !arg7;
        this.field7725 = arg0.method468() && arg1.field1343 && !this.field7739 && ~class411.field5711.field3897.method1057(true) != -1;
        int var11 = 2048;
        if (this.field7734) {
            var11 |= 65536;
        }
        class407 var12 = this.method3235(var11, this.field7725, arg0, -24018);
        if (var12 != null) {
            this.field7742 = var12.field5657;
            this.field7736 = var12.field5651;
            if (this.field7734) {
                this.field7736 = this.field7736.method171((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ZLha;)V", line = 272)
    public final void method1756(boolean arg0, class59 arg1) {
        ++field7721;
        if (arg0) {
            Object var3 = null;
            class184 var5;
            if (this.field7742 == null && this.field7725) {
                class407 var4 = this.method3235(262144, true, arg1, -24018);
                var5 = var4 == null ? null : var4.field5657;
            } else {
                var5 = this.field7742;
                this.field7742 = null;
            }
            if (var5 != null) {
                class265.method1601(var5, super.field3515, super.field3505, super.field3502, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(Z)Z", line = 301)
    public final boolean method801(boolean arg0) {
        ++field7717;
        if (arg0) {
            return true;
        } else {
            return this.field7736 == null ? false : this.field7736.method159();
        }
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(I)Z", line = 316)
    public final boolean method798(int arg0) {
        ++field7735;
        int var2 = 102 % ((arg0 - 53) / 45);
        return this.field7734;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lha;B)V", line = 326)
    public final void method792(class59 arg0, byte arg1) {
        if (arg1 <= 121) {
            this.field7716 = 125;
        }
        ++field7715;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILha;)V", line = 340)
    public final void method1758(int arg0, class59 arg1) {
        ++field7746;
        if (arg0 == 6120) {
            Object var3 = null;
            class184 var5;
            if (this.field7742 == null && this.field7725) {
                class407 var4 = this.method3235(262144, true, arg1, arg0 + -30138);
                var5 = var4 == null ? null : var4.field5657;
            } else {
                var5 = this.field7742;
                this.field7742 = null;
            }
            if (var5 != null) {
                class562.method3115(var5, super.field3515, super.field3505, super.field3502, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lha;BI)Lka;", line = 368)
    private final class475 method3234(class59 arg0, byte arg1, int arg2) {
        ++field7714;
        if (arg1 <= 94) {
            return null;
        } else if (this.field7736 != null && arg0.method405(this.field7736.method214(), arg2) == 0) {
            return this.field7736;
        } else {
            class407 var4 = this.method3235(arg2, false, arg0, -24018);
            return var4 != null ? var4.field5651 : null;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lkf;Lha;IIIZI)V", line = 393)
    public final void method807(class256 arg0, class59 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 < 109) {
            this.method1759((byte) 106);
        }
        if (arg0 instanceof class595) {
            class595 var8 = (class595) arg0;
            if (this.field7736 != null && var8.field7736 != null) {
                this.field7736.method170(var8.field7736, arg2, arg6, arg4, arg5);
            }
        }
        ++field7719;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(B)I", line = 414)
    public final int method1752(byte arg0) {
        ++field7741;
        if (arg0 != -111) {
            this.field7736 = null;
        }
        return this.field7732;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)I", line = 425)
    public final int method1759(byte arg0) {
        ++field7727;
        if (arg0 < 63) {
            this.method807((class256) null, (class59) null, 40, -57, -47, true, 27);
        }
        return this.field7716 & 65535;
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(B)I", line = 438)
    public final int method1757(byte arg0) {
        int var2 = -97 % ((-57 - arg0) / 53);
        ++field7722;
        return 22;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(ILha;)Lww;", line = 451)
    public final class733 method800(int arg0, class59 arg1) {
        ++field7726;
        if (this.field7736 == null) {
            return null;
        } else {
            if (arg0 != -1) {
                field7744 = null;
            }
            class333 var3 = arg1.method451();
            var3.method1727(super.field3505, super.field3510, super.field3502);
            class733 var4 = class397.method2338(this.field7724, (byte) 127, 1);
            if (class540.field7159) {
                this.field7736.method160(var3, var4.field10150[0], class100.field1358, 0);
            } else {
                this.field7736.method155(var3, var4.field10150[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IZLha;I)Lga;", line = 479)
    private final class407 method3235(int arg0, boolean arg1, class59 arg2, int arg3) {
        ++field7718;
        if (arg3 != -24018) {
            this.field7742 = null;
        }
        class100 var5 = class462.field6333.method2008((byte) -45, 65535 & this.field7716);
        class282 var6;
        class282 var7;
        if (!this.field7739) {
            if (super.field3515 < 3) {
                var6 = class113.field1866[super.field3515 + 1];
            } else {
                var6 = null;
            }
            var7 = class113.field1866[super.field3515];
        } else {
            var6 = class113.field1866[0];
            var7 = class588.field7675[super.field3515];
        }
        return var5.method736(this.field7732, arg1, (class379) null, arg0, super.field3510, arg2, (byte) -38, super.field3502, 22, super.field3505, var7, var6);
    }

    @OriginalMember(owner = "client!et", name = "g", descriptor = "(I)V", line = 509)
    public final void method803(int arg0) {
        ++field7729;
        this.field7734 = false;
        if (this.field7736 != null) {
            this.field7736.method190(-65537 & this.field7736.method214());
        }
        if (arg0 != 131072) {
            method3232(-118, -2, 96, 95, true, 9);
        }
    }

    @OriginalMember(owner = "client!et", name = "g", descriptor = "(B)Z", line = 523)
    public final boolean method806(byte arg0) {
        ++field7740;
        int var2 = -28 / ((14 - arg0) / 57);
        if (this.field7736 == null) {
            return true;
        } else {
            return !this.field7736.method192();
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BLha;)Lck;", line = 539)
    public final class642 method808(byte arg0, class59 arg1) {
        if (arg0 >= -86) {
            this.method1759((byte) -45);
        }
        ++field7743;
        if (this.field7730 == null) {
            this.field7730 = class549.method3072(super.field3502, super.field3505, super.field3510, 544, this.method3234(arg1, (byte) 104, 0));
        }
        return this.field7730;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V", line = 558)
    public final void method1754(boolean arg0) {
        ++field7728;
        if (arg0) {
            if (this.field7736 != null) {
                this.field7736.method181();
            }
        }
    }
}
