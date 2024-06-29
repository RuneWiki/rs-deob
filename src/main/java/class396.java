import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class396 {

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "I")
    private int field5825 = -1;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "Ltm;")
    private class412 field5822 = new class412();

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
    public static int field5817 = 64;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "S")
    public static short field5820 = 205;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "J")
    private long field5818;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "Laj;")
    public static class333 field5819;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljp;I)V")
    private final void method2491(class376 arg0, int arg1) {
        this.field5818 = arg0.method2366(true);
        field5823++;
        this.field5825 = arg0.method2384(arg1 ^ 0xFFFFFFB6);
        int var3 = arg0.method2398(arg1 ^ 0x51D275F4);
        if (arg1 != -4) {
            this.method2493(null, 44);
        }
        while (var3 != 0) {
            if (class705.field9878) {
                System.out.println("t:" + var3);
            }
            class24 var4;
            if (var3 == 3) {
                var4 = new class454();
            } else if (var3 == 1) {
                var4 = new class718();
            } else if (var3 == 4) {
                var4 = new class356();
            } else if (var3 == 6) {
                var4 = new class790();
            } else if (var3 == 5) {
                var4 = new class679();
            } else if (var3 == 2) {
                var4 = new class131();
            } else if (var3 == 7) {
                var4 = new class728();
            } else if (var3 == 8) {
                var4 = new class291();
            } else if (var3 == 9) {
                var4 = new class561();
            } else if (var3 == 10) {
                var4 = new class475();
            } else if (var3 == 11) {
                var4 = new class105();
            } else if (var3 == 12) {
                var4 = new class64();
            } else {
                throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
            }
            var4.method191(arg1 - 94, arg0);
            this.field5822.method2545(-126, var4);
            var3 = arg0.method2398(-1372747256);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)V")
    public static void method2492(byte arg0) {
        field5819 = null;
        if (arg0 < 84) {
            method2492((byte) 110);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lke;I)V")
    public final void method2493(class625 arg0, int arg1) {
        field5821++;
        if (this.field5818 != arg0.field8442 || this.field5825 != arg0.field8430) {
            throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + class667.method3693(-14014, arg0.field8442) + " updateNum:" + arg0.field8430 + " delta.owner:" + class667.method3693(-14014, this.field5818) + " updateNum:" + this.field5825);
        }
        for (class24 var3 = (class24) this.field5822.method2551((byte) -108); var3 != null; var3 = (class24) this.field5822.method2542(-101)) {
            var3.method190(arg0, 5);
        }
        if (arg1 != -7) {
            this.field5822 = null;
        }
        arg0.field8430++;
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Ljp;)V")
    public class396(class376 arg0) {
        this.method2491(arg0, -4);
    }
}
