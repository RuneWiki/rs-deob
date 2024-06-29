import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class502 extends class8 implements class246 {

    @OriginalMember(owner = "client!dca", name = "U", descriptor = "B")
    private byte field6985;

    @OriginalMember(owner = "client!dca", name = "J", descriptor = "S")
    private short field6975;

    @OriginalMember(owner = "client!dca", name = "t", descriptor = "B")
    private byte field6960;

    @OriginalMember(owner = "client!dca", name = "G", descriptor = "Z")
    private boolean field6972;

    @OriginalMember(owner = "client!dca", name = "s", descriptor = "Z")
    private boolean field6959;

    @OriginalMember(owner = "client!dca", name = "x", descriptor = "Z")
    private boolean field6964;

    @OriginalMember(owner = "client!dca", name = "K", descriptor = "B")
    private byte field6976;

    @OriginalMember(owner = "client!dca", name = "F", descriptor = "Z")
    private boolean field6971;

    @OriginalMember(owner = "client!dca", name = "w", descriptor = "Lr;")
    public class521 field6963;

    @OriginalMember(owner = "client!dca", name = "I", descriptor = "Lk;")
    private class88 field6974;

    @OriginalMember(owner = "client!dca", name = "S", descriptor = "Ljava/lang/String;")
    public static String field6983;

    @OriginalMember(owner = "client!dca", name = "T", descriptor = "Z")
    public static boolean field6984;

    @OriginalMember(owner = "client!dca", name = "o", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!dca", name = "p", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!dca", name = "q", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!dca", name = "r", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!dca", name = "u", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!dca", name = "v", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!dca", name = "y", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!dca", name = "z", descriptor = "I")
    public static int field6966;

    @OriginalMember(owner = "client!dca", name = "C", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!dca", name = "D", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!dca", name = "E", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!dca", name = "H", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!dca", name = "L", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!dca", name = "M", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!dca", name = "N", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!dca", name = "P", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!dca", name = "Q", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!dca", name = "R", descriptor = "I")
    public static int field6982;

    @OriginalMember(owner = "client!dca", name = "V", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!dca", name = "B", descriptor = "Lud;")
    private class119 field6967;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIILqa;IZLlb;)V")
    public final void method54(int arg0, int arg1, int arg2, class167 arg3, int arg4, boolean arg5, class239 arg6) {
        ++field6977;
        if (!(arg6 instanceof class502)) {
            if (arg6 instanceof class144) {
                class144 var8 = (class144) arg6;
                if (this.field6963 != null && var8.field1847 != null) {
                    this.field6963.method1573(var8.field1847, arg4, arg2, arg0, arg5);
                }
            }
        } else {
            class502 var9 = (class502) arg6;
            if (this.field6963 != null && var9.field6963 != null) {
                this.field6963.method1573(var9.field6963, arg4, arg2, arg0, arg5);
            }
        }
        if (arg1 <= 67) {
            this.method60(-67);
        }
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)I")
    public final int method52(int arg0) {
        ++field6970;
        return arg0 != -17817 ? -92 : this.field6975 & 65535;
    }

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "(I)Z")
    public final boolean method64(int arg0) {
        ++field6966;
        if (arg0 != -1) {
            this.field6985 = 77;
        }
        return this.field6964;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method63(int arg0, int arg1, class167 arg2, int arg3) {
        if (arg3 >= -35) {
            field6983 = null;
        }
        ++field6980;
        class521 var5 = this.method2804(0, arg2, 131072);
        if (var5 != null) {
            class105 var6 = arg2.method964();
            var6.method361(super.field66, super.field63, super.field62);
            return var5.method1598(arg0, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)I")
    public final int method60(int arg0) {
        ++field6958;
        if (arg0 != 1901) {
            this.field6974 = null;
        }
        return this.field6976;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILqa;)V")
    public final void method62(int arg0, class167 arg1) {
        ++field6969;
        if (arg0 == 22132) {
            Object var3 = null;
            class88 var5;
            if (this.field6974 == null && this.field6971) {
                class433 var4 = this.method2800((byte) 69, 262144, arg1, true);
                var5 = var4 == null ? null : var4.field5897;
            } else {
                var5 = this.field6974;
                this.field6974 = null;
            }
            if (var5 != null) {
                class443.method2572(var5, this.field6985, super.field66, super.field62, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lqa;I)V")
    public final void method61(class167 arg0, int arg1) {
        ++field6981;
        Object var3 = null;
        class88 var5;
        if (this.field6974 == null && this.field6971) {
            class433 var4 = this.method2800((byte) 77, 262144, arg0, true);
            var5 = var4 != null ? var4.field5897 : null;
        } else {
            var5 = this.field6974;
            this.field6974 = null;
        }
        if (var5 != null) {
            class68.method388(var5, this.field6985, super.field66, super.field62, (boolean[]) null);
        }
        if (arg1 != -9785) {
            this.method56((byte) 87);
        }
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(Lqa;I)V")
    public final void method66(class167 arg0, int arg1) {
        if (arg1 == 0) {
            ++field6973;
        }
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lqa;Lbu;IIIIZIIZ)V")
    public class502(class167 arg0, class137 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class512.method2858(arg7, (byte) -115, arg8));
        super.field62 = arg5;
        super.field66 = arg3;
        this.field6985 = (byte) arg2;
        this.field6975 = (short) arg1.field1679;
        this.field6960 = (byte) arg7;
        this.field6972 = arg1.field1749 != 0 && !arg6;
        this.field6959 = arg6;
        this.field6964 = arg9;
        this.field6976 = (byte) arg8;
        this.field6971 = arg0.method951() && arg1.field1725 && !this.field6959 && ~class501.field6954.method3159(class428.field5845, true) != -1;
        int var11 = 2048;
        if (this.field6964) {
            var11 |= 65536;
        }
        class433 var12 = this.method2800((byte) 53, var11, arg0, this.field6971);
        if (var12 != null) {
            this.field6963 = var12.field5896;
            this.field6974 = var12.field5897;
            if (this.field6964) {
                this.field6963 = this.field6963.method1607((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IILqa;)Lr;")
    public final class521 method53(int arg0, int arg1, class167 arg2) {
        ++field6986;
        if (arg1 != 30307) {
            this.method63(-17, 96, (class167) null, 51);
        }
        return this.method2804(0, arg2, arg0);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)I")
    public final int method57(int arg0) {
        ++field6968;
        if (arg0 != -29185) {
            field6955 = 79;
        }
        return this.field6960;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(BILqa;Z)Lvq;")
    private final class433 method2800(byte arg0, int arg1, class167 arg2, boolean arg3) {
        ++field6961;
        if (arg0 <= 49) {
            this.field6975 = -85;
        }
        class137 var5 = class626.field9084.method1093(0, 65535 & this.field6975);
        class544 var6;
        class544 var7;
        if (!this.field6959) {
            var6 = class50.field672[this.field6985];
            if (~this.field6985 <= -4) {
                var7 = null;
            } else {
                var7 = class50.field672[this.field6985 + 1];
            }
        } else {
            var6 = class353.field4949[this.field6985];
            var7 = class50.field672[0];
        }
        return var5.method731(super.field62, var6, super.field66, this.field6960, arg1, arg2, super.field63, -15988, var7, this.field6976, arg3);
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(B)V")
    public final void method56(byte arg0) {
        if (arg0 != 52) {
            this.field6976 = -7;
        }
        ++field6957;
        this.field6964 = false;
        if (this.field6963 != null) {
            this.field6963.method1583(-65537 & this.field6963.method1601());
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)I")
    public static final int method2801(int arg0, int arg1) {
        return class599.field8649 != null ? class599.field8649[arg0][arg1] & 65535 : 0;
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(ILqa;)Lud;")
    public final class119 method58(int arg0, class167 arg1) {
        ++field6982;
        int var3 = -56 % ((4 - arg0) / 47);
        if (this.field6967 == null) {
            this.field6967 = class82.method459(this.method2804(0, arg1, 0), super.field62, super.field63, super.field66, (byte) -101);
        }
        return this.field6967;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lum;Lum;B)V")
    public static final void method2802(class108 arg0, class108 arg1, byte arg2) {
        if (arg1.field1399 != null) {
            arg1.method589(-8880);
        }
        ++field6979;
        arg1.field1403 = arg0;
        arg1.field1399 = arg0.field1399;
        if (arg2 <= -125) {
            arg1.field1399.field1403 = arg1;
            arg1.field1403.field1399 = arg1;
        }
    }

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "(B)V")
    public static void method2803(byte arg0) {
        if (arg0 >= -116) {
            method2803((byte) 111);
        }
        field6983 = null;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILqa;I)Lr;")
    private final class521 method2804(int arg0, class167 arg1, int arg2) {
        ++field6978;
        if (arg0 != 0) {
            return null;
        } else if (this.field6963 != null && arg1.method921(this.field6963.method1601(), arg2) == 0) {
            return this.field6963;
        } else {
            class433 var4 = this.method2800((byte) 105, arg2, arg1, false);
            return var4 == null ? null : var4.field5896;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(BLqa;)Lqba;")
    public final class541 method59(byte arg0, class167 arg1) {
        ++field6965;
        if (this.field6963 == null) {
            return null;
        } else {
            int var3 = 50 / ((-30 - arg0) / 63);
            class105 var4 = arg1.method964();
            var4.method361(super.field66, super.field63, super.field62);
            class541 var5 = null;
            if (this.field6972) {
                var5 = class296.method1818(16711680, 1);
            }
            this.field6963.method1595(var4, var5 != null ? var5.field7564[0] : null, 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)Z")
    public final boolean method55(byte arg0) {
        ++field6956;
        int var2 = 127 % ((-20 - arg0) / 32);
        return this.field6971;
    }

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "(I)V")
    public final void method65(int arg0) {
        ++field6962;
        if (this.field6963 != null) {
            this.field6963.method1588();
        }
        int var2 = 116 % ((-4 - arg0) / 41);
    }

    static {
        new class344("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        new class344("Select", "Auswählen", "Sélectionner", "Selecionar");
        field6983 = null;
        field6984 = false;
    }
}
