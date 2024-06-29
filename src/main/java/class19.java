import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class19 extends class280 {

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "S")
    public short field181;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "Lwg;")
    public static class613 field179 = new class613();

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "F")
    public static float field187;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "[I")
    public static int[] field185;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)Z", line = 3)
    public final boolean method88(int arg0) {
        if (arg0 != -1) {
            return true;
        } else {
            ++field183;
            return class564.method3378(8, super.field3923 >> class639.field9095, super.field3924, super.field3916 >> class639.field9095, this);
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(Z)V", line = 17)
    public static void method89(boolean arg0) {
        if (arg0) {
            field187 = 0.2446314F;
        }
        field179 = null;
        field185 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[Lwh;)I", line = 29)
    public final int method90(int arg0, class40[] arg1) {
        ++field182;
        int var3 = super.field3923 >> class639.field9095;
        int var4 = super.field3916 >> class639.field9095;
        int var5 = 0;
        if (~class613.field8757 != ~var3) {
            if (~var3 < ~class613.field8757) {
                var5 += 2;
            }
        } else {
            ++var5;
        }
        if (class140.field1915 != var4) {
            if (var4 < class140.field1915) {
                var5 += 6;
            }
        } else {
            var5 += 3;
        }
        int var6 = class534.field7777[var5];
        if ((var6 & this.field181) != 0) {
            return this.method1794(var3, arg1, -1, var4);
        } else if (this.field181 == 1 && ~var3 < -1) {
            return this.method1794(var3 + -1, arg1, -1, var4);
        } else {
            if (arg0 != -1) {
                field185 = null;
            }
            if (~this.field181 == -5 && class439.field6264 >= var3) {
                return this.method1794(var3 + 1, arg1, arg0, var4);
            } else if (~this.field181 == -9 && ~var4 < -1) {
                return this.method1794(var3, arg1, -1, var4 + -1);
            } else if (this.field181 == 2 && class408.field5806 >= var4) {
                return this.method1794(var3, arg1, -1, var4 + 1);
            } else if (this.field181 == 16 && var3 > 0 && ~class408.field5806 <= ~var4) {
                return this.method1794(var3 + -1, arg1, -1, var4 - -1);
            } else if (~this.field181 == -33 && var3 <= class439.field6264 && ~var4 >= ~class408.field5806) {
                return this.method1794(var3 + 1, arg1, -1, var4 + 1);
            } else if (this.field181 == 128 && ~var3 < -1 && ~var4 < -1) {
                return this.method1794(var3 + -1, arg1, -1, var4 + -1);
            } else if (this.field181 == 64 && ~class439.field6264 <= ~var3 && var4 > 0) {
                return this.method1794(var3 + 1, arg1, arg0, var4 + -1);
            } else {
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(JJ)J", line = 114)
    public static long method91(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(B)Z", line = 123)
    public final boolean method92(byte arg0) {
        if (arg0 <= 16) {
            this.method90(41, (class40[]) null);
        }
        ++field180;
        return class437.field6237[(super.field3923 >> class639.field9095) + class430.field6190 - class613.field8757][(super.field3916 >> class639.field9095) + -class140.field1915 + class430.field6190];
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BII)Ljava/lang/String;", line = 134)
    public static final String method93(byte arg0, int arg1, int arg2) {
        ++field186;
        int var3 = -arg1 + arg2;
        if (~var3 > 8) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else {
            if (arg0 != -105) {
                field187 = -0.23705018F;
            }
            if (var3 < -3) {
                return "<col=ff7000>";
            } else if (var3 < 0) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (~var3 < -4) {
                return "<col=80ff00>";
            } else {
                return var3 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(IIIIII)V", line = 177)
    public class19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field3924 = (byte) arg4;
        super.field3920 = (byte) arg3;
        super.field3922 = arg1;
        this.field181 = (short) arg5;
        super.field3923 = arg0;
        super.field3916 = arg2;
    }

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "(I)V", line = 190)
    public static final void method94(int arg0) {
        ++field184;
        class172.field2412.method2219(-5300);
        class207.field3137.method2219(-5300);
        if (arg0 != -23829) {
            field179 = null;
        }
        class445.field6357.method2219(-5300);
        class56.field960.method2219(arg0 + 18529);
    }
}
