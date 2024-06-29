import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class106 extends class9 {

    @OriginalMember(owner = "client!laa", name = "A", descriptor = "[F")
    public static float[] field1848 = new float[4];

    @OriginalMember(owner = "client!laa", name = "B", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!laa", name = "C", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(B)V")
    public static void method967(byte arg0) {
        if (arg0 == 126) {
            field1848 = null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(IIIIIF)V")
    public class106(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIII)V")
    public final void method272(int arg0, int arg1, int arg2, int arg3) {
        super.field542 = arg1;
        ++field1850;
        if (arg2 != -1) {
            field1848 = null;
        }
        super.field547 = arg3;
        super.field541 = arg0;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(FB)V")
    public final void method268(float arg0, byte arg1) {
        ++field1849;
        if (arg1 >= -89) {
            field1848 = null;
        }
        super.field549 = arg0;
    }
}
