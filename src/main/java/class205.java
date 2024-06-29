import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class205 {

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "[[B")
    public static byte[][] field3154 = new byte[250][];

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "[I")
    public static int[] field3155 = new int[2000];

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "Lub;")
    public static class92 field3153;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)Lu;")
    public static final class123 method1437(int arg0, byte arg1) {
        field3156++;
        class123 var2 = (class123) class19.field265.method1173((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class257.field4095.method721((byte) -117, 30, arg0);
        class123 var4 = new class123();
        if (var3 != null) {
            var4.method926(arg0, -1, new class31(var3));
        }
        class19.field265.method1167((byte) -51, var4, (long) arg0);
        if (arg1 != -60) {
            field3153 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public static void method1438(int arg0) {
        field3153 = null;
        if (arg0 == 31) {
            field3155 = null;
            field3154 = null;
        }
    }
}
