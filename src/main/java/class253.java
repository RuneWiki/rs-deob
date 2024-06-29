import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class253 extends class728 {

    @OriginalMember(owner = "client!sca", name = "A", descriptor = "[I")
    private int[] field3623 = new int[this.field10148];

    @OriginalMember(owner = "client!sca", name = "w", descriptor = "Lvb;")
    public static class396 field3619 = new class396(2, 7);

    @OriginalMember(owner = "client!sca", name = "I", descriptor = "Lin;")
    public static class380 field3631 = new class380(74, 0);

    @OriginalMember(owner = "client!sca", name = "J", descriptor = "Lsv;")
    public static class570 field3632 = new class570(10, 0);

    @OriginalMember(owner = "client!sca", name = "K", descriptor = "[I")
    public static int[] field3633 = new int[16384];

    @OriginalMember(owner = "client!sca", name = "M", descriptor = "[I")
    public static int[] field3634 = new int[16384];

    @OriginalMember(owner = "client!sca", name = "x", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!sca", name = "y", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!sca", name = "z", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!sca", name = "B", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!sca", name = "C", descriptor = "I")
    private int field3625;

    @OriginalMember(owner = "client!sca", name = "D", descriptor = "I")
    private int field3626;

    @OriginalMember(owner = "client!sca", name = "F", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!sca", name = "G", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!sca", name = "H", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!sca", name = "E", descriptor = "[B")
    private byte[] field3627;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field3634[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field3633[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(BLcea;Ljava/awt/Frame;)V", line = 3)
    public static final void method1670(byte arg0, class111 arg1, Frame arg2) {
        if (arg0 == -98) {
            ++field3620;
            while (true) {
                class746 var3 = arg1.method910(1, arg2);
                while (~var3.field10365 == -1) {
                    class579.method3405(10L, arg0 ^ -108);
                }
                if (~var3.field10365 == -2) {
                    arg2.setVisible(false);
                    arg2.dispose();
                    return;
                }
                class579.method3405(100L, 10);
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(IIIIIF)V", line = 31)
    public class253(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field10148; ++var7) {
            this.field3623[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V", line = 51)
    public final void method1671(int arg0) {
        ++field3622;
        this.field3626 = Math.abs(this.field3626);
        if (this.field3626 >= 4096) {
            this.field3626 = 4095;
        }
        if (arg0 < -42) {
            this.method172(this.field3625++, (byte) (this.field3626 >> 4), true);
            this.field3626 = 0;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(ZII)V", line = 68)
    public final void method1672(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.field3627 = null;
        }
        ++field3630;
        this.field3626 += this.field3623[arg1] * arg2 >> 12;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)V", line = 80)
    public final void method1673(int arg0) {
        this.field3625 = 0;
        ++field3621;
        this.field3626 = 0;
        if (arg0 > -63) {
            field3624 = 23;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IBZ)V", line = 98)
    public void method172(int arg0, byte arg1, boolean arg2) {
        ++field3628;
        this.field3627[this.field3625++] = (byte) (127 + class194.method1380(arg1 >> 1, 127));
        if (!arg2) {
            field3634 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "(I)V", line = 111)
    public static void method1674(int arg0) {
        if (arg0 == 16384) {
            field3633 = null;
            field3619 = null;
            field3634 = null;
            field3631 = null;
            field3632 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "(I)I", line = 126)
    public static final int method1675(int arg0) {
        if (arg0 != 0) {
            method1675(-119);
        }
        ++field3629;
        if (class383.field5382) {
            return 6;
        } else if (class493.field6765 == null) {
            return 0;
        } else {
            int var1 = class493.field6765.field7682;
            if (class729.method4050(96, var1)) {
                return 1;
            } else if (class662.method3711(25, var1)) {
                return 2;
            } else if (class506.method2959(var1, (byte) -119)) {
                return 3;
            } else {
                return class61.method628(arg0 ^ 109, var1) ? 4 : 5;
            }
        }
    }
}
