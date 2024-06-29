import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class164 {

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field3109 = 0;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lsg;")
    public static class203 field3106 = new class203();

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Ldc;")
    private static class37 field3110 = class185.method1233((byte) 86, "Created gameworld");

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Ldc;")
    public static class37 field3112 = class185.method1233((byte) 86, "null");

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field3115 = 1;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Ldc;")
    public static class37 field3113 = class185.method1233((byte) 86, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Ldc;")
    public static class37 field3117 = field3110;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "Ldc;")
    public static class37 field3116 = class185.method1233((byte) 86, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Lce;")
    public static class28 field3114 = new class28(8);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lci;")
    public static class32 field3108;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method1108(int arg0) {
        field3112 = null;
        field3108 = null;
        field3113 = null;
        field3116 = null;
        field3117 = null;
        field3106 = null;
        if (arg0 != 8) {
            field3110 = null;
        }
        field3114 = null;
        field3110 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method1109(int arg0, boolean arg1, Object arg2) {
        field3107++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class180.method1199(var3, (byte) 118) : var3;
        } else if (arg2 instanceof class135) {
            class135 var4 = (class135) arg2;
            return var4.method936(0);
        } else {
            if (arg0 >= -45) {
                field3106 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lce;I)Lmg;")
    public static final class137 method1110(class28 arg0, int arg1) {
        field3105++;
        return arg1 == 23090 ? new class137(arg0.method228(true), arg0.method228(true), arg0.method228(true), arg0.method228(true), arg0.method225(62), arg0.method225(56), arg0.method215(-1797813752)) : null;
    }
}
