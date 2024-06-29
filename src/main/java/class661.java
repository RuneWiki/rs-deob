import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class661 {

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "Lko;")
    public class337 field8613 = new class337();

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "I")
    public static int field8617 = 16777215;

    @OriginalMember(owner = "client!fca", name = "g", descriptor = "Luw;")
    public static class208 field8619 = new class208(15, 4);

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
    public static int field8614;

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "I")
    public static int field8615;

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!fca", name = "f", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!fca", name = "h", descriptor = "I")
    public static int field8620;

    @OriginalMember(owner = "client!fca", name = "i", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!fca", name = "j", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!fca", name = "k", descriptor = "I")
    public static int field8623;

    @OriginalMember(owner = "client!fca", name = "l", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!fca", name = "n", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!fca", name = "o", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!fca", name = "p", descriptor = "I")
    public static int field8628;

    @OriginalMember(owner = "client!fca", name = "q", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!fca", name = "r", descriptor = "I")
    public static int field8630;

    @OriginalMember(owner = "client!fca", name = "m", descriptor = "Lko;")
    private class337 field8625;

    @OriginalMember(owner = "client!fca", name = "s", descriptor = "[I")
    public static int[] field8631;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Lko;")
    public final class337 method3591(int arg0) {
        field8629++;
        if (arg0 != 0) {
            return null;
        }
        class337 var2 = this.field8613.field4111;
        if (this.field8613 == var2) {
            this.field8625 = null;
            return null;
        } else {
            this.field8625 = var2.field4111;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)V")
    public static final void method3592(int arg0) {
        field8626++;
        if (arg0 <= 120) {
            method3595(-108);
        }
        if (class343.field4206 == null) {
            return;
        }
        for (int var1 = 0; var1 < class343.field4206.length; var1++) {
            for (int var2 = 0; var2 < class343.field4206[var1].length; var2++) {
                class343.field4206[var1][var2] = class483.field6235;
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lko;I)V")
    public final void method3593(class337 arg0, int arg1) {
        field8624++;
        if (arg0.field4103 != null) {
            arg0.method1946(arg1 ^ 0xFFFFD78B);
        }
        arg0.field4103 = this.field8613.field4103;
        arg0.field4111 = this.field8613;
        if (arg1 != 15) {
            method3595(40);
        }
        arg0.field4103.field4111 = arg0;
        arg0.field4111.field4103 = arg0;
    }

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)V")
    public final void method3594(int arg0) {
        while (true) {
            class337 var2 = this.field8613.field4111;
            if (this.field8613 == var2) {
                int var3 = -5 % (arg0 / 47);
                field8614++;
                this.field8625 = null;
                return;
            }
            var2.method1946(-10364);
        }
    }

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "(I)V")
    public static void method3595(int arg0) {
        field8619 = null;
        field8631 = null;
        if (arg0 != -3030) {
            field8619 = null;
        }
    }

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "(I)Z")
    public final boolean method3596(int arg0) {
        field8615++;
        if (arg0 > -40) {
            return true;
        } else {
            return this.field8613.field4111 == this.field8613;
        }
    }

    @OriginalMember(owner = "client!fca", name = "f", descriptor = "(I)I")
    public final int method3597(int arg0) {
        field8620++;
        if (arg0 >= -61) {
            return -88;
        }
        int var2 = 0;
        class337 var3 = this.field8613.field4111;
        while (this.field8613 != var3) {
            var3 = var3.field4111;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lko;Z)V")
    public final void method3598(class337 arg0, boolean arg1) {
        if (arg0.field4103 != null) {
            arg0.method1946(-10364);
        }
        field8621++;
        arg0.field4103 = this.field8613;
        arg0.field4111 = this.field8613.field4111;
        if (arg1) {
            arg0.field4103.field4111 = arg0;
            arg0.field4111.field4103 = arg0;
        }
    }

    @OriginalMember(owner = "client!fca", name = "g", descriptor = "(I)Lko;")
    public final class337 method3599(int arg0) {
        field8616++;
        class337 var2 = this.field8613.field4111;
        if (this.field8613 == var2) {
            return null;
        } else if (arg0 >= -39) {
            return null;
        } else {
            var2.method1946(-10364);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)Lko;")
    public final class337 method3600(byte arg0) {
        field8628++;
        class337 var2 = this.field8625;
        if (this.field8613 == var2) {
            this.field8625 = null;
            return null;
        }
        if (arg0 < 31) {
            this.method3597(23);
        }
        this.field8625 = var2.field4111;
        return var2;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(BLfca;Lko;)V")
    private final void method3601(byte arg0, class661 arg1, class337 arg2) {
        field8618++;
        class337 var4 = this.field8613.field4103;
        this.field8613.field4103 = arg2.field4103;
        arg2.field4103.field4111 = this.field8613;
        if (this.field8613 != arg2) {
            arg2.field4103 = arg1.field8613.field4103;
            arg2.field4103.field4111 = arg2;
            var4.field4111 = arg1.field8613;
            arg1.field8613.field4103 = var4;
        }
        if (arg0 <= 95) {
            this.method3599(-22);
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZLfca;)V")
    public final void method3602(boolean arg0, class661 arg1) {
        field8623++;
        this.method3601((byte) 115, arg1, this.field8613.field4111);
        if (!arg0) {
            this.method3601((byte) -67, null, null);
        }
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(B)Lko;")
    public final class337 method3603(byte arg0) {
        if (arg0 != -107) {
            return null;
        }
        field8627++;
        class337 var2 = this.field8625;
        if (this.field8613 == var2) {
            this.field8625 = null;
            return null;
        } else {
            this.field8625 = var2.field4103;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "()V")
    public class661() {
        this.field8613.field4103 = this.field8613;
        this.field8613.field4111 = this.field8613;
    }

    @OriginalMember(owner = "client!fca", name = "h", descriptor = "(I)Lko;")
    public final class337 method3604(int arg0) {
        field8622++;
        if (arg0 > -21) {
            return null;
        }
        class337 var2 = this.field8613.field4103;
        if (this.field8613 == var2) {
            this.field8625 = null;
            return null;
        } else {
            this.field8625 = var2.field4103;
            return var2;
        }
    }
}
