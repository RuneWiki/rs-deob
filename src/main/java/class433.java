import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class433 extends class465 {

    @OriginalMember(owner = "client!st", name = "F", descriptor = "I")
    public static int field6181 = 1;

    @OriginalMember(owner = "client!st", name = "z", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!st", name = "A", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!st", name = "B", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!st", name = "C", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!st", name = "D", descriptor = "J")
    public static long field6180;

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(IIIIIF)V", line = 8)
    public class433(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IZLfp;)Lsq;", line = 14)
    public static final class176 method2635(int arg0, boolean arg1, class323 arg2) {
        ++field6177;
        if (arg1) {
            method2636(42, -67, (class682) null);
        }
        byte[] var3 = arg2.method2108(arg0, 0);
        return var3 == null ? null : new class176(var3);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIII)V", line = 31)
    public final void method1046(int arg0, int arg1, int arg2, int arg3) {
        super.field6583 = arg1;
        ++field6178;
        if (arg3 != 16) {
            this.method1044(-0.6999489F, 108);
        }
        super.field6592 = arg0;
        super.field6579 = arg2;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(FI)V", line = 44)
    public final void method1044(float arg0, int arg1) {
        if (arg1 != 65536) {
            field6180 = 79L;
        }
        ++field6179;
        super.field6582 = arg0;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IILag;)V", line = 56)
    public static final void method2636(int arg0, int arg1, class682 arg2) {
        ++field6176;
        class476.field6759 = false;
        class319.field4418 = 0;
        class307.method2007(-4023, arg2);
        class554.method3205(50, arg2);
        if (class476.field6759) {
            System.out.println("---endgpp---");
        }
        if (arg2.field9146 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg2.field9146 + " psize:" + arg0);
        } else if (arg1 < 10) {
            field6180 = 89L;
        }
    }
}
