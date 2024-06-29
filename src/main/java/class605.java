import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class605 extends class140 {

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "I")
    public int field8300;

    @OriginalMember(owner = "client!ou", name = "w", descriptor = "I")
    public int field8306;

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
    public static int field8302 = 0;

    @OriginalMember(owner = "client!ou", name = "v", descriptor = "Lmu;")
    public static class303 field8305 = new class303(58, 2);

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
    public static int field8301;

    @OriginalMember(owner = "client!ou", name = "t", descriptor = "I")
    public static int field8303;

    @OriginalMember(owner = "client!ou", name = "y", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!ou", name = "u", descriptor = "Lin;")
    public static class91 field8304;

    @OriginalMember(owner = "client!ou", name = "x", descriptor = "Ljava/lang/Object;")
    public static Object field8307;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "[[Lat;")
    public static class378[][] field8299;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)Lad;")
    public final class426 method119(byte arg0) {
        if (arg0 < 116) {
            method3444(118);
        }
        field8301++;
        return class215.field3087;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZIBI)Lin;")
    public static final class91 method3443(boolean arg0, int arg1, byte arg2, int arg3) {
        field8308++;
        if (arg2 != -23) {
            return null;
        }
        class586 var4 = null;
        if (class319.field4397 != null) {
            var4 = new class586(arg1, class319.field4397, class431.field6163[arg1], 1000000);
        }
        class633.field8705[arg1] = class195.field2886.method3576(var4, arg1, class39.field954, 255);
        class633.field8705[arg1].method429(27872);
        return new class91(class633.field8705[arg1], arg0, arg3);
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lsd;Lec;IIIIIIIII)V")
    public class605(class95 arg0, class236 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field8300 = arg10;
        this.field8306 = arg9;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
    public static void method3444(int arg0) {
        field8305 = null;
        field8304 = null;
        if (arg0 != 1000000) {
            method3443(false, -66, (byte) 13, 13);
        }
        field8299 = null;
        field8307 = null;
    }
}
