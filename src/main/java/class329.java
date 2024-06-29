import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class329 extends class649 {

    @OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
    public static int field4860 = 0;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!eca", name = "i", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!eca", name = "j", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!eca", name = "k", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!eca", name = "l", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!eca", name = "m", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "(I)V", line = 4)
    public static final void method2123(int arg0) {
        class460.field6671 = null;
        class193.field3341 = null;
        class567.field8049 = null;
        class315.field4732 = null;
        class580.field8208 = null;
        class257.field4034 = null;
        class3.field16 = null;
        class466.field6800 = null;
        class683.field9660 = null;
        ++field4854;
        class236.field3788 = null;
        class74.field1105 = null;
        class140.field2197 = null;
        class548.field7818 = null;
        class70.field1088 = null;
        class611.field8619 = null;
        if (arg0 == 2) {
            class577.field8171 = null;
            class182.field3076 = null;
            class438.field6393 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IB)V", line = 33)
    public final void method129(int arg0, byte arg1) {
        if (arg1 >= -120) {
            field4860 = 79;
        }
        super.field9223 = arg0;
        ++field4853;
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lhs;)V", line = 46)
    public class329(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(ILhs;)V", line = 49)
    public class329(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "(I)I", line = 53)
    public final int method2124(int arg0) {
        if (arg0 != 3) {
            field4857 = -22;
        }
        ++field4855;
        return super.field9223;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)I", line = 66)
    public final int method135(int arg0) {
        int var2 = 40 % ((arg0 - -18) / 50);
        ++field4852;
        return 1;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Llw;I)I", line = 78)
    public static final int method2125(class233 arg0, int arg1) {
        if (arg1 != 6046) {
            field4857 = 74;
        }
        ++field4859;
        if (class121.field1864 == arg0) {
            return 6407;
        } else if (class238.field3830 == arg0) {
            return 6408;
        } else if (class215.field3556 == arg0) {
            return 6406;
        } else if (class248.field3973 != arg0) {
            if (class13.field129 == arg0) {
                return 6410;
            } else if (class651.field9246 == arg0) {
                return 6145;
            } else {
                throw new IllegalStateException();
            }
        } else {
            return 6409;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Ljava/awt/Canvas;B)V", line = 116)
    public static final void method2126(Canvas arg0, byte arg1) {
        int var2 = -85 / ((arg1 - -57) / 62);
        ++field4851;
        Dimension var3 = arg0.getSize();
        class447.method2753(var3.width, var3.height, (byte) 58);
        if (class554.field7897 == 1) {
            class13.field119.method308(arg0, class208.field3477, class379.field5699);
        } else {
            class13.field119.method308(arg0, class661.field9411, class478.field6934);
        }
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(I)V", line = 133)
    public final void method134(int arg0) {
        if (arg0 != 1) {
            this.method134(43);
        }
        if (super.field9224.method2291(arg0 + -12) == class322.field4757) {
            super.field9223 = 2;
        }
        ++field4856;
        if (~super.field9223 > -1 || super.field9223 > 2) {
            super.field9223 = this.method135(arg0 ^ 66);
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)I", line = 153)
    public final int method133(int arg0, int arg1) {
        ++field4858;
        if (arg0 != 18648) {
            field4857 = -24;
        }
        return 1;
    }
}
