import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class680 extends class60 {

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    public static int field9309 = -1;

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
    public static int field9316 = 0;

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "[S")
    public static short[] field9317 = new short[256];

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "F")
    public static float field9313;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
    public static int field9310;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "I")
    public static int field9312;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
    public static int field9314;

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "I")
    public static int field9315;

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "I")
    public static int field9318;

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "I")
    public static int field9319;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)I", line = 4)
    public final int method406(int arg0, int arg1) {
        ++field9318;
        if (arg0 != 0) {
            this.method3823(-26);
        }
        return 1;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)I", line = 15)
    public final int method3823(int arg0) {
        ++field9319;
        if (arg0 != 0) {
            field9312 = -78;
        }
        return super.field799;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V", line = 31)
    public final void method409(byte arg0) {
        ++field9314;
        if (~super.field799 > -2 || ~super.field799 < -4) {
            super.field799 = this.method405(false);
        }
        if (arg0 >= -27) {
            field9313 = -0.9840198F;
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lhd;)V", line = 44)
    public class680(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lha;B)V", line = 50)
    public static final void method3824(class66 arg0, byte arg1) {
        ++field9311;
        if (arg1 != 92) {
            method3825((byte) 2);
        }
        if (!class35.field536) {
            class37.method323(arg1 ^ -164, arg0);
        } else {
            class412.method2458((byte) -115, arg0);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BI)V", line = 65)
    public final void method407(byte arg0, int arg1) {
        super.field799 = arg1;
        ++field9315;
        int var3 = 55 % ((28 - arg0) / 50);
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(B)V", line = 80)
    public static void method3825(byte arg0) {
        field9317 = null;
        int var1 = -3 / ((38 - arg0) / 51);
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(ILhd;)V", line = 91)
    public class680(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)I", line = 99)
    public final int method405(boolean arg0) {
        ++field9310;
        if (arg0) {
            return -97;
        } else {
            return super.field798.method4288(0).method1432(2) ? 3 : 2;
        }
    }
}
