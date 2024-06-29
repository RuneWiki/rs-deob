import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class245 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    private int field3620 = -32768;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    private int field3633 = -1;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    private int field3643 = -1;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "Z")
    private boolean field3642 = false;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "Z")
    private boolean field3646 = false;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    private int field3644;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    public int field3651;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "B")
    private byte field3625;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    private int field3626;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public int field3640;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "B")
    private byte field3648;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public int field3653;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "Z")
    private boolean field3634;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "Lub;")
    public static class15 field3656 = new class15(30);

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "Lub;")
    public static class15 field3657 = new class15(500);

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    public static int field3659 = 0;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "S")
    public static short field3658 = 1;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
    public static int field3660 = -1;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "Lpm;")
    public static class349 field3661;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    private int field3621;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    private int field3627;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    private int field3635;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    private int field3641;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "Ltj;")
    public static class108 field3662;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "Lb;")
    private class183 field3645;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "Lo;")
    private class21 field3650;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "Lni;")
    private class305 field3654;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "Lnl;")
    public class328 field3652;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "[Z")
    private boolean[] field3649;

    static {
        new class349("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field3663 = 0;
        field3661 = new class349("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");
    }

    @OriginalMember(owner = "client!wg", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        field3638++;
        if (this.field3652 != null) {
            this.field3652.method2155();
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lbr;B)V", line = 17)
    public static final void method1701(class223 arg0, byte arg1) {
        if (class370.field5268 == arg0.field3329) {
            class353.field5126[arg0.field3233] = true;
        }
        field3630++;
        if (arg1 != -94) {
            field3661 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V", line = 35)
    private final void method1702(int arg0, int arg1) {
        field3655++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class282 var5 = class398.method2496(arg1 ^ 0xFFFFFF8B, this.field3651);
            class282 var6 = var5;
            if (var5.field4115 != null) {
                var5 = var5.method1942(4096);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field4066 != null) {
                if (this.field3645 != null && var5.method1930(this.field3645.field2598, 102)) {
                    return;
                }
                var3 = var5.method1948(7);
                if (this.field3633 != var5.field4094) {
                    var4 = var5.field4099;
                }
            } else if (var5.field4059 == -1) {
                if (var6 != null && var6.field4066 != null) {
                    if (this.field3645 != null && var6.method1930(this.field3645.field2598, 84)) {
                        return;
                    }
                    var3 = var6.method1948(arg1 + 7);
                    if (this.field3633 != var6.field4094) {
                        var4 = var6.field4099;
                    }
                } else if (var6 != null && var6.field4059 != -1 && this.field3633 != var6.field4094) {
                    var4 = var6.field4099;
                    var3 = var6.field4059;
                }
            } else if (this.field3633 != var5.field4094) {
                var3 = var5.field4059;
                var4 = var5.field4099;
            }
        }
        if (~var3 == arg1) {
            this.field3645 = null;
            return;
        }
        this.field3654 = null;
        if (this.field3645 == null || this.field3645.field2598 != var3) {
            this.field3645 = class110.method671(-21965, var3);
        } else if (this.field3645.field2592 == 0) {
            return;
        }
        if (this.field3645.field2609 == null) {
            this.field3645 = null;
            return;
        }
        if (var4) {
            this.field3627 = (int) (Math.random() * (double) this.field3645.field2609.length);
            this.field3621 = ((int) ((double) this.field3645.field2600[this.field3627] * Math.random())) + 1;
        } else {
            this.field3627 = 0;
            this.field3621 = 1;
        }
        this.field3635 = this.field3627 + 1;
        if (this.field3635 < 0 || this.field3645.field2609.length <= this.field3635) {
            this.field3635 = -1;
        }
        this.field3641 = class34.field434 - this.field3621;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lvq;Lbi;IIIIIIZI)V", line = 488)
    public class245(class269 arg0, class282 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field3642 = arg8;
        this.field3644 = arg6;
        this.field3651 = arg1.field4094;
        this.field3625 = (byte) arg5;
        this.field3626 = arg7;
        this.field3640 = arg3;
        this.field3648 = (byte) arg4;
        this.field3653 = arg2;
        this.field3634 = arg0.method891() && arg1.field4107 && !this.field3642;
        if (arg9 != -1) {
            this.field3646 = true;
        }
        this.method1702(arg9, 0);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLvq;)V", line = 158)
    public final void method1703(byte arg0, class269 arg1) {
        field3632++;
        if (arg0 == -38) {
            this.method1714(this.field3626, true, this.field3644, arg1, arg0 - 60, true, 131072);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V", line = 169)
    public static void method1704(boolean arg0) {
        field3662 = null;
        field3656 = null;
        field3661 = null;
        field3657 = null;
        if (!arg0) {
            method1701((class223) null, (byte) 116);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZIIILvq;ILni;I)V", line = 183)
    public final void method1705(boolean arg0, int arg1, int arg2, int arg3, class269 arg4, int arg5, class305 arg6, int arg7) {
        if (arg7 != 7215) {
            this.field3643 = 50;
        }
        field3623++;
        class88[] var9 = arg6.method210();
        class430[] var10 = arg6.method238();
        if ((this.field3652 == null || this.field3652.field4755) && (var9 != null || var10 != null)) {
            class282 var11 = class398.method2496(arg7 ^ 0xFFFFE3A2, this.field3651);
            if (var11.field4115 != null) {
                var11 = var11.method1942(arg7 ^ 0xC2F);
            }
            if (var11 != null) {
                this.field3652 = new class328(class34.field434);
            }
        }
        if (this.field3652 == null) {
            return;
        }
        if (arg0) {
            this.field3652.method2154(arg4, (long) class34.field434, var9, var10, false);
        } else {
            this.field3652.method2156((long) class34.field434);
        }
        this.field3652.method2150(this.field3648, arg5, arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)Z", line = 221)
    public final boolean method1706(int arg0) {
        field3629++;
        if (arg0 < 14) {
            field3663 = -11;
        }
        return this.field3634;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)I", line = 239)
    public final int method1707(byte arg0) {
        field3636++;
        if (arg0 != 61) {
            field3661 = null;
        }
        return this.field3620;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lvq;Z)V", line = 260)
    public final void method1708(class269 arg0, boolean arg1) {
        if (!arg1) {
            field3660 = -24;
        }
        field3631++;
        if (this.field3650 != null) {
            class428.method2669(this.field3650, this.field3625, this.field3644, this.field3626, this.field3649);
            this.field3650 = null;
            this.field3649 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)I", line = 280)
    public static final int method1709(byte arg0) {
        field3637++;
        class269 var1 = class59.field786;
        boolean var2 = false;
        if (class110.field1418 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class269.method1830(0, (class211) null, var3, (byte) -96, (class219) null, 0);
        }
        long var4 = class18.method107(-16145);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method985(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        if (arg0 >= -63) {
            method1712(117, 23, 26, 123);
        }
        int var7 = (int) (class18.method107(-16145) - var4);
        var1.method1832(0, -16777216, 100, 1, 0, 100);
        if (var2) {
            var1.method1831((byte) 74);
        }
        return var7;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V", line = 322)
    private final void method1710(int arg0, int arg1, int arg2) {
        field3624++;
        if (arg2 != -1) {
            this.method1707((byte) 103);
        }
        label90: while (true) {
            if (this.field3645 == null) {
                if (this.field3646) {
                    return;
                }
                this.method1702(-1, 0);
                if (this.field3645 == null) {
                    return;
                }
            }
            int var4 = class34.field434 - this.field3641;
            if (var4 > 100 && this.field3645.field2587 > 0) {
                int var5 = this.field3645.field2609.length - this.field3645.field2587;
                while (var5 > this.field3627 && var4 > this.field3645.field2600[this.field3627]) {
                    var4 -= this.field3645.field2600[this.field3627];
                    this.field3627++;
                }
                if (var5 <= this.field3627) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3645.field2609.length; var7++) {
                        var6 += this.field3645.field2600[var7];
                    }
                    var4 %= var6;
                }
                this.field3635 = this.field3627 + 1;
                if (this.field3645.field2609.length <= this.field3635) {
                    this.field3635 -= this.field3645.field2587;
                    if (this.field3635 < 0 || this.field3635 >= this.field3645.field2609.length) {
                        this.field3635 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field3645.field2600[this.field3627]) {
                            this.field3621 = var4;
                            this.field3641 = class34.field434 - var4;
                            return;
                        }
                        class47.method311(arg1, arg0, this.field3627, true, false, this.field3645);
                        var4 -= this.field3645.field2600[this.field3627];
                        this.field3627++;
                        if (this.field3645.field2609.length <= this.field3627) {
                            this.field3627 -= this.field3645.field2587;
                            if (this.field3627 < 0 || this.field3645.field2609.length <= this.field3627) {
                                this.field3645 = null;
                                continue label90;
                            }
                        }
                        this.field3635 = this.field3627 + 1;
                    } while (this.field3645.field2609.length > this.field3635);
                    this.field3635 -= this.field3645.field2587;
                } while (this.field3635 >= 0 && this.field3645.field2609.length > this.field3635);
                this.field3635 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)V", line = 421)
    public final void method1711(boolean arg0, int arg1) {
        this.field3646 = arg0;
        field3647++;
        this.method1702(arg1, 0);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)V", line = 450)
    public static final void method1712(int arg0, int arg1, int arg2, int arg3) {
        field3639++;
        class407.field5761.method849(arg0, (byte) -54);
        class407.field5761.method835(7740, arg2);
        class407.field5761.method856(arg1, -1004744376);
        if (arg3 != 30) {
            field3661 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)V", line = 463)
    public static final void method1713(byte arg0) {
        field3622++;
        for (class328 var1 = (class328) class130.field1904.method1082(121); var1 != null; var1 = (class328) class130.field1904.method1078(false)) {
            var1.method2160();
        }
        if (arg0 > -11) {
            method1704(true);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZILvq;IZI)Lni;", line = 520)
    public final class305 method1714(int arg0, boolean arg1, int arg2, class269 arg3, int arg4, boolean arg5, int arg6) {
        field3628++;
        class282 var8 = class398.method2496(-116, this.field3651);
        if (var8.field4115 != null) {
            var8 = var8.method1942(4096);
        }
        if (var8 == null) {
            this.method1708(arg3, true);
            this.field3633 = -1;
            this.field3643 = this.field3627;
            return null;
        }
        if (!this.field3646 && this.field3633 != var8.field4094) {
            this.field3654 = null;
            this.method1702(-1, 0);
        }
        this.method1710(arg0, arg2, -1);
        boolean var9 = arg5 & this.field3634 & class194.field2802 != 0;
        boolean var10 = var9 & (this.field3633 != var8.field4094 || (this.field3643 != this.field3627 || this.field3645 != null && (this.field3645.field2596 || class333.field4837) && this.field3635 != this.field3627) && class194.field2802 >= 2);
        if (arg1 && !var10) {
            this.field3633 = var8.field4094;
            this.field3643 = this.field3627;
            return null;
        }
        int var11 = -128 % ((-arg4 - 6) / 50);
        if (var10) {
            class428.method2669(this.field3650, this.field3625, this.field3644, this.field3626, this.field3649);
        }
        class92 var12 = class439.field6280[this.field3625];
        class92 var13;
        if (this.field3642) {
            var13 = class126.field1734[0];
        } else {
            var13 = this.field3625 < 3 ? class439.field6280[this.field3625 + 1] : null;
        }
        class305 var14 = null;
        if (this.field3645 != null) {
            if (var10) {
                arg6 |= 0x20000;
            }
            var14 = var8.method1941(0, arg6, var12.method360(this.field3644, this.field3626), this.field3627, this.field3645, this.field3621, var12, var13, this.field3635, this.field3644, arg3, this.field3653 == 11 ? this.field3640 + 4 : this.field3640, this.field3626, this.field3653 == 11 ? 10 : this.field3653);
            if (var14 == null) {
                this.field3650 = null;
                this.field3620 = 0;
                this.field3649 = null;
            } else {
                if (var10) {
                    if (this.field3649 == null) {
                        this.field3649 = new boolean[4];
                    }
                    this.field3650 = var14.method227(this.field3650);
                    class129.method793(this.field3650, this.field3625, arg2, arg0, this.field3649);
                }
                this.field3620 = var14.method221();
            }
            this.field3654 = null;
        } else if (this.field3654 != null && arg6 == (arg6 & this.field3654.method247()) && this.field3633 == var8.field4094) {
            var14 = this.field3654;
        } else {
            if (this.field3654 != null) {
                arg6 |= this.field3654.method247();
            }
            class266 var15 = var8.method1936(-14268, arg6, this.field3626, var12, this.field3653 == 11 ? this.field3640 + 4 : this.field3640, this.field3653 == 11 ? 10 : this.field3653, this.field3644, arg3, var10, var13, var12.method360(this.field3644, this.field3626));
            if (var15 == null) {
                this.field3620 = 0;
                this.field3654 = null;
                this.field3649 = null;
                this.field3650 = null;
            } else {
                var14 = var15.field3906;
                this.field3654 = var15.field3906;
                if (var10) {
                    this.field3650 = var15.field3904;
                    this.field3649 = null;
                    class129.method793(this.field3650, this.field3625, arg2, arg0, (boolean[]) null);
                }
                this.field3620 = var14.method221();
            }
        }
        this.field3644 = arg2;
        this.field3643 = this.field3627;
        this.field3626 = arg0;
        this.field3633 = var8.field4094;
        return var14;
    }
}
