import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class class298 {

    @OriginalMember(owner = "client!es", name = "b", descriptor = "Z")
    public static boolean field4067 = false;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public int field4068;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public int field4069;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "I")
    public int field4073;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIIII)V")
    public static final void method1856(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class243.field3580.field7989.method3577(false) != 0 && arg4 != 0 && class279.field3914 < 50 && arg0 != -1) {
            class585.field8346[class279.field3914++] = new class105((byte) 1, arg0, arg4, arg1, arg3, 0, arg2, null);
        }
        if (arg5 != 50) {
            field4067 = false;
        }
        field4066++;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)Z")
    public final boolean method1857(int arg0) {
        field4070++;
        if (arg0 >= -20) {
            this.method1857(116);
        }
        return (this.field4069 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)Z")
    public final boolean method1858(byte arg0) {
        int var2 = 101 / ((68 - arg0) / 54);
        field4071++;
        return (this.field4069 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(B)Z")
    public final boolean method1859(byte arg0) {
        field4074++;
        if (arg0 == 103) {
            return (this.field4069 & 0x8) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(B)Z")
    public final boolean method1860(byte arg0) {
        if (arg0 == -11) {
            field4072++;
            return (this.field4069 & 0x2) != 0;
        } else {
            return false;
        }
    }
}
