import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class353 extends class563 implements class302 {

    @OriginalMember(owner = "client!bp", name = "J", descriptor = "B")
    private byte field5609;

    @OriginalMember(owner = "client!bp", name = "F", descriptor = "B")
    private byte field5605;

    @OriginalMember(owner = "client!bp", name = "O", descriptor = "Z")
    private boolean field5614;

    @OriginalMember(owner = "client!bp", name = "R", descriptor = "Z")
    private boolean field5617;

    @OriginalMember(owner = "client!bp", name = "X", descriptor = "S")
    private short field5623;

    @OriginalMember(owner = "client!bp", name = "eb", descriptor = "Z")
    private boolean field5630;

    @OriginalMember(owner = "client!bp", name = "cb", descriptor = "Z")
    private boolean field5628;

    @OriginalMember(owner = "client!bp", name = "E", descriptor = "Lda;")
    public class55 field5604;

    @OriginalMember(owner = "client!bp", name = "db", descriptor = "Lha;")
    private class54 field5629;

    @OriginalMember(owner = "client!bp", name = "P", descriptor = "Z")
    public static boolean field5615 = true;

    @OriginalMember(owner = "client!bp", name = "A", descriptor = "I")
    public static int field5600 = -1;

    @OriginalMember(owner = "client!bp", name = "S", descriptor = "[Lpp;")
    public static class360[] field5618 = new class360[100];

    @OriginalMember(owner = "client!bp", name = "C", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!bp", name = "D", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!bp", name = "G", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!bp", name = "H", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!bp", name = "I", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!bp", name = "K", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!bp", name = "L", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!bp", name = "M", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!bp", name = "N", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!bp", name = "Q", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!bp", name = "T", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!bp", name = "U", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!bp", name = "V", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!bp", name = "W", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!bp", name = "Y", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!bp", name = "Z", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!bp", name = "ab", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!bp", name = "bb", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!bp", name = "fb", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!bp", name = "gb", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!bp", name = "hb", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!bp", name = "ib", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!bp", name = "B", descriptor = "Lll;")
    private class334 field5601;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)I", line = 5)
    public final int method413(byte arg0) {
        if (arg0 != 11) {
            this.field5605 = -29;
        }
        ++field5634;
        return this.field5609;
    }

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "(B)V", line = 17)
    public final void method404(byte arg0) {
        ++field5633;
        if (arg0 > -40) {
            method2371((byte) 65);
        }
        this.field5614 = false;
        if (this.field5604 != null) {
            this.field5604.method629(-65537 & this.field5604.method651());
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lr;I)V", line = 31)
    public final void method407(class167 arg0, int arg1) {
        int var3 = 63 % ((-10 - arg1) / 40);
        ++field5625;
        Object var4 = null;
        class54 var6;
        if (this.field5629 == null && this.field5628) {
            class564 var5 = this.method2374(-95, 262144, arg0, true);
            var6 = var5 == null ? null : var5.field8103;
        } else {
            var6 = this.field5629;
            this.field5629 = null;
        }
        if (var6 != null) {
            class458.method2871(var6, super.field9703, super.field9696, super.field9705, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lr;Llr;IIIIIZIIZ)V", line = 60)
    public class353(class167 arg0, class698 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class262.method1862(arg9, (byte) 117, arg8));
        this.field5609 = (byte) arg8;
        this.field5605 = (byte) arg9;
        super.field9705 = arg6;
        this.field5614 = arg10;
        this.field5617 = ~arg1.field9830 != -1 && !arg7;
        this.field5623 = (short) arg1.field9825;
        this.field5630 = arg7;
        super.field9696 = arg4;
        this.field5628 = arg0.method262() && arg1.field9812 && !this.field5630 && ~class17.field282.method2133(true, class497.field7259) != -1;
        int var12 = 2048;
        if (this.field5614) {
            var12 |= 65536;
        }
        class564 var13 = this.method2374(-85, var12, arg0, this.field5628);
        if (var13 != null) {
            this.field5604 = var13.field8102;
            this.field5629 = var13.field8103;
            if (this.field5614) {
                this.field5604 = this.field5604.method609((byte) 0, var12, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "(I)Z", line = 93)
    public final boolean method402(int arg0) {
        ++field5608;
        if (arg0 != 623404585) {
            this.method413((byte) 97);
        }
        return this.field5604 != null ? this.field5604.method614() : false;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZBZLuaa;)V", line = 110)
    public static final void method2370(boolean arg0, byte arg1, boolean arg2, class102 arg3) {
        ++field5606;
        int var4 = arg3.field1687;
        int var5 = (int) arg3.field844;
        arg3.method707((byte) -106);
        if (arg0) {
            class20.method358(var4, 0);
        }
        class200.method1560(arg1 ^ 7, var4);
        class665 var6 = class326.method2197(false, var5);
        if (var6 != null) {
            class362.method2415(-128, var6);
        }
        class226.method1661(16);
        if (!arg2 && class528.field7706 != -1) {
            class281.method1994(arg1 + 76, 1, class528.field7706);
        }
        class174 var7 = new class174(class486.field7115);
        if (arg1 != 0) {
            field5615 = true;
        }
        for (class102 var8 = (class102) var7.method1416((byte) 116); var8 != null; var8 = (class102) var7.method1419((byte) -79)) {
            if (!var8.method708(50)) {
                var8 = (class102) var7.method1416((byte) 116);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field1689 == 3) {
                int var9 = (int) var8.field844;
                if (var9 >>> 16 == var4) {
                    method2370(true, (byte) 0, arg2, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)I", line = 169)
    public final int method394(byte arg0) {
        ++field5611;
        int var2 = -36 / ((arg0 - -14) / 51);
        return this.field5623 & 65535;
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V", line = 179)
    public final void method409(int arg0) {
        if (arg0 == -7728) {
            if (this.field5604 != null) {
                this.field5604.method626();
            }
            ++field5627;
        }
    }

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "(I)I", line = 195)
    public final int method393(int arg0) {
        if (arg0 != 0) {
            this.field5628 = false;
        }
        ++field5626;
        return this.field5604 != null ? this.field5604.method623() : 0;
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(B)I", line = 207)
    public final int method401(byte arg0) {
        if (arg0 < 50) {
            this.method412((class167) null, false);
        }
        ++field5602;
        return this.field5605;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILr;)V", line = 219)
    public final void method396(int arg0, class167 arg1) {
        ++field5619;
        Object var3 = null;
        class54 var5;
        if (this.field5629 == null && this.field5628) {
            class564 var4 = this.method2374(-110, 262144, arg1, true);
            var5 = var4 == null ? null : var4.field8103;
        } else {
            var5 = this.field5629;
            this.field5629 = null;
        }
        if (var5 != null) {
            class143.method1214(var5, super.field9703, super.field9696, super.field9705, (boolean[]) null);
        }
        if (arg0 != -32646) {
            this.field5604 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "(I)Z", line = 247)
    public final boolean method414(int arg0) {
        ++field5632;
        if (arg0 != 0) {
            this.field5601 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "(B)V", line = 260)
    public static void method2371(byte arg0) {
        if (arg0 == 84) {
            field5618 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZILr;I)Z", line = 270)
    public final boolean method392(boolean arg0, int arg1, class167 arg2, int arg3) {
        ++field5622;
        class55 var5 = this.method2372(0, 131072, arg2);
        if (arg0) {
            this.field5630 = true;
        }
        if (var5 != null) {
            class393 var6 = arg2.method339();
            var6.method503(super.field9696, super.field9701, super.field9705);
            return class534.field7778 ? var5.method598(arg3, arg1, var6, false, class609.field8652) : var5.method648(arg3, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lr;Z)V", line = 292)
    public final void method412(class167 arg0, boolean arg1) {
        ++field5612;
        if (arg1) {
            this.method2374(35, -15, (class167) null, true);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILr;)Lda;", line = 305)
    private final class55 method2372(int arg0, int arg1, class167 arg2) {
        ++field5624;
        if (arg0 != 0) {
            this.method406((byte) -17);
        }
        if (this.field5604 != null && arg2.method323(this.field5604.method651(), arg1) == 0) {
            return this.field5604;
        } else {
            class564 var4 = this.method2374(-25, arg1, arg2, false);
            return var4 != null ? var4.field8102 : null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(ILr;)Lod;", line = 330)
    public final class468 method403(int arg0, class167 arg1) {
        ++field5603;
        if (this.field5604 == null) {
            return null;
        } else {
            class393 var3 = arg1.method339();
            var3.method503(super.field9696, super.field9701, super.field9705);
            class468 var4 = null;
            if (this.field5617) {
                var4 = class429.method2720(1, 0);
            }
            if (arg0 > -38) {
                this.field5601 = null;
            }
            if (class534.field7778) {
                this.field5604.method613(var3, var4 != null ? var4.field6948[0] : null, class609.field8652, 0);
            } else {
                this.field5604.method606(var3, var4 != null ? var4.field6948[0] : null, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIILr;ZILpn;)V", line = 360)
    public final void method415(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, int arg5, class692 arg6) {
        if (arg6 instanceof class353) {
            class353 var8 = (class353) arg6;
            if (this.field5604 != null && var8.field5604 != null) {
                this.field5604.method641(var8.field5604, arg1, arg0, arg5, arg4);
            }
        } else if (arg6 instanceof class91) {
            class91 var9 = (class91) arg6;
            if (this.field5604 != null && var9.field1091 != null) {
                this.field5604.method641(var9.field1091, arg1, arg0, arg5, arg4);
            }
        }
        ++field5621;
        if (arg2 != 1) {
            this.field5605 = -60;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)Z", line = 395)
    public final boolean method395(int arg0) {
        ++field5610;
        if (arg0 != -29400) {
            this.method406((byte) -52);
        }
        return this.field5628;
    }

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "(B)Z", line = 410)
    public final boolean method398(byte arg0) {
        if (arg0 > -92) {
            method2370(true, (byte) -21, true, (class102) null);
        }
        ++field5620;
        return this.field5614;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BLr;)Lll;", line = 421)
    public final class334 method408(byte arg0, class167 arg1) {
        ++field5607;
        if (arg0 != 111) {
            method2370(true, (byte) -101, true, (class102) null);
        }
        if (this.field5601 == null) {
            this.field5601 = class166.method1342(this.method2372(0, 0, arg1), super.field9705, super.field9696, super.field9701, arg0 ^ 30687);
        }
        return this.field5601;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIII)V", line = 436)
    public static final void method2373(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 1003) {
            if (~arg3 == -1009) {
                class142.method1213(class125.field2056, arg1, arg0);
            } else if (arg3 == 1011) {
                class142.method1213(class651.field9122, arg1, arg0);
            } else if (arg3 != 1001) {
                if (~arg3 == -1005) {
                    class142.method1213(class369.field5782, arg1, arg0);
                }
            } else {
                class142.method1213(class456.field6842, arg1, arg0);
            }
        } else {
            class142.method1213(class23.field362, arg1, arg0);
        }
        ++field5631;
        if (arg2 != 131072) {
            method2370(true, (byte) -68, true, (class102) null);
        }
    }

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "(B)I", line = 468)
    public final int method406(byte arg0) {
        if (arg0 <= 108) {
            return -47;
        } else {
            ++field5613;
            return this.field5604 != null ? this.field5604.method612() : 0;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILr;Z)Lraa;", line = 481)
    private final class564 method2374(int arg0, int arg1, class167 arg2, boolean arg3) {
        ++field5616;
        if (arg0 >= -16) {
            return null;
        } else {
            class698 var5 = class213.field3537.method94(this.field5623 & 65535, (byte) -42);
            class37 var6;
            class37 var7;
            if (!this.field5630) {
                if (~super.field9703 > -4) {
                    var6 = class491.field7187[super.field9703 + 1];
                } else {
                    var6 = null;
                }
                var7 = class491.field7187[super.field9703];
            } else {
                var7 = class493.field7208[super.field9703];
                var6 = class491.field7187[0];
            }
            return var5.method3933(super.field9696, var7, arg2, arg1, var6, this.field5605, -1, arg3, super.field9701, this.field5609, super.field9705);
        }
    }
}
