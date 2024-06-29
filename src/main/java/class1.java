import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class1 {

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "Lqp;")
    private class396 field12 = new class396();

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "[I")
    public static int[] field11 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "Lnm;")
    public static class277 field1;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "Lqp;")
    private class396 field14;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 3)
    public final void method1(byte arg0) {
        field2++;
        while (true) {
            class396 var2 = this.field12.field5777;
            if (this.field12 == var2) {
                if (arg0 < 80) {
                    field1 = null;
                }
                this.field14 = null;
                return;
            }
            var2.method2519(-2107);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)Lqp;", line = 24)
    public final class396 method2(int arg0) {
        field5++;
        class396 var2 = this.field12.field5777;
        if (this.field12 == var2) {
            this.field14 = null;
            return null;
        }
        this.field14 = var2.field5777;
        if (arg0 != 15056) {
            this.method1((byte) -73);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)I", line = 51)
    public final int method3(int arg0) {
        if (arg0 != -28490) {
            return 88;
        }
        field3++;
        int var2 = 0;
        for (class396 var3 = this.field12.field5777; var3 != this.field12; var3 = var3.field5777) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V", line = 74)
    public static void method4(int arg0) {
        if (arg0 != 0) {
            method4(2);
        }
        field11 = null;
        field1 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)V", line = 92)
    public static final void method5(int arg0, int arg1) {
        field4++;
        class348 var2 = class385.method2464(10, 1302, arg1);
        if (arg0 == -12767) {
            var2.method2214((byte) 121);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILqp;)V", line = 106)
    public final void method6(int arg0, class396 arg1) {
        field7++;
        if (arg1.field5779 != null) {
            arg1.method2519(-2107);
        }
        arg1.field5777 = this.field12;
        arg1.field5779 = this.field12.field5779;
        arg1.field5779.field5777 = arg1;
        int var3 = 97 % ((20 - arg0) / 53);
        arg1.field5777.field5779 = arg1;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)V", line = 124)
    public static final void method7(boolean arg0) {
        field6++;
        for (int var1 = 0; var1 < class189.field2578; var1++) {
            int var2 = class204.field2798[var1];
            class133 var3 = class375.field5473[var2];
            int var4 = class249.field3379.method1342((byte) -126);
            if ((var4 & 0x8) != 0) {
                var4 += class249.field3379.method1342((byte) -126) << 8;
            }
            class140.method834(var2, var4, (byte) -106, var3);
        }
        if (!arg0) {
            field1 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lra;ZLra;)V", line = 158)
    public static final void method8(class57 arg0, boolean arg1, class57 arg2) {
        class266.field3731 = arg2;
        class377.field5525 = arg0;
        field13++;
        if (arg1) {
            class377.field5525.method352(36, (byte) -75);
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V", line = 226)
    public class1() {
        this.field12.field5779 = this.field12;
        this.field12.field5777 = this.field12;
    }

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "(I)Lqp;", line = 186)
    public final class396 method9(int arg0) {
        field8++;
        class396 var2 = this.field12.field5777;
        if (this.field12 == var2) {
            return null;
        }
        if (arg0 != -6596) {
            field9 = -14;
        }
        var2.method2519(-2107);
        return var2;
    }

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "(I)Lqp;", line = 204)
    public final class396 method10(int arg0) {
        field10++;
        class396 var2 = this.field14;
        if (this.field12 == var2) {
            this.field14 = null;
            return null;
        } else if (arg0 < 85) {
            return null;
        } else {
            this.field14 = var2.field5777;
            return var2;
        }
    }
}
