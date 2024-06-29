import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class198 {

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public int field2731 = -1;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "J")
    public static long field2736 = 0L;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public int field2729;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public int field2732;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    public int field2733;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    public int field2735;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    public int field2738;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
    public int field2739;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "I")
    public int field2740;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    public int field2741;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "Lir;")
    public static class185 field2730;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "Lir;")
    public static class185 field2737;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lfb;B)Ltg;")
    public static final class447 method1309(class341 arg0, byte arg1) {
        field2728++;
        if (arg1 < 41) {
            field2737 = null;
        }
        return new class447(arg0.method2212(-2), arg0.method2212(-2), arg0.method2212(-2), arg0.method2212(-2), arg0.method2249(32767), arg0.method2233((byte) 104));
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
    public static void method1310(int arg0) {
        field2737 = null;
        if (arg0 != -1) {
            method1310(-91);
        }
        field2730 = null;
    }
}
