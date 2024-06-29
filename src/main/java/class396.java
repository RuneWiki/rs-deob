import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class396 {

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public int field5677 = 0;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public int field5678 = 0;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Z")
    private boolean field5665 = false;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "Lew;")
    public static class683 field5674 = new class683();

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public int field5666;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public int field5667;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public int field5670;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public int field5672;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public int field5673;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public int field5676;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public int field5679;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    private int field5680;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public int field5681;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public int field5682;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "J")
    public long field5671;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILsl;)V", line = 8)
    public final void method2402(int arg0, class479 arg1) {
        field5675++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method2886(true);
            if (var3 == 0) {
                return;
            }
            this.method2405(arg0 ^ 0xFFFFFFFD, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBLla;I)Lqt;", line = 28)
    public static final class502 method2403(int arg0, byte arg1, class423 arg2, int arg3) {
        field5669++;
        byte[] var4 = arg2.method2600(0, arg3, arg0);
        if (var4 == null) {
            return null;
        } else {
            if (arg1 != 79) {
                field5674 = null;
            }
            return new class502(var4);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 48)
    public final void method2404(int arg0) {
        this.field5679 = class125.field1729[this.field5680 << 3];
        field5683++;
        long var2 = (long) this.field5672;
        long var4 = (long) this.field5667;
        long var6 = (long) this.field5676;
        this.field5673 = (int) Math.sqrt((double) (var2 * var2 + (var4 * var4 + (var6 * var6))));
        if (arg0 != -1) {
            method2403(103, (byte) -67, null, 10);
        }
        if (this.field5681 == 0) {
            this.field5681 = 1;
        }
        if (this.field5670 == 0) {
            this.field5671 = 2147483647L;
        } else if (this.field5670 == 1) {
            this.field5671 = (this.field5673 * 8 / this.field5681);
            this.field5671 *= this.field5671;
        } else if (this.field5670 == 2) {
            this.field5671 = (this.field5673 * 8 / this.field5681);
        }
        if (this.field5665) {
            this.field5673 *= -1;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILsl;I)V", line = 97)
    private final void method2405(int arg0, class479 arg1, int arg2) {
        if (arg0 != -3) {
            this.field5670 = 37;
        }
        if (arg2 == 1) {
            this.field5680 = arg1.method2882(-1);
        } else if (arg2 == 2) {
            arg1.method2886(true);
        } else if (arg2 == 3) {
            this.field5672 = arg1.method2868(arg0 ^ 0x3A);
            this.field5667 = arg1.method2868(arg0 ^ 0x72);
            this.field5676 = arg1.method2868(arg0 - 73);
        } else if (arg2 == 4) {
            this.field5670 = arg1.method2886(true);
            this.field5681 = arg1.method2868(-112);
        } else if (arg2 == 6) {
            this.field5666 = arg1.method2886(true);
        } else if (arg2 == 8) {
            this.field5678 = 1;
        } else if (arg2 == 9) {
            this.field5677 = 1;
        } else if (arg2 == 10) {
            this.field5665 = true;
        }
        field5668++;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V", line = 161)
    public static void method2406(boolean arg0) {
        if (!arg0) {
            field5674 = null;
        }
    }
}
