import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class254 extends class601 {

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Z")
    public boolean field3064 = false;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "Z")
    private boolean field3066 = true;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Lda;")
    public static class59 field3055;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(IZ)V")
    public final void method1510(int arg0, boolean arg1) {
        ++field3054;
        if (arg0 != 2) {
            field3055 = null;
        }
        this.field3066 = arg1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3062;
        int var9 = 53 % ((arg3 - -5) / 40);
        class514.field7327[class410.field5607++] = new class464(arg5, arg2, arg1, arg4, arg4, arg1, arg6, arg0, arg0, arg6, arg7, arg7, arg8, arg8);
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lgn;)V")
    public class254(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)I")
    public final int method1512(int arg0) {
        int var2 = -86 % ((arg0 - -59) / 61);
        ++field3058;
        return super.field8565;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZILdia;)V")
    public static final void method1513(boolean arg0, int arg1, class233 arg2) {
        if (arg1 == -1) {
            ++field3059;
            class167.field1857.method108(arg2, -121);
            if (arg0) {
                class687.method3885(class266.field3304, class167.field1857, class88.field921, class296.field3674, (byte) 66, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public final void method35(byte arg0) {
        if (!super.field8563.method3928((byte) -124).method972(1)) {
            super.field8565 = 0;
        }
        ++field3060;
        if (arg0 >= -37) {
            this.field3066 = true;
        }
        if (super.field8565 < 0 || ~super.field8565 < -6) {
            super.field8565 = this.method39((byte) -17);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)I")
    public final int method34(int arg0, int arg1) {
        ++field3061;
        if (!super.field8563.method3928((byte) -127).method972(arg1 + -15705)) {
            return 3;
        } else {
            if (arg1 != 15706) {
                field3055 = null;
            }
            return arg0 == 3 && class144.method898("jagdx", 0) == null ? 3 : 2;
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(ILgn;)V")
    public class254(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ)V")
    public final void method40(int arg0, boolean arg1) {
        ++field3063;
        this.field3064 = arg1;
        super.field8565 = arg0;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V")
    public static void method1514(byte arg0) {
        int var1 = -21 / ((61 - arg0) / 45);
        field3055 = null;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)Z")
    public final boolean method1515(int arg0) {
        ++field3056;
        return arg0 != 0 ? true : this.field3066;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)I")
    public final int method39(byte arg0) {
        this.field3064 = true;
        ++field3065;
        if (arg0 != -17) {
            this.method1510(-8, false);
        }
        return !super.field8563.method3928((byte) -127).method972(arg0 + 18) ? 0 : 2;
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)V")
    public static final void method1516(byte arg0) {
        ++field3057;
        if (arg0 <= 33) {
            method1516((byte) -45);
        }
        class40.method245(8, false);
        if (class340.field4399 >= 0 && ~class340.field4399 != -1) {
            class627.method3597(false, class340.field4399, -31618);
            class340.field4399 = -1;
        }
    }
}
