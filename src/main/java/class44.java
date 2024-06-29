import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class44 extends class91 {

    @OriginalMember(owner = "client!ga", name = "Yb", descriptor = "Lje;")
    public static class67 field816 = class85.method592(255, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!ga", name = "Ub", descriptor = "Lje;")
    private static class67 field812 = class85.method592(255, "Loaded title screen");

    @OriginalMember(owner = "client!ga", name = "dc", descriptor = "Lje;")
    public static class67 field821 = class85.method592(255, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!ga", name = "ac", descriptor = "Lje;")
    public static class67 field818 = class85.method592(255, "gelb:");

    @OriginalMember(owner = "client!ga", name = "jc", descriptor = "Lje;")
    public static class67 field827 = field812;

    @OriginalMember(owner = "client!ga", name = "Vb", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ga", name = "Wb", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!ga", name = "Zb", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!ga", name = "bc", descriptor = "I")
    private int field819;

    @OriginalMember(owner = "client!ga", name = "cc", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!ga", name = "fc", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!ga", name = "gc", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!ga", name = "hc", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ga", name = "ic", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!ga", name = "kc", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!ga", name = "lc", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!ga", name = "mc", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!ga", name = "Xb", descriptor = "Lsd;")
    public static class129 field815;

    @OriginalMember(owner = "client!ga", name = "ec", descriptor = "Lse;")
    private class130 field822;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[B)Loe;")
    public static final class102 method279(int arg0, byte[] arg1) {
        ++field824;
        if (arg1 == null) {
            return null;
        } else {
            class102 var2 = new class102(arg1, class4.field61, class128.field2804, class4.field65, class69.field1409, class85.field1888, class152.field3489);
            class151.method1154(0);
            if (arg0 <= 68) {
                field815 = null;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "(B)V")
    public static void method280(byte arg0) {
        field815 = null;
        int var1 = -32 % ((6 - arg0) / 44);
        field827 = null;
        field812 = null;
        field816 = null;
        field818 = null;
        field821 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILlc;)V")
    public static final void method281(int arg0, class79 arg1) {
        ++field813;
        if (arg0 == -80) {
            if (~class84.field1855 == -2) {
                short var2 = 280;
                if (class50.field961 >= var2 && var2 + 14 >= class50.field961 && ~class126.field2773 <= -5 && class126.field2773 <= 18) {
                    class99.method768(0, false, 0);
                    return;
                }
                if (class50.field961 >= var2 + 15 && var2 + 80 >= class50.field961 && ~class126.field2773 <= -5 && ~class126.field2773 >= -19) {
                    class99.method768(0, false, 1);
                    return;
                }
                short var3 = 390;
                if (class50.field961 >= var3 && ~(var3 - -14) <= ~class50.field961 && class126.field2773 >= 4 && ~class126.field2773 >= -19) {
                    class99.method768(1, false, 0);
                    return;
                }
                if (~class50.field961 <= ~(var3 + 15) && class50.field961 <= var3 + 80 && ~class126.field2773 <= -5 && class126.field2773 <= 18) {
                    class99.method768(1, false, 1);
                    return;
                }
                short var4 = 500;
                if (~class50.field961 <= ~var4 && ~(var4 + 14) <= ~class50.field961 && ~class126.field2773 <= -5 && class126.field2773 <= 18) {
                    class99.method768(2, false, 0);
                    return;
                }
                if (~class50.field961 <= ~(var4 + 15) && class50.field961 <= var4 - -80 && ~class126.field2773 <= -5 && ~class126.field2773 >= -19) {
                    class99.method768(2, false, 1);
                    return;
                }
                short var5 = 610;
                if (var5 <= class50.field961 && ~class50.field961 >= ~(var5 - -14) && class126.field2773 >= 4 && ~class126.field2773 >= -19) {
                    class99.method768(3, false, 0);
                    return;
                }
                if (~class50.field961 <= ~(var5 + 15) && ~(var5 + 80) <= ~class50.field961 && ~class126.field2773 <= -5 && ~class126.field2773 >= -19) {
                    class99.method768(3, false, 1);
                    return;
                }
                if (~class50.field961 <= -709 && ~class126.field2773 <= -5 && class50.field961 <= 758 && ~class126.field2773 >= -21) {
                    class75.field1620 = false;
                    class116.field2620.method906(0, 0);
                    class114.field2586.method906(382, 0);
                    class89.field1957.method531(-(class89.field1957.field1592 / 2) + 382, 18);
                    return;
                }
                if (class149.field3403 != -1) {
                    class127 var6 = class99.field2209[class149.field3403];
                    if (!class112.field2523 != var6.field2778) {
                        byte[] var7 = class49.method314(new class67[] { var6.field2785, class142.field3256 }, 0).method447(23368);
                        class55.field1091 = new String(var7, 0, var7.length);
                        if (class41.field769 != 0) {
                            class105.field2400 = 443;
                            class58.field1146 = 43594;
                            class9.field205 = 43594;
                            class41.field769 = 0;
                        }
                        class75.field1620 = false;
                        class19.field366 = var6.field2784;
                        class116.field2620.method906(0, 0);
                        class114.field2586.method906(382, 0);
                        class89.field1957.method531(-(class89.field1957.field1592 / 2) + 382, 18);
                        return;
                    }
                    class67 var8 = class49.method314(new class67[] { class144.field3313, var6.field2785, class142.field3256, class52.field1040, class137.field3096, class60.method420(class41.field773 ? 1 : 0, 28498), class59.field1180, class60.method420(class3.field44, 28498), class82.field1814, class60.method420(class159.field3657, 28498) }, 0);
                    try {
                        arg1.getAppletContext().showDocument(var8.method486(23854), "_self");
                        return;
                    } catch (Exception var9) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "(I)I")
    public final int method282(int arg0) {
        ++field829;
        if (arg0 <= 126) {
            method279(120, (byte[]) null);
        }
        return super.field1991[super.field2043++] - this.field822.method989(27398) & 255;
    }

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "(II)I")
    public final int method283(int arg0, int arg1) {
        int var3 = this.field819 >> 3;
        ++field828;
        int var4 = -(7 & this.field819) + arg0;
        this.field819 += arg1;
        int var5 = 0;
        while (arg1 > var4) {
            var5 += (class61.field1226[var4] & super.field1991[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (super.field1991[var3] & class61.field1226[var4]) + var5;
        } else {
            var6 = (super.field1991[var3] >> -arg1 + var4 & class61.field1226[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(Z)V")
    public final void method284(boolean arg0) {
        this.field819 = super.field2043 * 8;
        if (!arg0) {
            ++field820;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(IB)V")
    public final void method285(int arg0, byte arg1) {
        super.field1991[super.field2043++] = (byte) (arg0 + this.field822.method989(27398));
        if (arg1 != 64) {
            field818 = null;
        }
        ++field826;
    }

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "(II)I")
    public final int method286(int arg0, int arg1) {
        ++field814;
        if (arg1 != -5) {
            field827 = null;
        }
        return arg0 * 8 + -this.field819;
    }

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "(I)V")
    public final void method287(int arg0) {
        ++field825;
        super.field2043 = (this.field819 + 7) / 8;
        if (arg0 < 31) {
            this.method287(-58);
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I)V")
    public class44(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([IB)V")
    public final void method288(int[] arg0, byte arg1) {
        ++field823;
        this.field822 = new class130(arg0);
        if (arg1 >= -55) {
            field827 = null;
        }
    }
}
