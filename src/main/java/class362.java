import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class362 {

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "Lff;")
    private class393 field4674 = new class393();

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "Loi;")
    public static class169 field4677 = new class169("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "Lff;")
    private class393 field4678;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "Lm;")
    public static class79 field4668;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBIZLdn;I)V", line = 4)
    public static final void method2121(int arg0, byte arg1, int arg2, boolean arg3, class201 arg4, int arg5) {
        class264.field3347 = arg5;
        class298.field3864 = arg2;
        class291.field3719 = 10000;
        class368.field4742 = arg3;
        if (arg1 < -46) {
            class181.field2362 = arg4;
            field4672++;
            class411.field5487 = arg0;
            class520.field7691 = 1;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)Lff;", line = 26)
    public final class393 method2122(int arg0) {
        field4681++;
        class393 var2 = this.field4674.field5140;
        if (arg0 != 0) {
            this.method2122(28);
        }
        if (this.field4674 == var2) {
            this.field4678 = null;
            return null;
        } else {
            this.field4678 = var2.field5140;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)Lff;", line = 46)
    public final class393 method2123(byte arg0) {
        field4673++;
        class393 var2 = this.field4674.field5139;
        if (this.field4674 == var2) {
            this.field4678 = null;
            return null;
        }
        if (arg0 != 10) {
            field4668 = null;
        }
        this.field4678 = var2.field5139;
        return var2;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lff;I)V", line = 68)
    public final void method2124(class393 arg0, int arg1) {
        if (arg0.field5139 != null) {
            arg0.method2336((byte) 88);
        }
        field4676++;
        arg0.field5139 = this.field4674.field5139;
        arg0.field5140 = this.field4674;
        int var3 = 51 / ((11 - arg1) / 40);
        arg0.field5139.field5140 = arg0;
        arg0.field5140.field5139 = arg0;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)V", line = 90)
    public static void method2125(boolean arg0) {
        field4668 = null;
        if (arg0) {
            field4677 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)Lff;", line = 104)
    public final class393 method2126(byte arg0) {
        field4675++;
        class393 var2 = this.field4674.field5140;
        if (arg0 >= -122) {
            method2131(62, null, (byte) 14);
        }
        if (this.field4674 == var2) {
            return null;
        } else {
            var2.method2336((byte) 109);
            return var2;
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)I", line = 121)
    public final int method2127(int arg0) {
        field4679++;
        int var2 = arg0;
        class393 var3 = this.field4674.field5140;
        while (this.field4674 != var3) {
            var3 = var3.field5140;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)V", line = 143)
    public final void method2128(byte arg0) {
        int var2 = -9 % ((-arg0 - 73) / 46);
        while (true) {
            class393 var3 = this.field4674.field5140;
            if (this.field4674 == var3) {
                field4671++;
                this.field4678 = null;
                return;
            }
            var3.method2336((byte) 92);
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V", line = 253)
    public class362() {
        this.field4674.field5140 = this.field4674;
        this.field4674.field5139 = this.field4674;
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)Lff;", line = 168)
    public final class393 method2129(int arg0) {
        field4667++;
        class393 var2 = this.field4678;
        int var3 = 14 / ((arg0 + 21) / 55);
        if (this.field4674 == var2) {
            this.field4678 = null;
            return null;
        } else {
            this.field4678 = var2.field5140;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "(B)Z", line = 189)
    public final boolean method2130(byte arg0) {
        if (arg0 == -76) {
            field4669++;
            return this.field4674.field5140 == this.field4674;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILas;B)V", line = 200)
    public static final void method2131(int arg0, class17 arg1, byte arg2) {
        if (class459.field6413) {
            arg0 = 0;
            class459.field6413 = false;
        }
        field4670++;
        if (arg2 != 73) {
            field4680 = -104;
        }
        if (class352.field4506 != null && class352.field4506.method108(arg1, true)) {
            return;
        }
        class352.field4506 = arg1;
        class432.field5958 = class173.method1134(true);
        class78.field999 = arg0;
        class254.field3209 = arg0;
        if (class254.field3209 != 0) {
            class243.field3126 = class63.field810;
            class333.field4263 = class286.field3660;
            class471.field6892 = class94.field1314;
            class93.field1301 = class248.field3169;
            class127.field1745 = class131.field1785;
            class356.field4574 = class475.field6948;
            class473.field6922 = class21.field406;
            class177.field2260 = class8.field86;
            class112.field1547 = class234.field3055;
            class228.field2936 = class166.field2153;
            return;
        }
        class118.method757((byte) 123);
    }
}
