import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class21 {

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "[I")
    public static int[] field186 = new int[1];

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "Lae;")
    public static class40 field187 = new class40(0);

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "Lfo;")
    public static class22 field188 = new class22(10, 5);

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "Lqp;")
    public static class586 field189 = new class586(60, 19);

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "Lqu;")
    public static class364 field190 = new class364(8, -1);

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 11)
    public static void method96(byte arg0) {
        field187 = null;
        field188 = null;
        if (arg0 > -65) {
            field190 = null;
        }
        field189 = null;
        field190 = null;
        field186 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIIB)Llh;", line = 31)
    public static final class125 method97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field185++;
        long var7 = (long) arg2 * 32147369L ^ (long) arg5 * 97549L ^ (long) arg0 * 67481L ^ (long) arg1 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 76724863L;
        if (arg6 >= -41) {
            method96((byte) 122);
        }
        class125 var9 = (class125) class17.field154.method2025(var7, 2);
        if (var9 == null) {
            class125 var10 = class604.field8896.method1033(arg0, arg5, arg1, arg3, arg2, arg4);
            class17.field154.method2029(false, var10, var7);
            return var10;
        } else {
            return var9;
        }
    }
}
