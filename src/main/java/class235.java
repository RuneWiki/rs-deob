import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class235 extends class131 {

    @OriginalMember(owner = "client!km", name = "D", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!km", name = "E", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!km", name = "F", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(IIIIIF)V")
    public class235(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IF)V")
    public final void method651(int arg0, float arg1) {
        super.field2013 = arg1;
        ++field3417;
        if (arg0 != 6) {
            this.method653(50, -126, 46, -27);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIII)V")
    public final void method653(int arg0, int arg1, int arg2, int arg3) {
        super.field2021 = arg0;
        ++field3416;
        if (arg1 == 6) {
            super.field2019 = arg3;
            super.field2017 = arg2;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1530(boolean arg0, String arg1) throws ClassNotFoundException {
        if (arg0) {
            return null;
        } else {
            ++field3415;
            if (arg1.equals("B")) {
                return Byte.TYPE;
            } else if (arg1.equals("I")) {
                return Integer.TYPE;
            } else if (arg1.equals("S")) {
                return Short.TYPE;
            } else if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else {
                return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
            }
        }
    }
}
