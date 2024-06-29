import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class316 extends class361 implements class351 {

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "Ltd;")
    public class107 field4527;

    @OriginalMember(owner = "client!fm", name = "Z", descriptor = "Z")
    private boolean field4535;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "I")
    public static int field4522 = 0;

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!fm", name = "U", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!fm", name = "V", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!fm", name = "W", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!fm", name = "X", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!fm", name = "Y", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!fm", name = "ab", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!fm", name = "bb", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "Lqj;")
    public static class238 field4520;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "(I)V")
    public static void method1967(int arg0) {
        if (arg0 == 0) {
            field4520 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;I)V")
    public static final void method1968(String arg0, String arg1, int arg2, int arg3, String arg4, int arg5, String arg6, int arg7) {
        ++field4514;
        for (int var8 = 99; var8 > 0; --var8) {
            class363.field5309[var8] = class363.field5309[var8 - 1];
            class41.field647[var8] = class41.field647[var8 + -1];
            class179.field2357[var8] = class179.field2357[var8 - 1];
            class288.field4178[var8] = class288.field4178[var8 + -1];
            class446.field6489[var8] = class446.field6489[var8 - 1];
            class333.field4908[var8] = class333.field4908[var8 - 1];
            class132.field1775[var8] = class132.field1775[var8 + -1];
        }
        if (arg2 != -23645) {
            field4520 = null;
        }
        class363.field5309[0] = arg3;
        class41.field647[0] = arg5;
        class179.field2357[0] = arg0;
        class288.field4178[0] = arg1;
        class446.field6489[0] = arg4;
        class333.field4908[0] = arg6;
        class402.field5974 = class381.field5717;
        class132.field1775[0] = arg7;
        ++class278.field4089;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)I")
    public final int method150(byte arg0) {
        if (arg0 > -110) {
            field4520 = null;
        }
        ++field4518;
        return this.field4527.field1455;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)I")
    public final int method160(int arg0) {
        ++field4524;
        if (arg0 != -22056) {
            this.method154(-128, (class437) null);
        }
        return this.field4527.field1456;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILnr;II)Z")
    public final boolean method159(int arg0, class437 arg1, int arg2, int arg3) {
        if (arg3 <= 12) {
            method1971((int[][]) null, 104);
        }
        ++field4525;
        class95 var5 = this.field4527.method739(65536, arg1, super.field5284, super.field5298, false, false, 95);
        if (var5 == null) {
            return false;
        } else {
            class116 var6 = arg1.method2026();
            var6.method809(super.field5284, super.field5297, super.field5298);
            return var5.method619(arg2, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lnr;Lta;IIIIIIIZIIIII)V")
    public class316(class437 arg0, class404 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, ~arg1.field6049 == -2, class101.method688(17626, arg2, arg3));
        this.field4527 = new class107(arg0, arg1, arg2, arg3, super.field5291, arg5, arg6, arg8, arg9, arg14);
        this.field4535 = arg1.field6009 != 0 && !arg9;
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(B)I")
    public final int method148(byte arg0) {
        ++field4533;
        return arg0 != -68 ? -103 : this.field4527.field1458;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BILnr;)Lqc;")
    public final class95 method147(byte arg0, int arg1, class437 arg2) {
        ++field4528;
        int var4 = -8 % ((arg0 - -32) / 61);
        return this.field4527.method739(arg1, arg2, 0, 0, false, false, -45);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([BB)[B")
    public static final byte[] method1969(byte[] arg0, byte arg1) {
        ++field4515;
        class265 var2 = new class265(arg0);
        int var3 = var2.method1697(-62);
        int var4 = var2.method1666(-2);
        if (arg1 != -91) {
            method1968((String) null, (String) null, -91, -24, (String) null, -62, (String) null, 57);
        }
        if (~var4 <= -1 && (~class86.field1207 == -1 || ~class86.field1207 <= ~var4)) {
            if (~var3 == -1) {
                byte[] var7 = new byte[var4];
                var2.method1710(0, var4, (byte) -42, var7);
                return var7;
            } else {
                int var5 = var2.method1666(-2);
                if (var5 >= 0 && (class86.field1207 == 0 || ~var5 >= ~class86.field1207)) {
                    byte[] var6 = new byte[var5];
                    if (var3 == 1) {
                        class400.method2598(var6, var5, arg0, var4, 9);
                    } else {
                        class416.field6198.method2552(var2, var6, true);
                    }
                    return var6;
                } else {
                    throw new RuntimeException();
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(Lnr;Z)Lg;")
    public final class433 method145(class437 arg0, boolean arg1) {
        ++field4530;
        class95 var3 = this.field4527.method739(1024, arg0, super.field5284, super.field5298, true, false, -71);
        if (var3 == null) {
            return null;
        } else {
            class116 var4 = arg0.method2026();
            var4.method809(super.field5284, super.field5297, super.field5298);
            class433 var5 = null;
            if (this.field4535) {
                var5 = class436.method2758(1, 12300);
            }
            if (this.field4527.field1468 != null) {
                class125 var6 = this.field4527.field1468.method1783();
                arg0.method2162(var3, var6, var4, var5 != null ? var5.field6381[0] : null, 0);
            } else {
                var3.method602(var4, var5 != null ? var5.field6381[0] : null, 0);
            }
            this.field4527.method738(super.field5296, true, super.field5286, var3, arg0, super.field5288, arg1, super.field5293);
            return var5;
        }
    }

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "(I)V")
    public static final void method1970(int arg0) {
        class248.field3458 = new String[arg0];
        class358.field5249 = class231.field3262.field2146 + 2 + class231.field3262.field2152;
        class231.field3264 = class272.field3986.field2152 + class272.field3986.field2146 + 2;
        ++field4517;
        for (int var1 = 0; ~class248.field3458.length < ~var1; ++var1) {
            class248.field3458[var1] = "";
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([[II)V")
    public static final void method1971(int[][] arg0, int arg1) {
        class227.field3201 = arg0;
        if (arg1 > 14) {
            ++field4513;
        }
    }

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "(I)I")
    public final int method194(int arg0) {
        ++field4519;
        if (arg0 > -7) {
            this.field4527 = null;
        }
        return this.field4527.method748((byte) 95);
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(B)V")
    public final void method158(byte arg0) {
        if (arg0 != 6) {
            field4522 = -55;
        }
        ++field4523;
    }

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "(B)Z")
    public final boolean method151(byte arg0) {
        if (arg0 != -115) {
            return false;
        } else {
            ++field4537;
            return false;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lnr;I)V")
    public final void method161(class437 arg0, int arg1) {
        if (arg1 == 0) {
            ++field4531;
            class95 var3 = this.field4527.method739(131072, arg0, super.field5284, super.field5298, true, true, -50);
            if (var3 != null) {
                this.field4527.method738(super.field5296, false, super.field5286, var3, arg0, super.field5288, false, super.field5293);
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BLnr;IIZLcb;I)V")
    public final void method153(byte arg0, class437 arg1, int arg2, int arg3, boolean arg4, class387 arg5, int arg6) {
        ++field4529;
        if (arg0 > -116) {
            this.method160(100);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)V")
    public final void method163(int arg0) {
        if (arg0 != 0) {
            field4522 = 37;
        }
        ++field4532;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lnr;Z)V")
    public final void method156(class437 arg0, boolean arg1) {
        this.field4527.method742(arg0, 4);
        if (!arg1) {
            ++field4521;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILnr;)V")
    public final void method154(int arg0, class437 arg1) {
        if (arg0 == 25510) {
            ++field4526;
            this.field4527.method749(arg1, (byte) -5);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)Z")
    public final boolean method146(byte arg0) {
        ++field4534;
        return arg0 <= 102 ? true : this.field4527.method743(-1724944720);
    }
}
