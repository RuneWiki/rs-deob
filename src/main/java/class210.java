import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class210 extends class134 {

    @OriginalMember(owner = "client!uga", name = "l", descriptor = "Z")
    public static boolean field2522 = false;

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!uga", name = "g", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!uga", name = "h", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!uga", name = "i", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!uga", name = "j", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!uga", name = "m", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!uga", name = "k", descriptor = "Ljava/lang/Object;")
    public static Object field2521;

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "(I)V")
    public static void method1172(int arg0) {
        int var1 = -2 / ((28 - arg0) / 57);
        field2521 = null;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)I")
    public final int method58(int arg0) {
        ++field2517;
        return arg0 != 0 ? -68 : 1;
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lkda;)V")
    public class210(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(ILkda;)V")
    public class210(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(II)V")
    public final void method55(int arg0, int arg1) {
        int var3 = -14 / ((-26 - arg0) / 41);
        ++field2519;
        super.field1708 = arg1;
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(B)I")
    public final int method1173(byte arg0) {
        if (arg0 <= 119) {
            field2521 = null;
        }
        ++field2516;
        return super.field1708;
    }

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        if (arg1 != 29053) {
            return -97;
        } else {
            ++field2523;
            return 1;
        }
    }

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "(II)I")
    public static final int method1174(int arg0, int arg1) {
        if (arg1 <= 66) {
            return 62;
        } else {
            ++field2518;
            return arg0 == 16711935 ? -1 : class729.method4094(arg0, -24);
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(B)V")
    public final void method60(byte arg0) {
        if (super.field1712.method2277((byte) 104) == class639.field8868) {
            super.field1708 = 2;
        }
        ++field2520;
        if (arg0 >= 118) {
            if (~super.field1708 > -1 || super.field1708 > 2) {
                super.field1708 = this.method58(0);
            }
        }
    }
}
