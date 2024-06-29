import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class111 extends class325 implements class210 {

    @OriginalMember(owner = "client!tn", name = "D", descriptor = "Lgk;")
    public class374 field1553;

    @OriginalMember(owner = "client!tn", name = "x", descriptor = "Z")
    private boolean field1547;

    @OriginalMember(owner = "client!tn", name = "O", descriptor = "Lrc;")
    public static class108 field1564 = new class108(70, 8);

    @OriginalMember(owner = "client!tn", name = "S", descriptor = "I")
    public static int field1568 = 1405;

    @OriginalMember(owner = "client!tn", name = "R", descriptor = "Lap;")
    public static class310 field1567 = new class310(29, 3);

    @OriginalMember(owner = "client!tn", name = "T", descriptor = "I")
    public static int field1569 = -1;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!tn", name = "y", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!tn", name = "A", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!tn", name = "B", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!tn", name = "C", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!tn", name = "G", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!tn", name = "H", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!tn", name = "I", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!tn", name = "J", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!tn", name = "K", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!tn", name = "L", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!tn", name = "M", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!tn", name = "N", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!tn", name = "P", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!tn", name = "Q", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "Ljava/awt/Image;")
    public static Image field1549;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)I")
    public final int method83(byte arg0) {
        ++field1565;
        if (arg0 < 70) {
            field1568 = -77;
        }
        return this.field1553.field5172;
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)Z")
    public final boolean method68(int arg0) {
        int var2 = -93 % ((2 - arg0) / 57);
        ++field1562;
        return false;
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(B)Z")
    public final boolean method82(byte arg0) {
        if (arg0 <= 89) {
            return true;
        } else {
            ++field1555;
            return this.field1553.method2279((byte) -97);
        }
    }

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(B)V")
    public final void method75(byte arg0) {
        if (arg0 != 111) {
            field1549 = null;
        }
        ++field1558;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZILvc;IILuq;I)V")
    public final void method70(boolean arg0, int arg1, class89 arg2, int arg3, int arg4, class316 arg5, int arg6) {
        ++field1563;
        if (arg1 <= 40) {
            field1568 = -74;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(ZLvc;)V")
    public final void method86(boolean arg0, class89 arg1) {
        if (arg0) {
            this.method69((class89) null, 73);
        }
        ++field1550;
        class468 var3 = this.field1553.method2288(-1, arg1, true, 131072, super.field4530, super.field4537, true);
        if (var3 != null) {
            this.field1553.method2283(arg1, super.field4539, super.field4526, super.field4535, super.field4534, false, var3, (byte) -115);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)I")
    public final int method71(byte arg0) {
        ++field1560;
        if (arg0 < 81) {
            this.field1553 = null;
        }
        return this.field1553.field5171;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILvc;II)Z")
    public final boolean method77(int arg0, class89 arg1, int arg2, int arg3) {
        ++field1566;
        if (arg0 != 0) {
            method884(13);
        }
        class468 var5 = this.field1553.method2288(-1, arg1, false, 65536, super.field4530, super.field4537, false);
        if (var5 == null) {
            return false;
        } else {
            class257 var6 = arg1.method306();
            var6.method96(super.field4537, super.field4532, super.field4530);
            return var5.method1593(arg2, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lfo;I)V")
    public static final void method881(class418 arg0, int arg1) {
        ++field1557;
        int var2 = arg0.field5750 - class364.field5010;
        int var3 = arg0.field5777 * 128 + 64 * arg0.method245(4452);
        int var4 = arg0.field5782 * arg1 + 64 * arg0.method245(arg1 + 4324);
        arg0.field4537 += (-arg0.field4537 + var3) / var2;
        arg0.field4530 += (-arg0.field4530 + var4) / var2;
        arg0.field5805 = 0;
        if (arg0.field5769 == 0) {
            arg0.method2507(8192, false);
        }
        if (arg0.field5769 == 1) {
            arg0.method2507(12288, false);
        }
        if (arg0.field5769 == 2) {
            arg0.method2507(0, false);
        }
        if (arg0.field5769 == 3) {
            arg0.method2507(4096, false);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIII)V")
    public static final void method882(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1559;
        if (arg3 == arg5) {
            class467.method2783(arg0, arg3, arg2, arg4, (byte) -58);
        } else {
            if (class295.field4153 <= -arg3 + arg0 && arg0 - -arg3 <= class103.field1457 && ~class444.field6338 >= ~(-arg5 + arg2) && class151.field2091 >= arg2 - -arg5) {
                class274.method1853(true, arg0, arg4, arg2, arg5, arg3);
            } else {
                class484.method2852(arg3, arg5, arg4, (byte) 29, arg2, arg0);
            }
            if (arg1 != 0) {
                method883(95, (byte) -71, 97);
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BILvc;)Ln;")
    public final class468 method76(byte arg0, int arg1, class89 arg2) {
        if (arg0 != -106) {
            field1567 = null;
        }
        ++field1552;
        return this.field1553.method2288(arg0 + 105, arg2, false, arg1, 0, 0, false);
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lvc;Lnm;IIIIIZIIIIIII)V")
    public class111(class89 arg0, class267 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field3853 == 1, class398.method2396(arg12, -128, arg13));
        this.field1553 = new class374(arg0, arg1, arg12, arg13, super.field4531, arg3, arg4, arg6, arg7, arg14);
        this.field1547 = ~arg1.field3902 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lvc;I)Lep;")
    public final class309 method69(class89 arg0, int arg1) {
        ++field1561;
        class468 var3 = this.field1553.method2288(-1, arg0, true, 1024, super.field4530, super.field4537, false);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != 10228) {
                this.method251((byte) -90);
            }
            class257 var4 = arg0.method306();
            var4.method96(super.field4537, super.field4532, super.field4530);
            class309 var5 = null;
            if (this.field1547) {
                var5 = class163.method1205((byte) 40, 1);
            }
            if (this.field1553.field5163 != null) {
                class404 var6 = this.field1553.field5163.method896();
                arg0.method384(var3, var6, var4, var5 == null ? null : var5.field4383[0], 0);
            } else {
                var3.method1592(var4, var5 == null ? null : var5.field4383[0], 0);
            }
            this.field1553.method2283(arg0, super.field4539, super.field4526, super.field4535, super.field4534, true, var3, (byte) -127);
            return var5;
        }
    }

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "(B)I")
    public final int method251(byte arg0) {
        ++field1551;
        if (arg0 != 5) {
            field1568 = 74;
        }
        return this.field1553.method2282(arg0 + -106);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IBI)V")
    public static final void method883(int arg0, byte arg1, int arg2) {
        ++field1554;
        if (arg1 <= -44) {
            class155 var3 = new class155(16);
            for (class223 var4 = (class223) class427.field5956.method1097(64); var4 != null; var4 = (class223) class427.field5956.method1105(false)) {
                var4.method2714(126);
                int var5 = (int) (var4.field6382 >> 28);
                int var6 = -arg0 + (int) (16383L & var4.field6382 >> 14);
                int var7 = (int) (var4.field6382 & 16383L) + -arg2;
                if (var7 >= 0 && var6 >= 0 && ~class36.field388 < ~var7 && ~class68.field998 < ~var6) {
                    var3.method1100(var4, -116, (long) (var7 | var6 << 14 | var5 << 28));
                }
            }
            class427.field5956 = var3;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZLvc;)V")
    public final void method78(boolean arg0, class89 arg1) {
        if (!arg0) {
            field1549 = null;
        }
        ++field1545;
        this.field1553.method2278(arg1, 4);
    }

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "(I)V")
    public static void method884(int arg0) {
        field1567 = null;
        if (arg0 != 1) {
            method881((class418) null, -127);
        }
        field1564 = null;
        field1549 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)I")
    public final int method80(int arg0) {
        if (arg0 != 10143) {
            this.field1547 = false;
        }
        ++field1546;
        return this.field1553.field5156;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lvc;B)V")
    public final void method85(class89 arg0, byte arg1) {
        if (arg1 != -24) {
            this.field1547 = false;
        }
        ++field1556;
        this.field1553.method2281(arg0, 131072);
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V")
    public final void method84(int arg0) {
        ++field1548;
        if (arg0 != 16805) {
            this.method80(-7);
        }
    }
}
