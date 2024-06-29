import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class207 extends class256 {

    @OriginalMember(owner = "client!rd", name = "hb", descriptor = "Z")
    private volatile boolean field3591 = false;

    @OriginalMember(owner = "client!rd", name = "kb", descriptor = "Z")
    private boolean field3594 = false;

    @OriginalMember(owner = "client!rd", name = "mb", descriptor = "I")
    private int field3596 = -1;

    @OriginalMember(owner = "client!rd", name = "eb", descriptor = "I")
    private int field3588;

    @OriginalMember(owner = "client!rd", name = "gb", descriptor = "Lt;")
    private class206 field3590;

    @OriginalMember(owner = "client!rd", name = "ob", descriptor = "Lt;")
    private class206 field3598;

    @OriginalMember(owner = "client!rd", name = "jb", descriptor = "Z")
    public static boolean field3593 = true;

    @OriginalMember(owner = "client!rd", name = "fb", descriptor = "Lqe;")
    public static class168 field3589 = class66.method448("<col=ff3000>", -109);

    @OriginalMember(owner = "client!rd", name = "tb", descriptor = "I")
    public static int field3603 = 0;

    @OriginalMember(owner = "client!rd", name = "ib", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!rd", name = "lb", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!rd", name = "nb", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!rd", name = "pb", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!rd", name = "qb", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!rd", name = "rb", descriptor = "I")
    private int field3601;

    @OriginalMember(owner = "client!rd", name = "sb", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!rd", name = "ub", descriptor = "I")
    private int field3604;

    @OriginalMember(owner = "client!rd", name = "vb", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!rd", name = "wb", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!rd", name = "xb", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "[Z")
    private volatile boolean[] field3587;

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lt;Lt;IZZZ)V")
    public class207(class206 arg0, class206 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3594 = arg5;
        this.field3588 = arg2;
        this.field3590 = arg0;
        this.field3598 = arg1;
        class245.method1605((byte) -124, this.field3588, this);
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(II)V")
    public final void method1338(int arg0, int arg1) {
        ++field3599;
        if (this.method1703(124, arg1)) {
            int var3 = 92 % ((-54 - arg0) / 44);
            if (this.field3590 != null && this.field3587 != null && this.field3587[arg1]) {
                class130.method884(this, -29023, this.field3590, arg1);
            } else {
                class108.method707(arg1, (byte) 2, 122, this.field3588, this, true, super.field4462[arg1]);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(II)I")
    public final int method1339(int arg0, int arg1) {
        ++field3605;
        if (!this.method1703(126, arg1)) {
            return 0;
        } else if (arg0 != 0) {
            return -95;
        } else if (super.field4470[arg1] != null) {
            return 100;
        } else {
            return this.field3587[arg1] ? 100 : class138.method945(arg1, this.field3588, false);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(BII)V")
    public final void method1340(byte arg0, int arg1, int arg2) {
        this.field3604 = arg2;
        this.field3601 = arg1;
        ++field3607;
        if (arg0 != -98) {
            field3593 = true;
        }
        if (this.field3598 != null) {
            class130.method884(this, -29023, this.field3598, this.field3588);
        } else {
            class108.method707(this.field3588, (byte) 0, 75, 255, this, true, this.field3601);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI[BIZ)V")
    public final void method1341(boolean arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        ++field3602;
        if (arg1 != 355362984) {
            this.method1343((byte) 53, 107);
        }
        if (!arg0) {
            arg2[arg2.length + -2] = (byte) (super.field4452[arg3] >> 8);
            arg2[arg2.length + -1] = (byte) super.field4452[arg3];
            if (this.field3590 != null) {
                class94.method618(arg3, this.field3590, 91, arg2);
                this.field3587[arg3] = true;
            }
            if (arg4) {
                super.field4470[arg3] = class91.method607(false, arg2, false);
                return;
            }
        } else {
            if (this.field3591) {
                throw new RuntimeException();
            }
            if (this.field3598 != null) {
                class94.method618(this.field3588, this.field3598, 69, arg2);
            }
            this.method1693(89, arg2);
            this.method1344((byte) 98);
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
    public static void method1342(int arg0) {
        if (arg0 >= -5) {
            field3595 = 55;
        }
        field3589 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)V")
    public final void method1343(byte arg0, int arg1) {
        ++field3600;
        if (this.method1703(127, arg1)) {
            class74.method499((byte) -120, arg1, this.field3588);
            if (arg0 != -62) {
                this.method1341(true, -75, (byte[]) null, -63, true);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
    private final void method1344(byte arg0) {
        ++field3597;
        this.field3587 = new boolean[super.field4470.length];
        if (arg0 != 98) {
            this.method1343((byte) -65, 39);
        }
        for (int var2 = 0; var2 < this.field3587.length; ++var2) {
            this.field3587[var2] = false;
        }
        if (this.field3590 == null) {
            this.field3591 = true;
        } else {
            this.field3596 = -1;
            for (int var3 = 0; var3 < this.field3587.length; ++var3) {
                if (~super.field4437[var3] < -1) {
                    class244.method1602(128, this, var3, this.field3590);
                    this.field3596 = var3;
                }
            }
            if (~this.field3596 == 0) {
                this.field3591 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)I")
    public final int method1345(int arg0) {
        ++field3592;
        if (this.field3591) {
            return 100;
        } else if (super.field4470 != null) {
            return 99;
        } else {
            if (arg0 != -4763) {
                this.method1343((byte) -127, -128);
            }
            int var2 = class138.method945(this.field3588, 255, false);
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[BLt;ZI)V")
    public final void method1346(int arg0, byte[] arg1, class206 arg2, boolean arg3, int arg4) {
        ++field3606;
        if (this.field3598 != arg2) {
            if (!arg3 && ~this.field3596 == ~arg4) {
                this.field3591 = true;
            }
            if (arg1 == null || ~arg1.length >= -3) {
                this.field3587[arg4] = false;
                if (this.field3594 || arg3) {
                    class108.method707(arg4, (byte) 2, arg0 ^ -158, this.field3588, this, arg3, super.field4462[arg4]);
                }
                return;
            }
            class93.field1463.reset();
            class93.field1463.update(arg1, 0, arg1.length - 2);
            int var6 = (int) class93.field1463.getValue();
            int var7 = ((arg1[arg1.length + -2] & 255) << 8) + (arg1[arg1.length - 1] & 255);
            if (~super.field4462[arg4] != ~var6 || super.field4452[arg4] != var7) {
                this.field3587[arg4] = false;
                if (this.field3594 || arg3) {
                    class108.method707(arg4, (byte) 2, -72, this.field3588, this, arg3, super.field4462[arg4]);
                }
                return;
            }
            this.field3587[arg4] = true;
            if (arg3) {
                super.field4470[arg4] = class91.method607(false, arg1, false);
            }
        } else {
            if (this.field3591) {
                throw new RuntimeException();
            }
            if (arg1 == null) {
                class108.method707(this.field3588, (byte) 0, -92, 255, this, true, this.field3601);
                return;
            }
            class93.field1463.reset();
            class93.field1463.update(arg1, 0, arg1.length);
            int var8 = (int) class93.field1463.getValue();
            if (this.field3601 != var8) {
                class108.method707(this.field3588, (byte) 0, -64, 255, this, true, this.field3601);
                return;
            }
            class112 var9;
            try {
                var9 = new class112(class194.method1258(109, arg1));
            } catch (RuntimeException var12) {
                class108.method707(this.field3588, (byte) 0, 86, 255, this, true, this.field3601);
                return;
            }
            int var10 = var9.method758(true);
            if (var10 != 5 && var10 != 6) {
                class108.method707(this.field3588, (byte) 0, arg0 + -169, 255, this, true, this.field3601);
                return;
            }
            int var11 = 0;
            if (var10 >= 6) {
                var11 = var9.method769((byte) -86);
            }
            if (this.field3604 != var11) {
                class108.method707(this.field3588, (byte) 0, -66, 255, this, true, this.field3601);
                return;
            }
            this.method1693(-106, arg1);
            this.method1344((byte) 98);
        }
        if (arg0 != 255) {
            this.method1343((byte) -49, 79);
        }
    }
}
