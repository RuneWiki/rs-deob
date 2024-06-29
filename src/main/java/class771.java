import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class771 {

    @OriginalMember(owner = "client!oha", name = "n", descriptor = "Z")
    private boolean field10636 = false;

    @OriginalMember(owner = "client!oha", name = "m", descriptor = "I")
    public int field10635 = 0;

    @OriginalMember(owner = "client!oha", name = "q", descriptor = "I")
    public int field10639 = 0;

    @OriginalMember(owner = "client!oha", name = "d", descriptor = "I")
    public static int field10626 = 13156520;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "Lke;")
    public static class622 field10623 = new class622(99, 3);

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "I")
    public static int field10624;

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "I")
    public int field10625;

    @OriginalMember(owner = "client!oha", name = "e", descriptor = "I")
    public int field10627;

    @OriginalMember(owner = "client!oha", name = "f", descriptor = "I")
    public int field10628;

    @OriginalMember(owner = "client!oha", name = "g", descriptor = "I")
    public int field10629;

    @OriginalMember(owner = "client!oha", name = "h", descriptor = "I")
    public int field10630;

    @OriginalMember(owner = "client!oha", name = "i", descriptor = "I")
    private int field10631;

    @OriginalMember(owner = "client!oha", name = "j", descriptor = "I")
    public int field10632;

    @OriginalMember(owner = "client!oha", name = "k", descriptor = "I")
    public int field10633;

    @OriginalMember(owner = "client!oha", name = "l", descriptor = "I")
    public static int field10634;

    @OriginalMember(owner = "client!oha", name = "o", descriptor = "I")
    public int field10637;

    @OriginalMember(owner = "client!oha", name = "p", descriptor = "I")
    public static int field10638;

    @OriginalMember(owner = "client!oha", name = "r", descriptor = "I")
    public int field10640;

    @OriginalMember(owner = "client!oha", name = "s", descriptor = "J")
    public long field10641;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)V")
    public final void method4238(byte arg0) {
        field10624++;
        this.field10632 = class601.field8473[this.field10631 << 3];
        long var2 = (long) this.field10629;
        long var4 = (long) this.field10625;
        long var6 = (long) this.field10640;
        this.field10627 = (int) Math.sqrt((double) (var4 * var4 + var2 * var2 + var6 * var6));
        if (this.field10637 == 0) {
            this.field10637 = 1;
        }
        if (this.field10633 == 0) {
            this.field10641 = 2147483647L;
        } else if (this.field10633 == 1) {
            this.field10641 = (this.field10627 * 8 / this.field10637);
            this.field10641 *= this.field10641;
        } else if (this.field10633 == 2) {
            this.field10641 = (this.field10627 * 8 / this.field10637);
        }
        if (this.field10636) {
            this.field10627 *= -1;
        }
        if (arg0 != -117) {
            field10626 = 23;
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(ILrv;Z)V")
    private final void method4239(int arg0, class120 arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        if (arg0 == 1) {
            this.field10631 = arg1.method898((byte) -99);
        } else if (arg0 == 2) {
            arg1.method842(2384);
        } else if (arg0 == 3) {
            this.field10629 = arg1.method871(23995);
            this.field10625 = arg1.method871(23995);
            this.field10640 = arg1.method871(23995);
        } else if (arg0 == 4) {
            this.field10633 = arg1.method842(2384);
            this.field10637 = arg1.method871(23995);
        } else if (arg0 == 6) {
            this.field10630 = arg1.method842(2384);
        } else if (arg0 == 8) {
            this.field10635 = 1;
        } else if (arg0 == 9) {
            this.field10639 = 1;
        } else if (arg0 == 10) {
            this.field10636 = true;
        }
        field10634++;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(Lrv;B)V")
    public final void method4240(class120 arg0, byte arg1) {
        field10638++;
        while (true) {
            int var3 = arg0.method842(arg1 ^ 0x90A);
            if (var3 == 0) {
                if (arg1 == 90) {
                    return;
                } else {
                    this.method4240(null, (byte) 44);
                    return;
                }
            }
            this.method4239(var3, arg0, true);
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
    public static void method4241(int arg0) {
        field10623 = null;
        if (arg0 != 99) {
            method4241(92);
        }
    }
}
