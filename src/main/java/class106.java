import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class106 extends class344 implements class115 {

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "Lwc;")
    public class58 field1594;

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "Z")
    private boolean field1600;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!ut", name = "w", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!ut", name = "y", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!ut", name = "A", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ut", name = "B", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!ut", name = "x", descriptor = "Leo;")
    public static class246 field1602;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "Lnk;")
    private class611 field1588;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(I)Z")
    public final boolean method264(int arg0) {
        if (arg0 != 1) {
            this.method748(false);
        }
        ++field1603;
        return false;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BLqa;I)Lr;")
    public final class157 method744(byte arg0, class207 arg1, int arg2) {
        ++field1593;
        int var4 = 53 % ((arg0 - -54) / 60);
        return this.field1594.method526(0, arg2, false, arg1, 0, 0, false);
    }

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "(I)V")
    public static void method745(int arg0) {
        field1602 = null;
        if (arg0 != -25945) {
            field1602 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method488(class207 arg0, int arg1, int arg2, int arg3) {
        ++field1598;
        class157 var5 = this.field1594.method526(super.field4629, 131072, false, arg0, super.field4630, 0, false);
        if (var5 == null) {
            return false;
        } else {
            class163 var6 = arg0.method1344();
            var6.method1054(super.field4629, super.field4628, super.field4630);
            if (arg3 != 1) {
                this.method744((byte) -71, (class207) null, -47);
            }
            return var5.method143(arg1, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BLqa;)V")
    public final void method746(byte arg0, class207 arg1) {
        if (arg0 >= -50) {
            method745(47);
        }
        ++field1592;
        this.field1594.method528(true, arg1);
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lqa;Lss;IIIIIZIII)V")
    public class106(class207 arg0, class364 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class304.method1930(arg9, arg8, -128));
        this.field1594 = new class58(arg0, arg1, arg8, arg9, arg2, arg3, super.field4629, super.field4630, arg7, arg10);
        this.field1600 = arg1.field4881 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(ZLqa;)Lvw;")
    public final class254 method483(boolean arg0, class207 arg1) {
        ++field1607;
        class157 var3 = this.field1594.method526(super.field4629, 2048, arg0, arg1, super.field4630, 0, false);
        if (var3 == null) {
            return null;
        } else {
            class163 var4 = arg1.method1344();
            var4.method1054(super.field4629, super.field4628, super.field4630);
            class254 var5 = null;
            if (this.field1600) {
                var5 = class110.method772(1, 1);
            }
            if (this.field1594.field1034 == null) {
                var3.method154(var4, var5 != null ? var5.field3525[0] : null, 0);
            } else {
                class274 var6 = this.field1594.field1034.method2768();
                arg1.method1366(var3, var6, var4, var5 != null ? var5.field3525[0] : null, 0);
            }
            if (this.field1588 == null) {
                this.field1588 = class563.method3213(super.field4628, var3, super.field4629, super.field4630, true);
            } else {
                class510.method2947(var3, super.field4630, 0, this.field1588, super.field4629, super.field4628);
            }
            int var7 = super.field4629 >> 7;
            int var8 = super.field4630 >> 7;
            this.field1594.method517(var7, var8, var3, arg1, var8, true, var7, (byte) -116);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZLqa;)Lnk;")
    public final class611 method490(boolean arg0, class207 arg1) {
        ++field1591;
        if (arg0) {
            this.field1594 = null;
        }
        return this.field1588;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IZIILjt;ILqa;)V")
    public final void method258(int arg0, boolean arg1, int arg2, int arg3, class87 arg4, int arg5, class207 arg6) {
        ++field1597;
        if (arg2 <= 79) {
            this.method750(12);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)Z")
    public final boolean method747(int arg0) {
        ++field1604;
        if (arg0 != -23611) {
            this.field1600 = false;
        }
        return this.field1594.method527((byte) -90);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)I")
    public final int method748(boolean arg0) {
        if (arg0) {
            return -89;
        } else {
            ++field1596;
            return this.field1594.field1031;
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)I")
    public final int method749(int arg0) {
        if (arg0 != 24194) {
            this.field1600 = false;
        }
        ++field1605;
        return this.field1594.field1038;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
    public final void method750(int arg0) {
        if (arg0 < 88) {
            this.method262(-121);
        }
        ++field1601;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lqa;B)V")
    public final void method487(class207 arg0, byte arg1) {
        ++field1599;
        class157 var3 = this.field1594.method526(super.field4629, 262144, true, arg0, super.field4630, 0, true);
        if (arg1 != 21) {
            field1602 = null;
        }
        if (var3 != null) {
            int var4 = super.field4629 >> 7;
            int var5 = super.field4630 >> 7;
            this.field1594.method517(var4, var5, var3, arg0, var5, false, var4, (byte) -79);
        }
    }

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "(I)V")
    public final void method262(int arg0) {
        if (arg0 != 1) {
            this.field1594 = null;
        }
        ++field1595;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILqa;)V")
    public final void method751(int arg0, class207 arg1) {
        ++field1590;
        if (arg0 >= 0) {
            method745(-6);
        }
        this.field1594.method518(arg1, 8821);
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(Z)I")
    public final int method752(boolean arg0) {
        if (!arg0) {
            this.method744((byte) -119, (class207) null, -69);
        }
        ++field1589;
        return this.field1594.field1016;
    }

    static {
        new class104("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
    }
}
