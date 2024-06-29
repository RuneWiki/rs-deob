import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class44 extends class100 implements class218 {

    @OriginalMember(owner = "client!pn", name = "I", descriptor = "B")
    private byte field611;

    @OriginalMember(owner = "client!pn", name = "K", descriptor = "B")
    private byte field613;

    @OriginalMember(owner = "client!pn", name = "S", descriptor = "B")
    private byte field621;

    @OriginalMember(owner = "client!pn", name = "A", descriptor = "S")
    private short field603;

    @OriginalMember(owner = "client!pn", name = "P", descriptor = "Z")
    private boolean field618;

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "Z")
    private boolean field600;

    @OriginalMember(owner = "client!pn", name = "M", descriptor = "Z")
    private boolean field615;

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "Z")
    private boolean field608;

    @OriginalMember(owner = "client!pn", name = "V", descriptor = "Lfq;")
    private class87 field624;

    @OriginalMember(owner = "client!pn", name = "B", descriptor = "Lns;")
    public class57 field604;

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "[[I")
    public static int[][] field606 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!pn", name = "W", descriptor = "Lo;")
    public static class332 field625 = new class332("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!pn", name = "bb", descriptor = "[I")
    public static int[] field630 = new int[14];

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!pn", name = "y", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!pn", name = "H", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!pn", name = "J", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!pn", name = "L", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!pn", name = "N", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!pn", name = "O", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!pn", name = "Q", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!pn", name = "R", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!pn", name = "T", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!pn", name = "U", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!pn", name = "X", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!pn", name = "Y", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!pn", name = "ab", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!pn", name = "cb", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!pn", name = "Z", descriptor = "Ldp;")
    public static class319 field628;

    @OriginalMember(owner = "client!pn", name = "db", descriptor = "Ljn;")
    public static class378 field632;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(Z)I")
    public final int method257(boolean arg0) {
        if (arg0) {
            return -110;
        } else {
            ++field622;
            return 65535 & this.field603;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLtq;)V")
    public final void method256(byte arg0, class63 arg1) {
        ++field617;
        if (arg0 == 82) {
            Object var3 = null;
            class87 var5;
            if (this.field624 == null && this.field608) {
                class447 var4 = this.method324(arg1, true, 131072, 76);
                var5 = var4 == null ? null : var4.field6337;
            } else {
                var5 = this.field624;
                this.field624 = null;
            }
            if (var5 != null) {
                class373.method2309(var5, this.field611, super.field1417, super.field1422, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ltq;III)Z")
    public final boolean method259(class63 arg0, int arg1, int arg2, int arg3) {
        int var5 = -104 % ((arg2 - -59) / 58);
        ++field612;
        class57 var6 = this.method323(65536, arg0, 0);
        if (var6 != null) {
            class315 var7 = arg0.method565();
            var7.method482(super.field1417, super.field1418, super.field1422);
            return var6.method423(arg1, arg3, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)I")
    public final int method244(byte arg0) {
        ++field620;
        return arg0 >= -8 ? 121 : this.field621;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
    public final void method249(int arg0) {
        this.field618 = false;
        if (arg0 <= 56) {
            this.field600 = true;
        }
        ++field631;
        if (this.field604 != null) {
            this.field604.method441(this.field604.method402() & -32769);
        }
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(II)V")
    public static final void method320(int arg0, int arg1) {
        class294.field4429 = -1;
        class384.field5692 = arg0;
        ++field609;
        if (arg1 <= 59) {
            field630 = null;
        }
        class303.field4512 = -1;
        class174.method1195(-52);
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Ltq;Lvc;IIIIZIIZ)V")
    public class44(class63 arg0, class271 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class21.method191(arg7, arg8, (byte) 124));
        super.field1417 = (short) arg3;
        this.field611 = (byte) arg2;
        this.field613 = (byte) arg7;
        this.field621 = (byte) arg8;
        this.field603 = (short) arg1.field4043;
        this.field618 = arg9;
        this.field600 = arg6;
        super.field1422 = (short) arg5;
        this.field615 = arg1.field4053 != 0 && !arg6;
        this.field608 = arg0.method581() && arg1.field4087 && !this.field600 && class337.field5038.field3952 != 0;
        int var11 = 1024;
        if (this.field618) {
            var11 |= 32768;
        }
        class447 var12 = this.method324(arg0, this.field608, var11, 126);
        if (var12 != null) {
            this.field624 = var12.field6337;
            this.field604 = var12.field6334;
            if (this.field618) {
                this.field604 = this.field604.method437((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(II)Lso;")
    public static final class187 method321(int arg0, int arg1) {
        ++field607;
        if (arg0 > -56) {
            field630 = null;
        }
        return class373.field5604 && class203.field3091 <= arg1 && ~class345.field5253 <= ~arg1 ? class472.field6620[-class203.field3091 + arg1] : null;
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)Z")
    public final boolean method253(int arg0) {
        if (arg0 >= -9) {
            this.method245((byte) -33, false, (class63) null, (class352) null, -84, -100, -36);
        }
        ++field605;
        return this.field618;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILtq;)V")
    public final void method260(int arg0, class63 arg1) {
        ++field614;
        if (arg0 != 0) {
            this.method250((byte) -37);
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(Ltq;I)Lcj;")
    public final class123 method252(class63 arg0, int arg1) {
        ++field601;
        if (this.field604 == null) {
            return null;
        } else {
            if (arg1 != 2) {
                this.field600 = true;
            }
            class315 var3 = arg0.method565();
            var3.method482(super.field1417, super.field1418, super.field1422);
            class123 var4 = null;
            if (this.field615) {
                var4 = class225.method1462(1, -84);
            }
            this.field604.method404(var3, var4 != null ? var4.field1695[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "(B)V")
    public static void method322(byte arg0) {
        field625 = null;
        field606 = null;
        field630 = null;
        if (arg0 == -24) {
            field632 = null;
            field628 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BILtq;)Lns;")
    public final class57 method255(byte arg0, int arg1, class63 arg2) {
        if (arg0 <= 108) {
            return null;
        } else {
            ++field619;
            return this.method323(arg1, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ltq;I)V")
    public final void method258(class63 arg0, int arg1) {
        if (arg1 != -22360) {
            this.method259((class63) null, 74, 54, 109);
        }
        ++field616;
        Object var3 = null;
        class87 var5;
        if (this.field624 == null && this.field608) {
            class447 var4 = this.method324(arg0, true, 131072, 83);
            var5 = var4 != null ? var4.field6337 : null;
        } else {
            var5 = this.field624;
            this.field624 = null;
        }
        if (var5 != null) {
            class299.method1868(var5, this.field611, super.field1417, super.field1422, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)Z")
    public final boolean method254(boolean arg0) {
        ++field627;
        if (!arg0) {
            this.field621 = 71;
        }
        return this.field608;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BZLtq;Lhm;III)V")
    public final void method245(byte arg0, boolean arg1, class63 arg2, class352 arg3, int arg4, int arg5, int arg6) {
        ++field610;
        if (arg0 >= -41) {
            this.method324((class63) null, false, 97, -55);
        }
        if (arg3 instanceof class44) {
            class44 var8 = (class44) arg3;
            if (this.field604 != null && var8.field604 != null) {
                this.field604.method447(var8.field604, arg6, arg4, arg5, arg1);
            }
        } else {
            if (arg3 instanceof class327) {
                class327 var9 = (class327) arg3;
                if (this.field604 != null && var9.field4896 != null) {
                    this.field604.method447(var9.field4896, arg6, arg4, arg5, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)I")
    public final int method250(byte arg0) {
        ++field626;
        int var2 = -71 % ((-49 - arg0) / 60);
        return this.field613;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILtq;I)Lns;")
    private final class57 method323(int arg0, class63 arg1, int arg2) {
        ++field623;
        if (this.field604 != null && ~arg1.method583(this.field604.method402(), arg0) == -1) {
            return this.field604;
        } else {
            if (arg2 != 0) {
                this.field600 = true;
            }
            class447 var4 = this.method324(arg1, false, arg0, 108);
            return var4 != null ? var4.field6334 : null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(Z)V")
    public final void method247(boolean arg0) {
        if (!arg0) {
            ++field629;
            if (this.field604 != null) {
                this.field604.method422();
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ltq;ZII)Lri;")
    private final class447 method324(class63 arg0, boolean arg1, int arg2, int arg3) {
        ++field602;
        class271 var5 = class206.field3124.method338((byte) 106, 65535 & this.field603);
        if (arg3 < 45) {
            this.method254(true);
        }
        class48 var6;
        class48 var7;
        if (!this.field600) {
            if (this.field611 >= 3) {
                var6 = null;
            } else {
                var6 = class483.field6781[this.field611 - -1];
            }
            var7 = class483.field6781[this.field611];
        } else {
            var7 = class55.field765[this.field611];
            var6 = class483.field6781[0];
        }
        return var5.method1773(arg2, super.field1422, var7, super.field1417, arg0, this.field613, (byte) -86, arg1, var6, this.field621, super.field1418);
    }
}
