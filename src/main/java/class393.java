import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class393 extends class86 {

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5181 = new Rectangle[100];

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "I")
    public static int field5189;

    static {
        for (int var0 = 0; var0 < 100; ++var0) {
            field5181[var0] = new Rectangle();
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)I", line = 3)
    public final int method2278(boolean arg0) {
        ++field5182;
        return arg0 ? 58 : super.field1200;
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lsf;)V", line = 14)
    public class393(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)V", line = 19)
    public static void method2279(int arg0) {
        if (arg0 == 0) {
            field5181 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V", line = 32)
    public final void method71(byte arg0) {
        if (arg0 == -65) {
            super.field1200 = this.method73(0);
            ++field5189;
        }
    }

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "(I)V", line = 43)
    public static final void method2280(int arg0) {
        ++field5185;
        int var1 = 87 / ((arg0 - -34) / 58);
        if (class611.field7718 != class169.field2235) {
            try {
                class586.method3137(8259, "tbrefresh", class102.field1382);
            } catch (Throwable var2) {
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)I", line = 62)
    public final int method73(int arg0) {
        if (arg0 != 0) {
            return -80;
        } else {
            ++field5188;
            return super.field1203.method2987(2) == class433.field5672 && super.field1203.method2981(-14) ? 0 : 1;
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(ILsf;)V", line = 78)
    public class393(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZ)V", line = 81)
    public final void method76(int arg0, boolean arg1) {
        ++field5187;
        if (arg1) {
            field5181 = null;
        }
        super.field1200 = arg0;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILfda;I)V", line = 92)
    public static final void method2281(int arg0, class381 arg1, int arg2) {
        if (arg1.field4748 != null) {
            int var3 = arg1.field4748[arg0 - -1];
            if (~arg1.field4700 != ~var3) {
                arg1.field4700 = var3;
                arg1.field4729 = 0;
                arg1.field4663 = 0;
                arg1.field4667 = 1;
                arg1.field4721 = 0;
                arg1.field4765 = arg1.field4764;
                if (~arg1.field4700 != 0) {
                    class117.method699(arg1.field4721, class143.field1864.method4265(true, arg1.field4700), false, arg1);
                }
            }
        }
        ++field5184;
        if (arg2 != 0) {
            method2281(76, (class381) null, 96);
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(II)I", line = 124)
    public final int method72(int arg0, int arg1) {
        if (arg1 != -2) {
            field5181 = null;
        }
        ++field5186;
        return 3;
    }
}
