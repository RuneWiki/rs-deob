import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class235 {

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Lni;")
    public class60 field3535 = new class60();

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Lth;")
    public static class57 field3533 = new class57(100);

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Lqf;")
    public static class359 field3536;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "Lni;")
    private class60 field3537;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)Lni;", line = 7)
    public final class60 method1749(boolean arg0) {
        class60 var2 = this.field3537;
        field3534++;
        if (this.field3535 == var2) {
            this.field3537 = null;
            return null;
        } else {
            this.field3537 = var2.field877;
            return arg0 ? (class60) null : var2;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBLph;)Lin;", line = 29)
    public static final class177 method1750(int arg0, byte arg1, class361 arg2) {
        field3532++;
        if (class329.method2282(arg1 ^ 0x2C, arg0, arg2)) {
            if (arg1 != 37) {
                field3536 = (class359) null;
            }
            return class110.method845((byte) -93);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 47)
    public final void method1751(byte arg0) {
        while (true) {
            class60 var2 = this.field3535.field877;
            if (this.field3535 == var2) {
                field3529++;
                if (arg0 != -75) {
                    this.field3537 = (class60) null;
                }
                this.field3537 = null;
                return;
            }
            var2.method477(arg0 - 11261);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILni;)V", line = 69)
    public final void method1752(int arg0, class60 arg1) {
        if (arg1.field873 != null) {
            arg1.method477(-11336);
        }
        if (arg0 != 100) {
            this.method1749(true);
        }
        arg1.field877 = this.field3535;
        field3531++;
        arg1.field873 = this.field3535.field873;
        arg1.field873.field877 = arg1;
        arg1.field877.field873 = arg1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)Lge;", line = 91)
    public static final class11 method1753(int arg0, int arg1, int arg2) {
        class167 var3 = class302.field4502[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2387;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)Lni;", line = 115)
    public final class60 method1754(int arg0) {
        field3530++;
        class60 var2 = this.field3535.field877;
        if (arg0 != 9858) {
            field3533 = (class57) null;
        }
        if (this.field3535 == var2) {
            this.field3537 = null;
            return null;
        } else {
            this.field3537 = var2.field877;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 138)
    public static void method1755(int arg0) {
        field3533 = null;
        field3536 = null;
        if (arg0 > -51) {
            field3536 = (class359) null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V", line = 152)
    public class235() {
        this.field3535.field873 = this.field3535;
        this.field3535.field877 = this.field3535;
    }
}
