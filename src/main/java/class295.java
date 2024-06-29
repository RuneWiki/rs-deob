import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class295 {

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    private int field4290 = -1;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Low;")
    private class665 field4294 = new class665();

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Llo;")
    public static class451 field4293 = new class451();

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Z")
    public static boolean field4298 = false;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "J")
    private long field4291;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "[I")
    public static int[] field4296;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 8)
    public static void method1862(byte arg0) {
        field4293 = null;
        field4296 = null;
        if (arg0 <= 66) {
            method1862((byte) -81);
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lol;)V", line = 148)
    public class295(class431 arg0) {
        this.method1863(arg0, 125);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lol;I)V", line = 44)
    private final void method1863(class431 arg0, int arg1) {
        this.field4291 = arg0.method2567((byte) -123);
        field4295++;
        int var3 = 99 % ((arg1 - 7) / 46);
        this.field4290 = arg0.method2526(17);
        for (int var4 = arg0.method2557(14929); var4 != 0; var4 = arg0.method2557(14929)) {
            if (class580.field8359) {
                System.out.println("t:" + var4);
            }
            class198 var5;
            if (var4 == 3) {
                var5 = new class659();
            } else if (var4 == 1) {
                var5 = new class280();
            } else if (var4 == 4) {
                var5 = new class349();
            } else if (var4 == 6) {
                var5 = new class721();
            } else if (var4 == 5) {
                var5 = new class403();
            } else if (var4 == 2) {
                var5 = new class106();
            } else if (var4 == 7) {
                var5 = new class222();
            } else if (var4 == 8) {
                var5 = new class581();
            } else if (var4 == 9) {
                var5 = new class260();
            } else if (var4 == 10) {
                var5 = new class251();
            } else if (var4 == 11) {
                var5 = new class440();
            } else if (var4 == 12) {
                var5 = new class448();
            } else {
                throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
            }
            var5.method855(true, arg0);
            this.field4294.method3728((byte) 126, var5);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Llm;I)V", line = 118)
    public final void method1864(class50 arg0, int arg1) {
        field4292++;
        if (this.field4291 != arg0.field707 || this.field4290 != arg0.field704) {
            throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + class549.method3176(false, arg0.field707) + " updateNum:" + arg0.field704 + " delta.owner:" + class549.method3176(false, this.field4291) + " updateNum:" + this.field4290);
        }
        class198 var3 = (class198) this.field4294.method3731((byte) -113);
        if (arg1 != -11) {
            field4298 = true;
        }
        while (var3 != null) {
            var3.method858(arg1 + 14, arg0);
            var3 = (class198) this.field4294.method3729((byte) -125);
        }
        arg0.field704++;
    }
}
