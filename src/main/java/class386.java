import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class386 extends class23 implements class115 {

    @OriginalMember(owner = "client!rca", name = "B", descriptor = "Lwc;")
    public class58 field5173;

    @OriginalMember(owner = "client!rca", name = "C", descriptor = "Z")
    private boolean field5174;

    @OriginalMember(owner = "client!rca", name = "K", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5182 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!rca", name = "N", descriptor = "Ldm;")
    public static class46 field5185 = new class46();

    @OriginalMember(owner = "client!rca", name = "P", descriptor = "Ldv;")
    public static class566 field5187 = new class566(50, -1);

    @OriginalMember(owner = "client!rca", name = "v", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!rca", name = "w", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!rca", name = "x", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!rca", name = "y", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!rca", name = "z", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!rca", name = "D", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!rca", name = "E", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!rca", name = "F", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!rca", name = "G", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!rca", name = "H", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!rca", name = "I", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!rca", name = "J", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!rca", name = "L", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!rca", name = "M", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!rca", name = "O", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!rca", name = "A", descriptor = "Lnk;")
    private class611 field5172;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)I")
    public final int method749(int arg0) {
        if (arg0 != 24194) {
            this.method490(false, (class207) null);
        }
        ++field5168;
        return this.field5173.field1038;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ZLqa;)Lnk;")
    public final class611 method490(boolean arg0, class207 arg1) {
        if (arg0) {
            return null;
        } else {
            ++field5176;
            return this.field5172;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z)I")
    public final int method748(boolean arg0) {
        ++field5177;
        return arg0 ? -77 : this.field5173.field1031;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLqa;)V")
    public final void method746(byte arg0, class207 arg1) {
        ++field5175;
        if (arg0 <= -50) {
            this.field5173.method528(true, arg1);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILqa;)V")
    public final void method751(int arg0, class207 arg1) {
        this.field5173.method518(arg1, 8821);
        if (arg0 > 0) {
            field5187 = null;
        }
        ++field5167;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method488(class207 arg0, int arg1, int arg2, int arg3) {
        ++field5186;
        if (arg3 != 1) {
            field5187 = null;
        }
        class157 var5 = this.field5173.method526(super.field337, 131072, false, arg0, super.field341, 0, false);
        if (var5 == null) {
            return false;
        } else {
            class163 var6 = arg0.method1344();
            var6.method1054(super.field337 + super.field336, super.field345, super.field342 + super.field341);
            return var5.method143(arg1, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "(I)Ljava/lang/String;")
    public static final String method2261(int arg0) {
        ++field5178;
        String var1 = "www";
        if (class53.field988 == class494.field6920) {
            var1 = "www-wtrc";
        } else if (class592.field8492 == class53.field988) {
            var1 = "www-wtqa";
        } else if (class53.field988 == class224.field3214) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (arg0 <= 44) {
            return null;
        } else {
            if (class310.field4180 != null) {
                var2 = "/p=" + class310.field4180;
            }
            return "http://" + var1 + "." + class163.field2363.field1717 + ".com/l=" + class173.field2491 + "/a=" + class517.field7259 + var2 + "/";
        }
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)Z")
    public final boolean method747(int arg0) {
        ++field5179;
        if (arg0 != -23611) {
            field5182 = null;
        }
        return this.field5173.method527((byte) -110);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V")
    public final void method750(int arg0) {
        if (arg0 <= 88) {
            this.field5173 = null;
        }
        ++field5180;
    }

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "(I)I")
    public final int method259(int arg0) {
        if (arg0 <= 102) {
            method2261(-43);
        }
        ++field5170;
        return this.field5173.method523((byte) 101);
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(ZLqa;)Lvw;")
    public final class254 method483(boolean arg0, class207 arg1) {
        ++field5181;
        class157 var3 = this.field5173.method526(super.field337, 2048, arg0, arg1, super.field341, 0, false);
        if (var3 == null) {
            return null;
        } else {
            class163 var4 = arg1.method1344();
            var4.method1054(super.field337 + super.field336, super.field345, super.field342 + super.field341);
            class254 var5 = null;
            if (this.field5174) {
                var5 = class110.method772(1, 1);
            }
            if (this.field5173.field1034 != null) {
                class274 var6 = this.field5173.field1034.method2768();
                arg1.method1366(var3, var6, var4, var5 != null ? var5.field3525[0] : null, 0);
            } else {
                var3.method154(var4, var5 == null ? null : var5.field3525[0], 0);
            }
            if (this.field5172 == null) {
                this.field5172 = class563.method3213(super.field345, var3, super.field337, super.field341, true);
            } else {
                class510.method2947(var3, super.field341, 0, this.field5172, super.field337, super.field345);
            }
            int var7 = super.field337 >> 7;
            int var8 = super.field341 >> 7;
            this.field5173.method517(var7, var8, var3, arg1, var8, true, var7, (byte) -48);
            return var5;
        }
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lqa;Lss;IIIIIZIIIIII)V")
    public class386(class207 arg0, class364 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class547.method3121(-13, arg11, arg12));
        this.field5173 = new class58(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field5174 = ~arg1.field4881 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(Z)I")
    public final int method752(boolean arg0) {
        if (!arg0) {
            this.field5174 = false;
        }
        ++field5184;
        return this.field5173.field1016;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lqa;B)V")
    public final void method487(class207 arg0, byte arg1) {
        if (arg1 != 21) {
            field5185 = null;
        }
        ++field5171;
        class157 var3 = this.field5173.method526(super.field337, 262144, true, arg0, super.field341, 0, false);
        if (var3 != null) {
            int var4 = super.field337 >> 7;
            int var5 = super.field341 >> 7;
            this.field5173.method517(var4, var5, var3, arg0, var5, false, var4, (byte) -106);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLqa;I)Lr;")
    public final class157 method744(byte arg0, class207 arg1, int arg2) {
        int var4 = -22 / ((-54 - arg0) / 60);
        ++field5169;
        return this.field5173.method526(0, arg2, false, arg1, 0, 0, false);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(CI)I")
    public static final int method2262(char arg0, int arg1) {
        ++field5183;
        if (arg1 <= 56) {
            field5182 = null;
        }
        return arg0 >= 0 && arg0 < class517.field7256.length ? class517.field7256[arg0] : -1;
    }

    @OriginalMember(owner = "client!rca", name = "i", descriptor = "(I)V")
    public static void method2263(int arg0) {
        field5185 = null;
        field5182 = null;
        if (arg0 != -1) {
            method2261(-80);
        }
        field5187 = null;
    }

    static {
        new class104("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
    }
}
