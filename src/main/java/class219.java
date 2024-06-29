import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class219 {

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "Z")
    public static boolean field3996 = false;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Z")
    public static boolean field3992 = false;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "[I")
    public static int[] field3995 = new int[5];

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILgf;)Lfe;")
    public static final class212 method1497(int arg0, int arg1, class7 arg2) {
        if (arg1 < 98) {
            method1499(21);
        }
        field3993++;
        return class177.method1164(arg0, 40, arg2) ? class17.method125((byte) 66) : null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)V")
    public static final void method1498(byte arg0, int arg1) {
        field3994++;
        if (arg0 != -36) {
            method1498((byte) -123, -20);
        }
        class166 var2 = class262.method1746(116, arg1, 3);
        var2.method1098((byte) -112);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static void method1499(int arg0) {
        field3995 = null;
        if (arg0 != 3) {
            method1498((byte) 6, -44);
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)Lrg;")
    public static final class80 method1500(int arg0) {
        if (arg0 != 23043) {
            field3992 = true;
        }
        field3998++;
        return class135.field2364;
    }
}
