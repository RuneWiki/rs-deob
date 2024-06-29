import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class344 extends class144 implements class57 {

    @OriginalMember(owner = "client!ns", name = "D", descriptor = "B")
    private byte field4912;

    @OriginalMember(owner = "client!ns", name = "B", descriptor = "Z")
    private boolean field4910;

    @OriginalMember(owner = "client!ns", name = "ab", descriptor = "Z")
    private boolean field4934;

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "S")
    private short field4908;

    @OriginalMember(owner = "client!ns", name = "A", descriptor = "Z")
    private boolean field4909;

    @OriginalMember(owner = "client!ns", name = "G", descriptor = "B")
    private byte field4915;

    @OriginalMember(owner = "client!ns", name = "R", descriptor = "B")
    private byte field4926;

    @OriginalMember(owner = "client!ns", name = "P", descriptor = "Z")
    private boolean field4924;

    @OriginalMember(owner = "client!ns", name = "N", descriptor = "Lw;")
    private class252 field4922;

    @OriginalMember(owner = "client!ns", name = "bb", descriptor = "Lba;")
    public class327 field4935;

    @OriginalMember(owner = "client!ns", name = "O", descriptor = "I")
    public static int field4923 = 0;

    @OriginalMember(owner = "client!ns", name = "F", descriptor = "I")
    public static int field4914 = 0;

    @OriginalMember(owner = "client!ns", name = "Q", descriptor = "Lea;")
    public static class474 field4925 = new class474("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!ns", name = "C", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!ns", name = "E", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!ns", name = "H", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!ns", name = "I", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!ns", name = "J", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!ns", name = "K", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!ns", name = "L", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!ns", name = "M", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!ns", name = "S", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!ns", name = "U", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!ns", name = "V", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!ns", name = "W", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!ns", name = "X", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!ns", name = "Y", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!ns", name = "Z", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!ns", name = "cb", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!ns", name = "db", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!ns", name = "eb", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!ns", name = "fb", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!ns", name = "hb", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!ns", name = "gb", descriptor = "Lew;")
    private class425 field4940;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(Loa;I)Lew;")
    public final class425 method100(class605 arg0, int arg1) {
        if (this.field4940 == null) {
            this.field4940 = class645.method3676(super.field1768, super.field1769, (byte) -64, super.field1764, this.method2210(0, (byte) -67, arg0));
        }
        ++field4933;
        if (arg1 != 28286) {
            field4914 = 103;
        }
        return this.field4940;
    }

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)I")
    public final int method92(int arg0) {
        ++field4938;
        if (arg0 != 9812) {
            field4914 = 85;
        }
        return this.field4915;
    }

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "(B)I")
    public final int method413(byte arg0) {
        ++field4916;
        if (arg0 != 58) {
            this.method102((byte) 36, (class605) null);
        }
        return this.field4935 != null ? this.field4935.method1379() : 0;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Loa;I)V")
    public final void method90(class605 arg0, int arg1) {
        ++field4920;
        if (arg1 != -5) {
            this.method2210(3, (byte) 46, (class605) null);
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)I")
    public final int method89(int arg0) {
        int var2 = -60 % ((arg0 - 11) / 51);
        ++field4927;
        return this.field4908 & 65535;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLoa;)V")
    public final void method102(byte arg0, class605 arg1) {
        ++field4913;
        Object var3 = null;
        class252 var5;
        if (this.field4922 == null && this.field4924) {
            class651 var4 = this.method2214(262144, -65537, arg1, true);
            var5 = var4 != null ? var4.field9386 : null;
        } else {
            var5 = this.field4922;
            this.field4922 = null;
        }
        if (arg0 <= -54) {
            if (var5 != null) {
                class240.method1600(var5, this.field4912, super.field1764, super.field1768, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method91(int arg0, int arg1, class605 arg2, int arg3) {
        if (arg0 != -10503) {
            return true;
        } else {
            ++field4930;
            class327 var5 = this.method2210(131072, (byte) -127, arg2);
            if (var5 != null) {
                class364 var6 = arg2.method342();
                var6.method2014(super.field1764, super.field1769, super.field1768);
                return var5.method1381(arg1, arg3, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBLoa;)Lba;")
    private final class327 method2210(int arg0, byte arg1, class605 arg2) {
        ++field4918;
        if (this.field4935 != null && ~arg2.method293(this.field4935.method1375(), arg0) == -1) {
            return this.field4935;
        } else {
            if (arg1 >= -64) {
                field4914 = -32;
            }
            class651 var4 = this.method2214(arg0, -65537, arg2, false);
            return var4 == null ? null : var4.field9389;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Z")
    public final boolean method93(int arg0) {
        if (arg0 != -23445) {
            return false;
        } else {
            ++field4937;
            return this.field4924;
        }
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)I")
    public final int method95(int arg0) {
        ++field4941;
        int var2 = 81 / ((14 - arg0) / 33);
        return this.field4926;
    }

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "(B)V")
    public static void method2211(byte arg0) {
        if (arg0 >= 108) {
            field4925 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIILva;Loa;ZI)V")
    public final void method86(int arg0, int arg1, int arg2, class429 arg3, class605 arg4, boolean arg5, int arg6) {
        if (arg0 == 7) {
            ++field4911;
            if (arg3 instanceof class15) {
                class15 var8 = (class15) arg3;
                if (this.field4935 != null && var8.field125 != null) {
                    this.field4935.method1361(var8.field125, arg1, arg6, arg2, arg5);
                }
            } else {
                if (arg3 instanceof class344) {
                    class344 var9 = (class344) arg3;
                    if (this.field4935 != null && var9.field4935 != null) {
                        this.field4935.method1361(var9.field4935, arg1, arg6, arg2, arg5);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V")
    public final void method96(byte arg0) {
        ++field4932;
        if (arg0 != -76) {
            this.field4922 = null;
        }
        this.field4934 = false;
        if (this.field4935 != null) {
            this.field4935.method1376(this.field4935.method1375() & -65537);
        }
    }

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)Z")
    public final boolean method84(int arg0) {
        if (arg0 != 1630) {
            return true;
        } else {
            ++field4921;
            return this.field4934;
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Loa;Lqd;IIIIIZIIIIIIZ)V")
    public class344(class605 arg0, class385 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field5800 == -2, class337.method2177(arg13, 10299, arg12));
        this.field4912 = (byte) arg3;
        this.field4910 = arg7;
        this.field4934 = arg14;
        this.field4908 = (short) arg1.field5810;
        this.field4909 = arg1.field5806 != 0 && !arg7;
        this.field4915 = (byte) arg13;
        this.field4926 = (byte) arg12;
        this.field4924 = arg0.method325() && arg1.field5855 && !this.field4910 && class595.field8694.method2735((byte) -128, class81.field908) != 0;
        int var16 = 2048;
        if (this.field4934) {
            var16 |= 65536;
        }
        class651 var17 = this.method2214(var16, -65537, arg0, this.field4924);
        if (var17 != null) {
            this.field4922 = var17.field9386;
            this.field4935 = var17.field9389;
            if (this.field4934) {
                this.field4935 = this.field4935.method1382((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILoa;)V")
    public final void method98(int arg0, class605 arg1) {
        ++field4917;
        if (arg0 != 16343) {
            method2212(-49, (String) null);
        }
        Object var3 = null;
        class252 var5;
        if (this.field4922 == null && this.field4924) {
            class651 var4 = this.method2214(262144, -65537, arg1, true);
            var5 = var4 == null ? null : var4.field9386;
        } else {
            var5 = this.field4922;
            this.field4922 = null;
        }
        if (var5 != null) {
            class172.method990(var5, this.field4912, super.field1764, super.field1768, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2212(int arg0, String arg1) {
        System.exit(1);
        if (arg0 != 3382) {
            method2211((byte) -41);
        }
        ++field4939;
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)V")
    public final void method87(int arg0) {
        ++field4931;
        if (this.field4935 != null) {
            this.field4935.method1372();
        }
        if (arg0 != 7511) {
            this.method92(-112);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZLoa;)Lba;")
    public final class327 method94(int arg0, boolean arg1, class605 arg2) {
        if (arg1) {
            this.method2213(true);
        }
        ++field4936;
        return this.method2210(arg0, (byte) -109, arg2);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)I")
    public final int method2213(boolean arg0) {
        if (arg0) {
            this.field4908 = -11;
        }
        ++field4919;
        return this.field4935 != null ? this.field4935.method1360() / 4 : 15;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Loa;B)Laca;")
    public final class630 method88(class605 arg0, byte arg1) {
        ++field4929;
        if (this.field4935 == null) {
            return null;
        } else {
            class364 var3 = arg0.method342();
            var3.method2014(super.field1764, super.field1769, super.field1768);
            if (arg1 >= -127) {
                return null;
            } else {
                class630 var4 = null;
                if (this.field4909) {
                    var4 = class471.method2882(-127, 1);
                }
                this.field4935.method1380(var3, var4 != null ? var4.field9084[0] : null, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILoa;Z)Llo;")
    private final class651 method2214(int arg0, int arg1, class605 arg2, boolean arg3) {
        ++field4928;
        if (arg1 != -65537) {
            this.field4935 = null;
        }
        class385 var5 = class575.field8301.method1499(-7532, this.field4908 & 65535);
        class132 var6;
        class132 var7;
        if (this.field4910) {
            var6 = class544.field7780[0];
            var7 = class492.field7164[this.field4912];
        } else {
            var7 = class544.field7780[this.field4912];
            if (this.field4912 < 3) {
                var6 = class544.field7780[this.field4912 + 1];
            } else {
                var6 = null;
            }
        }
        return var5.method2459(super.field1764, arg0, this.field4926 == 11 ? 4 - -this.field4915 : this.field4915, arg2, super.field1769, arg3, ~this.field4926 != -12 ? this.field4926 : 10, var6, arg1 + 65503, super.field1768, var7);
    }
}
