import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public class class283 extends class403 {

    @OriginalMember(owner = "client!wja", name = "V", descriptor = "Lfj;")
    public static class684 field3281 = new class684(2, 5);

    @OriginalMember(owner = "client!wja", name = "Gb", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!wja", name = "Hb", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!wja", name = "Ib", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(I)V")
    public class283(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(BII)Z")
    public static final boolean method1625(byte arg0, int arg1, int arg2) {
        ++field3283;
        if (arg0 <= 113) {
            method1625((byte) 55, 11, 123);
        }
        return class792.method4368(arg2, arg1, (byte) -60) | (arg2 & 458752) != 0 || class551.method3229(arg2, 23, arg1);
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(FI)V")
    public final void method1626(float arg0, int arg1) {
        ++field3284;
        if (arg1 == -44927608) {
            int var3 = Stream.floatToRawIntBits(arg0);
            super.field5275[super.field5262++] = (byte) var3;
            super.field5275[super.field5262++] = (byte) (var3 >> 8);
            super.field5275[super.field5262++] = (byte) (var3 >> 16);
            super.field5275[super.field5262++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!wja", name = "x", descriptor = "(I)V")
    public static void method1627(int arg0) {
        field3281 = null;
        if (arg0 != -22840) {
            method1625((byte) -122, 92, -28);
        }
    }

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "(FI)V")
    public final void method1628(float arg0, int arg1) {
        if (arg1 != 8625) {
            field3281 = null;
        }
        ++field3282;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field5275[super.field5262++] = (byte) (var3 >> 24);
        super.field5275[super.field5262++] = (byte) (var3 >> 16);
        super.field5275[super.field5262++] = (byte) (var3 >> 8);
        super.field5275[super.field5262++] = (byte) var3;
    }
}
