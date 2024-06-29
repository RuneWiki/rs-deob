import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class260 extends class325 {

    @OriginalMember(owner = "client!gt", name = "J", descriptor = "I")
    private int field3711 = -1;

    @OriginalMember(owner = "client!gt", name = "W", descriptor = "I")
    private int field3724 = 0;

    @OriginalMember(owner = "client!gt", name = "v", descriptor = "I")
    private int field3698 = -32768;

    @OriginalMember(owner = "client!gt", name = "Z", descriptor = "I")
    private int field3727 = 0;

    @OriginalMember(owner = "client!gt", name = "jb", descriptor = "Z")
    private boolean field3737 = false;

    @OriginalMember(owner = "client!gt", name = "ib", descriptor = "I")
    public int field3736;

    @OriginalMember(owner = "client!gt", name = "O", descriptor = "I")
    public int field3716;

    @OriginalMember(owner = "client!gt", name = "db", descriptor = "I")
    private int field3731;

    @OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
    private int field3714;

    @OriginalMember(owner = "client!gt", name = "B", descriptor = "I")
    public int field3704;

    @OriginalMember(owner = "client!gt", name = "Q", descriptor = "I")
    private int field3718;

    @OriginalMember(owner = "client!gt", name = "T", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!gt", name = "cb", descriptor = "Lqp;")
    private class303 field3730;

    @OriginalMember(owner = "client!gt", name = "R", descriptor = "Lap;")
    public static class310 field3719 = new class310(43, -1);

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "D")
    private double field3702;

    @OriginalMember(owner = "client!gt", name = "C", descriptor = "D")
    private double field3705;

    @OriginalMember(owner = "client!gt", name = "H", descriptor = "D")
    private double field3709;

    @OriginalMember(owner = "client!gt", name = "I", descriptor = "D")
    private double field3710;

    @OriginalMember(owner = "client!gt", name = "V", descriptor = "D")
    private double field3723;

    @OriginalMember(owner = "client!gt", name = "bb", descriptor = "D")
    private double field3729;

    @OriginalMember(owner = "client!gt", name = "eb", descriptor = "D")
    private double field3732;

    @OriginalMember(owner = "client!gt", name = "fb", descriptor = "D")
    private double field3733;

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!gt", name = "x", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!gt", name = "A", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!gt", name = "D", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!gt", name = "E", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!gt", name = "F", descriptor = "I")
    private int field3708;

    @OriginalMember(owner = "client!gt", name = "K", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!gt", name = "L", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!gt", name = "N", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!gt", name = "P", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!gt", name = "S", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!gt", name = "U", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!gt", name = "X", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!gt", name = "Y", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!gt", name = "gb", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!gt", name = "hb", descriptor = "I")
    private int field3735;

    @OriginalMember(owner = "client!gt", name = "ab", descriptor = "Lan;")
    private class113 field3728;

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field3736 = arg9;
        this.field3737 = false;
        this.field3716 = arg10;
        this.field3731 = arg8;
        this.field3714 = arg0;
        this.field3704 = arg6;
        this.field3718 = arg7;
        this.field3721 = arg5;
        int var12 = class371.field5108.method1664(this.field3714, 97).field3129;
        if (~var12 != 0) {
            this.field3730 = class386.field5289.method1856(90, var12);
        } else {
            this.field3730 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)Z")
    public final boolean method68(int arg0) {
        int var2 = 53 % ((2 - arg0) / 57);
        ++field3706;
        return false;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILae;)Ljava/lang/String;")
    public static final String method1746(int arg0, class172 arg1) {
        ++field3734;
        if (arg0 == ~client.method547(arg1).method879(arg0 + 24469)) {
            return null;
        } else if (arg1.field2561 != null && ~arg1.field2561.trim().length() != -1) {
            return arg1.field2561;
        } else {
            return class79.field1162 ? "Hidden-use" : null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
    public static void method1747(byte arg0) {
        if (arg0 <= -45) {
            field3719 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIII)V")
    public final void method1748(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3701;
        if (!this.field3737) {
            double var6 = (double) (-super.field4537 + arg2);
            double var8 = (double) (-super.field4530 + arg1);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3705 = (double) this.field3731 * var8 / var10 + (double) super.field4530;
            this.field3710 = (double) this.field3731 * var6 / var10 + (double) super.field4537;
            this.field3702 = (double) super.field4532;
        }
        double var12 = (double) (this.field3704 + 1 + -arg4);
        this.field3733 = ((double) arg2 - this.field3710) / var12;
        this.field3732 = ((double) arg1 + -this.field3705) / var12;
        this.field3709 = Math.sqrt(this.field3733 * this.field3733 + this.field3732 * this.field3732);
        if (~this.field3718 == arg0) {
            this.field3723 = ((double) arg3 + -this.field3702) / var12;
        } else {
            if (!this.field3737) {
                this.field3723 = -this.field3709 * Math.tan((double) this.field3718 * 0.02454369D);
            }
            this.field3729 = ((double) arg3 - this.field3702 - this.field3723 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)V")
    public final void method1749(int arg0, byte arg1) {
        if (arg1 == 87) {
            this.field3705 += (double) arg0 * this.field3732;
            if (this.field3718 != -1) {
                this.field3702 += this.field3729 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field3723;
                this.field3723 += (double) arg0 * this.field3729;
            } else {
                this.field3702 += (double) arg0 * this.field3723;
            }
            this.field3737 = true;
            this.field3710 += (double) arg0 * this.field3733;
            ++field3712;
            this.field3735 = 8192 + (int) (2607.5945876176133D * Math.atan2(this.field3733, this.field3732)) & 16383;
            this.field3708 = 16383 & (int) (Math.atan2(this.field3723, this.field3709) * 2607.5945876176133D);
            if (this.field3730 != null) {
                this.field3727 += arg0;
                while (true) {
                    do {
                        do {
                            if (~this.field3730.field4283[this.field3724] <= ~this.field3727) {
                                return;
                            }
                            this.field3727 -= this.field3730.field4283[this.field3724];
                            ++this.field3724;
                            if (~this.field3724 <= ~this.field3730.field4286.length) {
                                this.field3724 -= this.field3730.field4304;
                                if (~this.field3724 > -1 || this.field3730.field4286.length <= this.field3724) {
                                    this.field3724 = 0;
                                }
                            }
                            this.field3711 = this.field3724 + 1;
                        } while (~this.field3711 > ~this.field3730.field4286.length);
                        this.field3711 -= this.field3730.field4304;
                    } while (this.field3711 >= 0 && this.field3711 < this.field3730.field4286.length);
                    this.field3711 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(ZLvc;)V")
    public final void method86(boolean arg0, class89 arg1) {
        ++field3707;
        class468 var3 = this.method1751(arg1, 0, 0);
        if (var3 != null) {
            class257 var4 = arg1.method306();
            var4.method106(this.field3708);
            var4.method102(this.field3735);
            var4.method107((int) this.field3710, (int) this.field3702, (int) this.field3705);
            if (arg0) {
                this.method1749(-120, (byte) -21);
            }
            this.field3698 = var3.method1591();
            this.method1752(15383, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(B)V")
    public final void method75(byte arg0) {
        if (arg0 == 111) {
            ++field3713;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILvc;II)Z")
    public final boolean method77(int arg0, class89 arg1, int arg2, int arg3) {
        ++field3720;
        return arg0 != 0;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
    public final void method1750(int arg0) {
        if (this.field3728 != null) {
            this.field3728.method893();
        }
        if (arg0 == -11264) {
            ++field3722;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lvc;II)Ln;")
    private final class468 method1751(class89 arg0, int arg1, int arg2) {
        ++field3725;
        if (arg2 != 0) {
            this.field3704 = -45;
        }
        class217 var4 = class371.field5108.method1664(this.field3714, -114);
        return var4.method1495((byte) 78, this.field3724, arg1, this.field3711, class386.field5289, arg0, this.field3727);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lvc;I)Lep;")
    public final class309 method69(class89 arg0, int arg1) {
        ++field3703;
        class468 var3 = this.method1751(arg0, 1024, 0);
        if (var3 == null) {
            return null;
        } else {
            class257 var4 = arg0.method306();
            var4.method106(this.field3708);
            var4.method102(this.field3735);
            var4.method107((int) this.field3710, (int) this.field3702, (int) this.field3705);
            if (arg1 != 10228) {
                return null;
            } else {
                if (this.field3728 != null) {
                    class404 var5 = this.field3728.method896();
                    arg0.method384(var3, var5, var4, (class63) null, 0);
                } else {
                    var3.method1592(var4, (class63) null, 0);
                }
                this.field3698 = var3.method1591();
                this.method1752(15383, arg0, var3);
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILvc;Ln;)V")
    private final void method1752(int arg0, class89 arg1, class468 arg2) {
        ++field3700;
        class295[] var4 = arg2.method1601();
        class235[] var5 = arg2.method1564();
        if (arg0 != 15383) {
            this.field3708 = 93;
        }
        if ((this.field3728 == null || this.field3728.field1578) && (var4 != null || var5 != null)) {
            this.field3728 = new class113(class364.field5010);
        }
        if (this.field3728 != null) {
            this.field3728.method891(arg1, (long) class364.field5010, var4, var5, false);
            this.field3728.method895(super.field4531, super.field4535, super.field4526, super.field4539, super.field4534);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)V")
    public final void method1753(boolean arg0) {
        if (!arg0) {
            this.method77(70, (class89) null, -19, 49);
        }
        ++field3699;
        super.field4535 = super.field4526 = (short) ((int) (this.field3710 / 128.0D));
        super.field4539 = super.field4534 = (short) ((int) (this.field3705 / 128.0D));
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZILvc;IILuq;I)V")
    public final void method70(boolean arg0, int arg1, class89 arg2, int arg3, int arg4, class316 arg5, int arg6) {
        if (arg1 <= 40) {
            this.method1748(8, 5, -63, 43, -50);
        }
        ++field3715;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "(B)I")
    public final int method251(byte arg0) {
        ++field3726;
        if (arg0 != 5) {
            this.field3710 = 0.6959324645830919D;
        }
        return this.field3698;
    }

    @OriginalMember(owner = "client!gt", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field3717;
        if (this.field3728 != null) {
            this.field3728.method893();
        }
    }
}
