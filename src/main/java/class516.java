import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class516 {

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "Lwc;")
    private class270 field7635 = new class270();

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "Lui;")
    public static class378 field7636 = new class378("WTI", 5);

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "Leo;")
    public static class484 field7640 = null;

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "Lbs;")
    public static class111 field7641 = new class111(2);

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "Lwc;")
    private class270 field7639;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "Lqs;")
    public static class496 field7627;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "Lqs;")
    public static class496 field7637;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILya;)V", line = 3)
    public static final void method3047(int arg0, class220 arg1) {
        class360.field5592[arg0] = arg1;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)I", line = 7)
    public final int method3048(int arg0) {
        field7629++;
        int var2 = 0;
        if (arg0 >= -32) {
            field7636 = null;
        }
        for (class270 var3 = this.field7635.field4493; var3 != this.field7635; var3 = var3.field4493) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V", line = 28)
    public final void method3049(int arg0) {
        if (arg0 != 2) {
            method3051(null, 45);
        }
        while (true) {
            class270 var2 = this.field7635.field4493;
            if (this.field7635 == var2) {
                field7634++;
                this.field7639 = null;
                return;
            }
            var2.method1799((byte) -126);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lwc;I)V", line = 63)
    public final void method3050(class270 arg0, int arg1) {
        if (arg0.field4489 != null) {
            arg0.method1799((byte) 87);
        }
        field7633++;
        arg0.field4493 = this.field7635;
        arg0.field4489 = this.field7635.field4489;
        arg0.field4489.field4493 = arg0;
        arg0.field4493.field4489 = arg0;
        if (arg1 != 2) {
            this.method3053(-72);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 84)
    public static final boolean method3051(String arg0, int arg1) {
        field7628++;
        if (arg1 != 10) {
            method3057(57, null);
        }
        return class475.method2807(10, 55, true, arg0);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V", line = 97)
    public static void method3052(byte arg0) {
        field7627 = null;
        field7640 = null;
        field7636 = null;
        field7637 = null;
        if (arg0 <= 54) {
            method3057(-123, null);
        }
        field7641 = null;
    }

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)Lwc;", line = 112)
    public final class270 method3053(int arg0) {
        field7626++;
        class270 var2 = this.field7639;
        if (this.field7635 == var2) {
            this.field7639 = null;
            return null;
        } else {
            int var3 = -78 / ((6 - arg0) / 50);
            this.field7639 = var2.field4493;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)Lwc;", line = 132)
    public final class270 method3054(int arg0) {
        field7631++;
        if (arg0 != -29948) {
            field7641 = null;
        }
        class270 var2 = this.field7635.field4493;
        if (this.field7635 == var2) {
            return null;
        } else {
            var2.method1799((byte) 116);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)V", line = 155)
    public static final void method3055(int arg0) {
        field7632++;
        int var1 = 0;
        for (int var2 = arg0; var2 < class217.field3775; var2++) {
            for (int var3 = 0; var3 < class277.field4548; var3++) {
                if (class94.method658(true, var2, -14903, var3, var1, class66.field977)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "(I)Lwc;", line = 187)
    public final class270 method3056(int arg0) {
        if (arg0 < 124) {
            this.field7635 = null;
        }
        field7630++;
        class270 var2 = this.field7635.field4493;
        if (this.field7635 == var2) {
            this.field7639 = null;
            return null;
        } else {
            this.field7639 = var2.field4493;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 208)
    public static final String method3057(int arg0, String arg1) {
        field7638++;
        String var2 = class353.method2263(class509.method2991(arg1, (byte) 94), 37);
        if (var2 == null) {
            var2 = "";
        }
        return arg0 < 0 ? null : var2;
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V", line = 237)
    public class516() {
        this.field7635.field4489 = this.field7635;
        this.field7635.field4493 = this.field7635;
    }
}
