import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class405 {

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
    public int field5567 = 0;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public int field5564 = -1;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "I")
    public int field5566 = -1;

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
    public int field5570 = 512;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
    public int field5569 = 8;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "Z")
    public boolean field5574 = true;

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
    public int field5577 = 127;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "Z")
    public boolean field5573 = true;

    @OriginalMember(owner = "client!hca", name = "p", descriptor = "I")
    public int field5579 = 64;

    @OriginalMember(owner = "client!hca", name = "r", descriptor = "Z")
    public boolean field5581 = false;

    @OriginalMember(owner = "client!hca", name = "s", descriptor = "I")
    public int field5582 = 1190717;

    @OriginalMember(owner = "client!hca", name = "q", descriptor = "Z")
    public static boolean field5580 = false;

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "Lvb;")
    public static class396 field5571 = new class396(1, 16);

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!hca", name = "o", descriptor = "I")
    public int field5578;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "Loo;")
    public class12 field5575;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)V")
    public static void method2397(byte arg0) {
        field5571 = null;
        if (arg0 > -59) {
            method2397((byte) 46);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IILol;)V")
    private final void method2398(int arg0, int arg1, class431 arg2) {
        if (arg1 != -876260638) {
            this.method2400((byte) 53);
        }
        field5572++;
        if (arg0 == 1) {
            this.field5567 = class521.method3061(arg2.method2515(115), -127);
        } else if (arg0 == 2) {
            this.field5564 = arg2.method2557(14929);
        } else if (arg0 == 3) {
            this.field5564 = arg2.method2565((byte) -92);
            if (this.field5564 == 65535) {
                this.field5564 = -1;
            }
        } else if (arg0 == 5) {
            this.field5574 = false;
        } else if (arg0 == 7) {
            this.field5566 = class521.method3061(arg2.method2515(117), arg1 ^ 0xCBC552D1);
        } else if (arg0 == 8) {
            this.field5575.field158 = this.field5578;
        } else if (arg0 == 9) {
            this.field5570 = arg2.method2565((byte) -116) << 2;
        } else if (arg0 == 10) {
            this.field5573 = false;
        } else if (arg0 == 11) {
            this.field5569 = arg2.method2557(arg1 ^ 0xCBC568B3);
        } else if (arg0 == 12) {
            this.field5581 = true;
        } else if (arg0 == 13) {
            this.field5582 = arg2.method2515(103);
        } else if (arg0 == 14) {
            this.field5579 = arg2.method2557(14929) << 2;
        } else if (arg0 == 16) {
            this.field5577 = arg2.method2557(arg1 ^ 0xCBC568B3);
            return;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lol;B)V")
    public final void method2399(class431 arg0, byte arg1) {
        field5576++;
        if (arg1 < 81) {
            this.method2399(null, (byte) 123);
        }
        while (true) {
            int var3 = arg0.method2557(14929);
            if (var3 == 0) {
                return;
            }
            this.method2398(var3, -876260638, arg0);
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)V")
    public final void method2400(byte arg0) {
        this.field5569 = this.field5578 | this.field5569 << 8;
        if (arg0 >= -101) {
            this.method2399(null, (byte) -70);
        }
        field5568++;
    }
}
