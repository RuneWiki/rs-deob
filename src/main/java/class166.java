import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class166 extends class334 {

    @OriginalMember(owner = "client!tn", name = "B", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!tn", name = "C", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!tn", name = "G", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!tn", name = "H", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BILoda;II)V", line = 4)
    public static final void method1163(byte arg0, int arg1, class654 arg2, int arg3, int arg4) {
        if (arg0 != 38) {
            method1163((byte) 99, 78, (class654) null, -90, 91);
        }
        ++field2327;
        arg2.field9358.method3146(arg1, arg0 ^ -127);
        arg2.field9358.method3163(arg0 + -166, arg3);
        arg2.field9358.method3162(-2003712696, arg4);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BII)V", line = 17)
    public static final void method1164(byte arg0, int arg1, int arg2) {
        if (arg0 != -99) {
            method1163((byte) 16, -25, (class654) null, 50, -8);
        }
        ++field2322;
        class489 var3 = class704.method3942(arg1, 7, 0);
        var3.method2797(arg0 ^ 98);
        var3.field6952 = arg2;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(FB)V", line = 34)
    public final void method1165(float arg0, byte arg1) {
        super.field4848 = arg0;
        if (arg1 != -18) {
            method1163((byte) 117, 125, (class654) null, 75, -9);
        }
        ++field2323;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIIF)V", line = 45)
    public class166(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIII)V", line = 55)
    public final void method1166(int arg0, int arg1, int arg2, int arg3) {
        super.field4859 = arg1;
        if (arg0 == 6211) {
            ++field2324;
            super.field4858 = arg3;
            super.field4853 = arg2;
        }
    }
}
