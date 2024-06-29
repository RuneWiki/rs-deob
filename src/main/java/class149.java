import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class149 {

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Lng;")
    private class190 field2107 = new class190();

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "[I")
    public static int[] field2113 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "Lbf;")
    public static class316 field2115 = class412.method2585((byte) -113);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Lng;")
    private class190 field2116;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I", line = 4)
    public final int method1004(int arg0) {
        field2112++;
        int var2 = arg0;
        class190 var3 = this.field2107.field2614;
        while (this.field2107 != var3) {
            var3 = var3.field2614;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lng;", line = 30)
    public final class190 method1005(int arg0) {
        if (arg0 != -1) {
            this.field2116 = null;
        }
        field2110++;
        class190 var2 = this.field2107.field2614;
        if (this.field2107 == var2) {
            this.field2116 = null;
            return null;
        } else {
            this.field2116 = var2.field2614;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Z", line = 58)
    public final boolean method1006(int arg0) {
        field2114++;
        if (arg0 != 10) {
            field2117 = 7;
        }
        return this.field2107.field2614 == this.field2107;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 74)
    public static void method1007(byte arg0) {
        field2115 = null;
        if (arg0 == 39) {
            field2113 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)Lng;", line = 86)
    public final class190 method1008(int arg0) {
        if (arg0 != 7) {
            return null;
        }
        field2104++;
        class190 var2 = this.field2107.field2620;
        if (this.field2107 == var2) {
            this.field2116 = null;
            return null;
        } else {
            this.field2116 = var2.field2620;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lng;Z)V", line = 109)
    public final void method1009(class190 arg0, boolean arg1) {
        if (arg0.field2620 != null) {
            arg0.method1235((byte) -126);
        }
        field2108++;
        arg0.field2620 = this.field2107.field2620;
        if (arg1) {
            this.method1013((byte) -12);
        }
        arg0.field2614 = this.field2107;
        arg0.field2620.field2614 = arg0;
        arg0.field2614.field2620 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I", line = 127)
    public static final int method1010(int arg0, int arg1, int arg2) {
        field2111++;
        if (arg2 != 11) {
            field2113 = null;
        }
        int var3 = arg1 - 1 & arg0 >> 31;
        return (arg0 + (arg0 >>> 31)) % arg1 + var3;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V", line = 141)
    public final void method1011(byte arg0) {
        field2105++;
        int var2 = 14 / ((-arg0 - 25) / 43);
        while (true) {
            class190 var3 = this.field2107.field2614;
            if (this.field2107 == var3) {
                this.field2116 = null;
                return;
            }
            var3.method1235((byte) -124);
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V", line = 212)
    public class149() {
        this.field2107.field2620 = this.field2107;
        this.field2107.field2614 = this.field2107;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)Lng;", line = 168)
    public final class190 method1012(byte arg0) {
        int var2 = -112 / ((5 - arg0) / 32);
        field2106++;
        class190 var3 = this.field2116;
        if (this.field2107 == var3) {
            this.field2116 = null;
            return null;
        } else {
            this.field2116 = var3.field2614;
            return var3;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)Lng;", line = 189)
    public final class190 method1013(byte arg0) {
        field2109++;
        if (arg0 >= -24) {
            field2115 = null;
        }
        class190 var2 = this.field2107.field2614;
        if (this.field2107 == var2) {
            return null;
        } else {
            var2.method1235((byte) -127);
            return var2;
        }
    }
}
