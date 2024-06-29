import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public abstract class class699 extends class488 {

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "F")
    public static float field9881;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
    public static int field9880;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
    public static int field9882;

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "I")
    public static int field9883;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "I")
    public static int field9884;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "I")
    public static int field9885;

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "I")
    public static int field9886;

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "[Li;")
    public static class272[] field9887;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "([Lgga;I)I", line = 4)
    public final int method785(class332[] arg0, int arg1) {
        ++field9883;
        int var3 = 74 / ((arg1 - -87) / 32);
        return this.method2640((byte) 113, arg0, super.field6461 >> class52.field775, super.field6464 >> class52.field775);
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)V", line = 14)
    public final void method66(int arg0) {
        if (arg0 != -1) {
            method3927(-91, 22, 123, -58, 66, false);
        }
        ++field9880;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIZ)V", line = 26)
    public static final void method3927(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg5) {
            ++field9885;
            if (class301.field3698.field6628 != 0 && ~arg3 != -1 && ~class265.field3368 > -51 && ~arg1 != 0) {
                class572.field7993[class265.field3368++] = new class377((byte) 1, arg1, arg3, arg0, arg4, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "(B)Z", line = 44)
    public final boolean method79(byte arg0) {
        if (arg0 >= -26) {
            return false;
        } else {
            ++field9886;
            return false;
        }
    }

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "(B)Z", line = 55)
    public final boolean method786(byte arg0) {
        ++field9888;
        if (arg0 <= 111) {
            this.method785((class332[]) null, 62);
        }
        class138 var2 = class21.method146(super.field6470, super.field6461 >> class52.field775, super.field6464 >> class52.field775);
        return var2 != null && var2.field1786.field2242 ? class700.method3929(var2.field1786.method71(40) - -this.method71(-109), super.field6470, super.field6464 >> class52.field775, super.field6461 >> class52.field775, 27) : class455.method2433(super.field6470, super.field6461 >> class52.field775, -1, super.field6464 >> class52.field775);
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIII)V", line = 73)
    public class699(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field6470 = (byte) arg3;
        super.field6464 = arg2;
        super.field6461 = arg0;
        super.field6458 = arg1;
        super.field6456 = (byte) arg4;
    }

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "(I)Z", line = 86)
    public final boolean method787(int arg0) {
        ++field9884;
        return arg0 != 4095 ? false : class354.field4511[(super.field6461 >> class52.field775) - (class516.field7041 - class479.field6372)][(super.field6464 >> class52.field775) + -class204.field2599 + class479.field6372];
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V", line = 99)
    public static void method3928(int arg0) {
        field9887 = null;
        if (arg0 != 0) {
            method3928(71);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZIBLr;Llo;II)V", line = 111)
    public final void method77(boolean arg0, int arg1, byte arg2, class566 arg3, class488 arg4, int arg5, int arg6) {
        int var8 = -128 % ((-50 - arg2) / 55);
        ++field9882;
        throw new IllegalStateException();
    }
}
