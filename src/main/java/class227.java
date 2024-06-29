import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class227 extends class207 {

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "[F")
    public static float[] field2931 = new float[4];

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static volatile int field2935 = -1;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Ljb;")
    public static class519 field2934 = new class519(21, 2);

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "F")
    public static float field2936;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Lal;")
    public static class109 field2929;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "[[I")
    public static int[][] field2932;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)V", line = 3)
    public final void method41(int arg0, byte arg1) {
        ++field2930;
        if (arg1 < -7) {
            super.field2669 = arg0;
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)I", line = 15)
    public final int method1438(int arg0) {
        ++field2937;
        if (arg0 != 43) {
            field2932 = null;
        }
        return super.field2669;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(IB)I", line = 29)
    public final int method39(int arg0, byte arg1) {
        ++field2938;
        if (super.field2668.method2248(false) == class743.field10050) {
            if (super.field2668.method2254(37)) {
                return 3;
            } else {
                return ~arg0 != -1 && super.field2668.field5147.method3686(43) != 1 ? 2 : 1;
            }
        } else {
            if (arg1 != 69) {
                this.method1440((byte) 63);
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(ILrd;)V", line = 54)
    public class227(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lrd;)V", line = 61)
    public class227(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)I", line = 65)
    public final int method36(int arg0) {
        if (arg0 >= -14) {
            this.method36(123);
        }
        ++field2940;
        return 1;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V", line = 80)
    public static void method1439(int arg0) {
        field2932 = null;
        int var1 = -8 % ((-70 - arg0) / 43);
        field2934 = null;
        field2929 = null;
        field2931 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 99)
    public final void method37(int arg0) {
        int var2 = 36 / ((-58 - arg0) / 48);
        ++field2933;
        if (super.field2668.method2248(false) != class743.field10050) {
            super.field2669 = 1;
        } else if (super.field2668.method2254(42)) {
            super.field2669 = 0;
        }
        if (~super.field2669 != -1 && ~super.field2669 != -2) {
            super.field2669 = this.method36(-72);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)Z", line = 119)
    public final boolean method1440(byte arg0) {
        ++field2939;
        if (super.field2668.method2248(false) == class743.field10050) {
            return !super.field2668.method2254(arg0 + 69);
        } else {
            return arg0 != 8 ? false : false;
        }
    }
}
