import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class class60 extends class78 {

    @OriginalMember(owner = "client!va", name = "i", descriptor = "Z")
    public boolean field746 = false;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Z")
    public boolean field751 = false;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "[B")
    public static byte[] field747 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!va", name = "o", descriptor = "Lec;")
    public static class40 field752 = new class40("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!va", name = "s", descriptor = "Z")
    public static boolean field756 = false;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "J")
    public static long field754;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "(I)V", line = 6)
    public static void method310(int arg0) {
        if (arg0 != -1) {
            field747 = null;
        }
        field752 = null;
        field747 = null;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(IIIZZ)V", line = 109)
    public class60(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field750 = arg2;
        this.field748 = arg1;
        this.field746 = arg4;
        this.field751 = arg3;
        this.field749 = arg0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lab;IBI)V", line = 20)
    public static final void method311(class256 arg0, int arg1, byte arg2, int arg3) {
        field755++;
        if (arg0.field3608 == 0) {
            arg0.field3703 = arg0.field3562;
        } else if (arg0.field3608 == 1) {
            arg0.field3703 = (arg1 - arg0.field3597) / 2 + arg0.field3562;
        } else if (arg0.field3608 == 2) {
            arg0.field3703 = arg1 - (arg0.field3597 + arg0.field3562);
        } else if (arg0.field3608 == 3) {
            arg0.field3703 = arg0.field3562 * arg1 >> 14;
        } else if (arg0.field3608 == 4) {
            arg0.field3703 = (arg1 - arg0.field3597) / 2 + (arg0.field3562 * arg1 >> 14);
        } else {
            arg0.field3703 = arg1 - ((arg0.field3562 * arg1 >> 14) + arg0.field3597);
        }
        if (arg2 < 64) {
            method311((class256) null, -49, (byte) -118, -22);
        }
        if (arg0.field3671 == 0) {
            arg0.field3576 = arg0.field3560;
        } else if (arg0.field3671 == 1) {
            arg0.field3576 = (arg3 - arg0.field3707) / 2 + arg0.field3560;
        } else if (arg0.field3671 == 2) {
            arg0.field3576 = arg3 - arg0.field3707 - arg0.field3560;
        } else if (arg0.field3671 == 3) {
            arg0.field3576 = arg0.field3560 * arg3 >> 14;
        } else if (arg0.field3671 == 4) {
            arg0.field3576 = (arg0.field3560 * arg3 >> 14) + (arg3 - arg0.field3707) / 2;
        } else {
            arg0.field3576 = arg3 - arg0.field3707 - (arg0.field3560 * arg3 >> 14);
        }
        if (!class192.field2640) {
            return;
        }
        if (client.method1660(arg0).field4087 == 0 && arg0.field3654 != 0) {
            return;
        }
        if (arg0.field3576 < 0) {
            arg0.field3576 = 0;
        } else if (arg3 < (arg0.field3707 + arg0.field3576)) {
            arg0.field3576 = arg3 - arg0.field3707;
        }
        if (arg0.field3703 < 0) {
            arg0.field3703 = 0;
            return;
        }
        if (arg1 < arg0.field3703 + arg0.field3597) {
            arg0.field3703 = arg1 - arg0.field3597;
            return;
        }
    }
}
