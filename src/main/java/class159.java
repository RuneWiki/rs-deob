import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class159 implements class331 {

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "Lom;")
    private class393 field2536;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "Lwia;")
    private class791 field2539;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "Lwia;")
    private class791 field2538;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "[I")
    public static int[] field2533 = new int[1];

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "Z")
    public static boolean field2535 = false;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "Lin;")
    public static class97 field2543 = new class97();

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public static int field2544 = 0;

    @OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
    public static int field2545 = 0;

    @OriginalMember(owner = "client!ho", name = "n", descriptor = "[[Ljava/lang/String;")
    public static String[][] field2546 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "Lda;")
    private class66 field2537;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)V", line = 6)
    public static void method1206(byte arg0) {
        if (arg0 < 55) {
            field2543 = null;
        }
        field2543 = null;
        field2546 = null;
        field2533 = null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)Z", line = 22)
    public final boolean method298(byte arg0) {
        if (arg0 != -98) {
            field2543 = null;
        }
        field2542++;
        boolean var2 = true;
        if (!this.field2538.method4349((byte) -102, this.field2536.field5403)) {
            var2 = false;
        }
        if (!this.field2539.method4349((byte) -102, this.field2536.field5403)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V", line = 47)
    public final void method297(int arg0) {
        int var2 = 75 / ((arg0 - 83) / 32);
        field2541++;
        class6 var3 = class119.method899(-30298, this.field2539, this.field2536.field5403);
        this.field2537 = class37.field491.method437(var3, class1.method2(this.field2538, this.field2536.field5403), true);
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lwia;Lwia;Lom;)V", line = 64)
    public class159(class791 arg0, class791 arg1, class393 arg2) {
        this.field2536 = arg2;
        this.field2539 = arg1;
        this.field2538 = arg0;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZZ)V", line = 74)
    public final void method299(boolean arg0, boolean arg1) {
        field2534++;
        if (arg1) {
            field2543 = null;
        }
        if (arg0) {
            int var3 = this.field2536.field5412.method703(this.field2536.field5416, class527.field7532, (byte) 30) + this.field2536.field5409;
            int var4 = this.field2536.field5411.method2781(this.field2536.field5414, 0, class296.field4307) + this.field2536.field5408;
            this.field2537.method571(0, null, this.field2536.field5410, this.field2536.field5416, var4, this.field2536.field5407, this.field2536.field5406, -22888, this.field2536.field5418, this.field2536.field5414, null, var3, 0, this.field2536.field5400, null, this.field2536.field5415);
        }
    }
}
