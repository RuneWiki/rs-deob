import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class36 {

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Lkfa;")
    public static class549 field405 = new class549(73, -1);

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Lkfa;")
    public static class549 field408 = new class549(61, 7);

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field412 = -1;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "[I")
    public static int[] field409;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 7)
    public static void method195(byte arg0) {
        if (arg0 <= -51) {
            field405 = null;
            field409 = null;
            field408 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)Z", line = 21)
    public static final boolean method196(int arg0, int arg1, int arg2) {
        int var3 = 2 / ((-arg0 - 65) / 54);
        field402++;
        return class368.method2015(arg1, (byte) 123, arg2) & class641.method3607(arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII)V", line = 31)
    public static final void method197(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class334.field4314.field6215 = 0;
        field403++;
        class334.field4314.method2525(class61.field636.field689, -81849);
        class334.field4314.method2525(arg1, arg3 - 57178);
        class334.field4314.method2525(arg2, -81849);
        class334.field4314.method2537(18244, arg4);
        class334.field4314.method2537(arg3 + 42915, arg0);
        class98.field1077 = 0;
        class267.field3364 = 1;
        class664.field9436 = 0;
        if (arg3 != -24671) {
            field410 = 14;
        }
        class377.field4898 = -3;
    }

    @OriginalMember(owner = "client!vd", name = "toString", descriptor = "()Ljava/lang/String;", line = 51)
    public final String toString() {
        field404++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)I", line = 65)
    public static final int method198(int arg0, int arg1, int arg2) {
        if (arg0 != 30890) {
            method195((byte) -104);
        }
        field407++;
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg1 - var3;
    }
}
