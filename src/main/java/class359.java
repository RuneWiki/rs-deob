import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class359 extends class374 implements class457 {

    @OriginalMember(owner = "client!du", name = "Q", descriptor = "Z")
    private boolean field4636 = false;

    @OriginalMember(owner = "client!du", name = "bb", descriptor = "Ljfa;")
    public class292 field4647;

    @OriginalMember(owner = "client!du", name = "L", descriptor = "Z")
    private boolean field4631;

    @OriginalMember(owner = "client!du", name = "O", descriptor = "I")
    public static int field4634 = 0;

    @OriginalMember(owner = "client!du", name = "ib", descriptor = "Lkg;")
    public static class275 field4654 = new class275(42, 1);

    @OriginalMember(owner = "client!du", name = "jb", descriptor = "I")
    public static int field4655 = -1;

    @OriginalMember(owner = "client!du", name = "I", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!du", name = "K", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!du", name = "M", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!du", name = "N", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!du", name = "P", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!du", name = "R", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!du", name = "S", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!du", name = "U", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!du", name = "V", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!du", name = "W", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!du", name = "X", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!du", name = "Y", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!du", name = "Z", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!du", name = "ab", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!du", name = "cb", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!du", name = "db", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!du", name = "eb", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!du", name = "fb", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!du", name = "gb", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!du", name = "hb", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!du", name = "T", descriptor = "Lwg;")
    private class428 field4639;

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lha;Lac;IIIIIZIII)V")
    public class359(class60 arg0, class543 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class168.method1172(arg9, -5386, arg8));
        this.field4647 = new class292(arg0, arg1, arg8, arg9, super.field5796, arg3, this, arg7, arg10);
        this.field4631 = arg1.field7550 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(B)V")
    public final void method746(byte arg0) {
        ++field4643;
        if (arg0 < 82) {
            this.method83((byte) -53);
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)Z")
    public final boolean method756(int arg0) {
        ++field4640;
        if (arg0 > -52) {
            field4655 = 40;
        }
        return this.field4647.method1748(-27353);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)I")
    public final int method743(int arg0) {
        ++field4633;
        return arg0 != -30968 ? -113 : this.field4647.field3819;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IILrba;Lha;ZII)V")
    public final void method754(int arg0, int arg1, class435 arg2, class60 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 == 30558) {
            ++field4630;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)I")
    public final int method745(byte arg0) {
        ++field4650;
        int var2 = -11 % ((-33 - arg0) / 56);
        return this.field4647.field3824;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)I")
    public final int method758(boolean arg0) {
        ++field4648;
        if (!arg0) {
            this.method749((byte) 103);
        }
        return this.field4647.field3831;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lha;I)V")
    public final void method744(class60 arg0, int arg1) {
        if (arg1 == 0) {
            ++field4644;
            class474 var3 = this.field4647.method1752(true, arg0, true, 262144, true);
            if (var3 != null) {
                int var4 = super.field5801 >> 9;
                int var5 = super.field5797 >> 9;
                class631 var6 = arg0.method531();
                var6.method596(super.field5801, super.field5800, super.field5797);
                this.field4647.method1745(var5, var5, var6, false, var3, arg0, var4, var4, false);
            }
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(Lha;I)Ljk;")
    public final class635 method755(class60 arg0, int arg1) {
        ++field4632;
        class474 var3 = this.field4647.method1752(true, arg0, true, 2048, false);
        if (var3 == null) {
            return null;
        } else {
            class631 var4 = arg0.method531();
            var4.method596(super.field5801, super.field5800, super.field5797);
            int var5 = 57 % ((-39 - arg1) / 55);
            class635 var6 = class510.method2982(this.field4631, 0, 1);
            int var7 = super.field5801 >> 9;
            int var8 = super.field5797 >> 9;
            this.field4647.method1745(var8, var8, var4, true, var3, arg0, var7, var7, false);
            if (!class232.field3053) {
                var3.method250(var4, var6.field8760[0], 0);
            } else {
                var3.method255(var4, var6.field8760[0], class286.field3600, 0);
            }
            if (this.field4647.field3839 != null) {
                class741 var9 = this.field4647.field3839.method2969();
                if (class232.field3053) {
                    arg0.method545(var9, class286.field3600);
                } else {
                    arg0.method455(var9);
                }
            }
            this.field4636 = var3.method287() || this.field4647.field3839 != null;
            if (this.field4639 == null) {
                this.field4639 = class43.method309(super.field5800, var3, super.field5797, super.field5801, -113);
            } else {
                class654.method3675((byte) -118, this.field4639, var3, super.field5801, super.field5800, super.field5797);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!du", name = "f", descriptor = "(I)Z")
    public final boolean method759(int arg0) {
        if (arg0 != 0) {
            this.method759(107);
        }
        ++field4652;
        return false;
    }

    @OriginalMember(owner = "client!du", name = "f", descriptor = "(B)V")
    public final void method749(byte arg0) {
        if (arg0 >= -41) {
            this.field4636 = false;
        }
        ++field4646;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!du", name = "g", descriptor = "(B)Z")
    public final boolean method83(byte arg0) {
        ++field4651;
        return arg0 != -69;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I[BII)[B")
    public static final byte[] method2081(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field4638;
        byte[] var4 = new byte[arg3];
        class135.method999(arg1, arg2, var4, arg0, arg3);
        return var4;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BILha;I)Z")
    public final boolean method752(byte arg0, int arg1, class60 arg2, int arg3) {
        ++field4637;
        class474 var5 = this.field4647.method1752(false, arg2, true, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg0 >= -41) {
                this.method2083(false, (class456) null);
            }
            class631 var6 = arg2.method531();
            var6.method596(super.field5801, super.field5800, super.field5797);
            return class232.field3053 ? var5.method275(arg1, arg3, var6, false, 0, class286.field3600) : var5.method258(arg1, arg3, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!du", name = "d", descriptor = "(ILha;)Lwg;")
    public final class428 method750(int arg0, class60 arg1) {
        ++field4645;
        return arg0 >= -22 ? null : this.field4639;
    }

    @OriginalMember(owner = "client!du", name = "e", descriptor = "(I)Z")
    public final boolean method85(int arg0) {
        if (arg0 > -79) {
            return false;
        } else {
            ++field4629;
            return this.field4636;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ILha;)V")
    public final void method761(int arg0, class60 arg1) {
        ++field4649;
        this.field4647.method1747(arg1, 10625);
        int var3 = -103 / ((63 - arg0) / 51);
    }

    @OriginalMember(owner = "client!du", name = "h", descriptor = "(I)I")
    public final int method84(int arg0) {
        ++field4653;
        if (arg0 != 1027) {
            this.field4647 = null;
        }
        return this.field4647.method1744((byte) -20);
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(ILha;)V")
    public final void method760(int arg0, class60 arg1) {
        this.field4647.method1746(2, arg1);
        if (arg0 == -31507) {
            ++field4642;
        }
    }

    @OriginalMember(owner = "client!du", name = "d", descriptor = "(B)I")
    public final int method87(byte arg0) {
        if (arg0 != 121) {
            this.method83((byte) -117);
        }
        ++field4635;
        return this.field4647.method1750(3);
    }

    @OriginalMember(owner = "client!du", name = "i", descriptor = "(B)V")
    public static void method2082(byte arg0) {
        if (arg0 != -14) {
            field4655 = -42;
        }
        field4654 = null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ZLtd;)V")
    public final void method2083(boolean arg0, class456 arg1) {
        if (!arg0) {
            method2082((byte) -47);
        }
        this.field4647.method1749(-1, arg1);
        ++field4641;
    }
}
