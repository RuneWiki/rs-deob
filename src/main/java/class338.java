import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class338 extends class97 implements class425 {

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "Z")
    private boolean field4856;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "Z")
    private boolean field4869;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "B")
    private byte field4860;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "B")
    private byte field4867;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "B")
    private byte field4863;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "S")
    private short field4874;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "Z")
    private boolean field4864;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "Z")
    private boolean field4858;

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "Lri;")
    private class98 field4879;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "Ldc;")
    public class375 field4870;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Lii;I)Leb;", line = 7)
    public final class382 method117(class405 arg0, int arg1) {
        ++field4868;
        if (arg1 != -1) {
            return null;
        } else if (this.field4870 == null) {
            return null;
        } else {
            class177 var3 = arg0.method1735();
            var3.method985(super.field1366, super.field1364, super.field1362);
            class382 var4 = null;
            if (this.field4869) {
                var4 = class397.method2554(1, 0);
            }
            this.field4870.method1601(var3, var4 != null ? var4.field5543[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I[Lcq;)V", line = 34)
    public static final void method2215(int arg0, class67[] arg1) {
        ++field4854;
        class390.field5617 = arg1.length;
        class363.field5240 = new class67[class390.field5617 - -10];
        class223.field2948 = new int[class390.field5617 + 10];
        class60.method418(arg1, 0, class363.field5240, 0, class390.field5617);
        for (int var2 = 0; ~var2 > ~class390.field5617; ++var2) {
            class223.field2948[var2] = class363.field5240[var2].method409();
        }
        int var3 = 101 / ((-74 - arg0) / 45);
        for (int var4 = class390.field5617; ~class363.field5240.length < ~var4; ++var4) {
            class223.field2948[var4] = 12;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lii;I)V", line = 61)
    public final void method118(class405 arg0, int arg1) {
        ++field4865;
        if (arg1 == 22295) {
            Object var3 = null;
            class98 var5;
            if (this.field4879 == null && this.field4858) {
                class386 var4 = this.method2217(arg0, true, 131072, 12);
                var5 = var4 == null ? null : var4.field5595;
            } else {
                var5 = this.field4879;
                this.field4879 = null;
            }
            if (var5 != null) {
                class142.method903(var5, this.field4863, super.field1366, super.field1362, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIZLii;)Z", line = 89)
    public final boolean method119(int arg0, int arg1, boolean arg2, class405 arg3) {
        ++field4855;
        class375 var5 = this.method2218(65536, arg3, 0);
        if (var5 != null) {
            class177 var6 = arg3.method1735();
            var6.method985(super.field1366, super.field1364, super.field1362);
            return var5.method1594(arg0, arg1, var6, false);
        } else {
            return arg2 ? false : false;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLn;)V", line = 111)
    public static final void method2216(byte arg0, class25 arg1) {
        ++field4877;
        if (arg0 != 104) {
            field4873 = 75;
        }
        class365 var2 = (class365) class254.field3522.method384((long) arg1.field4301, true);
        if (var2 != null) {
            if (var2.field5275 != null) {
                class156.field2122.method2502(var2.field5275);
                var2.field5275 = null;
            }
            var2.method322(arg0 ^ 99);
        }
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)I", line = 140)
    public final int method105(int arg0) {
        ++field4871;
        return arg0 >= -4 ? -76 : this.field4860;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lii;ZII)Lcb;", line = 152)
    private final class386 method2217(class405 arg0, boolean arg1, int arg2, int arg3) {
        ++field4857;
        if (arg3 != 12) {
            this.field4874 = 74;
        }
        class104 var5 = class329.method2190((byte) 63, this.field4874 & 65535);
        class351 var6;
        class351 var7;
        if (this.field4864) {
            var6 = class265.field3846[0];
            var7 = class191.field2557[this.field4863];
        } else {
            if (~this.field4863 <= -4) {
                var6 = null;
            } else {
                var6 = class265.field3846[this.field4863 + 1];
            }
            var7 = class265.field3846[this.field4863];
        }
        return var5.method706(false, var6, super.field1362, arg1, super.field1366, arg2, this.field4860, this.field4867, var7, super.field1364, arg0);
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)Z", line = 182)
    public final boolean method114(int arg0) {
        if (arg0 != 30582) {
            this.field4879 = null;
        }
        ++field4878;
        return this.field4858;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILii;I)Ldc;", line = 200)
    public final class375 method111(int arg0, class405 arg1, int arg2) {
        ++field4880;
        return arg2 < 27 ? null : this.method2218(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)I", line = 211)
    public final int method121(int arg0) {
        if (arg0 != -15123) {
            method2215(108, (class67[]) null);
        }
        ++field4862;
        return this.field4874 & 65535;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLii;)V", line = 224)
    public final void method102(byte arg0, class405 arg1) {
        ++field4859;
        Object var3 = null;
        if (arg0 != 76) {
            this.method117((class405) null, -75);
        }
        class98 var5;
        if (this.field4879 == null && this.field4858) {
            class386 var4 = this.method2217(arg1, true, 131072, 12);
            var5 = var4 == null ? null : var4.field5595;
        } else {
            var5 = this.field4879;
            this.field4879 = null;
        }
        if (var5 != null) {
            class161.method995(var5, this.field4863, super.field1366, super.field1362, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V", line = 251)
    public final void method176(boolean arg0) {
        this.field4856 = arg0;
        ++field4872;
        if (this.field4870 != null) {
            this.field4870.method1593(this.field4870.method1608() & -32769);
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lii;Lge;IIIIZIIZ)V", line = 268)
    public class338(class405 arg0, class104 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class177.method1080(arg8, 114, arg7));
        this.field4856 = arg9;
        this.field4869 = ~arg1.field1455 != -1 && !arg6;
        this.field4860 = (byte) arg7;
        super.field1366 = (short) arg3;
        this.field4867 = (byte) arg8;
        this.field4863 = (byte) arg2;
        this.field4874 = (short) arg1.field1507;
        this.field4864 = arg6;
        super.field1362 = (short) arg5;
        this.field4858 = arg0.method1740() && arg1.field1464 && !this.field4864 && class423.field6238 != 0;
        int var11 = 1024;
        if (this.field4856) {
            var11 |= 32768;
        }
        class386 var12 = this.method2217(arg0, this.field4858, var11, 12);
        if (var12 != null) {
            this.field4879 = var12.field5595;
            this.field4870 = var12.field5592;
            if (this.field4856) {
                this.field4870 = this.field4870.method1568((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)I", line = 306)
    public final int method120(int arg0) {
        ++field4861;
        if (arg0 != 25940) {
            this.field4870 = null;
        }
        return this.field4867;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lii;IIIILnc;Z)V", line = 319)
    public final void method169(class405 arg0, int arg1, int arg2, int arg3, int arg4, class126 arg5, boolean arg6) {
        if (arg5 instanceof class338) {
            class338 var8 = (class338) arg5;
            if (this.field4870 != null && var8.field4870 != null) {
                this.field4870.method1599(var8.field4870, arg4, arg2, arg1, arg6);
            }
        } else if (arg5 instanceof class93) {
            class93 var9 = (class93) arg5;
            if (this.field4870 != null && var9.field1332 != null) {
                this.field4870.method1599(var9.field1332, arg4, arg2, arg1, arg6);
            }
        }
        if (arg3 > -106) {
            this.field4869 = false;
        }
        ++field4875;
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)Z", line = 350)
    public final boolean method166(int arg0) {
        if (arg0 != -17506) {
            this.field4856 = false;
        }
        ++field4881;
        return this.field4856;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILii;)V", line = 362)
    public final void method103(int arg0, class405 arg1) {
        ++field4883;
        if (arg0 <= 102) {
            this.field4863 = 65;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 374)
    public final void method112(byte arg0) {
        if (arg0 > -108) {
            this.method103(114, (class405) null);
        }
        ++field4866;
        if (this.field4870 != null) {
            this.field4870.method1598();
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(ILii;I)Ldc;", line = 389)
    private final class375 method2218(int arg0, class405 arg1, int arg2) {
        ++field4876;
        if (this.field4870 != null && arg1.method1643(this.field4870.method1608(), arg0) == 0) {
            return this.field4870;
        } else {
            if (arg2 != 0) {
                this.method117((class405) null, 13);
            }
            class386 var4 = this.method2217(arg1, false, arg0, arg2 + 12);
            return var4 != null ? var4.field5592 : null;
        }
    }
}
