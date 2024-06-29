import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class234 extends class331 {

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field3023 = 0;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)I", line = 3)
    public final int method1472(byte arg0) {
        if (arg0 >= -119) {
            field3023 = 107;
        }
        ++field3022;
        return super.field4202;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(ILts;)V", line = 17)
    public class234(int arg0, class41 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)I", line = 20)
    public final int method226(byte arg0) {
        if (arg0 != 13) {
            this.method224(-97);
        }
        ++field3024;
        return 1;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)V", line = 31)
    public final void method227(int arg0, int arg1) {
        if (arg0 > 113) {
            super.field4202 = arg1;
            ++field3021;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 42)
    public final void method224(int arg0) {
        if (arg0 == -1959) {
            if (super.field4202 != 1 && super.field4202 != 0) {
                super.field4202 = this.method226((byte) 13);
            }
            ++field3020;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)I", line = 59)
    public final int method222(int arg0, int arg1) {
        ++field3026;
        if (arg1 != 1) {
            this.method222(45, -95);
        }
        return 1;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lts;)V", line = 77)
    public class234(class41 arg0) {
        super(arg0);
    }
}
