import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public abstract class class613 extends class421 {

    @OriginalMember(owner = "client!eba", name = "E", descriptor = "S")
    public short field8610;

    @OriginalMember(owner = "client!eba", name = "A", descriptor = "Z")
    public static boolean field8606 = false;

    @OriginalMember(owner = "client!eba", name = "J", descriptor = "Lhfa;")
    public static class329 field8615 = new class329();

    @OriginalMember(owner = "client!eba", name = "K", descriptor = "Z")
    public static boolean field8616 = false;

    @OriginalMember(owner = "client!eba", name = "B", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!eba", name = "C", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!eba", name = "D", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!eba", name = "F", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!eba", name = "G", descriptor = "I")
    public static int field8612;

    @OriginalMember(owner = "client!eba", name = "H", descriptor = "I")
    public static int field8613;

    @OriginalMember(owner = "client!eba", name = "I", descriptor = "I")
    public static int field8614;

    @OriginalMember(owner = "client!eba", name = "L", descriptor = "Lhu;")
    public static class141 field8617;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(IJ)I", line = 3)
    public static final int method3557(int arg0, long arg1) {
        if (arg0 != -11745) {
            method3558(-100);
        }
        ++field8613;
        return (int) (arg1 / 86400000L) + -11745;
    }

    @OriginalMember(owner = "client!eba", name = "j", descriptor = "(I)V", line = 16)
    public static void method3558(int arg0) {
        field8615 = null;
        if (arg0 != -25696) {
            field8606 = true;
        }
        field8617 = null;
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(ILha;)Z", line = 29)
    public final boolean method2456(int arg0, class65 arg1) {
        if (arg0 <= 92) {
            return true;
        } else {
            ++field8609;
            return class254.method1662(this, super.field5746 >> class645.field9018, -50, super.field5749, super.field5742 >> class645.field9018);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I[Lqm;)I", line = 40)
    public final int method2458(int arg0, class154[] arg1) {
        ++field8614;
        int var3 = super.field5742 >> class645.field9018;
        int var4 = super.field5746 >> class645.field9018;
        int var5 = 0;
        if (class276.field4007 != var3) {
            if (class276.field4007 < var3) {
                var5 += 2;
            }
        } else {
            ++var5;
        }
        if (arg0 != 48) {
            field8606 = true;
        }
        if (class296.field4301 == var4) {
            var5 += 3;
        } else if (class296.field4301 > var4) {
            var5 += 6;
        }
        int var6 = class397.field5460[var5];
        if ((this.field8610 & var6) != 0) {
            return this.method2550(false, var4, arg1, var3);
        } else if (~this.field8610 == -2 && ~var3 < -1) {
            return this.method2550(false, var4, arg1, var3 + -1);
        } else if (this.field8610 == 4 && ~class81.field902 <= ~var3) {
            return this.method2550(false, var4, arg1, var3 + 1);
        } else if (~this.field8610 == -9 && var4 > 0) {
            return this.method2550(false, var4 - 1, arg1, var3);
        } else if (this.field8610 == 2 && class48.field615 >= var4) {
            return this.method2550(false, var4 + 1, arg1, var3);
        } else if (~this.field8610 == -17 && ~var3 < -1 && var4 <= class48.field615) {
            return this.method2550(false, var4 + 1, arg1, var3 + -1);
        } else if (~this.field8610 == -33 && var3 <= class81.field902 && class48.field615 >= var4) {
            return this.method2550(false, var4 - -1, arg1, var3 + 1);
        } else if (this.field8610 == 128 && ~var3 < -1 && var4 > 0) {
            return this.method2550(false, var4 + -1, arg1, var3 + -1);
        } else if (~this.field8610 == -65 && ~class81.field902 <= ~var3 && ~var4 < -1) {
            return this.method2550(false, var4 - 1, arg1, var3 + 1);
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!eba", name = "k", descriptor = "(I)V", line = 122)
    public static final void method3559(int arg0) {
        if (arg0 != -6878) {
            field8606 = false;
        }
        class745.field10318 = -2;
        class200.field3046 = -2;
        class632.field8877 = 0;
        ++field8611;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lje;Z[[[BIB)Z", line = 135)
    public static final boolean method3560(class421 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class596.field8361) {
            return false;
        } else {
            int var5 = arg0.field5742 >> class645.field9018;
            int var6 = var5;
            int var7 = arg0.field5746 >> class645.field9018;
            int var8 = var7;
            if (arg0 instanceof class672) {
                var6 = ((class672) arg0).field9371;
                var8 = ((class672) arg0).field9360;
                var5 = ((class672) arg0).field9368;
                var7 = ((class672) arg0).field9364;
            }
            for (int var9 = var5; var9 <= var6; ++var9) {
                for (int var10 = var7; var10 <= var8; ++var10) {
                    if (arg0.field5749 < class562.field7990 && var9 >= class314.field4473 && var9 < class16.field298 && var10 >= class446.field6087 && var10 < class34.field463) {
                        if ((arg2 == null || arg0.field5755 < arg3 || arg2[arg0.field5755][var9][var10] != arg4) && arg0.method2457((byte) 122) && !arg0.method2456(113, class228.field3494)) {
                            return false;
                        }
                        if (!arg1 && var9 >= class276.field4007 - 16 && var9 <= class276.field4007 + 16 && var10 >= class296.field4301 - 16 && var10 <= class296.field4301 + 16) {
                            if (class712.field9883) {
                                class747.field10352[class690.field9649++].method346((byte) 39, arg0);
                                class690.field9649 %= class270.field3919;
                            } else {
                                arg0.method912(54, class228.field3494);
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(II)Z", line = 204)
    public static final boolean method3561(int arg0, int arg1) {
        if (arg1 != -1) {
            return true;
        } else {
            ++field8608;
            return ~arg0 == -2 || arg0 == 3 || ~arg0 == -6;
        }
    }

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "(B)Z", line = 217)
    public final boolean method2457(byte arg0) {
        ++field8612;
        if (arg0 <= 117) {
            method3558(-37);
        }
        return class735.field10157[(super.field5742 >> class645.field9018) + -class276.field4007 + class259.field3820][(super.field5746 >> class645.field9018) + -class296.field4301 + class259.field3820];
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZLtd;ILjava/lang/String;Z)V", line = 229)
    public static final void method3562(boolean arg0, class477 arg1, int arg2, String arg3, boolean arg4) {
        int var5 = -52 % ((arg2 - -35) / 49);
        ++field8607;
        class60.method402(arg0, "openjs", 13687, arg4, arg1, arg3);
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(IIIIII)V", line = 239)
    public class613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8610 = (short) arg5;
        super.field5746 = arg2;
        super.field5755 = (byte) arg3;
        super.field5749 = (byte) arg4;
        super.field5741 = arg1;
        super.field5742 = arg0;
    }
}
