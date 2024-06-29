import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class286 {

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public int field3639 = 1190717;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public int field3642 = -1;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public int field3641 = 8;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
    public int field3648 = -1;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public int field3638 = -1;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
    public int field3647 = 16;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "Z")
    public boolean field3651 = false;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
    public int field3649 = 128;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "Z")
    public boolean field3653 = true;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    public int field3655 = 0;

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "Z")
    public boolean field3659 = true;

    @OriginalMember(owner = "client!fs", name = "y", descriptor = "I")
    public int field3662 = 127;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "Lad;")
    public static class11 field3657 = new class11(260);

    @OriginalMember(owner = "client!fs", name = "w", descriptor = "F")
    public static float field3660;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    public int field3650;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "Lbr;")
    public static class144 field3643;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "Ler;")
    public class4 field3654;

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "[B")
    public static byte[] field3661;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;ZLdn;I)Ltq;")
    public static final class67 method1735(String arg0, boolean arg1, class201 arg2, int arg3) {
        field3640++;
        int var4 = arg2.method1297(arg0, -5105);
        if (var4 == -1) {
            return new class67(0);
        } else if (arg3 == -8) {
            int[] var5 = arg2.method1292(-90, var4);
            class67 var6 = new class67(var5.length);
            int var7 = 0;
            int var8 = 0;
            while (true) {
                while (var6.field832 > var7) {
                    class88 var9 = new class88(arg2.method1313((byte) -110, var4, var5[var8++]));
                    int var10 = var9.method578(126);
                    int var11 = var9.method568((byte) 110);
                    int var12 = var9.method617(2);
                    if (!arg1 && var12 == 1) {
                        var6.field832--;
                    } else {
                        var6.field835[var7] = var10;
                        var6.field833[var7] = var11;
                        var7++;
                    }
                }
                return var6;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLjava/awt/Component;Z)Lmd;")
    public static final class210 method1736(byte arg0, Component arg1, boolean arg2) {
        if (arg0 > -55) {
            field3660 = 1.0838346F;
        }
        field3652++;
        return new class109(arg1, arg2);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILbt;I)V")
    private final void method1737(int arg0, class88 arg1, int arg2) {
        if (arg0 != 8) {
            return;
        }
        if (arg2 == 1) {
            this.field3655 = class357.method2084(arg1.method584(255), (byte) -87);
        } else if (arg2 == 2) {
            this.field3638 = arg1.method617(2);
        } else if (arg2 == 3) {
            this.field3638 = arg1.method568((byte) 110);
            if (this.field3638 == 65535) {
                this.field3638 = -1;
            }
        } else if (arg2 == 5) {
            this.field3653 = false;
        } else if (arg2 == 7) {
            this.field3648 = class357.method2084(arg1.method584(arg0 + 247), (byte) -115);
        } else if (arg2 == 8) {
            this.field3654.field33 = this.field3650;
        } else if (arg2 == 9) {
            this.field3649 = arg1.method568((byte) 110) << 0;
        } else if (arg2 == 10) {
            this.field3659 = false;
        } else if (arg2 == 11) {
            this.field3641 = arg1.method617(2);
        } else if (arg2 == 12) {
            this.field3651 = true;
        } else if (arg2 == 13) {
            this.field3639 = arg1.method584(255);
        } else if (arg2 == 14) {
            this.field3647 = arg1.method617(2);
        } else if (arg2 == 15) {
            this.field3642 = arg1.method568((byte) 110);
            if (this.field3642 == 65535) {
                this.field3642 = -1;
            }
        } else if (arg2 == 16) {
            this.field3662 = arg1.method617(arg0 ^ 0xA);
        }
        field3644++;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
    public static void method1738(byte arg0) {
        field3643 = null;
        field3661 = null;
        field3657 = null;
        if (arg0 > -98) {
            field3660 = -0.20072448F;
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V")
    public final void method1739(byte arg0) {
        field3645++;
        if (this.field3642 == -1) {
            this.field3642 = this.field3638;
        }
        if (arg0 != -74) {
            method1735(null, false, null, 75);
        }
        this.field3641 = this.field3650 | this.field3641 << 8;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lbt;B)V")
    public final void method1740(class88 arg0, byte arg1) {
        field3646++;
        if (arg1 >= -107) {
            this.method1737(-88, null, -9);
        }
        while (true) {
            int var3 = arg0.method617(2);
            if (var3 == 0) {
                return;
            }
            this.method1737(8, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZIIIIIIII)V")
    public static final void method1741(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3656++;
        if (!arg1) {
            field3658 = 5;
        }
        if (class65.field827 <= arg3 && class281.field3589 >= arg3 && arg6 >= class65.field827 && arg6 <= class281.field3589 && class65.field827 <= arg7 && class281.field3589 >= arg7 && class65.field827 <= arg8 && class281.field3589 >= arg8 && class418.field5559 <= arg2 && arg2 <= class456.field6365 && class418.field5559 <= arg9 && class456.field6365 >= arg9 && arg5 >= class418.field5559 && class456.field6365 >= arg5 && arg4 >= class418.field5559 && arg4 <= class456.field6365) {
            class354.method2077(arg2, arg7, arg0, arg9, arg3, arg5, false, arg6, arg8, arg4);
        } else {
            class183.method1207(arg5, arg7, arg0, arg6, arg3, (byte) 90, arg8, arg9, arg4, arg2);
        }
    }
}
