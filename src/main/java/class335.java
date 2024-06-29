import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class335 {

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Z")
    public boolean field4678 = true;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Z")
    public boolean field4675 = true;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "Z")
    public boolean field4685 = false;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public int field4680 = 1190717;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public int field4687 = 8;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public int field4683 = -1;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public int field4676 = 64;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public int field4674 = 0;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public int field4682 = -1;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public int field4690 = 127;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    public int field4693 = -1;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public int field4692 = 512;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "J")
    public static long field4686 = -1L;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "Luv;")
    public static class3 field4684 = new class3(15, 3);

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public int field4673;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Ltc;")
    public class552 field4688;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "[I")
    public static int[] field4677;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public final void method2128(byte arg0) {
        if (this.field4682 == -1) {
            this.field4682 = this.field4683;
        }
        field4681++;
        this.field4687 = this.field4687 << 8 | this.field4673;
        if (arg0 != -105) {
            this.field4693 = 79;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLge;)V")
    public final void method2129(byte arg0, class551 arg1) {
        if (arg0 != -44) {
            return;
        }
        while (true) {
            int var3 = arg1.method3045(-125);
            if (var3 == 0) {
                field4679++;
                return;
            }
            this.method2130(-78, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILge;I)V")
    private final void method2130(int arg0, class551 arg1, int arg2) {
        if (arg0 > -70) {
            this.field4674 = -66;
        }
        field4691++;
        if (arg2 == 1) {
            this.field4674 = class389.method2348(arg1.method3043((byte) 49), 86);
        } else if (arg2 == 2) {
            this.field4683 = arg1.method3045(-128);
        } else if (arg2 == 3) {
            this.field4683 = arg1.method3090(-116);
            if (this.field4683 == 65535) {
                this.field4683 = -1;
                return;
            }
        } else if (arg2 == 5) {
            this.field4678 = false;
        } else if (arg2 == 7) {
            this.field4693 = class389.method2348(arg1.method3043((byte) 49), 61);
            return;
        } else if (arg2 == 8) {
            this.field4688.field7737 = this.field4673;
            return;
        } else if (arg2 == 9) {
            this.field4692 = arg1.method3090(-106) << 2;
            return;
        } else if (arg2 == 10) {
            this.field4675 = false;
            return;
        } else if (arg2 == 11) {
            this.field4687 = arg1.method3045(-126);
            return;
        } else if (arg2 == 12) {
            this.field4685 = true;
            return;
        } else if (arg2 == 13) {
            this.field4680 = arg1.method3043((byte) 49);
            return;
        } else {
            if (arg2 == 14) {
                this.field4676 = arg1.method3045(-127) << 2;
            } else if (arg2 == 15) {
                this.field4682 = arg1.method3090(-71);
                if (this.field4682 == 65535) {
                    this.field4682 = -1;
                    return;
                }
                return;
            } else if (arg2 == 16) {
                this.field4690 = arg1.method3045(-126);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method2131(int arg0) {
        if (arg0 == 1190717) {
            field4684 = null;
            field4677 = null;
        }
    }
}
