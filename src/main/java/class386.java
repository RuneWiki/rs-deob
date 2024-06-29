import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class386 extends class117 implements class503 {

    @OriginalMember(owner = "client!lq", name = "H", descriptor = "B")
    private byte field5629;

    @OriginalMember(owner = "client!lq", name = "B", descriptor = "S")
    private short field5623;

    @OriginalMember(owner = "client!lq", name = "C", descriptor = "Z")
    private boolean field5624;

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "Z")
    private boolean field5618;

    @OriginalMember(owner = "client!lq", name = "E", descriptor = "Z")
    private boolean field5626;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "B")
    private byte field5614;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "Z")
    private boolean field5612;

    @OriginalMember(owner = "client!lq", name = "A", descriptor = "Lt;")
    private class471 field5622;

    @OriginalMember(owner = "client!lq", name = "K", descriptor = "Lba;")
    private class263 field5632;

    @OriginalMember(owner = "client!lq", name = "J", descriptor = "Lnj;")
    public static class162 field5631 = new class162(8);

    @OriginalMember(owner = "client!lq", name = "R", descriptor = "Lwj;")
    public static class270 field5638 = new class270(93, -1);

    @OriginalMember(owner = "client!lq", name = "S", descriptor = "Ldi;")
    public static class83 field5639 = new class83(30, -1);

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!lq", name = "D", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!lq", name = "F", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!lq", name = "G", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!lq", name = "I", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!lq", name = "L", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!lq", name = "M", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!lq", name = "N", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!lq", name = "P", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!lq", name = "Q", descriptor = "I")
    public static int field5637;

    static {
        new class466("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lmg;B)V", line = 4)
    public static final void method2278(class101 arg0, byte arg1) {
        ++field5615;
        class260.field3620 = arg0.method735(-105, "p11_full");
        class217.field3028 = arg0.method735(arg1 ^ -112, "p12_full");
        class113.field1701 = arg0.method735(arg1 + 159, "b12_full");
        class317.field4338 = arg0.method735(44, "hitmarks");
        class129.field1914 = arg0.method735(arg1 ^ -54, "hitbar_default");
        if (arg1 == -98) {
            class231.field3268 = arg0.method735(11, "timerbar_default");
            class211.field2942 = arg0.method735(-112, "headicons_pk");
            class261.field3631 = arg0.method735(arg1 ^ -81, "headicons_prayer");
            class175.field2598 = arg0.method735(-109, "hint_headicons");
            class147.field2125 = arg0.method735(-123, "hint_mapmarkers");
            class514.field7608 = arg0.method735(51, "mapflag");
            class267.field3682 = arg0.method735(arg1 + 120, "cross");
            class388.field5651 = arg0.method735(114, "mapdots");
            class202.field2847 = arg0.method735(arg1 ^ 4, "scrollbar");
            class433.field6348 = arg0.method735(-90, "name_icons");
            class147.field2122 = arg0.method735(-96, "floorshadows");
            class314.field4264 = arg0.method735(-124, "compass");
            class325.field4414 = arg0.method735(55, "otherlevel");
            class17.field231 = arg0.method735(-89, "hint_mapedge");
        }
    }

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)I", line = 35)
    public final int method499(int arg0) {
        ++field5636;
        return arg0 != -15561 ? 56 : this.field5614;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLya;I)Lt;", line = 46)
    public final class471 method488(byte arg0, class38 arg1, int arg2) {
        ++field5621;
        if (arg0 != 124) {
            this.field5626 = true;
        }
        return this.method2281(8, arg1, arg2);
    }

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "(I)V", line = 58)
    public static void method2279(int arg0) {
        if (arg0 >= 22) {
            field5638 = null;
            field5639 = null;
            field5631 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IBLya;Z)Lso;", line = 70)
    private final class329 method2280(int arg0, byte arg1, class38 arg2, boolean arg3) {
        ++field5634;
        class220 var5 = class78.field1141.method2103(this.field5623 & 65535, true);
        class142 var6;
        class142 var7;
        if (this.field5624) {
            var6 = class385.field5608[0];
            var7 = class89.field1302[this.field5629];
        } else {
            if (~this.field5629 <= -4) {
                var6 = null;
            } else {
                var6 = class385.field5608[this.field5629 - -1];
            }
            var7 = class385.field5608[this.field5629];
        }
        return arg1 >= -116 ? null : var5.method1377(arg2, var7, this.field5614, -4735, super.field1749, arg3, var6, super.field1748, super.field1752, arg0, 22);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILya;I)Lt;", line = 100)
    private final class471 method2281(int arg0, class38 arg1, int arg2) {
        ++field5625;
        if (this.field5622 != null && ~arg1.method257(this.field5622.method372(), arg2) == -1) {
            return this.field5622;
        } else {
            class329 var4 = this.method2280(arg2, (byte) -123, arg1, false);
            if (arg0 != 8) {
                this.method486(-79, (class38) null);
            }
            return var4 != null ? var4.field4492 : null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(ILya;)V", line = 126)
    public final void method493(int arg0, class38 arg1) {
        if (arg0 <= -114) {
            ++field5617;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lya;B)Lmf;", line = 141)
    public final class289 method484(class38 arg0, byte arg1) {
        ++field5627;
        if (this.field5622 == null) {
            return null;
        } else {
            class122 var3 = arg0.method280();
            var3.method182(super.field1749, super.field1748, super.field1752);
            class289 var4 = null;
            if (arg1 < 111) {
                return null;
            } else {
                if (this.field5618) {
                    var4 = class165.method1099(true, 1);
                }
                this.field5622.method397(var3, var4 == null ? null : var4.field4009[0], 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V", line = 167)
    public final void method485(int arg0) {
        if (this.field5622 != null) {
            this.field5622.method371();
        }
        if (arg0 >= -92) {
            this.method482(7, (class38) null);
        }
        ++field5620;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)I", line = 181)
    public final int method496(int arg0) {
        ++field5633;
        int var2 = 47 / ((-4 - arg0) / 61);
        return 22;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lya;IZLij;III)V", line = 191)
    public final void method498(class38 arg0, int arg1, boolean arg2, class291 arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -1) {
            this.method496(33);
        }
        ++field5619;
        if (arg3 instanceof class386) {
            class386 var8 = (class386) arg3;
            if (this.field5622 != null && var8.field5622 != null) {
                this.field5622.method375(var8.field5622, arg1, arg5, arg4, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)I", line = 211)
    public final int method490(int arg0) {
        if (arg0 != -29679) {
            return 18;
        } else {
            ++field5611;
            return this.field5623 & 65535;
        }
    }

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)Z", line = 223)
    public final boolean method492(int arg0) {
        if (arg0 != -1) {
            this.field5612 = true;
        }
        ++field5635;
        return this.field5626;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)Z", line = 234)
    public final boolean method489(int arg0) {
        ++field5630;
        int var2 = -66 / ((arg0 - 23) / 62);
        return this.field5612;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(ILya;)V", line = 244)
    public final void method486(int arg0, class38 arg1) {
        ++field5637;
        Object var3 = null;
        class263 var5;
        if (this.field5632 == null && this.field5612) {
            class329 var4 = this.method2280(262144, (byte) -122, arg1, true);
            var5 = var4 == null ? null : var4.field4490;
        } else {
            var5 = this.field5632;
            this.field5632 = null;
        }
        if (arg0 == 9229) {
            if (var5 != null) {
                class195.method1212(var5, this.field5629, super.field1749, super.field1752, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZILya;I)Z", line = 272)
    public final boolean method500(boolean arg0, int arg1, class38 arg2, int arg3) {
        if (!arg0) {
            field5631 = null;
        }
        ++field5616;
        class471 var5 = this.method2281(8, arg2, 131072);
        if (var5 != null) {
            class122 var6 = arg2.method280();
            var6.method182(super.field1749, super.field1748, super.field1752);
            return var5.method391(arg3, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lya;Ljo;IIIIZIZ)V", line = 298)
    public class386(class38 arg0, class220 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field3091, arg1.field3070);
        this.field5629 = (byte) arg2;
        super.field1752 = arg5;
        this.field5623 = (short) arg1.field3110;
        this.field5624 = arg6;
        this.field5618 = ~arg1.field3119 != -1 && !arg6;
        this.field5626 = arg8;
        this.field5614 = (byte) arg7;
        super.field1749 = arg3;
        this.field5612 = arg0.method314() && arg1.field3073 && !this.field5624 && ~class20.field269.method3085(class152.field2332, (byte) 114) != -1;
        int var10 = 2048;
        if (this.field5626) {
            var10 |= 65536;
        }
        class329 var11 = this.method2280(var10, (byte) -127, arg0, this.field5612);
        if (var11 != null) {
            this.field5622 = var11.field4492;
            this.field5632 = var11.field4490;
            if (this.field5626) {
                this.field5622 = this.field5622.method381((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "(I)V", line = 335)
    public final void method495(int arg0) {
        if (arg0 > -104) {
            this.field5629 = 125;
        }
        ++field5628;
        this.field5626 = false;
        if (this.field5622 != null) {
            this.field5622.method402(this.field5622.method372() & -65537);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILya;)V", line = 358)
    public final void method482(int arg0, class38 arg1) {
        if (arg0 > -56) {
            method2279(91);
        }
        ++field5613;
        Object var3 = null;
        class263 var5;
        if (this.field5632 == null && this.field5612) {
            class329 var4 = this.method2280(262144, (byte) -120, arg1, true);
            var5 = var4 != null ? var4.field4490 : null;
        } else {
            var5 = this.field5632;
            this.field5632 = null;
        }
        if (var5 != null) {
            class365.method2203(var5, this.field5629, super.field1749, super.field1752, (boolean[]) null);
        }
    }
}
