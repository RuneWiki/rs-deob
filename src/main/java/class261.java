import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class261 extends class194 {

    @OriginalMember(owner = "client!df", name = "z", descriptor = "Loj;")
    public class246 field4204 = new class246();

    @OriginalMember(owner = "client!df", name = "E", descriptor = "Lt;")
    public class235 field4208 = new class235();

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Lam;")
    private class314 field4195;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field4196 = 0;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "[B")
    public static byte[] field4199;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "[I")
    public static int[] field4202;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLsb;I)V")
    private final void method1754(boolean arg0, class132 arg1, int arg2) {
        if ((this.field4195.field5019[arg1.field2091] & 0x4) != 0 && arg1.field2089 < 0) {
            int var4 = this.field4195.field5048[arg1.field2091] / class133.field2103;
            int var5 = (var4 + 1048575 - arg1.field2100) / var4;
            arg1.field2100 = arg1.field2100 + (arg2 * var4) & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field4195.field5060[arg1.field2091] == 0) {
                    arg1.field2084 = class102.method710(arg1.field2077, arg1.field2084.method727(), arg1.field2084.method703(), arg1.field2084.method697());
                } else {
                    arg1.field2084 = class102.method710(arg1.field2077, arg1.field2084.method727(), 0, arg1.field2084.method697());
                    this.field4195.method2105((byte) 39, arg1, arg1.field2072.field4286[arg1.field2098] < 0);
                }
                if (arg1.field2072.field4286[arg1.field2098] < 0) {
                    arg1.field2084.method702(-1);
                }
                arg2 = arg1.field2100 / var4;
            }
        }
        arg1.field2084.method723(arg2);
        field4201++;
        if (!arg0) {
            this.method1757((int[]) null, 52, -2, 95, (class132) null, 9);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ldk;Z)V")
    public static final void method1755(class251 arg0, boolean arg1) {
        field4206++;
        if (!arg1) {
            method1756((byte) 41);
        }
        class10.field104 = arg0;
        class156.field2442 = class10.field104.method1678((byte) 100, 4);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([III)V")
    public final void method734(int[] arg0, int arg1, int arg2) {
        field4205++;
        this.field4208.method734(arg0, arg1, arg2);
        for (class132 var4 = (class132) this.field4204.method1643((byte) -77); var4 != null; var4 = (class132) this.field4204.method1642((byte) 29)) {
            if (!this.field4195.method2107(false, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field2076 >= var5) {
                        this.method1757(arg0, 0, var6, var5 + var6, var4, var5);
                        var4.field2076 -= var5;
                        break;
                    }
                    this.method1757(arg0, 0, var6, var5 + var6, var4, var4.field2076);
                    var6 += var4.field2076;
                    var5 -= var4.field2076;
                } while (!this.field4195.method2100(arg0, var5, var4, -124, var6));
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()I")
    public final int method729() {
        field4207++;
        return 0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static void method1756(byte arg0) {
        field4199 = null;
        if (arg0 != -72) {
            method1755((class251) null, true);
        }
        field4202 = null;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()Lpd;")
    public final class194 method728() {
        field4209++;
        class132 var1 = (class132) this.field4204.method1643((byte) 105);
        if (var1 == null) {
            return null;
        } else if (var1.field2084 == null) {
            return this.method714();
        } else {
            return var1.field2084;
        }
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
    public final void method723(int arg0) {
        field4197++;
        this.field4208.method723(arg0);
        for (class132 var2 = (class132) this.field4204.method1643((byte) -81); var2 != null; var2 = (class132) this.field4204.method1642((byte) 107)) {
            if (!this.field4195.method2107(false, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2076) {
                        this.method1754(true, var2, var3);
                        var2.field2076 -= var3;
                        break;
                    }
                    this.method1754(true, var2, var2.field2076);
                    var3 -= var2.field2076;
                } while (!this.field4195.method2100((int[]) null, var3, var2, -31, 0));
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([IIIILsb;I)V")
    private final void method1757(int[] arg0, int arg1, int arg2, int arg3, class132 arg4, int arg5) {
        if ((this.field4195.field5019[arg4.field2091] & 0x4) != arg1 && arg4.field2089 < 0) {
            int var7 = this.field4195.field5048[arg4.field2091] / class133.field2103;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field2100) / var7;
                if (var8 > arg5) {
                    arg4.field2100 += arg5 * var7;
                    break;
                }
                arg4.field2084.method734(arg0, arg2, var8);
                arg4.field2100 += var7 * var8 - 1048576;
                int var9 = 262144 / var7;
                int var10 = class133.field2103 / 100;
                if (var9 < var10) {
                    var10 = var9;
                }
                arg2 += var8;
                class102 var11 = arg4.field2084;
                if (this.field4195.field5060[arg4.field2091] == 0) {
                    arg4.field2084 = class102.method710(arg4.field2077, var11.method727(), var11.method703(), var11.method697());
                } else {
                    arg4.field2084 = class102.method710(arg4.field2077, var11.method727(), 0, var11.method697());
                    this.field4195.method2105((byte) 39, arg4, arg4.field2072.field4286[arg4.field2098] < 0);
                    arg4.field2084.method717(var10, var11.method703());
                }
                arg5 -= var8;
                if (arg4.field2072.field4286[arg4.field2098] < 0) {
                    arg4.field2084.method702(-1);
                }
                var11.method737(var10);
                var11.method734(arg0, arg2, arg3 - arg2);
                if (var11.method739()) {
                    this.field4208.method1596(var11);
                }
            }
        }
        field4203++;
        arg4.field2084.method734(arg0, arg2, arg5);
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "()Lpd;")
    public final class194 method714() {
        field4198++;
        class132 var1;
        do {
            var1 = (class132) this.field4204.method1642((byte) 73);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2084 == null);
        return var1.field2084;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lam;)V")
    public class261(class314 arg0) {
        this.field4195 = arg0;
    }
}
