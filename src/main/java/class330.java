import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class330 {

    @OriginalMember(owner = "client!so", name = "d", descriptor = "Ljn;")
    private class507 field4377 = new class507();

    @OriginalMember(owner = "client!so", name = "e", descriptor = "Lao;")
    public static class191 field4378 = new class191(74, -2);

    @OriginalMember(owner = "client!so", name = "j", descriptor = "Ljc;")
    public static class305 field4383 = new class305("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!so", name = "m", descriptor = "I")
    public static int field4386 = 0;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "Ljn;")
    private class507 field4384;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)Ljn;")
    public final class507 method1932(int arg0) {
        field4375++;
        class507 var2 = this.field4384;
        if (this.field4377 == var2) {
            this.field4384 = null;
            return null;
        }
        this.field4384 = var2.field7345;
        if (arg0 != -2) {
            this.method1933(-36);
        }
        return var2;
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V")
    public final void method1933(int arg0) {
        while (true) {
            class507 var2 = this.field4377.field7345;
            if (this.field4377 == var2) {
                field4380++;
                if (arg0 != -2) {
                    this.method1938(true, null);
                }
                this.field4384 = null;
                return;
            }
            var2.method3022((byte) 54);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)Ljn;")
    public final class507 method1934(byte arg0) {
        field4379++;
        class507 var2 = this.field4377.field7345;
        int var3 = -46 % ((-arg0 - 9) / 36);
        if (this.field4377 == var2) {
            return null;
        } else {
            var2.method3022((byte) 54);
            return var2;
        }
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(I)V")
    public static void method1935(int arg0) {
        field4383 = null;
        if (arg0 != 0) {
            method1935(-6);
        }
        field4378 = null;
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(B)I")
    public final int method1936(byte arg0) {
        field4376++;
        int var2 = 0;
        if (arg0 <= 7) {
            field4378 = null;
        }
        class507 var3 = this.field4377.field7345;
        while (this.field4377 != var3) {
            var3 = var3.field7345;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)Ljn;")
    public final class507 method1937(boolean arg0) {
        if (arg0) {
            field4385 = -77;
        }
        field4381++;
        class507 var2 = this.field4377.field7345;
        if (this.field4377 == var2) {
            this.field4384 = null;
            return null;
        } else {
            this.field4384 = var2.field7345;
            return var2;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ZLjn;)V")
    public final void method1938(boolean arg0, class507 arg1) {
        if (arg1.field7346 != null) {
            arg1.method3022((byte) 54);
        }
        field4374++;
        arg1.field7346 = this.field4377.field7346;
        arg1.field7345 = this.field4377;
        if (arg0) {
            arg1.field7346.field7345 = arg1;
            arg1.field7345.field7346 = arg1;
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
    public class330() {
        this.field4377.field7346 = this.field4377;
        this.field4377.field7345 = this.field4377;
    }
}
