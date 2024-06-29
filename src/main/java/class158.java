import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class158 extends class606 {

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "F")
    private float field2195 = 0.0F;

    @OriginalMember(owner = "client!aq", name = "z", descriptor = "Lic;")
    private class698 field2200;

    @OriginalMember(owner = "client!aq", name = "t", descriptor = "Lqfa;")
    public static class98 field2194 = new class98(53, -2);

    @OriginalMember(owner = "client!aq", name = "A", descriptor = "[I")
    public static int[] field2201 = new int[1];

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!aq", name = "v", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!aq", name = "w", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!aq", name = "x", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!aq", name = "y", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lma;II)V", line = 3)
    public final void method523(class12 arg0, int arg1, int arg2) {
        super.field8525.method1663(arg0, -2);
        ++field2189;
        if (arg2 != 3) {
            this.field2200 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(B)V", line = 14)
    public final void method1052(byte arg0) {
        ++field2199;
        if (super.field8525.method1655((byte) 123) == 0) {
            class328 var2 = super.field8525.method1658(false);
            super.field8525.method1648(1, (byte) 66);
            class328 var3 = super.field8525.method1593(122);
            var3.method344(var2);
            var3.method2138(0.125F, 0.125F, 16383, 1.0F);
            var3.method2132(0.0F, this.field2195, (byte) 86, 0.0F);
            super.field8525.method1600((byte) 95, class224.field3006);
            super.field8525.method1648(0, (byte) 66);
        }
        if (arg0 != -122) {
            this.field2200 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V", line = 41)
    public final void method521(byte arg0) {
        super.field8525.method1648(1, (byte) 66);
        int var2 = -84 % ((arg0 - -26) / 56);
        ++field2193;
        super.field8525.method1613(-30, class502.field7202, class502.field7202);
        super.field8525.method1664((byte) -116, class597.field8397, 0);
        super.field8525.method1601(class597.field8397, 0, 256);
        super.field8525.method1430(1, (byte) 70);
        super.field8525.method1663((class12) null, -2);
        super.field8525.method1648(0, (byte) 66);
        super.field8525.method1601(class597.field8397, 0, 256);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIII)V", line = 61)
    public static final void method1053(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 << arg1;
        int var5 = arg0 << 3;
        ++field2196;
        int var6 = arg2 << 3;
        if (~class97.field1168 == -3) {
            class707.field9813 = var5;
            class720.field9994 = var6;
            class187.field2514 = var4;
        }
        class2.field19 = (float) var4;
        class552.field7773 = (float) var6;
        class401.method2509(73);
        class69.field847 = true;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZI)V", line = 85)
    public final void method517(boolean arg0, int arg1) {
        ++field2192;
        super.field8525.method1648(1, (byte) 66);
        super.field8525.method1613(-30, class170.field2330, class719.field9987);
        super.field8525.method1450(false, class597.field8397, 0, true, false);
        super.field8525.method1601(class240.field3203, 0, 256);
        super.field8525.method1430(0, (byte) 70);
        super.field8525.method1648(0, (byte) 66);
        super.field8525.method1640(true, -16777216);
        super.field8525.method1601(class679.field9315, 0, 256);
        if (arg1 < -64) {
            this.method1052((byte) -122);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(III)V", line = 105)
    public final void method516(int arg0, int arg1, int arg2) {
        super.field8525.method1648(1, (byte) 66);
        ++field2191;
        if ((128 & arg2) == 0) {
            if ((arg0 & 1) != 1) {
                if (!this.field2200.field9625) {
                    super.field8525.method1663(this.field2200.field9622[0], -2);
                } else {
                    super.field8525.method1663(this.field2200.field9629, -2);
                }
            } else if (this.field2200.field9625) {
                this.field2195 = (float) (super.field8525.field3567 % 4000) / 4000.0F;
                super.field8525.method1663(this.field2200.field9629, -2);
            } else {
                int var4 = super.field8525.field3567 % 4000 * 16 / 4000;
                super.field8525.method1663(this.field2200.field9622[var4], -2);
            }
        } else {
            super.field8525.method1663((class12) null, -2);
        }
        if (arg1 < 91) {
            method1054((byte) -29);
        }
        super.field8525.method1648(0, (byte) 66);
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)Z", line = 149)
    public final boolean method525(int arg0) {
        if (arg0 <= 19) {
            this.method518(32, false);
        }
        ++field2198;
        return this.field2200.method3925(-30571);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZ)V", line = 160)
    public final void method518(int arg0, boolean arg1) {
        if (arg0 != 5486) {
            field2194 = null;
        }
        ++field2190;
        super.field8525.method1613(-30, class502.field7202, class719.field9987);
    }

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "(B)V", line = 171)
    public static void method1054(byte arg0) {
        field2194 = null;
        field2201 = null;
        if (arg0 != 38) {
            field2194 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lsr;Lic;)V", line = 184)
    public class158(class251 arg0, class698 arg1) {
        super(arg0);
        this.field2200 = arg1;
    }

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "(I)V", line = 198)
    public static final void method1055(int arg0) {
        if (arg0 == 0) {
            ++field2197;
            class400.field5659.method4023((byte) -125);
        }
    }
}
