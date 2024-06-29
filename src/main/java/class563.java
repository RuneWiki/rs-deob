import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class563 extends class92 {

    @OriginalMember(owner = "client!et", name = "C", descriptor = "F")
    private float field8075 = 0.0F;

    @OriginalMember(owner = "client!et", name = "q", descriptor = "Lom;")
    private class331 field8063;

    @OriginalMember(owner = "client!et", name = "s", descriptor = "Lml;")
    public static class36 field8065 = new class36("LIVE", 0);

    @OriginalMember(owner = "client!et", name = "B", descriptor = "F")
    public static float field8074 = 0.0F;

    @OriginalMember(owner = "client!et", name = "r", descriptor = "I")
    public static int field8064;

    @OriginalMember(owner = "client!et", name = "t", descriptor = "I")
    public static int field8066;

    @OriginalMember(owner = "client!et", name = "u", descriptor = "I")
    public static int field8067;

    @OriginalMember(owner = "client!et", name = "v", descriptor = "I")
    public static int field8068;

    @OriginalMember(owner = "client!et", name = "w", descriptor = "I")
    public static int field8069;

    @OriginalMember(owner = "client!et", name = "y", descriptor = "I")
    public static int field8071;

    @OriginalMember(owner = "client!et", name = "z", descriptor = "I")
    public static int field8072;

    @OriginalMember(owner = "client!et", name = "A", descriptor = "I")
    public static int field8073;

    @OriginalMember(owner = "client!et", name = "D", descriptor = "I")
    public static int field8076;

    @OriginalMember(owner = "client!et", name = "E", descriptor = "I")
    public static int field8077;

    @OriginalMember(owner = "client!et", name = "x", descriptor = "[[B")
    public static byte[][] field8070;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(JI)V", line = 4)
    public static final void method3209(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
            if (arg1 != -10003) {
                field8074 = 1.0438769F;
            }
        } catch (InterruptedException var3) {
        }
        ++field8064;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ZB)V", line = 18)
    public final void method671(boolean arg0, byte arg1) {
        super.field1635.method3645(1, (byte) 91);
        if (arg1 != 107) {
            field8070 = null;
        }
        ++field8073;
        super.field1635.method3583(false, class211.field3065, class634.field9219);
        super.field1635.method97(false, true, 8, class477.field6813, 0);
        super.field1635.method3570(class554.field7834, 0, (byte) 89);
        super.field1635.method102((byte) -125, 0);
        super.field1635.method3645(0, (byte) 91);
        super.field1635.method3574(false, -16777216);
        super.field1635.method3570(class104.field1753, 0, (byte) 95);
        this.method816(1);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)Z", line = 38)
    public final boolean method673(int arg0) {
        ++field8069;
        if (arg0 != -1) {
            this.method669((byte) 108);
        }
        return this.field8063.method2051(128);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ZII)V", line = 51)
    public final void method675(boolean arg0, int arg1, int arg2) {
        super.field1635.method3645(1, (byte) 91);
        if (!arg0) {
            field8065 = null;
        }
        ++field8068;
        if ((128 & arg2) == 0) {
            if (~(arg1 & 1) == -2) {
                if (!this.field8063.field4752) {
                    int var4 = super.field1635.field9162 % 4000 * 16 / 4000;
                    super.field1635.method3577(this.field8063.field4755[var4], true);
                } else {
                    this.field8075 = (float) (super.field1635.field9162 % 4000) / 4000.0F;
                    super.field1635.method3577(this.field8063.field4750, true);
                }
            } else if (!this.field8063.field4752) {
                super.field1635.method3577(this.field8063.field4755[0], true);
            } else {
                super.field1635.method3577(this.field8063.field4750, true);
            }
        } else {
            super.field1635.method3577((class96) null, true);
        }
        super.field1635.method3645(0, (byte) 91);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(III)Z", line = 95)
    public static final boolean method3210(int arg0, int arg1, int arg2) {
        if (arg1 >= 0) {
            method3212((byte) -125);
        }
        ++field8066;
        return false;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(B)V", line = 112)
    public final void method669(byte arg0) {
        super.field1635.method3645(1, (byte) 91);
        ++field8077;
        super.field1635.method3583(false, class635.field9225, class635.field9225);
        super.field1635.method3601(-120, class477.field6813, 0);
        super.field1635.method3570(class477.field6813, 0, (byte) 31);
        super.field1635.method102((byte) -128, 1);
        if (arg0 <= 55) {
            this.method672(-50, 89, (class96) null);
        }
        super.field1635.method3577((class96) null, true);
        super.field1635.method3645(0, (byte) 91);
        super.field1635.method3570(class477.field6813, 0, (byte) -67);
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V", line = 131)
    public final void method816(int arg0) {
        if (~super.field1635.method3643((byte) -125) == -1) {
            class516 var2 = super.field1635.method3632(14310);
            super.field1635.method3645(1, (byte) 91);
            class516 var3 = super.field1635.method3595((byte) 40);
            var3.method878(var2);
            var3.method2901(-125, 0.125F, 0.125F, 1.0F);
            var3.method2905(0.0F, arg0 + -112, 0.0F, this.field8075);
            super.field1635.method3616(class235.field3448, (byte) 94);
            super.field1635.method3645(0, (byte) 91);
        }
        if (arg0 != 1) {
            this.field8075 = -0.10717477F;
        }
        ++field8076;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(III)Z", line = 155)
    public static final boolean method3211(int arg0, int arg1, int arg2) {
        if (arg1 != 52) {
            return false;
        } else {
            ++field8067;
            return (arg0 & 52) != 0;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IILqv;)V", line = 167)
    public final void method672(int arg0, int arg1, class96 arg2) {
        ++field8071;
        super.field1635.method3577(arg2, true);
        if (arg0 != 0) {
            this.field8075 = -0.44336417F;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ZI)V", line = 181)
    public final void method676(boolean arg0, int arg1) {
        if (arg1 > -65) {
            field8065 = null;
        }
        super.field1635.method3583(false, class635.field9225, class634.field9219);
        ++field8072;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lnd;Lom;)V", line = 194)
    public class563(class632 arg0, class331 arg1) {
        super(arg0);
        this.field8063 = arg1;
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(B)V", line = 202)
    public static void method3212(byte arg0) {
        int var1 = 81 / ((-5 - arg0) / 53);
        field8065 = null;
        field8070 = null;
    }
}
