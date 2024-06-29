import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class60 extends class90 implements class503 {

    @OriginalMember(owner = "client!in", name = "H", descriptor = "S")
    private short field743;

    @OriginalMember(owner = "client!in", name = "s", descriptor = "B")
    private byte field729;

    @OriginalMember(owner = "client!in", name = "N", descriptor = "B")
    private byte field748;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "Z")
    private boolean field731;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "Z")
    private boolean field732;

    @OriginalMember(owner = "client!in", name = "E", descriptor = "B")
    private byte field741;

    @OriginalMember(owner = "client!in", name = "C", descriptor = "Z")
    private boolean field739;

    @OriginalMember(owner = "client!in", name = "P", descriptor = "Z")
    private boolean field750;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "Lba;")
    private class263 field745;

    @OriginalMember(owner = "client!in", name = "O", descriptor = "Lt;")
    public class471 field749;

    @OriginalMember(owner = "client!in", name = "R", descriptor = "Z")
    public static boolean field752 = false;

    @OriginalMember(owner = "client!in", name = "S", descriptor = "Ldi;")
    public static class83 field753;

    @OriginalMember(owner = "client!in", name = "T", descriptor = "[C")
    public static char[] field754;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!in", name = "A", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!in", name = "B", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!in", name = "D", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!in", name = "L", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!in", name = "M", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!in", name = "Q", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILya;)V")
    public final void method482(int arg0, class38 arg1) {
        ++field730;
        Object var3 = null;
        if (arg0 <= -56) {
            class263 var5;
            if (this.field745 == null && this.field750) {
                class329 var4 = this.method494(8358, true, arg1, 262144);
                var5 = var4 != null ? var4.field4490 : null;
            } else {
                var5 = this.field745;
                this.field745 = null;
            }
            if (var5 != null) {
                class365.method2203(var5, this.field748, super.field1309, super.field1307, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(IB)V")
    public static final void method483(int arg0, byte arg1) {
        ++field738;
        if (arg1 != -111) {
            method483(-8, (byte) 32);
        }
        class97 var2 = class348.method2064(arg0, 9, 102);
        var2.method710(arg1 ^ 9338);
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lya;Ljo;IIIIZIIZ)V")
    public class60(class38 arg0, class220 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class199.method1241(arg7, 3, arg8));
        super.field1307 = arg5;
        this.field743 = (short) arg1.field3110;
        this.field729 = (byte) arg7;
        this.field748 = (byte) arg2;
        this.field731 = arg6;
        super.field1309 = arg3;
        this.field732 = arg9;
        this.field741 = (byte) arg8;
        this.field739 = ~arg1.field3119 != -1 && !arg6;
        this.field750 = arg0.method314() && arg1.field3073 && !this.field731 && class20.field269.method3085(class152.field2332, (byte) -78) != 0;
        int var11 = 2048;
        if (this.field732) {
            var11 |= 65536;
        }
        class329 var12 = this.method494(8358, this.field750, arg0, var11);
        if (var12 != null) {
            this.field745 = var12.field4490;
            this.field749 = var12.field4492;
            if (this.field732) {
                this.field749 = this.field749.method381((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lya;B)Lmf;")
    public final class289 method484(class38 arg0, byte arg1) {
        ++field740;
        if (this.field749 == null) {
            return null;
        } else {
            if (arg1 < 111) {
                this.field750 = true;
            }
            class122 var3 = arg0.method280();
            var3.method182(super.field1309, super.field1313, super.field1307);
            class289 var4 = null;
            if (this.field739) {
                var4 = class165.method1099(true, 1);
            }
            this.field749.method397(var3, var4 != null ? var4.field4009[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V")
    public final void method485(int arg0) {
        if (this.field749 != null) {
            this.field749.method371();
        }
        if (arg0 > -92) {
            this.field749 = null;
        }
        ++field747;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(ILya;)V")
    public final void method486(int arg0, class38 arg1) {
        if (arg0 != 9229) {
            this.field749 = null;
        }
        ++field742;
        Object var3 = null;
        class263 var5;
        if (this.field745 == null && this.field750) {
            class329 var4 = this.method494(8358, true, arg1, 262144);
            var5 = var4 != null ? var4.field4490 : null;
        } else {
            var5 = this.field745;
            this.field745 = null;
        }
        if (var5 != null) {
            class195.method1212(var5, this.field748, super.field1309, super.field1307, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lya;II)Lt;")
    private final class471 method487(class38 arg0, int arg1, int arg2) {
        ++field733;
        if (this.field749 != null && ~arg0.method257(this.field749.method372(), arg1) == -1) {
            return this.field749;
        } else {
            class329 var4 = this.method494(8358, false, arg0, arg1);
            if (arg2 != -1) {
                this.method498((class38) null, 51, true, (class291) null, 60, -92, 29);
            }
            return var4 == null ? null : var4.field4492;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BLya;I)Lt;")
    public final class471 method488(byte arg0, class38 arg1, int arg2) {
        ++field728;
        if (arg0 != 124) {
            field752 = true;
        }
        return this.method487(arg1, arg2, -1);
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)Z")
    public final boolean method489(int arg0) {
        int var2 = -103 % ((23 - arg0) / 62);
        ++field744;
        return this.field750;
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(I)I")
    public final int method490(int arg0) {
        if (arg0 != -29679) {
            field752 = true;
        }
        ++field725;
        return this.field743 & 65535;
    }

    @OriginalMember(owner = "client!in", name = "i", descriptor = "(I)V")
    public static void method491(int arg0) {
        field753 = null;
        int var1 = -22 % ((34 - arg0) / 36);
        field754 = null;
    }

    @OriginalMember(owner = "client!in", name = "f", descriptor = "(I)Z")
    public final boolean method492(int arg0) {
        if (arg0 != -1) {
            method491(29);
        }
        ++field735;
        return this.field732;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(ILya;)V")
    public final void method493(int arg0, class38 arg1) {
        if (arg0 <= -114) {
            ++field724;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZLya;I)Lso;")
    private final class329 method494(int arg0, boolean arg1, class38 arg2, int arg3) {
        ++field737;
        class220 var5 = class78.field1141.method2103(this.field743 & 65535, true);
        if (arg0 != 8358) {
            this.method496(116);
        }
        class142 var6;
        class142 var7;
        if (this.field731) {
            var6 = class385.field5608[0];
            var7 = class89.field1302[this.field748];
        } else {
            if (this.field748 >= 3) {
                var6 = null;
            } else {
                var6 = class385.field5608[this.field748 - -1];
            }
            var7 = class385.field5608[this.field748];
        }
        return var5.method1377(arg2, var7, this.field741, -4735, super.field1309, arg1, var6, super.field1313, super.field1307, arg3, this.field729);
    }

    @OriginalMember(owner = "client!in", name = "h", descriptor = "(I)V")
    public final void method495(int arg0) {
        ++field736;
        this.field732 = false;
        if (arg0 <= -104) {
            if (this.field749 != null) {
                this.field749.method402(this.field749.method372() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)I")
    public final int method496(int arg0) {
        int var2 = 98 / ((arg0 - -4) / 61);
        ++field734;
        return this.field729;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(IB)Lem;")
    public static final class150 method497(int arg0, byte arg1) {
        ++field751;
        int var2 = arg0 >> 16;
        if (arg1 > -116) {
            method483(-110, (byte) -48);
        }
        int var3 = 65535 & arg0;
        if (class495.field7226[var2] == null || class495.field7226[var2][var3] == null) {
            boolean var4 = class256.method1534(32554, var2);
            if (!var4) {
                return null;
            }
        }
        return class495.field7226[var2][var3];
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lya;IZLij;III)V")
    public final void method498(class38 arg0, int arg1, boolean arg2, class291 arg3, int arg4, int arg5, int arg6) {
        ++field727;
        if (!(arg3 instanceof class60)) {
            if (arg3 instanceof class428) {
                class428 var8 = (class428) arg3;
                if (this.field749 != null && var8.field6272 != null) {
                    this.field749.method375(var8.field6272, arg1, arg5, arg4, arg2);
                }
            }
        } else {
            class60 var9 = (class60) arg3;
            if (this.field749 != null && var9.field749 != null) {
                this.field749.method375(var9.field749, arg1, arg5, arg4, arg2);
            }
        }
        if (arg6 != -1) {
            method483(-53, (byte) 28);
        }
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(I)I")
    public final int method499(int arg0) {
        ++field726;
        if (arg0 != -15561) {
            this.method487((class38) null, -15, -98);
        }
        return this.field741;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZILya;I)Z")
    public final boolean method500(boolean arg0, int arg1, class38 arg2, int arg3) {
        ++field746;
        if (!arg0) {
            return true;
        } else {
            class471 var5 = this.method487(arg2, 131072, -1);
            if (var5 != null) {
                class122 var6 = arg2.method280();
                var6.method182(super.field1309, super.field1313, super.field1307);
                return var5.method391(arg3, arg1, var6, false);
            } else {
                return false;
            }
        }
    }

    static {
        new class466("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field753 = new class83(17, 8);
        field754 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    }
}
